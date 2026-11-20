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
	Public vCSBuilder1 As CSBuilder
	Public vSocket1 As Socket
	Public vBln1 As Boolean
	Public vInt1 As Int
	Public vBln2 As Boolean
	Public vStr1 As String
	Public m_nuovo As Int = 1
	Public m_rcodice As Int = 2
	Public m_rdescrizione As Int = 3
	Public vInt2 As Int = -1
	Public m_rpiva As Int = 5
	Public m_rmaster As Int = 6
	Public m_rindirizzo As Int = 7
	Public m_rgrcli As Int = 8
	Public m_rmail As Int = 9
	Public m_rtutti As Int = 10
	Public vStr2 As String
	Public vInt3 As Int
	Public vInt4 As Int
	Public vBln3 As Boolean
	Public vInt5 As Int
	Public vDbl1 As Double
	Public vStr3 As String
	Public vBln4 As Boolean
	Public vStr4 As String = " asc"
	Public vStr5 As String
	Public vStr6 As String
	Public vInt6 As Int
	Public vInt7 As Int = DipToCurrent(54)
	Public vInt8 As Int = DipToCurrent(60)
	Public vInt9 As Int = DipToCurrent(1)
	Public vIntArr1 As Int() = Array As Int(PerXToCurrent(7), PerXToCurrent(10), PerXToCurrent(25), PerXToCurrent(18), PerXToCurrent(18), PerXToCurrent(12), PerXToCurrent(10))
	Public vInt10 As Int = PerXToCurrent(100)
	Public vInt11 As Int
	Public vInt12 As Int = -1
	Public vByt1 As Byte = -1
	Public vBln5 As Boolean
	Public vStr7 As String = " order by Descrizione"
	Public vStr8 As String
	Public vBln6 As Boolean
	Public vBln7 As Boolean
	Public vStr9 As String
	Public vStr10 As String
	Public vStr11 As String
	Public vStr12 As String
	Public vStr13 As String
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public vDlg1 As InputDialog
	Public vLst1 As List
	Public vCur1 As Cursor
	Public vCur2 As Cursor
	Public vCur3 As Cursor
	Public vcustomlistviewold1 As customlistviewold
	Public vWebView1 As WebView
	Public a1 As Animation
	Public vIME1 As IME
	Public vIME2 As IME
	Public vMap1 As Map
	Public vMap2 As Map
	Public vUltimateListView1 As UltimateListView
	Public vColorDrawable1 As ColorDrawable
	Public vLabelArr1(7) As Label
	Public LblInfo As Label
	Public vCur4 As Cursor
	Public vCur5 As Cursor
	Public vCur6 As Cursor
	Public vLst2 As List
	Public bNew As Button
	Public cPost As CheckBox
	Public cPrep As CheckBox
	Public Edt1 As EditText
	Public lFido As Label
	Public lPrep As Label
	Public pAnnulla As Button
	Public pCap As EditText
	Public pCitta As EditText
	Public pCodice As EditText
	Public pConferma As Button
	Public pDes As EditText
	Public pFax As EditText
	Public pFido As EditText
	Public pIva As EditText
	Public pLista As Panel
	Public pPlu As Panel
	Public pPrep As EditText
	Public pProvincia As EditText
	Public pSco As EditText
	Public pTel As EditText
	Public pVia As EditText
	Public cPunti As CheckBox
	Public lPunti As Label
	Public pPunti As EditText
	Public vLbl1 As Label
	Public vLbl2 As Label
	Public vLbl3 As Label
	Public vLbl4 As Label
	Public lblFatt As Label
	Public vLbl5 As Label
	Public pListino As Spinner
	Public pCF As EditText
	Public PMail As EditText
	Public bStampa As Button
	Public pnlWv As Panel
	Public Mail As Button
	Public vSMTP1 As SMTP
	Public vLst3 As List
	Public vLst4 As List
	Public vLst5 As List
	Public pStampaRiep As Spinner
	Public pEIva As Spinner
	Public pMaps As Button
	Public PanelWv As Panel
	Public WebView1 As WebView
	Public pGetSaldi As Button
	Public pZona As Spinner
	Public pMaster As Button
	Public PHideCtrl As Panel
	Public lblmainTitle As Label
	Public sRicerca As Spinner
	Public lblPluTitle As Label
	Public lblMapsTitle As Label
	Public lblElencoTitle As Label
	Public LblInf As Label
	Public CreateCli As Button
	Public pPwdWeb As EditText
	Public vLst6 As List
	Public pnlDatiClienti As Panel
	Public lblDatiClienti As Label
	Public TipoSoggetto As Spinner
	Public Nazione As Button
	Public edtNomeCli As EditText
	Public edtCognomeCli As EditText
	Public edtPECCli As EditText
	Public edtCodDestCli As EditText
	Public pnlMovimenti As Panel
	Public ChiudiMovimenti As Button
	Public lblMovimenti As Label
	Public pMemo As Button
	Public pGruppoCli As Spinner
	Public pResiduoConvenzione As Spinner
	Public pEIva2 As Spinner
	Public pMacro As Spinner
	Public lGruppoCli As Label
	Public DatiAggiuntivi As Button
	Public cPassaggio As CheckBox
	Public pButtonsForm As Panel
	Public pCodLotteria As EditText
	Public lEIva As Label
	Public cContrassegno As CheckBox
	Public pdocPredefinito As Spinner
	Public bCompleanno As Button
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/clienti.java, metodo _ac_itemclicked (riga 561).
Sub ac_itemclicked(menuItemWrapper As MenuItem)
	mod1.vStr2 = "  Sub AC_Click (Position As Int, ActionItemID As Int)"
	Try
		Dim vGet As Object = vLst1.Get(menuItemWrapper.Id)
		Select vGet
			Case vStr6
				Dim sb2 As String = File.DirDefaultExternal & "/ProcedureSQL"
				If Not(File.Exists(sb2, vStr5)) Then
					Dim vObjectToCharSequence As Object = "La procedura " & SmartStringFormatter("", vStr5) & " non è stata trovata"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Else
					Dim sb4 As String = File.DirDefaultExternal & "/ProcedureSQL"
					If Not(File.ReadString(sb4, vStr5).Contains("%cliente%")) Then
						Dim vObjectToCharSequence3 As Object = "E' obbligatorio inserire la variabile %cliente% nella procedura " & SmartStringFormatter("", vStr5) & " "
						Dim vObjectToCharSequence4 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
					Else
						Dim sb6 As String = File.DirDefaultExternal & "/ProcedureSQL"
						mod1.Sub120(sb6, vStr5, vCur2.GetString("codice"), False)
						Edt1.Text = vCur2.GetString("codice")
						vInt6 = m_rcodice
						imericerca_handleaction()
						mod1.Sub081
					End If
				End If
			Case "Modifica"
				Sub012()
				mod1.Sub081
			Case "Movimenti"
				Dim cursorWrapper As Cursor
				Dim cursorWrapper2 As Cursor = Main.vSql2.ExecQuery("Select * from headmov  where  cliente = '" & vCur2.GetString("codice") & "' order by nmov")
				vcustomlistviewold1.Sub004
				If cursorWrapper2.RowCount > 0 Then
					vInt5 = 0
					vDbl1 = 0
					Dim rowCount As Int = cursorWrapper2.RowCount - 1
					Dim i As Int
					For i = 0 To rowCount
						cursorWrapper2.Position = i
						vcustomlistviewold1.Sub001(Sub006(i, DipToCurrent(70), cursorWrapper2), DipToCurrent(70), cursorWrapper2.GetString("cliente"))
					Next
					vcustomlistviewold1.Sub012(0)
				End If
				lblMovimenti.Text = "Movimenti del cliente " & vCur2.GetString("descrizione")
				pnlMovimenti.SetVisibleAnimated(400, True)
				mod1.Sub081
			Case "Attiva"
				If Main.vBln25 Then
					Dim vObjectToCharSequence5 As Object = "Non possibile da terminale remoto"
					Dim vObjectToCharSequence6 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
				Else
					Dim sb7 As String = "F2" & Main.vCur3.GetString("funzioni2")
					If Not(mod1.Sub026(sb7, Main.d_clienti)) Then
						Dim vObjectToCharSequence7 As Object = "Non si dispone delle autorizzazioni richieste "
						Dim vObjectToCharSequence8 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
					Else
						Dim vObjectToCharSequence9 As Object = "Confermi l'attivazione del cliente " & vCur2.GetString("descrizione") & "?"
						Dim vObjectToCharSequence10 As Object = Main.vStr8
						Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "Si", "", "No", Main.vBmp1)
						If vMsgbox2 = -1 Then
							Main.vSql1.ExecNonQuery("update clienti set attivo =1,scadcliente = '2099-01-01' where codice = '" & vCur2.GetString("codice") & "'")
							Edt1.Text = vCur2.GetString("codice")
							vInt6 = m_rcodice
							imericerca_handleaction()
						End If
						mod1.Sub081
					End If
				End If
			Case "Disattiva"
				If Main.vBln25 Then
					Dim vObjectToCharSequence11 As Object = "Non possibile da terminale remoto"
					Dim vObjectToCharSequence12 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
				Else
					Dim sb8 As String = "F2" & Main.vCur3.GetString("funzioni2")
					If Not(mod1.Sub026(sb8, Main.d_clienti)) Then
						Dim vObjectToCharSequence13 As Object = "Non si dispone delle autorizzazioni richieste "
						Dim vObjectToCharSequence14 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
					Else
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster ='" & vCur2.GetString("codice") & "'") > 0 Then
							Dim vObjectToCharSequence15 As Object = "Non è possibile disabilitare questo cliente in quando esistono dei clienti collegati o tessere aggiuntive"
							Dim vObjectToCharSequence16 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence15, vObjectToCharSequence16, "OK", "", "", Main.vBmp1)
						Else
							Dim vObjectToCharSequence17 As Object = "Confermi la Disattivazione del cliente " & vCur2.GetString("descrizione") & "?"
							Dim vObjectToCharSequence18 As Object = Main.vStr8
							Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence17, vObjectToCharSequence18, "Si", "No", "", Main.vBmp1)
							If vMsgbox22 = -1 Then
								Main.vSql1.ExecNonQuery("update clienti set attivo =0 where codice = '" & vCur2.GetString("codice") & "'")
								Edt1.Text = vCur2.GetString("codice")
								vInt6 = m_rcodice
								imericerca_handleaction()
							End If
							mod1.Sub081
						End If
					End If
				End If
			Case "Scadenza"
				If Main.vBln25 Then
					Dim vObjectToCharSequence19 As Object = "Non possibile da terminale remoto"
					Dim vObjectToCharSequence20 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence19, vObjectToCharSequence20, "OK", "", "", Main.vBmp1)
				Else
					Dim sb9 As String = "F2" & Main.vCur3.GetString("funzioni2")
					If Not(mod1.Sub026(sb9, Main.d_clienti)) Then
						Dim vObjectToCharSequence21 As Object = "Non si dispone delle autorizzazioni richieste "
						Dim vObjectToCharSequence22 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence21, vObjectToCharSequence22, "OK", "", "", Main.vBmp1)
					Else
						Dim vDate As String = DateTime.Date(mod1.Sub058)
						Dim dateDialog As DateDialog
						dateDialog.Year = vDate.SubString2(6, 10)
						dateDialog.Month = vDate.SubString2(0, 2)
						dateDialog.DayOfMonth = vDate.SubString2(3, 5)
						Dim vShow As Int = dateDialog.Show("Impostare la data di scadenza del cliente", "Data scadenza", "Ok", "", "Annulla scadenza", Main.vBmp1)
						If vShow = -1 Then
							Dim str As String = " scadcliente = '" & (dateDialog.Year & "-" & NumberFormat(dateDialog.Month, 2, 0) & "-" & NumberFormat(dateDialog.DayOfMonth, 2, 0)) & "' "
							Dim vDateTimeParse As Long = DateTime.DateTimeParse(NumberFormat(dateDialog.Month, 2, 0) & "/" & NumberFormat(dateDialog.DayOfMonth, 2, 0) & "/" & dateDialog.Year, "00:00:00")
							Dim str2 As String = IIf(vDateTimeParse < DateTime.Now, str & " ,attivo=0 ", str)
							Main.vSql1.ExecNonQuery("update clienti set " & str2 & " where codice = '" & vCur2.GetString("codice") & "'")
							Edt1.Text = vCur2.GetString("codice")
							vInt6 = m_rcodice
							imericerca_handleaction()
						Else
							If vShow = -2 Then
								Main.vSql1.ExecNonQuery("update clienti set attivo=1,scadcliente = '2099-01-01' where codice = '" & vCur2.GetString("codice") & "'")
								Edt1.Text = vCur2.GetString("codice")
								vInt6 = m_rcodice
								imericerca_handleaction()
							End If
						End If
						mod1.Sub081
					End If
				End If
			Case "Clienti-Tessere Collegate"
				Edt1.Text = vCur2.GetString("codice")
				If vCur2.GetString("CodMaster") <> "" Then
					Edt1.Text = vCur2.GetString("CodMaster")
				End If
				vInt6 = m_rmaster
				imericerca_handleaction()
				mod1.Sub081
			Case "Cambia Codice"
				If Main.vBln25 Then
					Dim vObjectToCharSequence23 As Object = "Non possibile da terminale remoto"
					Dim vObjectToCharSequence24 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence23, vObjectToCharSequence24, "OK", "", "", Main.vBmp1)
				Else
					Dim sb10 As String = "F2" & Main.vCur3.GetString("funzioni2")
					If Not(mod1.Sub026(sb10, Main.d_clienti)) Then
						Dim vObjectToCharSequence25 As Object = "Non si dispone delle autorizzazioni richieste "
						Dim vObjectToCharSequence26 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence25, vObjectToCharSequence26, "OK", "", "", Main.vBmp1)
					Else
						If Main.v_attivaterminale Then
						End If
						If Main.vStr21 = "" Then
							If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster ='" & vCur2.GetString("codice") & "'") > 0 Then
								Dim vObjectToCharSequence27 As Object = "Non è possibile cambiare il codice a questo cliente in quando esistono dei clienti collegati o tessere aggiuntive"
								Dim vObjectToCharSequence28 As Object = Main.vStr8
								Msgbox2(vObjectToCharSequence27, vObjectToCharSequence28, "OK", "", "", Main.vBmp1)
							Else
								Dim vObjectToCharSequence29 As Object = "Confermi il cambio del codice al cliente " & vCur2.GetString("descrizione") & "?"
								Dim vObjectToCharSequence30 As Object = Main.vStr8
								Dim vMsgbox23 As Int = Msgbox2(vObjectToCharSequence29, vObjectToCharSequence30, "Si", "", "No", Main.vBmp1)
								If vMsgbox23 = -1 Then
									Dim inputDialog2 As InputDialog = vDlg1
									vDlg1.InputType = 2
									vDlg1.Input = ""
									vDlg1.Hint = "Codice cliente"
									vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
									vDlg1.PasswordMode = False
									Dim str3 As String = "Inserire il nuovo codice del cliente " & vCur2.GetString("descrizione")
									Dim vShow2 As Int = vDlg1.Show(str3, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
									If vShow2 = -1 Then
										If IsNumber(vDlg1.Input) And vDlg1.Input.Length <= 20 Then
											If modfunstr.Sub006(Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice = '" & vDlg1.Input & "'")) = 0 Then
												Dim left As String = modfunstr.left(vCur2.GetString("descrizione") & "(sostituito:" & vDlg1.Input & ")", 50)
												Main.vSql1.ExecNonQuery("update clienti set descrizione ='" & left & "',attivo =0 where codice = '" & vCur2.GetString("codice") & "'")
												Main.vSql1.ExecNonQuery("update TestiCli set codice = '" & vDlg1.Input & "' where codice ='" & vCur2.GetString("codice") & "'")
												Dim list As List
												list.Initialize
												Dim map As Map
												map.Initialize
												map.Put("codice", vDlg1.Input)
												map.Put("descrizione", mod1.Sub209(vCur2.GetString("descrizione")))
												map.Put("citta", vCur2.GetString("citta"))
												map.Put("provincia", vCur2.GetString("provincia"))
												If mod1.Sub134(vCur2.GetString("piva").Trim, True) Then
													map.Put("piva", vCur2.GetString("piva"))
												Else
													map.Put("piva", "")
												End If
												If mod1.Sub134(vCur2.GetString("codf").Trim, True) Then
													map.Put("codf", vCur2.GetString("codf"))
												Else
													map.Put("codf", "")
												End If
												map.Put("telefono", vCur2.GetString("telefono"))
												map.Put("mail", vCur2.GetString("mail"))
												map.Put("fax", vCur2.GetString("fax"))
												map.Put("via", vCur2.GetString("via"))
												map.Put("cap", vCur2.GetString("cap"))
												map.Put("sconto", vCur2.GetInt("sconto"))
												map.Put("prep", vCur2.GetDouble("prep"))
												map.Put("listino", vCur2.GetInt("listino"))
												map.Put("punti", vCur2.GetInt("punti"))
												map.Put("fido", vCur2.GetDouble("fido"))
												map.Put("abprep", vCur2.GetInt("abprep"))
												map.Put("abpost", vCur2.GetInt("abpost"))
												map.Put("abpunti", vCur2.GetInt("abpunti"))
												map.Put("attivo", vCur2.GetInt("attivo"))
												map.Put("stampariep", vCur2.GetInt("stampariep"))
												map.Put("eiva", vCur2.GetInt("eiva"))
												map.Put("DaInviare", vCur2.GetInt("DaInviare"))
												map.Put("zona", vCur2.GetInt("zona"))
												map.Put("CodMaster", vCur2.GetString("CodMaster"))
												map.Put("PwdWeb", vCur2.GetString("PwdWeb"))
												map.Put("abstampabuono", vCur2.GetInt("abstampabuono"))
												map.Put("tesseraaggiuntiva", vCur2.GetInt("tesseraaggiuntiva"))
												map.Put("scadcliente", vCur2.GetString("scadcliente"))
												map.Put("grpcli", vCur2.GetInt("grpcli"))
												map.Put("residuoconvenzione", vCur2.GetInt("residuoconvenzione"))
												map.Put("macroc", vCur2.GetInt("macroc"))
												list.Add(map)
												dbutil.Sub007(Main.vSql1, "clienti", list)
												Edt1.Text = vDlg1.Input
												vInt6 = m_rcodice
												imericerca_handleaction()
											Else
												Dim vObjectToCharSequence31 As Object = "Il cliente " & vDlg1.Input & " risulta essere già presente in anagrafica."
												Dim vObjectToCharSequence32 As Object = Main.vStr8
												Msgbox2(vObjectToCharSequence31, vObjectToCharSequence32, "OK", "", "", Main.vBmp1)
											End If
										Else
											Dim vObjectToCharSequence33 As Object = "Il codice inserito non è valido (lunghezza massima 20 caratteri) "
											Dim vObjectToCharSequence34 As Object = Main.vStr8
											Msgbox2(vObjectToCharSequence33, vObjectToCharSequence34, "OK", "", "", Main.vBmp1)
										End If
									End If
								End If
								mod1.Sub081
							End If
						End If
						Dim vObjectToCharSequence35 As Object = "Funzione non abilitata su questo terminale"
						Dim vObjectToCharSequence36 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence35, vObjectToCharSequence36, "OK", "", "", Main.vBmp1)
					End If
				End If
			Case "Elimina"
				If Main.vBln25 Then
					Dim vObjectToCharSequence37 As Object = "Non possibile da terminale remoto"
					Dim vObjectToCharSequence38 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence37, vObjectToCharSequence38, "OK", "", "", Main.vBmp1)
				Else
					Dim sb11 As String = "F2" & Main.vCur3.GetString("funzioni2")
					If Not(mod1.Sub026(sb11, Main.d_clienti)) Then
						Dim vObjectToCharSequence39 As Object = "Non si dispone delle autorizzazioni richieste "
						Dim vObjectToCharSequence40 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence39, vObjectToCharSequence40, "OK", "", "", Main.vBmp1)
					Else
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster ='" & vCur2.GetString("codice") & "'") > 0 Then
							Dim vObjectToCharSequence41 As Object = "Non è possibile eliminare questo cliente in quando esistono dei clienti collegati o tessere aggiuntive"
							Dim vObjectToCharSequence42 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence41, vObjectToCharSequence42, "OK", "", "", Main.vBmp1)
						Else
							If Main.vSql2.ExecQuerySingleResult("Select count(*) from venduto where cliente ='" & vCur2.GetString("codice") & "'") > 0 Then
								Dim vObjectToCharSequence43 As Object = "Esistono dei movimenti per questo cliente ." & CRLF & "Non cancellabile."
								Dim vObjectToCharSequence44 As Object = Main.vStr8
								Msgbox2(vObjectToCharSequence43, vObjectToCharSequence44, "OK", "", "", Main.vBmp1)
							Else
								Dim vObjectToCharSequence45 As Object = "Confermi la cancellazione del cliente " & vCur2.GetString("descrizione")
								Dim vObjectToCharSequence46 As Object = Main.vStr8
								Dim vMsgbox24 As Int = Msgbox2(vObjectToCharSequence45, vObjectToCharSequence46, "Si", "", "No", Main.vBmp1)
								If vMsgbox24 = -1 Then
									Main.vSql1.ExecNonQuery("delete from clienti where codice = '" & vCur2.GetString("codice") & "'")
									Main.vSql1.ExecNonQuery("delete from TestiCli where codice='" & vCur2.GetString("codice") & "'")
									vInt1 = m_rtutti
									sRicerca.SelectedIndex = 6
									pLista.Visible = True
									Edt1.Visible = False
									vInt6 = m_rtutti
									Edt1.Text = ""
									imericerca_handleaction()
								End If
							End If
							mod1.Sub081
						End If
					End If
				End If
			Case "Seleziona"
				Main.vStr13 = vCur2.GetString("codice")
				vBln1 = True
				Main.vBln32 = False
				vIME2.HideKeyboard
				Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedClienti")
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
			vStr9 = File.ReadString(File.DirAssets, "SoapPiva.txt")
			Dim list As List
			list.Initialize
			list.AddAll(File.ListFiles(File.DirDefaultExternal & "/ProcedureSQL"))
			Dim size As Int = list.Size - 1
			Dim i As Int
			For i = 0 To size
				Dim vObjectToString As String = list.Get(i)
				If vObjectToString.ToLowerCase.StartsWith("clienti") And vObjectToString.EndsWith("sql") Then
					vStr5 = vObjectToString
					vStr6 = vObjectToString.SubString(8).Replace(".sql", "")
				End If
			Next
			v5.Initialize("TimerBarcode", 10)
			v5.Enabled = False
			mod1.Sub175
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from  STATIISO order by chiave")
			vLst6.Initialize
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i2 As Int
			For i2 = 0 To rowCount
				cursorWrapper2.Position = i2
				Dim tnazioneVar As tnazione
				tnazioneVar.id = cursorWrapper2.GetString("ID")
				tnazioneVar.descrizione = cursorWrapper2.GetString("DESCRIZIONE")
				tnazioneVar.alpha3 = cursorWrapper2.GetString("ALPHA3")
				tnazioneVar.CEE = (cursorWrapper2.GetInt("CEE") <> 0)
				vLst6.Add(tnazioneVar)
			Next
			vLst6.SortType("descrizione", True)
			vLbl1.Initialize("")
			vLbl1.Text = "Data"
			vLbl1.TextSize = 16
			vLbl1.TextColor = -1
			vLbl2.Initialize("")
			vLbl2.Text = "Importo"
			vLbl2.TextSize = 16
			vLbl2.TextColor = -1
			vLbl3.Initialize("")
			vLbl3.Text = "Punti"
			vLbl3.TextSize = 16
			vLbl3.TextColor = -1
			vLbl4.Initialize("")
			vLbl4.Text = "Prep."
			vLbl4.TextSize = 16
			vLbl4.TextColor = -1
			lblFatt.Initialize("")
			lblFatt.Text = "Fatt.N."
			lblFatt.TextSize = 16
			lblFatt.TextColor = -1
			vLbl5.Initialize("")
			vLbl5.Text = "Mov.Numero"
			vLbl5.TextSize = 16
			vLbl5.TextColor = -1
			vLst5.Initialize
			Sub005()
			Dim cursorWrapper3 As Cursor
			vCur5 = Main.vSql1.ExecQuery("Select Descrizione from sortedClienti")
			Return
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
		mod1.vStr1 = ""
		mod1.vBln4 = True
		mod1.Sub220(False)
		mod1.vBln1 = True
		Activity.Finish
		ExitApplication
	End If
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub Activity_Resume
	Dim group55 As IterableList
	Dim group82 As IterableList
	Dim groupLen55 As Int
	Dim groupLen82 As Int
	Dim index55 As Int
	Dim index82 As Int
	Dim limit148 As Int
	Dim limit200 As Int
	Dim step148 As Int
	Dim step200 As Int
	Dim v As View
	Dim mbtn As Button
	Dim tmplbl As Label
	Dim medt As EditText
	Dim mchk As CheckBox
	Dim msp As Spinner
	Dim pnlheader As Panel
	Dim leftpos As Int
	Dim i As Int
	Dim jlbl As JavaObject
	Dim r As Reflector
	Dim x As Int
	Dim tmpmap As Map
	Dim maphelper As Map
	Dim map1 As Map
	Dim jsongenerator As JSONGenerator
	Dim residcliente As String
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
					rsState = 4
					If Not(mod1.vBln4) Then
						If Main.vSql1.IsInitialized Then
							Continue
						End If
					End If
					rsState = 3
					Continue
				Case 3
					rsState = 4
					Activity.Finish
					Return
				Case 4
					rsState = 5
					mod1.vStr2 = "Activity_Resume"
					Continue
				Case 5
					rsState = 122
					rsCatchState = 121
					rsState = 7
					Continue
				Case 7
					rsState = 8
					rsCatchState = 121
					If Main.v_attivainserimentocliente Then
						If Main.v_attivaterminale Then
							If Main.vBln20 Then
								z7 = True
								vBln3 = z7
								Sub011("clienti")
								mod1.Sub067(Edt1, 17301583)
								lblPluTitle.Color = Main.v_colormenutitle
								lblmainTitle.Color = Main.v_colormenutitle
								lblMapsTitle.Color = Main.v_colormenutitle
								lblElencoTitle.Color = Main.v_colormenutitle
								mod1.Sub173(lblPluTitle)
								mod1.Sub173(lblmainTitle)
								mod1.Sub173(lblMapsTitle)
								mod1.Sub173(lblElencoTitle)
								pnlMovimenti.Background = mod1.Sub155(Colors.RGB(14, 22, 122), 0)
								vcustomlistviewold1.Initialize(Me, "clCli")
								vcustomlistviewold1.vInt3 = -16776961
								pnlMovimenti.AddView(vLbl1, DipToCurrent(30), PerYToCurrent(18), PerXToCurrent(20), PerYToCurrent(5))
								pnlMovimenti.AddView(vLbl2, PerXToCurrent(24), PerYToCurrent(18), PerXToCurrent(10), PerYToCurrent(23))
								pnlMovimenti.AddView(vLbl3, PerXToCurrent(36), PerYToCurrent(18), PerXToCurrent(10), PerYToCurrent(5))
								pnlMovimenti.AddView(vLbl4, PerXToCurrent(46), PerYToCurrent(18), PerXToCurrent(10), PerYToCurrent(5))
								pnlMovimenti.AddView(lblFatt, PerXToCurrent(56), PerYToCurrent(18), PerXToCurrent(10), PerYToCurrent(5))
								pnlMovimenti.AddView(vLbl5, PerXToCurrent(72), PerYToCurrent(18), PerXToCurrent(10), PerYToCurrent(5))
								pnlMovimenti.AddView(vcustomlistviewold1.Sub003, PerXToCurrent(1), PerYToCurrent(23), PerXToCurrent(99), PerYToCurrent(77))
								lblMovimenti.TextColor = -1
								pPlu.Color = Colors.RGB(245, 245, 245)
								pnlDatiClienti.Color = Colors.RGB(245, 245, 245)
								TipoSoggetto.Clear
								TipoSoggetto.Add("Tipologia cliente: Persona Fisica")
								TipoSoggetto.Add("Tipologia cliente: Ditta individuale")
								TipoSoggetto.Add("Tipologia cliente: Società")
								TipoSoggetto.Add("Tipologia cliente: Pubblica amministrazione")
								TipoSoggetto.Add("Tipologia cliente: Persona giuridica senza P.Iva")
								TipoSoggetto.Add("Tipologia cliente: Pubblica amministrazione senza P.Iva")
								sRicerca.Clear
								sRicerca.Add("Ricerca attiva : Descrizione - P.iva - Cod.Fisc.")
								sRicerca.Add("Ricerca attiva : Codice ")
								sRicerca.Add("Ricerca attiva : Partita Iva")
								sRicerca.Add("Ricerca attiva : Indirizzo o Città")
								sRicerca.Add("Ricerca attiva : Gruppo Cliente ")
								sRicerca.Add("Ricerca attiva : Indirizzo email ")
								sRicerca.Add("Trova tutti i clienti")
								sRicerca.SelectedIndex = 0
								vInt1 = m_rdescrizione
								pLista.Visible = True
								Edt1.Visible = True
								Edt1.Text = ""
								Continue
							End If
						End If
					End If
					z7 = False
					vBln3 = z7
					Sub011("clienti")
					mod1.Sub067(Edt1, 17301583)
					lblPluTitle.Color = Main.v_colormenutitle
					lblmainTitle.Color = Main.v_colormenutitle
					lblMapsTitle.Color = Main.v_colormenutitle
					lblElencoTitle.Color = Main.v_colormenutitle
					mod1.Sub173(lblPluTitle)
					mod1.Sub173(lblmainTitle)
					mod1.Sub173(lblMapsTitle)
					mod1.Sub173(lblElencoTitle)
					pnlMovimenti.Background = mod1.Sub155(Colors.RGB(14, 22, 122), 0)
					vcustomlistviewold1.Initialize(Me, "clCli")
					vcustomlistviewold1.vInt3 = -16776961
					pnlMovimenti.AddView(vLbl1, DipToCurrent(30), PerYToCurrent(18), PerXToCurrent(20), PerYToCurrent(5))
					pnlMovimenti.AddView(vLbl2, PerXToCurrent(24), PerYToCurrent(18), PerXToCurrent(10), PerYToCurrent(23))
					pnlMovimenti.AddView(vLbl3, PerXToCurrent(36), PerYToCurrent(18), PerXToCurrent(10), PerYToCurrent(5))
					pnlMovimenti.AddView(vLbl4, PerXToCurrent(46), PerYToCurrent(18), PerXToCurrent(10), PerYToCurrent(5))
					pnlMovimenti.AddView(lblFatt, PerXToCurrent(56), PerYToCurrent(18), PerXToCurrent(10), PerYToCurrent(5))
					pnlMovimenti.AddView(vLbl5, PerXToCurrent(72), PerYToCurrent(18), PerXToCurrent(10), PerYToCurrent(5))
					pnlMovimenti.AddView(vcustomlistviewold1.Sub003, PerXToCurrent(1), PerYToCurrent(23), PerXToCurrent(99), PerYToCurrent(77))
					lblMovimenti.TextColor = -1
					pPlu.Color = Colors.RGB(245, 245, 245)
					pnlDatiClienti.Color = Colors.RGB(245, 245, 245)
					TipoSoggetto.Clear
					TipoSoggetto.Add("Tipologia cliente: Persona Fisica")
					TipoSoggetto.Add("Tipologia cliente: Ditta individuale")
					TipoSoggetto.Add("Tipologia cliente: Società")
					TipoSoggetto.Add("Tipologia cliente: Pubblica amministrazione")
					TipoSoggetto.Add("Tipologia cliente: Persona giuridica senza P.Iva")
					TipoSoggetto.Add("Tipologia cliente: Pubblica amministrazione senza P.Iva")
					sRicerca.Clear
					sRicerca.Add("Ricerca attiva : Descrizione - P.iva - Cod.Fisc.")
					sRicerca.Add("Ricerca attiva : Codice ")
					sRicerca.Add("Ricerca attiva : Partita Iva")
					sRicerca.Add("Ricerca attiva : Indirizzo o Città")
					sRicerca.Add("Ricerca attiva : Gruppo Cliente ")
					sRicerca.Add("Ricerca attiva : Indirizzo email ")
					sRicerca.Add("Trova tutti i clienti")
					sRicerca.SelectedIndex = 0
					vInt1 = m_rdescrizione
					pLista.Visible = True
					Edt1.Visible = True
					Edt1.Text = ""
					'(fallthrough java verso il case successivo)
					rsState = 8
				Case 8
					rsState = 13
					If Not(vUltimateListView1.IsInitialized) Then
						Continue
					Else
						rsState = 10
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 10
				Case 10
					rsState = 13
					vUltimateListView1.ClearContent
					Continue
				Case 13
					rsState = 14
					vInt6 = m_rdescrizione
					Edt1.Hint = "Inserire la Descrizione - P.iva - Cod.Fisc."
					lblmainTitle.Text = "Gestione Clienti"
					Continue
				Case 14
					rsState = 35
					'v = View
					group55 = pPlu.GetAllViewsRecursive
					index55 = 0
					groupLen55 = group55.Size
					rsState = 123
					Continue
				Case 16
					rsState = 17
					Continue
				Case 17
					rsState = 22
					If Not(v Is EditText) And Not(v Is CheckBox) And Not(v Is Button) And Not(v Is TextView) And Not(v Is B4ASpinner) Then
						rsState = 19
						Continue
					End If
					Continue
				Case 19
					rsState = 22
					rsState = 124
					Continue
				Case 22
					rsState = 23
					Continue
				Case 23
					rsState = 34
					If v Is Button And Not(v Is CheckBox) Then
						rsState = 25
						Continue
					Else If v Is TextView And Not(v Is EditText) And Not(v Is CheckBox) Then
						rsState = 27
						Continue
					Else If v Is EditText Then
						rsState = 29
						Continue
					Else If v Is CheckBox Then
						rsState = 31
						Continue
					Else If Not(v Is B4ASpinner) Then
						Continue
					Else
						rsState = 33
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 25
				Case 25
					rsState = 34
					'mbtn = Button
					mbtn = v
					mod1.Sub165(mbtn)
					mbtn.TextSize = 14
					Dim buttonWrapper As Button = mbtn
					buttonWrapper.TextColor = -16777216
					Dim buttonWrapper2 As Button = mbtn
					buttonWrapper2.Background = mod1.Sub155(-1, 20)
					Continue
				Case 27
					rsState = 34
					'tmplbl = Label
					tmplbl = v
					Dim labelWrapper7 As Label = tmplbl
					labelWrapper7.Gravity = Bit.Or(16, 5)
					tmplbl.Text = tmplbl.Text & ":  "
					Dim labelWrapper8 As Label = tmplbl
					labelWrapper8.TextColor = -16777216
					tmplbl.TextSize = 14
					Continue
				Case 29
					rsState = 34
					'medt = EditText
					medt = v
					Dim editTextWrapper As EditText = medt
					editTextWrapper.TextColor = -16777216
					medt.TextSize = 14
					Continue
				Case 31
					rsState = 34
					'mchk = CheckBox
					mchk = v
					mchk.TextSize = 14
					Dim checkBoxWrapper As CheckBox = mchk
					checkBoxWrapper.TextColor = -16777216
					Continue
				Case 33
					rsState = 34
					'msp = Spinner
					msp = v
					msp.TextSize = 14
					Continue
				Case 34
					rsState = 124
					Continue
				Case 35
					rsState = 62
					'v = View
					group82 = pnlDatiClienti.GetAllViewsRecursive
					index82 = 0
					groupLen82 = group82.Size
					rsState = 125
					Continue
				Case 37
					rsState = 38
					Continue
				Case 38
					rsState = 43
					If Not(v Is EditText) And Not(v Is CheckBox) And Not(v Is Button) And Not(v Is TextView) And Not(v Is B4ASpinner) Then
						rsState = 40
						Continue
					End If
					Continue
				Case 40
					rsState = 43
					rsState = 126
					Continue
				Case 43
					rsState = 44
					Continue
				Case 44
					rsState = 61
					If v Is Button And Not(v Is CheckBox) Then
						rsState = 46
						Continue
					Else If v Is TextView And Not(v Is EditText) And Not(v Is CheckBox) Then
						rsState = 48
						Continue
					Else If v Is EditText Then
						rsState = 56
						Continue
					Else If v Is CheckBox Then
						rsState = 58
						Continue
					Else If Not(v Is B4ASpinner) Then
						Continue
					Else
						rsState = 60
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 46
				Case 46
					rsState = 61
					'mbtn = Button
					mbtn = v
					mod1.Sub165(mbtn)
					mbtn.TextSize = 14
					Dim buttonWrapper3 As Button = mbtn
					buttonWrapper3.TextColor = -16777216
					Dim buttonWrapper4 As Button = mbtn
					buttonWrapper4.Background = mod1.Sub155(-1, 20)
					Continue
				Case 48
					rsState = 49
					'tmplbl = Label
					tmplbl = v
					Continue
				Case 49
					rsState = 54
					If tmplbl.Text <> "NO" Then
						Continue
					Else
						rsState = 51
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 51
				Case 51
					rsState = 54
					rsState = 126
					Continue
				Case 54
					rsState = 61
					Dim labelWrapper9 As Label = tmplbl
					labelWrapper9.Gravity = Bit.Or(16, 5)
					tmplbl.Text = tmplbl.Text & ":  "
					Dim labelWrapper10 As Label = tmplbl
					labelWrapper10.TextColor = -16777216
					tmplbl.TextSize = 14
					Continue
				Case 56
					rsState = 61
					'medt = EditText
					medt = v
					Dim editTextWrapper2 As EditText = medt
					editTextWrapper2.TextColor = -16777216
					medt.TextSize = 14
					Continue
				Case 58
					rsState = 61
					'mchk = CheckBox
					mchk = v
					mchk.TextSize = 14
					Dim checkBoxWrapper2 As CheckBox = mchk
					checkBoxWrapper2.TextColor = -16777216
					Continue
				Case 60
					rsState = 61
					'msp = Spinner
					msp = v
					msp.TextSize = 14
					Continue
				Case 61
					rsState = 126
					Continue
				Case 62
					rsState = 63
					LblInf.Gravity = Bit.Or(16, 1)
					LblInf.TextColor = -256
					LblInf.Text = "Cliente Slave"
					LblInf.Color = -12303292
					LblInf.TextSize = 25
					vWebView1.Initialize("cStampa")
					pnlWv.Background = mod1.Sub155(Colors.RGB(14, 32, 122), 25)
					pGetSaldi.Background = mod1.Sub155(-8603688, 25)
					bCompleanno.Background = mod1.Sub155(-3355444, 25)
					pnlWv.AddView(vWebView1, PerXToCurrent(1), DipToCurrent(70), PerXToCurrent(99), PerYToCurrent(100) - DipToCurrent(70))
					vLst3.Initialize
					vLst4.Initialize
					vLst3.Clear
					vLst4.Clear
					vLst3.Add("10;Codice;S")
					vLst3.Add("25;Descrizione;S")
					vLst3.Add("15;Citta;S")
					vLst3.Add("6;CAP;S")
					vLst3.Add("6;Provincia;S")
					vLst3.Add("20;Via;S")
					vLst3.Add("20;Telefono;S")
					vLst3.Add("15;PartitaIva;S")
					vLst3.Add("20;CodiceFiscale;S")
					vLst3.Add("20;mail;S")
					vLst4.Add("Codice")
					vLst4.Add("Descrizione")
					vLst4.Add("Citta")
					vLst4.Add("CAP")
					vLst4.Add("Provincia")
					vLst4.Add("Via")
					vLst4.Add("Telefono")
					vLst4.Add("PartitaIva")
					vLst4.Add("CodiceFiscale")
					vLst4.Add("mail")
					'pnlheader = Panel
					pnlheader.Initialize("")
					Dim panelWrapper14 As Panel = pnlheader
					panelWrapper14.Color = -16777216
					leftpos = 0
					Continue
				Case 63
					rsState = 82
					step148 = 1
					limit148 = 6
					i = 0
					rsState = 127
					Continue
				Case 65
					rsState = 66
					vColorDrawable1.Initialize(-16776961, DipToCurrent(6))
					vLabelArr1(i).Initialize("Header")
					Dim labelWrapper14 As Label = vLabelArr1(i)
					labelWrapper14.Background = vColorDrawable1
					Dim labelWrapper15 As Label = vLabelArr1(i)
					labelWrapper15.TextColor = -1
					vLabelArr1(i).TextSize = 16
					Dim labelWrapper16 As Label = vLabelArr1(i)
					labelWrapper16.Typeface = Typeface.DEFAULT_BOLD
					Dim labelWrapper17 As Label = vLabelArr1(i)
					labelWrapper17.Gravity = 19
					Continue
				Case 66
					rsState = 81
					Select i
						Case 0
							rsState = 68
						Case 1
							rsState = 70
						Case 2
							rsState = 72
						Case 3
							rsState = 74
						Case 4
							rsState = 76
						Case 5
							rsState = 78
						Case 6
							rsState = 80
					End Select
					'(fallthrough java verso il case successivo)
					rsState = 68
				Case 68
					rsState = 81
					vLabelArr1(i).Text = "#"
					Continue
				Case 70
					rsState = 81
					vLabelArr1(i).Text = "Codice"
					Continue
				Case 72
					rsState = 81
					vLabelArr1(i).Text = "Descrizione"
					Continue
				Case 74
					rsState = 81
					vLabelArr1(i).Text = "Città"
					Continue
				Case 76
					rsState = 81
					vLabelArr1(i).Text = "Via"
					Continue
				Case 78
					rsState = 81
					vLabelArr1(i).Text = "P.Iva"
					Continue
				Case 80
					rsState = 81
					vLabelArr1(i).Text = "     "
					Continue
				Case 81
					rsState = 128
					vLabelArr1(i).Tag = i
					Dim panelWrapper15 As Panel = pnlheader
					Dim view As View = vLabelArr1(i)
					Dim d As Double = leftpos
					Dim i_ As Int = vIntArr1(i)
					Dim i2 As Int = i_ - vInt9
					panelWrapper15.AddView(view, d + vInt9 / 2, 0, i2, vInt7)
					'jlbl = JavaObject
					Dim javaObject As JavaObject
					jlbl = vLabelArr1(i)
					jlbl.RunMethod("setPadding", Array(DipToCurrent(10), 0, DipToCurrent(10), 0))
					Dim i3 As Int = leftpos
					leftpos = i3 + vIntArr1(i)
					Continue
				Case 82
					rsState = 83
					Dim view2 As View = pnlheader
					pLista.AddView(view2, 0, 0, vInt10, vInt7)
					vUltimateListView1.Initialize(0, 0, "", "ULV")
					vUltimateListView1.FastScroller(True)
					vUltimateListView1.DividerHeight = 0
					Dim ultimateListViewWrapper2 As UltimateListView = vUltimateListView1
					vUltimateListView1.SetStyle(2)
					Dim length As Byte = vIntArr1.Length
					vUltimateListView1.AddRowLayout("ROW", "Cell_RowLayoutCreator", "Cell_RowContentFiller", vInt8, length, vIntArr1, vInt9, -7829368, True)
					Dim view3 As View = vUltimateListView1
					Dim height As Int = pLista.Height
					pLista.AddView(view3, 0, vInt7, vInt10, height - vInt7)
					LblInfo.Initialize("")
					LblInfo.Background = vColorDrawable1
					LblInfo.Gravity = 17
					LblInfo.TextColor = -1
					LblInfo.TextSize = 24
					LblInfo.Typeface = Typeface.DEFAULT_BOLD
					Activity.AddView(LblInfo, PerXToCurrent(50) - DipToCurrent(35), PerYToCurrent(50) - DipToCurrent(30), DipToCurrent(70), DipToCurrent(60))
					LblInfo.Visible = False
					'r = Reflector
					r.Target = r.RunStaticMethod("android.view.ViewConfiguration", "get", Array(r.GetContext), Array As String("android.content.Context"))
					v6.Initialize("DisapTimer", r.RunMethod("getScrollDefaultDelay"))
					pGruppoCli.Clear
					vLst2.Initialize
					Dim cursorWrapper As Cursor
					vCur6 = Main.vSql1.ExecQuery("Select * from gruppocli order by codice")
					Continue
				Case 83
					rsState = 90
					If vCur6.RowCount <= 0 Then
						Continue
					Else
						rsState = 85
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 85
				Case 85
					rsState = 86
					Continue
				Case 86
					rsState = 89
					step200 = 1
					limit200 = vCur6.RowCount - 1
					x = 0
					rsState = 129
					Continue
				Case 88
					rsState = 130
					vCur6.Position = x
					pGruppoCli.Add(vCur6.GetString("descrizione"))
					vLst2.Add(vCur6.GetString("descrizione"))
					Continue
				Case 89
					rsState = 90
					pGruppoCli.SelectedIndex = 0
					Continue
				Case 90
					rsState = 91
					pStampaRiep.Clear
					pStampaRiep.Add("Non stampare la copia scontrino")
					pStampaRiep.Add("Stampa la copia scontrino con importi")
					pStampaRiep.Add("Stampa la copia scontrino senza importi")
					pStampaRiep.SelectedIndex = 0
					pEIva2.Clear
					pEIva2.Add("Immediata")
					pEIva2.Add("Differita")
					pEIva2.Add("Split Payment")
					populatespinner(pEIva)
					Sub015(pZona)
					Sub014(pMacro)
					pListino.Clear
					pListino.Add("Lascia Invariato il listino")
					pListino.Add("Listino 1")
					pListino.Add("Listino 2")
					pListino.Add("Listino 3")
					pListino.Add("Listino 4")
					pListino.SelectedIndex = 0
					pdocPredefinito.Clear
					pdocPredefinito.Add("Doc.Predefinito: Lascia Invariato")
					pdocPredefinito.Add("Doc.Predefinito: Uso Futuro")
					pdocPredefinito.Add("Doc.Predefinito: Fattura")
					pdocPredefinito.Add("Doc.Predefinito: Scontrino")
					pdocPredefinito.Add("Doc.Predefinito: Nota di Credito")
					pdocPredefinito.SelectedIndex = 0
					pResiduoConvenzione.Clear
					pResiduoConvenzione.Add("Azzera il residuo convenzione")
					pResiduoConvenzione.Add("Stampa buono su residuo convenzione")
					pResiduoConvenzione.Add("Registra il totale scontrino se è inferiore alla convenzione ")
					pResiduoConvenzione.SelectedIndex = 1
					cPunti.Visible = Main.vBln16
					pResiduoConvenzione.Visible = Main.vBln16
					cPrep.Visible = Main.vBln16
					Dim labelWrapper23 As Label = lPunti
					If Main.v_attivaterminale Then
						If Not(Main.v_solovenduto) Then
							If Main.v_centralizza Then
								z = True
								labelWrapper23.Visible = Not(z)
								Dim editTextWrapper3 As EditText = pPunti
								If Main.v_attivaterminale Then
									If Not(Main.v_solovenduto) Then
										If Main.v_centralizza Then
											z2 = True
											editTextWrapper3.Visible = Not(z2)
											Dim labelWrapper24 As Label = lPrep
											If Main.v_attivaterminale Then
												If Not(Main.v_solovenduto) Then
													If Main.v_centralizza Then
														z3 = True
														labelWrapper24.Visible = Not(z3)
														Dim editTextWrapper4 As EditText = pPrep
														If Main.v_attivaterminale Then
															If Not(Main.v_solovenduto) Then
																If Main.v_centralizza Then
																	z4 = True
																	editTextWrapper4.Visible = Not(z4)
																	DoEvents
																	vLst1.Initialize
																	vBln1 = False
																	Dim buttonWrapper7 As Button = bNew
																	If Main.v_attivaterminale Then
																		If Not(Main.v_solovenduto) Then
																			z5 = True
																			If z5 Then
																				Continue
																			End If
																			If Main.vStr21 = "" Then
																				If Not(Main.vBln25) Then
																					z6 = True
																					buttonWrapper7.Enabled = z6
																					CreateCli.Enabled = bNew.Enabled
																					Dim phone As Phone = Main.vPhone1
																					Phone.SetScreenBrightness(Main.v_screenbrightness)
																					vInt1 = m_rdescrizione
																					pLista.Visible = True
																					Edt1.Visible = True
																					Edt1.Text = ""
																					Continue
																				End If
																			End If
																			z6 = False
																			buttonWrapper7.Enabled = z6
																			CreateCli.Enabled = bNew.Enabled
																			Dim phone2 As Phone = Main.vPhone1
																			Phone.SetScreenBrightness(Main.v_screenbrightness)
																			vInt1 = m_rdescrizione
																			pLista.Visible = True
																			Edt1.Visible = True
																			Edt1.Text = ""
																		End If
																	End If
																	z5 = False
																	If z5 Then
																	End If
																	If Main.vStr21 = "" Then
																	End If
																	z6 = False
																	buttonWrapper7.Enabled = z6
																	CreateCli.Enabled = bNew.Enabled
																	Dim phone22 As Phone = Main.vPhone1
																	Phone.SetScreenBrightness(Main.v_screenbrightness)
																	vInt1 = m_rdescrizione
																	pLista.Visible = True
																	Edt1.Visible = True
																	Edt1.Text = ""
																End If
															End If
														End If
														z4 = False
														editTextWrapper4.Visible = Not(z4)
														DoEvents
														vLst1.Initialize
														vBln1 = False
														If Main.v_attivaterminale Then
														End If
														z5 = False
														If z5 Then
														End If
														If Main.vStr21 = "" Then
														End If
														z6 = False
														bNew.Enabled = z6
														CreateCli.Enabled = bNew.Enabled
														Dim phone222 As Phone = Main.vPhone1
														Phone.SetScreenBrightness(Main.v_screenbrightness)
														vInt1 = m_rdescrizione
														pLista.Visible = True
														Edt1.Visible = True
														Edt1.Text = ""
													End If
												End If
											End If
											z3 = False
											labelWrapper24.Visible = Not(z3)
											If Main.v_attivaterminale Then
											End If
											z4 = False
											pPrep.Visible = Not(z4)
											DoEvents
											vLst1.Initialize
											vBln1 = False
											If Main.v_attivaterminale Then
											End If
											z5 = False
											If z5 Then
											End If
											If Main.vStr21 = "" Then
											End If
											z6 = False
											bNew.Enabled = z6
											CreateCli.Enabled = bNew.Enabled
											Dim phone2222 As Phone = Main.vPhone1
											Phone.SetScreenBrightness(Main.v_screenbrightness)
											vInt1 = m_rdescrizione
											pLista.Visible = True
											Edt1.Visible = True
											Edt1.Text = ""
										End If
									End If
								End If
								z2 = False
								editTextWrapper3.Visible = Not(z2)
								If Main.v_attivaterminale Then
								End If
								z3 = False
								lPrep.Visible = Not(z3)
								If Main.v_attivaterminale Then
								End If
								z4 = False
								pPrep.Visible = Not(z4)
								DoEvents
								vLst1.Initialize
								vBln1 = False
								If Main.v_attivaterminale Then
								End If
								z5 = False
								If z5 Then
								End If
								If Main.vStr21 = "" Then
								End If
								z6 = False
								bNew.Enabled = z6
								CreateCli.Enabled = bNew.Enabled
								Dim phone22222 As Phone = Main.vPhone1
								Phone.SetScreenBrightness(Main.v_screenbrightness)
								vInt1 = m_rdescrizione
								pLista.Visible = True
								Edt1.Visible = True
								Edt1.Text = ""
							End If
						End If
					End If
					z = False
					labelWrapper23.Visible = Not(z)
					If Main.v_attivaterminale Then
					End If
					z2 = False
					pPunti.Visible = Not(z2)
					If Main.v_attivaterminale Then
					End If
					z3 = False
					lPrep.Visible = Not(z3)
					If Main.v_attivaterminale Then
					End If
					z4 = False
					pPrep.Visible = Not(z4)
					DoEvents
					vLst1.Initialize
					vBln1 = False
					If Main.v_attivaterminale Then
					End If
					z5 = False
					If z5 Then
					End If
					If Main.vStr21 = "" Then
					End If
					z6 = False
					bNew.Enabled = z6
					CreateCli.Enabled = bNew.Enabled
					Dim phone222222 As Phone = Main.vPhone1
					Phone.SetScreenBrightness(Main.v_screenbrightness)
					vInt1 = m_rdescrizione
					pLista.Visible = True
					Edt1.Visible = True
					Edt1.Text = ""
					'(fallthrough java verso il case successivo)
					rsState = 91
				Case 91
					rsState = 96
					If Not(vUltimateListView1.IsInitialized) Then
						Continue
					Else
						rsState = 93
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 93
				Case 93
					rsState = 96
					vUltimateListView1.ClearContent
					Continue
				Case 96
					rsState = 97
					vInt6 = m_rdescrizione
					Edt1.Hint = "Inserire la Descrizione - P.iva - Cod.Fisc."
					vIME2.ShowKeyboard(Edt1)
					Continue
				Case 97
					rsState = 116
					If Main.vStr20 <> "" Then
						rsState = 99
						Continue
					Else
						If Not(Main.vMap9.IsInitialized) Then
							Continue
						Else
							If Main.vStr21 <> "" Then
								Continue
							Else
								rsState = 101
								Continue
							End If
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 99
				Case 99
					rsState = 116
					Sub013("", "", "", "", "", "", "", "", "")
					pTel.Text = Main.vStr20
					pDes.RequestFocus
					Continue
				Case 101
					rsState = 102
					Continue
				Case 102
					rsState = 115
					If vBln3 Then
						rsState = 104
						Continue
					Else
						rsState = 114
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 104
				Case 104
					rsState = 105
					'tmpmap = Map
					Dim map As Map
					tmpmap = Main.vMap9.Get("anag")
					'maphelper = Map
					maphelper.Initialize
					Dim map2 As Map = maphelper
					If tmpmap.GetDefault("denom", "") = "" Then
						str = ""
					Else
						str = mod1.Sub209(tmpmap.GetDefault("denom", ""))
					End If
					map2.Put("name", str)
					maphelper.Put("vatcode", tmpmap.GetDefault("piva", ""))
					tmpmap = tmpmap.Get("domFisc")
					Dim map3 As Map = maphelper
					If tmpmap.GetDefault("ind", "") = "" Then
						str2 = ""
					Else
						str2 = mod1.Sub209(tmpmap.GetDefault("ind", ""))
					End If
					map3.Put("address", str2)
					maphelper.Put("zipcode", tmpmap.GetDefault("cap", ""))
					Dim map4 As Map = maphelper
					If tmpmap.GetDefault("com", "") = "" Then
						str3 = ""
					Else
						str3 = mod1.Sub209(tmpmap.GetDefault("com", ""))
					End If
					map4.Put("city", str3)
					maphelper.Put("province", tmpmap.GetDefault("prov", ""))
					'map1 = Map
					map1.Initialize
					'jsongenerator = JSONGenerator
					jsongenerator.Initialize(maphelper)
					CallSub3(ftpmanager, "SendObjBO", jsongenerator.ToString, "InsertCliente")
					Wait For (Null) Resinscliente (wf131_0 As String)
					rsState = 131
					Continue
				Case 105
					rsState = 112
					If residcliente = "" Then
						rsState = 107
						Continue
					Else If residcliente.StartsWith("ID=") Then
						rsState = 109
						Continue
					Else
						rsState = 111
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 107
				Case 107
					rsState = 112
					Dim vObjectToCharSequence As Object = "Si sono verificati dei problemi nella ricezione dati dal server"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					Continue
				Case 109
					rsState = 112
					Sub013(maphelper.GetDefault("name", ""), maphelper.GetDefault("city", ""), maphelper.GetDefault("province", ""), maphelper.GetDefault("vatcode", ""), maphelper.GetDefault("address", ""), maphelper.GetDefault("zipcode", ""), "", "", residcliente.Replace("ID=", ""))
					Continue
				Case 111
					rsState = 112
					Dim vObjectToCharSequence3 As Object = residcliente
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
					Continue
				Case 112
					rsState = 115
					Continue
				Case 114
					rsState = 115
					Sub013("", "", "", "", "", "", "", "", "")
					Sub001()
					Continue
				Case 115
					rsState = 116
					Continue
				Case 116
					rsState = 119
					If Main.vStr9 <> "" Then
						rsState = 118
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 118
				Case 118
					rsState = 119
					Sub013("", "", "", "", "", "", Main.vStr9, "", "")
					Continue
				Case 119
					rsState = 122
					mod1.Sub081
					Continue
				Case 121
					rsState = 122
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 122
					rsState = -1
					rsCatchState = 0
					Continue
				Case 123
					rsState = 35
					If index55 >= groupLen55 Then
						Continue
					Else
						rsState = 16
						v = group55.Get(index55)
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 124
				Case 124
					rsState = 123
					index55 = index55 + 1
					Continue
				Case 125
					rsState = 62
					If index82 >= groupLen82 Then
						Continue
					Else
						rsState = 37
						v = group82.Get(index82)
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 126
				Case 126
					rsState = 125
					index82 = index82 + 1
					Continue
				Case 127
					rsState = 82
					If (step148 > 0 And i <= limit148) Or (step148 < 0 And i >= limit148) Then
						rsState = 65
						Continue
					End If
					Continue
				Case 128
					rsState = 127
					i = i + 0 + step148
					Continue
				Case 129
					rsState = 89
					If (step200 > 0 And x <= limit200) Or (step200 < 0 And x >= limit200) Then
						rsState = 88
						Continue
					End If
					Continue
				Case 130
					rsState = 129
					x = x + 0 + step200
					Continue
				Case 131
					rsState = 105
					residcliente = wf131_0
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

