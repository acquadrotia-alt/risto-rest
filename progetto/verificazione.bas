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
	Public vBln2 As Boolean
	Public vBln3 As Boolean
	Public vBln4 As Boolean
	Public vBln5 As Boolean
End Sub

Sub Globals
	Public ver_Btn_Close1 As Button
	Public ver_pnlserv As Panel
	Public ver_pnlver As Panel
	Public ver_Btn_Close2 As Button
	Public ver_btn_CF As Button
	Public ver_btn_DataOra As Button
	Public ver_edt_DescrRiga As EditText
	Public ver_btn_StampaScontr As Button
	Public ver_edt_MFda As EditText
	Public ver_edt_MFa As EditText
	Public ver_edt_NumDaDGFE As EditText
	Public ver_edt_NumaDGFE As EditText
	Public ver_btn_StampaDGFEScontr As Button
	Public ver_edt_DGFEchiusDA As EditText
	Public ver_edt_DGFEchiusA As EditText
	Public ver_btn_stampaDGFEchius As Button
	Public ver_lbl_TitoloVer As Label
	Public ver_btn_StampaMFDate As Button
	Public ver_btn_StampaMFnum As Button
	Public ver_btn_DataDa As Button
	Public ver_btn_Dataa As Button
	Public ver_btn_GiornoDGFE As Button
	Public ver_edt_Importo As EditText
	Public ver_btn_PanelServ As Button
	Public ver_Btn_Fisc As Button
	Public ver_Btn_Inizializza As Button
	Public ver_Btn_PanelVer As Button
	Public vCSBuilder1 As CSBuilder
	Public vclsverificazione1 As clsverificazione
	Public ver_Btn_SetDataVer As Button
	Public ver_Btn_SendLogo As Button
	Public AnnullaStampa As Button
	Public Contrasto As Button
	Public Intensita As Button
	Public Luminosita As Button
	Public ver_lbl_Importo As Label
	Public ver_lbl_DescrRiga As Label
	Public ver_lbl_ScontrProva As Label
	Public ver_lbl_StampaMF As Label
	Public ver_lbl_DataDa As Label
	Public ver_lbl_DataA As Label
	Public ver_lbl_MFda As Label
	Public ver_lbl_MFa As Label
	Public ver_Btn_PanelRT As Button
	Public ver_pnlUtilityRT As Panel
	Public vLv1 As ListView
	Public vObj1 As Object
	Public ver_Btn_CloseRT As Button
	Public ver_Btn_PanelVerRT As Button
	Public pnlCensimento As Panel
	Public edt_Censimento_CFT As EditText
	Public edt_Censimento_PIL As EditText
	Public pnlAttivazione As Panel
	Public btn_Attivazione_Data As Button
	Public chk_Attivazione_telematico As CheckBox
	Public edt_Attivazione_CFT As EditText
	Public edt_Attivazione_PIL As EditText
	Public edt_Attivazione_CFE As EditText
	Public lblRT As Label
	Public edt_IntTecnico_CFT As EditText
	Public edt_IntTecnico_PIL As EditText
	Public edt_IntTecnico_NOTE As EditText
	Public pnlIntTecnico As Panel
	Public btn_IntTecnico_CIT As Button
	Public tgl_Evento_FS As ToggleButton
	Public tgl_Evento_D1 As ToggleButton
	Public tgl_Evento_D2 As ToggleButton
	Public btn_Evento_COD As Button
	Public edt_Evento_DES As EditText
	Public pnlEvento As Panel
	Public ver_btn_InfoRT As Button
	Public SbloccaMemorie As Button
	Public BloccaMemorie As Button
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
			Sub003("Layout_VerificazioneMF")
			vclsverificazione1.Initialize
			vLv1.Initialize("lv")
			Dim vInitialize As CSBuilder = vCSBuilder1.Initialize
			vLv1.AddSingleLine(vInitialize.Typeface(Typeface.MONOSPACE).Size(25).Color(-13860350).Append("Elenco Funzioni RT").PopAll)
			Dim vSize As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(16)
			Dim vObjectToCharSequence As Object = vSize.Color(-16777216).Append("     Genera chiave").PopAll
			Dim vSize2 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(14)
			vLv1.AddTwoLines(vObjectToCharSequence, vSize2.Color(-7829368).Append("       Esegui la generazione della chiave privata").PopAll)
			Dim vSize3 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(16)
			Dim vObjectToCharSequence2 As Object = vSize3.Color(-16777216).Append("     Censimento").PopAll
			Dim vSize4 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(14)
			vLv1.AddTwoLines(vObjectToCharSequence2, vSize4.Color(-7829368).Append("       Esegui il censimento").PopAll)
			Dim vSize5 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(16)
			Dim vObjectToCharSequence3 As Object = vSize5.Color(-16777216).Append("     Attivazione").PopAll
			Dim vSize6 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(14)
			vLv1.AddTwoLines(vObjectToCharSequence3, vSize6.Color(-7829368).Append("       Imposta anche la data di 'messa in servizio'").PopAll)
			Dim vSize7 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(16)
			Dim vObjectToCharSequence4 As Object = vSize7.Color(-16777216).Append("     In Servizio").PopAll
			Dim vSize8 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(14)
			vLv1.AddTwoLines(vObjectToCharSequence4, vSize8.Color(-7829368).Append("       Esegui la procedura di messa in servizio").PopAll)
			Dim vSize9 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(16)
			Dim vObjectToCharSequence5 As Object = vSize9.Color(-16777216).Append("     Intervento Tecnico").PopAll
			Dim vSize10 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(14)
			vLv1.AddTwoLines(vObjectToCharSequence5, vSize10.Color(-7829368).Append("       Per gestire l'inizio e la fine della verifica").PopAll)
			Dim vSize11 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(16)
			Dim vObjectToCharSequence6 As Object = vSize11.Color(-16777216).Append("     Evento").PopAll
			Dim vSize12 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(14)
			vLv1.AddTwoLines(vObjectToCharSequence6, vSize12.Color(-7829368).Append("       Esegue uno degli eventi di cambio di stato").PopAll)
			lblRT.TextColor = -13860350
			Main.vccefdll1.rt_leggistato(False)
			ver_pnlUtilityRT.AddView(vLv1, 0, 0, PerXToCurrent(50), PerYToCurrent(100))
			Activity.Title = "Verificazione SF"
			If Main.v_matricola.StartsWith("ST") Then
				If Main.vccefdll1.vStr3 <> "" Then
					ver_lbl_TitoloVer.Text = ver_lbl_TitoloVer.Text & " " & Main.vccefdll1.vStr3
				End If
			End If
			ver_Btn_Close1.Background = mod1.Sub155(-65536, 25)
			ver_Btn_Close2.Background = mod1.Sub155(-65536, 25)
			ver_Btn_CloseRT.Background = mod1.Sub155(-65536, 25)
			ver_btn_CF.Background = mod1.Sub155(-16776961, 25)
			ver_btn_DataOra.Background = mod1.Sub155(-16776961, 25)
			ver_btn_StampaScontr.Background = mod1.Sub155(-16776961, 25)
			ver_btn_InfoRT.Background = mod1.Sub155(-16776961, 25)
			ver_btn_StampaDGFEScontr.Background = mod1.Sub155(-16776961, 25)
			ver_btn_stampaDGFEchius.Background = mod1.Sub155(-16776961, 25)
			ver_btn_StampaMFDate.Background = mod1.Sub155(-16776961, 25)
			ver_btn_StampaMFnum.Background = mod1.Sub155(-16776961, 25)
			ver_btn_DataDa.Background = mod1.Sub155(-16776961, 25)
			ver_btn_Dataa.Background = mod1.Sub155(-16776961, 25)
			ver_btn_GiornoDGFE.Background = mod1.Sub155(-16776961, 25)
			ver_btn_PanelServ.Background = mod1.Sub155(-16776961, 25)
			ver_Btn_PanelRT.Background = mod1.Sub155(-16776961, 25)
			ver_Btn_PanelVerRT.Background = mod1.Sub155(-16776961, 25)
			ver_Btn_Fisc.Background = mod1.Sub155(-16776961, 25)
			ver_Btn_SetDataVer.Background = mod1.Sub155(-16776961, 25)
			ver_Btn_Inizializza.Background = mod1.Sub155(-16776961, 25)
			ver_Btn_PanelVer.Background = mod1.Sub155(-16776961, 25)
			AnnullaStampa.Background = mod1.Sub155(-16711681, 25)
			ver_Btn_SendLogo.Background = mod1.Sub155(-16776961, 25)
			SbloccaMemorie.Background = mod1.Sub155(-16776961, 25)
			BloccaMemorie.Background = mod1.Sub155(-16776961, 25)
			ver_Btn_SendLogo.Visible = Main.v_tipointerfaccia <> 1
			Contrasto.Visible = Main.v_matricola.StartsWith("ST")
			Luminosita.Visible = Main.v_matricola.StartsWith("ST")
			Intensita.Visible = Main.v_matricola.StartsWith("ST")
			Contrasto.Background = mod1.Sub155(-16776961, 25)
			Luminosita.Background = mod1.Sub155(-16776961, 25)
			Intensita.Background = mod1.Sub155(-16776961, 25)
			ver_Btn_Close2.TextColor = -1
			ver_btn_CF.TextColor = -1
			ver_btn_DataOra.TextColor = -1
			ver_btn_StampaScontr.TextColor = -1
			ver_btn_StampaDGFEScontr.TextColor = -1
			ver_btn_stampaDGFEchius.TextColor = -1
			ver_btn_StampaMFDate.TextColor = -1
			ver_btn_StampaMFnum.TextColor = -1
			ver_btn_DataDa.TextColor = -1
			ver_btn_Dataa.TextColor = -1
			ver_btn_GiornoDGFE.TextColor = -1
			ver_btn_PanelServ.TextColor = -1
			ver_Btn_PanelRT.TextColor = -1
			ver_Btn_PanelVerRT.TextColor = -1
			ver_Btn_SetDataVer.TextColor = -1
			ver_Btn_Inizializza.TextColor = -1
			ver_Btn_PanelVer.TextColor = -1
			mod1.Sub161(ver_pnlserv, 0)
			mod1.Sub161(ver_pnlUtilityRT, 0)
			ver_pnlserv.Visible = False
			ver_pnlUtilityRT.Visible = False
			mod1.Sub161(ver_pnlver, 7)
			ver_pnlver.Visible = True
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

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/verificazione.java, metodo _activity_resume (riga 833).
Sub Activity_Resume
	Dim z As Boolean
	Main.vccefdll1.vInt5 = 1
	Dim phone As Phone = Main.vPhone1
	Phone.SetScreenBrightness(Main.v_screenbrightness)
	If Main.v_matricola.StartsWith("ST") Then
		Intensita.Tag = 0
		Contrasto.Tag = 0
		Luminosita.Tag = 0
		Dim mf_getdisplaystampa As Int = Main.vccefdll1.mf_getdisplaystampa("1")
		If mf_getdisplaystampa >= 0 Then
			Intensita.Tag = mf_getdisplaystampa
			Intensita.Text = "Intensità di stampa =" & mf_getdisplaystampa
		Else
			Dim vObjectToCharSequence As Object = "Errore Richiesta dati"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		End If
		Dim mf_getdisplaystampa2 As Int = Main.vccefdll1.mf_getdisplaystampa("2")
		If mf_getdisplaystampa2 >= 0 Then
			Contrasto.Tag = mf_getdisplaystampa2
			Contrasto.Text = "Contrasto display =" & mf_getdisplaystampa2
		Else
			Dim vObjectToCharSequence3 As Object = "Errore Richiesta dati"
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		End If
		Dim mf_getdisplaystampa3 As Int = Main.vccefdll1.mf_getdisplaystampa("3")
		If mf_getdisplaystampa3 >= 0 Then
			Luminosita.Tag = mf_getdisplaystampa3
			Luminosita.Text = "Luminosità display =" & mf_getdisplaystampa3
		Else
			Dim vObjectToCharSequence5 As Object = "Errore Richiesta dati"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
		End If
		If vBln4 Then
			Main.vccefdll1.rt_leggistato(False)
			vBln4 = False
		End If
	End If
	vBln2 = False
	Dim buttonWrapper As Button = ver_Btn_PanelRT
	If Main.vccefdll1.vStr4 <> "" Then
		If Not(Main.vccefdll1.vBln11) Then
			z = True
			buttonWrapper.Visible = z
			If vBln1 Then
				ver_btn_PanelServ.Visible = False
				ver_Btn_PanelRT.Visible = False
				ver_lbl_TitoloVer.Visible = False
				ver_btn_CF.Visible = False
				ver_btn_DataOra.Visible = False
				ver_edt_DescrRiga.Visible = False
				ver_edt_Importo.Visible = False
				ver_btn_StampaScontr.Visible = False
				ver_lbl_Importo.Visible = False
				ver_lbl_DescrRiga.Visible = False
				ver_lbl_ScontrProva.Visible = False
				ver_lbl_StampaMF.Visible = False
				ver_btn_DataDa.Visible = False
				ver_btn_Dataa.Visible = False
				ver_lbl_DataDa.Visible = False
				ver_lbl_DataA.Visible = False
				ver_lbl_MFda.Visible = False
				ver_lbl_MFa.Visible = False
				ver_edt_MFa.Visible = False
				ver_edt_MFda.Visible = False
				ver_btn_StampaMFDate.Visible = False
				ver_btn_StampaMFnum.Visible = False
			End If
			DoEvents
			mod1.Sub081
			Return
		End If
	End If
	z = False
	buttonWrapper.Visible = z
	If vBln1 Then
	End If
	DoEvents
	mod1.Sub081
