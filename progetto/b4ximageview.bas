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
	Public vXv2 As B4XView
	Public vStr2 As String
	Public vBln1 As Boolean
	Public vB4XBitmap1 As B4XBitmap
	Public vInt1 As Int
	Public vInt2 As Int
End Sub

Sub Base_Resize(d As Double, d2 As Double)
	Sub003()
End Sub

Sub Sub001
	Dim b4XBitmapWrapper As B4XBitmap
	vB4XBitmap1 = Null
	Dim b4XViewWrapper As B4XView = vXv2
	b4XViewWrapper.SetBitmap(Null)
End Sub

Sub designercreateview(obj As Object, labelWrapper As Label, map As Map)
	vXv1 = obj
	vObj2 = vXv1.Tag
	vXv1.Tag = Me
	Dim imageViewWrapper As ImageView
	imageViewWrapper.Initialize("")
	vXv2 = imageViewWrapper
	vBln1 = map.Get("Round")
	vStr2 = map.Get("ResizeMode")
	Dim xui As XUI = vXUI1
	vInt1 = XUI.PaintOrColorToColor(map.Get("BackgroundColor"))
	vInt2 = DipToCurrent(map.GetDefault("CornersRadius", 0))
	vXv1.AddView(vXv2, 0, 0, vXv1.Width, vXv1.Height)
	Sub003()
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6 As B4XBitmap
	Return vB4XBitmap1
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7 As Int
	Return vInt2
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0 As String
	Return vStr2
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1 As Boolean
	Return vBln1
End Sub

Sub Initialize(obj As Object, str As String)
	vStr1 = str
	vObj1 = obj
End Sub

Sub Sub002(str As String, str2 As String)
	Dim b4XBitmapWrapper As B4XBitmap
	setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(LoadBitmapSample(str, str2, vXv1.Width, vXv1.Height))
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv6(b4XBitmapWrapper As B4XBitmap)
	vB4XBitmap1 = b4XBitmapWrapper
	xuiviewsutils.Sub006(vXv2, b4XBitmapWrapper)
	Sub003()
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv7(i As Int)
	vInt2 = i
	Sub004()
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0(str As String)
	If str = vStr2 Then
		Return
	End If
	vStr2 = str
	Sub003()
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1(z As Boolean)
	If z = vBln1 Then
		Return
	End If
	vBln1 = z
	Sub004()
End Sub

Sub Sub003
	Dim height As Float
	Dim f As Float
	Dim vIsInitialized As Boolean = vB4XBitmap1.IsInitialized
	If Not(vIsInitialized) Then
		Return
	End If
	Sub004()
	Dim width As Float = vB4XBitmap1.Width / vB4XBitmap1.Height
	Select vStr2
		Case "FILL"
			Dim width2 As Float = vXv1.Width
			height = vXv1.Height
			f = width2
		Case "FIT"
			Dim vMin As Float = Min(vXv1.Width / vB4XBitmap1.Width, vXv1.Height / vB4XBitmap1.Height)
			Dim width3 As Float = vB4XBitmap1.Width * vMin
			height = vB4XBitmap1.Height * vMin
			f = width3
		Case "FILL_WIDTH"
			Dim width4 As Float = vXv1.Width
			height = width4 / width
			f = width4
		Case "FILL_HEIGHT"
			Dim height2 As Float = vXv1.Height
			height = height2
			f = height2 * width
		Case "FILL_NO_DISTORTIONS"
			Dim vMax As Float = Max(vXv1.Width / vB4XBitmap1.Width, vXv1.Height / vB4XBitmap1.Height)
			Dim width5 As Float = vB4XBitmap1.Width * vMax
			height = vB4XBitmap1.Height * vMax
			f = width5
		Case "NONE"
			Dim width6 As Float = vB4XBitmap1.Width
			height = vB4XBitmap1.Height
			f = width6
		Case Else
			Log("Invalid resize mode: " & vStr2)
			height = 0
			f = 0
	End Select
	Dim b4XViewWrapper As B4XView = vXv2
	Dim vRound As Int = Round(vXv1.Width / 2 - f / 2)
	Dim vRound2 As Int = Round(vXv1.Height / 2 - height / 2)
	Dim vRound3 As Int = Round(f)
	b4XViewWrapper.SetLayoutAnimated(0, vRound, vRound2, vRound3, Round(height))
End Sub

Sub Sub004
	Dim z As Boolean = True
	If vBln1 Then
		Dim b4XViewWrapper As B4XView = vXv1
		Dim i As Int = vInt1
		b4XViewWrapper.SetColorAndBorder(i, 0, 0, Min(vXv1.Width / 2, vXv1.Height / 2))
	Else
		vXv1.SetColorAndBorder(vInt1, 0, 0, vInt2)
	End If
	Dim javaObject As JavaObject = vXv1
	Dim objArr(1) As Object
	If Not(vBln1) And vInt2 <= 0 Then
		z = False
	End If
	objArr(0) = z
	javaObject.RunMethod("setClipToOutline", objArr)
End Sub

