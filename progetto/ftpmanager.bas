B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=13.1
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	Public vBln1 As Boolean
	Public vLst1 As List
	Public vTmr1 As Timer
	Public vTmr2 As Timer
	Public Server As HttpServer
	Public vInt1 As Int = 12311
	Public vStr1 As String
	Public vSemaphore1 As Semaphore
	Public vBln2 As Boolean
	Public vMqttClient1 As MqttClient
	Public vInt2 As Int = 13692
	Public vB4XSerializator1 As B4XSerializator
	Public vStr2 As String
End Sub

Sub Client_Connected(z As Boolean)
	Try
		If z Then
			Main.vBln14 = False
			vBln2 = True
			vMqttClient1.Subscribe("all/" & Main.v_nnegozio & "/" & Main.v_numcassa & "/#", 0)
			Sub001("all/connect/" & Main.v_nnegozio & "/" & Main.v_numcassa, vB4XSerializator1.ConvertObjectToBytes(vStr2))
			tupload()
		Else
			ToastMessageShow("Errore di connessione al server ", True)
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Client_Disconnected
	Main.vBln14 = True
	vBln2 = False
End Sub

Sub Client_MessageArrived(str As String, bArr As Byte())
	Dim vSplit() As String = Regex.Split("/", str)
	Select vSplit(3)
		Case "Del"
			vTmr1.Enabled = False
			If File.Exists(Main.vStr17, vSplit(4)) Then
				Dim str3 As String = vSplit(4)
				File.Copy(Main.vStr17, str3, Main.vStr17 & "/Sent", vSplit(4))
				File.Delete(Main.vStr17, vSplit(4))
				If vLst1.Size > 0 Then
					vLst1.Clear
				End If
				Return
			End If
			vLst1.Clear
			Return
		Case "File"
			If vBln2 Then
				Dim vOpenOutput As OutputStream = File.OpenOutput(Main.vStr16, vSplit(4), False)
				vOpenOutput.WriteBytes(bArr, 0, bArr.Length)
				vOpenOutput.Flush
				vOpenOutput.Close
				Sub001("all/Azzera/" & vSplit(1) & "/" & vSplit(2) & "/" & vSplit(4), vB4XSerializator1.ConvertObjectToBytes(vStr2))
				If Main.v_attivainserimentocliente Then
					mod1.Sub126(vSplit(4).Replace("PerCasse", "").Replace(".zip", ""), "1", "Ricevuto dalla cassa ")
				End If
				CallSub(Main, "checkFileDaRemoto")
			End If
			Return
		Case "incassiV", "incassiV2", "incassiC", "incassiC2"
			vTmr1.Enabled = False
			If vBln2 Then
				If vSplit(3) = "incassiV" Or vSplit(3) = "incassiC" Then
					If File.Exists(mod1.vStr4, "TmpMov.zip") Then
						File.Delete(mod1.vStr4, "TmpMov.zip")
					End If
					Dim vOpenOutput2 As OutputStream = File.OpenOutput(mod1.vStr4, "TmpMov.zip", False)
					vOpenOutput2.WriteBytes(bArr, 0, bArr.Length)
					vOpenOutput2.Flush
					vOpenOutput2.Close
					CallSub("Main", "AddMovimentiDiAltreCasseDaUniandro")
				End If
				If vSplit(3).StartsWith("incassiV") Then
					CallSub2("Main", "EseguiStampeDay", False)
				Else If vSplit(3).StartsWith("incassiC") Then
					CallSub3("Main", "EseguiChiusura", False, "")
				End If
			End If
			Return
		Case "cliente"
			Dim vObjectToString As String = vB4XSerializator1.ConvertBytesToObject(bArr)
			CallSub2(Main, "ShowInfoCli", vObjectToString)
			Return
		Case "act"
			Dim vObjectToString2 As String = vB4XSerializator1.ConvertBytesToObject(bArr)
			If vObjectToString2 <> "OK" Then
				CallSub2(mod1.vStr1, "MsgboxOnly", vObjectToString2)
			Else
				Dim sql As SQL
				sql.Initialize(File.DirInternal, "Index.map", True)
				sql.ExecNonQuery("insert into IndiciTmp(indice,indice2) values('" & SmartStringFormatter("", Sub003(Main.v_ipserver)) & "'," & SmartStringFormatter("", DateTime.Now) & ")")
			End If
			Return
		Case "OkInsertCliente"
			Dim vObjectToString3 As String = vB4XSerializator1.ConvertBytesToObject(bArr)
			CallSub2(Clienti, "ResInsCliente", vObjectToString3)
			Return
		Case "giac"
			Dim vObjectToString4 As String = vB4XSerializator1.ConvertBytesToObject(bArr)
			CallSub3(Main, "ShowInfoPlu", vSplit(4), vObjectToString4)
			Return
		Case "getgdpr"
			Dim vObjectToString5 As String = vB4XSerializator1.ConvertBytesToObject(bArr)
			If vObjectToString5 <> "" Then
				CallSub2(Main, "ShowInfoGDPR", vObjectToString5)
			End If
			Return
		Case "OkValidaCoupon"
			Try
				Dim list As List = vB4XSerializator1.ConvertBytesToObject(bArr)
				CallSub2(Main, "ResValidaCoupon", list)
				Return
			Catch
				mod1.Sub217(LastException.Message)
				Return
			End Try
		Case "OkBruciaCoupon"
			If Main.vInt5 >= 0 Then
				CallSub(Main, "CallStampa")
			End If
			Return
		Case "Msg"
			vTmr1.Enabled = False
			Dim vObjectToString6 As String = vB4XSerializator1.ConvertBytesToObject(bArr)
			If vObjectToString6.StartsWith("Errore") Then
				ToastMessageShow(vObjectToString6, True)
				If vObjectToString6.Contains("Cliente non trovato") Then
					CallSub(Main, "AzzeraClienteDaServer")
				End If
			Else If vObjectToString6.StartsWith("OkCoupon") Then
				Dim vSplit2() As String = Regex.Split("_", vObjectToString6)
				CallSub2(Main, "ResComunica", vSplit2(1))
			Else If vObjectToString6.StartsWith("numdoc") Then
				Dim vSplit3() As String = Regex.Split("_", vObjectToString6)
				Dim str4 As String = ""
				If vSplit3(1) = "nfat" Then
					str4 = "F"
				Else If vSplit3(1) = "nric" Then
					str4 = "RIC"
				End If
				Main.vSql1.ExecNonQuery("update  progressivi set valore = " & vSplit3(2) & "  where codice ='" & str4 & "'")
				CallSub(Main, "CallStampa")
			Else If vObjectToString6.StartsWith("cliente") Then
				Dim vSplit4() As String = Regex.Split("_", vObjectToString6)
				If Main.vInt5 >= 0 Then
					CallSub(Main, "CallStampa")
				Else
					CallSub2(Main, "ApplicaCliente", vSplit4)
				End If
			Else If vObjectToString6 = "GetTastiera" Then
				If mod1.Sub074(False) Then
					If File.Exists(File.DirRootExternal, "keyboard.txt") Then
						If File.Exists(mod1.vStr4, "keyboard.txt") Then
							File.Delete(mod1.vStr4, "keyboard.txt")
						End If
						Dim dirRootExternal As String = File.DirRootExternal
						File.Copy(dirRootExternal, "keyboard.txt", mod1.vStr4, "keyboard.txt")
						Sub007("keyboard.txt")
					End If
				End If
			Else If vObjectToString6 = "chiusura" Then
				mod1.vBln11 = True
				If Not(File.Exists(File.DirDefaultExternal, "chiusura.flg")) Then
					File.WriteString(File.DirDefaultExternal, "chiusura.flg", "1")
				End If
			End If
			If Main.vBln14 Then
				Main.vBln14 = False
				tupload()
			End If
			Return
		Case Else
			Return
	End Select
