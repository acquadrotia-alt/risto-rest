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
	Public vXv2 As B4XView
	Public vInt1 As Int
	Public vFlt1 As Float
	Public vFlt2 As Float
	Public vBln1 As Boolean
	Public vB4XCanvas1 As B4XCanvas
	Public vInt2 As Int
	Public vInt3 As Int
	Public vXv3 As B4XView
	Public vStr2 As String
	Public vB4XFont1 As B4XFont
	Public vB4XBitmap1 As B4XBitmap
	Public vB4XBitmap2 As B4XBitmap
	Public vB4XBitmap3 As B4XBitmap
	Public vB4XBitmap4 As B4XBitmap
	Public vBln2 As Boolean
	Public vXv4 As B4XView
	Public vXv5 As B4XView
	Public vMap1 As Map
	Public vObj2 As Object
	Public vStr3 As String
	Public vBln3 As Boolean
	Public vb4xfloattextfield1 As b4xfloattextfield
	Public vIME1 As IME
	Public vInt4 As Int
	Public vInt5 As Int
	Public vInt6 As Int
	Public vLng1 As Long
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/b4xfloattextfield.java, metodo _base_resize (riga 98).
Sub Base_Resize(d As Double, d2 As Double)
	Dim i As Int
	vXv2.SetLayoutAnimated(0, 0, 0, d, d2)
	Dim vDipToCurrent As Int = DipToCurrent(2)
	If vBln3 Then
		Dim xui As XUI = vXUI1
		If XUI.IsB4J Then
			i = DipToCurrent(22)
			If vXv5.IsInitialized Then
				vXv5.SetLayoutAnimated(0, d - vXv5.Width - i, 0, vXv5.Width, d2)
				Dim width As Int = vXv5.Width + i
				i = width + DipToCurrent(2)
			End If
			If vXv4.IsInitialized Then
				vXv4.SetLayoutAnimated(0, d - vXv4.Width - i, 0, vXv4.Width, d2)
			End If
			Dim text As String = vXv2.Text
			Sub010(text, True)
			Return
		End If
	End If
	i = vDipToCurrent
	If vXv5.IsInitialized Then
	End If
	If vXv4.IsInitialized Then
	End If
	Dim text2 As String = vXv2.Text
	Sub010(text2, True)
End Sub

Sub Sub001
	Dim map As Map = vMap1
	Dim vGetDefault As Object = map.GetDefault("ShowAccept", True)
	If vGetDefault = False Then
		Return
	End If
	vXv5 = Sub003(Chr(58826))
	vXv5.Tag = "v"
End Sub

Sub Sub002(b4XRect As B4XRect, i As Int, b4XFont As B4XFont) As B4XBitmap
	Dim xui As XUI = vXUI1
	Dim vCreatePanel As B4XView = XUI.CreatePanel("")
	Dim width As Float = b4XRect.Width
	Dim vMax As Int = Max(1, width + DipToCurrent(2))
	Dim height As Float = b4XRect.Height
	vCreatePanel.SetLayoutAnimated(0, 0, 0, vMax, Max(1, height + DipToCurrent(2)))
	Dim b4XCanvas As B4XCanvas
	b4XCanvas.Initialize(vCreatePanel)
	b4XCanvas.DrawText(vStr2, vCreatePanel.Width / 2, vCreatePanel.Height / 2 - b4XRect.Height / 2 - b4XRect.Top, b4XFont, i, "CENTER")
	Dim vCreateBitmap As B4XBitmap = b4XCanvas.CreateBitmap
	b4XCanvas.Release
	Return vCreateBitmap
End Sub

Sub Sub003(str As String) As B4XView
	Dim labelWrapper As Label
	labelWrapper.Initialize("lc")
	Dim b4XViewWrapper As B4XView = labelWrapper
	Dim xui As XUI = vXUI1
	b4XViewWrapper.Font = XUI.CreateMaterialIcons(20)
	b4XViewWrapper.Text = str
	b4XViewWrapper.TextColor = vXv2.TextColor
	b4XViewWrapper.Visible = False
	b4XViewWrapper.SetTextAlignment("CENTER", "CENTER")
	Dim b4XViewWrapper2 As B4XView = vXv1
	Dim view As View = b4XViewWrapper
	Dim vDipToCurrent As Int = DipToCurrent(30)
	b4XViewWrapper2.AddView(view, 0, 0, vDipToCurrent, DipToCurrent(30))
	Return b4XViewWrapper
