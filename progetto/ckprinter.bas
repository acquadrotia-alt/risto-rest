B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Type kprinterstatus(CoverOpened As Boolean, ErrCutterCoverOpen As Boolean, ErrCutterLocked As Boolean, ErrEpromCorrupted As Boolean, ErrHeadOverTemperature As Boolean, ErrPowerSupply As Boolean, ErrRamCorrupted As Boolean, InError As Boolean, NotchAligned As Boolean, OffLine As Boolean, PaperEnd As Boolean, PaperNearEnd As Boolean)
	Public vSocket1 As Socket
	Public vOutputStream1 As OutputStream
	Public vInputStream1 As InputStream
	Public vStr1 As String
	Public vBln1 As Boolean
	Public vInt1 As Int
	Public vInt2 As Int
	Public vBln2 As Boolean
	Public vBln3 As Boolean
	Public vBln4 As Boolean
	Public vkprinterstatus1 As kprinterstatus
	Public vBln5 As Boolean
	Public vStr2 As String
	Public vInt3 As Int
	Public vLng1 As Long
	Public vBln6 As Boolean
	Public vInt4 As Int
	Public vInt5 As Int
	Public vBln7 As Boolean
	Public vBln8 As Boolean
	Public vStr3 As String
	Public vStr4 As String
	Public vLst1 As List
	Public vLst2 As List
	Public vInt6 As Int
	Public vLst3 As List
	Public vLst4 As List
	Public vInt7 As Int
End Sub

Sub Sub001
	If vSocket1.IsInitialized Then
		Sub003("Chiusura Socket", False)
		vSocket1.Close
	End If
	vLng1 = DateTime.Now
End Sub

Sub doc_barcodecode39stampa(str As String)
	Sub008(Chr(29) & Chr(72) & Chr(2))
	Sub008(Chr(9) & Chr(29) & Chr(107) & Chr(69) & Chr(str.Length) & str)
End Sub

Sub doc_barcodeean13stampa(str As String)
	Sub008(Chr(29) & Chr(72) & Chr(2))
	Sub008(Chr(9) & Chr(29) & Chr(107) & Chr(67) & Chr(13) & str)
End Sub

Sub doc_barcodeitfstampa(str As String)
	Sub008(Chr(29) & Chr(72) & Chr(2))
	Sub008(Chr(9) & Chr(29) & Chr(107) & Chr(70) & Chr(str.Length) & str)
End Sub

Sub doc_fine
	If vInt2 = 2 Then
		Sub008(Chr(27) & "p1" & Chr(100) & Chr(100))
	End If
	If vInt3 > 0 And vLst1.Size > 0 Then
		Try
			Dim sb3 As String = mod1.vStr4 & "/Spooler"
			Dim sb5 As String = mod1.Sub059(mod1.Sub058) & "_" & modfunstr.Sub003("0000000" & vInt6, 7) & "_" & vStr1 & "_" & IIf(vBln8, "1", "0") & "_.tmp"
			vInt6 = vInt6 + 1
			Dim randomAccessFile As RandomAccessFile
			randomAccessFile.Initialize2(sb3, sb5, False, False)
			Dim object As List = vLst1
			randomAccessFile.WriteObject(object, True, randomAccessFile.CurrentPosition)
			Dim object2 As List = vLst2
			randomAccessFile.WriteObject(object2, True, randomAccessFile.CurrentPosition)
			randomAccessFile.Close
			If File.Exists(sb3, sb5) Then
				mod1.Sub147(sb3, sb5, sb3, sb5.Replace(".tmp", ".job"))
			End If
			vLst1.Initialize
			vLst2.Initialize
		Catch
			mod1.Sub217(LastException.Message)
		End Try
	End If
	If vInt7 > 0 Then
		Dim randomAccessFile2 As RandomAccessFile
		randomAccessFile2.Initialize2(mod1.vStr7, "Tmp.NF", False, False)
		Dim object3 As List = vLst3
		randomAccessFile2.WriteObject(object3, True, randomAccessFile2.CurrentPosition)
		randomAccessFile2.Close
		Dim textWriterWrapper As TextWriter
		textWriterWrapper.Initialize(File.OpenOutput(mod1.vStr7, "Tmp.txt", False))
		Dim size As Int = vLst4.Size - 1
		Dim i As Int
		For i = 0 To size
			textWriterWrapper.Write(vLst4.Get(i) & Chr(13) & Chr(10))
		Next
		textWriterWrapper.Close
		vLst3.Initialize
		vLst4.Initialize
		If vInt7 = 2 Then
			vInt7 = 0
			Return
		End If
		vInt7 = 0
	End If
