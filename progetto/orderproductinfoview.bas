B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vPnl1 As Panel
	Public vLbl1 As Label
	Public vPnl2 As Panel
	Public vLbl2 As Label
	Public vPnl3 As Panel
	Public vBtn1 As Button
End Sub

Sub Eventinfoproductclose_Click
	vorderview1.orderinfoproductclose_click
End Sub

Sub Eventinfoproductelevation_Click
End Sub

Sub Sub001(totemallergenstypeVarArr As totemallergenstype(), i As Int) As Panel
	Dim panelWrapper As Panel
	Dim f As Float = i * 0.1
	Dim f2 As Float = i * 0.6
	Dim f3 As Float = i * 0.6
	Dim f4 As Float = i * 0.3
	If totemallergenstypeVarArr.Length > 0 Then
		panelWrapper.Initialize("")
		panelWrapper.Color = -16776961
		panelWrapper.SetLayout(0, 0, totemallergenstypeVarArr.Length * i, i)
		Dim length As Int = totemallergenstypeVarArr.Length - 1
		Dim i2 As Int
		For i2 = 0 To length
			Dim v7 As ImageView = Utility.v7(totemallergenstypeVarArr(i2).ImageFileName, "", "", i, f2)
			v7.Gravity = 49
			panelWrapper.AddView(v7, i2 * i, f, i, f2)
			Dim labelWrapper As Label
			labelWrapper.Initialize("")
			Dim strArr() As String = totemallergenstypeVarArr(i2).Name
			labelWrapper.Text = strArr(language.Sub004)
			labelWrapper.TextColor = -1
			labelWrapper.Gravity = 81
			panelWrapper.AddView(labelWrapper, i2 * i, f3, i, f4)
		Next
	End If
	Return panelWrapper
End Sub

Sub Sub002(totemallergenstypeVarArr As totemallergenstype(), totemtagstypeVarArr As totemtagstype(), i As Int) As HorizontalScrollView
	Dim panelWrapper As Panel
	Dim panelWrapper2 As Panel = Null
	Dim panelWrapper3 As Panel
	panelWrapper3.Initialize("")
	If totemallergenstypeVarArr.Length > 0 Then
		panelWrapper = Sub001(totemallergenstypeVarArr, i)
		panelWrapper3.AddView(panelWrapper, 0, 0, panelWrapper.Width, panelWrapper.Height)
	Else
		panelWrapper = Null
	End If
	If totemtagstypeVarArr.Length > 0 Then
		panelWrapper2 = Sub004(totemtagstypeVarArr, i)
		panelWrapper3.AddView(panelWrapper2, 0, 0, panelWrapper2.Width, panelWrapper2.Height)
	End If
	If totemallergenstypeVarArr.Length > 0 And totemtagstypeVarArr.Length > 0 Then
		panelWrapper2.Left = panelWrapper.Width
		panelWrapper3.SetLayout(0, 0, panelWrapper.Width + panelWrapper2.Width, i)
	Else If totemallergenstypeVarArr.Length > 0 Then
		panelWrapper3.SetLayout(0, 0, panelWrapper.Width, i)
	Else If totemtagstypeVarArr.Length > 0 Then
		panelWrapper3.SetLayout(0, 0, panelWrapper2.Width, i)
	End If
	Dim horizontalScrollViewWrapper As HorizontalScrollView
	horizontalScrollViewWrapper.Initialize(0, "")
	horizontalScrollViewWrapper.Panel.AddView(panelWrapper3, 0, 0, panelWrapper3.Width, panelWrapper3.Height)
	horizontalScrollViewWrapper.Panel.Width = panelWrapper3.Width
	Return horizontalScrollViewWrapper
End Sub

