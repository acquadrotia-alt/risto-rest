B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Type b4xformatdata(DecimalPoint As String, FormatFont As B4XFont, FractionPaddingChar As String, GroupingCharacter As String, IntegerPaddingChar As String, MaximumFractions As Int, MinimumFractions As Int, MinimumIntegers As Int, Postfix As String, Prefix As String, RangeEnd As Double, RangeStart As Double, RemoveMinusSign As Boolean, TextColor As Int)
	Public vLst1 As List
	Public max_value As Int
	Public min_value As Int
	Public vXUI1 As XUI
End Sub

Sub Sub001(b4xformatdataVar As b4xformatdata, d As Double, d2 As Double, z As Boolean)
	Dim vPower As Double = Power(10, -b4xformatdataVar.MaximumFractions)
	If Not(z) Then
		d = d + vPower
		d2 = d2 - vPower
	End If
	b4xformatdataVar.RangeStart = d - vPower / 2
	b4xformatdataVar.RangeEnd = vPower / 2 + d2
	vLst1.Add(b4xformatdataVar)
End Sub

Sub Sub002(b4xformatdataVar As b4xformatdata) As b4xformatdata
	Dim b4xformatdataVar2 As b4xformatdata
	b4xformatdataVar2.Initialize
	b4xformatdataVar2.DecimalPoint = b4xformatdataVar.DecimalPoint
	If b4xformatdataVar.FormatFont.IsInitialized Then
		Dim xui As XUI = vXUI1
		b4xformatdataVar2.FormatFont = XUI.CreateFont(b4xformatdataVar.FormatFont.ToNativeFont, b4xformatdataVar.FormatFont.Size)
	End If
	b4xformatdataVar2.GroupingCharacter = b4xformatdataVar.GroupingCharacter
	b4xformatdataVar2.MaximumFractions = b4xformatdataVar.MaximumFractions
	b4xformatdataVar2.MinimumFractions = b4xformatdataVar.MinimumFractions
	b4xformatdataVar2.MinimumIntegers = b4xformatdataVar.MinimumIntegers
	b4xformatdataVar2.Postfix = b4xformatdataVar.Postfix
	b4xformatdataVar2.Prefix = b4xformatdataVar.Prefix
	b4xformatdataVar2.RangeEnd = b4xformatdataVar.RangeEnd
	b4xformatdataVar2.RangeStart = b4xformatdataVar.RangeStart
	b4xformatdataVar2.RemoveMinusSign = b4xformatdataVar.RemoveMinusSign
	b4xformatdataVar2.TextColor = b4xformatdataVar.TextColor
	b4xformatdataVar2.FractionPaddingChar = b4xformatdataVar.FractionPaddingChar
	b4xformatdataVar2.IntegerPaddingChar = b4xformatdataVar.IntegerPaddingChar
	Return b4xformatdataVar2
End Sub

Sub Sub003 As b4xformatdata
	Dim b4xformatdataVar As b4xformatdata
	b4xformatdataVar.Initialize
	b4xformatdataVar.GroupingCharacter = ","
	b4xformatdataVar.DecimalPoint = "."
	b4xformatdataVar.MaximumFractions = 3
	b4xformatdataVar.MinimumIntegers = 1
	b4xformatdataVar.IntegerPaddingChar = "0"
	b4xformatdataVar.FractionPaddingChar = "0"
	Return b4xformatdataVar
End Sub

Sub Sub004(d As Double) As String
	If d < min_value Or d > max_value Then
		Return "OVERFLOW"
	End If
	Dim vTmp As b4xformatdata = Sub007(d)
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	stringBuilderWrapper.Append(vTmp.Prefix)
	Dim length As Int = stringBuilderWrapper.Length
	Dim vPower As Double = Power(10, vTmp.MaximumFractions - 1) * 5
	If d < vPower Then
		If Not(vTmp.RemoveMinusSign) Then
			stringBuilderWrapper.Append("-")
			length = length + 1
		End If
	End If
	Dim vAbs As Double = Abs(d) + vPower
	Dim i As Int = vAbs
	Dim d2 As Double = vAbs - i
	Dim i2 As Int = 0
	Do While i > 0
		If i2 > 0 And i2 Mod 3 = 0 And vTmp.GroupingCharacter.Length > 0 Then
			stringBuilderWrapper.Insert(length, vTmp.GroupingCharacter)
		End If
		i2 = i2 + 1
		stringBuilderWrapper.Insert(length, i Mod 10)
		i = i / 10
	Loop
	Do While stringBuilderWrapper.Length - length < vTmp.MinimumIntegers
		stringBuilderWrapper.Insert(length, vTmp.IntegerPaddingChar)
	Loop
	If vTmp.MaximumFractions > 0 And (vTmp.MinimumFractions > 0 Or d2 > 0) Then
		Dim length2 As Int = stringBuilderWrapper.Length
		Dim i3 As Int = 0
		Dim i4 As Int = 10
		Do While d2 >= 2 * vPower And stringBuilderWrapper.Length - length2 < vTmp.MaximumFractions
			Dim i5 As Int = i4 * d2 Mod 10
			If i5 = 0 Then
				i3 = i3 + 1
			Else
				i3 = 0
			End If
			stringBuilderWrapper.Append(i5)
			i4 = i4 * 10
		Loop
		If vTmp.FractionPaddingChar <> "0" And i3 > 0 Then
			stringBuilderWrapper.Remove(stringBuilderWrapper.Length - i3, stringBuilderWrapper.Length)
			i3 = 0
		End If
		Do While stringBuilderWrapper.Length - length2 < vTmp.MinimumFractions
			stringBuilderWrapper.Append(vTmp.FractionPaddingChar)
			i3 = 0
		Loop
		Dim vMin As Int = Min(i3, stringBuilderWrapper.Length - length2 - vTmp.MinimumFractions)
		If vMin > 0 Then
			stringBuilderWrapper.Remove(stringBuilderWrapper.Length - vMin, stringBuilderWrapper.Length)
		End If
		If stringBuilderWrapper.Length > length2 Then
			stringBuilderWrapper.Insert(length2, vTmp.DecimalPoint)
		End If
	End If
	stringBuilderWrapper.Append(vTmp.Postfix)
	Return stringBuilderWrapper.ToString
End Sub

Sub Sub005(d As Double, b4XViewWrapper As B4XView)
	b4XViewWrapper.Text = Sub004(d)
	Dim vTmp As b4xformatdata = Sub007(d)
	If vTmp.TextColor <> 0 Then
		b4XViewWrapper.TextColor = vTmp.TextColor
	End If
	If vTmp.FormatFont.IsInitialized Then
		b4XViewWrapper.Font = vTmp.FormatFont
		Return
	End If
End Sub

Sub Sub006 As b4xformatdata
	Return vLst1.Get(0)
End Sub

Sub Sub007(d As Double) As b4xformatdata
	Dim size As Int = vLst1.Size - 1
	Do While True
		Dim i As Int = size
		If i >= 1 Then
			Dim b4xformatdataVar As b4xformatdata = vLst1.Get(i)
			If d > b4xformatdataVar.RangeEnd Or d < b4xformatdataVar.RangeStart Then
				size = i - 1
			Else
				Return b4xformatdataVar
			End If
		Else
			Return vLst1.Get(0)
		End If
	Loop
End Sub

Sub Initialize
	vLst1.Initialize
	Dim vTmp As b4xformatdata = Sub003()
	Dim d As Double = min_value
	Dim d2 As Double = max_value
	Sub001(vTmp, d, d2, True)
End Sub

Sub Sub008 As b4xformatdata
	Return Sub002(Sub006())
End Sub