End Sub

Sub AnnullaStampa_Click
	Dim vObjectToCharSequence As Object = "Si desidera annullare la stampa ? "
	Dim vObjectToCharSequence2 As Object = "Attenzione"
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "No", "", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Main.vccefdll1.Sub026("5005", 1)
		AnnullaStampa.Visible = False
		Return
	End If
End Sub

Sub Sub001 As Boolean
	ProgressDialogShow2("Esecuzione comando in corso ...", False)
	Dim vTmp As Boolean = Main.vccefdll1.Sub001(True)
	ProgressDialogHide
	Return vTmp
End Sub

Sub BloccaMemorie_Click
	Main.vccefdll1.Sub008(False)
End Sub

Sub btn_Attivazione_Click
	Try
	Catch
		Msgbox("Si sono verificati errori ...", "Attenzione!")
		mod1.Sub217(LastException.Message)
	End Try
	If edt_Attivazione_CFT.Text.Trim = "" Or edt_Attivazione_PIL.Text.Trim = "" Or edt_Attivazione_CFE.Text.Trim = "" Or Not(chk_Attivazione_telematico.Checked) Then
		Msgbox("Inserire tutti i dati", "Attenzione!")
		Return
	End If
	If Not(mod1.Sub134(edt_Attivazione_CFT.Text.Trim, True)) Then
		Msgbox("Codice Fiscale del tecnico non valido", "Attenzione!")
		Return
	End If
	If Not(mod1.Sub134(edt_Attivazione_PIL.Text.Trim, True)) Then
		Msgbox("P.Iva laboratorio non valida", "Attenzione!")
		Return
	End If
	If Not(mod1.Sub134(edt_Attivazione_CFE.Text.Trim, True)) Then
		Msgbox("Codice Fiscale esercente non valido", "Attenzione!")
		Return
	End If
	Dim str As String = NumberFormat2(edt_Attivazione_CFT.Text.Length, 2, 0, 0, False) & edt_Attivazione_CFT.Text
	Dim str2 As String = NumberFormat2(edt_Attivazione_PIL.Text.Length, 2, 0, 0, False) & edt_Attivazione_PIL.Text
	Dim str3 As String = NumberFormat2(edt_Attivazione_CFE.Text.Length, 2, 0, 0, False) & edt_Attivazione_CFE.Text
	Dim vObjectToString As String = IIf(btn_Attivazione_Data.Tag <> "", btn_Attivazione_Data.Tag & "0", "0000001")
	Main.vccefdll1.vBln14 = True
	If Main.vccefdll1.Sub026("64013" & SmartStringFormatter("", str.ToUpperCase) & "" & SmartStringFormatter("", str2.ToUpperCase) & "" & SmartStringFormatter("", str3.ToUpperCase) & "" & SmartStringFormatter("", vObjectToString) & "", 1) <> 0 Then
		Main.vccefdll1.vBln14 = False
		Msgbox("Si sono verificati errori ..." & CRLF & "Provare ad eseguire una Chiusura Giornaliera", "Attenzione!")
		Return
	End If
	If Not(Sub001()) Then
		Msgbox("Si sono verificati problemi nella procedura di attivazione", "Attenzione!")
	Else
		Msgbox("Attivazione ultimata", "Attenzione!")
	End If
	Main.vccefdll1.vBln14 = False
	mod1.Sub081
