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
	Public vTmr1 As Timer
	Public vTmr2 As Timer
	Public vTmr3 As Timer
	Public vBln1 As Boolean
	Public vBln2 As Boolean
	Public vv4 As Boolean
	Public vBln3 As Boolean
	Public vMqttClient1 As MqttClient
	Public vInt1 As Int = 13693
	Public vB4XSerializator1 As B4XSerializator
	Public vStr1 As String
	Public vStr2 As String
End Sub

Sub Client_Connected(z As Boolean)
	Try
		If z Then
			vBln3 = True
			vMqttClient1.Subscribe("all/Term/#", 0)
			If vv4 Then
				vv4 = False
				Sub001("all/Srv/Restore", vB4XSerializator1.ConvertObjectToBytes(vStr1))
			Else
				Sub001("all/Srv/connect", vB4XSerializator1.ConvertObjectToBytes(vStr1))
			End If
		Else
			ToastMessageShow("Errore di connessione al ServiceBox (" & LastException.Message & ")", True)
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Client_Disconnected
	vBln3 = False
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/rpidevice.java, metodo _client_messagearrived (riga 223).
Sub Client_MessageArrived(str As String, bArr As Byte())
	Dim vSplit() As String = Regex.Split("/", str)
	vTmr2.Enabled = False
	vTmr3.Enabled = False
	Select vSplit(3)
		Case "GetDB"
			If Main.vInt18 = 0 Then
				sendcmd("", "ErrLicenza")
				Return
			End If
			Dim map As Map = vB4XSerializator1.ConvertBytesToObject(bArr)
			Dim list As List
			list.Initialize
			Dim map2 As Map
			map2.Initialize
			map2.Put("anagra", map.Get("anagra"))
			map2.Put("venduto", map.Get("venduto"))
			Dim vObjectToLongNumber As Long = map.Get("anagra")
			If 0 <> map.Get("anagra") Then
			End If
			list.Add("Anagra.db")
			map2.Put("anagra", File.LastModified(File.DirDefaultExternal, "Anagra.db"))
			Dim vObjectToLongNumber2 As Long = map.Get("venduto")
			If 0 <> map.Get("venduto") Then
			End If
			list.Add("Venduto.db")
			map2.Put("venduto", File.LastModified(File.DirDefaultExternal, "Venduto.db"))
			If list.Size = 0 Then
				sendcmd("", "Allineati")
			Else
				If list.Size = 1 Then
					Dim strArr() As String = Array(list.Get(0), "Mappa.txt", "Config.txt")
					File.WriteMap(File.DirDefaultExternal, "Mappa.txt", map2)
					Dim archiverForB4A As ArchiverForB4A
					Dim dirDefaultExternal As String = File.DirDefaultExternal
					archiverForB4A.ZipFiles(dirDefaultExternal, strArr, mod1.vStr4, "UpdAnagra.zip", "")
				Else
					Dim strArr2() As String = Array(list.Get(0), list.Get(1), "Mappa.txt", "Config.txt")
					File.WriteMap(File.DirDefaultExternal, "Mappa.txt", map2)
					Dim archiverForB4A2 As ArchiverForB4A
					Dim dirDefaultExternal2 As String = File.DirDefaultExternal
					archiverForB4A2.ZipFiles(dirDefaultExternal2, strArr2, mod1.vStr4, "UpdAnagra.zip", "")
				End If
				Sub001("all/Srv/File/UpdAnagra.zip", Bit.InputStreamToBytes(File.OpenInput(mod1.vStr4, "UpdAnagra.zip")))
				vTmr2.Interval = 30000
				vTmr2.Enabled = True
			End If
			Return
		Case "OKStampaDoc", "OKStampaDocC"
			Dim sb2 As String = mod1.vStr4 & "/TMP"
			Dim vOpenOutput As OutputStream = File.OpenOutput(sb2, "doc.zip", False)
			vOpenOutput.WriteBytes(bArr, 0, bArr.Length)
			vOpenOutput.Flush
			vOpenOutput.Close
			If File.Exists(sb2, "doc.zip") Then
				Try
					UnZip(sb2, "doc.zip", sb2, "")
				Catch
					CallSub2(mod1.vStr1, "MsgboxOnly", "La stampa generata dal ServiceBox non è corretta")
					mod1.Sub217(LastException)
				End Try
				If File.Exists(sb2, "doc.pdf") Then
					If vStr2 = "TipoDocFatturaFM" Then
						CallSub(fatturafm, "SetInClosing")
					End If
					If vSplit(3) = "OKStampaDocC" And vSplit.Length > 5 Then
						Dim str2 As String = vSplit(4)
						Dim equals As Boolean = vSplit(5) = "1"
						Dim str3 As String = ""
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from clienti where codice ='" & str2 & "'") > 0 Then
							str3 = Main.vSql1.ExecQuerySingleResult("Select mail from clienti where codice ='" & str2 & "'")
						End If
						If str3 <> "" Then
							Dim vTmp As String = mod1.Sub059(mod1.Sub058)
							mod1.vStr5 = "Fattura__" & vTmp & ".pdf"
							Dim sb4 As String = mod1.vStr4 & "/fatture"
							File.Copy(sb2, "doc.pdf", sb4, mod1.vStr5)
							If equals Then
								Dim object As Class = fatturafm
								CallSubDelayed3(object, "PreparaMailVisualizza", mod1.vStr5, str3)
								mod1.vStr5 = ""
								Return
							End If
						End If
					End If
					mod1.Sub137("file://" & File.Combine(sb2, "doc.pdf"))
				End If
			Else
				CallSub2(mod1.vStr1, "MsgboxOnly", "La stampa generata dal ServiceBox non è corretta")
			End If
			Return
		Case "OKGetOb"
			Dim sb6 As String = mod1.vStr4 & "/TMP"
			Dim vOpenOutput2 As OutputStream = File.OpenOutput(sb6, "Tmp2.txt", False)
			vOpenOutput2.WriteBytes(bArr, 0, bArr.Length)
			vOpenOutput2.Flush
			vOpenOutput2.Close
			If File.Exists(sb6, "Tmp2.txt") Then
				UnZip(sb6, "Tmp2.txt", sb6, "")
				If File.Exists(sb6, "VendutoTipo2.db") Then
					File.Copy(sb6, "VendutoTipo2.db", sb6, "Venduto.db")
					File.Delete(sb6, "VendutoTipo2.db")
					Main.vStr15 = "VendutoP2"
					CallSub(Main, "LanciaStampa")
				End If
			Else
				CallSub2(mod1.vStr1, "MsgboxOnly", "Il file sul ServiceBox non è corretto")
			End If
			Return
		Case "ErrGetOb"
			CallSub2(mod1.vStr1, "MsgboxOnly", "Non è stato trovato il salvataggio sul ServiceBox")
			Return
		Case "ErrStampaDoc"
			CallSub2(mod1.vStr1, "MsgboxOnly", "errore durante la generazione del documento sul ServiceBox")
			Return
		Case "ErrObsoleti"
			Sub005(vB4XSerializator1.ConvertBytesToObject(bArr))
			Return
		Case "OKObsoleti"
			If File.Exists(mod1.vStr4, "temp.txt") Then
				File.Delete(mod1.vStr4, "temp.txt")
			End If
			If Main.vStr4 = "RunObsoleti" Then
				CallSub2(Main, "RunObsoleti", True)
			Else
				If Main.vStr4 = "AllineaArchivio" Then
					CallSub2(Main, "CallAllineaArchivio", True)
					Main.vStr4 = ""
				Else
					CallSub3(Main, "EseguiChiusura", True, "")
				End If
			End If
			Return
		Case "OK"
			If vBln1 Then
				Main.v_datalastbackup = mod1.Sub058
				mod1.Sub216
				CallSub(Main, "closeBK")
			Else If vBln2 Then
				CallSub2(mod1.vStr1, "MsgboxOnly", "Dati inviati correttamente ...")
			End If
			Return
		Case "ReturnListaBK"
			Dim list2 As List = vB4XSerializator1.ConvertBytesToObject(bArr)
			CallSub2(Configura, "ChiediFileddaRipristinare", list2)
			Return
		Case "FileRestoreBK"
			If vBln3 Then
				Dim vOpenOutput3 As OutputStream = File.OpenOutput(mod1.vStr4, "Tmpdb.zip", False)
				vOpenOutput3.WriteBytes(bArr, 0, bArr.Length)
				vOpenOutput3.Flush
				vOpenOutput3.Close
				CallSub(Configura, "RipristinaIlFile")
			End If
			Return
		Case "FileRestore"
			If vBln3 Then
				Dim vOpenOutput4 As OutputStream = File.OpenOutput(mod1.vStr4 & "/files", "BKAnagra.zip", False)
				vOpenOutput4.WriteBytes(bArr, 0, bArr.Length)
				vOpenOutput4.Flush
				vOpenOutput4.Close
				CallSub(Main, "RestoreFile")
			End If
			Return
		Case "ErrRestore", "ErrRestoreBK"
			CallSub2(mod1.vStr1, "MsgboxOnly", "Non è stato trovato il salvataggio sul ServiceBox")
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
		vBln3 = False
		mod1.Sub217(LastException)
		Return
	End Try
