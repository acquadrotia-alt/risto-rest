B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vPhone1 As Phone
	Public vTmr1 As Timer
	Public vRSTweenArr1() As RSTween
	Public vRSTweenManager1 As RSTweenManager
	Public vRSTweenConstants1 As RSTweenConstants
	Public vRSTweenCallback1 As RSTweenCallback
	Public vPnl1 As Panel
	Public vScrollView1 As ScrollView
	Public vLbl1 As Label
	Public vBtn1 As Button
	Public vListViewArr1() As ListView
	Public vObj1 As Object
	Public vStr1 As String
	Public vStr2 As String
	Public vInt1 As Int
	Public vInt2 As Int
	Public vInt3 As Int
	Public vInt4 As Int
	Public vInt5 As Int
	Public vLv1 As ListView
	Public vBln1 As Boolean
	Public vBln2 As Boolean
	Public vStr3 As String
	Public vBln3 As Boolean
	Public vBln4 As Boolean
	Public vBln5 As Boolean
	Public vFlt1 As Float
	Public vBln6 As Boolean
	Public vInt6 As Int
End Sub

Sub Sub001(bitmapWrapper As Bitmap, str As String, i As Int, i2 As Int, i3 As Int)
	Dim vDipToCurrent As Int
	If vBln3 Then
		If Not(vBln5) Then
			Return
		End If
	End If
	vListViewArr1(i3).Initialize("MenuItem")
	If i = Colors.RGB(153, 153, 153) Then
		Dim listViewWrapper As ListView = vListViewArr1(i3)
		listViewWrapper.Enabled = False
	Else
		If Not(vBln2 And str <> "") Then
			If i2 <> -16776961 Then
				If i2 <> -16777216 Then
					i = -16777216
				End If
			End If
		End If
	End If
	Dim listViewWrapper2 As ListView = vListViewArr1(i3)
	listViewWrapper2.ScrollingBackgroundColor = 0
	Dim labelWrapper As Label = vListViewArr1(i3).TwoLinesAndBitmap.SecondLabel
	labelWrapper.Visible = False
	Dim twoLinesAndBitmap As TwoLinesAndBitmapLayout = vListViewArr1(i3).TwoLinesAndBitmap
	twoLinesAndBitmap.ItemHeight = DipToCurrent(55)
	vListViewArr1(i3).TwoLinesAndBitmap.Label.TextColor = i
	Dim labelWrapper2 As Label = vListViewArr1(i3).TwoLinesAndBitmap.Label
	labelWrapper2.Gravity = 16
	vListViewArr1(i3).TwoLinesAndBitmap.Label.Height = vListViewArr1(i3).TwoLinesAndBitmap.ItemHeight
	vListViewArr1(i3).TwoLinesAndBitmap.Label.TextSize = 15
	Dim labelWrapper3 As Label = vListViewArr1(i3).TwoLinesAndBitmap.Label
	labelWrapper3.Top = DipToCurrent(0)
	If vBln2 And str <> "" Then
		If i2 <= 0 Or i2 > 14 Then
			i2 = 14
		End If
		If Main.v_temag = 0 Then
			mod1.Sub172(vListViewArr1(i3).TwoLinesAndBitmap.Label, "btn" & i2)
		Else
			Dim concreteViewWrapper As View = vListViewArr1(i3).TwoLinesAndBitmap.Label
			mod1.Sub172(concreteViewWrapper, "btn" & Main.v_temag & "_" & i2)
		End If
	End If
	If bitmapWrapper.IsInitialized Then
		Dim labelWrapper4 As Label = vListViewArr1(i3).TwoLinesAndBitmap.Label
		labelWrapper4.Left = DipToCurrent(65)
		vListViewArr1(i3).AddTwoLinesAndBitmap(str, "", bitmapWrapper)
	Else
		Dim labelWrapper5 As Label = vListViewArr1(i3).TwoLinesAndBitmap.Label
		labelWrapper5.Left = DipToCurrent(10)
		Dim listViewWrapper3 As ListView = vListViewArr1(i3)
		Dim vObjectToCharSequence As Object = str
		Dim vObjectToCharSequence2 As Object = ""
		listViewWrapper3.AddTwoLinesAndBitmap(vObjectToCharSequence, vObjectToCharSequence2, Null)
	End If
	Dim imageViewWrapper As ImageView = vListViewArr1(i3).TwoLinesAndBitmap.ImageView
	Dim vDipToCurrent2 As Int = DipToCurrent(9)
	Dim vDipToCurrent3 As Int = DipToCurrent(9)
	Dim vDipToCurrent4 As Int = DipToCurrent(48)
	imageViewWrapper.SetLayout(vDipToCurrent2, vDipToCurrent3, vDipToCurrent4, DipToCurrent(48))
	If vBln2 And str = "" Then
		Dim i4 As Int = IIf(i3 > 17, i3 - 17, i3)
		If Main.v_temag = 0 Then
			mod1.Sub172(vListViewArr1(i3), "btn" & i4)
		Else
			Dim concreteViewWrapper2 As View = vListViewArr1(i3)
			mod1.Sub172(concreteViewWrapper2, "btn" & Main.v_temag & "_" & i4)
		End If
	Else
		If Not(vBln2 And str <> "") Then
			vListViewArr1(i3).Color = i2
		End If
	End If
	If vBln6 Then
		vListViewArr1(i3).Tag = -1000
	Else
		vListViewArr1(i3).Tag = i3
	End If
	If Main.v_tastiera <> 0 Then
		If Main.v_tastiera <> 2 Then
			Dim i5 As Int = vInt1
			If i5 >= PerXToCurrent(50) Then
				If vBln4 Then
					vListViewArr1(i3).TwoLinesAndBitmap.Label.Width = vInt1 / 3 - vListViewArr1(i3).TwoLinesAndBitmap.ImageView.Width - DipToCurrent(15)
					Dim vDipToCurrent5 As Int = (i3 - 1) / 3 * DipToCurrent(55) - vInt5
					Dim vDipToCurrent6 As Int = vDipToCurrent5 + DipToCurrent(75)
					Dim i6 As Int = 0
					If (i3 - 1) Mod 3 = 0 Then
						i6 = DipToCurrent(0)
						Dim panel As Panel = vScrollView1.Panel
						panel.Height = i3 / 2 * DipToCurrent(55) + vInt4 + DipToCurrent(155)
					Else If (i3 - 1) Mod 3 = 1 Then
						i6 = PerXToCurrent(33)
					Else If (i3 - 1) Mod 3 = 2 Then
						i6 = PerXToCurrent(66)
					End If
					Dim panel2 As Panel = vScrollView1.Panel
					Dim view As View = vListViewArr1(i3)
					Dim vPerXToCurrent As Int = PerXToCurrent(33)
					panel2.AddView(view, i6, vDipToCurrent6, vPerXToCurrent, DipToCurrent(56))
				Else
					Dim vDipToCurrent7 As Int = (i3 - 1) / 2 * DipToCurrent(55) - vInt5
					Dim vDipToCurrent8 As Int = vDipToCurrent7 + DipToCurrent(75)
					If Not(i3 Mod 2 <> 0) Then
						vDipToCurrent = PerXToCurrent(35)
					Else
						vDipToCurrent = DipToCurrent(0)
						Dim panel3 As Panel = vScrollView1.Panel
						panel3.Height = i3 / 2 * DipToCurrent(55) + vInt4 + DipToCurrent(155)
					End If
					Dim panel4 As Panel = vScrollView1.Panel
					Dim view2 As View = vListViewArr1(i3)
					Dim vPerXToCurrent2 As Int = PerXToCurrent(35)
					panel4.AddView(view2, vDipToCurrent, vDipToCurrent8, vPerXToCurrent2, DipToCurrent(56))
				End If
				vInt3 = vInt3 + 1
				Return
			End If
		End If
	End If
	If i3 = 0 Then
		vInt6 = 0
	End If
	Dim panel5 As Panel = vScrollView1.Panel
	Dim view3 As View = vListViewArr1(i3)
	Dim vDipToCurrent9 As Int = DipToCurrent(0)
	Dim i7 As Int = vInt6
	Dim vPerXToCurrent3 As Int = PerXToCurrent(100)
	panel5.AddView(view3, vDipToCurrent9, i7, vPerXToCurrent3, DipToCurrent(55))
	Dim panel6 As Panel = vScrollView1.Panel
	Dim vDipToCurrent10 As Int = DipToCurrent(56) * i3 + vInt4
	panel6.Height = vDipToCurrent10 + DipToCurrent(56)
	Dim i8 As Int = vInt6
	vInt6 = i8 + DipToCurrent(55)
	vInt3 = vInt3 + 1