End Sub

Sub btn_Attivazione_Data_Click
	Dim vTmp As Long = mod1.Sub058
	Dim dateDialog As DateDialog
	dateDialog.Year = DateTime.GetYear(vTmp)
	dateDialog.Month = DateTime.GetMonth(vTmp)
	dateDialog.DayOfMonth = DateTime.GetDayOfMonth(vTmp)
	Dim vShow As Int = dateDialog.Show("Impostare la data di messa in servizio", "data di messa in servizio", "Ok", "", "Annulla", Main.vBmp1)
	btn_Attivazione_Data.Tag = ""
	btn_Attivazione_Data.Text = "Data messa in servizio: "
	If vShow = -1 Then
		Dim vNumberToString As String = dateDialog.Year
		Dim str As String = NumberFormat(dateDialog.DayOfMonth, 2, 0) & "/" & NumberFormat(dateDialog.Month, 2, 0) & "/" & vNumberToString
		btn_Attivazione_Data.Tag = NumberFormat(dateDialog.DayOfMonth, 2, 0) & NumberFormat(dateDialog.Month, 2, 0) & vNumberToString.SubString2(2, 4)
		btn_Attivazione_Data.Text = "Data messa in servizio: " & str
	End If
	mod1.Sub081
End Sub

Sub btn_Censimento_Click
	If edt_Censimento_CFT.Text.Trim = "" Or edt_Censimento_PIL.Text.Trim = "" Then
		Msgbox("Inserire tutti i dati", "Attenzione!")
		Return
	End If
	If Not(mod1.Sub134(edt_Censimento_CFT.Text.Trim, True)) Then
		Msgbox("Codice Fiscale del tecnico non valido", "Attenzione!")
		Return
	End If
	If Not(mod1.Sub134(edt_Censimento_PIL.Text.Trim, True)) Then
		Msgbox("P.Iva laboratorio non valida", "Attenzione!")
		Return
	End If
	If Main.vccefdll1.Sub026("64012" & SmartStringFormatter("", NumberFormat2(edt_Censimento_CFT.Text.Length, 2, 0, 0, False)) & "" & SmartStringFormatter("", edt_Censimento_CFT.Text.ToUpperCase) & "" & SmartStringFormatter("", NumberFormat2(edt_Censimento_PIL.Text.Length, 2, 0, 0, False)) & "" & SmartStringFormatter("", edt_Censimento_PIL.Text.ToUpperCase) & "", 1) = 0 Then
		If Not(Sub001()) Then
			Msgbox("Si sono verificati problemi nella procedura di censimento", "Attenzione!")
		Else
			Msgbox("Censimento ultimato", "Attenzione!")
		End If
	End If
	mod1.Sub081
End Sub