Sub resinscliente(str As String)
End Sub

Sub Sub001
	Dim str As String
	Dim str2 As String
	Dim str3 As String
	Dim map As Map
	Dim map2 As Map = Main.vMap9.Get("anag")
	If map2.GetDefault("denom", "") <> "" Then
		str = mod1.Sub209(map2.GetDefault("denom", ""))
	Else
		str = ""
	End If
	pDes.Text = str
	pIva.Text = map2.GetDefault("piva", "")
	pCF.Text = map2.GetDefault("cf", "")
	TipoSoggetto.SelectedIndex = 2
	If pIva.Text.Length = 11 And pIva.Text.Length = 16 Then
		TipoSoggetto.SelectedIndex = 1
	End If
	If pIva.Text.Length = 0 And pIva.Text.Length = 16 Then
		TipoSoggetto.SelectedIndex = 0
	End If
	Dim map3 As Map = map2.Get("domFisc")
	pProvincia.Text = map3.GetDefault("prov", "")
	pCap.Text = map3.GetDefault("cap", "")
	If map3.GetDefault("com", "") <> "" Then
		str2 = mod1.Sub209(map3.GetDefault("com", ""))
	Else
		str2 = ""
	End If
	pCitta.Text = str2
	If map3.GetDefault("ind", "") <> "" Then
		str3 = mod1.Sub209(map3.GetDefault("ind", ""))
	Else
		str3 = ""
	End If
	pVia.Text = str3
	Dim map4 As Map
	Dim map5 As Map = Main.vMap9.Get("SDI")
	edtPECCli.Text = map5.GetDefault("pec", "")
	edtCodDestCli.Text = map5.GetDefault("cod", "")
	pDes.RequestFocus
