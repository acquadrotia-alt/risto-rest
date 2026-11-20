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
	Public v7 As Timer
	Public vBln1 As Boolean
	Public vInt1 As Int
	Public d_assplu As Int = 1
	Public d_assrep As Int = 2
	Public d_assmod As Int = 3
	Public d_assgrp As Int = 4
	Public d_asstast As Int = 5
	Public d_assric As Int = 6
	Public d_moddescrizione As Int = 7
	Public d_modcolore As Int = 8
	Public d_azztasto As Int = 9
	Public d_chiuti As Int = 10
	Public vInt2 As Int
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public vcustomlistviewold1 As customlistviewold
	Public Button1 As Button
	Public ButtonPagina1 As Button
	Public pLista As Panel
	Public pPlu As Panel
	Public vButtonArr1(12) As Button
	Public Button10 As Button
	Public Button11 As Button
	Public Button12 As Button
	Public Button2 As Button
	Public Button3 As Button
	Public Button4 As Button
	Public Button5 As Button
	Public Button6 As Button
	Public Button7 As Button
	Public Button8 As Button
	Public Button9 As Button
	Public ButtonPagina2 As Button
	Public ButtonPagina3 As Button
	Public vCur1 As Cursor
	Public vCur2 As Cursor
	Public vLst1 As List
	Public a1 As Animation
	Public vanimatedslidingmenu1 As animatedslidingmenu
	Public vanimatedslidingmenu2 As animatedslidingmenu
	Public vanimatedslidingmenu3 As animatedslidingmenu
	Public vBmp1 As Bitmap
	Public vBtn1 As Button
	Public lblTitolo As Label
End Sub

Sub ac_itemclicked(menuItemWrapper As MenuItem)
	mod1.vStr2 = "  Sub AC_Click (Position As Int, ActionItemID As Int)"
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Select vLst1.Get(menuItemWrapper.Id)
		Case "Disattiva Palmare"
			Main.vSql1.ExecNonQuery("update Palmari set Attivo = 0 where Serial = '" & vCur1.GetString("Serial") & "'")
			Sub006()
			Return
		Case "Attiva Palmare"
			v7.Initialize("Timer1", 100)
			v7.Enabled = True
			Return
		Case "Reset Chiave"
			If Not(Main.v_attivakeyhttp) Then
				Return
			End If
			Dim vObjectToCharSequence As Object = "Confermi l'azzeramento della chiave per la ricezione dei dati da palmare ?"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
			If vMsgbox2 = -1 Then
				Main.vSql1.ExecNonQuery("update Palmari set datachiave = 0 where Serial = '" & vCur1.GetString("Serial") & "'")
				Sub006()
				Dim vObjectToCharSequence3 As Object = "La chiave è stata resettata"
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			End If
			Return
		Case "Chiusura Conto"
			Dim list As List
			list.Initialize
			list.AddAll(ArrayToList(Array As String("Non Stampare", "Azzera Conto", "Stampa Conto o Preconto", "Stampa Preconto", "Scontrino Fiscale", "Scontrino Fiscale o Conto o Preconto")))
			Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare la Modalità di Chiusura Conto")
			If vInputList1 >= 0 Then
				Dim str As String = "0"
				If vInputList1 > 0 Then
					str = vInputList1 + 6
				End If
				Main.vSql1.ExecNonQuery("update Palmari set Preconto = " & str & " where Serial = '" & vCur1.GetString("Serial") & "'")
				Sub006()
			End If
			Return
		Case Else
			Return
	End Select
End Sub