Sub btn_Evento_Click
	Dim str As String
	Try
	Catch
		Msgbox("Si sono verificati errori ...", "Attenzione!")
		mod1.Sub217(LastException.Message)
	End Try
	If btn_Evento_COD.Tag = "" Or edt_Evento_DES.Text.Trim = "" Then
		Msgbox("Inserire tutti i dati", "Attenzione!")
		mod1.Sub081
		Return
	End If
	Dim vObjectToString As String = btn_Evento_COD.Tag
	Dim str2 As String = NumberFormat2('### r8.length(), 2, 0, 0, False) & modfunstr.left(edt_Evento_DES.Text, 50)
	If tgl_Evento_D1.Checked Then
		str = "2"
	Else If Not(tgl_Evento_D2.Checked) Then
		str = "1"
	Else
		str = "3"
	End If
	Main.vccefdll1.vBln14 = True
	If Main.vccefdll1.Sub026("6402" & SmartStringFormatter("", str) & "" & SmartStringFormatter("", vObjectToString) & "" & SmartStringFormatter("", str2.ToUpperCase) & "", 1) = 0 Then
		Main.vccefdll1.vBln14 = False
		If Not(Sub001()) Then
			Msgbox("Si sono verificati problemi nell'invio dell'evento", "Attenzione!")
		Else
			Msgbox("Evento ultimato", "Attenzione!")
		End If
	Else
		Main.vccefdll1.vBln14 = False
		Msgbox("Si sono verificati errori ..." & CRLF & "Provare ad eseguire una Chiusura Giornaliera", "Attenzione!")
	End If
	Main.vccefdll1.vBln14 = False
	mod1.Sub081
End Sub

Sub btn_Evento_COD_Click
	btn_Evento_COD.Tag = ""
	btn_Evento_COD.Text = "Inserire il codice dell'evento"
	edt_Evento_DES.Text = ""
	Dim list As List
	list.Initialize
	If tgl_Evento_FS.Checked Then
		list.AddAll(ArrayToList(Array As String("00600 - Memoria esaurita", "00601 - Altro", "00607 - Malfunzionamento", "00608 - Magazzino")))
	Else If tgl_Evento_D1.Checked Then
		list.AddAll(ArrayToList(Array As String("00601 - Altro", "00603 - Cessione", "00604 - Furto")))
	Else If tgl_Evento_D2.Checked Then
		list.AddAll(ArrayToList(Array As String("00601 - Altro", "00606 - Smaltimento", "00609 - Memoria di riepilogo esaurita")))
	End If
	Dim vInputList As Int = InputList(list, "Codice evento", -1)
	If vInputList >= 0 Then
		Dim vObjectToString As String = list.Get(vInputList)
		btn_Evento_COD.Tag = vObjectToString.SubString2(0, 5)
		btn_Evento_COD.Text = "Codice Evento:" & vObjectToString
		edt_Evento_DES.Text = vObjectToString.SubString(8)
	End If
	mod1.Sub081
End Sub

Sub btn_IntTecnico_CIT_Click
	btn_IntTecnico_CIT.Tag = ""
	btn_IntTecnico_CIT.Text = "Inserire il codice di intervento tecnico"
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(Array As String("1. Manutenzione", "2. Sostituzione memoria al dettaglio", "3. Verifica periodica positiva", "4. Verifica periodica negativa", "5. Verifica periodica ritiro appareccio", "6. Altro")))
	Dim vInputList As Int = InputList(list, "Codice intervento tecnico", -1)
	If vInputList >= 0 Then
		btn_IntTecnico_CIT.Tag = vInputList + 1
		btn_IntTecnico_CIT.Text = "Codice intervento tecnico:" & list.Get(vInputList)
	End If
	mod1.Sub081
End Sub

Sub btn_IntTecnico_END_Click
	If edt_IntTecnico_CFT.Text.Trim = "" Or edt_IntTecnico_PIL.Text.Trim = "" Or btn_IntTecnico_CIT.Tag = "" Or edt_IntTecnico_NOTE.Text.Trim = "" Then
		Msgbox("Inserire tutti i dati", "Attenzione!")
		Return
	End If
	If Not(mod1.Sub134(edt_IntTecnico_CFT.Text.Trim, True)) Then
		Msgbox("Codice Fiscale del tecnico non valido", "Attenzione!")
		Return
	End If
	If Not(mod1.Sub134(edt_IntTecnico_PIL.Text.Trim, True)) Then
		Msgbox("P.Iva laboratorio non valida", "Attenzione!")
		Return
	End If
	Dim str As String = NumberFormat2(edt_IntTecnico_CFT.Text.Length, 2, 0, 0, False) & edt_IntTecnico_CFT.Text
	Dim str2 As String = NumberFormat2(edt_IntTecnico_PIL.Text.Length, 2, 0, 0, False) & edt_IntTecnico_PIL.Text
	Dim vObjectToString As String = btn_IntTecnico_CIT.Tag
	edt_IntTecnico_NOTE.Text = modfunstr.left(edt_IntTecnico_NOTE.Text, 16)
	Dim str3 As String = NumberFormat2(edt_IntTecnico_NOTE.Text.Length, 2, 0, 0, False) & edt_IntTecnico_NOTE.Text
	Try
		Main.vccefdll1.vBln14 = True
		If Main.vccefdll1.Sub026("64041" & SmartStringFormatter("", vObjectToString) & "" & SmartStringFormatter("", str.ToUpperCase) & "" & SmartStringFormatter("", str2.ToUpperCase) & "" & SmartStringFormatter("", str3.ToUpperCase) & "", 1) = 0 Then
			If Not(Sub001()) Then
				Msgbox("Si sono verificati problemi nel salvataggio dati", "Attenzione!")
			Else
				vBln2 = True
				ProgressDialogShow2("Esecuzione chiusura per fine intervento tecnico in corso ...", False)
				DoEvents
				Main.vccefdll1.mf_eod("ModVerificazione")
				ProgressDialogHide
				Msgbox("Procedura ultimata correttamente." & CRLF & "L'intervento è stato inserito nel file xml", "Attenzione!")
				edt_IntTecnico_CFT.Text = ""
				edt_IntTecnico_PIL.Text = ""
				btn_IntTecnico_CIT.Tag = ""
				btn_IntTecnico_CIT.Text = "Inserire il codice di intervento tecnico"
				edt_IntTecnico_NOTE.Text = ""
			End If
		Else
			Msgbox("Si sono verificati errori ..." & CRLF & "Provare ad eseguire una Chiusura Giornaliera", "Attenzione!")
		End If
	Catch
		Msgbox("Si sono verificati errori ...", "Attenzione!")
		mod1.Sub217(LastException.Message)
	End Try
	Main.vccefdll1.vBln14 = False
	mod1.Sub081
End Sub

Sub btn_IntTecnico_START_Click
	Dim vObjectToCharSequence As Object = "Confermi l'inizio della procedura di verifica ? "
	Dim vObjectToCharSequence2 As Object = "Attenzione"
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "No", "", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Try
			Main.vccefdll1.vBln14 = True
			If Main.vccefdll1.Sub026("64040", 1) = 0 Then
				Msgbox("Procedura di verifica iniziata", "Attenzione!")
			Else
				Msgbox("Si sono verificati errori ..." & CRLF & "Provare ad eseguire una Chiusura Giornaliera", "Attenzione!")
			End If
		Catch
			Msgbox("Si sono verificati errori ...", "Attenzione!")
			mod1.Sub217(LastException.Message)
		End Try
		Main.vccefdll1.vBln14 = False
		Return
	End If
