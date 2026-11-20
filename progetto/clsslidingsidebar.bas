B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vPnl1 As Panel
	Public vPnl2 As Panel
	Public vPnl3 As Panel
	Public vPnl4 As Panel
	Public vPnl5 As Panel
	Public vByt1 As Byte
	Public vByt2 As Byte
	Public vFlt1 As Float
	Public vByt3 As Byte
	Public vBln1 As Boolean
	Public vInt1 As Int
	Public vInt2 As Int
	Public vBln2 As Boolean
	Public vBln3 As Boolean
	Public vInt3 As Int
	Public vInt4 As Int
	Public vInt5 As Int
	Public vInt6 As Int
	Public vInt7 As Int
	Public vInt8 As Int
	Public vView1 As View
	Public vByt4 As Byte
	Public vStr1 As String
	Public vObj1 As Object
	Public from_open As Boolean
	Public from_close As Boolean
	Public open_anim As Boolean
	Public close_anim As Boolean
	Public vByt5 As Byte
	Public vByt6 As Byte
	Public vInt9 As Int
End Sub

Sub Sub001(concreteViewWrapper As View, i As Int, i2 As Int, i3 As Int, b As Byte)
	If concreteViewWrapper = Null Then
		Return
	End If
	vView1 = concreteViewWrapper
	Select vByt1
		Case 0
			vPnl5.AddView(concreteViewWrapper, vPnl1.Left, i, i2, i3)
		Case 1
			vPnl5.AddView(concreteViewWrapper, vPnl1.Left + vPnl1.Width - i2, i, i2, i3)
		Case 2
			vPnl5.AddView(concreteViewWrapper, i, vPnl1.Top, i2, i3)
		Case 3
			vPnl5.AddView(concreteViewWrapper, i, vPnl1.Top + vPnl1.Height - i3, i2, i3)
	End Select
	vByt4 = b
	Dim reflection As Reflector
	reflection.Target = concreteViewWrapper
	reflection.SetOnTouchListener("Gesture_onTouch")
End Sub

Sub Sub002(i As Int)
	Select vByt1
		Case 0
			If vByt2 > 0 Then
				vPnl2.Left = vInt5 + i
			End If
			If vByt2 < 2 Then
				vPnl1.Left = vInt7 + i
			End If
			If vByt2 = 2 Then
				If vView1.IsInitialized Then
					vView1.Left = vPnl2.Left + vPnl2.Width
				End If
				If vPnl3.IsInitialized Then
					vPnl3.Left = vPnl2.Left + vPnl2.Width - vPnl3.Width / 2
				End If
			Else
				If vView1.IsInitialized Then
					vView1.Left = vPnl1.Left
				End If
				If vPnl3.IsInitialized Then
					vPnl3.Left = vPnl1.Left - vPnl3.Width / 2
				End If
			End If
		Case 1
			If vByt2 > 0 Then
				vPnl2.Left = vInt5 + i
			End If
			If vByt2 < 2 Then
				vPnl1.Left = vInt7 + i
			End If
			If vByt2 = 2 Then
				If vView1.IsInitialized Then
					vView1.Left = vPnl2.Left - vView1.Width
				End If
				If vPnl3.IsInitialized Then
					vPnl3.Left = vPnl2.Left - vPnl3.Width / 2
				End If
			Else
				If vView1.IsInitialized Then
					vView1.Left = vPnl1.Left + vPnl1.Width - vView1.Width
				End If
				If vPnl3.IsInitialized Then
					vPnl3.Left = vPnl1.Left + vPnl1.Width - vPnl3.Width / 2
				End If
			End If
		Case 2
			If vByt2 > 0 Then
				vPnl2.Top = vInt6 + i
			End If
			If vByt2 < 2 Then
				vPnl1.Top = vInt8 + i
			End If
			If vByt2 = 2 Then
				If vView1.IsInitialized Then
					vView1.Top = vPnl2.Top + vPnl2.Height
				End If
				If vPnl3.IsInitialized Then
					vPnl3.Top = vPnl2.Top + vPnl2.Height - vPnl3.Height / 2
				End If
			Else
				If vView1.IsInitialized Then
					vView1.Top = vPnl1.Top
				End If
				If vPnl3.IsInitialized Then
					vPnl3.Top = vPnl1.Top - vPnl3.Height / 2
				End If
			End If
		Case 3
			If vByt2 > 0 Then
				vPnl2.Top = vInt6 + i
			End If
			If vByt2 < 2 Then
				vPnl1.Top = vInt8 + i
			End If
			If vByt2 = 2 Then
				If vView1.IsInitialized Then
					vView1.Top = vPnl2.Top - vView1.Height
				End If
				If vPnl3.IsInitialized Then
					vPnl3.Top = vPnl2.Top - vPnl3.Height / 2
				End If
			Else
				If vView1.IsInitialized Then
					vView1.Top = vPnl1.Top + vPnl1.Height - vView1.Height
				End If
				If vPnl3.IsInitialized Then
					vPnl3.Top = vPnl1.Top + vPnl1.Height - vPnl3.Height / 2
				End If
			End If
	End Select
	vBln2 = (Sub004(from_close) <> 0)