End Sub

Sub Sub001(str As String, bArr As Byte())
	Try
		vMqttClient1.Publish2(str, bArr, 0, False)
		Return
	Catch
		Main.vBln14 = True
		vBln2 = False
		mod1.Sub217(LastException)
		Return
	End Try
End Sub

Sub Sub002(str As String, str2 As String)
	Try
		vStr2 = str2
		If vBln2 Then
			vMqttClient1.Close
		End If
		If Not(str.Contains(":")) Then
			str = str & ":" & vInt2
		End If
		Dim str3 As String = "tcp://" & SmartStringFormatter("", str) & ""
		vMqttClient1.Initialize("client", str3, "Terminale_" & Main.v_nnegozio & "_" & Main.v_numcassa)
		Dim mqttConnectOptionsWrapper As MqttConnectOptions
		Dim str4 As String = "utentE"
		Dim str5 As String = "!QAZxsw2"
		If Main.v_uid.Trim <> "" Then
			If Main.v_uid.Trim <> "InsUtente" Then
				str4 = Main.v_uid
			End If
		End If
		If Main.v_pwd.Trim <> "" Then
			If Main.v_pwd.Trim <> "InsPassword" Then
				str5 = Main.v_pwd
			End If
		End If
		mqttConnectOptionsWrapper.Initialize(str4, str5)
		mqttConnectOptionsWrapper.SetLastWill("all/disconnect/" & Main.v_nnegozio & "/" & Main.v_numcassa, vB4XSerializator1.ConvertObjectToBytes(vStr2), 0, False)
		vMqttClient1.Connect2(mqttConnectOptionsWrapper)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub003(str As String) As String
	mod1.vStr2 = "Sub DeCriptaDataSN As Long"
	Try
		Dim byteConverter As ByteConverter
		Dim bArr(0) As Byte
		Dim bArr2(0) As Byte
		Dim bArr3(0) As Byte
		Dim keyGeneratorWrapper As KeyGenerator
		Dim cipherWrapper As Cipher
		cipherWrapper.Initialize("DES/CBC/PKCS5Padding")
		cipherWrapper.InitialisationVector = Array As Byte(21, 32, 43, 54, 65, 76, 87, 98)
		keyGeneratorWrapper.Initialize("DES")
		keyGeneratorWrapper.KeyFromBytes(Array As Byte(31, 52, 83, 4, 35, 26, 47, 58))
		Return byteConverter.HexFromBytes(cipherWrapper.Encrypt(byteConverter.StringToBytes(str.Trim.ToUpperCase, "UTF8"), keyGeneratorWrapper.Key, True))
	Catch
		mod1.Sub217(LastException.Message)
		Return ""
	End Try
