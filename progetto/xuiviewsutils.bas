B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
Sub Process_Globals
	Public vBln1 As Boolean
	Public vXUI1 As XUI
End Sub

Sub Sub001(customlistviewVar As CustomListView, i As Int)
	If customlistviewVar._getsize = 0 Then
		Return
	End If
	Dim getrawlistitem As CLVItem = customlistviewVar._getrawlistitem(customlistviewVar._getsize - 1)
	If getrawlistitem.Offset + getrawlistitem.Panel.Height < customlistviewVar._asview.Height Then
		Dim xui As XUI = vXUI1
		If Not( = Null) Then
			 = 
		End If
		Dim vCreatePanel As B4XView = XUI.CreatePanel("stub")
		vCreatePanel.Color = i
		Dim height As Int = customlistviewVar._asview.Height - getrawlistitem.Offset - getrawlistitem.Panel.Height - DipToCurrent(3)
		Dim xui2 As XUI = vXUI1
		If XUI.IsB4J Then
			height = height + 5
		End If
		vCreatePanel.SetLayoutAnimated(0, 0, 0, customlistviewVar._asview.Width, height)
		customlistviewVar._add(vCreatePanel, "")
		customlistviewVar.sv.ScrollViewContentHeight = customlistviewVar.sv.ScrollViewContentHeight - customlistviewVar._getdividersize
	End If
End Sub

Sub Sub002 As b4ximageview
	Dim b4ximageviewVar As b4ximageview
	b4ximageviewVar.Initialize(Null, "")
	Dim xui As XUI = vXUI1
	If Not( = Null) Then
		 = 
	End If
	Dim vCreatePanel As B4XView = XUI.CreatePanel("")
	vCreatePanel.SetLayoutAnimated(0, 0, 0, DipToCurrent(100), DipToCurrent(100))
	b4ximageviewVar.designercreateview(vCreatePanel, Null, createMap(Array("Round", False, "ResizeMode", "FIT", "BackgroundColor", -5592406, "CornersRadius", 0)))
	Return b4ximageviewVar
End Sub

Sub Sub003 As B4XView
	Dim labelWrapper As Label
	labelWrapper.Initialize("")
	Return labelWrapper
End Sub

Sub initialize
	If vBln1 Then
		Return
	End If
	vBln1 = True
End Sub

Sub Sub004(b4XViewWrapper As B4XView)
	initialize()
	b4XViewWrapper.RunMethod("performHapticFeedback", Array(1))
End Sub

Sub Sub005(b4XViewWrapper As B4XView, f As Float)
	b4XViewWrapper.RunMethod("setAlpha", Array(f))
End Sub

Sub Sub006(b4XViewWrapper As B4XView, b4XBitmapWrapper As B4XBitmap)
	b4XViewWrapper.SetBitmap(b4XBitmapWrapper)
	Dim imageViewWrapper As ImageView = b4XViewWrapper
	imageViewWrapper.Gravity = 119
End Sub

Sub Sub007(b4XViewWrapper As B4XView, obj As Object)
	b4XViewWrapper.Text = obj
End Sub

