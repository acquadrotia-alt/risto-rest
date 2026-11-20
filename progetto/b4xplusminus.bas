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
	Public vObj2 As Object
	Public vXv2 As B4XView
	Public vXv3 As B4XView
	Public vXv4 As B4XView
	Public vXv5 As B4XView
	Public vStr2 As String
	Public vBln1 As Boolean
	Public vBln2 As Boolean
	Public vXv6 As B4XView
	Public vInt1 As Int
	Public vLst1 As List
	Public vDbl1 As Double
	Public vDbl2 As Double
	Public vDbl3 As Double
	Public vInt2 As Int
	Public vInt3 As Int
	Public vInt4 As Int
	Public vInt5 As Int
	Public vb4xformatter1 As b4xformatter
	Public vBln3 As Boolean
	Public vInt6 As Int
	Public vBln4 As Boolean
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	If vStr2 = "Horizontal" Then
		vXv3.SetLayoutAnimated(0, 0, 0, vInt1, d2)
		vXv2.SetLayoutAnimated(0, d - vInt1, 0, vInt1, d2)
		vXv6.SetLayoutAnimated(0, 0, 0, d, d2)
	Else If vStr2 = "Vertical" Then
		vXv2.SetLayoutAnimated(0, 0, 0, d, vInt1)
		vXv3.SetLayoutAnimated(0, 0, d2 - vInt1, d, vInt1)
		vXv6.SetLayoutAnimated(0, 0, 0, d, d2)
	Else
		vXv3.SetLayoutAnimated(0, 0, d2 - vInt1, d / 2, vInt1)
		vXv2.SetLayoutAnimated(0, d / 2, vXv3.Top, vXv3.Width, vXv3.Height)
		vXv6.SetLayoutAnimated(0, 0, 0, d, d2 - vInt1 + DipToCurrent(5))
	End If
	vXv5.SetLayoutAnimated(0, 0, 0, vXv3.Width, vXv3.Height)
	vXv4.SetLayoutAnimated(0, 0, 0, vXv2.Width, vXv2.Height)
End Sub

Sub Sub001(str As String) As B4XView
	Dim labelWrapper As Label
	labelWrapper.Initialize("")
	Dim b4XViewWrapper As B4XView = labelWrapper
	Dim xui As XUI = vXUI1
	b4XViewWrapper.Font = XUI.CreateMaterialIcons(30)
	b4XViewWrapper.Text = str
	b4XViewWrapper.TextColor = vXv6.TextColor
	Return b4XViewWrapper
End Sub

Sub Sub002
	If vInt2 <= 0 Then
		If vBln1 Then
			vInt2 = vInt6
		Else
			vInt2 = 0
			vInt3 = vInt3 + 1
			Return
		End If
	End If
	Dim i As Int = vInt2 - 1
	Sub006(i, True)
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	vXv6 = labelWrapper
	vXv6.SetTextAlignment("CENTER", "CENTER")
	Dim xui As XUI = vXUI1
	vXv2 = XUI.CreatePanel("pnlArrow")
	Dim xui2 As XUI = vXUI1
	vXv3 = XUI.CreatePanel("pnlArrow")
	Dim b4XViewWrapper As B4XView = vXv2
	b4XViewWrapper.Tag = True
	Dim b4XViewWrapper2 As B4XView = vXv3
	b4XViewWrapper2.Tag = False
	vStr2 = map.Get("Orientation")
	vBln1 = map.Get("Cyclic")
	vBln2 = map.Get("Rapid")
	vBln4 = map.GetDefault("HapticFeedback", False)
	vb4xformatter1.Sub006.FormatFont = vXv6.Font
	vb4xformatter1.Sub006.TextColor = vXv6.TextColor
	If vStr2 = "Horizontal" Then
		vXv4 = Sub001(Chr(58133))
		vXv5 = Sub001(Chr(58132))
	Else
		vXv4 = Sub001(Chr(58134))
		vXv5 = Sub001(Chr(58131))
	End If
	vXv5.SetTextAlignment("CENTER", "CENTER")
	vXv4.SetTextAlignment("CENTER", "CENTER")
	vXv6.SetTextAlignment("CENTER", "CENTER")
	vXv1.AddView(vXv6, 0, 0, 0, 0)
	vXv1.AddView(vXv2, 0, 0, 0, 0)
	vXv1.AddView(vXv3, 0, 0, 0, 0)
	vXv2.AddView(vXv4, 0, 0, 0, 0)
	vXv3.AddView(vXv5, 0, 0, 0, 0)
	Sub006(-1, False)
	base_resize(vXv1.Width, vXv1.Height)
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 As Object
	Return Sub003(vInt2)
End Sub

Sub Sub003(i As Int) As Object
	If vBln3 Then
		Return vLst1.Get(i)
	End If
	If i = vInt6 - 1 Then
		Return vDbl3
	End If
	Return vDbl1 + i * vDbl2
