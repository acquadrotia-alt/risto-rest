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
	Public vStr1 As String = " "
	Public vStr2 As String
	Public vStr3 As String
	Public vStr4 As String
	Public f_data As Int
	Public f_movi As Int = 1
	Public f_docu As Int = 2
	Public f_cart As Int = 3
	Public f_dart As Int = 4
	Public f_cli As Int = 5
	Public f_rep As Int = 6
	Public f_caus As Int = 7
	Public f_iva As Int = 8
	Public f_descli As Int = 9
	Public f_oper As Int = 10
	Public s_reparti As Int
	Public s_iva As Int = 1
	Public s_pagamenti As Int = 2
	Public s_articoli As Int = 3
	Public s_clienti As Int = 4
	Public s_operatori As Int = 5
	Public s_repartig As Int = 6
	Public s_finanziario As Int = 7
	Public s_fasce As Int = 8
	Public s_movimenti As Int = 9
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public CArticolo As Button
	Public Causale As Button
	Public Cliente As Button
	Public DArticolo As Button
	Public Data As Button
	Public Documento As Button
	Public Movimento As Button
	Public Reparto As Button
	Public Iva As Button
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
	Public vDlg1 As InputDialog
	Public vcustomlistviewold1 As customlistviewold
	Public vLst12 As List
	Public vLst13 As List
	Public vLst14 As List
	Public vLst15 As List
	Public vLst16 As List
	Public dCarticolo As Button
	Public dCausale As Button
	Public dCliente As Button
	Public dDarticolo As Button
	Public dReparto As Button
	Public dData As Button
	Public dIva As Button
	Public dDocumento As Button
	Public dMovimento As Button
	Public vLst17 As List
	Public vLst18 As List
	Public dDesCliente As Button
	Public DesCliente As Button
	Public dOperatore As Button
	Public Operatore As Button
	Public PnlList As Panel
	Public LblInfo As Label
	Public lblTitolo As Label
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
			Sub002("Filtro")
			lblTitolo.Text = "Filtro stampa"
			Data.Background = mod1.Sub155(-3355444, 40)
			Movimento.Background = mod1.Sub155(-3355444, 40)
			Documento.Background = mod1.Sub155(-3355444, 40)
			CArticolo.Background = mod1.Sub155(-3355444, 40)
			DArticolo.Background = mod1.Sub155(-3355444, 40)
			Cliente.Background = mod1.Sub155(-3355444, 40)
			DesCliente.Background = mod1.Sub155(-3355444, 40)
			Reparto.Background = mod1.Sub155(-3355444, 40)
			Iva.Background = mod1.Sub155(-3355444, 40)
			Causale.Background = mod1.Sub155(-3355444, 40)
			vLst7.Initialize
			vLst9.Initialize
			vLst8.Initialize
			vLst1.Initialize
			vLst4.Initialize
			vLst5.Initialize
			vLst6.Initialize
			vLst2.Initialize
			vLst3.Initialize
			vLst10.Initialize
			vLst11.Initialize
			vLst13.Initialize
			vLst12.Initialize
			vLst14.Initialize
			vLst15.Initialize
			vLst16.Initialize
			lblTitolo.Color = Main.v_colormenutitle
			mod1.Sub173(lblTitolo)
			LblInfo.Color = Main.v_colormenutitle
			mod1.Sub173(LblInfo)
			vcustomlistviewold1.Initialize(Me, "clv2")
			vcustomlistviewold1.vInt3 = Colors.RGB(245, 245, 245)
			PnlList.AddView(vcustomlistviewold1.Sub003, DipToCurrent(0), DipToCurrent(70), PnlList.Width, PnlList.Height - DipToCurrent(70))
			vcustomlistviewold1.Sub004
			vLst7.AddAll(ArrayToList(Array As String("=", "Oggi", "Ieri", "Diverso", "Maggiore", "Minore", "Compreso tra")))
			vLst9.AddAll(ArrayToList(Array As String("=", "Diverso", "Maggiore", "Minore")))
			vLst8.AddAll(ArrayToList(Array As String("=", "Diverso")))
			vLst1.AddAll(ArrayToList(Array As String("=", "Diverso", "Contiene")))
			vLst4.AddAll(ArrayToList(Array As String("=", "Diverso", "Contiene")))
			vLst5.AddAll(ArrayToList(Array As String("=", "Diverso", "Contiene")))
			vLst2.AddAll(ArrayToList(Array As String("=", "Diverso")))
			vLst3.AddAll(ArrayToList(Array As String("=", "Diverso", "Contiene")))
			vLst10.AddAll(ArrayToList(Array As String("=", "Diverso")))
			vLst11.AddAll(ArrayToList(Array As String("=", "Diverso")))
			vLst6.AddAll(ArrayToList(Array As String("=", "Diverso")))
			vLst13.AddAll(ArrayToList(Array As String("Scontrini", "Fatture", "Riepilogo", "Ricevute")))
			If Main.vBln44 Then
				vLst12.AddAll(ArrayToList(Array As String("Scarico", "Carico", "Rettifica", "Autoconsumo", "Reso a Fornitore", "Inventario")))
			Else
				vLst12.AddAll(ArrayToList(Array As String("Scarico", "Carico", "Rettifica", "Autoconsumo", "Reso a Fornitore", "Inventario", "Prenotazioni")))
			End If
			populatespinner()
			Sub003()
			Sub004()
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
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/filtro.java, metodo _activity_resume (riga 730).
Sub Activity_Resume
	Dim z As Boolean
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim z5 As Boolean
	Dim z6 As Boolean
	Dim z7 As Boolean
	Dim z8 As Boolean
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
	Dim z19 As Boolean
	Dim z20 As Boolean = True
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
			Try
				mod1.vStr2 = "Activity_Resume"
				vBln1 = False
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				If Main.vBln44 Then
					If Main.vBln45 Then
						lblTitolo.Text = "Filtro Richiamo Prenotazioni"
					Else
						lblTitolo.Text = "Filtro Richiamo Movimenti Storici"
					End If
					Data.Visible = True
					Reparto.Visible = False
					Iva.Visible = False
					Documento.Visible = Not(Main.vBln45)
					CArticolo.Visible = False
					DArticolo.Visible = False
					Cliente.Visible = True
					DesCliente.Visible = True
					Operatore.Visible = False
					Causale.Visible = Not(Main.vBln45)
					dData.Visible = True
					dReparto.Visible = False
					dIva.Visible = False
					dDocumento.Visible = Not(Main.vBln45)
					dCarticolo.Visible = False
					dDarticolo.Visible = False
					dCliente.Visible = True
					dOperatore.Visible = False
					dDesCliente.Visible = True
					dCausale.Visible = Not(Main.vBln45)
					If Not(Stampe.vLst10.IsInitialized) Then
						Stampe.vLst10.Initialize
						Stampe.vLst10.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
					End If
					If Not(Stampe.vLst20.IsInitialized) Then
						Stampe.vLst20.Initialize
						Stampe.vLst20.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
					End If
					vLst17 = Stampe.vLst10
					vLst18 = Stampe.vLst20
					vStr1 = " "
					Data.Background = mod1.Sub155(-3355444, 40)
					Data.Text = "Data"
					Data.Tag = ""
					vLst17.Set(f_data, "")
					vLst17.Set(f_data, "")
					Documento.Background = mod1.Sub155(-3355444, 40)
					Documento.Text = "Documento"
					Documento.Tag = ""
					vLst17.Set(f_docu, "")
					vLst17.Set(f_docu, "")
					Cliente.Background = mod1.Sub155(-3355444, 40)
					Cliente.Text = "Cliente"
					Cliente.Tag = ""
					vLst17.Set(f_cli, "")
					vLst17.Set(f_cli, "")
					DesCliente.Background = mod1.Sub155(-3355444, 40)
					DesCliente.Text = "Descrizione Cliente"
					DesCliente.Tag = ""
					vLst17.Set(f_descli, "")
					vLst17.Set(f_descli, "")
					Causale.Background = mod1.Sub155(-3355444, 40)
					Causale.Text = "Causale Magazzino"
					Causale.Tag = ""
					vLst17.Set(f_caus, "")
					vLst17.Set(f_caus, "")
					Movimento.Background = mod1.Sub155(-3355444, 40)
					Movimento.Text = "Movimento"
					Movimento.Tag = ""
					vLst17.Set(f_movi, "")
					vLst17.Set(f_movi, "")
				Else
					lblTitolo.Text = "Filtro stampa"
					Data.Visible = Main.vStr15 <> "Venduto"
					Dim buttonWrapper12 As Button = Reparto
					If Stampe.vInt1 <> s_iva Then
						If Stampe.vInt1 <= s_articoli Then
						End If
					End If
					If Stampe.vInt1 <> s_repartig Then
						If Stampe.vInt1 <> s_fasce Then
							z = False
							buttonWrapper12.Visible = z
							Dim buttonWrapper13 As Button = Iva
							If Stampe.vInt1 <> s_iva Then
								If Stampe.vInt1 <= s_articoli Then
								End If
							End If
							If Stampe.vInt1 <> s_repartig Then
								If Stampe.vInt1 <> s_fasce Then
									z2 = False
									buttonWrapper13.Visible = z2
									Dim buttonWrapper14 As Button = Documento
									If Stampe.vInt1 <> s_iva Then
										If Stampe.vInt1 <> s_pagamenti Then
											If Stampe.vInt1 <> s_finanziario Then
												z3 = True
												buttonWrapper14.Visible = z3
												Dim buttonWrapper15 As Button = CArticolo
												If Stampe.vInt1 <> s_iva Then
													If Stampe.vInt1 <= s_articoli Then
													End If
												End If
												If Stampe.vInt1 <> s_repartig Then
													z4 = False
													buttonWrapper15.Visible = z4
													Dim buttonWrapper16 As Button = DArticolo
													If Stampe.vInt1 <> s_iva Then
														If Stampe.vInt1 <= s_articoli Then
														End If
													End If
													If Stampe.vInt1 <> s_repartig Then
														z5 = False
														buttonWrapper16.Visible = z5
														Dim buttonWrapper17 As Button = Cliente
														If Stampe.vInt1 <> s_iva Then
															If Stampe.vInt1 <> s_pagamenti Then
																If Stampe.vInt1 <> s_finanziario Then
																	z6 = True
																	buttonWrapper17.Visible = z6
																	Dim buttonWrapper18 As Button = DesCliente
																	If Stampe.vInt1 <> s_iva Then
																		If Stampe.vInt1 <> s_pagamenti Then
																			If Stampe.vInt1 <> s_finanziario Then
																				If Stampe.vInt1 <> s_fasce Then
																					z7 = True
																					buttonWrapper18.Visible = z7
																					Dim buttonWrapper19 As Button = Operatore
																					If Stampe.vInt1 <> s_reparti Then
																						If Stampe.vInt1 <> s_repartig Then
																							If Stampe.vInt1 <> s_fasce Then
																								If Stampe.vInt1 <> s_articoli Then
																									z8 = False
																									buttonWrapper19.Visible = z8
																									Dim buttonWrapper20 As Button = Causale
																									If Stampe.vInt1 <> s_iva Then
																										If Stampe.vInt1 <> s_pagamenti Then
																											If Main.vStr15 <> "Venduto" Then
																												If Stampe.vInt1 <> s_finanziario Then
																													z9 = True
																													buttonWrapper20.Visible = z9
																													Dim buttonWrapper21 As Button = Movimento
																													If Stampe.vInt1 <> s_iva Then
																														If Stampe.vInt1 <> s_finanziario Then
																															z10 = True
																															buttonWrapper21.Visible = z10
																															Dim buttonWrapper22 As Button = dMovimento
																															If Stampe.vInt1 <> s_iva Then
																																If Stampe.vInt1 <> s_finanziario Then
																																	z11 = True
																																	buttonWrapper22.Visible = z11
																																	dData.Visible = Main.vStr15 <> "Venduto"
																																	Dim buttonWrapper24 As Button = dReparto
																																	If Stampe.vInt1 <> s_iva Then
																																		If Stampe.vInt1 <= s_articoli Then
																																		End If
																																	End If
																																	If Stampe.vInt1 <> s_repartig Then
																																		If Stampe.vInt1 <> s_fasce Then
																																			z12 = False
																																			buttonWrapper24.Visible = z12
																																			Dim buttonWrapper25 As Button = dIva
																																			If Stampe.vInt1 <> s_iva Then
																																				If Stampe.vInt1 <= s_articoli Then
																																				End If
																																			End If
																																			If Stampe.vInt1 <> s_repartig Then
																																				If Stampe.vInt1 <> s_fasce Then
																																					z13 = False
																																					buttonWrapper25.Visible = z13
																																					Dim buttonWrapper26 As Button = dDocumento
																																					If Stampe.vInt1 <> s_iva Then
																																						If Stampe.vInt1 <> s_pagamenti Then
																																							If Stampe.vInt1 <> s_finanziario Then
																																								z14 = True
																																								buttonWrapper26.Visible = z14
																																								Dim buttonWrapper27 As Button = dCarticolo
																																								If Stampe.vInt1 <> s_iva Then
																																									If Stampe.vInt1 <= s_articoli Then
																																									End If
																																								End If
																																								If Stampe.vInt1 <> s_repartig Then
																																									z15 = False
																																									buttonWrapper27.Visible = z15
																																									Dim buttonWrapper28 As Button = dDarticolo
																																									If Stampe.vInt1 <> s_iva Then
																																										If Stampe.vInt1 <= s_articoli Then
																																										End If
																																									End If
																																									If Stampe.vInt1 <> s_repartig Then
																																										z16 = False
																																										buttonWrapper28.Visible = z16
																																										Dim buttonWrapper29 As Button = dCliente
																																										If Stampe.vInt1 <> s_iva Then
																																											If Stampe.vInt1 <> s_pagamenti Then
																																												If Stampe.vInt1 <> s_finanziario Then
																																													z17 = True
																																													buttonWrapper29.Visible = z17
																																													Dim buttonWrapper30 As Button = dOperatore
																																													If Stampe.vInt1 <> s_iva Then
																																													End If
																																													If Stampe.vInt1 <> s_repartig Then
																																														If Stampe.vInt1 <> s_fasce Then
																																															If Stampe.vInt1 <> s_articoli Then
																																																z18 = False
																																																buttonWrapper30.Visible = z18
																																																Dim buttonWrapper31 As Button = dDesCliente
																																																If Stampe.vInt1 <> s_iva Then
																																																	If Stampe.vInt1 <> s_pagamenti Then
																																																		If Stampe.vInt1 <> s_finanziario Then
																																																			If Stampe.vInt1 <> s_fasce Then
																																																				z19 = True
																																																				buttonWrapper31.Visible = z19
																																																				If Stampe.vInt1 <> s_iva Then
																																																					If Stampe.vInt1 <> s_pagamenti Then
																																																						If Main.vStr15 <> "Venduto" Then
																																																						End If
																																																					End If
																																																				End If
																																																				z20 = False
																																																				dCausale.Visible = z20
																																																				Select Stampe.vInt1
																																																					Case s_reparti
																																																						vLst17 = Stampe.vLst1
																																																						vLst18 = Stampe.vLst11
																																																						vStr1 = " venduto."
																																																					Case s_finanziario
																																																						vLst17 = Stampe.vLst8
																																																						vLst18 = Stampe.vLst18
																																																						vStr1 = " venduto."
																																																					Case s_articoli
																																																						vLst17 = Stampe.vLst2
																																																						vLst18 = Stampe.vLst12
																																																						vStr1 = " venduto."
																																																					Case s_fasce
																																																						vLst17 = Stampe.vLst9
																																																						vLst18 = Stampe.vLst19
																																																						vStr1 = " venduto."
																																																					Case s_clienti
																																																						vLst17 = Stampe.vLst5
																																																						vLst18 = Stampe.vLst15
																																																						vStr1 = " "
																																																					Case s_movimenti
																																																						vLst17 = Stampe.vLst10
																																																						vLst18 = Stampe.vLst20
																																																						vStr1 = " "
																																																					Case s_iva
																																																						vLst17 = Stampe.vLst3
																																																						vLst18 = Stampe.vLst13
																																																						vStr1 = " venduto."
																																																					Case s_operatori
																																																						vLst17 = Stampe.vLst6
																																																						vLst18 = Stampe.vLst16
																																																						vStr1 = " "
																																																					Case s_pagamenti
																																																						vLst17 = Stampe.vLst4
																																																						vLst18 = Stampe.vLst14
																																																						vStr1 = " "
																																																					Case s_repartig
																																																						vLst17 = Stampe.vLst7
																																																						vLst18 = Stampe.vLst17
																																																						vStr1 = " venduto."
																																																				End Select
																																																				If vLst17.Get(f_rep) = "" Then
																																																					Reparto.Text = vLst18.Get(f_rep)
																																																					Reparto.Tag = vLst17.Get(f_rep)
																																																					Reparto.Background = mod1.Sub155(-2520695, 40)
																																																				Else
																																																					Reparto.Background = mod1.Sub155(-3355444, 40)
																																																					Reparto.Text = "Reparto"
																																																					Reparto.Tag = ""
																																																				End If
																																																				vLst17.Set(f_rep, "")
																																																				vLst17.Set(f_rep, "")
																																																				If vLst17.Get(f_iva) = "" Then
																																																					Iva.Text = vLst18.Get(f_iva)
																																																					Iva.Tag = vLst17.Get(f_iva)
																																																					Iva.Background = mod1.Sub155(-2520695, 40)
																																																				Else
																																																					Iva.Background = mod1.Sub155(-3355444, 40)
																																																					Iva.Text = "Iva"
																																																					Iva.Tag = ""
																																																				End If
																																																				vLst17.Set(f_iva, "")
																																																				vLst17.Set(f_iva, "")
																																																				If vLst17.Get(f_data) = "" Then
																																																					Data.Text = vLst18.Get(f_data)
																																																					Data.Tag = vLst17.Get(f_data)
																																																					Data.Background = mod1.Sub155(-2520695, 40)
																																																				Else
																																																					Data.Background = mod1.Sub155(-3355444, 40)
																																																					Data.Text = "Data"
																																																					Data.Tag = ""
																																																				End If
																																																				vLst17.Set(f_data, "")
																																																				vLst17.Set(f_data, "")
																																																				If vLst17.Get(f_movi) = "" Then
																																																					Movimento.Text = vLst18.Get(f_movi)
																																																					Movimento.Tag = vLst17.Get(f_movi)
																																																					Movimento.Background = mod1.Sub155(-2520695, 40)
																																																				Else
																																																					Movimento.Background = mod1.Sub155(-3355444, 40)
																																																					Movimento.Text = "Movimento"
																																																					Movimento.Tag = ""
																																																				End If
																																																				vLst17.Set(f_movi, "")
																																																				vLst17.Set(f_movi, "")
																																																				If vLst17.Get(f_cart) = "" Then
																																																					CArticolo.Text = vLst18.Get(f_cart)
																																																					CArticolo.Tag = vLst17.Get(f_cart)
																																																					CArticolo.Background = mod1.Sub155(-2520695, 40)
																																																				Else
																																																					CArticolo.Background = mod1.Sub155(-3355444, 40)
																																																					CArticolo.Text = "Codice Articolo"
																																																					CArticolo.Tag = ""
																																																				End If
																																																				vLst17.Set(f_cart, "")
																																																				vLst17.Set(f_cart, "")
																																																				If vLst17.Get(f_cli) = "" Then
																																																					Cliente.Text = vLst18.Get(f_cli)
																																																					Cliente.Tag = vLst17.Get(f_cli)
																																																					Cliente.Background = mod1.Sub155(-2520695, 40)
																																																				Else
																																																					Cliente.Background = mod1.Sub155(-3355444, 40)
																																																					Cliente.Text = "Cliente"
																																																					Cliente.Tag = ""
																																																				End If
																																																				vLst17.Set(f_cli, "")
																																																				vLst17.Set(f_cli, "")
																																																				If vLst17.Get(f_descli) = "" Then
																																																					DesCliente.Text = vLst18.Get(f_descli)
																																																					DesCliente.Tag = vLst17.Get(f_descli)
																																																					DesCliente.Background = mod1.Sub155(-2520695, 40)
																																																				Else
																																																					DesCliente.Background = mod1.Sub155(-3355444, 40)
																																																					DesCliente.Text = "Descrizione Cliente"
																																																					DesCliente.Tag = ""
																																																				End If
																																																				vLst17.Set(f_descli, "")
																																																				vLst17.Set(f_descli, "")
																																																				If vLst17.Get(f_oper) = "" Then
																																																					Operatore.Text = vLst18.Get(f_oper)
																																																					Operatore.Tag = vLst17.Get(f_oper)
																																																					Operatore.Background = mod1.Sub155(-2520695, 40)
																																																				Else
																																																					Operatore.Background = mod1.Sub155(-3355444, 40)
																																																					Operatore.Text = "Operatore"
																																																					Operatore.Tag = ""
																																																				End If
																																																				vLst17.Set(f_oper, "")
																																																				vLst17.Set(f_oper, "")
																																																				If vLst17.Get(f_dart) = "" Then
																																																					DArticolo.Text = vLst18.Get(f_dart)
																																																					DArticolo.Tag = vLst17.Get(f_dart)
																																																					DArticolo.Background = mod1.Sub155(-2520695, 40)
																																																				Else
																																																					DArticolo.Background = mod1.Sub155(-3355444, 40)
																																																					DArticolo.Text = "Descrizione Articolo"
																																																					DArticolo.Tag = ""
																																																				End If
																																																				vLst17.Set(f_dart, "")
																																																				vLst17.Set(f_dart, "")
																																																				If vLst17.Get(f_docu) = "" Then
																																																					Documento.Text = vLst18.Get(f_docu)
																																																					Documento.Tag = vLst17.Get(f_docu)
																																																					Documento.Background = mod1.Sub155(-2520695, 40)
																																																				Else
																																																					Documento.Background = mod1.Sub155(-3355444, 40)
																																																					Documento.Text = "Documento"
																																																					Documento.Tag = ""
																																																				End If
																																																				vLst17.Set(f_docu, "")
																																																				vLst17.Set(f_docu, "")
																																																				If vLst17.Get(f_caus) = "" Then
																																																					Causale.Text = vLst18.Get(f_caus)
																																																					Causale.Tag = vLst17.Get(f_caus)
																																																					Causale.Background = mod1.Sub155(-2520695, 40)
																																																				Else
																																																					Causale.Background = mod1.Sub155(-3355444, 40)
																																																					Causale.Text = "Causale Magazzino"
																																																					Causale.Tag = ""
																																																				End If
																																																				vLst17.Set(f_caus, "")
																																																				vLst17.Set(f_caus, "")
																																																			End If
																																																		End If
																																																	End If
																																																End If
																																																z19 = False
																																																buttonWrapper31.Visible = z19
																																																If Stampe.vInt1 <> s_iva Then
																																																End If
																																																z20 = False
																																																dCausale.Visible = z20
																																																Select Stampe.vInt1
																																																End Select
																																																If vLst17.Get(f_rep) = "" Then
																																																End If
																																																vLst17.Set(f_rep, "")
																																																vLst17.Set(f_rep, "")
																																																If vLst17.Get(f_iva) = "" Then
																																																End If
																																																vLst17.Set(f_iva, "")
																																																vLst17.Set(f_iva, "")
																																																If vLst17.Get(f_data) = "" Then
																																																End If
																																																vLst17.Set(f_data, "")
																																																vLst17.Set(f_data, "")
																																																If vLst17.Get(f_movi) = "" Then
																																																End If
																																																vLst17.Set(f_movi, "")
																																																vLst17.Set(f_movi, "")
																																																If vLst17.Get(f_cart) = "" Then
																																																End If
																																																vLst17.Set(f_cart, "")
																																																vLst17.Set(f_cart, "")
																																																If vLst17.Get(f_cli) = "" Then
																																																End If
																																																vLst17.Set(f_cli, "")
																																																vLst17.Set(f_cli, "")
																																																If vLst17.Get(f_descli) = "" Then
																																																End If
																																																vLst17.Set(f_descli, "")
																																																vLst17.Set(f_descli, "")
																																																If vLst17.Get(f_oper) = "" Then
																																																End If
																																																vLst17.Set(f_oper, "")
																																																vLst17.Set(f_oper, "")
																																																If vLst17.Get(f_dart) = "" Then
																																																End If
																																																vLst17.Set(f_dart, "")
																																																vLst17.Set(f_dart, "")
																																																If vLst17.Get(f_docu) = "" Then
																																																End If
																																																vLst17.Set(f_docu, "")
																																																vLst17.Set(f_docu, "")
																																																If vLst17.Get(f_caus) = "" Then
																																																End If
																																																vLst17.Set(f_caus, "")
																																																vLst17.Set(f_caus, "")
																																															End If
																																														End If
																																													End If
																																													z18 = True
																																													buttonWrapper30.Visible = z18
																																													If Stampe.vInt1 <> s_iva Then
																																													End If
																																													z19 = False
																																													dDesCliente.Visible = z19
																																													If Stampe.vInt1 <> s_iva Then
																																													End If
																																													z20 = False
																																													dCausale.Visible = z20
																																													Select Stampe.vInt1
																																													End Select
																																													If vLst17.Get(f_rep) = "" Then
																																													End If
																																													vLst17.Set(f_rep, "")
																																													vLst17.Set(f_rep, "")
																																													If vLst17.Get(f_iva) = "" Then
																																													End If
																																													vLst17.Set(f_iva, "")
																																													vLst17.Set(f_iva, "")
																																													If vLst17.Get(f_data) = "" Then
																																													End If
																																													vLst17.Set(f_data, "")
																																													vLst17.Set(f_data, "")
																																													If vLst17.Get(f_movi) = "" Then
																																													End If
																																													vLst17.Set(f_movi, "")
																																													vLst17.Set(f_movi, "")
																																													If vLst17.Get(f_cart) = "" Then
																																													End If
																																													vLst17.Set(f_cart, "")
																																													vLst17.Set(f_cart, "")
																																													If vLst17.Get(f_cli) = "" Then
																																													End If
																																													vLst17.Set(f_cli, "")
																																													vLst17.Set(f_cli, "")
																																													If vLst17.Get(f_descli) = "" Then
																																													End If
																																													vLst17.Set(f_descli, "")
																																													vLst17.Set(f_descli, "")
																																													If vLst17.Get(f_oper) = "" Then
																																													End If
																																													vLst17.Set(f_oper, "")
																																													vLst17.Set(f_oper, "")
																																													If vLst17.Get(f_dart) = "" Then
																																													End If
																																													vLst17.Set(f_dart, "")
																																													vLst17.Set(f_dart, "")
																																													If vLst17.Get(f_docu) = "" Then
																																													End If
																																													vLst17.Set(f_docu, "")
																																													vLst17.Set(f_docu, "")
																																													If vLst17.Get(f_caus) = "" Then
																																													End If
																																													vLst17.Set(f_caus, "")
																																													vLst17.Set(f_caus, "")
																																												End If
																																											End If
																																										End If
																																										z17 = False
																																										buttonWrapper29.Visible = z17
																																										If Stampe.vInt1 <> s_iva Then
																																										End If
																																										If Stampe.vInt1 <> s_repartig Then
																																										End If
																																										z18 = True
																																										dOperatore.Visible = z18
																																										If Stampe.vInt1 <> s_iva Then
																																										End If
																																										z19 = False
																																										dDesCliente.Visible = z19
																																										If Stampe.vInt1 <> s_iva Then
																																										End If
																																										z20 = False
																																										dCausale.Visible = z20
																																										Select Stampe.vInt1
																																										End Select
																																										If vLst17.Get(f_rep) = "" Then
																																										End If
																																										vLst17.Set(f_rep, "")
																																										vLst17.Set(f_rep, "")
																																										If vLst17.Get(f_iva) = "" Then
																																										End If
																																										vLst17.Set(f_iva, "")
																																										vLst17.Set(f_iva, "")
																																										If vLst17.Get(f_data) = "" Then
																																										End If
																																										vLst17.Set(f_data, "")
																																										vLst17.Set(f_data, "")
																																										If vLst17.Get(f_movi) = "" Then
																																										End If
																																										vLst17.Set(f_movi, "")
																																										vLst17.Set(f_movi, "")
																																										If vLst17.Get(f_cart) = "" Then
																																										End If
																																										vLst17.Set(f_cart, "")
																																										vLst17.Set(f_cart, "")
																																										If vLst17.Get(f_cli) = "" Then
																																										End If
																																										vLst17.Set(f_cli, "")
																																										vLst17.Set(f_cli, "")
																																										If vLst17.Get(f_descli) = "" Then
																																										End If
																																										vLst17.Set(f_descli, "")
																																										vLst17.Set(f_descli, "")
																																										If vLst17.Get(f_oper) = "" Then
																																										End If
																																										vLst17.Set(f_oper, "")
																																										vLst17.Set(f_oper, "")
																																										If vLst17.Get(f_dart) = "" Then
																																										End If
																																										vLst17.Set(f_dart, "")
																																										vLst17.Set(f_dart, "")
																																										If vLst17.Get(f_docu) = "" Then
																																										End If
																																										vLst17.Set(f_docu, "")
																																										vLst17.Set(f_docu, "")
																																										If vLst17.Get(f_caus) = "" Then
																																										End If
																																										vLst17.Set(f_caus, "")
																																										vLst17.Set(f_caus, "")
																																									End If
																																									z16 = True
																																									buttonWrapper28.Visible = z16
																																									If Stampe.vInt1 <> s_iva Then
																																									End If
																																									z17 = False
																																									dCliente.Visible = z17
																																									If Stampe.vInt1 <> s_iva Then
																																									End If
																																									If Stampe.vInt1 <> s_repartig Then
																																									End If
																																									z18 = True
																																									dOperatore.Visible = z18
																																									If Stampe.vInt1 <> s_iva Then
																																									End If
																																									z19 = False
																																									dDesCliente.Visible = z19
																																									If Stampe.vInt1 <> s_iva Then
																																									End If
																																									z20 = False
																																									dCausale.Visible = z20
																																									Select Stampe.vInt1
																																									End Select
																																									If vLst17.Get(f_rep) = "" Then
																																									End If
																																									vLst17.Set(f_rep, "")
																																									vLst17.Set(f_rep, "")
																																									If vLst17.Get(f_iva) = "" Then
																																									End If
																																									vLst17.Set(f_iva, "")
																																									vLst17.Set(f_iva, "")
																																									If vLst17.Get(f_data) = "" Then
																																									End If
																																									vLst17.Set(f_data, "")
																																									vLst17.Set(f_data, "")
																																									If vLst17.Get(f_movi) = "" Then
																																									End If
																																									vLst17.Set(f_movi, "")
																																									vLst17.Set(f_movi, "")
																																									If vLst17.Get(f_cart) = "" Then
																																									End If
																																									vLst17.Set(f_cart, "")
																																									vLst17.Set(f_cart, "")
																																									If vLst17.Get(f_cli) = "" Then
																																									End If
																																									vLst17.Set(f_cli, "")
																																									vLst17.Set(f_cli, "")
																																									If vLst17.Get(f_descli) = "" Then
																																									End If
																																									vLst17.Set(f_descli, "")
																																									vLst17.Set(f_descli, "")
																																									If vLst17.Get(f_oper) = "" Then
																																									End If
																																									vLst17.Set(f_oper, "")
																																									vLst17.Set(f_oper, "")
																																									If vLst17.Get(f_dart) = "" Then
																																									End If
																																									vLst17.Set(f_dart, "")
																																									vLst17.Set(f_dart, "")
																																									If vLst17.Get(f_docu) = "" Then
																																									End If
																																									vLst17.Set(f_docu, "")
																																									vLst17.Set(f_docu, "")
																																									If vLst17.Get(f_caus) = "" Then
																																									End If
																																									vLst17.Set(f_caus, "")
																																									vLst17.Set(f_caus, "")
																																								End If
																																								z15 = True
																																								buttonWrapper27.Visible = z15
																																								If Stampe.vInt1 <> s_iva Then
																																								End If
																																								If Stampe.vInt1 <> s_repartig Then
																																								End If
																																								z16 = True
																																								dDarticolo.Visible = z16
																																								If Stampe.vInt1 <> s_iva Then
																																								End If
																																								z17 = False
																																								dCliente.Visible = z17
																																								If Stampe.vInt1 <> s_iva Then
																																								End If
																																								If Stampe.vInt1 <> s_repartig Then
																																								End If
																																								z18 = True
																																								dOperatore.Visible = z18
																																								If Stampe.vInt1 <> s_iva Then
																																								End If
																																								z19 = False
																																								dDesCliente.Visible = z19
																																								If Stampe.vInt1 <> s_iva Then
																																								End If
																																								z20 = False
																																								dCausale.Visible = z20
																																								Select Stampe.vInt1
																																								End Select
																																								If vLst17.Get(f_rep) = "" Then
																																								End If
																																								vLst17.Set(f_rep, "")
																																								vLst17.Set(f_rep, "")
																																								If vLst17.Get(f_iva) = "" Then
																																								End If
																																								vLst17.Set(f_iva, "")
																																								vLst17.Set(f_iva, "")
																																								If vLst17.Get(f_data) = "" Then
																																								End If
																																								vLst17.Set(f_data, "")
																																								vLst17.Set(f_data, "")
																																								If vLst17.Get(f_movi) = "" Then
																																								End If
																																								vLst17.Set(f_movi, "")
																																								vLst17.Set(f_movi, "")
																																								If vLst17.Get(f_cart) = "" Then
																																								End If
																																								vLst17.Set(f_cart, "")
																																								vLst17.Set(f_cart, "")
																																								If vLst17.Get(f_cli) = "" Then
																																								End If
																																								vLst17.Set(f_cli, "")
																																								vLst17.Set(f_cli, "")
																																								If vLst17.Get(f_descli) = "" Then
																																								End If
																																								vLst17.Set(f_descli, "")
																																								vLst17.Set(f_descli, "")
																																								If vLst17.Get(f_oper) = "" Then
																																								End If
																																								vLst17.Set(f_oper, "")
																																								vLst17.Set(f_oper, "")
																																								If vLst17.Get(f_dart) = "" Then
																																								End If
																																								vLst17.Set(f_dart, "")
																																								vLst17.Set(f_dart, "")
																																								If vLst17.Get(f_docu) = "" Then
																																								End If
																																								vLst17.Set(f_docu, "")
																																								vLst17.Set(f_docu, "")
																																								If vLst17.Get(f_caus) = "" Then
																																								End If
																																								vLst17.Set(f_caus, "")
																																								vLst17.Set(f_caus, "")
																																							End If
																																						End If
																																					End If
																																					z14 = False
																																					buttonWrapper26.Visible = z14
																																					If Stampe.vInt1 <> s_iva Then
																																					End If
																																					If Stampe.vInt1 <> s_repartig Then
																																					End If
																																					z15 = True
																																					dCarticolo.Visible = z15
																																					If Stampe.vInt1 <> s_iva Then
																																					End If
																																					If Stampe.vInt1 <> s_repartig Then
																																					End If
																																					z16 = True
																																					dDarticolo.Visible = z16
																																					If Stampe.vInt1 <> s_iva Then
																																					End If
																																					z17 = False
																																					dCliente.Visible = z17
																																					If Stampe.vInt1 <> s_iva Then
																																					End If
																																					If Stampe.vInt1 <> s_repartig Then
																																					End If
																																					z18 = True
																																					dOperatore.Visible = z18
																																					If Stampe.vInt1 <> s_iva Then
																																					End If
																																					z19 = False
																																					dDesCliente.Visible = z19
																																					If Stampe.vInt1 <> s_iva Then
																																					End If
																																					z20 = False
																																					dCausale.Visible = z20
																																					Select Stampe.vInt1
																																					End Select
																																					If vLst17.Get(f_rep) = "" Then
																																					End If
																																					vLst17.Set(f_rep, "")
																																					vLst17.Set(f_rep, "")
																																					If vLst17.Get(f_iva) = "" Then
																																					End If
																																					vLst17.Set(f_iva, "")
																																					vLst17.Set(f_iva, "")
																																					If vLst17.Get(f_data) = "" Then
																																					End If
																																					vLst17.Set(f_data, "")
																																					vLst17.Set(f_data, "")
																																					If vLst17.Get(f_movi) = "" Then
																																					End If
																																					vLst17.Set(f_movi, "")
																																					vLst17.Set(f_movi, "")
																																					If vLst17.Get(f_cart) = "" Then
																																					End If
																																					vLst17.Set(f_cart, "")
																																					vLst17.Set(f_cart, "")
																																					If vLst17.Get(f_cli) = "" Then
																																					End If
																																					vLst17.Set(f_cli, "")
																																					vLst17.Set(f_cli, "")
																																					If vLst17.Get(f_descli) = "" Then
																																					End If
																																					vLst17.Set(f_descli, "")
																																					vLst17.Set(f_descli, "")
																																					If vLst17.Get(f_oper) = "" Then
																																					End If
																																					vLst17.Set(f_oper, "")
																																					vLst17.Set(f_oper, "")
																																					If vLst17.Get(f_dart) = "" Then
																																					End If
																																					vLst17.Set(f_dart, "")
																																					vLst17.Set(f_dart, "")
																																					If vLst17.Get(f_docu) = "" Then
																																					End If
																																					vLst17.Set(f_docu, "")
																																					vLst17.Set(f_docu, "")
																																					If vLst17.Get(f_caus) = "" Then
																																					End If
																																					vLst17.Set(f_caus, "")
																																					vLst17.Set(f_caus, "")
																																				End If
																																			End If
																																			z13 = True
																																			buttonWrapper25.Visible = z13
																																			If Stampe.vInt1 <> s_iva Then
																																			End If
																																			z14 = False
																																			dDocumento.Visible = z14
																																			If Stampe.vInt1 <> s_iva Then
																																			End If
																																			If Stampe.vInt1 <> s_repartig Then
																																			End If
																																			z15 = True
																																			dCarticolo.Visible = z15
																																			If Stampe.vInt1 <> s_iva Then
																																			End If
																																			If Stampe.vInt1 <> s_repartig Then
																																			End If
																																			z16 = True
																																			dDarticolo.Visible = z16
																																			If Stampe.vInt1 <> s_iva Then
																																			End If
																																			z17 = False
																																			dCliente.Visible = z17
																																			If Stampe.vInt1 <> s_iva Then
																																			End If
																																			If Stampe.vInt1 <> s_repartig Then
																																			End If
																																			z18 = True
																																			dOperatore.Visible = z18
																																			If Stampe.vInt1 <> s_iva Then
																																			End If
																																			z19 = False
																																			dDesCliente.Visible = z19
																																			If Stampe.vInt1 <> s_iva Then
																																			End If
																																			z20 = False
																																			dCausale.Visible = z20
																																			Select Stampe.vInt1
																																			End Select
																																			If vLst17.Get(f_rep) = "" Then
																																			End If
																																			vLst17.Set(f_rep, "")
																																			vLst17.Set(f_rep, "")
																																			If vLst17.Get(f_iva) = "" Then
																																			End If
																																			vLst17.Set(f_iva, "")
																																			vLst17.Set(f_iva, "")
																																			If vLst17.Get(f_data) = "" Then
																																			End If
																																			vLst17.Set(f_data, "")
																																			vLst17.Set(f_data, "")
																																			If vLst17.Get(f_movi) = "" Then
																																			End If
																																			vLst17.Set(f_movi, "")
																																			vLst17.Set(f_movi, "")
																																			If vLst17.Get(f_cart) = "" Then
																																			End If
																																			vLst17.Set(f_cart, "")
																																			vLst17.Set(f_cart, "")
																																			If vLst17.Get(f_cli) = "" Then
																																			End If
																																			vLst17.Set(f_cli, "")
																																			vLst17.Set(f_cli, "")
																																			If vLst17.Get(f_descli) = "" Then
																																			End If
																																			vLst17.Set(f_descli, "")
																																			vLst17.Set(f_descli, "")
																																			If vLst17.Get(f_oper) = "" Then
																																			End If
																																			vLst17.Set(f_oper, "")
																																			vLst17.Set(f_oper, "")
																																			If vLst17.Get(f_dart) = "" Then
																																			End If
																																			vLst17.Set(f_dart, "")
																																			vLst17.Set(f_dart, "")
																																			If vLst17.Get(f_docu) = "" Then
																																			End If
																																			vLst17.Set(f_docu, "")
																																			vLst17.Set(f_docu, "")
																																			If vLst17.Get(f_caus) = "" Then
																																			End If
																																			vLst17.Set(f_caus, "")
																																			vLst17.Set(f_caus, "")
																																		End If
																																	End If
																																	z12 = True
																																	buttonWrapper24.Visible = z12
																																	If Stampe.vInt1 <> s_iva Then
																																	End If
																																	If Stampe.vInt1 <> s_repartig Then
																																	End If
																																	z13 = True
																																	dIva.Visible = z13
																																	If Stampe.vInt1 <> s_iva Then
																																	End If
																																	z14 = False
																																	dDocumento.Visible = z14
																																	If Stampe.vInt1 <> s_iva Then
																																	End If
																																	If Stampe.vInt1 <> s_repartig Then
																																	End If
																																	z15 = True
																																	dCarticolo.Visible = z15
																																	If Stampe.vInt1 <> s_iva Then
																																	End If
																																	If Stampe.vInt1 <> s_repartig Then
																																	End If
																																	z16 = True
																																	dDarticolo.Visible = z16
																																	If Stampe.vInt1 <> s_iva Then
																																	End If
																																	z17 = False
																																	dCliente.Visible = z17
																																	If Stampe.vInt1 <> s_iva Then
																																	End If
																																	If Stampe.vInt1 <> s_repartig Then
																																	End If
																																	z18 = True
																																	dOperatore.Visible = z18
																																	If Stampe.vInt1 <> s_iva Then
																																	End If
																																	z19 = False
																																	dDesCliente.Visible = z19
																																	If Stampe.vInt1 <> s_iva Then
																																	End If
																																	z20 = False
																																	dCausale.Visible = z20
																																	Select Stampe.vInt1
																																	End Select
																																	If vLst17.Get(f_rep) = "" Then
																																	End If
																																	vLst17.Set(f_rep, "")
																																	vLst17.Set(f_rep, "")
																																	If vLst17.Get(f_iva) = "" Then
																																	End If
																																	vLst17.Set(f_iva, "")
																																	vLst17.Set(f_iva, "")
																																	If vLst17.Get(f_data) = "" Then
																																	End If
																																	vLst17.Set(f_data, "")
																																	vLst17.Set(f_data, "")
																																	If vLst17.Get(f_movi) = "" Then
																																	End If
																																	vLst17.Set(f_movi, "")
																																	vLst17.Set(f_movi, "")
																																	If vLst17.Get(f_cart) = "" Then
																																	End If
																																	vLst17.Set(f_cart, "")
																																	vLst17.Set(f_cart, "")
																																	If vLst17.Get(f_cli) = "" Then
																																	End If
																																	vLst17.Set(f_cli, "")
																																	vLst17.Set(f_cli, "")
																																	If vLst17.Get(f_descli) = "" Then
																																	End If
																																	vLst17.Set(f_descli, "")
																																	vLst17.Set(f_descli, "")
																																	If vLst17.Get(f_oper) = "" Then
																																	End If
																																	vLst17.Set(f_oper, "")
																																	vLst17.Set(f_oper, "")
																																	If vLst17.Get(f_dart) = "" Then
																																	End If
																																	vLst17.Set(f_dart, "")
																																	vLst17.Set(f_dart, "")
																																	If vLst17.Get(f_docu) = "" Then
																																	End If
																																	vLst17.Set(f_docu, "")
																																	vLst17.Set(f_docu, "")
																																	If vLst17.Get(f_caus) = "" Then
																																	End If
																																	vLst17.Set(f_caus, "")
																																	vLst17.Set(f_caus, "")
																																End If
																															End If
																															z11 = False
																															buttonWrapper22.Visible = z11
																															dData.Visible = Main.vStr15 <> "Venduto"
																															If Stampe.vInt1 <> s_iva Then
																															End If
																															If Stampe.vInt1 <> s_repartig Then
																															End If
																															z12 = True
																															dReparto.Visible = z12
																															If Stampe.vInt1 <> s_iva Then
																															End If
																															If Stampe.vInt1 <> s_repartig Then
																															End If
																															z13 = True
																															dIva.Visible = z13
																															If Stampe.vInt1 <> s_iva Then
																															End If
																															z14 = False
																															dDocumento.Visible = z14
																															If Stampe.vInt1 <> s_iva Then
																															End If
																															If Stampe.vInt1 <> s_repartig Then
																															End If
																															z15 = True
																															dCarticolo.Visible = z15
																															If Stampe.vInt1 <> s_iva Then
																															End If
																															If Stampe.vInt1 <> s_repartig Then
																															End If
																															z16 = True
																															dDarticolo.Visible = z16
																															If Stampe.vInt1 <> s_iva Then
																															End If
																															z17 = False
																															dCliente.Visible = z17
																															If Stampe.vInt1 <> s_iva Then
																															End If
																															If Stampe.vInt1 <> s_repartig Then
																															End If
																															z18 = True
																															dOperatore.Visible = z18
																															If Stampe.vInt1 <> s_iva Then
																															End If
																															z19 = False
																															dDesCliente.Visible = z19
																															If Stampe.vInt1 <> s_iva Then
																															End If
																															z20 = False
																															dCausale.Visible = z20
																															Select Stampe.vInt1
																															End Select
																															If vLst17.Get(f_rep) = "" Then
																															End If
																															vLst17.Set(f_rep, "")
																															vLst17.Set(f_rep, "")
																															If vLst17.Get(f_iva) = "" Then
																															End If
																															vLst17.Set(f_iva, "")
																															vLst17.Set(f_iva, "")
																															If vLst17.Get(f_data) = "" Then
																															End If
																															vLst17.Set(f_data, "")
																															vLst17.Set(f_data, "")
																															If vLst17.Get(f_movi) = "" Then
																															End If
																															vLst17.Set(f_movi, "")
																															vLst17.Set(f_movi, "")
																															If vLst17.Get(f_cart) = "" Then
																															End If
																															vLst17.Set(f_cart, "")
																															vLst17.Set(f_cart, "")
																															If vLst17.Get(f_cli) = "" Then
																															End If
																															vLst17.Set(f_cli, "")
																															vLst17.Set(f_cli, "")
																															If vLst17.Get(f_descli) = "" Then
																															End If
																															vLst17.Set(f_descli, "")
																															vLst17.Set(f_descli, "")
																															If vLst17.Get(f_oper) = "" Then
																															End If
																															vLst17.Set(f_oper, "")
																															vLst17.Set(f_oper, "")
																															If vLst17.Get(f_dart) = "" Then
																															End If
																															vLst17.Set(f_dart, "")
																															vLst17.Set(f_dart, "")
																															If vLst17.Get(f_docu) = "" Then
																															End If
																															vLst17.Set(f_docu, "")
																															vLst17.Set(f_docu, "")
																															If vLst17.Get(f_caus) = "" Then
																															End If
																															vLst17.Set(f_caus, "")
																															vLst17.Set(f_caus, "")
																														End If
																													End If
																													z10 = False
																													buttonWrapper21.Visible = z10
																													If Stampe.vInt1 <> s_iva Then
																													End If
																													z11 = False
																													dMovimento.Visible = z11
																													dData.Visible = Main.vStr15 <> "Venduto"
																													If Stampe.vInt1 <> s_iva Then
																													End If
																													If Stampe.vInt1 <> s_repartig Then
																													End If
																													z12 = True
																													dReparto.Visible = z12
																													If Stampe.vInt1 <> s_iva Then
																													End If
																													If Stampe.vInt1 <> s_repartig Then
																													End If
																													z13 = True
																													dIva.Visible = z13
																													If Stampe.vInt1 <> s_iva Then
																													End If
																													z14 = False
																													dDocumento.Visible = z14
																													If Stampe.vInt1 <> s_iva Then
																													End If
																													If Stampe.vInt1 <> s_repartig Then
																													End If
																													z15 = True
																													dCarticolo.Visible = z15
																													If Stampe.vInt1 <> s_iva Then
																													End If
																													If Stampe.vInt1 <> s_repartig Then
																													End If
																													z16 = True
																													dDarticolo.Visible = z16
																													If Stampe.vInt1 <> s_iva Then
																													End If
																													z17 = False
																													dCliente.Visible = z17
																													If Stampe.vInt1 <> s_iva Then
																													End If
																													If Stampe.vInt1 <> s_repartig Then
																													End If
																													z18 = True
																													dOperatore.Visible = z18
																													If Stampe.vInt1 <> s_iva Then
																													End If
																													z19 = False
																													dDesCliente.Visible = z19
																													If Stampe.vInt1 <> s_iva Then
																													End If
																													z20 = False
																													dCausale.Visible = z20
																													Select Stampe.vInt1
																													End Select
																													If vLst17.Get(f_rep) = "" Then
																													End If
																													vLst17.Set(f_rep, "")
																													vLst17.Set(f_rep, "")
																													If vLst17.Get(f_iva) = "" Then
																													End If
																													vLst17.Set(f_iva, "")
																													vLst17.Set(f_iva, "")
																													If vLst17.Get(f_data) = "" Then
																													End If
																													vLst17.Set(f_data, "")
																													vLst17.Set(f_data, "")
																													If vLst17.Get(f_movi) = "" Then
																													End If
																													vLst17.Set(f_movi, "")
																													vLst17.Set(f_movi, "")
																													If vLst17.Get(f_cart) = "" Then
																													End If
																													vLst17.Set(f_cart, "")
																													vLst17.Set(f_cart, "")
																													If vLst17.Get(f_cli) = "" Then
																													End If
																													vLst17.Set(f_cli, "")
																													vLst17.Set(f_cli, "")
																													If vLst17.Get(f_descli) = "" Then
																													End If
																													vLst17.Set(f_descli, "")
																													vLst17.Set(f_descli, "")
																													If vLst17.Get(f_oper) = "" Then
																													End If
																													vLst17.Set(f_oper, "")
																													vLst17.Set(f_oper, "")
																													If vLst17.Get(f_dart) = "" Then
																													End If
																													vLst17.Set(f_dart, "")
																													vLst17.Set(f_dart, "")
																													If vLst17.Get(f_docu) = "" Then
																													End If
																													vLst17.Set(f_docu, "")
																													vLst17.Set(f_docu, "")
																													If vLst17.Get(f_caus) = "" Then
																													End If
																													vLst17.Set(f_caus, "")
																													vLst17.Set(f_caus, "")
																												End If
																											End If
																										End If
																									End If
																									z9 = False
																									buttonWrapper20.Visible = z9
																									If Stampe.vInt1 <> s_iva Then
																									End If
																									z10 = False
																									Movimento.Visible = z10
																									If Stampe.vInt1 <> s_iva Then
																									End If
																									z11 = False
																									dMovimento.Visible = z11
																									dData.Visible = Main.vStr15 <> "Venduto"
																									If Stampe.vInt1 <> s_iva Then
																									End If
																									If Stampe.vInt1 <> s_repartig Then
																									End If
																									z12 = True
																									dReparto.Visible = z12
																									If Stampe.vInt1 <> s_iva Then
																									End If
																									If Stampe.vInt1 <> s_repartig Then
																									End If
																									z13 = True
																									dIva.Visible = z13
																									If Stampe.vInt1 <> s_iva Then
																									End If
																									z14 = False
																									dDocumento.Visible = z14
																									If Stampe.vInt1 <> s_iva Then
																									End If
																									If Stampe.vInt1 <> s_repartig Then
																									End If
																									z15 = True
																									dCarticolo.Visible = z15
																									If Stampe.vInt1 <> s_iva Then
																									End If
																									If Stampe.vInt1 <> s_repartig Then
																									End If
																									z16 = True
																									dDarticolo.Visible = z16
																									If Stampe.vInt1 <> s_iva Then
																									End If
																									z17 = False
																									dCliente.Visible = z17
																									If Stampe.vInt1 <> s_iva Then
																									End If
																									If Stampe.vInt1 <> s_repartig Then
																									End If
																									z18 = True
																									dOperatore.Visible = z18
																									If Stampe.vInt1 <> s_iva Then
																									End If
																									z19 = False
																									dDesCliente.Visible = z19
																									If Stampe.vInt1 <> s_iva Then
																									End If
																									z20 = False
																									dCausale.Visible = z20
																									Select Stampe.vInt1
																									End Select
																									If vLst17.Get(f_rep) = "" Then
																									End If
																									vLst17.Set(f_rep, "")
																									vLst17.Set(f_rep, "")
																									If vLst17.Get(f_iva) = "" Then
																									End If
																									vLst17.Set(f_iva, "")
																									vLst17.Set(f_iva, "")
																									If vLst17.Get(f_data) = "" Then
																									End If
																									vLst17.Set(f_data, "")
																									vLst17.Set(f_data, "")
																									If vLst17.Get(f_movi) = "" Then
																									End If
																									vLst17.Set(f_movi, "")
																									vLst17.Set(f_movi, "")
																									If vLst17.Get(f_cart) = "" Then
																									End If
																									vLst17.Set(f_cart, "")
																									vLst17.Set(f_cart, "")
																									If vLst17.Get(f_cli) = "" Then
																									End If
																									vLst17.Set(f_cli, "")
																									vLst17.Set(f_cli, "")
																									If vLst17.Get(f_descli) = "" Then
																									End If
																									vLst17.Set(f_descli, "")
																									vLst17.Set(f_descli, "")
																									If vLst17.Get(f_oper) = "" Then
																									End If
																									vLst17.Set(f_oper, "")
																									vLst17.Set(f_oper, "")
																									If vLst17.Get(f_dart) = "" Then
																									End If
																									vLst17.Set(f_dart, "")
																									vLst17.Set(f_dart, "")
																									If vLst17.Get(f_docu) = "" Then
																									End If
																									vLst17.Set(f_docu, "")
																									vLst17.Set(f_docu, "")
																									If vLst17.Get(f_caus) = "" Then
																									End If
																									vLst17.Set(f_caus, "")
																									vLst17.Set(f_caus, "")
																								End If
																							End If
																						End If
																					End If
																					z8 = True
																					buttonWrapper19.Visible = z8
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					z9 = False
																					Causale.Visible = z9
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					z10 = False
																					Movimento.Visible = z10
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					z11 = False
																					dMovimento.Visible = z11
																					dData.Visible = Main.vStr15 <> "Venduto"
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					If Stampe.vInt1 <> s_repartig Then
																					End If
																					z12 = True
																					dReparto.Visible = z12
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					If Stampe.vInt1 <> s_repartig Then
																					End If
																					z13 = True
																					dIva.Visible = z13
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					z14 = False
																					dDocumento.Visible = z14
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					If Stampe.vInt1 <> s_repartig Then
																					End If
																					z15 = True
																					dCarticolo.Visible = z15
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					If Stampe.vInt1 <> s_repartig Then
																					End If
																					z16 = True
																					dDarticolo.Visible = z16
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					z17 = False
																					dCliente.Visible = z17
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					If Stampe.vInt1 <> s_repartig Then
																					End If
																					z18 = True
																					dOperatore.Visible = z18
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					z19 = False
																					dDesCliente.Visible = z19
																					If Stampe.vInt1 <> s_iva Then
																					End If
																					z20 = False
																					dCausale.Visible = z20
																					Select Stampe.vInt1
																					End Select
																					If vLst17.Get(f_rep) = "" Then
																					End If
																					vLst17.Set(f_rep, "")
																					vLst17.Set(f_rep, "")
																					If vLst17.Get(f_iva) = "" Then
																					End If
																					vLst17.Set(f_iva, "")
																					vLst17.Set(f_iva, "")
																					If vLst17.Get(f_data) = "" Then
																					End If
																					vLst17.Set(f_data, "")
																					vLst17.Set(f_data, "")
																					If vLst17.Get(f_movi) = "" Then
																					End If
																					vLst17.Set(f_movi, "")
																					vLst17.Set(f_movi, "")
																					If vLst17.Get(f_cart) = "" Then
																					End If
																					vLst17.Set(f_cart, "")
																					vLst17.Set(f_cart, "")
																					If vLst17.Get(f_cli) = "" Then
																					End If
																					vLst17.Set(f_cli, "")
																					vLst17.Set(f_cli, "")
																					If vLst17.Get(f_descli) = "" Then
																					End If
																					vLst17.Set(f_descli, "")
																					vLst17.Set(f_descli, "")
																					If vLst17.Get(f_oper) = "" Then
																					End If
																					vLst17.Set(f_oper, "")
																					vLst17.Set(f_oper, "")
																					If vLst17.Get(f_dart) = "" Then
																					End If
																					vLst17.Set(f_dart, "")
																					vLst17.Set(f_dart, "")
																					If vLst17.Get(f_docu) = "" Then
																					End If
																					vLst17.Set(f_docu, "")
																					vLst17.Set(f_docu, "")
																					If vLst17.Get(f_caus) = "" Then
																					End If
																					vLst17.Set(f_caus, "")
																					vLst17.Set(f_caus, "")
																				End If
																			End If
																		End If
																	End If
																	z7 = False
																	buttonWrapper18.Visible = z7
																	If Stampe.vInt1 <> s_reparti Then
																	End If
																	z8 = True
																	Operatore.Visible = z8
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	z9 = False
																	Causale.Visible = z9
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	z10 = False
																	Movimento.Visible = z10
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	z11 = False
																	dMovimento.Visible = z11
																	dData.Visible = Main.vStr15 <> "Venduto"
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	If Stampe.vInt1 <> s_repartig Then
																	End If
																	z12 = True
																	dReparto.Visible = z12
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	If Stampe.vInt1 <> s_repartig Then
																	End If
																	z13 = True
																	dIva.Visible = z13
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	z14 = False
																	dDocumento.Visible = z14
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	If Stampe.vInt1 <> s_repartig Then
																	End If
																	z15 = True
																	dCarticolo.Visible = z15
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	If Stampe.vInt1 <> s_repartig Then
																	End If
																	z16 = True
																	dDarticolo.Visible = z16
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	z17 = False
																	dCliente.Visible = z17
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	If Stampe.vInt1 <> s_repartig Then
																	End If
																	z18 = True
																	dOperatore.Visible = z18
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	z19 = False
																	dDesCliente.Visible = z19
																	If Stampe.vInt1 <> s_iva Then
																	End If
																	z20 = False
																	dCausale.Visible = z20
																	Select Stampe.vInt1
																	End Select
																	If vLst17.Get(f_rep) = "" Then
																	End If
																	vLst17.Set(f_rep, "")
																	vLst17.Set(f_rep, "")
																	If vLst17.Get(f_iva) = "" Then
																	End If
																	vLst17.Set(f_iva, "")
																	vLst17.Set(f_iva, "")
																	If vLst17.Get(f_data) = "" Then
																	End If
																	vLst17.Set(f_data, "")
																	vLst17.Set(f_data, "")
																	If vLst17.Get(f_movi) = "" Then
																	End If
																	vLst17.Set(f_movi, "")
																	vLst17.Set(f_movi, "")
																	If vLst17.Get(f_cart) = "" Then
																	End If
																	vLst17.Set(f_cart, "")
																	vLst17.Set(f_cart, "")
																	If vLst17.Get(f_cli) = "" Then
																	End If
																	vLst17.Set(f_cli, "")
																	vLst17.Set(f_cli, "")
																	If vLst17.Get(f_descli) = "" Then
																	End If
																	vLst17.Set(f_descli, "")
																	vLst17.Set(f_descli, "")
																	If vLst17.Get(f_oper) = "" Then
																	End If
																	vLst17.Set(f_oper, "")
																	vLst17.Set(f_oper, "")
																	If vLst17.Get(f_dart) = "" Then
																	End If
																	vLst17.Set(f_dart, "")
																	vLst17.Set(f_dart, "")
																	If vLst17.Get(f_docu) = "" Then
																	End If
																	vLst17.Set(f_docu, "")
																	vLst17.Set(f_docu, "")
																	If vLst17.Get(f_caus) = "" Then
																	End If
																	vLst17.Set(f_caus, "")
																	vLst17.Set(f_caus, "")
																End If
															End If
														End If
														z6 = False
														buttonWrapper17.Visible = z6
														If Stampe.vInt1 <> s_iva Then
														End If
														z7 = False
														DesCliente.Visible = z7
														If Stampe.vInt1 <> s_reparti Then
														End If
														z8 = True
														Operatore.Visible = z8
														If Stampe.vInt1 <> s_iva Then
														End If
														z9 = False
														Causale.Visible = z9
														If Stampe.vInt1 <> s_iva Then
														End If
														z10 = False
														Movimento.Visible = z10
														If Stampe.vInt1 <> s_iva Then
														End If
														z11 = False
														dMovimento.Visible = z11
														dData.Visible = Main.vStr15 <> "Venduto"
														If Stampe.vInt1 <> s_iva Then
														End If
														If Stampe.vInt1 <> s_repartig Then
														End If
														z12 = True
														dReparto.Visible = z12
														If Stampe.vInt1 <> s_iva Then
														End If
														If Stampe.vInt1 <> s_repartig Then
														End If
														z13 = True
														dIva.Visible = z13
														If Stampe.vInt1 <> s_iva Then
														End If
														z14 = False
														dDocumento.Visible = z14
														If Stampe.vInt1 <> s_iva Then
														End If
														If Stampe.vInt1 <> s_repartig Then
														End If
														z15 = True
														dCarticolo.Visible = z15
														If Stampe.vInt1 <> s_iva Then
														End If
														If Stampe.vInt1 <> s_repartig Then
														End If
														z16 = True
														dDarticolo.Visible = z16
														If Stampe.vInt1 <> s_iva Then
														End If
														z17 = False
														dCliente.Visible = z17
														If Stampe.vInt1 <> s_iva Then
														End If
														If Stampe.vInt1 <> s_repartig Then
														End If
														z18 = True
														dOperatore.Visible = z18
														If Stampe.vInt1 <> s_iva Then
														End If
														z19 = False
														dDesCliente.Visible = z19
														If Stampe.vInt1 <> s_iva Then
														End If
														z20 = False
														dCausale.Visible = z20
														Select Stampe.vInt1
														End Select
														If vLst17.Get(f_rep) = "" Then
														End If
														vLst17.Set(f_rep, "")
														vLst17.Set(f_rep, "")
														If vLst17.Get(f_iva) = "" Then
														End If
														vLst17.Set(f_iva, "")
														vLst17.Set(f_iva, "")
														If vLst17.Get(f_data) = "" Then
														End If
														vLst17.Set(f_data, "")
														vLst17.Set(f_data, "")
														If vLst17.Get(f_movi) = "" Then
														End If
														vLst17.Set(f_movi, "")
														vLst17.Set(f_movi, "")
														If vLst17.Get(f_cart) = "" Then
														End If
														vLst17.Set(f_cart, "")
														vLst17.Set(f_cart, "")
														If vLst17.Get(f_cli) = "" Then
														End If
														vLst17.Set(f_cli, "")
														vLst17.Set(f_cli, "")
														If vLst17.Get(f_descli) = "" Then
														End If
														vLst17.Set(f_descli, "")
														vLst17.Set(f_descli, "")
														If vLst17.Get(f_oper) = "" Then
														End If
														vLst17.Set(f_oper, "")
														vLst17.Set(f_oper, "")
														If vLst17.Get(f_dart) = "" Then
														End If
														vLst17.Set(f_dart, "")
														vLst17.Set(f_dart, "")
														If vLst17.Get(f_docu) = "" Then
														End If
														vLst17.Set(f_docu, "")
														vLst17.Set(f_docu, "")
														If vLst17.Get(f_caus) = "" Then
														End If
														vLst17.Set(f_caus, "")
														vLst17.Set(f_caus, "")
													End If
													z5 = True
													buttonWrapper16.Visible = z5
													If Stampe.vInt1 <> s_iva Then
													End If
													z6 = False
													Cliente.Visible = z6
													If Stampe.vInt1 <> s_iva Then
													End If
													z7 = False
													DesCliente.Visible = z7
													If Stampe.vInt1 <> s_reparti Then
													End If
													z8 = True
													Operatore.Visible = z8
													If Stampe.vInt1 <> s_iva Then
													End If
													z9 = False
													Causale.Visible = z9
													If Stampe.vInt1 <> s_iva Then
													End If
													z10 = False
													Movimento.Visible = z10
													If Stampe.vInt1 <> s_iva Then
													End If
													z11 = False
													dMovimento.Visible = z11
													dData.Visible = Main.vStr15 <> "Venduto"
													If Stampe.vInt1 <> s_iva Then
													End If
													If Stampe.vInt1 <> s_repartig Then
													End If
													z12 = True
													dReparto.Visible = z12
													If Stampe.vInt1 <> s_iva Then
													End If
													If Stampe.vInt1 <> s_repartig Then
													End If
													z13 = True
													dIva.Visible = z13
													If Stampe.vInt1 <> s_iva Then
													End If
													z14 = False
													dDocumento.Visible = z14
													If Stampe.vInt1 <> s_iva Then
													End If
													If Stampe.vInt1 <> s_repartig Then
													End If
													z15 = True
													dCarticolo.Visible = z15
													If Stampe.vInt1 <> s_iva Then
													End If
													If Stampe.vInt1 <> s_repartig Then
													End If
													z16 = True
													dDarticolo.Visible = z16
													If Stampe.vInt1 <> s_iva Then
													End If
													z17 = False
													dCliente.Visible = z17
													If Stampe.vInt1 <> s_iva Then
													End If
													If Stampe.vInt1 <> s_repartig Then
													End If
													z18 = True
													dOperatore.Visible = z18
													If Stampe.vInt1 <> s_iva Then
													End If
													z19 = False
													dDesCliente.Visible = z19
													If Stampe.vInt1 <> s_iva Then
													End If
													z20 = False
													dCausale.Visible = z20
													Select Stampe.vInt1
													End Select
													If vLst17.Get(f_rep) = "" Then
													End If
													vLst17.Set(f_rep, "")
													vLst17.Set(f_rep, "")
													If vLst17.Get(f_iva) = "" Then
													End If
													vLst17.Set(f_iva, "")
													vLst17.Set(f_iva, "")
													If vLst17.Get(f_data) = "" Then
													End If
													vLst17.Set(f_data, "")
													vLst17.Set(f_data, "")
													If vLst17.Get(f_movi) = "" Then
													End If
													vLst17.Set(f_movi, "")
													vLst17.Set(f_movi, "")
													If vLst17.Get(f_cart) = "" Then
													End If
													vLst17.Set(f_cart, "")
													vLst17.Set(f_cart, "")
													If vLst17.Get(f_cli) = "" Then
													End If
													vLst17.Set(f_cli, "")
													vLst17.Set(f_cli, "")
													If vLst17.Get(f_descli) = "" Then
													End If
													vLst17.Set(f_descli, "")
													vLst17.Set(f_descli, "")
													If vLst17.Get(f_oper) = "" Then
													End If
													vLst17.Set(f_oper, "")
													vLst17.Set(f_oper, "")
													If vLst17.Get(f_dart) = "" Then
													End If
													vLst17.Set(f_dart, "")
													vLst17.Set(f_dart, "")
													If vLst17.Get(f_docu) = "" Then
													End If
													vLst17.Set(f_docu, "")
													vLst17.Set(f_docu, "")
													If vLst17.Get(f_caus) = "" Then
													End If
													vLst17.Set(f_caus, "")
													vLst17.Set(f_caus, "")
												End If
												z4 = True
												buttonWrapper15.Visible = z4
												If Stampe.vInt1 <> s_iva Then
												End If
												If Stampe.vInt1 <> s_repartig Then
												End If
												z5 = True
												DArticolo.Visible = z5
												If Stampe.vInt1 <> s_iva Then
												End If
												z6 = False
												Cliente.Visible = z6
												If Stampe.vInt1 <> s_iva Then
												End If
												z7 = False
												DesCliente.Visible = z7
												If Stampe.vInt1 <> s_reparti Then
												End If
												z8 = True
												Operatore.Visible = z8
												If Stampe.vInt1 <> s_iva Then
												End If
												z9 = False
												Causale.Visible = z9
												If Stampe.vInt1 <> s_iva Then
												End If
												z10 = False
												Movimento.Visible = z10
												If Stampe.vInt1 <> s_iva Then
												End If
												z11 = False
												dMovimento.Visible = z11
												dData.Visible = Main.vStr15 <> "Venduto"
												If Stampe.vInt1 <> s_iva Then
												End If
												If Stampe.vInt1 <> s_repartig Then
												End If
												z12 = True
												dReparto.Visible = z12
												If Stampe.vInt1 <> s_iva Then
												End If
												If Stampe.vInt1 <> s_repartig Then
												End If
												z13 = True
												dIva.Visible = z13
												If Stampe.vInt1 <> s_iva Then
												End If
												z14 = False
												dDocumento.Visible = z14
												If Stampe.vInt1 <> s_iva Then
												End If
												If Stampe.vInt1 <> s_repartig Then
												End If
												z15 = True
												dCarticolo.Visible = z15
												If Stampe.vInt1 <> s_iva Then
												End If
												If Stampe.vInt1 <> s_repartig Then
												End If
												z16 = True
												dDarticolo.Visible = z16
												If Stampe.vInt1 <> s_iva Then
												End If
												z17 = False
												dCliente.Visible = z17
												If Stampe.vInt1 <> s_iva Then
												End If
												If Stampe.vInt1 <> s_repartig Then
												End If
												z18 = True
												dOperatore.Visible = z18
												If Stampe.vInt1 <> s_iva Then
												End If
												z19 = False
												dDesCliente.Visible = z19
												If Stampe.vInt1 <> s_iva Then
												End If
												z20 = False
												dCausale.Visible = z20
												Select Stampe.vInt1
												End Select
												If vLst17.Get(f_rep) = "" Then
												End If
												vLst17.Set(f_rep, "")
												vLst17.Set(f_rep, "")
												If vLst17.Get(f_iva) = "" Then
												End If
												vLst17.Set(f_iva, "")
												vLst17.Set(f_iva, "")
												If vLst17.Get(f_data) = "" Then
												End If
												vLst17.Set(f_data, "")
												vLst17.Set(f_data, "")
												If vLst17.Get(f_movi) = "" Then
												End If
												vLst17.Set(f_movi, "")
												vLst17.Set(f_movi, "")
												If vLst17.Get(f_cart) = "" Then
												End If
												vLst17.Set(f_cart, "")
												vLst17.Set(f_cart, "")
												If vLst17.Get(f_cli) = "" Then
												End If
												vLst17.Set(f_cli, "")
												vLst17.Set(f_cli, "")
												If vLst17.Get(f_descli) = "" Then
												End If
												vLst17.Set(f_descli, "")
												vLst17.Set(f_descli, "")
												If vLst17.Get(f_oper) = "" Then
												End If
												vLst17.Set(f_oper, "")
												vLst17.Set(f_oper, "")
												If vLst17.Get(f_dart) = "" Then
												End If
												vLst17.Set(f_dart, "")
												vLst17.Set(f_dart, "")
												If vLst17.Get(f_docu) = "" Then
												End If
												vLst17.Set(f_docu, "")
												vLst17.Set(f_docu, "")
												If vLst17.Get(f_caus) = "" Then
												End If
												vLst17.Set(f_caus, "")
												vLst17.Set(f_caus, "")
											End If
										End If
									End If
									z3 = False
									buttonWrapper14.Visible = z3
									If Stampe.vInt1 <> s_iva Then
									End If
									If Stampe.vInt1 <> s_repartig Then
									End If
									z4 = True
									CArticolo.Visible = z4
									If Stampe.vInt1 <> s_iva Then
									End If
									If Stampe.vInt1 <> s_repartig Then
									End If
									z5 = True
									DArticolo.Visible = z5
									If Stampe.vInt1 <> s_iva Then
									End If
									z6 = False
									Cliente.Visible = z6
									If Stampe.vInt1 <> s_iva Then
									End If
									z7 = False
									DesCliente.Visible = z7
									If Stampe.vInt1 <> s_reparti Then
									End If
									z8 = True
									Operatore.Visible = z8
									If Stampe.vInt1 <> s_iva Then
									End If
									z9 = False
									Causale.Visible = z9
									If Stampe.vInt1 <> s_iva Then
									End If
									z10 = False
									Movimento.Visible = z10
									If Stampe.vInt1 <> s_iva Then
									End If
									z11 = False
									dMovimento.Visible = z11
									dData.Visible = Main.vStr15 <> "Venduto"
									If Stampe.vInt1 <> s_iva Then
									End If
									If Stampe.vInt1 <> s_repartig Then
									End If
									z12 = True
									dReparto.Visible = z12
									If Stampe.vInt1 <> s_iva Then
									End If
									If Stampe.vInt1 <> s_repartig Then
									End If
									z13 = True
									dIva.Visible = z13
									If Stampe.vInt1 <> s_iva Then
									End If
									z14 = False
									dDocumento.Visible = z14
									If Stampe.vInt1 <> s_iva Then
									End If
									If Stampe.vInt1 <> s_repartig Then
									End If
									z15 = True
									dCarticolo.Visible = z15
									If Stampe.vInt1 <> s_iva Then
									End If
									If Stampe.vInt1 <> s_repartig Then
									End If
									z16 = True
									dDarticolo.Visible = z16
									If Stampe.vInt1 <> s_iva Then
									End If
									z17 = False
									dCliente.Visible = z17
									If Stampe.vInt1 <> s_iva Then
									End If
									If Stampe.vInt1 <> s_repartig Then
									End If
									z18 = True
									dOperatore.Visible = z18
									If Stampe.vInt1 <> s_iva Then
									End If
									z19 = False
									dDesCliente.Visible = z19
									If Stampe.vInt1 <> s_iva Then
									End If
									z20 = False
									dCausale.Visible = z20
									Select Stampe.vInt1
									End Select
									If vLst17.Get(f_rep) = "" Then
									End If
									vLst17.Set(f_rep, "")
									vLst17.Set(f_rep, "")
									If vLst17.Get(f_iva) = "" Then
									End If
									vLst17.Set(f_iva, "")
									vLst17.Set(f_iva, "")
									If vLst17.Get(f_data) = "" Then
									End If
									vLst17.Set(f_data, "")
									vLst17.Set(f_data, "")
									If vLst17.Get(f_movi) = "" Then
									End If
									vLst17.Set(f_movi, "")
									vLst17.Set(f_movi, "")
									If vLst17.Get(f_cart) = "" Then
									End If
									vLst17.Set(f_cart, "")
									vLst17.Set(f_cart, "")
									If vLst17.Get(f_cli) = "" Then
									End If
									vLst17.Set(f_cli, "")
									vLst17.Set(f_cli, "")
									If vLst17.Get(f_descli) = "" Then
									End If
									vLst17.Set(f_descli, "")
									vLst17.Set(f_descli, "")
									If vLst17.Get(f_oper) = "" Then
									End If
									vLst17.Set(f_oper, "")
									vLst17.Set(f_oper, "")
									If vLst17.Get(f_dart) = "" Then
									End If
									vLst17.Set(f_dart, "")
									vLst17.Set(f_dart, "")
									If vLst17.Get(f_docu) = "" Then
									End If
									vLst17.Set(f_docu, "")
									vLst17.Set(f_docu, "")
									If vLst17.Get(f_caus) = "" Then
									End If
									vLst17.Set(f_caus, "")
									vLst17.Set(f_caus, "")
								End If
							End If
							z2 = True
							buttonWrapper13.Visible = z2
							If Stampe.vInt1 <> s_iva Then
							End If
							z3 = False
							Documento.Visible = z3
							If Stampe.vInt1 <> s_iva Then
							End If
							If Stampe.vInt1 <> s_repartig Then
							End If
							z4 = True
							CArticolo.Visible = z4
							If Stampe.vInt1 <> s_iva Then
							End If
							If Stampe.vInt1 <> s_repartig Then
							End If
							z5 = True
							DArticolo.Visible = z5
							If Stampe.vInt1 <> s_iva Then
							End If
							z6 = False
							Cliente.Visible = z6
							If Stampe.vInt1 <> s_iva Then
							End If
							z7 = False
							DesCliente.Visible = z7
							If Stampe.vInt1 <> s_reparti Then
							End If
							z8 = True
							Operatore.Visible = z8
							If Stampe.vInt1 <> s_iva Then
							End If
							z9 = False
							Causale.Visible = z9
							If Stampe.vInt1 <> s_iva Then
							End If
							z10 = False
							Movimento.Visible = z10
							If Stampe.vInt1 <> s_iva Then
							End If
							z11 = False
							dMovimento.Visible = z11
							dData.Visible = Main.vStr15 <> "Venduto"
							If Stampe.vInt1 <> s_iva Then
							End If
							If Stampe.vInt1 <> s_repartig Then
							End If
							z12 = True
							dReparto.Visible = z12
							If Stampe.vInt1 <> s_iva Then
							End If
							If Stampe.vInt1 <> s_repartig Then
							End If
							z13 = True
							dIva.Visible = z13
							If Stampe.vInt1 <> s_iva Then
							End If
							z14 = False
							dDocumento.Visible = z14
							If Stampe.vInt1 <> s_iva Then
							End If
							If Stampe.vInt1 <> s_repartig Then
							End If
							z15 = True
							dCarticolo.Visible = z15
							If Stampe.vInt1 <> s_iva Then
							End If
							If Stampe.vInt1 <> s_repartig Then
							End If
							z16 = True
							dDarticolo.Visible = z16
							If Stampe.vInt1 <> s_iva Then
							End If
							z17 = False
							dCliente.Visible = z17
							If Stampe.vInt1 <> s_iva Then
							End If
							If Stampe.vInt1 <> s_repartig Then
							End If
							z18 = True
							dOperatore.Visible = z18
							If Stampe.vInt1 <> s_iva Then
							End If
							z19 = False
							dDesCliente.Visible = z19
							If Stampe.vInt1 <> s_iva Then
							End If
							z20 = False
							dCausale.Visible = z20
							Select Stampe.vInt1
							End Select
							If vLst17.Get(f_rep) = "" Then
							End If
							vLst17.Set(f_rep, "")
							vLst17.Set(f_rep, "")
							If vLst17.Get(f_iva) = "" Then
							End If
							vLst17.Set(f_iva, "")
							vLst17.Set(f_iva, "")
							If vLst17.Get(f_data) = "" Then
							End If
							vLst17.Set(f_data, "")
							vLst17.Set(f_data, "")
							If vLst17.Get(f_movi) = "" Then
							End If
							vLst17.Set(f_movi, "")
							vLst17.Set(f_movi, "")
							If vLst17.Get(f_cart) = "" Then
							End If
							vLst17.Set(f_cart, "")
							vLst17.Set(f_cart, "")
							If vLst17.Get(f_cli) = "" Then
							End If
							vLst17.Set(f_cli, "")
							vLst17.Set(f_cli, "")
							If vLst17.Get(f_descli) = "" Then
							End If
							vLst17.Set(f_descli, "")
							vLst17.Set(f_descli, "")
							If vLst17.Get(f_oper) = "" Then
							End If
							vLst17.Set(f_oper, "")
							vLst17.Set(f_oper, "")
							If vLst17.Get(f_dart) = "" Then
							End If
							vLst17.Set(f_dart, "")
							vLst17.Set(f_dart, "")
							If vLst17.Get(f_docu) = "" Then
							End If
							vLst17.Set(f_docu, "")
							vLst17.Set(f_docu, "")
							If vLst17.Get(f_caus) = "" Then
							End If
							vLst17.Set(f_caus, "")
							vLst17.Set(f_caus, "")
						End If
					End If
					z = True
					buttonWrapper12.Visible = z
					If Stampe.vInt1 <> s_iva Then
					End If
					If Stampe.vInt1 <> s_repartig Then
					End If
					z2 = True
					Iva.Visible = z2
					If Stampe.vInt1 <> s_iva Then
					End If
					z3 = False
					Documento.Visible = z3
					If Stampe.vInt1 <> s_iva Then
					End If
					If Stampe.vInt1 <> s_repartig Then
					End If
					z4 = True
					CArticolo.Visible = z4
					If Stampe.vInt1 <> s_iva Then
					End If
					If Stampe.vInt1 <> s_repartig Then
					End If
					z5 = True
					DArticolo.Visible = z5
					If Stampe.vInt1 <> s_iva Then
					End If
					z6 = False
					Cliente.Visible = z6
					If Stampe.vInt1 <> s_iva Then
					End If
					z7 = False
					DesCliente.Visible = z7
					If Stampe.vInt1 <> s_reparti Then
					End If
					z8 = True
					Operatore.Visible = z8
					If Stampe.vInt1 <> s_iva Then
					End If
					z9 = False
					Causale.Visible = z9
					If Stampe.vInt1 <> s_iva Then
					End If
					z10 = False
					Movimento.Visible = z10
					If Stampe.vInt1 <> s_iva Then
					End If
					z11 = False
					dMovimento.Visible = z11
					dData.Visible = Main.vStr15 <> "Venduto"
					If Stampe.vInt1 <> s_iva Then
					End If
					If Stampe.vInt1 <> s_repartig Then
					End If
					z12 = True
					dReparto.Visible = z12
					If Stampe.vInt1 <> s_iva Then
					End If
					If Stampe.vInt1 <> s_repartig Then
					End If
					z13 = True
					dIva.Visible = z13
					If Stampe.vInt1 <> s_iva Then
					End If
					z14 = False
					dDocumento.Visible = z14
					If Stampe.vInt1 <> s_iva Then
					End If
					If Stampe.vInt1 <> s_repartig Then
					End If
					z15 = True
					dCarticolo.Visible = z15
					If Stampe.vInt1 <> s_iva Then
					End If
					If Stampe.vInt1 <> s_repartig Then
					End If
					z16 = True
					dDarticolo.Visible = z16
					If Stampe.vInt1 <> s_iva Then
					End If
					z17 = False
					dCliente.Visible = z17
					If Stampe.vInt1 <> s_iva Then
					End If
					If Stampe.vInt1 <> s_repartig Then
					End If
					z18 = True
					dOperatore.Visible = z18
					If Stampe.vInt1 <> s_iva Then
					End If
					z19 = False
					dDesCliente.Visible = z19
					If Stampe.vInt1 <> s_iva Then
					End If
					z20 = False
					dCausale.Visible = z20
					Select Stampe.vInt1
					End Select
					If vLst17.Get(f_rep) = "" Then
					End If
					vLst17.Set(f_rep, "")
					vLst17.Set(f_rep, "")
					If vLst17.Get(f_iva) = "" Then
					End If
					vLst17.Set(f_iva, "")
					vLst17.Set(f_iva, "")
					If vLst17.Get(f_data) = "" Then
					End If
					vLst17.Set(f_data, "")
					vLst17.Set(f_data, "")
					If vLst17.Get(f_movi) = "" Then
					End If
					vLst17.Set(f_movi, "")
					vLst17.Set(f_movi, "")
					If vLst17.Get(f_cart) = "" Then
					End If
					vLst17.Set(f_cart, "")
					vLst17.Set(f_cart, "")
					If vLst17.Get(f_cli) = "" Then
					End If
					vLst17.Set(f_cli, "")
					vLst17.Set(f_cli, "")
					If vLst17.Get(f_descli) = "" Then
					End If
					vLst17.Set(f_descli, "")
					vLst17.Set(f_descli, "")
					If vLst17.Get(f_oper) = "" Then
					End If
					vLst17.Set(f_oper, "")
					vLst17.Set(f_oper, "")
					If vLst17.Get(f_dart) = "" Then
					End If
					vLst17.Set(f_dart, "")
					vLst17.Set(f_dart, "")
					If vLst17.Get(f_docu) = "" Then
					End If
					vLst17.Set(f_docu, "")
					vLst17.Set(f_docu, "")
					If vLst17.Get(f_caus) = "" Then
					End If
					vLst17.Set(f_caus, "")
					vLst17.Set(f_caus, "")
				End If
				Dim vPerYToCurrent As Int = PerYToCurrent(1)
				If Data.Visible Then
					Data.Top = vPerYToCurrent
					dData.Top = vPerYToCurrent
					vPerYToCurrent = vPerYToCurrent + PerYToCurrent(7)
				End If
				If Movimento.Visible Then
					Movimento.Top = vPerYToCurrent
					dMovimento.Top = vPerYToCurrent
					vPerYToCurrent = vPerYToCurrent + PerYToCurrent(7)
				End If
				If Documento.Visible Then
					Documento.Top = vPerYToCurrent
					dDocumento.Top = vPerYToCurrent
					vPerYToCurrent = vPerYToCurrent + PerYToCurrent(7)
				End If
				If CArticolo.Visible Then
					CArticolo.Top = vPerYToCurrent
					dCarticolo.Top = vPerYToCurrent
					vPerYToCurrent = vPerYToCurrent + PerYToCurrent(7)
				End If
				If DArticolo.Visible Then
					DArticolo.Top = vPerYToCurrent
					dDarticolo.Top = vPerYToCurrent
					vPerYToCurrent = vPerYToCurrent + PerYToCurrent(7)
				End If
				If Cliente.Visible Then
					Cliente.Top = vPerYToCurrent
					dCliente.Top = vPerYToCurrent
					vPerYToCurrent = vPerYToCurrent + PerYToCurrent(7)
				End If
				If DesCliente.Visible Then
					DesCliente.Top = vPerYToCurrent
					dDesCliente.Top = vPerYToCurrent
					vPerYToCurrent = vPerYToCurrent + PerYToCurrent(7)
				End If
				If Reparto.Visible Then
					Reparto.Top = vPerYToCurrent
					dReparto.Top = vPerYToCurrent
					vPerYToCurrent = vPerYToCurrent + PerYToCurrent(7)
				End If
				If Causale.Visible Then
					Causale.Top = vPerYToCurrent
					dCausale.Top = vPerYToCurrent
					vPerYToCurrent = vPerYToCurrent + PerYToCurrent(7)
				End If
				If Iva.Visible Then
					Iva.Top = vPerYToCurrent
					dIva.Top = vPerYToCurrent
					vPerYToCurrent = vPerYToCurrent + PerYToCurrent(7)
				End If
				If Operatore.Visible Then
					Operatore.Top = vPerYToCurrent
					dOperatore.Top = vPerYToCurrent
					Dim vPerYToCurrent2 As Int = vPerYToCurrent + PerYToCurrent(7)
				End If
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub Annulla_Click
	If Not(Main.v_riducimsg) Then
		Dim vObjectToCharSequence As Object = "Attenzione ... eventuali modifiche verranno annullate ..." & CRLF & "Si desidera proseguire ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			Return
		End If
	End If
	If Main.vBln44 Then
		vBln1 = True
		Main.vStr22 = "-"
		mod1.Sub198("Main")
	Else
		vBln1 = True
		mod1.Sub198("Stampe")
	End If
	Activity.Finish
