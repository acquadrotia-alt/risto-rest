B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vXUI1 As XUI
	Public vInt1 As Int
	Public vInt2 As Int
	Public vInt3 As Int
	Public vXv1 As B4XView
	Public vInt4 As Int
	Public vInt5 As Int
	Public vInt6 As Int
	Public vInt7 As Int
	Public vInt8 As Int
	Public vInt9 As Int
	Public vInt10 As Int
	Public vXv2 As B4XView
	Public vXv3 As B4XView
	Public vBln1 As Boolean
	Public vInt11 As Int
	Public vXv4 As B4XView
	Public vObj1 As Object
	Public vInt12 As Int
	Public vInt13 As Int
	Public vInt14 As Int
	Public vXv5 As B4XView
	Public vBln2 As Boolean
	Public vB4XFont1 As B4XFont
	Public vB4XFont2 As B4XFont
	Public vInt15 As Int
	Public vInt16 As Int
	Public vIntArr1() As Int
	Public vMap1 As Map
End Sub

Sub Background_Click
End Sub

Sub Background_Touch(i As Int, f As Float, f2 As Float)
End Sub

Sub Sub001(b4XBitmapWrapper As B4XBitmap) As BitmapCreator
	Dim now As Long = DateTime.Now
	Dim i As Int = vInt11
	BitmapCreator.initialize(b4XBitmapWrapper.Width / i / b4XBitmapWrapper.Scale, b4XBitmapWrapper.Height / i / b4XBitmapWrapper.Scale)
	BitmapCreator.copypixelsfrombitmap(b4XBitmapWrapper)
	Dim argbcolorVarArr(3) As _argbcolor
	Dim i2 As Int
	For i2 = 0 To argbcolorVarArr.Length - 1
		'argbcolorVarArr(i2) = _argbcolor
	Next
	Dim argbcolorVar As _argbcolor
	Dim i3 As Int
	For i3 = 1 To 2
		Dim i4 As Int = BitmapCreator.mheight - 1
		Dim i5 As Int
		For i5 = 0 To i4
			Dim i6 As Int
			For i6 = 0 To 2
				BitmapCreator.getargb(i6, i5, argbcolorVarArr(i6))
			Next
			Sub008(BitmapCreator, 1, i5, argbcolorVarArr, argbcolorVar)
			Dim i7 As Int = 0
			Dim i8 As Int = BitmapCreator.mwidth - 2
			Dim i9 As Int = 2
			Do While i9 <= i8
				BitmapCreator.getargb(i9 + 1, i5, argbcolorVarArr(i7))
				Sub008(BitmapCreator, i9, i5, argbcolorVarArr, argbcolorVar)
				i9 = i9 + 1
				i7 = (i7 + 1) Mod 3
			Loop
		Next
		Dim i10 As Int = BitmapCreator.mwidth - 1
		Dim i11 As Int
		For i11 = 0 To i10
			Dim i12 As Int
			For i12 = 0 To 2
				BitmapCreator.getargb(i11, i12, argbcolorVarArr(i12))
			Next
			Sub008(BitmapCreator, i11, 1, argbcolorVarArr, argbcolorVar)
			Dim i13 As Int = 0
			Dim i14 As Int = BitmapCreator.mheight - 2
			Dim i15 As Int = 2
			Do While i15 <= i14
				BitmapCreator.getargb(i11, i15 + 1, argbcolorVarArr(i13))
				Sub008(BitmapCreator, i11, i15, argbcolorVarArr, argbcolorVar)
				i15 = i15 + 1
				i13 = (i13 + 1) Mod 3
			Loop
		Next
	Next
	Log("Time: " & DateTime.Now - now)
	Return BitmapCreator
End Sub

Sub Button_Click
	Dim b4XViewWrapper As B4XView
	Dim b4XViewWrapper2 As B4XView = Sender
	Dim map As Map = vMap1
	Dim tag As Object = b4XViewWrapper2.Tag
	Dim vGetDefault As Object = map.GetDefault(tag, True)
	If vGetDefault = False Then
		Return
	End If
	Sub002(b4XViewWrapper2.Tag)
End Sub

Sub Sub002(i As Int) As Boolean
	If Not(getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1()) Then
		Return False
	End If
	CallSubDelayed2(Me, "CloseMessage", i)
	Return True
End Sub