End Sub

Sub Sub002(str As String, i As Int, obj As Object, d As Double, i2 As Int, i3 As Int, obj2 As Object, f As Float, f2 As Float)
	vRSTweenArr1(i).Initialize("Tween")
	Dim f3 As Float = f * 10
	Dim f4 As Float = f2 * 10
	Select str
		Case "Panel", "HorizontalScrollView", "ListView", "ScrollView", "Spinner", "TabHost", "WebView"
			vRSTweenArr1(i).registerPanelAccessor
			vRSTweenArr1(i).PanelTo(obj, d, f3)
		Case "ImageView"
			vRSTweenArr1(i).registerImageAccessor
			vRSTweenArr1(i).ImageTo(obj, d, f3)
		Case "Label", "Button", "AutoCompleteEditText", "CheckBox", "EditText", "RadioButton", "ToggleButton"
			vRSTweenArr1(i).registerLabelAccessor
			vRSTweenArr1(i).LabelTo(obj, d, f3)
	End Select
	vRSTweenArr1(i).setTarget(i2, i3)
	vRSTweenArr1(i).Ease(obj2)
	vRSTweenArr1(i).Delay = f4
	vRSTweenManager1.addTween(vRSTweenArr1(i).Tween)
End Sub

Sub Sub003(i As Int, i2 As Int, z As Boolean)
	If z Then
		Dim object As Object = vScrollView1
		Dim rSTweenConstants As RSTweenConstants = vRSTweenConstants1
		Dim rSTweenConstants2 As RSTweenConstants = vRSTweenConstants1
		Sub002("Panel", 1, object, 3, i, i2, RSTweenConstants.BACK_INOUT, 0.2, 0)
		Return
	End If
	Dim object2 As Object = vScrollView1
	Dim rSTweenConstants3 As RSTweenConstants = vRSTweenConstants1
	Dim rSTweenConstants4 As RSTweenConstants = vRSTweenConstants1
	Sub002("Panel", 1, object2, 3, i, i2, RSTweenConstants.BACK_INOUT, 0, 0)