End Sub

Sub Sub004
	Try
		If vBln2 Then
			vMqttClient1.Close
			Return
		End If
		Return
	Catch
		Main.vBln14 = True
		vBln2 = False
		mod1.Sub217(LastException)
		Return
	End Try
End Sub

Sub Sub005(servletRequestWrapper As ServletRequest, servletResponseWrapper As ServletResponse)
	Try
		Dim vGetUploadedFile As String = servletRequestWrapper.GetUploadedFile("upfile")
		Dim sb2 As String = mod1.vStr4 & "/T" & servletRequestWrapper.GetParameter("matricola")
		Dim i As Int
		For i = 0 To 30
			Try
				File.Copy(Server.TempFolder, vGetUploadedFile, sb2, servletRequestWrapper.GetParameter("upfile"))
				Exit
			Catch
				mod1.Sub178(300)
			End Try
		Next
		File.Delete(Server.TempFolder, vGetUploadedFile)
		Dim vTmp As String = Sub008(sb2, servletRequestWrapper.GetParameter("upfile"))
		If vTmp <> "Err" Then
			servletResponseWrapper.SendString(vTmp)
			Return
		End If
		servletResponseWrapper.SendString("Errore di comunicazione ..")
		Return
	Catch
		servletResponseWrapper.SendString("Err")
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub006
	If vBln2 Then
		If File.Exists(Main.vStr17, vLst1.Get(0)) Then
			Dim sb As String = "all/File/" & Main.v_nnegozio & "/" & Main.v_numcassa & "/" & vLst1.Get(0)
			Sub001(sb, Bit.InputStreamToBytes(File.OpenInput(Main.vStr17, vLst1.Get(0))))
			vTmr1.Enabled = True
			Return
		End If
		Return
	End If
End Sub

Sub Sub007(str As String)
	If vBln2 Then
		If File.Exists(mod1.vStr4, str) Then
			Dim sb As String = "all/File/" & Main.v_nnegozio & "/" & Main.v_numcassa & "/" & str
			Sub001(sb, Bit.InputStreamToBytes(File.OpenInput(mod1.vStr4, str)))
			If vTmr1.Interval <> 10000 Then
				vTmr1.Interval = 10000
			End If
			vTmr1.Enabled = True
			Return
		End If
		Return
	End If