End Sub

Sub Sub004
	If vInt2 = vInt6 - 3 Then
		Dim z As Boolean = vBln3
		If Not(z) Then
			If vb4xformatter1.Sub004(Sub003(vInt2 + 1)) = vb4xformatter1.Sub004(Sub003(vInt2 + 2)) Then
				vInt2 = vInt2 + 1
			End If
		End If
	End If
	If vInt2 >= vInt6 - 1 Then
		If vBln1 Then
			vInt2 = -1
		Else
			vInt2 = vInt6 - 1
			vInt3 = vInt3 + 1
			Return
		End If
	End If
	Dim i As Int = vInt2 + 1
	Sub006(i, True)
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
	vb4xformatter1.Initialize
End Sub

Sub Sub005(b4XViewWrapper As B4XView, obj As Object)
	b4XViewWrapper.Text = obj
End Sub

Sub Pnlarrow_Touch(i As Int, f As Float, f2 As Float)
	Dim b4XViewWrapper As B4XView = vXv4
	Dim z As Boolean = i = 0
	Dim b4XViewWrapper2 As B4XView = vXv4
	Dim z2 As Boolean = i <> 2
	Dim b4XViewWrapper3 As B4XView
	Sub009(z, z2, Sender)
End Sub

Sub Sub006(i As Int, z As Boolean)
	Dim z2 As Boolean = True
	If i >= vInt6 Then
		i = -1
	End If
	vInt2 = i
	If vInt2 = -1 Then
		vXv6.Text = ""
	Else
		Dim vTmp As Object = Sub003(vInt2)
		If vBln3 Then
			Sub005(vXv6, vTmp)
		Else
			vXv6.Text = vb4xformatter1.Sub004(vTmp)
		End If
		If z Then
			Dim xui As XUI = vXUI1
			If XUI.SubExists(vObj1, vStr1 & "_valuechanged", 1) Then
				CallSub2(vObj1, vStr1 & "_valuechanged", vTmp)
			End If
		End If
	End If
	vXv4.Enabled = vInt6 > 0 And (vBln1 Or vInt2 < vInt6 + 1)
	Dim b4XViewWrapper As B4XView = vXv5
	If vInt6 <= 0 Or (Not(vBln1) And vInt2 <= 0) Then
		z2 = False
	End If
	b4XViewWrapper.Enabled = z2
End Sub

Sub Sub007(d As Double, d2 As Double, d3 As Double)
	vInt6 = Ceil((d2 - d) / d3) + 1
	vDbl1 = d
	vDbl3 = d2
	vDbl2 = d3
	vBln3 = False
	Sub006(0, False)
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(obj As Object)
	If vBln3 Then
		Dim vIndexOf As Int = vLst1.IndexOf(obj)
		Sub006(vIndexOf, False)
		Return
	End If
	Dim vObjectToNumber As Double = obj
	Dim vMin As Int = Min(vInt6 - 1, Max(0, Round((vObjectToNumber - vDbl1) / vDbl2)))
	Sub006(vMin, False)
End Sub

Sub Sub008(list As List)
	vLst1 = list
	vBln3 = True
	vInt6 = vLst1.Size
	Sub006(-1, False)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub StartDownLoop(up As Boolean)
	Dim myindex As Int
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				vInt3 = vInt3 + 1
				Continue
			Case 1
				rsState = 6
				Dim z As Boolean = vBln2
				If Not(z) Then
					rsState = 3
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 6
				Return
			Case 6
				rsState = 7
				myindex = vInt3
				Sleep(vInt4)
				rsState = 19
				Continue
			Case 7
				rsState = 18
				If myindex <> vInt3 Then
					Continue
				Else
					rsState = 9
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 9
			Case 9
				rsState = 10
				Continue
			Case 10
				rsState = 17
				If up Then
					rsState = 12
					Continue
				Else
					rsState = 14
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 12
			Case 12
				rsState = 17
				Sub004()
				Continue
			Case 14
				rsState = 17
				Sub002()
				Continue
			Case 17
				rsState = 7
				Sleep(vInt5)
				rsState = 20
				Continue
			Case 18
				rsState = -1
				Continue
			Case 19
				rsState = 7
				Continue
			Case 20
				rsState = 7
				Continue
		End Select
	Loop
End Sub

Sub Sub009(z As Boolean, z2 As Boolean, b4XViewWrapper As B4XView)
	Dim enabled As Boolean = b4XViewWrapper.GetView(0).Enabled
	If Not(enabled) Then
		Return
	End If
	If z Then
		If vBln4 Then
			xuiviewsutils.Sub004(b4XViewWrapper)
		End If
		Dim tag As Object = b4XViewWrapper.Tag
		If tag = True Then
			Sub004()
			StartDownLoop(True)
		Else
			Sub002()
			StartDownLoop(False)
		End If
	Else If z2 Then
		vInt3 = vInt3 + 1
	End If
End Sub

