B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vObj1 As Object
	Public vPnl1 As Panel
	Public vStr1 As String
	Public vInt1 As Int
	Public vImg1 As ImageView
	Public vPnl2 As Panel
	Public vPnl3 As Panel
	Public vLbl1 As Label
	Public vScrollView1 As ScrollView
	Public vLbl2 As Label
	Public vPnl4 As Panel
	Public vPnl5 As Panel
	Public vPnl6 As Panel
	Public vLbl3 As Label
	Public vLbl4 As Label
	Public vLbl5 As Label
	Public vStr2 As String
	Public vStr3 As String
	Public vStr4 As String
End Sub

Sub Backpanel_Touch(i As Int, f As Float, f2 As Float)
End Sub

Sub Initialize(activityWrapper As Activity, obj As Object, str As String, str2 As String, i As Int, d As Double, d2 As Double, bitmapWrapper As Bitmap)
	Dim vNumberToString As String
	vObj1 = obj
	vStr1 = str2
	vInt1 = i
	Dim vPerXToCurrent As Int = PerXToCurrent(100)
	Dim vPerYToCurrent As Double = vPerXToCurrent + PerYToCurrent(100)
	Dim vDipToCurrent As Int = DipToCurrent(320)
	Dim vNumberToString2 As String = (vPerYToCurrent / (vDipToCurrent + DipToCurrent(480)) - 1) * 0.3 + 1
	vStr2 = str
	vPnl1.Initialize("BackPanel")
	vPnl2.Initialize("")
	vPnl3.Initialize("")
	vImg1.Initialize("")
	vLbl1.Initialize("")
	Dim scrollViewWrapper As ScrollView = vScrollView1
	scrollViewWrapper.Initialize(DipToCurrent(0))
	vLbl2.Initialize("")
	vPnl4.Initialize("PressedButton")
	vPnl5.Initialize("PressedButton")
	vPnl6.Initialize("PressedButton")
	vLbl3.Initialize("")
	vLbl4.Initialize("")
	vLbl5.Initialize("")
	Dim view As View = vPnl1
	Dim vDipToCurrent2 As Int = DipToCurrent(0)
	Dim vDipToCurrent3 As Int = DipToCurrent(0)
	Dim vPerXToCurrent2 As Int = PerXToCurrent(100)
	activityWrapper.AddView(view, vDipToCurrent2, vDipToCurrent3, vPerXToCurrent2, PerYToCurrent(100))
	Dim panelWrapper As Panel = vPnl1
	panelWrapper.Color = Colors.ARGB(160, 0, 0, 0)
	Dim panelWrapper2 As Panel = vPnl1
	Dim view2 As View = vPnl2
	Dim vDipToCurrent4 As Int = DipToCurrent(0)
	Dim vDipToCurrent5 As Int = DipToCurrent(0)
	Dim vPerXToCurrent3 As Int = PerXToCurrent(100)
	panelWrapper2.AddView(view2, vDipToCurrent4, vDipToCurrent5, vPerXToCurrent3, PerYToCurrent(100))
	vPnl2.Width = d
	vPnl2.Height = d2
	Dim panelWrapper3 As Panel = vPnl2
	panelWrapper3.Color = -12303292
	Dim panelWrapper4 As Panel = vPnl2
	panelWrapper4.Left = (PerXToCurrent(100) - vPnl2.Width) / 2
	Dim panelWrapper5 As Panel = vPnl2
	panelWrapper5.Top = (PerYToCurrent(100) - vPnl2.Height) / 2
	Dim panelWrapper6 As Panel = vPnl1
	Dim view3 As View = vPnl3
	Dim left As Int = vPnl2.Left
	Dim vDipToCurrent6 As Int = left + DipToCurrent(5)
	Dim top As Int = vPnl2.Top
	panelWrapper6.AddView(view3, vDipToCurrent6, top + DipToCurrent(5), vPnl2.Width, vPnl2.Height)
	mod1.Sub161(vPnl3, 0)
	Dim panelWrapper7 As Panel = vPnl2
	Dim view4 As View = vImg1
	Dim vDipToCurrent7 As Int = DipToCurrent(5)
	Dim vDipToCurrent8 As Int = DipToCurrent(5)
	Dim vDipToCurrent9 As Int = DipToCurrent(50)
	panelWrapper7.AddView(view4, vDipToCurrent7, vDipToCurrent8, vDipToCurrent9, DipToCurrent(50))
	Dim panelWrapper8 As Panel = vPnl2
	Dim view5 As View = vLbl1
	Dim vDipToCurrent10 As Int = DipToCurrent(60)
	Dim vDipToCurrent11 As Int = DipToCurrent(0)
	Dim width As Int = vPnl2.Width
	panelWrapper8.AddView(view5, vDipToCurrent10, vDipToCurrent11, width, DipToCurrent(60))
	Dim panelWrapper9 As Panel = vPnl2
	Dim view6 As View = vScrollView1
	Dim vDipToCurrent12 As Int = DipToCurrent(5)
	Dim vDipToCurrent13 As Int = DipToCurrent(70)
	Dim width2 As Int = vPnl2.Width
	panelWrapper9.AddView(view6, vDipToCurrent12, vDipToCurrent13, width2, DipToCurrent(60))
	Dim panelWrapper10 As Panel = vPnl2
	Dim view7 As View = vPnl4
	Dim vDipToCurrent14 As Int = DipToCurrent(0)
	Dim height As Int = vPnl2.Height
	Dim vDipToCurrent15 As Int = height - DipToCurrent(50)
	Dim vDipToCurrent16 As Int = DipToCurrent(50)
	panelWrapper10.AddView(view7, vDipToCurrent14, vDipToCurrent15, vDipToCurrent16, DipToCurrent(50))
	Dim panelWrapper11 As Panel = vPnl2
	Dim view8 As View = vPnl5
	Dim vDipToCurrent17 As Int = DipToCurrent(0)
	Dim height2 As Int = vPnl2.Height
	Dim vDipToCurrent18 As Int = height2 - DipToCurrent(50)
	Dim vDipToCurrent19 As Int = DipToCurrent(50)
	panelWrapper11.AddView(view8, vDipToCurrent17, vDipToCurrent18, vDipToCurrent19, DipToCurrent(50))
	Dim panelWrapper12 As Panel = vPnl2
	Dim view9 As View = vPnl6
	Dim vDipToCurrent20 As Int = DipToCurrent(0)
	Dim height3 As Int = vPnl2.Height
	Dim vDipToCurrent21 As Int = height3 - DipToCurrent(50)
	Dim vDipToCurrent22 As Int = DipToCurrent(50)
	panelWrapper12.AddView(view9, vDipToCurrent20, vDipToCurrent21, vDipToCurrent22, DipToCurrent(50))
	Dim panel As Panel = vScrollView1.Panel
	Dim view10 As View = vLbl2
	Dim vDipToCurrent23 As Int = DipToCurrent(0)
	panel.AddView(view10, vDipToCurrent23, DipToCurrent(0), vScrollView1.Width, vScrollView1.Height)
	Dim labelWrapper As Label = vLbl2
	Dim top2 As Int = vPnl4.Top - vLbl2.Top
	labelWrapper.Height = top2 - DipToCurrent(10)
	Dim scrollViewWrapper2 As ScrollView = vScrollView1
	Dim top3 As Int = vPnl4.Top - vScrollView1.Top
	scrollViewWrapper2.Height = top3 - DipToCurrent(10)
	vScrollView1.Panel.Height = vScrollView1.Height
	If str2.ToUpperCase = "V" Then
		Dim panelWrapper13 As Panel = vPnl4
		Dim height4 As Int = vPnl2.Height
		panelWrapper13.Top = height4 - DipToCurrent(50) * i
		Dim panelWrapper14 As Panel = vPnl5
		Dim top4 As Int = vPnl4.Top
		panelWrapper14.Top = top4 + DipToCurrent(52)
		Dim panelWrapper15 As Panel = vPnl6
		Dim top5 As Int = vPnl5.Top
		panelWrapper15.Top = top5 + DipToCurrent(52)
	End If
	If bitmapWrapper.IsInitialized Then
		vImg1.SetBackgroundImageNew(bitmapWrapper)
	Else
		vLbl1.Text = vLbl1.Text.Trim
		Dim labelWrapper2 As Label = vLbl1
		labelWrapper2.Left = DipToCurrent(5)
	End If
	Dim labelWrapper3 As Label = vLbl1
	Dim width3 As Int = vPnl2.Width - vLbl1.Left
	labelWrapper3.Width = width3 - DipToCurrent(10)
	Dim labelWrapper4 As Label = vLbl1
	labelWrapper4.Gravity = 16
	Dim labelWrapper5 As Label = vLbl1
	labelWrapper5.TextColor = -16711681
	vLbl1.TextSize = vLbl1.TextSize * vNumberToString2 + 4
	Dim labelWrapper6 As Label = vLbl2
	Dim width4 As Int = vPnl2.Width - vLbl2.Left
	labelWrapper6.Width = width4 - DipToCurrent(10)
	Dim labelWrapper7 As Label = vLbl2
	labelWrapper7.TextColor = -1
	vLbl2.TextSize = vLbl2.TextSize * vNumberToString2 + 1
	If str2.ToUpperCase = "V" Then
		vNumberToString = vPnl2.Width
	Else
		vNumberToString = vPnl2.Width / i - 2
	End If
	Dim panelWrapper16 As Panel = vPnl4
	panelWrapper16.Color = -12303292
	vPnl4.Width = vNumberToString
	Dim panelWrapper17 As Panel = vPnl4
	panelWrapper17.Left = DipToCurrent(0)
	vPnl4.Tag = "SI"
	Dim panelWrapper18 As Panel = vPnl4
	Dim view11 As View = vLbl3
	Dim vDipToCurrent24 As Int = DipToCurrent(0)
	Dim vDipToCurrent25 As Int = DipToCurrent(0)
	Dim width5 As Int = vPnl4.Width
	panelWrapper18.AddView(view11, vDipToCurrent24, vDipToCurrent25, width5, DipToCurrent(30))
	Dim labelWrapper8 As Label = vLbl3
	labelWrapper8.Gravity = 1
	vLbl3.Top = (vPnl4.Height - vLbl3.Height) / 2 + DipToCurrent(5)
	Dim labelWrapper9 As Label = vLbl3
	labelWrapper9.TextColor = -1
	vLbl3.Text = "SI"
	Dim panelWrapper19 As Panel = vPnl5
	panelWrapper19.Color = -12303292
	vPnl5.Width = vNumberToString
	If str2.ToUpperCase = "V" Then
		Dim panelWrapper20 As Panel = vPnl5
		panelWrapper20.Left = DipToCurrent(0)
	Else
		Dim panelWrapper21 As Panel = vPnl5
		Dim width6 As Int = vPnl4.Width
		panelWrapper21.Left = width6 + DipToCurrent(4)
	End If
	vPnl5.Tag = "NO"
	Dim panelWrapper22 As Panel = vPnl5
	Dim view12 As View = vLbl4
	Dim vDipToCurrent26 As Int = DipToCurrent(0)
	Dim vDipToCurrent27 As Int = DipToCurrent(0)
	Dim width7 As Int = vPnl5.Width
	panelWrapper22.AddView(view12, vDipToCurrent26, vDipToCurrent27, width7, DipToCurrent(30))
	Dim labelWrapper10 As Label = vLbl4
	labelWrapper10.Gravity = 1
	vLbl4.Top = (vPnl5.Height - vLbl4.Height) / 2 + DipToCurrent(5)
	Dim labelWrapper11 As Label = vLbl4
	labelWrapper11.TextColor = -1
	vLbl4.Text = "No"
	Dim panelWrapper23 As Panel = vPnl6
	panelWrapper23.Color = -12303292
	vPnl6.Width = vNumberToString
	If str2.ToUpperCase = "V" Then
		Dim panelWrapper24 As Panel = vPnl6
		panelWrapper24.Left = DipToCurrent(0)
	Else
		Dim panelWrapper25 As Panel = vPnl6
		Dim width8 As Int = vPnl4.Width + vPnl5.Width
		panelWrapper25.Left = width8 + DipToCurrent(8)
	End If
	vPnl6.Tag = "ANNULLA"
	Dim panelWrapper26 As Panel = vPnl6
	Dim view13 As View = vLbl5
	Dim vDipToCurrent28 As Int = DipToCurrent(0)
	Dim vDipToCurrent29 As Int = DipToCurrent(0)
	Dim width9 As Int = vPnl6.Width
	panelWrapper26.AddView(view13, vDipToCurrent28, vDipToCurrent29, width9, DipToCurrent(30))
	Dim labelWrapper12 As Label = vLbl5
	labelWrapper12.Gravity = 1
	vLbl5.Top = (vPnl6.Height - vLbl5.Height) / 2 + DipToCurrent(5)
	Dim labelWrapper13 As Label = vLbl5
	labelWrapper13.TextColor = -1
	vLbl5.Text = "ANNULLA"
	Sub002(-16711681, -7829368)
