B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Type multipartfiledata(ContentType As String, Dir As String, FileName As String, KeyName As String)
	Public vStr1 As String
	Public vBln1 As Boolean
	Public vStr2 As String
	Public Password As String
	Public vStr3 As String
	Public vObj1 As Object
	Public vStr4 As String
	Public vOkHttpRequest1 As OkHttpRequest
	Public vOkHttpResponse1 As OkHttpResponse
	Public vObj2 As Object
	Public vStr5 As String
	Public vStr6 As String
End Sub

Sub Sub001(str As String) As String
	Return IIf(vStr6 = "" Or str.Contains(":"), str, vStr6 & "://" & str)
End Sub

Sub complete(i As Int)
	vStr4 = i
	CallSubDelayed2(vObj1, "JobDone", Me)
End Sub

Sub Sub002(str As String)
	Try
		str = Sub001(str)
		vOkHttpRequest1.InitializeDelete(str)
	Catch
		Log("Invalid link: " & SmartStringFormatter("", str) & "")
		vOkHttpRequest1.InitializeDelete(vStr5)
	End Try
	CallSubDelayed2(httputils2service, "SubmitJob", Me)
End Sub

Sub Sub003(str As String, strArr As String())
	Try
		str = Sub001(str)
		vOkHttpRequest1.InitializeDelete(Sub006(str, strArr))
	Catch
		Log("Invalid link: " & SmartStringFormatter("", str) & "")
		vOkHttpRequest1.InitializeDelete(Sub006(vStr5, strArr))
	End Try
	CallSubDelayed2(httputils2service, "SubmitJob", Me)
End Sub

Sub Sub004(str As String)
	Try
		str = Sub001(str)
		vOkHttpRequest1.InitializeGet(str)
	Catch
		Log("Invalid link: " & SmartStringFormatter("", str) & "")
		vOkHttpRequest1.InitializeGet(vStr5)
	End Try
	CallSubDelayed2(httputils2service, "SubmitJob", Me)
End Sub

Sub Sub005(str As String, strArr As String())
	Try
		str = Sub001(str)
		vOkHttpRequest1.InitializeGet(Sub006(str, strArr))
	Catch
		Log("Invalid link: " & SmartStringFormatter("", str) & "")
		vOkHttpRequest1.InitializeGet(Sub006(vStr5, strArr))
	End Try
	CallSubDelayed2(httputils2service, "SubmitJob", Me)
End Sub

Sub Sub006(str As String, strArr As String()) As String
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	stringBuilderWrapper.Append(str)
	If strArr.Length > 0 Then
		stringBuilderWrapper.Append("?")
	End If
	Dim stringUtils As StringUtils
	Dim length As Int = strArr.Length - 1
	Dim i As Int
	For i = 0 To length Step 2
		If i > 0 Then
			stringBuilderWrapper.Append("&")
		End If
		stringBuilderWrapper.Append(stringUtils.EncodeUrl(strArr(i), "UTF8")).Append("=")
		stringBuilderWrapper.Append(stringUtils.EncodeUrl(strArr(i + 1), "UTF8"))
	Next
	Return stringBuilderWrapper.ToString
End Sub

Sub Sub007 As Bitmap
	Return LoadBitmap(httputils2service.vStr1, vStr4)
End Sub

Sub Sub008(i As Int, i2 As Int, z As Boolean) As Bitmap
	Return LoadBitmapResize(httputils2service.vStr1, vStr4, i, i2, z)
End Sub

Sub Sub009(i As Int, i2 As Int) As Bitmap
	Return LoadBitmapSample(httputils2service.vStr1, vStr4, i, i2)
End Sub

Sub Sub010 As InputStream
	Return File.OpenInput(httputils2service.vStr1, vStr4)
End Sub

Sub Sub011 As OkHttpRequest
	Return vOkHttpRequest1
End Sub

Sub Sub012 As String
	Return Sub013("UTF8")
End Sub

Sub Sub013(str As String) As String
	Dim textReaderWrapper As TextReader
	textReaderWrapper.Initialize2(File.OpenInput(httputils2service.vStr1, vStr4), str)
	Dim vReadAll As String = textReaderWrapper.ReadAll
	textReaderWrapper.Close
	Return vReadAll
End Sub

Sub Sub014(str As String)
	Try
		str = Sub001(str)
		vOkHttpRequest1.InitializeHead(str)
	Catch
		Log("Invalid link: " & SmartStringFormatter("", str) & "")
		vOkHttpRequest1.InitializeHead(vStr5)
	End Try
	CallSubDelayed2(httputils2service, "SubmitJob", Me)
End Sub

Sub Initialize(str As String, obj As Object)
	vStr1 = str
	vObj1 = obj
End Sub

Sub Sub015(outputStreamWrapper As OutputStream, z As Boolean) As Boolean
	If Not(z) Then
		outputStreamWrapper.WriteBytes(Array As Byte(13, 10), 0, 2)
		Return z
	End If
	Return False
End Sub

Sub Sub016(str As String, bArr As Byte())
	Dim vTmp As String = Sub001(str)
	Try
		vOkHttpRequest1.InitializePatch2(vTmp, bArr)
	Catch
		Log("Invalid link: " & SmartStringFormatter("", vTmp) & "")
		vOkHttpRequest1.InitializePatch2(vStr5, bArr)
	End Try
	CallSubDelayed2(httputils2service, "SubmitJob", Me)
