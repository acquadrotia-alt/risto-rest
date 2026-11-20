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
	Public vObj2 As Object
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	vXv1.GetView(0).SetLayoutAnimated(0, 0, 0, d, d2)
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	Dim b4XViewWrapper As B4XView = labelWrapper
	Dim cSBuilder As CSBuilder
	Dim vAppend As CSBuilder = cSBuilder.Initialize.Append("Made with ")
	Dim vTypeface As CSBuilder = vAppend.Typeface(Typeface.FONTAWESOME)
	Dim xui As XUI = vXUI1
	Dim vColor As CSBuilder = vTypeface.Color(-65536)
	vColor.Append(Chr(61444)).Pop.Pop.Append(" in B4X").PopAll
	b4XViewWrapper.Text = cSBuilder
	b4XViewWrapper.SetTextAlignment("CENTER", "CENTER")
	vXv1.AddView(b4XViewWrapper, 0, 0, vXv1.Width, vXv1.Height)
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
End Sub

