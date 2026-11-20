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
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public bAutoconsumo As Button
	Public bCarico As Button
	Public bInventario As Button
	Public bResoFornitore As Button
	Public bRettifica As Button
	Public bRicalcola As Button
	Public StampaGiacenze As Button
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
			Try
				Sub001("Magazzino")
				bCarico.Background = mod1.Sub155(-16776961, 25)
				bRettifica.Background = mod1.Sub155(-16776961, 25)
				bAutoconsumo.Background = mod1.Sub155(-65536, 25)
				bResoFornitore.Background = mod1.Sub155(-65536, 25)
				bInventario.Background = mod1.Sub155(-16711936, 25)
				bRicalcola.Background = mod1.Sub155(-65281, 25)
				StampaGiacenze.Background = mod1.Sub155(-65281, 25)
				DoEvents
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				lblTitolo.Text = "Gestione Magazzino"
				mod1.vStr2 = "Activity_Resume"
				vBln1 = False
				lblTitolo.Color = Main.v_colormenutitle
				mod1.Sub173(lblTitolo)
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

Sub bCarico_Click
	Dim buttonWrapper As Button = Sender
	Main.vStr6 = buttonWrapper.Tag
	mod1.Sub205(buttonWrapper.Tag, "", 0)
	vBln1 = True
	Activity.Finish
	mod1.Sub198("Main")
End Sub

Sub BChiudi_Click
	vBln1 = True
	Activity.Finish
	mod1.Sub198("Main")
End Sub

Sub bRicalcola_Click
	mod1.Sub150
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

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub StampaGiacenze_Click
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(Array As String("=", "Diverso", "Maggiore", "Minore", "Sottoscorta")))
	Dim list2 As List
	list2.Initialize
	list2.AddAll(ArrayToList(Array As String("=", "<>", ">", "<")))
	Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare il Filtro per la Giacenza: ")
	If vInputList1 >= 0 Then
		If vInputList1 = 4 Then
			vBln1 = True
			stampecustom.vStr1 = "stampaGiacenze"
			stampecustom.vStr4 = " < sottoscorta "
			stampecustom.vStr5 = "Giacenza in Sottoscorta "
			stampecustom.vStr2 = "Stampa Giacenze "
			stampecustom.vInt1 = 3
			stampecustom.vSql1 = Main.vSql1
			stampecustom.vStr3 = "Magazzino"
			mod1.Sub198("StampeCustom")
		Else
			Dim numberDialog As NumberDialog
			numberDialog.Digits = 3
			numberDialog.Number = 0
			numberDialog.Decimal = 0
			numberDialog.ShowSign = True
			Dim vShow As Int = numberDialog.Show("Inserire la giacenza", "Ok", "Annulla", "", Main.vBmp1)
			If vShow = -1 Then
				vBln1 = True
				stampecustom.vStr1 = "stampaGiacenze"
				stampecustom.vStr4 = list2.Get(vInputList1) & numberDialog.Number
				stampecustom.vStr5 = "Giacenza " & list.Get(vInputList1) & " " & numberDialog.Number
				stampecustom.vStr2 = "Stampa Giacenze "
				stampecustom.vInt1 = 3
				stampecustom.vSql1 = Main.vSql1
				stampecustom.vStr3 = "Magazzino"
				mod1.Sub198("StampeCustom")
			Else
				Return
			End If
		End If
	End If
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