Sub Sub003 As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("EventInfoProductClose")
	panelWrapper.Width = PerXToCurrent(100)
	panelWrapper.Height = PerYToCurrent(100)
	panelWrapper.Color = Colors.ARGB(75, 0, 0, 0)
	Dim panelWrapper2 As Panel
	panelWrapper2.Initialize("EventInfoProductElevation")
	panelWrapper2.Width = PerXToCurrent(84)
	panelWrapper2.Height = PerYToCurrent(72)
	Dim colorDrawable As ColorDrawable
	colorDrawable.Initialize2(-1, 2, 2, -16777216)
	panelWrapper2.Background = colorDrawable
	vPnl2.Initialize("")
	Dim colorDrawable2 As ColorDrawable
	colorDrawable2.Initialize2(-1, 2, 2, -16777216)
	vPnl2.Background = colorDrawable2
	panelWrapper2.AddView(vPnl2, panelWrapper2.Width * 0.05, panelWrapper2.Height * 0.1, panelWrapper2.Width * 0.4, panelWrapper2.Height * 0.4)
	vLbl1.Initialize("")
	Dim labelWrapper As Label = vLbl1
	labelWrapper.TextColor = -16777216
	Dim labelWrapper2 As Label = vLbl1
	labelWrapper2.Color = -3355444
	panelWrapper2.AddView(vLbl1, panelWrapper2.Width * 0.5, panelWrapper2.Height * 0.1, panelWrapper2.Width * 0.4, panelWrapper2.Height * 0.1)
	vLbl2.Initialize("")
	Dim labelWrapper3 As Label = vLbl2
	labelWrapper3.TextColor = -16777216
	Dim labelWrapper4 As Label = vLbl2
	labelWrapper4.Color = -3355444
	panelWrapper2.AddView(vLbl2, panelWrapper2.Width * 0.5, panelWrapper2.Height * 0.25, panelWrapper2.Width * 0.4, panelWrapper2.Height * 0.25)
	vPnl3.Initialize("")
	Dim panelWrapper3 As Panel = vPnl3
	panelWrapper3.Color = -16776961
	panelWrapper2.AddView(vPnl3, panelWrapper2.Width * 0.05, panelWrapper2.Height * 0.55, panelWrapper2.Width * 0.85, panelWrapper2.Height * 0.25)
	vBtn1.Initialize("EventInfoProductClose")
	panelWrapper2.AddView(vBtn1, panelWrapper2.Width * 0.2, panelWrapper2.Height * 0.85, panelWrapper2.Width * 0.6, panelWrapper2.Height * 0.12)
	panelWrapper.AddView(panelWrapper2, (PerXToCurrent(100) - panelWrapper2.Width) / 2, (PerYToCurrent(100) - panelWrapper2.Height) / 2, panelWrapper2.Width, panelWrapper2.Height)
	panelWrapper.Elevation = DipToCurrent(4)
	Return panelWrapper
End Sub

Sub Sub004(totemtagstypeVarArr As totemtagstype(), i As Int) As Panel
	Dim panelWrapper As Panel
	Dim f As Float = i * 0.1
	Dim f2 As Float = i * 0.6
	Dim f3 As Float = i * 0.6
	Dim f4 As Float = i * 0.3
	If totemtagstypeVarArr.Length > 0 Then
		panelWrapper.Initialize("")
		panelWrapper.Color = -65536
		panelWrapper.SetLayout(0, 0, totemtagstypeVarArr.Length * i, i)
		Dim length As Int = totemtagstypeVarArr.Length - 1
		Dim i2 As Int
		For i2 = 0 To length
			Dim v7 As ImageView = Utility.v7(totemtagstypeVarArr(i2).ImageFileName, "", "", i, f2)
			v7.Gravity = 49
			panelWrapper.AddView(v7, i2 * i, f, i, f2)
			Dim labelWrapper As Label
			labelWrapper.Initialize("")
			Dim strArr() As String = totemtagstypeVarArr(i2).Name
			labelWrapper.Text = strArr(language.Sub004)
			labelWrapper.Gravity = 81
			labelWrapper.TextColor = -16777216
			panelWrapper.AddView(labelWrapper, i2 * i, f3, i, f4)
		Next
	End If
	Return panelWrapper
End Sub

Sub Sub005 As Panel
	Return vPnl1
End Sub

Sub Initialize(orderviewVar As orderview)
	vorderview1 = orderviewVar
	vPnl1 = Sub003()
End Sub

Sub Sub006(totemproducttypeVar As totemproducttype)
	vLbl1.Text = totemproducttypeVar.Name
	If totemdata.vtotemparamtype1.ShowProductCode Then
		vLbl1.Text = vLbl1.Text & " (" & totemproducttypeVar.Code & ")"
	End If
	vPnl2.RemoveAllViews
	vPnl2.AddView(Utility.v7(totemproducttypeVar.ImageFileName, "", "", vPnl2.Width * 0.96, vPnl2.Height * 0.96), vPnl2.Width * 0.02, vPnl2.Height * 0.02, vPnl2.Width * 0.96, vPnl2.Height * 0.96)
	Dim labelWrapper As Label = vLbl2
	labelWrapper.Text = totemproducttypeVar.Description(language.Sub004)
	vPnl3.RemoveAllViews
	vPnl3.AddView(Sub002(totemproducttypeVar.Allergens, totemproducttypeVar.Tags, vPnl3.Height), 0, 0, vPnl3.Width, vPnl3.Height)
	Dim buttonWrapper As Button = vBtn1
	buttonWrapper.Text = language.Sub006(5)
End Sub

