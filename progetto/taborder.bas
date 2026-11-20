B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vLst1 As List
	Public vLst2 As List
	Public vLst3 As List
	Public vBln1 As Boolean
	Public vBln2 As Boolean
End Sub

Sub Sub001
	Dim list As List = vLst1
	Dim size As Int = list.Size
	Dim i As Int = 0
	Dim i2 As Int
	For i2 = 0 To size - 1
		list.Get(i2).Text = vLst3.Get(i)
		i = i + 1
	Next
	vBln2 = False
End Sub

Sub Initialize(list As List, z As Boolean)
	vLst1.Initialize
	vLst2.Initialize
	vLst3.Initialize
	vBln1 = z
	vLst1.AddAll(list)
	Dim reflection As Reflector
	Dim vNumberToString As String = 5
	Dim size As Int = vLst1.Size - 1
	Dim i As Int
	For i = 0 To size
		reflection.Target = vLst1.Get(i)
		If i = vLst1.Size - 1 Then
			Dim z2 As Boolean = vBln1
			If Not(z2) Then
				vNumberToString = 6
			End If
		End If
		reflection.RunMethod2("setImeOptions", vNumberToString, "java.lang.int")
		vLst2.Add(reflection.RunMethod("getId"))
	Next
	Dim size2 As Int = vLst1.Size - 1
	Dim i2 As Int
	For i2 = 0 To size2
		reflection.Target = vLst1.Get(i2)
		If i2 < vLst1.Size - 1 Then
			Dim vObjectToString As String = vLst2.Get(i2 + 1)
			reflection.RunMethod2("setNextFocusDownId", vObjectToString, "java.lang.int")
			reflection.RunMethod2("setNextFocusRightId", vObjectToString, "java.lang.int")
			Try
				reflection.RunMethod2("setNextFocusForwardId", vObjectToString, "java.lang.int")
			Catch
			End Try
		End If
		If i2 > 0 Then
			Dim vObjectToString2 As String = vLst2.Get(i2 - 1)
			reflection.RunMethod2("setNextFocusUpId", vObjectToString2, "java.lang.int")
			reflection.RunMethod2("setNextFocusLeftId", vObjectToString2, "java.lang.int")
		End If
		If vBln1 Then
			If i2 = 0 Then
				Dim vObjectToString3 As String = vLst2.Get(vLst1.Size - 1)
				reflection.RunMethod2("setNextFocusUpId", vObjectToString3, "java.lang.int")
				reflection.RunMethod2("setNextFocusLeftId", vObjectToString3, "java.lang.int")
			End If
			If i2 = vLst1.Size - 1 Then
				Dim vObjectToString4 As String = vLst2.Get(0)
				reflection.RunMethod2("setNextFocusDownId", vObjectToString4, "java.lang.int")
				reflection.RunMethod2("setNextFocusRightId", vObjectToString4, "java.lang.int")
				Try
					reflection.RunMethod2("setNextFocusForwardId", vObjectToString4, "java.lang.int")
				Catch
				End Try
			End If
		End If
	Next
End Sub

Sub Sub002
	vLst3.Clear
	Dim list As List = vLst1
	Dim size As Int = list.Size
	Dim i As Int = 1
	Dim i2 As Int
	For i2 = 0 To size - 1
		Dim editTextWrapper As EditText = list.Get(i2)
		vLst3.Add(editTextWrapper.Text)
		editTextWrapper.Text = i
		i = i + 1
	Next
	vBln2 = True
End Sub

