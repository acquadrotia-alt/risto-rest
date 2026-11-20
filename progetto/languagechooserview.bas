B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vPnl1 As Panel
	Public max_language As Int
	Public vImageViewArr1() As ImageView
	Public vLabelArr1() As Label
End Sub

Sub Sub001 As View
	Return vPnl1
End Sub

Sub Imageflags_Click
	Dim imageViewWrapper As ImageView
	Dim imageViewWrapper2 As ImageView = Sender
	Sub002(imageViewWrapper2.Tag)
	language.Sub007(imageViewWrapper2.Tag + 1)
	vorderview1.Sub006
End Sub

Sub Initialize(orderviewVar As orderview, i As Int, i2 As Int)
	vorderview1 = orderviewVar
	vPnl1.Initialize("")
	vPnl1.SetLayout(0, 0, i, i2)
	Dim panelWrapper As Panel = vPnl1
	panelWrapper.Color = -16776961
	Dim colorDrawable As ColorDrawable
	colorDrawable.Initialize2(0, 2, 2, -16777216)
	vPnl1.Background = colorDrawable
	Dim i3 As Int = i / max_language
	Dim i4 As Int = i3 * 0.1
	Dim i5 As Int = i4 / 2
	Dim i6 As Int = 0
	Do While True
		Dim i7 As Int = i6
		Dim i8 As Int = i5
		If i7 < max_language Then
			Dim imageViewWrapperArr() As ImageView = vImageViewArr1
			imageViewWrapperArr(i7) = Utility.v7("flag_" & language.Sub002(i7 + 1) & ".png", "imageFlags", i7, i3 - i4, i2 * 0.7)
			vPnl1.AddView(vImageViewArr1(i7), i8, i2 * 0.1, i3 - i4, i2 * 0.7)
			vLabelArr1(i7).Initialize("labelFlagsHighLights")
			vPnl1.AddView(vLabelArr1(i7), i8, i2 * 0.85, i3 - i4, i2 * 0.1)
			i5 = i8 + i3
			i6 = i7 + 1
		Else
			Sub002(language.Sub004)
			Return
		End If
	Loop
End Sub

Sub Sub002(i As Int)
	If vLabelArr1.Length > 0 Then
		Dim length As Int = vLabelArr1.Length - 1
		Dim i2 As Int
		For i2 = 0 To length
			Dim labelWrapper As Label = vLabelArr1(i2)
			labelWrapper.Color = 0
		Next
		Dim labelWrapper2 As Label = vLabelArr1(i)
		labelWrapper2.Color = -65536
		Return
	End If
End Sub

