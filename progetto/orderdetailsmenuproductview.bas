B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vPnl1 As Panel
	Public vtotemmenulistproducttype1 As totemmenulistproducttype
	Public vtotemmenulistproducttype2 As totemmenulistproducttype
	Public vorderproductvariationsviewArr1() As orderproductvariationsview
	Public vPnl2 As Panel
	Public vLbl1 As Label
	Public vPnl3 As Panel
	Public vPnl4 As Panel
	Public vInt1 As Int
	Public vInt2 As Int
	Public vHorizontalScrollView1 As HorizontalScrollView
	Public vPanelArr1() As Panel
	Public vButtonArr1() As Button
	Public vBtn1 As Button
End Sub

Sub Buttonaddmenutoorder_Click
	vorderview1.orderaddmenuproduct_itemclick(vtotemmenulistproducttype2)
	Sub007()
End Sub

Sub Buttoninfomenuproduct_Click
	Dim buttonWrapper As Button
	vorderview1.orderinfoproductshow_click(vtotemmenulistproducttype2.Products(Sender.Tag))
End Sub

Sub Buttonnavigationnext_Click
	If vInt1 < vtotemmenulistproducttype2.Products.Length - 1 Then
		vInt1 = vInt1 + 1
	End If
	Sub010(vInt1)
End Sub

Sub Buttonnavigationprevius_Click
	If vInt1 > 0 Then
		vInt1 = vInt1 - 1
	End If
	Sub010(vInt1)
End Sub

Sub Sub001(i As Int, i2 As Int) As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.SetLayout(0, 0, i, i2)
	panelWrapper.Color = Colors.ARGB(0, 25, 25, 25)
	Dim i3 As Int = i * 0.3
	Dim i4 As Int = i2 * 0.1
	vBtn1.Initialize("buttonAddMenuToOrder")
	panelWrapper.AddView(vBtn1, i3, i4, panelWrapper.Width - i3 * 2, panelWrapper.Height - i4 * 2)
	Return panelWrapper
End Sub

Sub Sub002(i As Int) As Panel
	Dim i2 As Int = vInt2 / 4
	Dim i3 As Int = vInt2
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Dim buttonWrapper As Button
	buttonWrapper.Initialize("buttonNavigationPrevius")
	buttonWrapper.Text = "<"
	panelWrapper.AddView(buttonWrapper, 0, 0, i2, i3)
	Dim vTmp As Panel = Sub006()
	panelWrapper.AddView(vTmp, i2, 0, i - i2 * 2, i3)
	Dim buttonWrapper2 As Button
	buttonWrapper2.Initialize("buttonNavigationNext")
	buttonWrapper2.Text = ">"
	panelWrapper.AddView(buttonWrapper2, buttonWrapper.Width + vTmp.Width, 0, i2, i3)
	Return panelWrapper
End Sub

Sub Sub003 As Panel
	Return vPnl1
End Sub

Sub Sub004(totemproductmenutypeVar As totemproductmenutype, i As Int, i2 As Int) As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = Colors.RGB(34, 12, 67)
	panelWrapper.SetLayout(0, 0, i, i2)
	Dim labelWrapper As Label
	labelWrapper.Initialize("")
	labelWrapper.Text = totemproductmenutypeVar.Name
	labelWrapper.TextColor = -1
	labelWrapper.TextSize = i2 / 2
	labelWrapper.Color = 0
	labelWrapper.Typeface = Typeface.DEFAULT_BOLD
	labelWrapper.Gravity = 17
	panelWrapper.AddView(labelWrapper, i * 0.02, 0, i * 0.8, i2)
	vLbl1.Initialize("")
	Dim labelWrapper2 As Label = vLbl1
	labelWrapper2.Text = Utility.vv3(totemproductmenutypeVar.Price)
	Dim labelWrapper3 As Label = vLbl1
	labelWrapper3.TextColor = -1
	vLbl1.TextSize = i2 / 2
	Dim labelWrapper4 As Label = vLbl1
	labelWrapper4.Color = -65536
	Dim labelWrapper5 As Label = vLbl1
	labelWrapper5.Typeface = Typeface.DEFAULT_BOLD
	Dim labelWrapper6 As Label = vLbl1
	labelWrapper6.Gravity = 17
	panelWrapper.AddView(vLbl1, i * 0.82, 0, i * 0.16, i2)
	Return panelWrapper
