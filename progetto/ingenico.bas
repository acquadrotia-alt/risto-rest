B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vByt1 As Byte
	Public vByt2 As Byte
	Public vByt3 As Byte
	Public vByt4 As Byte
	Public vByt5 As Byte
	Public vByt6 As Byte
	Public vStr1 As String
	Public vInt1 As Int
	Public vInt2 As Int
	Public vStr2 As String
	Public vStr3 As String
	Public vBln1 As Boolean
	Public vStr4 As String
	Public vSocket1 As Socket
	Public vTextWriter1 As TextWriter
	Public vTextReader1 As TextReader
	Public vStr5 As String
	Public vInt3 As Int
End Sub

Sub Sub001
	Try
		If vTextWriter1.IsInitialized Then
			vTextWriter1.Close
		End If
		If vTextReader1.IsInitialized Then
			vTextReader1.Close
		End If
		If vSocket1.IsInitialized Then
			vSocket1.Close
		End If
		Sub003("Chiusura della connessione.", False)
		Return
	Catch
		Log(LastException.Message)
		Msgbox(LastException.Message, "Sub Close: Attenzione!")
		Return
	End Try
End Sub

Sub Initialize
	vBln1 = True
End Sub

Sub Sub002(str As String, z As Boolean, i As Int) As Map
	Dim map As Map
	If i = vInt2 Then
		Try
			vStr4 = ""
			map.Initialize
			map.Put("Esito", "11")
			Dim substring As String = str.SubString2(1, str.Length - 2)
			If substring.SubString2(17, 18) = "0" Then
				Select substring.SubString2(21, 23)
					Case "00"
						map.Put("Esito", "00")
						map.Put("DescEsito", "Operazione Eseguita Correttamente")
						If substring.Length > 289 Then
							If Main.v_eftsmstampa Then
								vStr4 = substring.SubString(287)
							End If
						End If
					Case "01"
						map.Put("DescEsito", "Carta esercente non inserita o transazione Online non autorizzata")
					Case "02"
						map.Put("DescEsito", "Pos non operativo")
					Case "03"
						map.Put("DescEsito", "Codice Compagnia non trovato")
					Case "04"
						map.Put("DescEsito", "Profilo non trovato o non valido")
					Case "05"
						map.Put("DescEsito", "Errore nell'importo / congruenza con profilo scaricato da Host")
					Case "06"
						map.Put("DescEsito", "Errore nel calcolo delle commissioni")
					Case "07"
						map.Put("DescEsito", "Operazione annullata")
					Case "08"
						map.Put("DescEsito", "Errore nella transazione OnLine")
					Case Else
						map.Put("DescEsito", "Errore generico")
				End Select
			Else If substring.SubString2(17, 18) = "1" Then
				map.Put("DescEsito", "Identificativo terminale errato / non accettato")
			Else If substring.SubString2(17, 18) = "2" Then
				map.Put("DescEsito", "Applicativo assente")
			Else If substring.SubString2(17, 18) = "3" Then
				map.Put("DescEsito", "Applicativo non abilitato")
			End If
		Catch
			Dim sb2 As String = LastException.Message & " Sub: LeggiEsitoPag"
			Sub003(sb2, True)
			map.Put("Errore", True)
		End Try
	Else
		Try
			map.Initialize
			Dim substring2 As String = str.SubString2(1, str.Length - 2)
			If substring2.SubString2(10, 12) = "00" Then
				map.Put("Esito", substring2.SubString2(10, 12))
				map.Put("IDTerminale", substring2.SubString2(0, 8))
				map.Put("PAN-Carta", substring2.SubString2(12, 31))
				map.Put("TipoTransazione", substring2.SubString2(31, 34))
				map.Put("CodiceAut", substring2.SubString2(34, 40))
			Else
				map.Put("DescEsito", substring2.SubString2(12, 36))
			End If
			map.Put("TipoCarta", substring2.SubString2(47, 48))
			map.Put("IDAcquirer", substring2.SubString2(48, 59))
			map.Put("STAN", substring2.SubString2(59, 65))
			map.Put("ProgOP", substring2.SubString2(65, 71))
			If z Then
				map.Put("ActionCode", substring2.SubString2(71, 74))
				map.Put("ImportoRicevuto", substring2.SubString2(74, 82))
			End If
		Catch
			Dim sb4 As String = LastException.Message & " Sub: LeggiEsitoPag"
			Sub003(sb4, True)
			map.Put("Errore", True)
		End Try
	End If
	Return map
