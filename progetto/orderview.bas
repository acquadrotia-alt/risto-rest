B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Type ordercontentview(DetailsMenuProduct As orderdetailsmenuproductview, DetailsProductVariations As orderdetailsproductvariationsview, GridProductDetails As ordergridproductdetailsview, PanelContent As Panel)
	Public vPnl1 As Panel
	Public vorderheaderview1 As orderheaderview
	Public vPnl2 As Panel
	Public vordercategoryview1 As ordercategoryview
	Public vordercontentview1 As ordercontentview
	Public vorderbottomview1 As orderbottomview
	Public vordershoppingcartview1 As ordershoppingcartview
	Public vorderproductinfoview1 As orderproductinfoview
	Public vorderdetailsview1 As orderdetailsview
	Public vpublicityview1 As publicityview
	Public vObj1 As Object
	Public vtimeoutoperation1 As timeoutoperation
	Public order_step_publicity As Int
	Public order_step_compose As Int
	Public order_step_summary As Int
	Public vInt1 As Int
End Sub

Sub Sub001 As Panel
	Return vPnl1
End Sub

Sub Sub002(sql As SQL)
	totemdata.Sub015
	If totemdata.vtotemparamtype1.IsSimulation Then
		loaddatasimulation.Initialize
		Return
	End If
	loaddatafromdatabase.Initialize(sql)
End Sub

Sub Initialize(sql As SQL, z As Boolean, str As String, z2 As Boolean, obj As Object)
	Sub004(z, str, z2)
	Sub002(sql)
	vObj1 = obj
	vPnl1.Initialize("PanelOrder")
	Dim panelWrapper As Panel = vPnl1
	panelWrapper.Color = -7829368
	Dim panelWrapper2 As Panel = vPnl1
	Dim vPerXToCurrent As Int = PerXToCurrent(100)
	panelWrapper2.SetLayout(0, 0, vPerXToCurrent, PerYToCurrent(100))
	vpublicityview1.Initialize(Me)
	vtimeoutoperation1.Initialize(Me, 300, 600)
	Sub009()
	language.Sub007(1)
End Sub

Sub Sub003
	vPnl1.RemoveAllViews
	Dim orderheaderviewVar As orderheaderview = vorderheaderview1
	Dim vPerXToCurrent As Int = PerXToCurrent(100)
	orderheaderviewVar.Initialize(Me, vPerXToCurrent, PerYToCurrent(10))
	Dim panelWrapper As Panel = vPnl1
	Dim view As View = vorderheaderview1.Sub004
	Dim vPerXToCurrent2 As Int = PerXToCurrent(100)
	panelWrapper.AddView(view, 0, 0, vPerXToCurrent2, PerYToCurrent(10))
	Dim orderbottomviewVar As orderbottomview = vorderbottomview1
	Dim vPerXToCurrent3 As Int = PerXToCurrent(100)
	orderbottomviewVar.Initialize(Me, vPerXToCurrent3, PerYToCurrent(10))
	Dim panelWrapper2 As Panel = vPnl1
	Dim view2 As View = vorderbottomview1.Sub001
	Dim vPerYToCurrent As Int = PerYToCurrent(90)
	Dim vPerXToCurrent4 As Int = PerXToCurrent(100)
	panelWrapper2.AddView(view2, 0, vPerYToCurrent, vPerXToCurrent4, PerYToCurrent(10))
	vPnl2.Initialize("")
	Dim panelWrapper3 As Panel = vPnl1
	Dim view3 As View = vPnl2
	Dim vPerYToCurrent2 As Int = PerYToCurrent(10)
	Dim vPerXToCurrent5 As Int = PerXToCurrent(100)
	panelWrapper3.AddView(view3, 0, vPerYToCurrent2, vPerXToCurrent5, PerYToCurrent(80))
	Dim ordershoppingcartviewVar As ordershoppingcartview = vordershoppingcartview1
	Dim vPerXToCurrent6 As Int = PerXToCurrent(40)
	ordershoppingcartviewVar.Initialize(Me, vPerXToCurrent6, PerYToCurrent(100))
	vorderproductinfoview1.Initialize(Me)
	vtimeoutoperation1.Sub002
End Sub

Sub Sub004(z As Boolean, str As String, z2 As Boolean)
	totemdata.vtotemparamtype1.Initialize
	totemdata.vtotemparamtype1.IsSimulation = z
	totemdata.vtotemparamtype1.PathImages = str
	totemdata.vtotemparamtype1.ShowProductCode = z2
End Sub

Sub Orderaddmenuproduct_ItemClick(totemmenulistproducttypeVar As totemmenulistproducttype)
	vorderheaderview1.Sub001(totemmenulistproducttypeVar)
	Sub013()
End Sub

Sub Orderaddproduct_ItemClick(totemproducttypeVar As totemproducttype)
	vorderheaderview1.Sub002(totemproducttypeVar)
	Sub013()
End Sub