Sub Activity_Create(z As Boolean)
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
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
				Sub008("Palmari")
				Dim vGetAllViewsRecursive As IterableList = pPlu.GetAllViewsRecursive
				Dim size As Int = vGetAllViewsRecursive.Size
				Dim i As Int
				For i = 0 To size - 1
					Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i)
					If concreteViewWrapper Is Button And Not(concreteViewWrapper Is CheckBox) Then
						Dim buttonWrapper As Button = concreteViewWrapper
						mod1.Sub165(buttonWrapper)
					End If
				Next
				vBmp1.Initialize(File.DirAssets, "014.png")
				vButtonArr1(0) = Button1
				vButtonArr1(1) = Button2
				vButtonArr1(2) = Button3
				vButtonArr1(3) = Button4
				vButtonArr1(4) = Button5
				vButtonArr1(5) = Button6
				vButtonArr1(6) = Button7
				vButtonArr1(7) = Button8
				vButtonArr1(8) = Button9
				vButtonArr1(9) = Button10
				vButtonArr1(10) = Button11
				vButtonArr1(11) = Button12
				lblTitolo.Color = Main.v_colormenutitle
				mod1.Sub173(lblTitolo)
				Sub009(0)
				vcustomlistviewold1.Initialize(Me, "clv2")
				vcustomlistviewold1.vInt3 = -16776961
				pLista.AddView(vcustomlistviewold1.Sub003, 0, PerYToCurrent(5), pLista.Width, pLista.Height - PerYToCurrent(9))
				vBln1 = False
				vLst1.Initialize
				If Main.vStr14 <> "" Then
					Dim cursorWrapper As Cursor
					Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from anagra where codint ='" & Main.vStr14 & "'")
					If Main.vBln33 And cursorWrapper2.RowCount > 0 Then
						cursorWrapper2.Position = 0
						Sub001()
						Main.vSql1.ExecNonQuery("update MenuCard set Tipo ='PLU',Descrizione = '" & cursorWrapper2.GetString("descrizione") & "' ,Codice = '" & cursorWrapper2.GetString("codint") & "' where Scancode = " & vInt1 + vBtn1.Tag)
						vBtn1.Text = cursorWrapper2.GetString("descrizione")
						Sub001()
						Sub007()
					End If
					Main.vBln33 = False
					Main.vStr14 = ""
					Main.vInt24 = 0
				Else
					vInt2 = 0
					Sub001()
				End If
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				Sub006()
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			Return
		End If
	End If
	Activity.Finish
End Sub

Sub Addrep_Click
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	vCur1.Position = getpanel.GetView(5).Text
	Dim list As List
	list.Initialize
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select codice,descrizione from reparti order by reparti.descrizione")
	If cursorWrapper2.RowCount > 0 Then
		Main.vSql1.ExecNonQuery("delete from filtristampeBT where codice = " & vCur1.GetString("Serial"))
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			list.Add(cursorWrapper2.GetString("descrizione"))
		Next
		Dim vInputMultiList As List = InputMultiList(list, "Selezionare i reparti per le comande su stampante BT")
		If vInputMultiList.Size > 0 Then
			Dim size As Int = vInputMultiList.Size - 1
			Dim i2 As Int
			For i2 = 0 To size
				cursorWrapper2.Position = vInputMultiList.Get(i2)
				Main.vSql1.ExecNonQuery("insert into  filtristampeBT(codice,reparto) values(" & vCur1.GetString("Serial") & "," & cursorWrapper2.GetString("codice") & ")")
			Next
		End If
	End If
	Sub006()
End Sub

Sub Button1_Click
	vBtn1 = Sender
	vanimatedslidingmenu1 = vanimatedslidingmenu2
	Sub007()
End Sub

Sub Buttonfun_Click
	Dim popupMenuWrapper As PopupMenu = Null
	mod1.vStr2 = "  Sub buttonFun_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(5)
		Dim imageViewWrapper As ImageView = getpanel.GetView(4)
		vCur1.Position = labelWrapper.Text
		vLst1.Clear
		If vCur1.GetInt("Attivo") = 1 Then
			vLst1.Add("Disattiva Palmare")
		Else
			vLst1.Add("Attiva Palmare")
		End If
		vLst1.Add("Chiusura Conto")
		If Main.v_attivakeyhttp Then
			vLst1.Add("Reset Chiave")
		End If
		vLst1.Add("Esci")
		If vLst1.Size > 1 Then
			'popupMenuWrapper = PopupMenu
			popupMenuWrapper.Initialize("AC", imageViewWrapper)
			Dim size As Int = vLst1.Size - 1
			Dim i As Int
			For i = 0 To size
				Dim bitmapDrawable As BitmapDrawable
				Dim str As String = ""
				Select vLst1.Get(i)
					Case "Disattiva Palmare"
						str = "fca_lucchetto.png"
					Case "Attiva Palmare"
						str = "fca_lucchetto ap.png"
					Case "Reset Chiave"
						str = "fun_articoli (2).png"
					Case "Chiusura Conto"
						str = "m_ordini.png"
					Case "Esci"
						str = "014.png"
				End Select
				Dim vObjectToString As String = vLst1.Get(i)
				bitmapDrawable.Initialize(LoadBitmap(File.DirAssets, str))
				popupMenuWrapper.AddMenuItem(i, vObjectToString, bitmapDrawable)
			Next
		End If
		Sub011(imageViewWrapper)
		popupMenuWrapper.Show
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub ButtonPagina1_Click
	vInt2 = 0
	Sub001()
