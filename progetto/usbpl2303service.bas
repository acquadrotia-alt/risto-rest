B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=13.1
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	Public vrxdatablock1 As rxdatablock
End Sub

Sub read(i As Int)
	vrxdatablock1.Initialize
	Dim i2 As Int = 0
	Dim z As Boolean = False
	Dim i3 As Int = 1
	Do While True
		If i3 <= usbpl2303.max_timer_reads Then
			Dim bArr(usbpl2303.vInt2) As Byte
			Dim object As UsbEndpoint = usbpl2303.vUsbEndpoint2
			Dim vBulkTransfer As Int = usbpl2303.vUsbDeviceConnection1.BulkTransfer(object, bArr, bArr.Length, usbpl2303.vInt6)
			If vBulkTransfer > 0 Then
				vrxdatablock1.bytecount = vBulkTransfer
				vrxdatablock1.data = bArr
				If z Then
					If vrxdatablock1.bytecount > 0 Then
						Main.vStr3 = Main.vStr3 & BytesToString(vrxdatablock1.data, 0, vrxdatablock1.bytecount, "UTF8")
					End If
				Else If vrxdatablock1.bytecount > 0 Then
					Main.vStr3 = BytesToString(vrxdatablock1.data, 0, vrxdatablock1.bytecount, "UTF8")
				End If
				Dim i4 As Int = i2 + vBulkTransfer
				If i < 0 Then
					If Main.vStr3.Length > 0 Then
						Dim length2 As Int = Main.vStr3.Length - 1
						If Main.vStr3.SubString2(length2, Main.vStr3.Length) = Chr(3) Then
							Return
						End If
					End If
					i2 = i4
					z = True
				Else
					If vBulkTransfer <> usbpl2303.vInt2 And i4 >= i Then
						If i <> 1 Then
							Return
						End If
						If Main.vStr3.SubString2(0, 1) = Chr(6) Then
							Return
						End If
					End If
					i2 = i4
					z = True
				End If
			Else
				Dim i5 As Int = i3 + 1
				If i5 > 5 And i = 200 Then
					Return
				End If
				i3 = i5
			End If
		Else
			Return
		End If
	Loop
End Sub

Sub Sub001
	Dim usbRequestWrapper As UsbRequest
	usbRequestWrapper.Initialize(usbpl2303.vUsbDeviceConnection1, usbpl2303.vUsbEndpoint3)
	Dim bArr(usbpl2303.vUsbEndpoint3.MaxPacketSize) As Byte
	usbRequestWrapper.Queue(bArr, bArr.Length)
End Sub

Sub Service_Create
End Sub

Sub Service_Destroy
End Sub

Sub Service_Start(intentWrapper As Intent)
	Sub001()
End Sub

Sub Usbpl2303_NewData(usbRequestWrapper As UsbRequest, z As Boolean)
End Sub

