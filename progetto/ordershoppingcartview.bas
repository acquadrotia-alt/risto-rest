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
	Public vorderlistdetailsview1 As orderlistdetailsview
	Public vInt1 As Int
	Public vInt2 As Int
	Public mpanel_items_left As Int
	Public mpanel_items_width As Int
	Public mpanel_items_top As Int
	Public mpanel_items_height As Int
	Public vBtn1 As Button
End Sub

Sub Eventshoppingcartclose_Click
	vorderview1.ordershoppingcartclose_click
End Sub

Sub Eventshoppingcartelevation_Click
End Sub

Sub Sub001(i As Int, i2 As Int) As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Dim vPerXToCurrent As Int = PerXToCurrent(100)
	panelWrapper.SetLayout(0, 0, vPerXToCurrent, PerYToCurrent(100))
	vPnl2.Initialize("EventShoppingCartElevation")
	vPnl2.SetLayout(0, 0, i, i2)
	Dim colorDrawable As ColorDrawable
	colorDrawable.Initialize2(-16776961, 2, 2, -16777216)
	vPnl2.Background = colorDrawable
	vPnl2.AddView(vorderlistdetailsview1.Sub007, mpanel_items_left, mpanel_items_top, mpanel_items_width, mpanel_items_height)
	vBtn1.Initialize("EventShoppingCartClose")
	vPnl2.AddView(vBtn1, 0, i2 * 0.9, i, i2 * 0.1)
	Dim view As View = vPnl2
	panelWrapper.AddView(view, PerXToCurrent(100) - i, 0, i, i2)
	Dim panelWrapper2 As Panel
	panelWrapper2.Initialize("EventShoppingCartClose")
	panelWrapper2.Color = Colors.ARGB(75, 0, 0, 0)
	Dim view2 As View = panelWrapper2
	Dim vPerXToCurrent2 As Int = PerXToCurrent(100) - vPnl2.Width
	panelWrapper.AddView(view2, 0, 0, vPerXToCurrent2, PerYToCurrent(100))
	panelWrapper.Elevation = DipToCurrent(4)
	Return panelWrapper
End Sub

Sub Sub002 As Panel
	vorderlistdetailsview1.Sub009
	Sub003()
	Return vPnl1
End Sub

Sub Initialize(orderviewVar As orderview, i As Int, i2 As Int)
	vorderview1 = orderviewVar
	vInt1 = i
	vInt2 = i2
	mpanel_items_left = vInt1 * 0.01
	mpanel_items_width = vInt1 * 0.98
	mpanel_items_top = vInt2 * 0.01
	mpanel_items_height = vInt2 * 0.89
	vorderlistdetailsview1.Initialize(vorderview1, mpanel_items_width, mpanel_items_height)
	vPnl1 = Sub001(vInt1, vInt2)
End Sub

Sub Sub003
	Dim buttonWrapper As Button = vBtn1
	buttonWrapper.Text = language.Sub006(6)
End Sub