End Sub

Sub doc_img(str As String, str2 As String)
	If vInt3 > 0 And vLst2.IsInitialized Then
		vLst2.Add("__img__" & str & "__" & str2)
		Return
	End If
	Sub009(Sub002(str2, str))
End Sub

Sub doc_inizio
	If vInt2 = 1 Then
		If vBln1 Then
			Sub008(Chr(27) & "p0" & Chr(100) & Chr(100))
			Sub008(Chr(27) & "p0" & Chr(100) & Chr(100))
		Else
			Sub008(Chr(27) & "p1" & Chr(100) & Chr(100))
			Sub008(Chr(27) & "p1" & Chr(100) & Chr(100))
		End If
	End If
	If vBln4 And vBln1 Then
		Sub008(Chr(27) & "B" & Chr(1) & Chr(5))
		Return
	End If
End Sub

Sub doc_pagfine(z As Boolean)
	If vBln8 Then
		Sub008(Chr(27) & "@")
		Return
	End If
	If vInt1 <> 0 Then
		Sub008(CRLF & CRLF & CRLF & CRLF & CRLF & CRLF)
		If z Then
			doc_testostile(False, False, False, False, False, False, False, "")
			doc_testostampa("------------------------------------------")
			doc_testostampa(" ")
		Else
			Select vInt1
				Case 1
					If vBln1 Then
						Sub008(Chr(29) & "V1")
					Else
						Sub008(Chr(27) & "m")
					End If
				Case 2
					If vBln1 Then
						Sub008(Chr(29) & "V0")
					Else
						Sub008(Chr(27) & "i")
					End If
			End Select
		End If
	Else If vBln2 Then
		Sub008(Chr(29) & Chr(248))
		Sub008(Chr(12))
	End If
End Sub

Sub doc_paginizio(z As Boolean)
	If vInt7 > 0 Then
		If Not(vLst3.IsInitialized) Then
			vLst3.Initialize
		End If
	End If
	vBln8 = (z And vInt3 > 0)
	If vBln8 Then
		If Not(vLst2.IsInitialized) Then
			vLst2.Initialize
		End If
		If vBln1 Then
			Sub008(Chr(29) & "V1")
		Else
			Sub008(Chr(27) & "m")
		End If
		Sub008(CRLF & CRLF & CRLF & CRLF & CRLF & CRLF)
	Else
		Sub008(Chr(27) & "@")
		If vBln2 Then
			Sub008(Chr(29) & Chr(248))
			Sub008(Chr(12))
		End If
	End If
	vInt4 = -1
	vInt5 = -1
	vStr4 = ""
	vStr3 = ""
End Sub

Sub doc_testogiustifica(i As Int)
	If vInt5 <> i Then
		vInt5 = i
		If vBln8 Then
			vStr3 = Chr(27) & Chr(97) & Chr(i)
			Return
		End If
		Sub008(Chr(27) & Chr(97) & Chr(i))
		Return
	End If
End Sub

Sub doc_testostampa(str As String)
	If vBln6 Then
		vBln6 = False
		Return
	End If
	Dim length As Int = str.Length
	Dim vTmp As String = Sub007(str, length, False)
	If vInt7 > 0 Then
		If Not(vLst4.IsInitialized) Then
			vLst4.Initialize
		End If
		vLst4.Add(vTmp)
	End If
	If vBln8 Then
		Sub008(vStr3 & vStr4 & vTmp & Chr(13) & Chr(10))
	Else
		Sub008(vTmp & Chr(13) & Chr(10))
	End If
End Sub

Sub doc_testostampanrighevuote(i As Int)
	Sub008(Chr(27) & Chr(100) & Chr(i))
End Sub