End Sub

Sub sendmessage(str As String)
	If vBln2 Then
		Sub001("all/Msg/" & Main.v_nnegozio & "/" & Main.v_numcassa, vB4XSerializator1.ConvertObjectToBytes(str))
		vTmr1.Enabled = True
		Return
	End If
End Sub

Sub sendmessagebo(str As String)
	If vBln2 Then
		Sub001("SrvBO/Msg/" & Main.v_nnegozio & "/" & Main.v_numcassa & "/" & str, vB4XSerializator1.ConvertObjectToBytes("giac"))
		Return
	End If
End Sub

Sub sendobj(obj As Object, str As String) As Boolean
	If Not(vBln2) Then
		Return False
	End If
	Sub001("all/" & str & "/" & Main.v_nnegozio & "/" & Main.v_numcassa, vB4XSerializator1.ConvertObjectToBytes(obj))
	vTmr1.Interval = 60000
	vTmr1.Enabled = True
	Return True
End Sub

Sub sendobjbo(obj As Object, str As String) As Boolean
	If Not(vBln2) Then
		Return False
	End If
	Sub001("SrvBO/" & str & "/" & Main.v_nnegozio & "/" & Main.v_numcassa, vB4XSerializator1.ConvertObjectToBytes(obj))
	Return True
End Sub

Sub Server_HandleRequest(servletRequestWrapper As ServletRequest, servletResponseWrapper As ServletResponse)
	Try
		vSemaphore1.Lock
		Select servletRequestWrapper.RequestURI.replace("/", "")
			Case "check"
				Dim sb2 As String = DateTime.Date(mod1.Sub058).SubString2(3, 5) & "/" & DateTime.Date(mod1.Sub058).SubString2(0, 2) & DateTime.Date(mod1.Sub058).SubString(5) & " " & DateTime.Time(mod1.Sub058)
				Dim sb3 As String = IIf(mod1.vStr1 <> "Main", "1", "0") & IIf(mod1.vBln11, "1", "0") & IIf(Main.vBln5, "1", "0")
				servletResponseWrapper.SendString(modfunstr.left(sb3 & "00000000000000000000", 20) & sb2)
				vSemaphore1.Unlock
			Case "Variazioni"
				Dim strArr() As String = Array("Anagra.db", "Config.txt")
				Dim archiverForB4A As ArchiverForB4A
				Try
					Dim dirDefaultExternal As String = File.DirDefaultExternal
					archiverForB4A.ZipFiles(dirDefaultExternal, strArr, File.DirRootExternal, "Anagra.zip", "")
					servletResponseWrapper.SetContentType("application/octet-stream")
					servletResponseWrapper.SendFile(File.DirRootExternal, "Anagra.zip")
					vSemaphore1.Unlock
				Catch
					servletResponseWrapper.SendString("Errore di Compressione File ...")
					Return
				End Try
			Case "Rilevazione"
				Sub005(servletRequestWrapper, servletResponseWrapper)
				vSemaphore1.Unlock
			Case Else
				vSemaphore1.Unlock
		End Select
		Return
	Catch
		servletResponseWrapper.Status = 500
		Log("Error serving request: " & LastException)
		servletResponseWrapper.SendString("Errore: " & LastException)
		vSemaphore1.Unlock
		Return
	End Try
End Sub

Sub Service_Create
	If Main.v_attivaterminale Then
		If Main.vBln20 Then
			vTmr1.Initialize("timerWaitmqtt", 5000)
			vTmr1.Enabled = False
			vTmr2.Initialize("timerHellomqtt", 60000)
			vTmr2.Enabled = True
			vLst1.Initialize
		End If
	End If
	Server.Initialize("Server")
	Server.Start(vInt1)
	Dim notificationWrapper As Notification
	notificationWrapper.Initialize
	notificationWrapper.Icon = "icon"
	Dim vObjectToCharSequence As Object = "Server di Terminale in esecuzione"
	Dim vObjectToCharSequence2 As Object = ""
	notificationWrapper.SetInfoNew(vObjectToCharSequence, vObjectToCharSequence2, Main)
	Dim serviceHelper As ServiceHelper = Service
	Dim serviceHelper2 As ServiceHelper = Service
	serviceHelper.AutomaticForegroundMode = 3
	Service.StartForeground(1, notificationWrapper)
	vSemaphore1.Initialize(True)