End Sub

Sub Sub004(i As Int, i2 As Int)
	Dim i3 As Int = vInt3 - 1
	Dim z As Boolean = True
	Dim i4 As Int
	For i4 = 1 To i3
		If z Then
			vListViewArr1(i4).Left = -vListViewArr1(i4).Width
			z = False
		Else
			vListViewArr1(i4).Left = vScrollView1.Width
			z = True
		End If
	Next
	Dim object As Object = vScrollView1
	Dim rSTweenConstants As RSTweenConstants = vRSTweenConstants1
	Dim rSTweenConstants2 As RSTweenConstants = vRSTweenConstants1
	Sub002("Panel", 2, object, 3, i, i2, RSTweenConstants.BACK_INOUT, 0.1, 0)
	Dim i5 As Int = vInt3 - 1
	Dim i6 As Int
	For i6 = 1 To i5
		Dim object2 As Object = vListViewArr1(i6)
		Dim rSTweenConstants3 As RSTweenConstants = vRSTweenConstants1
		Dim top As Int = vListViewArr1(i6).Top
		Dim rSTweenConstants4 As RSTweenConstants = vRSTweenConstants1
		Sub002("ListView", 1, object2, 3, 0, top, RSTweenConstants.LINEAR_INOUT, 0.2, i6 / 22)
	Next
