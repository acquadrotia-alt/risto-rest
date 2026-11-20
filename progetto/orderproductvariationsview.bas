B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vLbl1 As Label
	Public vPnl1 As Panel
	Public vtotemproducttype1 As totemproducttype
	Public vtotemmenulistproducttype1 As totemmenulistproducttype
	Public vCheckBoxArr1() As CheckBox
	Public vCheckBoxArr2() As CheckBox
End Sub

Sub Checkboxvariationsboxadd_CheckedChange(z As Boolean)
	Dim checkBoxWrapper As CheckBox
	Dim vObjectToNumber As Int = Sender.Tag
	If z Then
		Dim totemproductvariationstypeVar As totemproductvariationstype = vtotemproducttype1.Variations(vObjectToNumber)
		totemproductvariationstypeVar.FlgSelected = True
		Dim checkBoxWrapper2 As CheckBox = vCheckBoxArr2(vObjectToNumber)
		checkBoxWrapper2.Enabled = True
	Else
		Dim totemproductvariationstypeVar2 As totemproductvariationstype = vtotemproducttype1.Variations(vObjectToNumber)
		totemproductvariationstypeVar2.FlgSelected = False
		Dim checkBoxWrapper3 As CheckBox = vCheckBoxArr2(vObjectToNumber)
		checkBoxWrapper3.Checked = False
		Dim checkBoxWrapper4 As CheckBox = vCheckBoxArr2(vObjectToNumber)
		checkBoxWrapper4.Enabled = False
	End If
	Sub005()
	vorderview1.Sub013
End Sub

Sub Checkboxvariationsboxaddexceeding_CheckedChange(z As Boolean)
	Dim checkBoxWrapper As CheckBox
	Dim vObjectToNumber As Int = Sender.Tag
	If z Then
		Dim totemproductvariationstypeVar As totemproductvariationstype = vtotemproducttype1.Variations(vObjectToNumber)
		totemproductvariationstypeVar.FlgExceedingSelected = True
	Else
		Dim totemproductvariationstypeVar2 As totemproductvariationstype = vtotemproducttype1.Variations(vObjectToNumber)
		totemproductvariationstypeVar2.FlgExceedingSelected = False
	End If
	Sub005()
	vorderview1.Sub013
End Sub

Sub Sub001(i As Int, i2 As Int) As Panel
	Dim scrollViewWrapper As ScrollView
	Dim vTmp As Panel = Sub002(i, i2)
	scrollViewWrapper.Initialize(0)
	scrollViewWrapper.Panel.AddView(vTmp, 0, 0, vTmp.Width, vTmp.Height)
	scrollViewWrapper.Panel.Height = vTmp.Height
	Return scrollViewWrapper
End Sub

