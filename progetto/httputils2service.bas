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
	Public vOkHttpClient1 As OkHttpClient
	Public vMap1 As Map
	Public vStr1 As String
	Public vInt1 As Int
End Sub

Sub Sub001(i As Int, z As Boolean, str As String)
	Dim httpjobVar As httpjob = vMap1.Get(i)
	If httpjobVar = Null Then
		Log("HttpUtils2Service: job completed multiple times - " & i)
		Return
	End If
	vMap1.Remove(i)
	httpjobVar.vBln1 = z
	httpjobVar.vStr3 = str
	httpjobVar.complete(i)
End Sub

Sub hc_responseerror(okHttpResponse As OkHttpResponse, str As String, i As Int, i2 As Int)
	Log("ResponseError. Reason: " & SmartStringFormatter("", str) & ", Response: " & SmartStringFormatter("", okHttpResponse.ErrorResponse) & "")
	okHttpResponse.Release
	Dim httpjobVar As httpjob = vMap1.Get(i2)
	If httpjobVar = Null Then
		Log("HttpUtils2Service (hc_ResponseError): job completed multiple times - " & i2)
		Return
	End If
	httpjobVar.vOkHttpResponse1 = okHttpResponse
	If okHttpResponse.ErrorResponse <> "" Then
		Sub001(i2, False, okHttpResponse.ErrorResponse)
	Else
		Sub001(i2, False, str)
	End If
End Sub

Sub hc_responsesuccess(okHttpResponse As OkHttpResponse, i As Int)
	Dim httpjobVar As httpjob = vMap1.Get(i)
	If httpjobVar = Null Then
		Log("HttpUtils2Service (hc_ResponseSuccess): job completed multiple times - " & i)
		Return
	End If
	httpjobVar.vOkHttpResponse1 = okHttpResponse
	okHttpResponse.GetAsynchronously("response", File.OpenOutput(vStr1, i, False), True, i)
End Sub

Sub response_streamfinish(z As Boolean, i As Int)
	If z Then
		Sub001(i, z, "")
		Return
	End If
	Sub001(i, z, LastException.Message)
End Sub

Sub Service_Create
	vStr1 = File.DirInternalCache
	Try
		File.WriteString(vStr1, "~test.test", "test")
		File.Delete(vStr1, "~test.test")
	Catch
		Log(LastException)
		Log("Switching to File.DirInternal")
		vStr1 = File.DirInternal
	End Try
	If Not(vOkHttpClient1.IsInitialized) Then
		Log("(Http client initialized with accept all option.)")
		vOkHttpClient1.InitializeAcceptAll("hc")
	End If
	vMap1.Initialize
End Sub

Sub Service_Destroy
End Sub

Sub Service_Start(intentWrapper As Intent)
	Service.StopAutomaticForeground
End Sub

Sub submitjob(httpjobVar As httpjob)
	If Not(vMap1.IsInitialized) Then
		service_create()
	End If
	vInt1 = vInt1 + 1
	Dim i As Int = vInt1
	vMap1.Put(i, httpjobVar)
	If httpjobVar.vStr2 <> "" And httpjobVar.Password <> "" Then
		vOkHttpClient1.ExecuteCredentials(httpjobVar.Sub011, i, httpjobVar.vStr2, httpjobVar.Password)
		Return
	End If
	vOkHttpClient1.Execute(httpjobVar.Sub011, i)
End Sub