End Sub

Sub Bback_Click
	If mod1.vStr1 = "Main" Then
		If CallSub(Main, "CheckMenuOpen") Then
			Dim vObjectToCharSequence As Object = vStr3
			ToastMessageShow(vObjectToCharSequence, False)
			Return
		End If
	End If
	Sub005(False, False)
End Sub

Sub Sub005(z As Boolean, z2 As Boolean)
	vBln3 = z
	vBln5 = z2
	If vBln3 Then
		If vBln5 Then
			Dim numberOfViews As Int
			For numberOfViews = vScrollView1.Panel.NumberOfViews - 1 To 0 Step -1
				If vScrollView1.Panel.GetView(numberOfViews) Is SimpleListView Then
					vScrollView1.Panel.RemoveViewAt(numberOfViews)
				End If
			Next
		End If
		Dim panelWrapper As Panel = vPnl1
		panelWrapper.Visible = False
		Return
	End If
	vBln1 = False
	Dim phone As Phone = vPhone1
	If Phone.SdkVersion < 11 Then
		Dim panelWrapper2 As Panel = vPnl1
		panelWrapper2.Visible = False
		Dim scrollViewWrapper As ScrollView = vScrollView1
		scrollViewWrapper.Visible = False
		Return
	End If
	Dim panelWrapper3 As Panel = vPnl1
	panelWrapper3.Visible = False
	Sub007("Panel", 2, vScrollView1)
	If vStr2 = "R" Then
		Dim object As Object = vScrollView1
		Dim rSTweenConstants As RSTweenConstants = vRSTweenConstants1
		Dim vPerXToCurrent As Int = PerXToCurrent(100)
		Dim top As Int = vScrollView1.Top
		Dim rSTweenConstants2 As RSTweenConstants = vRSTweenConstants1
		Sub002("Panel", 1, object, 3, vPerXToCurrent, top, RSTweenConstants.BACK_INOUT, 0.6, 0)
	Else
		Dim object2 As Object = vScrollView1
		Dim rSTweenConstants3 As RSTweenConstants = vRSTweenConstants1
		Dim i As Int = -vScrollView1.Width
		Dim top2 As Int = vScrollView1.Top
		Dim rSTweenConstants4 As RSTweenConstants = vRSTweenConstants1
		Sub002("Panel", 1, object2, 3, i, top2, RSTweenConstants.BACK_INOUT, 0.6, 0)
	End If
	vTmr1.Initialize("TweenUpdate", 10)
	Dim timer As Timer = vTmr1
	timer.Enabled = True
	vRSTweenCallback1.Initialize("TweenCallback")
	Dim rSTweenCallback As RSTweenCallback = vRSTweenCallback1
	rSTweenCallback.Listener = True
	vRSTweenArr1(1).Callback = vRSTweenCallback1.TweenCallback
	vRSTweenManager1.StartTween
End Sub

Sub Fakepanel_Touch(i As Int, f As Float, f2 As Float)
	If i = 0 Then
		Dim vObjectToCharSequence As Object = vStr3
		ToastMessageShow(vObjectToCharSequence, False)
		Return
	End If
End Sub