Sub Sub003(obj As Object, i As Int)
	If obj = "" Then
		Return
	End If
	Dim labelWrapper As Label
	labelWrapper.Initialize("Button")
	Dim b4XViewWrapper As B4XView = labelWrapper
	xuiviewsutils.Sub007(b4XViewWrapper, obj)
	b4XViewWrapper.Tag = i
	Dim i2 As Int = vInt9
	Dim vDipToCurrent As Int = DipToCurrent(0)
	Dim i3 As Int = vInt6
	b4XViewWrapper.SetColorAndBorder(i2, vDipToCurrent, i3, DipToCurrent(5))
	b4XViewWrapper.SetTextAlignment("CENTER", "CENTER")
	b4XViewWrapper.TextColor = vInt10
	b4XViewWrapper.Font = vB4XFont2
	Dim numberOfViews As Int = vXv1.NumberOfViews
	Dim b4XViewWrapper2 As B4XView = vXv1
	Dim view As View = b4XViewWrapper
	Dim width As Int = vXv1.Width
	Dim vDipToCurrent2 As Int = width - DipToCurrent(4)
	Dim i4 As Int = vInt3
	Dim vDipToCurrent3 As Int = vDipToCurrent2 - numberOfViews * (i4 + DipToCurrent(5)) - vInt3
	Dim height As Int = vXv1.Height - vInt1
	b4XViewWrapper2.AddView(view, vDipToCurrent3, height - DipToCurrent(4), vInt3, vInt1)
	Dim xui As XUI = vXUI1
	If i = -3 Then
		b4XViewWrapper.RequestFocus
	End If
End Sub

Sub Sub004(i As Int) As B4XView
	Dim vGetAllViewsRecursive As IterableList = vXv1.GetAllViewsRecursive
	Dim size As Int = vGetAllViewsRecursive.Size
	Dim i2 As Int
	For i2 = 0 To size - 1
		Dim b4XViewWrapper As B4XView = vGetAllViewsRecursive.Get(i2)
		If b4XViewWrapper.Tag = i Then
			Return b4XViewWrapper
		End If
	Next
	Dim b4XViewWrapper2 As B4XView
	Return Null
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 As Boolean
	Return vXv2.IsInitialized And vXv2.Parent.IsInitialized
End Sub

Sub Initialize(b4XViewWrapper As B4XView)
	vBln1 = False
	Dim xui As XUI = vXUI1
	If XUI.IsB4i Then
		vInt11 = 3
	Else
		Dim xui2 As XUI = vXUI1
		If XUI.IsB4J Then
			vInt11 = 1
		Else
			Dim xui3 As XUI = vXUI1
			If XUI.IsB4A Then
				vInt11 = 3
			End If
		End If
	End If
	vXv4 = b4XViewWrapper
	Dim xui4 As XUI = vXUI1
	vB4XFont1 = XUI.CreateDefaultBoldFont(16)
	Dim xui5 As XUI = vXUI1
	vB4XFont2 = XUI.CreateDefaultBoldFont(15)
	Dim xui6 As XUI = vXUI1
	vInt13 = -1
	vMap1.Initialize
End Sub

Sub Sub005(customlistviewVar As CustomListView, i As Int)
	xuiviewsutils.Sub001(customlistviewVar, i)
End Sub

Sub Sub006(b4XViewWrapper As B4XView, obj As Object)
	xuiviewsutils.Sub007(b4XViewWrapper, obj)
End Sub

Sub Sub007(i As Int, i2 As Int)
	Dim i3 As Int
	Dim vRound As Int = Round(vXv2.Height / 2 - vXv1.Height / 2)
	If vBln2 Then
		i3 = DipToCurrent(20)
	Else
		i3 = vRound
	End If
	vXv2.SetLayoutAnimated(0, 0, 0, i, i2)
	Dim b4XViewWrapper As B4XView = vXv1
	b4XViewWrapper.SetLayoutAnimated(200, Round(vXv2.Width / 2 - vXv1.Width / 2), i3, vXv1.Width, vXv1.Height)
	Dim xui As XUI = vXUI1
	If XUI.IsB4J Then
		Sub010()
		Return
	End If
End Sub

Sub Sub008(bitmapcreatorVar As BitmapCreator, i As Int, i2 As Int, argbcolorVarArr As _argbcolor(), argbcolorVar As _argbcolor)
	argbcolorVar.Initialize
	For Each argbcolorVar2 As _argbcolor In argbcolorVarArr
		argbcolorVar.r = argbcolorVar.r + argbcolorVar2.r
		argbcolorVar.g = argbcolorVar.g + argbcolorVar2.g
		argbcolorVar.b = argbcolorVar2.b + argbcolorVar.b
	Next
	argbcolorVar.a = 255
	argbcolorVar.r = argbcolorVar.r / 3
	argbcolorVar.g = argbcolorVar.g / 3
	argbcolorVar.b = argbcolorVar.b / 3
	bitmapcreatorVar._setargb(i, i2, argbcolorVar)