End Sub

Sub Astreams_NewData(bArr As Byte())
	mod1.vStr2 = "Sub AStreams_NewData(Buffer() As Byte)"
	Try
		ProgressDialogHide
		Dim vBytesToString As String = BytesToString(bArr, 0, bArr.Length, "UTF8")
		Dim vSplit() As String = Regex.Split("_", vBytesToString)
		If vSplit(0) = "cliente" Then
			If vSplit(1) = "getpunti" Then
				If vSplit(3) <> "Errore" Then
					Main.vSql1.ExecNonQuery("update clienti set punti = " & vSplit(3) & " where codice ='" & vSplit(2) & "'")
					pPunti.Text = vSplit(3)
					Dim vObjectToCharSequence As Object = "Il cliente risulta avere " & NumberFormat2(vSplit(3), 1, 0, 0, False) & " punti "
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					If cPrep.Checked Then
						vBln6 = True
						pgetsaldi_click()
					End If
				End If
			Else If vSplit(1) = "getprep" Then
				Main.vSql1.ExecNonQuery("update clienti set prep = " & vSplit(3) & " where codice ='" & vSplit(2) & "'")
				pPrep.Text = vSplit(3)
				Dim vObjectToCharSequence3 As Object = "Il cliente risulta avere un prepagato di " & NumberFormat2(vSplit(3), 1, 2, 2, False) & " € "
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			End If
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub BChiudi_Click
	vBln1 = True
	Main.vStr21 = ""
	Main.vBln32 = False
	If Main.vMap9.IsInitialized Then
		Main.vMap9 = Null
	End If
	vIME2.HideKeyboard
	Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedClienti")
	mod1.Sub198("Main")
	Activity.Finish
	mod1.Sub081
End Sub

Sub bCompleanno_Click
	Dim vObjectToString As String = bCompleanno.Tag
	Dim dateDialog As DateDialog
	If vObjectToString.SubString2(6, 10) = "1900" Then
		dateDialog.DateTicks = DateTime.Now
	Else
		dateDialog.Year = vObjectToString.SubString2(6, 10)
		dateDialog.Month = vObjectToString.SubString2(0, 2)
		dateDialog.DayOfMonth = vObjectToString.SubString2(3, 5)
	End If
	Dim vShow As Int = dateDialog.Show("Impostare la data del compleanno", "Data Compleanno", "Ok", "", "Annulla", Main.vBmp1)
	If vShow = -1 Then
		Dim str As String = NumberFormat2(dateDialog.Month, 2, 0, 0, False) & "/" & NumberFormat2(dateDialog.DayOfMonth, 2, 0, 0, False) & "/" & dateDialog.Year
		bCompleanno.Tag = str
		Sub017(str)
		Return
	End If
End Sub

Sub Sub002(str As String)
	mod1.vStr2 = "Sub bM_Click"
	Try
		Select str
			Case "Tutti"
				vInt1 = m_rtutti
				pLista.Visible = True
				Edt1.Visible = False
				vInt6 = m_rtutti
				Edt1.Text = ""
				imericerca_handleaction()
			Case "Codice"
				vInt1 = m_rcodice
				pLista.Visible = True
				Edt1.Visible = True
				vInt6 = m_rcodice
				Edt1.Text = ""
				If vUltimateListView1.IsInitialized Then
					vUltimateListView1.ClearContent
				End If
				Edt1.Hint = "Inserire il codice"
				vIME2.ShowKeyboard(Edt1)
			Case "Gruppo Cliente"
				Dim vInputList1 As Int = idLib.InputList1(vLst2, "Selezionare il gruppo cliente da filtrare")
				If vInputList1 >= 0 Then
					vCur6.Position = vInputList1
					pLista.Visible = True
					vInt6 = m_rgrcli
					Edt1.Text = ""
					Edt1.Visible = False
					imericerca_handleaction()
				End If
			Case "Partita Iva"
				vInt1 = m_rpiva
				pLista.Visible = True
				Edt1.Visible = True
				vInt6 = m_rpiva
				Edt1.Text = ""
				If vUltimateListView1.IsInitialized Then
					vUltimateListView1.ClearContent
				End If
				Edt1.Hint = "Inserire la partita iva"
				vIME2.ShowKeyboard(Edt1)
			Case "Mail"
				vInt1 = m_rmail
				pLista.Visible = True
				Edt1.Visible = True
				vInt6 = m_rmail
				Edt1.Text = ""
				If vUltimateListView1.IsInitialized Then
					vUltimateListView1.ClearContent
				End If
				Edt1.Hint = "Inserire l'indirizzo mail"
				vIME2.ShowKeyboard(Edt1)
			Case "Descrizione"
				vInt1 = m_rdescrizione
				pLista.Visible = True
				Edt1.Visible = True
				Edt1.Text = ""
				If vUltimateListView1.IsInitialized Then
					vUltimateListView1.ClearContent
				End If
				vInt6 = m_rdescrizione
				Edt1.Hint = "Inserire la Descrizione - P.iva - Cod.Fisc."
				vIME2.ShowKeyboard(Edt1)
			Case "Indirizzo"
				vInt1 = m_rindirizzo
				pLista.Visible = True
				Edt1.Visible = True
				Edt1.Text = ""
				If vUltimateListView1.IsInitialized Then
					vUltimateListView1.ClearContent
				End If
				vInt6 = m_rindirizzo
				Edt1.Hint = "Inserire l'indirizzo o la città"
				vIME2.ShowKeyboard(Edt1)
		End Select
		mod1.Sub081
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub bNew_Click
	Sub013("", "", "", "", "", "", "", "", "")
	mod1.Sub081
End Sub

Sub bStampa_Click
	Mail.Visible = True
	vStr13 = vStr10.Replace(",attivo", "").Replace(",CodMaster", "").Replace(",tesseraaggiuntiva", "")
	vStr13 = vStr13
	vWebView1.LoadHtml(dbutil.Sub002(Main.vSql1, vStr13.Replace(" CodiceFiscale", " CodiceFiscale,mail"), Null, 0, True, -1, False))
	vWebView1.Tag = vStr13.Replace(" CodiceFiscale", " CodiceFiscale,mail")
	vLst5.Clear
	vLst5.AddAll(ArrayToList(Array As String("Codice", "Descrizione", "Citta", "CAP", "Provincia", "Via", "Telefono", "PartitaIva", "CodiceFiscale", "mail")))
	pnlWv.Visible = True
	mod1.Sub081
End Sub

Sub BtnOk_Click
	pnlWv.Visible = False
End Sub

Sub btnPannelloClienti_Click
	If Not(Sub021()) Then
		Return
	End If
	pnlDatiClienti.Visible = False
End Sub

Sub Buttonfun_Click
	mod1.vStr2 = "  Sub buttonFun_Click"
	Try
		Sub016(Sender, False)
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
			Sub016(imageViewWrapper, True)
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub cell_rowcontentfiller(j As Long, str As String, panelWrapper As Panel, b As Byte, i As Int)
	Dim i2 As Int
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
					vInt3 = -1
				Case 1
					Dim cursorWrapper As Cursor
					vCur4 = Main.vSql1.ExecQuery("SELECT * from sortedClienti  WHERE rowid=" & 1 + j)
					vCur4.Position = 0
					labelWrapper.Text = vCur4.GetString("Codice")
					If vCur4.GetString("CodMaster") = "" Then
						i2 = -1
					Else If vCur4.GetInt("tesseraaggiuntiva") = 1 Then
						i2 = -5511243
					Else
						i2 = -7829368
					End If
					If vCur4.GetInt("attivo") = 0 Then
						i2 = -65536
					End If
					If Main.vSql1.ExecQuerySingleResult("select count(*) FROM sortedClienti where CodMaster ='" & vCur4.GetString("Codice") & "'") > 0 Then
						i2 = -16711936
					End If
					If i2 <> -1 Then
						panelWrapper.Color = i2
						vInt3 = i2
					End If
				Case 2
					vCSBuilder1.Initialize.Bold.Append(vCur4.GetString("Descrizione")).Pop
					If vCur4.GetString("scadcliente") <> "2099-01-01" Then
						Dim vGetString As String = vCur4.GetString("scadcliente")
						labelWrapper.Text = vCSBuilder1.Append(" (Scadenza " & (vGetString.SubString2(8, 10) & "/" & vGetString.SubString2(5, 7) & "/" & vGetString.SubString2(0, 4)) & ")")
					End If
					If vCur4.GetString("Telefono") <> "" Then
						vCSBuilder1.Append(CRLF).Color(-12369085).Append("Tel. " & vCur4.GetString("Telefono"))
					End If
					labelWrapper.Text = vCSBuilder1.PopAll
					If vInt3 <> -1 Then
						panelWrapper.Color = vInt3
					End If
				Case 3
					labelWrapper.Text = vCur4.GetString("Citta") & IIf(mod1.Sub222(vCur4.GetString("Provincia")), "", "(" & vCur4.GetString("Provincia") & ")")
					If vInt3 <> -1 Then
						panelWrapper.Color = vInt3
					End If
				Case 4
					labelWrapper.Text = vCur4.GetString("Via")
					If vInt3 <> -1 Then
						panelWrapper.Color = vInt3
					End If
				Case 5
					labelWrapper.Text = vCur4.GetString("PartitaIva")
					If vInt3 <> -1 Then
						panelWrapper.Color = vInt3
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