End Sub

Sub ButtonPagina2_Click
	vInt2 = 1
	Sub001()
End Sub

Sub ButtonPagina3_Click
	vInt2 = 2
	Sub001()
End Sub

Sub Sub001
	Dim i As Int
	Dim i2 As Int
	Dim i3 As Int
	Sub009(vInt2)
	If vInt2 = 0 Then
		i = -16711936
	Else
		i = -65536
	End If
	ButtonPagina1.Background = mod1.Sub155(i, 0)
	If vInt2 = 1 Then
		i2 = -16711936
	Else
		i2 = -65536
	End If
	ButtonPagina2.Background = mod1.Sub155(i2, 0)
	If vInt2 = 2 Then
		i3 = -16711936
	Else
		i3 = -65536
	End If
	ButtonPagina3.Background = mod1.Sub155(i3, 0)
End Sub

Sub Chiudi_Click
	vBln1 = True
	Main.vBln33 = False
	Main.vInt24 = 0
	Main.vInt26 = 0
	Activity.Finish
	mod1.Sub198("Main")
End Sub

Sub Sub002
	vanimatedslidingmenu1.Sub005(False, False)
	If vanimatedslidingmenu1.equals(vanimatedslidingmenu2) Then
		vanimatedslidingmenu1 = vanimatedslidingmenu3
		Return
	End If
	vanimatedslidingmenu1 = vanimatedslidingmenu2
End Sub

