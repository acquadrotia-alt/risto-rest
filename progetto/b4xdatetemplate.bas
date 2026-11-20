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
	Public vFlt1 As Float
	Public vFlt2 As Float
	Public vFlt3 As Float
	Public vInt3 As Int
	Public vInt4 As Int
	Public vInt5 As Int
	Public DaysPaneBg As B4XView
	Public DaysPaneFg As B4XView
	Public vB4XCanvas1 As B4XCanvas
	Public vB4XCanvas2 As B4XCanvas
	Public vLng1 As Long
	Public vLng2 As Long
	Public vInt6 As Int
	Public vInt7 As Int
	Public vInt8 As Int
	Public vInt9 As Int
	Public vInt10 As Int
	Public vInt11 As Int
	Public vInt12 As Int
	Public vB4XCanvas3 As B4XCanvas
	Public DaysTitlesPane As B4XView
	Public vInt13 As Int
	Public vInt14 As Int
	Public vInt15 As Int
	Public btnMonthLeft As B4XView
	Public btnMonthRight As B4XView
	Public btnYearLeft As B4XView
	Public btnYearRight As B4XView
	Public lblMonth As B4XView
	Public lblYear As B4XView
	Public vXv1 As B4XView
	Public vLst1 As List
	Public vb4xdialog1 As b4xdialog
	Public vBln1 As Boolean
	Public vLst2 As List
End Sub

Sub btnMonth_Click
	Dim b4XViewWrapper As B4XView
	vInt1 = (Sender.Tag + (vInt1 + 12 - 1)) Mod 12 + 1
	Sub002()
End Sub

Sub btnYear_Click
	Dim b4XViewWrapper As B4XView
	vInt2 = Sender.Tag + vInt2
	Sub002()
End Sub

Sub DaysPaneFg_Touch(i As Int, f As Float, f2 As Float)
	Dim b4XViewWrapper As B4XView = DaysPaneFg
	Sub003(f, f2, i <> 1)
End Sub

Sub dialogclosed(i As Int)
	Dim xui As XUI = vXUI1
	If i <> -1 Then
		setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(vLng2)
		Return
	End If
End Sub

Sub Sub001(b4XCanvas As B4XCanvas, i As Int, i2 As Int, i3 As Int)
	Dim b4XRect As B4XRect
	b4XRect.Initialize(i2 * vFlt1, i3 * vFlt2, i2 * vFlt1 + vFlt1, i3 * vFlt2 + vFlt2)
	b4XCanvas.DrawRect(b4XRect, i, True, DipToCurrent(1))
End Sub

Sub Sub002
	lblMonth.Text = vLst1.Get(vInt1 - 1)
	lblYear.Text = vInt2
	Sub006()
	vB4XCanvas1.ClearRect(vB4XCanvas1.TargetRect)
	vB4XCanvas2.ClearRect(vB4XCanvas2.TargetRect)
	Dim setdate As Long = DateUtils.setdate(vInt2, vInt1, 1) - 1
	vInt4 = (DateTime.GetDayOfWeek(setdate) + 7 - vInt13) Mod 7
	vInt5 = DateUtils.numberofdaysinmonth(vInt1, vInt2)
	If vInt2 = vInt6 And vInt1 = vInt7 Then
		Sub001(vB4XCanvas1, vInt10, (vInt8 - 1 + vInt4) Mod 7, (vInt8 - 1 + vInt4) / 7)
	End If
	Dim xui As XUI = vXUI1
	Dim vCreateDefaultBoldFont As B4XFont = XUI.CreateDefaultBoldFont(14)
	Dim i As Int = vInt5
	Dim i2 As Int
	For i2 = 1 To i
		vB4XCanvas1.DrawText(i2, ((vInt4 + i2 - 1) Mod 7 + 0.5) * vFlt1, ((i2 - 1 + vInt4) / 7 + 0.5) * vFlt2 + vFlt3, vCreateDefaultBoldFont, vInt11, "CENTER")
	Next
	vB4XCanvas2.Invalidate
	vB4XCanvas1.Invalidate
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3 As Long
	Return vLng1
End Sub

Sub getpanel(b4xdialogVar As b4xdialog) As B4XView
	Return vXv1
End Sub

