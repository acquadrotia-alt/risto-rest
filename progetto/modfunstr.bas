B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
Sub Process_Globals
End Sub

Sub left(str As String, j As Long) As String
	If j > str.Length Then
		j = str.Length
	End If
	Return str.SubString2(0, j)
End Sub

Sub Sub001(str As String) As Long
	Return str.Length
End Sub

Sub Sub002(str As String, i As Int, i2 As Int) As String
	Return str.SubString2(i - 1, i + i2 - 1)
End Sub

Sub Sub003(str As String, j As Long) As String
	If j > str.Length Then
		j = str.Length
	End If
	Return str.SubString(str.Length - j)
End Sub

Sub Sub004(i As Int) As String
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	Dim i2 As Int
	For i2 = 1 To i
		stringBuilderWrapper.Append(" ")
	Next
	Return stringBuilderWrapper.ToString
End Sub

Sub Sub005(str As String) As String
	Return str.Trim
End Sub

Sub Sub006(str As String) As Double
	Do While Not(IsNumber(Sub003(str, 1))) And Sub001(str) > 0
		str = left(str, Sub001(str) - 1)
	Loop
	If Sub001(str) > 0 Then
		Return 0 + str
	End If
	Return 0
End Sub