End Sub

Sub animatesidebar(z As Boolean)
	Dim vAbs As Int
	Dim i As Int
	If z Then
		Dim vTmp As Int = Sub004(from_close)
		vByt3 = vByt6
		vAbs = Abs(vTmp) / vPnl2.Width * vInt2
		i = vTmp
	Else
		Dim vTmp_ As Int = Sub004(from_open)
		vByt3 = vByt5
		vAbs = Abs(vTmp_) / vPnl2.Width * vInt1
		i = vTmp_
	End If
	If i = 0 Then
		vByt3 = 0
		Sub015()
		Return
	End If
	vInt5 = vPnl2.Left
	vInt6 = vPnl2.Top
	vInt7 = vPnl1.Left
	vInt8 = vPnl1.Top
	vBln1 = False
	Dim j As Long = 0
	Dim vTmp__ As Long = mod1.Sub058 + vAbs
	Do While True
		If mod1.Sub058 >= vTmp__ Then
			Exit
		End If
		j = vTmp__ - mod1.Sub058
		Sub002(Power(1 - j / vAbs, vFlt1) * i)
		If SubExists(vObj1, vStr1) Then
			Dim obj As Object = vObj1
			Dim str As String = vStr1
			CallSub2(obj, str, Not(z))
		End If
		DoEvents
		If vBln1 Then
			j = 0
			Exit
		End If
	Loop
	If j <> 0 Then
		Sub002(i)
	End If
	vByt3 = 0
	Sub015()
End Sub

Sub Block_Touch(i As Int, f As Float, f2 As Float)
End Sub

Sub Sub003
	If Sub010() Then
		If vByt3 = vByt6 Then
			Sub011()
			Return
		End If
		Sub005()
		Return
	End If
	Sub011()
End Sub

Sub Sub004(z As Boolean) As Int
	Select vByt1
		Case 0
			If vByt2 = 2 Then
				If z Then
					Return -vPnl2.Left
				End If
				Return Me - vPnl2.Width
			End If
			If z Then
				Return vPnl2.Width - vPnl1.Left
			End If
			Return -vPnl1.Left
		Case 1
			If vByt2 = 2 Then
				If z Then
					Return Me + vPnl1.Width - vPnl2.Width
				End If
				Return Me + vPnl1.Width
			End If
			If z Then
				Return Me - vPnl1.Left
			End If
			Return -vPnl1.Left
		Case 2
			If vByt2 = 2 Then
				If z Then
					Return -vPnl2.Top
				End If
				Return Me - vPnl2.Height
			End If
			If z Then
				Return vPnl2.Height - vPnl1.Top
			End If
			Return -vPnl1.Top
		Case 3
			If vByt2 = 2 Then
				If z Then
					Return Me + vPnl1.Height - vPnl2.Height
				End If
				Return Me + vPnl1.Height
			End If
			If z Then
				Return Me - vPnl1.Top
			End If
			Return -vPnl1.Top
		Case Else
			If vByt2 = 2 Then
				If z Then
					Return -vPnl2.Top
				End If
				Return Me - vPnl2.Height
			End If
			If z Then
				Return vPnl2.Height - vPnl1.Top
			End If
			Return -vPnl1.Top
	End Select
End Sub

Sub Closep_Touch(i As Int, f As Float, f2 As Float)
	Sub005()
	Dim panelWrapper As Panel = vPnl4
	panelWrapper.Visible = False
End Sub

