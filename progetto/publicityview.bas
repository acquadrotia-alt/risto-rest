B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vPnl1 As Panel
End Sub

Sub Sub001 As Panel
	Return vPnl1
End Sub

Sub Initialize(orderviewVar As orderview)
	vorderview1 = orderviewVar
	vPnl1.Initialize("")
	Dim panelWrapper As Panel = vPnl1
	Dim vPerXToCurrent As Int = PerXToCurrent(100)
	panelWrapper.SetLayout(0, 0, vPerXToCurrent, PerYToCurrent(100))
	Dim labelWrapper As Label
	labelWrapper.Initialize("labelPublicity")
	labelWrapper.Text = "Totem" & CRLF & "ItalRetail"
	labelWrapper.SingleLine = False
	labelWrapper.TextSize = 38
	labelWrapper.Gravity = 17
	Dim panelWrapper2 As Panel = vPnl1
	Dim view As View = labelWrapper
	Dim vPerXToCurrent2 As Int = PerXToCurrent(100)
	panelWrapper2.AddView(view, 0, 0, vPerXToCurrent2, PerYToCurrent(100))
End Sub

Sub Labelpublicity_Click
	vorderview1.Sub011
End Sub

