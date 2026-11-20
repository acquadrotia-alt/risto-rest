B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vXUI1 As XUI
	Public vXv1 As B4XView
	Public CustomListView1 As CustomListView
	Public vLst1 As List
	Public vStr1 As String
	Public vb4xdialog1 As b4xdialog
	Public vBln1 As Boolean
	Public vInt1 As Int
	Public vLst2 As List
	Public vInt2 As Int
End Sub

Sub CustomListView1_ItemClick(i As Int, obj As Object)
	If obj = "" Then
		Return
	End If
	If vBln1 Then
		Dim getrawlistitem As CLVItem = CustomListView1._getrawlistitem(i)
		Sub002(getrawlistitem, True)
	Else
		vStr1 = obj
		vLst2.Clear
		vLst2.Add(obj)
		Dim b4xdialogVar As b4xdialog = vb4xdialog1
		Dim xui As XUI = vXUI1
		b4xdialogVar.Sub002(-1)
	End If
End Sub

Sub dialogclosed(i As Int)
End Sub

Sub getpanel(b4xdialogVar As b4xdialog) As B4XView
	Return vXv1
End Sub

Sub Initialize
	Dim xui As XUI = vXUI1
	vXv1 = XUI.CreatePanel("mBase")
	Dim b4XViewWrapper As B4XView = vXv1
	Dim vDipToCurrent As Int = DipToCurrent(300)
	b4XViewWrapper.SetLayoutAnimated(0, 0, 0, vDipToCurrent, DipToCurrent(300))
	vXv1.LoadLayout("ListTemplate")
	Dim b4XViewWrapper2 As B4XView = vXv1
	Dim xui2 As XUI = vXUI1
	b4XViewWrapper2.SetColorAndBorder(0, 0, 0, 0)
	Dim b4XViewWrapper3 As B4XView = CustomListView1.sv
	Dim xui3 As XUI = vXUI1
	b4XViewWrapper3.SetColorAndBorder(0, 0, 0, 0)
	CustomListView1.defaulttextbackgroundcolor = -11184811
	Dim xui4 As XUI = vXUI1
	CustomListView.defaulttextcolor = -1
	vLst1.Initialize
	vLst2.Initialize
End Sub

Sub Sub001(i As Int, i2 As Int)
	vXv1.SetLayoutAnimated(0, 0, 0, i, i2)
	CustomListView1._base_resize(i, i2)
End Sub

Sub Sub002(clvitemVar As CLVItem, z As Boolean)
	Dim vIndexOf As Int = vLst2.IndexOf(clvitemVar.Value)
	Dim z2 As Boolean = vIndexOf > -1
	If z Then
		z2 = Not(z2)
	End If
	If z2 Then
		If Not(z) Then
			clvitemVar.Panel.Color = vInt1
		End If
		clvitemVar.Color = CustomListView1.defaulttextbackgroundcolor
		If vIndexOf = -1 Then
			vLst2.Add(clvitemVar.Value)
		End If
	Else
		clvitemVar.Color = vInt1
		If Not(z) Then
			clvitemVar.Panel.Color = CustomListView1.defaulttextbackgroundcolor
		End If
		If vIndexOf > -1 Then
			vLst2.RemoveAt(vIndexOf)
		End If
	End If
	Dim b4xdialogVar As b4xdialog = vb4xdialog1
	Dim xui As XUI = vXUI1
	b4xdialogVar.Sub009(-1, vLst2.Size >= vInt2)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub show(dialog As b4xdialog)
	Dim group3 As IterableList
	Dim groupLen3 As Int
	Dim index3 As Int
	Dim limit8 As Int
	Dim step8 As Int
	Dim opt As Object
	Dim i As Int
	Dim item As CLVItem
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				vb4xdialog1 = dialog
				CustomListView1._clear
				Continue
			Case 1
				rsState = 4
				group3 = vLst1
				index3 = 0
				groupLen3 = group3.Size
				rsState = 12
				Continue
			Case 3
				rsState = 13
				CustomListView1._addtextitem(opt, opt)
				Continue
			Case 4
				rsState = 11
				If Not(vBln1) Then
					Continue
				Else
					rsState = 6
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 6
			Case 6
				rsState = 7
				Sleep(20)
				rsState = 14
				Continue
			Case 7
				rsState = 10
				step8 = 1
				limit8 = CustomListView1._getsize - 1
				i = 0
				rsState = 15
				Continue
			Case 9
				rsState = 16
				item = CustomListView1._getrawlistitem(i)
				Dim clvitemVar As CLVItem = item
				Sub002(clvitemVar, False)
				Continue
			Case 10
				rsState = 11
				Continue
			Case 11
				rsState = -1
				xuiviewsutils.Sub001(CustomListView1, CustomListView1.defaulttextbackgroundcolor)
				vStr1 = ""
				Continue
			Case 12
				rsState = 4
				If index3 >= groupLen3 Then
					Continue
				Else
					rsState = 3
					opt = group3.Get(index3)
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 13
			Case 13
				rsState = 12
				index3 = index3 + 1
				Continue
			Case 14
				rsState = 7
				Continue
			Case 15
				rsState = 10
				If (step8 > 0 And i <= limit8) Or (step8 < 0 And i >= limit8) Then
					rsState = 9
					Continue
				End If
				Continue
			Case 16
				rsState = 15
				i = i + 0 + step8
				Continue
		End Select
	Loop
End Sub