Sub Sub003(d As Double, d2 As Double, z As Boolean)
	Dim i As Int = d / vFlt1
	Dim i2 As Int = d2 / vFlt2
	Dim i3 As Int = i2 * 7 + i + 1 - vInt4
	Dim z2 As Boolean = i3 > 0 And i3 <= vInt5
	If z Then
		If i3 = vInt3 Then
			Return
		End If
		vB4XCanvas2.ClearRect(vB4XCanvas2.TargetRect)
		vInt3 = i3
		If z2 Then
			Sub001(vB4XCanvas2, vInt9, i, i2)
		End If
	Else
		vB4XCanvas2.ClearRect(vB4XCanvas2.TargetRect)
		If z2 Then
			Sub005(i3)
			If vBln1 Then
				Sub004()
			Else
				Sub002()
			End If
		End If
	End If
	vB4XCanvas2.Invalidate
End Sub

Sub Sub004
	Dim b4xdialogVar As b4xdialog = vb4xdialog1
	Dim xui As XUI = vXUI1
	b4xdialogVar.Sub002(-1)
End Sub

Sub Initialize
	Dim xui As XUI = vXUI1
	vXv1 = XUI.CreatePanel("")
	Dim b4XViewWrapper As B4XView = vXv1
	Dim vDipToCurrent As Int = DipToCurrent(320)
	b4XViewWrapper.SetLayoutAnimated(0, 0, 0, vDipToCurrent, DipToCurrent(300))
	vXv1.LoadLayout("DateTemplate")
	vXv1.Tag = Me
	vInt1 = DateTime.GetMonth(DateTime.Now)
	vInt2 = DateTime.GetYear(DateTime.Now)
	vLst1 = DateUtils.getmonthsnames()
	vLng1 = DateTime.Now
	setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(vLng1)
	vB4XCanvas1.Initialize(DaysPaneFg)
	vB4XCanvas2.Initialize(DaysPaneBg)
	vFlt1 = vB4XCanvas1.TargetRect.Width / 7
	vFlt2 = vB4XCanvas1.TargetRect.Height / 6
	vFlt3 = DipToCurrent(5)
	vB4XCanvas3.Initialize(DaysTitlesPane)
	vLst2.Initialize
	Dim list As List = vLst2
	list.AddAll(DateUtils.getdaysnames())
End Sub

Sub Sub005(i As Int)
	vLng1 = DateUtils.setdate(vInt2, vInt1, i)
	vInt8 = i
	vInt7 = vInt1
	vInt6 = vInt2
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(j As Long)
	Dim vIsInitialized As Boolean = lblYear.IsInitialized
	If Not(vIsInitialized) Then
		vLng1 = j
		Return
	End If
	vInt2 = DateTime.GetYear(j)
	vInt1 = DateTime.GetMonth(j)
	Sub005(DateTime.GetDayOfMonth(j))
	lblYear.Text = vInt2
	lblMonth.Text = vLst1.Get(vInt1 - 1)
End Sub

Sub Sub006
	btnYearLeft.Enabled = vInt2 > vInt14
	btnYearRight.Enabled = vInt2 < vInt15
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub show(dialog As b4xdialog)
	Dim limit4 As Int
	Dim step4 As Int
	Dim days As List
	Dim daysfont As B4XFont
	Dim i As Int
	Dim d As String
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				'days = List
				days = vLst2
				Dim xui As XUI = vXUI1
				daysfont = XUI.CreateDefaultBoldFont(14)
				vB4XCanvas3.ClearRect(vB4XCanvas3.TargetRect)
				Continue
			Case 1
				rsState = 10
				step4 = 1
				limit4 = vInt13 + 7 - 1
				i = vInt13
				rsState = 11
				Continue
			Case 3
				rsState = 4
				d = days.Get(i Mod 7)
				Continue
			Case 4
				rsState = 9
				If d.Length <= 2 Then
					Continue
				Else
					rsState = 6
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 6
			Case 6
				rsState = 9
				d = d.SubString2(0, 2)
				Continue
			Case 9
				rsState = 12
				vB4XCanvas3.DrawText(d, (i - vInt13 + 0.5) * vFlt1, DipToCurrent(20), daysfont, vInt12, "CENTER")
				Continue
			Case 10
				rsState = -1
				vB4XCanvas3.Invalidate
				vb4xdialog1 = dialog
				Sub002()
				vLng2 = vLng1
				Sleep(0)
				rsState = 13
				Continue
			Case 11
				rsState = 10
				If (step4 > 0 And i <= limit4) Or (step4 < 0 And i >= limit4) Then
					rsState = 3
					Continue
				End If
				Continue
			Case 12
				rsState = 11
				i = i + 0 + step4
				Continue
			Case 13
				rsState = -1
				Sub006()
				Continue
		End Select
	Loop
End Sub