End Sub

Sub Sub004
	Dim map As Map = vMap1
	Dim vGetDefault As Object = map.GetDefault("ShowClear", True)
	If vGetDefault = False Then
		Return
	End If
	If vXv4.IsInitialized And vXv4.Parent.IsInitialized Then
		vXv4.RemoveViewFromParent
	End If
	vXv4 = Sub003(Chr(57676))
	vXv4.Tag = "clear"
End Sub

Sub Sub005
	vXv4 = Sub003(Chr(59636))
	vXv4.Tag = "reveal"
End Sub

Sub Sub006(z As Boolean) As B4XView
	Dim editTextWrapper As EditText
	editTextWrapper.Initialize("tf")
	editTextWrapper.SingleLine = Not(vBln3)
	editTextWrapper.PasswordMode = z
	If z Then
		If vStr3 <> "Text" Then
			editTextWrapper.InputType = Bit.Or(2, 16)
		Else
			editTextWrapper.InputType = Bit.Or(128, 524288)
		End If
	Else
		Select vStr3
			Case "Numbers"
				editTextWrapper.InputType = 2
			Case "Decimal"
				editTextWrapper.InputType = 12290
		End Select
	End If
	Return editTextWrapper
End Sub

Sub Sub007(z As Boolean, b4XFont As B4XFont, i As Int)
	vXv2 = Sub006(z)
	vXv2.Font = b4XFont
	vXv2.TextColor = i
	setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(vb4xfloattextfield1)
	vXv1.AddView(vXv2, 0, 0, 0, 0)
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	Dim b4XViewWrapper As B4XView = vXv1
	Dim xui As XUI = vXUI1
	b4XViewWrapper.SetColorAndBorder(0, 0, 0, 0)
	vMap1 = map
	Dim b4XViewWrapper2 As B4XView = labelWrapper
	Dim imageViewWrapper As ImageView
	imageViewWrapper.Initialize("HintImageView")
	vXv3 = imageViewWrapper
	vStr3 = map.GetDefault("KeyboardType", "Text")
	Dim xui2 As XUI = vXUI1
	vInt2 = XUI.PaintOrColorToColor(map.Get("HintColor"))
	Dim xui3 As XUI = vXUI1
	vInt3 = XUI.PaintOrColorToColor(map.Get("NonFocusedHintColor"))
	vStr2 = map.Get("Hint")
	vB4XFont1 = b4XViewWrapper2.Font
	Dim vObjectToBoolean As Boolean = map.GetDefault("PasswordField", False)
	vBln3 = map.GetDefault("Multiline", False)
	If vObjectToBoolean And vBln3 Then
		vBln3 = False
		Log("Multiline not supported with password mode.")
	End If
	Dim font As B4XFont = b4XViewWrapper2.Font
	Dim xui4 As XUI = vXUI1
	Sub007(vObjectToBoolean, font, XUI.PaintOrColorToColor(labelWrapper.TextColor))
	vXv1.AddView(vXv3, 0, 0, 0, 0)
	Dim xui5 As XUI = vXUI1
	Dim vCreatePanel As B4XView = XUI.CreatePanel("")
	Dim vDipToCurrent As Int = DipToCurrent(2)
	vCreatePanel.SetLayoutAnimated(0, 0, 0, vDipToCurrent, DipToCurrent(2))
	vB4XCanvas1.Initialize(vCreatePanel)
	Sub009()
	If vObjectToBoolean Then
		If map.GetDefault("ShowRevealButton", False) Then
			Sub005()
			Sub001()
			base_resize(vXv1.Width, vXv1.Height)
			Return
		End If
	End If
	Sub004()
	Sub001()
	base_resize(vXv1.Width, vXv1.Height)
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 As b4xfloattextfield
	Return vb4xfloattextfield1
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 As String
	Return vXv2.Text
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 As B4XView
	Return vXv2
End Sub

