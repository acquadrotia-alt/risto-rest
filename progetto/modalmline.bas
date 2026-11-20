B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Type fileandtime(Name As String, Time As Long)
	Public vButtonArr1() As Button
	Public vTxt1 As EditText
	Public vGradientDrawableArr1() As GradientDrawable
	Public vGradientDrawable1 As GradientDrawable
	Public vGradientDrawable2 As GradientDrawable
	Public vGradientDrawable3 As GradientDrawable
	Public vInt1 As Int
	Public vInt2 As Int
	Public vIntArr1() As Int
	Public vIntArr2() As Int
	Public vIntArr3() As Int
	Public vIntArr4() As Int
	Public vInt3 As Int
	Public vLbl1 As Label
	Public vObj1 As Object
	Public vPnl1 As Panel
	Public vPnl2 As Panel
	Public vPnl3 As Panel
	Public vPnl4 As Panel
End Sub

Sub Sub001 As View
	Return vPnl1
End Sub

Sub Background_Click
End Sub

Sub Background_long_Click
End Sub

Sub Button_Click
	Dim buttonWrapper As Button
	vInt1 = Sender.Tag
	Dim panelWrapper As Panel = vPnl1
	panelWrapper.Visible = False
End Sub

Sub frame_color(i As Int)
	vPnl2.Color = i
End Sub

Sub Sub002(str As String, str2 As String, str3 As String, str4 As String) As String
	vTxt1.Text = ""
	vTxt1.Background = vGradientDrawable3
	vTxt1.TextColor = vInt3
	Dim editTextWrapper As EditText = vTxt1
	editTextWrapper.Visible = True
	vTxt1.Hint = str
	Select str3
		Case "D", "d"
			Dim editTextWrapper2 As EditText = vTxt1
			Dim editTextWrapper3 As EditText = vTxt1
			editTextWrapper2.InputType = 12290
		Case "N", "n"
			Dim editTextWrapper4 As EditText = vTxt1
			Dim editTextWrapper5 As EditText = vTxt1
			editTextWrapper4.InputType = 2
		Case "P", "p"
			Dim editTextWrapper6 As EditText = vTxt1
			Dim editTextWrapper7 As EditText = vTxt1
			editTextWrapper6.InputType = 3
		Case Else
			Dim editTextWrapper8 As EditText = vTxt1
			Dim editTextWrapper9 As EditText = vTxt1
			editTextWrapper8.InputType = 1
	End Select
	vLbl1.Text = str2
	Dim panelWrapper As Panel = vPnl1
	panelWrapper.Visible = True
	mod1.Sub161(vPnl1, 7)
	vInt1 = 0
	Dim editTextWrapper10 As EditText = vTxt1
	editTextWrapper10.Wrap = True
	Dim editTextWrapper11 As EditText = vTxt1
	editTextWrapper11.SingleLine = False
	If str4 <> "" Then
		vTxt1.Text = str4
	End If
	vTxt1.RequestFocus
	Do While vInt1 = 0
		DoEvents
	Loop
	CallSub(vObj1, "Hide_Keyboard")
	Dim i As Int = vInt1
	If i = -1 Then
		If vTxt1.Text = "" Then
			Return -3
		End If
		Return vTxt1.Text.Replace("'", "´")
	End If
	Return -3
End Sub

