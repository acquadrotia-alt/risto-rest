B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Type tattivazionert(Attivazione As Boolean, Censita As Boolean, InService As Boolean, InServiceDa As Long, generateChiavi As Boolean)
	Type tcopia(Testo As String, stile As Int)
	Type tresort(tDescrizione As String, tIvaRT As Int, tPrezzoUnitarioLordo100 As Int, tQta1000 As Int, tScontrino As String)
	Type tlastscontrino(DataeOraMF As String, nChiusura As Int, nScontrino As Int)
	Public vSocket1 As Socket
	Public vTextWriter1 As TextWriter
	Public vTextReader1 As TextReader
	Public vStr1 As String
	Public vStr2 As String
	Public vInt1 As Int
	Public vSMTP1 As SMTP
	Public vInt2 As Int
	Public vInt3 As Int
	Public vBln1 As Boolean
	Public vBln2 As Boolean
	Public vBln3 As Boolean
	Public vStr3 As String
	Public vInt4 As Int
	Public vBln4 As Boolean
	Public vLng1 As Long
	Public vBln5 As Boolean
	Public vBln6 As Boolean
	Public vInt5 As Int
	Public vBln7 As Boolean
	Public vInt6 As Int
	Public vBln8 As Boolean
	Public vBln9 As Boolean
	Public vBln10 As Boolean
	Public vBln11 As Boolean
	Public vBln12 As Boolean
	Public vInt7 As Int
	Public vBln13 As Boolean
	Public vLst1 As List
	Public vckprinter1 As ckprinter
	Public vCur1 As Cursor
	Public vtattivazionert1 As tattivazionert
	Public vBln14 As Boolean
	Public vInt8 As Int
	Public vBln15 As Boolean
	Public vStr4 As String
	Public vBln16 As Boolean
	Public vBln17 As Boolean
	Public vBln18 As Boolean
	Public vtlastscontrino1 As tlastscontrino
	Public vBln19 As Boolean
	Public vBln20 As Boolean
	Public vLst2 As List
	Public vLst3 As List
	Public vLst4 As List
	Public vLst5 As List
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ccefdll.java, metodo m6… (riga 193).
Sub Sub001(z As Boolean) As Boolean
	Dim z2 As Boolean = False
	If vBln11 And z Then
		vBln14 = True
		If Sub026("7007Chiusura Giornaliera    " & modfunstr.Sub004(20), 11) = 44 Then
			Sub009()
		End If
		vBln14 = False
		Return True
	End If
	DoEvents
	DoEvents
	Dim z3 As Boolean = vBln2
	vBln2 = True
	Dim i As Int = 0
	Do While True
		If i > 100 Then
			Exit
		End If
		Try
			If Sub026("1510", 32) <> 0 Then
				Exit
			End If
			Dim read_ As String = read()
			Log(read_)
			If read_.Length <> 30 Or read_.SubString2(0, 1) = "2" Then
				Exit
			End If
			If read_.SubString2(0, 1) = "1" Then
				Exit
			End If
			DoEvents
			DoEvents
			mod1.Sub178(500)
			If i >= 40 And i Mod 10 = 0 Then
				vBln14 = True
				If Sub026("1001", 11) = 44 Then
					Sub009()
					z2 = True
				End If
				vBln14 = False
				If z2 Then
					Exit
				End If
			End If
			i = i + 1
		Catch
			mod1.Sub217(LastException.Message)
		End Try
	Loop
	vBln2 = z3
	Return z2
End Sub

Sub Sub002 As String
	nf_apri(True)
	nf_testo(Main.vStr19, 1)
	nf_testo("MESSA IN SERVIZIO", 4)
	nf_testo(Main.vStr19, 1)
	nf_chiudi()
	Dim vTmp As Int = Sub026("1511", 36)
	vBln14 = False
	If vTmp <> 0 Then
		Return ""
	End If
	Return read()
End Sub

Sub Sub003 As Boolean
	vBln17 = False
	Dim vTmp As String = Sub027()
	If vTmp.Length > 0 Then
		If vTmp.Length <= 0 Then
			Return True
		End If
		Dim substring As String = vTmp.SubString2(vTmp.Length - 1, vTmp.Length)
		vBln17 = (substring = Chr(3))
		Return True
	End If
	Return False
End Sub

Sub Sub004 As Boolean
	vBln12 = False
	If Sub026("1214", 1) = 0 Then
		Dim read_ As String = read()
		If read_.Length = 1 And (read_ = "4" Or read_ = "3") Then
			Return False
		End If
		vBln12 = True
		Return True
	End If
	vBln12 = True
	Return True
End Sub

Sub Sub005
	If vInt4 = 0 Then
		vSocket1.Close
		Return
	End If
End Sub

Sub Sub006(j As Long) As String
	Select j
		Case 0
			Return "Errore " & j & " sconosciuto"
		Case 2
			Return "Errore lettura dati da Memoria Fiscale"
		Case 3
			Return "Valore non valido"
		Case 4
			Return "Errore interno di codice"
		Case 5
			Return "Operazione non possibile"
		Case 6
			Return "Errore scrittura logotipo in Memoria Fiscale"
		Case 7
			Return "Descrizione TOTALE non permesssa"
		Case 9
			Return "Superato massimo importo scontrino"
		Case 10
			Return "Superato massimo importo corrisp. giorno"
		Case 11
			Return "Valore ricevuto non congruente"
		Case 12
			Return "Data antecedente all'ultima memorizzata in Memoria Fiscale"
		Case 13
			Return "Data/Ora non valida"
		Case 14
			Return "Data differente"
		Case 16
			Return "Carta esaurita"
		Case 18
			Return "Manca intestazione"
		Case 19
			Return "Chiusura non scritta in Memoria Fiscale"
		Case 21
			Return "Documento già in corso"
		Case 22
			Return "Date diverse"
		Case 23
			Return "Totale negativo"
		Case 24
			Return "Lunghezza comando errata"
		Case 25
			Return "Pagamento incompleto"
		Case 26
			Return "Procedura interrotta dall'utente"
		Case 27
			Return "Errore nel database interno della cassa"
		Case 28
			Dim str As String = "Errore generico " & j
			If vBln15 Then
				Return str & CRLF & "Verificare che il campo Codice Iva RT nella anagrafica iva sia compilato correttamente."
			End If
			Return str
		Case 29
			Return "Il totale iva del documento risulta essere negativo"
		Case 30
			Return "DGFE esaurito"
		Case 31
			Return "DGFE quasi esaurito"
		Case 32
			Return "Inizializzazione DGFE non possibile"
		Case 33
			Return "DGFE non presente"
		Case 34
			Return "Dati DGFE errati"
		Case 35
			Return "Memoria Fiscale disconnessa"
		Case 36
			Return "Nessun dato trovato su DGFE"
		Case 38
			Return "DGFE non identificato"
		Case 39
			Return "SD/MMC con password"
		Case 40
			Return "Dato DGFE non presente"
		Case 50
			Return "Memoria Fiscale non presente"
		Case 51
			Return "Memoria Fiscale esaurita"
		Case 52
			Return "Jumper HWINIT inserito"
		Case 53
			Return "MF già serializzata"
		Case 54
			Return "Necessaria Chiusura Giornaliera"
		Case 55
			Return "Modalità training attiva"
		Case 56
			Return "Display cliente disconnesso."
		Case 57
			Return "Data/ora non impostati"
		Case 59
			Return "Dispositivo non fiscalizzabile"
		Case 60
			Return "Dispositivo non serializzabile"
		Case 62
			Return "Ricezione dati in corso"
		Case 63
			Return "Transazione EFT-POS fallita"
		Case 64
			Return "Coperchio aperto"
		Case 65
			Return "Errore tensione alimentazione testina termica"
		Case 66
			Return "Errore temperatura testina termica"
		Case 67
			Return "Taglierina inceppata oppure errore op.sys."
		Case 68
			Return "Testina termica scollegata"
		Case Else
			Return "Errore generico " & j
	End Select
End Sub

Sub Sub007(str As String, i As Int)
	Dim sb2 As String = mod1.Sub139(str.Length, 3, "0") & str
	If Sub026("74000001" & SmartStringFormatter("", sb2) & "", 1) = 0 Then
		Dim stringBuilderWrapper As StringBuilder
		stringBuilderWrapper.Initialize
		vBln14 = True
		Dim z As Boolean = False
		Do While True
			If z Then
				Exit
			End If
			If Sub026("7403120", 1) = 0 Then
				stringBuilderWrapper.Append(read().SubString(3))
			Else
				z = True
			End If
		Loop
		vBln14 = False
		Sub026("7408", 1)
		If stringBuilderWrapper.ToString.length > 0 Then
			Dim replace As String = ("CORRISPETTIVI_" & mod1.Sub059(mod1.Sub058) & "_" & i & "_" & Main.v_numcassa & "_" & Main.v_nnegozio & ".xml").Replace("/", "").Replace(":", "")
			File.WriteString(File.DirDefaultExternal & "/Corrispettivi", replace, stringBuilderWrapper.ToString)
			Return
		End If
		Return
	End If
End Sub

Sub ft_apri(i As Int)
	If vBln2 Then
		Return
	End If
	vInt2 = i
	If Main.vBln35 Then
		vLst1.Initialize
		If vInt6 = 0 Then
			Return
		End If
		nf_apri(False)
		Return
	End If
	If Sub026("30161", 1) <> 0 Then
		Return
	End If
	If Sub026("400121" & NumberFormat2(i, 9, 0, 0, False), 1) <> 0 Then
		Return
	End If
	Sub026("4002", 1)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ccefdll.java, metodo _ft_chiudi (riga 595).
Sub ft_chiudi
	Dim z As Boolean
	Dim i As Int
	Dim i2 As Int
	If vBln2 Then
		Return
	End If
	If Main.vBln35 Then
		If vInt2 < 0 Then
			ft_testo("==========================================", 1)
			ft_testo("TOT. NOTA DI CREDITO:" & modfunstr.Sub003(modfunstr.Sub004(11) & NumberFormat2(vInt2 * 1 / 100, 1, 2, 2, False), 11), 4)
			ft_testo("==========================================", 1)
		Else
			ft_testo("==========================================", 1)
			ft_testo("TOT.   FATTURA:" & modfunstr.Sub003(modfunstr.Sub004(17) & NumberFormat2(vInt2 / 100, 1, 2, 2, False), 17), 4)
			ft_testo("==========================================", 1)
		End If
		If Main.vDbl2 > 0 Then
			ft_testo(" ", 1)
			ft_testo("Operazione assoggettata a  ", 1)
			ft_testo("split payment con IVA non  ", 1)
			ft_testo("incassata dal cedente ai sensi ", 1)
			ft_testo("dell’ex art.Anon_17-ter DPR 633/1972", 1)
			ft_testo(" ", 1)
			ft_testo("==========================================", 1)
			Dim d As Double = vInt2
			Dim d2 As Double = (d - Main.vDbl2 * 100) / 100
			ft_testo("NETTO DA PAGARE:" & modfunstr.Sub003(modfunstr.Sub004(16) & NumberFormat2(d2, 1, 2, 2, False), 16), 4)
			ft_testo("==========================================", 1)
		End If
		If vInt6 > 0 Then
			Sub026("4004", 1)
			If vInt6 > 1 Then
				If Main.v_pausafe Then
					If Not(Main.v_matricola.StartsWith("PR1B")) Then
						If Not(Main.v_matricola.StartsWith("PX1B")) Then
							If Not(Main.v_matricola.StartsWith("IP1B")) Then
								z = True
								If z Then
									mod1.Sub178(500)
									CallSub2(mod1.vStr1, "MsgboxOnly", "Premere Ok quando si è pronti per la stampa della copia successiva")
								End If
								i = vInt6 - 1
								For i2 = 1 To i
									nf_apri(Main.v_intesta)
									Dim size As Int = vLst1.Size - 1
									Dim i3 As Int
									For i3 = 0 To size
										Dim tcopiaVar As tcopia = vLst1.Get(i3)
										nf_testo(tcopiaVar.Testo, tcopiaVar.stile)
									Next
									Sub026("4004", 1)
									If i2 < vInt6 - 1 And z Then
										mod1.Sub178(500)
										CallSub2(mod1.vStr1, "MsgboxOnly", "Premere Ok quando si è pronti per la stampa della copia successiva")
									End If
								Next
							End If
						End If
					End If
				End If
				z = False
				If z Then
				End If
				i = vInt6 - 1
				Do While i2 <= i
				Loop
			End If
		End If
		Dim randomAccessFile As RandomAccessFile
		randomAccessFile.Initialize2(mod1.vStr7, "Tmp.MF", False, False)
		Dim object As List = vLst1
		randomAccessFile.WriteObject(object, True, randomAccessFile.CurrentPosition)
		randomAccessFile.Close
		Dim textWriterWrapper As TextWriter
		textWriterWrapper.Initialize(File.OpenOutput(mod1.vStr7, "Tmp.txt", False))
		Dim size2 As Int = vLst1.Size - 1
		Dim i4 As Int
		For i4 = 0 To size2
			textWriterWrapper.Write(vLst1.Get(i4).Testo & Chr(13) & Chr(10))
		Next
		textWriterWrapper.Close
		Dim list As List
		vLst1 = Null
		Return
	End If
	Dim d3 As Double = vInt2
	If Sub026("4003F15TOTALE FATTURA:" & NumberFormat2(d3, 9, 0, 0, False), 1) <> 0 Then
		Return
	End If
	Sub026("4006", 1)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ccefdll.java, metodo _ft_ristampafe (riga 752).