Sub Ordercancel_Click
	If vInt1 = order_step_compose Then
		vorderheaderview1.Sub005
	Else If vInt1 = order_step_summary Then
		Sub007()
	End If
	Sub013()
End Sub

Sub Ordercategory_ItemClick(i As Int)
	Dim width As Int = vordercontentview1.PanelContent.Width
	Dim height As Int = vordercontentview1.PanelContent.Height
	Sub005(3)
	If i = 0 Then
		If totemdata.vv5.Length > 0 Then
			Dim ordergridproductdetailsviewVar As ordergridproductdetailsview = vordercontentview1.GridProductDetails
			ordergridproductdetailsviewVar.Initialize(Me, width, height, 3, Null, totemdata.vv5)
			vordercontentview1.PanelContent.AddView(vordercontentview1.GridProductDetails.Sub002, 0, 0, vordercontentview1.PanelContent.Width, vordercontentview1.PanelContent.Height)
		End If
	Else
		If totemdata.vv4(i).Products.Length > 0 Then
			Dim ordergridproductdetailsviewVar2 As ordergridproductdetailsview = vordercontentview1.GridProductDetails
			Dim totemproducttypeVarArr2() As totemproducttype = totemdata.vv4(i).Products
			ordergridproductdetailsviewVar2.Initialize(Me, width, height, 3, totemproducttypeVarArr2, Null)
			vordercontentview1.PanelContent.AddView(vordercontentview1.GridProductDetails.Sub002, 0, 0, vordercontentview1.PanelContent.Width, vordercontentview1.PanelContent.Height)
		End If
	End If
	Sub013()
End Sub

Sub Orderconfirm_Click
	Try
		If totemdata.vtotemorderheadtype1.RowsList.Size > 0 Then
			If vInt1 = order_step_compose Then
				Dim vTmp As Map = vorderheaderview1.Sub006
				Dim map As Map
				Dim map2 As Map = CallSub2(vObj1, "GetTotem_Transaction", vTmp)
				If map2.Size > 0 Then
					vorderheaderview1.Sub009(map2)
					Sub008()
				End If
			Else If vInt1 = order_step_summary Then
				If totemdata.vtotemorderheadtype1.PaymentConditions = Null Then
					MsgboxAsync("Selezionare un pagamento", "Messaggio")
					Return
				End If
				If totemdata.vtotemorderheadtype1.RowsList.Size = 0 Then
					MsgboxAsync("Selezionare almeno un articolo", "Messaggio")
					Return
				End If
				CallSub2(vObj1, "CloseTotem_Document", totemdata.vtotemorderheadtype1.PaymentConditions.IdCode)
				vorderheaderview1.Sub005
				Sub007()
			End If
		End If
		Sub013()
	Catch
		Log(LastException)
	End Try
End Sub

Sub Orderinfoproductclose_Click
	vorderproductinfoview1.Sub005.RemoveView
	Sub013()
End Sub

Sub Orderinfoproductshow_Click(totemproducttypeVar As totemproducttype)
	vorderproductinfoview1.Sub006(totemproducttypeVar)
	Dim panelWrapper As Panel = vPnl1
	Dim view As View = vorderproductinfoview1.Sub005
	Dim vPerXToCurrent As Int = PerXToCurrent(100)
	panelWrapper.AddView(view, 0, 0, vPerXToCurrent, PerYToCurrent(100))
	Sub013()
End Sub

Sub Sub005(i As Int)
	vordercontentview1.PanelContent.RemoveAllViews
	Select i
		Case 0
			Dim ordercontentviewVar As ordercontentview = vordercontentview1
			ordercontentviewVar.DetailsMenuProduct = Null
			Dim ordercontentviewVar2 As ordercontentview = vordercontentview1
			ordercontentviewVar2.DetailsProductVariations = Null
			Dim ordercontentviewVar3 As ordercontentview = vordercontentview1
			ordercontentviewVar3.GridProductDetails = Null
		Case 1
			'vordercontentview1.DetailsMenuProduct = orderdetailsmenuproductview
			Dim ordercontentviewVar4 As ordercontentview = vordercontentview1
			ordercontentviewVar4.DetailsProductVariations = Null
			Dim ordercontentviewVar5 As ordercontentview = vordercontentview1
			ordercontentviewVar5.GridProductDetails = Null
		Case 2
			Dim ordercontentviewVar6 As ordercontentview = vordercontentview1
			ordercontentviewVar6.DetailsMenuProduct = Null
			'vordercontentview1.DetailsProductVariations = orderdetailsproductvariationsview
			Dim ordercontentviewVar7 As ordercontentview = vordercontentview1
			ordercontentviewVar7.GridProductDetails = Null
		Case 3
			Dim ordercontentviewVar8 As ordercontentview = vordercontentview1
			ordercontentviewVar8.DetailsMenuProduct = Null
			Dim ordercontentviewVar9 As ordercontentview = vordercontentview1
			ordercontentviewVar9.DetailsProductVariations = Null
			'vordercontentview1.GridProductDetails = ordergridproductdetailsview
	End Select