Sub ime_handleaction As Boolean
	tf_enterpressed()
	If vb4xfloattextfield1.IsInitialized Then
		Return True
	End If
	Return False
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
	Dim xui As XUI = vXUI1
	If XUI.IsB4A Then
		vInt4 = DipToCurrent(6)
	Else
		vInt4 = DipToCurrent(12)
	End If
	vIME1.Initialize("ime")
End Sub

Sub Lc_Click
	Dim b4XViewWrapper As B4XView
	Select Sender.Tag
		Case "clear"
			setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("")
		Case "reveal"
			SwitchFromPasswordToRegular(True)
		Case "hide"
			SwitchFromPasswordToRegular(False)
		Case "v"
			tf_enterpressed()
			Dim vIsInitialized As Boolean = vb4xfloattextfield1.IsInitialized
			If Not(vIsInitialized) Or vb4xfloattextfield1.equals(Me) Then
				vIME1.HideKeyboard
			End If
	End Select
End Sub

Sub Sub008
	vXv2.RequestFocus
	vIME1.ShowKeyboard(vXv2)
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(b4xfloattextfieldVar As b4xfloattextfield)
	Dim vIsInitialized As Boolean = b4xfloattextfieldVar.IsInitialized
	If Not(vIsInitialized) Then
		Return
	End If
	Dim z As Boolean = vBln3
	If Not(z) Then
		If Not(b4xfloattextfieldVar.equals(Me)) Then
			vIME1.AddHandleActionEvent(vXv2)
		End If
		Dim editTextWrapper As EditText = vXv2
		editTextWrapper.ForceDoneButton = True
	End If
	vb4xfloattextfield1 = b4xfloattextfieldVar
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(str As String)
	Dim text As String = vXv2.Text
	vXv2.Text = str
	If IsPaused(Me) Then
		tf_textchanged(text, str)
		Return
	End If
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub SwitchFromPasswordToRegular(toregular As Boolean)
	Dim text As String
	Dim textcolor As Int
	Dim font1 As B4XFont
	Dim oldfield As B4XView
	Dim et As EditText
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				text = vXv2.Text
				textcolor = vXv2.TextColor
				font1 = vXv2.Font
				'oldfield = B4XView
				oldfield = vXv2
				Sub007(Not(toregular), font1, textcolor)
				vXv2.Text = text
				Continue
			Case 1
				rsState = 10
				If Not(vXv4.IsInitialized) Then
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
				Dim z As Boolean = toregular
				If Not(z) Then
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
				Dim b4XViewWrapper As B4XView = vXv4
				b4XViewWrapper.Text = Chr(59636)
				vXv4.Tag = "reveal"
				Continue
			Case 8
				rsState = 9
				vXv4.Tag = "hide"
				Dim b4XViewWrapper2 As B4XView = vXv4
				b4XViewWrapper2.Text = Chr(59637)
				Continue
			Case 9
				rsState = 10
				vXv4.BringToFront
				Continue
			Case 10
				rsState = 15
				If Not(vXv5.IsInitialized) Then
					Continue
				Else
					rsState = 12
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 12
			Case 12
				rsState = 15
				vXv5.BringToFront
				Continue
			Case 15
				rsState = 16
				vXv3.BringToFront
				base_resize(vXv1.Width, vXv1.Height)
				'et = EditText
				et = vXv2
				et.SelectionStart = vXv2.Text.Length
				vLng1 = DateTime.Now
				vXv2.RequestFocus
				oldfield.RemoveViewFromParent
				vLng1 = DateTime.Now + 200
				Dim editTextWrapper As EditText = et
				editTextWrapper.Enabled = False
				Sleep(50)
				rsState = 20
				Continue
			Case 16
				rsState = 19
				Dim xui As XUI = vXUI1
				If Not(XUI.SubExists(vObj1, vStr1 & "_PasswordRevealChanged", 1)) Then
					Continue
				Else
					rsState = 18
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 18
			Case 18
				rsState = 19
				CallSubDelayed2(vObj1, vStr1 & "_PasswordRevealChanged", toregular)
				Continue
			Case 19
				rsState = -1
				Continue
			Case 20
				rsState = 16
				Dim editTextWrapper2 As EditText = et
				editTextWrapper2.Enabled = True
				Sleep(50)
				rsState = 21
				Continue
			Case 21
				rsState = 16
				et.RequestFocus
				vIME1.ShowKeyboard(vXv2)
				Continue
		End Select
	Loop
