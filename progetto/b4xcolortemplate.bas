B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Type colorpickerpart(DrawCheckers As Boolean, checkersCanvas As B4XCanvas, cvs As B4XCanvas, iv As B4XView, pnl As B4XView)
	Public vXv1 As B4XView
	Public vXUI1 As XUI
	Public vInt1 As Int
	Public vFlt1 As Float
	Public vFlt2 As Float
	Public vFlt3 As Float
	Public vFlt4 As Float
	Public vFlt5 As Float
	Public dont_change As Int
	Public vcolorpickerpart1 As colorpickerpart
	Public vcolorpickerpart2 As colorpickerpart
	Public vcolorpickerpart3 As colorpickerpart
	Public vInt2 As Int
	Public vb4xdialog1 As b4xdialog
	Public vObjectArr1() As Object
End Sub

Sub Alpha_Touch(i As Int, f As Float, f2 As Float)
	Dim b4XViewWrapper As B4XView = vXv1
	If i = 100 Then
		Return
	End If
	Sub001(f)
End Sub

Sub Sub001(f As Float)
	vInt1 = Max(0, Min(1, f / vcolorpickerpart3.pnl.Width)) * 255
	Dim width As Float = vInt1 / 255 * vcolorpickerpart3.pnl.Width
	vcolorpickerpart3.cvs.ClearRect(vcolorpickerpart3.cvs.TargetRect)
	Dim b4XRect As B4XRect
	Dim vDipToCurrent As Float = DipToCurrent(1)
	Dim bottom As Float = vcolorpickerpart3.cvs.TargetRect.Bottom
	b4XRect.Initialize(width - DipToCurrent(3), vDipToCurrent, width + DipToCurrent(3), bottom - DipToCurrent(1))
	Dim b4XCanvas As B4XCanvas = vcolorpickerpart3.cvs
	Dim xui As XUI = vXUI1
	b4XCanvas.DrawRect(b4XRect, -16777216, True, DipToCurrent(2))
	vcolorpickerpart3.cvs.Invalidate
	Sub010()
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	vFlt5 = Max(1, Max(d, d2) / 100 / vFlt4)
	Dim b4XViewWrapper As B4XView = vcolorpickerpart1.pnl
	Dim vDipToCurrent As Int = DipToCurrent(1)
	Dim vDipToCurrent2 As Int = DipToCurrent(1)
	Dim vDipToCurrent3 As Int = DipToCurrent(30)
	b4XViewWrapper.SetLayoutAnimated(0, vDipToCurrent, vDipToCurrent2, vDipToCurrent3, d2 - DipToCurrent(2))
	Dim width As Int = vcolorpickerpart1.pnl.Width + vcolorpickerpart1.pnl.Left
	Dim vDipToCurrent4 As Int = width + DipToCurrent(1)
	Dim vDipToCurrent5 As Int = d - vDipToCurrent4 - DipToCurrent(1)
	Dim xui As XUI = vXUI1
	If XUI.IsB4i Then
		vDipToCurrent4 = vDipToCurrent4 - 1
		vDipToCurrent5 = vDipToCurrent5 + 1
	End If
	Dim b4XViewWrapper2 As B4XView = vcolorpickerpart3.pnl
	b4XViewWrapper2.SetLayoutAnimated(0, vDipToCurrent4, d2 - DipToCurrent(31), vDipToCurrent5, DipToCurrent(30))
	Dim b4XViewWrapper3 As B4XView = vcolorpickerpart2.pnl
	Dim vDipToCurrent6 As Int = DipToCurrent(1)
	b4XViewWrapper3.SetLayoutAnimated(0, vDipToCurrent4, vDipToCurrent6, vDipToCurrent5, d2 - DipToCurrent(3) - vcolorpickerpart3.pnl.Height)
	vBitmapCreator1._initialize(vcolorpickerpart2.pnl.Width / vFlt5, vcolorpickerpart2.pnl.Height / vFlt5)
	For Each obj As Object In Array(vcolorpickerpart1, vcolorpickerpart2, vcolorpickerpart3)
		Dim colorpickerpartVar As colorpickerpart = obj
		Dim numberOfViews As Int = colorpickerpartVar.pnl.NumberOfViews - 1
		Dim i As Int
		For i = 0 To numberOfViews
			colorpickerpartVar.pnl.GetView(i).SetLayoutAnimated(0, 0, 0, colorpickerpartVar.pnl.Width, colorpickerpartVar.pnl.Height)
		Next
		colorpickerpartVar.cvs.Resize(colorpickerpartVar.pnl.Width, colorpickerpartVar.pnl.Height)
		If colorpickerpartVar.DrawCheckers Then
			Sub005(colorpickerpartVar)
		End If
	Next
	Sub007()
	Sub004()
	Sub009(vFlt1 / 360 * vcolorpickerpart1.pnl.Height)
	Sub001(vInt1 / 255 * vcolorpickerpart3.pnl.Width)