Sub ft_ristampafe(str As String)
	Dim z As Boolean
	Dim i As Int
	Dim i2 As Int
	If vBln2 Then
		Return
	End If
	If File.Exists(mod1.vStr7, str) Then
		Dim randomAccessFile As RandomAccessFile
		randomAccessFile.Initialize(mod1.vStr7, str, False)
		If randomAccessFile.Size = 0 Then
			mod1.Sub215("Errore nella struttura del file job (" & str & ")")
			randomAccessFile.Close
			Return
		End If
		vLst1 = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
		If Main.v_pausafe Then
			If Not(Main.v_matricola.StartsWith("PR1B")) Then
				If Not(Main.v_matricola.StartsWith("PX1B")) Then
					If Not(Main.v_matricola.StartsWith("IP1B")) Then
						z = True
						i = vInt6 - 1
						For i2 = 0 To i
							nf_apri(Main.v_intesta)
							Dim size As Int = vLst1.Size - 1
							Dim i3 As Int
							For i3 = 0 To size
								Dim tcopiaVar As tcopia = vLst1.Get(i3)
								nf_testo(tcopiaVar.Testo, tcopiaVar.stile)
							Next
							Sub026("4004", 1)
							If i2 < vInt6 - 1 And z Then
								mod1.Sub178(500)
								CallSub2(mod1.vStr1, "MsgboxOnly", "Premere Ok quando si è pronti per la stampa della copia successiva")
							End If
						Next
						Dim list As List
						vLst1 = Null
					End If
				End If
			End If
		End If
		z = False
		i = vInt6 - 1
		Do While i2 <= i
		Loop
		Dim list2 As List
		vLst1 = Null
	End If
End Sub

Sub ft_testo(str As String, i As Int)
	Dim vTmp As String
	Dim vNumberToString As String
	If vBln2 Then
		Return
	End If
	If Main.vBln35 Then
		If i < 4 Then
			If Not(str.StartsWith("TOT. ")) Then
				If Not(str.StartsWith("NETTO DA PAGARE")) Then
					If Not(str.StartsWith("Scontrini del")) Then
						If Not(str.StartsWith("RIC.N.")) Then
							i = 3
						End If
					End If
				End If
			End If
		End If
		Dim tcopiaVar As tcopia
		tcopiaVar.Testo = str
		tcopiaVar.stile = i
		vLst1.Add(tcopiaVar)
		If vInt6 = 0 Then
			Return
		End If
		nf_testo(str, i)
		Return
	End If
	If i > 6 Then
		If Not(Main.v_stampa66char) Then
			i = 1
		End If
	End If
	i
	If i = 10 Then
		vTmp = Sub022(str, 60)
		vNumberToString = "D"
	Else If i = 11 Then
		vTmp = Sub022(str, 66)
		vNumberToString = "B"
	Else If i = 12 Then
		vTmp = Sub022(str, 66)
		vNumberToString = "C"
	Else
		vTmp = Sub022(str, 42)
		If i < 1 Or i > 6 Then
			i = 1
		End If
		vNumberToString = i
	End If
	Dim str2 As String = IIf(vTmp = "", " ", vTmp)
	Dim length As Double = str2.Length
	Sub026("4003" & vNumberToString & NumberFormat2(length, 2, 0, 0, False) & str2, 1)
End Sub

Sub Sub008(z As Boolean)
	If z Then
		Dim textWriterWrapper As TextWriter = vTextWriter1
		textWriterWrapper.Write(Chr(17) & Chr(17) & Chr(18) & Chr(48) & Chr(48) & Chr(53) & Chr(48) & Chr(48) & Chr(48) & Chr(53) & Chr(51) & Chr(50) & Chr(54) & Chr(30) & Chr(49) & Chr(50) & Chr(56) & Chr(31))
		vTextWriter1.Flush
		mod1.Sub178(1000)
		Dim textWriterWrapper2 As TextWriter = vTextWriter1
		textWriterWrapper2.Write(Chr(17) & Chr(17) & Chr(18) & Chr(48) & Chr(48) & Chr(53) & Chr(48) & Chr(48) & Chr(48) & Chr(53) & Chr(51) & Chr(50) & Chr(55) & Chr(30) & Chr(57) & Chr(50) & Chr(49) & Chr(31))
		vTextWriter1.Flush
		mod1.Sub178(1000)
		Sub014("Sblocco eseguito correttamente", Main.vStr8)
		Return
	End If
	Dim textWriterWrapper3 As TextWriter = vTextWriter1
	textWriterWrapper3.Write(Chr(17) & Chr(17) & Chr(18) & Chr(48) & Chr(48) & Chr(53) & Chr(48) & Chr(48) & Chr(48) & Chr(53) & Chr(51) & Chr(50) & Chr(54) & Chr(30) & Chr(48) & Chr(50) & Chr(57) & Chr(31))
	vTextWriter1.Flush
	mod1.Sub178(1000)
	Log(1)
	Dim textWriterWrapper4 As TextWriter = vTextWriter1
	textWriterWrapper4.Write(Chr(17) & Chr(17) & Chr(18) & Chr(48) & Chr(48) & Chr(53) & Chr(48) & Chr(48) & Chr(48) & Chr(53) & Chr(51) & Chr(50) & Chr(55) & Chr(30) & Chr(57) & Chr(50) & Chr(49) & Chr(31))
	vTextWriter1.Flush
	Log(2)
	mod1.Sub178(1000)
	Sub014("Blocco eseguito correttamente", Main.vStr8)
End Sub

Sub Sub009
	If vInt5 = 0 Then
		Dim str As String = "0"
		Dim vObjectToCharSequence As Object = "Si desidera aggiornare adesso il registratore telematico ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "Annulla", Main.vBmp1)
		If vMsgbox2 = -1 Then
			str = "1"
			Dim vObjectToCharSequence3 As Object = "ATTENZIONE ... EVITARE DI SPEGNERE IL REGISTRATORE DURANTE LA FASE DI AGGIORNAMENTO ... " & CRLF & "IL PROGRAMMA VERRA' CHIUSO PER CONSENTIRE L'AGGIORNAMENTO."
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		End If
		Sub026("2009" & str, 1)
		CallSubDelayed(Main, "EsciDaProgrammaAttendi")
		Return
	End If
	Sub026("20091", 1)
End Sub

Sub Sub010(i As Int) As String
	Select i
		Case 1
			Return "011"
		Case 2
			Return "111"
		Case 3
			Return "211"
		Case 4
			Return "311"
		Case 5
			Return "012"
		Case 6
			Return "112"
		Case 7
			Return "212"
		Case 8
			Return "312"
		Case 9
			Return "013"
		Case 10
			Return "113"
		Case 11
			Return "213"
		Case 12
			Return "313"
		Case 13
			Return "014"
		Case 14
			Return "114"
		Case 15
			Return "214"
		Case 16
			Return "314"
		Case 17
			Return "015"
		Case 18
			Return "115"
		Case 19
			Return "215"
		Case 20
			Return "315"
		Case 21
			Return "016"
		Case 22
			Return "116"
		Case 23
			Return "216"
		Case 24
			Return "316"
		Case 25
			Return "017"
		Case Else
			Return ""
	End Select
End Sub

Sub Sub011(str As String) As String
	Select str
	End Select
	Return "POS"
End Sub

Sub Sub012 As String
	Dim rt_countfileinfolder_ As Int = rt_countfileinfolder("mmc:0:\XML\SENT\CORR\FAIL")
	Dim rt_countfileinfolder2 As Int = rt_countfileinfolder("mmc:0:\XML\SENT\CORR\NORESP")
	Return "0" & mod1.Sub139(rt_countfileinfolder_, 4, "0") & mod1.Sub139(rt_countfileinfolder2, 4, "0")
End Sub

Sub Initialize(i As Int)
	vInt4 = i
	vBln1 = False
End Sub

Sub Sub013(str As String, z As Boolean)
	If z Then
		If Not(vBln14) Then
			Dim textWriterWrapper As TextWriter
			Dim vTmp As Long = mod1.Sub058
			Dim sb2 As String = mod1.Sub060(vTmp) & TAB & str & TAB & vStr3
			Dim sb4 As String = File.DirDefaultExternal & "/LOG"
			textWriterWrapper.Initialize(File.OpenOutput(sb4, "CEFDLL_ERR.txt", True))
			textWriterWrapper.WriteLine(sb2)
			textWriterWrapper.Close
		End If
	End If
	If vBln3 Then
		Dim textWriterWrapper2 As TextWriter
		Dim vTmp_ As Long = mod1.Sub058
		Dim sb6 As String = mod1.Sub060(vTmp_) & TAB & str & TAB & vStr3
		Dim sb8 As String = File.DirDefaultExternal & "/LOG"
		textWriterWrapper2.Initialize(File.OpenOutput(sb8, "CEFDLL_LOG.txt", True))
		textWriterWrapper2.WriteLine(sb6)
		textWriterWrapper2.Close
		Return
	End If
End Sub

Sub Sub014(str As String, str2 As String)
	If vInt5 = 1 Then
		CallSub3("Verificazione", "MsgboxOnly", str2, str)
		Return
	End If
	If vInt5 = 2 Then
		CallSub3("tabelleappoggio", "MsgboxOnly", str2, str)
		Return
	End If
	Msgbox(str, str2)
End Sub

Sub mf_apricassetto
	If vBln2 Then
		Return
	End If
	Sub026("70081", 1)
End Sub

Sub mf_dayisopen As Boolean
	If vBln2 Then
		Return False
	End If
	If Sub026("1010", 12) = 0 Then
		Dim read_ As String = read()
		If read_.Length >= 8 And read_.SubString2(7, 8) = "0" Then
			Return True
		End If
		Return False
	End If
	Return False
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ccefdll.java, metodo _mf_display (riga 1288).
Sub mf_display(str As String, str2 As String)
	Dim z As Boolean
	Dim vTmp As String
	If Not(vBln2) Then
		If Main.v_ipvis <> "" Then
		End If
		If Main.vStr6 = "" Then
			If vInt4 = 1 Then
			End If
			Dim substring As String = (Sub023(str, 20, False) & "                    ").SubString2(0, 20)
			If Main.v_attivamp Then
				If Not(Main.vBln22) Then
					z = True
					If z Then
						vTmp = (Sub023(str2, 20, False) & "                    ").SubString2(0, 20)
					Else
						vTmp = modfunstr.Sub004(20)
					End If
					Sub026("7007" & substring & vTmp, 1)
					Return
				End If
			End If
			z = False
			If z Then
			End If
			Sub026("7007" & substring & vTmp, 1)
			Return
		End If
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ccefdll.java, metodo _mf_eod (riga 1339).
Sub mf_eod(str As String)
	Dim z As Boolean
	If vBln2 Or Sub026("30161", 1) <> 0 Then
		Return
	End If
	vBln2 = True
	Try
		mod1.Sub215("Chiusura Giornaliera")
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vBln15 Then
		If Main.v_matricola.StartsWith("ST") Then
			z = True
			If Not(z) Then
				Sub026("2002", 3)
			End If
			If Not(vBln15) Then
				If vBln10 Then
					vBln10 = False
				End If
				If Not(Main.v_matricola.StartsWith("ST")) Then
					If str = "Main" Then
						Dim vObjectToCharSequence As Object = "Invio dati di vendita in corso ..."
						ProgressDialogShow2(vObjectToCharSequence, False)
					End If
					If Not(Sub001(vInt7 < 7)) Then
						Sub014("Si sono verificati problemi durante l'invio dei dati di vendita", "Errore invio dati")
					Else If vBln8 Then
						vBln2 = False
						rt_verificamagazzino()
					End If
					If str = "Main" Then
						ProgressDialogHide
					End If
				Else
					If Main.vInt28 > 0 Then
						Dim intentWrapper As Intent
						intentWrapper.Initialize("android.intent.action.MAIN", "zclosure://custom.com/0/1/PROD")
						intentWrapper.SetComponent("com.custom.utilityrt/.ZSplashActivity")
						If str = "Main" Then
							Main.vStr2 = "Chiusura"
							CallSub2(Main, "StartActivityForResult", intentWrapper)
						Else
							CallSub2(Verificazione, "StartActivityForResult", intentWrapper)
						End If
						vInt8 = 0
						Main.vSql1.ExecNonQuery("update versione set ProgLotteriaST =0")
					Else
						If Main.vInt28 = 0 Then
							If Main.v_matricola.StartsWith("ST") Then
								Sub014("Non è stata trovata l'applicazione UtilityRT", "Errore invio dati")
							End If
						End If
					End If
				End If
			Else
				If Not(vBln15) Then
					CallSub(Main, "AttendiChiusuraMF")
					vBln2 = False
					rt_leggistato(False)
				End If
			End If
			vBln2 = False
			Return
		End If
	End If
	z = False
	If Not(z) Then
	End If
	If Not(vBln15) Then
	End If
	vBln2 = False
End Sub

Sub mf_feed
	If vBln2 Then
		Return
	End If
	Sub026("7001z0", 1)
End Sub