Sub Sub003(z As Boolean) As String
	Dim parseDouble As Long
	Dim str As String = ""
	If z Then
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where length(codice)<6") > 0 Then
			Try
				parseDouble = Main.vSql1.ExecQuerySingleResult("select max(cast(codice as int)) from clienti where length(codice)<6")
			Catch
				mod1.Sub217(LastException.Message)
				parseDouble = 1
			End Try
		Else
			parseDouble = 1
		End If
	Else
		parseDouble = Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='C'")
	End If
	Do While str = ""
		If modfunstr.Sub006(Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice = '" & parseDouble & "'")) = 0 Then
			str = parseDouble
		Else
			parseDouble = parseDouble + 1
		End If
	Loop
	Return str
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub CheckInvioFeData As ResumableSub
	Dim rs As ResumableSub
	Dim sresult As String
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return Null
			Case 0
				rsState = 1
				'rs = ResumableSub
				Dim resumableSubWrapper As ResumableSub
				rs = CallSub3(httpclient, "ComunicaConInviaFE", "http://127.0.0.1:12512/R__CRITAL__0__", "")
				Wait For (rs) Complete (wf17_0 As String)
				rsState = 17
				Continue
			Case 1
				rsState = 16
				If sresult = "" Then
					rsState = 3
					Continue
				Else
					rsState = 5
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 16
				Return ""
			Case 5
				rsState = 6
				Continue
			Case 6
				rsState = 15
				If IsNumber(sresult.SubString2(0, 1)) Then
					rsState = 8
					Continue
				Else
					rsState = 14
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 8
			Case 8
				rsState = 9
				Continue
			Case 9
				rsState = 12
				If sresult.SubString2(0, 1) <> "5" Then
					rsState = 11
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 11
			Case 11
				rsState = 12
				Return ""
			Case 12
				rsState = 15
				Continue
			Case 14
				rsState = 15
				Return ""
			Case 15
				rsState = 16
				Continue
			Case 16
				rsState = -1
				Return sresult
			Case 17
				rsState = 1
				sresult = wf17_0
				Continue
		End Select
	Loop
End Sub

Sub complete(str As String)
End Sub

Sub ChiudiMovimenti_Click
	pnlMovimenti.SetVisibleAnimated(400, False)
End Sub

Sub Client_Connected(z As Boolean)
	mod1.vStr2 = "Sub Client_Connected(ConStatus As Boolean)"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If z Then
		Dim asyncStreams As AsyncStreams
		asyncStreams.Initialize(vSocket1.InputStream, vSocket1.OutputStream, "AStreams")
		If Not(asyncStreams.IsInitialized) Then
			Return
		End If
		Dim bArr(0) As Byte
		asyncStreams.Write(vStr8.Replace(".", ",").GetBytes("UTF8"))
		ToastMessageShow("Comunicazione con il server ..." & vStr8, False)
		Return
	End If
	ToastMessageShow("Connessione al server non riuscita ...", True)
	ProgressDialogHide
End Sub

Sub Sub004(map As Map, map2 As Map)
	Dim sb2 As String = mod1.vStr4 & "/TMP"
	If File.Exists(sb2, "ModCliente.txt") Then
		File.Delete(sb2, "ModCliente.txt")
	End If
	If File.Exists(sb2, "ModCliente" & Main.v_numcassa & ".zip") Then
		File.Delete(sb2, "ModCliente" & Main.v_numcassa & ".zip")
	End If
	Dim randomAccessFile As RandomAccessFile
	randomAccessFile.Initialize2(sb2, "ModCliente.txt", False, False)
	randomAccessFile.WriteObject(map, True, randomAccessFile.CurrentPosition)
	randomAccessFile.WriteObject(map2, True, randomAccessFile.CurrentPosition)
	randomAccessFile.Close
	vMap1 = map
	vMap2 = map2
	CallSub(httpclient, "InviaClienteAlServer")
End Sub

Sub cPost_CheckedChange(z As Boolean)
	Dim z2 As Boolean
	If vBln2 And Not(z) Then
		Dim vObjectToCharSequence As Object = "Non è possibile disabilitare il postpagato ad un cliente Master."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		cPost.Checked = True
		Return
	End If
	If cPost.Checked Then
		If pIva.Text = "" And pCF.Text = "" Then
			Dim vObjectToCharSequence3 As Object = "Inserire la Partita Iva o il Codice Fiscale."
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			cPost.Checked = False
			Return
		End If
		cPrep.Checked = False
		pStampaRiep.Visible = True
		pResiduoConvenzione.Visible = True
	Else
		pStampaRiep.Visible = False
		pStampaRiep.SelectedIndex = 0
		pResiduoConvenzione.Visible = False
		pResiduoConvenzione.SelectedIndex = 1
		cPassaggio.Checked = False
	End If
	cPassaggio.Visible = z
	Dim editTextWrapper As EditText = pFido
	If z Then
		If Not(Main.vBln25) Then
			z2 = True
			editTextWrapper.Enabled = z2
			Return
		End If
	End If
	z2 = False
	editTextWrapper.Enabled = z2
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/clienti.java, metodo _cprep_checkedchange (riga 3645).
Sub cPrep_CheckedChange(z As Boolean) As String
	Dim z2 As Boolean
	Dim z3 As Boolean = True
	Dim editTextWrapper As EditText = pPrep
	If z Then
		If Not(Main.vBln25) Then
			z2 = True
			editTextWrapper.Enabled = z2
			If z Then
			End If
			z3 = False
			pFido.Enabled = z3
			If cPrep.Checked Then
				cPost.Checked = False
			End If
			If Not(Main.vBln24) And z And cPunti.Checked Then
				cPunti.Checked = False
				cpunti_checkedchange(False)
				Return ""
			End If
			Return ""
		End If
	End If
	z2 = False
	editTextWrapper.Enabled = z2
	If z Then
	End If
	z3 = False
	pFido.Enabled = z3
	If cPrep.Checked Then
	End If
	Return IIf(Not(Main.vBln24), "", "")
End Sub

Sub cPunti_CheckedChange(z As Boolean) As String
	Dim z2 As Boolean
	Dim editTextWrapper As EditText = pPunti
	If z Then
		If Not(Main.vBln25) Then
			z2 = True
			editTextWrapper.Enabled = z2
			If Not(Main.vBln24) And z And cPrep.Checked Then
				cPrep.Checked = False
				cprep_checkedchange(False)
				Return ""
			End If
			Return ""
		End If
	End If
	z2 = False
	editTextWrapper.Enabled = z2
	Return IIf(Not(Main.vBln24), "", "")
End Sub

Sub Sub005
	Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedClienti")
	Main.vSql1.ExecNonQuery("CREATE TEMP TABLE sortedClienti (chiave INTEGER PRIMARY KEY ," & CRLF & TAB & TAB & "Codice nvarchar (20)  NULL,Descrizione" & TAB & "nvarchar (50)  not NULL default ''," & CRLF & TAB & TAB & "Citta nvarchar (50)   not NULL default '',Via nvarchar (50)   not NULL default ''," & CRLF & TAB & TAB & "PartitaIva nvarchar (50)   not NULL default '',scadcliente DateTime not null default '2099-01-01',CodiceFiscale nvarchar (20)   not NULL default '',Provincia nvarchar (4)  not NULL default ''," & CRLF & TAB & TAB & "CAP nvarchar (50)  not NULL default '',Telefono nvarchar (20)  not NULL default '',attivo bit not null default 1,CodMaster nvarchar (20)  not NULL default '',tesseraaggiuntiva bit not NULL default 0)")
End Sub

Sub CreateCli_Click
	Dim j As Long
	Dim j2 As Long
	Dim cursorWrapper As Cursor
	Dim z As Boolean
	Try
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 2
		vDlg1.Input = ""
		vDlg1.PasswordMode = True
		vDlg1.Hint = "Password di accesso"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow As Int = vDlg1.Show("Inserire la Password di accesso per la creazione multipla di clienti", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And (vDlg1.Input = "147896" Or vDlg1.Input = "3698741") Then
			Dim left As String = modfunstr.left(Main.v_prefissocliente & "0000000000000", 12)
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where substr(codice,1," & SmartStringFormatter("", Main.v_prefissocliente.Length) & ")='" & SmartStringFormatter("", Main.v_prefissocliente) & "'") > 0 Then
				Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("Select codice from clienti where substr(codice,1," & SmartStringFormatter("", Main.v_prefissocliente.Length) & ")='" & SmartStringFormatter("", Main.v_prefissocliente) & "' order by codice desc limit 1")
				If vExecQuerySingleResult.Length = 13 Or vExecQuerySingleResult = 8 Then
					left = vExecQuerySingleResult.SubString2(0, vExecQuerySingleResult.Length - 1)
				End If
			End If
			Dim inputDialog6 As InputDialog = vDlg1
			vDlg1.InputType = 2
			vDlg1.Input = left
			vDlg1.Hint = "Primo codice (Da)"
			vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
			vDlg1.PasswordMode = False
			Dim vShow2 As Int = vDlg1.Show("Inserire il primo codice (Da)", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			If vShow2 <> -1 Or Not(IsNumber(vDlg1.Input)) Then
				j = 0
			Else
				j = vDlg1.Input
			End If
			If j = 0 Then
				Return
			End If
			Dim vShow3 As Int = vDlg1.Show("Inserire il secondo codice (a)", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			If vShow3 <> -1 Or Not(IsNumber(vDlg1.Input)) Then
				j2 = 0
			Else
				j2 = vDlg1.Input
			End If
			If j2 = 0 Then
				Return
			End If
			If j2 < j Then
				Dim vObjectToCharSequence As Object = "Il codice di partenza risulta essere più elevato di quello di arrivo"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Return
			End If
			If j2 = j Then
				Dim vObjectToCharSequence3 As Object = "Il codice di partenza risulta essere uguale a quello di arrivo"
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				Return
			End If
			Dim vNumberToString As String = j
			If Not(vNumberToString.Length = 7 Or vNumberToString.Length = 12) Then
				Dim vObjectToCharSequence5 As Object = "Questa procedura funziona solo con codici lunghi 7 o 12 caratteri."
				Dim vObjectToCharSequence6 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
				Return
			End If
			Dim vNumberToString2 As String = j2
			If Not(vNumberToString.Length = 7 Or vNumberToString.Length = 12) Then
				Dim vObjectToCharSequence7 As Object = "Questa procedura funziona solo con codici lunghi 7 o 12 caratteri."
				Dim vObjectToCharSequence8 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
				Return
			End If
			If vNumberToString.Length <> vNumberToString2.Length Then
				Dim vObjectToCharSequence9 As Object = "Il codice di partenza risulta essere di lunghezza diversa rispetto al codice di destinazione."
				Dim vObjectToCharSequence10 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
				Return
			End If
			Dim inputDialog11 As InputDialog = vDlg1
			vDlg1.InputType = 2
			vDlg1.Input = ""
			vDlg1.Hint = "Codice cliente"
			vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
			vDlg1.PasswordMode = False
			Dim cursorWrapper2 As Cursor
			Dim vShow4 As Int = vDlg1.Show("Indicare il codice cliente dal quale copiare i parametri (lasciare vuoto per lasciare i valori predefiniti)", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			If vShow4 <> -1 Or vDlg1.Input = "" Then
				cursorWrapper = cursorWrapper2
			Else
				Dim cursorWrapper3 As Cursor
				cursorWrapper = Main.vSql1.ExecQuery("select * from clienti where codice='" & vDlg1.Input & "'")
			End If
			If Not(cursorWrapper.IsInitialized) Or cursorWrapper.RowCount <= 0 Then
				z = True
			Else
				cursorWrapper.Position = 0
				z = False
			End If
			Dim list As List
			list.Initialize
			Dim i As Int = j2 - j
			Dim i2 As Int
			For i2 = 0 To i
				Dim vTmp As String = mod1.Sub022(i2 + j)
				If vTmp.StartsWith("00000") Then
					vTmp = vTmp.SubString(5)
				End If
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice ='" & vTmp & "'") = 0 Then
					Dim map As Map
					map.Initialize
					map.Put("codice", vTmp)
					If z Then
						map.Put("descrizione", "Cliente Fidelity")
					Else
						map.Put("descrizione", cursorWrapper.GetString("descrizione"))
						map.Put("sconto", cursorWrapper.GetInt("sconto"))
						map.Put("prep", cursorWrapper.GetDouble("prep"))
						map.Put("listino", cursorWrapper.GetInt("listino"))
						map.Put("grpcli", cursorWrapper.GetInt("grpcli"))
						map.Put("punti", cursorWrapper.GetInt("punti"))
						map.Put("fido", cursorWrapper.GetDouble("fido"))
						map.Put("abprep", cursorWrapper.GetInt("abprep"))
						map.Put("abpost", cursorWrapper.GetInt("abpost"))
						map.Put("abpunti", cursorWrapper.GetInt("abpunti"))
					End If
					list.Add(map)
				End If
			Next
			If list.Size > 0 Then
				dbutil.Sub007(Main.vSql1, "clienti", list)
				Dim vObjectToCharSequence11 As Object = "Sono stati inseriti " & list.Size & " clienti." & CRLF & "Procedura Ultimata."
				Dim vObjectToCharSequence12 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
			Else
				Dim vObjectToCharSequence13 As Object = "Non è stato inserito nessun cliente."
				Dim vObjectToCharSequence14 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
			End If
			If cursorWrapper.IsInitialized Then
				cursorWrapper.Close
			End If
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub Sub006(str As String, i As Int, cursorWrapper As Cursor) As Panel
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Background = mod1.Sub155(-16776961, 0)
	Try
		Initialize("buttonFun")
		Dim labelWrapper As Label
		labelWrapper.Initialize("")
		labelWrapper.Gravity = Bit.Or(16, 3)
		labelWrapper.Text = cursorWrapper.GetString("datam").SubString2(3, 5) & "/" & cursorWrapper.GetString("datam").SubString2(0, 2) & "/" & cursorWrapper.GetString("datam").SubString2(6, 10)
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -1
		labelWrapper.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper.Background = mod1.Sub155(-16776961, 25)
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("")
		labelWrapper2.Gravity = Bit.Or(16, 1)
		labelWrapper2.Text = NumberFormat2(cursorWrapper.GetDouble("totale"), 1, 2, 2, False)
		labelWrapper2.TextSize = 16
		labelWrapper2.TextColor = -1
		labelWrapper2.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper2.Background = mod1.Sub155(-12303292, 25)
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("")
		labelWrapper3.Gravity = Bit.Or(16, 1)
		vInt5 = vInt5 + cursorWrapper.GetDouble("punti")
		labelWrapper3.Text = NumberFormat2(vInt5, 1, 0, 0, False)
		labelWrapper3.TextSize = 16
		labelWrapper3.TextColor = -1
		labelWrapper3.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper3.Background = mod1.Sub155(-12303292, 25)
		Dim labelWrapper4 As Label
		labelWrapper4.Initialize("")
		labelWrapper4.Gravity = Bit.Or(16, 1)
		vDbl1 = Round2(vDbl1 + cursorWrapper.GetDouble("prep"), 2)
		labelWrapper4.Text = NumberFormat2(vDbl1, 1, 2, 2, False)
		labelWrapper4.TextSize = 16
		labelWrapper4.TextColor = -1
		labelWrapper4.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper4.Background = mod1.Sub155(-12303292, 25)
		Dim labelWrapper5 As Label
		labelWrapper5.Initialize("")
		labelWrapper5.Gravity = Bit.Or(16, 1)
		labelWrapper5.Text = cursorWrapper.GetInt("nfat")
		labelWrapper5.TextSize = 16
		labelWrapper5.TextColor = -1
		labelWrapper5.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper5.Background = mod1.Sub155(-12303292, 25)
		Dim labelWrapper6 As Label
		labelWrapper6.Initialize("")
		labelWrapper6.Gravity = Bit.Or(16, 1)
		labelWrapper6.Text = cursorWrapper.GetLong("nmov")
		If cursorWrapper.GetString("memo") <> "" Then
			labelWrapper6.Text = labelWrapper6.Text & " (" & cursorWrapper.GetString("memo").Trim & ")"
		End If
		labelWrapper6.TextSize = 16
		labelWrapper6.TextColor = -1
		labelWrapper6.Typeface = Typeface.DEFAULT_BOLD
		labelWrapper6.Background = mod1.Sub155(-12303292, 25)
		Dim labelWrapper7 As Label
		labelWrapper7.Initialize("")
		labelWrapper7.Text = str
		labelWrapper7.Visible = False
		panelWrapper.AddView(labelWrapper, PerXToCurrent(2), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(22), DipToCurrent(2), PerXToCurrent(10), i)
		panelWrapper.AddView(labelWrapper3, PerXToCurrent(32), DipToCurrent(2), PerXToCurrent(10), i)
		panelWrapper.AddView(labelWrapper4, PerXToCurrent(42), DipToCurrent(2), PerXToCurrent(10), i)
		panelWrapper.AddView(labelWrapper5, PerXToCurrent(52), DipToCurrent(2), PerXToCurrent(10), i)
		panelWrapper.AddView(labelWrapper6, PerXToCurrent(62), DipToCurrent(2), PerXToCurrent(30), i)
		panelWrapper.AddView(labelWrapper7, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Cstampa_OverrideUrl(str As String) As Boolean
	Dim vSplit() As String = Regex.Split("[.]", str.SubString(7))
	Dim parseDouble As Int = vSplit(0)
	If vSplit(1) = -1 Then
		If vStr13 <> "" Then
			vWebView1.LoadHtml(dbutil.Sub002(Main.vSql1, vStr13.Replace(" CodiceFiscale", " CodiceFiscale,mail") & " order by " & vLst5.Get(parseDouble) & vStr4, Null, 0, True, parseDouble, False))
			vWebView1.Tag = vStr13.Replace(" CodiceFiscale", " CodiceFiscale,mail") & " order by " & vLst5.Get(parseDouble) & vStr4
			vStr12 = " Ordinamento:" & vLst5.Get(parseDouble)
			If vStr4 = " asc" Then
				vStr4 = " desc"
			Else
				vStr4 = " asc"
			End If
		End If
	End If
	Return True
End Sub

Sub DatiAggiuntivi_Click
	pnlDatiClienti.Visible = True
	pnlDatiClienti.BringToFront
	lblDatiClienti.Text = "Dati aggiuntivi Cliente " & pCodice.Text & " ( " & pDes.Text & " )"
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

Sub Edtcodicedestcli_TextChanged(str As String, str2 As String)
	If str2.Length > 50 Then
		edtCodDestCli.Text = str
		edtCodDestCli.SelectionStart = str.Length
		Return
	End If
End Sub

Sub edtCognomeCli_TextChanged(str As String, str2 As String)
	If str2.Length > 60 Then
		edtCognomeCli.Text = str
		edtCognomeCli.SelectionStart = str.Length
		Return
	End If
End Sub

Sub edtNomeCli_TextChanged(str As String, str2 As String)
	If str2.Length > 60 Then
		edtNomeCli.Text = str
		edtNomeCli.SelectionStart = str.Length
		Return
	End If
End Sub

Sub edtPECCli_TextChanged(str As String, str2 As String)
	If str2.Length > 250 Then
		edtPECCli.Text = str
		edtPECCli.SelectionStart = str.Length
		Return
	End If
End Sub

Sub errinvioclientealserver
	Dim vObjectToCharSequence As Object = "Si sono verificati errori nell'invio del cliente al server." & CRLF & TAB & TAB & TAB & TAB & SmartStringFormatter("", CRLF) & "Si desidera riprovare ?"
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Sub004(vMap1, vMap2)
		Return
	End If
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

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub EseguiRicerca
	Dim e As EditText
	Dim hideprogress As Boolean
	Dim btricerca As Boolean
	Dim tmpquery As String
	Dim answ As Int
	Dim bok As Boolean
	Dim rs As ResumableSub
	Dim sresult As String
	Dim tmps As String
	Dim totart As Int
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
					rsState = 89
					rsCatchState = 88
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 88
					ProgressDialogShow("Ricerca in corso ...")
					DoEvents
					'e = EditText
					e = Edt1
					e.Text = e.Text.Replace(CRLF, "").Replace("'", "")
					Continue
				Case 4
					rsState = 7
					If e.Text.Trim <> "" Then
						Continue
					Else
						If Not(vInt6 <> m_rtutti) Then
							Continue
						Else
							If Not(vInt6 <> m_rgrcli) Then
								Continue
							Else
								rsState = 6
								Continue
							End If
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 6
				Case 6
					rsState = 7
					ProgressDialogHide
					Return
				Case 7
					rsState = 8
					hideprogress = True
					vStr1 = e.Text.Trim
					btricerca = False
					btricerca = False
					vStr10 = ""
					vStr12 = ""
					vStr11 = ""
					tmpquery = "SELECT [codice]" & TAB & "as Codice,descrizione as Descrizione ,citta as Citta,cap as CAP,provincia as Provincia,via as Via,telefono as Telefono,piva as PartitaIva,scadcliente,codf as CodiceFiscale,attivo,CodMaster,tesseraaggiuntiva from clienti "
					Continue
				Case 8
					rsState = 63
					If vInt6 = m_rcodice And e.Text.Trim <> "" Then
						rsState = 10
						Continue
					Else
						If vInt6 = m_rpiva And e.Text.Trim <> "" Then
							rsState = 12
							Continue
						Else
							If vInt6 = m_rgrcli Then
								rsState = 14
								Continue
							Else
								If vInt6 = m_rmail Then
									rsState = 16
									Continue
								Else
									If vInt6 = m_rindirizzo And e.Text.Trim <> "" Then
										rsState = 18
										Continue
									Else
										If vInt6 = m_rmaster And e.Text.Trim <> "" Then
											rsState = 20
											Continue
										Else
											If vInt6 = m_rdescrizione And e.Text.Trim <> "" Then
												rsState = 22
												Continue
											Else
												If vInt6 <> m_rtutti Then
													Continue
												Else
													rsState = 62
													Continue
												End If
											End If
										End If
									End If
								End If
							End If
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 10
				Case 10
					rsState = 63
					vStr10 = tmpquery & " where codice = '" & e.Text & "'"
					btricerca = True
					Continue
				Case 12
					rsState = 63
					vStr10 = tmpquery & " where  piva = '" & e.Text & "'"
					btricerca = True
					Continue
				Case 14
					rsState = 63
					vStr10 = tmpquery & " where  grpcli =" & vCur6.Position
					vStr11 = "Gruppo cliente = " & vCur6.Position
					btricerca = True
					Continue
				Case 16
					rsState = 63
					vStr10 = tmpquery & " where  mail ='" & e.Text & "'"
					vStr11 = "Mail = " & e.Text
					btricerca = True
					Continue
				Case 18
					rsState = 63
					vStr10 = tmpquery & " where  via like '%" & e.Text & "%' or citta like '%" & e.Text & "%'"
					vStr11 = "Indirizzo contiene " & e.Text
					btricerca = True
					Continue
				Case 20
					rsState = 63
					vStr10 = tmpquery & " where codice='" & e.Text & "' or CodMaster = '" & e.Text & "'"
					btricerca = True
					Continue
				Case 22
					rsState = 23
					Continue
				Case 23
					rsState = 60
					If e.Text.Trim.Length = 11 Then
						If mod1.Sub134(e.Text.Trim, True) Then
							rsState = 25
							Continue
						End If
					End If
					If e.Text.Trim.Length = 16 Then
						If mod1.Sub134(e.Text.Trim, True) Then
							rsState = 57
							Continue
						End If
					End If
					rsState = 59
					Continue
				Case 25
					rsState = 26
					vStr10 = tmpquery & " where  piva = '" & e.Text & "'"
					Continue
				Case 26
					rsState = 55
					If Not(Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where  piva = '" & e.Text & "'") = 0) Then
						Continue
					Else
						rsState = 28
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 28
				Case 28
					rsState = 29
					answ = -2
					Continue
				Case 29
					rsState = 40
					If bNew.Enabled Then
						rsState = 31
						Continue
					Else
						rsState = 33
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 31
				Case 31
					rsState = 40
					Dim vObjectToCharSequence As Object = "Partita Iva " & e.Text & " non trovata." & CRLF & "Confermi l'inserimento del cliente ? (necessario il collegamento ad internet)"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					answ = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
					Continue
				Case 33
					rsState = 34
					Continue
				Case 34
					rsState = 39
					If vBln3 Then
						rsState = 36
						Continue
					Else
						rsState = 38
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 36
				Case 36
					rsState = 39
					answ = -1
					Continue
				Case 38
					rsState = 39
					Dim vObjectToCharSequence3 As Object = "Partita Iva " & e.Text & " non trovata."
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
					Continue
				Case 39
					rsState = 40
					Continue
				Case 40
					rsState = 54
					Dim i11 As Int = answ
					If i11 <> -1 Then
						Continue
					Else
						rsState = 42
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 42
				Case 42
					rsState = 43
					progressonly(True, "Richiesta Dati al server in Corso")
					hideprogress = False
					bok = False
					Continue
				Case 43
					rsState = 50
					If Not(Main.v_inviofe) Then
						Continue
					Else
						rsState = 45
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 45
				Case 45
					rsState = 46
					'rs = ResumableSub
					rs = CheckInvioFeData()
					Wait For (rs) Complete (wf90_0 As String)
					rsState = 90
					Continue
				Case 46
					rsState = 49
					If sresult <> "" Then
						rsState = 48
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 48
				Case 48
					rsState = 49
					GetCustomerData(sresult)
					bok = True
					ProgressDialogHide
					Continue
				Case 49
					rsState = 50
					Continue
				Case 50
					rsState = 53
					If bok Then
						Continue
					Else
						rsState = 52
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 52
				Case 52
					rsState = 53
					tmps = vStr9.Replace("COUNTRY", "IT")
					tmps = tmps.Replace("VATNUMBER", e.Text.Trim)
					CallSub2(httpclient, "GetDatiCliente", tmps)
					Continue
				Case 53
					rsState = 54
					Continue
				Case 54
					rsState = 55
					Continue
				Case 55
					rsState = 60
					Continue
				Case 57
					rsState = 60
					vStr10 = tmpquery & " where  upper(codf) = '" & e.Text.ToUpperCase & "'"
					Continue
				Case 59
					rsState = 60
					vStr10 = tmpquery & " where  descrizione like '%" & e.Text & "%'"
					vStr11 = "Descrizione contiene " & e.Text
					Continue
				Case 60
					rsState = 63
					btricerca = True
					Continue
				Case 62
					rsState = 63
					vStr10 = tmpquery
					vStr11 = "Tutti i clienti"
					btricerca = True
					Continue
				Case 63
					rsState = 77
					If Not(btricerca) Then
						Continue
					Else
						rsState = 65
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 65
				Case 65
					rsState = 66
					vStr2 = e.Text
					vInt4 = vInt6
					Sub010()
					totart = Main.vSql1.ExecQuerySingleResult("Select count(*) from sortedClienti")
					Continue
				Case 66
					rsState = 71
					If vInt2 >= 0 Then
						Dim i12 As Int = totart - 1
						If i12 >= vInt2 Then
							rsState = 68
							Continue
						End If
					End If
					rsState = 70
					Continue
				Case 68
					rsState = 71
					vUltimateListView1.JumpTo(vInt2, False)
					vInt2 = -1
					Continue
				Case 70
					rsState = 71
					vUltimateListView1.JumpTo(0, False)
					Continue
				Case 71
					rsState = 76
					If vInt6 <> m_rcodice Then
						Continue
					Else
						rsState = 73
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 73
				Case 73
					rsState = 76
					Edt1.Text = ""
					Continue
				Case 76
					rsState = 77
					bStampa.Enabled = totart > 0
					Continue
				Case 77
					rsState = 78
					vIME2.HideKeyboard
					Continue
				Case 78
					rsState = 81
					If Not(Edt1.Visible) Then
						Continue
					Else
						rsState = 80
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 80
				Case 80
					rsState = 81
					Edt1.RequestFocus
					Edt1.SelectionStart = Edt1.Text.Length
					Continue
				Case 81
					rsState = 86
					If Not(hideprogress) Then
						Continue
					Else
						rsState = 83
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 83
				Case 83
					rsState = 86
					ProgressDialogHide
					Continue
				Case 86
					rsState = 89
					mod1.Sub081
					Continue
				Case 88
					rsState = 89
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 89
					rsState = -1
					rsCatchState = 0
					Continue
				Case 90
					rsState = 46
					sresult = wf90_0
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

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub GetCustomerData(sresult As String)
	Dim suser As String
	Dim spwd As String
	Dim urlitalretail As String
	Dim su As StringUtils
	Dim converter As ByteConverter
	Dim job1 As httpjob
	Dim tmpr() As String
	Dim auth As String
	Dim mdata As String
	Dim myjson As Map
	Dim json As JSONParser
	Dim serrorcode As String
	Dim mapdata As Map
	Dim maphelper As Map
	Dim tmprs As String
	Dim tmpcodicefiscale As String
	Dim tmpaddress As String
	Dim tmpcap As String
	Dim tmpcitta As String
	Dim tmpprovincia As String
	Dim tmpcountry As String
	Dim map1 As Map
	Dim jsongenerator As JSONGenerator
	Dim residcliente As String
	Dim serror As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					suser = ""
					spwd = ""
					urlitalretail = ""
					'su = StringUtils
					'converter = ByteConverter
					'job1 = httpjob
					Dim tmpr(0) As String
					tmpr = Regex.Split("@_@_@", sresult)
					Continue
				Case 1
					rsState = 4
					If tmpr.Length = 4 Then
						Continue
					Else
						rsState = 3
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 3
				Case 3
					rsState = 4
					Dim vObjectToCharSequence As Object = "Errore nella lettura dati da InvioFE"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					Return
				Case 4
					rsState = 5
					spwd = tmpr(3)
					suser = tmpr(2)
					urlitalretail = tmpr(1)
					Continue
				Case 5
					rsState = 8
					If spwd <> "" And suser <> "" And urlitalretail <> "" Then
						Continue
					Else
						rsState = 7
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 7
				Case 7
					rsState = 8
					Dim vObjectToCharSequence3 As Object = "Non sono stati compilati tutti i dati necessari per l'accesso al portale fattura Italretail"
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
					Return
				Case 8
					rsState = 11
					If urlitalretail.ToUpperCase.StartsWith("HTTP://") Or urlitalretail.ToUpperCase.StartsWith("HTTPS://") Then
						Continue
					Else
						rsState = 10
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 10
				Case 10
					rsState = 11
					urlitalretail = "https://" & urlitalretail
					Continue
				Case 11
					rsState = 14
					If urlitalretail.EndsWith("/") Then
						Continue
					Else
						rsState = 13
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 13
				Case 13
					rsState = 14
					urlitalretail = urlitalretail & "/"
					Continue
				Case 14
					rsState = 15
					auth = su.EncodeBase64(converter.StringToBytes("" & SmartStringFormatter("", suser) & ":" & SmartStringFormatter("", spwd) & "", "UTF8"))
					job1.Initialize("GetData", Me)
					Dim httpjobVar As httpjob = job1
					Dim str As String = urlitalretail & "getCompanyData.php"
					httpjobVar.Sub021(str, "clientLicenseId=" & SmartStringFormatter("", suser) & "&companyvat=" & SmartStringFormatter("", Edt1.Text.Trim) & "&forceSearch=1")
					job1.Sub011.SetHeader("Accept", "application/json")
					job1.Sub011.SetHeader("Authorization", "Basic " & auth)
					job1.Sub011.SetContentType("application/x-www-form-urlencoded")
					Wait For (job1) Jobdone (wf53_0 As httpjob)
					rsState = 53
					Continue
				Case 15
					rsState = 52
					If job1.vBln1 Then
						rsState = 17
						Continue
					Else
						rsState = 51
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 17
				Case 17
					rsState = 18
					mdata = job1.Sub012
					mod1.Sub215(mdata)
					'myjson = Map
					'json = JSONParser
					Continue
				Case 18
					rsState = 23
					rsCatchState = 22
					rsState = 20
					Continue
				Case 20
					rsState = 23
					rsCatchState = 22
					json.Initialize(mdata)
					myjson = json.NextObject
					Continue
				Case 22
					rsState = 23
					rsCatchState = 0
					Dim vObjectToCharSequence5 As Object = "Errore nella decodifica del json dal server"
					Dim vObjectToCharSequence6 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
					Return
				Case 23
					rsState = 24
					rsCatchState = 0
					serrorcode = myjson.GetDefault("errorCode", "")
					Continue
				Case 24
					rsState = 27
					If serrorcode = "0" And myjson.GetDefault("data", "Null") <> "Null" Then
						Continue
					Else
						rsState = 26
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 26
				Case 26
					rsState = 27
					Dim vObjectToCharSequence7 As Object = "La Partita iva non è stata trovata sul server remoto (" & SmartStringFormatter("", serrorcode) & ")"
					Dim vObjectToCharSequence8 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
					Return
				Case 27
					rsState = 28
					'mapdata = Map
					mapdata = myjson.Get("data")
					'maphelper = Map
					maphelper = mapdata.Get("companydata")
					tmprs = maphelper.Get("name")
					tmpcodicefiscale = maphelper.Get("FiscalCode")
					maphelper = maphelper.Get("vatnumber")
					Continue
				Case 28
					rsState = 31
					Dim vGetDefault As Object = maphelper.GetDefault("taxcode", "")
					If vGetDefault <> Edt1.Text Then
						rsState = 30
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 30
				Case 30
					rsState = 31
					Dim vObjectToCharSequence9 As Object = "I dati dal server non coddispondono alla partita iva richiesta"
					Dim vObjectToCharSequence10 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
					Return
				Case 31
					rsState = 32
					maphelper = mapdata.Get("registeredoffice")
					tmpaddress = maphelper.GetDefault("address", "")
					tmpcap = maphelper.GetDefault("zipcode", "")
					tmpcitta = maphelper.GetDefault("city", "")
					tmpprovincia = maphelper.GetDefault("province", "")
					tmpcountry = maphelper.GetDefault("country", "")
					Continue
				Case 32
					rsState = 49
					Dim vObjectToCharSequence11 As Object = "Confermi l'inserimento del cliente " & tmprs & " ?"
					Dim vObjectToCharSequence12 As Object = Main.vStr8
					Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "Si", "", "No", Main.vBmp1)
					If vMsgbox2 <> -1 Then
						Continue
					Else
						rsState = 34
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 34
				Case 34
					rsState = 35
					Continue
				Case 35
					rsState = 48
					If vBln3 Then
						rsState = 37
						Continue
					Else
						rsState = 47
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 37
				Case 37
					rsState = 38
					Dim map As Map = maphelper
					map.Put("vatcode", Edt1.Text)
					maphelper.Put("name", tmprs)
					'map1 = Map
					map1.Initialize
					'jsongenerator = JSONGenerator
					jsongenerator.Initialize(maphelper)
					CallSub3(ftpmanager, "SendObjBO", jsongenerator.ToString, "InsertCliente")
					Wait For (Null) Resinscliente (wf54_0 As String)
					rsState = 54
					Continue
				Case 38
					rsState = 45
					If residcliente = "" Then
						rsState = 40
						Continue
					Else If residcliente.StartsWith("ID=") Then
						rsState = 42
						Continue
					Else
						rsState = 44
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 40
				Case 40
					rsState = 45
					Dim vObjectToCharSequence13 As Object = "Si sono verificati dei problemi nella ricezione dati dal server"
					Dim vObjectToCharSequence14 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
					Continue
				Case 42
					rsState = 45
					Dim str2 As String = tmprs
					Dim str3 As String = tmpcitta
					Dim str4 As String = tmpprovincia
					Sub013(str2, str3, str4, Edt1.Text, tmpaddress, tmpcap, "", "", residcliente.Replace("ID=", ""))
					Continue
				Case 44
					rsState = 45
					Dim vObjectToCharSequence15 As Object = residcliente
					Dim vObjectToCharSequence16 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence15, vObjectToCharSequence16, "OK", "", "", Main.vBmp1)
					Continue
				Case 45
					rsState = 48
					Continue
				Case 47
					rsState = 48
					Dim str5 As String = tmprs
					Dim str6 As String = tmpcitta
					Dim str7 As String = tmpprovincia
					Sub013(str5, str6, str7, Edt1.Text, tmpaddress, tmpcap, tmpcodicefiscale, tmpcountry, "")
					Continue
				Case 48
					rsState = 49
					Continue
				Case 49
					rsState = 52
					Edt1.Text = ""
					Continue
				Case 51
					rsState = 52
					serror = job1.vStr3
					Dim vObjectToCharSequence17 As Object = "Errore restituito dal server:" & CRLF & SmartStringFormatter("", serror) & ""
					Dim vObjectToCharSequence18 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence17, vObjectToCharSequence18, "OK", "", "", Main.vBmp1)
					Continue
				Case 52
					rsState = -1
					job1.Sub024
					ProgressDialogHide
					Continue
				Case 53
					rsState = 15
					job1 = wf53_0
					Continue
				Case 54
					rsState = 38
					residcliente = wf54_0
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

Sub jobdone(httpjobVar As httpjob)
End Sub

Sub Sub007(str As String) As String
	Dim size As Int = vLst6.Size - 1
	Dim i As Int
	For i = 0 To size
		Dim tnazioneVar As tnazione = vLst6.Get(i)
		If tnazioneVar.id = str Then
			Return tnazioneVar.descrizione
		End If
	Next
	Return ""
End Sub

Sub Sub008(str As String, z As Boolean) As String
	Dim vTmp As String
	mod1.vStr2 = "Sub getProgress(Tipo As String) As String"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Select str
		Case Main.d_clienti
			If Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='C'").Length >= 6 Then
				vTmp = ""
			Else
				vTmp = Sub003(False)
			End If
			If z And vTmp <> "" Then
				Return vTmp
			End If
			Dim str2 As String = vTmp
			Do While True
				Dim inputDialog2 As InputDialog = vDlg1
				vDlg1.InputType = 2
				vDlg1.Input = str2
				vDlg1.Hint = "Codice cliente"
				vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
				vDlg1.PasswordMode = False
				Dim vObjectToString As String = IIf(str2 = "", "Genera Codice Breve", "")
				Dim vShow As Int = vDlg1.Show("Confermi l'inserimento del cliente ?", Main.vStr8, "Ok", "Annulla", vObjectToString, Main.vBmp1)
				If vShow = -1 Then
					If IsNumber(vDlg1.Input) And vDlg1.Input.Length <= 20 Then
						If modfunstr.Sub006(Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice = '" & vDlg1.Input & "'")) = 0 Then
							Dim length As Int = vDlg1.Input.Length
							If length > Main.v_prefissocliente.Length Then
								Dim input As String = vDlg1.Input
								If Main.vSql1.ExecQuerySingleResult("Select count(*) from operatori where CodAutomatico ='" & input.SubString(Main.v_prefissocliente.Length) & "'") > 0 Then
									Dim vObjectToCharSequence As Object = "Non è possibile utilizzare questo codice in quanto già utilizzato come codice automatico per operatore"
									Dim vObjectToCharSequence2 As Object = Main.vStr8
									Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
									Return ""
								End If
							End If
							Return vDlg1.Input
						End If
						Dim vObjectToCharSequence3 As Object = "Il cliente " & vDlg1.Input & " risulta essere già presente in anagrafica."
						Dim vObjectToCharSequence4 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
					Else
						Dim vObjectToCharSequence5 As Object = "Il codice inserito non è valido (lunghezza massima 20 caratteri) "
						Dim vObjectToCharSequence6 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
					End If
				Else
					If vShow = -2 Then
						Dim vTmp_ As String = Sub003(True)
						Main.vSql1.ExecNonQuery("update progressivi set valore =" & vTmp_ & " where codice ='C'")
						str2 = vTmp_
					Else
						Return ""
					End If
				End If
			Loop
		Case Else
			Return ""
	End Select
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub getstringacliente(stringa As String)
	Dim tmprs As String
	Dim tmpaddress As String
	Dim tmpindirizzo As String
	Dim tmpcap As String
	Dim tmpcitta As String
	Dim tmpprovincia As String
	Dim maphelper As Map
	Dim map1 As Map
	Dim jsongenerator As JSONGenerator
	Dim residcliente As String
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
					rsState = 30
					rsCatchState = 29
					rsState = 3
					Continue
				Case 2, 5, 8, 11, 14, 16, 18, 21, 25, 28
					Continue
				Case 3
					rsState = 4
					rsCatchState = 29
					Continue
				Case 4
					rsState = 27
					If stringa.Contains("<valid>true") Then
						rsState = 6
					Else
						rsState = 26
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 6
				Case 6
					rsState = 7
					tmprs = mod1.Sub209(stringa.SubString2(stringa.IndexOf("<name>") + 6, stringa.IndexOf("</name>")))
					tmpaddress = stringa.SubString2(stringa.IndexOf("<address>") + 9, stringa.IndexOf("</address>"))
					tmpindirizzo = mod1.Sub209(tmpaddress.SubString2(0, tmpaddress.IndexOf(CRLF)))
					tmpcap = tmpaddress.SubString2(tmpaddress.IndexOf(CRLF) + 1, tmpaddress.IndexOf(CRLF) + 6)
					tmpcitta = mod1.Sub209(tmpaddress.SubString2(tmpaddress.IndexOf(CRLF) + 6, tmpaddress.Length - 3))
					tmpprovincia = tmpaddress.SubString2(tmpaddress.Length - 3, tmpaddress.Length - 1)
					Continue
				Case 7
					rsState = 24
					Dim vObjectToCharSequence As Object = "Confermi l'inserimento del cliente " & tmprs & " ?"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
					If vMsgbox2 = -1 Then
						rsState = 9
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 9
				Case 9
					rsState = 10
					Continue
				Case 10
					rsState = 23
					If vBln3 Then
						rsState = 12
					Else
						rsState = 22
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 12
				Case 12
					rsState = 13
					'maphelper = Map
					maphelper.Initialize
					maphelper.Put("name", tmprs)
					maphelper.Put("address", tmpindirizzo)
					maphelper.Put("zipcode", tmpcap)
					maphelper.Put("city", tmpcitta)
					maphelper.Put("province", tmpprovincia)
					Dim map As Map = maphelper
					map.Put("vatcode", Edt1.Text)
					'map1 = Map
					map1.Initialize
					'jsongenerator = JSONGenerator
					jsongenerator.Initialize(maphelper)
					CallSub3(ftpmanager, "SendObjBO", jsongenerator.ToString, "InsertCliente")
					Wait For (Null) Resinscliente (wf31_0 As String)
					rsState = 31
					Continue
				Case 13
					rsState = 20
					If residcliente = "" Then
						rsState = 15
					Else If residcliente.StartsWith("ID=") Then
						rsState = 17
					Else
						rsState = 19
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 15
				Case 15
					rsState = 20
					Dim vObjectToCharSequence3 As Object = "Si sono verificati dei problemi nella ricezione dati dal server"
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
					Continue
				Case 17
					rsState = 20
					Dim str As String = tmprs
					Dim str2 As String = tmpcitta
					Dim str3 As String = tmpprovincia
					Sub013(str, str2, str3, Edt1.Text, tmpindirizzo, tmpcap, "", "", residcliente.Replace("ID=", ""))
					Continue
				Case 19
					rsState = 20
					Dim vObjectToCharSequence5 As Object = residcliente
					Dim vObjectToCharSequence6 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
					Continue
				Case 20
					rsState = 23
					Continue
				Case 22
					rsState = 23
					Dim str4 As String = tmprs
					Dim str5 As String = tmpcitta
					Dim str6 As String = tmpprovincia
					Sub013(str4, str5, str6, Edt1.Text, tmpindirizzo, tmpcap, "", "", "")
					Continue
				Case 23
					rsState = 24
					Continue
				Case 24
					rsState = 27
					Edt1.Text = ""
					Continue
				Case 26
					rsState = 27
					Dim vObjectToCharSequence7 As Object = "Partita iva non trovata."
					Dim vObjectToCharSequence8 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
					Continue
				Case 27
					rsState = 30
					Continue
				Case 29
					rsState = 30
					rsCatchState = 0
					mod1.Sub217(LastException)
					Continue
				Case 30
					rsState = -1
					rsCatchState = 0
					Continue
				Case 31
					rsState = 13
					residcliente = wf31_0
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

Sub Header_Click
	If vUltimateListView1.Enabled And vUltimateListView1.NumberOfItems > 1 Then
		Dim concreteViewWrapper As View = Sender
		If concreteViewWrapper.Tag > 0 And concreteViewWrapper.Tag < 6 Then
			vUltimateListView1.StopScrolling
			If vByt1 = concreteViewWrapper.Tag Then
				vBln5 = Not(vBln5)
			Else
				vColorDrawable1.Initialize(-16776961, DipToCurrent(6))
				If vByt1 >= 0 Then
					vLabelArr1(vByt1).Background = vColorDrawable1
				End If
				vBln5 = True
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

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/clienti.java, metodo m2… (riga 5686).
Sub Sub009(z As Boolean)
	Dim z2 As Boolean
	If Not(z) And lFido.Top <> pGetSaldi.Top Then
		Return
	End If
	PHideCtrl.Visible = z
	If z Then
		If vBln7 Then
			PHideCtrl.Height = PerYToCurrent(66) + DipToCurrent(200)
			LblInf.Text = "Tessera Aggiuntiva"
		Else
			PHideCtrl.Height = PerYToCurrent(66)
			LblInf.Text = "Cliente Slave"
		End If
	End If
	pGruppoCli.Visible = Not(z)
	lGruppoCli.Visible = Not(z)
	Dim buttonWrapper As Button = pGetSaldi
	If Not(z) Then
		If Main.v_attivaterminale Then
			If Not(Main.v_solovenduto) Then
				If Main.v_centralizza And (vCur2.GetInt("abprep") = 1 Or vCur2.GetInt("abpunti") = 1) Then
					z2 = True
					buttonWrapper.Visible = z2
					pZona.Visible = Not(z)
					pMacro.Visible = Not(z)
					pEIva.Visible = Not(z)
					lEIva.Visible = Not(z)
					pMaps.Visible = z And pPlu.Visible
					DatiAggiuntivi.Visible = Not(z)
					If Not(z) Then
						lFido.Top = pGetSaldi.Top
						pFido.Top = pGetSaldi.Top
					Else
						lFido.Top = PerYToCurrent(36)
						pFido.Top = PerYToCurrent(36)
					End If
					Return
				End If
			End If
		End If
	End If
	z2 = False
	buttonWrapper.Visible = z2
	pZona.Visible = Not(z)
	pMacro.Visible = Not(z)
	pEIva.Visible = Not(z)
	lEIva.Visible = Not(z)
	pMaps.Visible = z And pPlu.Visible
	DatiAggiuntivi.Visible = Not(z)
	If Not(z) Then
	End If
End Sub

Sub imericerca_handleaction As Boolean
	mod1.vStr2 = "Sub IMERicerca_HandleAction As Boolean"
	EseguiRicerca()
	Return False
End Sub

Sub lblmainTitle_Click
End Sub

Sub Sub010
	If vInt11 = 0 Then
		vUltimateListView1.ClearContent
		Sub005()
		Main.vSql1.ExecNonQuery("insert into sortedClienti(Codice,Descrizione,Citta," & CRLF & TAB & "CAP,Provincia,Via,Telefono,PartitaIva,scadcliente,CodiceFiscale,attivo,CodMaster,tesseraaggiuntiva) " & SmartStringFormatter("", vStr10 & vStr7) & "  ")
		vUltimateListView1.BulkAddItems(Main.vSql1.ExecQuerySingleResult("Select count(*) from sortedClienti"), "ROW", 0)
		Dim cursorWrapper As Cursor
		vCur5 = Main.vSql1.ExecQuery("Select Descrizione from sortedClienti")
		Return
	End If
	If vInt11 = 1 Then
		CallSubDelayed(Me, "DelayedRefresh")
		Return
	End If
	If vInt11 = 2 Then
		vUltimateListView1.ClearContent
		vUltimateListView1.BulkAddItems(Main.vSql1.ExecQuerySingleResult("Select count(*) from sortedClienti"), "ROW", 0)
		Return
	End If
End Sub

Sub Sub011(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/clienti.java, metodo _mail_click (riga 5812).
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
									vSMTP1.Subject = Main.v_mdesmittente & " " & "Elenco Clienti"
									Dim vTmp As String = mod1.Sub061(mod1.Sub058)
									Dim writableWorkbookWrapper As WritableWorkbook
									writableWorkbookWrapper.Initialize(mod1.vStr4, "Elenco Clienti.xls")
									Dim vAddSheet As WritableSheet = writableWorkbookWrapper.AddSheet("Elenco Clienti", 0)
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
									writableCellWrapper.InitializeText(0, 0, "Elenco Clienti")
									writableCellWrapper.SetCellFormat(writableCellFormatWrapper)
									vAddSheet.AddCell(writableCellWrapper)
									writableCellWrapper.InitializeText(2, 0, vTmp)
									writableCellWrapper.SetCellFormat(writableCellFormatWrapper)
									vAddSheet.AddCell(writableCellWrapper)
									vAddSheet.SetRowHeight(0, 18)
									Dim stringBuilderWrapper As StringBuilder
									stringBuilderWrapper.Initialize
									stringBuilderWrapper.Append("Elenco Clienti").Append(CRLF)
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
									If vStr11 <> "" Then
										i = 0
									Else
										stringBuilderWrapper.Append("Filtro: ").Append(CRLF)
										writableCellWrapper.InitializeText(0, 2, "Filtro: ")
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
										vAddSheet.AddCell(writableCellWrapper)
										stringBuilderWrapper.Append(vStr11 & vStr12).Append(CRLF)
										writableCellWrapper.InitializeText(1, 2, vStr11 & vStr12)
										writableCellWrapper.SetCellFormat(writableCellFormatWrapper3)
										vAddSheet.AddCell(writableCellWrapper)
										stringBuilderWrapper.Append("------------------------------------------------------------").Append(CRLF)
										i = 5
									End If
									size = vLst4.Size - 1
									Dim str4 As String = ""
									i2 = 0
									Do While i2 <= size
										Dim vObjectToString As String = vLst4.Get(i2)
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
									Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery(vWebView1.Tag)
									rowCount = cursorWrapper4.RowCount - 1
									i3 = 0
									Dim i6 As Int = i + 1
									Do While i3 <= rowCount
										cursorWrapper4.Position = i3
										Dim i7 As Int = 0
										Dim size2 As Int = vLst3.Size - 1
										Dim i8 As Int = 0
										Dim str6 As String = ""
										Do While i8 <= size2
											Dim vSplit() As String = Regex.Split(";", vLst3.Get(i8))
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
									vSMTP1.AddAttachment(mod1.vStr4, "Elenco Clienti.xls")
									vSMTP1.Send
								End If
							End If
							z = True
							sMTPWrapper2.UseSSL = z
							If Main.v_md1 <> "" Then
							End If
							If Main.v_md2 <> "" Then
							End If
							vSMTP1.Subject = Main.v_mdesmittente & " " & "Elenco Clienti"
							Dim vTmp_ As String = mod1.Sub061(mod1.Sub058)
							Dim writableWorkbookWrapper2 As WritableWorkbook
							writableWorkbookWrapper2.Initialize(mod1.vStr4, "Elenco Clienti.xls")
							Dim vAddSheet2 As WritableSheet = writableWorkbookWrapper2.AddSheet("Elenco Clienti", 0)
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
							writableCellWrapper2.InitializeText(0, 0, "Elenco Clienti")
							writableCellWrapper2.SetCellFormat(writableCellFormatWrapper9)
							vAddSheet2.AddCell(writableCellWrapper2)
							writableCellWrapper2.InitializeText(2, 0, vTmp_)
							writableCellWrapper2.SetCellFormat(writableCellFormatWrapper9)
							vAddSheet2.AddCell(writableCellWrapper2)
							vAddSheet2.SetRowHeight(0, 18)
							Dim stringBuilderWrapper2 As StringBuilder
							stringBuilderWrapper2.Initialize
							stringBuilderWrapper2.Append("Elenco Clienti").Append(CRLF)
							stringBuilderWrapper2.Append("").Append(CRLF)
							stringBuilderWrapper2.Append("Data e ora di stampa: " & vTmp_).Append(CRLF)
							stringBuilderWrapper2.Append("Inviato da : ").Append(CRLF)
							Dim cursorWrapper22 As Cursor
							cursorWrapper = Main.vSql1.ExecQuery("Select * from intesta order by codice")
							If cursorWrapper.RowCount > 0 Then
							End If
							stringBuilderWrapper2.Append(" ").Append(CRLF)
							If vStr11 <> "" Then
							End If
							size = vLst4.Size - 1
							Dim str42 As String = ""
							i2 = 0
							Do While i2 <= size
							Loop
							Dim cursorWrapper32 As Cursor
							Dim cursorWrapper42 As Cursor = Main.vSql1.ExecQuery(vWebView1.Tag)
							rowCount = cursorWrapper42.RowCount - 1
							i3 = 0
							Dim i62 As Int = i + 1
							Do While i3 <= rowCount
							Loop
							vSMTP1.Body = stringBuilderWrapper2
							writableWorkbookWrapper2.Write
							writableWorkbookWrapper2.Close
							vSMTP1.AddAttachment(mod1.vStr4, "Elenco Clienti.xls")
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
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/clienti.java, metodo m1… (riga 6167).
Sub Sub012 As Boolean
	Dim z As Boolean
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim z5 As Boolean
	If Main.vBln25 Then
		If Main.vBln26 Then
			Dim vObjectToCharSequence As Object = "Non è possibile modificare clienti quando il terminale è offline"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Return False
		End If
	End If
	Dim sb As String = "F2" & Main.vCur3.GetString("funzioni2")
	If Not(mod1.Sub026(sb, Main.d_clienti)) Then
		Dim vObjectToCharSequence3 As Object = "Non si dispone delle autorizzazioni richieste "
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		Return False
	End If
	vInt11 = 1
	If vCur3.IsInitialized And vCur3.RowCount > 0 Then
		Nazione.Tag = vCur3.GetString("NazioneCli")
		Nazione.Text = "Nazione:" & Sub007(Nazione.Tag)
		TipoSoggetto.SelectedIndex = vCur3.GetInt("TipoSoggettoCli")
		pEIva2.SelectedIndex = vCur3.GetInt("EsigibilitaIVA")
		edtNomeCli.Text = vCur3.GetString("NomeCli")
		edtCognomeCli.Text = vCur3.GetString("CognomeCli")
		edtPECCli.Text = vCur3.GetString("PEC")
		edtCodDestCli.Text = vCur3.GetString("CodiceDestinatario")
		edtCodDestCli.Enabled = TipoSoggetto.SelectedIndex > 0
	Else
		Nazione.Tag = "IT"
		Nazione.Text = "Nazione:Italia"
		TipoSoggetto.SelectedIndex = 2
		edtNomeCli.Text = ""
		edtCognomeCli.Text = ""
		edtCodDestCli.Text = "0000000"
		edtCodDestCli.Enabled = False
		edtPECCli.Text = ""
		pEIva2.SelectedIndex = 0
	End If
	pCodice.Text = vCur2.GetString("codice")
	pDes.Text = vCur2.GetString("descrizione")
	Sub017(vCur2.GetString("dcompleanno"))
	pdocPredefinito.SelectedIndex = vCur2.GetInt("docPredefinito")
	If pDes.Text.Contains("{vuoto}") Then
		pDes.Text = ""
	End If
	pCitta.Text = vCur2.GetString("citta")
	pProvincia.Text = vCur2.GetString("provincia")
	pIva.Text = vCur2.GetString("piva")
	pCF.Text = vCur2.GetString("codf")
	pTel.Text = vCur2.GetString("telefono")
	PMail.Text = vCur2.GetString("mail")
	pFax.Text = vCur2.GetString("fax")
	pVia.Text = vCur2.GetString("via")
	pCap.Text = vCur2.GetString("cap")
	pCodLotteria.Text = vCur2.GetString("codLotteria")
	pPwdWeb.Text = vCur2.GetString("PwdWeb")
	cContrassegno.Checked = vCur2.GetInt("contrassegno") = 1
	pSco.Text = NumberFormat2(vCur2.GetString("sconto"), 1, 0, 0, False)
	pFido.Text = NumberFormat2(vCur2.GetString("fido"), 1, 2, 2, False)
	pPrep.Text = NumberFormat2(vCur2.GetString("prep"), 1, 2, 2, False)
	pListino.SelectedIndex = vCur2.GetInt("listino")
	pGruppoCli.SelectedIndex = vCur2.GetInt("grpcli")
	pZona.SelectedIndex = vCur2.GetInt("zona")
	pMacro.SelectedIndex = vCur2.GetInt("macroc") + 1
	vBln7 = False
	pMaster.Tag = ""
	pMaster.Enabled = Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where CodMaster ='" & vCur2.GetString("codice") & "'") = 0
	pMemo.Tag = ""
	pStampaRiep.SelectedIndex = vCur2.GetInt("stampariep")
	pResiduoConvenzione.SelectedIndex = vCur2.GetInt("residuoconvenzione")
	pEIva.SelectedIndex = vCur2.GetInt("eiva")
	pPunti.Text = NumberFormat2(vCur2.GetString("punti"), 1, 0, 0, False)
	pStampaRiep.Visible = vCur2.GetInt("abpost") = 1
	pResiduoConvenzione.Visible = vCur2.GetInt("abpost") = 1
	cPost.Checked = vCur2.GetInt("abpost") = 1
	cPrep.Checked = vCur2.GetInt("abprep") = 1
	cPassaggio.Checked = vCur2.GetInt("passaggio") = 1
	cPunti.Checked = vCur2.GetInt("abpunti") = 1
	pCodice.Enabled = False
	Sub018(True)
	Sub019()
	Dim checkBoxWrapper As CheckBox = cPassaggio
	If cPost.Checked Then
		If Not(Main.vBln25) Then
			z = True
			checkBoxWrapper.Visible = z
			Dim editTextWrapper As EditText = pPrep
			If cPrep.Checked Then
				If Not(Main.vBln25) Then
					z2 = True
					editTextWrapper.Enabled = z2
					Dim editTextWrapper2 As EditText = pFido
					If Not(cPrep.Checked) Or cPost.Checked Then
						If Not(Main.vBln25) Then
							z3 = True
							editTextWrapper2.Enabled = z3
							Dim editTextWrapper3 As EditText = pPunti
							If cPunti.Checked Then
								If Not(Main.vBln25) Then
									z4 = True
									editTextWrapper3.Enabled = z4
									pSco.Hint = NumberFormat2(vCur2.GetString("sconto"), 1, 0, 0, False)
									pFido.Hint = NumberFormat2(vCur2.GetString("fido"), 1, 2, 2, False)
									pPrep.Hint = NumberFormat2(vCur2.GetString("prep"), 1, 2, 2, False)
									pPunti.Hint = NumberFormat2(vCur2.GetString("punti"), 1, 0, 0, False)
									lblPluTitle.Text = "Modifica Cliente " & pCodice.Text
									Dim buttonWrapper2 As Button = pGetSaldi
									If Main.v_attivaterminale Then
										If Not(Main.v_solovenduto) Then
											If Main.v_centralizza And (vCur2.GetInt("abprep") = 1 Or vCur2.GetInt("abpunti") = 1) Then
												z5 = True
												buttonWrapper2.Visible = z5
												If pMaster.Enabled And vCur2.GetString("CodMaster") <> "" Then
													If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice='" & vCur2.GetString("CodMaster") & "'") > 0 Then
														lblPluTitle.Text = "Modifica Cliente " & pCodice.Text & " -- Cliente Master:" & Main.vSql1.ExecQuerySingleResult("Select descrizione from clienti where codice='" & vCur2.GetString("CodMaster") & "'")
														pMaster.Tag = vCur2.GetString("CodMaster")
														vBln7 = (vCur2.GetInt("tesseraaggiuntiva") = 1)
														Sub009(True)
													End If
												End If
												pDes.RequestFocus
												Return True
											End If
										End If
									End If
									z5 = False
									buttonWrapper2.Visible = z5
									If pMaster.Enabled Then
										If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice='" & vCur2.GetString("CodMaster") & "'") > 0 Then
										End If
									End If
									pDes.RequestFocus
									Return True
								End If
							End If
							z4 = False
							editTextWrapper3.Enabled = z4
							pSco.Hint = NumberFormat2(vCur2.GetString("sconto"), 1, 0, 0, False)
							pFido.Hint = NumberFormat2(vCur2.GetString("fido"), 1, 2, 2, False)
							pPrep.Hint = NumberFormat2(vCur2.GetString("prep"), 1, 2, 2, False)
							pPunti.Hint = NumberFormat2(vCur2.GetString("punti"), 1, 0, 0, False)
							lblPluTitle.Text = "Modifica Cliente " & pCodice.Text
							If Main.v_attivaterminale Then
							End If
							z5 = False
							pGetSaldi.Visible = z5
							If pMaster.Enabled Then
							End If
							pDes.RequestFocus
							Return True
						End If
					End If
					z3 = False
					editTextWrapper2.Enabled = z3
					If cPunti.Checked Then
					End If
					z4 = False
					pPunti.Enabled = z4
					pSco.Hint = NumberFormat2(vCur2.GetString("sconto"), 1, 0, 0, False)
					pFido.Hint = NumberFormat2(vCur2.GetString("fido"), 1, 2, 2, False)
					pPrep.Hint = NumberFormat2(vCur2.GetString("prep"), 1, 2, 2, False)
					pPunti.Hint = NumberFormat2(vCur2.GetString("punti"), 1, 0, 0, False)
					lblPluTitle.Text = "Modifica Cliente " & pCodice.Text
					If Main.v_attivaterminale Then
					End If
					z5 = False
					pGetSaldi.Visible = z5
					If pMaster.Enabled Then
					End If
					pDes.RequestFocus
					Return True
				End If
			End If
			z2 = False
			editTextWrapper.Enabled = z2
			If Not(cPrep.Checked) Then
			End If
			If Not(Main.vBln25) Then
			End If
			z3 = False
			pFido.Enabled = z3
			If cPunti.Checked Then
			End If
			z4 = False
			pPunti.Enabled = z4
			pSco.Hint = NumberFormat2(vCur2.GetString("sconto"), 1, 0, 0, False)
			pFido.Hint = NumberFormat2(vCur2.GetString("fido"), 1, 2, 2, False)
			pPrep.Hint = NumberFormat2(vCur2.GetString("prep"), 1, 2, 2, False)
			pPunti.Hint = NumberFormat2(vCur2.GetString("punti"), 1, 0, 0, False)
			lblPluTitle.Text = "Modifica Cliente " & pCodice.Text
			If Main.v_attivaterminale Then
			End If
			z5 = False
			pGetSaldi.Visible = z5
			If pMaster.Enabled Then
			End If
			pDes.RequestFocus
			Return True
		End If
	End If
	z = False
	checkBoxWrapper.Visible = z
	If cPrep.Checked Then
	End If
	z2 = False
	pPrep.Enabled = z2
	If Not(cPrep.Checked) Then
	End If
	If Not(Main.vBln25) Then
	End If
	z3 = False
	pFido.Enabled = z3
	If cPunti.Checked Then
	End If
	z4 = False
	pPunti.Enabled = z4
	pSco.Hint = NumberFormat2(vCur2.GetString("sconto"), 1, 0, 0, False)
	pFido.Hint = NumberFormat2(vCur2.GetString("fido"), 1, 2, 2, False)
	pPrep.Hint = NumberFormat2(vCur2.GetString("prep"), 1, 2, 2, False)
	pPunti.Hint = NumberFormat2(vCur2.GetString("punti"), 1, 0, 0, False)
	lblPluTitle.Text = "Modifica Cliente " & pCodice.Text
	If Main.v_attivaterminale Then
	End If
	z5 = False
	pGetSaldi.Visible = z5
	If pMaster.Enabled Then
	End If
	pDes.RequestFocus
	Return True
End Sub

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub Nazione_Click
	Dim i As Int = 0
	Dim list As List
	list.Initialize
	Dim size As Int = vLst6.Size - 1
	Dim i2 As Int = 0
	Do While i <= size
		Dim tnazioneVar As tnazione = vLst6.Get(i)
		list.Add(tnazioneVar.descrizione)
		Dim i3 As Int = IIf(tnazioneVar.id = Nazione.Tag, i, i2)
		i = i + 1
		i2 = i3
	Loop
	Dim vInputList As Int = InputList(list, "Selezionare una nazione", i2)
	If vInputList < 0 Then
		Return
	End If
	Dim tnazioneVar2 As tnazione = vLst6.Get(vInputList)
	Nazione.Tag = tnazioneVar2.id
	Nazione.Text = "Nazione:" & tnazioneVar2.descrizione
End Sub

Sub Sub013(str As String, str2 As String, str3 As String, str4 As String, str5 As String, str6 As String, str7 As String, str8 As String, str9 As String)
	If Not(bNew.Enabled) And str9 = "" Then
		Dim vObjectToCharSequence As Object = "Non Consentito."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	If vBln3 Then
		str9 = "-1"
	Else If str9 = "" Then
		str9 = Sub008(Main.d_clienti, IIf(str = "" And str7 = "", False, True))
	End If
	If str9 = "" Then
		mod1.Sub081
		Return
	End If
	vBln2 = False
	vInt1 = m_nuovo
	pCodice.Text = str9
	lblPluTitle.Text = "Inserimento Cliente " & str9
	pCodice.Enabled = False
	vInt11 = 2
	pDes.Text = modfunstr.left(str, 50)
	pCitta.Text = modfunstr.left(str2, 50)
	pProvincia.Text = str3
	pIva.Text = str4
	pCF.Text = str7
	pTel.Text = ""
	PMail.Text = ""
	If str8 = "IT" Or str8 = "" Then
		Nazione.Tag = "IT"
		Nazione.Text = "Nazione:Italia"
	Else
		Dim size As Int = vLst6.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim tnazioneVar As tnazione = vLst6.Get(i)
			If tnazioneVar.id = str8 Then
				Nazione.Tag = str8
				Nazione.Text = "Nazione:" & tnazioneVar.descrizione
			End If
		Next
	End If
	Sub017("01/01/1900")
	pdocPredefinito.SelectedIndex = 0
	TipoSoggetto.SelectedIndex = 2
	edtNomeCli.Text = ""
	edtCognomeCli.Text = ""
	edtCodDestCli.Text = "0000000"
	edtCodDestCli.Enabled = True
	edtPECCli.Text = ""
	pEIva2.SelectedIndex = 0
	pFax.Text = ""
	pVia.Text = modfunstr.left(str5, 50)
	pCap.Text = str6
	pCodLotteria.Text = ""
	pPwdWeb.Text = ""
	cContrassegno.Checked = False
	pSco.Text = "0"
	pFido.Text = "0"
	pPrep.Text = "0"
	pPunti.Text = "0"
	pListino.SelectedIndex = 0
	pResiduoConvenzione.SelectedIndex = 1
	pResiduoConvenzione.Visible = False
	pZona.SelectedIndex = 0
	pMacro.SelectedIndex = 0
	vBln7 = False
	pMaster.Tag = ""
	pMemo.Tag = ""
	pStampaRiep.SelectedIndex = 0
	pStampaRiep.Visible = False
	pEIva.SelectedIndex = 0
	cPost.Checked = False
	cPrep.Checked = False
	cPassaggio.Checked = False
	cPassaggio.Visible = False
	cPunti.Checked = False
	Sub018(True)
	If str9 = "-1" Then
		DatiAggiuntivi.Enabled = False
	End If
	Sub019()
	pPrep.Enabled = False
	pFido.Enabled = False
	pPunti.Enabled = False
End Sub

Sub okinvioclientealserver
	Dim vObjectToCharSequence As Object = "Il Cliente è stato aggiornato sul server."
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
End Sub

Sub PanelWv_Click
End Sub

Sub pAnnulla_Click
	If Not(Main.v_riducimsg) Then
		Dim vObjectToCharSequence As Object = "Attenzione ... eventuali modifiche verranno annullate ..." & CRLF & "Si desidera proseguire ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			Return
		End If
	End If
	Sub018(False)
	Sub019()
	Sub009(False)
	vInt11 = 0
	If Main.vStr20 = "" Then
		If Not(Main.vMap9.IsInitialized) Then
			If Main.vStr9 <> "" Then
				Main.vStr9 = ""
				bchiudi_click()
			End If
			mod1.Sub081
			Return
		End If
	End If
	Main.vStr20 = ""
	Main.vMap9 = Null
	vBln1 = True
	Main.vBln32 = False
	vIME2.HideKeyboard
	Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedClienti")
	mod1.Sub198("Main")
	Activity.Finish
	mod1.Sub081
End Sub

Sub pButtonsForm_Click
End Sub

Sub pCap_EnterPressed
	Dim editTextWrapper As EditText = Sender
	Dim vTmp As Int = modfunstr.Sub006(editTextWrapper.Tag)
	editTextWrapper.Text = modfunstr.left(editTextWrapper.Text.Replace(",", "").Replace("'", "").Trim, vTmp)
End Sub

Sub pCap_FocusChanged(z As Boolean)
	Dim editTextWrapper As EditText = Sender
	Dim vTmp As Int = modfunstr.Sub006(editTextWrapper.Tag)
	If z Then
		vIME1.Initialize("IME")
		vIME1.SetCustomFilter(editTextWrapper, 2, "0123456789/-+.")
		editTextWrapper.SelectAll
		editTextWrapper.SelectionStart = editTextWrapper.Text.Length
		Return
	End If
	editTextWrapper.Text = modfunstr.left(editTextWrapper.Text.Replace(",", "").Replace("'", "").Trim, vTmp)
End Sub

Sub pCap_TextChanged(str As String, str2 As String)
	Dim editTextWrapper As EditText = Sender
	If str2.Length > modfunstr.Sub006(editTextWrapper.Tag) Then
		editTextWrapper.Text = str
		editTextWrapper.SelectionStart = str.Length
		Return
	End If
End Sub

Sub pChiudiWv_Click
	PanelWv.Visible = False
End Sub

Sub pCitta_EnterPressed
	Dim editTextWrapper As EditText = Sender
	Dim vTmp As Int = modfunstr.Sub006(editTextWrapper.Tag)
	editTextWrapper.Text = modfunstr.left(editTextWrapper.Text.Replace(",", "").Replace("'", "`").Trim, vTmp)
End Sub

Sub pCitta_FocusChanged(z As Boolean)
	Dim editTextWrapper As EditText = Sender
	Dim vTmp As Int = modfunstr.Sub006(editTextWrapper.Tag)
	If z Then
		vIME1.Initialize("IME")
		editTextWrapper.SelectionStart = editTextWrapper.Text.Length
		Return
	End If
	editTextWrapper.Text = modfunstr.left(editTextWrapper.Text.Replace(",", "").Replace("'", "`").Trim, vTmp)
End Sub

Sub pCitta_TextChanged(str As String, str2 As String)
	Dim editTextWrapper As EditText = Sender
	If str2.Length > modfunstr.Sub006(editTextWrapper.Tag) Then
		editTextWrapper.Text = str
		editTextWrapper.SelectionStart = str.Length
		Return
	End If
End Sub

Sub pCodLotteria_EnterPressed
	Dim editTextWrapper As EditText = Sender
	Dim vTmp As Int = modfunstr.Sub006(editTextWrapper.Tag)
	If Not(Regex.IsMatch("^[A-Za-z0-9]{" & vTmp & "}$", editTextWrapper.Text.Trim)) Then
		editTextWrapper.Text = ""
		Return
	End If
End Sub

Sub pCodLotteria_FocusChanged(z As Boolean)
	Dim editTextWrapper As EditText = Sender
	Dim vTmp As Int = modfunstr.Sub006(editTextWrapper.Tag)
	If z Then
		vIME1.Initialize("IME")
		editTextWrapper.SelectionStart = editTextWrapper.Text.Length
		Return
	End If
	If Not(Regex.IsMatch("^[A-Za-z0-9]{" & vTmp & "}$", editTextWrapper.Text.Trim)) Then
		editTextWrapper.Text = ""
		Return
	End If
End Sub

Sub pCodLotteria_TextChanged(str As String, str2 As String)
	Dim editTextWrapper As EditText = Sender
	If str2.Length > modfunstr.Sub006(editTextWrapper.Tag) Then
		editTextWrapper.Text = str
		editTextWrapper.SelectionStart = str.Length
		Return
	End If
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub pConferma_Click
	Dim maphelper As Map
	Dim map1 As Map
	Dim jsongenerator As JSONGenerator
	Dim residcliente As String
	Dim listofmaps As List
	Dim m As Map
	Dim oldpunti As Int
	Dim oldprep As Double
	Dim listofmaps2 As List
	Dim m2 As Map
	Dim tmpdes As String
	Dim tmpmov As Int
	Dim mprep As Double
	Dim newprog As Long
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
					rsState = 130
					rsCatchState = 129
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 129
					Continue
				Case 4
					rsState = 9
					If Sub021() Then
						Continue
					Else
						rsState = 6
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 6
				Case 6
					rsState = 9
					Return
				Case 9
					rsState = 10
					Continue
				Case 10
					rsState = 123
					If pDes.Text = "" Then
						rsState = 12
						Continue
					Else
						rsState = 14
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 12
				Case 12
					rsState = 123
					ToastMessageShow("Inserire una descrizione per il Cliente", True)
					Continue
				Case 14
					rsState = 15
					Continue
				Case 15
					rsState = 42
					If Not(vBln3) Then
						Continue
					Else
						If pCodice.Text <> "-1" Then
							Continue
						Else
							If vInt11 <> 2 Then
								Continue
							Else
								rsState = 17
								Continue
							End If
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 17
				Case 17
					rsState = 18
					Continue
				Case 18
					rsState = 21
					If pVia.Text <> "" Then
						Continue
					Else
						rsState = 20
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 20
				Case 20
					rsState = 21
					Dim vObjectToCharSequence As Object = "Inserire un indirizzo"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					Return
				Case 21
					rsState = 24
					If pCap.Text <> "" Then
						Continue
					Else
						rsState = 23
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 23
				Case 23
					rsState = 24
					Dim vObjectToCharSequence3 As Object = "Inserire il CAP"
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
					Return
				Case 24
					rsState = 27
					If pCitta.Text <> "" Then
						Continue
					Else
						rsState = 26
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 26
				Case 26
					rsState = 27
					Dim vObjectToCharSequence5 As Object = "Inserire la città"
					Dim vObjectToCharSequence6 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
					Return
				Case 27
					rsState = 30
					If pProvincia.Text <> "" Then
						Continue
					Else
						rsState = 29
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 29
				Case 29
					rsState = 30
					Dim vObjectToCharSequence7 As Object = "Inserire la provincia"
					Dim vObjectToCharSequence8 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
					Return
				Case 30
					rsState = 33
					If pIva.Text <> "" Then
						Continue
					Else
						rsState = 32
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 32
				Case 32
					rsState = 33
					Dim vObjectToCharSequence9 As Object = "Inserire la partita iva"
					Dim vObjectToCharSequence10 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
					Return
				Case 33
					rsState = 34
					'maphelper = Map
					maphelper.Initialize
					Dim map As Map = maphelper
					map.Put("name", pDes.Text)
					Dim map2 As Map = maphelper
					map2.Put("address", pVia.Text)
					Dim map3 As Map = maphelper
					map3.Put("zipcode", pCap.Text)
					Dim map4 As Map = maphelper
					map4.Put("city", pCitta.Text)
					Dim map5 As Map = maphelper
					map5.Put("province", pProvincia.Text)
					Dim map6 As Map = maphelper
					map6.Put("vatcode", pIva.Text)
					'map1 = Map
					map1.Initialize
					'jsongenerator = JSONGenerator
					jsongenerator.Initialize(maphelper)
					CallSub3(ftpmanager, "SendObjBO", jsongenerator.ToString, "InsertCliente")
					Wait For (Null) Resinscliente (wf131_0 As String)
					rsState = 131
					Continue
				Case 34
					rsState = 41
					If residcliente = "" Then
						rsState = 36
						Continue
					Else If residcliente.StartsWith("ID=") Then
						rsState = 38
						Continue
					Else
						rsState = 40
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 36
				Case 36
					rsState = 41
					Dim vObjectToCharSequence11 As Object = "Si sono verificati dei problemi nella ricezione dati dal server"
					Dim vObjectToCharSequence12 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
					Return
				Case 38
					rsState = 41
					DatiAggiuntivi.Enabled = True
					pCodice.Text = residcliente.Replace("ID=", "")
					Dim vObjectToCharSequence13 As Object = "E' stato creato il cliente " & SmartStringFormatter("", pCodice.Text) & " sul server." & SmartStringFormatter("", CRLF) & "Adesso è possibile aggiungere altri dati al cliente e confermare le modifiche."
					Dim vObjectToCharSequence14 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
					Return
				Case 40
					rsState = 41
					Dim vObjectToCharSequence15 As Object = residcliente
					Dim vObjectToCharSequence16 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence15, vObjectToCharSequence16, "OK", "", "", Main.vBmp1)
					Return
				Case 41
					rsState = 42
					Continue
				Case 42
					rsState = 43
					'listofmaps = List
					listofmaps.Initialize
					'm = Map
					oldpunti = 0
					oldprep = 0
					Continue
				Case 43
					rsState = 46
					If Not(Main.vSql1.ExecQuerySingleResult("select punti from clienti where codice= '" & pCodice.Text & "'") <> Null) Then
						Continue
					Else
						rsState = 45
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 45
				Case 45
					rsState = 46
					oldpunti = modfunstr.Sub006(Main.vSql1.ExecQuerySingleResult("select punti from clienti where codice= '" & pCodice.Text & "'"))
					Continue
				Case 46
					rsState = 49
					If Not(Main.vSql1.ExecQuerySingleResult("select prep from clienti where codice= '" & pCodice.Text & "'") <> Null) Then
						Continue
					Else
						rsState = 48
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 48
				Case 48
					rsState = 49
					oldprep = Main.vSql1.ExecQuerySingleResult("select prep from clienti where codice= '" & pCodice.Text & "'")
					Continue
				Case 49
					rsState = 50
					Main.vSql1.ExecNonQuery("delete from clienti where codice = '" & pCodice.Text & "'")
					Main.vSql1.ExecNonQuery("delete from FEdatiCli where codice = '" & pCodice.Text & "'")
					vIME1.HideKeyboard
					'listofmaps2 = List
					listofmaps2.Initialize
					'm2 = Map
					m2.Initialize
					Dim map7 As Map = m2
					map7.Put("codice", pCodice.Text)
					Dim map8 As Map = m2
					map8.Put("TipoSoggettoCli", TipoSoggetto.SelectedIndex)
					Dim map9 As Map = m2
					map9.Put("NazioneCli", Nazione.Tag)
					Dim map10 As Map = m2
					map10.Put("NomeCli", edtNomeCli.Text)
					Dim map11 As Map = m2
					map11.Put("CognomeCli", edtCognomeCli.Text)
					Dim map12 As Map = m2
					map12.Put("CodiceDestinatario", edtCodDestCli.Text)
					Dim map13 As Map = m2
					map13.Put("PEC", edtPECCli.Text)
					Dim map14 As Map = m2
					map14.Put("EsigibilitaIVA", pEIva2.SelectedIndex)
					listofmaps2.Add(m2)
					dbutil.Sub007(Main.vSql1, "FEdatiCli", listofmaps2)
					tmpdes = mod1.Sub209(pDes.Text)
					m.Initialize
					Dim map15 As Map = m
					map15.Put("codice", pCodice.Text)
					m.Put("descrizione", tmpdes)
					Dim map16 As Map = m
					map16.Put("citta", Sub024(pCitta.Text))
					Dim map17 As Map = m
					map17.Put("provincia", pProvincia.Text)
					Continue
				Case 50
					rsState = 55
					If mod1.Sub134(pIva.Text.Trim, True) Then
						rsState = 52
						Continue
					Else
						rsState = 54
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 52
				Case 52
					rsState = 55
					Dim map18 As Map = m
					map18.Put("piva", pIva.Text)
					Continue
				Case 54
					rsState = 55
					m.Put("piva", "")
					Continue
				Case 55
					rsState = 60
					If mod1.Sub134(pCF.Text.Trim, True) Then
						rsState = 57
						Continue
					Else
						rsState = 59
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 57
				Case 57
					rsState = 60
					Dim map19 As Map = m
					map19.Put("codf", pCF.Text)
					Continue
				Case 59
					rsState = 60
					m.Put("codf", "")
					Continue
				Case 60
					rsState = 61
					Dim map20 As Map = m
					map20.Put("telefono", pTel.Text)
					Dim map21 As Map = m
					map21.Put("mail", PMail.Text)
					Dim map22 As Map = m
					map22.Put("fax", pFax.Text)
					Dim map23 As Map = m
					map23.Put("via", Sub024(pVia.Text))
					Dim map24 As Map = m
					map24.Put("cap", pCap.Text)
					Dim map25 As Map = m
					map25.Put("PwdWeb", pPwdWeb.Text)
					Dim map26 As Map = m
					map26.Put("contrassegno", cContrassegno.Checked)
					Continue
				Case 61
					rsState = 70
					If pMemo.Tag <> "" Then
						rsState = 63
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 63
				Case 63
					rsState = 64
					Continue
				Case 64
					rsState = 69
					If pMemo.Tag = "_D_" Then
						rsState = 66
						Continue
					Else
						rsState = 68
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 66
				Case 66
					rsState = 69
					Main.vSql1.ExecNonQuery("delete from TestiCli where codice='" & pCodice.Text & "'")
					Continue
				Case 68
					rsState = 69
					Main.vSql1.ExecNonQuery("delete from TestiCli where codice='" & pCodice.Text & "'")
					Main.vSql1.ExecNonQuery("insert into TestiCli(codice,testo) values('" & pCodice.Text & "','" & pMemo.Tag & "')")
					Continue
				Case 69
					rsState = 70
					Continue
				Case 70
					rsState = 71
					Dim map27 As Map = m
					If pSco.Text = "" Then
						text2 = "0"
					Else
						text2 = pSco.Text
					End If
					map27.Put("sconto", text2)
					Dim map28 As Map = m
					If pPrep.Text = "" Then
						vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = "0"
					Else
						vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2 = Sub023(pPrep.Text)
					End If
					map28.Put("prep", vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2)
					Dim map29 As Map = m
					map29.Put("listino", pListino.SelectedIndex)
					Dim map30 As Map = m
					map30.Put("docPredefinito", pdocPredefinito.SelectedIndex)
					Dim map31 As Map = m
					map31.Put("dcompleanno", bCompleanno.Tag)
					Dim map32 As Map = m
					map32.Put("grpcli", pGruppoCli.SelectedIndex)
					Dim map33 As Map = m
					map33.Put("zona", pZona.SelectedIndex)
					Dim map34 As Map = m
					map34.Put("macroc", pMacro.SelectedIndex - 1)
					Dim map35 As Map = m
					map35.Put("CodMaster", pMaster.Tag)
					Dim map36 As Map = m
					map36.Put("tesseraaggiuntiva", vBln7)
					Dim map37 As Map = m
					map37.Put("stampariep", pStampaRiep.SelectedIndex)
					Dim map38 As Map = m
					map38.Put("residuoconvenzione", pResiduoConvenzione.SelectedIndex)
					Dim map39 As Map = m
					map39.Put("eiva", pEIva.SelectedIndex)
					Dim map40 As Map = m
					If pPunti.Text = "" Then
						text3 = "0"
					Else
						text3 = pPunti.Text
					End If
					map40.Put("punti", text3)
					Dim map41 As Map = m
					If pFido.Text = "" Then
						vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv22 = "0"
					Else
						vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv22 = Sub023(pFido.Text)
					End If
					map41.Put("fido", vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv22)
					Dim map42 As Map = m
					map42.Put("abprep", cPrep.Checked)
					Dim map43 As Map = m
					map43.Put("passaggio", cPassaggio.Checked)
					Dim map44 As Map = m
					map44.Put("abpost", cPost.Checked)
					Dim map45 As Map = m
					map45.Put("abpunti", cPunti.Checked)
					Dim map46 As Map = m
					map46.Put("codLotteria", Sub022(pCodLotteria.Text.Trim))
					Continue
				Case 71
					rsState = 74
					If Main.v_sendclienti <> 0 Then
						Continue
					Else
						If Not(Main.v_attivaterminale) Then
							Continue
						Else
							If Main.v_solovenduto Then
								Continue
							Else
								If Not(Main.vBln20) Then
									Continue
								Else
									rsState = 73
									Continue
								End If
							End If
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 73
				Case 73
					rsState = 74
					m.Put("DaInviare", True)
					Continue
				Case 74
					rsState = 75
					listofmaps.Add(m)
					dbutil.Sub007(Main.vSql1, "clienti", listofmaps)
					Continue
				Case 75
					rsState = 84
					If vInt11 = 1 Then
						rsState = 77
						Continue
					Else
						If vInt11 <> 2 Then
							Continue
						Else
							rsState = 83
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 77
				Case 77
					rsState = 78
					Continue
				Case 78
					rsState = 81
					If Not(Main.vBln25) Then
						Continue
					Else
						If Main.vBln26 Then
							Continue
						Else
							rsState = 80
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 80
				Case 80
					rsState = 81
					Sub004(m, m2)
					Continue
				Case 81
					rsState = 84
					Main.vSql1.ExecNonQuery("update sortedClienti set Descrizione='" & SmartStringFormatter("", tmpdes) & "',Citta='" & SmartStringFormatter("", m.Get("citta")) & "'," & CRLF & TAB & TAB & TAB & TAB & "Via='" & SmartStringFormatter("", m.Get("via")) & "',PartitaIva='" & SmartStringFormatter("", m.Get("piva")) & "',CodiceFiscale='" & SmartStringFormatter("", m.Get("codf")) & "'" & CRLF & TAB & TAB & TAB & TAB & ",Provincia='" & SmartStringFormatter("", m.Get("provincia")) & "',CAP='" & SmartStringFormatter("", m.Get("cap")) & "',Telefono='" & SmartStringFormatter("", m.Get("telefono")) & "'" & CRLF & TAB & TAB & TAB & TAB & ",CodMaster='" & SmartStringFormatter("", m.Get("CodMaster")) & "',tesseraaggiuntiva=" & SmartStringFormatter("", IIf(m.Get("tesseraaggiuntiva"), "1", "0")) & " where Codice ='" & SmartStringFormatter("", pCodice.Text) & "'")
					Continue
				Case 83
					rsState = 84
					Main.vSql1.ExecNonQuery("Delete from sortedClienti")
					Main.vSql1.ExecNonQuery("insert into sortedClienti(Codice,Descrizione,Citta,Via,PartitaIva,CodiceFiscale,Provincia,CAP,Telefono,CodMaster,tesseraaggiuntiva)" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "values('" & SmartStringFormatter("", pCodice.Text) & "','" & SmartStringFormatter("", tmpdes) & "','" & SmartStringFormatter("", m.Get("citta")) & "','" & SmartStringFormatter("", m.Get("via")) & "','" & SmartStringFormatter("", m.Get("piva")) & "','" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & SmartStringFormatter("", m.Get("codf")) & "','" & SmartStringFormatter("", m.Get("provincia")) & "','" & SmartStringFormatter("", m.Get("cap")) & "','" & SmartStringFormatter("", m.Get("telefono")) & "','" & SmartStringFormatter("", m.Get("CodMaster")) & "'," & SmartStringFormatter("", IIf(m.Get("tesseraaggiuntiva"), "1", "0")) & ")")
					Continue
				Case 84
					rsState = 91
					If Not(cPunti.Checked) Then
						Continue
					Else
						If modfunstr.Sub006(pPunti.Text) <= 0 Then
							Continue
						Else
							rsState = 86
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 86
				Case 86
					rsState = 87
					Continue
				Case 87
					rsState = 90
					Dim d As Double = oldpunti
					If d = modfunstr.Sub006(pPunti.Text) Then
						Continue
					Else
						rsState = 89
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 89
				Case 89
					rsState = 90
					tmpmov = Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='V'")
					tmpmov = tmpmov + 1
					m.Initialize
					listofmaps.Initialize
					m.Put("nmov", tmpmov)
					m.Put("nfat", 0)
					Dim map47 As Map = m
					map47.Put("cliente", pCodice.Text)
					m.Put("flgNF", True)
					m.Put("totale", 0)
					m.Put("prep", 0)
					Dim map48 As Map = m
					map48.Put("punti", modfunstr.Sub006(pPunti.Text) - oldpunti)
					Dim map49 As Map = m
					map49.Put("datam", DateTime.Date(mod1.Sub058))
					Dim map50 As Map = m
					map50.Put("datam2", DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058))
					Dim map51 As Map = m
					map51.Put("datam3", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
					m.Put("memo", "Modifica Punti")
					listofmaps.Add(m)
					dbutil.Sub007(Main.vSql1, "headmov", listofmaps)
					Main.vSql1.ExecNonQuery("update  progressivi set valore = valore +1   where codice ='V'")
					Continue
				Case 90
					rsState = 91
					Continue
				Case 91
					rsState = 92
					If pPrep.Text = "" Then
						text = "0"
					Else
						text = pPrep.Text
					End If
					mprep = text
					Continue
				Case 92
					rsState = 99
					If cPrep.Checked And mprep > 0 Then
						rsState = 94
						Continue
					End If
					Continue
				Case 94
					rsState = 95
					Continue
				Case 95
					rsState = 98
					If oldprep = mprep Then
						Continue
					Else
						rsState = 97
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 97
				Case 97
					rsState = 98
					tmpmov = Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='V'")
					tmpmov = tmpmov + 1
					m.Initialize
					listofmaps.Initialize
					m.Put("nmov", tmpmov)
					m.Put("nfat", 0)
					Dim map52 As Map = m
					map52.Put("cliente", pCodice.Text)
					m.Put("flgNF", True)
					m.Put("totale", 0)
					m.Put("prep", Round2(mprep, 2))
					m.Put("punti", 0)
					Dim map53 As Map = m
					map53.Put("datam", DateTime.Date(mod1.Sub058))
					Dim map54 As Map = m
					map54.Put("datam2", DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058))
					Dim map55 As Map = m
					map55.Put("datam3", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
					m.Put("memo", "Modifica Prepagato")
					listofmaps.Add(m)
					dbutil.Sub007(Main.vSql1, "headmov", listofmaps)
					Main.vSql1.ExecNonQuery("update  progressivi set valore = valore +1  where codice ='V'")
					Continue
				Case 98
					rsState = 99
					Continue
				Case 99
					rsState = 100
					Sub009(False)
					Sub018(False)
					Sub019()
					Continue
				Case 100
					rsState = 112
					If vInt1 <> m_nuovo Then
						Continue
					Else
						rsState = 102
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 102
				Case 102
					rsState = 103
					newprog = 0
					Continue
				Case 103
					rsState = 108
					If pCodice.Text.Length > 6 Then
						rsState = 105
						Continue
					Else
						rsState = 107
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 105
				Case 105
					rsState = 108
					newprog = 999999998
					Continue
				Case 107
					rsState = 108
					newprog = modfunstr.Sub006(pCodice.Text)
					Continue
				Case 108
					rsState = 111
					If newprog <= 0 Then
						Continue
					Else
						rsState = 110
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 110
				Case 110
					rsState = 111
					newprog = newprog + 1
					Main.vSql1.ExecNonQuery("update progressivi set valore =" & newprog & " where codice ='C'")
					Continue
				Case 111
					rsState = 112
					Continue
				Case 112
					rsState = 113
					Edt1.Text = vStr1
					Continue
				Case 113
					rsState = 118
					If vInt11 = 1 Then
						rsState = 115
						Continue
					Else
						If vInt11 <> 2 Then
							Continue
						Else
							rsState = 117
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 115
				Case 115
					rsState = 118
					vInt6 = vInt4
					Edt1.Text = vStr2
					Continue
				Case 117
					rsState = 118
					pLista.Visible = True
					vInt6 = m_rcodice
					sRicerca.SelectedIndex = 1
					Sub002("Codice")
					Edt1.Text = pCodice.Text
					Continue
				Case 118
					rsState = 119
					imericerca_handleaction()
					Continue
				Case 119
					rsState = 122
					If Main.vStr20 = "" Then
						If Not(Main.vMap9.IsInitialized) Then
							Continue
						End If
					End If
					rsState = 121
					Continue
				Case 121
					rsState = 122
					Main.vStr20 = ""
					Main.vStr21 = ""
					Main.vMap9 = Null
					Main.vStr13 = pCodice.Text
					vBln1 = True
					Main.vBln32 = False
					vIME2.HideKeyboard
					Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedClienti")
					mod1.Sub198("Main")
					Activity.Finish
					Continue
				Case 122
					rsState = 123
					vInt11 = 0
					Continue
				Case 123
					rsState = 124
					mod1.Sub081
					Continue
				Case 124
					rsState = 127
					If Main.vStr9 <> "" Then
						rsState = 126
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 126
				Case 126
					rsState = 127
					Main.vStr13 = pCodice.Text
					vBln1 = True
					Main.vBln32 = False
					vIME2.HideKeyboard
					Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedClienti")
					Main.vStr9 = ""
					mod1.Sub198("Main")
					Activity.Finish
					Return
				Case 127
					rsState = 130
					Continue
				Case 129
					rsState = 130
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 130
					rsState = -1
					rsCatchState = 0
					Continue
				Case 131
					rsState = 34
					residcliente = wf131_0
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

Sub pFido_EnterPressed
	vIME1.HideKeyboard
	vBln4 = (pFido.Text = "0")
	pFido.Text = NumberFormat2(Sub023(pFido.Text), 1, 2, 2, False)
	pFido.Hint = pFido.Text
End Sub

Sub pFido_FocusChanged(z As Boolean)
	If z Then
		vStr3 = pFido.Text
		pFido.Text = ""
		vIME1.Initialize("IME")
		Dim editText As EditText = pFido
		Dim editTextWrapper As EditText = pFido
		vIME1.SetCustomFilter(editText, 12290, "0123456789.-")
		vIME1.ShowKeyboard(pFido)
	Else
		pFido.Text = NumberFormat2(Sub023(pFido.Text), 1, 2, 2, False)
		If Not(vBln4) And pFido.Text = "0.00" Then
			If vStr3 <> "" Then
				If vStr3 <> "0.00" Then
					pFido.Text = vStr3
				End If
			End If
		End If
		pFido.Hint = pFido.Text
	End If
	vBln4 = False
End Sub

Sub pFido_TextChanged(str As String, str2 As String)
	If str2.Length > 8 Then
		pFido.Text = str
		pFido.SelectionStart = str.Length
		Return
	End If
End Sub

Sub pGetSaldi_Click
	If cPunti.Checked And Not(vBln6) Then
		vStr8 = "cliente_getpunti_" & pCodice.Text
	Else If cPrep.Checked Then
		vStr8 = "cliente_getprep_" & pCodice.Text
	End If
	vBln6 = False
	vSocket1.Initialize("Client")
	Dim vTmp As Double = 8880 + modfunstr.Sub006(Main.v_nnegozio) * 100
	vSocket1.Connect(Main.v_ipserver, vTmp + modfunstr.Sub006(Main.v_numcassa), 10000)
	ProgressDialogShow2("Attendere Connessione in corso ...", False)
End Sub

Sub PHideCtrl_Click
End Sub

Sub pIva_EnterPressed
End Sub

Sub pIva_FocusChanged(z As Boolean)
	Dim editTextWrapper As EditText = Sender
	If z Then
		vIME1.Initialize("IME")
		editTextWrapper.SelectionStart = editTextWrapper.Text.Length
		Return
	End If
	If editTextWrapper.Text.Trim <> "" Then
		If Not(mod1.Sub134(editTextWrapper.Text.Trim, True)) Then
			Dim str As String = "Codice Fiscale non valido"
			If editTextWrapper.Tag = "15" Then
				str = "P.Iva non valida"
			End If
			Dim vObjectToCharSequence As Object = str
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Else If editTextWrapper.Text.Trim <> "" Then
			If editTextWrapper.Tag = "15" Then
				If Main.vSql1.ExecQuerySingleResult("select count(*) from clienti where piva ='" & editTextWrapper.Text.Trim & "' and codice <> '" & pCodice.Text & "'") > 0 Then
					Dim vObjectToCharSequence3 As Object = "La Partita iva " & editTextWrapper.Text.Trim & " risulta essere già inserita sul cliente " & Main.vSql1.ExecQuerySingleResult("select descrizione from clienti where piva ='" & editTextWrapper.Text.Trim & "' and codice <>'" & pCodice.Text & "' limit 1") & "." & CRLF
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				End If
			Else
				If Main.vSql1.ExecQuerySingleResult("select count(*) from clienti where codf ='" & editTextWrapper.Text.Trim & "' and codice <>'" & pCodice.Text & "'") > 0 Then
					Dim vObjectToCharSequence5 As Object = "Il Codice fiscale " & editTextWrapper.Text.Trim & " risulta essere già inserito sul cliente " & Main.vSql1.ExecQuerySingleResult("select descrizione from clienti where codf ='" & editTextWrapper.Text.Trim & "' and codice <>'" & pCodice.Text & "' limit 1") & "." & CRLF
					Dim vObjectToCharSequence6 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
				End If
			End If
		End If
		editTextWrapper.Text = modfunstr.left(editTextWrapper.Text, 20)
		editTextWrapper.SelectionStart = editTextWrapper.Text.Length
		Return
	End If
End Sub

Sub pIva_TextChanged(str As String, str2 As String)
	Dim editTextWrapper As EditText = Sender
	If str2.Length > 20 Then
		editTextWrapper.Text = str
		editTextWrapper.SelectionStart = str.Length
		Return
	End If
End Sub

Sub pMacro_ItemClick(i As Int, obj As Object)
	If i > 0 Then
		If Main.vSql1.ExecQuerySingleResult("SELECT count(*) FROM Macro where funzione =" & SmartStringFormatter("", Main.f_ricercacliente) & " and valore = '" & SmartStringFormatter("", pCodice.Text) & "'") > 0 Then
			Dim vObjectToCharSequence As Object = "Questo cliente è presente all'interno di una macro."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			pMacro.SelectedIndex = 0
			Return
		End If
		Return
	End If
End Sub

Sub PMail_EnterPressed
	Dim editTextWrapper As EditText = Sender
	editTextWrapper.Text = modfunstr.left(editTextWrapper.Text.Replace(",", "").Replace("'", "").Trim, IIf(editTextWrapper.Tag = "P", 200, 50))
	If editTextWrapper.Text <> "" Then
		If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", editTextWrapper.Text.ToLowerCase)) Then
			Dim vObjectToCharSequence As Object = "L'indirizzo email non è corretto"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			editTextWrapper.Text = ""
			CallSubDelayed(Me, "Hide_Keyboard")
			mod1.Sub081
			Return
		End If
	End If
End Sub

Sub PMail_FocusChanged(z As Boolean)
	Dim editTextWrapper As EditText = Sender
	If z Then
		vIME1.Initialize("IME")
		editTextWrapper.SelectionStart = editTextWrapper.Text.Length
	Else
		editTextWrapper.Text = modfunstr.left(editTextWrapper.Text.Replace(",", "").Replace("'", "").Trim, IIf(editTextWrapper.Tag = "P", 200, 50))
		If editTextWrapper.Text <> "" Then
			If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", editTextWrapper.Text.ToLowerCase)) Then
				Dim vObjectToCharSequence As Object = "L'indirizzo email non è corretto"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				editTextWrapper.Text = ""
				CallSubDelayed(Me, "Hide_Keyboard")
				mod1.Sub081
				Return
			End If
		End If
	End If
End Sub

Sub PMail_TextChanged(str As String, str2 As String)
	Dim editTextWrapper As EditText = Sender
	If str2.Length > IIf(editTextWrapper.Tag = "P", 200, 50) Then
		editTextWrapper.Text = str
		editTextWrapper.SelectionStart = str.Length
		Return
	End If
End Sub

Sub pMaps_Click
	Dim str As String = ""
	Dim str2 As String = ""
	If pCitta.Text = "" Or pVia.Text = "" Then
		Dim vObjectToCharSequence As Object = "E' necessario inserire la via e la citta del cliente per poter valutare la distanza da qui."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	End If
	Dim replace As String = pVia.Text.Replace(" ", "+").Replace("-", " ")
	Dim replace2 As String = pCitta.Text.Replace("-", " ")
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
	If cursorWrapper2.RowCount > 0 Then
		Dim i As Int = 0
		Do While True
			If i > 5 Then
				Exit
			End If
			cursorWrapper2.Position = i
			If i = 1 Then
				str = cursorWrapper2.GetString("descrizione")
			End If
			If i <> 2 Then
				i = i + 1
			Else
				str2 = cursorWrapper2.GetString("descrizione")
				Exit
			End If
		Loop
	End If
	Dim replace3 As String = str.Replace(" ", "+").Replace("-", " ")
	Dim replace4 As String = str2.Replace("-", " ")
	If replace4 = "" Or replace3 = "" Then
		Dim vObjectToCharSequence3 As Object = "E' necessario inserire la seconda(via) e terza(città) riga dell'intestazione del " & Main.vStr1 & " come punto di origine per la valutazione delle distanze."
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		Return
	End If
	WebView1.LoadUrl("https://www.google.it/maps/dir/" & SmartStringFormatter("", replace3) & ",+" & SmartStringFormatter("", replace4) & "/" & SmartStringFormatter("", replace) & ",+" & SmartStringFormatter("", replace2) & "")
	PanelWv.Visible = True
	PanelWv.BringToFront
	cursorWrapper2.Close
End Sub

Sub pMaster_Click
	Dim vMsgbox2 As Int
	If pMaster.Tag <> "" Then
		Dim vObjectToCharSequence As Object = "Confermi la disattivazione del cliente " & pDes.Text & " come " & IIf(vBln7, "tessera aggiuntiva ?", "cliente collegato ?")
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		vMsgbox2 = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Ok", "Annulla", "", Main.vBmp1)
	Else
		Dim vObjectToCharSequence3 As Object = "Attivazione del cliente " & pDes.Text & " come :"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		vMsgbox2 = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Cliente collegato", "Annulla", "Tessera aggiuntiva", Main.vBmp1)
	End If
	If vMsgbox2 <> -3 Then
		vBln7 = False
		If pMaster.Tag <> "" Then
			If vMsgbox2 = -1 Then
				pMaster.Tag = ""
				Sub009(False)
			End If
		End If
		If pMaster.Tag = "" Then
			Dim inputDialog2 As InputDialog = vDlg1
			vDlg1.InputType = 1
			vDlg1.Input = ""
			vDlg1.PasswordMode = False
			vDlg1.Hint = "Descrizione cliente (almeno 3 caratteri)"
			vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
			Dim vShow As Int = vDlg1.Show("Inserire la descrizione del cliente (almeno 3 caratteri) ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			If vShow = -1 And vDlg1.Input.Length > 2 Then
				Dim str2 As String = " abpost=1 and "
				If vMsgbox2 = -2 Then
					str2 = ""
				End If
				Dim cursorWrapper As Cursor
				Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select codice,descrizione,piva,codf from clienti where " & str2 & " codice <>'" & pCodice.Text & "' and  CodMaster ='' and descrizione like '%" & vDlg1.Input & "%'")
				If cursorWrapper2.RowCount > 0 Then
					Dim list As List
					list.Initialize
					Dim rowCount As Int = cursorWrapper2.RowCount - 1
					Dim i As Int
					For i = 0 To rowCount
						cursorWrapper2.Position = i
						list.Add(cursorWrapper2.GetString("descrizione"))
					Next
					Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare il cliente master")
					If vInputList1 >= 0 Then
						cursorWrapper2.Position = vInputList1
						lblPluTitle.Text = "Modifica Cliente " & pCodice.Text & " -- Cliente Master:" & cursorWrapper2.GetString("descrizione")
						pMaster.Tag = cursorWrapper2.GetString("codice")
						If vMsgbox2 = -1 Then
							pIva.Text = cursorWrapper2.GetString("piva")
							pCF.Text = cursorWrapper2.GetString("codf")
							cPost.Checked = True
						End If
						vBln7 = (vMsgbox2 = -2)
						Sub009(True)
					End If
				Else
					Dim str3 As String = "Non è stato trovato nessun cliente con il postpagato attivo e con descrizione che contiene"
					If vMsgbox2 = -2 Then
						str3 = "Non è stato trovato nessun cliente con descrizione che contiene"
					End If
					Dim vObjectToCharSequence5 As Object = str3 & " '" & vDlg1.Input & "'."
					Dim vObjectToCharSequence6 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
				End If
			End If
		End If
	End If
	mod1.Sub081
End Sub

Sub pMemo_Click
	Dim modalmlineVar As modalmline
	modalmlineVar.Initialize("Clienti", 28, Activity)
	Dim vRGB As Int = Colors.RGB(150, 150, 150)
	Dim vRGB2 As Int = Colors.RGB(150, 150, 150)
	modalmlineVar.Sub004(vRGB, vRGB2, -256)
	Dim str As String = ""
	If Main.vSql1.ExecQuerySingleResult("select count(*) from TestiCli where codice='" & pCodice.Text & "'") > 0 Then
		str = Main.vSql1.ExecQuerySingleResult("select testo from TestiCli where codice='" & pCodice.Text & "'")
	End If
	If pMemo.Tag <> "_D_" And pMemo.Tag <> "" Then
		str = pMemo.Tag
	End If
	Dim vTmp As String = modalmlineVar.Sub002("Testo aggiuntivo Cliente", "Aggiungi un testo", "", str)
	If vTmp <> -3 Then
		pMemo.Tag = vTmp
		Return
	End If
	pMemo.Tag = "_D_"
End Sub

Sub pMenu_Click
End Sub

Sub pnlDatiClienti_Click
End Sub

Sub pnlMovimenti_Click
End Sub

Sub pnlWv_Click
End Sub

Sub populatespinner(spinnerWrapper As Spinner)
	mod1.vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	Try
		spinnerWrapper.Clear
		Dim cursorWrapper As Cursor
		vCur1 = Main.vSql1.ExecQuery("SELECT * FROM iva where descrizione <> 'Da inserire' order by codice")
		spinnerWrapper.Add("Nessuna Agevolazione")
		Dim rowCount As Int = vCur1.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			DoEvents
			vCur1.Position = i
			spinnerWrapper.Add(vCur1.GetString("descrizione"))
		Next
		spinnerWrapper.SelectedIndex = 0
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub014(spinnerWrapper As Spinner)
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
			spinnerWrapper.Add("Macro Attiva:" & cursorWrapper2.GetString("descrizione"))
		Next
		spinnerWrapper.SelectedIndex = 0
		cursorWrapper2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub015(spinnerWrapper As Spinner)
	mod1.vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	Try
		spinnerWrapper.Clear
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("SELECT descrizione,list1 FROM anagra where  lower(substr(codint,1,3))='zon' order by cast(substr(codint,4,2) as int)")
		spinnerWrapper.Add("Domicilio disabilitato(Nessuna Zona)")
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			DoEvents
			cursorWrapper2.Position = i
			spinnerWrapper.Add(cursorWrapper2.GetString("descrizione") & " (" & NumberFormat2(cursorWrapper2.GetDouble("list1"), 1, 2, 2, False) & " €)")
		Next
		spinnerWrapper.SelectedIndex = 0
		cursorWrapper2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub pPlu_Click
End Sub

Sub pPrep_EnterPressed
	vIME1.HideKeyboard
	pPrep.Text = NumberFormat2(Sub023(pPrep.Text), 1, 2, 2, False)
	pPrep.Hint = pPrep.Text
End Sub

Sub pPrep_FocusChanged(z As Boolean)
	If z Then
		vStr3 = pPrep.Text
		pPrep.Text = ""
		vIME1.Initialize("IME")
		Dim editText As EditText = pPrep
		Dim editTextWrapper As EditText = pPrep
		vIME1.SetCustomFilter(editText, 12290, "0123456789.")
		vIME1.ShowKeyboard(pPrep)
		Return
	End If
	pPrep.Text = NumberFormat2(Sub023(pPrep.Text), 1, 2, 2, False)
	If pPrep.Text = "0.00" Then
		If vStr3 <> "" Then
			If vStr3 <> "0.00" Then
				pPrep.Text = vStr3
			End If
		End If
	End If
	pPrep.Hint = pPrep.Text
End Sub

Sub pPrep_TextChanged(str As String, str2 As String)
	If str2.Length > 8 Then
		pPrep.Text = str
		pPrep.SelectionStart = str.Length
		Return
	End If
End Sub

Sub pPunti_EnterPressed
	vIME1.HideKeyboard
	If pPunti.Text.Length > 4 Then
		pPunti.Text = "0"
	Else
		pPunti.Text = NumberFormat2(modfunstr.Sub006(pPunti.Text), 1, 0, 0, False)
	End If
	pPunti.Hint = pPunti.Text
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/clienti.java, metodo _ppunti_focuschanged (riga 8477).
Sub pPunti_FocusChanged(z As Boolean)
	If z Then
		vStr3 = pPunti.Text
		pPunti.Text = ""
		vIME1.Initialize("IME")
		Dim editText As EditText = pPunti
		Dim editTextWrapper As EditText = pPunti
		vIME1.SetCustomFilter(editText, 2, "0123456789")
		vIME1.ShowKeyboard(pPunti)
		Return
	End If
	If pPunti.Text.Length > 4 Then
		pPunti.Text = "0"
	Else
		pPunti.Text = NumberFormat2(modfunstr.Sub006(pPunti.Text), 1, 0, 0, False)
	End If
	If IsNumber(pPunti.Text) Then
	End If
	If vStr3 <> "" Then
		If vStr3 <> "0" Then
			pPunti.Text = vStr3
		End If
	End If
	pPunti.Hint = pPunti.Text
End Sub

Sub pPunti_TextChanged(str As String, str2 As String)
	If str2.Length > 4 Then
		pPunti.Text = str
		pPunti.SelectionStart = str.Length
		Return
	End If
End Sub

Sub progressonly(z As Boolean, str As String)
	If z Then
		ProgressDialogShow2(str, False)
		DoEvents
		Return
	End If
	ProgressDialogHide
End Sub

Sub pSco_EnterPressed
	vIME1.HideKeyboard
	If pSco.Text.Length > 3 Then
		pSco.Text = "0"
	Else
		If modfunstr.Sub006(pSco.Text) <= 100 Then
			If modfunstr.Sub006(pSco.Text) >= 0 Then
				vBln4 = (pSco.Text = "0")
				pSco.Text = NumberFormat2(modfunstr.Sub006(pSco.Text), 1, 0, 0, False)
			End If
		End If
		pSco.Text = "0"
	End If
	pSco.Hint = pSco.Text
End Sub

Sub pSco_FocusChanged(z As Boolean)
	If z Then
		vStr3 = pSco.Text
		pSco.Text = ""
		vIME1.Initialize("IME")
		Dim editText As EditText = pSco
		Dim editTextWrapper As EditText = pSco
		vIME1.SetCustomFilter(editText, 2, "0123456789")
		vIME1.ShowKeyboard(pSco)
	Else
		If pSco.Text.Length > 3 Then
			pSco.Text = "0"
		Else
			If modfunstr.Sub006(pSco.Text) <= 100 Then
				If modfunstr.Sub006(pSco.Text) >= 0 Then
					pSco.Text = NumberFormat2(modfunstr.Sub006(pSco.Text), 1, 0, 0, False)
				End If
			End If
			pSco.Text = "0"
		End If
		If Not(vBln4) And pSco.Text = "0" Then
			If vStr3 <> "" Then
				If vStr3 <> "0" Then
					pSco.Text = vStr3
				End If
			End If
		End If
		pSco.Hint = pSco.Text
	End If
	vBln4 = False
End Sub

Sub pSco_TextChanged(str As String, str2 As String)
	If str2.Length > 3 Then
		pSco.Text = str
		pSco.SelectionStart = str.Length
		Return
	End If
End Sub

Sub pStampaRiep_ItemClick(i As Int, obj As Object)
End Sub

Sub pZona_ItemClick(i As Int, obj As Object)
End Sub

Sub Sub016(imageViewWrapper As ImageView, z As Boolean)
	Dim popupMenuWrapper As PopupMenu = Null
	Dim vObjectToNumber As Int = imageViewWrapper.Tag
	If vObjectToNumber < 0 Then
		Return
	End If
	Dim vExecQuerySingleResult As String = Main.vSql1.ExecQuerySingleResult("SELECT Codice from sortedClienti  WHERE rowid=" & vObjectToNumber + 1)
	vInt2 = vObjectToNumber
	Dim cursorWrapper As Cursor
	vCur2 = Main.vSql1.ExecQuery("Select * from clienti where codice = '" & vExecQuerySingleResult & "'")
	Dim cursorWrapper2 As Cursor
	vCur3 = Main.vSql1.ExecQuery("Select * from FEdatiCli where Codice = '" & vExecQuerySingleResult & "'")
	vCur2.Position = 0
	If vCur3.RowCount > 0 Then
		vCur3.Position = 0
	End If
	vBln2 = (Main.vSql1.ExecQuerySingleResult("select count(*) FROM clienti where tesseraaggiuntiva=0 and codmaster ='" & vCur2.GetString("codice") & "'") > 0)
	If Main.vStr21 <> "" Then
		If Not(Main.vMap9.IsInitialized) Then
			If vCur2.GetString("telefono").Trim = "" Then
				Main.vSql1.ExecNonQuery("update clienti set telefono='" & Main.vStr21 & "' where codice = '" & vCur2.GetString("codice") & "'")
			Else If vCur2.GetString("fax").Trim = "" Then
				Main.vSql1.ExecNonQuery("update clienti set fax='" & Main.vStr21 & "' where codice = '" & vCur2.GetString("codice") & "'")
			Else
				Dim vObjectToCharSequence As Object = "Il Cliente " & vCur2.GetString("descrizione") & " non ha numeri di telefono disponibili." & CRLF & "Indicare una possibile soluzione:"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Dim str As String = "Sostituisci il numero " & vCur2.GetString("telefono").Trim
				Dim str2 As String = "Sostituisci il numero " & vCur2.GetString("fax").Trim
				Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, str, str2, "Annulla", Main.vBmp1)
				If vMsgbox2 = -1 Then
					Main.vSql1.ExecNonQuery("update clienti set telefono='" & Main.vStr21 & "' where codice = '" & vCur2.GetString("codice") & "'")
				Else
					If vMsgbox2 = -3 Then
						Main.vSql1.ExecNonQuery("update clienti set fax='" & Main.vStr21 & "' where codice = '" & vCur2.GetString("codice") & "'")
					Else
						Return
					End If
				End If
			End If
			Main.vStr21 = ""
			Main.vStr13 = vCur2.GetString("codice")
			vBln1 = True
			Main.vBln32 = False
			vIME2.HideKeyboard
			Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedClienti")
			mod1.Sub198("Main")
			Activity.Finish
			Return
		End If
	End If
	If Main.vStr21 <> "" Then
		If Main.vMap9.IsInitialized Then
			If Not(Sub012()) Then
				Return
			End If
			Sub001()
			Return
		End If
	End If
	If Main.vBln32 And Not(z) Then
		Main.vStr13 = vCur2.GetString("codice")
		vBln1 = True
		Main.vBln32 = False
		vIME2.HideKeyboard
		Main.vSql1.ExecNonQuery("DROP TABLE IF EXISTS TEMP.sortedClienti")
		mod1.Sub198("Main")
		Activity.Finish
		Return
	End If
	vLst1.Clear
	vLst1.Add("Modifica")
	vLst1.Add("Elimina")
	vLst1.Add("Movimenti")
	vLst1.Add("Seleziona")
	vLst1.Add("Cambia Codice")
	If Main.vSql1.ExecQuerySingleResult("select count(*) FROM clienti where codmaster ='" & vCur2.GetString("codice") & "'") > 0 Or vCur2.GetString("CodMaster") <> "" Then
		vLst1.Add("Clienti-Tessere Collegate")
	End If
	If vCur2.GetInt("attivo") = 1 Then
		vLst1.Add("Disattiva")
	Else
		vLst1.Add("Attiva")
	End If
	vLst1.Add("Scadenza")
	If vStr5 <> "" Then
		Dim sb2 As String = File.DirDefaultExternal & "/ProcedureSQL"
		If File.Exists(sb2, vStr5) Then
			vLst1.Add(vStr6)
		End If
	End If
	vLst1.Add("Esci")
	If vLst1.Size > 1 Then
		'popupMenuWrapper = PopupMenu
		popupMenuWrapper.Initialize("AC", imageViewWrapper)
		Dim size As Int = vLst1.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim bitmapDrawable As BitmapDrawable
			Dim str3 As String = ""
			Dim vGet As Object = vLst1.Get(i)
			Select vGet
				Case "Modifica"
					str3 = "fun_pencil-red.png"
				Case "Elimina"
					str3 = "006.png"
				Case "Seleziona"
					str3 = "030.png"
				Case "Movimenti"
					str3 = "fun_griglia.png"
				Case "Cambia Codice"
					str3 = "fca_MOD MOVIMENTO.png"
				Case "Disattiva"
					str3 = "fca_lucchetto.png"
				Case "Scadenza"
					str3 = "fca_lucchetto.png"
				Case "Attiva"
					str3 = "fca_LUCCHETTO AP.png"
				Case "Clienti-Tessere Collegate"
					str3 = "gruppo.png"
				Case vStr6
					str3 = "fun_configura (2).png"
				Case "Esci"
					str3 = "014.png"
			End Select
			Dim vObjectToString As String = vLst1.Get(i)
			bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str3))
			popupMenuWrapper.AddMenuItem(i, vObjectToString, bitmapDrawable)
		Next
	End If
	Sub020(imageViewWrapper)
	popupMenuWrapper.Show
End Sub

Sub Sub017(str As String)
	bCompleanno.Tag = str
	bCompleanno.Text = "Compleanno non configurato"
	If str.Length = 10 And Not(str.EndsWith("1900")) Then
		bCompleanno.Text = "Compleanno: " & str.SubString2(3, 6) & str.SubString2(0, 3) & str.SubString(6)
		Return
	End If
End Sub

Sub Sub018(z As Boolean)
	If Not(DatiAggiuntivi.Enabled) Then
		DatiAggiuntivi.Enabled = True
	End If
	pPlu.SetVisibleAnimated(500, z)
	pButtonsForm.SetVisibleAnimated(500, z)
End Sub

Sub Sub019
	lblPluTitle.Visible = pPlu.Visible
	pAnnulla.Visible = pPlu.Visible
	pConferma.Visible = pPlu.Visible
	pMaster.Visible = pPlu.Visible
	pMaps.Visible = pPlu.Visible
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
	Sub005()
	Dim sb As String = "insert into sortedClienti(Codice,Descrizione,Citta," & CRLF & TAB & "CAP,Provincia,Via,Telefono,PartitaIva,scadcliente,CodiceFiscale,attivo,CodMaster,tesseraaggiuntiva) " & SmartStringFormatter("", vStr10) & "  "
	Dim str As String = ""
	If Not(vBln5) Then
		str = " DESC"
	End If
	Select vByt1
		Case 0
			vStr7 = " order by Descrizione "
		Case 1
			vStr7 = " order by Codice" & str & ",Descrizione"
		Case 2
			vStr7 = " order by Descrizione" & str
		Case 3
			vStr7 = " order by Citta" & str & ",Descrizione"
		Case 4
			vStr7 = " order by Via" & str & ",Descrizione"
		Case 5
			vStr7 = " order by PartitaIva" & str & ",Descrizione"
		Case 6
			vStr7 = " order by Descrizione "
	End Select
	Main.vSql1.ExecNonQuery(sb & vStr7)
	vUltimateListView1.RefreshContent
	vUltimateListView1.Enabled = True
End Sub

Sub sort_data
	vUltimateListView1.Enabled = False
	If vByt1 = -1 Then
		vByt1 = 2
		vBln5 = False
	End If
	vColorDrawable1.Initialize(-65536, DipToCurrent(6))
	vLabelArr1(vByt1).Background = vColorDrawable1
	sort_async()
End Sub

Sub Spnazionecli_ItemClick(i As Int, obj As Object)
End Sub

Sub Sptiposoggetto_ItemClick(i As Int, obj As Object)
	Select i
		Case 0
			Nazione.Enabled = True
		Case 1
			Nazione.Enabled = True
		Case 2
			Nazione.Enabled = True
		Case 3
			Nazione.Tag = "IT"
			Nazione.Text = "Nazione:" & Sub007("IT")
			Nazione.Enabled = False
	End Select
End Sub

Sub sRicerca_ItemClick(i As Int, obj As Object)
	Select i
		Case 0
			Sub002("Descrizione")
		Case 1
			Sub002("Codice")
		Case 2
			Sub002("Partita Iva")
		Case 3
			Sub002("Indirizzo")
		Case 4
			Sub002("Gruppo Cliente")
		Case 5
			Sub002("Mail")
		Case 6
			Sub002("Tutti")
	End Select
End Sub

Sub Sub020(concreteViewWrapper As View)
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

Sub TipoSoggetto_ItemClick(i As Int, obj As Object)
	If i = 0 Then
		edtCodDestCli.Text = "0000000"
	End If
	edtCodDestCli.Enabled = i <> 0
End Sub

Sub Ulv_Scrolled(i As Int, i2 As Int, i3 As Int, z As Boolean, z2 As Boolean)
	Try
		If i <> vInt12 Then
			vInt12 = i
			Dim fastScrollerState As Int = vUltimateListView1.FastScrollerState
			Dim ultimateListViewWrapper As UltimateListView = vUltimateListView1
			If fastScrollerState = 2 Then
				If vStr7.StartsWith(" order by Descrizione") Then
					v6.Enabled = False
					Dim vGetItemID As Int = vUltimateListView1.GetItemID(i)
					If vGetItemID < 0 Then
						Return
					End If
					vCur5.Position = vGetItemID
					If vCur5.GetString("Descrizione").Length < 2 Then
						Return
					End If
					LblInfo.Text = vCur5.GetString("Descrizione").SubString2(0, 2).ToUpperCase
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

Sub Sub021 As Boolean
	If Main.v_attivafe And (pIva.Text <> "" Or pCF.Text <> "") And Not(PHideCtrl.Visible) Then
		If Nazione.Tag <> "" And Nazione.Tag <> "IT" And (edtCodDestCli.Text = "0000000" Or edtCodDestCli.Text = "") Then
			edtCodDestCli.Text = "XXXXXXX"
		Else If Nazione.Tag = "IT" And (edtCodDestCli.Text = "XXXXXXX" Or edtCodDestCli.Text = "") Then
			edtCodDestCli.Text = "0000000"
		End If
		Dim vTmp As String = mod1.Sub211(TipoSoggetto.SelectedIndex, edtNomeCli.Text, edtCognomeCli.Text, pIva.Text, pCF.Text, Nazione.Tag, edtCodDestCli.Text, pDes.Text, pProvincia.Text, pVia.Text, pCitta.Text)
		If vTmp <> "" Then
			vCSBuilder1.Initialize
			Dim vAppend As CSBuilder = vCSBuilder1.Append("Attenzione ... non è stata superata la verifica dei dati per l'emissione della fattura elettronica:" & CRLF & "Errore riscontrato: ")
			vAppend.Color(-65536).Append(vTmp).Append(CRLF).Pop.Append("Si desidera proseguire ?")
			Dim vObjectToCharSequence As Object = vCSBuilder1.PopAll
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
			If vMsgbox2 <> -1 Then
				Return False
			End If
		End If
	End If
	Return True
End Sub

Sub Sub022(str As String) As String
	If Not(Regex.IsMatch("^[A-Za-z0-9]{" & 8 & "}$", str)) Then
		Return ""
	End If
	Return str
End Sub

Sub Sub023(str As String) As String
	If Not(IsNumber(str.Replace(",", "."))) Then
		Return "0"
	End If
	Return mod1.Sub056(str)
End Sub

Sub Sub024(str As String) As String
	If str = "" Then
		Return ""
	End If
	If str.Length > 50 Then
		str = modfunstr.left(str, 50)
	End If
	Return str.Replace("'", "`").Replace("%", "").Replace("[", "").Replace("#", "").Replace(",", "").Replace(CRLF, "")
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

