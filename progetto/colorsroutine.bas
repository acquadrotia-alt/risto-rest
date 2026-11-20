B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
Sub Process_Globals
End Sub

Sub Sub001(i As Int) As Int()
	Return Array As Int(Bit.UnsignedShiftRight(Bit.And(i, -16777216), 24), Bit.UnsignedShiftRight(Bit.And(i, 16711680), 16), Bit.UnsignedShiftRight(Bit.And(i, 65280), 8), Bit.And(i, 255))
End Sub

Sub hsb_to_color(d As Double, d2 As Double, d3 As Double) As Int
	Dim i As Int = 0
	Dim i2 As Int = 0
	Dim i3 As Int = 0
	Dim d4 As Double = d / 60
	Dim d5 As Double = 255 * d2 / 100
	Dim d6 As Double = 255 * d3 / 100
	If d5 = 0 Then
		i = d6
		i2 = d6
		i3 = d6
	Else
		Dim d7 As Double = d5 * d6 / 255
		If d4 > 3 Then
			i3 = Round(d6)
			If d4 > 4 Then
				i2 = Round(d6 - d7)
				i = Round((d4 - 4) * d7) + i2
			Else
				i = Round(d6 - d7)
				i2 = i - Round((d4 - 4) * d7)
			End If
		Else If d4 > 1 Then
			i2 = Round(d6)
			If d4 > 2 Then
				i = Round(d6 - d7)
				i3 = Round((d4 - 2) * d7) + i
			Else
				i3 = Round(d6 - d7)
				i = i3 - Round((d4 - 2) * d7)
			End If
		Else If d4 > -1 Then
			i = Round(d6)
			If d4 > 0 Then
				i3 = Round(d6 - d7)
				i2 = Round(d4 * d7) + i3
			Else
				i2 = Round(d6 - d7)
				i3 = i2 - Round(d4 * d7)
			End If
		End If
	End If
	Return Colors.RGB(i, i2, i3)
End Sub

Sub rgb_to_hsb(i As Int, i2 As Int, i3 As Int) As Double()
	Dim d As Double
	Dim dArr(3) As Double
	Dim d2 As Double = 0
	Dim vMin As Double = Min(Min(i, i2), i3)
	Dim vMax As Double = Max(Max(i, i2), i3)
	Dim d3 As Double = vMax - vMin
	If vMax <> 0 Then
		d = 255 * d3 / vMax
	Else
		d = 0
	End If
	If d = 0 Then
		d2 = -1
	Else If i = vMax Then
		d2 = (i2 - i3) / d3
	Else If i2 = vMax Then
		d2 = 2 + (i3 - i) / d3
	Else If i3 = vMax Then
		d2 = 4 + (i - i2) / d3
	End If
	Dim d4 As Double = d2 * 60
	If d4 < 0 Then
		d4 = d4 + 360
	End If
	dArr(0) = d4
	dArr(1) = d * 100 / 255
	dArr(2) = 100 * vMax / 255
	Return dArr
End Sub