End Sub

Sub Sub003(str As String, z As Boolean)
	If z Then
		Dim textWriterWrapper As TextWriter
		Dim vTmp As Long = mod1.Sub058
		Dim sb2 As String = mod1.Sub060(vTmp) & TAB & str
		Dim sb4 As String = File.DirDefaultExternal & "/LOG"
		Dim str2 As String = vStr2
		textWriterWrapper.Initialize(File.OpenOutput(sb4, str2, True))
		textWriterWrapper.WriteLine(sb2)
		textWriterWrapper.Close
	End If
	If Main.v_logmf Then
		Dim textWriterWrapper2 As TextWriter
		Dim vTmp_ As Long = mod1.Sub058
		Dim sb6 As String = mod1.Sub060(vTmp_) & TAB & str
		Dim sb8 As String = File.DirDefaultExternal & "/LOG"
		Dim str3 As String = vStr3
		textWriterWrapper2.Initialize(File.OpenOutput(sb8, str3, True))
		textWriterWrapper2.WriteLine(sb6)
		textWriterWrapper2.Close
		Return
	End If
End Sub

Sub Sub004(bArr As Byte()) As Byte
	Dim b As Byte = Byte.MAX_VALUE
	Dim length As Int = bArr.Length - 1
	Dim i As Int
	For i = 0 To length
		b = Bit.Xor(b, bArr(i))
	Next
	Return b
End Sub

Sub Sub005(str As String, i As Int) As Int
	Try
		If str <> "" Then
			vStr5 = str
		End If
		vSocket1.Initialize("sck")
		vSocket1.TimeOut = vInt3
		vSocket1.Connect(vStr5, i, vInt3)
		Dim i2 As Int = 0
		Do While True
			Dim connected As Boolean = vSocket1.Connected
			If Not(connected) Then
				If i2 >= Floor(vInt3 / 100) Then
					Exit
				End If
				mod1.Sub178(100)
				i2 = i2 + 1
			Else
				Exit
			End If
		Loop
		If Not(vSocket1.Connected) Then
			Return 256
		End If
		vTextWriter1.Initialize(vSocket1.OutputStream)
		vTextReader1.Initialize(vSocket1.InputStream)
		Dim str2 As String = "Connessione al terminale riuscita. IP:" & vStr1 & " Porta:" & vInt1
		Sub003(str2, False)
		Return 0
	Catch
		Log(LastException.Message)
		Msgbox(LastException.Message, "Sub OpenEth: Attenzione!")
		Return 256
	End Try
End Sub

Sub Sub006(str As String, i As Int, c As Char) As String
	If Not(str = Null) And str.Length < i Then
		Dim length As Int = i - str.Length
		Dim str2 As String = ""
		Dim i2 As Int
		For i2 = 1 To length
			str2 = str2 & c
		Next
		Return str2 & str
	End If
	Return str.SubString2(0, i)
End Sub

Sub pconferma As String
	Dim bArr(3) As Byte
	bArr(0) = vByt5
	bArr(1) = vByt2
	bArr(2) = Sub004(bArr)
	Return BytesToString(bArr, 0, 3, "ASCII")
End Sub

Sub Sub007 As String
	Dim bArr(3) As Byte
	bArr(0) = vByt6
	bArr(1) = vByt2
	bArr(2) = Sub004(bArr)
	Return BytesToString(bArr, 0, 3, "ASCII")
End Sub

