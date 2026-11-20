B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
End Sub

Sub Sub001
	Dim vObjectToCharSequence As Object = "Confermi la fiscalizzazione del misuratore?"
	Dim vObjectToCharSequence2 As Object = "Attenzione"
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Conferma", "", "Annulla", Null)
	If vMsgbox2 = -1 Then
		Main.vccefdll1.Sub026("2005", 1)
		Return
	End If
	Msgbox("Operazione annullata!", "Avviso")
End Sub

Sub Sub002
	Try
		Dim jArr(2) As Long
		Dim object As Class = Verificazione
		Dim jArr2() As Long = CallSub3(object, "SceltaData", True, "")
		Dim j As Long = jArr2(0)
		If j < DateTime.DateParse("01/01/2000") Then
			Msgbox("Data non valida! Inserire una data successiva al 31/12/1999.", "Attenzione!")
			Msgbox("Operazione annullata", "Avviso")
		Else
			Dim vObjectToCharSequence As Object = "Confermi l'impostazione di data e ora " & DateTime.Date(jArr2(0)) & " " & DateTime.Time(jArr2(1))
			Dim vObjectToCharSequence2 As Object = "Conferma impostazione data"
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Conferma", "Annulla", "", Main.vBmp1)
			If vMsgbox2 = -1 Then
				DateTime.DateFormat = "ddMMyy"
				Dim vDate As String = DateTime.Date(jArr2(0))
				DateTime.DateFormat = "HHmm"
				Dim sb As String = vDate & DateTime.Date(jArr2(1))
				Main.vccefdll1.Sub026("2001" & sb, 5)
				Select Main.vccefdll1.read
					Case "0"
						Msgbox("Data e ora impostate.", "Avviso")
					Case "1", "2"
						Msgbox("Operazione annullata", "Avviso")
				End Select
			Else
				Msgbox("Operazione annullata", "Avviso")
			End If
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Initialize
End Sub

Sub Sub003
	Dim vObjectToCharSequence As Object = "Confermi l'inizializzazione di un nuovo DGFE?"
	Dim vObjectToCharSequence2 As Object = "Attenzione"
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Conferma", "", "Annulla", Null)
	If vMsgbox2 = -1 Then
		Main.vccefdll1.Sub026("8007", 1)
		Msgbox("Seguire le istruzioni" & CRLF & "che verranno stampate" & CRLF & "sullo scontrino.", "Attenzione!")
		Return
	End If
	Msgbox("Operazione annullata!", "Avviso")
End Sub

Sub Sub004(str As String, str2 As String)
	Dim mf_dayisopen As Boolean
	Try
		Try
			mf_dayisopen = Main.vccefdll1.mf_dayisopen
		Catch
			mf_dayisopen = Main.vccefdll1.mf_dayisopen
		End Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If mf_dayisopen Then
		Msgbox("Attenzione ... è necessaria una Chiusura Giornaliera.", "Avviso")
		Return
	End If
	Dim vObjectToCharSequence As Object = "Attendere ... invio in corso"
	ProgressDialogShow2(vObjectToCharSequence, False)
	DoEvents
	Main.vccefdll1.mf_writelogo(str, str2)
	ProgressDialogHide
End Sub

Sub Sub005(str As String)
	Main.vccefdll1.Sub026("2006" & str, 1)
	Dim vObjectToCharSequence As Object = "Attendere la stampa dello scontrino di riepilogo."
	ToastMessageShow(vObjectToCharSequence, False)
End Sub

Sub Sub006(z As Boolean, j As Long, i As Int, i2 As Int) As Boolean
	Dim vTmp As Int
	Dim str As String = "0000" & i.Trim
	Dim length As Int = str.Length
	Dim substring As String = str.SubString2(length - 4, length)
	Dim str2 As String = "0000" & i2.Trim
	Dim length2 As Int = str2.Length
	Dim substring2 As String = str2.SubString2(length2 - 4, length2)
	DateTime.DateFormat = "ddMMyy"
	If z Then
		vTmp = Main.vccefdll1.Sub026("8002" & DateTime.Date(j) & substring & substring2 & "0", 1)
	Else
		If substring2 > Sub009() Then
			Msgbox("Numero ultima chiusura: " & Sub009(), "Avviso")
			Dim str3 As String = "0000" & Sub009().Trim
			Dim length3 As Int = str3.Length
			substring2 = str3.SubString2(length3 - 4, length3)
		End If
		vTmp = Main.vccefdll1.Sub026("8003" & substring & substring2 & "0000", 1)
	End If
	Return vTmp = 0
End Sub

Sub Sub007(z As Boolean, j As Long, j2 As Long, i As Int, i2 As Int) As Boolean
	Dim vTmp As Int
	DateTime.DateFormat = "ddMMyy"
	DateTime.DateFormat = "dd/MM/yyyy"
	If z Then
		DateTime.DateFormat = "ddMMyy"
		vTmp = Main.vccefdll1.Sub026("5002" & DateTime.Date(j) & DateTime.Date(j2), 1)
	Else
		Dim str As String = "0000" & i.Trim
		Dim length As Int = str.Length
		Dim substring As String = str.SubString2(length - 4, length)
		Dim str2 As String = "0000" & i2.Trim
		Dim length2 As Int = str2.Length
		Dim substring2 As String = str2.SubString2(length2 - 4, length2)
		vTmp = Main.vccefdll1.Sub026("5001" & substring & substring2, 1)
	End If
	Return vTmp = 0
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/clsverificazione.java, metodo m1… (riga 308).
Sub Sub008(str As String, str2 As String)
	Dim substring As String
	Dim str3 As String = str & "                      "
	If str2 <> "" Then
	End If
	str2 = "0"
	Dim parseDouble As Double = str2.Replace(",", ".")
	If parseDouble > 0 Then
		Dim replace As String = NumberFormat2(parseDouble * 100, 1, 0, 0, False).Replace(",", "").Replace("-", "")
		If replace.Length < 9 Then
			substring = "000000000" & replace
		Else
			substring = replace.SubString2(0, 9)
		End If
		Dim trim As String = substring.Trim
		Dim length As Int = trim.Length
		Dim substring2 As String = trim.SubString2(length - 9, length)
		Main.vccefdll1.Sub026("3001122" & str3.SubString2(0, 22) & substring2.SubString2(0, 9), 1)
		Main.vccefdll1.Sub026("3011", 1)
		Main.vccefdll1.Sub026("3013", 1)
		Return
	End If
	Msgbox("Verificare l'importo inserito!", "Attenzione!")
End Sub

Sub Sub009 As Int
	Dim read As String
	Main.vccefdll1.Sub026("1104", 9)
	If Main.v_tipointerfaccia = 1 Then
		read = Main.vStr3
	Else
		read = Main.vccefdll1.read
	End If
	If read.SubString2(0, 4) = "1104" And read.Length = 12 Then
		Return read.SubString2(4, 8)
	End If
	Return read.SubString2(0, 4)
End Sub

