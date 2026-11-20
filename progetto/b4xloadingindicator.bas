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
	Public vB4XCanvas1 As B4XCanvas
	Public vInt3 As Int
	Public vStr2 As String
	Public vObj2 As Object
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	vB4XCanvas1.Resize(d, d2)
	MainLoop()
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	Dim xui As XUI = vXUI1
	vInt1 = XUI.PaintOrColorToColor(map.Get("Color"))
	Dim vObjectToString As String = map.Get("IndicatorStyle")
	vInt3 = map.Get("Duration")
	vStr2 = "Draw_" & vObjectToString.Replace(" ", "")
	vB4XCanvas1.Initialize(vXv1)
	MainLoop()
End Sub

Sub draw_arc1(f As Float)
	Dim b4XPath As B4XPath
	Dim centerX As Float = vB4XCanvas1.TargetRect.CenterX
	Dim vDipToCurrent As Float = centerX - DipToCurrent(5)
	If f < 0.5 Then
		b4XPath.InitializeArc(vB4XCanvas1.TargetRect.CenterX, vB4XCanvas1.TargetRect.CenterY, vDipToCurrent, -90, f * 2 * 360)
	Else
		b4XPath.InitializeArc(vB4XCanvas1.TargetRect.CenterX, vB4XCanvas1.TargetRect.CenterY, vDipToCurrent, -90, (1 - f) * 2 * 360)
	End If
	vB4XCanvas1.ClipPath(b4XPath)
	Dim b4XCanvas As B4XCanvas = vB4XCanvas1
	Dim targetRect As B4XRect = vB4XCanvas1.TargetRect
	Dim i As Int = vInt1
	b4XCanvas.DrawRect(targetRect, i, True, 0)
	vB4XCanvas1.RemoveClip
End Sub

Sub draw_arc2(f As Float)
	Dim b4XPath As B4XPath
	Dim centerX As Float = vB4XCanvas1.TargetRect.CenterX
	Dim vDipToCurrent As Float = centerX - DipToCurrent(5)
	If f < 0.5 Then
		b4XPath.InitializeArc(vB4XCanvas1.TargetRect.CenterX, vB4XCanvas1.TargetRect.CenterY, vDipToCurrent, -90, 2 * f * 360)
	Else
		b4XPath.InitializeArc(vB4XCanvas1.TargetRect.CenterX, vB4XCanvas1.TargetRect.CenterY, vDipToCurrent, -90, 360 - (f - 0.5) * 2 * 360)
	End If
	vB4XCanvas1.ClipPath(b4XPath)
	Dim b4XCanvas As B4XCanvas = vB4XCanvas1
	Dim targetRect As B4XRect = vB4XCanvas1.TargetRect
	Dim i As Int = vInt1
	b4XCanvas.DrawRect(targetRect, i, True, 0)
	vB4XCanvas1.RemoveClip
End Sub

Sub draw_fivelines1(f As Float)
	Dim vDipToCurrent As Int = DipToCurrent(10)
	Dim height As Int = vB4XCanvas1.TargetRect.Height / 2
	Dim width As Float = vB4XCanvas1.TargetRect.Width
	Dim vDipToCurrent2 As Int = (width - DipToCurrent(2)) / 5
	Dim i As Int = 0
	Do While True
		Dim i2 As Int = i
		If i2 <= 4 Then
			Dim vSinD As Float = vDipToCurrent + height / 2 + height / 2 * SinD(360 * f - i2 * 30)
			Dim b4XCanvas As B4XCanvas = vB4XCanvas1
			Dim vDipToCurrent3 As Float = DipToCurrent(2) + i2 * vDipToCurrent2
			Dim centerY As Float = vB4XCanvas1.TargetRect.CenterY - vSinD
			Dim vDipToCurrent4 As Float = DipToCurrent(2) + i2 * vDipToCurrent2
			Dim centerY2 As Float = vSinD + vB4XCanvas1.TargetRect.CenterY
			Dim i3 As Int = vInt1
			b4XCanvas.DrawLine(vDipToCurrent3, centerY, vDipToCurrent4, centerY2, i3, DipToCurrent(4))
			i = i2 + 1
		Else
			Return
		End If
	Loop
End Sub

