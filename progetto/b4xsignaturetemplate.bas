B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vXUI1 As XUI
	Public vXv1 As B4XView
	Public vB4XCanvas1 As B4XCanvas
	Public vFlt1 As Float
	Public vFlt2 As Float
	Public vFlt3 As Float
	Public vInt1 As Int
	Public vInt2 As Int
	Public vInt3 As Int
	Public vBln1 As Boolean
	Public vB4XFont1 As B4XFont
	Public vInt4 As Int
End Sub

Sub dialogclosed(i As Int)
	Dim xui As XUI = vXUI1
	If i = -1 And vBln1 Then
		Dim vMeasureText As B4XRect = vB4XCanvas1.MeasureText("M", vB4XFont1)
		Dim bottom As Float = vB4XCanvas1.TargetRect.Bottom - vMeasureText.Height - vMeasureText.Top
		Dim vDipToCurrent As Int = bottom - DipToCurrent(2)
		Dim b4XCanvas As B4XCanvas = vB4XCanvas1
		Dim sb As String = SmartStringFormatter("datetime", DateTime.Now) & ""
		b4XCanvas.DrawText(sb, DipToCurrent(2), vDipToCurrent, vB4XFont1, vInt2, "LEFT")
		Return
	End If
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 As B4XBitmap
	Return vB4XCanvas1.CreateBitmap
End Sub

Sub getpanel(b4xdialogVar As b4xdialog) As B4XView
	Return vXv1
End Sub

Sub Initialize
	Dim xui As XUI = vXUI1
	vXv1 = XUI.CreatePanel("mBase")
	Dim b4XViewWrapper As B4XView = vXv1
	Dim vDipToCurrent As Int = DipToCurrent(300)
	b4XViewWrapper.SetLayoutAnimated(0, 0, 0, vDipToCurrent, DipToCurrent(200))
	vB4XCanvas1.Initialize(vXv1)
	Dim xui2 As XUI = vXUI1
	vB4XFont1 = XUI.CreateDefaultFont(14)
End Sub

Sub Mbase_Touch(i As Int, f As Float, f2 As Float)
	Dim valueOf As Int = i
	Dim b4XViewWrapper As B4XView = vXv1
	Dim b4XViewWrapper2 As B4XView = vXv1
	Select valueOf
		Case 0
			vFlt1 = f
			vFlt2 = f2
		Case 2
			vB4XCanvas1.DrawLine(vFlt1, vFlt2, f, f2, vInt1, vFlt3)
			vFlt1 = f
			vFlt2 = f2
			vB4XCanvas1.Invalidate
			vInt4 = vInt4 + 1
	End Select
End Sub

Sub Sub001(i As Int, i2 As Int)
	vXv1.SetLayoutAnimated(0, 0, 0, i, i2)
	vB4XCanvas1.Resize(i, i2)
End Sub

Sub show(b4xdialogVar As b4xdialog)
	Dim b4XCanvas As B4XCanvas = vB4XCanvas1
	Dim targetRect As B4XRect = vB4XCanvas1.TargetRect
	Dim i As Int = vInt3
	b4XCanvas.DrawRect(targetRect, i, True, 0)
	vB4XCanvas1.Invalidate
	vInt4 = 0
End Sub

