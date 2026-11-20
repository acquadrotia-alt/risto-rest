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
	Public vv1 As Int
	Public vv2 As Timer
	Public vv3 As Timer
	Public vv4 As Boolean
	Public vv5 As Boolean
	Public vv6 As Boolean
	Public vv7 As Boolean
	Public vv0 As Int
	Public vInt1 As Int
	Public vInt2 As Int
	Public vInt3 As Int
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/httpclient.java, metodo m0… (riga 189).
Sub Sub001(map As Map, z As Boolean)
	Dim z2 As Boolean = True
	map.Put("TipoProgramma", 2)
	map.Put("Matricola", Main.v_matricola)
	map.Put("Versione", Application.VersionName)
	map.Put("DataVersione", Main.vStr24)
	map.Put("DataOra", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
	If Main.vSql1.ExecQuerySingleResult("Select count(*)  FROM confstampe where stato =1") > 0 Then
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select distinct(ip)  FROM confstampe where stato =1")
		map.Put("NumeroStampantiNF", cursorWrapper2.RowCount)
		cursorWrapper2.Close
	Else
		map.Put("NumeroStampantiNF", 0)
	End If
	Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select count(*) from Palmari where Attivo = 1")
	map.Put("NumeroPalmari", parseDouble)
	If z Then
		map.Put("PartitaIva", Main.v_webapipi)
	End If
	map.Put("AnnoBS", Main.vInt8)
	map.Put("InvioFE", Main.v_inviofe)
	map.Put("Spooler", Main.v_spooler)
	map.Put("Wpalmristorandro", parseDouble > 0)
	If Main.v_webapidatiretailer Then
		map.Put("RagioneSociale", modfunstr.left(Main.v_webapiragsoc, 50))
		map.Put("PartitaIvaRetailer", Main.v_webapipiesercente)
		map.Put("CAP", Main.v_webapicapesercente)
	Else
		map.Put("PartitaIvaRetailer", "")
		map.Put("RagioneSociale", "")
		map.Put("CAP", "")
	End If
	map.Put("Uniandro", Main.vBln20)
	map.Put("Server", Main.vBln24)
	map.Put("Client", Main.vBln25)
	map.Put("Statistichedaremoto", Main.vInt18 = 1)
	map.Put("CashManagement", Main.vBln23)
	map.Put("MotorePromozionale", Main.vBln21)
	map.Put("FrontaliniEtichette", False)
	map.Put("Scadenzainchiaro", Main.vInt21)
	map.Put("DataScadenza", mod1.Sub057(DateTime.Date(Main.vLng1) & " " & DateTime.Time(mod1.Sub058)))
	map.Put("Pro", Main.vBln16)
	map.Put("Visibile", True)
	If Main.v_codattivazione = "" Then
	End If
	z2 = False
	map.Put("BaseST", z2)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub aggiornastatoportale(bmsg As Boolean)
	Dim rs As ResumableSub
	Dim stoken As String
	Dim rsget As ResumableSub
	Dim besiste As Boolean
	Dim rsputapi As ResumableSub
	Dim bokputapi As Boolean
	Dim rspostapi As ResumableSub
	Dim bokpostapi As Boolean
	Dim rsgetaggiornamento As ResumableSub
	Dim besisteagg As Boolean
	Dim bres As Boolean
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 52
					rsCatchState = 51
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 51
					Continue
				Case 4
					rsState = 9
					If Main.v_webapipi <> "" Then
						If Main.v_webapiindirizzo <> "" Then
							If Main.v_matricola <> "Demo  Demo" Then
								Continue
							End If
						End If
					End If
					rsState = 6
					Continue
				Case 6
					rsState = 9
					Return
				Case 9
					rsState = 10
					'rs = ResumableSub
					rs = GetAPITokenas(Main.v_webapiindirizzo)
					Wait For (rs) Complete (wf53_0 As String)
					rsState = 53
					Continue
				Case 10
					rsState = 49
					If stoken = "" Then
						rsState = 12
						Continue
					Else
						rsState = 14
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 12
				Case 12
					rsState = 49
					Sub008("Non è possibile ottenere un token dal server")
					Return
				Case 14
					rsState = 15
					'rsget = ResumableSub
					Dim str As String = stoken
					rsget = GetAPI(str, "/Datimatricola/" & Main.v_matricola)
					Wait For (rsget) Complete (wf54_0 As Boolean)
					rsState = 54
					Continue
				Case 15
					rsState = 32
					If besiste Then
						rsState = 17
						Continue
					Else
						rsState = 25
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 17
				Case 17
					rsState = 18
					'rsputapi = ResumableSub
					rsputapi = PutAPI(stoken, "/Datimatricola")
					Wait For (rsputapi) Complete (wf56_0 As Boolean)
					rsState = 56
					Continue
				Case 18
					rsState = 23
					If bokputapi Then
						Continue
					Else
						rsState = 20
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 20
				Case 20
					rsState = 23
					Return
				Case 23
					rsState = 32
					Continue
				Case 25
					rsState = 26
					'rspostapi = ResumableSub
					rspostapi = PostAPI(stoken)
					Wait For (rspostapi) Complete (wf57_0 As Boolean)
					rsState = 57
					Continue
				Case 26
					rsState = 31
					If bokpostapi Then
						Continue
					Else
						rsState = 28
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 28
				Case 28
					rsState = 31
					Return
				Case 31
					rsState = 32
					Continue
				Case 32
					rsState = 33
					Sleep(50)
					rsState = 58
					Continue
				Case 33
					rsState = 48
					If besisteagg Then
						rsState = 35
						Continue
					Else If Not(bmsg) Then
						Continue
					Else
						rsState = 47
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 35
				Case 35
					rsState = 36
					bres = CallSub(Main, "AggiornaDaWebApi")
					Continue
				Case 36
					rsState = 45
					If bmsg And Not(bres) Then
						rsState = 38
						Continue
					End If
					Continue
				Case 38
					rsState = 39
					Continue
				Case 39
					rsState = 44
					If vv6 Then
						Continue
					Else
						rsState = 41
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 41
				Case 41
					rsState = 44
					Sub008("Non è stato eseguito nessun aggiornamento ")
					Continue
				Case 44
					rsState = 45
					Continue
				Case 45
					rsState = 48
					Continue
				Case 47
					rsState = 48
					Sub008("Non esiste nessun aggiornamento dal server")
					Continue
				Case 48
					rsState = 49
					Continue
				Case 49
					rsState = 52
					Continue
				Case 51
					rsState = 52
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 52
					rsState = -1
					rsCatchState = 0
					Continue
				Case 53
					rsState = 10
					stoken = wf53_0
					Continue
				Case 54
					rsState = 15
					besiste = wf54_0
					Sleep(50)
					rsState = 55
					Continue
				Case 55
					rsState = 15
					Continue
				Case 56
					rsState = 18
					bokputapi = wf56_0
					Continue
				Case 57
					rsState = 26
					bokpostapi = wf57_0
					Continue
				Case 58
					rsState = 33
					vv6 = False
					'rsgetaggiornamento = ResumableSub
					Dim str2 As String = stoken
					rsgetaggiornamento = GetAPI(str2, "/Aggiornamentoapi?Matricola==" & SmartStringFormatter("", Main.v_matricola) & "&Stato==1")
					Wait For (rsgetaggiornamento) Complete (wf59_0 As Boolean)
					rsState = 59
					Continue
				Case 59
					rsState = 33
					besisteagg = wf59_0
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

Sub complete(str As String)
End Sub

Sub cancelglory As String
	If Main.v_ipvis = "" Then
		Return "Configurare l'indirizzo Ip del VisionDroid"
	End If
	If Not(vv7) Then
		If Main.vBln11 Then
			Dim httpjobVar As httpjob
			httpjobVar.Initialize("glorySendImporto", Me)
			httpjobVar.Sub021("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=cancel", "")
			If Main.v_logvd Then
				mod1.Sub219("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=cancel", "")
			End If
			Return "CancelOK"
		End If
	End If
	Return "il Cash Management risulta essere offline"
End Sub

Sub chiamac(str As String, str2 As String)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("CameriereC", Me)
	httpjobVar.Sub021("http://" & str & ":12315/chiamac_" & str2, "")
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub comunicaconinfinity(url As String)
	Dim sresult As String
	Dim j As httpjob
	Dim smsg As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					sresult = ""
					Continue
				Case 1
					rsState = 22
					rsCatchState = 21
					rsState = 3
					Continue
				Case 2, 5, 8, 11, 15, 17, 18, 20
					Continue
				Case 3
					rsState = 4
					rsCatchState = 21
					'j = httpjob
					j.Initialize("", Me)
					j.Sub004(url)
					Wait For (j) Jobdone (wf23_0 As httpjob)
					rsState = 23
					Continue
				Case 4
					rsState = 13
					If j.vBln1 Then
						rsState = 6
					Else
						rsState = 12
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 6
				Case 6
					rsState = 7
					smsg = j.Sub012
					Continue
				Case 7
					rsState = 10
					If smsg = "OK" Then
						Continue
					Else
						rsState = 9
					End If
					'(fallthrough java verso il case successivo)
					rsState = 9
				Case 9
					rsState = 10
					sresult = smsg
					Continue
				Case 10
					rsState = 13
					Continue
				Case 12
					rsState = 13
					sresult = "Errore di comunicazione con il gestore del distributore automatico"
					Continue
				Case 13
					rsState = 14
					j.Sub024
					Continue
				Case 14
					rsState = 19
					If sresult = "" Then
						Continue
					Else
						rsState = 16
					End If
					'(fallthrough java verso il case successivo)
					rsState = 16
				Case 16
					rsState = 19
					CallSub2(mod1.vStr1, "MsgboxOnly", sresult)
					Continue
				Case 19
					rsState = 22
					Continue
				Case 21
					rsState = 22
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 22
					rsState = -1
					rsCatchState = 0
					Continue
				Case 23
					rsState = 4
					j = wf23_0
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub comunicaconinviafe(url As String, parametro As String) As ResumableSub
	Dim limit43 As Int
	Dim step43 As Int
	Dim bok As Boolean
	Dim strmsg As String
	Dim ts As String
	Dim bsetting As Boolean
	Dim j As httpjob
	Dim msg As String
	Dim inumcicli As Int
	Dim x As Int
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return Null
				Case 0
					rsState = 1
					bok = False
					strmsg = ""
					Continue
				Case 1
					rsState = 69
					rsCatchState = 68
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 68
					ts = ""
					bsetting = (url.Contains("Settings") Or url.Contains("_SQL"))
					Continue
				Case 4
					rsState = 9
					If Not(bsetting) Then
						rsState = 6
						Continue
					Else
						rsState = 8
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 6
				Case 6
					rsState = 9
					ts = url.Replace("http://127.0.0.1:12512/R__INVIO__", "")
					ts = ts.SubString2(3, 22)
					Continue
				Case 8
					rsState = 9
					url = url & "__ __"
					Continue
				Case 9
					rsState = 10
					url = url & Application.VersionCode & "__" & IIf(Main.vBln25, "C", " ") & "__"
					Continue
				Case 10
					rsState = 15
					If Not(File.Exists(File.DirDefaultExternal & "/FE", "TmpRes.txt")) Then
						Continue
					Else
						rsState = 12
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 12
				Case 12
					rsState = 15
					File.Delete(File.DirDefaultExternal & "/FE", "TmpRes.txt")
					Continue
				Case 15
					rsState = 16
					'j = httpjob
					j.Initialize("", Me)
					j.Sub004(url)
					Continue
				Case 16
					rsState = 19
					If Main.v_asyncfe > 0 And Not(bsetting) Then
						rsState = 18
						Continue
					End If
					Continue
				Case 18
					rsState = 19
					DoEvents
					CallSub3(mod1.vStr1, "ProgressOnly", True, "Attendere l'invio della fattura ...")
					Continue
				Case 19
					rsState = 20
					Wait For (j) Jobdone (wf79_0 As httpjob)
					rsState = 79
					Continue
				Case 20
					rsState = 37
					If Not(bok) Then
						rsState = 22
						Continue
					Else
						rsState = 28
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 22
				Case 22
					rsState = 23
					strmsg = "Errore di comunicazione con il programma InvioFE"
					Continue
				Case 23
					rsState = 26
					If Main.v_asyncfe <> 0 And Not(bsetting) Then
						Continue
					Else
						rsState = 25
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 25
				Case 25
					rsState = 26
					CallSub2(mod1.vStr1, "MsgboxOnly", strmsg)
					Continue
				Case 26
					rsState = 37
					Continue
				Case 28
					rsState = 29
					msg = j.Sub012
					strmsg = msg
					Continue
				Case 29
					rsState = 36
					If msg.StartsWith("OK") Then
						Continue
					Else
						rsState = 31
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 31
				Case 31
					rsState = 32
					Continue
				Case 32
					rsState = 35
					If Main.v_asyncfe <> 0 And Not(bsetting) Then
						Continue
					Else
						rsState = 34
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 34
				Case 34
					rsState = 35
					CallSub2(mod1.vStr1, "MsgboxOnly", msg)
					Continue
				Case 35
					rsState = 36
					bok = False
					Continue
				Case 36
					rsState = 37
					Continue
				Case 37
					rsState = 38
					j.Sub024
					Continue
				Case 38
					rsState = 43
					If Not(bsetting) Then
						Continue
					Else
						rsState = 40
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 40
				Case 40
					rsState = 43
					Return ""
				Case 43
					rsState = 44
					Continue
				Case 44
					rsState = 66
					If Not(bok) Then
						Continue
					Else
						rsState = 46
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 46
				Case 46
					rsState = 47
					inumcicli = 120
					Continue
				Case 47
					rsState = 52
					If Main.v_asyncfe <= 0 Then
						Continue
					Else
						rsState = 49
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 49
				Case 49
					rsState = 52
					inumcicli = Main.v_asyncfe
					Continue
				Case 52
					rsState = 53
					Continue
				Case 53
					rsState = 65
					step43 = 1
					limit43 = inumcicli
					x = 0
					rsState = 80
					Continue
				Case 55
					rsState = 56
					Continue
				Case 56
					rsState = 59
					If Not(File.Exists(File.DirDefaultExternal & "/FE", "TmpRes" & ts & ".txt")) Then
						Continue
					Else
						rsState = 58
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 58
				Case 58
					rsState = 59
					Sub014(parametro, "TmpRes" & ts & ".txt")
					rsState = 65
					Continue
				Case 59
					rsState = 64
					If Main.v_asyncfe <= 0 Then
						Continue
					Else
						rsState = 61
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 61
				Case 61
					rsState = 64
					DoEvents
					Continue
				Case 64
					rsState = 81
					Sleep(500)
					rsState = 82
					Continue
				Case 65
					rsState = 66
					Continue
				Case 66
					rsState = 69
					Continue
				Case 68
					rsState = 69
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 69
					rsState = 78
					rsCatchState = 0
					If Main.v_asyncfe <= 0 Then
						Continue
					Else
						rsState = 71
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 71
				Case 71
					rsState = 72
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Continue
				Case 72
					rsState = 77
					If bok Then
						Continue
					Else
						rsState = 74
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 74
				Case 74
					rsState = 77
					CallSub2(mod1.vStr1, "MsgboxOnly", strmsg)
					Continue
				Case 77
					rsState = 78
					Continue
				Case 78
					rsState = -1
					Return strmsg
				Case 79
					rsState = 20
					j = wf79_0
					bok = j.vBln1
					Continue
				Case 80
					rsState = 65
					If (step43 > 0 And x <= limit43) Or (step43 < 0 And x >= limit43) Then
						rsState = 55
						Continue
					End If
					Continue
				Case 81
					rsState = 80
					x = x + 0 + step43
					Continue
				Case 82
					rsState = 81
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return Null
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

Sub Sub002(httpjobVar As httpjob, inputStreamWrapper As InputStream, strArr As String()) As Boolean
	Try
		Dim vOpenOutput As OutputStream = File.OpenOutput(mod1.vStr4, "Sospesi.zip", False)
		File.Copy2(inputStreamWrapper, vOpenOutput)
		vOpenOutput.Close
		If File.Size(mod1.vStr4, "Sospesi.zip") > 0 Then
			If File.Exists(mod1.vStr4, "Sospesi.txt") Then
				File.Delete(mod1.vStr4, "Sospesi.txt")
			End If
			Dim archiverForB4A As ArchiverForB4A
			Try
				archiverForB4A.UnZip(mod1.vStr4, "Sospesi.zip", mod1.vStr4, "")
				If Not(File.Exists(mod1.vStr4, "Sospesi.txt")) Then
					Sub008("Errore nella procedura di richiamo sospeso")
					Return False
				End If
				Dim randomAccessFile As RandomAccessFile
				randomAccessFile.Initialize(mod1.vStr4, "Sospesi.txt", False)
				If randomAccessFile.Size = 0 Then
					Sub008("Errore nella procedura di richiamo sospeso")
					Return False
				End If
				Dim list As List = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
				If randomAccessFile.CurrentPosition = randomAccessFile.Size Then
					Sub008("Errore nella procedura di richiamo sospeso")
					Return False
				End If
				Dim list2 As List = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
				randomAccessFile.Close
				Main.vSql2.ExecNonQuery("update headmovRecallAsporto set DaCancellare=1")
				dbutil.Sub008(Main.vSql2, "headmovRecallAsporto", list)
				Main.vSql2.ExecNonQuery("delete from headmovRecallAsporto where DaCancellare=1")
				Main.vSql2.ExecNonQuery("DROP TABLE IF EXISTS TEMP.VendutoRecallAsporto")
				Main.vSql2.ExecNonQuery("CREATE TEMP TABLE VendutoRecallAsporto (chiave INTEGER PRIMARY KEY ," & CRLF & TAB & TAB & "totcre nvarchar (10)  NULL,codint nvarchar (20)  NULL,descrizione" & TAB & "nvarchar (50)  NULL" & CRLF & TAB & TAB & ",nmov numeric(18, 0) not NULL default 0,qta numeric(18, 3) not NULL default 0,importo numeric(18, 2) not NULL default 0,codice nvarchar (20)  NULL)")
				dbutil.Sub007(Main.vSql2, "VendutoRecallAsporto", list2)
				Return True
			Catch
				Sub008("Errore nel formato del file arrivato dal server.")
				Return False
			End Try
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return False
End Sub

Sub Sub003(httpjobVar As httpjob, inputStreamWrapper As InputStream, strArr As String())
	Dim vOpenOutput As OutputStream = File.OpenOutput(mod1.vStr4, "Recall.zip", False)
	File.Copy2(inputStreamWrapper, vOpenOutput)
	vOpenOutput.Close
	If File.Size(mod1.vStr4, "Recall.zip") > 0 Then
		If File.Exists(mod1.vStr4, "Recall.txt") Then
			File.Delete(mod1.vStr4, "Recall.txt")
		End If
		Dim archiverForB4A As ArchiverForB4A
		Try
			archiverForB4A.UnZip(mod1.vStr4, "Recall.zip", mod1.vStr4, "")
			If Not(File.Exists(mod1.vStr4, "Recall.txt")) Then
				CallSub3(mod1.vStr1, "ProgressOnly", False, "")
				Sub008("Errore nella procedura di richiamo movimento")
				Main.vBln26 = True
				If mod1.vStr1 = "Main" Then
					CallSub(mod1.vStr1, "ChangeStateClient")
				End If
			Else
				If mod1.Sub110 Then
					CallSub(Main, "fRecallMov")
				End If
			End If
		Catch
			Sub008("Errore nel formato del file arrivato dal server.")
			Main.vBln26 = True
			If mod1.vStr1 = "Main" Then
				CallSub(mod1.vStr1, "ChangeStateClient")
			End If
			CallSub3(mod1.vStr1, "ProgressOnly", False, "")
			httpjobVar.Sub024
			Return
		End Try
	End If
End Sub

Sub Sub004(httpjobVar As httpjob, inputStreamWrapper As InputStream, strArr As String())
	Dim vOpenOutput As OutputStream = File.OpenOutput(mod1.vStr4, "Tavolo.zip", False)
	File.Copy2(inputStreamWrapper, vOpenOutput)
	vOpenOutput.Close
	If File.Size(mod1.vStr4, "Tavolo.zip") > 0 Then
		If File.Exists(mod1.vStr4, "Tavolo.txt") Then
			File.Delete(mod1.vStr4, "Tavolo.txt")
		End If
		Dim archiverForB4A As ArchiverForB4A
		Try
			archiverForB4A.UnZip(mod1.vStr4, "Tavolo.zip", mod1.vStr4, "")
			If Not(File.Exists(mod1.vStr4, "Tavolo.txt")) Then
				CallSub3(mod1.vStr1, "ProgressOnly", False, "")
				Sub008("Errore nella procedura di apertura tavolo")
				Main.vBln26 = True
				If mod1.vStr1 = "Main" Then
					CallSub(mod1.vStr1, "ChangeStateClient")
				End If
			Else
				If Main.vBln9 Then
					CallSub2(Main, "CheckOpenTable", strArr(1))
				End If
				If mod1.Sub111(strArr(1)) Then
					CallSub3(Main, "ApriTavolo", strArr, False)
					If Main.vBln9 Then
						CallSub(Main, "SetNoUpdLastSalaaFalse")
					End If
				End If
			End If
		Catch
			Sub008("Errore nel formato del file arrivato dal server.")
			Main.vBln26 = True
			If mod1.vStr1 = "Main" Then
				CallSub(mod1.vStr1, "ChangeStateClient")
			End If
			CallSub3(mod1.vStr1, "ProgressOnly", False, "")
			httpjobVar.Sub024
			Return
		End Try
	End If
End Sub

Sub Sub005(httpjobVar As httpjob, inputStreamWrapper As InputStream, z As Boolean)
	Dim vOpenOutput As OutputStream = File.OpenOutput(mod1.vStr4 & "/SEND", "Anagra.zip", False)
	File.Copy2(inputStreamWrapper, vOpenOutput)
	vOpenOutput.Close
	If File.Size(mod1.vStr4 & "/SEND", "Anagra.zip") > 0 Then
		If File.Exists(mod1.vStr4 & "/SEND", "Anagra.db") Then
			File.Delete(mod1.vStr4 & "/SEND", "Anagra.db")
		End If
		Dim archiverForB4A As ArchiverForB4A
		Try
			Dim sb6 As String = mod1.vStr4 & "/SEND"
			archiverForB4A.UnZip(sb6, "Anagra.zip", mod1.vStr4 & "/SEND", "")
			If Not(File.Exists(mod1.vStr4 & "/SEND", "Anagra.db")) Then
				Sub008("Errore nella procedura di invio delle variazioni")
				Main.vBln26 = True
				If mod1.vStr1 = "Main" Then
					CallSub(mod1.vStr1, "ChangeStateClient")
				End If
			Else
				If File.Size(mod1.vStr4 & "/SEND", "Anagra.db") = 0 Then
					File.Delete(mod1.vStr4 & "/SEND", "Anagra.db")
					Sub008("Errore nella procedura di invio delle variazioni")
					Main.vBln26 = True
					If mod1.vStr1 = "Main" Then
						CallSub(mod1.vStr1, "ChangeStateClient")
					End If
				Else
					CallSub2(Main, "ApplyVar", z)
				End If
			End If
		Catch
			Sub008("Errore nel formato del file arrivato dal server.")
			Main.vBln26 = True
			If mod1.vStr1 = "Main" Then
				CallSub(mod1.vStr1, "ChangeStateClient")
			End If
			httpjobVar.Sub024
			Return
		End Try
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/httpclient.java, metodo _estraifilevariazionitavoli (riga 1436).
Sub estraifilevariazionitavoli(httpjobVar As httpjob, inputStreamWrapper As InputStream)
	Dim sb2 As String = mod1.vStr4 & "/UPDTAVOLI"
	Dim vOpenOutput As OutputStream = File.OpenOutput(sb2, "SospesiT.zip", False)
	File.Copy2(inputStreamWrapper, vOpenOutput)
	vOpenOutput.Close
	If File.Size(sb2, "SospesiT.zip") > 0 Then
		Try
			UnZip(sb2, "SospesiT.zip", sb2, "")
			Initialize
			Dim vListFiles As List = File.ListFiles(sb2)
			vListFiles.Sort(True)
			Dim size As Int = vListFiles.Size - 1
			Dim i As Int
			For i = 0 To size
				Dim vObjectToString As String = vListFiles.Get(i)
				Dim vSplit() As String = Regex.Split("_", vObjectToString)
				If vSplit.Length > 2 Then
					Dim parseDouble As Int = vSplit(1)
					If vInt2 <> 0 And vInt2 + 1 <> parseDouble Then
						mod1.Sub215("Errore numeratore :" & CRLF & "Richiesto " & SmartStringFormatter("", vInt2 + 1) & CRLF & "Trovato " & SmartStringFormatter("", parseDouble) & CRLF & TAB & TAB & TAB & TAB & TAB)
						vInt2 = 0
						If Main.vBln25 Then
							If Not(Main.vBln26) Then
								Starter.vTmr1.Enabled = False
								Dim size2 As Int = vListFiles.Size - 1
								Dim i2 As Int
								For i2 = 0 To size2
									Dim vObjectToString2 As String = vListFiles.Get(i2)
									If vObjectToString2.EndsWith(".txt") Then
										File.Delete(sb2, vObjectToString2)
									End If
								Next
								getvariazionitavolidaclient(True)
								Return
							End If
						End If
						Return
					End If
					vInt2 = parseDouble
				End If
				If vObjectToString.EndsWith(".txt") Then
					Initialize
					Dim randomAccessFile As RandomAccessFile
					randomAccessFile.Initialize(sb2, vObjectToString, False)
					Try
						If randomAccessFile.Size > 0 Then
							Dim vObjectToString3 As String = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
							Dim vSplit2() As String = Regex.Split("_", vObjectToString3)
							Dim i3 As Int
							i3 = 0
							Do While randomAccessFile.CurrentPosition < randomAccessFile.Size And i3 <= vSplit2.Length
								Dim map As Map
								map.Initialize
								map.Put("tavolo", vSplit2(i3))
								Dim map2 As Map = randomAccessFile.ReadObject(randomAccessFile.CurrentPosition)
								dbutil.Sub012(Main.vSql1, "tavoli", map2, map)
								i3 = i3 + 1
							Loop
							randomAccessFile.Close
							File.Delete(sb2, vObjectToString)
						Else
							mod1.Sub217("Errore durante l'invio del file")
							Return
						End If
					Catch
						mod1.Sub217(LastException.Message)
						randomAccessFile.Close
						File.Delete(sb2, vObjectToString)
						Return
					End Try
				End If
			Next
			If Main.vInt30 >= 10 Then
			End If
		Catch
			Sub008("Errore nel formato del file arrivato dal server.")
			Main.vBln26 = True
			If mod1.vStr1 = "Main" Then
				CallSub(mod1.vStr1, "ChangeStateClient")
			End If
			httpjobVar.Sub024
			Return
		End Try
	End If
End Sub

Sub Sub006 As Boolean
	Initialize
	Dim vListFiles As List = File.ListFiles(Main.vStr17)
	If vListFiles.Size <= 0 Then
		Return False
	End If
	Dim size As Int = vListFiles.Size - 1
	Dim i As Int
	For i = 0 To size
		Dim vObjectToString As String = vListFiles.Get(i)
		If vObjectToString.StartsWith("V") And vObjectToString.EndsWith(".txt") Then
			Return True
		End If
	Next
	Return False
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub exportpalmari(cursorricerca As Cursor)
	Dim limit1 As Int
	Dim step1 As Int
	Dim i As Int
	Dim files As List
	Dim fd As multipartfiledata
	Dim nv As Map
	Dim job2 As httpjob
	Dim mresult As String
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				Continue
			Case 1
				rsState = 36
				step1 = 1
				limit1 = cursorricerca.RowCount - 1
				i = 0
				rsState = 37
				Continue
			Case 3
				rsState = 4
				cursorricerca.Position = i
				Continue
			Case 4
				rsState = 35
				If cursorricerca.GetInt("Attivo") <> 1 Then
					Continue
				Else
					If Not(File.Exists(Main.vStr7 & "/" & cursorricerca.GetString("Serial"), "dati.zip")) Then
						Continue
					Else
						rsState = 6
						Continue
					End If
				End If
				'(fallthrough java verso il case successivo)
				rsState = 6
			Case 6
				rsState = 7
				'files = List
				files.Initialize
				'fd = multipartfiledata
				fd.Initialize
				Dim multipartfiledataVar As multipartfiledata = fd
				multipartfiledataVar.Dir = Main.vStr7 & "/" & cursorricerca.GetString("Serial")
				fd.FileName = "dati.zip"
				fd.KeyName = "upfile"
				fd.ContentType = "application/octet-stream"
				files.Add(fd)
				'nv = Map
				nv.Initialize
				nv.Put("upfile", "dati.zip")
				Continue
			Case 7
				rsState = 10
				If Not(Main.v_attivakeyhttp) Then
					Continue
				Else
					rsState = 9
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 9
			Case 9
				rsState = 10
				Dim map As Map = nv
				map.Put("mk", mod1.Sub082)
				nv.Put("CMD", "write")
				Continue
			Case 10
				rsState = 11
				'job2 = httpjob
				job2.Initialize(cursorricerca.GetInt("Serial"), Me)
				Continue
			Case 11
				rsState = 16
				If Main.v_attivakeyhttp Then
					rsState = 13
					Continue
				Else
					rsState = 15
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 13
			Case 13
				rsState = 16
				job2.Sub020("http://" & cursorricerca.GetString("IP") & ":12315", nv, files)
				Continue
			Case 15
				rsState = 16
				job2.Sub020("http://" & cursorricerca.GetString("IP") & ":12315/write", nv, files)
				Continue
			Case 16
				rsState = 17
				Wait For (job2) Jobdone (wf39_0 As httpjob)
				rsState = 39
				Continue
			Case 17
				rsState = 34
				If job2.vBln1 Then
					rsState = 19
					Continue
				Else
					rsState = 29
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 19
			Case 19
				rsState = 20
				mresult = job2.Sub012
				Continue
			Case 20
				rsState = 27
				If mresult <> "OK" Then
					rsState = 22
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 22
			Case 22
				rsState = 23
				Continue
			Case 23
				rsState = 26
				If mod1.vStr1 <> "Main" Then
					If mod1.vStr1 <> "ConfPalmari" Then
						Continue
					End If
				End If
				rsState = 25
				Continue
			Case 25
				rsState = 26
				CallSub2(mod1.vStr1, "MsgboxOnly", mresult)
				Continue
			Case 26
				rsState = 27
				Continue
			Case 27
				rsState = 34
				Continue
			Case 29
				rsState = 30
				Continue
			Case 30
				rsState = 33
				If mod1.vStr1 <> "Main" Then
					If mod1.vStr1 <> "ConfPalmari" Then
						Continue
					End If
				End If
				rsState = 32
				Continue
			Case 32
				rsState = 33
				CallSub2(mod1.vStr1, "MsgboxOnly", "Il palmare " & job2.vStr1 & " non è stato aggiornato")
				Continue
			Case 33
				rsState = 34
				Continue
			Case 34
				rsState = 35
				job2.Sub024
				Continue
			Case 35
				rsState = 38
				Continue
			Case 36
				rsState = -1
				Continue
			Case 37
				rsState = 36
				If (step1 > 0 And i <= limit1) Or (step1 < 0 And i >= limit1) Then
					rsState = 3
					Continue
				End If
				Continue
			Case 38
				rsState = 37
				i = i + 0 + step1
				Continue
			Case 39
				rsState = 17
				job2 = wf39_0
				Continue
		End Select
	Loop
End Sub

Sub gestionecentralizzataclienti(str As String)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("saldicliente", Me)
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/saldicliente_" & str)
	CallSub3(mod1.vStr1, "ProgressOnly", True, "Richiesta saldo cliente in corso ...")
End Sub

Sub Sub007
	vv1 = vv1 + 1
	Dim str As String = "Errore di comunicazione con il 2° Tablet"
	If Main.v_glory > 0 Then
		str = "Errore di comunicazione con il Cash Management"
	End If
	If Main.v_logvd Then
		mod1.Sub219(str, "")
	End If
	ToastMessageShow(str, True)
	If vv1 > 500 And Not(vv7) Then
		vv7 = True
		If mod1.vStr1 = "Main" Then
			CallSub2(mod1.vStr1, "MsgboxOnly", str)
			Return
		End If
		ToastMessageShow(str, True)
		Return
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/httpclient.java, metodo m2… (riga 1841).
Sub Sub008(str As String)
	Dim z As Boolean
	If str = "" Then
		Return
	End If
	If mod1.vStr1 = "Main" Then
		If str = "Errore di comunicazione con il server" Then
			If Main.vBln25 Then
				If Main.vBln26 Then
					z = True
					If Not(z) Then
						CallSub2(mod1.vStr1, "MsgboxOnly", str)
						Return
					End If
				End If
			End If
		End If
		z = False
		If Not(z) Then
		End If
	End If
	ToastMessageShow(str, True)
End Sub

Sub Sub009
	If mod1.vStr1 = "Main" Then
		CallSub(mod1.vStr1, "AnnullaoRiprovaChiusuraTavoloDaClient")
		Return
	End If
	ToastMessageShow("Errore di comunicazione con il server", True)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub GetAPI(stoken As String, api As String) As ResumableSub
	Dim bexists As Boolean
	Dim j As httpjob
	Dim bsucces As Boolean
	Dim smsg As String
	Dim myjson As Map
	Dim json As JSONParser
	Dim m As List
	Dim mtmpmap As Map
	Dim su As StringUtils
	Dim stesto As String
	Dim rsgetprg As ResumableSub
	Dim besisteagg As Boolean
	Dim sbstmp As String
	Dim ifrom As Int
	Dim buffer() As Byte
	Dim sfilename As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return Null
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 84
					rsCatchState = 83
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 83
					bexists = False
					'j = httpjob
					j.Initialize("GetAPI", Me)
					Dim vTmp As OkHttpRequest = j.Sub011
					vTmp.InitializeGet(Main.v_webapiindirizzo & api)
					j.Sub011.SetHeader("Token", stoken)
					CallSubDelayed2(httputils2service, "SubmitJob", j)
					Wait For (j) Jobdone (wf85_0 As httpjob)
					rsState = 85
					Continue
				Case 4
					rsState = 81
					If api.StartsWith("/Aggiornamentoapi") And bsucces Then
						rsState = 6
						Continue
					Else If api.StartsWith("/Programma/") And bsucces Then
						rsState = 66
						Continue
					Else
						rsState = 80
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 6
				Case 6
					rsState = 7
					smsg = j.Sub012
					j.Sub024
					'myjson = Map
					'json = JSONParser
					json.Initialize(smsg)
					myjson = json.NextObject
					'm = List
					Continue
				Case 7
					rsState = 64
					If Not(myjson.ContainsKey("Aggiornamentoapi")) Then
						Continue
					Else
						rsState = 9
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 9
				Case 9
					rsState = 10
					m = myjson.Get("Aggiornamentoapi")
					bexists = True
					'mtmpmap = Map
					mtmpmap = m.Get(0)
					'su = StringUtils
					Continue
				Case 10
					rsState = 23
					If Not(mtmpmap.ContainsKey("Messaggio")) Then
						Continue
					Else
						rsState = 12
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 12
				Case 12
					rsState = 13
					stesto = mtmpmap.GetDefault("Messaggio", "")
					Continue
				Case 13
					rsState = 22
					If stesto <> "" Then
						rsState = 15
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 15
				Case 15
					rsState = 16
					vv6 = True
					Continue
				Case 16
					rsState = 21
					If mod1.vStr1 = "Main" Then
						rsState = 18
						Continue
					Else
						rsState = 20
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 18
				Case 18
					rsState = 21
					CallSub2(mod1.vStr1, "MsgboxOnly", stesto)
					Continue
				Case 20
					rsState = 21
					ToastMessageShow(stesto, True)
					Continue
				Case 21
					rsState = 22
					Continue
				Case 22
					rsState = 23
					Continue
				Case 23
					rsState = 30
					If Not(mtmpmap.ContainsKey("Programma")) Then
						Continue
					Else
						rsState = 25
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 25
				Case 25
					rsState = 26
					CallSub3(mod1.vStr1, "ProgressOnly", True, "Attendere ... Download nuova versione in corso .....")
					'rsgetprg = ResumableSub
					rsgetprg = GetAPI(stoken, "/Programma/" & SmartStringFormatter("", mtmpmap.Get("Programma")) & "")
					Wait For (rsgetprg) Complete (wf86_0 As Boolean)
					rsState = 86
					Continue
				Case 26
					rsState = 29
					If besisteagg Then
						Continue
					Else
						rsState = 28
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 28
				Case 28
					rsState = 29
					PutAPI(stoken, "/Aggiornamentoapi/" & SmartStringFormatter("", mtmpmap.Get("Id")) & "?Stato=4")
					Return False
				Case 29
					rsState = 30
					Continue
				Case 30
					rsState = 37
					If Not(mtmpmap.ContainsKey("Programma1")) Then
						Continue
					Else
						rsState = 32
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 32
				Case 32
					rsState = 33
					CallSub3(mod1.vStr1, "ProgressOnly", True, "Attendere ... Download InvioFE in corso .....")
					'rsgetprg = ResumableSub
					rsgetprg = GetAPI(stoken, "/Programma/" & SmartStringFormatter("", mtmpmap.Get("Programma1")) & "")
					Wait For (rsgetprg) Complete (wf87_0 As Boolean)
					rsState = 87
					Continue
				Case 33
					rsState = 36
					If besisteagg Then
						Continue
					Else
						rsState = 35
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 35
				Case 35
					rsState = 36
					PutAPI(stoken, "/Aggiornamentoapi/" & SmartStringFormatter("", mtmpmap.Get("Id")) & "?Stato=4")
					Return False
				Case 36
					rsState = 37
					Continue
				Case 37
					rsState = 44
					If Not(mtmpmap.ContainsKey("Programma2")) Then
						Continue
					Else
						rsState = 39
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 39
				Case 39
					rsState = 40
					CallSub3(mod1.vStr1, "ProgressOnly", True, "Attendere ... Download wPalmRistorAndro in corso .....")
					'rsgetprg = ResumableSub
					rsgetprg = GetAPI(stoken, "/Programma/" & SmartStringFormatter("", mtmpmap.Get("Programma2")) & "")
					Wait For (rsgetprg) Complete (wf88_0 As Boolean)
					rsState = 88
					Continue
				Case 40
					rsState = 43
					If besisteagg Then
						Continue
					Else
						rsState = 42
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 42
				Case 42
					rsState = 43
					PutAPI(stoken, "/Aggiornamentoapi/" & SmartStringFormatter("", mtmpmap.Get("Id")) & "?Stato=4")
					Return False
				Case 43
					rsState = 44
					Continue
				Case 44
					rsState = 51
					If Not(mtmpmap.ContainsKey("Programma4")) Then
						Continue
					Else
						rsState = 46
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 46
				Case 46
					rsState = 47
					CallSub3(mod1.vStr1, "ProgressOnly", True, "Attendere ... Download Spooler in corso .....")
					'rsgetprg = ResumableSub
					rsgetprg = GetAPI(stoken, "/Programma/" & SmartStringFormatter("", mtmpmap.Get("Programma4")) & "")
					Wait For (rsgetprg) Complete (wf89_0 As Boolean)
					rsState = 89
					Continue
				Case 47
					rsState = 50
					If besisteagg Then
						Continue
					Else
						rsState = 49
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 49
				Case 49
					rsState = 50
					PutAPI(stoken, "/Aggiornamentoapi/" & SmartStringFormatter("", mtmpmap.Get("Id")) & "?Stato=4")
					Return False
				Case 50
					rsState = 51
					Continue
				Case 51
					rsState = 54
					If Not(mtmpmap.ContainsKey("BasicSupport")) Then
						Continue
					Else
						rsState = 53
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 53
				Case 53
					rsState = 54
					sbstmp = mtmpmap.Get("BasicSupport")
					ifrom = sbstmp.IndexOf("base64,") + 7
					buffer = su.DecodeBase64(sbstmp.SubString(ifrom))
					File.WriteString(File.DirInternal & "/Updater/WebApi", "BasicSupport.bs", BytesToString(buffer, 0, buffer.Length, "UTF-8"))
					Continue
				Case 54
					rsState = 57
					If Not(mtmpmap.ContainsKey("FileConfig")) Then
						Continue
					Else
						rsState = 56
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 56
				Case 56
					rsState = 57
					sbstmp = mtmpmap.Get("FileConfig")
					ifrom = sbstmp.IndexOf("base64,") + 7
					buffer = su.DecodeBase64(sbstmp.SubString(ifrom))
					File.WriteString(File.DirInternal & "/Updater/WebApi", "Config.txt", BytesToString(buffer, 0, buffer.Length, "UTF-8"))
					Continue
				Case 57
					rsState = 60
					If Not(mtmpmap.ContainsKey("CodiceAttivazione")) Then
						Continue
					Else
						rsState = 59
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 59
				Case 59
					rsState = 60
					sbstmp = mtmpmap.Get("CodiceAttivazione")
					ifrom = sbstmp.IndexOf("base64,") + 7
					buffer = su.DecodeBase64(sbstmp.SubString(ifrom))
					File.WriteString(File.DirInternal & "/Updater/WebApi", "CodiceAttivazione.txt", BytesToString(buffer, 0, buffer.Length, "UTF-8"))
					Continue
				Case 60
					rsState = 63
					If Not(mtmpmap.ContainsKey("SQL")) Then
						Continue
					Else
						rsState = 62
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 62
				Case 62
					rsState = 63
					sbstmp = mtmpmap.Get("SQL")
					ifrom = sbstmp.IndexOf("base64,") + 7
					buffer = su.DecodeBase64(sbstmp.SubString(ifrom))
					File.WriteString(File.DirInternal & "/Updater/WebApi", "Aggiorna.sql", BytesToString(buffer, 0, buffer.Length, "UTF-8"))
					Continue
				Case 63
					rsState = 64
					PutAPI(stoken, "/Aggiornamentoapi/" & SmartStringFormatter("", mtmpmap.Get("Id")) & "?Stato=2")
					Continue
				Case 64
					rsState = 81
					Continue
				Case 66
					rsState = 67
					smsg = j.Sub012
					j.Sub024
					'myjson = Map
					'json = JSONParser
					json.Initialize(smsg)
					myjson = json.NextObject
					Continue
				Case 67
					rsState = 78
					If Not(myjson.ContainsKey("Fileapk")) Then
						Continue
					Else
						rsState = 69
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 69
				Case 69
					rsState = 70
					'su = StringUtils
					sbstmp = myjson.Get("Fileapk")
					ifrom = sbstmp.IndexOf("base64,") + 7
					buffer = su.DecodeBase64(sbstmp.SubString(ifrom))
					sfilename = Main.vStr8 & "_" & myjson.GetDefault("Versione", 1) * 100 & ".apk"
					Continue
				Case 70
					rsState = 77
					If 4 <> myjson.Get("TipoProgramma") Then
						If 3 <> myjson.Get("TipoProgramma") Then
							If 5 <> myjson.Get("TipoProgramma") Then
								Continue
							Else
								rsState = 76
								Continue
							End If
						Else
							rsState = 74
							Continue
						End If
					Else
						rsState = 72
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 72
				Case 72
					rsState = 77
					sfilename = "InvioFE_" & myjson.GetDefault("Versione", 1) * 100 & ".apk"
					Continue
				Case 74
					rsState = 77
					sfilename = "wPalmRistorAndro_" & myjson.GetDefault("Versione", 1) * 100 & ".apk"
					Continue
				Case 76
					rsState = 77
					sfilename = "Spooler_" & myjson.GetDefault("Versione", 1) * 100 & ".apk"
					Continue
				Case 77
					rsState = 78
					File.WriteBytes(File.DirInternal & "/Updater/WebApi", sfilename, buffer)
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Return True
				Case 78
					rsState = 81
					Return False
				Case 80
					rsState = 81
					bexists = j.vBln1
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					j.Sub024
					Continue
				Case 81
					rsState = 84
					Continue
				Case 83
					rsState = 84
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Continue
				Case 84
					rsState = -1
					rsCatchState = 0
					Return bexists
				Case 85
					rsState = 4
					j = wf85_0
					bsucces = j.vBln1
					Continue
				Case 86
					rsState = 26
					besisteagg = wf86_0
					Continue
				Case 87
					rsState = 33
					besisteagg = wf87_0
					Continue
				Case 88
					rsState = 40
					besisteagg = wf88_0
					Continue
				Case 89
					rsState = 47
					besisteagg = wf89_0
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return Null
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub GetAPITokenas(indirizzo As String) As ResumableSub
	Dim stoken As String
	Dim j As httpjob
	Dim smsg As String
	Dim myjson As Map
	Dim json As JSONParser
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return Null
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 16
					rsCatchState = 15
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 15
					stoken = ""
					'j = httpjob
					j.Initialize("GetAPIToken", Me)
					j.Sub004(indirizzo & "/Token/1")
					Wait For (j) Jobdone (wf17_0 As httpjob)
					rsState = 17
					Continue
				Case 4
					rsState = 13
					If j.vBln1 Then
						rsState = 6
						Continue
					Else
						rsState = 12
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 6
				Case 6
					rsState = 7
					smsg = j.Sub012
					j.Sub024
					'myjson = Map
					'json = JSONParser
					json.Initialize(smsg)
					myjson = json.NextObject
					Continue
				Case 7
					rsState = 10
					If Not(myjson.ContainsKey("Token")) Then
						Continue
					Else
						rsState = 9
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 9
				Case 9
					rsState = 10
					stoken = myjson.Get("Token")
					Continue
				Case 10
					rsState = 13
					Continue
				Case 12
					rsState = 13
					j.Sub024
					Continue
				Case 13
					rsState = 16
					Continue
				Case 15
					rsState = 16
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 16
					rsState = -1
					rsCatchState = 0
					Return stoken
				Case 17
					rsState = 4
					j = wf17_0
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return Null
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

Sub getdatacashlogy As String
	If Main.v_ipvis = "" Then
		Return "Configurare l'indirizzo Ip del VisionDroid"
	End If
	If Not(vv7) Then
		If Main.vBln11 Then
			Dim httpjobVar As httpjob
			httpjobVar.Initialize("CashlogyGetData", Me)
			httpjobVar.Sub021("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=getdata", "")
			If Main.v_logvd Then
				mod1.Sub219("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=getdata", "")
			End If
			Return ""
		End If
	End If
	Return "il Cash management risulta essere offline"
End Sub

Sub getdaticliente(str As String)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("daticliente", Me)
	httpjobVar.Sub021("http://ec.europa.eu/taxation_customs/vies/services/checkVatService", str)
End Sub

Sub getlistaoraripernotazionidaclient
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("getoraridaclient", Me)
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/orari")
End Sub

Sub getlistaoraripernotazionidaclientpervisualizzazione
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("getoraridaclientV", Me)
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/orari")
End Sub

Sub getlistasospesidaclient
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("getsospesidaclient", Me)
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/getsospesi_" & Main.v_numcassa)
End Sub

Sub getsacchettone(str As String)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("sacchettone", Me)
	httpjobVar.Sub021("http://" & Main.v_ipserverbila & ":" & "12399" & "/upload?type=sacchettone", str)
End Sub

Sub getvariazionidaclient(str As String)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize(str, Me)
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/getvar_" & Main.v_mver & "_" & Main.v_numcassa)
End Sub

Sub getvariazionitavolidaclient(z As Boolean)
	Starter.vTmr1.Enabled = False
	Starter.vLng1 = DateTime.Now
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("getvardaclientT", Me)
	If z Then
		httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/getvartAll_" & Main.v_numcassa)
		Return
	End If
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/getvart_" & Main.v_numcassa)
End Sub

Sub Sub010
	If Main.v_ipvis <> "" And Not(vv7) Then
		If Main.vBln11 Then
			Dim httpjobVar As httpjob
			httpjobVar.Initialize("restore2", Me)
			httpjobVar.Sub021("http://" & Main.v_ipvis & ":" & "12398" & "/DownloadBK", "")
			If Main.v_logvd Then
				mod1.Sub219("http://" & Main.v_ipvis & ":" & "12398" & "/DownloadBK", "")
			End If
			Return
		End If
	End If
End Sub

Sub grantcashology
	If Main.v_ipvis <> "" And Not(vv7) Then
		If Main.vBln11 Then
			Dim httpjobVar As httpjob
			httpjobVar.Initialize("Cashlogy", Me)
			Dim sb As String = "http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=grant"
			httpjobVar.Sub021(sb, Main.Operatore)
			If Main.v_logvd Then
				mod1.Sub219("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=bk", "get")
			End If
			Return
		End If
	End If
End Sub

Sub infinityeroga(map As Map)
	Try
		If map.Size > 0 Then
			Dim vNumberToString As String = DateTime.Now
			Dim sb As String = "http://" & Main.v_ipdistributore & ":14532/Eroga_" & vNumberToString & "_" & Main.Operatore & "_" & Main.v_numcassa & "_"
			Dim vKeys As IterableList = map.Keys
			Dim size As Int = vKeys.Size
			Dim i As Int = 0
			Do While i < size
				Dim vGet As Object = vKeys.Get(i)
				i = i + 1
				sb = sb & vGet & "_" & NumberFormat2(map.GetDefault(vGet, 1), 1, 0, 0, False) & "_"
			Loop
			If sb.EndsWith("_") Then
				sb = sb.SubString2(0, sb.Length - "_".Length)
			End If
			comunicaconinfinity(sb)
			Return
		End If
		Return
	Catch
		Log("TmpMapArticoliInfinity: " & LastException.Message)
		mod1.Sub217("TmpMapArticoliInfinity: " & LastException.Message)
		Return
	End Try
End Sub

Sub inventarioglory As String
	If Main.v_ipvis = "" Then
		Return "Configurare l'indirizzo Ip del VisionDroid"
	End If
	If Not(vv7) Then
		If Main.vBln11 Then
			Dim httpjobVar As httpjob
			httpjobVar.Initialize("glorySendInventario", Me)
			httpjobVar.Sub021("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=InventarioGlory", "")
			If Main.v_logvd Then
				mod1.Sub219("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=InventarioGlory", "")
			End If
			Return "Richiesta Inventario Cash Management Inviata"
		End If
	End If
	Return "il Cash Management risulta essere offline"
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub inviaclientealserver
	Dim limit42 As Int
	Dim limit6 As Int
	Dim step42 As Int
	Dim step6 As Int
	Dim mfile() As String
	Dim ls As List
	Dim i As Int
	Dim zipname As String
	Dim myzip As ArchiverForB4A
	Dim files As List
	Dim fd As multipartfiledata
	Dim nv As Map
	Dim job2 As httpjob
	Dim mresult As String
	Dim x As Int
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					Dim mfile(1) As String
					mfile(0) = "ModCliente.txt"
					'ls = List
					ls.Initialize
					ls = File.ListFiles(Main.vStr17 & "/TMP")
					Continue
				Case 1
					rsState = 4
					step6 = 1
					limit6 = ls.Size - 1
					i = 0
					rsState = 35
					Continue
				Case 2, 6, 9, 12, 15, 17, 20, 23, 28, 31
					Continue
				Case 3
					rsState = 36
					File.Delete(Main.vStr17 & "/TMP", ls.Get(i))
					Continue
				Case 4
					rsState = 5
					zipname = "ModCliente" & Main.v_numcassa & ".zip"
					'myzip = ArchiverForB4A
					Dim archiverForB4A As ArchiverForB4A = myzip
					Dim sb4 As String = mod1.vStr4 & "/TMP"
					Dim strArr() As String = mfile
					archiverForB4A.ZipFiles(sb4, strArr, Main.vStr17 & "/TMP", zipname, "")
					Continue
				Case 5
					rsState = 34
					If File.Exists(Main.vStr17 & "/TMP", zipname) Then
						rsState = 7
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 7
				Case 7
					rsState = 8
					'files = List
					files.Initialize
					'fd = multipartfiledata
					fd.Initialize
					Dim multipartfiledataVar As multipartfiledata = fd
					multipartfiledataVar.Dir = Main.vStr17 & "/TMP"
					fd.FileName = zipname
					fd.KeyName = "upfile"
					fd.ContentType = "application/octet-stream"
					files.Add(fd)
					'nv = Map
					nv.Initialize
					nv.Put("upfile", zipname)
					Dim map As Map = nv
					map.Put("cassa", Main.v_numcassa)
					'job2 = httpjob
					job2.Initialize("1", Me)
					Dim httpjobVar As httpjob = job2
					httpjobVar.Sub020("http://" & Main.v_ipserver & ":12312/updcliente", nv, files)
					CallSub3(mod1.vStr1, "ProgressOnly", True, "Invio Dati al server in Corso")
					Wait For (job2) Jobdone (wf37_0 As httpjob)
					rsState = 37
					Continue
				Case 8
					rsState = 33
					If job2.vBln1 Then
						rsState = 10
					Else
						rsState = 32
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 10
				Case 10
					rsState = 11
					Continue
				Case 11
					rsState = 30
					rsCatchState = 29
					rsState = 13
					Continue
				Case 13
					rsState = 14
					rsCatchState = 29
					mresult = job2.Sub012
					Continue
				Case 14
					rsState = 27
					If mresult <> "OK" Then
						rsState = 16
					Else
						rsState = 18
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 16
				Case 16
					rsState = 27
					Main.vBln26 = True
					CallSub(mod1.vStr1, "ErrInvioClienteAlserver")
					Continue
				Case 18
					rsState = 19
					'ls = List
					ls.Initialize
					ls = File.ListFiles(Main.vStr17)
					Continue
				Case 19
					rsState = 26
					If ls.Size > 0 Then
						rsState = 21
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 21
				Case 21
					rsState = 22
					Continue
				Case 22
					rsState = 25
					step42 = 1
					limit42 = ls.Size - 1
					x = 0
					rsState = 38
					Continue
				Case 24
					rsState = 39
					File.Delete(Main.vStr17, ls.Get(x))
					Continue
				Case 25
					rsState = 26
					Continue
				Case 26
					rsState = 27
					Main.vBln26 = False
					CallSub(mod1.vStr1, "OKInvioClienteAlserver")
					Continue
				Case 27
					rsState = 30
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Continue
				Case 29
					rsState = 30
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 30
					rsState = 33
					rsCatchState = 0
					Continue
				Case 32
					rsState = 33
					Main.vBln26 = True
					CallSub(mod1.vStr1, "ErrInvioClienteAlserver")
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Continue
				Case 33
					rsState = 34
					job2.Sub024
					Continue
				Case 34
					rsState = -1
					Continue
				Case 35
					rsState = 4
					If (step6 > 0 And i <= limit6) Or (step6 < 0 And i >= limit6) Then
						rsState = 3
						Continue
					End If
					Continue
				Case 36
					rsState = 35
					i = i + 0 + step6
					Continue
				Case 37
					rsState = 8
					job2 = wf37_0
					Continue
				Case 38
					rsState = 25
					If (step42 > 0 And x <= limit42) Or (step42 < 0 And x >= limit42) Then
						rsState = 24
						Continue
					End If
					Continue
				Case 39
					rsState = 38
					x = x + 0 + step42
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub inviavendutoclient(riaggiorna As String)
	Dim limit14 As Int
	Dim limit25 As Int
	Dim limit38 As Int
	Dim limit43 As Int
	Dim limit79 As Int
	Dim step14 As Int
	Dim step25 As Int
	Dim step38 As Int
	Dim step43 As Int
	Dim step79 As Int
	Dim tmplistunlocked As Map
	Dim ls As List
	Dim ls2 As List
	Dim x As Int
	Dim tmpname As String
	Dim scol() As String
	Dim tmpc As Cursor
	Dim zz As Int
	Dim tmpfn As String
	Dim mfile() As String
	Dim i As Int
	Dim zipname As String
	Dim myzip As ArchiverForB4A
	Dim files As List
	Dim fd As multipartfiledata
	Dim nv As Map
	Dim job2 As httpjob
	Dim mresult As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 109
					rsCatchState = 102
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 102
					Continue
				Case 4
					rsState = 7
					If Not(Main.vBln26) Then
						Continue
					Else
						rsState = 6
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 6
				Case 6
					rsState = 7
					sendhellodaclient()
					Return
				Case 7
					rsState = 8
					'tmplistunlocked = Map
					tmplistunlocked.Initialize
					'ls = List
					ls.Initialize
					ls = File.ListFiles(Main.vStr17)
					Continue
				Case 8
					rsState = 100
					If ls.Size <= 0 Then
						If Main.vSql2.ExecQuerySingleResult("Select count(*) from unlocktbl") <= 0 Then
							Continue
						End If
					End If
					rsState = 10
					Continue
				Case 10
					rsState = 11
					'ls2 = List
					ls2.Initialize
					Continue
				Case 11
					rsState = 24
					step14 = 1
					limit14 = ls.Size - 1
					x = 0
					rsState = 110
					Continue
				Case 13
					rsState = 14
					tmpname = ls.Get(x)
					Continue
				Case 14
					rsState = 23
					If tmpname.StartsWith("V") And tmpname.EndsWith(".txt") Then
						rsState = 16
						Continue
					End If
					Continue
				Case 16
					rsState = 17
					ls2.Add(ls.Get(x))
					Dim scol(0) As String
					scol = Regex.Split("_", ls.Get(x))
					Continue
				Case 17
					rsState = 22
					If scol(1) <= 0 Then
						Continue
					Else
						rsState = 19
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 19
				Case 19
					rsState = 22
					tmplistunlocked.Put(scol(1), "")
					Continue
				Case 22
					rsState = 23
					Continue
				Case 23
					rsState = 111
					Continue
				Case 24
					rsState = 25
					'tmpc = Cursor
					Dim cursorWrapper As Cursor
					tmpc = Main.vSql2.ExecQuery("Select * from unlocktbl")
					Continue
				Case 25
					rsState = 42
					If tmpc.RowCount <= 0 Then
						Continue
					Else
						rsState = 27
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 27
				Case 27
					rsState = 28
					Continue
				Case 28
					rsState = 41
					step25 = 1
					limit25 = tmpc.RowCount - 1
					zz = 0
					rsState = 112
					Continue
				Case 30
					rsState = 31
					tmpc.Position = zz
					Continue
				Case 31
					rsState = 40
					If tmplistunlocked.ContainsKey(tmpc.GetString("tavolo")) Then
						Continue
					Else
						rsState = 33
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 33
				Case 33
					rsState = 34
					tmpfn = sbloccatavolodaclient(tmpc.GetInt("tavolo"), False)
					Continue
				Case 34
					rsState = 39
					If tmpfn <> "" Then
						Continue
					Else
						rsState = 36
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 36
				Case 36
					rsState = 39
					Return
				Case 39
					rsState = 40
					ls2.Add(tmpfn)
					Continue
				Case 40
					rsState = 113
					Continue
				Case 41
					rsState = 42
					Main.vSql2.ExecNonQuery("delete from unlocktbl")
					Continue
				Case 42
					rsState = 43
					tmpc.Close
					Continue
				Case 43
					rsState = 48
					If ls2.Size <> 0 Then
						Continue
					Else
						rsState = 45
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 45
				Case 45
					rsState = 48
					Return
				Case 48
					rsState = 49
					Dim mfile(ls2.Size) As String
					Continue
				Case 49
					rsState = 52
					step38 = 1
					limit38 = ls2.Size - 1
					x = 0
					rsState = 114
					Continue
				Case 51
					rsState = 115
					mfile(x) = ls2.Get(x)
					Continue
				Case 52
					rsState = 53
					ls.Initialize
					ls = File.ListFiles(Main.vStr17 & "/TMP")
					Continue
				Case 53
					rsState = 56
					step43 = 1
					limit43 = ls.Size - 1
					i = 0
					rsState = 116
					Continue
				Case 55
					rsState = 117
					File.Delete(Main.vStr17 & "/TMP", ls.Get(i))
					Continue
				Case 56
					rsState = 57
					zipname = "V" & mod1.Sub059(mod1.Sub058) & ".zip"
					'myzip = ArchiverForB4A
					Dim archiverForB4A As ArchiverForB4A = myzip
					Dim strArr() As String = mfile
					archiverForB4A.ZipFiles(Main.vStr17, strArr, Main.vStr17 & "/TMP", zipname, "")
					Continue
				Case 57
					rsState = 99
					If Not(File.Exists(Main.vStr17 & "/TMP", zipname)) Then
						Continue
					Else
						rsState = 59
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 59
				Case 59
					rsState = 60
					'files = List
					files.Initialize
					'fd = multipartfiledata
					fd.Initialize
					Dim multipartfiledataVar As multipartfiledata = fd
					multipartfiledataVar.Dir = Main.vStr17 & "/TMP"
					fd.FileName = zipname
					fd.KeyName = "upfile"
					fd.ContentType = "application/octet-stream"
					files.Add(fd)
					'nv = Map
					nv.Initialize
					nv.Put("upfile", zipname)
					Dim map As Map = nv
					map.Put("cassa", Main.v_numcassa)
					'job2 = httpjob
					job2.Initialize(1, Me)
					Dim httpjobVar As httpjob = job2
					httpjobVar.Sub020("http://" & Main.v_ipserver & ":12312/vendutoclient_" & riaggiorna, nv, files)
					CallSub3(mod1.vStr1, "ProgressOnly", True, "Invio Dati al server in Corso")
					Wait For (job2) Jobdone (wf118_0 As httpjob)
					rsState = 118
					Continue
				Case 60
					rsState = 98
					If job2.vBln1 Then
						rsState = 62
						Continue
					Else
						rsState = 93
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 62
				Case 62
					rsState = 63
					Continue
				Case 63
					rsState = 91
					rsCatchState = 90
					rsState = 65
					Continue
				Case 65
					rsState = 66
					rsCatchState = 90
					mresult = job2.Sub012
					Continue
				Case 66
					rsState = 85
					If mresult <> "OK" Then
						rsState = 68
						Continue
					Else
						rsState = 76
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 68
				Case 68
					rsState = 69
					Sub008(mresult)
					Continue
				Case 69
					rsState = 74
					If mresult <> "" Then
						rsState = 71
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 71
				Case 71
					rsState = 74
					Main.vBln26 = True
					Continue
				Case 74
					rsState = 85
					Continue
				Case 76
					rsState = 77
					'ls = List
					ls.Initialize
					ls = File.ListFiles(Main.vStr17)
					Continue
				Case 77
					rsState = 84
					If ls.Size <= 0 Then
						Continue
					Else
						rsState = 79
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 79
				Case 79
					rsState = 80
					Continue
				Case 80
					rsState = 83
					step79 = 1
					limit79 = ls.Size - 1
					x = 0
					rsState = 119
					Continue
				Case 82
					rsState = 120
					File.Delete(Main.vStr17, ls.Get(x))
					Continue
				Case 83
					rsState = 84
					Continue
				Case 84
					rsState = 85
					Main.vBln26 = False
					Continue
				Case 85
					rsState = 88
					If mod1.vStr1 <> "Main" Then
						Continue
					Else
						rsState = 87
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 87
				Case 87
					rsState = 88
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					CallSub(mod1.vStr1, "ChangeStateClient")
					Continue
				Case 88
					rsState = 91
					Continue
				Case 90
					rsState = 91
					rsCatchState = 102
					mod1.Sub217(LastException.Message)
					Continue
				Case 91
					rsState = 98
					rsCatchState = 102
					Continue
				Case 93
					rsState = 94
					Sub008("Errore di collegamento con il server")
					Main.vBln26 = True
					Continue
				Case 94
					rsState = 97
					If mod1.vStr1 <> "Main" Then
						Continue
					Else
						rsState = 96
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 96
				Case 96
					rsState = 97
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					CallSub(mod1.vStr1, "ChangeStateClient")
					Continue
				Case 97
					rsState = 98
					Continue
				Case 98
					rsState = 99
					job2.Sub024
					Continue
				Case 99
					rsState = 100
					Continue
				Case 100
					rsState = 109
					Continue
				Case 102
					rsState = 103
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Main.vBln26 = True
					Continue
				Case 103
					rsState = 108
					If mod1.vStr1 <> "Main" Then
						Continue
					Else
						rsState = 105
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 105
				Case 105
					rsState = 108
					CallSub(mod1.vStr1, "ChangeStateClient")
					Continue
				Case 108
					rsState = 109
					Continue
				Case 109
					rsState = -1
					rsCatchState = 0
					Continue
				Case 110
					rsState = 24
					If (step14 > 0 And x <= limit14) Or (step14 < 0 And x >= limit14) Then
						rsState = 13
						Continue
					End If
					Continue
				Case 111
					rsState = 110
					x = x + 0 + step14
					Continue
				Case 112
					rsState = 41
					If (step25 > 0 And zz <= limit25) Or (step25 < 0 And zz >= limit25) Then
						rsState = 30
						Continue
					End If
					Continue
				Case 113
					rsState = 112
					zz = zz + 0 + step25
					Continue
				Case 114
					rsState = 52
					If (step38 > 0 And x <= limit38) Or (step38 < 0 And x >= limit38) Then
						rsState = 51
						Continue
					End If
					Continue
				Case 115
					rsState = 114
					x = x + 0 + step38
					Continue
				Case 116
					rsState = 56
					If (step43 > 0 And i <= limit43) Or (step43 < 0 And i >= limit43) Then
						rsState = 55
						Continue
					End If
					Continue
				Case 117
					rsState = 116
					i = i + 0 + step43
					Continue
				Case 118
					rsState = 60
					job2 = wf118_0
					Continue
				Case 119
					rsState = 83
					If (step79 > 0 And x <= limit79) Or (step79 < 0 And x >= limit79) Then
						rsState = 82
						Continue
					End If
					Continue
				Case 120
					rsState = 119
					x = x + 0 + step79
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

Sub jobdone(httpjobVar As httpjob)
	r1 = False
	r1 = False
	Dim z As Boolean = False
	mod1.vStr2 = "Sub JobDone (Job As HttpJob)"
	Try
		If Not(httpjobVar.vBln1) Then
			mod1.Sub215("Errore da Job " & httpjobVar.vStr1)
			If httpjobVar.vStr1 <> "WebPrenota" And httpjobVar.vStr1 <> "CameriereC" Then
				If httpjobVar.vStr1 = "glorySendImporto" Then
					CallSub(mod1.vStr1, "Anim_AnimationEnd")
					Main.vInt5 = -1
					CallSub2(mod1.vStr1, "MsgboxOnly", "Errore di comunicazione con il Cash management")
					If Main.v_logvd Then
						mod1.Sub219("Errore di comunicazione con il Cash management", "")
					End If
				Else If httpjobVar.vStr1.StartsWith("restore") Then
					CallSub2(mod1.vStr1, "MsgboxOnly", "Errore di comunicazione con VisionDroid")
					If Main.v_logvd Then
						mod1.Sub219("Errore di comunicazione con VisionDroid", "")
					End If
				Else If httpjobVar.vStr1.StartsWith("varclient") Then
					If httpjobVar.vStr1.Length > 8 Then
						Sub008("Errore di comunicazione con il terminale " & httpjobVar.vStr1.SubString(9))
						Main.vSql1.ExecNonQuery("update clients set stato =3 where codice = " & httpjobVar.vStr1.SubString(9))
						Dim cursorWrapper As Cursor
						Main.vCur1 = Main.vSql1.ExecQuery("Select * from clients order by codice")
					End If
				Else If httpjobVar.vStr1.StartsWith("CashlogyGetData") Then
					Sub008("Errore di comunicazione con il CashManagement")
				Else If httpjobVar.vStr1.StartsWith("getvardaclient") Or httpjobVar.vStr1.StartsWith("hello") Or httpjobVar.vStr1.StartsWith("getoraridaclient") Then
					Sub008("Errore di comunicazione con il server")
					If httpjobVar.vStr1 = "getvardaclientT" Then
						Starter.vTmr1.Enabled = True
						CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					End If
				Else If httpjobVar.vStr1 = "sacchettone" Or httpjobVar.vStr1 = "updbila" Then
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Sub008("Errore di comunicazione con il server bilance")
				Else If httpjobVar.vStr1 = "getvardaclientPC" Then
					Sub008("Errore di comunicazione con il server")
					CallSub3(Main, "EseguiChiusura", False, "")
				Else If httpjobVar.vStr1 = "saldicliente" Then
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Sub008("Errore di comunicazione con il server")
					CallSub(mod1.vStr1, "lblOperatore_Click")
				Else If httpjobVar.vStr1.StartsWith("daticliente") Then
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					ToastMessageShow(httpjobVar.vStr3, True)
				Else If httpjobVar.vStr1.StartsWith("chiudimov") Or httpjobVar.vStr1.StartsWith("recmov") Or httpjobVar.vStr1.StartsWith("opertav") Or httpjobVar.vStr1.StartsWith("apritav") Or httpjobVar.vStr1.StartsWith("uniscidaclient") Or httpjobVar.vStr1.StartsWith("sbloccadaclient") Or httpjobVar.vStr1.StartsWith("spostadaclient") Or httpjobVar.vStr1 = "contodaclient" Or httpjobVar.vStr1 = "getsospesidaclient" Then
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					If httpjobVar.vStr1.StartsWith("chiudimov") Then
						Sub008("Errore di comunicazione con il server" & CRLF & "Per chidere il movimento con un cliente selezionato è necessario attivare il collegamento con il Server")
					Else If httpjobVar.vStr1.StartsWith("recmov") Then
						CallSub2(Main, "EsciDaMov", False)
						Sub008("Errore di comunicazione con il server")
					Else
						Main.vBln19 = False
						Sub008("Errore di comunicazione con il server")
					End If
					If Main.vBln10 And httpjobVar.vStr1.StartsWith("apritav") Then
						CallSub2(Main, "HideShowPnlRicercaT", True)
					End If
					If httpjobVar.vStr1.StartsWith("apritav") Then
						Main.vBln9 = False
					End If
				Else If httpjobVar.vStr1 = "sospenditav" Then
					vv5 = False
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Sub009()
				Else If httpjobVar.vStr1 = "Vis" Then
					Sub007()
				End If
			End If
			If Main.vBln25 Then
				Main.vBln26 = True
				If mod1.vStr1 = "Main" Then
					CallSub(mod1.vStr1, "ChangeStateClient")
				End If
			End If
		Else
			If httpjobVar.vStr1 = "CashlogyGetData" Or httpjobVar.vStr1 = "updbila" Then
				httpjobVar.Sub024
				Return
			End If
			If httpjobVar.vStr1 = "WebPrenota" Or httpjobVar.vStr1 = "CameriereC" Or httpjobVar.vStr1 = "CashlogyGetData" Then
				httpjobVar.Sub024
				Return
			End If
			If httpjobVar.vStr1 = "glorySendImporto" Then
				If Main.v_logvd Then
					mod1.Sub219("OK", "")
				End If
				Dim vTmp As String = httpjobVar.Sub012
				If vTmp.StartsWith("GloryErrore:") Then
					CallSub(mod1.vStr1, "Anim_AnimationEnd")
					Main.vInt5 = -1
					CallSub2(mod1.vStr1, "MsgboxOnly", vTmp.Replace("GloryErrore", "Errore CashManagement"))
					httpjobVar.Sub024
					Return
				End If
			Else
				If httpjobVar.vStr1 = "sacchettone" Then
					If httpjobVar.Sub012.StartsWith("non trovato") Then
						CallSub2(Main, "ElaboraSacchettone", False)
					End If
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1 = "restore1" Then
					Dim vTmp_ As String = httpjobVar.Sub012
					If vTmp_.Trim.StartsWith("Errore") Then
						CallSub2(mod1.vStr1, "MsgboxOnly", "Non esiste nessun file da ripristinare .")
					Else If vTmp_ <> "" Then
						Dim parseDouble As Long = vTmp_
						Dim vDate As String = DateTime.Date(parseDouble)
						Dim str As String = vDate.SubString2(3, 5) & "/" & vDate.SubString2(0, 2) & "/" & vDate.SubString2(6, 10)
						Dim vObjectToNumber As Int = CallSub2(mod1.vStr1, "MsgboxAsk", "Il File disponibile ha la data del " & str & " " & DateTime.Time(parseDouble) & CRLF & "Si desidera Continuare ? (TUTTI I DATI VERRANNO SOVRASCRITTI) ")
						If vObjectToNumber = -1 Then
							Sub010()
						End If
					End If
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1 = "restore2" Then
					Dim vOpenOutput As OutputStream = File.OpenOutput(mod1.vStr4 & "/files", "BKAnagra.zip", False)
					File.Copy2(httpjobVar.Sub010, vOpenOutput)
					vOpenOutput.Close
					CallSub(Main, "RestoreFile")
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("varclient") Then
					Dim vTmp__ As String = httpjobVar.Sub012
					If vTmp__ <> "" Then
						Sub008(vTmp__ & "(terminale " & httpjobVar.vStr1.SubString(9) & ")")
					End If
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("getvardaclient") Then
					Dim equals As Boolean = httpjobVar.vStr1 = "getvardaclientPR"
					Dim equals2 As Boolean = httpjobVar.vStr1 = "getvardaclientPRP"
					Dim equals3 As Boolean = httpjobVar.vStr1 = "getvardaclientT"
					Dim equals4 As Boolean = httpjobVar.vStr1 = "getvardaclientPC"
					Main.vBln27 = False
					If Not(equals3) Then
						Dim vTmp___ As InputStream = httpjobVar.Sub010
						If Not(equals) And Not(equals4) And Not(equals2) Then
							z = True
						End If
						Sub005(httpjobVar, vTmp___, z)
					End If
					If equals Or equals2 Then
						mod1.Sub078(True)
						If equals Then
							CallSub2(Main, "EseguiStampeDay", True)
						Else
							CallSub(Main, "EseguiLetturaPersonalizzata")
						End If
					Else If equals4 Then
						mod1.Sub078(True)
						CallSub3(Main, "EseguiChiusura", False, "")
					Else If equals3 Then
						Dim vTmp____ As InputStream = httpjobVar.Sub010
						If vTmp____.BytesAvailable > 12 Then
							estraifilevariazionitavoli(httpjobVar, vTmp____)
						End If
						Starter.vTmr1.Enabled = True
						CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					End If
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1 = "saldicliente" Then
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Dim vSplit() As String = Regex.Split("_", httpjobVar.Sub012)
					If vSplit.Length > 1 Then
						CallSub2(Main, "ApplicaCliente", vSplit)
					Else
						Sub008("Errore di comunicazione con il server")
						CallSub(mod1.vStr1, "lblOperatore_Click")
					End If
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("daticliente") Then
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Dim vTmp_____ As String = httpjobVar.Sub012
					CallSub2(Clienti, "GetStringaCliente", vTmp_____)
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("chiudimov") Then
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Dim vTmp______ As String = httpjobVar.Sub012
					If vTmp______.StartsWith("Errore") Then
						Main.vBln26 = True
						If mod1.vStr1 = "Main" Then
							CallSub(mod1.vStr1, "ChangeStateClient")
						End If
						Sub008(vTmp______)
					Else
						Dim parseDouble2 As Int = httpjobVar.vStr1.SubString(9)
						CallSub3(Main, "StampaSco", parseDouble2, 0)
					End If
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("sospenditav") Or httpjobVar.vStr1.StartsWith("getoraridaclient") Then
					vv5 = False
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Dim vTmp_______ As String = httpjobVar.Sub012
					If vTmp_______.StartsWith("Errore") Then
						Main.vBln26 = True
						If mod1.vStr1 = "Main" Then
							CallSub(mod1.vStr1, "ChangeStateClient")
						End If
						Sub008(vTmp_______)
					Else
						If httpjobVar.vStr1.StartsWith("getoraridaclient") Then
							Main.vLst2.Clear
							If vTmp_______.Length > 0 Then
								Dim vSplit2() As String = Regex.Split(TAB, vTmp_______)
								Main.vLst2.AddAll(ArrayToList(vSplit2))
							End If
						End If
						If httpjobVar.vStr1 = "getoraridaclient" Or httpjobVar.vStr1.StartsWith("sospenditav") Then
							Main.vBln43 = True
							Dim object As Class = Main
							CallSub2(object, "EseguiFunzione", Main.f_sospendi)
						Else
							CallSub2(Main, "AskOrario", True)
						End If
					End If
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("hello") Then
					Dim equals5 As Boolean = httpjobVar.vStr1 = "helloVenduto"
					Dim vTmp________ As InputStream = httpjobVar.Sub010
					If vTmp________.BytesAvailable > 100 Then
						Main.vBln27 = False
						Sub005(httpjobVar, vTmp________, True)
						If Main.vBln26 Then
							Main.vBln26 = False
							If mod1.vStr1 = "Main" Then
								CallSub(mod1.vStr1, "ChangeStateClient")
							End If
						End If
					Else
						Dim vTmp_________ As String = httpjobVar.Sub012
						If vTmp_________.StartsWith("Errore") Then
							Main.vBln26 = True
							If mod1.vStr1 = "Main" Then
								CallSub(mod1.vStr1, "ChangeStateClient")
							End If
							Sub008(vTmp_________)
							equals5 = False
						End If
					End If
					If Not(equals5) Then
						equals5 = Sub006()
					End If
					httpjobVar.Sub024
					If equals5 Then
						If Not(Main.vBln26) Then
							inviavendutoclient("1")
						End If
					End If
					Return
				End If
				If httpjobVar.vStr1.StartsWith("uniscidaclient") Then
					Dim vTmp__________ As String = httpjobVar.Sub012
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					If vTmp__________ <> "OK" Then
						Sub008(vTmp__________)
					Else
						Dim vSplit3() As String = Regex.Split("_", httpjobVar.vStr1)
						Dim parseDouble3 As Int = vSplit3(2)
						CallSub2(Main, "UnisciTavolo", parseDouble3)
						If Main.v_stampasposta Then
							Dim str3 As String = "Tavolo " & vSplit3(1) & " unito al " & vSplit3(2)
							If IsNumber(vSplit3(1)) And IsNumber(vSplit3(2)) And vSplit3(1) < 20000 Then
								If Main.v_stampasala Then
									Dim vTmp___________ As String = mod1.Sub107(vSplit3(1))
									str3 = vTmp___________ & " unito al " & mod1.Sub107(vSplit3(2))
								End If
								mod1.Sub183(True, False, str3)
							Else If IsNumber(vSplit3(1)) And IsNumber(vSplit3(2)) Then
								If Main.vBln36 Then
									Main.vStr18 = " and tipo =" & Main.t_tavolo & " and valore = " & vSplit3(1) & " "
									CallSub2("Main", "CambiaPagina", Main.vInt30)
									Main.vStr18 = " and tipo =" & Main.t_tavolo & " and valore = " & vSplit3(2) & " "
									CallSub2("Main", "CambiaPagina", Main.vInt30)
									Main.vStr18 = ""
								End If
							End If
						End If
					End If
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("spostadaclient") Then
					Dim vTmp____________ As String = httpjobVar.Sub012
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					If vTmp____________ <> "OK" Then
						Sub008(vTmp____________)
					Else
						Dim vSplit4() As String = Regex.Split("_", httpjobVar.vStr1)
						Dim parseDouble4 As Int = vSplit4(2)
						CallSub2(Main, "SpostaTavolo", parseDouble4)
						If Main.v_stampasposta Then
							Dim str4 As String = "Tavolo " & vSplit4(1) & " si sposta sul " & vSplit4(2)
							If Main.v_stampasala Then
								Dim vTmp_____________ As String = mod1.Sub107(vSplit4(1))
								str4 = vTmp_____________ & " si sposta su " & mod1.Sub107(vSplit4(2))
							End If
							mod1.Sub183(True, False, str4)
						End If
					End If
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("sbloccadaclient") Then
					Dim vTmp______________ As String = httpjobVar.Sub012
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					If vTmp______________ <> "Ok" Then
						Sub008(vTmp______________)
					End If
					Dim replace As String = httpjobVar.vStr1.Replace("sbloccadaclient", "").Replace("_", "")
					httpjobVar.Sub024
					Main.vSql1.ExecNonQuery("update tavoli set inmodifica=0,lock=0,unlocktable=0,stampap=0 where tavolo = " & replace)
					Main.vStr18 = " and tipo =" & Main.t_tavolo & " and valore = " & replace & " "
					CallSub2("Main", "CambiaPagina", Main.vInt30)
					Main.vStr18 = ""
					Return
				End If
				If httpjobVar.vStr1 = "contodaclient" Then
					Dim vTmp_______________ As String = httpjobVar.Sub012
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					If vTmp_______________.ToUpperCase <> "OK" Then
						Sub008(vTmp_______________)
					Else
						CallSub2(Main, "RichiediConto", False)
					End If
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("opertav") Then
					Dim vTmp________________ As String = httpjobVar.Sub012
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					If vTmp________________.ToUpperCase.StartsWith("ERRORE") Then
						Sub008(vTmp________________)
					Else
						Dim vSplit5() As String = Regex.Split("_", httpjobVar.vStr1)
						Dim strArr(4) As String
						Dim length As Int = vSplit5.Length - 1
						Dim i As Int
						For i = 0 To length
							strArr(i) = vSplit5(i)
						Next
						strArr(3) = "1"
						Dim object2 As Class = Main
						If Not(IsNumber(vTmp________________)) Then
							vTmp________________ = ""
						End If
						If CallSub2(object2, "ChiediOP", vTmp________________) Then
							CallSub3(Main, "ApriTavolo", strArr, True)
						End If
					End If
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("apritav") Then
					Main.vBln19 = False
					Dim vTmp_________________ As InputStream = httpjobVar.Sub010
					If vTmp_________________.BytesAvailable > 25 Then
						Sub004(httpjobVar, vTmp_________________, Regex.Split("_", httpjobVar.vStr1))
						CallSub(Main, "CallclienteTessera")
						If Main.vBln36 Then
							CallSub2(Main, "HideShowPnlRicercaT", False)
						End If
					Else
						Dim vTmp__________________ As String = httpjobVar.Sub012
						CallSub3(mod1.vStr1, "ProgressOnly", False, "")
						If Main.vBln10 Then
							CallSub2(Main, "HideShowPnlRicercaT", True)
						End If
						If vTmp__________________.StartsWith("Err") Then
							Main.vBln26 = True
							If mod1.vStr1 = "Main" Then
								CallSub(mod1.vStr1, "ChangeStateClient")
							End If
							Sub008("Errore di ricezione dati dal server")
						Else
							Sub008(vTmp__________________)
						End If
					End If
					Main.vBln9 = False
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("recmov") Then
					Dim vTmp___________________ As InputStream = httpjobVar.Sub010
					If vTmp___________________.BytesAvailable > 50 Then
						Sub003(httpjobVar, vTmp___________________, Regex.Split("_", httpjobVar.vStr1))
					Else
						Dim vTmp____________________ As String = httpjobVar.Sub012
						If vTmp____________________.StartsWith("Err") Then
							Main.vBln26 = True
							If mod1.vStr1 = "Main" Then
								CallSub(mod1.vStr1, "ChangeStateClient")
							End If
							Sub008("Errore di ricezione dati dal server")
						Else
							Sub008(vTmp____________________)
						End If
						CallSub2(Main, "EsciDaMov", False)
					End If
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					httpjobVar.Sub024
					Return
				End If
				If httpjobVar.vStr1.StartsWith("getsospesidaclient") Then
					CallSub3(mod1.vStr1, "ProgressOnly", False, "")
					Dim vTmp_____________________ As InputStream = httpjobVar.Sub010
					If vTmp_____________________.BytesAvailable > 25 Then
						If Sub002(httpjobVar, vTmp_____________________, Regex.Split("_", httpjobVar.vStr1)) Then
							CallSub(Main, "fRecallMov")
						End If
					Else
						Dim vTmp______________________ As String = httpjobVar.Sub012
						CallSub3(mod1.vStr1, "ProgressOnly", False, "")
						If vTmp______________________.StartsWith("Err") Then
							Sub008("Errore di ricezione dati dal server")
						Else
							Sub008(vTmp______________________)
						End If
					End If
					httpjobVar.Sub024
					Return
				End If
			End If
			Dim vTmp_______________________ As String = httpjobVar.Sub012
			If vTmp_______________________.StartsWith("Glory") Then
				vTmp_______________________ = vTmp_______________________.SubString(5)
				If vTmp_______________________ <> "OK" Then
					If mod1.vStr1 = "Main" Then
						CallSub2(mod1.vStr1, "MsgboxOnly", vTmp_______________________)
					Else
						ToastMessageShow(vTmp_______________________, True)
					End If
				End If
				If Main.v_logvd Then
					mod1.Sub219("OK -- " & vTmp_______________________, "")
				End If
			Else If vTmp_______________________.Trim.StartsWith("wait") Then
				If vTmp_______________________.Trim.StartsWith("waitok") Then
					vv3.Enabled = False
					Main.vBln6 = False
					Main.vInt1 = vTmp_______________________.SubString(6)
				End If
			Else If Not(vTmp_______________________.StartsWith("OK")) Then
				If vTmp_______________________ = "Refresh" Then
					updvis("")
				Else
					Sub007()
				End If
			Else If vTmp_______________________ <> "OK" Then
				vv2.Enabled = False
				Main.vBln6 = vTmp_______________________.Contains(")")
				If Main.vBln6 Then
					vTmp_______________________ = vTmp_______________________.Replace(")", "")
					vv3.Enabled = True
				End If
				If IsNumber(vTmp_______________________.SubString(2)) Then
					Dim parseDouble5 As Double = vTmp_______________________.SubString(2)
					If parseDouble5 <> Main.vDbl1 Then
						vv2.Interval = 2000
						vv2.Enabled = True
					End If
				End If
			End If
			If vTmp_______________________.StartsWith("OK") Then
				If Main.vBln13 Then
					If File.Exists(mod1.vStr4, "img.zip") Then
						ToastMessageShow("Invio immagini a VisionDroid in corso ...", True)
						Main.vBln13 = False
						File.Copy(mod1.vStr4, "img.zip", mod1.vStr4, "sendimg.zip")
						File.Delete(mod1.vStr4, "img.zip")
						updvis2("sendimg.zip", 21)
					End If
				End If
			End If
		End If
		httpjobVar.Sub024
	Catch
		mod1.Sub217(LastException.Message)
		Sub007()
	End Try
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub PostAPI(stoken As String) As ResumableSub
	Dim bres As Boolean
	Dim jg As JSONGenerator
	Dim mlist As List
	Dim mtmpmap As Map
	Dim j As httpjob
	Dim sjson As String
	Dim sm As String
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return Null
			Case 0
				rsState = 1
				bres = True
				'jg = JSONGenerator
				'mlist = List
				'mtmpmap = Map
				mlist.Initialize
				mtmpmap.Initialize
				Sub001(mtmpmap, True)
				mlist.Add(mtmpmap)
				jg.Initialize2(mlist)
				'j = httpjob
				j.Initialize("PostAPI", Me)
				sjson = jg.ToString
				sjson = sjson.SubString2(1, sjson.Length - 1)
				Dim vTmp As OkHttpRequest = j.Sub011
				vTmp.InitializePost2(Main.v_webapiindirizzo & "/Datimatricola", sjson.GetBytes("UTF8"))
				j.Sub011.SetHeader("Token", stoken)
				Dim vTmp_ As OkHttpRequest = j.Sub011
				vTmp_.SetHeader("PartitaIva", Main.v_webapipi)
				j.Sub011.SetContentType("application/json")
				Wait For (j) Jobdone (wf15_0 As httpjob)
				rsState = 15
				Continue
			Case 1
				rsState = 14
				If j.vBln1 Then
					Continue
				Else
					rsState = 3
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 4
				sm = j.vStr3
				Continue
			Case 4
				rsState = 13
				If sm <> "java.io.EOFException" Then
					rsState = 6
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 6
			Case 6
				rsState = 7
				Continue
			Case 7
				rsState = 12
				If sm = "Not Found" Then
					rsState = 9
					Continue
				Else If sm <> "Unauthorized" Then
					Continue
				Else
					rsState = 11
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 9
			Case 9
				rsState = 12
				Sub008("La partita iva del concessionario non è stata trovata sul server")
				bres = False
				Continue
			Case 11
				rsState = 12
				Sub008("Il Token non è valido")
				bres = False
				Continue
			Case 12
				rsState = 13
				mod1.Sub215("Errore aggiornamento stato portale " & TAB & sm)
				Continue
			Case 13
				rsState = 14
				Continue
			Case 14
				rsState = -1
				j.Sub024
				Return bres
			Case 15
				rsState = 1
				j = wf15_0
				Continue
		End Select
	Loop
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub PutAPI(stoken As String, api As String) As ResumableSub
	Dim bres As Boolean
	Dim jg As JSONGenerator
	Dim mlist As List
	Dim mtmpmap As Map
	Dim j As httpjob
	Dim sjson As String
	Dim sm As String
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return Null
			Case 0
				rsState = 1
				bres = True
				'jg = JSONGenerator
				'mlist = List
				'mtmpmap = Map
				mlist.Initialize
				mtmpmap.Initialize
				Sub001(mtmpmap, False)
				mlist.Add(mtmpmap)
				jg.Initialize2(mlist)
				'j = httpjob
				j.Initialize("PutAPI", Me)
				sjson = jg.ToString
				sjson = sjson.SubString2(1, sjson.Length - 1)
				Dim httpjobVar As httpjob = j
				httpjobVar.Sub022(Main.v_webapiindirizzo & api, sjson.GetBytes("UTF8"))
				j.Sub011.SetHeader("Token", stoken)
				Dim vTmp As OkHttpRequest = j.Sub011
				vTmp.SetHeader("PartitaIva", Main.v_webapipi)
				j.Sub011.SetContentType("application/json")
				Wait For (j) Jobdone (wf15_0 As httpjob)
				rsState = 15
				Continue
			Case 1
				rsState = 14
				If j.vBln1 Then
					Continue
				Else
					rsState = 3
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 4
				sm = j.vStr3
				Continue
			Case 4
				rsState = 13
				If sm <> "java.io.EOFException" Then
					rsState = 6
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 6
			Case 6
				rsState = 7
				Continue
			Case 7
				rsState = 12
				If sm = "Not Found" Then
					rsState = 9
					Continue
				Else If sm <> "Unauthorized" Then
					Continue
				Else
					rsState = 11
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 9
			Case 9
				rsState = 12
				Sub008("La partita iva del concessionario non è stata trovata sul server")
				bres = False
				Continue
			Case 11
				rsState = 12
				Sub008("Il Token non è valido")
				bres = False
				Continue
			Case 12
				rsState = 13
				mod1.Sub215("Errore aggiornamento stato portale " & TAB & sm)
				Continue
			Case 13
				rsState = 14
				Continue
			Case 14
				rsState = -1
				j.Sub024
				Return bres
			Case 15
				rsState = 1
				j = wf15_0
				Continue
		End Select
	Loop
End Sub

Sub resetglory As String
	If Main.v_ipvis = "" Then
		Return "Configurare l'indirizzo Ip del VisionDroid"
	End If
	If Not(vv7) Then
		If Main.vBln11 Then
			Dim httpjobVar As httpjob
			httpjobVar.Initialize("gloryExecReset", Me)
			httpjobVar.Sub021("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=reset", "")
			If Main.v_logvd Then
				mod1.Sub219("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=reset", "")
			End If
			Return "Reset Inviato"
		End If
	End If
	Return "il Cash Management risulta essere offline"
End Sub

Sub richiedicontodaclient(i As Int)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("contodaclient", Me)
	httpjobVar.Sub021("http://" & Main.v_ipserver & ":12312/conto2_" & i & "_" & Main.v_numcassa, "")
End Sub

Sub sbloccatavolodaclient(i As Int, z As Boolean) As String
	Dim str As String
	Try
		If Main.vBln26 Then
			sendhellodaclient()
			str = ""
		Else
			Dim vExecQuerySingleResult As String = Main.vSql2.ExecQuerySingleResult("Select valore from progressivi where codice = 'SEND'")
			Dim vTmp As String = modfunstr.Sub003("00000000000" & vExecQuerySingleResult, 10)
			Main.vSql2.ExecNonQuery("update progressivi set valore = valore+1 where codice = 'SEND'")
			Dim vNumberToString As String = i
			str = "V" & vTmp & "_" & i & "_0_1_0_0_.txt"
			File.WriteString(Main.vStr17, str, "update tavoli set uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0,unlocktable=0 where tavolo =" & vNumberToString)
			If z Then
				inviavendutoclient("1")
			End If
		End If
		Return str
	Catch
		mod1.Sub217(LastException.Message)
		Main.vBln26 = True
		If mod1.vStr1 = "Main" Then
			CallSub(mod1.vStr1, "ChangeStateClient")
		End If
		Return ""
	End Try
End Sub

Sub sbloccatavolomanualedaclient(i As Int)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("sbloccadaclient_" & i & "_", Me)
	httpjobVar.Sub021("http://" & Main.v_ipserver & ":12312/sblocca_" & i & "_" & Main.v_numcassa, "")
End Sub

Sub senddatiscontrinodaclient(list As List)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("senddatiscontrino", Me)
	httpjobVar.Sub021("http://" & Main.v_ipserver & ":12312/datiscontrino_" & list.Get(0) & "_" & list.Get(1) & "_" & list.Get(2) & "_" & list.Get(3) & "_" & list.Get(4) & "_" & Main.v_numcassa, "")
End Sub

Sub sendhellodaclient
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("hello", Me)
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/hello_" & Main.v_numcassa & "_" & IIf(Main.vBln26, "1", "0") & "_" & Main.v_mver)
End Sub

Sub sendhellodaclientperaperturatavolo(str As String, str2 As String)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("apritav_" & str & "_" & str2, Me)
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/apritav_" & str & "_" & Main.Operatore & "_" & Main.v_numcassa & "_" & Main.v_mver)
End Sub

Sub sendhellodaclientperchiusuramov(i As Int)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("chiudimov" & i, Me)
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/hello_" & Main.v_numcassa & "_" & IIf(Main.vBln26, "1", "0") & "_" & Main.v_mver)
End Sub

Sub sendhellodaclientperrichiamomovimento(j As Long)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("recmov_" & j, Me)
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/recmov_" & j & "_" & Main.v_numcassa & "_" & Main.v_mver)
End Sub

Sub sendhellodaclientperrichiestaoperatore(str As String, str2 As String)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("opertav_" & str & "_" & str2, Me)
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/opertav_" & str & "_" & Main.Operatore & "_" & Main.v_numcassa & "_" & Main.v_mver)
End Sub

Sub sendhellodaclientpersospensionetavolo
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("sospenditav", Me)
	httpjobVar.Sub004("http://" & Main.v_ipserver & ":12312/hello_" & Main.v_numcassa & "_" & IIf(Main.vBln26, "1", "0") & "_" & Main.v_mver)
	vv5 = True
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub sendimgpalmari(seriale As String)
	Dim tmppath As String
	Dim ls As List
	Dim txt As String
	Dim mfile() As String
	Dim myzip As ArchiverForB4A
	Dim files As List
	Dim fd As multipartfiledata
	Dim nv As Map
	Dim job2 As httpjob
	Dim ip As String
	Dim mresult As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 6
					If Main.vBln11 Then
						If mod1.vStr1 = "Main" Then
							Continue
						End If
					End If
					rsState = 3
					Continue
				Case 3
					rsState = 6
					Return
				Case 6
					rsState = 7
					tmppath = Main.vStr7 & "/" & seriale & "/ImgPalm/Send"
					'ls = List
					ls.Initialize
					Dim list As List = ls
					list.AddAll(File.ListFiles(tmppath))
					Continue
				Case 7
					rsState = 26
					rsState = 9
					Continue
				Case 9
					rsState = 10
					Continue
				Case 10
					rsState = 25
					If ls.Size > 0 Then
						rsState = 12
						Continue
					Else
						rsState = 24
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 12
				Case 12
					rsState = 13
					ToastMessageShow("Invio di " & ls.Get(0) & " al palmare " & seriale, False)
					Continue
				Case 13
					rsState = 22
					If File.Size(tmppath, ls.Get(0)) <= 1500000 Then
						Continue
					Else
						rsState = 15
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 15
				Case 15
					rsState = 16
					File.Delete(tmppath, ls.Get(0))
					txt = "Il file " & ls.Get(0) & " risulta essere più grande di 1,5Mb(non verrà inviato al palmare)."
					Continue
				Case 16
					rsState = 21
					If mod1.vStr1 = "Main" Then
						rsState = 18
						Continue
					Else
						rsState = 20
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 18
				Case 18
					rsState = 21
					CallSub2(mod1.vStr1, "MsgboxOnly", txt)
					Continue
				Case 20
					rsState = 21
					ToastMessageShow(txt, True)
					Continue
				Case 21
					rsState = 22
					ls.Initialize
					Dim list2 As List = ls
					list2.AddAll(File.ListFiles(tmppath))
					rsState = 7
					Continue
				Case 22
					rsState = 25
					Dim mfile(0) As String
					mfile = Array As String(ls.Get(0))
					'myzip = ArchiverForB4A
					Dim archiverForB4A As ArchiverForB4A = myzip
					Dim str As String = tmppath
					Dim strArr() As String = mfile
					archiverForB4A.ZipFiles(str, strArr, mod1.vStr4, "Immagini.zip", "")
					File.Delete(tmppath, ls.Get(0))
					rsState = 26
					Continue
				Case 24
					rsState = 25
					ToastMessageShow("Procedura ultimata correttamente per il palmare " & seriale, True)
					Return
				Case 25
					rsState = 7
					Continue
				Case 26
					rsState = 27
					'files = List
					files.Initialize
					'fd = multipartfiledata
					fd.Initialize
					Dim multipartfiledataVar As multipartfiledata = fd
					multipartfiledataVar.Dir = mod1.vStr4
					fd.FileName = "Immagini.zip"
					fd.KeyName = "upfile"
					fd.ContentType = "application/octet-stream"
					files.Add(fd)
					'nv = Map
					nv.Initialize
					nv.Put("upfile", "Immagini.zip")
					'job2 = httpjob
					job2.Initialize(seriale, Me)
					ip = Main.vSql1.ExecQuerySingleResult("Select IP from Palmari where Serial='" & seriale & "'")
					job2.Sub020("http://" & ip & ":12315/Img", nv, files)
					Wait For (job2) Jobdone (wf53_0 As httpjob)
					rsState = 53
					Continue
				Case 27
					rsState = 52
					If job2.vBln1 Then
						rsState = 29
						Continue
					Else
						rsState = 47
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 29
				Case 29
					rsState = 30
					Continue
				Case 30
					rsState = 45
					rsCatchState = 44
					rsState = 32
					Continue
				Case 32
					rsState = 33
					rsCatchState = 44
					mresult = job2.Sub012
					Continue
				Case 33
					rsState = 42
					If mresult <> "OK" Then
						rsState = 35
						Continue
					Else
						rsState = 41
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 35
				Case 35
					rsState = 36
					Continue
				Case 36
					rsState = 39
					If mod1.vStr1 <> "Main" Then
						If mod1.vStr1 <> "ConfPalmari" Then
							Continue
						End If
					End If
					rsState = 38
					Continue
				Case 38
					rsState = 39
					CallSub2(mod1.vStr1, "MsgboxOnly", mresult)
					Continue
				Case 39
					rsState = 42
					Continue
				Case 41
					rsState = 42
					sendimgpalmari(seriale)
					Continue
				Case 42
					rsState = 45
					Continue
				Case 44
					rsState = 45
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 45
					rsState = 52
					rsCatchState = 0
					Continue
				Case 47
					rsState = 48
					Continue
				Case 48
					rsState = 51
					If mod1.vStr1 <> "Main" Then
						If mod1.vStr1 <> "ConfPalmari" Then
							Continue
						End If
					End If
					rsState = 50
					Continue
				Case 50
					rsState = 51
					CallSub2(mod1.vStr1, "MsgboxOnly", "Il palmare " & job2.vStr1 & " non è stato aggiornato")
					Continue
				Case 51
					rsState = 52
					Continue
				Case 52
					rsState = -1
					job2.Sub024
					Continue
				Case 53
					rsState = 27
					job2 = wf53_0
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub sendlockpalmari(ip As String, seriale As Int)
	Dim files As List
	Dim fd As multipartfiledata
	Dim nv As Map
	Dim job2 As httpjob
	Dim mresult As String
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				Continue
			Case 1
				rsState = 22
				If Not(File.Exists(Main.vStr7, "Lock.zip")) Then
					Continue
				Else
					rsState = 3
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 4
				'files = List
				files.Initialize
				'fd = multipartfiledata
				fd.Initialize
				Dim multipartfiledataVar As multipartfiledata = fd
				multipartfiledataVar.Dir = Main.vStr7
				fd.FileName = "Lock.zip"
				fd.KeyName = "upfile"
				fd.ContentType = "application/octet-stream"
				files.Add(fd)
				'nv = Map
				nv.Initialize
				nv.Put("upfile", "Lock.zip")
				'job2 = httpjob
				job2.Initialize(seriale, Me)
				job2.Sub020("http://" & ip & ":12315/Lock", nv, files)
				Wait For (job2) Jobdone (wf23_0 As httpjob)
				rsState = 23
				Continue
			Case 4
				rsState = 21
				If job2.vBln1 Then
					rsState = 6
					Continue
				Else
					rsState = 16
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 6
			Case 6
				rsState = 7
				mresult = job2.Sub012
				Continue
			Case 7
				rsState = 14
				If mresult <> "OK" Then
					rsState = 9
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 9
			Case 9
				rsState = 10
				Continue
			Case 10
				rsState = 13
				If mod1.vStr1 <> "Main" Then
					If mod1.vStr1 <> "ConfPalmari" Then
						Continue
					End If
				End If
				rsState = 12
				Continue
			Case 12
				rsState = 13
				CallSub2(mod1.vStr1, "MsgboxOnly", mresult)
				Continue
			Case 13
				rsState = 14
				Continue
			Case 14
				rsState = 21
				Continue
			Case 16
				rsState = 17
				Continue
			Case 17
				rsState = 20
				If mod1.vStr1 <> "Main" Then
					If mod1.vStr1 <> "ConfPalmari" Then
						Continue
					End If
				End If
				rsState = 19
				Continue
			Case 19
				rsState = 20
				CallSub2(mod1.vStr1, "MsgboxOnly", "Il palmare " & job2.vStr1 & " non è stato aggiornato")
				Continue
			Case 20
				rsState = 21
				Continue
			Case 21
				rsState = 22
				job2.Sub024
				Continue
			Case 22
				rsState = -1
				Continue
			Case 23
				rsState = 4
				job2 = wf23_0
				Continue
		End Select
	Loop
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub sendmsgpalmari(ip As String, seriale As Int)
	Dim files As List
	Dim fd As multipartfiledata
	Dim nv As Map
	Dim job2 As httpjob
	Dim mresult As String
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				Continue
			Case 1
				rsState = 22
				If Not(File.Exists(Main.vStr7, "Msg.zip")) Then
					Continue
				Else
					rsState = 3
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 4
				'files = List
				files.Initialize
				'fd = multipartfiledata
				fd.Initialize
				Dim multipartfiledataVar As multipartfiledata = fd
				multipartfiledataVar.Dir = Main.vStr7
				fd.FileName = "Msg.zip"
				fd.KeyName = "upfile"
				fd.ContentType = "application/octet-stream"
				files.Add(fd)
				'nv = Map
				nv.Initialize
				nv.Put("upfile", "Msg.zip")
				'job2 = httpjob
				job2.Initialize(seriale, Me)
				job2.Sub020("http://" & ip & ":12315/Msg", nv, files)
				Wait For (job2) Jobdone (wf23_0 As httpjob)
				rsState = 23
				Continue
			Case 4
				rsState = 21
				If job2.vBln1 Then
					rsState = 6
					Continue
				Else
					rsState = 16
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 6
			Case 6
				rsState = 7
				mresult = job2.Sub012
				Continue
			Case 7
				rsState = 14
				If mresult <> "OK" Then
					rsState = 9
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 9
			Case 9
				rsState = 10
				Continue
			Case 10
				rsState = 13
				If mod1.vStr1 <> "Main" Then
					If mod1.vStr1 <> "ConfPalmari" Then
						Continue
					End If
				End If
				rsState = 12
				Continue
			Case 12
				rsState = 13
				CallSub2(mod1.vStr1, "MsgboxOnly", mresult)
				Continue
			Case 13
				rsState = 14
				Continue
			Case 14
				rsState = 21
				Continue
			Case 16
				rsState = 17
				Continue
			Case 17
				rsState = 20
				If mod1.vStr1 <> "Main" Then
					If mod1.vStr1 <> "ConfPalmari" Then
						Continue
					End If
				End If
				rsState = 19
				Continue
			Case 19
				rsState = 20
				CallSub2(mod1.vStr1, "MsgboxOnly", "Il palmare " & job2.vStr1 & " non è stato aggiornato")
				Continue
			Case 20
				rsState = 21
				Continue
			Case 21
				rsState = 22
				job2.Sub024
				Continue
			Case 22
				rsState = -1
				Continue
			Case 23
				rsState = 4
				job2 = wf23_0
				Continue
		End Select
	Loop
End Sub

Sub sendprenotapalmari(str As String, str2 As String)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("WebPrenota", Me)
	httpjobVar.Sub021("http://" & str & ":12315/prenotaweb_" & str2, "")
End Sub

Sub sendrichiestavarclient
	If File.Exists(mod1.vStr4 & "/SEND", "Anagra.zip") Then
		File.Delete(mod1.vStr4 & "/SEND", "Anagra.zip")
	End If
	SendVariazioniAiClient()
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub sendscontrinoaiclient(scassa As String, nmov As String)
	Dim mfile() As String
	Dim myzip As ArchiverForB4A
	Dim files As List
	Dim nv As Map
	Dim fd As multipartfiledata
	Dim icassa As Int
	Dim job2 As httpjob
	Dim mresult As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 47
					If Not(File.Exists(Main.vStr7, "Scontrino.job")) Then
						Continue
					Else
						rsState = 3
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 3
				Case 3
					rsState = 4
					Continue
				Case 4
					rsState = 46
					rsCatchState = 45
					rsState = 6
					Continue
				Case 6
					rsState = 7
					rsCatchState = 45
					Continue
				Case 7
					rsState = 12
					If Not(File.Exists(mod1.vStr4 & "/SEND", "Scontrino.zip")) Then
						Continue
					Else
						rsState = 9
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 9
				Case 9
					rsState = 12
					File.Delete(mod1.vStr4 & "/SEND", "Scontrino.zip")
					Continue
				Case 12
					rsState = 13
					File.Copy(Main.vStr7, "Scontrino.job", mod1.vStr4 & "/SEND", "Scontrino.job")
					Dim mfile(1) As String
					mfile(0) = "Scontrino.job"
					'myzip = ArchiverForB4A
					Dim archiverForB4A As ArchiverForB4A = myzip
					Dim strArr() As String = mfile
					archiverForB4A.ZipFiles(Main.vStr7, strArr, mod1.vStr4 & "/SEND", "Scontrino.zip", "")
					'files = List
					files.Initialize
					'nv = Map
					nv.Initialize
					Continue
				Case 13
					rsState = 43
					If Not(File.Exists(mod1.vStr4 & "/SEND", "Scontrino.zip")) Then
						Continue
					Else
						rsState = 15
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 15
				Case 15
					rsState = 16
					'fd = multipartfiledata
					fd.Initialize
					Dim multipartfiledataVar As multipartfiledata = fd
					multipartfiledataVar.Dir = mod1.vStr4 & "/SEND"
					fd.FileName = "Scontrino.zip"
					fd.KeyName = "upfile"
					fd.ContentType = "application/octet-stream"
					files.Add(fd)
					nv.Put("upfile", "Scontrino.zip")
					nv.Put("nmov", nmov)
					icassa = scassa
					Main.vCur1.Position = icassa - 1
					'job2 = httpjob
					job2.Initialize(icassa, Me)
					Dim httpjobVar As httpjob = job2
					httpjobVar.Sub020("http://" & Main.vCur1.GetString("IP") & ":12312/stampascontrino", nv, files)
					job2.Sub011.Timeout = 150000
					vv5 = True
					Wait For (job2) Jobdone (wf48_0 As httpjob)
					rsState = 48
					Continue
				Case 16
					rsState = 42
					If job2.vBln1 Then
						rsState = 18
						Continue
					Else
						rsState = 35
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 18
				Case 18
					rsState = 19
					Continue
				Case 19
					rsState = 33
					rsCatchState = 32
					rsState = 21
					Continue
				Case 21
					rsState = 22
					rsCatchState = 32
					vv5 = False
					mresult = ""
					Continue
				Case 22
					rsState = 27
					rsCatchState = 26
					rsState = 24
					Continue
				Case 24
					rsState = 27
					rsCatchState = 26
					mresult = job2.Sub012
					Continue
				Case 26
					rsState = 27
					rsCatchState = 32
					mod1.Sub217(LastException.Message)
					Continue
				Case 27
					rsState = 30
					rsCatchState = 32
					If mresult <> "OK" And mresult <> "" Then
						rsState = 29
						Continue
					End If
					Continue
				Case 29
					rsState = 30
					ToastMessageShow(mresult, True)
					mod1.Sub215(mresult)
					Main.vSql1.ExecNonQuery("update clients set stato =3 where codice = " & job2.vStr1)
					Dim cursorWrapper As Cursor
					Main.vCur1 = Main.vSql1.ExecQuery("Select * from clients order by codice")
					CallSub2(Main, "ResStampaSco", False)
					job2.Sub024
					Return
				Case 30
					rsState = 33
					CallSub2(Main, "ResStampaSco", True)
					job2.Sub024
					Return
				Case 32
					rsState = 33
					rsCatchState = 45
					mod1.Sub217(LastException.Message)
					Continue
				Case 33
					rsState = 42
					rsCatchState = 45
					Continue
				Case 35
					rsState = 36
					Continue
				Case 36
					rsState = 41
					rsCatchState = 40
					rsState = 38
					Continue
				Case 38
					rsState = 41
					rsCatchState = 40
					Sub013(job2.vStr1, False)
					vv5 = False
					CallSub2(Main, "ResStampaSco", False)
					Continue
				Case 40
					rsState = 41
					rsCatchState = 45
					mod1.Sub217(LastException.Message)
					Continue
				Case 41
					rsState = 42
					rsCatchState = 45
					Continue
				Case 42
					rsState = 43
					job2.Sub024
					Return
				Case 43
					rsState = 46
					Continue
				Case 45
					rsState = 46
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 46
					rsState = 47
					rsCatchState = 0
					Continue
				Case 47
					rsState = -1
					CallSub2(Main, "ResStampaSco", False)
					Continue
				Case 48
					rsState = 16
					job2 = wf48_0
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

Sub sendvariazionetavoloaiclient(iArr As Int(), str As String)
	Dim str2 As String
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from clients where stato = 1 or stato =2") > 0 Then
		Dim randomAccessFile As RandomAccessFile
		Dim sb2 As String = Main.vStr7 & "/" & str & "/Tavoli"
		If str.Length > 1 Then
			str2 = Main.vStr7 & "/" & Main.v_numcassa & "/Tavoli"
		Else
			str2 = sb2
		End If
		If File.Exists(str2, "Tavolo.txt") Then
			File.Delete(str2, "Tavolo.txt")
		End If
		randomAccessFile.Initialize2(str2, "Tavolo.txt", False, False)
		Initialize
		Initialize
		Dim str3 As String = ""
		Dim length As Int = iArr.Length - 1
		Dim i As Int = 0
		Do While i <= length
			Dim str4 As String = str3 & iArr(i) & "_"
			i = i + 1
			str3 = str4
		Loop
		randomAccessFile.WriteObject(str3, True, randomAccessFile.CurrentPosition)
		Dim length2 As Int = iArr.Length - 1
		Dim str5 As String = str3
		Dim i2 As Int
		For i2 = 0 To length2
			Initialize
			Dim vTmp As Map = dbutil.Sub006(Main.vSql1, "Select * from tavoli where tavolo = " & SmartStringFormatter("", iArr(i2)) & "", Null)
			str5 = str5 & iArr(i2) & "_"
			If vTmp.IsInitialized Then
				randomAccessFile.WriteObject(vTmp, True, randomAccessFile.CurrentPosition)
			Else
				Return
			End If
		Next
		randomAccessFile.Close
		If File.Exists(str2, "Tavolo.txt") Then
			If File.Exists(str2, "Tavolo.txt") Then
				Dim rowCount As Int = Main.vCur1.RowCount - 1
				Dim z As Boolean = False
				Dim i3 As Int
				For i3 = 0 To rowCount
					Main.vCur1.Position = i3
					If Main.vCur1.GetInt("stato") <> 0 Then
						If Main.vCur1.GetInt("stato") <> 3 Then
							If Main.vCur1.GetInt("solotessere") <> 1 Then
								Dim vGetString As String = Main.vCur1.GetString("codice")
								If vGetString <> Main.v_numcassa Then
									Dim sb5 As String = mod1.vStr4 & "/T" & Main.vCur1.GetString("codice") & "/TAVOLI"
									Dim sb6 As String = "T_" & modfunstr.Sub003("0000000000" & Main.vCur1.GetString("compare"), 10) & "_" & mod1.Sub059(mod1.Sub058) & "_" & str & "_" & Rnd(0, 999)
									File.Copy(str2, "Tavolo.txt", sb5, sb6 & ".tmp")
									If File.Exists(sb5, sb6 & ".tmp") Then
										mod1.Sub147(sb5, sb6 & ".tmp", sb5, sb6 & ".txt")
									End If
									Main.vSql1.ExecNonQuery("update clients set compare=compare+1 where codice = " & Main.vCur1.GetString("codice"))
									z = True
								End If
							End If
						End If
					End If
				Next
				If z Then
					If Main.vCur1.IsInitialized Then
						Main.vCur1.Close
					End If
					Dim cursorWrapper As Cursor
					Main.vCur1 = Main.vSql1.ExecQuery("Select * from clients order by codice")
				End If
			End If
		Else
			Return
		End If
	End If
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub SendVariazioniAiClient
	Dim limit11 As Int
	Dim limit22 As Int
	Dim limit45 As Int
	Dim step11 As Int
	Dim step22 As Int
	Dim step45 As Int
	Dim tmplcopy As List
	Dim tmplist As List
	Dim i As Int
	Dim myfile As String
	Dim mfile() As String
	Dim myzip As ArchiverForB4A
	Dim files As List
	Dim nv As Map
	Dim fd As multipartfiledata
	Dim x As Int
	Dim job2 As httpjob
	Dim mresult As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 84
					If Main.vSql1.ExecQuerySingleResult("Select count(*) from clients where stato = 1 or stato =2") <= 0 Then
						Continue
					Else
						rsState = 3
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 3
				Case 3
					rsState = 4
					Continue
				Case 4
					rsState = 83
					rsCatchState = 82
					rsState = 6
					Continue
				Case 6
					rsState = 7
					rsCatchState = 82
					Continue
				Case 7
					rsState = 26
					If File.Exists(mod1.vStr4 & "/SEND", "Anagra.zip") Then
						Continue
					Else
						rsState = 9
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 9
				Case 9
					rsState = 10
					Dim dirDefaultExternal As String = File.DirDefaultExternal
					File.Copy(dirDefaultExternal, "Anagra.db", mod1.vStr4 & "/SEND", "Anagra.db")
					Dim dirDefaultExternal2 As String = File.DirDefaultExternal
					File.Copy(dirDefaultExternal2, "Config.txt", mod1.vStr4 & "/SEND", "Config.txt")
					'tmplcopy = List
					tmplcopy.Initialize
					'tmplist = List
					tmplist.Initialize
					tmplcopy = File.ListFiles(File.DirDefaultExternal)
					Continue
				Case 10
					rsState = 17
					step11 = 1
					limit11 = tmplcopy.Size - 1
					i = 0
					rsState = 85
					Continue
				Case 12
					rsState = 13
					myfile = tmplcopy.Get(i)
					Continue
				Case 13
					rsState = 16
					If myfile.StartsWith("LayoutStampaTipo") And myfile.EndsWith(".cfg") Then
						rsState = 15
						Continue
					End If
					Continue
				Case 15
					rsState = 16
					tmplist.Add(myfile)
					Dim dirDefaultExternal3 As String = File.DirDefaultExternal
					Dim str As String = myfile
					File.Copy(dirDefaultExternal3, str, mod1.vStr4 & "/SEND", myfile)
					Continue
				Case 16
					rsState = 86
					Continue
				Case 17
					rsState = 18
					Dim mfile(tmplist.Size + 2) As String
					mfile(0) = "Anagra.db"
					mfile(1) = "Config.txt"
					Continue
				Case 18
					rsState = 25
					If tmplist.Size <= 0 Then
						Continue
					Else
						rsState = 20
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 20
				Case 20
					rsState = 21
					Continue
				Case 21
					rsState = 24
					step22 = 1
					limit22 = tmplist.Size - 1
					i = 0
					rsState = 87
					Continue
				Case 23
					rsState = 88
					mfile(i + 2) = tmplist.Get(i)
					Continue
				Case 24
					rsState = 25
					Continue
				Case 25
					rsState = 26
					'myzip = ArchiverForB4A
					Dim archiverForB4A As ArchiverForB4A = myzip
					Dim sb6 As String = mod1.vStr4 & "/SEND"
					Dim strArr() As String = mfile
					archiverForB4A.ZipFiles(sb6, strArr, mod1.vStr4 & "/SEND", "Anagra.zip", "")
					Continue
				Case 26
					rsState = 31
					If Not(Main.vCur1.IsInitialized) Then
						Continue
					Else
						rsState = 28
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 28
				Case 28
					rsState = 31
					Main.vCur1.Close
					Continue
				Case 31
					rsState = 32
					Dim cursorWrapper As Cursor
					Main.vCur1 = Main.vSql1.ExecQuery("Select * from clients order by codice")
					'files = List
					files.Initialize
					'nv = Map
					nv.Initialize
					vInt3 = 0
					Continue
				Case 32
					rsState = 80
					If File.Exists(mod1.vStr4 & "/SEND", "Anagra.zip") Then
						rsState = 34
						Continue
					Else
						rsState = 79
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 34
				Case 34
					rsState = 35
					'fd = multipartfiledata
					fd.Initialize
					Dim multipartfiledataVar As multipartfiledata = fd
					multipartfiledataVar.Dir = mod1.vStr4 & "/SEND"
					fd.FileName = "Anagra.zip"
					fd.KeyName = "upfile"
					fd.ContentType = "application/octet-stream"
					files.Add(fd)
					nv.Put("upfile", "Anagra.zip")
					Continue
				Case 35
					rsState = 77
					step45 = 1
					limit45 = Main.vCur1.RowCount - 1
					x = 0
					rsState = 89
					Continue
				Case 37
					rsState = 38
					Main.vCur1.Position = x
					Continue
				Case 38
					rsState = 43
					If Main.vCur1.GetInt("stato") <> 0 Then
						If Main.vCur1.GetInt("stato") <> 3 Then
							Continue
						End If
					End If
					rsState = 40
					Continue
				Case 40
					rsState = 43
					rsState = 90
					Continue
				Case 43
					rsState = 44
					Continue
				Case 44
					rsState = 49
					Dim vGetString As String = Main.vCur1.GetString("codice")
					If vGetString <> Main.v_numcassa Then
						Continue
					Else
						rsState = 46
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 46
				Case 46
					rsState = 49
					rsState = 90
					Continue
				Case 49
					rsState = 50
					'job2 = httpjob
					Dim httpjobVar As httpjob = job2
					httpjobVar.Initialize(Main.vCur1.GetInt("codice"), Me)
					Dim httpjobVar2 As httpjob = job2
					httpjobVar2.Sub020("http://" & Main.vCur1.GetString("IP") & ":12312/updanagra", nv, files)
					job2.Sub011.Timeout = 150000
					vInt3 = vInt3 + 1
					vv5 = True
					Wait For (job2) Jobdone (wf91_0 As httpjob)
					rsState = 91
					Continue
				Case 50
					rsState = 76
					If job2.vBln1 Then
						rsState = 52
						Continue
					Else
						rsState = 69
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 52
				Case 52
					rsState = 53
					Continue
				Case 53
					rsState = 67
					rsCatchState = 66
					rsState = 55
					Continue
				Case 55
					rsState = 56
					rsCatchState = 66
					Sub012()
					mresult = ""
					Continue
				Case 56
					rsState = 61
					rsCatchState = 60
					rsState = 58
					Continue
				Case 58
					rsState = 61
					rsCatchState = 60
					mresult = job2.Sub012
					Continue
				Case 60
					rsState = 61
					rsCatchState = 66
					mod1.Sub217(LastException.Message)
					Continue
				Case 61
					rsState = 64
					rsCatchState = 66
					If mresult <> "OK" And mresult <> "" Then
						rsState = 63
						Continue
					End If
					Continue
				Case 63
					rsState = 64
					Sub008(mresult)
					Main.vSql1.ExecNonQuery("update clients set stato =3 where codice = " & job2.vStr1)
					Dim cursorWrapper2 As Cursor
					Main.vCur1 = Main.vSql1.ExecQuery("Select * from clients order by codice")
					Continue
				Case 64
					rsState = 67
					Continue
				Case 66
					rsState = 67
					rsCatchState = 82
					mod1.Sub217(LastException.Message)
					Continue
				Case 67
					rsState = 76
					rsCatchState = 82
					Continue
				Case 69
					rsState = 70
					Continue
				Case 70
					rsState = 75
					rsCatchState = 74
					rsState = 72
					Continue
				Case 72
					rsState = 75
					rsCatchState = 74
					Sub013(job2.vStr1, True)
					Sub012()
					Continue
				Case 74
					rsState = 75
					rsCatchState = 82
					mod1.Sub217(LastException.Message)
					Continue
				Case 75
					rsState = 76
					rsCatchState = 82
					Continue
				Case 76
					rsState = 90
					job2.Sub024
					Continue
				Case 77
					rsState = 80
					Continue
				Case 79
					rsState = 80
					Return
				Case 80
					rsState = 83
					Continue
				Case 82
					rsState = 83
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 83
					rsState = 84
					rsCatchState = 0
					Continue
				Case 84
					rsState = -1
					Continue
				Case 85
					rsState = 17
					If (step11 > 0 And i <= limit11) Or (step11 < 0 And i >= limit11) Then
						rsState = 12
						Continue
					End If
					Continue
				Case 86
					rsState = 85
					i = i + 0 + step11
					Continue
				Case 87
					rsState = 24
					If (step22 > 0 And i <= limit22) Or (step22 < 0 And i >= limit22) Then
						rsState = 23
						Continue
					End If
					Continue
				Case 88
					rsState = 87
					i = i + 0 + step22
					Continue
				Case 89
					rsState = 77
					If (step45 > 0 And x <= limit45) Or (step45 < 0 And x >= limit45) Then
						rsState = 37
						Continue
					End If
					Continue
				Case 90
					rsState = 89
					x = x + 0 + step45
					Continue
				Case 91
					rsState = 50
					job2 = wf91_0
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

Sub Service_Create
End Sub

Sub Service_Destroy
End Sub

Sub Service_Start(intentWrapper As Intent)
	vv2.Initialize("TimerUpdVis", 2000)
	vv2.Enabled = False
	vv3.Initialize("TimerWaitGame", 2000)
	vv3.Enabled = False
	If Main.vBln25 Then
		sendhellodaclient()
	End If
	If vv4 Then
		Sub015()
		Return
	End If
End Sub

Sub Sub011(str As String, i As Int, z As Boolean) As String
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	If str.Length > 0 Then
		Dim length As Int = str.Length
		Dim i2 As Int
		For i2 = 1 To length
			Dim charAt As Char = str.CharAt(i2 - 1)
			If (Asc(charAt) < 42 Or Asc(charAt) > 63) And (Asc(charAt) < 65 Or Asc(charAt) > 90) And (Asc(charAt) < 97 Or Asc(charAt) > 122) Then
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
					Case Else
						charAt = " "
				End Select
			End If
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

Sub Sub012
	If vInt3 <> 0 Then
		vInt3 = vInt3 - 1
		If vInt3 <= 0 Then
			vv5 = False
			vInt3 = 0
			Return
		End If
		Return
	End If
End Sub

Sub Sub013(i As Int, z As Boolean)
	If z Then
		Sub008("Errore di collegamento con il Terminale " & i)
	Else
		ToastMessageShow("Errore di collegamento con il Terminale " & i, True)
	End If
	Main.vSql1.ExecNonQuery("update clients set stato =3 where codice = " & i)
	Dim cursorWrapper As Cursor
	Main.vCur1 = Main.vSql1.ExecQuery("Select * from clients order by codice")
End Sub

Sub spostatavolodaclient(i As Int, i2 As Int)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("spostadaclient_" & i & "_" & i2 & "_", Me)
	httpjobVar.Sub021("http://" & Main.v_ipserver & ":12312/sposta_" & i & "_" & i2 & "_" & Main.v_numcassa, "")
End Sub

Sub Sub014(str As String, str2 As String)
	Dim i As Int = 0
	Try
		Dim vReadString As String = File.ReadString(File.DirDefaultExternal & "/FE", str2)
		Dim vSplit() As String = Regex.Split("_", vReadString)
		If str <> "" Then
			If Not(Main.vBln30) Then
				If Main.v_stampafattura < 10 Then
					If Main.v_stampafattura < 19 Then
						Dim vTmp As ckprinter = mod1.Sub138(Main.v_stampafattura)
						If vTmp = Null Then
							Return
						End If
						vTmp.doc_inizio
						vTmp.doc_paginizio(False)
						vTmp.doc_testostile(False, True, True, False, False, False, False, "")
						vTmp.doc_testogiustifica(1)
						vTmp.doc_testostampa("Esito Invio Fattura:")
						vTmp.doc_testostile(False, True, False, False, False, False, False, "")
						vTmp.doc_testostampa(str)
						Dim length As Int = vSplit.Length - 1
						Do While i <= length
							Dim replace As String = vSplit(i).Replace("@@@UNDERSCORE@@@", "_")
							If replace.Length > 2 Then
								If replace.SubString2(0, 1) = "1" Then
									vTmp.doc_testostile(False, True, True, False, False, False, False, "")
								Else
									vTmp.doc_testostile(False, True, False, False, False, False, False, "")
								End If
								vTmp.doc_testostampa(replace.SubString(1))
							End If
							i = i + 1
						Loop
						vTmp.doc_pagfine(False)
						vTmp.doc_fine
						If Main.v_disconnettiprt Then
							vTmp.Sub001
						End If
					End If
				End If
			End If
			Main.vccefdll1.nf_apri(False)
			Main.vccefdll1.nf_testo("Esito Invio Fattura:", 4)
			Main.vccefdll1.nf_testo(str, 1)
			Dim length2 As Int = vSplit.Length - 1
			Do While i <= length2
				Dim replace2 As String = vSplit(i).Replace("@@@UNDERSCORE@@@", "_")
				If replace2.Length > 2 Then
					Main.vccefdll1.nf_testo(replace2.SubString(1), IIf(replace2.SubString2(0, 1) = "1", 4, 3))
				End If
				i = i + 1
			Loop
			Main.vccefdll1.nf_chiudi
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	File.Delete(File.DirDefaultExternal & "/FE", str2)
End Sub

Sub Timerupdvis_Tick
	vv2.Enabled = False
	updvis("")
End Sub

Sub Timerwaitgame_Tick
	If Main.v_ipvis <> "" And Not(vv7) Then
		If Main.vBln11 Then
			Dim httpjobVar As httpjob
			httpjobVar.Initialize("Game", Me)
			httpjobVar.Sub021("http://" & Main.v_ipvis & ":" & "12398" & "/wait", "")
			Return
		End If
	End If
	vv3.Enabled = False
End Sub

Sub uniscitavolodaclient(i As Int, i2 As Int)
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("uniscidaclient_" & i & "_" & i2 & "_", Me)
	httpjobVar.Sub021("http://" & Main.v_ipserver & ":12312/unisci_" & i & "_" & i2 & "_" & Main.v_numcassa, "")
End Sub

Sub updbila
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("updbila", Me)
	httpjobVar.Sub021("http://" & Main.v_ipserverbila & ":" & "12399" & "/upload?type=updbila", "")
End Sub

Sub updcashology
	If Main.v_ipvis <> "" And Not(vv7) Then
		If Main.vBln11 Then
			Dim httpjobVar As httpjob
			httpjobVar.Initialize("Cashlogy", Me)
			httpjobVar.Sub021("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=bk", "get")
			If Main.v_logvd Then
				mod1.Sub219("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=bk", "get")
			End If
			Return
		End If
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/httpclient.java, metodo _updglory (riga 6694).
Sub updglory(str As String) As String
	If Main.v_ipvis = "" Then
		Return "Configurare l'indirizzo Ip del VisionDroid"
	End If
	If Not(vv7) Then
		If Main.vBln11 Then
			If str <> "" Then
				If str.Contains("-") Then
					str = "-" & str.Replace("-", "")
				End If
				If Main.v_glory <> Main.cm_gloryvd Then
					Dim i2 As Int = Main.v_glory
				End If
				str = "@Valore@=" & str
				Dim httpjobVar As httpjob
				httpjobVar.Initialize("glorySendImporto", Me)
				httpjobVar.Sub021("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=importo", str)
				If Main.v_logvd Then
					mod1.Sub219("http://" & Main.v_ipvis & ":" & "12398" & "/upload?type=importo", str)
				End If
			End If
			Return ""
		End If
	End If
	Return "il Cash management risulta essere offline"
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub updvis(stringa As String)
	Dim limit28 As Int
	Dim step28 As Int
	Dim m_port As String
	Dim job2 As httpjob
	Dim curdisp As Cursor
	Dim mstringa As StringBuilder
	Dim tw As TextWriter
	Dim x As Int
	Dim files As List
	Dim fd As multipartfiledata
	Dim nv As Map
	Dim mresult As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 6
					If Main.v_ipvis <> "" Then
						If Not(vv7) Then
							If Main.vBln11 Then
								Continue
							End If
						End If
					End If
					rsState = 3
					Continue
				Case 3
					rsState = 6
					Return
				Case 6
					rsState = 7
					m_port = "12398"
					Continue
				Case 7
					rsState = 34
					If stringa = "" Then
						If Main.v_glory <= 0 Then
							Continue
						End If
					End If
					rsState = 9
					Continue
				Case 9
					rsState = 10
					'job2 = httpjob
					job2.Initialize("Vis", Me)
					Continue
				Case 10
					rsState = 33
					If Main.v_glory > 0 Then
						rsState = 12
						Continue
					Else
						rsState = 26
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 12
				Case 12
					rsState = 13
					Continue
				Case 13
					rsState = 18
					If Main.v_glory <> Main.cm_gloryvd Then
						If Main.v_glory <> Main.cm_cashmatic Then
							Continue
						End If
					End If
					rsState = 15
					Continue
				Case 15
					rsState = 18
					stringa = "@Valore@=" & stringa
					Continue
				Case 18
					rsState = 19
					Dim httpjobVar As httpjob = job2
					Dim sb As String = "http://" & Main.v_ipvis & ":" & m_port & "/upload?type=text"
					httpjobVar.Sub021(sb, stringa & "," & Main.vDbl1)
					Continue
				Case 19
					rsState = 24
					If Not(Main.v_logvd) Then
						Continue
					Else
						rsState = 21
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 21
				Case 21
					rsState = 24
					Dim sb2 As String = "http://" & Main.v_ipvis & ":" & m_port & "/upload?type=text"
					mod1.Sub219(sb2, stringa & "," & Main.vDbl1)
					Continue
				Case 24
					rsState = 33
					Continue
				Case 26
					rsState = 27
					Dim httpjobVar2 As httpjob = job2
					httpjobVar2.Sub021("http://" & Main.v_ipvis & ":" & m_port & "/" & stringa, "")
					Continue
				Case 27
					rsState = 32
					If Not(Main.v_logvd) Then
						Continue
					Else
						rsState = 29
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 29
				Case 29
					rsState = 32
					mod1.Sub219("http://" & Main.v_ipvis & ":" & m_port & "/" & stringa, "")
					Continue
				Case 32
					rsState = 33
					Continue
				Case 33
					rsState = 34
					Continue
				Case 34
					rsState = 96
					If stringa = "" Then
						Continue
					End If
					If Main.v_glory <> Main.cm_gloryvd Then
						If Main.v_glory <> Main.cm_cashmatic Then
							z2 = True
							If z2 Then
								rsState = 36
								Continue
							Else
								Continue
							End If
						End If
					End If
					z2 = False
					If z2 Then
					End If
					'(fallthrough java verso il case successivo)
					rsState = 36
				Case 36
					rsState = 37
					'curdisp = Cursor
					Continue
				Case 37
					rsState = 42
					If Main.vBln12 Then
						rsState = 39
						Continue
					Else
						rsState = 41
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 39
				Case 39
					rsState = 42
					Dim cursorWrapper As Cursor
					curdisp = Main.vSql1.ExecQuery("Select * from VenTmp where Qtad>0 order by chiave")
					Continue
				Case 41
					rsState = 42
					Dim cursorWrapper2 As Cursor
					curdisp = Main.vSql1.ExecQuery("Select * from VenTmp order by chiave")
					Continue
				Case 42
					rsState = 95
					If curdisp.RowCount > 0 Then
						rsState = 44
						Continue
					Else
						rsState = 72
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 44
				Case 44
					rsState = 45
					curdisp.Position = 0
					'mstringa = StringBuilder
					mstringa.Initialize
					'tw = TextWriter
					Dim textWriterWrapper As TextWriter = tw
					textWriterWrapper.Initialize(File.OpenOutput(File.DirInternal, "Refresh.txt", False))
					Continue
				Case 45
					rsState = 48
					step28 = 1
					limit28 = curdisp.RowCount - 1
					x = 0
					rsState = 97
					Continue
				Case 47
					rsState = 98
					curdisp.Position = x
					mstringa.Append(curdisp.GetString("chiave")).Append(",")
					mstringa.Append(Sub011(curdisp.GetString("descrizione"), 50, False).Replace(",", ".").Replace(" ", "_")).Append(",")
					mstringa.Append(NumberFormat2(curdisp.GetDouble("importo"), 1, 2, 2, False).Replace(",", ".")).Append(",")
					mstringa.Append(NumberFormat2(curdisp.GetDouble("scov"), 1, 2, 2, False).Replace(",", ".")).Append(",")
					mstringa.Append(curdisp.GetString("codice").Replace(" ", "_")).Append(",")
					mstringa.Append(curdisp.GetString("qta").Replace(",", ".")).Append(",")
					mstringa.Append(NumberFormat2(curdisp.GetDouble("prezzov"), 1, 2, 2, False).Replace(",", ".")).Append(",")
					mstringa.Append(curdisp.GetString("totcre").Replace(",", ".")).Append(CRLF)
					Continue
				Case 48
					rsState = 49
					tw.Write(mstringa)
					tw.Close
					'files = List
					files.Initialize
					'fd = multipartfiledata
					fd.Initialize
					Dim multipartfiledataVar As multipartfiledata = fd
					multipartfiledataVar.Dir = File.DirInternal
					fd.FileName = "Refresh.txt"
					fd.KeyName = "upfile"
					fd.ContentType = "text/plain"
					files.Add(fd)
					'nv = Map
					nv.Initialize
					nv.Put("upfile", "Refresh.txt")
					'job2 = httpjob
					job2.Initialize(1, Me)
					Dim httpjobVar3 As httpjob = job2
					httpjobVar3.Sub020("http://" & Main.v_ipvis & ":" & m_port & "/write", nv, files)
					Continue
				Case 49
					rsState = 54
					If Not(Main.v_logvd) Then
						Continue
					Else
						rsState = 51
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 51
				Case 51
					rsState = 54
					mod1.Sub219("http://" & Main.v_ipvis & ":" & m_port & "/write", "MultipartPost")
					Continue
				Case 54
					rsState = 55
					Wait For (job2) Jobdone (wf99_0 As httpjob)
					rsState = 99
					Continue
				Case 55
					rsState = 70
					If job2.vBln1 Then
						rsState = 57
						Continue
					Else
						rsState = 69
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 57
				Case 57
					rsState = 58
					Continue
				Case 58
					rsState = 67
					rsCatchState = 66
					rsState = 60
					Continue
				Case 60
					rsState = 61
					rsCatchState = 66
					mresult = job2.Sub012
					Continue
				Case 61
					rsState = 64
					If mresult <> "OK" Then
						rsState = 63
						Continue
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 63
				Case 63
					rsState = 64
					Sub007()
					Continue
				Case 64
					rsState = 67
					Continue
				Case 66
					rsState = 67
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 67
					rsState = 70
					rsCatchState = 0
					Continue
				Case 69
					rsState = 70
					Sub007()
					Continue
				Case 70
					rsState = 95
					job2.Sub024
					Continue
				Case 72
					rsState = 73
					'job2 = httpjob
					job2.Initialize("Vis", Me)
					Continue
				Case 73
					rsState = 94
					If Main.v_glory > 0 Then
						If Main.v_glory <> Main.cm_gloryvd Then
							If Main.v_glory <> Main.cm_cashmatic Then
								rsState = 75
								Continue
							End If
						End If
					End If
					If Main.v_glory <> Main.cm_gloryvd Then
						If Main.v_glory <> Main.cm_nessuno Then
							If Main.v_glory <> Main.cm_cashmatic Then
								Continue
							End If
						End If
					End If
					rsState = 83
					Continue
				Case 75
					rsState = 76
					Dim httpjobVar4 As httpjob = job2
					httpjobVar4.Sub021("http://" & Main.v_ipvis & ":" & m_port & "/upload?type=text", "del")
					Continue
				Case 76
					rsState = 81
					If Not(Main.v_logvd) Then
						Continue
					Else
						rsState = 78
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 78
				Case 78
					rsState = 81
					mod1.Sub219("http://" & Main.v_ipvis & ":" & m_port & "/upload?type=text", "del")
					Continue
				Case 81
					rsState = 94
					Continue
				Case 83
					rsState = 84
					Continue
				Case 84
					rsState = 93
					If stringa.ToUpperCase.Contains("RESTO") Then
						If Main.v_glory <> Main.cm_gloryvd Then
							Dim i11 As Int = Main.v_glory
							Continue
						End If
						z = True
						If z Then
							rsState = 86
							Continue
						Else
							Continue
						End If
					End If
					z = False
					If z Then
					End If
					'(fallthrough java verso il case successivo)
					rsState = 86
				Case 86
					rsState = 87
					Dim httpjobVar5 As httpjob = job2
					httpjobVar5.Sub021("http://" & Main.v_ipvis & ":" & m_port & "/del", "")
					Continue
				Case 87
					rsState = 92
					If Not(Main.v_logvd) Then
						Continue
					Else
						rsState = 89
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 89
				Case 89
					rsState = 92
					mod1.Sub219("http://" & Main.v_ipvis & ":" & m_port & "/del", "")
					Continue
				Case 92
					rsState = 93
					Continue
				Case 93
					rsState = 94
					Continue
				Case 94
					rsState = 95
					Continue
				Case 95
					rsState = 96
					curdisp.Close
					Continue
				Case 96
					rsState = -1
					Continue
				Case 97
					rsState = 48
					If (step28 > 0 And x <= limit28) Or (step28 < 0 And x >= limit28) Then
						rsState = 47
						Continue
					End If
					Continue
				Case 98
					rsState = 97
					x = x + 0 + step28
					Continue
				Case 99
					rsState = 55
					job2 = wf99_0
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub updvis2(stringa As String, taskid As Int)
	Dim limit23 As Int
	Dim limit64 As Int
	Dim step23 As Int
	Dim step64 As Int
	Dim m_port As String
	Dim firsttime As Boolean
	Dim ls As List
	Dim job2 As httpjob
	Dim i As Int
	Dim myzip As ArchiverForB4A
	Dim txt As String
	Dim newprogress As Int
	Dim ls2 As List
	Dim xx As Int
	Dim tmps As String
	Dim mfile() As String
	Dim files As List
	Dim fd As multipartfiledata
	Dim nv As Map
	Dim mcmd As String
	Dim mresult As String
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					Continue
				Case 1
					rsState = 6
					If Main.v_ipvis <> "" Then
						If Not(vv7) Then
							If Main.vBln11 Then
								If mod1.vStr1 = "Main" Then
									Continue
								End If
							End If
						End If
					End If
					rsState = 3
					Continue
				Case 3
					rsState = 6
					Return
				Case 6
					rsState = 7
					m_port = "12398"
					firsttime = (taskid = 21)
					Continue
				Case 7
					rsState = 12
					If taskid <> 21 Then
						Continue
					Else
						rsState = 9
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 9
				Case 9
					rsState = 12
					taskid = 11
					Continue
				Case 12
					rsState = 13
					Continue
				Case 13
					rsState = 99
					If taskid <> 11 Then
						Continue
					Else
						rsState = 15
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 15
				Case 15
					rsState = 16
					Continue
				Case 16
					rsState = 98
					If Not(File.Exists(mod1.vStr4, "sendimg.zip")) Then
						Continue
					Else
						rsState = 18
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 18
				Case 18
					rsState = 19
					'ls = List
					Continue
				Case 19
					rsState = 58
					If Not(firsttime) Then
						Continue
					Else
						rsState = 21
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 21
				Case 21
					rsState = 22
					Continue
				Case 22
					rsState = 41
					If Main.v_glory = 0 Then
						Continue
					Else
						If Main.v_glory = 3 Then
							Continue
						Else
							rsState = 24
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 24
				Case 24
					rsState = 25
					Continue
				Case 25
					rsState = 40
					If stringa.StartsWith("BK") Then
						Continue
					Else
						rsState = 27
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 27
				Case 27
					rsState = 28
					'job2 = httpjob
					job2.Initialize("Vis", Me)
					Continue
				Case 28
					rsState = 33
					If Main.v_glory <> Main.cm_gloryvd Then
						If Main.v_glory <> Main.cm_cashmatic Then
							Continue
						End If
					End If
					rsState = 30
					Continue
				Case 30
					rsState = 33
					stringa = "@Valore@=" & stringa
					Continue
				Case 33
					rsState = 34
					Dim httpjobVar As httpjob = job2
					httpjobVar.Sub021("http://" & Main.v_ipvis & ":" & m_port & "/upload?type=img", "get")
					Continue
				Case 34
					rsState = 39
					If Not(Main.v_logvd) Then
						Continue
					Else
						rsState = 36
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 36
				Case 36
					rsState = 39
					mod1.Sub219("http://" & Main.v_ipvis & ":" & m_port & "/upload?type=img", "get")
					Continue
				Case 39
					rsState = 40
					Continue
				Case 40
					rsState = 41
					Return
				Case 41
					rsState = 42
					CallSub(Main, "myProgressInit")
					File.MakeDir(mod1.vStr4, "sendimg")
					ls.Initialize
					Dim list As List = ls
					list.AddAll(File.ListFiles(mod1.vStr4 & "/sendimg"))
					Continue
				Case 42
					rsState = 45
					step23 = 1
					limit23 = ls.Size - 1
					i = 0
					rsState = 143
					Continue
				Case 44
					rsState = 144
					File.Delete(mod1.vStr4 & "/sendimg", ls.Get(i))
					Continue
				Case 45
					rsState = 46
					'myzip = ArchiverForB4A
					Continue
				Case 46
					rsState = 57
					rsCatchState = 50
					rsState = 48
					Continue
				Case 48
					rsState = 57
					rsCatchState = 50
					Dim archiverForB4A As ArchiverForB4A = myzip
					archiverForB4A.UnZip(mod1.vStr4, "sendimg.zip", mod1.vStr4 & "/sendimg", "")
					Continue
				Case 50
					rsState = 51
					rsCatchState = 0
					txt = "Errore nel formato del file img.zip"
					Continue
				Case 51
					rsState = 56
					If mod1.vStr1 = "Main" Then
						rsState = 53
						Continue
					Else
						rsState = 55
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 53
				Case 53
					rsState = 56
					CallSub2(mod1.vStr1, "MsgboxOnly", txt)
					Continue
				Case 55
					rsState = 56
					ToastMessageShow(txt, True)
					Continue
				Case 56
					rsState = 57
					Return
				Case 57
					rsState = 58
					rsCatchState = 0
					vInt1 = 0
					File.Delete(mod1.vStr4, "sendimg.zip")
					Continue
				Case 58
					rsState = 59
					ls.Initialize
					Dim list2 As List = ls
					list2.AddAll(File.ListFiles(mod1.vStr4 & "/sendimg"))
					Continue
				Case 59
					rsState = 97
					rsState = 61
					Continue
				Case 61
					rsState = 62
					Continue
				Case 62
					rsState = 96
					If ls.Size > 0 Then
						rsState = 64
						Continue
					Else If firsttime Then
						Continue
					Else
						rsState = 95
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 64
				Case 64
					rsState = 65
					Continue
				Case 65
					rsState = 70
					If Not(firsttime) Then
						Continue
					Else
						rsState = 67
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 67
				Case 67
					rsState = 70
					vv0 = ls.Size
					Continue
				Case 70
					rsState = 71
					Dim d As Double = vInt1 * 100
					newprogress = d / vv0
					CallSub3(Main, "myProgressShow", "Invio di " & ls.Get(0) & " a VisionDroid", newprogress)
					vInt1 = vInt1 + 1
					Continue
				Case 71
					rsState = 80
					If File.Size(mod1.vStr4 & "/sendimg", ls.Get(0)) <= 2500000 Then
						Continue
					Else
						rsState = 73
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 73
				Case 73
					rsState = 74
					CallSub(Main, "myProgressHide")
					File.Delete(mod1.vStr4 & "/sendimg", ls.Get(0))
					txt = "Il file " & ls.Get(0) & " risulta essere più grande di 2,5Mb(non verrà inviato a VisionDroid)."
					Continue
				Case 74
					rsState = 79
					If mod1.vStr1 = "Main" Then
						rsState = 76
						Continue
					Else
						rsState = 78
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 76
				Case 76
					rsState = 79
					CallSub2(mod1.vStr1, "MsgboxOnly", txt)
					Continue
				Case 78
					rsState = 79
					ToastMessageShow(txt, True)
					Continue
				Case 79
					rsState = 80
					ls.Initialize
					Dim list3 As List = ls
					list3.AddAll(File.ListFiles(mod1.vStr4 & "/sendimg"))
					rsState = 59
					Continue
				Case 80
					rsState = 81
					'ls2 = List
					ls2.Initialize
					Continue
				Case 81
					rsState = 88
					step64 = 1
					limit64 = ls.Size - 1
					xx = 0
					rsState = 145
					Continue
				Case 83
					rsState = 84
					tmps = ls.Get(xx)
					Continue
				Case 84
					rsState = 87
					If Not(tmps.ToLowerCase.EndsWith(".jpg")) And Not(tmps.ToLowerCase.EndsWith(".wmv")) And Not(tmps.ToLowerCase.EndsWith(".avi")) And Not(tmps.ToLowerCase.EndsWith(".mp4")) Then
						Continue
					Else
						rsState = 86
						Continue
					End If
					Continue
				Case 86
					rsState = 87
					ls2.Add(ls.Get(xx))
					rsState = 88
					Continue
				Case 87
					rsState = 146
					Continue
				Case 88
					rsState = 93
					If ls2.Size > 0 Then
						rsState = 90
						Continue
					Else
						rsState = 92
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 90
				Case 90
					rsState = 93
					Dim mfile(0) As String
					mfile = Array As String(ls2.Get(0))
					'myzip = ArchiverForB4A
					Dim archiverForB4A2 As ArchiverForB4A = myzip
					Dim sb9 As String = mod1.vStr4 & "/sendimg"
					Dim strArr() As String = mfile
					archiverForB4A2.ZipFiles(sb9, strArr, mod1.vStr4, "sendimg.zip", "")
					File.Delete(mod1.vStr4 & "/sendimg", ls2.Get(0))
					Continue
				Case 92
					rsState = 93
					updvis("ElaboraImg")
					CallSub(Main, "myProgressHide")
					ToastMessageShow("Procedura ultimata correttamente", True)
					Return
				Case 93
					rsState = 96
					rsState = 97
					Continue
				Case 95
					rsState = 96
					updvis("ElaboraImg")
					CallSub(Main, "myProgressHide")
					ToastMessageShow("Procedura ultimata correttamente", True)
					Return
				Case 96
					rsState = 59
					Continue
				Case 97
					rsState = 98
					Continue
				Case 98
					rsState = 99
					Continue
				Case 99
					rsState = 100
					'files = List
					files.Initialize
					'fd = multipartfiledata
					fd.Initialize
					Dim multipartfiledataVar As multipartfiledata = fd
					multipartfiledataVar.Dir = mod1.vStr4
					fd.FileName = stringa
					fd.KeyName = "upfile"
					fd.ContentType = "application/octet-stream"
					files.Add(fd)
					'nv = Map
					nv.Initialize
					nv.Put("upfile", stringa)
					mcmd = "write2"
					Continue
				Case 100
					rsState = 105
					If Not(stringa.StartsWith("BK")) Then
						Continue
					Else
						rsState = 102
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 102
				Case 102
					rsState = 105
					mcmd = "write3"
					Continue
				Case 105
					rsState = 106
					'job2 = httpjob
					job2.Initialize(taskid, Me)
					Dim httpjobVar2 As httpjob = job2
					httpjobVar2.Sub020("http://" & Main.v_ipvis & ":" & m_port & "/" & mcmd, nv, files)
					Continue
				Case 106
					rsState = 111
					If Not(Main.v_logvd) Then
						Continue
					Else
						rsState = 108
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 108
				Case 108
					rsState = 111
					mod1.Sub219("http://" & Main.v_ipvis & ":" & m_port & "/" & mcmd, "MultipartPost")
					Continue
				Case 111
					rsState = 112
					job2.Sub011.Timeout = 150000
					Wait For (job2) Jobdone (wf147_0 As httpjob)
					rsState = 147
					Continue
				Case 112
					rsState = 142
					If job2.vBln1 Then
						rsState = 114
						Continue
					Else
						rsState = 132
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 114
				Case 114
					rsState = 115
					Continue
				Case 115
					rsState = 130
					rsCatchState = 129
					rsState = 117
					Continue
				Case 117
					rsState = 118
					rsCatchState = 129
					mresult = job2.Sub012
					Continue
				Case 118
					rsState = 127
					If mresult <> "OK" Then
						rsState = 120
						Continue
					Else If taskid <> 11 Then
						Continue
					Else
						rsState = 126
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 120
				Case 120
					rsState = 121
					Continue
				Case 121
					rsState = 124
					If taskid <> 11 Then
						Continue
					Else
						rsState = 123
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 123
				Case 123
					rsState = 124
					CallSub(Main, "myProgressHide")
					Continue
				Case 124
					rsState = 127
					Sub007()
					Continue
				Case 126
					rsState = 127
					updvis2("sendimg.zip", 11)
					Continue
				Case 127
					rsState = 130
					Continue
				Case 129
					rsState = 130
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 130
					rsState = 142
					rsCatchState = 0
					Continue
				Case 132
					rsState = 133
					Continue
				Case 133
					rsState = 136
					If taskid <> 11 Then
						Continue
					Else
						rsState = 135
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 135
				Case 135
					rsState = 136
					CallSub(Main, "myProgressHide")
					Continue
				Case 136
					rsState = 141
					If taskid >= 10 Then
						Continue
					Else
						rsState = 138
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 138
				Case 138
					rsState = 141
					Sub007()
					Continue
				Case 141
					rsState = 142
					Continue
				Case 142
					rsState = -1
					job2.Sub024
					Continue
				Case 143
					rsState = 45
					If (step23 > 0 And i <= limit23) Or (step23 < 0 And i >= limit23) Then
						rsState = 44
						Continue
					End If
					Continue
				Case 144
					rsState = 143
					i = i + 0 + step23
					Continue
				Case 145
					rsState = 88
					If (step64 > 0 And xx <= limit64) Or (step64 < 0 And xx >= limit64) Then
						rsState = 83
						Continue
					End If
					Continue
				Case 146
					rsState = 145
					xx = xx + 0 + step64
					Continue
				Case 147
					rsState = 112
					job2 = wf147_0
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

Sub Sub015
	If Main.v_ipvis = "" Or vv7 Then
		Return
	End If
	Dim httpjobVar As httpjob
	httpjobVar.Initialize("restore1", Me)
	httpjobVar.Sub021("http://" & Main.v_ipvis & ":" & "12398" & "/lastMod", "")
	If Main.v_logvd Then
		mod1.Sub219("http://" & Main.v_ipvis & ":" & "12398" & "/lastMod", "")
	End If
End Sub