End Sub

Sub Sub002(str As String, str2 As String)
	Try
		vStr1 = str2
		If vBln3 Then
			vMqttClient1.Close
		End If
		vMqttClient1.Initialize("client", "tcp://" & SmartStringFormatter("", str & ":" & vInt1) & "", "Term")
		Dim mqttConnectOptionsWrapper As MqttConnectOptions
		Dim str3 As String = "!QAZxsw2"
		If Main.v_sbpwd <> "" Then
			str3 = Main.v_sbpwd
		End If
		mqttConnectOptionsWrapper.Initialize("utentE", str3)
		mqttConnectOptionsWrapper.SetLastWill("all/Srv/disconnect", vB4XSerializator1.ConvertObjectToBytes(vStr1), 0, False)
		vMqttClient1.Connect2(mqttConnectOptionsWrapper)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub003
	Try
		If vBln3 Then
			vMqttClient1.Close
			Return
		End If
		Return
	Catch
		vBln3 = False
		mod1.Sub217(LastException)
		Return
	End Try
End Sub

Sub Sub004
	Dim vTmp As String = mod1.Sub059(mod1.Sub058)
	If File.Exists(mod1.vStr4, "temp.txt") Then
		File.Copy(mod1.vStr4, "temp.txt", mod1.vStr4, "temp" & vTmp & ".txt")
		File.Delete(mod1.vStr4, "temp.txt")
		Return
	End If
