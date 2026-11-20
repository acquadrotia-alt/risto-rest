B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vMap1 As Map
	Public gs_char_substitution As String
	Public vStr1 As String
	Public vBln1 As Boolean
	Public vStr2 As String
	Public vStr3 As String
	Public vLng1 As Long
End Sub

Sub Sub001(str As String) As Int
	vMap1.Clear
	vStr3 = ""
	vLng1 = DateTime.DateParse("12/31/2199")
	vBln1 = False
	vStr1 = str
	Do While vStr1 <> ""
		If vBln1 Then
			Exit
		End If
		Sub005()
	Loop
	If vBln1 Then
		vMap1.Clear
		vStr3 = ""
		vLng1 = DateTime.DateParse("12/31/2199")
	End If
	Return vMap1.Size
End Sub

Sub Sub002(i As Int, i2 As Int, z As Boolean, z2 As Boolean)
	Dim vTmp As String
	Dim left As String = modfunstr.left(vStr1, i)
	If z Then
		vTmp = Sub003(vStr1, i + 1, i2)
		If vTmp.Length <> i2 Then
			vBln1 = True
		Else
			vStr1 = Sub004(vStr1, i + 1 + i2)
		End If
	Else
		Dim indexOf As Int = vStr1.IndexOf(gs_char_substitution) + 1
		If indexOf > 0 Then
			vTmp = Sub003(vStr1, i + 1, indexOf - (i + 1))
			vStr1 = Sub004(vStr1, indexOf + 1)
		Else
			vTmp = Sub004(vStr1, i + 1)
			vStr1 = ""
		End If
		If vTmp.Length > i2 Then
			vBln1 = True
		End If
	End If
	If vBln1 Or z2 Then
	End If
	If Not(vBln1) Then
		vMap1.Put(left, vTmp)
		vStr2 = vTmp
		Return
	End If
End Sub

Sub Initialize
	vMap1.Initialize
End Sub

Sub Sub003(str As String, i As Int, i2 As Int) As String
	If str.Length < i + i2 - 1 Then
		Return modfunstr.Sub002(str, i, str.Length - i)
	End If
	Return modfunstr.Sub002(str, i, i2)
End Sub

Sub Sub004(str As String, i As Int) As String
	Return str.SubString(i - 1)
End Sub

