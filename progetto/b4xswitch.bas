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
	Public vBCBrush2 As BCBrush
	Public vInt1 As Int
	Public vInt2 As Int
	Public vBCBrush3 As BCBrush
	Public vImg1 As ImageView
	Public vBln1 As Boolean
	Public vBCBrush4 As BCBrush
	Public vInt3 As Int
	Public vObj2 As Object
	Public vFlt1 As Float
	Public vBln2 As Boolean
	Public vBln3 As Boolean
End Sub

Sub Base_Resize(d As Double, d2 As Double)
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	vXv1.SetLayoutAnimated(0, vXv1.Left, vXv1.Top, vInt1, vInt2)
	Dim b4XViewWrapper As B4XView = vXv1
	Dim xui As XUI = vXUI1
	b4XViewWrapper.SetColorAndBorder(0, 0, 0, 0)
	Dim xui2 As XUI = vXUI1
	Dim vCreatePanel As B4XView = XUI.CreatePanel("pnl")
	Dim xui3 As XUI = vXUI1
	vCreatePanel.Color = 0
	vImg1.Initialize("")
	vXv1.AddView(vImg1, 0, 0, vInt1, vInt2)
	vXv1.AddView(vCreatePanel, 0, 0, vInt1, vInt2)
	vBitmapCreator1._initialize(vInt1, vInt2)
	Dim xui4 As XUI = vXUI1
	vFlt1 = XUI.Scale
	Dim xui5 As XUI = vXUI1
	vBCBrush1 = BitmapCreator.createbrushfromcolor(XUI.PaintOrColorToColor(map.Get("OnColor")))
	Dim xui6 As XUI = vXUI1
	vBCBrush2 = BitmapCreator.createbrushfromcolor(XUI.PaintOrColorToColor(map.Get("OffColor")))
	Dim xui7 As XUI = vXUI1
	vBCBrush3 = BitmapCreator.createbrushfromcolor(XUI.PaintOrColorToColor(map.Get("ThumbColor")))
	vBln3 = map.GetDefault("HapticFeedback", False)
	Dim xui8 As XUI = vXUI1
	vBCBrush4 = BitmapCreator.createbrushfromcolor(0)
	vBln2 = vXv1.Enabled
	Dim b4XViewWrapper2 As B4XView = vXv1
	b4XViewWrapper2.Enabled = True
	Dim vObjectToBoolean As Boolean = map.Get("Value")
	SetValueImpl(vObjectToBoolean, True)
End Sub

Sub Sub001(f As Float)
	Dim f2 As Float
	Dim b4XRect As B4XRect = vBitmapCreator1.targetrect
	Dim bcbrushVar As BCBrush = vBCBrush4
	BitmapCreator.drawrect2(b4XRect, bcbrushVar, True, 0)
	Dim vRound As Float = Round(vBitmapCreator1.mheight / 2)
	Dim f3 As Float = vRound - 1 * vFlt1 + (vBitmapCreator1.mwidth - 2 * vRound) * f
	If f = 0 Then
		f2 = vRound
	Else If f = 1 Then
		f2 = Round(vBitmapCreator1.mwidth - 1 * vFlt1 - vRound)
	Else
		f2 = f3
	End If
	Dim i As Int = vBitmapCreator1.mheight / 2
	Dim b4XRect2 As B4XRect
	Dim f4 As Float = f * vBitmapCreator1.mwidth
	Dim f5 As Float = f * vBitmapCreator1.mheight
	If f < 1 Then
		Dim b4XRect3 As B4XRect = vBitmapCreator1.targetrect
		Dim bcbrushVar2 As BCBrush = vBCBrush2
		BitmapCreator.drawrectrounded2(b4XRect3, bcbrushVar2, True, 2 * vFlt1, vRound)
	End If
	b4XRect2.Initialize(vBitmapCreator1.mwidth / 2 - f4 / 2, i - f5 / 2, vBitmapCreator1.mwidth / 2 + f4 / 2, i + f5 / 2)
	If f > 0 Then
		Dim bcbrushVar3 As BCBrush = vBCBrush1
		BitmapCreator.drawrectrounded2(b4XRect2, bcbrushVar3, True, 2 * vFlt1, b4XRect2.Height / 2)
	End If
	If vBln2 Then
		Dim f6 As Float = vRound - 2 * vFlt1
		Dim bcbrushVar4 As BCBrush = vBCBrush3
		vBitmapCreator1._drawcircle2(f2, i, f6, bcbrushVar4, True, 0)
	End If
	vBitmapCreator1._setbitmaptoimageview(vBitmapCreator1._getbitmap, vImg1)
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 As Boolean
	Return vBln2
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 As Boolean
	Return vBln1
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
End Sub