Sub Initialize(obj As Object, i As Int, activityWrapper As Activity)
	vObj1 = obj
	vInt2 = 22
	vPnl1.Initialize("background")
	Dim panelWrapper As Panel = vPnl1
	panelWrapper.Color = Colors.ARGB(170, 0, 0, 0)
	Dim panelWrapper2 As Panel = vPnl1
	panelWrapper2.Visible = False
	Dim view As View = vPnl1
	Dim vPerXToCurrent As Int = PerXToCurrent(100)
	activityWrapper.AddView(view, 0, 0, vPerXToCurrent, PerYToCurrent(100))
	vPnl2.Initialize("")
	Dim panelWrapper3 As Panel = vPnl2
	panelWrapper3.Color = -12303292
	vPnl3.Initialize("")
	Dim panelWrapper4 As Panel = vPnl3
	panelWrapper4.Color = Colors.RGB(70, 70, 70)
	vPnl4.Initialize("")
	Dim panelWrapper5 As Panel = vPnl4
	panelWrapper5.Color = -16777216
	vLbl1.Initialize("")
	vLbl1.TextSize = i
	Dim labelWrapper As Label = vLbl1
	labelWrapper.TextColor = -256
	Dim labelWrapper2 As Label = vLbl1
	labelWrapper2.Gravity = 1
	Dim iArr() As Int = vIntArr1
	iArr(0) = -1
	Dim iArr2() As Int = vIntArr1
	iArr2(1) = Colors.RGB(100, 100, 255)
	vGradientDrawableArr1(0).Initialize("TOP_BOTTOM", vIntArr1)
	vGradientDrawableArr1(0).CornerRadius = 5
	vGradientDrawable3.Initialize("TOP_BOTTOM", Array As Int(vIntArr1(0), vIntArr1(0)))
	vGradientDrawable3.CornerRadius = 5
	Dim iArr3() As Int = vIntArr2
	iArr3(0) = -1
	Dim iArr4() As Int = vIntArr2
	iArr4(1) = Colors.RGB(255, 100, 100)
	vGradientDrawableArr1(1).Initialize("TOP_BOTTOM", vIntArr2)
	vGradientDrawableArr1(1).CornerRadius = 5
	Dim iArr5() As Int = vIntArr3
	iArr5(0) = -1
	Dim iArr6() As Int = vIntArr3
	iArr6(1) = -12303292
	vGradientDrawable1.Initialize("TOP_BOTTOM", vIntArr3)
	Dim iArr7() As Int = vIntArr4
	iArr7(0) = -7829368
	Dim iArr8() As Int = vIntArr4
	iArr8(1) = -16777216
	vGradientDrawable2.Initialize("TOP_BOTTOM", vIntArr4)
	Dim i2 As Int
	For i2 = 0 To 1
		vButtonArr1(i2).Initialize("button")
		vButtonArr1(i2).Background = vGradientDrawableArr1(i2)
		vButtonArr1(i2).TextSize = vInt2
		Dim buttonWrapper As Button = vButtonArr1(i2)
		buttonWrapper.TextColor = -16777216
	Next
	Dim buttonWrapper2 As Button = vButtonArr1(0)
	buttonWrapper2.Tag = -1
	Dim buttonWrapper3 As Button = vButtonArr1(1)
	buttonWrapper3.Tag = -3
	vButtonArr1(0).Text = "OK"
	vButtonArr1(1).Text = "Annulla"
	vInt3 = -16777216
	vTxt1.Initialize("")
	Dim editTextWrapper As EditText = vTxt1
	editTextWrapper.Gravity = 48
	Dim panelWrapper6 As Panel = vPnl1
	Dim view2 As View = vPnl2
	Dim vPerXToCurrent2 As Int = PerXToCurrent(10)
	Dim vPerYToCurrent As Int = PerYToCurrent(10)
	Dim vPerXToCurrent3 As Int = PerXToCurrent(80)
	panelWrapper6.AddView(view2, vPerXToCurrent2, vPerYToCurrent, vPerXToCurrent3, PerYToCurrent(80))
	Dim panelWrapper7 As Panel = vPnl2
	Dim view3 As View = vPnl3
	Dim vPerXToCurrent4 As Int = PerXToCurrent(2)
	Dim vPerYToCurrent2 As Int = PerYToCurrent(2)
	Dim vPerXToCurrent5 As Int = PerXToCurrent(75)
	panelWrapper7.AddView(view3, vPerXToCurrent4, vPerYToCurrent2, vPerXToCurrent5, PerYToCurrent(75))
	Dim panelWrapper8 As Panel = vPnl3
	Dim view4 As View = vLbl1
	Dim vPerXToCurrent6 As Int = PerXToCurrent(2)
	Dim vPerYToCurrent3 As Int = PerYToCurrent(1)
	Dim width As Int = vPnl3.Width
	Dim vPerXToCurrent7 As Int = width - PerXToCurrent(4)
	panelWrapper8.AddView(view4, vPerXToCurrent6, vPerYToCurrent3, vPerXToCurrent7, PerYToCurrent(8))
	Dim panelWrapper9 As Panel = vPnl3
	Dim view5 As View = vPnl4
	Dim vPerYToCurrent4 As Int = PerYToCurrent(11)
	Dim width2 As Int = vPnl3.Width
	panelWrapper9.AddView(view5, 0, vPerYToCurrent4, width2, DipToCurrent(3))
	Dim panelWrapper10 As Panel = vPnl3
	Dim view6 As View = vTxt1
	Dim vPerXToCurrent8 As Int = PerXToCurrent(2)
	Dim vPerYToCurrent5 As Int = PerYToCurrent(14)
	Dim vPerXToCurrent9 As Int = PerXToCurrent(68)
	panelWrapper10.AddView(view6, vPerXToCurrent8, vPerYToCurrent5, vPerXToCurrent9, PerYToCurrent(20))
	Dim panelWrapper11 As Panel = vPnl3
	Dim view7 As View = vButtonArr1(0)
	Dim vPerXToCurrent10 As Int = PerXToCurrent(2)
	Dim vPerYToCurrent6 As Int = PerYToCurrent(55)
	Dim vPerXToCurrent11 As Int = PerXToCurrent(30)
	panelWrapper11.AddView(view7, vPerXToCurrent10, vPerYToCurrent6, vPerXToCurrent11, PerYToCurrent(12))
	Dim panelWrapper12 As Panel = vPnl3
	Dim view8 As View = vButtonArr1(1)
	Dim vPerXToCurrent12 As Int = PerXToCurrent(40)
	Dim vPerYToCurrent7 As Int = PerYToCurrent(55)
	Dim vPerXToCurrent13 As Int = PerXToCurrent(30)
	panelWrapper12.AddView(view8, vPerXToCurrent12, vPerYToCurrent7, vPerXToCurrent13, PerYToCurrent(12))
	Dim editTextWrapper2 As EditText = vTxt1
	editTextWrapper2.SingleLine = False