End Sub

Sub Sub009(i As Int, z As Boolean)
	Dim vTmp As B4XView = Sub004(i)
	If vTmp.IsInitialized Then
		vTmp.Enabled = z
		If z Then
			vTmp.TextColor = vInt10
		Else
			vTmp.TextColor = vInt15
		End If
		vMap1.Put(i, z)
		Return
	End If
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub show(text As Object, yes As Object, no As Object, cancel As Object) As ResumableSub
	Dim p As B4XView
	Dim lbl As Label
	Dim xlbl As B4XView
	Dim result As Int
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return Null
			Case 0
				rsState = -1
				'p = B4XView
				Dim xui As XUI = vXUI1
				p = XUI.CreatePanel("")
				Dim b4XViewWrapper As B4XView = p
				Dim vDipToCurrent As Int = DipToCurrent(300)
				b4XViewWrapper.SetLayoutAnimated(0, 0, 0, vDipToCurrent, DipToCurrent(100))
				'lbl = Label
				lbl.Initialize("")
				Dim labelWrapper As Label = lbl
				labelWrapper.SingleLine = False
				'xlbl = B4XView
				xlbl = lbl
				Dim b4XViewWrapper2 As B4XView = p
				Dim view As View = xlbl
				Dim vDipToCurrent2 As Int = DipToCurrent(5)
				Dim width As Int = p.Width
				b4XViewWrapper2.AddView(view, vDipToCurrent2, 0, width - DipToCurrent(10), p.Height)
				xlbl.TextColor = vInt14
				xlbl.Font = vB4XFont1
				xuiviewsutils.Sub007(xlbl, text)
				xlbl.SetTextAlignment("CENTER", "LEFT")
				Wait For (ShowCustom(p, yes, no, cancel)) Complete (wf1_0 As Int)
				rsState = 1
				Continue
			Case 1
				rsState = -1
				result = wf1_0
				Return result
		End Select
	Loop
End Sub