Sub Initialize(activityWrapper As Activity, obj As Object, str As String, str2 As String, str3 As String, i As Int, i2 As Int, i3 As Int, bitmapWrapper As Bitmap, f As Float)
	vObj1 = obj
	vStr1 = str2
	vStr2 = str3.ToUpperCase.Trim
	vInt1 = i2
	vInt2 = i
	vFlt1 = f
	vRSTweenManager1.Initialize
	vPnl1.Initialize("FakePanel")
	Dim scrollViewWrapper As ScrollView = vScrollView1
	scrollViewWrapper.Initialize(PerYToCurrent(100) - i)
	vScrollView1.Color = i3
	mod1.Sub161(vScrollView1, 6)
	vLbl1.Initialize("")
	If bitmapWrapper.IsInitialized Then
		vScrollView1.SetBackgroundImageNew(bitmapWrapper)
	Else
		Dim scrollViewWrapper2 As ScrollView = vScrollView1
		scrollViewWrapper2.Color = Colors.RGB(245, 245, 245)
	End If
	Dim view As View = vPnl1
	Dim vDipToCurrent As Int = DipToCurrent(0)
	Dim vPerXToCurrent As Int = PerXToCurrent(100)
	activityWrapper.AddView(view, vDipToCurrent, i, vPerXToCurrent, PerYToCurrent(100) - i)
	Dim view2 As View = vScrollView1
	Dim vDipToCurrent2 As Int = DipToCurrent(0)
	Dim vDipToCurrent3 As Int = DipToCurrent(0)
	Dim vDipToCurrent4 As Int = DipToCurrent(0)
	activityWrapper.AddView(view2, vDipToCurrent2, vDipToCurrent3, vDipToCurrent4, DipToCurrent(0))
	If str.Trim <> "" Or str.Trim = "*" Then
		Dim panel As Panel = vScrollView1.Panel
		Dim view3 As View = vLbl1
		Dim vDipToCurrent5 As Int = DipToCurrent(0)
		Dim vDipToCurrent6 As Int = DipToCurrent(0)
		Dim width As Int = vScrollView1.Panel.Width
		panel.AddView(view3, vDipToCurrent5, vDipToCurrent6, width, DipToCurrent(64))
		vBtn1.Initialize("bBack")
		Dim buttonWrapper As Button = vBtn1
		buttonWrapper.SetBackgroundImageNew(LoadBitmap(File.DirAssets, "BackWhite.png"))
		Dim panel2 As Panel = vScrollView1.Panel
		Dim view4 As View = vBtn1
		Dim vDipToCurrent7 As Int = DipToCurrent(0)
		Dim vDipToCurrent8 As Int = DipToCurrent(10)
		Dim vDipToCurrent9 As Int = DipToCurrent(50)
		panel2.AddView(view4, vDipToCurrent7, vDipToCurrent8, vDipToCurrent9, DipToCurrent(50))
		If str.Trim <> "*" Then
			vLbl1.Text = " " & str.Trim & " "
		End If
		Dim labelWrapper As Label = vLbl1
		labelWrapper.Color = -1
		vLbl1.TextSize = 30
		Dim labelWrapper2 As Label = vLbl1
		labelWrapper2.Gravity = 1
		vInt4 = DipToCurrent(41)
		vInt5 = DipToCurrent(11)
	Else
		vInt4 = DipToCurrent(0)
		vInt5 = DipToCurrent(55)
	End If
	vScrollView1.Panel.Color = i3
	Dim panelWrapper As Panel = vPnl1
	panelWrapper.Visible = False
End Sub

Sub Menuitem_ItemClick(i As Int, obj As Object)
	Dim listViewWrapper As ListView
	Dim listViewWrapper2 As ListView = Sender
	Try
		If listViewWrapper2.Tag < 0 Then
			Return
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	listViewWrapper2.Background = mod1.Sub155(Colors.ARGB(255, 201, 156, 201), 25)
	vLv1 = listViewWrapper2
	If SubExists(vObj1, vStr1 & "_Click") Then
		CallSubDelayed2(vObj1, vStr1 & "_Click", listViewWrapper2.Tag)
	End If
End Sub

