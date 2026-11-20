B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vXUI1 As XUI
	Public vXv1 As B4XView
	Public AnotherProgressBar1 As anotherprogressbar
	Public vObj1 As Object
	Public vInt1 As Int
	Public vInt2 As Int
End Sub

Sub dialogclosed(i As Int)
	vInt2 = vInt2 + 1
	CallSub2(vObj1, "DialogClosed", i)
End Sub

Sub getpanel(b4xdialogVar As b4xdialog) As B4XView
	If vXv1.NumberOfViews = 0 Then
		Dim b4XViewWrapper As B4XView
		Dim b4XViewWrapper2 As B4XView = CallSub2(vObj1, "GetPanel", b4xdialogVar)
		If b4XViewWrapper2.Parent.IsInitialized Then
			b4XViewWrapper2.RemoveViewFromParent
		End If
		Dim b4XViewWrapper3 As B4XView = vXv1
		Dim width As Int = b4XViewWrapper2.Width
		Dim height As Int = b4XViewWrapper2.Height
		b4XViewWrapper3.SetLayoutAnimated(0, 0, 0, width, height + DipToCurrent(19))
		vXv1.LoadLayout("TimedDialogTemplate")
		Dim b4XViewWrapper4 As B4XView = vXv1
		Dim xui As XUI = vXUI1
		b4XViewWrapper4.SetColorAndBorder(0, 0, 0, 0)
		Dim b4XViewWrapper5 As B4XView = vXv1
		Dim view As View = b4XViewWrapper2
		b4XViewWrapper5.AddView(view, 0, DipToCurrent(19), b4XViewWrapper2.Width, b4XViewWrapper2.Height)
	End If
	Return vXv1
End Sub

Sub Initialize(obj As Object)
	Dim xui As XUI = vXUI1
	vXv1 = XUI.CreatePanel("mBase")
	vObj1 = obj
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub show(dialog As b4xdialog)
	Dim myindex As Int
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				CallSub2(vObj1, "Show", dialog)
				AnotherProgressBar1.Sub001(0)
				AnotherProgressBar1.vFlt2 = 100 / (vInt1 / 1000)
				AnotherProgressBar1.setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(100)
				vInt2 = vInt2 + 1
				myindex = vInt2
				Sleep(vInt1)
				rsState = 5
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
				rsState = 4
				Dim b4xdialogVar As b4xdialog = dialog
				Dim xui As XUI = vXUI1
				b4xdialogVar.Sub002(-3)
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