Sub Sub008(str As String)
	vTextWriter1.Write(str)
	vTextWriter1.Flush
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ingenico.java, metodo _read (riga 382).
Sub read As String
	Dim c As Char
	Dim cArr(1024) As Char
	Try
		If Not(vTextReader1.Ready) Then
			Return ""
		End If
		If vTextReader1.Read(cArr, 0, 1) > 0 Then
			Dim valueOf As Character = cArr(0)
			Select valueOf
				Case Chr(vByt1)
					Dim vObjectToString As String = cArr(0)
					Do While vTextReader1.Read(cArr, 0, 1) > 0
						Dim c2 As Char = cArr(0)
						If c2 <> Chr(vByt2) Then
							vObjectToString = vObjectToString & cArr(0)
						Else
							c = cArr(0)
							If c <> Chr(vByt2) Then
								Dim str As String = vObjectToString & cArr(0)
								If vTextReader1.Read(cArr, 0, 1) > 0 Then
									Dim c3 As Char = cArr(0)
									If c3 = Chr(Sub004(str.GetBytes("ASCII"))) Then
										Return str & cArr(0)
									End If
								End If
								Sub013(Sub007())
							Else
								Sub013(Sub007())
							End If
						End If
					Loop
					c = cArr(0)
					If c <> Chr(vByt2) Then
					End If
				Case Chr(vByt3)
					Dim vObjectToString2 As String = cArr(0)
					vTextReader1.Read(cArr, 0, 21)
					Dim str2 As String = vObjectToString2
					Dim i As Int = 0
					Do While i <= 20
						Dim str3 As String = str2 & cArr(i)
						i = i + 1
						str2 = str3
					Loop
					Dim c4 As Char = cArr(20)
					If c4 <> Chr(vByt4) Then
						Sub013(Sub007())
					Else
						Return str2
					End If
				Case Chr(vByt5)
					Dim vObjectToString3 As String = cArr(0)
					vTextReader1.Read(cArr, 0, 2)
					Dim str4 As String = vObjectToString3 & cArr(0) & cArr(1)
					If str4 <> pconferma() Then
						Sub013(Sub007())
					Else
						Return str4
					End If
				Case Chr(vByt6)
					Dim vObjectToString4 As String = cArr(0)
					vTextReader1.Read(cArr, 0, 2)
					Dim str5 As String = vObjectToString4 & cArr(0) & cArr(1)
					If str5 <> Sub007() Then
						Sub013(Sub007())
					Else
						Return str5
					End If
				Case Else
					Sub013(Sub007())
			End Select
		End If
		Return ""
	Catch
		Dim sb2 As String = LastException.Message & " Sub: Read"
		Sub003(sb2, True)
		Return ""
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ingenico.java, metodo m7… (riga 490).
Sub Sub009(i As Int, i2 As Int, i3 As Int, i4 As Int, z As Boolean, str As String) As Map
	Dim str2 As String
	Dim str3 As String
	Dim substring As String
	Dim map As Map
	Dim z2 As Boolean = False
	If i3 = 4 Then
		i3 = 0
	End If
	Try
		map.Initialize
		If Sub005(vStr1, vInt1) = 0 Then
			Dim str4 As String = Sub006(i, 8, "0") & "0"
			If i3 = vInt2 Then
				str2 = str4 & "w"
			Else If z Then
				str2 = str4 & "X"
			Else
				str2 = str4 & "P"
			End If
			If i3 = 10 Then
				Dim str5 As String = str2 & "822660" & "0102" & str & modfunstr.Sub004(25) & modfunstr.Sub004(19) & Sub006(i4, 7, "0")
				If Main.v_eftsmstampa Then
					str3 = str5 & modfunstr.Sub004(47) & "01"
				Else
					str3 = str5 & modfunstr.Sub004(47) & "11"
				End If
			Else
				str3 = str2 & Sub006(i2, 8, "0") & "0000" & i3 & Sub006(i4, 8, "0") & "00000000"
			End If
			Dim sb2 As String = Chr(vByt1) & str3 & Chr(vByt2)
			Dim sb3 As String = sb2 & Chr(Sub004(sb2.GetBytes("ASCII")))
			Sub013(sb3)
			Sub003("Richiesta pagamento: " & QUOTE & sb3 & QUOTE, False)
			Do While Sub012()
				If Not(z2) Then
					Dim str6 As String = sb3
					Dim i5 As Int
					For i5 = 0 To 120
						str6 = read()
						If str6.Length <= 0 Then
							Dim object As Class = Main
							CallSub2(object, "SetlwText", "Procedura di pagamento in corso ..." & CRLF & "Tempo residuo prima dell'annullo automatico: " & 120 - i5)
							mod1.Sub178(1000)
							DoEvents
							If i5 = 120 Then
								map.Put("OK", False)
								map.Put("Esito", "Esaurito il tempo per la transazione.")
								Sub001()
							End If
						Else
							substring = str6.SubString2(0, 1)
							Select substring
								Case Chr(vByt6)
									map.Put("OK", False)
									map.Put("Esito", "Operazione rifiutata dal terminale.")
									Sub003("Operazione rifiutata dal terminale.", False)
									Sub001()
									z2 = True
								Case Chr(vByt1)
									Sub013(pconferma())
									Sub001()
									map = Sub002(str6, z, i3)
									If i3 = vInt2 Then
										If map.Get("Esito") = "00" Then
											map.Put("OK", True)
											Dim str7 As String = "Operazione eseguita con successo dal terminale. " & map.Get("Esito")
											Sub003(str7, False)
										Else
											map.Put("OK", False)
											map.Put("Esito", map.Get("DescEsito"))
											Dim str8 As String = "Operazione fallita. " & map.Get("DescEsito")
											Sub003(str8, False)
										End If
									Else If map.ContainsKey("Esito") And map.Get("Esito") = "00" Then
										map.Put("OK", True)
										Dim str9 As String = "Operazione eseguita con successo dal terminale. " & map.Get("Esito")
										Sub003(str9, False)
									Else
										map.Put("OK", False)
										map.Put("Esito", map.Get("DescEsito"))
										Dim str10 As String = "Operazione fallita. " & map.Get("DescEsito")
										Sub003(str10, False)
									End If
									z2 = True
							End Select
							sb3 = str6
						End If
					Next
					substring = str6.SubString2(0, 1)
					Select substring
					End Select
					sb3 = str6
				Else
					If Not(z2) Then
						Dim str11 As String = "Timeout della connessione " & vInt3 & "ms"
						Sub003(str11, False)
						map.Put("OK", False)
						map.Put("Esito", "Timeout della connessione")
						Sub001()
					End If
				End If
			Loop
			If Not(z2) Then
			End If
		Else
			map.Put("OK", False)
			map.Put("Esito", "Problemi di connessione.")
			Sub003("Problemi di connessione.", False)
		End If
	Catch
		map.Put("OK", False)
		map.Put("Esito", LastException.Message)
		Dim sb5 As String = LastException.Message & " Sub: RichiestaPagamento"
		Sub003(sb5, True)
		Sub001()
	End Try
	Return map
End Sub

Sub Sck_Connected(z As Boolean)
End Sub

Sub Sub010(str As String, i As Int)
	vStr1 = str
	vInt1 = i
End Sub

Sub Sub011(i As Int) As Boolean
	If Not(vSocket1.IsInitialized) Then
		Return False
	End If
	vInt3 = i
	Return True
End Sub

Sub Sub012 As Boolean
	If vSocket1.Connected Then
		Return True
	End If
	Return False
End Sub

Sub Sub013(str As String) As Int
	Try
		Dim i As Int = 0
		Dim z As Boolean
		z = True
		Do While z
			Dim connected As Boolean = vSocket1.Connected
			If connected Or i = Sub005(vStr1, vInt1) = 0 Then
				Sub008(str)
			Else
				Return i
			End If
			z = False
		Loop
		Return i
	Catch
		Dim message As String = LastException.Message
		Sub003(message, True)
		vSocket1.Close
		Return 0
	End Try
End Sub

