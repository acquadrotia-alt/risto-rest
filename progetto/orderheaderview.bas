B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vPnl1 As Panel
	Public vPnl2 As Panel
	Public vLbl1 As Label
	Public vLbl2 As Label
	Public vlanguagechooserview1 As languagechooserview
End Sub

Sub Sub001(totemmenulistproducttypeVar As totemmenulistproducttype)
	Dim vTmp As Int = Sub003(Null, totemmenulistproducttypeVar)
	If vTmp > -1 Then
		Dim totemorderrowtypeVar As totemorderrowtype = totemdata.vtotemorderheadtype1.RowsList.Get(vTmp)
		totemorderrowtypeVar.Quantity = totemorderrowtypeVar.Quantity + 1
		totemorderrowtypeVar.SubTotal = Utility.v0(totemorderrowtypeVar.Quantity, totemorderrowtypeVar.ProductListMenu)
	Else
		Dim totemorderrowtypeVar2 As totemorderrowtype
		totemorderrowtypeVar2.Initialize
		totemorderrowtypeVar2.Quantity = 1
		totemorderrowtypeVar2.Product = Null
		totemorderrowtypeVar2.ProductListMenu = totemmenulistproducttypeVar
		totemorderrowtypeVar2.SubTotal = Utility.v0(totemorderrowtypeVar2.Quantity, totemorderrowtypeVar2.ProductListMenu)
		totemdata.vtotemorderheadtype1.RowsList.Add(totemorderrowtypeVar2)
	End If
	Sub008()
End Sub

Sub Sub002(totemproducttypeVar As totemproducttype)
	Dim vTmp As Int = Sub003(totemproducttypeVar, Null)
	If vTmp > -1 Then
		Dim totemorderrowtypeVar As totemorderrowtype = totemdata.vtotemorderheadtype1.RowsList.Get(vTmp)
		totemorderrowtypeVar.Quantity = totemorderrowtypeVar.Quantity + 1
		totemorderrowtypeVar.SubTotal = Utility.vv1(totemorderrowtypeVar.Quantity, totemproducttypeVar, totemorderrowtypeVar.Sconto)
	Else
		Dim totemorderrowtypeVar2 As totemorderrowtype
		totemorderrowtypeVar2.Initialize
		totemorderrowtypeVar2.Quantity = 1
		totemorderrowtypeVar2.Product = totemproducttypeVar
		totemorderrowtypeVar2.ProductListMenu = Null
		totemorderrowtypeVar2.Sconto = 0
		totemorderrowtypeVar2.SubTotal = Utility.vv1(totemorderrowtypeVar2.Quantity, totemproducttypeVar, totemorderrowtypeVar2.Sconto)
		totemdata.vtotemorderheadtype1.RowsList.Add(totemorderrowtypeVar2)
	End If
	Sub008()
End Sub

Sub Sub003(totemproducttypeVar As totemproducttype, totemmenulistproducttypeVar As totemmenulistproducttype) As Int
	If totemdata.vtotemorderheadtype1.RowsList.Size > 0 Then
		Dim size As Int = totemdata.vtotemorderheadtype1.RowsList.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim totemorderrowtypeVar As totemorderrowtype = totemdata.vtotemorderheadtype1.RowsList.Get(i)
			If Not(totemproducttypeVar = Null) And Not(totemorderrowtypeVar.Product = Null) Then
				If totemdata.Sub013(totemorderrowtypeVar.Product, totemproducttypeVar) Then
					Return i
				End If
			End If
			If Not(totemmenulistproducttypeVar = Null) And Not(totemorderrowtypeVar.ProductListMenu = Null) Then
				If totemdata.Sub012(totemorderrowtypeVar.ProductListMenu, totemmenulistproducttypeVar) Then
					Return i
				End If
			End If
		Next
	End If
	Return -1
End Sub

Sub Sub004 As Panel
	Return vPnl1
End Sub