Sub doc_testostile(z As Boolean, z2 As Boolean, z3 As Boolean, z4 As Boolean, z5 As Boolean, z6 As Boolean, z7 As Boolean, str As String)
	Dim i As Int
	If str <> "" Then
		doc_testostile2(str)
		Return
	End If
	Dim i2 As Int = 0
	Dim z8 As Boolean = vInt4 = -1
	If z Then
		i2 = 1
	End If
	If z2 Then
		i2 = i2 + 8
	End If
	If z3 Then
		i2 = i2 + 16
	End If
	If z4 Then
		i2 = i2 + 32
	End If
	If z5 Then
		i2 = i2 + 64
	End If
	If z6 Then
		i2 = i2 + 128
	End If
	vBln3 = z4
	If vBln8 Then
		vStr4 = Chr(27) & Chr(33) & Chr(i2)
	Else If vInt4 <> i2 Then
		vInt4 = i2
		Sub008(Chr(27) & Chr(33) & Chr(i2))
	End If
	If z8 Or vBln7 <> z7 Then
		If z7 Then
			i = 1
		Else
			i = 0
		End If
		vBln7 = z7
		If vBln8 Then
			vStr4 = vStr4 & Chr(29) & Chr(66) & Chr(i)
		Else
			Sub008(Chr(29) & Chr(66) & Chr(i))
		End If
	End If
End Sub

Sub doc_testostile2(str As String)
	Dim z As Boolean = vInt4 = -1
	If str.Length < 7 Or str.Length > 8 Then
		Return
	End If
	Dim i As Int = IIf(str.CharAt(0) = "1", 1, 0)
	If str.CharAt(1) = "1" Then
		i = i + 8
	End If
	If str.CharAt(2) = "1" Then
		i = i + 16
	End If
	If str.CharAt(3) = "1" Then
		i = i + 32
	End If
	If str.CharAt(4) = "1" Then
		i = i + 64
	End If
	If str.CharAt(5) = "1" Then
		i = i + 128
	End If
	vBln3 = (str.CharAt(3) = "1")
	If vBln8 Then
		vStr4 = Chr(27) & Chr(33) & Chr(i)
	Else If vInt4 <> i Then
		vInt4 = i
		Sub008(Chr(27) & Chr(33) & Chr(i))
	End If
	Dim z2 As Boolean = str.CharAt(6) = "1"
	If z Or vBln7 <> z2 Then
		Dim i2 As Int = IIf(z2, 1, 0)
		vBln7 = z2
		If vBln8 Then
			vStr4 = vStr4 & Chr(29) & Chr(66) & Chr(i2)
		Else
			Sub008(Chr(29) & Chr(66) & Chr(i2))
		End If
	End If
	vBln6 = (str.Length > 7 And str.CharAt(7) = "1")
End Sub

Sub Sub002(str As String, str2 As String) As Byte()
	Return Bit.InputStreamToBytes(File.OpenInput(str, str2))
End Sub

Sub Initialize(z As Boolean)
	vBln1 = z
End Sub

Sub Sub003(str As String, z As Boolean)
	Dim sb As String
	If Not(Main.v_lognf) Then
		Return
	End If
	Dim textWriterWrapper As TextWriter
	Dim vTmp As Long = mod1.Sub058
	If z Then
		sb = "ERR" & TAB
	Else
		sb = "INF" & TAB
	End If
	Dim sb3 As String = sb & mod1.Sub060(vTmp) & TAB & vStr1 & TAB & str
	Dim sb5 As String = File.DirDefaultExternal & "/LOG"
	textWriterWrapper.Initialize(File.OpenOutput(sb5, "KPRINTER_LOG.txt", True))
	textWriterWrapper.WriteLine(sb3.Replace(CRLF, ""))
	textWriterWrapper.Close
End Sub

