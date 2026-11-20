B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vPnl1 As Panel
	Public vInt1 As Int
	Public vInt2 As Int
	Public vLst1 As List
	Public vLbl1 As Label
End Sub

Sub Buttonremove_Click
	Dim buttonWrapper As Button
	Sub010(Sender.Tag)
	Sub009()
	vorderview1.orderupdatecounter_click
	vorderview1.Sub013
End Sub

Sub Sub001(i As Int, i2 As Int, totemorderrowtypeVar As totemorderrowtype, i3 As Int) As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = -12303292
	Dim colorDrawable As ColorDrawable
	colorDrawable.Initialize2(0, 2, 2, -16777216)
	panelWrapper.Background = colorDrawable
	Dim labelWrapper As Label
	Sub011(labelWrapper, totemorderrowtypeVar.Quantity, i2 / 2, 5)
	panelWrapper.AddView(labelWrapper, 0, 0, i * 0.2, i2)
	Dim labelWrapper2 As Label
	Dim str As String = ""
	If Not(totemorderrowtypeVar.Product = Null) Then
		str = totemorderrowtypeVar.Product.Name
	Else If Not(totemorderrowtypeVar.ProductListMenu = Null) Then
		str = totemorderrowtypeVar.ProductListMenu.ProductMenu.Name
	End If
	Sub011(labelWrapper2, str, i2 / 2, 3)
	panelWrapper.AddView(labelWrapper2, i * 0.22, 0, i * 0.4, i2)
	Dim labelWrapper3 As Label
	Sub011(labelWrapper3, Utility.vv3(totemorderrowtypeVar.SubTotal), i2 / 2, 5)
	panelWrapper.AddView(labelWrapper3, i * 0.72, 0, i * 0.25, i2)
	panelWrapper.Height = i2
	Dim i4 As Int = i * 0.2
	Dim i5 As Int = i * 0.79
	If Not(totemorderrowtypeVar.ProductListMenu = Null) Then
		Dim vTmp As Panel = Sub003(i5, i2, totemorderrowtypeVar.ProductListMenu)
		panelWrapper.AddView(vTmp, i4, i2, vTmp.Width, vTmp.Height)
		panelWrapper.Height = panelWrapper.Height + vTmp.Height
	End If
	If Not(totemorderrowtypeVar.Product = Null) And Not(totemorderrowtypeVar.Product.Variations = Null) And totemorderrowtypeVar.Product.Variations.Length > 0 Then
		Dim vTmp_ As Panel = Sub004(i5, i2, totemorderrowtypeVar.Product.Variations)
		panelWrapper.AddView(vTmp_, i4, i2, vTmp_.Width, vTmp_.Height)
		panelWrapper.Height = panelWrapper.Height + vTmp_.Height
	End If
	Dim buttonWrapper As Button
	buttonWrapper.Initialize("buttonRemove")
	buttonWrapper.Tag = i3
	buttonWrapper.TextSize = i2 / 2.8
	vLst1.Add(buttonWrapper)
	panelWrapper.AddView(buttonWrapper, i * 0.2, panelWrapper.Height, i * 0.6, i2 + i2 * 0.2)
	panelWrapper.Height = panelWrapper.Height + buttonWrapper.Height
	panelWrapper.SetLayout(0, 0, i, panelWrapper.Height)
	Return panelWrapper
End Sub

Sub Sub002(i As Int, i2 As Int) As ScrollView
	Dim i3 As Int
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Dim i4 As Int = i2 * 0.005
	vLst1.Clear
	If totemdata.vtotemorderheadtype1.RowsList.Size > 0 Then
		Dim size As Int = totemdata.vtotemorderheadtype1.RowsList.Size - 1
		i3 = 0
		Dim i5 As Int
		For i5 = 0 To size
			Dim totemorderrowtypeVar As totemorderrowtype = totemdata.vtotemorderheadtype1.RowsList.Get(i5)
			Dim vTmp As Panel = Sub001(i, i2 / 20, totemorderrowtypeVar, i5)
			panelWrapper.AddView(vTmp, 0, i3, i, vTmp.Height)
			i3 = vTmp.Height + i3 + i4
		Next
	Else
		i3 = 0
	End If
	Dim vTmp_ As Panel = Sub005(i, i2 / 18, Sub006())
	panelWrapper.AddView(vTmp_, 0, i3, vTmp_.Width, vTmp_.Height)
	Dim height As Int = vTmp_.Height + i3
	panelWrapper.Width = i
	panelWrapper.Height = height
	Dim scrollViewWrapper As ScrollView
	scrollViewWrapper.Initialize(0)
	scrollViewWrapper.Panel.AddView(panelWrapper, 0, 0, i, panelWrapper.Height)
	scrollViewWrapper.Panel.Height = panelWrapper.Height
	Return scrollViewWrapper
