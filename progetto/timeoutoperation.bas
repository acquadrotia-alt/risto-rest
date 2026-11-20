B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vorderview1 As orderview
	Public vInt1 As Int
	Public vInt2 As Int
	Public vTmr1 As Timer
	Public vLng1 As Long
End Sub

Sub Initialize(orderviewVar As orderview, i As Int, i2 As Int)
	vorderview1 = orderviewVar
	If i2 < i Then
		i2 = i
	End If
	vInt1 = i
	vInt2 = i2
	vTmr1.Initialize("TimeOut", 1000)
End Sub

Sub Sub001
	vLng1 = 0
End Sub

Sub Sub002
	vLng1 = 0
	Dim timer As Timer = vTmr1
	timer.Enabled = True
End Sub

Sub Sub003
	Dim timer As Timer = vTmr1
	timer.Enabled = False
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/ital/TotemLib/timeoutoperation.java, metodo _timeout_tick (riga 80).
Sub Timeout_Tick
	vLng1 = vLng1 + 1
	If vLng1 > vInt1 Then
	End If
	If vLng1 <= vInt2 Then
		Return
	End If
	Sub003()
	vorderview1.Sub012
End Sub