Sub Sub005
	Dim left As String = modfunstr.left(vStr1, 2)
	Dim left2 As String = modfunstr.left(vStr1, 3)
	Dim left3 As String = modfunstr.left(vStr1, 4)
	Select left
		Case "00"
			Sub002(2, 18, True, True)
		Case "01"
			Sub002(2, 14, True, True)
			If Not(vBln1) Then
				vStr3 = vStr2
			End If
		Case "02"
			Sub002(2, 14, True, True)
		Case "10"
			Sub002(2, 20, False, False)
		Case "11"
			Sub002(2, 6, True, True)
		Case "12"
			Sub002(2, 6, True, True)
		Case "13"
			Sub002(2, 6, True, True)
		Case "15"
			Sub002(2, 6, True, True)
			If Not(vBln1) Then
				If Sub003(vStr2, 5, 2) = "00" Then
					vLng1 = DateTime.DateParse(Sub003(vStr2, 3, 2) & "/01/20" & Sub003(vStr2, 1, 2))
					vLng1 = DateTime.Add(DateTime.Add(vLng1, 0, 1, 0), 0, 0, -1)
				Else
					vLng1 = DateTime.DateParse(Sub003(vStr2, 3, 2) & "/" & Sub003(vStr2, 5, 2) & "/20" & Sub003(vStr2, 1, 2))
				End If
			End If
		Case "17"
			Sub002(2, 6, True, True)
			If Not(vBln1) Then
				If Sub003(vStr2, 5, 2) = "00" Then
					vLng1 = DateTime.DateParse(Sub003(vStr2, 3, 2) & "/01/20" & Sub003(vStr2, 1, 2))
					vLng1 = DateTime.Add(DateTime.Add(vLng1, 0, 1, 0), 0, 0, -1)
				Else
					vLng1 = DateTime.DateParse(Sub003(vStr2, 3, 2) & "/" & Sub003(vStr2, 5, 2) & "/20" & Sub003(vStr2, 1, 2))
				End If
			End If
		Case "20"
			Sub002(2, 2, True, True)
		Case "21"
			Sub002(2, 20, False, False)
		Case "22"
			Sub002(2, 29, False, False)
		Case "24"
			Select left2
				Case "240", "241"
					Sub002(3, 30, False, False)
				Case "242"
					Sub002(3, 6, False, True)
				Case "243"
					Sub002(3, 20, False, False)
				Case Else
					vBln1 = True
			End Select
		Case "25"
			Select left2
				Case "250", "251", "253"
					Sub002(3, 30, False, False)
				Case "254"
					Sub002(3, 20, False, False)
				Case "255"
					Sub002(3, 25, False, True)
				Case Else
					vBln1 = True
			End Select
		Case "30"
			Sub002(2, 8, False, True)
		Case "31"
			Select left2
				Case "310", "311", "312", "313", "314", "315", "316"
					Sub002(4, 6, True, True)
				Case Else
					vBln1 = True
			End Select
		Case "32"
			Select left2
				Case "320", "321", "322", "323", "324", "325", "326", "327", "328", "329"
					Sub002(4, 6, True, True)
				Case Else
					vBln1 = True
			End Select
		Case "33"
			Select left2
				Case "330", "331", "332", "333", "334", "335", "336", "337"
					Sub002(4, 6, True, True)
				Case Else
					vBln1 = True
			End Select
		Case "34"
			Select left2
				Case "340", "341", "342", "343", "344", "345", "346", "347", "348", "349"
					Sub002(4, 6, True, True)
				Case Else
					vBln1 = True
			End Select
		Case "35"
			Select left2
				Case "350", "351", "352", "353", "354", "355", "356", "357"
					Sub002(4, 6, True, True)
				Case Else
					vBln1 = True
			End Select
		Case "36"
			Select left2
				Case "360", "361", "362", "363", "364", "365", "366", "367", "368", "369"
					Sub002(4, 6, True, True)
				Case Else
					vBln1 = True
			End Select
		Case "37"
			Sub002(2, 8, False, True)
		Case "39"
			Select left2
				Case "390", "392"
					Sub002(4, 15, False, True)
				Case "391", "393"
					Sub002(4, 18, False, True)
				Case Else
					vBln1 = True
			End Select
		Case "40"
			Select left2
				Case "400"
					Sub002(3, 30, False, False)
				Case "401"
					Sub002(3, 30, False, False)
				Case "402"
					Sub002(3, 17, False, True)
				Case "403"
					Sub002(3, 30, False, False)
				Case Else
					vBln1 = True
			End Select
		Case "41"
			Select left2
				Case "410", "411", "412", "413", "414", "415"
					Sub002(3, 13, True, True)
				Case Else
					vBln1 = True
			End Select
		Case "42"
			Select left2
				Case "420"
					Sub002(3, 20, False, False)
				Case "421"
					Sub002(3, 12, False, False)
				Case "422"
					Sub002(3, 3, False, True)
				Case "423"
					Sub002(3, 15, False, True)
				Case "424"
					Sub002(3, 3, False, True)
				Case "425"
					Sub002(3, 3, False, True)
				Case "426"
					Sub002(3, 3, False, True)
				Case "427"
					Sub002(3, 3, False, False)
				Case Else
					vBln1 = True
			End Select
		Case "70"
			If left2 = "700" Then
				Select left3
					Case "7001"
						Sub002(4, 13, False, True)
					Case "7002"
						Sub002(4, 30, False, False)
					Case "7003"
						Sub002(4, 10, False, True)
					Case "7004"
						Sub002(4, 4, False, True)
					Case Else
						vBln1 = True
				End Select
			Else If left2 = "703" Then
				Sub002(4, 30, False, False)
			Else
				vBln1 = True
			End If
		Case "71"
			Select left2
				Case "710"
					Sub002(3, 20, False, False)
				Case "711"
					Sub002(3, 20, False, False)
				Case "712"
					Sub002(3, 20, False, False)
				Case Else
					vBln1 = True
			End Select
		Case "80"
			Select left3
				Case "8001"
					Sub002(4, 14, False, True)
				Case "8002"
					Sub002(4, 20, False, False)
				Case "8003"
					Sub002(4, 30, False, False)
				Case "8004"
					Sub002(4, 30, False, False)
				Case "8005"
					Sub002(4, 6, False, True)
				Case "8006"
					Sub002(4, 18, False, True)
				Case "8007"
					Sub002(4, 30, False, False)
				Case "8008"
					Sub002(4, 12, False, True)
				Case "8017"
					Sub002(4, 18, False, True)
				Case "8018"
					Sub002(4, 18, False, True)
				Case "8019"
					Sub002(4, 10, False, True)
				Case "8020"
					Sub002(4, 25, False, False)
				Case Else
					vBln1 = True
			End Select
		Case "81"
			Select left3
				Case "8100"
					Sub002(4, 6, False, True)
				Case "8101"
					Sub002(4, 10, False, True)
				Case "8102"
					Sub002(4, 2, False, True)
				Case "8110"
					Sub002(4, 70, False, False)
				Case Else
					vBln1 = True
			End Select
		Case "82"
			Select left3
				Case "8200"
					Sub002(4, 70, False, False)
				Case Else
					vBln1 = True
			End Select
		Case "90", "91", "92", "93", "94", "95", "96", "97", "98", "99"
			Sub002(2, 30, False, False)
		Case Else
			vMap1.Clear
			vStr1 = ""
	End Select
End Sub