End Sub

Sub chk_Attivazione_telematico_CheckedChange(z As Boolean)
	btn_Attivazione_Data.Enabled = z
End Sub

Sub Contrasto_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = Contrasto.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il valore di Contrasto del display (da 0 a 99)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number < 0 Or numberDialog.Number > 99 Then
			Dim vObjectToCharSequence As Object = "Verificare i valori inseriti."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Return
		End If
		Contrasto.Tag = numberDialog.Number
		Contrasto.Text = "Contrasto display =" & numberDialog.Number
		Main.vccefdll1.mf_setdisplaystampa("2", numberDialog.Number)
	End If
End Sub

Sub Sub002 As Object
	Dim javaObject As JavaObject
	javaObject.InitializeStatic(Me.SubString("class ".Length))
	Return javaObject.GetField("processBA")
End Sub

Sub Intensita_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = Intensita.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il valore per l'intensità di stampa (da 0 a 12)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number < 0 Or numberDialog.Number > 12 Then
			Dim vObjectToCharSequence As Object = "Verificare i valori inseriti."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Return
		End If
		Intensita.Tag = numberDialog.Number
		Intensita.Text = "Intensità di stampa =" & numberDialog.Number
		Main.vccefdll1.mf_setdisplaystampa("1", numberDialog.Number)
	End If
End Sub

Sub ion_event(str As String, objArr As Object()) As Object
	If -1 <> objArr(0) Then
		Dim vObjectToCharSequence As Object = "Si sono verificati problemi in chiusura."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	End If
	If Main.vccefdll1.vBln15 Then
		If Main.vccefdll1.vBln8 Then
			Main.vccefdll1.rt_verificamagazzino
		End If
	End If
	Return Null
End Sub

Sub Sub003(str As String)
	Dim numberOfViews As Int
	For numberOfViews = Activity.NumberOfViews - 1 To 0 Step -1
		Activity.RemoveViewAt(numberOfViews)
	Next
	Activity.LoadLayout(str)
End Sub

Sub Luminosita_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = Luminosita.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il valore di luminosità del display (da 0 a 99)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number < 0 Or numberDialog.Number > 99 Then
			Dim vObjectToCharSequence As Object = "Verificare i valori inseriti."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Return
		End If
		Luminosita.Tag = numberDialog.Number
		Luminosita.Text = "Luminosità display =" & numberDialog.Number
		Main.vccefdll1.mf_setdisplaystampa("3", numberDialog.Number)
	End If
End Sub

Sub Lv_ItemClick(i As Int, obj As Object)
	Dim vObjectToString As String = obj
	Sub004()
	lblRT.Text = vObjectToString
	Select vObjectToString.Trim
		Case "Genera chiave"
			Dim vObjectToCharSequence As Object = "Confermi la generazione della chiave privata ? "
			Dim vObjectToCharSequence2 As Object = "Attenzione"
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "No", "", Main.vBmp1)
			If vMsgbox2 = -1 Then
				If Main.vccefdll1.Sub026("64011", 1) = 0 Then
					If Not(Sub001()) Then
						Msgbox("Si sono verificati problemi nella procedura di generazione delle chiavi", "Attenzione!")
					Else
						Msgbox("Generazione delle chiavi ultimata", "Attenzione!")
					End If
				End If
			End If
		Case "Censimento"
			pnlCensimento.SetVisibleAnimated(300, True)
		Case "Attivazione"
			btn_Attivazione_Data.Tag = ""
			btn_Attivazione_Data.Text = "Data messa in servizio:"
			pnlAttivazione.SetVisibleAnimated(300, True)
		Case "In Servizio"
			Dim vObjectToCharSequence3 As Object = "Confermi l'esecuzione della procedura di messa in servizio ? "
			Dim vObjectToCharSequence4 As Object = "Attenzione"
			Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "No", "", Main.vBmp1)
			If vMsgbox22 = -1 Then
				If Main.vccefdll1.Sub026("64015000000", 1) = 0 Then
					If Not(Sub001()) Then
						Msgbox("Si sono verificati problemi nella procedura di messa in servizio", "Attenzione!")
					Else
						Msgbox("Messa in servizio ultimata", "Attenzione!")
					End If
				End If
			End If
		Case "Intervento Tecnico"
			pnlIntTecnico.SetVisibleAnimated(300, True)
			btn_IntTecnico_CIT.Tag = ""
			btn_IntTecnico_CIT.Text = "Inserire il codice di intervento tecnico"
		Case "Evento"
			pnlEvento.SetVisibleAnimated(300, True)
			btn_Evento_COD.Tag = ""
			btn_Evento_COD.Text = "Inserire il codice dell'evento"
	End Select
	mod1.Sub081
End Sub

Sub msgboxonly(str As String, str2 As String)
	Dim vObjectToCharSequence As Object = str2
	Dim vObjectToCharSequence2 As Object = str
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "", "", "Ok", Main.vBmp1)
End Sub

Sub Sub004
	pnlCensimento.Visible = False
	pnlAttivazione.Visible = False
	pnlIntTecnico.Visible = False
	pnlEvento.Visible = False
End Sub

Sub pnlCensimento_Click
End Sub

Sub pnlEvento_Click
End Sub

Sub pnlIntTecnico_Click
End Sub

Sub SbloccaMemorie_Click
	Main.vccefdll1.Sub008(True)
End Sub

Sub sceltadata(z As Boolean, str As String) As Long()
	Dim jArr(2) As Long
	Dim dateDialog As DateDialog
	Dim timeDialog As TimeDialog
	DateTime.DateFormat = "dd/MM/yyyy"
	If str = "" Then
		Dim vGetDayOfMonth As Int = DateTime.GetDayOfMonth(mod1.Sub058)
		Dim vGetMonth As Int = DateTime.GetMonth(mod1.Sub058)
		dateDialog.SetDate(vGetDayOfMonth, vGetMonth, DateTime.GetYear(mod1.Sub058))
	Else
		dateDialog.DateTicks = DateTime.DateParse(str)
	End If
	jArr(0) = dateDialog.DateTicks
	dateDialog.Show("Scegliere la data", "Scelta della data", "OK", "Cancel", "", Null)
	Dim response As Int = dateDialog.Response
	If response = -1 Then
		jArr(0) = dateDialog.DateTicks
	End If
	If z Then
		If str = "" Then
			Dim vGetHour As Int = DateTime.GetHour(mod1.Sub058)
			timeDialog.SetTime(vGetHour, DateTime.GetMinute(mod1.Sub058), True)
		Else
			timeDialog.TimeTicks = DateTime.DateParse(str)
		End If
		jArr(1) = timeDialog.TimeTicks
		timeDialog.Show("Scegliere l'ora", "Scelta dell'ora", "OK", "Cancel", "", Null)
		Dim response2 As Int = timeDialog.Response
		If response2 = -1 Then
			jArr(1) = timeDialog.TimeTicks
		End If
	End If
	Return jArr