Sub Sub004(str As String) As Int
	If vInt3 = 0 Then
		Dim now As Long = DateTime.Now - vLng1
		If now >= 0 And now < 200 Then
			mod1.Sub178(200)
		End If
	End If
	If str <> "" Then
		vStr1 = str
	End If
	Dim threading As Thread
	vSocket1.Initialize("sck")
	vSocket1.TimeOut = 7000
	If Main.v_disconnettiprt Then
		vSocket1.Connect(vStr1, 9100, 3000)
		Dim i As Int = 0
		Do While True
			Dim connected As Boolean = vSocket1.Connected
			If connected Or i >= 30 Then
				Exit
			End If
			threading.Sleep(100)
			i = i + 1
		Loop
		If Not(vSocket1.Connected) Then
			Dim str2 As String = vStr1
			If mod1.Sub142(str2, "Status", 2, 5, True) <> "Host unreachable" Then
				Sub003("Retry Connection", True)
				vSocket1.Connect(vStr1, 9100, 6000)
				Dim i2 As Int = 0
				Do While True
					Dim connected2 As Boolean = vSocket1.Connected
					If connected2 Or i2 >= 65 Then
						Exit
					End If
					threading.Sleep(100)
					i2 = i2 + 1
				Loop
			Else
				Sub003("Printer Off", True)
				Return 250
			End If
		End If
	Else
		vSocket1.Connect(vStr1, 9100, 6000)
		Dim i3 As Int = 0
		Do While True
			Dim connected3 As Boolean = vSocket1.Connected
			If connected3 Or i3 >= 65 Then
				Exit
			End If
			threading.Sleep(100)
			i3 = i3 + 1
		Loop
	End If
	If vSocket1.Connected Then
		Sub003("Printer Connected", False)
		vBln5 = True
		vOutputStream1 = vSocket1.OutputStream
		vInputStream1 = vSocket1.InputStream
		Return 0
	End If
	Sub003("Printer Connection Error", True)
	Return 256
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ckprinter.java, metodo m6… (riga 864).
Sub Sub005
	Dim vReadBytes As Int
	Dim vReadBytes2 As Int
	Dim vReadBytes3 As Int
	If vBln1 Then
		Sub006()
		Return
	End If
	Dim bArr(1024) As Byte
	Dim kprinterstatusVar As kprinterstatus
	If Sub008(Chr(16) & Chr(4) & Chr(20)) = 250 Then
		vkprinterstatus1 = kprinterstatusVar
		Dim kprinterstatusVar2 As kprinterstatus = vkprinterstatus1
		kprinterstatusVar2.OffLine = True
		Dim kprinterstatusVar3 As kprinterstatus = vkprinterstatus1
		kprinterstatusVar3.InError = True
		Return
	End If
	vkprinterstatus1 = kprinterstatusVar
	Dim kprinterstatusVar4 As kprinterstatus = vkprinterstatus1
	kprinterstatusVar4.OffLine = True
	Dim kprinterstatusVar5 As kprinterstatus = vkprinterstatus1
	kprinterstatusVar5.InError = True
	Try
		vReadBytes = vInputStream1.ReadBytes(bArr, 0, bArr.Length)
	Catch
		Sub003("Errore ReadStatus 1", True)
		If Sub004("") <> 0 Then
			Return
		End If
		vReadBytes = vInputStream1.ReadBytes(bArr, 0, bArr.Length)
	End Try
	If vReadBytes = 6 Then
		If bArr(0) = 16 And bArr(1) = 15 Then
			Dim kprinterstatusVar6 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar6.OffLine = False
			Dim kprinterstatusVar7 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar7.PaperEnd = (Bit.And(bArr(2), 1) > 0)
			Dim kprinterstatusVar8 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar8.PaperNearEnd = (Bit.And(bArr(2), 4) > 0)
			Dim kprinterstatusVar9 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar9.CoverOpened = (Bit.And(bArr(3), 1) > 0)
			Dim kprinterstatusVar10 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar10.ErrHeadOverTemperature = (Bit.And(bArr(4), 1) > 0)
			Dim kprinterstatusVar11 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar11.ErrPowerSupply = (Bit.And(bArr(4), 8) > 0)
			Dim kprinterstatusVar12 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar12.NotchAligned = (Bit.And(bArr(4), 128) > 0)
			Dim kprinterstatusVar13 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar13.ErrCutterLocked = (Bit.And(bArr(5), 1) > 0)
			Dim kprinterstatusVar14 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar14.ErrCutterCoverOpen = (Bit.And(bArr(5), 2) > 0)
			Dim kprinterstatusVar15 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar15.ErrRamCorrupted = (Bit.And(bArr(5), 4) > 0)
			Dim kprinterstatusVar16 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar16.ErrEpromCorrupted = (Bit.And(bArr(5), 8) > 0)
			vkprinterstatus1.InError = (vkprinterstatus1.PaperEnd Or vkprinterstatus1.CoverOpened Or vkprinterstatus1.ErrHeadOverTemperature Or vkprinterstatus1.ErrPowerSupply Or vkprinterstatus1.ErrCutterLocked Or vkprinterstatus1.ErrCutterCoverOpen Or vkprinterstatus1.ErrRamCorrupted Or vkprinterstatus1.ErrEpromCorrupted)
			If Main.v_lognf Then
				Dim sb3 As String = Bit.And(bArr(2), 1) & Bit.And(bArr(2), 4) & Bit.And(bArr(3), 1) & Bit.And(bArr(4), 1) & Bit.And(bArr(4), 8) & Bit.And(bArr(4), 128) & Bit.And(bArr(5), 1) & Bit.And(bArr(5), 2) & Bit.And(bArr(5), 4) & Bit.And(bArr(5), 8)
				If vkprinterstatus1.InError Then
					Sub003("Printer in Error 1:" & sb3, True)
				Else
					Sub003("Printer Status 1:" & sb3, False)
				End If
			End If
			If vkprinterstatus1.InError Then
				mod1.Sub178(1000)
				Sub008(Chr(16) & Chr(4) & Chr(20))
				vkprinterstatus1 = kprinterstatusVar
				Dim kprinterstatusVar17 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar17.OffLine = True
				Dim kprinterstatusVar18 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar18.InError = True
				Try
					vReadBytes3 = vInputStream1.ReadBytes(bArr, 0, bArr.Length)
				Catch
					Sub003("Errore ReadStatus 2", True)
					If Sub004("") <> 0 Then
						Return
					End If
					vReadBytes3 = vInputStream1.ReadBytes(bArr, 0, bArr.Length)
				End Try
				If vReadBytes3 = 6 And bArr(0) = 16 And bArr(1) = 15 Then
					Dim kprinterstatusVar19 As kprinterstatus = vkprinterstatus1
					kprinterstatusVar19.OffLine = False
					Dim kprinterstatusVar20 As kprinterstatus = vkprinterstatus1
					kprinterstatusVar20.PaperEnd = (Bit.And(bArr(2), 1) > 0)
					Dim kprinterstatusVar21 As kprinterstatus = vkprinterstatus1
					kprinterstatusVar21.PaperNearEnd = (Bit.And(bArr(2), 4) > 0)
					Dim kprinterstatusVar22 As kprinterstatus = vkprinterstatus1
					kprinterstatusVar22.CoverOpened = (Bit.And(bArr(3), 1) > 0)
					Dim kprinterstatusVar23 As kprinterstatus = vkprinterstatus1
					kprinterstatusVar23.ErrHeadOverTemperature = (Bit.And(bArr(4), 1) > 0)
					Dim kprinterstatusVar24 As kprinterstatus = vkprinterstatus1
					kprinterstatusVar24.ErrPowerSupply = (Bit.And(bArr(4), 8) > 0)
					Dim kprinterstatusVar25 As kprinterstatus = vkprinterstatus1
					kprinterstatusVar25.NotchAligned = (Bit.And(bArr(4), 128) > 0)
					Dim kprinterstatusVar26 As kprinterstatus = vkprinterstatus1
					kprinterstatusVar26.ErrCutterLocked = (Bit.And(bArr(5), 1) > 0)
					Dim kprinterstatusVar27 As kprinterstatus = vkprinterstatus1
					kprinterstatusVar27.ErrCutterCoverOpen = (Bit.And(bArr(5), 2) > 0)
					Dim kprinterstatusVar28 As kprinterstatus = vkprinterstatus1
					kprinterstatusVar28.ErrRamCorrupted = (Bit.And(bArr(5), 4) > 0)
					Dim kprinterstatusVar29 As kprinterstatus = vkprinterstatus1
					kprinterstatusVar29.ErrEpromCorrupted = (Bit.And(bArr(5), 8) > 0)
					vkprinterstatus1.InError = (vkprinterstatus1.PaperEnd Or vkprinterstatus1.CoverOpened Or vkprinterstatus1.ErrHeadOverTemperature Or vkprinterstatus1.ErrPowerSupply Or vkprinterstatus1.ErrCutterLocked Or vkprinterstatus1.ErrCutterCoverOpen Or vkprinterstatus1.ErrRamCorrupted Or vkprinterstatus1.ErrEpromCorrupted)
					If Main.v_lognf Then
						Dim sb6 As String = Bit.And(bArr(2), 1) & Bit.And(bArr(2), 4) & Bit.And(bArr(3), 1) & Bit.And(bArr(4), 1) & Bit.And(bArr(4), 8) & Bit.And(bArr(4), 128) & Bit.And(bArr(5), 1) & Bit.And(bArr(5), 2) & Bit.And(bArr(5), 4) & Bit.And(bArr(5), 8)
						If vkprinterstatus1.InError Then
							Sub003("Printer in Error 2:" & sb6, True)
						Else
							Sub003("Printer Status 2:" & sb6, False)
						End If
					End If
				End If
			End If
		End If
	Else
		mod1.Sub178(1000)
		Sub008(Chr(16) & Chr(4) & Chr(20))
		vkprinterstatus1 = kprinterstatusVar
		Dim kprinterstatusVar30 As kprinterstatus = vkprinterstatus1
		kprinterstatusVar30.OffLine = True
		Dim kprinterstatusVar31 As kprinterstatus = vkprinterstatus1
		kprinterstatusVar31.InError = True
		Try
			vReadBytes2 = vInputStream1.ReadBytes(bArr, 0, bArr.Length)
		Catch
			Sub003("Errore ReadStatus 3", True)
			If Sub004("") <> 0 Then
				Return
			End If
			vReadBytes2 = vInputStream1.ReadBytes(bArr, 0, bArr.Length)
		End Try
		If vReadBytes2 = 6 Then
			If bArr(0) = 16 And bArr(1) = 15 Then
				Dim kprinterstatusVar32 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar32.OffLine = False
				Dim kprinterstatusVar33 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar33.PaperEnd = (Bit.And(bArr(2), 1) > 0)
				Dim kprinterstatusVar34 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar34.PaperNearEnd = (Bit.And(bArr(2), 4) > 0)
				Dim kprinterstatusVar35 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar35.CoverOpened = (Bit.And(bArr(3), 1) > 0)
				Dim kprinterstatusVar36 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar36.ErrHeadOverTemperature = (Bit.And(bArr(4), 1) > 0)
				Dim kprinterstatusVar37 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar37.ErrPowerSupply = (Bit.And(bArr(4), 8) > 0)
				Dim kprinterstatusVar38 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar38.NotchAligned = (Bit.And(bArr(4), 128) > 0)
				Dim kprinterstatusVar39 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar39.ErrCutterLocked = (Bit.And(bArr(5), 1) > 0)
				Dim kprinterstatusVar40 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar40.ErrCutterCoverOpen = (Bit.And(bArr(5), 2) > 0)
				Dim kprinterstatusVar41 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar41.ErrRamCorrupted = (Bit.And(bArr(5), 4) > 0)
				Dim kprinterstatusVar42 As kprinterstatus = vkprinterstatus1
				kprinterstatusVar42.ErrEpromCorrupted = (Bit.And(bArr(5), 8) > 0)
				vkprinterstatus1.InError = (vkprinterstatus1.PaperEnd Or vkprinterstatus1.CoverOpened Or vkprinterstatus1.ErrHeadOverTemperature Or vkprinterstatus1.ErrPowerSupply Or vkprinterstatus1.ErrCutterLocked Or vkprinterstatus1.ErrCutterCoverOpen Or vkprinterstatus1.ErrRamCorrupted Or vkprinterstatus1.ErrEpromCorrupted)
				If Main.v_lognf Then
					Dim sb9 As String = Bit.And(bArr(2), 1) & Bit.And(bArr(2), 4) & Bit.And(bArr(3), 1) & Bit.And(bArr(4), 1) & Bit.And(bArr(4), 8) & Bit.And(bArr(4), 128) & Bit.And(bArr(5), 1) & Bit.And(bArr(5), 2) & Bit.And(bArr(5), 4) & Bit.And(bArr(5), 8)
					If vkprinterstatus1.InError Then
						Sub003("Printer in Error 3:" & sb9, True)
					Else
						Sub003("Printer Status 3:" & sb9, False)
					End If
				End If
			End If
		Else If vReadBytes2 = -1 Then
			If Not(vSocket1.Connected) Then
			End If
			Dim kprinterstatusVar43 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar43.OffLine = False
			Dim kprinterstatusVar44 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar44.InError = False
			Sub003("Printer Error in -1", True)
		End If
	End If
