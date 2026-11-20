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
	Public vB4XCanvas1 As B4XCanvas
	Public vXv2 As B4XView
	Public vInt1 As Int
	Public vInt2 As Int
	Public vInt3 As Int
	Public vBln1 As Boolean
	Public vObj2 As Object
	Public vBln2 As Boolean
	Public vInt4 As Int
	Public vInt5 As Int
	Public vBln3 As Boolean
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	vB4XCanvas1.Resize(d, d2)
	Dim vGetAllViewsRecursive As IterableList = vXv1.GetAllViewsRecursive
	Dim size As Int = vGetAllViewsRecursive.Size
	Dim i As Int
	For i = 0 To size - 1
		vGetAllViewsRecursive.Get(i).SetLayoutAnimated(0, 0, 0, d, d2)
	Next
	Sub001()
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	Dim xui As XUI = vXUI1
	Dim vCreatePanel As B4XView = XUI.CreatePanel("p")
	Dim xui2 As XUI = vXUI1
	vCreatePanel.Color = 0
	Dim xui3 As XUI = vXUI1
	vInt1 = XUI.PaintOrColorToColor(map.Get("PrimaryColor"))
	Dim xui4 As XUI = vXUI1
	vInt2 = XUI.PaintOrColorToColor(map.Get("SecondaryColor"))
	Dim xui5 As XUI = vXUI1
	vInt3 = XUI.PaintOrColorToColor(map.GetDefault("DisabledColor", -6710887))
	vInt4 = DipToCurrent(map.GetDefault("CornersRadius", 15))
	vInt5 = DipToCurrent(map.GetDefault("SideHeight", 5))
	vBln2 = Not(map.GetDefault("ButtonEnabled", True))
	vBln3 = map.GetDefault("HapticFeedback", False)
	vBln1 = vBln2
	vXv2 = labelWrapper
	vXv1.AddView(vXv2, 0, 0, 0, 0)
	vXv1.AddView(vCreatePanel, 0, 0, 0, 0)
	vXv2.SetTextAlignment("CENTER", "CENTER")
	vB4XCanvas1.Initialize(vXv1)
	base_resize(vXv1.Width, vXv1.Height)
End Sub

Sub Sub001
	Dim i As Int
	vB4XCanvas1.ClearRect(vB4XCanvas1.TargetRect)
	Dim b4XRect As B4XRect
	Dim b4XPath As B4XPath
	b4XRect.Initialize(0, vInt5, vXv1.Width, vXv1.Height)
	Dim z As Boolean = vBln1
	If Not(z) Then
		vXv2.Top = 0
		b4XPath.InitializeRoundedRect(b4XRect, vInt4)
		Dim b4XCanvas As B4XCanvas = vB4XCanvas1
		Dim i2 As Int = vInt2
		b4XCanvas.DrawPath(b4XPath, i2, True, 0)
		b4XRect.Initialize(0, 0, vXv1.Width, vXv1.Height - vInt5)
		b4XPath.InitializeRoundedRect(b4XRect, vInt4)
		Dim b4XCanvas2 As B4XCanvas = vB4XCanvas1
		Dim i3 As Int = vInt1
		b4XCanvas2.DrawPath(b4XPath, i3, True, 0)
	Else
		vXv2.Top = vInt5
		b4XPath.InitializeRoundedRect(b4XRect, vInt4)
		If vBln2 Then
			i = vInt3
		Else
			i = vInt1
		End If
		Dim b4XCanvas3 As B4XCanvas = vB4XCanvas1
		b4XCanvas3.DrawPath(b4XPath, i, True, 0)
	End If
	vB4XCanvas1.Invalidate
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 As Boolean
	Return Not(vBln2)
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/swiftbutton.java, metodo _p_touch (riga 198).
Sub P_Touch(i As Int, f As Float, f2 As Float)
	If vBln2 Then
		Return
	End If
	Dim z As Boolean = f > 0 And f < vXv1.Width And f2 > 0 And f2 < vXv1.Height
	Dim valueOf As Int = i
	Dim b4XViewWrapper As B4XView = vXv1
	Dim b4XViewWrapper2 As B4XView = vXv1
	Dim b4XViewWrapper3 As B4XView = vXv1
	Select valueOf
		Case 0
			Sub003(True)
			Sub001()
		Case 2
			If vBln1 <> z Then
				Sub003(z)
				Sub001()
			End If
		Case 1, 3
			Sub003(False)
			Sub001()
			If z Then
				If vBln3 Then
					xuiviewsutils.Sub004(vXv1)
				End If
				CallSubDelayed(vObj1, vStr1 & "_Click")
			End If
	End Select
End Sub

Sub Sub002(i As Int, i2 As Int)
	vInt1 = i
	vInt2 = i2
	Sub001()
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(z As Boolean)
	vBln2 = Not(z)
	vBln1 = vBln2
	Sub001()
End Sub

Sub Sub003(z As Boolean)
	If vBln1 = z Then
		Return
	End If
	If z Then
		Dim xui As XUI = vXUI1
		If XUI.SubExists(vObj1, vStr1 & "_ButtonDown", 0) Then
			CallSubDelayed(vObj1, vStr1 & "_ButtonDown")
		End If
	End If
	If Not(z) Then
		Dim xui2 As XUI = vXUI1
		If XUI.SubExists(vObj1, vStr1 & "_ButtonUp", 0) Then
			CallSubDelayed(vObj1, vStr1 & "_ButtonUp")
		End If
	End If
	vBln1 = z
End Sub

Sub Sub004
	Sub001()
End Sub

