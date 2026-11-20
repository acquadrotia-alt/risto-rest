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
	Public vpanelchooser1 As panelchooser
	Public vpanelchooser2 As panelchooser
End Sub

Sub Sub001(i As Int, i2 As Int) As Panel
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Dim colorDrawable As ColorDrawable
	colorDrawable.Initialize2(0, 2, 2, -16777216)
	panelWrapper.Background = colorDrawable
	Dim i3 As Int = i * 0.98
	Dim i4 As Int = i2 * 0.98
	vorderlistdetailsview1.Initialize(vorderview1, i3, i4)
	panelWrapper.AddView(vorderlistdetailsview1.Sub007, i * 0.01, i2 * 0.01, i3, i4)
	Return panelWrapper
End Sub

Sub Sub002 As Panel
	Return vPnl1
End Sub

Sub Initialize(orderviewVar As orderview, i As Int, i2 As Int)
	vorderview1 = orderviewVar
	vPnl1.Initialize("")
	vPnl2 = Sub001(i * 0.4, i2 * 0.9)
	vPnl1.AddView(vPnl2, i * 0.05, i2 * 0.05, i * 0.4, i2 * 0.9)
	Dim panelchooserVar As panelchooser = vpanelchooser1
	Dim orderviewVar2 As orderview = vorderview1
	panelchooserVar.Initialize(orderviewVar2, totemdata.vtotemconsumptiontypeArr1, i * 0.4, i2 * 0.35, Array As String("Eat In", "Take Away"), Array As String("consumption_eat-in.png", "consumption_take-away.png"))
	vPnl1.AddView(vpanelchooser1.Sub003, i * 0.55, i2 * 0.05, i * 0.4, i2 * 0.35)
	Dim panelchooserVar2 As panelchooser = vpanelchooser2
	Dim orderviewVar3 As orderview = vorderview1
	panelchooserVar2.Initialize(orderviewVar3, totemdata.vv0, i * 0.4, i2 * 0.35, Array As String("Cash", "Credit Card / Bancomat"), Array As String("payment-cash.png", "payment-credit-card.png"))
	vPnl1.AddView(vpanelchooser2.Sub003, i * 0.55, i2 * 0.5, i * 0.4, i2 * 0.35)
End Sub

Sub Sub003
	vorderlistdetailsview1.Sub008
	vpanelchooser1.Sub004
	vpanelchooser2.Sub004
End Sub