Sub Sub005
	If vByt3 = vByt5 Then
		vBln1 = True
		CallSubDelayed2(Me, "AnimateSidebar", close_anim)
		Return
	End If
	If vByt3 = 0 Then
		animatesidebar(close_anim)
		Return
	End If
End Sub

Sub Sub006 As Panel
	Return vPnl1
End Sub

Sub Sub007(z As Boolean, i As Int, b As Byte)
	If Not(z) Then
		If vPnl3.IsInitialized Then
			vPnl3.RemoveView
		End If
		Dim panelWrapper As Panel
		vPnl3 = Null
		Return
	End If
	If vPnl3.IsInitialized Then
		Select vByt1
			Case 0
				vPnl3.SetLayout(vPnl1.Left - i / 2, 0, i, Sub008())
			Case 1
				vPnl3.SetLayout(vPnl1.Left + vPnl1.Width - i / 2, 0, i, Sub008())
			Case 2
				vPnl3.SetLayout(0, vPnl1.Top - i / 2, Sub009(), i)
			Case 3
				vPnl3.SetLayout(0, vPnl1.Top + vPnl1.Height - i / 2, Sub009(), i)
		End Select
	Else
		vPnl3.Initialize("")
		Select vByt1
			Case 0
				vPnl5.AddView(vPnl3, vPnl1.Left - i / 2, vInt9, i, Sub008() - vInt9)
			Case 1
				vPnl5.AddView(vPnl3, vPnl1.Left + vPnl1.Width - i / 2, 0, i, Sub008())
			Case 2
				vPnl5.AddView(vPnl3, 0, vPnl1.Top - i / 2, Sub009(), i)
			Case 3
				vPnl5.AddView(vPnl3, 0, vPnl1.Top + vPnl1.Height - i / 2, Sub009(), i)
		End Select
		Dim reflection As Reflector
		reflection.Target = vPnl3
		reflection.SetOnTouchListener("Gesture_onTouch")
	End If
	vByt4 = b
End Sub

