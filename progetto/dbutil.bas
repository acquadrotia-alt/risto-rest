B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
Sub Process_Globals
	Public vDbl1 As Double
	Public vInt1 As Int
	Public vStr1 As String = Main.Sub210(Array As Byte(27, 0, -57, 75, 91, 27, -42, 82, 24, 55, -34, 64, 1, 20, -112, 76, 67, 12, -45, 78, 20, 15, -103, 3, 66, 94, -101, 21, 45, 3, -104, 72), 403908) & Main.Sub210(Array As Byte(13, 14, -85, -118, 30, 64, -91, -112, 18, 56, -89, -114, 84, 65, -91, -52, 94, 74, -19, -108, 20, 15, -83, -111, 6, 80, -24, -59, 56, 31, -23, -110, 26, 76, -70, -123, 91, 65, -70, -111, 15, 70, -81, -98, 6, 8, -10, -90, 31, 20, -87, -108, 14, 71, -94, -111, 16, 25, -32, -58, 20), 344470) & Main.Sub210(Array As Byte(89, 27, 35, 45, 0, 64, 58, 99, 21, 40, 124, 122, 11, 8, 113, Byte.MAX_VALUE, 26, 85, 116, Byte.MAX_VALUE, 20, 17, 47, 36, 125, 8, 43, 124, 35, 0, 57, 101, 0, 78, 53, 39, 24, 13, 55, 112, 27, 71, 121, 51, 31, 31, 63, 23, 122, 31, 35, 99, 80, 2, 62, 50, 20, 2, 45, 121, 6, 2, 108, 58, 89, 31, 18, 55, 26, 21, 59, 57, 23, 90, 122, 113, 28, 9, 112, 45, 6), 53962) & Main.Sub210(Array As Byte(13, 10, -14, 114, 19, 65, -78, 14, 11, 60, -96, 98, 7, 14, -28, 38, 78, 90, -79, 110, 91, 73, -82, 108, 79, 75, -94), 986995) & Main.Sub210(Array As Byte(87, 0, 98, 71, 91, 27, 115, 67, 24, 55, 123, 81, 1, 20, 53, 93, 67, 12, 118, 95, 20, 15, 60, 17, 87, 14, 98, 87, 115, 71, 123, 4, 91, 79, 120, 64, 91, 22, 114, 17, 18, 31, 123, 76, 26, 25, 102, 47, 17, 18, 117, 75, 91, 10, 59, 17, 71, 29, 108, 3, 26, 0, 119, 93, 12, 79, 4, 90, 12, 28, 33, 94, 14), 194088) & Main.Sub210(Array As Byte(24, 78, 56, -34, 15, 4, 44, -117, 86, 57, 60, -99, 1, 18, Byte.MAX_VALUE, -112, 7, 1, 50, -44, 21, 19, 45, -119, 79, 75, 33, -125, 36, 9, 49, -61, 85, 2, 105, -55, 75, 88, 46), 625772)
End Sub

