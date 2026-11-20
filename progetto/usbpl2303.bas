B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
Sub Process_Globals
	Type uartdata(databits As Int, parity As Int, rate As Int, stopbits As Int)
	Type rxdatablock(bytecount As Int, data() As Byte)
	Public vUsbManager1 As UsbManager
	Public vUsbDeviceArr1(0) As UsbDevice
	Public vUsbDeviceConnection1 As UsbDeviceConnection
	Public vUsbEndpoint1 As UsbEndpoint
	Public vUsbEndpoint2 As UsbEndpoint
	Public vUsbEndpoint3 As UsbEndpoint
	Public vInt1 As Int
	Public vUsbInterface1 As UsbInterface
	Public vInt2 As Int
	Public vByteArr1(0) As Byte
	Public vInt3 As Int = 1659
	Public vInt4 As Int = 8963
	Public vInt5 As Int
	Public vInt6 As Int = 100
	Public max_timer_reads As Int = 50
	Public set_line_request_type As Int = 33
	Public set_line_request As Int = 32
	Public set_control_request_type As Int = 33
	Public set_control_request As Int = 34
	Public vendor_write_request_type As Int = 64
	Public vendor_write_request As Int = 1
	Public vendor_read_request_type As Int = 192
	Public vendor_read_request As Int = 1
	Public vLst1 As List
	Public uart_dtr As Int = 1
	Public uart_rts As Int = 2
	Public parity_odd As Int = 1
	Public stopbits_1 As Int
	Public databits_7 As Int = 7
	Public rate_19200 As Int = 19200
End Sub

Sub Sub001 As Boolean
	Return vUsbManager1.HasPermission(vUsbDeviceArr1(vInt1))
End Sub

Sub Sub002 As Boolean
	vUsbManager1.Initialize
	vInt1 = -1
	vUsbDeviceArr1 = vUsbManager1.GetDevices
	Dim length As Int = vUsbDeviceArr1.Length - 1
	Dim i As Int
	For i = 0 To length
		If vUsbDeviceArr1(i).VendorId = vInt3 And vUsbDeviceArr1(i).ProductId = vInt4 Then
			vInt1 = i
			Return True
		End If
	Next
	Return False
End Sub

Sub Sub003(i As Int, i2 As Int, str As String, str2 As String)
	vLst1.Initialize
	vUsbInterface1 = vUsbDeviceArr1(vInt1).GetInterface(0)
	vUsbDeviceConnection1 = vUsbManager1.OpenDevice(vUsbDeviceArr1(vInt1), vUsbInterface1, True)
	Dim reflection As Reflector
	reflection.Target = vUsbDeviceConnection1
	reflection.Target = reflection.GetField("connection")
	vByteArr1 = reflection.RunMethod("getRawDescriptors")
	Dim endpointCount As Int = vUsbInterface1.EndpointCount - 1
	Dim i3 As Int
	For i3 = 0 To endpointCount
		Dim vGetEndpoint As UsbEndpoint = vUsbInterface1.GetEndpoint(i3)
		Dim type_ As Int = vGetEndpoint.Type
		Dim usbManagerWrapper As UsbManager = vUsbManager1
		If type_ = 2 Then
			Dim direction As Int = vGetEndpoint.Direction
			Dim usbManagerWrapper2 As UsbManager = vUsbManager1
			If direction = 128 Then
				vUsbEndpoint2 = vGetEndpoint
				vInt2 = vUsbEndpoint2.MaxPacketSize
			Else
				Dim direction2 As Int = vGetEndpoint.Direction
				Dim usbManagerWrapper3 As UsbManager = vUsbManager1
				If direction2 = 0 Then
					vUsbEndpoint1 = vGetEndpoint
				End If
			End If
		Else
			Dim type2 As Int = vGetEndpoint.Type
			Dim usbManagerWrapper4 As UsbManager = vUsbManager1
			If type2 = 3 Then
				vUsbEndpoint3 = vGetEndpoint
			End If
		End If
	Next
	If vByteArr1(4) = 2 Then
		vInt5 = 0
	Else If vByteArr1(7) = 64 Then
		vInt5 = 2
		Sub008(8, 0)
		Sub008(9, 0)
	Else If vByteArr1(4) = 0 Then
		vInt5 = 1
	Else If vByteArr1(4) = 255 Then
		vInt5 = 1
	End If
	Dim bArr(1) As Byte
	Sub007(33924, 0, bArr)
	Sub008(1028, 0)
	Sub007(33924, 0, bArr)
	Sub007(33667, 0, bArr)
	Sub007(33924, 0, bArr)
	Sub008(1028, 1)
	Sub007(33924, 0, bArr)
	Sub007(33667, 0, bArr)
	Sub008(0, 1)
	Sub008(1, 0)
	If vInt5 = 2 Then
		Sub008(2, 68)
	Else
		Sub008(2, 36)
	End If
	If Not( = Null) Then
		 = 
	End If
	StartService(usbpl2303service)
End Sub

Sub Sub004 As Boolean
	vUsbManager1.RequestPermission(vUsbDeviceArr1(vInt1))
	Return False
End Sub

Sub Sub005(z As Boolean, z2 As Boolean)
	Dim i As Int
	If z Then
		i = Bit.Or(0, uart_dtr)
	Else
		i = 0
	End If
	If z2 Then
		i = Bit.Or(i, uart_rts)
	End If
	vUsbDeviceConnection1.ControlTransfer(set_control_request_type, set_control_request, i, 0, Null, 0, vInt6)
End Sub

Sub Sub006(uartdataVar As uartdata)
	vUsbDeviceConnection1.ControlTransfer(set_line_request_type, set_line_request, 0, 0, Array As Byte(Bit.And(uartdataVar.rate, 255), Bit.And(Bit.ShiftRight(uartdataVar.rate, 8), 255), Bit.And(Bit.ShiftRight(uartdataVar.rate, 16), 255), Bit.And(Bit.ShiftRight(uartdataVar.rate, 24), 255), uartdataVar.stopbits, uartdataVar.parity, uartdataVar.databits), 7, vInt6)
End Sub

Sub Sub007(i As Int, i2 As Int, bArr As Byte())
	vUsbDeviceConnection1.ControlTransfer(vendor_read_request_type, vendor_read_request, i, i2, bArr, 1, vInt6)
End Sub

Sub Sub008(i As Int, i2 As Int)
	vUsbDeviceConnection1.ControlTransfer(vendor_write_request_type, vendor_write_request, i, i2, Null, 0, vInt6)
End Sub

Sub Sub009(bArr As Byte(), i As Int, i2 As Int) As Int
	Main.vStr3 = ""
	Dim usbRequestWrapper As UsbRequest
	usbRequestWrapper.Initialize(vUsbDeviceConnection1, vUsbEndpoint1)
	usbRequestWrapper.Queue(bArr, i)
	If Not( = Null) Then
		 = 
	End If
	CallSub2(usbpl2303service, "Read", i2)
	Return 0
End Sub