Sub gesture_ontouch(obj As Object, i As Int, f As Float, f2 As Float, obj2 As Object) As Boolean
	If i = 0 Then
		vBln1 = True
		vInt3 = f
		vInt4 = f2
		Dim panelWrapper As Panel = vPnl4
		panelWrapper.Visible = True
		mod1.Sub161(vPnl4, 8)
		mod1.Sub161(vPnl2, 9)
		mod1.Sub161(vPnl1, 0)
	Else If i = 2 Then
		Select vByt1
			Case 0
				If vByt2 = 2 Then
					Dim left As Int = vPnl2.Left
					Dim panelWrapper2 As Panel = vPnl2
					Dim d As Double = -vPnl2.Width
					panelWrapper2.Left = Max(d, Min(vPnl2.Left + f - vInt3, 0))
					If vView1.IsInitialized Then
						vView1.Left = vView1.Left - left + vPnl2.Left
					End If
					If vPnl3.IsInitialized Then
						vPnl3.Left = vPnl3.Left - left + vPnl2.Left
					End If
				Else
					Dim left2 As Int = vPnl1.Left
					Dim panelWrapper3 As Panel = vPnl1
					panelWrapper3.Left = Max(0, Min(vPnl1.Left + f - vInt3, vPnl2.Width))
					If vByt2 = 1 Then
						vPnl2.Left = vPnl1.Left - vPnl2.Width
					End If
					If vView1.IsInitialized Then
						vView1.Left = vView1.Left - left2 + vPnl1.Left
					End If
					If vPnl3.IsInitialized Then
						vPnl3.Left = vPnl3.Left - left2 + vPnl1.Left
					End If
				End If
				vBln3 = (f > vInt3)
			Case 1
				If vByt2 = 2 Then
					Dim left3 As Int = vPnl2.Left
					Dim panelWrapper4 As Panel = vPnl2
					Dim width As Double = vPnl1.Width - vPnl2.Width
					panelWrapper4.Left = Max(width, Min(vPnl2.Left + f - vInt3, vPnl1.Width))
					If vView1.IsInitialized Then
						vView1.Left = vView1.Left - left3 + vPnl2.Left
					End If
					If vPnl3.IsInitialized Then
						vPnl3.Left = vPnl3.Left - left3 + vPnl2.Left
					End If
				Else
					Dim left4 As Int = vPnl1.Left
					Dim panelWrapper5 As Panel = vPnl1
					Dim d2 As Double = -vPnl2.Width
					panelWrapper5.Left = Max(d2, Min(vPnl1.Left + f - vInt3, 0))
					If vByt2 = 1 Then
						vPnl2.Left = vPnl1.Left + vPnl1.Width
					End If
					If vView1.IsInitialized Then
						vView1.Left = vView1.Left - left4 + vPnl1.Left
					End If
					If vPnl3.IsInitialized Then
						vPnl3.Left = vPnl3.Left - left4 + vPnl1.Left
					End If
				End If
				vBln3 = (f < vInt3)
			Case 2
				If vByt2 = 2 Then
					Dim top As Int = vPnl2.Top
					Dim panelWrapper6 As Panel = vPnl2
					Dim d3 As Double = -vPnl2.Height
					panelWrapper6.Top = Max(d3, Min(vPnl2.Top + f2 - vInt4, 0))
					If vView1.IsInitialized Then
						vView1.Top = vView1.Top - top + vPnl2.Top
					End If
					If vPnl3.IsInitialized Then
						vPnl3.Top = vPnl3.Top - top + vPnl2.Top
					End If
				Else
					Dim top2 As Int = vPnl1.Top
					Dim panelWrapper7 As Panel = vPnl1
					panelWrapper7.Top = Max(0, Min(vPnl1.Top + f2 - vInt4, vPnl2.Height))
					If vByt2 = 1 Then
						vPnl2.Top = vPnl1.Top - vPnl2.Height
					End If
					If vView1.IsInitialized Then
						vView1.Top = vView1.Top - top2 + vPnl1.Top
					End If
					If vPnl3.IsInitialized Then
						vPnl3.Top = vPnl3.Top - top2 + vPnl1.Top
					End If
				End If
				vBln3 = (f2 > vInt4)
			Case 3
				If vByt2 = 2 Then
					Dim top3 As Int = vPnl2.Top
					Dim panelWrapper8 As Panel = vPnl2
					Dim height As Double = vPnl1.Height - vPnl2.Height
					panelWrapper8.Top = Max(height, Min(vPnl2.Top + f2 - vInt4, vPnl1.Height))
					If vView1.IsInitialized Then
						vView1.Top = vView1.Top - top3 + vPnl2.Top
					End If
					If vPnl3.IsInitialized Then
						vPnl3.Top = vPnl3.Top - top3 + vPnl2.Top
					End If
				Else
					Dim top4 As Int = vPnl1.Top
					Dim panelWrapper9 As Panel = vPnl1
					Dim d4 As Double = -vPnl2.Height
					panelWrapper9.Top = Max(d4, Min(vPnl1.Top + f2 - vInt4, 0))
					If vByt2 = 1 Then
						vPnl2.Top = vPnl1.Top + vPnl1.Height
					End If
					If vView1.IsInitialized Then
						vView1.Top = vView1.Top - top4 + vPnl1.Top
					End If
					If vPnl3.IsInitialized Then
						vPnl3.Top = vPnl3.Top - top4 + vPnl1.Top
					End If
				End If
				vBln3 = (f2 < vInt4)
		End Select
		vBln2 = (Sub004(from_close) <> 0)
		If SubExists(vObj1, vStr1) Then
			If vBln3 Then
				Dim obj3 As Object = vObj1
				Dim str As String = vStr1
				CallSub2(obj3, str, True)
			Else
				Dim obj4 As Object = vObj1
				Dim str2 As String = vStr1
				CallSub2(obj4, str2, False)
			End If
		End If
	Else If i = 1 Then
		If vByt4 > 0 And vBln2 Then
			If vByt4 = 2 Then
				Dim vAbs As Int = Abs(Sub004(from_close))
				vBln3 = (vAbs >= Abs(Sub004(from_open)))
			End If
			If vBln3 Then
				CallSubDelayed2(Me, "AnimateSidebar", open_anim)
			Else
				CallSubDelayed2(Me, "AnimateSidebar", close_anim)
			End If
		Else
			Sub015()
		End If
	End If
	Return True
End Sub

Sub Sub008 As Int
	If vPnl5.Height >= 0 Then
		Return vPnl5.Height
	End If
	Dim reflection As Reflector
	reflection.Target = vPnl5
	Dim vObjectToNumber As Int = reflection.RunMethod("getHeight")
	If vObjectToNumber = 0 Then
		DoEvents
		Return reflection.RunMethod("getHeight")
	End If
	Return vObjectToNumber
