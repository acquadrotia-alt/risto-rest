B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vObjectArr1() As Object
	Public vPnl1 As Panel
	Public vPanelArr1() As Panel
	Public vLabelArr1() As Label
	Public mcolorbackgroud_seleted As ColorDrawable
	Public mcolorbackgroud_deseleted As ColorDrawable
End Sub

Sub Sub001(i As Int, i2 As Int, str As String, i3 As Int, str2 As String, bitmapWrapper As Bitmap, i4 As Int) As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Dim buttonWrapper As Button
	buttonWrapper.Initialize(str2)
	buttonWrapper.Color = i3
	buttonWrapper.Tag = i4
	buttonWrapper.SetBackgroundImageNew(bitmapWrapper)
	buttonWrapper.Gravity = 17
	panelWrapper.AddView(buttonWrapper, i2 * 0.1, i2 * 0.1, i2 * 0.8, i2 * 0.8)
	vLabelArr1(i).Initialize("")
	vLabelArr1(i).Text = str
	Dim labelWrapper As Label = vLabelArr1(i)
	labelWrapper.Gravity = 81
	panelWrapper.AddView(vLabelArr1(i), 0, 0, i2, i2)
	Return panelWrapper
End Sub

Sub Sub002(i As Int, i2 As Int, strArr As String(), strArr2 As String()) As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.SetLayout(0, 0, i, i2)
	Dim colorDrawable As ColorDrawable
	colorDrawable.Initialize2(0, 2, 2, -16777216)
	panelWrapper.Background = colorDrawable
	Dim i3 As Int = i2 * 0.8
	Dim i4 As Int = (i2 - i3) / 2
	Dim i5 As Int = (i - 2 * i3) / 4
	Dim panelWrapperArr() As Panel = vPanelArr1
	Dim str As String = strArr(0)
	panelWrapperArr(0) = Sub001(0, i3, str, -16776961, "panelButtons", LoadBitmap(File.DirAssets, strArr2(0)), 0)
	panelWrapper.AddView(vPanelArr1(0), i5, i4, i3, i3)
	Dim panelWrapperArr2() As Panel = vPanelArr1
	Dim str2 As String = strArr(1)
	panelWrapperArr2(1) = Sub001(1, i3, str2, -16776961, "panelButtons", LoadBitmap(File.DirAssets, strArr2(1)), 1)
	panelWrapper.AddView(vPanelArr1(1), i3 + i5 * 3, i4, i3, i3)
	Return panelWrapper
End Sub

Sub Sub003 As Panel
	Return vPnl1
End Sub

Sub Initialize(orderviewVar As orderview, objArr As Object(), i As Int, i2 As Int, strArr As String(), strArr2 As String())
	vorderview1 = orderviewVar
	vObjectArr1 = objArr
	vPnl1 = Sub002(i, i2, strArr, strArr2)
	Dim colorDrawable As ColorDrawable = mcolorbackgroud_seleted
	colorDrawable.Initialize2(-16776961, 0, 0, 0)
	Dim colorDrawable2 As ColorDrawable = mcolorbackgroud_deseleted
	colorDrawable2.Initialize2(0, 0, 0, 0)
End Sub

Sub Panelbuttons_Click
	Dim buttonWrapper As Button
	Dim vObjectToNumber As Int = Sender.Tag
	vPanelArr1(0).Background = mcolorbackgroud_deseleted
	vPanelArr1(1).Background = mcolorbackgroud_deseleted
	vPanelArr1(vObjectToNumber).Background = mcolorbackgroud_seleted
	If vObjectArr1(0) Is totemconsumptiontype Then
		totemdata.vtotemorderheadtype1.ConsumptionLocation = totemdata.vtotemconsumptiontypeArr1(vObjectToNumber)
	Else If vObjectArr1(0) Is totempaymentconditionstype Then
		totemdata.vtotemorderheadtype1.PaymentConditions = totemdata.vv0(vObjectToNumber)
	End If
	vorderview1.Sub013
End Sub

Sub Sub004
	If vObjectArr1(0) Is totemconsumptiontype Then
		Dim labelWrapper As Label = vLabelArr1(0)
		Dim strArr() As String = totemdata.vtotemconsumptiontypeArr1(0).Description
		labelWrapper.Text = strArr(language.Sub004)
		Dim labelWrapper2 As Label = vLabelArr1(1)
		Dim strArr2() As String = totemdata.vtotemconsumptiontypeArr1(1).Description
		labelWrapper2.Text = strArr2(language.Sub004)
		Return
	End If
	If vObjectArr1(0) Is totempaymentconditionstype Then
		Dim labelWrapper3 As Label = vLabelArr1(0)
		Dim strArr3() As String = totemdata.vv0(0).Description
		labelWrapper3.Text = strArr3(language.Sub004)
		Dim labelWrapper4 As Label = vLabelArr1(1)
		Dim strArr4() As String = totemdata.vv0(1).Description
		labelWrapper4.Text = strArr4(language.Sub004)
		Return
	End If
End Sub