End Sub

Sub Sub003(i As Int, i2 As Int, totemmenulistproducttypeVar As totemmenulistproducttype) As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = -3355444
	Dim i3 As Int = i2 / 1.2
	If totemmenulistproducttypeVar.Products.Length > 0 Then
		Dim i4 As Int = 0
		Dim length As Int = totemmenulistproducttypeVar.Products.Length - 1
		Dim i5 As Int
		For i5 = 0 To length
			Dim labelWrapper As Label
			Sub011(labelWrapper, totemmenulistproducttypeVar.Products(i5).Name, i3 / 2, 3)
			panelWrapper.AddView(labelWrapper, 0, i4, i, i3)
			i4 = i4 + i3
			If Not(totemmenulistproducttypeVar.Products(i5).Variations = Null) And totemmenulistproducttypeVar.Products(i5).Variations.Length > 0 Then
				Dim vTmp As Panel = Sub004(i * 0.8, i3, totemmenulistproducttypeVar.Products(i5).Variations)
				panelWrapper.AddView(vTmp, i * 0.2, i4, vTmp.Width, vTmp.Height)
				i4 = i4 + vTmp.Height
			End If
		Next
		panelWrapper.SetLayout(0, 0, i, i4)
	End If
	Return panelWrapper
End Sub

Sub Sub004(i As Int, i2 As Int, totemproductvariationstypeVarArr As totemproductvariationstype()) As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = -65281
	If totemproductvariationstypeVarArr.Length > 0 Then
		Dim length As Int = totemproductvariationstypeVarArr.Length - 1
		Dim i3 As Int = 0
		Dim i4 As Int
		For i4 = 0 To length
			If totemproductvariationstypeVarArr(i4).FlgSelected Then
				Dim strArr() As String = totemproductvariationstypeVarArr(i4).Description
				Dim sb As String = totemproductvariationstypeVarArr(i4).Name & " (" & strArr(language.Sub004) & ")"
				If totemproductvariationstypeVarArr(i4).FlgExceedingSelected Then
					sb = sb & " " & language.Sub006(1)
				End If
				Dim labelWrapper As Label
				Sub011(labelWrapper, sb, i2 / 2.4, 3)
				panelWrapper.AddView(labelWrapper, 0, i3, i, i2)
				i3 = i3 + i2
			End If
		Next
		panelWrapper.SetLayout(0, 0, i, i3)
	End If
	Return panelWrapper
End Sub

Sub Sub005(i As Int, i2 As Int, str As String) As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = -7829368
	panelWrapper.SetLayout(0, 0, i, i2)
	Sub011(vLbl1, "", i2 / 2, 19)
	panelWrapper.AddView(vLbl1, panelWrapper.Width * 0.02, 0, panelWrapper.Width * 0.46, i2)
	Dim labelWrapper As Label
	Sub011(labelWrapper, str, i2 / 2, 21)
	panelWrapper.AddView(labelWrapper, panelWrapper.Width * 0.5, 0, panelWrapper.Width * 0.46, i2)
	Return panelWrapper
End Sub

Sub Sub006 As String
	Dim d As Double = 0
	If totemdata.vtotemorderheadtype1.RowsList.Size > 0 Then
		Dim size As Int = totemdata.vtotemorderheadtype1.RowsList.Size - 1
		Dim d2 As Double = 0
		Dim i As Int
		For i = 0 To size
			d2 = d2 + totemdata.vtotemorderheadtype1.RowsList.Get(i).SubTotal
		Next
		d = d2
	End If
	Return Utility.vv3(d)
End Sub

Sub Sub007 As Panel
	Sub009()
	Return vPnl1
End Sub

Sub Initialize(orderviewVar As orderview, i As Int, i2 As Int)
	vorderview1 = orderviewVar
	vPnl1.Initialize("")
	vInt1 = i
	vInt2 = i2
	vLst1.Initialize
End Sub

Sub Sub008
	Dim labelWrapper As Label = vLbl1
	labelWrapper.Text = language.Sub006(7)
	language.Sub008(vLst1, 12)
End Sub

Sub Sub009
	vPnl1.RemoveAllViews
	vPnl1.AddView(Sub002(vInt1, vInt2), 0, 0, vInt1, vInt2)
	Sub008()
End Sub

Sub Sub010(i As Int)
	If i > -1 Then
		totemdata.vtotemorderheadtype1.RowsList.RemoveAt(i)
		Return
	End If
End Sub

Sub Sub011(labelWrapper As Label, str As String, i As Int, i2 As Int)
	labelWrapper.Initialize("")
	labelWrapper.Text = str
	labelWrapper.TextSize = i
	labelWrapper.Padding = Array As Int(2, 0, 2, 0)
	labelWrapper.Gravity = i2
	labelWrapper.TextColor = -16777216
End Sub