End Sub

Sub Pressedbutton_Touch(i As Int, f As Float, f2 As Float)
	Dim panelWrapper As Panel
	Dim panelWrapper2 As Panel = Sender
	If i = 0 Then
		panelWrapper2.Color = Colors.ARGB(255, 0, 140, 140)
	End If
	If i = 1 Then
		panelWrapper2.Color = -12303292
		Dim panelWrapper3 As Panel = vPnl1
		panelWrapper3.Visible = False
		If SubExists(vObj1, vStr2 & "_Click") Then
			CallSubDelayed3(vObj1, vStr2 & "_Click", panelWrapper2.Tag, vStr3)
			Return
		End If
		Return
	End If
End Sub

Sub Sub001(str As String, str2 As String)
	Dim stringUtils As StringUtils
	Dim vNumberToString As String = 3
	Select str2.ToUpperCase
		Case "L"
			vNumberToString = 3
		Case "C"
			vNumberToString = 17
		Case "R"
			vNumberToString = 5
	End Select
	vLbl2.Text = str
	vLbl2.Gravity = vNumberToString
	vScrollView1.Panel.Height = stringUtils.MeasureMultilineTextHeight(vLbl2, vLbl2.Text)
	vLbl2.Height = stringUtils.MeasureMultilineTextHeight(vLbl2, vLbl2.Text)