End Sub

Sub Sub005(i As Int) As Panel
	Dim i2 As Int = (vInt2 - vInt2 * 0.6) / 2
	Dim panelWrapper As Panel
	panelWrapper.Initialize("TopMenuProduct")
	panelWrapper.Tag = i
	Dim colorDrawable As ColorDrawable
	colorDrawable.Initialize2(0, 2, 2, -16777216)
	panelWrapper.Background = colorDrawable
	panelWrapper.AddView(Utility.v7(vtotemmenulistproducttype2.Products(i).ImageFileName, "", "", vInt2 * 0.6, vInt2 * 0.6), i2, i2 / 2, vInt2 * 0.6, vInt2 * 0.6)
	Dim labelWrapper As Label
	labelWrapper.Initialize("")
	labelWrapper.Text = vtotemmenulistproducttype2.Products(i).Name
	If totemdata.vtotemparamtype1.ShowProductCode Then
		labelWrapper.Text = labelWrapper.Text & " (" & vtotemmenulistproducttype2.Products(i).Code & ")"
	End If
	labelWrapper.Gravity = 81
	labelWrapper.Padding = Array As Int(2, i2, 2, i2 / 2)
	labelWrapper.TextSize = vInt2 / 10
	panelWrapper.AddView(labelWrapper, 0, 0, vInt2, vInt2)
	vButtonArr1(i).Initialize("buttonInfoMenuProduct")
	vButtonArr1(i).Tag = i
	vButtonArr1(i).TextSize = vInt2 / 22
	panelWrapper.AddView(vButtonArr1(i), vInt2 * 0.72, vInt2 * 0.01, vInt2 * 0.28, vInt2 * 0.3)
	Return panelWrapper
End Sub

Sub Sub006 As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.SetLayout(0, 0, vtotemmenulistproducttype2.Products.Length * vInt2, vInt2)
	panelWrapper.Color = -16776961
	Dim panelWrapperArr(vtotemmenulistproducttype2.Products.Length) As Panel
	Dim length As Int = panelWrapperArr.Length
	Dim i As Int
	For i = 0 To length - 1
		'panelWrapperArr(i) = Panel
	Next
	vPanelArr1 = panelWrapperArr
	If vtotemmenulistproducttype2.Products.Length > 0 Then
		Dim buttonWrapperArr(vtotemmenulistproducttype2.Products.Length) As Button
		Dim i2 As Int
		For i2 = 0 To buttonWrapperArr.Length - 1
			'buttonWrapperArr(i2) = Button
		Next
		vButtonArr1 = buttonWrapperArr
		Dim length3 As Int = vtotemmenulistproducttype2.Products.Length - 1
		Dim i3 As Int
		For i3 = 0 To length3
			vPanelArr1(i3) = Sub005(i3)
			panelWrapper.AddView(vPanelArr1(i3), vInt2 * i3, 0, vInt2, vInt2)
		Next
	End If
	vHorizontalScrollView1.Initialize(0, "")
	vHorizontalScrollView1.Panel.AddView(panelWrapper, 0, 0, panelWrapper.Width, panelWrapper.Height)
	vHorizontalScrollView1.Panel.Width = panelWrapper.Width
	Return vHorizontalScrollView1
End Sub

Sub Sub007
	vtotemmenulistproducttype2 = totemdata.Sub003(vtotemmenulistproducttype1)
	vPnl1.RemoveAllViews
	Sub011()
	Sub009()
End Sub

