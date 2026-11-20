B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vScrollView1 As ScrollView
	Public vPnl1 As Panel
	Public vPanelArr1() As Panel
	Public vtotemcategorytypeArr1() As totemcategorytype
	Public vLabelArr1() As Label
End Sub

Sub Sub001(i As Int, i2 As Int, i3 As Int) As Panel
	Dim panelWrapper As Panel
	Dim colorDrawable As ColorDrawable
	panelWrapper.Initialize("oPanelCategory")
	panelWrapper.Tag = i3
	colorDrawable.Initialize2(0, 2, 2, -16777216)
	panelWrapper.Background = colorDrawable
	panelWrapper.AddView(Utility.v7(vtotemcategorytypeArr1(i3).ImageFileName, "", "", i * 0.9, i2 * 0.7), i * 0.05, i2 * 0.05, i * 0.9, i2 * 0.7)
	vLabelArr1(i3).Initialize("")
	Dim labelWrapper As Label = vLabelArr1(i3)
	Dim strArr() As String = vtotemcategorytypeArr1(i3).NameCategory
	labelWrapper.Text = strArr(language.Sub004)
	Dim labelWrapper2 As Label = vLabelArr1(i3)
	labelWrapper2.Gravity = 17
	panelWrapper.AddView(vLabelArr1(i3), 0, i2 * 0.75, i, i2 * 0.25)
	Return panelWrapper
End Sub

Sub Sub002 As View
	Return vScrollView1
End Sub

Sub Initialize(orderviewVar As orderview, i As Int, i2 As Int, totemcategorytypeVarArr As totemcategorytype())
	vorderview1 = orderviewVar
	vtotemcategorytypeArr1 = totemcategorytypeVarArr
	If vtotemcategorytypeArr1.Length > 0 Then
		Dim labelWrapperArr(vtotemcategorytypeArr1.Length) As Label
		Dim length As Int = labelWrapperArr.Length
		Dim i3 As Int
		For i3 = 0 To length - 1
			'labelWrapperArr(i3) = Label
		Next
		vLabelArr1 = labelWrapperArr
		Dim i4 As Int = i - i * 0.05
		Dim length2 As Int = i2 / vtotemcategorytypeArr1.Length / 20
		vPnl1.Initialize("mPanelSlideShow")
		vPnl1.SetLayout(0, 0, i, (i4 + length2) * vtotemcategorytypeArr1.Length)
		Dim panelWrapper As Panel = vPnl1
		panelWrapper.Color = -65536
		Dim panelWrapperArr(vtotemcategorytypeArr1.Length) As Panel
		Dim i5 As Int
		For i5 = 0 To panelWrapperArr.Length - 1
			'panelWrapperArr(i5) = Panel
		Next
		vPanelArr1 = panelWrapperArr
		Dim length4 As Int = vtotemcategorytypeArr1.Length - 1
		Dim i6 As Int
		For i6 = 0 To length4
			vPanelArr1(i6) = Sub001(i4, i4, i6)
			vPnl1.AddView(vPanelArr1(i6), i / 2 - i4 / 2, (i4 + length2) * i6, i4, i4)
		Next
		vScrollView1.Initialize(0)
		vScrollView1.Panel.AddView(vPnl1, 0, 0, vPnl1.Width, vPnl1.Height)
		vScrollView1.Panel.Height = vPnl1.Height
		Return
	End If
End Sub

Sub Opanelcategory_Click
	Dim panelWrapper As Panel
	Dim panelWrapper2 As Panel = Sender
	Sub004(panelWrapper2.Tag)
	vorderview1.ordercategory_itemclick(panelWrapper2.Tag)
	vorderview1.Sub013
End Sub

Sub Sub003
	If vtotemcategorytypeArr1.Length > 0 Then
		Dim length As Int = vtotemcategorytypeArr1.Length - 1
		Dim i As Int
		For i = 0 To length
			Dim labelWrapper As Label = vLabelArr1(i)
			Dim strArr() As String = vtotemcategorytypeArr1(i).NameCategory
			labelWrapper.Text = strArr(language.Sub004)
		Next
		Return
	End If
End Sub

Sub Sub004(i As Int)
	If vtotemcategorytypeArr1.Length > 0 Then
		Dim length As Int = vtotemcategorytypeArr1.Length - 1
		Dim i2 As Int
		For i2 = 0 To length
			Dim panelWrapper As Panel = vPanelArr1(i2)
			panelWrapper.Color = 0
		Next
		Dim panelWrapper2 As Panel = vPanelArr1(i)
		panelWrapper2.Color = -3355444
		Return
	End If
End Sub