Sub Pnl_Click
	If vBln2 Then
		If vBln3 Then
			xuiviewsutils.Sub004(vXv1)
		End If
		Dim vNot As Boolean = Not(vBln1)
		SetValueImpl(vNot, False)
		Dim xui As XUI = vXUI1
		If XUI.SubExists(vObj1, vStr1 & "_ValueChanged", 1) Then
			CallSubDelayed2(vObj1, vStr1 & "_ValueChanged", vBln1)
			Return
		End If
		Return
	End If
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(z As Boolean)
	vBln2 = z
	Dim z2 As Boolean = vBln1
	SetValueImpl(z2, True)
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(z As Boolean)
	If z = vBln1 Then
		Return
	End If
	SetValueImpl(z, False)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub SetValueImpl(b As Boolean, immediate As Boolean)
	Dim myindex As Int
	Dim start As Long
	Dim duration As Int
	Dim state1 As Float
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				vBln1 = b
				vInt3 = vInt3 + 1
				Continue
			Case 1
				rsState = 41
				If immediate Then
					rsState = 3
					Continue
				Else
					rsState = 13
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 4
				Continue
			Case 4
				rsState = 11
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
				rsState = 11
				Sub001(1)
				Continue
			Case 8
				rsState = 11
				Sub001(0)
				Continue
			Case 11
				rsState = 41
				Continue
			Case 13
				rsState = 14
				myindex = vInt3
				start = DateTime.Now
				duration = 200
				Continue
			Case 14
				rsState = 29
				If DateTime.Now >= start + duration Then
					Continue
				Else
					rsState = 16
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 16
			Case 16
				rsState = 17
				state1 = (DateTime.Now - start) / duration
				Continue
			Case 17
				rsState = 22
				Dim z As Boolean = vBln1
				If Not(z) Then
					rsState = 19
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 19
			Case 19
				rsState = 22
				state1 = 1 - state1
				Continue
			Case 22
				rsState = 23
				Sub001(state1)
				Sleep(16)
				rsState = 47
				Continue
			Case 23
				rsState = 28
				If myindex = vInt3 Then
					Continue
				Else
					rsState = 25
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 25
			Case 25
				rsState = 28
				rsState = 29
				Continue
			Case 28
				rsState = 14
				Continue
			Case 29
				rsState = 40
				If myindex <> vInt3 Then
					Continue
				Else
					rsState = 31
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 31
			Case 31
				rsState = 32
				Continue
			Case 32
				rsState = 39
				If vBln1 Then
					rsState = 34
					Continue
				Else
					rsState = 36
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 34
			Case 34
				rsState = 39
				Sub001(1)
				Continue
			Case 36
				rsState = 39
				Sub001(0)
				Continue
			Case 39
				rsState = 40
				Continue
			Case 40
				rsState = 41
				Continue
			Case 41
				rsState = 46
				If vBln2 Then
					rsState = 43
					Continue
				Else
					rsState = 45
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 43
			Case 43
				rsState = 46
				xuiviewsutils.Sub005(vXv1, 1)
				Continue
			Case 45
				rsState = 46
				xuiviewsutils.Sub005(vXv1, 0.6)
				Continue
			Case 46
				rsState = -1
				Continue
			Case 47
				rsState = 23
				Continue
		End Select
	Loop
End Sub

