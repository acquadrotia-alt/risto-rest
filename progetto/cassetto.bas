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
	Public vStr1 As String
	Public vStr2 As String
	Public vInt1 As Int
	Public vBln3 As Boolean
	Public vBln4 As Boolean
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public vcustomlistviewold1 As customlistviewold
	Public pLista As Panel
	Public vLst1 As List
	Public vLst2 As List
	Public vCur1 As Cursor
	Public vCur2 As Cursor
	Public vCur3 As Cursor
	Public vCustomLayoutDialog1 As CustomLayoutDialog
	Public vcustomlistviewold2 As customlistviewold
	Public pnlMenu As Panel
	Public vLst3 As List
	Public vMap1 As Map
	Public FondoCassa As Button
	Public Prelievo As Button
	Public Ricdist As Button
	Public vDlg1 As InputDialog
	Public Label1 As Label
	Public Stampa As Button
	Public vLst4 As List
	Public vCur4 As Cursor
	Public vCSBuilder1 As CSBuilder
	Public vLst5 As List
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
			Dim cursorWrapper As Cursor
			vCur3 = Main.vSql1.ExecQuery("SELECT * FROM pagamenti order by codice")
			vLst1.Initialize
			vLst2.Initialize
			vLst3.Initialize
			vLst3.AddAll(ArrayToList(Array As String("Importo Libero", "0,05 €", "0,10 €", "0,20 €", "0,50 €", "1,00 €", "2,00 €", "5,00 €", "10,00 €", "20,00 €", "50,00 €", "100,00 €", "200,00 €", "500,00 €")))
			vLst5.Initialize
			vLst5.Clear
			Dim size As Int = Main.vLst3.Size - 1
			Dim i As Int = 0
			Dim i2 As Int
			For i2 = 0 To size
				Dim vObjectToString As String = Main.vLst3.Get(i2)
				If vObjectToString.ToLowerCase.StartsWith("pag_") And vObjectToString.ToLowerCase.EndsWith("png") Then
					vLst5.InsertAt(i, vObjectToString)
					i = i + 1
				End If
			Next
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