End Sub

Sub tf_action
	If vb4xfloattextfield1.IsInitialized And Not(vb4xfloattextfield1.equals(Me)) Then
		vb4xfloattextfield1.getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.RequestFocus
	End If
	Dim xui As XUI = vXUI1
	If XUI.SubExists(vObj1, vStr1 & "_EnterPressed", 0) Then
		CallSubDelayed(vObj1, vStr1 & "_EnterPressed")
		Return
	End If
End Sub

Sub tf_beginedit
	tf_focuschanged(True)
End Sub

Sub tf_endedit
	tf_focuschanged(False)
End Sub

Sub Tf_EnterPressed
	tf_action()
End Sub

Sub Tf_FocusChanged(z As Boolean)
	vBln2 = z
	Dim text As String = vXv2.Text
	Sub010(text, True)
	Dim xui As XUI = vXUI1
	If XUI.SubExists(vObj1, vStr1 & "_FocusChanged", 1) Then
		Dim j As Long = vLng1 + 100
		If j < DateTime.Now Then
			CallSubDelayed2(vObj1, vStr1 & "_FocusChanged", vBln2)
			Return
		End If
		Return
	End If
End Sub

Sub Tf_TextChanged(str As String, str2 As String)
	Sub010(str2, False)
	Dim xui As XUI = vXUI1
	If XUI.SubExists(vObj1, vStr1 & "_TextChanged", 2) Then
		CallSub3(vObj1, vStr1 & "_TextChanged", str, str2)
		Return
	End If
End Sub

Sub Sub009
	Dim xui As XUI = vXUI1
	Dim vCreateFont2 As B4XFont = XUI.CreateFont2(vB4XFont1, vFlt1)
	Dim vMeasureText As B4XRect = vB4XCanvas1.MeasureText(vStr2, vCreateFont2)
	vB4XBitmap1 = Sub002(vMeasureText, vInt2, vCreateFont2)
	vB4XBitmap2 = Sub002(vMeasureText, vInt3, vCreateFont2)
	Dim xui2 As XUI = vXUI1
	Dim vCreateFont22 As B4XFont = XUI.CreateFont2(vB4XFont1, vFlt2)
	Dim vMeasureText2 As B4XRect = vB4XCanvas1.MeasureText(vStr2, vCreateFont22)
	vB4XBitmap3 = Sub002(vMeasureText2, vInt2, vCreateFont22)
	vB4XBitmap4 = Sub002(vMeasureText2, vInt3, vCreateFont22)
	Dim text As String = vXv2.Text
	Sub010(text, True)
End Sub

Sub Sub010(str As String, z As Boolean)
	Dim b4XBitmapWrapper As B4XBitmap
	For Each b4XViewWrapper As B4XView In Array As B4XView(vXv4, vXv5)
		If b4XViewWrapper.IsInitialized Then
			b4XViewWrapper.Visible = vBln2 And str.Length > 0
		End If
	Next
	Dim z2 As Boolean = str.Length = 0
	If z2 = vBln1 Then
		If Not(z) Then
			Return
		End If
	End If
	If vBln2 Then
		If z2 Then
			b4XBitmapWrapper = vB4XBitmap1
		Else
			b4XBitmapWrapper = vB4XBitmap3
		End If
	Else If z2 Then
		b4XBitmapWrapper = vB4XBitmap2
	Else
		b4XBitmapWrapper = vB4XBitmap4
	End If
	Dim vIsInitialized As Boolean = b4XBitmapWrapper.IsInitialized
	If Not(vIsInitialized) Then
		Return
	End If
	vXv3.SetBitmap(b4XBitmapWrapper)
	If z2 Then
		vXv3.SetLayoutAnimated(vInt1, vInt4, vXv1.Height / 2 - b4XBitmapWrapper.Height / 2, b4XBitmapWrapper.Width, b4XBitmapWrapper.Height)
		vBln1 = True
	Else
		vXv3.SetLayoutAnimated(vInt1, vInt6, vInt5, b4XBitmapWrapper.Width, b4XBitmapWrapper.Height)
		vBln1 = False
	End If
End Sub

