B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vScrollView1 As ScrollView
	Public vLst1 As List
	Public vLst2 As List
	Public vFlt1 As Float
	Public vObj1 As Object
	Public vStr1 As String
	Public vObj2 As Object
	Public vStringUtils1 As StringUtils
	Public vInt1 As Int
	Public vInt2 As Int
	Public vInt3 As Int
End Sub

Sub Sub001(panelWrapper As Panel, i As Int, obj As Object)
	Sub010(vLst1.Size, panelWrapper, i, obj)
End Sub

Sub Sub002(str As String, obj As Object)
	Sub011(vLst1.Size, str, obj)
End Sub

Sub Sub003 As View
	Return vScrollView1
End Sub

Sub Sub004
	vLst1.Clear
	vLst2.Clear
	vScrollView1.Panel.Height = 0
	Dim numberOfViews As Int
	For numberOfViews = vScrollView1.Panel.NumberOfViews - 1 To 0 Step -1
		vScrollView1.Panel.RemoveViewAt(numberOfViews)
	Next
End Sub

Sub Sub005(i As Int)
	Dim panelWrapper As Panel = vLst2.Get(i)
	Dim size As Int = vLst1.Size - 1
	Dim i2 As Int
	For i2 = i + 1 To size
		vLst2.Get(i2).Top = '### r1.getTop() - panelWrapper.Height - vFlt1
	Next
	vScrollView1.Panel.Height = vScrollView1.Panel.Height - panelWrapper.Height - vFlt1
	panelWrapper.Height = 0
End Sub

Sub Sub006(i As Int, i2 As Int)
	vLst2.Get(i).Height = i2
	Dim size As Int = vLst1.Size - 1
	Dim i3 As Int
	For i3 = i + 1 To size
		vLst2.Get(i3).Top = '### r1.getTop() + '### r0.getHeight() + vFlt1
	Next
	vScrollView1.Panel.Height = '### r0.getHeight() + vScrollView1.Panel.Height + vFlt1
End Sub

Sub getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv4 As Int
	Dim size As Int = vLst1.Size - 1
	Dim i As Int = 0
	Dim i2 As Int
	For i2 = 0 To size
		i = i + Main.vInt3 + vFlt1
		If i > vScrollView1.ScrollPosition Then
			Return i2
		End If
	Next
	Return vLst1.Size - 1
End Sub

Sub Sub007(concreteViewWrapper As View) As Int
	Try
		Dim reflection As Reflector
		Dim obj As Object = Null
		Dim object As Object = concreteViewWrapper
		Do While True
			Dim z As Boolean = object Is ViewGroup
			If Not(z) Or vScrollView1.Panel <> object Then
				reflection.Target = object
				obj = object
				object = reflection.RunMethod("getParent")
			Else
				Return obj.Tag
			End If
		Loop
	Catch
		Return -1
	End Try
End Sub

Sub getpanel(i As Int) As Panel
	Return vLst2.Get(i).GetView(0)
End Sub

Sub Sub008 As Int
	Return vLst1.Size
End Sub

Sub Sub009(i As Int) As Object
	Return vLst1.Get(i)
End Sub

Sub Initialize(obj As Object, str As String)
	vScrollView1.Initialize2(0, "sv")
	vLst1.Initialize
	vLst2.Initialize
	vFlt1 = DipToCurrent(2)
	vStr1 = str
	vObj2 = obj
	Dim scrollViewWrapper As ScrollView = vScrollView1
	scrollViewWrapper.Color = Colors.RGB(245, 245, 245)
	Dim reflection As Reflector
	Dim vObjectToNumber As Int = reflection.GetStaticField("android.R$drawable", "list_selector_background")
	reflection.Target = reflection.GetContext
	reflection.Target = reflection.RunMethod("getResources")
	vObj1 = reflection.RunMethod2("getDrawable", vObjectToNumber, "java.lang.int")
	vInt2 = -1
	vInt1 = 16
	vInt3 = -16777216
End Sub

