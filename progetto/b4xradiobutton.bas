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
	Public vInt2 As Int
	Public vXv2 As B4XView
	Public vBln1 As Boolean
	Public vBCBrush1 As BCBrush
	Public vInt3 As Int
	Public vObj2 As Object
	Public vBCBrush2 As BCBrush
	Public vBCBrush3 As BCBrush
	Public vBln2 As Boolean
	Public vBln3 As Boolean
	Public vInt4 As Int
	Public vXv3 As B4XView
	Public vXv4 As B4XView
	Public vFlt1 As Float
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	Dim vMax As Int = Max(DipToCurrent(5), d2)
	If vMax = vInt4 Then
		Return
	End If
	vInt4 = vMax
	Dim vDipToCurrent As Int = DipToCurrent(3)
	vBitmapCreator1._initialize(vMax - vDipToCurrent * 2, vMax - vDipToCurrent * 2)
	Dim xui As XUI = vXUI1
	vFlt1 = XUI.Scale
	vXv2.SetLayoutAnimated(0, vDipToCurrent, vDipToCurrent, vInt4 - vDipToCurrent * 2, vInt4 - vDipToCurrent * 2)
	vXv4.SetLayoutAnimated(0, 0, 0, d, d2)
	vXv3.SetLayoutAnimated(0, vInt4 + vDipToCurrent, 0, d - vInt4 - vDipToCurrent, d2)
	vBCBrush2 = vBitmapCreator1._createbrushfromcolor(vInt1)
	vBCBrush3 = vBitmapCreator1._createbrushfromcolor(vInt2)
	Dim xui2 As XUI = vXUI1
	vBCBrush1 = BitmapCreator.createbrushfromcolor(0)
	Dim z As Boolean = vBln1
	SetValueImpl(z, True)
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	Dim b4XViewWrapper As B4XView = vXv1
	Dim xui As XUI = vXUI1
	b4XViewWrapper.SetColorAndBorder(0, 0, 0, 0)
	Dim xui2 As XUI = vXUI1
	vXv4 = XUI.CreatePanel("pnl")
	Dim b4XViewWrapper2 As B4XView = vXv4
	Dim xui3 As XUI = vXUI1
	b4XViewWrapper2.Color = 0
	Dim imageViewWrapper As ImageView
	imageViewWrapper.Initialize("")
	vXv2 = imageViewWrapper
	vXv1.AddView(vXv2, 0, 0, 0, 0)
	vXv3 = labelWrapper
	vXv3.SetTextAlignment("CENTER", "LEFT")
	vXv1.AddView(vXv3, 0, 0, 0, 0)
	vXv1.AddView(vXv4, 0, 0, 0, 0)
	Dim xui4 As XUI = vXUI1
	vInt1 = XUI.PaintOrColorToColor(map.Get("OnColor"))
	Dim xui5 As XUI = vXUI1
	vInt2 = XUI.PaintOrColorToColor(map.Get("OffColor"))
	vBln3 = map.GetDefault("HapticFeedback", False)
	vBln2 = vXv1.Enabled
	Dim b4XViewWrapper3 As B4XView = vXv1
	b4XViewWrapper3.Enabled = True
	vBln1 = map.Get("Value")
	base_resize(vXv1.Width, vXv1.Height)
End Sub

Sub Sub001(f As Float)
	Dim b4XRect As B4XRect = vBitmapCreator1.targetrect
	Dim bcbrushVar As BCBrush = vBCBrush1
	BitmapCreator.drawrect2(b4XRect, bcbrushVar, True, 0)
	Dim vFloor As Float = Floor(vBitmapCreator1.mheight / 2)
	If f < 1 Then
		Dim bcbrushVar2 As BCBrush = vBCBrush3
		BitmapCreator.drawcircle2(vFloor, vFloor, vFloor, bcbrushVar2, True, 0)
	End If
	If f > 0 Then
		Dim bcbrushVar3 As BCBrush = vBCBrush2
		vBitmapCreator1._drawcircle2(vFloor, vFloor, vFloor * f, bcbrushVar3, True, 0)
	End If
	vBitmapCreator1._setbitmaptoimageview(vBitmapCreator1._getbitmap, vXv2)
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 As Boolean
	Return vBln1
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 As Boolean
	Return vBln2
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 As Object
	Return vXv3.Text
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
End Sub