End Sub

Sub Colors_Touch(i As Int, f As Float, f2 As Float)
	Dim b4XViewWrapper As B4XView = vXv1
	If i = 100 Then
		Return
	End If
	Sub008(f, f2)
End Sub

Sub Sub002(i As Int) As Object()
	Dim f As Float
	Dim f2 As Float
	Dim f3 As Float
	Dim vAnd As Int = Bit.And(255, Bit.UnsignedShiftRight(i, 24))
	Dim vAnd2 As Int = Bit.And(255, Bit.UnsignedShiftRight(i, 16))
	Dim vAnd3 As Int = Bit.And(255, Bit.UnsignedShiftRight(i, 8))
	Dim vAnd4 As Int = Bit.And(255, Bit.UnsignedShiftRight(i, 0))
	Dim vMax As Int = Max(Max(vAnd2, vAnd3), vAnd4)
	Dim vMin As Int = Min(Min(vAnd2, vAnd3), vAnd4)
	Dim f4 As Float = vMax / 255
	If vMax = 0 Then
		f = 0
	Else
		f = (vMax - vMin) / vMax
	End If
	If f = 0 Then
		f3 = 0
	Else
		Dim f5 As Float = (vMax - vAnd2) / (vMax - vMin)
		Dim f6 As Float = (vMax - vAnd3) / (vMax - vMin)
		Dim f7 As Float = (vMax - vAnd4) / (vMax - vMin)
		If vAnd2 = vMax Then
			f2 = f7 - f6
		Else If vAnd3 = vMax Then
			f2 = f5 + 2 - f7
		Else
			f2 = 4 + f6 - f5
		End If
		f3 = f2 / 6
		If f3 < 0 Then
			f3 = f3 + 1
		End If
	End If
	Return Array(f3 * 360, f, f4, vAnd)
End Sub

Sub Sub003(str As String, z As Boolean) As colorpickerpart
	Dim colorpickerpartVar As colorpickerpart
	colorpickerpartVar.Initialize
	Dim xui As XUI = vXUI1
	colorpickerpartVar.pnl = XUI.CreatePanel("")
	Dim i As Int = vInt2
	colorpickerpartVar.pnl.SetColorAndBorder(i, DipToCurrent(1), vInt2, 0)
	Dim vDipToCurrent As Int = DipToCurrent(1)
	Dim vDipToCurrent2 As Int = DipToCurrent(1)
	Dim vDipToCurrent3 As Int = DipToCurrent(1)
	colorpickerpartVar.pnl.SetLayoutAnimated(0, vDipToCurrent, vDipToCurrent2, vDipToCurrent3, DipToCurrent(1))
	If z Then
		colorpickerpartVar.checkersCanvas.Initialize(colorpickerpartVar.pnl)
		colorpickerpartVar.DrawCheckers = True
	End If
	Dim imageViewWrapper As ImageView
	imageViewWrapper.Initialize("")
	colorpickerpartVar.iv = imageViewWrapper
	Dim xui2 As XUI = vXUI1
	Dim vCreatePanel As B4XView = XUI.CreatePanel(str)
	colorpickerpartVar.pnl.AddView(imageViewWrapper, 0, 0, 0, 0)
	Dim view As View = vCreatePanel
	Dim vDipToCurrent4 As Int = DipToCurrent(1)
	Dim vDipToCurrent5 As Int = DipToCurrent(1)
	Dim vDipToCurrent6 As Int = DipToCurrent(1)
	colorpickerpartVar.pnl.AddView(view, vDipToCurrent4, vDipToCurrent5, vDipToCurrent6, DipToCurrent(1))
	colorpickerpartVar.cvs.Initialize(vCreatePanel)
	vXv1.AddView(colorpickerpartVar.pnl, 0, 0, 0, 0)
	Return colorpickerpartVar
End Sub

Sub dialogclosed(i As Int)
	Dim xui As XUI = vXUI1
	If i <> -1 Then
		setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(vObjectArr1)
		Return
	End If
End Sub