Sub Sub008
	If vtotemmenulistproducttype2.Products.Length > 0 Then
		Dim vorderproductvariationsviewArr1(vtotemmenulistproducttype2.Products.Length) As orderproductvariationsview
		Dim length As Int = vorderproductvariationsviewArr1.Length
		Dim i As Int
		For i = 0 To length - 1
			'vorderproductvariationsviewArr1(i) = orderproductvariationsview
		Next
		Dim length2 As Int = vtotemmenulistproducttype2.Products.Length - 1
		Dim i2 As Int
		For i2 = 0 To length2
			Dim orderproductvariationsviewVar As orderproductvariationsview
			orderproductvariationsviewVar.Initialize(vorderview1, vLbl1, vPnl1.Width, vInt2 / 5, vtotemmenulistproducttype2.Products(i2), vtotemmenulistproducttype2)
			vorderproductvariationsviewArr1(i2) = orderproductvariationsviewVar
			Dim vTmp As View = vorderproductvariationsviewArr1(i2).Sub003
			vTmp.Visible = False
		Next
		Return
	End If
End Sub

Sub Initialize(orderviewVar As orderview, i As Int, i2 As Int, i3 As Int, totemmenulistproducttypeVar As totemmenulistproducttype)
	vorderview1 = orderviewVar
	vtotemmenulistproducttype1 = totemmenulistproducttypeVar
	vInt2 = i3
	vPnl1.Initialize("mPanelMenuProduct")
	vPnl1.SetLayout(0, 0, i, i2)
	Sub007()
End Sub

Sub Sub009
	If vorderproductvariationsviewArr1.Length > 0 Then
		Dim length As Int = vorderproductvariationsviewArr1.Length - 1
		Dim i As Int
		For i = 0 To length
			vorderproductvariationsviewArr1(i).Sub004
		Next
	End If
	Dim buttonWrapper As Button = vBtn1
	buttonWrapper.Text = language.Sub006(0)
	Dim length2 As Int = vButtonArr1.Length - 1
	Dim i2 As Int
	For i2 = 0 To length2
		Dim buttonWrapper2 As Button = vButtonArr1(i2)
		buttonWrapper2.Text = language.Sub006(4)
	Next
End Sub

Sub Sub010(i As Int)
	If vtotemmenulistproducttype2.Products.Length > 0 Then
		Dim length As Int = vtotemmenulistproducttype2.Products.Length - 1
		Dim i2 As Int
		For i2 = 0 To length
			Dim vTmp As View = vorderproductvariationsviewArr1(i2).Sub003
			vTmp.Visible = False
			Dim panelWrapper As Panel = vPanelArr1(i2)
			panelWrapper.Color = 0
		Next
		Dim vTmp_ As View = vorderproductvariationsviewArr1(i).Sub003
		vTmp_.Visible = True
		Dim panelWrapper2 As Panel = vPanelArr1(i)
		panelWrapper2.Color = -3355444
		vHorizontalScrollView1.ScrollPosition = vInt1 * vInt2
		Return
	End If
End Sub

Sub Sub011
	Dim colorDrawable As ColorDrawable
	Dim panelWrapper As Panel = vPnl1
	panelWrapper.Color = -7829368
	colorDrawable.Initialize2(0, 2, 2, -16777216)
	vPnl1.Background = colorDrawable
	Dim i As Int = vInt2 * 0.15
	vPnl2 = Sub004(vtotemmenulistproducttype2.ProductMenu, vPnl1.Width, i)
	vPnl1.AddView(vPnl2, 0, 0, vPnl1.Width, i)
	Dim i2 As Int = vInt2
	vPnl3 = Sub002(vPnl1.Width)
	vPnl1.AddView(vPnl3, 0, i, vPnl1.Width, i2)
	Dim i3 As Int = vInt2 / 2
	vPnl4 = Sub001(vPnl1.Width, i3)
	vPnl1.AddView(vPnl4, 0, vPnl1.Height - i3, vPnl1.Width, i3)
	Dim height As Int = vPnl1.Height - i - i2 - i3
	Sub008()
	If vtotemmenulistproducttype2.Products.Length > 0 Then
		Dim length As Int = vtotemmenulistproducttype2.Products.Length - 1
		Dim i4 As Int
		For i4 = 0 To length
			vPnl1.AddView(vorderproductvariationsviewArr1(i4).Sub003, 0, i + i2, vPnl1.Width, height)
		Next
		Sub010(0)
		Return
	End If
End Sub

Sub Topmenuproduct_Click
	Dim panelWrapper As Panel
	vInt1 = Sender.Tag
	Sub010(vInt1)
End Sub