Sub Pnl_Click
	If Not(vBln1) And vBln2 Then
		If vBln3 Then
			xuiviewsutils.Sub004(vXv1)
		End If
		Dim vNot As Boolean = Not(vBln1)
		SetValueImpl(vNot, False)
		If vBln1 Then
			Dim xui As XUI = vXUI1
			If XUI.SubExists(vObj1, vStr1 & "_Checked", 0) Then
				CallSubDelayed(vObj1, vStr1 & "_Checked")
			End If
		End If
	End If
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(z As Boolean)
	If z = vBln1 Then
		Return
	End If
	SetValueImpl(z, False)
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(z As Boolean)
	vBln2 = z
	Dim z2 As Boolean = vBln1
	SetValueImpl(z2, True)
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(obj As Object)
	xuiviewsutils.Sub007(vXv3, obj)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub SetValueImpl(b As Boolean, immediate As Boolean)
	Dim limit3 As Int
	Dim step3 As Int
	Dim i As Int
	Dim v As B4XView
	Dim rb As b4xradiobutton
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
				Continue
			Case 1
				rsState = 12
				Dim z As Boolean = b
				If Not(z) Then
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
				rsState = 11
				step3 = 1
				limit3 = vXv1.Parent.NumberOfViews - 1
				i = 0
				rsState = 59
				Continue
			Case 6
				rsState = 7
				'v = B4XView
				v = vXv1.Parent.GetView(i)
				Continue
			Case 7
				rsState = 10
				If v <> vXv1 And v.Tag Is b4xradiobutton Then
					rsState = 9
					Continue
				End If
				Continue
			Case 9
				rsState = 10
				rb = v.Tag
				Dim b4xradiobuttonVar As b4xradiobutton = rb
				b4xradiobuttonVar.setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(False)
				Continue
			Case 10
				rsState = 60
				Continue
			Case 11
				rsState = 12
				Continue
			Case 12
				rsState = 13
				vInt3 = vInt3 + 1
				Continue
			Case 13
				rsState = 53
				If immediate Then
					rsState = 15
					Continue
				Else
					rsState = 25
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 15
			Case 15
				rsState = 16
				Continue
			Case 16
				rsState = 23
				If vBln1 Then
					rsState = 18
					Continue
				Else
					rsState = 20
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 18
			Case 18
				rsState = 23
				Sub001(1)
				Continue
			Case 20
				rsState = 23
				Sub001(0)
				Continue
			Case 23
				rsState = 53
				Continue
			Case 25
				rsState = 26
				myindex = vInt3
				start = DateTime.Now
				duration = 200
				Continue
			Case 26
				rsState = 41
				If DateTime.Now >= start + duration Then
					Continue
				Else
					rsState = 28
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 28
			Case 28
				rsState = 29
				state1 = (DateTime.Now - start) / duration
				Continue
			Case 29
				rsState = 34
				Dim z2 As Boolean = vBln1
				If Not(z2) Then
					rsState = 31
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 31
			Case 31
				rsState = 34
				state1 = 1 - state1
				Continue
			Case 34
				rsState = 35
				Sub001(state1)
				Sleep(16)
				rsState = 61
				Continue
			Case 35
				rsState = 40
				If myindex = vInt3 Then
					Continue
				Else
					rsState = 37
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 37
			Case 37
				rsState = 40
				rsState = 41
				Continue
			Case 40
				rsState = 26
				Continue
			Case 41
				rsState = 52
				If myindex <> vInt3 Then
					Continue
				Else
					rsState = 43
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 43
			Case 43
				rsState = 44
				Continue
			Case 44
				rsState = 51
				If vBln1 Then
					rsState = 46
					Continue
				Else
					rsState = 48
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 46
			Case 46
				rsState = 51
				Sub001(1)
				Continue
			Case 48
				rsState = 51
				Sub001(0)
				Continue
			Case 51
				rsState = 52
				Continue
			Case 52
				rsState = 53
				Continue
			Case 53
				rsState = 58
				If vBln2 Then
					rsState = 55
					Continue
				Else
					rsState = 57
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 55
			Case 55
				rsState = 58
				xuiviewsutils.Sub005(vXv1, 1)
				Continue
			Case 57
				rsState = 58
				xuiviewsutils.Sub005(vXv1, 0.4)
				Continue
			Case 58
				rsState = -1
				Continue
			Case 59
				rsState = 11
				If (step3 > 0 And i <= limit3) Or (step3 < 0 And i >= limit3) Then
					rsState = 6
					Continue
				End If
				Continue
			Case 60
				rsState = 59
				i = i + 0 + step3
				Continue
			Case 61
				rsState = 35
				Continue
		End Select
	Loop
End Sub

