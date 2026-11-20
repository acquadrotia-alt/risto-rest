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
	Public vBCBrush1 As BCBrush
	Public vInt1 As Int
	Public vInt2 As Int
	Public vXv2 As B4XView
	Public vBCBrush2 As BCBrush
	Public vBln1 As Boolean
	Public vFlt1 As Float
	Public vInt3 As Int
	Public vBCBrush3 As BCBrush
	Public vInt4 As Int
	Public vObj2 As Object
	Public vFlt2 As Float
	Public vInt5 As Int
	Public vInt6 As Int
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	Dim vGetAllViewsRecursive As IterableList = vXv1.GetAllViewsRecursive
	Dim size As Int = vGetAllViewsRecursive.Size
	Dim i As Int
	For i = 0 To size - 1
		vGetAllViewsRecursive.Get(i).SetLayoutAnimated(0, 0, 0, d, d2)
	Next
	Dim width As Double = vXv1.Width
	Dim xui As XUI = vXUI1
	Dim scale As Int = width / XUI.Scale
	Dim height As Double = vXv1.Height
	Dim xui2 As XUI = vXUI1
	BitmapCreator.initialize(scale, height / XUI.Scale)
	vBln1 = (vXv1.Height > vXv1.Width)
	Sub002()
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub BusyLoop
	Dim myindex As Int
	Dim r As B4XRect
	Dim lasttime As Long
	Dim tasks As List
	Dim delta As Float
	Dim change As Float
	Dim bmp As B4XBitmap
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				myindex = vInt2
				'r = B4XRect
				r.Initialize(0, 0, vBitmapCreator1.mwidth, vBitmapCreator1.mheight)
				lasttime = DateTime.Now
				Continue
			Case 1
				rsState = 37
				If myindex <> vInt2 Then
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
				rsState = 9
				If vBln1 Then
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
				vBCBrush1.SrcOffsetY = vBCBrush1.SrcOffsetY + vInt6
				Continue
			Case 8
				rsState = 9
				vBCBrush1.SrcOffsetX = vBCBrush1.SrcOffsetX + vInt6
				Continue
			Case 9
				rsState = 10
				'tasks = List
				tasks.Initialize
				Dim list As List = tasks
				Dim b4XRect As B4XRect = vBitmapCreator1.targetrect
				Dim bcbrushVar As BCBrush = vBCBrush2
				list.Add(BitmapCreator.asyncdrawrect(b4XRect, bcbrushVar, True, 0))
				delta = vInt4 - vFlt1
				Continue
			Case 10
				rsState = 21
				If Abs(delta) <= 1 Then
					rsState = 12
					Continue
				Else
					rsState = 14
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 12
			Case 12
				rsState = 21
				vFlt1 = vInt4
				Continue
			Case 14
				rsState = 15
				change = (DateTime.Now - lasttime) / 1000 * vFlt2
				Continue
			Case 15
				rsState = 20
				If delta > 0 Then
					rsState = 17
					Continue
				Else
					rsState = 19
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 17
			Case 17
				rsState = 20
				Dim d As Double = vFlt1
				vFlt1 = d + Min(change, vInt4 - vFlt1)
				Continue
			Case 19
				rsState = 20
				Dim d2 As Double = vFlt1
				vFlt1 = d2 - Min(change, vFlt1 - vInt4)
				Continue
			Case 20
				rsState = 21
				Continue
			Case 21
				rsState = 22
				lasttime = DateTime.Now
				Continue
			Case 22
				rsState = 25
				If vFlt1 >= 100 Then
					Continue
				Else
					rsState = 24
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 24
			Case 24
				rsState = 25
				Dim list2 As List = tasks
				Dim b4XRect2 As B4XRect = vBitmapCreator1.targetrect
				Dim bcbrushVar2 As BCBrush = vBCBrush3
				list2.Add(BitmapCreator.asyncdrawrectrounded(b4XRect2, bcbrushVar2, True, 0, vInt5))
				Continue
			Case 25
				rsState = 30
				If vBln1 Then
					rsState = 27
					Continue
				Else
					rsState = 29
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 27
			Case 27
				rsState = 30
				Dim b4XRect3 As B4XRect = r
				b4XRect3.Bottom = Round(vFlt1 / 100 * vBitmapCreator1.mheight)
				Continue
			Case 29
				rsState = 30
				Dim b4XRect4 As B4XRect = r
				b4XRect4.Right = Round(vFlt1 / 100 * vBitmapCreator1.mwidth)
				Continue
			Case 30
				rsState = 31
				Dim list3 As List = tasks
				Dim b4XRect5 As B4XRect = r
				Dim bcbrushVar3 As BCBrush = vBCBrush1
				list3.Add(BitmapCreator.asyncdrawrectrounded(b4XRect5, bcbrushVar3, True, 0, vInt5))
				vBitmapCreator1._drawbitmapcreatorsasync(Me, "BC", tasks)
				Wait For (Null) Bc_Bitmapready (wf38_0 As B4XBitmap)
				rsState = 38
				Continue
			Case 31
				rsState = 36
				Dim xui As XUI = vXUI1
				If Not(XUI.IsB4J) Then
					Continue
				Else
					rsState = 33
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 33
			Case 33
				rsState = 36
				bmp = vBitmapCreator1._getbitmap
				Continue
			Case 36
				rsState = 1
				vBitmapCreator1._setbitmaptoimageview(bmp, vXv2)
				Sleep(30)
				rsState = 39
				Continue
			Case 37
				rsState = -1
				Continue
			Case 38
				rsState = 31
				bmp = wf38_0
				Continue
			Case 39
				rsState = 1
				Continue
		End Select
	Loop
