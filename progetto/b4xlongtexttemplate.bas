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
	Public vObj1 As Object
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
	vXv1.LoadLayout("LongTextTemplate")
	Dim b4XViewWrapper2 As B4XView = vXv1
	Dim xui2 As XUI = vXUI1
	b4XViewWrapper2.SetColorAndBorder(0, 0, 0, 0)
	Dim b4XViewWrapper3 As B4XView = CustomListView1.sv
	Dim xui3 As XUI = vXUI1
	b4XViewWrapper3.SetColorAndBorder(0, 0, 0, 0)
	CustomListView1.defaulttextbackgroundcolor = -11184811
	Dim xui4 As XUI = vXUI1
	CustomListView.defaulttextcolor = -1
	CustomListView1.sv.Color = -12171706
End Sub

Sub Sub001(i As Int, i2 As Int)
	vXv1.SetLayoutAnimated(0, 0, 0, i, i2)
	CustomListView1._asview.SetLayoutAnimated(0, 0, 0, i, i2)
	CustomListView1._base_resize(i, i2)
End Sub

Sub show(b4xdialogVar As b4xdialog)
	CustomListView1._clear
	CustomListView1._addtextitem(vObj1, "")
	CustomListView1._getpanel(0).GetView(0).SetTextAlignment("TOP", "LEFT")
	xuiviewsutils.Sub001(CustomListView1, CustomListView1.defaulttextbackgroundcolor)
End Sub

