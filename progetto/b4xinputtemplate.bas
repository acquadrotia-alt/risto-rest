B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vXUI1 As XUI
	Public vXv1 As B4XView
	Public vStr1 As String
	Public vb4xdialog1 As b4xdialog
	Public vStr2 As String
	Public TextField1 As B4XView
	Public lblTitle As B4XView
	Public vIME1 As IME
	Public vBln1 As Boolean
	Public vInt1 As Int
	Public vInt2 As Int
End Sub

Sub Sub001(z As Boolean, z2 As Boolean)
	Dim editTextWrapper As EditText = TextField1
	If z Or z2 Then
		editTextWrapper.InputType = 12290
	Else
		editTextWrapper.InputType = 2
	End If
	If z And z2 Then
		vStr2 = "^-?(0|[1-9]\d*)?(\.\d+)?(?<=\d)$"
	Else
		If z Then
			If Not(z2) Then
				vStr2 = "^(0|[1-9]\d*)?(\.\d+)?(?<=\d)$"
			End If
		End If
		If Not(z) Then
			If z2 Then
				vStr2 = "^-?(0|[1-9]\d*)$"
			End If
		End If
		If Not(z) Then
			If Not(z2) Then
				vStr2 = "^(0|[1-9]\d*)$"
			End If
		End If
	End If
	vBln1 = z
End Sub

Sub dialogclosed(i As Int)
	Dim xui As XUI = vXUI1
	If i = -1 Then
		vStr1 = TextField1.Text
		Return
	End If
End Sub

Sub getpanel(b4xdialogVar As b4xdialog) As B4XView
	Return vXv1
End Sub

Sub Initialize
	Dim xui As XUI = vXUI1
	vXv1 = XUI.CreatePanel("mBase")
	Dim b4XViewWrapper As B4XView = vXv1
	Dim vDipToCurrent As Int = DipToCurrent(300)
	b4XViewWrapper.SetLayoutAnimated(0, 0, 0, vDipToCurrent, DipToCurrent(80))
	vXv1.LoadLayout("B4XInputTemplate")
	Dim b4XViewWrapper2 As B4XView = TextField1
	Dim xui2 As XUI = vXUI1
	b4XViewWrapper2.TextColor = -1
	vIME1.Initialize("")
	Dim javaObject As JavaObject = TextField1
	javaObject.RunMethod("setImeOptions", Array(Bit.Or(33554432, 6)))
	Sub003(vInt1)
End Sub

Sub Sub002(str As String) As Boolean
	If vStr2 <> "" Then
		If Not(Regex.IsMatch(vStr2, str)) Then
			Return False
		End If
	End If
	Return True
End Sub

Sub Sub003(i As Int)
	Dim b4XViewWrapper As B4XView = TextField1
	Dim xui As XUI = vXUI1
	Dim vDipToCurrent As Int = DipToCurrent(1)
	b4XViewWrapper.SetColorAndBorder(0, vDipToCurrent, i, DipToCurrent(2))
End Sub

Sub Sub004(i As Int, i2 As Int)
	vInt1 = i
	vInt2 = i2
	Sub003(vInt1)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub show(dialog As b4xdialog)
	Dim tf As EditText
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = -1
				vb4xdialog1 = dialog
				Dim b4xdialogVar As b4xdialog = vb4xdialog1
				Dim xui As XUI = vXUI1
				If Not(XUI.IsB4A) Then
					Dim xui2 As XUI = vXUI1
					If Not(XUI.IsB4i) Then
						z = False
						b4xdialogVar.vBln2 = z
						Sleep(20)
						rsState = 1
						Continue
					End If
				End If
				z = True
				b4xdialogVar.vBln2 = z
				Sleep(20)
				rsState = 1
				Continue
			Case 1
				rsState = -1
				TextField1.Text = vStr1
				Sub005(vStr1)
				TextField1.RequestFocus
				'tf = EditText
				tf = TextField1
				tf.SelectAll
				vIME1.ShowKeyboard(TextField1)
				Continue
		End Select
	Loop
End Sub

Sub textfield1_action
	textfield1_enterpressed()
End Sub

Sub TextField1_EnterPressed
	If Sub002(TextField1.Text) Then
		Dim b4xdialogVar As b4xdialog = vb4xdialog1
		Dim xui As XUI = vXUI1
		b4xdialogVar.Sub002(-1)
		Return
	End If
End Sub

Sub TextField1_TextChanged(str As String, str2 As String)
	Sub005(str2)
End Sub

Sub Sub005(str As String)
	Dim i As Int
	Dim z As Boolean
	Dim i2 As Int = vInt1
	Dim vTmp As Boolean = Sub002(str)
	If vTmp Then
		i = i2
		z = True
	Else
		If str.Length > 0 Then
			i2 = vInt2
		End If
		i = i2
		z = False
	End If
	Dim b4xdialogVar As b4xdialog = vb4xdialog1
	Dim xui As XUI = vXUI1
	b4xdialogVar.Sub009(-1, z)
	Sub003(i)
End Sub