Sub draw_pacman(f As Float)
	Dim vDipToCurrent As Int = DipToCurrent(5)
	Dim b4XCanvas As B4XCanvas = vB4XCanvas1
	Dim width As Float = vB4XCanvas1.TargetRect.Width - vDipToCurrent
	Dim centerX As Float = vB4XCanvas1.TargetRect.CenterX
	Dim vTmp As Int = Sub002(vInt1, 255 - 200 * f)
	b4XCanvas.DrawCircle(width - (centerX - DipToCurrent(10)) * f, vB4XCanvas1.TargetRect.CenterY, vDipToCurrent, vTmp, True, 0)
	Dim b4XPath As B4XPath
	Dim vSinD As Int = 70 * SinD(180 * f)
	Dim centerX2 As Float = vB4XCanvas1.TargetRect.CenterX
	Dim vDipToCurrent2 As Int = centerX2 - DipToCurrent(5)
	Dim centerY As Int = vB4XCanvas1.TargetRect.CenterY
	Dim centerY2 As Float = vB4XCanvas1.TargetRect.CenterY
	Dim vDipToCurrent3 As Int = centerY2 - DipToCurrent(5)
	If vSinD = 0 Then
		Dim i As Int = vInt1
		vB4XCanvas1.DrawCircle(vDipToCurrent2, centerY, vDipToCurrent3, i, True, 0)
		Return
	End If
	b4XPath.InitializeArc(vDipToCurrent2, centerY, vDipToCurrent3, vSinD / 2, -(360 - vSinD))
	vB4XCanvas1.ClipPath(b4XPath)
	Dim b4XCanvas2 As B4XCanvas = vB4XCanvas1
	Dim targetRect As B4XRect = vB4XCanvas1.TargetRect
	Dim i2 As Int = vInt1
	b4XCanvas2.DrawRect(targetRect, i2, True, 0)
	vB4XCanvas1.RemoveClip
End Sub

Sub draw_singlecircle(f As Float)
	Dim i As Int = 0
	Do While True
		Dim i2 As Int = i
		If i2 <= 2 Then
			Dim b4XCanvas As B4XCanvas = vB4XCanvas1
			Dim centerX As Float = vB4XCanvas1.TargetRect.CenterX
			Dim centerY As Float = vB4XCanvas1.TargetRect.CenterY
			Dim centerX2 As Float = vB4XCanvas1.TargetRect.CenterX * f
			Dim vTmp As Int = Sub002(vInt1, 255 - 255 * f)
			b4XCanvas.DrawCircle(centerX, centerY, centerX2, vTmp, True, 0)
			i = i2 + 1
		Else
			Return
		End If
	Loop
End Sub

Sub draw_threecircles1(f As Float)
	Dim width As Float = (vB4XCanvas1.TargetRect.Width / 2 - DipToCurrent(20)) / 2
	Dim vSin As Float = width * Sin(2 * f * 3.141592653589793) + DipToCurrent(10) + width
	Dim i As Int = 0
	Do While True
		Dim i2 As Int = i
		If i2 <= 2 Then
			Dim i3 As Int = i2 * 120 + 360 * f
			Dim b4XCanvas As B4XCanvas = vB4XCanvas1
			Dim centerX As Double = vB4XCanvas1.TargetRect.CenterX
			Dim vSinD As Float = centerX + vSin * SinD(i3)
			Dim centerY As Double = vB4XCanvas1.TargetRect.CenterY
			Dim vCosD As Float = CosD(i3) * vSin + centerY
			Dim vDipToCurrent As Float = DipToCurrent(7)
			Dim i4 As Int = vInt1
			b4XCanvas.DrawCircle(vSinD, vCosD, vDipToCurrent, i4, True, DipToCurrent(1))
			i = i2 + 1
		Else
			Return
		End If
	Loop
End Sub

Sub draw_threecircles2(f As Float)
	Dim vDipToCurrent As Int = DipToCurrent(5)
	Dim width As Int = vB4XCanvas1.TargetRect.Width / 2 / 3 - vDipToCurrent - DipToCurrent(2)
	Dim i As Int
	For i = 0 To 2
		Dim vSinD As Float = vDipToCurrent + width / 2 + width / 2 * SinD(360 * f - i * 60)
		Dim b4XCanvas As B4XCanvas = vB4XCanvas1
		Dim vDipToCurrent2 As Float = width + vDipToCurrent + (vDipToCurrent + width + DipToCurrent(2)) * 2 * i
		Dim centerY As Float = vB4XCanvas1.TargetRect.CenterY
		Dim i2 As Int = vInt1
		b4XCanvas.DrawCircle(vDipToCurrent2, centerY, vSinD, i2, True, 0)
	Next
End Sub

Sub Sub001
	Dim b4XViewWrapper As B4XView = vXv1
	b4XViewWrapper.Visible = False
	vInt2 = vInt2 + 1
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub MainLoop
	Dim myindex As Int
	Dim n As Long
	Dim progress As Float
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				vInt2 = vInt2 + 1
				myindex = vInt2
				n = DateTime.Now
				Continue
			Case 1
				rsState = 4
				If myindex <> vInt2 Then
					Continue
				Else
					rsState = 3
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 1
				progress = (DateTime.Now - n) / vInt3
				Dim d As Double = progress
				progress = d - Floor(progress)
				vB4XCanvas1.ClearRect(vB4XCanvas1.TargetRect)
				CallSub2(Me, vStr2, progress)
				vB4XCanvas1.Invalidate
				Sleep(10)
				rsState = 5
				Continue
			Case 4
				rsState = -1
				Continue
			Case 5
				rsState = 1
				Continue
		End Select
	Loop
End Sub

Sub Sub002(i As Int, i2 As Int) As Int
	Dim vAnd As Int = Bit.And(16777215, i)
	Return vAnd + Bit.ShiftLeft(i2, 24)
End Sub

Sub show
	Dim b4XViewWrapper As B4XView = vXv1
	b4XViewWrapper.Visible = True
	MainLoop()
End Sub