Sub Activity_Resume
	If Not(mod1.vBln4) Then
		If Main.vSql1.IsInitialized Then
			If vBln4 Then
				vBln4 = False
				Return
			End If
			mod1.vStr2 = "Activity_Resume"
			Try
				Sub005("cassetto")
				Dim vGetString As String = Main.vCur3.GetString("funzioni")
				Stampa.Enabled = mod1.Sub026(vGetString, Main.f_stampaoggi)
				Label1.Background = mod1.Sub155(-1, 30)
				Label1.TextColor = -16777216
				Label1.Visible = False
				lblTitolo.Color = Main.v_colormenutitle
				mod1.Sub173(lblTitolo)
				vcustomlistviewold1.Initialize(Me, "clv2")
				vcustomlistviewold1.vInt3 = Colors.RGB(245, 245, 245)
				Stampa.Visible = Not(Main.vBln25)
				If vBln1 Then
					Dim cursorWrapper As Cursor
					vCur4 = Main.vSql1.ExecQuery("Select * from operatori order by codice")
					vLst4.Initialize
					Dim rowCount As Int = vCur4.RowCount - 1
					Dim i As Int
					For i = 0 To rowCount
						vCur4.Position = i
						vLst4.Add(vCur4.GetString("descrizione"))
					Next
					Dim i2 As Int = -1
					Do While i2 < 0
						i2 = idLib.InputList1(vLst4, "Selezionare l'operatore attivo")
					Loop
					vCur4.Position = i2
					Label1.Text = "Operatore " & vCur4.GetString("descrizione")
					Label1.Visible = True
				End If
				pLista.AddView(vcustomlistviewold1.Sub003, 0, 0, pLista.Width, pLista.Height)
				DoEvents
				vBln2 = False
				Dim phone As Phone = Main.vPhone1
				Phone.SetScreenBrightness(Main.v_screenbrightness)
				DoEvents
				Sub004()
				vInt1 = 1
				vBln3 = False
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from cassetto") > 0 Then
					vInt1 = Main.vSql1.ExecQuerySingleResult("Select max(NumDistinta) from cassetto") + 1
				End If
				mod1.Sub081
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			Return
		End If
	End If
	Activity.Finish
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub AddDetails(mcaus As Int, mtot As String, stipo As String, tipo As String, chiave As Int, memo As String)
	Dim limit16 As Int
	Dim limit21 As Int
	Dim step16 As Int
	Dim step21 As Int
	Dim m_impo As String
	Dim mqta As Int
	Dim stmp As String
	Dim sf As Object
	Dim pnl As Panel
	Dim i As Int
	Dim res As Int
	Dim x As Int
	Dim tmpop As Int
	Dim newimp As Double
	Dim listofmaps As List
	Dim m As Map
	Dim wf As Map
	Dim ret As Int
	Dim mtxt As String
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				m_impo = ""
				mqta = -1
				Continue
			Case 1
				rsState = 43
				If Not(vBln1) And mcaus = 0 Then
					rsState = 3
					Continue
				End If
				Continue
			Case 3
				rsState = 4
				vStr1 = mtot
				vStr2 = stipo
				stmp = "Indicare le quantità per ogni taglio di moneta"
				vMap1.Initialize
				Dim str As String = stmp
				sf = vCustomLayoutDialog1.ShowAsync(str, "Ok", "Annulla", "", Main.vBmp1, True)
				vCustomLayoutDialog1.SetSize(PerXToCurrent(65), PerYToCurrent(90))
				Wait For (sf) Dialog_Ready (wf78_0 As Panel)
				rsState = 78
				Continue
			Case 4
				rsState = 7
				step16 = 1
				limit16 = vLst3.Size - 1
				i = 0
				rsState = 79
				Continue
			Case 6
				rsState = 80
				Dim i_ As Int = i
				Dim vDipToCurrent As Int = DipToCurrent(70)
				vcustomlistviewold2.Sub001(Sub003(i_, vDipToCurrent, vLst3.Get(i)), DipToCurrent(70), "")
				Continue
			Case 7
				rsState = 8
				Wait For (sf) Dialog_Result (wf81_0 As Int)
				rsState = 81
				Continue
			Case 8
				rsState = 42
				Dim i2 As Int = res
				If i2 <> -1 Then
					Continue
				Else
					rsState = 10
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 10
			Case 10
				rsState = 11
				Continue
			Case 11
				rsState = 41
				step21 = 1
				limit21 = vMap1.Size - 1
				x = 0
				rsState = 82
				Continue
			Case 13
				rsState = 14
				Continue
			Case 14
				rsState = 19
				If 0 = vMap1.GetKeyAt(x) Then
					rsState = 16
					Continue
				Else
					rsState = 18
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 16
			Case 16
				rsState = 19
				m_impo = vMap1.GetValueAt(x)
				mqta = 1
				Continue
			Case 18
				rsState = 19
				m_impo = vLst3.Get(vMap1.GetKeyAt(x))
				m_impo = m_impo.SubString2(0, 4).Replace(",", ".")
				mqta = vMap1.GetValueAt(x)
				Continue
			Case 19
				rsState = 20
				tmpop = Main.Operatore
				Continue
			Case 20
				rsState = 23
				If Not(vBln1) Then
					Continue
				Else
					rsState = 22
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 22
			Case 22
				rsState = 23
				tmpop = vCur4.GetInt("codice")
				Continue
			Case 23
				rsState = 28
				If IsNumber(m_impo) Then
					Continue
				Else
					rsState = 25
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 25
			Case 25
				rsState = 28
				rsState = 83
				Continue
			Case 28
				rsState = 29
				newimp = m_impo
				Continue
			Case 29
				rsState = 34
				If mqta >= 0 Then
					Continue
				Else
					rsState = 31
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 31
			Case 31
				rsState = 34
				mqta = 1
				Continue
			Case 34
				rsState = 35
				'listofmaps = List
				'm = Map
				m.Initialize
				listofmaps.Initialize
				m.Put("Operatore", tmpop)
				Dim map As Map = m
				map.Put("Cassa", Main.v_numcassa)
				m.Put("TipoAttivita", tipo)
				m.Put("PrezzoUnitario", newimp)
				m.Put("Importo", Round2(newimp * mqta, 2))
				Dim map2 As Map = m
				map2.Put("DataOra", DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058))
				m.Put("TipoMoneta", mcaus)
				Dim map3 As Map = m
				map3.Put("NumDistinta", vInt1)
				m.Put("Qta", mqta)
				m.Put("memo", memo)
				listofmaps.Add(m)
				Continue
			Case 35
				rsState = 40
				If chiave > 0 Then
					rsState = 37
					Continue
				Else
					rsState = 39
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 37
			Case 37
				rsState = 40
				'wf = Map
				wf.Initialize
				wf.Put("chiave", chiave)
				dbutil.Sub012(Main.vSql1, "Cassetto", m, wf)
				Continue
			Case 39
				rsState = 40
				dbutil.Sub007(Main.vSql1, "Cassetto", listofmaps)
				Continue
			Case 40
				rsState = 83
				Continue
			Case 41
				rsState = 42
				Sub006()
				Continue
			Case 42
				rsState = 43
				Return
			Case 43
				rsState = 44
				Dim inputDialog2 As InputDialog = vDlg1
				vDlg1.InputType = 12290
				vDlg1.Input = mtot
				vDlg1.Hint = "Importo " & stipo
				vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
				vDlg1.PasswordMode = False
				ret = -3
				mtxt = "Inserire l'importo del " & stipo
				Continue
			Case 44
				rsState = 49
				If mqta < 0 Then
					rsState = 46
					Continue
				Else
					rsState = 48
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 46
			Case 46
				rsState = 49
				Dim str2 As String = mtxt
				ret = vDlg1.Show(str2, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
				Continue
			Case 48
				rsState = 49
				ret = -1
				vDlg1.Input = m_impo
				Continue
			Case 49
				rsState = 77
				Dim i3 As Int = ret
				If i3 <> -1 Then
					Continue
				Else
					rsState = 51
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 51
			Case 51
				rsState = 52
				Continue
			Case 52
				rsState = 76
				If Not(IsNumber(vDlg1.Input)) Then
					Continue
				Else
					rsState = 54
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 54
			Case 54
				rsState = 55
				newimp = 0
				newimp = mod1.Sub056(vDlg1.Input)
				Continue
			Case 55
				rsState = 75
				If newimp > 0 And newimp < 10000 Then
					rsState = 57
					Continue
				Else
					rsState = 74
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 57
			Case 57
				rsState = 58
				tmpop = Main.Operatore
				Continue
			Case 58
				rsState = 61
				If Not(vBln1) Then
					Continue
				Else
					rsState = 60
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 60
			Case 60
				rsState = 61
				tmpop = vCur4.GetInt("codice")
				Continue
			Case 61
				rsState = 66
				If mqta >= 0 Then
					Continue
				Else
					rsState = 63
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 63
			Case 63
				rsState = 66
				mqta = 1
				Continue
			Case 66
				rsState = 67
				'listofmaps = List
				'm = Map
				m.Initialize
				listofmaps.Initialize
				m.Put("Operatore", tmpop)
				Dim map4 As Map = m
				map4.Put("Cassa", Main.v_numcassa)
				m.Put("TipoAttivita", tipo)
				m.Put("PrezzoUnitario", newimp)
				m.Put("Importo", Round2(newimp * mqta, 2))
				Dim map5 As Map = m
				map5.Put("DataOra", DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058))
				m.Put("TipoMoneta", mcaus)
				Dim map6 As Map = m
				map6.Put("NumDistinta", vInt1)
				m.Put("Qta", mqta)
				m.Put("memo", memo)
				listofmaps.Add(m)
				Continue
			Case 67
				rsState = 72
				If chiave > 0 Then
					rsState = 69
					Continue
				Else
					rsState = 71
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 69
			Case 69
				rsState = 72
				'wf = Map
				wf.Initialize
				wf.Put("chiave", chiave)
				dbutil.Sub012(Main.vSql1, "Cassetto", m, wf)
				Continue
			Case 71
				rsState = 72
				dbutil.Sub007(Main.vSql1, "Cassetto", listofmaps)
				Continue
			Case 72
				rsState = 75
				Sub006()
				Continue
			Case 74
				rsState = 75
				Dim vObjectToCharSequence As Object = "Superato il limite massimo di 9999,99 €"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Continue
			Case 75
				rsState = 76
				Continue
			Case 76
				rsState = 77
				Continue
			Case 77
				rsState = -1
				Continue
			Case 78
				rsState = 4
				pnl = wf78_0
				pnl.LoadLayout("schedamenu")
				vcustomlistviewold2.Initialize(pnlMenu, "clvm")
				vcustomlistviewold2.vInt3 = -16776961
				Dim view As View = vcustomlistviewold2.Sub003
				Dim vPerXToCurrent As Int = PerXToCurrent(60)
				pnlMenu.AddView(view, 0, 0, vPerXToCurrent, pnlMenu.Height)
				vcustomlistviewold2.Sub021(-16777216)
				Continue
			Case 79
				rsState = 7
				If (step16 > 0 And i <= limit16) Or (step16 < 0 And i >= limit16) Then
					rsState = 6
					Continue
				End If
				Continue
			Case 80
				rsState = 79
				i = i + 0 + step16
				Continue
			Case 81
				rsState = 8
				res = wf81_0
				Continue
			Case 82
				rsState = 41
				If (step21 > 0 And x <= limit21) Or (step21 < 0 And x >= limit21) Then
					rsState = 13
					Continue
				End If
				Continue
			Case 83
				rsState = 82
				x = x + 0 + step21
				Continue
		End Select
	Loop