End Sub

Sub startactivityforresult(intentWrapper As Intent)
	Dim javaObject As JavaObject = Sub002()
	vObj1 = javaObject.CreateEvent("anywheresoftware.b4a.IOnActivityResult", "ion", Null)
	javaObject.RunMethod("startActivityForResult", Array(vObj1, intentWrapper))
End Sub

Sub tgl_Evento_CheckedChange(z As Boolean)
	If vBln5 Then
		Return
	End If
	Dim toggleButtonWrapper As ToggleButton = Sender
	Dim vObjectToNumber As Int = toggleButtonWrapper.Tag
	If z And vObjectToNumber = 2 Then
		Dim inputDialog As InputDialog
		inputDialog.InputType = 2
		inputDialog.Input = ""
		inputDialog.PasswordMode = True
		inputDialog.Hint = "Password di accesso"
		inputDialog.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow As Int = inputDialog.Show("Inserire la Password di accesso per il menù di dismissione", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If Not(vShow = -1 And (inputDialog.Input = "147896" Or inputDialog.Input = "3698741")) Then
			tgl_Evento_D2.Checked = False
			mod1.Sub081
			Return
		End If
		mod1.Sub081
	End If
	vBln5 = True
	If Not(z) Then
		toggleButtonWrapper.Checked = True
		vBln5 = False
		Return
	End If
	btn_Evento_COD.Tag = ""
	btn_Evento_COD.Text = "Inserire il codice dell'evento"
	edt_Evento_DES.Text = ""
	Select vObjectToNumber
		Case 0
			tgl_Evento_D1.Checked = False
			tgl_Evento_D2.Checked = False
		Case 1
			tgl_Evento_FS.Checked = False
			tgl_Evento_D2.Checked = False
		Case 2
			tgl_Evento_D1.Checked = False
			tgl_Evento_FS.Checked = False
	End Select
	vBln5 = False
End Sub

Sub ver_btn_CF_Click
	Dim vObjectToCharSequence As Object = "Confermi la Chiusura Giornaliera?"
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Conferma", "Annulla", "", Main.vBmp1)
	If vMsgbox2 = -1 Then
		vBln2 = True
		ProgressDialogShow2("Invio dati di vendita in corso ...", False)
		DoEvents
		Main.vccefdll1.mf_eod("ModVerificazione")
		ProgressDialogHide
		Dim vObjectToCharSequence3 As Object = "Operazione completata"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
	Else
		Dim vObjectToCharSequence5 As Object = "Operazione annullata"
		Dim vObjectToCharSequence6 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
	End If
	mod1.Sub081
End Sub

Sub ver_Btn_Close1_Click
	vBln2 = True
	Main.vccefdll1.vInt5 = 0
	DateTime.DateFormat = "MM/dd/yyyy"
	If vBln1 Then
		mod1.Sub198("Main")
	Else
		mod1.Sub198("Configura")
	End If
	vBln1 = False
	Activity.Finish
End Sub

Sub ver_Btn_Close2_Click
	vBln2 = True
	Main.vccefdll1.vInt5 = 0
	DateTime.DateFormat = "MM/dd/yyyy"
	If ver_pnlUtilityRT.Visible Then
		Main.vccefdll1.rt_leggistato(False)
	End If
	If vBln1 Then
		mod1.Sub198("Main")
	Else
		mod1.Sub198("Configura")
	End If
	vBln1 = False
	Activity.Finish
End Sub

Sub ver_btn_Dataa_Click
	Dim jArr(2) As Long
	Dim sceltadata_() As Long = sceltadata(False, ver_btn_Dataa.Text)
	DateTime.DateFormat = "dd/MM/yyyy"
	ver_btn_Dataa.Text = DateTime.Date(sceltadata_(0))
	mod1.Sub081
End Sub

Sub ver_btn_DataDa_Click
	Dim jArr(2) As Long
	Dim sceltadata_() As Long = sceltadata(False, ver_btn_DataDa.Text)
	DateTime.DateFormat = "dd/MM/yyyy"
	ver_btn_DataDa.Text = DateTime.Date(sceltadata_(0))
	mod1.Sub081
End Sub

Sub ver_btn_DataOra_Click
	vclsverificazione1.Sub002
	mod1.Sub081
End Sub

Sub ver_Btn_Fisc_Click
	vclsverificazione1.Sub001
	mod1.Sub081
End Sub

Sub ver_btn_GiornoDGFE_Click
	Dim jArr(2) As Long
	Dim sceltadata_() As Long = sceltadata(False, ver_btn_GiornoDGFE.Text)
	DateTime.DateFormat = "dd/MM/yyyy"
	ver_btn_GiornoDGFE.Text = DateTime.Date(sceltadata_(0))
	mod1.Sub081
End Sub

Sub ver_btn_InfoRT_Click
	Dim i As Int
	Dim i2 As Int
	Dim i3 As Int
	Dim i4 As Int
	Dim i5 As Int
	Try
		Dim vSize As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Initialize.Size(16)
		vSize.Color(-16777216)
		Dim vTypeface As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE)
		Dim vPop As CSBuilder = vTypeface.Color(-16777216).Append("Modalità Attivazione     ").Pop
		If Main.vccefdll1.vBln15 Then
			i = -16711936
		Else
			i = -65536
		End If
		Dim vColor As CSBuilder = vPop.Color(i)
		vColor.Append(IIf(Main.vccefdll1.vBln15, "RT", "MF")).Append(CRLF)
		Dim vTypeface2 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE)
		Dim vPop2 As CSBuilder = vTypeface2.Color(-16777216).Append("Chiavi generate          ").Pop
		If Main.vccefdll1.vtattivazionert1.generateChiavi Then
			i2 = -16711936
		Else
			i2 = -65536
		End If
		Dim vColor2 As CSBuilder = vPop2.Color(i2)
		vColor2.Append(IIf(Main.vccefdll1.vtattivazionert1.generateChiavi, "SI", "NO")).Append(CRLF).Pop
		Dim vTypeface3 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE)
		Dim vPop3 As CSBuilder = vTypeface3.Color(-16777216).Append("Censita                  ").Pop
		If Main.vccefdll1.vtattivazionert1.Censita Then
			i3 = -16711936
		Else
			i3 = -65536
		End If
		Dim vColor3 As CSBuilder = vPop3.Color(i3)
		vColor3.Append(IIf(Main.vccefdll1.vtattivazionert1.Censita, "SI", "NO")).Append(CRLF).Pop
		Dim vTypeface4 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE)
		Dim vPop4 As CSBuilder = vTypeface4.Color(-16777216).Append("Attivata                 ").Pop
		If Main.vccefdll1.vtattivazionert1.Attivazione Then
			i4 = -16711936
		Else
			i4 = -65536
		End If
		Dim vColor4 As CSBuilder = vPop4.Color(i4)
		vColor4.Append(IIf(Main.vccefdll1.vtattivazionert1.Attivazione, "SI", "NO")).Append(CRLF).Pop
		Dim vTypeface5 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE)
		Dim vPop5 As CSBuilder = vTypeface5.Color(-16777216).Append("In servizio              ").Pop
		If Main.vccefdll1.vtattivazionert1.InService Then
			i5 = -16711936
		Else
			i5 = -65536
		End If
		Dim vColor5 As CSBuilder = vPop5.Color(i5)
		vColor5.Append(IIf(Main.vccefdll1.vtattivazionert1.Attivazione, "SI", "NO")).Append(CRLF).Pop
		If Main.vccefdll1.vtattivazionert1.InServiceDa > 0 Then
			Dim j As Long = Main.vccefdll1.vtattivazionert1.InServiceDa
			Dim vAppend As CSBuilder = vCSBuilder1.Color(-16777216).Append("Data messa in servizio   ")
			vAppend.Append(NumberFormat2(DateTime.GetDayOfMonth(j), 2, 0, 0, False) & "/" & NumberFormat2(DateTime.GetMonth(j), 2, 0, 0, False) & "/" & NumberFormat2(DateTime.GetYear(j), 4, 0, 0, False)).Append(CRLF).Pop
			Dim mf_leggidataora As String = Main.vccefdll1.mf_leggidataora
			If DateTime.DateTimeParse(mf_leggidataora.SubString2(2, 4) & "/" & mf_leggidataora.SubString2(0, 2) & "/20" & mf_leggidataora.SubString2(4, 6), mf_leggidataora.SubString2(6, 8) & ":" & mf_leggidataora.SubString2(8, 10) & ":00") <= j Then
				Dim vSize2 As CSBuilder = vCSBuilder1.Append(CRLF).Size(20)
				vSize2.Color(-16777216).Append("Messa in servizio tra:").Append(CRLF)
				Dim vSize3 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Size(16)
				vSize3.Append(NumberFormat2(DateUtils.periodbetweenindays(r8, j).Years, 2, 0, 0, False)).Append("   Anni").Append(CRLF)
				Dim vSize4 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Size(16)
				vSize4.Append(NumberFormat2(DateUtils.periodbetweenindays(r8, j).Months, 2, 0, 0, False)).Append("   Mesi").Append(CRLF)
				Dim vSize5 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Size(16)
				vSize5.Append(NumberFormat2(DateUtils.periodbetweenindays(r8, j).Days, 2, 0, 0, False)).Append(" Giorni").Append(CRLF)
				Dim vSize6 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Size(16)
				vSize6.Append(NumberFormat2(DateUtils.periodbetweenindays(r8, j).Hours, 2, 0, 0, False)).Append("    Ore").Append(CRLF)
				Dim vSize7 As CSBuilder = vCSBuilder1.Typeface(Typeface.MONOSPACE).Size(16)
				vSize7.Append(NumberFormat2(DateUtils.periodbetweenindays(r8, j).Minutes, 2, 0, 0, False)).Append(" Minuti").Append(CRLF)
			End If
		End If
		Dim vObjectToCharSequence As Object = vCSBuilder1.PopAll
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	Catch
		Dim vObjectToCharSequence3 As Object = "Funzione non utilizzabile."
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub ver_Btn_Inizializza_Click
	vclsverificazione1.Sub003
	mod1.Sub081