Sub Sub010(i As Int, panelWrapper As Panel, i2 As Int, obj As Object)
	Dim height As Int
	Dim height2 As Int
	Dim stateListDrawable As StateListDrawable
	stateListDrawable.Initialize
	stateListDrawable.AddState(16842919, vObj1)
	stateListDrawable.AddCatchAllState(panelWrapper.Background)
	Dim panelWrapper2 As Panel
	panelWrapper2.Initialize("panel")
	panelWrapper2.Background = stateListDrawable
	Dim colorDrawable As ColorDrawable
	colorDrawable.Initialize(0, 0)
	panelWrapper.Background = colorDrawable
	panelWrapper2.AddView(panelWrapper, 0, 0, vScrollView1.Width, i2)
	panelWrapper2.Tag = i
	If i = vLst1.Size Then
		vLst1.Add(obj)
		vLst2.Add(panelWrapper2)
		If i = 0 Then
			height2 = vFlt1
		Else
			height2 = vScrollView1.Panel.Height
		End If
		vScrollView1.Panel.AddView(panelWrapper2, 0, height2, vScrollView1.Width, i2)
	Else
		If i = 0 Then
			height = vFlt1
		Else
			Dim panelWrapper3 As Panel = vLst2.Get(i - 1)
			height = panelWrapper3.Height + panelWrapper3.Top + vFlt1
		End If
		Dim size As Int = vLst2.Size - 1
		Dim i3 As Int
		For i3 = i To size
			Dim panelWrapper4 As Panel = vLst2.Get(i3)
			panelWrapper4.Top = panelWrapper4.Top + i2 + vFlt1
			panelWrapper4.Tag = i3 + 1
		Next
		vLst1.InsertAt(i, obj)
		vLst2.InsertAt(i, panelWrapper2)
		vScrollView1.Panel.AddView(panelWrapper2, 0, height, vScrollView1.Width, i2)
	End If
	If i2 > 0 Then
		vScrollView1.Panel.Height = vScrollView1.Panel.Height + i2 + vFlt1
	End If
	If vLst1.Size = 1 Then
		vScrollView1.Panel.Height = vScrollView1.Panel.Height + vFlt1
		Return
	End If
End Sub

Sub Sub011(i As Int, str As String, obj As Object)
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Dim labelWrapper As Label
	labelWrapper.Initialize("")
	labelWrapper.Gravity = Bit.Or(16, 3)
	Dim view As View = labelWrapper
	Dim vDipToCurrent As Int = DipToCurrent(5)
	Dim vDipToCurrent2 As Int = DipToCurrent(2)
	Dim width As Int = vScrollView1.Width
	Dim vDipToCurrent3 As Int = width - DipToCurrent(5)
	panelWrapper.AddView(view, vDipToCurrent, vDipToCurrent2, vDipToCurrent3, DipToCurrent(20))
	labelWrapper.Text = str
	labelWrapper.TextSize = vInt1
	labelWrapper.TextColor = vInt2
	panelWrapper.Color = vInt3
	Dim vMeasureMultilineTextHeight As Int = vStringUtils1.MeasureMultilineTextHeight(labelWrapper, str)
	labelWrapper.Height = Max(Main.vInt22, vMeasureMultilineTextHeight)
	Dim height As Int = labelWrapper.Height
	Sub010(i, panelWrapper, height + DipToCurrent(2), obj)
End Sub

Sub Sub012(i As Int)
	Dim vMin As Int = Min(i - 1, vLst1.Size - 1)
	Dim i2 As Int = 0
	Dim i3 As Int
	For i3 = 0 To vMin
		i2 = vLst2.Get(i3).Height + i2 + vFlt1
	Next
	CallSubDelayed2(Me, "ScrollChange", i2)
End Sub

Sub Sub013(i As Int)
	vScrollView1.SetLayoutAnimated(300, vScrollView1.Left, vScrollView1.Top, vScrollView1.Width, i)
End Sub

Sub Sub014(i As Int)
	vScrollView1.Left = i
End Sub

Sub Sub015(i As Int)
	vScrollView1.Top = i
End Sub

Sub Sub016(z As Boolean)
	vScrollView1.Visible = z
End Sub

Sub Sub017(i As Int)
	vScrollView1.Width = i
End Sub

Sub Panel_Click
End Sub

Sub Sub018(i As Int)
	Dim panelWrapper As Panel = vLst2.Get(i)
	Dim size As Int = vLst1.Size - 1
	Dim i2 As Int
	For i2 = i + 1 To size
		Dim panelWrapper2 As Panel = vLst2.Get(i2)
		panelWrapper2.Tag = i2 - 1
		panelWrapper2.Top = panelWrapper2.Top - panelWrapper.Height - vFlt1
	Next
	vScrollView1.Panel.Height = vScrollView1.Panel.Height - panelWrapper.Height - vFlt1
	vLst1.RemoveAt(i)
	vLst2.RemoveAt(i)
	panelWrapper.RemoveView
End Sub

Sub scrollchange(i As Int)
	vScrollView1.ScrollToNow(i)
End Sub

Sub Sub019(i As Int)
	If i = 0 Then
		vScrollView1.Color = i
		Return
	End If
	Dim scrollViewWrapper As ScrollView = vScrollView1
	scrollViewWrapper.Background = mod1.Sub155(i, 0)
End Sub

Sub Sub020(i As Int)
	Dim scrollViewWrapper As ScrollView = vScrollView1
	scrollViewWrapper.Background = mod1.Sub156(i, 5, 3)
End Sub

Sub Sub021(i As Int)
	Dim scrollViewWrapper As ScrollView = vScrollView1
	scrollViewWrapper.Background = mod1.Sub157(i, 0, 0)
End Sub

Sub Sub022
	mod1.Sub161(vScrollView1, 8)
End Sub