Sub mf_getdisplaystampa(str As String) As Int
	Try
		If vBln2 Then
			Return -1
		End If
		If Main.v_matricola.StartsWith("ST") And Sub026("7501" & str, 11) = 0 Then
			Return read()
		End If
		Return -1
	Catch
		Dim sb As String = "Errore nella lettura dei valori di stampa e display ." & CRLF & CRLF & "Uscire e riprovare ."
		Sub014(sb, "Errore dal " & Main.vStr1 & "")
		Return -1
	End Try
End Sub

Sub mf_intesta(i As Int, str As String, i2 As Int) As Boolean
	Dim vTmp As Int
	If vBln2 Then
		Return False
	End If
	If str.ToLowerCase = "logo1" Then
		Return True
	End If
	If Sub026("1010", 12) = 0 Then
		Dim read_ As String = read()
		If read_.Length < 8 Or read_.SubString2(7, 8) = "0" Then
			Return False
		End If
		Dim i3 As Int = 32
		If i2 = 5 Then
			i3 = 16
		End If
		If i2 = 3 Then
			i3 = 42
		End If
		Dim sb2 As String = modfunstr.Sub004((i3 - '### r3.length()) / 2) & Sub022(str, i3).Trim
		Dim left As String = modfunstr.left(sb2 & modfunstr.Sub004(i3), i3)
		If left.ToLowerCase.Trim = "logo" Then
			vTmp = Sub026("6302" & i & "I011", 1)
		Else
			vTmp = Sub026("6302" & i & i2 & i3 & left, 1)
		End If
		Return vTmp = 0
	End If
	Return False
End Sub

Sub mf_leggidataora As String
	Try
		If Not(vBln2) And Sub026("1001", 11) = 0 Then
			Return read()
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return ""
End Sub

Sub mf_leggifirmwarever
	If Not(vBln2) And Sub026("1013", 33) = 0 Then
		vStr3 = read()
	End If
End Sub

Sub mf_leggiiva As String
	If Not(vBln2) And Sub026("7012", 48) = 0 Then
		Return read()
	End If
	Return ""
End Sub

Sub mf_leggilastscontr As Int
	If vBln2 Or Sub026("1004", 89) <> 0 Then
		Return 0
	End If
	Dim read_ As String = read()
	If read_.Length > 4 Then
		Return read_.SubString2(0, 4)
	End If
	Return 0
End Sub

Sub mf_leggilastz As Int
	If vBln2 Or Sub026("1104", 9) <> 0 Then
		Return 0
	End If
	Dim read_ As String = read()
	If read_.Length > 4 Then
		Return read_.SubString2(0, 4)
	End If
	Return 0
End Sub

Sub mf_leggimf As String
	If vBln2 Then
		Return ""
	End If
	If Sub026("1008", 11) = 0 Then
		Dim read_ As String = read()
		If vStr3 = "" Then
			mf_leggifirmwarever()
		End If
		If read_.Length = 11 Then
			Return read_.SubString2(3, 5) & read_.SubString2(0, 2) & read_.SubString(5)
		End If
		Return read_
	End If
	If vInt4 = 1 Then
		vBln1 = False
	End If
	Return ""
End Sub

Sub mf_leggitotalilastscontr As Int
	If vBln2 Or Sub026("1003", 62) <> 0 Then
		Return 0
	End If
	Dim read_ As String = read()
	If read_.Length > 4 Then
		Return read_.SubString2(0, 4)
	End If
	Return 0
End Sub

Sub mf_scriviiva(str As String)
	If vBln2 Then
		Return
	End If
	Sub026("7013" & str, 1)
End Sub

Sub mf_setdatetime(str As String)
	If vBln2 Then
		Return
	End If
	Sub026("2001" & str, 5)
End Sub

Sub mf_setdisplaystampa(str As String, i As Int)
	If Not(vBln2) Then
		If Main.v_matricola.StartsWith("ST") Then
			If str = "1" And (i < 0 Or i > 12) Then
				i = 5
			Else If str <> "1" And (i < 0 Or i > 99) Then
				i = 40
			End If
			Sub026("7500" & str & NumberFormat(i, 2, 0), 1)
			Return
		End If
	End If
End Sub

Sub mf_sound
	If Not(vBln2) Then
		If Main.v_suonodacassa Then
			vBln14 = True
			Dim str As String = "1"
			Dim i As Int
			For i = 0 To 6 Step 2
				If Sub026("3116" & str & i, 1) > 0 Then
					vBln14 = False
					Return
				End If
				If str = "1" Then
					str = "2"
				Else
					str = "1"
				End If
			Next
			vBln14 = False
			Return
		End If
	End If
End Sub

Sub mf_stampadgfe(str As String, i As Int, i2 As Int)
	If vBln2 Then
		Return
	End If
	Sub026("8002" & str & NumberFormat2(i, 4, 0, 0, False) & NumberFormat2(i2, 4, 0, 0, False) & "0", 1)
End Sub

Sub mf_tagliacarta As Int
	If vBln2 Then
		Return 0
	End If
	Return Sub026("3013", 1)
End Sub

Sub mf_writelogo(str As String, str2 As String)
	If vInt4 = 1 Then
		Return
	End If
	If File.Exists(str, str2) Then
		Dim vHexFromBytes As String = HexFromBytes(Bit.InputStreamToBytes(File.OpenInput(str, str2)))
		If vHexFromBytes.Length > 0 Then
			Dim vSize As Double = File.Size(str, str2)
			If Sub026("910001" & NumberFormat2(vSize, 6, 0, 0, False), 1) = 0 Then
				Dim stringBuilderWrapper As StringBuilder
				stringBuilderWrapper.Initialize
				Dim length As Int = vHexFromBytes.Length - 1
				Dim i As Int = 0
				Dim i2 As Int
				For i2 = 0 To length Step 2
					stringBuilderWrapper.Append(vHexFromBytes.SubString2(i2, i2 + 2))
					i = i + 1
					If i = 50 Then
						Sub026("910150" & stringBuilderWrapper.ToString, 1)
						stringBuilderWrapper.Initialize
						i = 0
						DoEvents
					End If
				Next
				Sub026("9102", 1)
			End If
		End If
	End If
End Sub

Sub nf_apri(z As Boolean)
	If vBln2 Then
		Return
	End If
	If vBln9 Then
		vBln9 = False
	End If
	If vBln7 Then
		If Not(vLst1.IsInitialized) Then
			vckprinter1 = mod1.Sub138(Main.v_stampareport)
			If vckprinter1 = Null Then
				vBln7 = False
				Return
			End If
			vckprinter1.doc_inizio
			Dim ckprinterVar As ckprinter = vckprinter1
			ckprinterVar.doc_paginizio(False)
			If z Then
				If Not(vCur1.IsInitialized) Then
					Dim cursorWrapper As Cursor
					vCur1 = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
				End If
				If vCur1.RowCount > 0 Then
					Dim ckprinterVar2 As ckprinter = vckprinter1
					ckprinterVar2.doc_testostile(False, True, False, False, False, False, False, "")
					Dim i As Int
					For i = 0 To 5
						vCur1.Position = i
						vckprinter1.doc_testogiustifica(1)
						vckprinter1.doc_testostampa(vCur1.GetString("descrizione"))
					Next
				End If
			End If
			vckprinter1.doc_testogiustifica(1)
			Return
		End If
	End If
	vInt3 = 0
	If Sub026("30161", 1) <> 0 Then
		Return
	End If
	Sub026("40011", 1)
	If Not(z) Or Sub026("4002", 1) <> 0 Then
		Return
	End If
End Sub

Sub nf_barcode(str As String, i As Int)
	If vBln2 Then
		Return
	End If
	Dim vTmp As String = Sub022(str, 40)
	If i < 1 Or i > 5 Then
		i = 4
	End If
	If vTmp = "" Then
		Return
	End If
	Dim length As Double = vTmp.Length
	Sub026("3021" & i & "233" & NumberFormat2(length, 2, 0, 0, False) & vTmp, 1)
End Sub

Sub nf_chiudi
	If vBln2 Then
		Return
	End If
	If vBln7 Then
		If Not(vLst1.IsInitialized) Then
			If Not(vckprinter1 = Null) Then
				If vckprinter1.vBln5 Then
					Dim ckprinterVar As ckprinter = vckprinter1
					ckprinterVar.doc_pagfine(False)
					vckprinter1.doc_fine
					Return
				End If
			End If
			Return
		End If
	End If
	Sub026("4004", 1)
End Sub

Sub nf_testo(str As String, i As Int)
	Dim vTmp As String
	Dim vNumberToString As String
	If vBln2 Then
		Return
	End If
	If i > 6 Then
		If Not(Main.v_stampa66char) Then
			i = 1
		End If
	End If
	If vBln7 Then
		If Not(vLst1.IsInitialized) Then
			If Not(vckprinter1 = Null) Then
				If vckprinter1.vBln5 Then
					Select i
						Case 1
							Dim ckprinterVar As ckprinter = vckprinter1
							ckprinterVar.doc_testostile(False, False, False, False, False, False, False, "")
						Case 2
							Dim ckprinterVar2 As ckprinter = vckprinter1
							ckprinterVar2.doc_testostile(False, True, False, False, False, False, False, "")
						Case 3, 11
							Dim ckprinterVar3 As ckprinter = vckprinter1
							ckprinterVar3.doc_testostile(True, False, False, False, False, False, False, "")
						Case 4
							Dim ckprinterVar4 As ckprinter = vckprinter1
							ckprinterVar4.doc_testostile(False, False, True, False, False, False, False, "")
						Case 5
							Dim ckprinterVar5 As ckprinter = vckprinter1
							ckprinterVar5.doc_testostile(False, False, False, True, False, False, False, "")
						Case 6
							Dim ckprinterVar6 As ckprinter = vckprinter1
							ckprinterVar6.doc_testostile(False, False, False, False, True, False, False, "")
						Case 7, 8, 9, 10
							Dim ckprinterVar7 As ckprinter = vckprinter1
							ckprinterVar7.doc_testostile(False, False, False, False, False, False, False, "")
					End Select
					vckprinter1.doc_testostampa(str)
					Return
				End If
			End If
			Return
		End If
	End If
	i
	If i = 10 Then
		vTmp = Sub022(str, 60)
		vNumberToString = "D"
	Else If i = 11 Then
		vTmp = Sub022(str, 66)
		vNumberToString = "B"
	Else If i = 12 Then
		vTmp = Sub022(str, 66)
		vNumberToString = "C"
	Else
		vTmp = Sub022(str, 42)
		If i < 1 Or i > 6 Then
			i = 1
		End If
		vNumberToString = i
	End If
	If vTmp = "" Then
		vTmp = " "
	End If
	If vInt3 > 250 Then
		nf_chiudi()
		nf_apri(False)
	End If
	vInt3 = vInt3 + 1
	Dim length As Double = vTmp.Length
	Sub026("4003" & vNumberToString & NumberFormat2(length, 2, 0, 0, False) & vTmp, 1)
End Sub

Sub Sub015(str As String) As Int
	Dim threading As Thread
	If str <> "" Then
		vStr2 = str
	End If
	vSocket1.Initialize("sck")
	vSocket1.TimeOut = 10000
	vSocket1.Connect(vStr2, 9100, 10000)
	Dim i As Int = 0
	Do While True
		Dim connected As Boolean = vSocket1.Connected
		If connected Or i >= 100 Then
			Exit
		End If
		threading.Sleep(100)
		i = i + 1
	Loop
	If vSocket1.Connected Then
		vTextWriter1.Initialize(vSocket1.OutputStream)
		vTextReader1.Initialize(vSocket1.InputStream)
		Sub013("Connected", False)
		vBln1 = True
		Sub003()
		If vStr3 <> "" Then
			Return 0
		End If
		mf_leggifirmwarever()
		Return 0
	End If
	vBln1 = False
	Sub013("Connection Error", True)
	Return 256
End Sub

Sub Sub016 As Int
	Dim vTmp As Boolean = usbpl2303.Sub002
	If Not(vTmp) Then
		Sub014("Non è stato trovato nessun adattatore USB-Seriale Prolific", "Attenzione")
		vBln6 = False
		Return 1
	End If
	If usbpl2303.Sub001 Then
		usbpl2303.Sub003(50, 1, "cCEFDLL", "RxDataEvent")
		Dim uartdataVar As uartdata
		uartdataVar.rate = usbpl2303.rate_19200
		uartdataVar.databits = usbpl2303.databits_7
		uartdataVar.parity = usbpl2303.parity_odd
		uartdataVar.stopbits = usbpl2303.stopbits_1
		usbpl2303.Sub006(uartdataVar)
		usbpl2303.Sub005(False, True)
		vBln6 = True
		Return 0
	End If
	Sub014("Non si dispone dell'autorizzazione per l'utilizzo di adattatori USB-Seriali", "Abilitazione")
	usbpl2303.Sub004
	vBln6 = False
	Return 2
End Sub

Sub Sub017 As Int
	Try
		Dim serialPort As SerialPort
		serialPort.SetPort("/dev/ttymxc4", 57600, 2)
		vTextWriter1.Initialize(serialPort.OutputStream)
		vTextReader1.Initialize(serialPort.InputStream)
		vBln6 = True
		vBln1 = True
		Return 0
	Catch
		Sub014("Errore nell'apertura della stampante fiscale", "Attenzione")
		vBln6 = False
		Return 1
	End Try
End Sub

Sub Sub018(str As String)
	Dim str2 As String = "000" & str
	Dim length As Int = str2.Length - 1
	Dim i As Int = 0
	Dim i2 As Int
	For i2 = 0 To length
		i = i + Asc(str2.SubString2(i2, i2 + 1))
	Next
	vTextWriter1.Write(Chr(2) & str2 & NumberFormat(i Mod 100, 2, 0) & Chr(3))
	vTextWriter1.Flush
End Sub

Sub Sub019(str As String, i As Int)
	Dim str2 As String = "000" & str
	Dim length As Int = str2.Length - 1
	Dim i2 As Int = 0
	Dim i3 As Int
	For i3 = 0 To length
		i2 = i2 + Asc(str2.SubString2(i3, i3 + 1))
	Next
	Dim bArr(0) As Byte
	Dim bytes() As Byte = (Chr(2) & str2 & NumberFormat(i2 Mod 100, 2, 0) & Chr(3)).GetBytes("UTF8")
	Main.vStr3 = ""
	usbpl2303.Sub009(bytes, bytes.Length, i)
End Sub

Sub read As String
	If vInt4 = 2 Or vBln17 Then
		If vStr1.Length > 12 Then
			Return vStr1.SubString2(9, vStr1.Length - 3)
		End If
		Return vStr1
	End If
	If vInt4 = 1 Then
		Dim str As String = vStr1
		Return str.Replace(Chr(6), "")
	End If
	Return vStr1
End Sub

Sub Sub020(i As Int) As Boolean
	Dim cArr(1024) As Char
	Dim i2 As Int
	For i2 = 0 To 1000
		If vTextReader1.Ready Then
			Dim vRead As Int = vTextReader1.Read(cArr, 0, 1024)
			vStr1 = vStr1 & CharsToString(cArr, 0, vRead)
			Dim substring As String = vStr1.SubString2(vStr1.Length - 1, vStr1.Length)
			If substring = Chr(3) Then
				Dim str As String = vStr1
				If str.StartsWith(Chr(6) & Chr(6)) Then
					vStr1 = vStr1.SubString(1)
				End If
				Return True
			End If
		End If
		mod1.Sub178(i)
	Next
	Return False
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ccefdll.java, metodo m2… (riga 2181).
Sub Sub021(cursorWrapper As Cursor)
	Dim z As Boolean
	Dim rowCount As Int = cursorWrapper.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper.Position = i
		If cursorWrapper.GetDouble("importo") = 0 Then
			If Main.v_articolizero <> 0 Then
				If Main.v_articolizero <> 2 And cursorWrapper.GetString("codint") <> "888888" And cursorWrapper.GetString("codint") <> "888889" Then
					z = False
					If cursorWrapper.GetDouble("qta") <> 1 And z Then
						If Not(mod1.Sub029(cursorWrapper.GetString("codint"))) Then
							If Not(mod1.Sub028(cursorWrapper.GetString("codint"))) Then
								If cursorWrapper.GetString("codint") = "rgr" Or cursorWrapper.GetDouble("qta") Mod 1 = 0 Then
									Dim doubleValue As Double = cursorWrapper.GetDouble("prezzov")
									nf_testo(NumberFormat(cursorWrapper.GetDouble("qta"), 1, 0) & " x " & NumberFormat2(doubleValue, 1, 2, 2, False).Replace(".", ","), 1)
								Else
									Dim doubleValue2 As Double = cursorWrapper.GetDouble("qta")
									Dim doubleValue3 As Double = cursorWrapper.GetDouble("prezzov")
									nf_testo(NumberFormat2(doubleValue2, 1, 2, 2, False) & " x " & NumberFormat2(doubleValue3, 1, 2, 2, False).Replace(".", ","), 1)
								End If
							End If
						End If
					End If
					If Not(z) Then
						Dim vGetString As String = cursorWrapper.GetString("descrizione")
						Dim sb5 As String = modfunstr.left(vGetString, Main.vInt31 + 25) & modfunstr.Sub004(Main.vInt31 + 25)
						Dim doubleValue4 As Double = cursorWrapper.GetDouble("importo")
						nf_testo(modfunstr.left(sb5, Main.vInt31 + 25) & modfunstr.Sub003(modfunstr.Sub004(7) & NumberFormat2(doubleValue4, 1, 2, 2, False).Replace(".", ","), 7), 1)
					Else If cursorWrapper.GetDouble("scop") = 100 Then
						Dim vGetString2 As String = cursorWrapper.GetString("descrizione")
						Dim sb9 As String = modfunstr.left(vGetString2, Main.vInt31 + 25) & modfunstr.Sub004(Main.vInt31 + 20)
						nf_testo(modfunstr.left(sb9, Main.vInt31 + 20) & modfunstr.Sub003(modfunstr.Sub004(12) & "(Omaggio)", 12), 1)
					End If
					If cursorWrapper.GetString("memo") = "" Then
						nf_testo(cursorWrapper.GetString("memo").Trim, 10)
						nf_testo(" ", 10)
					End If
				End If
			End If
		End If
		z = True
		If cursorWrapper.GetDouble("qta") <> 1 Then
			If Not(mod1.Sub029(cursorWrapper.GetString("codint"))) Then
			End If
		End If
		If Not(z) Then
		End If
		If cursorWrapper.GetString("memo") = "" Then
		End If
	Next
End Sub

Sub rt_aggiungirighe(cursorWrapper As Cursor, i As Int)
	If vBln2 Then
		Return
	End If
	If cursorWrapper.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper.RowCount - 1
		Dim i2 As Int = 0
		Do While True
			Dim i3 As Int = i2
			If i3 > rowCount Then
				Exit
			End If
			cursorWrapper.Position = i3
			Dim vGetString As String = cursorWrapper.GetString("descrizione")
			Dim vGetInt As Int = cursorWrapper.GetInt("reparto")
			Dim vRound2 As Int = Round2(cursorWrapper.GetDouble("prezzov") * 100, 0)
			Dim vRound22 As Int = Round2(cursorWrapper.GetDouble("qta") * 1000, 0)
			Dim vRound23 As Int = Round2(cursorWrapper.GetDouble("prezzov") * cursorWrapper.GetDouble("qta") * 100, 0)
			Dim vRound24 As Int = Round2(cursorWrapper.GetDouble("scov") * 100, 0)
			Dim z As Boolean = cursorWrapper.GetString("codint") = "com" Or cursorWrapper.GetString("codint") = "abb" Or cursorWrapper.GetString("codint") = "pre" Or cursorWrapper.GetString("codint") = "rgr"
			Dim doubleValue As Double = cursorWrapper.GetDouble("scop")
			Dim vGetInt2 As Int = cursorWrapper.GetInt("iva")
			sf_vendita(vGetString, vGetInt, vRound2, vRound22, vRound23, vRound24, z, doubleValue, vGetInt2, "", Main.sc_sconto)
			i2 = i3 + 1
		Loop
	Else
		sf_vendita("Nessun articolo", 1, 0, 1, 0, 0, False, 0, 1, "", Main.sc_sconto)
	End If
	sf_pagamento("Contanti", i, False, 0, True, 0)
	If Sub026("3011", 1) = 0 And Sub026("3013", 1) <> 0 Then
		Return
	End If
End Sub

Sub rt_annulladocumento(str As String, str2 As String, str3 As String, str4 As String, str5 As String) As String
	Dim vTmp As Int
	If vBln2 Then
		Return ""
	End If
	vBln14 = True
	If str5 <> "" And str5.Length = 8 Then
		vTmp = Sub026("7101A" & SmartStringFormatter("", str) & "" & SmartStringFormatter("", str2) & "" & SmartStringFormatter("", str3) & "0" & SmartStringFormatter("", str4) & "08" & SmartStringFormatter("", str5) & "", 1)
	Else
		vTmp = Sub026("7101A" & SmartStringFormatter("", str) & "" & SmartStringFormatter("", str2) & "" & SmartStringFormatter("", str3) & "0" & SmartStringFormatter("", str4) & "", 1)
	End If
	vBln14 = False
	If vTmp <> 0 Then
		Sub026("71010", 1)
		Return "Il documento non può essere annullato"
	End If
	If str4 <> "" Then
		Return ""
	End If
	Dim read_ As String = read()
	If read_ = "1" Then
		vBln14 = True
		Dim vObjectToCharSequence As Object = "Attendere ... Ricerca nella memoria di dettaglio in corso ..."
		ProgressDialogShow2(vObjectToCharSequence, True)
		DoEvents
		DoEvents
		Dim vTmp_ As Int = Sub026("7101A" & SmartStringFormatter("", str) & "" & SmartStringFormatter("", str2) & "" & SmartStringFormatter("", str3) & "1" & SmartStringFormatter("", str4) & "", 1)
		ProgressDialogHide
		vBln14 = False
		If vTmp_ <> 0 Then
			Sub026("71010", 1)
			Return "Il documento non può essere annullato"
		End If
		Return read_
	End If
	If read_ = "2" Then
		Sub026("71010", 1)
		Return "Documento non trovato o già annullato"
	End If
	Return read_
End Sub

Sub rt_annulladocumento2(str As String, str2 As String) As String
	If vBln2 Then
		Return ""
	End If
	Dim vTmp As String = Sub011(str2)
	vBln14 = True
	Dim length As Double = vTmp.Length
	Dim vTmp_ As Int = Sub026("7114A" & SmartStringFormatter("", NumberFormat2(length, 2, 0, 0, False)) & "" & SmartStringFormatter("", vTmp) & "" & SmartStringFormatter("", str) & "", 1)
	vBln14 = False
	If vTmp_ <> 0 Then
		Sub026("71010", 1)
		Return "Il documento non può essere annullato"
	End If
	Return ""
End Sub

Sub rt_attivadisattivalotteria(z As Boolean) As Int
	If vBln2 Then
		Return 0
	End If
	Dim str As String = "1"
	If z Then
		str = "0"
	End If
	Return Sub026("6607" & SmartStringFormatter("", str) & "000000", 1)
End Sub

Sub rt_checkzpending As String
	Dim str As String
	Dim str2 As String
	If vBln2 Then
		Return ""
	End If
	Dim vTmp As String = Sub012()
	Dim substring As String = vTmp.SubString2(1, 5)
	Dim substring2 As String = vTmp.SubString2(5, 9)
	If substring <> "0000" Or substring2 <> "0000" Then
		If substring = "0000" Then
			str = ""
		Else
			str = modfunstr.Sub006(substring) & " chiusure scartate dal server AE"
		End If
		Dim sb2 As String = str
		If substring2 = "0000" Then
			str2 = ""
		Else
			str2 = IIf(sb2 <> "", " e ", "") & modfunstr.Sub006(substring2) & " chiusure non inviate al server AE"
		End If
		Dim sb3 As String = "Esistono " & sb2 & str2 & CRLF & "Si desidera tentare l'invio ?"
		Dim vTmp_ As Double = modfunstr.Sub006(substring)
		If modfunstr.Sub006(substring2) + vTmp_ = 1 Then
			Return sb3.Replace("Esistono", "Esiste").Replace("chiusure scartate", "chiusura scartata").Replace("chiusure non inviate", "chiusura non inviata")
		End If
		Return sb3
	End If
	Return ""
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ccefdll.java, metodo _rt_countfileinfolder (riga 2503).
Sub rt_countfileinfolder(str As String) As Int
	Dim e As Exception
	Dim z As Boolean
	Dim z2 As Boolean = False
	z2 = False
	z2 = False
	z2 = False
	z2 = False
	If vBln2 Then
		Return 0
	End If
	Try
		If str <> "" Then
			vBln14 = True
			If Sub026("7410" & mod1.Sub139(str.Length, 3, "0") & str, 1) > 0 Then
				Sub026("7412", 1)
				vBln14 = False
			Else
				Dim r2 As Object = 0
				Do While True
					Try
						Dim upperCase As String = read().ToUpperCase
						Try
							If Not(upperCase.Contains("R_")) Then
								If Not(upperCase.Contains("TEC")) Then
									If Not(upperCase.Contains("SIM")) And upperCase.Contains("_Z") And upperCase.EndsWith(".XML") Then
										z = r2 + 1
										If Sub026("7411", 1) <= 0 Then
											Exit
										End If
										r2 = z
									End If
								End If
							End If
							If Sub026("7411", 1) <= 0 Then
							End If
						Catch
							e = e2
							mod1.Sub217(LastException.Message)
							Sub026("7412", 1)
							vBln14 = z2
							Return z
						End Try
						z = r2
					Catch
						z = r2
						e = e3
					End Try
				Loop
				Sub026("7412", 1)
				vBln14 = False
				z2 = z
			End If
		Else
			vBln14 = False
		End If
		Return IIf(z2, 1, 0)
	Catch
		e = e4
		z = IIf(z2, 1, 0)
	End Try
End Sub

Sub rt_disattivaarrotondamento
	If vInt7 >= 7 And Not(vBln2) And Sub026("60000053", 1) <= 0 Then
		Try
			If read() = "00530011" Then
				Sub026("600000530010", 1)
			End If
		Catch
			mod1.Sub217(LastException.Message)
		End Try
		Return
	End If
End Sub

Sub rt_leggidocsospesilotteria As Int
	If vBln2 Then
		Return ""
	End If
	If Sub026("1518", 1) <> 0 Then
		Return -1
	End If
	Dim read_ As String = read()
	If Not(IsNumber(read_)) Then
		Return -1
	End If
	Return read_
End Sub

Sub rt_leggistato(z As Boolean) As Int
	Dim e As Exception
	Dim i As Int
	If vBln2 Then
		Return 0
	End If
	Try
		vBln15 = False
		If z And (vInt4 = 1 Or vInt4 = 2) Then
			vBln1 = Sub003()
		End If
		vBln14 = True
		i = Sub026("15111", 36)
		Try
			vBln14 = False
			If i = 0 Then
				Dim read_ As String = read()
				If read_.Length >= 33 Then
					vStr4 = read_.SubString2(1, 12)
					If read_.SubString2(22, 26) = "1110" And read_.SubString2(34, 35) = "0" Then
						vLng1 = DateTime.DateTimeParse(read_.SubString2(28, 30) & "/" & read_.SubString2(26, 28) & "/20" & read_.SubString2(30, 32), "00:00:00")
						Sub025(False)
					Else If read_.SubString2(22, 26) = "1110" And read_.SubString2(34, 35) = "1" Then
						read_ = Sub002()
						vLng1 = 0
						vBln5 = False
					End If
					If read_.Length >= 33 Then
						vBln15 = (read_.SubString2(22, 26) = "1111")
					End If
					vtattivazionert1.generateChiavi = (read_.SubString2(22, 23) = "1")
					vtattivazionert1.Censita = (read_.SubString2(23, 24) = "1")
					vtattivazionert1.Attivazione = (read_.SubString2(24, 25) = "1")
					vtattivazionert1.InService = (read_.SubString2(25, 26) = "1")
					vtattivazionert1.InServiceDa = vLng1
					rt_verificaversionexml()
					rt_disattivaarrotondamento()
				End If
				If read_.Length >= 53 And read_.SubString2(52, 53) = "1" Then
					vBln13 = True
				End If
			End If
		Catch
			e = e2
			mod1.Sub217(LastException.Message)
			vBln14 = False
			Return i
		End Try
	Catch
		e = e3
		i = 0
	End Try
	vBln14 = False
	Return i
End Sub

Sub rt_mf2xml(str As String, i As Int) As Boolean
	Dim parseDouble As Int
	Dim i2 As Int = 1
	i2 = 1
	Dim z As Boolean = False
	If vBln2 Then
	Else
		Try
			If str <> "" Then
				vBln14 = True
				If Sub026("7410" & mod1.Sub139(str.Length, 3, "0") & str, 1) > 0 Then
					Sub026("7412", 1)
					vBln14 = False
					i2 = 
				Else
					Do While True
						Dim upperCase As String = read().ToUpperCase
						If Not(upperCase.Contains("R_")) Then
							If Not(upperCase.Contains("TEC")) Then
								If Not(upperCase.Contains("SIM")) And upperCase.Contains("_Z") And upperCase.EndsWith(".XML") And parseDouble = upperCase.SubString2(17, 21) = i Then
									Sub007(str & "\" & upperCase.SubString(3), parseDouble)
									Sub026("7412", 1)
									vBln14 = False
									z = True
									Exit
								End If
							End If
						End If
						If Sub026("7411", 1) > 0 Then
							Sub026("7412", 1)
							vBln14 = False
							i2 = 
							Exit
						End If
					Loop
				End If
			Else
				i2 = 
			End If
		Catch
			mod1.Sub217(LastException.Message)
			Sub026("7412", i2)
			vBln14 = z
		End Try
	End If
	Return z
End Sub

Sub rt_sendzpending As String
	If vBln2 Then
		Return ""
	End If
	Try
		Dim vObjectToCharSequence As Object = "Verifica collegamento con il server AE in corso ..."
		ProgressDialogShow2(vObjectToCharSequence, False)
		DoEvents
		DoEvents
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Sub026("1516", 1) > 0 Then
		Return ""
	End If
	If read().SubString2(0, 1) <> "0" Then
		Return "Il server AE non è raggiungibile"
	End If
	If Sub026("6403", 1) > 0 Then
		Return ""
	End If
	Dim vObjectToCharSequence2 As Object = "Tentativo di invio dati al server in corso"
	ProgressDialogShow2(vObjectToCharSequence2, False)
	Dim i As Int
	For i = 0 To 10
		DoEvents
		DoEvents
		Dim vTmp As String = Sub012()
		Dim substring As String = vTmp.SubString2(1, 5)
		Dim substring2 As String = vTmp.SubString2(5, 9)
		If substring = "0000" And substring2 = "0000" Then
			ProgressDialogHide
			CallSub2(mod1.vStr1, "MsgboxOnly", "I dati sono stati inviati al server AE")
			Return ""
		End If
		mod1.Sub178(1000)
	Next
	ProgressDialogHide
	Return ""
End Sub

Sub rt_setinmagazzino As Boolean
	Dim z As Boolean
	vBln14 = True
	Try
		Dim vObjectToCharSequence As Object = "Sospensione temporanea sul server AE in corso ..."
		ProgressDialogShow2(vObjectToCharSequence, False)
		DoEvents
		DoEvents
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Main.vccefdll1.Sub026("640210060809MAGAZZINO", 1) = 0 Then
		z = Sub001(True)
		vBln14 = False
		ProgressDialogHide
		Return z
	End If
	z = False
	vBln14 = False
	ProgressDialogHide
	Return z
End Sub

Sub rt_verificamagazzino As Int
	If Not(vBln2) Then
		If Not(Main.v_matricola.StartsWith("ST")) Then
			vBln14 = True
			Dim vTmp As Int = Sub026("1510", 1)
			Try
				vBln14 = False
				If vTmp <= 0 Then
					Dim read_ As String = read()
					If read_.SubString2(24, 27) = "200" And read_.SubString2(1, 20).Trim = "FUORI_SERVIZIO" Then
						vTmp = -1
					End If
					vBln8 = (vTmp = -1)
					Return vTmp
				End If
				Return vTmp
			Catch
				mod1.Sub217(LastException.Message)
				Return vTmp
			End Try
		End If
	End If
	Return 0
End Sub

Sub rt_verificaversionexml As Int
	If vBln2 Then
		Return 0
	End If
	Dim vTmp As Int = Sub026("1512", 1)
	If vTmp <= 0 Then
		Try
			Dim read_ As String = read()
			If read_.Length > 2 Then
				Return vTmp
			End If
			If IsNumber(read_) Then
				vInt7 = read_ + 6
				Return vTmp
			End If
			Return vTmp
		Catch
			mod1.Sub217(LastException.Message)
			Return vTmp
		End Try
	End If
	Return vTmp
End Sub

Sub Sck_Connected(z As Boolean)
End Sub

Sub Sub022(str As String, i As Int) As String
	Return Sub023(str, i, True)
End Sub

Sub Sub023(str As String, i As Int, z As Boolean) As String
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	If str.Length > 0 Then
		Dim length As Int = str.Length
		Dim i2 As Int
		For i2 = 1 To length
			Dim charAt As Char = str.CharAt(i2 - 1)
			If Asc(charAt) >= 33 Then
				If Asc(charAt) <= 90 Then
					stringBuilderWrapper.Append(charAt)
				End If
			End If
			If Asc(charAt) >= 97 Then
				If Asc(charAt) <= 122 Then
					stringBuilderWrapper.Append(charAt)
				End If
			End If
			Select charAt
				Case "è", "é"
					charAt = "e"
				Case "à"
					charAt = "a"
				Case "ì"
					charAt = "i"
				Case "ò"
					charAt = "o"
				Case "ù"
					charAt = "u"
				Case "À", "Á"
					charAt = "A"
				Case "È", "É"
					charAt = "E"
				Case "Ì", "Í"
					charAt = "I"
				Case "Ò", "Ó"
					charAt = "O"
				Case "Ù", "Ú"
					charAt = "U"
				Case "€"
					charAt = "E"
				Case "´", "`"
					charAt = "'"
				Case "_"
					charAt = "_"
				Case Else
					charAt = " "
			End Select
			stringBuilderWrapper.Append(charAt)
		Next
		If z Then
			Do While stringBuilderWrapper.ToString.ToUpperCase.Contains("TOTALE")
				Dim indexOf As Int = stringBuilderWrapper.ToString.ToUpperCase.IndexOf("TOTALE") + 5
				stringBuilderWrapper.Remove(indexOf, indexOf + 1)
				stringBuilderWrapper.Insert(indexOf, ".")
			Loop
		End If
	End If
	Dim vToString As String = stringBuilderWrapper.ToString
	If vToString.Length > i Then
		Return vToString.SubString2(0, i)
	End If
	Return vToString
End Sub

Sub sf_apri(str As String, str2 As String, str3 As String) As Int
	If vBln2 Then
		Return 0
	End If
	If vBln15 Then
		vBln16 = False
		vLst3.Initialize
		vLst4.Initialize
		vLst5.Initialize
		vLst2.Initialize
		vBln20 = True
		vBln19 = False
	End If
	vInt1 = 0
	Dim vTmp As Int = Sub026("30161", 1)
	If vTmp = 0 Then
		Dim vTmp_ As Int = Sub026("3002101 ", 1)
		If vBln13 And str3 <> "" And str3.Trim.Length = 8 Then
			Dim vTmp__ As Int = Sub026("301908" & str3.Trim, 1)
			If vTmp__ = 0 Then
				If Main.v_matricola.StartsWith("ST") And vInt8 >= 0 Then
					vInt8 = vInt8 + 1
					Return vTmp__
				End If
				Return vTmp__
			End If
			Return vTmp__
		End If
		If str <> "" Then
			If vBln11 Then
				Dim length As Double = str.Length
				Dim vTmp___ As Int = Sub026("3010F" & NumberFormat2(length, 2, 0, 0, False) & Sub022(str.ToUpperCase, 16), 1)
				If vTmp___ <> 0 Then
				End If
				Return vTmp___
			End If
			If Not(vBln12) Then
				Dim length2 As Double = str.Length
				Dim vTmp____ As Int = Sub026("3010B" & NumberFormat2(length2, 2, 0, 0, False) & Sub022(str.ToUpperCase, 16), 1)
				If vTmp____ <> 0 Then
				End If
				Return vTmp____
			End If
			Dim vTmp_____ As Int = Sub026("3002122 *********************", 1)
			If vTmp_____ = 0 Then
				Dim vTmp______ As Int = Sub026("3002122   COD.FIS. / P.IVA   ", 1)
				If vTmp______ = 0 Then
					Dim length3 As Double = str.Length + 3
					Dim vTmp_______ As Int = Sub026("30021" & NumberFormat2(length3, 2, 0, 0, False) & "   " & Sub022(str.ToUpperCase, 16), 1)
					If vTmp_______ = 0 Then
						Dim vTmp________ As Int = Sub026("3002122 *********************", 1)
						If vTmp________ <> 0 Then
						End If
						Return vTmp________
					End If
					Return vTmp_______
				End If
				Return vTmp______
			End If
			Return vTmp_____
		End If
		Return vTmp_
	End If
	Return vTmp
End Sub

Sub sf_barcode(str As String, i As Int) As Int
	If vBln2 Then
		Return 0
	End If
	Dim vTmp As String = Sub022(str, 40)
	If i < 1 Or i > 5 Then
		i = 4
	End If
	If vTmp = "" Then
		Return 0
	End If
	Dim length As Double = vTmp.Length
	Return Sub026("3021" & i & "25 " & NumberFormat2(length, 2, 0, 0, False) & vTmp, 1)
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ccefdll.java, metodo _sf_chiudi (riga 3118).
Sub sf_chiudi(z As Boolean)
	Dim str As String
	Dim str2 As String
	Dim str3 As String
	Dim str4 As String
	Dim substring As String
	Dim str5 As String
	Dim vTmp As Int
	Dim str6 As String
	If vBln2 Then
		Return
	End If
	Dim i As Int = 0
	vBln20 = False
	vBln18 = False
	If vBln19 And vLst4.IsInitialized Then
		Dim size As Int = vLst4.Size - 1
		Dim i2 As Int
		For i2 = 0 To size
			Sub026(vLst4.Get(i2), 1)
		Next
		Sub024()
	End If
	If Not(vBln19) Then
	End If
	If Not(vBln4) Then
		i = Sub026("3011", 1)
	End If
	If i <> 0 Then
		Return
	End If
	If vInt1 <> 0 Then
		Dim sb As String = "ARROTOND. DL 50/2017  " & NumberFormat2(vInt1 / 100, 1, 2, 2, False)
		Sub026("30121" & sb.Length & sb, 1)
		vInt1 = 0
	End If
	If Sub026("3013", 1) <> 0 Then
		Return
	End If
	vBln4 = False
	If vBln15 Then
		vtlastscontrino1.Initialize
		If vBln19 Then
			Dim mf_leggidataora_ As String = mf_leggidataora()
			If mf_leggidataora_.Length = 10 Then
				vtlastscontrino1.DataeOraMF = mf_leggidataora_.SubString2(2, 4) & "/" & mf_leggidataora_.SubString2(0, 2) & "/20" & mf_leggidataora_.SubString2(4, 6) & " " & mf_leggidataora_.SubString2(6, 8) & ":" & mf_leggidataora_.SubString2(8, 10)
				vtlastscontrino1.nScontrino = mf_leggilastscontr()
				vtlastscontrino1.nChiusura = mf_leggilastz()
			End If
		End If
		If z And vLst3.IsInitialized And vLst3.Size > 0 Then
			Dim list As List = vLst3
			list.SortType("tScontrino", True)
			Dim list2 As List
			list2.Initialize
			Dim str7 As String = ""
			Dim size2 As Int = vLst3.Size - 1
			Dim i3 As Int = 0
			Do While i3 <= size2
				Dim tresortVar As tresort = vLst3.Get(i3)
				If i3 <= 0 Or tresortVar.tScontrino <> str7 Then
					str6 = tresortVar.tScontrino
					list2.Add(str6)
				Else
					str6 = str7
				End If
				i3 = i3 + 1
				str7 = str6
			Loop
			Dim size3 As Int = list2.Size - 1
			Dim i4 As Int
			For i4 = 0 To size3
				Dim vObjectToString As String = list2.Get(i4)
				Dim contains As Boolean = vObjectToString.Contains("Doc.N._")
				If vObjectToString.Contains("Doc.N.") Then
					Dim str8 As String = ""
					If contains Then
						Dim replace As String = vObjectToString.SubString(vObjectToString.IndexOf("Doc.N._")).Replace("Doc.N._", "")
						str = Sub011(replace.SubString2(0, replace.IndexOf(" del ")))
						str2 = ""
						str3 = ""
						str4 = replace.SubString(replace.IndexOf(" del ")).Replace(" del ", "")
					Else
						Dim replace2 As String = vObjectToString.SubString(vObjectToString.IndexOf("Doc.N.")).Replace("Doc.N.", "")
						Dim vTmp_ As String = modfunstr.Sub003("0000" & replace2.SubString2(0, replace2.IndexOf("-")), 4)
						Dim replace3 As String = replace2.SubString(replace2.IndexOf("-")).Replace("-", "")
						Dim vTmp__ As String = modfunstr.Sub003("0000" & replace3.SubString2(0, replace3.IndexOf(" del ")), 4)
						Dim replace4 As String = replace3.SubString(replace3.IndexOf(" del ")).Replace(" del ", "")
						If replace4.Contains("Matricola") And replace4.Contains("Lotteria") Then
							str8 = replace4.SubString(replace4.IndexOf(" Lotteria ")).Replace(" Lotteria ", "")
							str = replace4.SubString2(replace4.IndexOf(" Matricola "), replace4.IndexOf(" Lotteria ")).Replace(" Matricola ", "")
							str2 = vTmp__
							str3 = vTmp_
							str4 = replace4.SubString2(0, replace4.IndexOf(" Matricola "))
						Else If Not(replace4.Contains("Matricola")) Then
							str = ""
							str2 = vTmp__
							str3 = vTmp_
							str4 = replace4
						Else
							str = replace4.SubString(replace4.IndexOf(" Matricola ")).Replace(" Matricola ", "")
							str2 = vTmp__
							str3 = vTmp_
							str4 = replace4.SubString2(0, replace4.IndexOf(" Matricola "))
						End If
					End If
					If str4 = "" Then
						substring = "00000000"
					Else
						substring = str4.Replace("/", "").SubString2(0, 8)
					End If
					Dim str9 As String = substring.SubString2(0, 4) & substring.SubString(6)
					vBln14 = True
					Dim vObjectToCharSequence As Object = "Attendere ... Ricerca nella memoria di dettaglio in corso ..."
					ProgressDialogShow2(vObjectToCharSequence, True)
					DoEvents
					DoEvents
					If contains Then
						Dim length As Double = str.Length
						vTmp = Sub026("7114R" & SmartStringFormatter("", NumberFormat2(length, 2, 0, 0, False)) & "" & SmartStringFormatter("", str) & "" & SmartStringFormatter("", str9) & "", 1)
					Else
						If str = "" Then
							str5 = ""
						Else
							Dim str10 As String = str.Length & str
							If str8 <> "" And str8.Length = 8 Then
								str5 = SmartStringFormatter("", str10) & "08" & SmartStringFormatter("", str8) & ""
							Else
								str5 = SmartStringFormatter("", str10) & ""
							End If
						End If
						vTmp = Sub026("7101R" & SmartStringFormatter("", str3) & "" & SmartStringFormatter("", str2) & "" & SmartStringFormatter("", str9) & "1" & SmartStringFormatter("", str5) & "", 1)
					End If
					ProgressDialogHide
					vBln14 = False
					If vTmp > 0 Then
						CallSub2(mod1.vStr1, "MsgboxOnly", "Reso non consentito su questo documento (Errore " & vTmp & ")")
						Sub026("71010", 1)
						Return
					End If
					If read() = 2 Then
						CallSub2(mod1.vStr1, "MsgboxOnly", "Reso non consentito su questo documento")
						Sub026("71010", 1)
						Return
					End If
					Dim size4 As Int = vLst3.Size - 1
					Dim i5 As Int
					For i5 = 0 To size4
						Dim tresortVar2 As tresort = vLst3.Get(i5)
						If tresortVar2.tScontrino = list2.Get(i4) Then
							Dim vAbs As Double = Abs(tresortVar2.tQta1000)
							Dim length2 As Double = tresortVar2.tDescrizione.Length
							If Sub026("33011" & SmartStringFormatter("", NumberFormat2(vAbs, 9, 0, 0, False)) & "001" & SmartStringFormatter("", NumberFormat2(length2, 2, 0, 0, False)) & "" & SmartStringFormatter("", tresortVar2.tDescrizione) & "" & SmartStringFormatter("", NumberFormat2(tresortVar2.tPrezzoUnitarioLordo100, 9, 0, 0, False)) & "" & SmartStringFormatter("", NumberFormat2(tresortVar2.tIvaRT, 2, 0, 0, False)) & "", 1) <> 0 Then
								Return
							End If
						End If
					Next
				End If
				If vLst4.IsInitialized Then
					Dim size5 As Int = vLst4.Size - 1
					Dim i6 As Int = 0
					Do While True
						If i6 > size5 Then
							Exit
						End If
						Dim vObjectToString2 As String = vLst4.Get(i6)
						If Not(vObjectToString2.StartsWith("3010")) Then
							i6 = i6 + 1
						Else
							Sub026(vObjectToString2, 1)
							Exit
						End If
					Loop
				End If
				If Sub026("3011", 1) <> 0 Then
					vLst3.Initialize
					Return
				End If
				Dim vObjectToCharSequence2 As Object = "Attendere ... aggiornamento memoria di dettaglio in corso ..."
				ProgressDialogShow2(vObjectToCharSequence2, False)
				DoEvents
				DoEvents
				Dim vTmp___ As Int = Sub026("3013", 1)
				ProgressDialogHide
				If vTmp___ <> 0 Then
					vLst3.Initialize
					Return
				End If
			Next
			vBln16 = vBln19
		End If
		vLst4.Initialize
		vLst5.Initialize
		vLst3.Initialize
		vLst2.Initialize
	End If
	If vBln14 Then
		vBln14 = False
	End If
	vBln19 = False
End Sub

Sub sf_cortesia(str As String, i As Int)
	If vBln2 Then
		Return
	End If
	Sub024()
	Dim str2 As String = ""
	Dim str3 As String = " "
	If str.ToLowerCase.StartsWith("logo") And str.Length <= 6 Then
		If IsNumber(str.SubString(4)) Then
			str2 = Sub010(str.SubString(4))
		End If
	End If
	If str2 = "" Then
		Dim i2 As Int = 32
		If i = 5 Then
			i2 = 16
		End If
		If i = 3 Then
			i2 = 42
		End If
		Dim sb2 As String = modfunstr.Sub004((i2 - '### r3.length()) / 2) & Sub022(str, i2).Trim
		str3 = modfunstr.left(sb2 & modfunstr.Sub004(i2), i2)
		If i < 1 Or i > 6 Then
			i = 6
		End If
	End If
	If str = "" Then
		Return
	End If
	If Not(vBln4) Then
		Sub026("3011", 1)
	End If
	If str2 <> "" Then
		Sub026("3017" & str2, 1)
	Else
		Sub026("3012" & i & str3.Length & str3, 1)
	End If
	vBln4 = True
End Sub

Sub sf_pagamento(str As String, i As Int, z As Boolean, i2 As Int, z2 As Boolean, i3 As Int)
	Dim str2 As String
	Dim str3 As String
	If vBln2 Then
		Return
	End If
	Dim vTmp As String = Sub022(str, 22)
	If vBln15 And z2 And vLst5.IsInitialized And vLst5.Size > 0 Then
		Dim d As Double = 0
		Dim z3 As Boolean = vLst5.Size > 1
		If z3 Then
			Try
				Dim size As Int = vLst5.Size - 1
				Dim i4 As Int = 0
				Dim str4 As String = ""
				Dim i5 As Int
				For i5 = 0 To size
					Dim vObjectToString As String = vLst5.Get(i5)
					If z3 Then
						Dim left As String = modfunstr.left(modfunstr.Sub003(vObjectToString, 11), 9)
						If IsNumber(left) Then
							d = d + left
							str4 = vObjectToString.SubString2(19, vObjectToString.SubString2(17, 19) + 19)
							i4 = i4 + 1
						End If
					End If
				Next
				If d > 0 And i4 > 1 Then
					sf_testo(str4 & " Euro " & NumberFormat2(d / 100, 1, 2, 2, False) & " suddiviso in:", 1)
				End If
			Catch
				Dim message As String = LastException.Message
				Sub013(message, True)
			End Try
		End If
		Sub026("3003", 1)
		Dim size2 As Int = vLst5.Size - 1
		Dim i6 As Int
		i6 = 0
		Do While i6 <= size2 And Sub026(vLst5.Get(i6), 1) <= 0
			Sub026("3003", 1)
			i6 = i6 + 1
		Loop
	End If
	If vBln15 Or z Then
		Sub026("3003", 1)
	End If
	If vBln15 Then
		Main.vCur8.Position = i2
		Dim z4 As Boolean = Main.vCur8.GetInt("RTPagamento") = 5 And vInt7 >= 7
		If vInt7 < 7 Then
			If z And z2 Then
				i = 0
			End If
			If vLst3.IsInitialized And vLst3.Size > 0 Then
				i = 0
			End If
		End If
		Dim left2 As String = modfunstr.left(Main.vCur8.GetString("descrizione"), 22)
		Dim length As Double = left2.Length
		Dim vNumberFormat2 As String = NumberFormat2(length, 2, 0, 0, False)
		Dim z5 As Boolean = vLst2.IsInitialized And vTmp = "Arrot." And vInt7 >= 7
		If z5 Then
			vInt1 = i * 1
		End If
		If z5 And i2 = 0 Then
			Dim list As List = vLst2
			list.Add("302700000000" & SmartStringFormatter("", i) & "")
			vInt1 = i
		Else If vLst2.IsInitialized Then
			If Not(z4) Then
				str3 = "00"
			Else
				str3 = NumberFormat2(i3, 2, 0, 0, False)
			End If
			Dim vGetInt As Int = Main.vCur8.GetInt("RTPagamento")
			If vInt7 >= 7 And vGetInt >= 10 Then
				vGetInt = vGetInt + 39
			End If
			Dim list2 As List = vLst2
			list2.Add("3007" & SmartStringFormatter("", NumberFormat2(vGetInt, 2, 0, 0, False)) & "" & SmartStringFormatter("", str3) & "" & SmartStringFormatter("", vNumberFormat2) & "" & SmartStringFormatter("", left2) & "" & SmartStringFormatter("", NumberFormat2(i, 9, 0, 0, False)) & "")
		End If
	Else
		If z And z2 Then
			i = 0
		End If
		If z Then
			str2 = "3005"
		Else
			str2 = "3004"
		End If
		Dim length2 As Double = vTmp.Length
		Sub026(str2 & NumberFormat2(length2, 2, 0, 0, False) & vTmp & NumberFormat2(i, 9, 0, 0, False), 11)
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ccefdll.java, metodo _sf_sconto (riga 3587).
Sub sf_sconto(i As Int, d As Double, i2 As Int, i3 As Int)
	Dim str As String
	Dim str2 As String
	Dim obj As Object
	Dim d2 As Double
	Dim obj2 As Object
	Dim str3 As String
	Dim vTmp As Int
	If vBln2 Then
		Return
	End If
	If d >= 0 Then
		str = "30013"
		str2 = "SCONTO "
		obj = "33013"
		d2 = d
	Else
		str = "30012"
		str2 = "SERVIZIO "
		obj = "33012"
		d2 = Abs(d)
	End If
	If i3 = Main.sc_omaggio Then
		str2 = "OMAGGIO "
		obj2 = "3301G"
	Else
		If i3 = Main.sc_giapagato Then
			str2 = "GIA' RISCOSSO "
			obj2 = "3301F"
		Else
			obj2 = obj
		End If
	End If
	Dim vAbs As Int = Abs(i)
	If d2 > 0 Then
		If i3 = Main.sc_sconto Then
			If 1000 * d2 Mod 1000 = 0 Then
				str3 = str2 & NumberFormat2(d2, 1, 0, 0, False) & " Perc."
			Else
				str3 = str2 & NumberFormat2(d2, 1, 2, 2, False) & " Perc."
			End If
			If vBln15 Then
				Dim length As Double = str3.Length
				vTmp = Sub026(str & NumberFormat2(length, 2, 0, 0, False) & str3 & NumberFormat2(vAbs, 9, 0, 0, False), 1)
			Else
				Main.vCur4.Position = i2
				Dim vTmp_ As String = modfunstr.Sub003("00" & Main.vCur4.GetString("RTIva"), 2)
				Dim length2 As Double = str3.Length
				Sub026(SmartStringFormatter("", obj2) & "" & SmartStringFormatter("", NumberFormat2(1, 9, 0, 0, False)) & "001" & SmartStringFormatter("", NumberFormat2(length2, 2, 0, 0, False)) & "" & SmartStringFormatter("", str3) & "" & SmartStringFormatter("", NumberFormat2(vAbs, 9, 0, 0, False)) & "" & SmartStringFormatter("", vTmp_) & "", 1)
				vTmp = Sub026("3003", 1)
			End If
			If vTmp = 0 Then
				Return
			End If
			Return
		End If
	End If
	str3 = str2
	If vBln15 Then
	End If
	If vTmp = 0 Then
	End If
End Sub

Sub sf_testo(str As String, i As Int)
	Dim vTmp As String
	If vBln2 Then
		Return
	End If
	If i < 1 Or i > 9 Then
		i = 1
	End If
	If i < 7 And i <> 3 Then
		vTmp = Sub022(str, 32)
	Else
		vTmp = Sub022(str, 42)
	End If
	Dim str2 As String = IIf(vTmp = "", " ", vTmp)
	Dim length As Double = str2.Length
	Sub026("3002" & i & NumberFormat2(length, 2, 0, 0, False) & str2, 1)
End Sub

Sub sf_testoaggiuntivopagamenti(str As String, i As Int)
	Dim vTmp As String
	If vBln2 Then
		Return
	End If
	If i < 1 Or i > 9 Then
		i = 1
	End If
	If i < 7 And i <> 3 Then
		vTmp = Sub022(str, 32)
	Else
		vTmp = Sub022(str, 42)
	End If
	Dim str2 As String = IIf(vTmp = "", " ", vTmp)
	If Not(vBln15) Then
		Dim length As Double = str2.Length
		Sub026("3008" & i & NumberFormat2(length, 2, 0, 0, False) & str2, 1)
	Else
		Dim length2 As Double = str2.Length
		Sub026("3010" & i & NumberFormat2(length2, 2, 0, 0, False) & str2, 1)
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ccefdll.java, metodo _sf_vendita (riga 3751).
Sub sf_vendita(str As String, i As Int, i2 As Int, i3 As Int, i4 As Int, i5 As Int, z As Boolean, d As Double, i6 As Int, str2 As String, i7 As Int)
	Dim i8 As Int
	Dim sb As String
	Dim vTmp As Int
	Dim sb2 As String
	Dim vTmp_ As Int
	If vBln2 Then
		Return
	End If
	If Main.v_articolizero > 1 And i4 = 0 And i5 = 0 Then
		Return
	End If
	Dim vTmp__ As String = Sub022(str, 22)
	If i = 0 Or i > 100 Then
	End If
	If Not(vBln15) Then
		If i3 >= 0 Then
			If i4 < 0 Then
				Dim length As Double = vTmp__.Length
				vTmp_ = Sub026("30013" & NumberFormat2(length, 2, 0, 0, False) & vTmp__ & NumberFormat2(i4 * 1, 9, 0, 0, False), 1)
			Else
				Dim length2 As Double = vTmp__.Length
				vTmp_ = Sub026("3101101" & NumberFormat2(length2, 2, 0, 0, False) & vTmp__ & NumberFormat2(i4, 9, 0, 0, False), 1)
			End If
			If vTmp_ <> 0 Then
				Return
			End If
		Else
			If i4 < 0 Then
				i4 = i4 * -1
			End If
			If Not(z) Then
				If Sub026("3002113** RESO MERCE", 1) <> 0 Then
					Return
				End If
				Dim length3 As Double = vTmp__.Length
				If Sub026("3101901" & NumberFormat2(length3, 2, 0, 0, False) & vTmp__ & NumberFormat2(i4, 9, 0, 0, False), 1) <> 0 Then
					Return
				End If
			Else
				Dim length4 As Double = vTmp__.Length
				If Sub026("30013" & NumberFormat2(length4, 2, 0, 0, False) & vTmp__ & NumberFormat2(i4, 9, 0, 0, False), 1) <> 0 Then
					Return
				End If
			End If
		End If
		If i3 <> 1000 Then
			If Not(z) Then
				If i3 Mod 1000 = 0 Then
					sb2 = NumberFormat2(i3 / 1000, 1, 0, 0, True) & " X " & NumberFormat2(i2 / 100, 1, 2, 2, True)
				Else
					sb2 = NumberFormat2(i3 / 1000, 1, 3, 3, True) & " X " & NumberFormat2(i2 / 100, 1, 2, 2, True)
				End If
				If Sub026("3002122  " & (sb2 & "                    "), 1) <> 0 Then
					Return
				End If
			End If
		End If
		If i5 > 0 Then
			If Sub026("310130106SCONTO" & NumberFormat2(i5, 9, 0, 0, False), 1) <> 0 Then
				Return
			End If
		Else If i5 < 0 Then
			Dim vAbs As Double = Abs(i5)
			If Sub026("310120113MAGGIORAZIONE" & NumberFormat2(vAbs, 9, 0, 0, False), 1) <> 0 Then
				Return
			End If
		End If
	Else
		Main.vCur4.Position = i6
		Dim vTmp___ As String = modfunstr.Sub003("00" & Main.vCur4.GetString("RTIva"), 2)
		If i3 >= 0 Then
			vBln19 = True
			If i4 < 0 Then
				sf_sconto(i4 * 1, d, i6, Main.sc_sconto)
				i8 = i5
				If i8 <= 0 Then
					sf_sconto(i8, d, i6, i7)
				Else If i8 < 0 Then
					Dim vAbs2 As Double = Abs(i8)
					Dim sb5 As String = "MAGGIORAZIONE " & NumberFormat2(vAbs2, 1, 0, 0, False) & " Perc."
					Dim length5 As Double = sb5.Length
					Dim vAbs3 As Double = Abs(i8)
					If Sub026("33012" & SmartStringFormatter("", NumberFormat2(1, 9, 0, 0, False)) & "001" & SmartStringFormatter("", NumberFormat2(length5, 2, 0, 0, False)) & "" & SmartStringFormatter("", sb5) & "" & SmartStringFormatter("", NumberFormat2(vAbs3, 9, 0, 0, False)) & "" & SmartStringFormatter("", vTmp___) & "", 1) <> 0 Then
						Return
					End If
				End If
			Else
				If i3 = 1000 Then
					Dim length6 As Double = vTmp__.Length
					vTmp = Sub026("33011" & SmartStringFormatter("", NumberFormat2(i3, 9, 0, 0, False)) & "001" & SmartStringFormatter("", NumberFormat2(length6, 2, 0, 0, False)) & "" & SmartStringFormatter("", vTmp__) & "" & SmartStringFormatter("", NumberFormat2(i2, 9, 0, 0, False)) & "" & SmartStringFormatter("", vTmp___) & "", 1)
				Else
					If i3 Mod 1000 = 0 Then
						sb = NumberFormat2(i3 / 1000, 1, 0, 0, True) & " X " & NumberFormat2(i2 / 100, 1, 2, 2, True)
					Else
						sb = NumberFormat2(i3 / 1000, 1, 3, 3, True) & " X " & NumberFormat2(i2 / 100, 1, 2, 2, True)
					End If
					If Sub026("3002122  " & (sb & "                    "), 1) <> 0 Then
						Return
					End If
					Dim length7 As Double = vTmp__.Length
					vTmp = Sub026("33011000001000001" & SmartStringFormatter("", NumberFormat2(length7, 2, 0, 0, False)) & "" & SmartStringFormatter("", vTmp__) & "" & SmartStringFormatter("", NumberFormat2(i4, 9, 0, 0, False)) & "" & SmartStringFormatter("", vTmp___) & "", 1)
				End If
				If vTmp <> 0 Then
					Return
				End If
				i8 = i5
				If i8 <= 0 Then
				End If
			End If
		Else
			If i4 < 0 Then
				i4 = i4 * -1
			End If
			If Not(z) Then
				If i5 < 0 Then
					Dim i9 As Int = i4 + i5
					i5 = 0
				End If
				Dim tresortVar As tresort
				tresortVar.tDescrizione = vTmp__
				tresortVar.tPrezzoUnitarioLordo100 = i2
				tresortVar.tQta1000 = i3
				tresortVar.tIvaRT = vTmp___
				tresortVar.tScontrino = str2
				vLst3.Add(tresortVar)
				i8 = i5
				If i8 <= 0 Then
				End If
			Else
				vBln19 = True
				Dim list As List = vLst5
				Dim length8 As Double = vTmp__.Length
				list.Add("33013000001000001" & SmartStringFormatter("", NumberFormat2(length8, 2, 0, 0, False)) & "" & SmartStringFormatter("", vTmp__) & "" & SmartStringFormatter("", NumberFormat2(i4, 9, 0, 0, False)) & "" & SmartStringFormatter("", vTmp___) & "")
				i8 = i5
				If i8 <= 0 Then
				End If
			End If
		End If
	End If
End Sub

Sub Sub024
	If vBln15 Then
		If vLst2.IsInitialized Then
			Dim size As Int = vLst2.Size - 1
			Dim i As Int
			For i = 0 To size
				Sub026(vLst2.Get(i), 11)
			Next
		End If
		vLst2.Initialize
		Return
	End If
End Sub

Sub Sub025(z As Boolean) As Boolean
	Dim vDateTimeParse As Long
	Try
		Dim mf_leggidataora_ As String = mf_leggidataora()
		vDateTimeParse = DateTime.DateTimeParse(mf_leggidataora_.SubString2(2, 4) & "/" & mf_leggidataora_.SubString2(0, 2) & "/20" & mf_leggidataora_.SubString2(4, 6), mf_leggidataora_.SubString2(6, 8) & ":" & mf_leggidataora_.SubString2(8, 10) & ":00")
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If z Then
		Return vDateTimeParse < vLng1
	End If
	Log(DateUtils.periodbetweenindays(vDateTimeParse, vLng1).Minutes)
	Log(DateUtils.periodbetweenindays(vDateTimeParse, vLng1).Hours)
	Log(DateUtils.periodbetweenindays(vDateTimeParse, vLng1).Days)
	vBln5 = (DateUtils.periodbetweenindays(vDateTimeParse, vLng1).Days < 3)
	Return False
End Sub

Sub Sub026(str As String, i As Int) As Int
	Dim i2 As Int
	Dim z As Boolean
	Try
		If vBln20 Then
			vLst4.Add(str)
			Return 0
		End If
		If vInt4 = 1 Then
			Return Sub028(str, IIf(vBln17, -1, i))
		End If
		If vInt4 = 2 Or vBln17 Then
			Return Sub029(str)
		End If
		Dim cArr(1024) As Char
		Dim cArr2(1024) As Char
		Dim z2 As Boolean = True
		Dim i3 As Int = 0
		Do While z2
			Dim connected As Boolean = vSocket1.Connected
			If Not(connected) Then
				Return i3
			End If
			Sub018(str)
			vStr1 = ""
			Dim vRead As Int = vTextReader1.Read(cArr, 0, 1024)
			If vRead > 0 Then
				Dim valueOf As Character = cArr(0)
				Select valueOf
					Case Chr(6)
						If vRead > 1 Then
							vStr1 = CharsToString(cArr, 1, vRead - 1)
							Dim sb As String = str & TAB & "0" & TAB & vStr1
							Sub013(sb, False)
							z = False
							i2 = 0
						Else If Not(vBln3) Then
							z = False
							i2 = 0
						Else
							Dim sb2 As String = str & TAB & "0" & TAB & vStr1
							Sub013(sb2, False)
							z = False
							i2 = 0
						End If
					Case Chr(21)
						Dim vCharsToString As String = CharsToString(cArr, 4, vRead - 4)
						Dim sb3 As String = str & TAB & vCharsToString & TAB
						Sub013(sb3, True)
						i3 = Floor(vCharsToString)
						Select i3
							Case 16, 64
								Dim str2 As String = "11"
								Do While str2 <> "00"
									Dim sb4 As String = "Carta esaurita nella stampante fiscale." & CRLF & CRLF & "Sostituire il rotolo ed attendere la eventuale ristampa."
									Sub014(sb4, "Errore dal " & Main.vStr1 & "")
									Sub018("1009")
									Dim vRead2 As Int = vTextReader1.Read(cArr2, 0, 1024)
									str2 = CharsToString(cArr2, 1, vRead2 - 1)
									Dim sb5 As String = "1009" & TAB & "0" & TAB & str2
									Sub013(sb5, True)
								Loop
								z = False
								i2 = 0
							Case 98
								Dim sb6 As String = "Stampante fiscale impegnata da un uso manuale." & CRLF & CRLF & "Completare o annullare l'operazione tramite la tastiera, poi premere OK."
								Sub014(sb6, "Errore dal " & Main.vStr1 & "")
								If Main.v_errmail Then
									If Main.v_md3 <> "" Then
										Dim sMTPWrapper As SMTP = vSMTP1
										mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper, "Stampante fiscale impegnata da un uso manuale.", False)
										i2 = i3
										z = True
									End If
								End If
								i2 = i3
								z = True
							Case 99
								Sub018("1015")
								Dim vRead3 As Int = vTextReader1.Read(cArr2, 0, 1024)
								Dim vCharsToString2 As String = CharsToString(cArr2, 1, vRead3 - 1)
								Dim substring As String = vCharsToString2.SubString2(3, 6)
								Dim substring2 As String = vCharsToString2.SubString(6)
								Dim sb7 As String = "1015" & TAB & "0" & TAB & vCharsToString2
								Sub013(sb7, True)
								Dim sb8 As String = "ERR" & substring & CRLF & substring2 & CRLF & CRLF & str
								Sub014(sb8, "Errore dal " & Main.vStr1 & "")
								If Main.v_errmail Then
									If Main.v_md3 <> "" Then
										Dim sMTPWrapper2 As SMTP = vSMTP1
										Dim sb9 As String = "ERR" & substring & CRLF & substring2 & CRLF & CRLF & str
										mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper2, sb9, False)
										i2 = i3
										z = False
									End If
								End If
							Case Else
								If Not(vBln14) Then
									Dim vTmp As String = Sub006(i3)
									Dim sb10 As String = "ERR" & vCharsToString & CRLF & vTmp & CRLF & CRLF & str
									Sub014(sb10, "Errore dal " & Main.vStr1 & "")
									If Main.v_errmail Then
										If Main.v_md3 <> "" Then
											Dim sMTPWrapper3 As SMTP = vSMTP1
											Dim sb11 As String = "ERR" & vCharsToString & CRLF & vTmp & CRLF & CRLF & str
											mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper3, sb11, False)
										End If
									End If
								End If
						End Select
					Case Else
						i2 = i3
						z = False
				End Select
				i3 = i2
				z2 = z
			Else
				z2 = False
			End If
		Loop
		Return i3
	Catch
		Dim message As String = LastException.Message
		Sub013(message, True)
		If Main.v_errmail Then
			If Main.v_md3 <> "" Then
				Dim sMTPWrapper4 As SMTP = vSMTP1
				Dim message2 As String = LastException.Message
				mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper4, message2, False)
			End If
		End If
		ProgressDialogShow("Verifica collegamento " & Main.vStr1 & " in corso ...")
		DoEvents
		vBln1 = False
		vSocket1.Close
		Main.vTmr1.Enabled = True
		Return 0
	End Try
End Sub

Sub Sub027 As String
	Try
		Dim cArr(1024) As Char
		Sub018("1009")
		mod1.Sub178(400)
		Dim vRead As Int = vTextReader1.Read(cArr, 0, 1024)
		If vRead > 1 Then
			Return CharsToString(cArr, 1, vRead - 1)
		End If
	Catch
		Dim message As String = LastException.Message
		Sub013(message, True)
		If Main.v_errmail Then
			If Main.v_md3 <> "" Then
				Dim sMTPWrapper As SMTP = vSMTP1
				Dim message2 As String = LastException.Message
				mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper, message2, False)
			End If
		End If
		ProgressDialogShow("Verifica collegamento " & Main.vStr1 & " in corso ...")
		DoEvents
		vBln1 = False
		vSocket1.Close
		Main.vTmr1.Enabled = True
	End Try
	Return ""
