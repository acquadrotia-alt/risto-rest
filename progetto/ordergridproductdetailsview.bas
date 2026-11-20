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
	Public vtotemproducttypeArr1() As totemproducttype
	Public vtotemmenulistproducttypeArr1() As totemmenulistproducttype
	Public vLst1 As List
	Public vLst2 As List
End Sub

Sub Buttonaddtoorder_Click
	Dim buttonWrapper As Button
	vorderview1.orderaddproduct_itemclick(vtotemproducttypeArr1(Sender.Tag))
End Sub

Sub Buttoninfoproduct_Click
	Dim buttonWrapper As Button
	vorderview1.orderinfoproductshow_click(vtotemproducttypeArr1(Sender.Tag))
End Sub

Sub Sub001(i As Int, i2 As Int, i3 As Int, str As String, str2 As String, z As Boolean, str3 As String, d As Double) As Panel
	Dim z2 As Boolean
	Dim panelWrapper As Panel
	Dim colorDrawable As ColorDrawable
	Dim labelWrapper As Label
	Dim labelWrapper2 As Label
	Dim buttonWrapper As Button
	Dim buttonWrapper2 As Button
	If vtotemproducttypeArr1 = Null Or Not(vtotemproducttypeArr1(i3).Variations = Null Or vtotemproducttypeArr1(i3).Variations.Length = 0) Then
		z2 = False
	Else
		z2 = True
	End If
	If Not(vtotemmenulistproducttypeArr1 = Null) Then
		panelWrapper.Initialize("MenuItemProduct")
		panelWrapper.Tag = i3
	Else
		If Not(z2) Then
			panelWrapper.Initialize("ItemProductVariation")
			panelWrapper.Tag = i3
		Else
			panelWrapper.Initialize("")
		End If
	End If
	panelWrapper.SetLayout(0, 0, i, i2)
	panelWrapper.Color = -16776961
	colorDrawable.Initialize2(0, 2, 2, -16777216)
	panelWrapper.Background = colorDrawable
	panelWrapper.AddView(Utility.v7(str2, "", "", panelWrapper.Width * 0.8, panelWrapper.Height * 0.6), panelWrapper.Width * 0.1, panelWrapper.Height * 0.1, panelWrapper.Width * 0.8, panelWrapper.Height * 0.6)
	Dim sb As String = "discounted_product_" & language.Sub003 & ".png"
	If z Then
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("")
		imageViewWrapper.Bitmap = LoadBitmapResize(File.DirAssets, sb, panelWrapper.Width * 0.2, panelWrapper.Height * 0.2, True)
		panelWrapper.AddView(imageViewWrapper, panelWrapper.Width * 0.02, panelWrapper.Height * 0.02, panelWrapper.Width * 0.2, panelWrapper.Height * 0.2)
	End If
	labelWrapper2.Initialize("")
	labelWrapper2.Text = str3
	If totemdata.vtotemparamtype1.ShowProductCode Then
		labelWrapper2.Text = labelWrapper2.Text & " (" & str & ")"
	End If
	labelWrapper2.Gravity = 17
	If z2 Then
		panelWrapper.AddView(labelWrapper2, panelWrapper.Width * 0.05, panelWrapper.Height * 0.65, panelWrapper.Width * 0.9, panelWrapper.Height * 0.15)
	Else
		panelWrapper.AddView(labelWrapper2, panelWrapper.Width * 0.05, panelWrapper.Height * 0.75, panelWrapper.Width * 0.9, panelWrapper.Height * 0.2)
	End If
	labelWrapper.Initialize("")
	labelWrapper.Text = Utility.vv3(d)
	labelWrapper.Gravity = 17
	labelWrapper.Typeface = Typeface.DEFAULT_BOLD
	labelWrapper.TextSize = i2 / 10
	panelWrapper.AddView(labelWrapper, panelWrapper.Width * 0.6, panelWrapper.Height * 0.05, panelWrapper.Width * 0.35, panelWrapper.Height * 0.15)
	If z2 Then
		buttonWrapper.Initialize("buttonAddToOrder")
		buttonWrapper.Tag = i3
		buttonWrapper.TextSize = i2 / 18
		panelWrapper.AddView(buttonWrapper, panelWrapper.Width * 0.05, panelWrapper.Height * 0.78, panelWrapper.Width * 0.4, panelWrapper.Height * 0.24)
		vLst1.Add(buttonWrapper)
		buttonWrapper2.Initialize("buttonInfoProduct")
		buttonWrapper2.Tag = i3
		buttonWrapper2.TextSize = i2 / 18
		panelWrapper.AddView(buttonWrapper2, panelWrapper.Width * 0.55, panelWrapper.Height * 0.78, panelWrapper.Width * 0.4, panelWrapper.Height * 0.24)
		vLst2.Add(buttonWrapper2)
	End If
	Return panelWrapper