End Sub

Sub Sub009 As Int
	If vPnl5.Width >= 0 Then
		Return vPnl5.Width
	End If
	Dim reflection As Reflector
	reflection.Target = vPnl5
	Dim vObjectToNumber As Int = reflection.RunMethod("getWidth")
	If vObjectToNumber = 0 Then
		DoEvents
		Return reflection.RunMethod("getWidth")
	End If
	Return vObjectToNumber
End Sub

Sub Initialize(panelWrapper As Panel, i As Int, b As Byte, b2 As Byte, i2 As Int, i3 As Int, i4 As Int)
	vPnl5 = panelWrapper
	vPnl1.Initialize("")
	vInt9 = i4
	panelWrapper.AddView(vPnl1, 0, 0, Sub009(), Sub008())
	vPnl2.Initialize("Block")
	vPnl4.Initialize("CloseP")
	Select b
		Case 0
			If b2 = 0 Then
				panelWrapper.AddView(vPnl2, 0, vInt9, i, Sub008() - vInt9)
			Else
				panelWrapper.AddView(vPnl2, -i, vInt9, i, Sub008() - vInt9)
				Dim view As View = vPnl4
				Dim i5 As Int = vInt9
				Dim vPerXToCurrent As Int = PerXToCurrent(100)
				panelWrapper.AddView(view, 0, i5, vPerXToCurrent, PerYToCurrent(100) - vInt9)
				Dim panelWrapper2 As Panel = vPnl4
				panelWrapper2.Color = Colors.ARGB(180, 20, 20, 20)
				Dim panelWrapper3 As Panel = vPnl4
				panelWrapper3.Visible = False
				mod1.Sub161(vPnl2, 0)
			End If
		Case 1
			If b2 = 0 Then
				panelWrapper.AddView(vPnl2, Sub009() - i, 0, i, Sub008())
			Else
				panelWrapper.AddView(vPnl2, Sub009(), 0, i, Sub008())
			End If
		Case 2
			If b2 = 0 Then
				panelWrapper.AddView(vPnl2, 0, 0, Sub009(), i)
			Else
				panelWrapper.AddView(vPnl2, 0, -i, Sub009(), i)
			End If
		Case 3
			If b2 = 0 Then
				panelWrapper.AddView(vPnl2, 0, Sub008() - i, Sub009(), i)
			Else
				panelWrapper.AddView(vPnl2, 0, Sub008(), Sub009(), i)
			End If
	End Select
	If b2 = 0 Then
		mod1.Sub161(vPnl2, 0)
	End If
	vByt1 = b
	vByt2 = b2
	vFlt1 = 0.7
	vInt1 = i2
	vInt2 = i3
	vBln2 = False
End Sub

Sub Sub010 As Boolean
	Return vBln2
End Sub

Sub Sub011
	If vByt3 = vByt6 Then
		vBln1 = True
		CallSubDelayed2(Me, "AnimateSidebar", open_anim)
		Return
	End If
	If vByt3 = 0 Then
		mod1.Sub161(vPnl4, 8)
		mod1.Sub161(vPnl2, 9)
		mod1.Sub161(vPnl1, 0)
		animatesidebar(open_anim)
		Return
	End If
End Sub

Sub Sub012(f As Float)
	vFlt1 = f
End Sub

Sub Sub013(obj As Object, str As String, str2 As String, str3 As String)
	vObj1 = obj
	vStr1 = str3
End Sub

Sub Sub014 As Panel
	Return vPnl2
End Sub

Sub Sub015
	If Sub004(from_open) = 0 Then
		Dim panelWrapper As Panel = vPnl4
		panelWrapper.Visible = True
		mod1.Sub161(vPnl2, 9)
		mod1.Sub161(vPnl2.GetView(0), 10)
		Return
	End If
	If Sub004(from_close) <= 0 Then
		Dim panelWrapper2 As Panel = vPnl4
		panelWrapper2.Visible = False
		If vPnl3.IsInitialized Then
			mod1.Sub161(vPnl3, 0)
		End If
		mod1.Sub161(vPnl1, 0)
		mod1.Sub161(vPnl2, 0)
		mod1.Sub161(vPnl4, 0)
		Return
	End If
End Sub