End Sub

Sub ver_Btn_PanelRT_Click
	If Not(Main.v_matricola.StartsWith("ST")) Then
		ver_pnlUtilityRT.Visible = True
		mod1.Sub161(ver_pnlUtilityRT, 7)
		ver_pnlver.Visible = False
		mod1.Sub161(ver_pnlver, 0)
		Return
	End If
	vBln2 = True
	Dim packageManagerWrapper As PackageManager
	vBln4 = True
	StartActivity(packageManagerWrapper.GetApplicationIntent("com.custom.utilityrt"))
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/verificazione.java, metodo _ver_btn_panelserv_click (riga 1991).
Sub ver_btn_PanelServ_Click
	Dim z As Boolean
	Dim z2 As Boolean = True
	ver_pnlserv.Visible = True
	Dim buttonWrapper As Button = SbloccaMemorie
	If Main.v_matricola.StartsWith("ST") Then
		If Main.vccefdll1.vStr3.Trim = "Spice T 12.00.44 11/12/20" Then
			z = True
			buttonWrapper.Visible = z
			If Main.v_matricola.StartsWith("ST") Then
			End If
			z2 = False
			BloccaMemorie.Visible = z2
			mod1.Sub161(ver_pnlserv, 7)
			ver_pnlver.Visible = False
			mod1.Sub161(ver_pnlver, 0)
			Return
		End If
	End If
	z = False
	buttonWrapper.Visible = z
	If Main.v_matricola.StartsWith("ST") Then
	End If
	z2 = False
	BloccaMemorie.Visible = z2
	mod1.Sub161(ver_pnlserv, 7)
	ver_pnlver.Visible = False
	mod1.Sub161(ver_pnlver, 0)
End Sub

Sub ver_Btn_PanelVer_Click
	ver_pnlver.Visible = True
	mod1.Sub161(ver_pnlver, 7)
	ver_pnlserv.Visible = False
	mod1.Sub161(ver_pnlserv, 0)
	Main.vccefdll1.rt_leggistato(False)
	ver_pnlUtilityRT.Visible = False
	mod1.Sub161(ver_pnlUtilityRT, 0)
End Sub