End Sub

Sub Sub002(i As Int, i2 As Int)
	Dim canvasWrapper As Canvas
	canvasWrapper.Initialize(vPnl2)
	Dim vDipToCurrent As Float = DipToCurrent(0)
	Dim vDipToCurrent2 As Float = DipToCurrent(65)
	Dim vPerXToCurrent As Float = PerXToCurrent(100)
	canvasWrapper.DrawLine(vDipToCurrent, vDipToCurrent2, vPerXToCurrent, DipToCurrent(65), i, 3)
	Dim vDipToCurrent3 As Float = DipToCurrent(0)
	Dim top As Int = vPnl4.Top
	Dim vDipToCurrent4 As Float = top - DipToCurrent(2)
	Dim vPerXToCurrent2 As Float = PerXToCurrent(100)
	Dim top2 As Int = vPnl4.Top
	canvasWrapper.DrawLine(vDipToCurrent3, vDipToCurrent4, vPerXToCurrent2, top2 - DipToCurrent(2), i2, 1)
	If vInt1 = 2 And vStr1.ToUpperCase <> "V" Then
		Dim top3 As Int = vPnl4.Top
		canvasWrapper.DrawLine(vPnl2.Width / 2, top3 - DipToCurrent(2), vPnl2.Width / 2, vPnl2.Height, i2, 1)
	Else
		Dim vDipToCurrent5 As Float = DipToCurrent(0)
		Dim top4 As Int = vPnl5.Top
		Dim vDipToCurrent6 As Float = top4 - DipToCurrent(2)
		Dim width As Float = vPnl2.Width
		Dim top5 As Int = vPnl5.Top
		canvasWrapper.DrawLine(vDipToCurrent5, vDipToCurrent6, width, top5 - DipToCurrent(2), i2, 1)
	End If
	If vInt1 = 3 And vStr1.ToUpperCase <> "V" Then
		Dim top6 As Int = vPnl4.Top
		canvasWrapper.DrawLine(vPnl2.Width / 3, top6 - DipToCurrent(2), vPnl2.Width / 3, vPnl2.Height, i2, 1)
		Dim width2 As Float = vPnl2.Width / 3 + vPnl4.Width + DipToCurrent(3)
		Dim top7 As Int = vPnl4.Top
		canvasWrapper.DrawLine(width2, top7 - DipToCurrent(2), vPnl2.Width / 3 + vPnl4.Width + DipToCurrent(3), vPnl2.Height, i2, 1)
	Else
		Dim vDipToCurrent7 As Float = DipToCurrent(0)
		Dim top8 As Int = vPnl6.Top
		Dim vDipToCurrent8 As Float = top8 - DipToCurrent(2)
		Dim width3 As Float = vPnl2.Width
		Dim top9 As Int = vPnl6.Top
		canvasWrapper.DrawLine(vDipToCurrent7, vDipToCurrent8, width3, top9 - DipToCurrent(2), i2, 1)
	End If
	vPnl2.Invalidate
End Sub

Sub Sub003(i As Int)
	vPnl3.Color = i
End Sub