End Sub

Sub Dialog_Ready(panelWrapper As Panel)
End Sub

Sub Dialog_Result(i As Int)
End Sub

Sub Addmemo_Click
	mod1.vStr2 = "Sub AddMemo_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(4)
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 1
		vDlg1.Input = ""
		vDlg1.PasswordMode = False
		vDlg1.Hint = "Messaggio"
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow As Int = vDlg1.Show("Inserire un messaggio ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 Then
			Dim left As String = modfunstr.left(vDlg1.Input, 100)
			Main.vSql1.ExecNonQuery("update cassetto set memo='" & left & "' where chiave = " & labelWrapper.Text)
			Sub006()
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub001(str As String)
	Dim str2 As String
	Dim str3 As String
	Dim parseDouble As Double
	If str = "F" Then
		str2 = "Versamento"
	Else
		str2 = "Prelievo"
	End If
	Dim vInputList1 As Int = IIf(Not(vBln1), idLib.InputList1(vLst1, "Indicare la causale per il " & str2), 0)
	If vInputList1 >= 0 Then
		Dim str4 As String = ""
		Dim vObjectToNumber As Int = vLst2.Get(vInputList1)
		If str = "PA" Then
			If vBln1 Then
				parseDouble = Main.vSql1.ExecQuerySingleResult("Select case when sum(importo) is null then 0 else sum(importo) end" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "+(Select Case when sum(importo) Is Null Then 0 Else sum(importo) End As tot from cassetto where TipoAttivita = 'F' and  operatore = " & SmartStringFormatter("", vCur4.GetString("codice")) & ")" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "-(Select Case when sum(importo) Is Null Then 0 Else sum(importo) End As tot from cassetto where TipoAttivita = 'P' and  operatore = " & SmartStringFormatter("", vCur4.GetString("codice")) & ") as tot  from Venduto " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "inner join headmov on headmov.nmov= venduto.nmov where venduto.sospeso =0 and  operatore = " & SmartStringFormatter("", vCur4.GetString("codice")) & "")
			Else
				parseDouble = Main.vSql1.ExecQuerySingleResult("Select case when sum(importo) is null then 0 else sum(importo) end" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "+(select case when sum(importo) is null then 0 else sum(importo) end as tot from cassetto where TipoAttivita = 'F')" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "-(select case when sum(importo) is null then 0 else sum(importo) end as tot from cassetto where TipoAttivita = 'P') as tot  from Venduto where sospeso =0")
			End If
			str = "P"
			If parseDouble > 0 Then
				str4 = NumberFormat2(parseDouble, 1, 2, 2, False)
				str3 = "P"
				AddDetails(vObjectToNumber, str4, str2, str3, 0, "")
				Return
			End If
		End If
		str3 = str
		AddDetails(vObjectToNumber, str4, str2, str3, 0, "")
		Return
	End If
End Sub

Sub Button1_Click
	Dim str As String
	If Main.vBln25 Then
		mod1.Sub078(False)
	End If
	If vCur2.IsInitialized And vCur2.RowCount > 0 Then
		Main.vccefdll1.nf_apri(Main.v_intestanf)
		If FondoCassa.Enabled Then
			Main.vccefdll1.nf_testo("** Versamento **", 4)
		Else
			Main.vccefdll1.nf_testo("** Prelievo **", 4)
		End If
		If vBln1 Then
			Main.vccefdll1.nf_testo("Operatore " & vCur4.GetString("descrizione"), 4)
		End If
		Main.vccefdll1.nf_testo("Op. " & Main.Operatore, 1)
		Main.vccefdll1.nf_testo("Distinta N." & vInt1, 1)
		Main.vccefdll1.nf_testo(Main.vStr19, 1)
		Dim d As Double = 0
		Dim rowCount As Int = vCur2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			vCur2.Position = i
			vCur3.Position = vCur2.GetInt("TipoMoneta")
			If vCur2.GetString("memo") = "" Then
				str = ""
			Else
				str = "-" & vCur2.GetString("memo") & "-"
			End If
			Dim vGetString As String = vCur3.GetString("descrizione")
			If vCur2.GetInt("Qta") > 1 Then
				vGetString = vGetString & " (" & modfunstr.left(NumberFormat2(vCur2.GetDouble("PrezzoUnitario"), 1, 2, 2, False) & "     ", 5) & " X  " & vCur2.GetInt("Qta") & ")"
			End If
			Dim sb3 As String = modfunstr.left(vGetString, Main.vInt31 + 25) & modfunstr.Sub004(Main.vInt31 + 25)
			Main.vccefdll1.nf_testo(modfunstr.left(sb3, Main.vInt31 + 25) & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(vCur2.GetDouble("Importo"), 1, 2, 2, False), 7), 1)
			If str <> "" Then
				Main.vccefdll1.nf_testo(str, 1)
				Main.vccefdll1.nf_testo(" ", 1)
			End If
			d = Round2(vCur2.GetDouble("Importo") + d, 2)
		Next
		Main.vccefdll1.nf_testo(Main.vStr19, 1)
		Dim sb6 As String = modfunstr.Sub004(Main.vInt31 + 28) & NumberFormat2(d, 1, 2, 2, False)
		Main.vccefdll1.nf_testo("TOT." & modfunstr.Sub003(sb6, Main.vInt31 + 28), 1)
		If vBln1 Then
			Main.vccefdll1.nf_testo(" ", 1)
			Main.vccefdll1.nf_testo(" ", 1)
			Main.vccefdll1.nf_testo(" ", 1)
			Main.vccefdll1.nf_testo("FIRMA:                          ", 1)
			Main.vccefdll1.nf_testo("      --------------------------", 1)
		End If
		Main.vccefdll1.nf_chiudi
	End If
	vBln2 = True
	Activity.Finish
	mod1.Sub198("Main")