End Sub

Sub Service_Destroy
End Sub

Sub Service_Start(intentWrapper As Intent)
	If Not(Main.v_attivaterminale) Then
		Return
	End If
	If Main.vBln20 Then
		Main.vBln14 = True
		vBln2 = False
		Sub002(Main.v_ipserver, Main.v_nnegozio & "__" & Main.v_numcassa)
		Return
	End If
End Sub

Sub Timerhellomqtt_Tick
	If Main.vBln20 Then
		If Main.v_attivaterminale And Not(vBln2) Then
			Sub002(Main.v_ipserver, Main.v_nnegozio & "__" & Main.v_numcassa)
			Return
		End If
	End If
	If Not(Main.vBln20) Then
		Return
	End If
	If Main.v_attivaterminale Then
		Dim sb3 As String = DateTime.Date(mod1.Sub058).SubString2(3, 5) & "/" & DateTime.Date(mod1.Sub058).SubString2(0, 2) & DateTime.Date(mod1.Sub058).SubString(5) & " " & DateTime.Time(mod1.Sub058)
		sendmessage("hello" & (IIf(mod1.vStr1 <> "Main", "1", "0") & IIf(mod1.vBln11, "1", "0") & IIf(Main.vBln5, "1", "0")) & sb3)
		Return
	End If
End Sub

Sub Timerwaitmqtt_Tick
	vTmr1.Enabled = False
	ToastMessageShow("Il movimento non è stato inviato in quanto l'applicazione Server non risulta essere attiva", True)
	Main.vBln14 = True
	vLst1.Clear
End Sub

Sub tupload
	If Main.vBln14 Then
		Return
	End If
	If Main.v_attivaterminale And vLst1.Size = 0 Then
		If File.Exists(Main.vStr17, "MultiExport.zip") Then
			vLst1.Add("MultiExport.zip")
			Sub006()
		Else
			Initialize
			Dim vListFiles As List = File.ListFiles(Main.vStr17)
			Dim list As List
			list.Initialize
			Dim size As Int = vListFiles.Size - 1
			Dim i As Int = 0
			Dim i2 As Int
			For i2 = 0 To size
				Dim vObjectToString As String = vListFiles.Get(i2)
				If vObjectToString.ToLowerCase.StartsWith("dacasse") And vObjectToString.ToLowerCase.EndsWith(".tmp") Then
					list.Add(vObjectToString)
					i = i + 1
				End If
			Next
			If list.Size = 0 Then
				Return
			End If
			If list.Size = 1 Then
				vLst1.Add(list.Get(0))
				Sub006()
			Else If list.Size > 1 And list.Size > 0 Then
				Dim strArr(list.Size) As String
				Dim size2 As Int = list.Size - 1
				Dim i3 As Int
				For i3 = 0 To size2
					strArr(i3) = list.Get(i3)
				Next
				Dim archiverForB4A As ArchiverForB4A
				archiverForB4A.ZipFiles(Main.vStr17, strArr, Main.vStr17, "MultiExport.zip", "")
				Dim length As Int = strArr.Length - 1
				Dim i4 As Int
				For i4 = 0 To length
					File.Delete(Main.vStr17, strArr(i4))
				Next
				vLst1.Add("MultiExport.zip")
				Sub006()
			End If
		End If
	End If
End Sub

Sub Sub008(str As String, str2 As String) As String
	Dim archiverForB4A As ArchiverForB4A
	Try
		If File.Exists(str, "rilevazione.txt") Then
			File.Delete(str, "rilevazione.txt")
		End If
		archiverForB4A.UnZip(str, str2, str, "")
		If Not(File.Exists(str, "rilevazione.txt")) Then
			File.Delete(str, str2)
			Return "Err"
		End If
		If File.Exists(str, "rilevazione.txt") Then
			File.Delete(str, "rilevazione.txt")
		End If
		If File.Exists(str, str2) Then
			File.Copy(str, str2, str & "/OLD", str2)
		End If
		Return "Invio dati eseguito correttamente"
	Catch
		File.Delete(str, str2)
		Return "Err"
	End Try
End Sub

