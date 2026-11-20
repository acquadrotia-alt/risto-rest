B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vPnl1 As Panel
	Public vBtn1 As Button
	Public vBtn2 As Button
End Sub

Sub Buttonordercancel_Click
	vorderview1.ordercancel_click
End Sub

Sub Buttonorderconfirm_Click
	vorderview1.orderconfirm_click
End Sub

Sub Sub001 As Panel
	Return vPnl1
End Sub

Sub Initialize(orderviewVar As orderview, i As Int, i2 As Int)
	vorderview1 = orderviewVar
	vPnl1.Initialize("")
	vPnl1.SetLayout(0, 0, i, i2)
	Dim panelWrapper As Panel = vPnl1
	panelWrapper.Color = -251
	vBtn1.Initialize("buttonOrderCancel")
	vPnl1.AddView(vBtn1, vPnl1.Width * 0.05, vPnl1.Height * 0.02, vPnl1.Width * 0.4, vPnl1.Height * 0.98)
	vBtn2.Initialize("buttonOrderConfirm")
	vPnl1.AddView(vBtn2, vPnl1.Width * 0.55, vPnl1.Height * 0.02, vPnl1.Width * 0.4, vPnl1.Height * 0.98)
End Sub

Sub Sub002
	If vorderview1.vInt1 = vorderview1.order_step_compose Then
		Dim buttonWrapper As Button = vBtn1
		buttonWrapper.Text = language.Sub006(3)
	Else If vorderview1.vInt1 = vorderview1.order_step_summary Then
		Dim buttonWrapper2 As Button = vBtn1
		buttonWrapper2.Text = language.Sub006(13)
	End If
	Dim buttonWrapper3 As Button = vBtn2
	buttonWrapper3.Text = language.Sub006(2)
End Sub

