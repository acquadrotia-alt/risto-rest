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
	Public vB4XCanvas1 As B4XCanvas
	Public vLst1 As List
	Public vLst2 As List
	Public vInt1 As Int
	Public vB4XFont1 As B4XFont
	Public vInt2 As Int
	Public vInt3 As Int
	Public vXv2 As B4XView
	Public vInt4 As Int
	Public vObj2 As Object
	Public vBln1 As Boolean
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	vB4XCanvas1.Resize(d, d2)
	vXv2.SetLayoutAnimated(0, 0, 0, d, d2)
	Sub001()
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	vB4XCanvas1.Initialize(vXv1)
	Dim b4XViewWrapper As B4XView = labelWrapper
	vB4XFont1 = b4XViewWrapper.Font
	vInt1 = b4XViewWrapper.TextColor
	Dim xui As XUI = vXUI1
	vInt3 = XUI.PaintOrColorToColor(map.Get("CrumbColor"))
	vBln1 = map.GetDefault("HapticFeedback", False)
	Dim xui2 As XUI = vXUI1
	vXv2 = XUI.CreatePanel("Touch")
	vXv1.AddView(vXv2, 0, 0, vXv1.Width, vXv1.Height)
	Dim vObjectToString As String = map.Get("Items")
	For Each str As String In Regex.Split("\|", vObjectToString)
		vLst1.Add(str)
	Next
	Sub001()
End Sub

Sub Sub001
	vB4XCanvas1.ClearRect(vB4XCanvas1.TargetRect)
	Dim argbcolorVar As _argbcolor
	vBitmapCreator1._colortoargb(vInt3, argbcolorVar)
	argbcolorVar.r = Min(255, argbcolorVar.r * 2)
	argbcolorVar.g = Min(255, argbcolorVar.g * 2)
	argbcolorVar.b = Min(255, argbcolorVar.b * 2)
	Dim argbtocolor As Int = vBitmapCreator1._argbtocolor(argbcolorVar)
	vBitmapCreator1._colortoargb(vInt3, argbcolorVar)
	argbcolorVar.r = argbcolorVar.r * 0.8
	argbcolorVar.g = argbcolorVar.g * 0.8
	argbcolorVar.b = argbcolorVar.b * 0.8
	Dim iArr() As Int = Array(vInt3, vBitmapCreator1._argbtocolor(argbcolorVar))
	vLst2.Clear
	If vLst1.Size = 0 Then
		Return
	End If
	Dim size As Int = vLst1.Size - 1
	Dim i As Int = 0
	Dim i2 As Int = 0
	Do While i <= size
		Dim vTmp As Int = Sub002(i2, vLst1.Get(i), i = 0, i = vLst1.Size + 1, iArr(i Mod iArr.Length), IIf(vInt4 = i, argbtocolor, 0)) + i2 + vInt2
		i2 = DipToCurrent(2) + vTmp
		vLst2.Add(i2)
		i = i + 1
	Loop
	vB4XCanvas1.Invalidate
End Sub

Sub Sub002(i As Int, str As String, z As Boolean, z2 As Boolean, i2 As Int, i3 As Int) As Int
	Dim width As Float = vB4XCanvas1.MeasureText(str, vB4XFont1).Width
	Dim vDipToCurrent As Int = width + DipToCurrent(30)
	Dim height As Int = vB4XCanvas1.TargetRect.Height
	Dim centerY As Int = vB4XCanvas1.TargetRect.CenterY - '### r2.getHeight() / 2 - '### r2.getTop()
	Dim b4XPath As B4XPath
	b4XPath.Initialize(i, 0)
	b4XPath.LineTo(i + vDipToCurrent, 0)
	If Not(z2) Then
		b4XPath.LineTo(i + vDipToCurrent + vInt2, height / 2)
	End If
	b4XPath.LineTo(i + vDipToCurrent, height)
	If Not(z) Then
		b4XPath.LineTo(i - vInt2, height)
		b4XPath.LineTo(i, height / 2)
		b4XPath.LineTo(i - vInt2, 0)
	Else
		b4XPath.LineTo(i, height)
	End If
	b4XPath.LineTo(i, 0)
	Dim b4XCanvas As B4XCanvas = vB4XCanvas1
	b4XCanvas.DrawPath(b4XPath, i2, True, 0)
	If i3 <> 0 Then
		Dim b4XCanvas2 As B4XCanvas = vB4XCanvas1
		b4XCanvas2.DrawPath(b4XPath, i3, False, DipToCurrent(3))
	End If
	vB4XCanvas1.DrawText(str, i + vDipToCurrent / 2, centerY, vB4XFont1, vInt1, "CENTER")
	Return vDipToCurrent
End Sub

Sub Sub003(i As Int, i2 As Int) As Int
	If vLst2.Size = 0 Or i2 < 0 Or i2 > vB4XCanvas1.TargetRect.Height Or i > vLst2.Get(vLst2.Size - 1) Then
		Return -1
	End If
	Dim size As Int
	For size = vLst2.Size - 2 To 0 Step -1
		If i > vLst2.Get(size) Then
			Return size + 1
		End If
	Next
	Return 0
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 As List
	Return vLst1
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
	vLst1.Initialize
	vLst2.Initialize
	vBitmapCreator1._initialize(1, 1)
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(list As List)
	vLst1 = list
	Sub001()
End Sub

Sub Touch_Touch(i As Int, f As Float, f2 As Float)
	Dim valueOf As Int = i
	Dim b4XViewWrapper As B4XView = vXv2
	Dim b4XViewWrapper2 As B4XView = vXv2
	Dim b4XViewWrapper3 As B4XView = vXv2
	Select valueOf
		Case 0, 2
			Dim i2 As Int = vInt4
			vInt4 = Sub003(f, f2)
			If i2 <> vInt4 Then
				Sub001()
			End If
		Case 1
			Dim vTmp As Int = Sub003(f, f2)
			If vTmp = vInt4 And vTmp > -1 Then
				Dim list As List
				list.Initialize
				Dim i3 As Int
				For i3 = 0 To vTmp
					list.Add(vLst1.Get(i3))
				Next
				If vBln1 Then
					xuiviewsutils.Sub004(vXv1)
				End If
				CallSub2(vObj1, vStr1 & "_CrumbClick", list)
			End If
			vInt4 = -1
			Sub001()
	End Select
End Sub