Sub Initialize(orderviewVar As orderview, i As Int, i2 As Int)
	vorderview1 = orderviewVar
	vPnl1.Initialize("")
	vPnl1.SetLayout(0, 0, i, i2)
	Dim panelWrapper As Panel = vPnl1
	panelWrapper.Color = -256
	vlanguagechooserview1.Initialize(vorderview1, i * 0.45, i2 * 0.98)
	vPnl1.AddView(vlanguagechooserview1.Sub001, i * 0.05, i2 * 0.01, i * 0.45, i2 * 0.98)
	Dim i3 As Int = i * 0.43
	Dim i4 As Int = i2 * 0.98
	vPnl2.Initialize("")
	vPnl2.SetLayout(0, 0, i3, i4)
	Dim panelWrapper2 As Panel = vPnl2
	panelWrapper2.Color = -3355444
	vLbl1.Initialize("")
	Dim labelWrapper As Label = vLbl1
	Sub007(labelWrapper, i2, -7829368)
	vPnl2.AddView(vLbl1, vPnl2.Width * 0.01, vPnl2.Height * 0.05, vPnl2.Width * 0.36, vPnl2.Height * 0.9)
	vLbl2.Initialize("mPanelTotalAmount")
	Dim labelWrapper2 As Label = vLbl2
	Sub007(labelWrapper2, i2, -12303292)
	vPnl2.AddView(vLbl2, vPnl2.Width * 0.38, vPnl2.Height * 0.05, vPnl2.Width * 0.61, vPnl2.Height * 0.9)
	vPnl1.AddView(vPnl2, i * 0.52, i2 * 0.01, i3, i4)
	Sub008()
End Sub

Sub Mpaneltotalamount_Click
	vorderview1.ordershoppingcartshow_click
End Sub

Sub Sub005
	totemdata.vtotemorderheadtype1.RowsList.Clear
	Sub008()
End Sub

Sub Sub006 As Map
	Dim d As Double = 0
	Dim map As Map
	map.Initialize
	If totemdata.vtotemorderheadtype1.RowsList.Size > 0 Then
		Dim size As Int = totemdata.vtotemorderheadtype1.RowsList.Size - 1
		Dim i As Int = 0
		Dim i2 As Int
		For i2 = 0 To size
			Dim totemorderrowtypeVar As totemorderrowtype = totemdata.vtotemorderheadtype1.RowsList.Get(i2)
			map.Put("IdRow", i2)
			map.Put("Code_" & i2, totemorderrowtypeVar.Product.Code)
			map.Put("Qty_" & i2, totemorderrowtypeVar.Quantity)
			i = i + totemorderrowtypeVar.Quantity
			d = d + totemorderrowtypeVar.SubTotal
		Next
		map.Put("TotRows", totemdata.vtotemorderheadtype1.RowsList.Size)
	End If
	Return map
End Sub

Sub Sub007(labelWrapper As Label, i As Int, i2 As Int)
	labelWrapper.Color = i2
	labelWrapper.Gravity = 17
	labelWrapper.TextSize = i / 2
	labelWrapper.Typeface = Typeface.DEFAULT_BOLD
End Sub

Sub Sub008
	Dim i As Int = 0
	Dim d As Double = 0
	If totemdata.vtotemorderheadtype1.RowsList.Size > 0 Then
		Dim size As Int = totemdata.vtotemorderheadtype1.RowsList.Size - 1
		Dim i2 As Int = 0
		Dim i3 As Int = 0
		Dim d2 As Double = 0
		Do While i2 <= size
			Dim totemorderrowtypeVar As totemorderrowtype = totemdata.vtotemorderheadtype1.RowsList.Get(i2)
			Dim i4 As Int = totemorderrowtypeVar.Quantity + i3
			i2 = i2 + 1
			d2 = totemorderrowtypeVar.SubTotal + d2
			i3 = i4
		Loop
		i = i3
		d = d2
	End If
	vLbl1.Text = i
	Dim labelWrapper As Label = vLbl2
	labelWrapper.Text = Utility.vv3(d)
End Sub

Sub Sub009(map As Map)
	Dim size As Int = totemdata.vtotemorderheadtype1.RowsList.Size - 1
	Dim i As Int
	For i = 0 To size
		Dim totemorderrowtypeVar As totemorderrowtype = totemdata.vtotemorderheadtype1.RowsList.Get(i)
		If map.ContainsKey("Amount_" & i) Then
			Dim vObjectToNumber As Double = map.GetDefault("Amount_" & i, 0)
			If vObjectToNumber < totemorderrowtypeVar.SubTotal Then
				totemorderrowtypeVar.Sconto = Round2(totemorderrowtypeVar.Product.Price * totemorderrowtypeVar.Quantity - vObjectToNumber, 2)
				totemorderrowtypeVar.SubTotal = vObjectToNumber
			End If
		End If
	Next
End Sub