End Sub

Sub AnnullaList_Click
	PnlList.Visible = False
End Sub

Sub CArticolo_Click
	Dim str As String
	CArticolo.Tag = ""
	CArticolo.Text = "Codice Articolo"
	CArticolo.Background = mod1.Sub155(-3355444, 40)
	Dim vInputList1 As Int = idLib.InputList1(vLst1, "Selezionare il Tipo di Filtro:")
	If vInputList1 >= 0 Then
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 2
		vDlg1.Input = ""
		vDlg1.PasswordMode = False
		vDlg1.Hint = "Codice Articolo"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow As Int = vDlg1.Show("Inserire il codice dell'articolo ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And vDlg1.Input.Length > 0 And vDlg1.Input.Length < 20 Then
			CArticolo.Background = mod1.Sub155(-2520695, 40)
			Dim vObjectToString As String = vLst1.Get(vInputList1)
			Dim str3 As String = "'"
			If vInputList1 <> 0 Then
				str = ""
			Else
				str = " = '"
			End If
			If vInputList1 = 1 Then
				str = " <> '"
			End If
			If vInputList1 = 2 Then
				str = " like '%"
				str3 = "%'"
			End If
			CArticolo.Tag = vStr1 & "codint " & str & vDlg1.Input & str3 & " and "
			CArticolo.Text = "Codice Art. " & vObjectToString & " " & vDlg1.Input
		End If
	End If
	mod1.Sub081
End Sub

Sub Causale_Click
	Dim vInputList1 As Int = idLib.InputList1(vLst2, "Selezionare il Tipo di Filtro:")
	If vInputList1 >= 0 Then
		Dim vObjectToString As String = vLst2.Get(vInputList1)
		Dim str As String = IIf(vObjectToString = "Diverso", "<>", vObjectToString)
		Dim vInputList12 As Int = idLib.InputList1(vLst12, "Causale di Magazzino " & vObjectToString)
		If vInputList12 >= 0 Then
			Causale.Text = "Causale Mag. " & vObjectToString & " " & vLst12.Get(vInputList12)
			If vInputList12 = 0 Then
				Causale.Tag = " causale " & str & " 'sc' and "
			End If
			If vInputList12 = 1 Then
				Causale.Tag = " causale " & str & " 'ca' and "
			End If
			If vInputList12 = 2 Then
				Causale.Tag = " causale " & str & " 're' and "
			End If
			If vInputList12 = 3 Then
				Causale.Tag = " causale " & str & " 'au' and "
			End If
			If vInputList12 = 4 Then
				Causale.Tag = " causale " & str & " 'rf' and "
			End If
			If vInputList12 = 5 Then
				Causale.Tag = " causale " & str & " 'in' and "
			End If
			If vInputList12 = 6 Then
				Causale.Tag = " causale " & str & " 'pr' and "
			End If
			Causale.Background = mod1.Sub155(-2520695, 40)
		End If
	End If
	mod1.Sub081
End Sub

Sub Cliente_Click
	Dim str As String
	Cliente.Tag = ""
	Cliente.Text = "Cliente"
	Cliente.Background = mod1.Sub155(-3355444, 40)
	Dim vInputList1 As Int = idLib.InputList1(vLst3, "Selezionare il Tipo di Filtro:")
	If vInputList1 >= 0 Then
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 2
		vDlg1.Input = ""
		vDlg1.PasswordMode = False
		vDlg1.Hint = "Codice Cliente"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow As Int = vDlg1.Show("Inserire il codice del cliente ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And vDlg1.Input.Length > 0 And vDlg1.Input.Length < 20 Then
			Cliente.Background = mod1.Sub155(-2520695, 40)
			Dim vObjectToString As String = vLst3.Get(vInputList1)
			Dim str3 As String = "'"
			If vInputList1 <> 0 Then
				str = ""
			Else
				str = " = '"
			End If
			If vInputList1 = 1 Then
				str = " <> '"
			End If
			If vInputList1 = 2 Then
				str = " like '%"
				str3 = "%'"
			End If
			Cliente.Tag = vStr1 & "cliente " & str & vDlg1.Input & str3 & " and "
			Cliente.Text = "Codice Cliente " & vObjectToString & " " & vDlg1.Input
		End If
	End If
	mod1.Sub081
End Sub

Sub Sub001(str As String, str2 As String, i As Int) As Panel
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		panelWrapper.Background = mod1.Sub158(-1, Colors.RGB(222, 222, 222))
		Dim checkBoxWrapper As CheckBox
		checkBoxWrapper.Initialize("")
		checkBoxWrapper.Gravity = Bit.Or(16, 3)
		checkBoxWrapper.Text = str2
		checkBoxWrapper.TextColor = -16777216
		checkBoxWrapper.TextSize = 16
		checkBoxWrapper.Background = mod1.Sub158(-1, Colors.RGB(222, 222, 222))
		checkBoxWrapper.Tag = str
		panelWrapper.AddView(checkBoxWrapper, PerXToCurrent(2), DipToCurrent(2), PerXToCurrent(80), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub DArticolo_Click
	Dim str As String
	DArticolo.Tag = ""
	DArticolo.Text = "Descrizione Articolo"
	DArticolo.Background = mod1.Sub155(-3355444, 40)
	Dim vInputList1 As Int = idLib.InputList1(vLst4, "Selezionare il Tipo di Filtro:")
	If vInputList1 >= 0 Then
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 1
		vDlg1.Input = ""
		vDlg1.PasswordMode = False
		vDlg1.Hint = "Descrizione Articolo"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow As Int = vDlg1.Show("Inserire la descrizione dell'articolo ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And vDlg1.Input.Length > 0 And vDlg1.Input.Length < 20 Then
			DArticolo.Background = mod1.Sub155(-2520695, 40)
			Dim vObjectToString As String = vLst4.Get(vInputList1)
			Dim str3 As String = "'"
			If vInputList1 <> 0 Then
				str = ""
			Else
				str = " = '"
			End If
			If vInputList1 = 1 Then
				str = " <> '"
			End If
			If vInputList1 = 2 Then
				str = " like '%"
				str3 = "%'"
			End If
			DArticolo.Tag = vStr1 & "descrizione " & str & mod1.Sub209(vDlg1.Input) & str3 & " and "
			DArticolo.Text = "Descrizione Art. " & vObjectToString & " " & mod1.Sub209(vDlg1.Input)
		End If
	End If
	mod1.Sub081
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/filtro.java, metodo _data_click (riga 4148).
Sub Data_Click
	Dim str As String
	Dim dateDialog As DateDialog
	Dim dateDialog2 As DateDialog
	Data.Tag = ""
	Data.Text = "Data"
	Data.Background = mod1.Sub155(-3355444, 40)
	Dim vInputList1 As Int = idLib.InputList1(vLst7, "Selezionare il Tipo di Filtro:")
	If vInputList1 >= 0 Then
		If Main.vStr15 <> "Venduto" Then
			If Main.v_iniziogiorno > 0 Then
				str = " " & NumberFormat(Main.v_iniziogiorno, 2, 0) & ":00:00"
				Select vInputList1
					Case 0, 3, 4, 5
						dateDialog.Year = DateTime.GetYear(mod1.Sub058)
						dateDialog.Month = DateTime.GetMonth(mod1.Sub058)
						dateDialog.DayOfMonth = DateTime.GetDayOfMonth(mod1.Sub058)
						Dim vShow As Int = dateDialog.Show("Impostare la data ", "Filtro Data", "Ok", "Annulla", "", Main.vBmp1)
						If vShow = -1 Then
							Data.Background = mod1.Sub155(-2520695, 40)
							Dim vObjectToString As String = vLst7.Get(vInputList1)
							If vInputList1 = 0 Then
								Dim setdate As Long = DateUtils.setdate(dateDialog.Year, dateDialog.Month, dateDialog.DayOfMonth)
								Dim periodVar As Period
								periodVar.Days = 1
								Dim addperiod As Long = DateUtils.addperiod(setdate, periodVar)
								Data.Tag = " datam3 > '" & dateDialog.Year & "-" & NumberFormat(dateDialog.Month, 2, 0) & "-" & NumberFormat(dateDialog.DayOfMonth, 2, 0) & str & "' and datam3 < '" & NumberFormat2(DateTime.GetYear(addperiod), 4, 0, 0, False) & "-" & NumberFormat(DateTime.GetMonth(addperiod), 2, 0) & "-" & NumberFormat(DateTime.GetDayOfMonth(addperiod), 2, 0) & str & "' and "
							Else If vInputList1 = 3 Then
								Dim setdate2 As Long = DateUtils.setdate(dateDialog.Year, dateDialog.Month, dateDialog.DayOfMonth)
								Dim periodVar2 As Period
								periodVar2.Days = 1
								Dim addperiod2 As Long = DateUtils.addperiod(setdate2, periodVar2)
								Data.Tag = "( datam3 < '" & dateDialog.Year & "-" & NumberFormat(dateDialog.Month, 2, 0) & "-" & NumberFormat(dateDialog.DayOfMonth, 2, 0) & str & "' or datam3 > '" & NumberFormat2(DateTime.GetYear(addperiod2), 4, 0, 0, False) & "-" & NumberFormat(DateTime.GetMonth(addperiod2), 2, 0) & "-" & NumberFormat(DateTime.GetDayOfMonth(addperiod2), 2, 0) & str & "') and "
							Else
								If vInputList1 = 4 Then
									Dim setdate3 As Long = DateUtils.setdate(dateDialog.Year, dateDialog.Month, dateDialog.DayOfMonth)
									Dim periodVar3 As Period
									periodVar3.Days = 1
									Dim addperiod3 As Long = DateUtils.addperiod(setdate3, periodVar3)
									Data.Tag = " datam3  " & " > " & "'" & DateTime.GetYear(addperiod3) & "-" & NumberFormat(DateTime.GetMonth(addperiod3), 2, 0) & "-" & NumberFormat(DateTime.GetDayOfMonth(addperiod3), 2, 0) & str & "' and "
								End If
								If vInputList1 = 5 Then
									Data.Tag = " datam3   < '" & dateDialog.Year & "-" & NumberFormat(dateDialog.Month, 2, 0) & "-" & NumberFormat(dateDialog.DayOfMonth, 2, 0) & str & "' and "
								End If
							End If
							Data.Text = "Data " & vObjectToString & " " & NumberFormat(dateDialog.DayOfMonth, 2, 0) & "/" & NumberFormat(dateDialog.Month, 2, 0) & "/" & dateDialog.Year
						End If
					Case 1, 2
						Dim periodVar4 As Period
						periodVar4.Days = IIf(vInputList1 = 1, 0, -1)
						Dim addperiod4 As Long = DateUtils.addperiod(mod1.Sub058, periodVar4)
						periodVar4.Days = IIf(vInputList1 = 1, 1, 0)
						Dim addperiod5 As Long = DateUtils.addperiod(mod1.Sub058, periodVar4)
						Data.Tag = " datam3 > '" & NumberFormat2(DateTime.GetYear(addperiod4), 4, 0, 0, False) & "-" & NumberFormat(DateTime.GetMonth(addperiod4), 2, 0) & "-" & NumberFormat(DateTime.GetDayOfMonth(addperiod4), 2, 0) & str & "' and datam3 < '" & NumberFormat2(DateTime.GetYear(addperiod5), 4, 0, 0, False) & "-" & NumberFormat(DateTime.GetMonth(addperiod5), 2, 0) & "-" & NumberFormat(DateTime.GetDayOfMonth(addperiod5), 2, 0) & str & "' and "
						Data.Text = "Data uguale a " & NumberFormat(DateTime.GetDayOfMonth(addperiod4), 2, 0) & "/" & NumberFormat(DateTime.GetMonth(addperiod4), 2, 0) & "/" & DateTime.GetYear(addperiod4)
						Data.Background = mod1.Sub155(-2520695, 40)
					Case 6
						dateDialog.Year = DateTime.GetYear(mod1.Sub058)
						dateDialog.Month = DateTime.GetMonth(mod1.Sub058)
						dateDialog.DayOfMonth = DateTime.GetDayOfMonth(mod1.Sub058)
						Dim vShow2 As Int = dateDialog.Show("Impostare la data di inizio ricerca ", "Filtro Data", "Ok", "Annulla", "", Main.vBmp1)
						If vShow2 = -1 Then
							dateDialog2.Year = DateTime.GetYear(mod1.Sub058)
							dateDialog2.Month = DateTime.GetMonth(mod1.Sub058)
							dateDialog2.DayOfMonth = DateTime.GetDayOfMonth(mod1.Sub058)
							Dim vShow3 As Int = dateDialog2.Show("Impostare la data di fine ricerca ", "Filtro Data", "Ok", "Annulla", "", Main.vBmp1)
							If vShow3 = -1 Then
								Dim setdate4 As Long = DateUtils.setdate(dateDialog2.Year, dateDialog2.Month, dateDialog2.DayOfMonth)
								Dim periodVar5 As Period
								periodVar5.Days = 1
								Dim addperiod6 As Long = DateUtils.addperiod(setdate4, periodVar5)
								Data.Background = mod1.Sub155(-2520695, 40)
								Data.Tag = " datam3 > '" & dateDialog.Year & "-" & NumberFormat(dateDialog.Month, 2, 0) & "-" & NumberFormat(dateDialog.DayOfMonth, 2, 0) & str & "' and datam3 < '" & NumberFormat2(DateTime.GetYear(addperiod6), 4, 0, 0, False) & "-" & NumberFormat(DateTime.GetMonth(addperiod6), 2, 0) & "-" & NumberFormat(DateTime.GetDayOfMonth(addperiod6), 2, 0) & str & "' and "
								Data.Text = "Data tra " & dateDialog.DayOfMonth & "/" & dateDialog.Month & "/" & dateDialog.Year & " e " & dateDialog2.DayOfMonth & "/" & dateDialog2.Month & "/" & dateDialog2.Year
							End If
						End If
				End Select
			End If
		End If
		str = " 00:00:00"
		Select vInputList1
		End Select
	End If
	mod1.Sub081
End Sub

Sub dData_Click
	Select Sender.Tag
		Case "dat"
			Data.Text = "Data "
			Data.Tag = ""
			Data.Background = mod1.Sub155(-3355444, 40)
		Case "mov"
			Movimento.Text = "Movimento "
			Movimento.Tag = ""
			Movimento.Background = mod1.Sub155(-3355444, 40)
		Case "doc"
			Documento.Text = "Documento "
			Documento.Tag = ""
			Documento.Background = mod1.Sub155(-3355444, 40)
		Case "car"
			CArticolo.Text = "Codice Articolo "
			CArticolo.Tag = ""
			CArticolo.Background = mod1.Sub155(-3355444, 40)
		Case "dar"
			DArticolo.Text = "Descrizione Articolo "
			DArticolo.Tag = ""
			DArticolo.Background = mod1.Sub155(-3355444, 40)
		Case "cli"
			Cliente.Text = "Cliente "
			Cliente.Tag = ""
			Cliente.Background = mod1.Sub155(-3355444, 40)
		Case "descli"
			DesCliente.Text = "Descrizione Cliente "
			DesCliente.Tag = ""
			DesCliente.Background = mod1.Sub155(-3355444, 40)
		Case "rep"
			Reparto.Text = "Reparto "
			Reparto.Tag = ""
			Reparto.Background = mod1.Sub155(-3355444, 40)
		Case "iva"
			Iva.Text = "Iva "
			Iva.Tag = ""
			Iva.Background = mod1.Sub155(-3355444, 40)
		Case "cau"
			Causale.Text = "Causale Magazzino "
			Causale.Tag = ""
			Causale.Background = mod1.Sub155(-3355444, 40)
		Case "oper"
			Operatore.Text = "Operatore"
			Operatore.Tag = ""
			Operatore.Background = mod1.Sub155(-3355444, 40)
	End Select
End Sub

Sub DelList_Click
	Dim vTmp As Int = vcustomlistviewold1.Sub008 - 1
	Dim i As Int
	For i = 0 To vTmp
		Dim checkBoxWrapper As CheckBox = vcustomlistviewold1.getpanel(i).GetView(0)
		If checkBoxWrapper.Checked Then
			checkBoxWrapper.Checked = False
		End If
	Next
End Sub

Sub DesCliente_Click
	Dim str As String
	DesCliente.Tag = ""
	DesCliente.Text = "Descrizione Cliente"
	DesCliente.Background = mod1.Sub155(-3355444, 40)
	Dim vInputList1 As Int = idLib.InputList1(vLst5, "Selezionare il Tipo di Filtro:")
	If vInputList1 >= 0 Then
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 1
		vDlg1.Input = ""
		vDlg1.PasswordMode = False
		vDlg1.Hint = "Descrizione Cliente"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow As Int = vDlg1.Show("Inserire la descrizione del Cliente ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And vDlg1.Input.Length > 0 And vDlg1.Input.Length < 20 Then
			Dim str3 As String = "'"
			If vInputList1 <> 0 Then
				str = ""
			Else
				str = " = '"
			End If
			If vInputList1 = 1 Then
				str = " <> '"
			End If
			If vInputList1 = 2 Then
				str = " like '%"
				str3 = "%'"
			End If
			Dim cursorWrapper As Cursor
			Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select codice,descrizione from clienti where descrizione " & str & mod1.Sub209(vDlg1.Input) & str3)
			Dim list As List
			list.Initialize
			If cursorWrapper2.RowCount > 0 Then
				Dim rowCount As Int = cursorWrapper2.RowCount - 1
				Dim i As Int
				For i = 0 To rowCount
					cursorWrapper2.Position = i
					list.Add(cursorWrapper2.GetString("descrizione"))
				Next
				Dim vInputList12 As Int = idLib.InputList1(list, "Selezionare il Cliente:")
				If vInputList12 >= 0 Then
					cursorWrapper2.Position = vInputList12
					DesCliente.Background = mod1.Sub155(-2520695, 40)
					DesCliente.Text = "Descrizione Cliente = " & cursorWrapper2.GetString("descrizione")
					DesCliente.Tag = vStr1 & "cliente = " & cursorWrapper2.GetString("codice") & " and "
				End If
			Else
				ToastMessageShow("Nessun cliente trovato ", False)
			End If
		End If
	End If
	mod1.Sub081
End Sub

Sub Documento_Click
	Dim vInputList1 As Int = idLib.InputList1(vLst8, "Selezionare il Tipo di Filtro:")
	If vInputList1 >= 0 Then
		vStr3 = vLst8.Get(vInputList1)
		vStr4 = vStr3
		If vStr3 = "Diverso" Then
			vStr4 = "<>"
		End If
		vcustomlistviewold1.Sub004
		Dim size As Int = vLst13.Size - 1
		Dim i As Int
		For i = 0 To size
			vcustomlistviewold1.Sub001(Sub001(i, vLst13.Get(i), DipToCurrent(50)), DipToCurrent(50), vLst13.Get(i))
		Next
		LblInfo.Text = "Selezionare il Documento " & vStr3
		vStr2 = "D"
		Sub005()
	End If
	mod1.Sub081
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

Sub Iva_Click
	Dim vInputList1 As Int = idLib.InputList1(vLst11, "Selezionare il Tipo di Filtro:")
	If vInputList1 >= 0 Then
		vStr3 = vLst11.Get(vInputList1)
		vStr4 = vStr3
		If vStr3 = "Diverso" Then
			vStr4 = "<>"
		End If
		vcustomlistviewold1.Sub004
		Dim size As Int = vLst15.Size - 1
		Dim i As Int
		For i = 0 To size
			vcustomlistviewold1.Sub001(Sub001(i, vLst15.Get(i), DipToCurrent(50)), DipToCurrent(50), vLst15.Get(i))
		Next
		LblInfo.Text = "Selezionare l'iva " & vStr3
		vStr2 = "I"
		Sub005()
		Return
	End If
End Sub

Sub Sub002(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

Sub Movimento_Click
	Dim str As String
	Movimento.Tag = ""
	Movimento.Text = "Movimento"
	Movimento.Background = mod1.Sub155(-3355444, 40)
	Dim vInputList1 As Int = idLib.InputList1(vLst9, "Selezionare il Tipo di Filtro:")
	If vInputList1 >= 0 Then
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 2
		vDlg1.Input = ""
		vDlg1.PasswordMode = False
		vDlg1.Hint = "Numero Movimento"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow As Int = vDlg1.Show("Inserire il numero del movimento ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And IsNumber(vDlg1.Input) Then
			Movimento.Background = mod1.Sub155(-2520695, 40)
			Dim vObjectToString As String = vLst9.Get(vInputList1)
			If vInputList1 <> 0 Then
				str = ""
			Else
				str = " = "
			End If
			If vInputList1 = 1 Then
				str = " <> "
			End If
			If vInputList1 = 2 Then
				str = " > "
			End If
			If vInputList1 = 3 Then
				str = " < "
			End If
			Movimento.Tag = "nmov " & str & vDlg1.Input & " and "
			Movimento.Text = "Movimento " & vObjectToString & " " & vDlg1.Input
		End If
	End If
	mod1.Sub081
End Sub

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub Ok_Click
	Dim str As String = ""
	Dim str2 As String = ""
	vLst17.Clear
	vLst17.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
	vLst18.Clear
	vLst18.AddAll(ArrayToList(Array As String("", "", "", "", "", "", "", "", "", "", "")))
	If Not(Main.vBln44) Then
		If Reparto.Tag <> "" Then
			str = "" & Reparto.Tag
			str2 = "" & Reparto.Text & " e "
			vLst17.Set(f_rep, Reparto.Tag)
			vLst18.Set(f_rep, Reparto.Text)
		End If
		If Iva.Tag <> "" Then
			str = str & Iva.Tag
			str2 = str2 & Iva.Text & " e "
			vLst17.Set(f_iva, Iva.Tag)
			vLst18.Set(f_iva, Iva.Text)
		End If
		If Data.Tag <> "" Then
			str = str & Data.Tag
			str2 = str2 & Data.Text & " e "
			vLst17.Set(f_data, Data.Tag)
			vLst18.Set(f_data, Data.Text)
		End If
		If Movimento.Tag <> "" Then
			str = str & Movimento.Tag
			str2 = str2 & Movimento.Text & " e "
			vLst17.Set(f_movi, Movimento.Tag)
			vLst18.Set(f_movi, Movimento.Text)
		End If
		If CArticolo.Tag <> "" Then
			str = str & CArticolo.Tag
			str2 = str2 & CArticolo.Text & " e "
			vLst17.Set(f_cart, CArticolo.Tag)
			vLst18.Set(f_cart, CArticolo.Text)
		End If
		If Cliente.Tag <> "" Then
			str = str & Cliente.Tag
			str2 = str2 & Cliente.Text & " e "
			vLst17.Set(f_cli, Cliente.Tag)
			vLst18.Set(f_cli, Cliente.Text)
		End If
		If DesCliente.Tag <> "" Then
			str = str & DesCliente.Tag
			str2 = str2 & DesCliente.Text & " e "
			vLst17.Set(f_descli, DesCliente.Tag)
			vLst18.Set(f_descli, DesCliente.Text)
		End If
		If Operatore.Tag <> "" Then
			str = str & Operatore.Tag
			str2 = str2 & Operatore.Text & " e "
			vLst17.Set(f_oper, Operatore.Tag)
			vLst18.Set(f_oper, Operatore.Text)
		End If
		If DArticolo.Tag <> "" Then
			str = str & DArticolo.Tag
			str2 = str2 & DArticolo.Text & " e "
			vLst17.Set(f_dart, DArticolo.Tag)
			vLst18.Set(f_dart, DArticolo.Text)
		End If
		If Documento.Tag <> "" Then
			str = str & Documento.Tag
			str2 = str2 & Documento.Text & " e "
			vLst17.Set(f_docu, Documento.Tag)
			vLst18.Set(f_docu, Documento.Text)
		End If
		If Causale.Tag <> "" Then
			str = str & Causale.Tag
			str2 = str2 & Causale.Text & " e "
			vLst17.Set(f_caus, Causale.Tag)
			vLst18.Set(f_caus, Causale.Text)
		End If
		If str.Length > 4 Then
			str = str.SubString2(0, str.Length - 4)
			str2 = str2.SubString2(0, str2.Length - 3)
		End If
		Stampe.vStr1 = str
		Stampe.vStr2 = str2
		vBln1 = True
		mod1.Sub198("Stampe")
	Else
		If Data.Tag <> "" Then
			str = "" & Data.Tag
			str2 = "" & Data.Text & " e "
			vLst17.Set(f_data, Data.Tag)
			vLst18.Set(f_data, Data.Text)
		End If
		If Movimento.Tag <> "" Then
			str = str & Movimento.Tag
			str2 = str2 & Movimento.Text & " e "
			vLst17.Set(f_movi, Movimento.Tag)
			vLst18.Set(f_movi, Movimento.Text)
		End If
		If Cliente.Tag <> "" Then
			str = str & Cliente.Tag
			str2 = str2 & Cliente.Text & " e "
			vLst17.Set(f_cli, Cliente.Tag)
			vLst18.Set(f_cli, Cliente.Text)
		End If
		If DesCliente.Tag <> "" Then
			str = str & DesCliente.Tag
			str2 = str2 & DesCliente.Text & " e "
			vLst17.Set(f_descli, DesCliente.Tag)
			vLst18.Set(f_descli, DesCliente.Text)
		End If
		If Documento.Tag <> "" Then
			str = str & Documento.Tag
			str2 = str2 & Documento.Text & " e "
			vLst17.Set(f_docu, Documento.Tag)
			vLst18.Set(f_docu, Documento.Text)
		End If
		If Causale.Tag <> "" Then
			str = str & Causale.Tag
			str2 = str2 & Causale.Text & " e "
			vLst17.Set(f_caus, Causale.Tag)
			vLst18.Set(f_caus, Causale.Text)
		End If
		If str.Length > 4 Then
			str = str.SubString2(0, str.Length - 4)
			str2 = str2.SubString2(0, str2.Length - 3)
		End If
		Main.vStr22 = str
		Main.vStr23 = str2
		vBln1 = True
		mod1.Sub198("Main")
	End If
	Activity.Finish
End Sub

Sub OkList_Click
	Dim z As Boolean
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	If vStr2 = "R" Then
		Reparto.Background = mod1.Sub155(-3355444, 40)
		Reparto.Text = "Reparto"
		Reparto.Tag = ""
		Dim vTmp As Int = vcustomlistviewold1.Sub008 - 1
		Dim i As Int = 0
		Dim z5 As Boolean = False
		Do While i <= vTmp
			If Not(vcustomlistviewold1.getpanel(i).GetView(0).Checked) Then
				z4 = z5
			Else If Reparto.Tag <> "" Then
				Reparto.Tag = Reparto.Tag & IIf(vStr4 = "=", " or ", " and ") & vStr1 & "reparto " & vStr4 & i
				Reparto.Text = Reparto.Text & IIf(vStr4 = "=", " oppure ", " e ") & "Reparto " & vStr3 & " " & vLst14.Get(i)
				z4 = True
			Else
				Reparto.Tag = vStr1 & "reparto " & vStr4 & i
				Reparto.Text = " Reparto " & vStr3 & " " & vLst14.Get(i)
				z4 = True
			End If
			i = i + 1
			z5 = z4
		Loop
		If z5 Then
			Reparto.Tag = "(" & Reparto.Tag & ") and "
			Reparto.Background = mod1.Sub155(-2520695, 40)
		End If
	Else
		If vStr2 = "I" Then
			Iva.Background = mod1.Sub155(-3355444, 40)
			Iva.Text = "Iva"
			Iva.Tag = ""
			Dim vTmp_ As Int = vcustomlistviewold1.Sub008 - 1
			Dim i2 As Int = 0
			Dim z6 As Boolean = False
			Do While i2 <= vTmp_
				If Not(vcustomlistviewold1.getpanel(i2).GetView(0).Checked) Then
					z3 = z6
				Else If Iva.Tag <> "" Then
					Iva.Tag = Iva.Tag & IIf(vStr4 = "=", " or ", " and ") & vStr1 & "Iva " & vStr4 & i2
					Iva.Text = Iva.Text & IIf(vStr4 = "=", " oppure ", " e ") & "Iva " & vStr3 & " " & vLst15.Get(i2)
					z3 = True
				Else
					Iva.Tag = vStr1 & "Iva " & vStr4 & i2
					Iva.Text = " Iva " & vStr3 & " " & vLst15.Get(i2)
					z3 = True
				End If
				i2 = i2 + 1
				z6 = z3
			Loop
			If z6 Then
				Iva.Tag = "(" & Iva.Tag & ") and "
				Iva.Background = mod1.Sub155(-2520695, 40)
			End If
		Else
			If vStr2 = "O" Then
				Operatore.Background = mod1.Sub155(-3355444, 40)
				Operatore.Text = "Operatore"
				Operatore.Tag = ""
				Dim vTmp__ As Int = vcustomlistviewold1.Sub008 - 1
				Dim i3 As Int = 0
				Dim z7 As Boolean = False
				Do While i3 <= vTmp__
					If Not(vcustomlistviewold1.getpanel(i3).GetView(0).Checked) Then
						z2 = z7
					Else If Operatore.Tag <> "" Then
						Operatore.Tag = Operatore.Tag & IIf(vStr4 = "=", " or ", " and ") & " (Select count(*) from headmov where headmov.nmov = venduto.nmov AND Operatore " & vStr4 & i3 + 1 & ") >0 "
						Operatore.Text = Operatore.Text & IIf(vStr4 = "=", " oppure ", " e ") & "Operatore " & vStr3 & " " & vLst16.Get(i3)
						z2 = True
					Else
						Operatore.Text = " Operatore " & vStr3 & " " & vLst16.Get(i3)
						Operatore.Tag = "(Select count(*) from headmov where headmov.nmov = venduto.nmov AND Operatore " & vStr4 & i3 + 1 & ") >0 "
						z2 = True
					End If
					i3 = i3 + 1
					z7 = z2
				Loop
				If z7 Then
					Operatore.Tag = "(" & Operatore.Tag & ") and "
					Operatore.Background = mod1.Sub155(-2520695, 40)
				End If
			Else
				If vStr2 = "D" Then
					Documento.Background = mod1.Sub155(-3355444, 40)
					Documento.Text = "Documento"
					Documento.Tag = ""
					Dim vTmp___ As Int = vcustomlistviewold1.Sub008 - 1
					Dim i4 As Int = 0
					Dim z8 As Boolean = False
					Do While i4 <= vTmp___
						If vcustomlistviewold1.getpanel(i4).GetView(0).Checked Then
							Dim str As String = ""
							If Documento.Tag <> "" Then
								Documento.Text = Documento.Text & IIf(vStr4 = "=", " oppure ", " e ") & "Documento " & vStr3 & " " & vLst13.Get(i4)
								str = IIf(vStr4 = "=", " or ", " and ")
							Else
								Documento.Text = " Documento " & vStr3 & " " & vLst13.Get(i4)
							End If
							If vStr4 = "=" Then
								If i4 = 0 Then
									Documento.Tag = Documento.Tag & str & "(" & vStr1 & "flgNF =0 and nfat =0 and nric =0 )"
								End If
								If i4 = 1 Then
									Documento.Tag = Documento.Tag & str & "(  nfat >0) "
								End If
								If i4 = 2 Then
									Documento.Tag = Documento.Tag & str & "(" & vStr1 & "flgNF =1 and nfat =0 and nric =0 )"
								End If
								If i4 = 3 Then
									Documento.Tag = Documento.Tag & str & "(  nric >0 )"
									z = True
								End If
							Else
								If i4 = 0 Then
									Documento.Tag = Documento.Tag & str & " not(" & vStr1 & "flgNF =0 and nfat =0 and nric =0) "
								End If
								If i4 = 1 Then
									Documento.Tag = Documento.Tag & str & "( nfat =0 )"
								End If
								If i4 = 2 Then
									Documento.Tag = Documento.Tag & str & " not(" & vStr1 & "flgNF =1 and nfat =0 and nric =0) "
								End If
								If i4 = 3 Then
									Documento.Tag = Documento.Tag & str & " (  nric =0 )"
								End If
							End If
							z = True
						Else
							z = z8
						End If
						i4 = i4 + 1
						z8 = z
					Loop
					If z8 Then
						Documento.Tag = "(" & Documento.Tag & ") and "
						Documento.Background = mod1.Sub155(-2520695, 40)
					End If
				End If
			End If
		End If
	End If
	PnlList.Visible = False
	mod1.Sub081
End Sub

Sub Operatore_Click
	Dim vInputList1 As Int = idLib.InputList1(vLst6, "Selezionare il Tipo di Filtro:")
	If vInputList1 >= 0 Then
		vStr3 = vLst6.Get(vInputList1)
		vStr4 = vStr3
		If vStr3 = "Diverso" Then
			vStr4 = "<>"
		End If
		vcustomlistviewold1.Sub004
		Dim size As Int = vLst16.Size - 1
		Dim i As Int
		For i = 0 To size
			vcustomlistviewold1.Sub001(Sub001(i, vLst16.Get(i), DipToCurrent(50)), DipToCurrent(50), vLst16.Get(i))
		Next
		LblInfo.Text = "Selezionare l'operatore " & vStr3
		vStr2 = "O"
		Sub005()
		Return
	End If
End Sub

Sub PnlList_Click
End Sub

Sub populatespinner
	mod1.vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	Try
		vLst14.Clear
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("SELECT codice,descrizione FROM reparti order by codice")
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			DoEvents
			cursorWrapper2.Position = i
			vLst14.Add(cursorWrapper2.GetString("descrizione"))
		Next
		cursorWrapper2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub003
	mod1.vStr2 = "Sub PopulateSpinnerIva()"
	Try
		vLst15.Clear
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("SELECT codice,descrizione FROM iva order by codice")
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			DoEvents
			cursorWrapper2.Position = i
			vLst15.Add(cursorWrapper2.GetString("descrizione"))
		Next
		cursorWrapper2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub004
	mod1.vStr2 = "Sub PopulateSpinnerOper()"
	Try
		vLst16.Clear
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("SELECT codice,descrizione FROM operatori order by codice")
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			DoEvents
			cursorWrapper2.Position = i
			vLst16.Add(cursorWrapper2.GetString("descrizione"))
		Next
		cursorWrapper2.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Reparto_Click
	Dim vInputList1 As Int = idLib.InputList1(vLst10, "Selezionare il Tipo di Filtro:")
	If vInputList1 >= 0 Then
		vStr3 = vLst10.Get(vInputList1)
		vStr4 = vStr3
		If vStr3 = "Diverso" Then
			vStr4 = "<>"
		End If
		vcustomlistviewold1.Sub004
		Dim size As Int = vLst14.Size - 1
		Dim i As Int
		For i = 0 To size
			vcustomlistviewold1.Sub001(Sub001(i, vLst14.Get(i), DipToCurrent(50)), DipToCurrent(50), vLst14.Get(i))
		Next
		LblInfo.Text = "Selezionare il Reparto " & vStr3
		vStr2 = "R"
		Sub005()
	End If
	mod1.Sub081
End Sub

Sub Sub005
	PnlList.Visible = True
	mod1.Sub161(PnlList, 10)
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