End Sub

Sub bc_bitmapready(b4XBitmapWrapper As B4XBitmap)
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	Dim imageViewWrapper As ImageView
	imageViewWrapper.Initialize("")
	vXv2 = imageViewWrapper
	Dim b4XViewWrapper As B4XView = vXv2
	Dim xui As XUI = vXUI1
	b4XViewWrapper.Color = 0
	setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(map.GetDefault("Value", 100))
	vFlt1 = vInt4
	vXv1.AddView(vXv2, 0, 0, 0, 0)
	vXv1.AddView(labelWrapper, 0, 0, vXv1.Width, vXv1.Height)
	Dim b4XViewWrapper2 As B4XView = vXv1
	Dim xui2 As XUI = vXUI1
	b4XViewWrapper2.SetColorAndBorder(0, 0, 0, 0)
	Dim xui3 As XUI = vXUI1
	vInt1 = XUI.PaintOrColorToColor(map.Get("ProgressColor"))
	vInt5 = map.GetDefault("CornerRadius", 15)
	base_resize(vXv1.Width, vXv1.Height)
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 As Int
	Return vInt1
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 As Int
	Return vInt4
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 As Boolean
	Return vXv1.Visible
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(i As Int)
	vInt1 = i
	Sub002()
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(i As Int)
	vInt4 = Max(0, Min(100, i))
End Sub

Sub Sub001(i As Int)
	setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(i)
	vFlt1 = vInt4
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(z As Boolean)
	vInt2 = vInt2 + 1
	If z Then
		BusyLoop()
	End If
	vXv1.Visible = z
End Sub

Sub Sub002
	vBCBrush3 = vBitmapCreator1._createbrushfromcolor(vInt3)
	Dim xui As XUI = vXUI1
	vBCBrush2 = BitmapCreator.createbrushfromcolor(0)
	Dim argbcolorVar As _argbcolor
	vBitmapCreator1._colortoargb(vInt1, argbcolorVar)
	argbcolorVar.r = Min(255, argbcolorVar.r * 1.5)
	argbcolorVar.g = Min(255, argbcolorVar.g * 1.5)
	argbcolorVar.b = Min(255, argbcolorVar.b * 1.5)
	If vBln1 Then
		Dim width As Double = vXv1.Width
		Dim xui2 As XUI = vXUI1
		Dim width2 As Double = vXv1.Width
		Dim xui3 As XUI = vXUI1
		BitmapCreator.initialize(width / XUI.Scale, width2 / XUI.Scale + 40)
	Else
		Dim height As Double = vXv1.Height
		Dim xui4 As XUI = vXUI1
		Dim height2 As Double = vXv1.Height
		Dim xui5 As XUI = vXUI1
		BitmapCreator.initialize(height / XUI.Scale + 40, height2 / XUI.Scale)
	End If
	Dim i As Int = vInt1
	BitmapCreator.drawrect(BitmapCreator.targetrect, i, True, 0)
	If vBln1 Then
		BitmapCreator.drawline(40 / 2, 40 / 2, BitmapCreator.mwidth + 40 / 2, BitmapCreator.mheight - 40 / 2, vBitmapCreator1._argbtocolor(argbcolorVar), 40)
	Else
		BitmapCreator.drawline(40 / 2, 40 / 2, BitmapCreator.mwidth - 40 / 2, BitmapCreator.mheight + 40 / 2, vBitmapCreator1._argbtocolor(argbcolorVar), 40)
	End If
	vBCBrush1 = vBitmapCreator1._createbrushfrombitmapcreator(BitmapCreator)
	If vInt4 = 100 Then
		Dim b4XRect2 As B4XRect = vBitmapCreator1.targetrect
		Dim i2 As Int = vInt1
		BitmapCreator.drawrectrounded(b4XRect2, i2, True, 0, 15)
	Else
		Dim b4XRect3 As B4XRect = vBitmapCreator1.targetrect
		Dim bcbrushVar As BCBrush = vBCBrush3
		BitmapCreator.drawrectrounded2(b4XRect3, bcbrushVar, True, 0, 15)
	End If
	vBitmapCreator1._setbitmaptoimageview(vBitmapCreator1._getbitmap, vXv2)
	setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(vXv1.Visible)
End Sub