Sub complete(i As Int)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub ShowCustom(content As B4XView, yes As Object, no As Object, cancel As Object) As ResumableSub
	Dim group1 As IterableList
	Dim group74 As IterableList
	Dim group78 As IterableList
	Dim groupLen1 As Int
	Dim groupLen74 As Int
	Dim groupLen78 As Int
	Dim index1 As Int
	Dim index74 As Int
	Dim index78 As Int
	Dim limit46 As Int
	Dim step46 As Int
	Dim v As B4XView
	Dim iv As ImageView
	Dim p As Panel
	Dim includetitle As Boolean
	Dim temptitlebarheight As Int
	Dim height As Int
	Dim width As Int
	Dim top As Int
	Dim removetitle As Boolean
	Dim i As Int
	Dim btype As Int
	Dim lbl As Label
	Dim xlbl As B4XView
	Dim result As Int
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return Null
			Case 0
				rsState = 1
				Continue
			Case 1
				rsState = 8
				'v = B4XView
				group1 = vXv4.GetAllViewsRecursive
				index1 = 0
				groupLen1 = group1.Size
				rsState = 60
				Continue
			Case 3
				rsState = 4
				Continue
			Case 4
				rsState = 7
				If Not(v.Tag = Null) And v.Tag = "b4xdialog_background" Then
					rsState = 6
					Continue
				End If
				Continue
			Case 6
				rsState = 7
				v.RemoveViewFromParent
				rsState = 8
				Continue
			Case 7
				rsState = 61
				Continue
			Case 8
				rsState = 9
				vMap1.Clear
				'vXv2 = B4XView
				Dim xui As XUI = vXUI1
				vXv2 = XUI.CreatePanel("background")
				vXv2.Tag = "b4xdialog_background"
				Continue
			Case 9
				rsState = 14
				If vBln1 Then
					rsState = 11
					Continue
				Else
					rsState = 13
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 11
			Case 11
				rsState = 14
				'iv = ImageView
				iv.Initialize("")
				vXv3 = iv
				vXv2.AddView(vXv3, 0, 0, vXv2.Width, vXv2.Height)
				Dim b4XViewWrapper As B4XView = vXv2
				Dim xui2 As XUI = vXUI1
				b4XViewWrapper.Color = 0
				Continue
			Case 13
				rsState = 14
				vXv2.Color = vInt5
				Continue
			Case 14
				rsState = 15
				'p = Panel
				p = vXv2
				Dim panelWrapper As Panel = p
				panelWrapper.Elevation = DipToCurrent(4)
				vXv4.AddView(vXv2, 0, 0, vXv4.Width, vXv4.Height)
				Sub010()
				Dim xui3 As XUI = vXUI1
				vXv1 = XUI.CreatePanel("")
				vXv1.SetColorAndBorder(vInt4, vInt8, vInt6, vInt7)
				vXv1.RequestFocus
				includetitle = (vObj1 <> "")
				temptitlebarheight = 0
				Continue
			Case 15
				rsState = 18
				If Not(includetitle) Then
					Continue
				Else
					rsState = 17
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 17
			Case 17
				rsState = 18
				temptitlebarheight = vInt2
				Continue
			Case 18
				rsState = 19
				Dim height_ As Int = content.Height + vInt1
				Dim vDipToCurrent As Int = height_ + DipToCurrent(3)
				height = vDipToCurrent + DipToCurrent(3) + temptitlebarheight
				Dim width_ As Int = content.Width
				width = width_ + DipToCurrent(4)
				top = Round(vXv2.Height / 2 - height / 2)
				removetitle = False
				Continue
			Case 19
				rsState = 28
				If Not(vBln2) Then
					Continue
				Else
					rsState = 21
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 21
			Case 21
				rsState = 22
				top = DipToCurrent(20)
				Continue
			Case 22
				rsState = 27
				Dim height2 As Int = vXv2.Height - top - height
				If height2 >= DipToCurrent(200) Then
					Continue
				Else
					rsState = 24
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 24
			Case 24
				rsState = 27
				removetitle = True
				Continue
			Case 27
				rsState = 28
				Continue
			Case 28
				rsState = 31
				If Not(removetitle) And vXv2.Height >= height Then
					Continue
				Else
					rsState = 30
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 30
			Case 30
				rsState = 31
				top = DipToCurrent(1)
				includetitle = False
				Dim i_ As Int = height - temptitlebarheight
				height = i_ - DipToCurrent(3)
				temptitlebarheight = 0
				Continue
			Case 31
				rsState = 32
				Dim b4XViewWrapper2 As B4XView = vXv2
				Dim view As View = vXv1
				Dim vRound As Int = Round(vXv2.Width / 2 - width / 2)
				Dim i2 As Int = top
				Dim vRound2 As Int = Round(width)
				b4XViewWrapper2.AddView(view, vRound, i2, vRound2, Round(height))
				Continue
			Case 32
				rsState = 43
				step46 = -1
				limit46 = 0
				i = vIntArr1.Length - 1
				rsState = 62
				Continue
			Case 34
				rsState = 35
				btype = vIntArr1(i)
				Continue
			Case 35
				rsState = 42
				Dim valueOf As Int = btype
				Dim xui4 As XUI = vXUI1
				Dim xui5 As XUI = vXUI1
				Dim xui6 As XUI = vXUI1
				Select valueOf
					Case -3
						rsState = 37
					Case -2
						rsState = 39
					Case -1
						rsState = 41
				End Select
				'(fallthrough java verso il case successivo)
				rsState = 37
			Case 37
				rsState = 42
				Sub003(cancel, btype)
				Continue
			Case 39
				rsState = 42
				Sub003(no, btype)
				Continue
			Case 41
				rsState = 42
				Sub003(yes, btype)
				Continue
			Case 42
				rsState = 63
				Continue
			Case 43
				rsState = 44
				Dim b4XViewWrapper3 As B4XView = vXv1
				b4XViewWrapper3.Visible = False
				Continue
			Case 44
				rsState = 47
				If Not(includetitle) Then
					Continue
				Else
					rsState = 46
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 46
			Case 46
				rsState = 47
				Dim xui7 As XUI = vXUI1
				vXv5 = XUI.CreatePanel("TitleBar")
				vXv5.Color = vInt12
				Dim b4XViewWrapper4 As B4XView = vXv1
				Dim view2 As View = vXv5
				Dim vDipToCurrent2 As Int = DipToCurrent(2)
				b4XViewWrapper4.AddView(view2, vDipToCurrent2, DipToCurrent(2), content.Width, temptitlebarheight)
				'lbl = Label
				lbl.Initialize("")
				'xlbl = B4XView
				xlbl = lbl
				xuiviewsutils.Sub007(xlbl, vObj1)
				xlbl.TextColor = vInt13
				xlbl.Font = vB4XFont1
				xlbl.SetTextAlignment("CENTER", "CENTER")
				vXv5.AddView(xlbl, 0, 0, vXv5.Width, vXv5.Height)
				Continue
			Case 47
				rsState = 48
				content.RemoveViewFromParent
				Dim b4XViewWrapper5 As B4XView = vXv1
				Dim view3 As View = content
				Dim vDipToCurrent3 As Int = DipToCurrent(2)
				b4XViewWrapper5.AddView(view3, vDipToCurrent3, DipToCurrent(2) + temptitlebarheight, content.Width, content.Height)
				Dim b4XViewWrapper6 As B4XView = vXv1
				Dim i3 As Int = vInt16
				b4XViewWrapper6.SetVisibleAnimated(i3, True)
				Continue
			Case 48
				rsState = 51
				'v = B4XView
				group74 = vXv2.GetAllViewsRecursive
				index74 = 0
				groupLen74 = group74.Size
				rsState = 64
				Continue
			Case 50
				rsState = 65
				Dim b4XViewWrapper7 As B4XView = v
				b4XViewWrapper7.Enabled = True
				Continue
			Case 51
				rsState = 52
				Wait For (Null) Closemessage (wf66_0 As Int)
				rsState = 66
				Continue
			Case 52
				rsState = 55
				'v = B4XView
				group78 = vXv2.GetAllViewsRecursive
				index78 = 0
				groupLen78 = group78.Size
				rsState = 67
				Continue
			Case 54
				rsState = 68
				Dim b4XViewWrapper8 As B4XView = v
				b4XViewWrapper8.Enabled = False
				Continue
			Case 55
				rsState = 56
				Dim b4XViewWrapper9 As B4XView = vXv1
				Dim i4 As Int = vInt16
				b4XViewWrapper9.SetVisibleAnimated(i4, False)
				Continue
			Case 56
				rsState = 59
				If vInt16 <= 0 Then
					Continue
				Else
					rsState = 58
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 58
			Case 58
				rsState = 59
				Sleep(vInt16)
				rsState = 69
				Continue
			Case 59
				rsState = -1
				vXv2.RemoveViewFromParent
				Return result
			Case 60
				rsState = 8
				If index1 >= groupLen1 Then
					Continue
				Else
					rsState = 3
					v = group1.Get(index1)
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 61
			Case 61
				rsState = 60
				index1 = index1 + 1
				Continue
			Case 62
				rsState = 43
				If (step46 > 0 And i <= limit46) Or (step46 < 0 And i >= limit46) Then
					rsState = 34
					Continue
				End If
				Continue
			Case 63
				rsState = 62
				i = i + 0 + step46
				Continue
			Case 64
				rsState = 51
				If index74 >= groupLen74 Then
					Continue
				Else
					rsState = 50
					v = group74.Get(index74)
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 65
			Case 65
				rsState = 64
				index74 = index74 + 1
				Continue
			Case 66
				rsState = 52
				result = wf66_0
				Continue
			Case 67
				rsState = 55
				If index78 >= groupLen78 Then
					Continue
				Else
					rsState = 54
					v = group78.Get(index78)
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 68
			Case 68
				rsState = 67
				index78 = index78 + 1
				Continue
			Case 69
				rsState = 59
				Continue
		End Select
	Loop