End Sub

Sub Sub028(str As String, i As Int) As Int
	Dim i2 As Int
	Dim z As Boolean
	Try
		Dim z2 As Boolean = True
		Dim i3 As Int = 0
		Do While z2
			Sub019(str, i)
			If Main.vStr3 = "" And str <> "2002" Then
				Sub013("Errore collegamento Stampante Fiscale", True)
				If Main.v_errmail Then
					If Main.v_md3 <> "" Then
						Dim sMTPWrapper As SMTP = vSMTP1
						mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper, "Errore collegamento Stampante Fiscale", False)
					End If
				End If
				ProgressDialogShow("Verifica collegamento " & Main.vStr1 & " in corso ...")
				vBln1 = False
				Main.vTmr1.Enabled = True
				Return 0
			End If
			vStr1 = Main.vStr3
			Main.vStr3 = Main.vStr3.Replace(Chr(6), "")
			Dim length As Int = vStr1.Length
			If length > 0 Then
				Dim substring As String = vStr1.SubString2(0, 1)
				Select substring
					Case Chr(6)
						If length > 1 Then
							Dim sb As String = str & TAB & "0" & TAB & vStr1
							Sub013(sb, False)
							z = False
							i2 = 0
						Else If Not(vBln3) Then
							z = False
							i2 = 0
						Else
							Dim sb2 As String = str & TAB & "0" & TAB & vStr1
							Sub013(sb2, False)
							z = False
							i2 = 0
						End If
					Case Chr(21)
						Dim substring2 As String = vStr1.SubString(4)
						Dim sb3 As String = str & TAB & substring2 & TAB
						Sub013(sb3, True)
						i3 = Floor(substring2)
						Select i3
							Case 16, 64
								Dim str3 As String = "11"
								Do While str3 <> "00"
									Dim sb4 As String = "Carta esaurita nella stampante fiscale." & CRLF & CRLF & "Sostituire il rotolo ed attendere la eventuale ristampa."
									Sub014(sb4, "Errore dal " & Main.vStr1 & "")
									Sub019("1009", 3)
									str3 = Main.vStr3.SubString(1)
									Dim sb5 As String = "1009" & TAB & "0" & TAB & str3
									Sub013(sb5, True)
								Loop
								z = False
								i2 = 0
							Case 98
								Dim sb6 As String = "Stampante fiscale impegnata da un uso manuale." & CRLF & CRLF & "Completare o annullare l'operazione tramite la tastiera, poi premere OK."
								Sub014(sb6, "Errore dal " & Main.vStr1 & "")
								If Main.v_errmail Then
									If Main.v_md3 <> "" Then
										Dim sMTPWrapper2 As SMTP = vSMTP1
										mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper2, "Stampante fiscale impegnata da un uso manuale.", False)
										i2 = i3
										z = True
									End If
								End If
								i2 = i3
								z = True
							Case 99
								Sub019("1015", 7)
								Dim substring3 As String = Main.vStr3.SubString(1)
								Dim substring4 As String = substring3.SubString2(3, 6)
								Dim substring5 As String = substring3.SubString(6)
								Dim sb7 As String = "1015" & TAB & "0" & TAB & substring3
								Sub013(sb7, True)
								If vBln15 And vStr1.Contains("ERR214") Then
									Sub014("Obbligatorio eseguire Chiusura Giornaliera", "Errore dal " & Main.vStr1 & "")
									vBln10 = True
								Else
									Dim sb8 As String = "ERR" & substring4 & CRLF & substring5 & CRLF & CRLF & str
									Sub014(sb8, "Errore dal " & Main.vStr1 & "")
								End If
								If Main.v_errmail Then
									If Main.v_md3 <> "" Then
										Dim sMTPWrapper3 As SMTP = vSMTP1
										Dim sb9 As String = "ERR" & substring4 & CRLF & substring5 & CRLF & CRLF & str
										mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper3, sb9, False)
										i2 = i3
										z = False
									End If
								End If
							Case Else
								If Not(vBln14) Then
									Dim vTmp As String = Sub006(i3)
									Dim sb10 As String = "ERR" & substring2 & CRLF & vTmp & CRLF & CRLF & str
									Sub014(sb10, "Errore dal " & Main.vStr1 & "")
									If Main.v_errmail Then
										If Main.v_md3 <> "" Then
											Dim sMTPWrapper4 As SMTP = vSMTP1
											Dim sb11 As String = "ERR" & substring2 & CRLF & vTmp & CRLF & CRLF & str
											mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper4, sb11, False)
										End If
									End If
								End If
						End Select
					Case Else
						i2 = i3
						z = False
				End Select
				i3 = i2
				z2 = z
			Else
				z2 = False
			End If
		Loop
		Return i3
	Catch
		Dim message As String = LastException.Message
		Sub013(message, True)
		If Main.v_errmail Then
			If Main.v_md3 <> "" Then
				Dim sMTPWrapper5 As SMTP = vSMTP1
				Dim message2 As String = LastException.Message
				mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper5, message2, False)
			End If
		End If
		ProgressDialogShow("Verifica collegamento " & Main.vStr1 & " in corso ...")
		DoEvents
		vBln1 = False
		Main.vTmr1.Enabled = True
		Return 0
	End Try