End Sub

Sub Ordermenuproductdetails_ItemClick(totemmenulistproducttypeVar As totemmenulistproducttype)
	If Not(totemmenulistproducttypeVar = Null) And totemmenulistproducttypeVar.Products.Length > 0 Then
		Sub005(1)
		Dim orderdetailsmenuproductviewVar As orderdetailsmenuproductview = vordercontentview1.DetailsMenuProduct
		Dim width As Int = vordercontentview1.PanelContent.Width
		Dim height As Int = vordercontentview1.PanelContent.Height
		orderdetailsmenuproductviewVar.Initialize(Me, width, height, PerYToCurrent(32), totemmenulistproducttypeVar)
		vordercontentview1.PanelContent.AddView(vordercontentview1.DetailsMenuProduct.Sub003, 0, 0, vordercontentview1.PanelContent.Width, vordercontentview1.PanelContent.Height)
	End If
	Sub013()
End Sub

Sub Orderproductvariationdetails_ItemClick(totemproducttypeVar As totemproducttype)
	If Not(totemproducttypeVar = Null) Then
		Sub005(2)
		vordercontentview1.DetailsProductVariations.Initialize(Me, vordercontentview1.PanelContent.Width, vordercontentview1.PanelContent.Height, totemproducttypeVar)
		vordercontentview1.PanelContent.AddView(vordercontentview1.DetailsProductVariations.Sub001, 0, 0, vordercontentview1.PanelContent.Width, vordercontentview1.PanelContent.Height)
	End If
	Sub013()
End Sub

Sub Ordershoppingcartclose_Click
	vordershoppingcartview1.Sub002.RemoveView
	orderupdatecounter_click()
	Sub013()
End Sub

Sub Ordershoppingcartshow_Click
	Dim panelWrapper As Panel = vPnl1
	Dim view As View = vordershoppingcartview1.Sub002
	Dim vPerXToCurrent As Int = PerXToCurrent(100)
	panelWrapper.AddView(view, 0, 0, vPerXToCurrent, PerYToCurrent(100))
	Sub013()
End Sub

Sub Orderupdatecounter_Click
	vorderheaderview1.Sub008
End Sub

Sub Panelorder_Click
End Sub

Sub Sub006
	vordercategoryview1.Sub003
	If Not(vordercontentview1.DetailsProductVariations = Null) Then
		vordercontentview1.DetailsProductVariations.Sub004
	Else If Not(vordercontentview1.DetailsMenuProduct = Null) Then
		vordercontentview1.DetailsMenuProduct.Sub009
	Else If Not(vordercontentview1.GridProductDetails = Null) Then
		vordercontentview1.GridProductDetails.Sub003
	End If
	If vorderdetailsview1.IsInitialized Then
		vorderdetailsview1.Sub003
	End If
	vorderbottomview1.Sub002
	Sub013()
End Sub

Sub Sub007
	vInt1 = order_step_compose
	Sub003()
	vPnl2.RemoveAllViews
	Dim height As Int = vPnl2.Height
	vordercategoryview1.Initialize(Me, vPnl2.Width * 0.15, height, totemdata.vv4)
	vPnl2.AddView(vordercategoryview1.Sub002, 0, 0, vPnl2.Width * 0.15, vPnl2.Height)
	vordercontentview1.Initialize
	vordercontentview1.PanelContent.Initialize("")
	Dim panelWrapper As Panel = vordercontentview1.PanelContent
	panelWrapper.Color = -16711936
	Sub005(0)
	vPnl2.AddView(vordercontentview1.PanelContent, vPnl2.Width * 0.15, 0, vPnl2.Width * 0.85, vPnl2.Height)
	Sub006()
End Sub

Sub Sub008
	vInt1 = order_step_summary
	Sub003()
	vPnl2.RemoveAllViews
	vorderdetailsview1.Initialize(Me, vPnl2.Width, vPnl2.Height)
	vPnl2.AddView(vorderdetailsview1.Sub002, 0, 0, vPnl2.Width, vPnl2.Height)
	Sub006()
End Sub

Sub Sub009
	vInt1 = order_step_publicity
	vPnl1.RemoveAllViews
	Dim panelWrapper As Panel = vPnl1
	Dim view As View = vpublicityview1.Sub001
	Dim vPerXToCurrent As Int = PerXToCurrent(100)
	panelWrapper.AddView(view, 0, 0, vPerXToCurrent, PerYToCurrent(100))
End Sub

Sub Sub010(z As Boolean)
	vPnl1.SetVisibleAnimated(500, z)
End Sub

Sub Sub011
	totemdata.vtotemorderheadtype1.ConsumptionLocation = Null
	totemdata.vtotemorderheadtype1.PaymentConditions = Null
	totemdata.vtotemorderheadtype1.RowsList.Clear
	Sub007()
End Sub

Sub Sub012
	Sub009()
End Sub

Sub Sub013
	vtimeoutoperation1.Sub001
End Sub

