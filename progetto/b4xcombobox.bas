B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vStr1 As String
	Public vObj1 As Object
	Public vXv1 As B4XView
	Public vXUI1 As XUI
	Public vInt1 As Int
	Public vSpn1 As Spinner
	Public vInt2 As Int
	Public vInt3 As Int
	Public vObj2 As Object
	Public vStr2 As String
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	vXv1.GetView(0).SetLayoutAnimated(0, 0, 0, d, d2)
End Sub

Sub Cmbbox_ItemClick(i As Int, obj As Object)
	RaiseEvent()
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	Dim b4XViewWrapper As B4XView = labelWrapper
	vSpn1.Initialize("cmbBox")
	vSpn1.TextSize = b4XViewWrapper.TextSize
	vXv1.AddView(vSpn1, 0, 0, vXv1.Width, vXv1.Height)
End Sub

Sub Sub001(i As Int) As String
	Return vSpn1.GetItem(i)
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 As Int
	Return vSpn1.SelectedIndex
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 As String
	Dim getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3_ As Int = getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3()
	Return IIf(getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3_ = -1, "", Sub001(getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3_))
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 As Int
	Return vSpn1.Size
End Sub

Sub Sub002(str As String) As Int
	Return vSpn1.IndexOf(str)
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
	vInt1 = -1
	Dim xui As XUI = vXUI1
	If XUI.IsB4J Then
		vInt2 = 500
		Return
	End If
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub RaiseEvent
	Dim index As Int
	Dim myindex As Int
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				index = getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3()
				Continue
			Case 1
				rsState = 6
				If vInt1 <> index Then
					Continue
				Else
					rsState = 3
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 6
				Return
			Case 6
				rsState = 7
				Continue
			Case 7
				rsState = 16
				If vInt2 <= 0 Then
					Continue
				Else
					rsState = 9
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 9
			Case 9
				rsState = 10
				vInt3 = vInt3 + 1
				myindex = vInt3
				Sleep(vInt2)
				rsState = 21
				Continue
			Case 10
				rsState = 15
				If myindex = vInt3 Then
					Continue
				Else
					rsState = 12
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 12
			Case 12
				rsState = 15
				Return
			Case 15
				rsState = 16
				Continue
			Case 16
				rsState = 17
				vInt1 = index
				Continue
			Case 17
				rsState = 20
				Dim xui As XUI = vXUI1
				If Not(XUI.SubExists(vObj1, vStr1 & "_SelectedIndexChanged", 1)) Then
					Continue
				Else
					rsState = 19
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 19
			Case 19
				rsState = 20
				CallSub2(vObj1, vStr1 & "_SelectedIndexChanged", index)
				Continue
			Case 20
				rsState = -1
				Continue
			Case 21
				rsState = 10
				Continue
		End Select
	Loop
End Sub

Sub Sub003(list As List)
	vSpn1.Clear
	vSpn1.AddAll(list)
	If list.Size > 0 Then
		setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(0)
		Return
	End If
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(i As Int)
	vInt1 = i
	vSpn1.SelectedIndex = i
End Sub

