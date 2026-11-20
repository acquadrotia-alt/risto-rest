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
	Public vStr2 As String
	Public vInt1 As Int
	Public vB4XFont1 As B4XFont
	Public vB4XCanvas1 As B4XCanvas
	Public vObj2 As Object
	Public vInt2 As Int
	Public vInt3 As Int
	Public vInt4 As Int
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	vXv1.GetView(0).SetLayoutAnimated(0, 0, 0, d, d2)
	setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(vStr2)
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	Dim xui As XUI = vXUI1
	vXv1.AddView(XUI.CreatePanel(""), 0, 0, vXv1.Width, vXv1.Height)
	vStr2 = labelWrapper.Text
	Dim b4XViewWrapper As B4XView = labelWrapper
	vB4XFont1 = b4XViewWrapper.Font
	vInt4 = b4XViewWrapper.TextColor
	Dim i As Int = vInt4
	Dim xui2 As XUI = vXUI1
	If i = 0 Then
		Dim xui3 As XUI = vXUI1
		vInt4 = -16777216
	End If
	Dim xui4 As XUI = vXUI1
	Dim vCreatePanel As B4XView = XUI.CreatePanel("")
	Dim vDipToCurrent As Int = DipToCurrent(2)
	vCreatePanel.SetLayoutAnimated(0, 0, 0, vDipToCurrent, DipToCurrent(2))
	vB4XCanvas1.Initialize(vCreatePanel)
	setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(vStr2)
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 As String
	Return vStr2
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 As Int
	Return vInt4
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
End Sub

Sub Sub001(str As String, b4XFont As B4XFont) As Float
	Return vB4XCanvas1.MeasureText(str, b4XFont).Width
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(str As String)
	Dim b4XViewWrapper As B4XView
	Dim z As Boolean
	Dim b4XViewWrapper2 As B4XView
	Dim b4XViewWrapper3 As B4XView
	Dim b4XViewWrapper4 As B4XView = Null
	Dim vGetView As B4XView = vXv1.GetView(0)
	If vGetView.NumberOfViews > 0 Then
		b4XViewWrapper = vGetView.GetView(0)
		If b4XViewWrapper.Tag = "static" Then
			b4XViewWrapper.SetLayoutAnimated(0, 0, 0, vGetView.Width, vGetView.Height)
			b4XViewWrapper4 = b4XViewWrapper.GetView(0)
			b4XViewWrapper4.SetLayoutAnimated(0, 0, 0, vGetView.Width, vGetView.Height)
			z = False
		Else
			z = True
		End If
	Else
		b4XViewWrapper = Null
		z = True
	End If
	Dim vTmp As Float = Sub001(str, vB4XFont1)
	vStr2 = str
	If z Then
		vGetView.RemoveAllViews
		Dim xui As XUI = vXUI1
		Dim vCreatePanel As B4XView = XUI.CreatePanel("")
		vGetView.AddView(vCreatePanel, 0, 0, vGetView.Width, vGetView.Height)
		Dim labelWrapper As Label
		labelWrapper.Initialize("")
		labelWrapper.SingleLine = True
		labelWrapper.Padding = Array As Int(0, 0, 0, 0)
		b4XViewWrapper3 = labelWrapper
		b4XViewWrapper3.SetTextAlignment("CENTER", "LEFT")
		b4XViewWrapper3.Font = vB4XFont1
		vCreatePanel.AddView(b4XViewWrapper3, 0, 0, vXv1.Width, vXv1.Height)
		b4XViewWrapper2 = vCreatePanel
	Else
		b4XViewWrapper2 = b4XViewWrapper
		b4XViewWrapper3 = b4XViewWrapper4
	End If
	b4XViewWrapper3.TextColor = vInt4
	If vTmp <= vXv1.Width Then
		b4XViewWrapper3.Text = str
		b4XViewWrapper2.Tag = "static"
		Sub002()
		Return
	End If
	b4XViewWrapper2.Tag = ""
	Dim str2 As String = str & "   " & str
	Dim vTmp_ As Float = Sub001(str2, vB4XFont1)
	b4XViewWrapper2.Width = vTmp_
	b4XViewWrapper3.Width = vTmp_
	b4XViewWrapper3.Text = str2
	StartScrolling(b4XViewWrapper2, vTmp)
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(i As Int)
	vInt4 = i
	setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(vStr2)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub StartScrolling(p As B4XView, originalwidth As Float)
	Dim myindex As Int
	Dim duration As Int
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				vInt1 = vInt1 + 1
				myindex = vInt1
				duration = p.Width / vInt2 * 1000
				Sleep(vInt3)
				rsState = 23
				Continue
			Case 1
				rsState = 6
				If myindex = vInt1 Then
					Continue
				Else
					rsState = 3
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 6
				Return
			Case 6
				rsState = 7
				Continue
			Case 7
				rsState = 22
				rsState = 9
				Continue
			Case 9
				rsState = 10
				p.SetLayoutAnimated(duration, p.Width - originalwidth, p.Top, p.Width, p.Height)
				Sleep(duration)
				rsState = 24
				Continue
			Case 10
				rsState = 15
				If myindex = vInt1 Then
					Continue
				Else
					rsState = 12
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 12
			Case 12
				rsState = 15
				Return
			Case 15
				rsState = 16
				Sleep(vInt3)
				rsState = 25
				Continue
			Case 16
				rsState = 21
				If myindex = vInt1 Then
					Continue
				Else
					rsState = 18
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 18
			Case 18
				rsState = 21
				Return
			Case 21
				rsState = 7
				p.SetLayoutAnimated(0, 0, p.Top, p.Width, p.Height)
				Continue
			Case 22
				rsState = -1
				Continue
			Case 23
				rsState = 1
				Continue
			Case 24
				rsState = 10
				Continue
			Case 25
				rsState = 16
				Continue
		End Select
	Loop
End Sub

Sub Sub002
	vInt1 = vInt1 + 1
End Sub