Sub Sub004
	BitmapCreator.initialize(vcolorpickerpart3.pnl.Width / vFlt4, vcolorpickerpart3.pnl.Height / vFlt4)
	Dim argbcolorVar As _argbcolor
	argbcolorVar.r = 204
	argbcolorVar.g = 204
	argbcolorVar.b = 204
	Dim i As Int = BitmapCreator.mheight - 1
	Dim i2 As Int
	For i2 = 0 To i
		Dim i3 As Int = BitmapCreator.mwidth - 1
		Dim i4 As Int
		For i4 = 0 To i3
			argbcolorVar.a = i4 / BitmapCreator.mwidth * 255
			BitmapCreator.setargb(i4, i2, argbcolorVar)
		Next
	Next
	vcolorpickerpart3.iv.SetBitmap(BitmapCreator.getbitmap())
End Sub

Sub Sub005(colorpickerpartVar As colorpickerpart)
	colorpickerpartVar.checkersCanvas.Resize(colorpickerpartVar.pnl.Width, colorpickerpartVar.pnl.Height)
	colorpickerpartVar.checkersCanvas.ClearRect(colorpickerpartVar.checkersCanvas.TargetRect)
	Dim vDipToCurrent As Int = DipToCurrent(10)
	Dim iArr() As Int = Array(-4144960, -9079435)
	Dim b4XRect As B4XRect
	Dim right As Float = colorpickerpartVar.checkersCanvas.TargetRect.Right
	Dim vDipToCurrent2 As Int = right - DipToCurrent(1)
	Dim i As Int = 0
	Do While True
		If (vDipToCurrent <= 0 Or i > vDipToCurrent2) And (vDipToCurrent >= 0 Or i < vDipToCurrent2) Then
			Exit
		End If
		Dim bottom As Float = colorpickerpartVar.checkersCanvas.TargetRect.Bottom
		Dim vDipToCurrent3 As Int = bottom - DipToCurrent(1)
		Dim i2 As Int = i / vDipToCurrent Mod 2
		Dim i3 As Int = 0
		Do While True
			If (vDipToCurrent > 0 And i3 <= vDipToCurrent3) Or (vDipToCurrent < 0 And i3 >= vDipToCurrent3) Then
				i2 = (i2 + 1) Mod 2
				b4XRect.Initialize(i, i3, i + vDipToCurrent, i3 + vDipToCurrent)
				Dim i4 As Int = iArr(i2)
				colorpickerpartVar.checkersCanvas.DrawRect(b4XRect, i4, True, 0)
				i3 = i3 + 0 + vDipToCurrent
			End If
		Loop
		i = i + 0 + vDipToCurrent
	Loop
	colorpickerpartVar.checkersCanvas.Invalidate
End Sub

Sub Sub006
	Dim i As Int = vBitmapCreator1.mwidth - 1
	Dim i2 As Int
	For i2 = 0 To i
		Dim i3 As Int = vBitmapCreator1.mheight - 1
		Dim i4 As Int
		For i4 = 0 To i3
			vBitmapCreator1._sethsv(i2, i4, vInt1, vFlt1, i2 / vBitmapCreator1.mwidth, (vBitmapCreator1.mheight - i4) / vBitmapCreator1.mheight)
		Next
	Next
	Dim b4XViewWrapper As B4XView = vcolorpickerpart2.iv
	Dim getbitmap As B4XBitmap = vBitmapCreator1._getbitmap
	Dim width As Int = vcolorpickerpart2.iv.Width
	Dim height As Int = vcolorpickerpart2.iv.Height
	b4XViewWrapper.SetBitmap(getbitmap.Resize(width, height, False))
End Sub

Sub Sub007
	BitmapCreator.initialize(vcolorpickerpart1.pnl.Width / vFlt4, vcolorpickerpart1.pnl.Height / vFlt4)
	Dim i As Int = BitmapCreator.mheight - 1
	Dim i2 As Int
	For i2 = 0 To i
		Dim i3 As Int = BitmapCreator.mwidth - 1
		Dim i4 As Int
		For i4 = 0 To i3
			BitmapCreator.sethsv(i4, i2, 255, 360 / BitmapCreator.mheight * i2, 1, 1)
		Next
	Next
	vcolorpickerpart1.iv.SetBitmap(BitmapCreator.getbitmap())
End Sub

Sub getpanel(b4xdialogVar As b4xdialog) As B4XView
	Return vXv1
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5 As Int
	Dim getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6_() As Object = getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6()
	vBitmapCreator2._sethsv(0, 0, vInt1, getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6_(0), getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6_(1), getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6_(2))
	Return vBitmapCreator2._getcolor(0, 0)
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 As Object()
	Return Array(vFlt1, vFlt2, vFlt3, vInt1)