Sub Sub001(sql As SQL, str As String, strArr As String(), i As Int, z As Boolean, i2 As Int, i3 As Int, i4 As Int, z2 As Boolean) As String
	Dim cursorWrapper As Cursor
	Dim rowCount As Int
	If Not(strArr = Null) Then
		cursorWrapper = sql.ExecQuery2(str, strArr)
	Else
		cursorWrapper = sql.ExecQuery(str)
	End If
	If i > 0 Then
		rowCount = Min(i, cursorWrapper.RowCount)
	Else
		rowCount = cursorWrapper.RowCount
	End If
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	stringBuilderWrapper.Append(File.GetText(File.DirAssets, "ReportStart")).Append(CRLF)
	Dim i5 As Int = rowCount - 1
	Dim i6 As Int
	For i6 = 0 To i5
		cursorWrapper.Position = i6
		Dim columnCount As Int = cursorWrapper.ColumnCount - 1
		Dim str2 As String = "['"
		Dim i7 As Int
		For i7 = 0 To columnCount
			If i7 = i2 Or i7 = i3 Then
				str2 = str2 & NumberFormat2(cursorWrapper.GetDouble2(i7), 1, 2, 2, False) & "','"
			Else If cursorWrapper.GetColumnName(i7).ToLowerCase.StartsWith("dataora") And z2 Then
				str2 = str2 & cursorWrapper.GetString2(i7).SubString2(3, 5) & "/" & cursorWrapper.GetString2(i7).SubString2(0, 2) & "/" & cursorWrapper.GetString2(i7).SubString(6) & "','"
			Else If cursorWrapper.GetColumnName(i7).ToLowerCase.StartsWith("data") And z2 Then
				str2 = str2 & cursorWrapper.GetString2(i7).SubString2(3, 5) & "/" & cursorWrapper.GetString2(i7).SubString2(0, 2) & "/" & cursorWrapper.GetString2(i7).SubString2(6, 10) & "','"
			Else If cursorWrapper.GetColumnName(i7).ToLowerCase.StartsWith("prezzo") Then
				str2 = str2 & NumberFormat2(cursorWrapper.GetDouble2(i7), 1, 2, 2, False) & "','"
			Else
				str2 = str2 & cursorWrapper.GetString2(i7).Replace("\", "") & "','"
			End If
		Next
		stringBuilderWrapper.Append(str2.SubString2(0, str2.Length - 2)).Append("],")
	Next
	If rowCount > 0 Then
		stringBuilderWrapper.Remove(stringBuilderWrapper.Length - 1, stringBuilderWrapper.Length)
	End If
	stringBuilderWrapper.Append(File.GetText(File.DirAssets, "MidReport")).Append(CRLF)
	Dim columnCount2 As Int = cursorWrapper.ColumnCount - 1
	Dim i8 As Int
	For i8 = 0 To columnCount2
		stringBuilderWrapper.Append("{ " & QUOTE & "title" & QUOTE & ": " & QUOTE).Append(cursorWrapper.GetColumnName(i8)).Append(QUOTE & "},")
	Next
	stringBuilderWrapper.Remove(stringBuilderWrapper.Length - 1, stringBuilderWrapper.Length)
	stringBuilderWrapper.Append(File.GetText(File.DirAssets, "EndReport"))
	cursorWrapper.Close
	Return stringBuilderWrapper.ToString
End Sub

Sub Sub002(sql As SQL, str As String, strArr As String(), i As Int, z As Boolean, i2 As Int, z2 As Boolean) As String
	Dim cursorWrapper As Cursor
	Dim rowCount As Int
	Try
		ProgressDialogShow2("Caricamento dati in Corso ...", False)
		If Not(strArr = Null) Then
			cursorWrapper = sql.ExecQuery2(str, strArr)
		Else
			cursorWrapper = sql.ExecQuery(str)
		End If
		If i > 0 Then
			rowCount = Min(i, cursorWrapper.RowCount)
		Else
			rowCount = cursorWrapper.RowCount
		End If
		Dim stringBuilderWrapper As StringBuilder
		stringBuilderWrapper.Initialize
		stringBuilderWrapper.Append("<html><body>").Append(CRLF)
		stringBuilderWrapper.Append("<style type='text/css'>").Append(vStr1).Append("</style>").Append(CRLF)
		stringBuilderWrapper.Append("<table><tr>").Append(CRLF)
		Dim columnCount As Int = cursorWrapper.ColumnCount - 1
		Dim i3 As Int
		For i3 = 0 To columnCount
			If Not(z2) Or i3 <> 5 Then
				If i2 = i3 Then
					stringBuilderWrapper.Append("<th style='background-color:#FF1100'>")
				Else
					stringBuilderWrapper.Append("<th>")
				End If
				If z Then
					stringBuilderWrapper.Append("<a href='http://").Append(i3).Append(".")
					stringBuilderWrapper.Append("-1")
					stringBuilderWrapper.Append(".com'>").Append(cursorWrapper.GetColumnName(i3)).Append("</a>")
				Else
					stringBuilderWrapper.Append(cursorWrapper.GetColumnName(i3))
				End If
				stringBuilderWrapper.Append("</th>")
			End If
		Next
		stringBuilderWrapper.Append("</tr>").Append(CRLF)
		Dim i4 As Int = rowCount - 1
		Dim i5 As Int
		For i5 = 0 To i4
			cursorWrapper.Position = i5
			If i5 Mod 2 = 0 Then
				stringBuilderWrapper.Append("<tr>")
			Else
				stringBuilderWrapper.Append("<tr class='odd'>")
			End If
			Dim columnCount2 As Int = cursorWrapper.ColumnCount - 1
			Dim i6 As Int = 0
			Do While i6 <= columnCount2
				Dim vGetString2 As String = cursorWrapper.GetString2(i6)
				Dim str2 As String = ""
				If z2 And i6 = 5 Then
					vInt1 = cursorWrapper.GetInt2(i6)
				Else
					If z2 And (i6 = 3 Or i6 = 4 Or i6 = 6) Then
						vGetString2 = NumberFormat2(cursorWrapper.GetDouble2(i6), 1, 2, 2, False)
						str2 = IIf(i6 = 6, IIf(cursorWrapper.GetInt2(i6) <= 0, "align='right' bgcolor='red' style='font-weight:bold;'", IIf(cursorWrapper.GetInt2(i6) <= vInt1, "align='right' bgcolor='yellow' style='font-weight:bold;'", "align='right' bgcolor='green' style='font-weight:bold;'")), "align='right'")
					End If
					If cursorWrapper.GetColumnName(i6).ToLowerCase.StartsWith("prezzo") Then
						vGetString2 = NumberFormat2(cursorWrapper.GetDouble2(i6), 1, 2, 2, False)
						str2 = "align='right'"
					Else If cursorWrapper.GetColumnName(i6).ToLowerCase.StartsWith("sconto") Then
						str2 = "align='right'"
					End If
					stringBuilderWrapper.Append("<td " & str2 & ">" & vGetString2 & "</td>")
				End If
				i6 = i6 + 1
			Loop
			stringBuilderWrapper.Append("</tr>").Append(CRLF)
			DoEvents
		Next
		cursorWrapper.Close
		stringBuilderWrapper.Append("</table></body></html>")
		ProgressDialogHide
		Return stringBuilderWrapper.ToString
	Catch
		ProgressDialogHide
		mod1.Sub217(LastException.Message)
		Return ""
	End Try
End Sub

Sub Sub003(sql As SQL, str As String, strArr As String(), i As Int, z As Boolean, i2 As Int, i3 As Int, i4 As Int) As String
	Dim cursorWrapper As Cursor
	Dim rowCount As Int
	If Not(strArr = Null) Then
		cursorWrapper = sql.ExecQuery2(str, strArr)
	Else
		cursorWrapper = sql.ExecQuery(str)
	End If
	If i > 0 Then
		rowCount = Min(i, cursorWrapper.RowCount)
	Else
		rowCount = cursorWrapper.RowCount
	End If
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	stringBuilderWrapper.Append(File.GetText(File.DirAssets, "ReportStart")).Append(CRLF)
	Dim i5 As Int = rowCount - 1
	Dim i6 As Int
	For i6 = 0 To i5
		cursorWrapper.Position = i6
		Dim str2 As String = "['"
		Dim columnCount As Int = cursorWrapper.ColumnCount - 1
		Dim i7 As Int
		For i7 = 0 To columnCount
			If i7 = i2 Or i7 = i3 Then
				str2 = str2 & NumberFormat2(cursorWrapper.GetDouble2(i7), 1, 2, 2, False) & "','"
			Else If cursorWrapper.GetColumnName(i7).ToLowerCase.StartsWith("dataora") Then
				str2 = str2 & cursorWrapper.GetString2(i7).SubString2(3, 5) & "/" & cursorWrapper.GetString2(i7).SubString2(0, 2) & "/" & cursorWrapper.GetString2(i7).SubString(6) & "','"
			Else If cursorWrapper.GetColumnName(i7).ToLowerCase.StartsWith("data") Then
				str2 = str2 & cursorWrapper.GetString2(i7).SubString2(3, 5) & "/" & cursorWrapper.GetString2(i7).SubString2(0, 2) & "/" & cursorWrapper.GetString2(i7).SubString2(6, 10) & "','"
			Else If cursorWrapper.GetColumnName(i7).ToLowerCase.StartsWith("prezzo") Then
				str2 = str2 & NumberFormat2(cursorWrapper.GetDouble2(i7), 1, 2, 2, False) & "','"
			Else
				str2 = str2 & cursorWrapper.GetString2(i7).Replace("'", "").Replace("\", "") & "','"
			End If
			If i7 = cursorWrapper.ColumnCount - 1 Then
				Dim d As Double = 0
				If Main.vSql2.ExecQuerySingleResult("Select count(*) from venduto where codint = '" & cursorWrapper.GetString2(0) & "' and causale ='ca'") > 0 Then
					d = Main.vSql2.ExecQuerySingleResult("Select case when sum(importo)/sum(qta) is null then 0 else sum(importo)/sum(qta) end from venduto where codint = '" & cursorWrapper.GetString2(0) & "' and causale ='ca'") * cursorWrapper.GetDouble2(2)
					vDbl1 = vDbl1 + d
				End If
				str2 = str2 & NumberFormat2(d, 1, 2, 2, False) & "','"
			End If
		Next
		stringBuilderWrapper.Append(str2.SubString2(0, str2.Length - 2)).Append("],")
	Next
	If rowCount > 0 Then
		stringBuilderWrapper.Remove(stringBuilderWrapper.Length - 1, stringBuilderWrapper.Length)
	End If
	stringBuilderWrapper.Append(File.GetText(File.DirAssets, "MidReport")).Append(CRLF)
	Dim columnCount2 As Int = cursorWrapper.ColumnCount - 1
	Dim i8 As Int
	For i8 = 0 To columnCount2
		stringBuilderWrapper.Append("{ " & QUOTE & "title" & QUOTE & ": " & QUOTE).Append(cursorWrapper.GetColumnName(i8).Replace("Valorizzazione", "Valorizz.")).Append(QUOTE & "},")
	Next
	stringBuilderWrapper.Append("{ " & QUOTE & "title" & QUOTE & ": " & QUOTE).Append("Valorizz.Media").Append(QUOTE & "},")
	stringBuilderWrapper.Remove(stringBuilderWrapper.Length - 1, stringBuilderWrapper.Length)
	stringBuilderWrapper.Append(File.GetText(File.DirAssets, "EndReport"))
	cursorWrapper.Close
	Return stringBuilderWrapper.ToString
End Sub

Sub Sub004(sql As SQL, str As String, strArr As String(), i As Int, z As Boolean, i2 As Int) As String
	Dim cursorWrapper As Cursor
	Dim rowCount As Int
	Try
		ProgressDialogShow2("Caricamento dati in Corso ...", False)
		If Not(strArr = Null) Then
			cursorWrapper = sql.ExecQuery2(str, strArr)
		Else
			cursorWrapper = sql.ExecQuery(str)
		End If
		If i > 0 Then
			rowCount = Min(i, cursorWrapper.RowCount)
		Else
			rowCount = cursorWrapper.RowCount
		End If
		Dim stringBuilderWrapper As StringBuilder
		stringBuilderWrapper.Initialize
		stringBuilderWrapper.Append("<html><body>").Append(CRLF)
		stringBuilderWrapper.Append("<style type='text/css'>").Append(vStr1).Append("</style>").Append(CRLF)
		stringBuilderWrapper.Append("<table><tr>").Append(CRLF)
		Dim columnCount As Int = cursorWrapper.ColumnCount - 1
		Dim i3 As Int
		For i3 = 0 To columnCount
			If i2 = i3 Then
				stringBuilderWrapper.Append("<th style='background-color:#FF1100'>")
			Else
				stringBuilderWrapper.Append("<th>")
			End If
			If z Then
				stringBuilderWrapper.Append("<a href='http://").Append(i3).Append(".")
				stringBuilderWrapper.Append("-1")
				stringBuilderWrapper.Append(".com'>").Append(cursorWrapper.GetColumnName(i3)).Append("</a>")
			Else
				stringBuilderWrapper.Append(cursorWrapper.GetColumnName(i3))
			End If
			stringBuilderWrapper.Append("</th>")
		Next
		stringBuilderWrapper.Append("</tr>").Append(CRLF)
		Dim i4 As Int = rowCount - 1
		Dim i5 As Int
		For i5 = 0 To i4
			cursorWrapper.Position = i5
			If i5 Mod 2 = 0 Then
				stringBuilderWrapper.Append("<tr>")
			Else
				stringBuilderWrapper.Append("<tr class='odd'>")
			End If
			Dim columnCount2 As Int = cursorWrapper.ColumnCount - 1
			Dim i6 As Int
			For i6 = 0 To columnCount2
				Dim vGetString2 As String = cursorWrapper.GetString2(i6)
				Dim str2 As String = ""
				If i6 = 3 Or i6 = 4 Or i6 = 5 Or i6 = 6 Then
					vGetString2 = NumberFormat2(cursorWrapper.GetDouble2(i6), 1, 2, 2, False)
					If i6 = 6 Then
						If cursorWrapper.GetInt2(i6) <= 0 Then
							str2 = "align='right' bgcolor='red' style='font-weight:bold;'"
						Else
							str2 = "align='right' bgcolor='green' style='font-weight:bold;'"
						End If
					Else
						str2 = "align='right'"
					End If
				End If
				If cursorWrapper.GetColumnName(i6).ToLowerCase.StartsWith("prezzo") Then
					vGetString2 = NumberFormat2(cursorWrapper.GetDouble2(i6), 1, 2, 2, False)
					str2 = "align='right'"
				Else If cursorWrapper.GetColumnName(i6).ToLowerCase.StartsWith("sconto") Then
					str2 = "align='right'"
				End If
				stringBuilderWrapper.Append("<td " & str2 & ">" & vGetString2 & "</td>")
			Next
			stringBuilderWrapper.Append("</tr>").Append(CRLF)
			DoEvents
		Next
		cursorWrapper.Close
		stringBuilderWrapper.Append("</table></body></html>")
		ProgressDialogHide
		Return stringBuilderWrapper.ToString
	Catch
		ProgressDialogHide
		mod1.Sub217(LastException.Message)
		Return ""
	End Try
End Sub

Sub Sub005(sql As SQL, str As String, strArr As String(), i As Int, z As Boolean, i2 As Int, i3 As Int, i4 As Int, str2 As String, str3 As String) As String
	Dim cursorWrapper As Cursor
	Dim rowCount As Int
	If Not(strArr = Null) Then
		cursorWrapper = sql.ExecQuery2(str, strArr)
	Else
		cursorWrapper = sql.ExecQuery(str)
	End If
	If i > 0 Then
		rowCount = Min(i, cursorWrapper.RowCount)
	Else
		rowCount = cursorWrapper.RowCount
	End If
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	stringBuilderWrapper.Append(File.GetText(File.DirAssets, "HeadStampe")).Append(CRLF)
	stringBuilderWrapper.Append("<table class='pure-table'  style='width:100%' >" & TAB & TAB & "<thead>" & TAB & "<tr>").Append(CRLF)
	Dim columnCount As Int = cursorWrapper.ColumnCount - 1
	Dim i5 As Int
	For i5 = 0 To columnCount
		stringBuilderWrapper.Append("<th>")
		stringBuilderWrapper.Append(cursorWrapper.GetColumnName(i5))
		stringBuilderWrapper.Append("</th>")
	Next
	stringBuilderWrapper.Append("</tr>").Append(CRLF)
	stringBuilderWrapper.Append("</thead>").Append(CRLF)
	stringBuilderWrapper.Append("<tbody>").Append(CRLF)
	Dim i6 As Int = rowCount - 1
	Dim i7 As Int
	For i7 = 0 To i6
		cursorWrapper.Position = i7
		If i7 Mod 2 = 0 Then
			stringBuilderWrapper.Append("<tr>")
		Else
			stringBuilderWrapper.Append("<tr class='pure-table-odd'>")
		End If
		Dim columnCount2 As Int = cursorWrapper.ColumnCount - 1
		Dim i8 As Int
		For i8 = 0 To columnCount2
			Dim vGetString2 As String = cursorWrapper.GetString2(i8)
			Dim str4 As String = ""
			If i8 = i2 Or i8 = i3 Then
				vGetString2 = NumberFormat2(cursorWrapper.GetDouble2(i8), 1, 2, 2, False)
				str4 = "align='right'"
			End If
			If cursorWrapper.GetColumnName(i8).ToLowerCase.StartsWith("qta") Then
				vGetString2 = NumberFormat2(cursorWrapper.GetDouble2(i8), 1, 0, 0, False)
				str4 = "align='right'"
			End If
			stringBuilderWrapper.Append("<td " & str4 & ">" & vGetString2 & "</td>")
		Next
		stringBuilderWrapper.Append("</tr>").Append(CRLF)
	Next
	stringBuilderWrapper.Append("<tr>")
	stringBuilderWrapper.Append("<td></td>").Append(CRLF)
	stringBuilderWrapper.Append("<td class align='left' style='font-weight:bold'>TOTALE</td>").Append(CRLF)
	Dim parseDouble As Double = sql.ExecQuerySingleResult(str2)
	stringBuilderWrapper.Append("<td class align='right' style='font-weight:bold'>" & NumberFormat2(sql.ExecQuerySingleResult(str3), 1, 0, 0, False) & "</td>").Append(CRLF)
	stringBuilderWrapper.Append("<td class align='right' style='font-weight:bold'>" & NumberFormat2(parseDouble, 1, 2, 2, False) & "</td>").Append(CRLF)
	If cursorWrapper.ColumnCount - 1 >= i3 Then
		stringBuilderWrapper.Append("<td class align='right' style='font-weight:bold'>" & NumberFormat2(sql.ExecQuerySingleResult(str2.Replace("importo", "scov")), 1, 2, 2, False) & "</td>").Append(CRLF)
	End If
	stringBuilderWrapper.Append("</tr>").Append(CRLF)
	cursorWrapper.Close
	stringBuilderWrapper.Append("</body></table>")
	Return stringBuilderWrapper.ToString
End Sub

Sub Sub006(sql As SQL, str As String, strArr As String()) As Map
	Dim cursorWrapper As Cursor
	If Not(strArr = Null) Then
		cursorWrapper = sql.ExecQuery2(str, strArr)
	Else
		cursorWrapper = sql.ExecQuery(str)
	End If
	If cursorWrapper.RowCount = 0 Then
		Return Null
	End If
	Dim map As Map
	map.Initialize
	cursorWrapper.Position = 0
	Dim columnCount As Int = cursorWrapper.ColumnCount - 1
	Dim i As Int
	For i = 0 To columnCount
		map.Put(cursorWrapper.GetColumnName(i).ToLowerCase, cursorWrapper.GetString2(i))
	Next
	cursorWrapper.Close
	Return map
End Sub

Sub Sub007(sql As SQL, str As String, list As List)
	Dim stringBuilderWrapper As StringBuilder
	Dim stringBuilderWrapper2 As StringBuilder
	Dim stringBuilderWrapper3 As StringBuilder
	If list.Size > 1 And list.Get(0) = list.Get(1) Then
		mod1.Sub215("Errore durante l'inserimento del record in " & str & ",ListOfMaps.Size=" & list.Size & ",ListOfMaps.Get(0)=" & list.Get(0))
		Return
	End If
	sql.BeginTransaction
	Try
		Dim size As Int = list.Size - 1
		Dim i As Int
		For i = 0 To size
			stringBuilderWrapper.Initialize
			stringBuilderWrapper2.Initialize
			stringBuilderWrapper3.Initialize
			Dim list2 As List
			list2.Initialize
			stringBuilderWrapper.Append("INSERT INTO [" & str & "] (")
			Dim map As Map = list.Get(i)
			Dim size2 As Int = map.Size - 1
			Dim i2 As Int
			For i2 = 0 To size2
				Dim vObjectToString As String = map.GetKeyAt(i2)
				Dim vGetValueAt As Object = map.GetValueAt(i2)
				If i2 > 0 Then
					stringBuilderWrapper2.Append(", ")
					stringBuilderWrapper3.Append(", ")
				End If
				stringBuilderWrapper2.Append("[").Append(vObjectToString).Append("]")
				stringBuilderWrapper3.Append("?")
				list2.Add(vGetValueAt)
			Next
			stringBuilderWrapper.Append(stringBuilderWrapper2.ToString).Append(") VALUES (").Append(stringBuilderWrapper3.ToString).Append(")")
			sql.ExecNonQuery2(stringBuilderWrapper.ToString, list2)
		Next
		sql.TransactionSuccessful
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	sql.EndTransaction
End Sub

Sub Sub008(sql As SQL, str As String, list As List)
	Dim stringBuilderWrapper As StringBuilder
	Dim stringBuilderWrapper2 As StringBuilder
	Dim stringBuilderWrapper3 As StringBuilder
	If list.Size > 1 And list.Get(0) = list.Get(1) Then
		ToastMessageShow("Same Map found twice in list. Each item in the list should include a different map object.", True)
		Return
	End If
	sql.BeginTransaction
	Try
		Dim size As Int = list.Size - 1
		Dim i As Int
		For i = 0 To size
			stringBuilderWrapper.Initialize
			stringBuilderWrapper2.Initialize
			stringBuilderWrapper3.Initialize
			Dim list2 As List
			list2.Initialize
			stringBuilderWrapper.Append("INSERT INTO [" & str & "] (")
			Dim map As Map = list.Get(i)
			Dim vObjectToString As String = map.Get("nmov")
			If sql.ExecQuerySingleResult("Select count(*) from " & str & "  where nmov = " & vObjectToString) > 0 Then
				Dim vExecQuerySingleResult As String = sql.ExecQuerySingleResult("Select datam3 from " & str & "  where nmov = " & vObjectToString)
				Dim parseDouble As Int = sql.ExecQuerySingleResult("Select Locked from " & str & "  where nmov = " & vObjectToString)
				sql.ExecNonQuery("update " & str & " set DaCancellare=0 where nmov = " & vObjectToString)
				If vExecQuerySingleResult <> map.Get("datam3") Or parseDouble <> map.Get("locked") Then
					Dim map2 As Map
					map2.Initialize
					map2.Put("nmov", vObjectToString)
					Sub012(sql, str, map, map2)
				End If
			Else
				Dim size2 As Int = map.Size - 1
				Dim i2 As Int
				For i2 = 0 To size2
					Dim vObjectToString2 As String = map.GetKeyAt(i2)
					Dim vGetValueAt As Object = map.GetValueAt(i2)
					If i2 > 0 Then
						stringBuilderWrapper2.Append(", ")
						stringBuilderWrapper3.Append(", ")
					End If
					stringBuilderWrapper2.Append("[").Append(vObjectToString2).Append("]")
					stringBuilderWrapper3.Append("?")
					list2.Add(vGetValueAt)
				Next
				stringBuilderWrapper.Append(stringBuilderWrapper2.ToString).Append(") VALUES (").Append(stringBuilderWrapper3.ToString).Append(")")
				sql.ExecNonQuery2(stringBuilderWrapper.ToString, list2)
			End If
		Next
		sql.TransactionSuccessful
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	sql.EndTransaction
End Sub

Sub Sub009(sql As SQL, str As String, list As List) As Boolean
	Dim stringBuilderWrapper As StringBuilder
	Dim stringBuilderWrapper2 As StringBuilder
	Dim stringBuilderWrapper3 As StringBuilder
	If list.Size > 1 And list.Get(0) = list.Get(1) Then
		mod1.Sub215("Errore durante l'inserimento del record in " & str & ",ListOfMaps.Size=" & list.Size & ",ListOfMaps.Get(0)=" & list.Get(0))
		Return False
	End If
	Try
		Dim size As Int = list.Size - 1
		Dim i As Int
		For i = 0 To size
			stringBuilderWrapper.Initialize
			stringBuilderWrapper2.Initialize
			stringBuilderWrapper3.Initialize
			Dim list2 As List
			list2.Initialize
			stringBuilderWrapper.Append("INSERT INTO [" & str & "] (")
			Dim map As Map = list.Get(i)
			Dim size2 As Int = map.Size - 1
			Dim i2 As Int
			For i2 = 0 To size2
				Dim vObjectToString As String = map.GetKeyAt(i2)
				Dim vGetValueAt As Object = map.GetValueAt(i2)
				If i2 > 0 Then
					stringBuilderWrapper2.Append(", ")
					stringBuilderWrapper3.Append(", ")
				End If
				stringBuilderWrapper2.Append("[").Append(vObjectToString).Append("]")
				stringBuilderWrapper3.Append("?")
				list2.Add(vGetValueAt)
			Next
			stringBuilderWrapper.Append(stringBuilderWrapper2.ToString).Append(") VALUES (").Append(stringBuilderWrapper3.ToString).Append(")")
			Try
				sql.ExecNonQuery2(stringBuilderWrapper.ToString, list2)
			Catch
				Dim z As Boolean = True
				If LastException.Message.ToLowerCase.Contains("unique") And str = "headmov" And list2.Size > 10 Then
					If Main.vSql2.ExecQuerySingleResult("Select count(*) from " & SmartStringFormatter("", str) & TAB & TAB & TAB & TAB & TAB & TAB & "where nmov= " & SmartStringFormatter("", list2.Get(0)) & " and ((totale=" & SmartStringFormatter("", list2.Get(7)) & " and datam3 ='" & SmartStringFormatter("", list2.Get(13)) & "') or causale='pr')") > 0 Then
						z = False
						Main.vSql2.ExecNonQuery("delete from venduto where nmov=" & SmartStringFormatter("", list2.Get(0)) & " ")
						Main.vSql2.ExecNonQuery("delete from CausaliPagamenti where nmov=" & SmartStringFormatter("", list2.Get(0)) & " ")
					End If
				End If
				If z Then
					mod1.Sub217(LastException.Message)
					Return False
				End If
			End Try
		Next
		Return True
	Catch
		mod1.Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub Sub010(sql As SQL, str As String, list As List)
	Dim stringBuilderWrapper As StringBuilder
	Dim stringBuilderWrapper2 As StringBuilder
	Dim stringBuilderWrapper3 As StringBuilder
	If list.Size > 1 And list.Get(0) = list.Get(1) Then
		ToastMessageShow("Same Map found twice in list. Each item in the list should include a different map object.", True)
		Return
	End If
	Try
		Dim size As Int = list.Size - 1
		Dim i As Int
		For i = 0 To size
			stringBuilderWrapper.Initialize
			stringBuilderWrapper2.Initialize
			stringBuilderWrapper3.Initialize
			Dim list2 As List
			list2.Initialize
			stringBuilderWrapper.Append("INSERT INTO [" & str & "] (")
			Dim map As Map = list.Get(i)
			Dim size2 As Int = map.Size - 1
			Dim i2 As Int
			For i2 = 0 To size2
				Dim vObjectToString As String = map.GetKeyAt(i2)
				Dim vGetValueAt As Object = map.GetValueAt(i2)
				If i2 > 0 Then
					stringBuilderWrapper2.Append(", ")
					stringBuilderWrapper3.Append(", ")
				End If
				stringBuilderWrapper2.Append("[").Append(vObjectToString).Append("]")
				stringBuilderWrapper3.Append("?")
				list2.Add(vGetValueAt)
			Next
			stringBuilderWrapper.Append(stringBuilderWrapper2.ToString).Append(") VALUES (").Append(stringBuilderWrapper3.ToString).Append(")")
			sql.ExecNonQuery2(stringBuilderWrapper.ToString, list2)
		Next
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub Sub011(sql As SQL, str As String, list As List)
	Dim stringBuilderWrapper As StringBuilder
	Dim stringBuilderWrapper2 As StringBuilder
	Dim stringBuilderWrapper3 As StringBuilder
	If list.Size > 1 And list.Get(0) = list.Get(1) Then
		ToastMessageShow("Same Map found twice in list. Each item in the list should include a different map object.", True)
		Return
	End If
	Try
		Dim size As Int = list.Size - 1
		Dim i As Int
		For i = 0 To size
			stringBuilderWrapper.Initialize
			stringBuilderWrapper2.Initialize
			stringBuilderWrapper3.Initialize
			Dim list2 As List
			list2.Initialize
			stringBuilderWrapper.Append("INSERT INTO [" & str & "] (")
			Dim map As Map = list.Get(i)
			Dim size2 As Int = map.Size - 1
			Dim i2 As Int
			For i2 = 0 To size2
				Dim vObjectToString As String = map.GetKeyAt(i2)
				Dim vGetValueAt As Object = map.GetValueAt(i2)
				If i2 > 0 Then
					stringBuilderWrapper2.Append(", ")
					stringBuilderWrapper3.Append(", ")
				End If
				stringBuilderWrapper2.Append("[").Append(vObjectToString).Append("]")
				stringBuilderWrapper3.Append("?")
				list2.Add(vGetValueAt)
			Next
			stringBuilderWrapper.Append(stringBuilderWrapper2.ToString).Append(") VALUES (").Append(stringBuilderWrapper3.ToString).Append(")")
			sql.ExecNonQuery2(stringBuilderWrapper.ToString, list2)
		Next
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub Sub012(sql As SQL, str As String, map As Map, map2 As Map)
	If map2.Size = 0 Or map.Size = 0 Then
		Return
	End If
	Dim stringBuilderWrapper As StringBuilder
	stringBuilderWrapper.Initialize
	stringBuilderWrapper.Append("UPDATE [").Append(str).Append("] SET ")
	Dim list As List
	list.Initialize
	Dim size As Int = map.Size - 1
	Dim i As Int
	For i = 0 To size
		If i <> map.Size - 1 Then
			stringBuilderWrapper.Append("[").Append(map.GetKeyAt(i)).Append("]=?,")
		Else
			stringBuilderWrapper.Append("[").Append(map.GetKeyAt(i)).Append("]=?")
		End If
		list.Add(map.GetValueAt(i))
	Next
	stringBuilderWrapper.Append(" WHERE ")
	Dim size2 As Int = map2.Size - 1
	Dim i2 As Int
	For i2 = 0 To size2
		If i2 > 0 Then
			stringBuilderWrapper.Append(" AND ")
		End If
		stringBuilderWrapper.Append("[").Append(map2.GetKeyAt(i2)).Append("] = ?")
		list.Add(map2.GetValueAt(i2))
	Next
	sql.ExecNonQuery2(stringBuilderWrapper.ToString, list)
End Sub