Sub Sub006(str As String, z As Boolean)
	Dim vDipToCurrent As Int
	Dim vPerYToCurrent As Int
	vInt6 = DipToCurrent(64)
	If Not(z) And str = "ZigZag" Then
		str = "Default"
	End If
	If vBln3 Then
		vBln3 = False
		Dim listViewWrapper As ListView = vLv1
		listViewWrapper.Color = 0
		vBln5 = False
		vBln1 = True
		Return
	End If
	vBln1 = True
	mod1.vBln5 = True
	vScrollView1.ScrollPosition = 0
	Dim scrollViewWrapper As ScrollView = vScrollView1
	scrollViewWrapper.Visible = True
	Dim panelWrapper As Panel = vPnl1
	panelWrapper.Visible = True
	Select vStr2
		Case "L"
			Dim scrollViewWrapper2 As ScrollView = vScrollView1
			Dim i As Int = -vInt1
			Dim i2 As Int = vInt2
			Dim i3 As Int = vInt1
			scrollViewWrapper2.SetLayout(i, i2, i3, PerYToCurrent(100) - vInt2)
			vDipToCurrent = DipToCurrent(0)
			vPerYToCurrent = vInt2
		Case "R"
			Dim scrollViewWrapper3 As ScrollView = vScrollView1
			Dim vPerXToCurrent As Int = PerXToCurrent(100) + vInt1
			Dim i4 As Int = vInt2
			Dim i5 As Int = vInt1
			scrollViewWrapper3.SetLayout(vPerXToCurrent, i4, i5, PerYToCurrent(100) - vInt2)
			vDipToCurrent = PerXToCurrent(100) - vInt1
			vPerYToCurrent = vInt2
		Case "T"
			Dim height As Int = vScrollView1.Panel.Height
			If height > PerYToCurrent(50) Then
				Dim scrollViewWrapper4 As ScrollView = vScrollView1
				Dim vDipToCurrent2 As Int = DipToCurrent(0)
				Dim i6 As Int = -PerYToCurrent(50)
				Dim vPerXToCurrent2 As Int = PerXToCurrent(100)
				scrollViewWrapper4.SetLayout(vDipToCurrent2, i6, vPerXToCurrent2, PerYToCurrent(50) - vInt2)
				vDipToCurrent = DipToCurrent(0)
				vPerYToCurrent = vInt2
			Else
				Dim scrollViewWrapper5 As ScrollView = vScrollView1
				Dim vDipToCurrent3 As Int = DipToCurrent(0)
				Dim i7 As Int = -vScrollView1.Panel.Height
				scrollViewWrapper5.SetLayout(vDipToCurrent3, i7, PerXToCurrent(100), vScrollView1.Panel.Height)
				vDipToCurrent = DipToCurrent(0)
				vPerYToCurrent = vInt2
			End If
		Case "B"
			Dim height2 As Int = vScrollView1.Panel.Height
			If height2 > PerYToCurrent(50) Then
				Dim scrollViewWrapper6 As ScrollView = vScrollView1
				Dim vDipToCurrent4 As Int = DipToCurrent(0)
				Dim vPerYToCurrent2 As Int = PerYToCurrent(100) + vScrollView1.Height
				Dim vPerXToCurrent3 As Int = PerXToCurrent(100)
				scrollViewWrapper6.SetLayout(vDipToCurrent4, vPerYToCurrent2, vPerXToCurrent3, PerYToCurrent(50))
				vDipToCurrent = DipToCurrent(0)
				vPerYToCurrent = PerYToCurrent(50)
			Else
				Dim scrollViewWrapper7 As ScrollView = vScrollView1
				Dim vDipToCurrent5 As Int = DipToCurrent(0)
				Dim vPerYToCurrent3 As Int = PerYToCurrent(100) + vScrollView1.Panel.Height
				scrollViewWrapper7.SetLayout(vDipToCurrent5, vPerYToCurrent3, PerXToCurrent(100), vScrollView1.Panel.Height)
				vDipToCurrent = DipToCurrent(0)
				vPerYToCurrent = PerYToCurrent(100) - vScrollView1.Height
			End If
		Case Else
			vPerYToCurrent = 0
			vDipToCurrent = 0
	End Select
	Select str
		Case "Default"
			Sub003(vDipToCurrent, vPerYToCurrent, z)
		Case "ZigZag"
			Sub004(vDipToCurrent, vPerYToCurrent)
	End Select
	vTmr1.Initialize("TweenUpdate", 10)
	Dim timer As Timer = vTmr1
	timer.Enabled = True
	vRSTweenCallback1.Initialize("TweenCallback")
	Dim rSTweenCallback As RSTweenCallback = vRSTweenCallback1
	rSTweenCallback.Listener = True
	vRSTweenArr1(1).Callback = vRSTweenCallback1.TweenCallback
	vRSTweenManager1.StartTween
	mod1.vBln5 = False