End Sub

Sub Sub008(i As Int, i2 As Int)
	If i <> dont_change Then
		vFlt2 = Max(0, Min(1, i / vcolorpickerpart2.pnl.Width))
		vFlt3 = Max(0, Min(1, (vcolorpickerpart2.pnl.Height - i2) / vcolorpickerpart2.pnl.Height))
	End If
	vcolorpickerpart2.cvs.ClearRect(vcolorpickerpart2.cvs.TargetRect)
	Dim b4XCanvas As B4XCanvas = vcolorpickerpart2.cvs
	Dim width As Float = vFlt2 * vcolorpickerpart2.pnl.Width
	Dim height As Float = vcolorpickerpart2.pnl.Height - vFlt3 * vcolorpickerpart2.pnl.Height
	Dim vDipToCurrent As Float = DipToCurrent(10)
	Dim xui As XUI = vXUI1
	b4XCanvas.DrawCircle(width, height, vDipToCurrent, -1, False, DipToCurrent(2))
	vcolorpickerpart2.cvs.Invalidate
	Sub011()
End Sub

Sub Huebar_Touch(i As Int, f As Float, f2 As Float)
	Dim b4XViewWrapper As B4XView = vXv1
	If i = 100 Then
		Return
	End If
	Sub009(f2)
End Sub

Sub Sub009(f As Float)
	vFlt1 = Max(0, Min(360, 360 * f / vcolorpickerpart1.pnl.Height))
	Dim height As Float = vFlt1 * vcolorpickerpart1.pnl.Height / 360
	vcolorpickerpart1.cvs.ClearRect(vcolorpickerpart1.cvs.TargetRect)
	Dim b4XRect As B4XRect
	Dim right As Float = vcolorpickerpart1.cvs.TargetRect.Right
	b4XRect.Initialize(0, height - DipToCurrent(3), right, height + DipToCurrent(3))
	Dim b4XCanvas As B4XCanvas = vcolorpickerpart1.cvs
	Dim xui As XUI = vXUI1
	b4XCanvas.DrawRect(b4XRect, -1, False, DipToCurrent(2))
	vcolorpickerpart1.cvs.Invalidate
	Sub010()
End Sub

Sub Initialize
	vBitmapCreator2._initialize(1, 1)
	vFlt4 = DipToCurrent(100) / 100
	Dim xui As XUI = vXUI1
	vXv1 = XUI.CreatePanel("")
	Dim b4XViewWrapper As B4XView = vXv1
	Dim vDipToCurrent As Int = DipToCurrent(300)
	b4XViewWrapper.SetLayoutAnimated(0, 0, 0, vDipToCurrent, DipToCurrent(250))
	Dim xui2 As XUI = vXUI1
	vInt2 = -16777216
	Dim b4XViewWrapper2 As B4XView = vXv1
	Dim i As Int = vInt2
	Dim vDipToCurrent2 As Int = DipToCurrent(1)
	Dim i2 As Int = vInt2
	b4XViewWrapper2.SetColorAndBorder(i, vDipToCurrent2, i2, DipToCurrent(2))
	vcolorpickerpart1 = Sub003("hueBar", False)
	vcolorpickerpart2 = Sub003("colors", True)
	vcolorpickerpart3 = Sub003("alpha", True)
	base_resize(vXv1.Width, vXv1.Height)
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5(i As Int)
	setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(Sub002(i))
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(objArr As Object())
	vFlt1 = objArr(0)
	vFlt2 = objArr(1)
	vFlt3 = objArr(2)
	vInt1 = objArr(3)
	Sub009(vFlt1 / 360 * vcolorpickerpart1.pnl.Height)
	Sub001(vInt1 / 255 * vcolorpickerpart3.pnl.Width)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub show(dialog As b4xdialog)
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = -1
				vObjectArr1 = getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6()
				vb4xdialog1 = dialog
				Sleep(0)
				rsState = 1
				Continue
			Case 1
				rsState = -1
				Sub011()
				Continue
		End Select
	Loop
End Sub

Sub Sub010
	Sub006()
	Sub008(dont_change, dont_change)
End Sub

Sub Sub011
	If vb4xdialog1.IsInitialized And vb4xdialog1.vXv5.IsInitialized Then
		vb4xdialog1.vXv5.Color = getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv5()
		Return
	End If
End Sub