Sub Sub002(i As Int, i2 As Int) As Panel
	Dim i3 As Int
	Dim i4 As Int = i2 / 3
	Dim typefaceWrapper As Typeface
	Dim typefaceWrapper3 As Typeface = Typeface.DEFAULT_BOLD
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	If Not(vtotemproducttype1.Variations = Null) And vtotemproducttype1.Variations.Length > 0 Then
		Dim checkBoxWrapperArr(vtotemproducttype1.Variations.Length) As CheckBox
		Dim length As Int = checkBoxWrapperArr.Length
		Dim i5 As Int
		For i5 = 0 To length - 1
			'checkBoxWrapperArr(i5) = CheckBox
		Next
		Dim checkBoxWrapperArr2(vtotemproducttype1.Variations.Length) As CheckBox
		Dim i6 As Int
		For i6 = 0 To checkBoxWrapperArr2.Length - 1
			'checkBoxWrapperArr2(i6) = CheckBox
		Next
		Dim length3 As Int = vtotemproducttype1.Variations.Length - 1
		Dim i7 As Int = 0
		Do While True
			Dim i8 As Int = i7
			If i8 > length3 Then
				Exit
			End If
			Dim panelWrapper2 As Panel
			panelWrapper2.Initialize("")
			panelWrapper2.SetLayout(0, 0, i, i2)
			checkBoxWrapperArr(i8).Initialize("checkBoxVariationsBoxAdd")
			checkBoxWrapperArr(i8).Tag = i8
			checkBoxWrapperArr(i8).Typeface = typefaceWrapper3
			checkBoxWrapperArr(i8).TextSize = i4
			panelWrapper2.AddView(checkBoxWrapperArr(i8), panelWrapper2.Width * 0.02, panelWrapper2.Height * 0.12, panelWrapper2.Width * 0.47, panelWrapper2.Height * 0.76)
			checkBoxWrapperArr2(i8).Initialize("checkBoxVariationsBoxAddExceeding")
			checkBoxWrapperArr2(i8).Tag = i8
			Dim checkBoxWrapper As CheckBox = checkBoxWrapperArr2(i8)
			checkBoxWrapper.Enabled = False
			checkBoxWrapperArr2(i8).Typeface = typefaceWrapper3
			checkBoxWrapperArr2(i8).TextSize = i4
			panelWrapper2.AddView(checkBoxWrapperArr2(i8), panelWrapper2.Width * 0.65, panelWrapper2.Height * 0.12, panelWrapper2.Width * 0.34, panelWrapper2.Height * 0.76)
			If i8 Mod 2 = 0 Then
				i3 = -3355444
			Else
				i3 = -7829368
			End If
			panelWrapper2.Color = i3
			panelWrapper.AddView(panelWrapper2, 0, i8 * i2, i, i2)
			i7 = i8 + 1
		Loop
		vCheckBoxArr1 = checkBoxWrapperArr
		vCheckBoxArr2 = checkBoxWrapperArr2
		panelWrapper.SetLayout(0, 0, i, vtotemproducttype1.Variations.Length * i2)
		panelWrapper.Color = -16776961
		panelWrapper.Padding = Array As Int(2, 2, 2, 2)
	End If
	Sub004()
	Return panelWrapper
End Sub

Sub Sub003 As View
	Return vPnl1
End Sub

Sub Initialize(orderviewVar As orderview, labelWrapper As Label, i As Int, i2 As Int, totemproducttypeVar As totemproducttype, totemmenulistproducttypeVar As totemmenulistproducttype)
	vorderview1 = orderviewVar
	vLbl1 = labelWrapper
	vtotemproducttype1 = totemproducttypeVar
	vtotemmenulistproducttype1 = totemmenulistproducttypeVar
	vPnl1 = Sub001(i, i2)
End Sub

Sub Sub004
	If Not(vtotemproducttype1.Variations = Null) And vtotemproducttype1.Variations.Length > 0 Then
		Dim length As Int = vtotemproducttype1.Variations.Length - 1
		Dim i As Int
		For i = 0 To length
			Dim checkBoxWrapper As CheckBox = vCheckBoxArr1(i)
			Dim strArr() As String = vtotemproducttype1.Variations(i).Description
			checkBoxWrapper.Text = vtotemproducttype1.Variations(i).Name & " (" & strArr(language.Sub004) & ")"
			Dim checkBoxWrapper2 As CheckBox = vCheckBoxArr2(i)
			checkBoxWrapper2.Text = language.Sub006(1)
		Next
		Return
	End If
End Sub

Sub Sub005
	If Not(vtotemmenulistproducttype1 = Null) And vtotemmenulistproducttype1.IsInitialized Then
		Dim labelWrapper As Label = vLbl1
		labelWrapper.Text = Utility.vv3(Utility.v0(1, vtotemmenulistproducttype1))
		Return
	End If
	Dim labelWrapper2 As Label = vLbl1
	labelWrapper2.Text = Utility.vv3(Utility.vv1(1, vtotemproducttype1, 0))
End Sub