End Sub

Sub Sub006 As kprinterstatus
	Dim vReadBytes As Int
	Sub008(Chr(16) & Chr(4) & Chr(2))
	Dim bArr(1024) As Byte
	'vkprinterstatus1 = kprinterstatus
	Dim kprinterstatusVar As kprinterstatus = vkprinterstatus1
	kprinterstatusVar.OffLine = True
	Dim kprinterstatusVar2 As kprinterstatus = vkprinterstatus1
	kprinterstatusVar2.InError = True
	Try
		vReadBytes = vInputStream1.ReadBytes(bArr, 0, bArr.Length)
	Catch
		Sub003("Errore ReadStatusEP 1", True)
		If Sub004("") <> 0 Then
			Return vkprinterstatus1
		End If
		vReadBytes = vInputStream1.ReadBytes(bArr, 0, bArr.Length)
	End Try
	If vReadBytes = 1 Then
		Dim kprinterstatusVar3 As kprinterstatus = vkprinterstatus1
		kprinterstatusVar3.OffLine = False
		If bArr(0) <> 18 Then
			Dim kprinterstatusVar4 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar4.CoverOpened = (Bit.And(bArr(0), 4) > 0)
			Dim kprinterstatusVar5 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar5.PaperEnd = (Bit.And(bArr(0), 32) > 0)
			Dim kprinterstatusVar6 As kprinterstatus = vkprinterstatus1
			kprinterstatusVar6.ErrPowerSupply = (Bit.And(bArr(0), 64) > 0)
		End If
		vkprinterstatus1.InError = (vkprinterstatus1.PaperEnd Or vkprinterstatus1.CoverOpened Or vkprinterstatus1.ErrHeadOverTemperature Or vkprinterstatus1.ErrPowerSupply Or vkprinterstatus1.ErrCutterLocked Or vkprinterstatus1.ErrCutterCoverOpen Or vkprinterstatus1.ErrRamCorrupted Or vkprinterstatus1.ErrEpromCorrupted)
		If Main.v_lognf Then
			Dim sb3 As String = Bit.And(bArr(0), 4) & Bit.And(bArr(0), 32) & Bit.And(bArr(0), 64)
			If vkprinterstatus1.InError Then
				Sub003("PrinterEP in Error :" & sb3, True)
			Else
				Sub003("PrinterEP Status :" & sb3, False)
			End If
		End If
	End If
	Return vkprinterstatus1