End Sub

Sub Sub007(str As String, i As Int, obj As Object)
	Dim dArr(0) As Double
	Dim fArr(0) As Float
	Dim fArr2(0) As Float
	Dim rSTweenConstants As RSTweenConstants = vRSTweenConstants1
	Dim rSTweenConstants2 As RSTweenConstants = vRSTweenConstants1
	Dim rSTweenConstants3 As RSTweenConstants = vRSTweenConstants1
	Dim rSTweenConstants4 As RSTweenConstants = vRSTweenConstants1
	Dim rSTweenConstants5 As RSTweenConstants = vRSTweenConstants1
	Dim dArr2() As Double = Array(6, 10, 7, 8, 9)
	Dim fArr3() As Float = Array(1, 1, 0, 0, 0)
	Dim fArr4() As Float = Array(1, 0, 0, 0, 0)
	vRSTweenManager1.Initialize
	Dim length As Int = dArr2.Length - 1
	Dim i2 As Int
	For i2 = 0 To length
		vRSTweenArr1(i).Initialize("Tween")
		Select str
			Case "Panel", "HorizontalScrollView", "ListView", "ScrollView", "Spinner", "TabHost", "WebView"
				vRSTweenArr1(i).registerPanelAccessor
				vRSTweenArr1(i).PanelTo(obj, dArr2(i2), 0)
			Case "ImageView"
				vRSTweenArr1(i).registerImageAccessor
				vRSTweenArr1(i).ImageTo(obj, dArr2(i2), 0)
			Case "Label", "Button", "AutoCompleteEditText", "CheckBox", "EditText", "RadioButton", "ToggleButton"
				vRSTweenArr1(i).registerLabelAccessor
				vRSTweenArr1(i).LabelTo(obj, dArr2(i2), 0)
		End Select
		vRSTweenArr1(i).setTarget(fArr3(i2), fArr4(i2))
		vRSTweenManager1.addTween(vRSTweenArr1(i).Tween)
		vRSTweenManager1.StartTween
		vRSTweenManager1.Update(0.1)
	Next
End Sub

Sub Sub008(i As Int, i2 As Int, i3 As Int, bitmapWrapper As Bitmap)
	Dim labelWrapper As Label = vLbl1
	labelWrapper.Color = Main.v_colormenutitle
	vLbl1.TextColor = i2
	mod1.Sub173(vLbl1)
	If bitmapWrapper.IsInitialized Then
		vLbl1.SetBackgroundImageNew(bitmapWrapper)
		Return
	End If
	Dim scrollViewWrapper As ScrollView = vScrollView1
	scrollViewWrapper.Color = Colors.RGB(245, 245, 245)
End Sub

Sub tweencallback_onevent(i As Int)
	If i = 8 Then
		Dim timer As Timer = vTmr1
		timer.Enabled = False
		Return
	End If
End Sub

Sub Tweenupdate_Tick
	vRSTweenManager1.Update(vFlt1)
End Sub

