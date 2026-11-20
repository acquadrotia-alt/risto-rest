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
	Public vLst1 As List
	Public vInt1 As Int
	Public vXv2 As B4XView
	Public vLst2 As List
	Public vInt2 As Int
	Public vInt3 As Int
	Public vInt4 As Int
	Public vB4XBitmap1 As B4XBitmap
	Public vXv3 As B4XView
	Public vObj2 As Object
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	vXv1.GetView(0).SetLayoutAnimated(0, 0, 0, d, d2)
	vXv3.SetLayoutAnimated(0, 0, 0, d, d2)
	Dim b4XViewWrapper As B4XView = vXv3
	b4XViewWrapper.SetBitmap(vB4XBitmap1.Resize(d, d2, False))
	vInt2 = d2
	vInt3 = d / vInt1
	Dim vTmp As B4XBitmap = Sub001(vXv2)
	Dim i As Int = d
	Dim size As Int = vLst1.Size - 1
	Dim i2 As Int
	For i2 = 0 To size
		Dim b4XViewWrapper2 As B4XView = vLst1.Get(i2)
		i = i - vInt3
		b4XViewWrapper2.SetLayoutAnimated(0, i, Sub003(i2), vInt3, vInt2 * 10)
		b4XViewWrapper2.SetBitmap(vTmp)
	Next
End Sub

Sub Sub001(b4XViewWrapper As B4XView) As B4XBitmap
	Dim i As Int = 0
	Dim xui As XUI = vXUI1
	Dim vCreatePanel As B4XView = XUI.CreatePanel("")
	vCreatePanel.SetLayoutAnimated(0, 0, 0, vInt3, vInt2 * 10)
	Dim b4XCanvas As B4XCanvas
	b4XCanvas.Initialize(vCreatePanel)
	Dim vMeasureText As B4XRect = b4XCanvas.MeasureText("5", b4XViewWrapper.Font)
	Dim height As Int = vInt2 / 2 - vMeasureText.Height / 2 - vMeasureText.Top
	Do While True
		Dim i2 As Int = i
		If i2 <= 9 Then
			b4XCanvas.DrawText(i2, vInt3 / 2, vInt2 * i2 + height, b4XViewWrapper.Font, b4XViewWrapper.TextColor, "CENTER")
			i = i2 + 1
		Else
			b4XCanvas.Invalidate
			Dim vCreateBitmap As B4XBitmap = b4XCanvas.CreateBitmap
			b4XCanvas.Release
			Return vCreateBitmap
		End If
	Loop
End Sub

Sub Sub002(i As Int) As B4XBitmap
	BitmapCreator.initialize(200, 50)
	Dim b4XRect As B4XRect
	b4XRect.Initialize(0, 0, BitmapCreator.mwidth, BitmapCreator.mheight / 3)
	Dim vAnd As Int = Bit.And(16777215, i)
	BitmapCreator.fillgradient(Array As Int(i, vAnd), b4XRect, "TOP_BOTTOM")
	b4XRect.Top = BitmapCreator.mheight * 2 / 3
	b4XRect.Bottom = BitmapCreator.mheight
	BitmapCreator.fillgradient(Array As Int(i, vAnd), b4XRect, "BOTTOM_TOP")
	Return BitmapCreator.getbitmap()
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	Dim xui As XUI = vXUI1
	vXv1.AddView(XUI.CreatePanel(""), 0, 0, 0, 0)
	vInt1 = map.Get("Digits")
	vInt4 = map.Get("Duration")
	vXv2 = labelWrapper
	Dim xui2 As XUI = vXUI1
	Dim xui3 As XUI = vXUI1
	vB4XBitmap1 = Sub002(XUI.PaintOrColorToColor(map.GetDefault("FadeColor", -1)))
	Dim i As Int = vInt1 - 1
	Dim i2 As Int
	For i2 = 0 To i
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("")
		vLst1.Add(imageViewWrapper)
		vXv1.GetView(0).AddView(imageViewWrapper, 0, 0, 0, 0)
	Next
	Dim imageViewWrapper2 As ImageView
	imageViewWrapper2.Initialize("")
	vXv3 = imageViewWrapper2
	vXv1.GetView(0).AddView(imageViewWrapper2, 0, 0, 0, 0)
	setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(0)
	Dim xui4 As XUI = vXUI1
	If XUI.IsB4A Then
		base_resize(vXv1.Width, vXv1.Height)
		setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6())
		Return
	End If
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 As Int
	Dim size As Int = vLst2.Size - 1
	Dim i As Int = 0
	Dim i2 As Int
	For i2 = 0 To size
		Dim vObjectToNumber As Double = vLst2.Get(i2)
		i = i + vObjectToNumber * Power(10, i2)
	Next
	Return i
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
	vLst1.Initialize
	vLst2.Initialize
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(i As Int)
	vLst2.Clear
	Dim i2 As Int = vInt1 - 1
	Dim i3 As Int
	For i3 = 0 To i2
		vLst2.Add(i Mod 10)
		i = i / 10
		Dim b4XViewWrapper As B4XView = vLst1.Get(i3)
		Dim i4 As Int = vInt4
		Dim left As Int = b4XViewWrapper.Left
		Dim vTmp As Int = Sub003(i3)
		Dim vMax As Int = Max(1, b4XViewWrapper.Width)
		b4XViewWrapper.SetLayoutAnimated(i4, left, vTmp, vMax, Max(1, b4XViewWrapper.Height))
	Next
End Sub

Sub Sub003(i As Int) As Int
	Return vLst2.Get(i) * vInt2
End Sub