End Sub

Sub Sub005(str As String)
	Sub004()
	Dim vObjectToNumber As Int = CallSub2(mod1.vStr1, "MsgboxAsk", str & CRLF & "Si desidera proseguire ugualmente ? ")
	If vObjectToNumber = -1 Then
		If Main.vStr4 = "RunObsoleti" Then
			CallSub2(Main, "RunObsoleti", True)
		Else
			If Main.vStr4 = "AllineaArchivio" Then
				CallSub2(Main, "CallAllineaArchivio", True)
				Main.vStr4 = ""
			Else
				CallSub3(Main, "EseguiChiusura", True, "")
			End If
		End If
	End If
	ProgressDialogHide
End Sub

Sub sendanagraperdoc(str As String)
	vStr2 = str
	Sub001("all/Srv/File/" & str, Bit.InputStreamToBytes(File.OpenInput(mod1.vStr4, "BKAnagra.zip")))
	vTmr2.Interval = 30000
	vTmr2.Enabled = True
End Sub

Sub sendcmd(str As String, str2 As String) As Boolean
	If vBln3 Then
		Sub001("all/Srv/" & str2, vB4XSerializator1.ConvertObjectToBytes(str))
		If str.EndsWith("obsoleti") Then
			vTmr3.Enabled = True
			Return True
		End If
		vTmr2.Enabled = True
		Return True
	End If
	Return False
End Sub

Sub Sub006(str As String, str2 As String) As Boolean
	If Not(vBln3) Then
		Return False
	End If
	Log("all/Order/" & str2)
	Sub001("all/Order/" & str2, vB4XSerializator1.ConvertObjectToBytes(str))
	Return True
End Sub

Sub sendobsoleti
	Initialize
	Dim strArr() As String = Array("Anagra.db")
	Dim archiverForB4A As ArchiverForB4A
	Dim dirDefaultExternal As String = File.DirDefaultExternal
	archiverForB4A.ZipFiles(dirDefaultExternal, strArr, mod1.vStr4, "temp.txt", "")
	Sub001("all/Srv/File/dbobsoleti", Bit.InputStreamToBytes(File.OpenInput(mod1.vStr4, "temp.txt")))
	vTmr3.Enabled = True
End Sub

Sub Service_Create
	vTmr2.Initialize("timerWaitmqtt", 30000)
	vTmr2.Enabled = False
	vTmr3.Initialize("timerWaitobsoleti", 15000)
	vTmr3.Enabled = False
	vTmr1.Initialize("timerHellomqtt", 60000)
	vTmr1.Enabled = True
	Dim notificationWrapper As Notification
	notificationWrapper.Initialize
	notificationWrapper.Icon = "icon"
	Dim vObjectToCharSequence As Object = "Server RPI in esecuzione"
	Dim vObjectToCharSequence2 As Object = ""
	notificationWrapper.SetInfoNew(vObjectToCharSequence, vObjectToCharSequence2, Main)
	Dim serviceHelper As ServiceHelper = Service
	Dim serviceHelper2 As ServiceHelper = Service
	serviceHelper.AutomaticForegroundMode = 3
	Service.StartForeground(1, notificationWrapper)
End Sub

Sub Service_Destroy
End Sub

Sub Service_Start(intentWrapper As Intent)
	vBln3 = False
	Sub002(Main.v_iprpi, "Term")
End Sub

Sub Timerhellomqtt_Tick
	If Not(vBln3) Then
		Sub002(Main.v_iprpi, "Term")
		Return
	End If
End Sub

Sub Timerwaitmqtt_Tick
	vTmr2.Enabled = False
	ToastMessageShow("L'applicazione Server non risulta essere attiva", True)
	vStr2 = ""
	If vBln1 Then
		CallSub(Main, "closeBK")
		Return
	End If
End Sub

Sub Timerwaitobsoleti_Tick
	vTmr3.Enabled = False
	Sub005("Non è stato possibile aggiornare i dati obsoleti .")
End Sub

Sub tupload(str As String, str2 As String) As Boolean
	vBln1 = str2.EndsWith("DB.zip")
	vBln2 = (str2 = "UpdWeb.zip")
	If vBln3 Then
		If File.Exists(str, str2) Then
			If vBln1 Then
				Sub001("all/Srv/File/" & str2, Bit.InputStreamToBytes(File.OpenInput(str, str2)))
				vTmr2.Interval = 120000
			Else
				Sub001("all/Order/File/" & str2, Bit.InputStreamToBytes(File.OpenInput(str, str2)))
				vTmr2.Interval = 30000
			End If
			vTmr2.Enabled = True
			Return True
		End If
	End If
	Return False
End Sub

