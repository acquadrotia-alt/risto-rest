B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vPnl1 As Panel
	Public vtotemproducttype1 As totemproducttype
	Public vtotemproducttype2 As totemproducttype
	Public vImg1 As ImageView
	Public vLbl1 As Label
	Public vBtn1 As Button
	Public vLbl2 As Label
	Public vLbl3 As Label
	Public vorderproductvariationsview1 As orderproductvariationsview
	Public vBtn2 As Button
End Sub

Sub Buttonaddproductwithvariationtoorder_Click
	vorderview1.orderaddproduct_itemclick(vtotemproducttype2)
	Sub003()
End Sub

Sub Buttoninfoproduct_Click
	vorderview1.orderinfoproductshow_click(vtotemproducttype1)
End Sub

Sub Sub001 As Panel
	Return vPnl1
End Sub

Sub Sub002(i As Int, i2 As Int) As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.SetLayout(0, 0, i, i2)
	vImg1 = Utility.v7(vtotemproducttype2.ImageFileName, "", "", panelWrapper.Width * 0.45, panelWrapper.Height * 0.45)
	panelWrapper.AddView(vImg1, panelWrapper.Width * 0.02, panelWrapper.Height * 0.02, panelWrapper.Width * 0.45, panelWrapper.Height * 0.45)
	vLbl1.Initialize("")
	Dim labelWrapper As Label = vLbl1
	labelWrapper.Text = Utility.vv3(vtotemproducttype2.Price)
	vLbl1.TextSize = i2 / 14
	Dim labelWrapper2 As Label = vLbl1
	labelWrapper2.Typeface = Typeface.DEFAULT_BOLD
	Dim labelWrapper3 As Label = vLbl1
	labelWrapper3.Gravity = 21
	panelWrapper.AddView(vLbl1, panelWrapper.Width * 0.1, panelWrapper.Height * 0.02, panelWrapper.Width * 0.35, panelWrapper.Height * 0.1)
	vLbl2.Initialize("")
	vLbl2.Text = vtotemproducttype2.Name
	If totemdata.vtotemparamtype1.ShowProductCode Then
		vLbl2.Text = vLbl2.Text & " (" & vtotemproducttype2.Code & ")"
	End If
	Dim labelWrapper4 As Label = vLbl2
	labelWrapper4.TextColor = -16777216
	Dim labelWrapper5 As Label = vLbl2
	labelWrapper5.Color = -3355444
	panelWrapper.AddView(vLbl2, panelWrapper.Width * 0.5, panelWrapper.Height * 0.05, panelWrapper.Width * 0.4, panelWrapper.Height * 0.1)
	vLbl3.Initialize("")
	Dim labelWrapper6 As Label = vLbl3
	labelWrapper6.TextColor = -16777216
	Dim labelWrapper7 As Label = vLbl3
	labelWrapper7.Color = -3355444
	panelWrapper.AddView(vLbl3, panelWrapper.Width * 0.5, panelWrapper.Height * 0.17, panelWrapper.Width * 0.4, panelWrapper.Height * 0.22)
	vBtn1.Initialize("buttonInfoProduct")
	vBtn1.TextSize = i2 / 30
	panelWrapper.AddView(vBtn1, panelWrapper.Width * 0.53, panelWrapper.Height * 0.4, panelWrapper.Width * 0.32, panelWrapper.Height * 0.1)
	Dim totemproducttypeVar As totemproducttype = vtotemproducttype2
	vorderproductvariationsview1.Initialize(vorderview1, vLbl1, i * 0.85, i2 * 0.08, totemproducttypeVar, Null)
	panelWrapper.AddView(vorderproductvariationsview1.Sub003, panelWrapper.Width * 0.05, panelWrapper.Height * 0.5, panelWrapper.Width * 0.85, panelWrapper.Height * 0.4)
	vBtn2.Initialize("buttonAddProductWithVariationToOrder")
	panelWrapper.AddView(vBtn2, panelWrapper.Width * 0.3, panelWrapper.Height * 0.9, panelWrapper.Width * 0.4, panelWrapper.Height * 0.1)
	Return panelWrapper
End Sub

Sub Sub003
	vtotemproducttype2 = totemdata.Sub002(vtotemproducttype1)
	vPnl1.RemoveAllViews
	vPnl1.AddView(Sub002(vPnl1.Width, vPnl1.Height), 0, 0, vPnl1.Width, vPnl1.Height)
	Sub004()
End Sub

Sub Initialize(orderviewVar As orderview, i As Int, i2 As Int, totemproducttypeVar As totemproducttype)
	vorderview1 = orderviewVar
	vtotemproducttype1 = totemproducttypeVar
	vPnl1.Initialize("")
	vPnl1.SetLayout(0, 0, i, i2)
	Sub003()
End Sub

Sub Sub004
	Dim labelWrapper As Label = vLbl3
	Dim strArr() As String = vtotemproducttype2.Description
	labelWrapper.Text = strArr(language.Sub004)
	Dim buttonWrapper As Button = vBtn1
	buttonWrapper.Text = language.Sub006(4)
	Dim buttonWrapper2 As Button = vBtn2
	buttonWrapper2.Text = language.Sub006(0)
	vorderproductvariationsview1.Sub004
End Sub