End Sub

Sub Cdel_Click
	Dim imageViewWrapper As ImageView = Sender
	Dim labelWrapper As Label = imageViewWrapper.Tag
	Dim vObjectToNumber As Int = labelWrapper.Tag
	If vMap1.ContainsKey(vObjectToNumber) Then
		vMap1.Remove(vObjectToNumber)
	End If
	labelWrapper.Text = vCSBuilder1.Initialize.Size(20).Bold.Append(vLst3.Get(vObjectToNumber)).PopAll
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/cassetto.java, metodo _cqta_click (riga 1357).
Sub Cqta_Click
	Dim i As Int
	Dim labelWrapper As Label = Sender
	Dim vObjectToNumber As Int = labelWrapper.Tag
	If vObjectToNumber > 0 Then
		Dim replace As String = vLst3.Get(vObjectToNumber).SubString2(0, 4).Replace(",", ".")
		Dim vObjectToString As String = IIf(modfunstr.Sub006(replace.SubString2(0, 1)) < 5, "monete", "banconote")
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 12290
		vDlg1.Input = ""
		vDlg1.Hint = "Quantità "
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		vDlg1.PasswordMode = False
		Dim str As String = "Inserire il numero di " & vObjectToString & " da " & vLst3.Get(vObjectToNumber)
		Dim vShow As Int = vDlg1.Show(str, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And IsNumber(vDlg1.Input) Then
			i = vDlg1.Input
			If i <= 0 Or i >= 1000 Then
				Dim vObjectToCharSequence As Object = "Superato il limite massimo di 9999,99 €"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			End If
			If i > 0 Then
				Return
			End If
			Dim vObjectToNumber2 As Int = i + vMap1.GetDefault(vObjectToNumber, 0)
			vMap1.Put(vObjectToNumber, vObjectToNumber2)
			Dim vAppend As CSBuilder = vCSBuilder1.Initialize.Size(20).Bold.Append(vLst3.Get(vObjectToNumber)).Append(CRLF)
			labelWrapper.Text = vAppend.Color(-65536).Append(vObjectToNumber2 & " X " & replace & "€    Tot." & NumberFormat2(vObjectToNumber2 * replace, 1, 2, 2, False) & " €").PopAll
		End If
		i = -1
		If i > 0 Then
		End If
	Else
		Dim inputDialog6 As InputDialog = vDlg1
		vDlg1.InputType = 12290
		vDlg1.Input = vStr1
		vDlg1.Hint = "Importo " & vStr2
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		vDlg1.PasswordMode = False
		Dim sb As String = "Inserire l'importo del " & vStr2
		Dim vShow2 As Int = vDlg1.Show(sb, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow2 = -1 And IsNumber(vDlg1.Input) Then
			Dim vTmp As Double = mod1.Sub056(vDlg1.Input)
			If vTmp > 0 And vTmp < 10000 Then
				Dim vObjectToNumber3 As Double = vTmp + vMap1.GetDefault(vObjectToNumber, 0)
				vMap1.Put(vObjectToNumber, vObjectToNumber3)
				Dim vAppend2 As CSBuilder = vCSBuilder1.Initialize.Size(20).Bold.Append(vLst3.Get(vObjectToNumber)).Append(CRLF)
				labelWrapper.Text = vAppend2.Color(-65536).Append(NumberFormat2(vObjectToNumber3, 1, 2, 2, False) & " €").PopAll
			End If
		End If
	End If
End Sub

Sub Sub002(str As String, i As Int) As Panel
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		panelWrapper.Color = Colors.RGB(245, 245, 245)
		vCur3.Position = vCur2.GetInt("TipoMoneta")
		vCSBuilder1.Initialize.Size(20).Bold.Append(IIf(vCur2.GetString("TipoAttivita") = "F", "Versamento", "Prelievo")).Append(" (" & vCur3.GetString("descrizione").Trim & ")").Pop
		If vCur2.GetString("memo").Trim <> "" Then
			Dim vSize As CSBuilder = vCSBuilder1.Size(16)
			vSize.Color(-65536).Append(CRLF & vCur2.GetString("memo").Trim)
		End If
		Dim labelWrapper As Label
		labelWrapper.Initialize("selrow")
		labelWrapper.Gravity = Bit.Or(16, 3)
		labelWrapper.Text = vCSBuilder1.PopAll
		If vBln1 Then
			Dim vSize2 As CSBuilder = vCSBuilder1.Size(16)
			labelWrapper.Text = vSize2.Color(-65536).Append(CRLF & vCur4.GetString("descrizione")).PopAll
		End If
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -16777216
		labelWrapper.Background = mod1.Sub155(-1, 0)
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("ModImporto")
		labelWrapper2.Gravity = Bit.Or(16, 1)
		labelWrapper2.TextSize = 16
		labelWrapper2.TextColor = -16777216
		labelWrapper2.Background = mod1.Sub155(-3355444, 0)
		If vCur2.GetString("Qta") <> 1 Then
			labelWrapper2.Text = vCSBuilder1.Initialize.Size(16).Append(vCur2.GetString("Qta") & " X " & NumberFormat2(vCur2.GetDouble("PrezzoUnitario"), 1, 2, 2, False) & CRLF).Size(20).Bold.Append(NumberFormat2(vCur2.GetDouble("Importo"), 1, 2, 2, False)).PopAll
		Else
			labelWrapper2.Text = vCSBuilder1.Initialize.Size(20).Bold.Append(NumberFormat2(vCur2.GetDouble("Importo"), 1, 2, 2, False)).PopAll
		End If
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("ElencoDel")
		imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "006.png")
		Dim imageViewWrapper2 As ImageView
		imageViewWrapper2.Initialize("AddMemo")
		imageViewWrapper2.Bitmap = LoadBitmap(File.DirAssets, "fun_pencil-red.png")
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("")
		labelWrapper3.Text = str
		labelWrapper3.Visible = False
		panelWrapper.AddView(labelWrapper, 0, DipToCurrent(2), PerXToCurrent(56), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(56), DipToCurrent(2), PerXToCurrent(20), i)
		panelWrapper.AddView(imageViewWrapper2, PerXToCurrent(76), DipToCurrent(2), PerXToCurrent(12), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(88), DipToCurrent(2), PerXToCurrent(12), i)
		panelWrapper.AddView(labelWrapper3, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub003(i As Int, i2 As Int, str As String) As Panel
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	Try
		panelWrapper.Initialize("noevent")
		panelWrapper.Color = 0
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("")
		If i > 0 Then
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, vLst5.Get(i - 1))
		End If
		Dim labelWrapper As Label
		labelWrapper.Initialize("CQta")
		labelWrapper.Gravity = Bit.Or(16, 1)
		labelWrapper.Text = vCSBuilder1.Initialize.Size(20).Bold.Append(str).PopAll
		labelWrapper.Tag = i
		labelWrapper.TextColor = -16777216
		Dim vRGB As Int = Colors.RGB(222, 222, 222)
		labelWrapper.Background = mod1.Sub158(vRGB, -1)
		Dim imageViewWrapper2 As ImageView
		imageViewWrapper2.Initialize("CDel")
		imageViewWrapper2.Bitmap = LoadBitmap(File.DirAssets, "006.png")
		imageViewWrapper2.Tag = labelWrapper
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(0), DipToCurrent(0), PerXToCurrent(10), i2)
		panelWrapper.AddView(labelWrapper, PerXToCurrent(0), DipToCurrent(0), PerXToCurrent(60), i2)
		panelWrapper.AddView(imageViewWrapper2, PerXToCurrent(50), DipToCurrent(0), PerXToCurrent(10), i2)
		mod1.Sub161(imageViewWrapper, 7)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Elencodel_Click
	mod1.vStr2 = "Sub ElencoFiltroDel_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(4)
		Main.vSql1.ExecNonQuery("delete from cassetto where chiave = " & labelWrapper.Text)
		Sub006()
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
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