End Sub

Sub Sck_Connected(z As Boolean)
End Sub

Sub Sub007(str As String, i As Int, z As Boolean) As String
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	If str.Length > 0 Then
		Dim length As Int = str.Length
		Dim i2 As Int
		For i2 = 1 To length
			Dim charAt As Char = str.CharAt(i2 - 1)
			If Asc(charAt) >= 42 Then
				If Asc(charAt) <= 63 Then
					stringBuilderWrapper.Append(charAt)
				End If
			End If
			If Asc(charAt) >= 65 Then
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

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ckprinter.java, metodo m7… (riga 1418).
Sub Sub008(str As String) As Int
	Dim i As Int
	Dim z As Boolean
	If vInt3 > 0 Then
		If Not(vLst1.IsInitialized) Then
			vLst1.Initialize
		End If
		If Not(vLst2.IsInitialized) Then
			vLst2.Initialize
		End If
		If vLst1.Size = 0 Then
			vLst1.Add(vStr1)
			vLst1.Add(vBln1)
			vLst1.Add(vStr2)
			vLst1.Add(vInt3)
			vLst1.Add(vInt2)
			vLst1.Add(vBln4)
			vLst2.Initialize
		End If
		vLst2.Add(str)
		Return 0
	End If
	If vInt7 > 0 Then
		If Not(vLst3.IsInitialized) Then
			vLst3.Initialize
		End If
		vLst3.Add(str)
		If vInt7 = 2 Then
			Return 0
		End If
	End If
	Sub003(str, False)
	Dim connected As Boolean = vSocket1.Connected
	If connected Then
		i = 0
	Else
		If Main.v_disconnettiprt Then
			Dim z2 As Boolean = False
			Dim i2 As Int = 0
			Dim i3 As Int
			For i3 = 0 To 10
				If i3 = 1 Then
					If mod1.vStr1 = "Main" Then
						If vStr2 <> "" Then
							Dim vObjectToCharSequence As Object = "Verifica stampante in corso (" & vStr2 & ")"
							ProgressDialogShow2(vObjectToCharSequence, False)
						Else
							Dim vObjectToCharSequence2 As Object = "Verifica stampante in corso ..."
							ProgressDialogShow2(vObjectToCharSequence2, False)
						End If
						DoEvents
						z2 = True
						i2 = Sub004("")
						If i2 <> 0 Then
							Exit
						End If
						If i2 = 250 Then
							i = i2
							z = z2
							Exit
						End If
					End If
				End If
				If i3 > 1 Then
					If mod1.vStr1 = "Main" Then
						DoEvents
					End If
				End If
				i2 = Sub004("")
				If i2 <> 0 Then
				End If
			Next
			i = i2
			z = z2
			If z Then
				ProgressDialogHide
			End If
		Else
			i = Sub004("")
		End If
		If i <> 0 Then
			Return i
		End If
	End If
	Try
		vOutputStream1.WriteBytes(str.GetBytes("UTF8"), 0, str.Length)
		vOutputStream1.Flush
		Return i
	Catch
		Sub003("Errore Flush", True)
		Dim vTmp As Int = Sub004("")
		If vTmp = 0 Then
			vOutputStream1.WriteBytes(str.GetBytes("UTF8"), 0, str.Length)
			vOutputStream1.Flush
			Return vTmp
		End If
		Return vTmp
	End Try
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/ckprinter.java, metodo m0… (riga 1549).
Sub Sub009(bArr As Byte()) As Int
	Dim i As Int
	Dim z As Boolean
	Dim vBytesToString As String = BytesToString(bArr, 0, bArr.Length, "UTF8")
	Sub003(vBytesToString, False)
	Dim connected As Boolean = vSocket1.Connected
	If connected Then
		i = 0
	Else
		If Main.v_disconnettiprt Then
			Dim z2 As Boolean = False
			Dim i2 As Int = 0
			Dim i3 As Int
			For i3 = 0 To 10
				If i3 = 1 Then
					If mod1.vStr1 = "Main" Then
						If vStr2 <> "" Then
							Dim vObjectToCharSequence As Object = "Verifica stampante in corso (" & vStr2 & ")"
							ProgressDialogShow2(vObjectToCharSequence, False)
						Else
							Dim vObjectToCharSequence2 As Object = "Verifica stampante in corso ..."
							ProgressDialogShow2(vObjectToCharSequence2, False)
						End If
						DoEvents
						z2 = True
						i2 = Sub004("")
						If i2 <> 0 Then
							Exit
						End If
						If i2 = 250 Then
							i = i2
							z = z2
							Exit
						End If
					End If
				End If
				If i3 > 1 Then
					If mod1.vStr1 = "Main" Then
						DoEvents
					End If
				End If
				i2 = Sub004("")
				If i2 <> 0 Then
				End If
			Next
			i = i2
			z = z2
			If z Then
				ProgressDialogHide
			End If
		Else
			i = Sub004("")
		End If
	End If
	Try
		vOutputStream1.WriteBytes(bArr, 0, bArr.Length)
	Catch
		Sub003("Errore Invio Img", True)
		i = Sub004("")
		If i = 0 Then
			vOutputStream1.WriteBytes(bArr, 0, bArr.Length)
		End If
	End Try
	Return i
End Sub

