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
	Public vInt1 As Int
	Public vInt2 As Int
	Public vInt3 As Int
	Public vB4XCanvas1 As B4XCanvas
	Public vObj2 As Object
	Public vXv2 As B4XView
	Public vInt4 As Int
	Public vInt5 As Int
	Public vInt6 As Int
	Public vInt7 As Int
	Public vBln1 As Boolean
	Public vInt8 As Int
	Public vInt9 As Int
	Public vInt10 As Int
	Public vInt11 As Int
	Public vBln2 As Boolean
	Public vInt12 As Int
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	vB4XCanvas1.Resize(d, d2)
	vXv2.SetLayoutAnimated(0, 0, 0, d, d2)
	vBln1 = (vXv1.Height > vXv1.Width)
	vInt12 = Max(vXv1.Height, vXv1.Width) - vInt11 * 2
	Sub003()
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/b4xseekbar.java, metodo _designercreateview (riga 128).
Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	Dim xui As XUI = vXUI1
	vInt1 = XUI.PaintOrColorToColor(map.Get("Color1"))
	Dim xui2 As XUI = vXUI1
	vInt2 = XUI.PaintOrColorToColor(map.Get("Color2"))
	Dim xui3 As XUI = vXUI1
	vInt3 = XUI.PaintOrColorToColor(map.Get("ThumbColor"))
	vInt7 = Max(1, map.GetDefault("Interval", 1))
	vInt5 = map.Get("Min")
	vInt6 = map.Get("Max")
	Dim d As Double = vInt5
	vInt4 = Max(d, Min(vInt6, map.Get("Value")))
	vB4XCanvas1.Initialize(vXv1)
	Dim xui4 As XUI = vXUI1
	vXv2 = XUI.CreatePanel("TouchPanel")
	vXv1.AddView(vXv2, 0, 0, vXv1.Width, vXv1.Height)
	Dim xui5 As XUI = vXUI1
	If Not(XUI.IsB4A) Then
		Dim xui6 As XUI = vXUI1
	End If
	vInt11 = DipToCurrent(20)
	Dim xui7 As XUI = vXUI1
	If XUI.IsB4A Then
		base_resize(vXv1.Width, vXv1.Height)
		Return
	End If
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 As Int
	Return vInt4
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
End Sub

Sub Sub001
	Dim xui As XUI = vXUI1
	If XUI.SubExists(vObj1, vStr1 & "_TouchStateChanged", 1) Then
		CallSubDelayed2(vObj1, vStr1 & "_TouchStateChanged", vBln2)
		Return
	End If
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(i As Int)
	Dim d As Double = vInt5
	vInt4 = Max(d, Min(vInt6, i))
	Sub003()
End Sub

Sub Sub002(i As Int, i2 As Int)
	Dim i3 As Int
	If vBln1 Then
		i3 = (vXv1.Height - vInt11 - i2) / vInt12 * (vInt6 - vInt5) + vInt5
	Else
		i3 = (i - vInt11) / vInt12 * (vInt6 - vInt5) + vInt5
	End If
	Dim vRound As Int = Round(i3 / vInt7) * vInt7
	Dim d As Double = vInt5
	Dim vMax As Int = Max(d, Min(vInt6, vRound))
	If vMax <> vInt4 Then
		vInt4 = vMax
		Dim xui As XUI = vXUI1
		If XUI.SubExists(vObj1, vStr1 & "_ValueChanged", 1) Then
			CallSubDelayed2(vObj1, vStr1 & "_ValueChanged", vInt4)
			Return
		End If
		Return
	End If
End Sub

Sub Touchpanel_Touch(i As Int, f As Float, f2 As Float)
	Dim b4XViewWrapper As B4XView = vXv2
	If i = 0 Then
		vBln2 = True
		Sub001()
		Sub002(f, f2)
	Else
		Dim b4XViewWrapper2 As B4XView = vXv2
		If i = 2 Then
			Sub002(f, f2)
		Else
			Dim b4XViewWrapper3 As B4XView = vXv2
			If i = 1 Then
				vBln2 = False
				Sub001()
			End If
		End If
	End If
	Sub003()
End Sub

Sub Sub003
	vB4XCanvas1.ClearRect(vB4XCanvas1.TargetRect)
	If vInt12 > 0 Then
		Dim z As Boolean = vBln1
		If Not(z) Then
			Dim i As Int = vInt11 + (vInt4 - vInt5) / (vInt6 - vInt5) * vInt12
			Dim height As Int = vXv1.Height / 2
			vB4XCanvas1.DrawLine(vInt11, height, i, height, vInt1, vInt8)
			vB4XCanvas1.DrawLine(i, height, vXv1.Width - vInt11, height, vInt2, vInt9)
			Dim f As Float = vInt10
			Dim i2 As Int = vInt1
			vB4XCanvas1.DrawCircle(i, height, f, i2, True, 0)
			If vBln2 Then
				Dim f2 As Float = vInt11
				Dim i3 As Int = vInt3
				vB4XCanvas1.DrawCircle(i, height, f2, i3, True, 0)
			End If
		Else
			Dim i4 As Int = vInt11 + (vInt6 - vInt4 - vInt5) / (vInt6 - vInt5) * vInt12
			Dim width As Int = vXv1.Width / 2
			vB4XCanvas1.DrawLine(width, vInt11, width, i4, vInt2, vInt9)
			vB4XCanvas1.DrawLine(width, i4, width, vXv1.Height - vInt11, vInt1, vInt8)
			Dim f3 As Float = vInt10
			Dim i5 As Int = vInt1
			vB4XCanvas1.DrawCircle(width, i4, f3, i5, True, 0)
			If vBln2 Then
				Dim f4 As Float = vInt11
				Dim i6 As Int = vInt3
				vB4XCanvas1.DrawCircle(width, i4, f4, i6, True, 0)
			End If
		End If
	End If
	vB4XCanvas1.Invalidate
End Sub