Sub FondoCassa_Click
	Sub001("F")
	mod1.Sub081
End Sub

Sub Sub004
	mod1.vStr2 = "Sub Init"
	Try
		If vBln1 Then
			lblTitolo.Text = "Gestione Portafoglio Operatori"
		Else
			lblTitolo.Text = "Gestione Cassetto"
		End If
		populatespinner("pagamenti")
		vcustomlistviewold1.Sub004
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

Sub Modimporto_Click
	mod1.vStr2 = "Sub ModImporto_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(4)
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from cassetto where chiave = " & labelWrapper.Text)
		If cursorWrapper2.RowCount > 0 Then
			cursorWrapper2.Position = 0
			Dim str As String = "Versamento"
			If cursorWrapper2.GetString("TipoAttivita") <> "F" Then
				str = "Prelievo"
			End If
			AddDetails(cursorWrapper2.GetInt("TipoMoneta"), "", str, cursorWrapper2.GetString("TipoAttivita"), cursorWrapper2.GetInt("chiave"), cursorWrapper2.GetString("memo"))
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

Sub Noevent_Click
End Sub

Sub populatespinner(str As String)
	mod1.vStr2 = "Sub PopulateSpinner(TmpSpin As Spinner,tabella As String)"
	Try
		vLst1.Clear
		vLst2.Clear
		Dim cursorWrapper As Cursor
		vCur1 = Main.vSql1.ExecQuery("SELECT * FROM " & str & " order by codice")
		Dim rowCount As Int = vCur1.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			DoEvents
			vCur1.Position = i
			If i <> 2 And vCur1.GetString("descrizione").Trim <> "DA INSERIRE" And vCur1.GetString("descrizione").Trim <> "" Then
				vLst1.Add(vCur1.GetString("descrizione"))
				vLst2.Add(vCur1.GetString("codice"))
			End If
		Next
		vCur1.Close
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Prelievo_Click
	Sub001("P")
	mod1.Sub081