Sub Configura_Click(i As Int)
	Dim i2 As Int = 0
	mod1.vStr2 = "Sub configura_Click(SelectedItem As Object)"
	Try
		If i = d_chiuti Then
			Sub002()
			Sub001()
			Return
		End If
		Select i
			Case d_assplu
				Main.vBln33 = True
				Main.vInt24 = Main.d_plu
				Main.vInt26 = 2
				Main.vBln32 = True
				vBln1 = True
				mod1.Sub198("tabelle")
			Case d_assrep
				Dim list As List
				list.Initialize
				Dim cursorWrapper As Cursor
				Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from reparti  order by codice")
				If cursorWrapper2.RowCount > 0 Then
					Dim rowCount As Int = cursorWrapper2.RowCount - 1
					Do While i2 <= rowCount
						cursorWrapper2.Position = i2
						list.Add(cursorWrapper2.GetString("descrizione"))
						i2 = i2 + 1
					Loop
					Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare il Reparto")
					If vInputList1 >= 0 Then
						cursorWrapper2.Position = vInputList1
						Main.vSql1.ExecNonQuery("update MenuCard set Tipo ='REP',Descrizione = '" & cursorWrapper2.GetString("descrizione") & "' ,Codice = '" & cursorWrapper2.GetString("codice") & "' where Scancode = " & vInt1 + vBtn1.Tag)
						If Main.vSql1.ExecQuerySingleResult("select count(*) from reparti where palmari =1 and codice = " & cursorWrapper2.GetString("codice")) = 0 Then
							Dim vObjectToCharSequence As Object = "Il reparto " & cursorWrapper2.GetString("descrizione") & " non risulta essere abilitato per l'invio ai palmari." & CRLF & " Si desidera abilitarlo ?"
							Dim vObjectToCharSequence2 As Object = Main.vStr8
							Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
							If vMsgbox2 = -1 Then
								Main.vSql1.ExecNonQuery("update reparti set palmari =1 where codice = " & cursorWrapper2.GetString("codice"))
							End If
						End If
						vBtn1.Text = cursorWrapper2.GetString("descrizione")
						Sub002()
						Sub007()
					End If
				End If
				vanimatedslidingmenu1.vLv1.Color = 0
			Case d_assgrp
				Dim list2 As List
				list2.Initialize
				Dim cursorWrapper3 As Cursor
				Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from gruppovar  order by codice")
				If cursorWrapper4.RowCount > 0 Then
					Dim rowCount2 As Int = cursorWrapper4.RowCount - 1
					Do While i2 <= rowCount2
						cursorWrapper4.Position = i2
						list2.Add(cursorWrapper4.GetString("descrizione"))
						i2 = i2 + 1
					Loop
					Dim vInputList12 As Int = idLib.InputList1(list2, "Selezionare il gruppo")
					If vInputList12 >= 0 Then
						cursorWrapper4.Position = vInputList12
						Main.vSql1.ExecNonQuery("update MenuCard set Tipo ='GRP',Descrizione = '" & cursorWrapper4.GetString("descrizione") & "' ,Codice = '" & cursorWrapper4.GetString("codice") & "' where Scancode = " & vInt1 + vBtn1.Tag)
						vBtn1.Text = cursorWrapper4.GetString("descrizione")
						Sub002()
						Sub007()
					End If
				End If
				vanimatedslidingmenu1.vLv1.Color = 0
			Case d_asstast
				Dim list3 As List
				list3.Initialize
				list3.AddAll(ArrayToList(Array As String("1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "C")))
				Dim vInputList13 As Int = idLib.InputList1(list3, "Selezionare il tasto")
				If vInputList13 >= 0 Then
					Main.vSql1.ExecNonQuery("update MenuCard set Tipo ='TAS',Descrizione = '" & list3.Get(vInputList13) & "' ,Codice = '" & list3.Get(vInputList13) & "' where Scancode = " & vInt1 + vBtn1.Tag)
					vBtn1.Text = list3.Get(vInputList13)
					Sub002()
				End If
				vanimatedslidingmenu1.vLv1.Color = 0
			Case d_assric
				Main.vSql1.ExecNonQuery("update MenuCard set Tipo ='RIC',Descrizione = 'Ricerca' ,Codice = '1' where Scancode = " & vInt1 + vBtn1.Tag)
				vBtn1.Text = "Ricerca"
				Sub002()
			Case d_assmod
				Dim vObjectToCharSequence3 As Object = "Si desidera utilizzare il modificatore con valori in % o utilizzando i listini dell'articolo ?"
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Valori in %", "", "Listini", Main.vBmp1)
				If vMsgbox22 = -1 Then
					Dim numberDialog As NumberDialog
					numberDialog.Digits = 4
					numberDialog.Number = 0
					numberDialog.Decimal = 0
					numberDialog.ShowSign = True
					Dim vShow As Int = numberDialog.Show("Indicare la variazione %(in positivo o in negativo) della quantità", "Ok", "Annulla", "", Main.vBmp1)
					If vShow = -1 And numberDialog.Number >= -100 And numberDialog.Number <= 100 Then
						Main.vSql1.ExecNonQuery("update MenuCard set Tipo ='MOD',Descrizione = 'Modificatore',Codice = '" & numberDialog.Number & "' where Scancode = " & vInt1 + vBtn1.Tag)
						Sub002()
						Sub007()
						vBtn1.Text = "Modificatore " & numberDialog.Number & "%"
					End If
				Else
					If vMsgbox22 = -2 Then
						Dim list4 As List
						list4.Initialize
						list4.AddAll(ArrayToList(Array As String("Utilizza il Listino 1", "Utilizza il Listino 2", "Utilizza il Listino 3", "Utilizza il Listino 4")))
						Dim vInputList As Int = InputList(list4, "Indicare il tipo di Statistiche da visualizzare", -1)
						If vInputList >= 0 Then
							mod1.Sub081
							Main.vSql1.ExecNonQuery("update MenuCard set Tipo ='MOD',Descrizione = 'Modificatore',Codice = '" & (vInputList + 1) * 1000 & "' where Scancode = " & vInt1 + vBtn1.Tag)
							Sub002()
							Sub007()
							vBtn1.Text = "Modificatore Listino" & vInputList + 1
						End If
					End If
				End If
				vanimatedslidingmenu1.vLv1.Color = 0
			Case d_moddescrizione
				Dim inputDialog As InputDialog
				inputDialog.InputType = 1
				inputDialog.Input = vCur2.GetString("Descrizione")
				inputDialog.PasswordMode = False
				inputDialog.Hint = "Descrizione"
				inputDialog.HintColor = Colors.ARGB(196, 255, 140, 0)
				Dim vShow2 As Int = inputDialog.Show("Inserire la descrizione del tasto ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
				If vShow2 = -1 Then
					Dim vTmp As String = mod1.Sub209(inputDialog.Input.ToUpperCase)
					Main.vSql1.ExecNonQuery("update MenuCard set Descrizione = '" & vTmp & "' where Scancode = " & vInt1 + vBtn1.Tag)
					vBtn1.Text = vTmp
					Sub002()
					Sub007()
				End If
				vanimatedslidingmenu1.vLv1.Color = 0
			Case d_modcolore
				Dim list5 As List
				list5.Initialize
				list5.AddAll(ArrayToList(Array As String("Arancione", "Rosso", "Grigio", "Giallo", "Verde", "Azzurro", "Blu", "Viola")))
				Dim vInputList14 As Int = idLib.InputList1(list5, "Selezionare il colore del tasto")
				If vInputList14 >= 0 Then
					Dim vTmp_ As String = Sub004(vInputList14)
					Main.vSql1.ExecNonQuery("update MenuCard set BtnStyle = '" & vTmp_ & "'  where Scancode = " & vInt1 + vBtn1.Tag)
					Sub002()
					Sub007()
					vBtn1.Background = mod1.Sub155(Sub010(vTmp_), 35)
				End If
				vanimatedslidingmenu1.vLv1.Color = 0
			Case d_azztasto
				Dim vObjectToCharSequence5 As Object = "Confermi la cancellazione del tasto ?"
				Dim vObjectToCharSequence6 As Object = Main.vStr8
				Dim vMsgbox23 As Int = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "Si", "", "No", Main.vBmp1)
				If vMsgbox23 = -1 Then
					Main.vSql1.ExecNonQuery("update MenuCard set BtnStyle = '',Tipo ='PLU',Descrizione = '' ,Codice = '' where Scancode = " & vInt1 + vBtn1.Tag)
					Sub002()
					Sub007()
					Sub001()
				End If
				vanimatedslidingmenu1.vLv1.Color = 0
			Case Else
				vanimatedslidingmenu1.vLv1.Color = 0
		End Select
		Return
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub Sub003(str As String, i As Int) As Panel
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		panelWrapper.Color = -1
		Dim labelWrapper As Label
		labelWrapper.Initialize("selrow")
		labelWrapper.Gravity = Bit.Or(16, 3)
		labelWrapper.Text = vCur1.GetString("Serial")
		If vCur1.GetString("IP") <> "" Then
			labelWrapper.Text = labelWrapper.Text & "- IP:" & vCur1.GetString("IP")
		Else
			labelWrapper.Text = labelWrapper.Text & "- IP: da inserire"
		End If
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -16777216
		labelWrapper.Typeface = Typeface.DEFAULT_BOLD
		If vCur1.GetInt("Attivo") = 1 Then
			labelWrapper.Background = mod1.Sub155(-1, 0)
		Else
			labelWrapper.Background = mod1.Sub155(-65536, 0)
		End If
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("selrow")
		labelWrapper2.Gravity = Bit.Or(16, 3)
		Select vCur1.GetInt("Preconto")
			Case 0
				labelWrapper2.Text = "Chiusura conto: Non Stampare"
			Case 7
				labelWrapper2.Text = "Chiusura conto: Azzera Conto"
			Case 8
				labelWrapper2.Text = "Chiusura conto: Stampa Conto o Preconto"
			Case 9
				labelWrapper2.Text = "Chiusura conto: Stampa Preconto "
			Case 10
				labelWrapper2.Text = "Chiusura conto: Scontrino Fiscale "
			Case 11
				labelWrapper2.Text = "Chiusura conto: Scontrino Fiscale o Conto o Preconto"
		End Select
		labelWrapper2.TextSize = 16
		labelWrapper2.TextColor = -16777216
		labelWrapper2.Background = mod1.Sub155(-1, 0)
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("mBT")
		labelWrapper3.Gravity = Bit.Or(16, 1)
		If vCur1.GetInt("AttivaBT") = 0 Then
			labelWrapper3.Background = mod1.Sub155(-65536, 25)
			labelWrapper3.Text = "Attiva Stampante BlueTooth "
		Else
			labelWrapper3.Background = mod1.Sub155(-16711936, 25)
			labelWrapper3.Text = "Disattiva Stampante BlueTooth "
		End If
		labelWrapper3.TextColor = -16777216
		labelWrapper3.TextSize = 16
		Dim labelWrapper4 As Label
		labelWrapper4.Initialize("Addrep")
		labelWrapper4.Gravity = Bit.Or(16, 1)
		labelWrapper4.Background = mod1.Sub155(-1, 25)
		labelWrapper4.Text = "Gestisci reparti per comanda su stampante BT"
		Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("select count(*) from filtristampeBT  where codice = " & vCur1.GetString("Serial"))
		If parseDouble > 0 Then
			labelWrapper4.Text = parseDouble & " reparti per comanda su stampante BT"
		End If
		labelWrapper4.TextColor = -16777216
		labelWrapper4.TextSize = 16
		Dim labelWrapper5 As Label
		labelWrapper5.Initialize("")
		labelWrapper5.Text = str
		labelWrapper5.Visible = False
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("buttonFun")
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "030.png")
		panelWrapper.AddView(labelWrapper, PerXToCurrent(2), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(22), DipToCurrent(2), PerXToCurrent(26), i)
		panelWrapper.AddView(labelWrapper3, PerXToCurrent(48), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(labelWrapper4, PerXToCurrent(68), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(88), DipToCurrent(2), PerXToCurrent(12), i)
		panelWrapper.AddView(labelWrapper5, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
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
	End If
	Return vTmp
End Sub

Sub Esporta_Click
	If mod1.Sub075 Then
		CallSub2(httpclient, "ExportPalmari", vCur1)
		Return
	End If
End Sub

Sub Sub004(i As Int) As String
	Select i
		Case 0
			Return "DefaultRev"
		Case 1
			Return "Default16"
		Case 2
			Return "Default"
		Case 3
			Return "FlagRight"
		Case 4
			Return "MenuBar_Default_1"
		Case 5
			Return "MenuBar_Default_16"
		Case 6
			Return "ActionBar_Default_4"
		Case 7
			Return "Flat"
		Case Else
			Return "Default16"
	End Select
End Sub

Sub Sub005(str As String) As String
	Select str.Trim
		Case "DefaultRev"
			Return "Arancione"
		Case "Default16"
			Return "Rosso"
		Case "Default"
			Return "Grigio"
		Case "FlagRight"
			Return "Giallo"
		Case "MenuBar_Default_1"
			Return "Verde"
		Case "MenuBar_Default_16"
			Return "Azzurro"
		Case "ActionBar_Default_4"
			Return "Blu"
		Case "Flat"
			Return "Viola"
		Case Else
			Return "Rosso"
	End Select
End Sub

Sub Sub006
	mod1.vStr2 = "Sub Init"
	Try
		Activity.Title = "Gestione Palmari"
		Dim cursorWrapper As Cursor
		vCur1 = Main.vSql1.ExecQuery("Select * from Palmari order by Serial")
		vcustomlistviewold1.Sub004
		If vCur1.RowCount > 0 Then
			Dim rowCount As Int = vCur1.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				vCur1.Position = i
				vcustomlistviewold1.Sub001(Sub003(i, DipToCurrent(60)), DipToCurrent(60), vCur1.GetString("Serial"))
			Next
			vcustomlistviewold1.Sub012(0)
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub007
	Dim str As String
	Dim str2 As String
	Dim str3 As String
	Dim str4 As String
	Dim str5 As String
	Dim object As Class = Me
	Dim str6 As String = "Menù configurazione tasto " & vInt1 + vBtn1.Tag
	Dim vPerXToCurrent As Int = PerXToCurrent(100)
	vanimatedslidingmenu1.Initialize(Activity, object, str6, "configura", "L", 0, vPerXToCurrent, 0, Null, 0.9)
	Dim bitmapWrapper As Bitmap
	Dim cursorWrapper As Cursor
	vCur2 = Main.vSql1.ExecQuery("select * from MenuCard where Scancode =" & vInt1 + vBtn1.Tag)
	If vCur2.RowCount > 0 Then
		vCur2.Position = 0
		bitmapWrapper.Initialize(File.DirAssets, "030.png")
		If vCur2.GetString("Tipo") <> "PLU" Or vCur2.GetString("Descrizione").Trim = "" Then
			str = ""
		Else
			str = vCur2.GetString("Codice")
		End If
		If vCur2.GetString("Tipo") <> "REP" Or vCur2.GetString("Descrizione").Trim = "" Then
			str2 = ""
		Else
			str2 = vCur2.GetString("Codice")
		End If
		If vCur2.GetString("Tipo") <> "MOD" Or vCur2.GetString("Descrizione").Trim = "" Then
			str3 = ""
		Else
			str3 = vCur2.GetString("Codice")
		End If
		If vCur2.GetString("Tipo") <> "GRP" Or vCur2.GetString("Descrizione").Trim = "" Then
			str4 = ""
		Else
			str4 = vCur2.GetString("Codice")
		End If
		If vCur2.GetString("Tipo") <> "TAS" Or vCur2.GetString("Descrizione").Trim = "" Then
			str5 = ""
		Else
			str5 = vCur2.GetString("Codice")
		End If
		vanimatedslidingmenu1.Sub001(bitmapWrapper, "Codice Plu: " & str, -1, 0, d_assplu)
		vanimatedslidingmenu1.Sub001(bitmapWrapper, "Codice Reparto: " & str2, -1, 0, d_assrep)
		If IsNumber(str3) And str3 >= 1000 Then
			Dim str7 As String = "Modificatore : Listino " & NumberFormat2(str3 / 1000, 1, 0, 0, False)
			vanimatedslidingmenu1.Sub001(bitmapWrapper, str7, -1, 0, d_assmod)
		Else If str3 <> "" And str3 <> "0" Then
			vanimatedslidingmenu1.Sub001(bitmapWrapper, "Modificatore : " & str3 & "%", -1, 0, d_assmod)
		Else
			vanimatedslidingmenu1.Sub001(bitmapWrapper, "Modificatore : ", -1, 0, d_assmod)
		End If
		vanimatedslidingmenu1.Sub001(bitmapWrapper, "Codice Gruppo: " & str4, -1, 0, d_assgrp)
		vanimatedslidingmenu1.Sub001(bitmapWrapper, "Tasto numerico: " & str5, -1, 0, d_asstast)
		vanimatedslidingmenu1.Sub001(bitmapWrapper, "Tasto Ricerca ", -1, 0, d_assric)
		If str <> "" Or str2 <> "" Or str3 <> "" Or str4 <> "" Or str5 <> "" Or vCur2.GetString("Tipo") = "RIC" Then
			If Not(str5 <> "" Or vCur2.GetString("Tipo") = "RIC") Then
				Dim str8 As String = "Descrizione: " & vCur2.GetString("Descrizione")
				vanimatedslidingmenu1.Sub001(bitmapWrapper, str8, -1, 0, d_moddescrizione)
			End If
			Dim str9 As String = "Colore: " & Sub005(vCur2.GetString("BtnStyle"))
			vanimatedslidingmenu1.Sub001(bitmapWrapper, str9, -1, 0, d_modcolore)
			vanimatedslidingmenu1.Sub001(bitmapWrapper, "Azzera Tasto", -1, 0, d_azztasto)
		End If
		vanimatedslidingmenu1.Sub008(-16776961, -1, 1, Null)
		vanimatedslidingmenu1.Sub006("Default", False)
		Return
	End If
End Sub

Sub Sub008(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

Sub Mbt_Click
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	vCur1.Position = getpanel.GetView(5).Text
	Main.vSql1.ExecNonQuery("update Palmari set AttivaBT=not AttivaBT where Serial = '" & vCur1.GetString("Serial") & "'")
	Sub006()
End Sub

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub msgboxonly(str As String)
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "", "", "Ok", Main.vBmp1)
End Sub

Sub Sub009(i As Int)
	Try
		vInt1 = i * 12
		Dim s As Short = vInt1 + 12
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from MenuCard where Scancode >=" & vInt1 & " and Scancode <" & s)
		If cursorWrapper2.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper2.RowCount - 1
			Dim i3 As Int
			For i3 = 0 To rowCount
				cursorWrapper2.Position = i3
				vButtonArr1(i3).Text = cursorWrapper2.GetString("Descrizione")
				mod1.vBln6 = True
				Dim vTmp As Int = Sub010(cursorWrapper2.GetString("BtnStyle"))
				Dim buttonWrapper As Button = vButtonArr1(i3)
				buttonWrapper.Background = mod1.Sub155(vTmp, 35)
			Next
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Selrow_Click
	Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
	Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
	vCur1.Position = getpanel.GetView(5).Text
	Dim inputDialog As InputDialog
	inputDialog.InputType = 1
	inputDialog.Input = vCur1.GetString("IP")
	inputDialog.PasswordMode = False
	inputDialog.Hint = "Indirizzo IP"
	inputDialog.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim str As String = "Inserire l'indirizzo Ip per il palmare con matricola " & vCur1.GetString("Serial")
	Dim vShow As Int = inputDialog.Show(str, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 And inputDialog.Input <> "" Then
		If Not(mod1.Sub129(inputDialog.Input)) Then
			Dim vObjectToCharSequence As Object = "inserire un indirizzo IP valido per il palmare con matricola " & vCur1.GetString("Serial")
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Else
			Main.vSql1.ExecNonQuery("update Palmari set IP='" & inputDialog.Input & "' where Serial = '" & vCur1.GetString("Serial") & "'")
		End If
	End If
	Sub006()
End Sub

Sub Sub010(str As String) As Int
	Select str
		Case "DefaultRev"
			Return Colors.RGB(192, 64, 0)
		Case "Default16"
			Return Colors.RGB(192, 0, 0)
		Case "Default"
			Return -7829368
		Case "FlagRight"
			Return Colors.RGB(192, 192, 0)
		Case "MenuBar_Default_1"
			Return Colors.RGB(0, 192, 0)
		Case "MenuBar_Default_16"
			Return Colors.RGB(0, 192, 192)
		Case "ActionBar_Default_4"
			Return Colors.RGB(0, 0, 192)
		Case "Flat"
			Return Colors.RGB(192, 0, 192)
		Case Else
			Return -65536
	End Select
End Sub

Sub Sub011(concreteViewWrapper As View)
	a1.InitializeRotateCenter("", 0, 180, concreteViewWrapper)
	a1.Duration = 1000
	a1.RepeatCount = 1
	Dim animationWrapper2 As Animation = a1
	a1.RepeatMode = 2
	a1.Start(concreteViewWrapper)
End Sub

Sub Timer1_Tick
	v7.Enabled = False
	Dim parseDouble As Double = Main.vSql1.ExecQuerySingleResult("Select count(*) from Palmari where Attivo = 1")
	If parseDouble >= Main.vInt20 Then
		Dim vObjectToCharSequence As Object = "Raggiunto il numero massimo (" & Main.vInt20 & ") di palmari attivabili."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	Else
		Dim inputDialog As InputDialog
		inputDialog.InputType = 1
		inputDialog.Input = vCur1.GetString("IP")
		inputDialog.PasswordMode = False
		inputDialog.Hint = "Indirizzo IP"
		inputDialog.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim str As String = "Inserire l'indirizzo Ip per il palmare con matricola " & vCur1.GetString("Serial")
		Dim vShow As Int = inputDialog.Show(str, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And inputDialog.Input <> "" Then
			If Not(mod1.Sub129(inputDialog.Input)) Then
				Dim vObjectToCharSequence3 As Object = "inserire un indirizzo IP valido per il palmare con matricola " & vCur1.GetString("Serial")
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			Else
				Main.vSql1.ExecNonQuery("update Palmari set Attivo = 1,IP='" & inputDialog.Input & "' where Serial = '" & vCur1.GetString("Serial") & "'")
			End If
		End If
	End If
	Sub006()
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