End Sub

Sub Sub002 As View
	Return vScrollView1
End Sub

Sub Initialize(orderviewVar As orderview, i As Int, i2 As Int, i3 As Int, totemproducttypeVarArr As totemproducttype(), totemmenulistproducttypeVarArr As totemmenulistproducttype())
	Dim i4 As Int
	Dim i5 As Int
	Dim i6 As Int
	Dim i7 As Int
	vorderview1 = orderviewVar
	vtotemproducttypeArr1 = totemproducttypeVarArr
	vtotemmenulistproducttypeArr1 = totemmenulistproducttypeVarArr
	vLst1.Initialize
	vLst2.Initialize
	Dim i8 As Int = i / i3 - i * 0.05
	If (Not(vtotemproducttypeArr1 = Null) And vtotemproducttypeArr1.Length > 0) Or (Not(vtotemmenulistproducttypeArr1 = Null) And vtotemmenulistproducttypeArr1.Length > 0) Then
		Dim i9 As Int = (i - i8 * i3) / i3
		vPnl1.Initialize("")
		Dim i10 As Int = 0
		Dim i11 As Int = 0
		If Not(totemproducttypeVarArr = Null) Then
			i4 = vtotemproducttypeArr1.Length - 1
		Else If totemmenulistproducttypeVarArr = Null Then
			i4 = 0
		Else
			i4 = totemmenulistproducttypeVarArr.Length - 1
		End If
		Dim i12 As Int = 0
		Dim i13 As Int = 0
		Do While i12 <= i4
			If i13 = 0 Then
				i5 = (i8 + i9) * i11
				i10 = i9 / 2
			Else
				i5 = (i8 + i9) * i11
				i10 = i10 + (i8 + i9)
			End If
			Dim panelWrapper As Panel
			If Not(totemproducttypeVarArr = Null) Then
				panelWrapper = Sub001(i8, i8, i12, vtotemproducttypeArr1(i12).Code, vtotemproducttypeArr1(i12).ImageFileName, vtotemproducttypeArr1(i12).IsDiscounted, vtotemproducttypeArr1(i12).Name, vtotemproducttypeArr1(i12).Price)
			Else If Not(totemmenulistproducttypeVarArr = Null) Then
				panelWrapper = Sub001(i8, i8, i12, vtotemmenulistproducttypeArr1(i12).ProductMenu.Code, vtotemmenulistproducttypeArr1(i12).ProductMenu.ImageFileName, vtotemmenulistproducttypeArr1(i12).ProductMenu.IsDiscounted, vtotemmenulistproducttypeArr1(i12).ProductMenu.Name, vtotemmenulistproducttypeArr1(i12).ProductMenu.Price)
			End If
			vPnl1.AddView(panelWrapper, i10, i5, i8, i8)
			If i13 < i3 - 1 Then
				i6 = i13 + 1
				i7 = i11
			Else
				i6 = 0
				i7 = i11 + 1
			End If
			i12 = i12 + 1
			i13 = i6
			i11 = i7
		Loop
		If i13 <> 0 Then
			i11 = i11 + 1
		End If
		vPnl1.SetLayout(0, 0, i, (i8 + i9) * i11)
		vScrollView1.Initialize(0)
		vScrollView1.Panel.AddView(vPnl1, 0, 0, vPnl1.Width, vPnl1.Height)
		vScrollView1.Panel.Height = vPnl1.Height
	End If
	Sub003()
End Sub

Sub Itemproductvariation_Click
	Dim panelWrapper As Panel
	vorderview1.orderproductvariationdetails_itemclick(vtotemproducttypeArr1(Sender.Tag))
End Sub

Sub Menuitemproduct_Click
	Dim panelWrapper As Panel
	vorderview1.ordermenuproductdetails_itemclick(vtotemmenulistproducttypeArr1(Sender.Tag))
End Sub

Sub Sub003
	language.Sub008(vLst1, 0)
	language.Sub008(vLst2, 4)
End Sub