End Sub

Sub Prelievo_LongClick
	Sub001("PA")
	mod1.Sub081
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/cassetto.java, metodo m5… (riga 1775).
Sub Sub006
	Dim str As String
	Dim d As Double
	Dim cursorWrapper As Cursor
	vCur2 = Main.vSql1.ExecQuery("Select * from cassetto where NumDistinta = " & vInt1 & " order by chiave")
	vcustomlistviewold1.Sub004
	Dim d2 As Double = 0
	Dim str2 As String = "Totale Prelievi: "
	If vCur2.RowCount > 0 Then
		Dim rowCount As Int = vCur2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			vCur2.Position = i
			If i = 0 Then
				If vCur2.GetString("TipoAttivita") = "F" Then
					FondoCassa.Enabled = True
					Prelievo.Enabled = False
					Ricdist.Enabled = False
					str2 = "Totale Versamento: "
				Else
					FondoCassa.Enabled = False
					Prelievo.Enabled = True
					Ricdist.Enabled = False
				End If
			End If
			d2 = Round2(d2 + vCur2.GetDouble("Importo"), 2)
			vcustomlistviewold1.Sub001(Sub002(vCur2.GetString("chiave"), DipToCurrent(70)), DipToCurrent(70), "")
		Next
		vcustomlistviewold1.Sub012(0)
		Sub007(0)
		If vBln1 And vBln3 Then
			vCur4.Position = vCur2.GetInt("Operatore") - 1
			str = str2
			d = d2
			If Not(vBln1) Then
				Label1.Text = "Operatore " & vCur4.GetString("descrizione") & "     Distinta numero " & vInt1 & "       " & str & NumberFormat2(d, 1, 2, 2, False)
			Else
				Label1.Text = "Distinta numero " & vInt1 & "       " & str & NumberFormat2(d, 1, 2, 2, False)
			End If
			Label1.Visible = True
			Return
		End If
	Else
		FondoCassa.Enabled = True
		Prelievo.Enabled = True
		Ricdist.Enabled = True
	End If
	str = str2
	d = d2
	If Not(vBln1) Then
	End If
	Label1.Visible = True