End Sub

Sub closemessage(i As Int)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub ShowTemplate(dialogtemplate As Object, yes As Object, no As Object, cancel As Object) As ResumableSub
	Dim content As B4XView
	Dim result As Int
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return Null
			Case 0
				rsState = -1
				'content = B4XView
				Dim b4XViewWrapper As B4XView
				content = CallSub2(dialogtemplate, "GetPanel", Me)
				CallSub2(dialogtemplate, "Show", Me)
				Wait For (ShowCustom(content, yes, no, cancel)) Complete (wf1_0 As Int)
				rsState = 1
				Continue
			Case 1
				rsState = -1
				result = wf1_0
				CallSub2(dialogtemplate, "DialogClosed", result)
				vBln2 = False
				Return result
		End Select
	Loop
End Sub

Sub Stub_Click
End Sub

Sub Sub010
	Dim z As Boolean = vBln1
	If Not(z) Then
		Return
	End If
	Dim b4XViewWrapper As B4XView = vXv2
	b4XViewWrapper.Visible = False
	Dim vSnapshot As B4XBitmap = vXv2.Parent.Snapshot
	Dim vCrop As B4XBitmap = IIf(vSnapshot.Width > vXv2.Width Or vSnapshot.Height > vXv2.Height, vSnapshot.Crop(0, 0, vXv2.Width, vXv2.Height), vSnapshot)
	Dim b4XViewWrapper2 As B4XView = vXv2
	b4XViewWrapper2.Visible = True
	vXv3.SetLayoutAnimated(0, 0, 0, vXv2.Width, vXv2.Height)
	BitmapCreator.setbitmaptoimageview(BitmapCreator.getbitmap(), vXv3)
End Sub

