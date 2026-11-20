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
	Public vInt1 As Int
	Public vInt2 As Int
	Public vInt3 As Int
	Public vB4XBitmap1 As B4XBitmap
	Public vXv2 As B4XView
	Public vXv3 As B4XView
	Public vB4XRect1 As B4XRect
	Public vInt4 As Int
	Public vInt5 As Int
	Public vInt6 As Int
	Public vObj2 As Object
	Public vInt7 As Int
	Public vInt8 As Int
	Public vInt9 As Int
	Public vInt10 As Int
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	vB4XCanvas1.Resize(d, d2)
	vXv2.SetLayoutAnimated(0, 0, 0, d, d2)
	Dim vIsInitialized As Boolean = vB4XBitmap1.IsInitialized
	If Not(vIsInitialized) Then
		Sub001()
	End If
	vB4XRect1.Initialize(vInt6 + vInt5, vInt6 + vInt5, d - vInt6 - vInt5, d2 - vInt6 - vInt5)
	vXv3.SetLayoutAnimated(0, vB4XRect1.Left, vB4XRect1.Top, vB4XRect1.Width, vB4XRect1.Height)
	Sub002()
End Sub

Sub Sub001
	Dim vDipToCurrent As Int = DipToCurrent(80)
	Dim vDipToCurrent2 As Int = DipToCurrent(8)
	Dim vDipToCurrent3 As Int = DipToCurrent(28)
	BitmapCreator.initialize(vDipToCurrent * 2 + vDipToCurrent2 + DipToCurrent(3), vDipToCurrent * 2 + vDipToCurrent3 + vDipToCurrent2)
	BCPath.initialize(vDipToCurrent - vDipToCurrent3 + vDipToCurrent2, vDipToCurrent * 2 - DipToCurrent(2) + vDipToCurrent2)
	BCPath.lineto(vDipToCurrent + vDipToCurrent3 + vDipToCurrent2, vDipToCurrent * 2 - DipToCurrent(2) + vDipToCurrent2)
	BCPath.lineto(vDipToCurrent + vDipToCurrent2, vDipToCurrent * 2 + vDipToCurrent3 + vDipToCurrent2)
	BCPath.lineto(vDipToCurrent - vDipToCurrent3 + vDipToCurrent2, vDipToCurrent * 2 - DipToCurrent(2) + vDipToCurrent2)
	Dim i As Int = vInt7
	BitmapCreator.drawpath(BCPath, i, True, 0)
	Dim i2 As Int = vInt8
	BitmapCreator.drawcircle(vDipToCurrent + vDipToCurrent2, vDipToCurrent + vDipToCurrent2, vDipToCurrent, i2, True, 0)
	Dim i3 As Int = vInt7
	BitmapCreator.drawcircle(vDipToCurrent + vDipToCurrent2, vDipToCurrent + vDipToCurrent2, vDipToCurrent, i3, False, DipToCurrent(10))
	vB4XBitmap1 = BitmapCreator.getbitmap()
	vInt6 = vB4XBitmap1.Height / 4
	vXv3.SetTextAlignment("CENTER", "CENTER")
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	vB4XCanvas1.Initialize(vXv1)
	vInt2 = map.Get("Min")
	vInt3 = map.Get("Max")
	Dim xui As XUI = vXUI1
	vXv2 = XUI.CreatePanel("pnl")
	vXv3 = labelWrapper
	vXv1.AddView(vXv3, 0, 0, 0, 0)
	vXv1.AddView(vXv2, 0, 0, 0, 0)
	Dim xui2 As XUI = vXUI1
	vInt4 = XUI.PaintOrColorToColor(map.Get("ValueColor"))
	Dim xui3 As XUI = vXUI1
	If Not(XUI.IsB4A) Then
		Dim xui4 As XUI = vXUI1
		If Not(XUI.IsB4i) Then
			Dim xui5 As XUI = vXUI1
			If XUI.IsB4J Then
				vInt5 = DipToCurrent(6)
			End If
			base_resize(vXv1.Width, vXv1.Height)
			Return
		End If
	End If
	vInt5 = DipToCurrent(8)
	base_resize(vXv1.Width, vXv1.Height)
End Sub

Sub Sub002
	Dim i As Int
	vB4XCanvas1.ClearRect(vB4XCanvas1.TargetRect)
	Dim width As Int = vB4XRect1.Width / 2
	Dim i2 As Int = vInt10
	vB4XCanvas1.DrawCircle(vB4XRect1.CenterX, vB4XRect1.CenterY, width, i2, False, vInt5)
	Dim b4XPath As B4XPath
	Dim i3 As Int = (vInt1 - vInt2) / (vInt3 - vInt2) * 360
	Dim xui As XUI = vXUI1
	If Not(XUI.IsB4J) Then
		i = 0
	Else
		i = vInt5 / 2
	End If
	b4XPath.InitializeArc(vB4XRect1.CenterX, vB4XRect1.CenterY, width + i, -90, i3)
	Dim b4XCanvas As B4XCanvas = vB4XCanvas1
	Dim i4 As Int = vInt4
	b4XCanvas.DrawPath(b4XPath, i4, False, vInt5)
	Dim i5 As Int = vInt9
	vB4XCanvas1.DrawCircle(vB4XRect1.CenterX, vB4XRect1.CenterY, width - i, i5, True, 0)
	Dim b4XRect As B4XRect
	Dim i6 As Int = width + vInt6 / 2 + vInt5 / 2
	Dim centerX As Double = vB4XRect1.CenterX
	Dim vCosD As Int = centerX + i6 * CosD(i3 - 90)
	Dim centerY As Double = vB4XRect1.CenterY
	Dim vSinD As Int = centerY + i6 * SinD(i3 - 90)
	b4XRect.Initialize(vCosD - vB4XBitmap1.Width / 8, vSinD - vInt6 / 2, vCosD + vB4XBitmap1.Width / 8, vSinD + vInt6 / 2)
	vB4XCanvas1.DrawBitmapRotated(vB4XBitmap1, b4XRect, i3)
	vB4XCanvas1.Invalidate
	vXv3.Text = vInt1
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 As Int
	Return vInt1
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
End Sub

Sub Pnl_Touch(i As Int, f As Float, f2 As Float)
	Dim b4XViewWrapper As B4XView = vXv2
	If i = 100 Then
		Return
	End If
	Dim centerX As Int = f - vB4XRect1.CenterX
	Dim centerY As Int = f2 - vB4XRect1.CenterY
	Dim vPower As Double = Power(centerX, 2)
	If Sqrt(vPower + Power(centerY, 2)) > vB4XRect1.Width / 2 Then
		Dim vRound As Int = (Round(ATan2D(centerY, centerX)) + 90 + 360) Mod 360 / 360 * (vInt3 - vInt2) + vInt2
		Dim d As Double = vInt2
		Dim vMax As Int = Max(d, Min(vInt3, vRound))
		If vMax <> vInt1 Then
			vInt1 = vMax
			Dim xui As XUI = vXUI1
			If XUI.SubExists(vObj1, vStr1 & "_ValueChanged", 1) Then
				CallSub2(vObj1, vStr1 & "_ValueChanged", vInt1)
			End If
		End If
		Sub002()
	End If
End Sub

Sub Sub003(i As Int, i2 As Int)
	vInt10 = i
	vInt9 = i2
	Sub002()
End Sub

Sub Sub004(i As Int, i2 As Int)
	vInt7 = i
	vInt8 = i2
	Sub001()
	Sub002()
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(i As Int)
	Dim d As Double = vInt2
	vInt1 = Max(d, Min(vInt3, i))
	Sub002()
End Sub