End Sub

Sub Sub029(str As String) As Int
	Dim vTmp As Boolean
	Dim i As Int
	Dim z As Boolean
	Try
		Dim z2 As Boolean = True
		Dim i2 As Int = 0
		Do While z2
			Sub018(str)
			vStr1 = ""
			If str.StartsWith("7410") Or str = "2002" Or str = "4004" Or str.StartsWith("7101") Or str.StartsWith("3013") Or str.StartsWith("1516") Or str.StartsWith("1510") Or str.StartsWith("3011") Or str.StartsWith("6403") Or str.StartsWith("8002") Then
				vTmp = Sub020(65)
			Else
				vTmp = Sub020(2)
			End If
			If Not(vTmp) Then
				If Not(vBln18) And vInt4 = 0 Then
					If Sub015(Main.v_ipcassa) = 0 Then
						z2 = True
					Else
						vBln18 = True
					End If
				End If
			End If
			Dim vObjectToChar As Char = vStr1.SubString2(0, 1)
			If vStr1.Length > 10 And vStr1.SubString2(5, 8) = "ERR" Then
				vObjectToChar = Chr(21)
			End If
			If vTmp Then
				Dim valueOf As Character = vObjectToChar
				Select valueOf
					Case Chr(6)
						If vStr1.Length > 1 Then
							Dim sb As String = str & TAB & "0" & TAB & vStr1
							Sub013(sb, False)
							z = False
							i = 0
						Else If Not(vBln3) Then
							z = False
							i = 0
						Else
							Dim sb2 As String = str & TAB & "0" & TAB & vStr1
							Sub013(sb2, False)
							z = False
							i = 0
						End If
					Case Chr(21)
						Dim substring As String = vStr1.SubString2(8, 10)
						Dim sb3 As String = str & TAB & substring & TAB
						Sub013(sb3, True)
						i2 = Floor(substring)
						Select i2
							Case 16, 64
								Dim str2 As String = "11"
								Do While str2 <> "00"
									Dim sb4 As String = "Carta esaurita nella stampante fiscale." & CRLF & CRLF & "Sostituire il rotolo ed attendere la eventuale ristampa."
									Sub014(sb4, "Errore dal " & Main.vStr1 & "")
									vStr1 = ""
									Sub018("1009")
									Sub020(2)
									If vStr1.Length > 12 Then
										str2 = vStr1.SubString2(9, 11)
									End If
									Dim sb5 As String = "1009" & TAB & "0" & TAB & str2
									Sub013(sb5, True)
								Loop
								z = False
								i = 0
							Case 98
								Dim sb6 As String = "Stampante fiscale impegnata da un uso manuale." & CRLF & CRLF & "Completare o annullare l'operazione tramite la tastiera, poi premere OK."
								Sub014(sb6, "Errore dal " & Main.vStr1 & "")
								If Main.v_errmail Then
									If Main.v_md3 <> "" Then
										Dim sMTPWrapper As SMTP = vSMTP1
										mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper, "Stampante fiscale impegnata da un uso manuale.", False)
										i = i2
										z = True
									End If
								End If
								i = i2
								z = True
							Case 99
								vStr1 = ""
								Sub018("1015")
								Sub020(2)
								If vStr1.Length > 12 Then
									Dim substring2 As String = vStr1.SubString2(12, 15)
									Dim substring3 As String = vStr1.SubString2(15, vStr1.Length - 3)
									Dim sb7 As String = "1015" & TAB & "0" & TAB & vStr1
									Sub013(sb7, True)
									If Not(vBln14) Then
										If vBln15 And vStr1.Contains("ERR214") Then
											Sub014("Obbligatorio eseguire Chiusura Giornaliera", "Errore dal " & Main.vStr1 & "")
											vBln10 = True
										Else
											Dim sb8 As String = "ERR" & substring2 & CRLF & substring3 & CRLF & CRLF & str
											Sub014(sb8, "Errore dal " & Main.vStr1 & "")
										End If
										If Main.v_errmail Then
											If Main.v_md3 <> "" Then
												Dim sMTPWrapper2 As SMTP = vSMTP1
												Dim sb9 As String = "ERR" & substring2 & CRLF & substring3 & CRLF & CRLF & str
												mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper2, sb9, False)
												i = i2
												z = False
											End If
										End If
									End If
								End If
							Case Else
								If Not(vBln14) Then
									Dim vTmp_ As String = Sub006(i2)
									Dim sb10 As String = "ERR" & substring & CRLF & vTmp_ & CRLF & CRLF & str
									Sub014(sb10, "Errore dal " & Main.vStr1 & "")
									If Main.v_errmail Then
										If Main.v_md3 <> "" Then
											Dim sMTPWrapper3 As SMTP = vSMTP1
											Dim sb11 As String = "ERR" & substring & CRLF & vTmp_ & CRLF & CRLF & str
											mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper3, sb11, False)
										End If
									End If
								End If
						End Select
					Case Else
						i = i2
						z = False
				End Select
				i2 = i
				z2 = z
			Else
				z2 = False
			End If
		Loop
		Return i2
	Catch
		Dim sb12 As String = str & TAB & LastException.Message
		Sub013(sb12, True)
		If Main.v_errmail Then
			If Main.v_md3 <> "" Then
				Dim sMTPWrapper4 As SMTP = vSMTP1
				Dim message As String = LastException.Message
				mod1.Sub132("Errore Stampante Fiscale", sMTPWrapper4, message, False)
			End If
		End If
		ProgressDialogShow("Verifica collegamento " & Main.vStr1 & " in corso ...")
		DoEvents
		vBln1 = False
		If vInt4 = 0 Then
			vSocket1.Close
		End If
		Main.vTmr1.Enabled = True
		Return 0
	End Try
End Sub