End Sub

Sub line_color(i As Int)
	vPnl4.Color = i
End Sub

Sub Sub003(str As String, str2 As String)
	vButtonArr1(0).Text = str
	vButtonArr1(1).Text = str2
End Sub

Sub Sub004(i As Int, i2 As Int, i3 As Int)
	vPnl2.Color = i
	vPnl4.Color = i2
	vLbl1.TextColor = i3
End Sub

Sub Sub005(i As Int, i2 As Int, i3 As Int, i4 As Int, i5 As Int, i6 As Int)
	vIntArr3(0) = i3
	vIntArr3(1) = i4
	vGradientDrawable1.Initialize("TOP_BOTTOM", vIntArr3)
	vIntArr4(0) = i5
	vIntArr4(1) = i6
	vGradientDrawable2.Initialize("TOP_BOTTOM", vIntArr4)
End Sub

Sub Sub006(i As Int, i2 As Int, i3 As Int, i4 As Int, i5 As Int)
	vIntArr1(0) = i
	vIntArr1(1) = i2
	vGradientDrawableArr1(0).Initialize("TOP_BOTTOM", vIntArr1)
	vIntArr2(0) = i3
	vIntArr2(1) = i4
	vGradientDrawableArr1(1).Initialize("TOP_BOTTOM", vIntArr2)
	vButtonArr1(0).TextColor = i5
	vButtonArr1(1).TextColor = i5
End Sub

Sub Sub007(z As Boolean, i As Int, i2 As Int, i3 As Int, i4 As Int)
	Dim iArr As Int()
	Dim iArr2(0) As Int
	If z Then
		iArr = Array As Int(i, i2)
	Else
		iArr = Array As Int(i3, i3)
	End If
	vGradientDrawable3.Initialize("TOP_BOTTOM", iArr)
	vTxt1.Background = vGradientDrawable3
	vInt3 = i4
End Sub