Sub ver_Btn_SendLogo_Click
	Dim fileDialog As FileDialog
	fileDialog.TextColor = -7829368
	fileDialog.FastScroll = True
	fileDialog.FileFilter = ".bmp"
	If Main.v_usbpath <> "" Then
		fileDialog.FilePath = Main.v_usbpath
	Else
		fileDialog.FilePath = mod1.vStr4
	End If
	Dim vObjectToCharSequence As Object = "Seleziona il file da inviare al " & Main.vStr1 & "."
	Dim vShow As Int = fileDialog.Show(vObjectToCharSequence, "OK", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		vclsverificazione1.Sub004(fileDialog.FilePath, fileDialog.ChosenName)
		Return
	End If
End Sub

Sub ver_Btn_SetDataVer_Click
	Dim vTmp As Long = mod1.Sub058
	Dim periodVar As Period
	periodVar.Years = 1
	Dim addperiod As Long = DateUtils.addperiod(vTmp, periodVar)
	Dim dateDialog As DateDialog
	dateDialog.Year = DateTime.GetYear(addperiod)
	dateDialog.Month = DateTime.GetMonth(addperiod)
	dateDialog.DayOfMonth = DateTime.GetDayOfMonth(addperiod)
	Dim vShow As Int = dateDialog.Show("Impostare la data della prossima Verifica Fiscale", "Data movimento", "Ok", "", "", Main.vBmp1)
	If vShow = -1 Then
		vclsverificazione1.Sub005(NumberFormat(dateDialog.Month, 2, 0) & dateDialog.Year.SubString(2))
		Return
	End If
End Sub

Sub ver_btn_stampaDGFEchius_Click
	Dim text As String = ver_edt_DGFEchiusDA.Text
	Dim text2 As String = ver_edt_DGFEchiusA.Text
	If Not(IsNumber(text)) Or Not(IsNumber(text2)) Then
		Dim vObjectToCharSequence As Object = "Verificare i valori inseriti."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	Else
		Dim parseDouble As Int = text
		Dim parseDouble2 As Int = text2
		If parseDouble >= 1 And parseDouble <= parseDouble2 Then
			If vclsverificazione1.Sub006(False, 0, parseDouble, parseDouble2) Then
				If Main.v_matricola.StartsWith("ST") Then
					AnnullaStampa.Visible = True
				End If
			End If
		Else
			Dim vObjectToCharSequence3 As Object = "Verificare numero iniziale."
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		End If
	End If
	mod1.Sub081
End Sub

Sub ver_btn_StampaDGFEScontr_Click
	Dim text As String = ver_edt_NumDaDGFE.Text
	Dim text2 As String = ver_edt_NumaDGFE.Text
	If Not(IsNumber(text)) Or Not(IsNumber(text2)) Then
		Dim vObjectToCharSequence As Object = "Verificare i valori inseriti."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	Else
		Dim parseDouble As Int = text
		Dim parseDouble2 As Int = text2
		If parseDouble < 1 Or parseDouble > parseDouble2 Then
			Dim vObjectToCharSequence3 As Object = "Verificare numero iniziale."
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		Else If ver_btn_GiornoDGFE.Text <> "" And Not(ver_btn_GiornoDGFE.Text = Null) Then
			DateTime.DateFormat = "dd/MM/yyyy"
			Dim vDateParse As Long = DateTime.DateParse(ver_btn_GiornoDGFE.Text)
			If vDateParse < DateTime.DateParse("01/01/2000") Then
				Msgbox("Data non valida! Inserire una data successiva al 31/12/1999.", "Attenzione!")
			Else
				If vclsverificazione1.Sub006(True, DateTime.DateParse(ver_btn_GiornoDGFE.Text), parseDouble, parseDouble2) Then
					If Main.v_matricola.StartsWith("ST") Then
						AnnullaStampa.Visible = True
					End If
				End If
			End If
		Else
			Dim vObjectToCharSequence5 As Object = "Inserire la data"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
		End If
	End If
	mod1.Sub081
End Sub

Sub ver_btn_StampaMFDate_Click
	DateTime.DateFormat = "dd/MM/yyyy"
	If ver_btn_DataDa.Text <> "" And ver_btn_Dataa.Text <> "" Then
		Dim vDateParse As Long = DateTime.DateParse(ver_btn_DataDa.Text)
		If vDateParse > DateTime.DateParse(ver_btn_Dataa.Text) Then
			Msgbox("La data iniziale è maggiore della data finale!", "Attenzione!")
		Else
			Dim vDateParse2 As Long = DateTime.DateParse(ver_btn_DataDa.Text)
			If vDateParse2 >= DateTime.DateParse("01/01/2000") Then
				Dim vDateParse3 As Long = DateTime.DateParse(ver_btn_Dataa.Text)
				If vDateParse3 >= DateTime.DateParse("01/01/2000") Then
					Dim vDateParse4 As Long = DateTime.DateParse(ver_btn_DataDa.Text)
					If vclsverificazione1.Sub007(True, vDateParse4, DateTime.DateParse(ver_btn_Dataa.Text), 0, 0) Then
						If Main.v_matricola.StartsWith("ST") Then
							AnnullaStampa.Visible = True
						End If
					End If
				End If
			End If
			Msgbox("Date non valide! Inserire delle date successive al 31/12/1999.", "Attenzione!")
		End If
	Else
		Msgbox("Inserire delle date corrette!", "Attenzione!")
	End If
	mod1.Sub081
End Sub

Sub ver_btn_StampaMFnum_Click
	Dim text As String = ver_edt_MFda.Text
	Dim text2 As String = ver_edt_MFa.Text
	If Not(IsNumber(text)) Or Not(IsNumber(text2)) Then
		Dim vObjectToCharSequence As Object = "Verificare i valori inseriti."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	Else
		Dim parseDouble As Int = text
		Dim parseDouble2 As Int = text2
		If parseDouble >= 1 And parseDouble <= parseDouble2 Then
			If vclsverificazione1.Sub007(False, 0, 0, text, text2) Then
				If Main.v_matricola.StartsWith("ST") Then
					AnnullaStampa.Visible = True
				End If
			End If
		Else
			Dim vObjectToCharSequence3 As Object = "Verificare numero iniziale."
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		End If
	End If
	mod1.Sub081
End Sub

Sub ver_btn_StampaScontr_Click
	vclsverificazione1.Sub008(ver_edt_DescrRiga.Text, ver_edt_Importo.Text)
	mod1.Sub081
End Sub

Sub ver_edt_Importo_TextChanged(str As String, str2 As String)
	Try
	Catch
		mod1.Sub217(LastException.Message)
		vBln3 = False
	End Try
	If vBln3 Then
		Return
	End If
	Dim editTextWrapper As EditText = Sender
	vBln3 = True
	If editTextWrapper.Text.IndexOf(",") > 0 Then
		editTextWrapper.Text = editTextWrapper.Text.Replace(",", ".")
		editTextWrapper.SelectionStart = editTextWrapper.Text.Length
	End If
	If IsNumber(editTextWrapper.Text) Then
		If modfunstr.Sub006(editTextWrapper.Text) <= 100 Then
			If modfunstr.Sub006(editTextWrapper.Text) >= 0 Then
				If str2.Length > 5 Then
					editTextWrapper.Text = str
					editTextWrapper.SelectionStart = str.Length
				End If
				vBln3 = False
				Return
			End If
		End If
	End If
	editTextWrapper.Text = str
	editTextWrapper.SelectionStart = str.Length
	vBln3 = False
End Sub

Sub ver_pnlUtilityRT_Click
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