End Sub

Sub Ricdist_Click
	Dim parseDouble As Int
	Dim parseDouble2 As Int
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.Hint = "Numero distinta "
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	vDlg1.PasswordMode = False
	Dim vShow As Int = vDlg1.Show("Inserire il numero della distinta da richiamare", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 And IsNumber(vDlg1.Input) And parseDouble = vDlg1.Input > 0 And parseDouble < 20000 Then
		If vBln1 Then
			parseDouble2 = Main.vSql1.ExecQuerySingleResult("Select count(*) from cassetto where Operatore=" & vCur4.GetString("codice") & " and  NumDistinta =" & parseDouble)
		Else
			parseDouble2 = Main.vSql1.ExecQuerySingleResult("Select count(*) from cassetto where Operatore=" & Main.Operatore & " and  NumDistinta =" & parseDouble)
		End If
		If parseDouble2 > 0 Then
			vBln3 = True
			vInt1 = parseDouble
			Sub006()
		Else
			Dim vObjectToCharSequence As Object = "Distinta non trovata"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		End If
	End If
	mod1.Sub081
End Sub

Sub Selrow_Click
	mod1.vStr2 = "Sub selrow_Click"
End Sub

Sub Stampa_Click
	vBln2 = True
	If vBln1 Then
		stampecustom.vStr1 = "stampaportafoglio"
		stampecustom.vStr2 = "Portafoglio Operatore " & vCur4.GetString("descrizione")
		stampecustom.vStr4 = vCur4.GetInt("codice")
		stampecustom.vStr5 = "Operatore = " & vCur4.GetString("descrizione")
	Else
		stampecustom.vStr1 = "stampaCassetto"
		stampecustom.vStr2 = "Cassetto"
		stampecustom.vStr4 = ""
		stampecustom.vStr5 = ""
	End If
	stampecustom.vInt1 = 4
	stampecustom.vSql1 = Main.vSql1
	stampecustom.vStr3 = "cassetto"
	vBln4 = True
	mod1.Sub198("StampeCustom")
End Sub

Sub Sub007(i As Int)
	vCur2.Position = i
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