End Sub

Sub Sub017(str As String, str2 As String)
	Sub016(str, str2.GetBytes("UTF8"))
End Sub

Sub Sub018(str As String, bArr As Byte())
	Try
		str = Sub001(str)
		vOkHttpRequest1.InitializePost2(str, bArr)
	Catch
		Log("Invalid link: " & SmartStringFormatter("", str) & "")
		vOkHttpRequest1.InitializePost2(vStr5, bArr)
	End Try
	CallSubDelayed2(httputils2service, "SubmitJob", Me)
End Sub

Sub Sub019(str As String, str2 As String, str3 As String)
	Dim vTmp As String = Sub001(str)
	If str2 = File.DirAssets Then
		Log("Cannot send files from the assets folder.")
		Return
	End If
	Dim vSize As Int = File.Size(str2, str3)
	Dim vOpenInput As InputStream = File.OpenInput(str2, str3)
	If vSize < 1000000 Then
		Dim outputStreamWrapper As OutputStream
		outputStreamWrapper.InitializeToBytesArray(vSize)
		File.Copy2(vOpenInput, outputStreamWrapper)
		Sub018(vTmp, outputStreamWrapper.ToBytesArray)
	Else
		vOkHttpRequest1.InitializePost(vTmp, vOpenInput, vSize)
		CallSubDelayed2(httputils2service, "SubmitJob", Me)
	End If
End Sub

Sub Sub020(str As String, map As Map, list As List)
	Dim outputStreamWrapper As OutputStream
	outputStreamWrapper.InitializeToBytesArray(0)
	Dim bArr(0) As Byte
	Dim sb2 As String = Chr(13) & Chr(10)
	Dim z As Boolean = True
	If Not(map = Null) And map.IsInitialized Then
		Dim vKeys As IterableList = map.Keys
		Dim size As Int = vKeys.Size
		Dim i As Int = 0
		Do While i < size
			Dim vObjectToString As String = vKeys.Get(i)
			Dim vObjectToString2 As String = map.Get(vObjectToString)
			Dim vTmp As Boolean = Sub015(outputStreamWrapper, z)
			Dim sb3 As String = "--" & SmartStringFormatter("", "---------------------------1461124740692") & CRLF & "Content-Disposition: form-data; name=" & QUOTE & SmartStringFormatter("", vObjectToString) & QUOTE & CRLF & CRLF & SmartStringFormatter("", vObjectToString2) & ""
			Dim bytes() As Byte = sb3.Replace(CRLF, sb2).GetBytes("UTF8")
			outputStreamWrapper.WriteBytes(bytes, 0, bytes.Length)
			i = i + 1
			z = vTmp
		Loop
	End If
	If Not(list = Null) And list.IsInitialized Then
		Dim size2 As Int = list.Size
		Dim i2 As Int = 0
		Dim z2 As Boolean = z
		Do While i2 < size2
			Dim multipartfiledataVar As multipartfiledata = list.Get(i2)
			Dim vTmp_ As Boolean = Sub015(outputStreamWrapper, z2)
			Dim sb4 As String = "--" & SmartStringFormatter("", "---------------------------1461124740692") & CRLF & "Content-Disposition: form-data; name=" & QUOTE & SmartStringFormatter("", multipartfiledataVar.KeyName) & QUOTE & "; filename=" & QUOTE & SmartStringFormatter("", multipartfiledataVar.FileName) & QUOTE & CRLF & "Content-Type: " & SmartStringFormatter("", multipartfiledataVar.ContentType) & CRLF & CRLF
			Dim bytes2() As Byte = sb4.Replace(CRLF, sb2).GetBytes("UTF8")
			outputStreamWrapper.WriteBytes(bytes2, 0, bytes2.Length)
			Dim vOpenInput As InputStream = File.OpenInput(multipartfiledataVar.Dir, multipartfiledataVar.FileName)
			File.Copy2(vOpenInput, outputStreamWrapper)
			i2 = i2 + 1
			z2 = vTmp_
		Loop
		z = z2
	End If
	Sub015(outputStreamWrapper, z)
	Dim sb5 As String = "--" & SmartStringFormatter("", "---------------------------1461124740692") & "--" & CRLF
	Dim bytes3() As Byte = sb5.Replace(CRLF, sb2).GetBytes("UTF8")
	outputStreamWrapper.WriteBytes(bytes3, 0, bytes3.Length)
	Sub018(str, outputStreamWrapper.ToBytesArray)
	vOkHttpRequest1.SetContentType("multipart/form-data; boundary=---------------------------1461124740692")
	vOkHttpRequest1.SetContentEncoding("UTF8")
End Sub

Sub Sub021(str As String, str2 As String)
	Sub018(str, str2.GetBytes("UTF8"))
End Sub

Sub Sub022(str As String, bArr As Byte())
	Try
		str = Sub001(str)
		vOkHttpRequest1.InitializePut2(str, bArr)
	Catch
		Log("Invalid link: " & SmartStringFormatter("", str) & "")
		vOkHttpRequest1.InitializePut2(vStr5, bArr)
	End Try
	CallSubDelayed2(httputils2service, "SubmitJob", Me)
End Sub

Sub Sub023(str As String, str2 As String)
	Sub022(str, str2.GetBytes("UTF8"))
End Sub

Sub Sub024
	File.Delete(httputils2service.vStr1, vStr4)
End Sub

