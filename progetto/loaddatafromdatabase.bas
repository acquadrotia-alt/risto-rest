B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vSql1 As SQL
End Sub

Sub Sub001
	Dim totemcategorytypeVarArr(1) As totemcategorytype
	Dim i As Int
	For i = 0 To totemcategorytypeVarArr.Length - 1
		'totemcategorytypeVarArr(i) = totemcategorytype
	Next
	totemcategorytypeVarArr(0).Code = "Menu"
	totemcategorytypeVarArr(0).NameCategory = Array As String("Menù", "Menu", "Menu", "Speisekarte", "Menú")
	totemcategorytypeVarArr(0).ImageFileName = "reparto_menu.png"
	totemdata.vv4 = Utility.v5(totemcategorytypeVarArr, totemdata.vv4)
	Dim totemcategorytypeVarArr2(1) As totemcategorytype
	Dim i2 As Int
	For i2 = 0 To totemcategorytypeVarArr2.Length - 1
		'totemcategorytypeVarArr2(i2) = totemcategorytype
	Next
	totemcategorytypeVarArr2(0).Code = "SpecialOffer"
	totemcategorytypeVarArr2(0).NameCategory = Array As String("Offerte Risparmio", "Savings Offers", "Offres d'épargne", "Sparangebote", "Ofertas de ahorro")
	totemcategorytypeVarArr2(0).ImageFileName = "reparto_savings_offers.png"
	totemdata.vv4 = Utility.v5(totemdata.vv4, totemcategorytypeVarArr2)
	If totemdata.vv7.Length > 0 Then
		Dim totemcategorytypeVarArr3(totemdata.vv7.Length) As totemcategorytype
		Dim i3 As Int
		For i3 = 0 To totemcategorytypeVarArr3.Length - 1
			'totemcategorytypeVarArr3(i3) = totemcategorytype
		Next
		Dim length4 As Int = totemdata.vv7.Length - 1
		Dim i4 As Int
		For i4 = 0 To length4
			Dim totemcategorytypeVar As totemcategorytype
			totemcategorytypeVar.Code = "tags" & totemdata.vv7(i4).Code
			Dim strArr() As String = Array(totemdata.vv7(i4).Name(0), totemdata.vv7(i4).Name(1), totemdata.vv7(i4).Name(2), totemdata.vv7(i4).Name(3), totemdata.vv7(i4).Name(4))
			totemcategorytypeVar.NameCategory = strArr
			totemcategorytypeVar.ImageFileName = totemcategorytypeVar.Code & ".png"
			totemcategorytypeVar.Products = totemdata.Sub010(totemdata.vv7(i4))
			totemcategorytypeVarArr3(i4) = totemcategorytypeVar
		Next
		totemdata.vv4 = Utility.v5(totemdata.vv4, totemcategorytypeVarArr3)
		Return
	End If
End Sub

Sub Sub002(str As String) As totemallergenstype
	If totemdata.vv6.Length > 0 Then
		Dim length As Int = totemdata.vv6.Length - 1
		Dim i As Int
		For i = 0 To length
			If totemdata.vv6(i).Code = str Then
				Return totemdata.vv6(i)
			End If
		Next
		Return Null
	End If
	Return Null
End Sub

Sub Sub003(totemproducttypeVar As totemproducttype) As totemallergenstype()
	Dim totemallergenstypeVarArr(0) As totemallergenstype
	Dim i As Int
	For i = 0 To totemallergenstypeVarArr.Length - 1
		'totemallergenstypeVarArr(i) = totemallergenstype
	Next
	Dim cursorWrapper As Cursor
	Dim sql As SQL = vSql1
	Dim cursorWrapper2 As Cursor = sql.ExecQuery("SELECT p.codice" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "    FROM allergeniPLU p" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "INNER JOIN allergeni al ON al.codice = p.codice" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "WHERE p.codint = " & SmartStringFormatter("", totemproducttypeVar.Code) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "  AND al.tag = 0" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "ORDER BY p.codice")
	If cursorWrapper2.RowCount > 0 Then
		Dim totemallergenstypeVarArr(cursorWrapper2.RowCount) As totemallergenstype
		Dim i2 As Int
		For i2 = 0 To totemallergenstypeVarArr.Length - 1
			'totemallergenstypeVarArr(i2) = totemallergenstype
		Next
		Log("Product " & totemproducttypeVar.Code & " " & totemproducttypeVar.Description(0))
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i3 As Int
		For i3 = 0 To rowCount
			cursorWrapper2.Position = i3
			Dim vTmp As totemallergenstype = Sub002(cursorWrapper2.GetString("codice"))
			Log("Allergens " & vTmp.Code & " " & vTmp.Name(0))
			totemallergenstypeVarArr(i3) = vTmp
		Next
	End If
	cursorWrapper2.Close
	Return totemallergenstypeVarArr
End Sub

Sub Sub004(str As String) As totemproducttype()
	Dim totemproducttypeVarArr(0) As totemproducttype
	Dim i As Int
	For i = 0 To totemproducttypeVarArr.Length - 1
		'totemproducttypeVarArr(i) = totemproducttype
	Next
	Dim cursorWrapper As Cursor
	Dim sql As SQL = vSql1
	Dim cursorWrapper2 As Cursor = sql.ExecQuery("SELECT a.codint, a.descrizione, a.list1 As Price, " & TAB & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione1," & QUOTE & QUOTE & ") as descrizione1,  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione2," & QUOTE & QUOTE & ") as descrizione2, " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione3," & QUOTE & QUOTE & ") as descrizione3,  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione4," & QUOTE & QUOTE & ") as descrizione4,  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione5," & QUOTE & QUOTE & ") as descrizione5" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "FROM anagra a  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " LEFT JOIN anagraDescrizioni d ON a.codint = d.codint " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "WHERE a.reparto > 0" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "  AND a.flgusointerno = 0" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "  AND a.reparto = " & SmartStringFormatter("", str) & " " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "  And a.bvar = 0" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "ORDER BY a.codint ")
	If cursorWrapper2.RowCount > 0 Then
		Dim totemproducttypeVarArr(cursorWrapper2.RowCount) As totemproducttype
		Dim i2 As Int
		For i2 = 0 To totemproducttypeVarArr.Length - 1
			'totemproducttypeVarArr(i2) = totemproducttype
		Next
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i3 As Int
		For i3 = 0 To rowCount
			Log("*******************************")
			cursorWrapper2.Position = i3
			totemproducttypeVarArr(i3).Code = cursorWrapper2.GetString("codint")
			totemproducttypeVarArr(i3).Name = cursorWrapper2.GetString("descrizione")
			Log("Product " & totemproducttypeVarArr(i3).Code & " " & totemproducttypeVarArr(i3).Name)
			Dim strArr() As String = Array(cursorWrapper2.GetString("descrizione1"), cursorWrapper2.GetString("descrizione2"), cursorWrapper2.GetString("descrizione3"), cursorWrapper2.GetString("descrizione4"), cursorWrapper2.GetString("descrizione5"))
			totemproducttypeVarArr(i3).Description = strArr
			totemproducttypeVarArr(i3).Price = cursorWrapper2.GetDouble("Price")
			totemproducttypeVarArr(i3).ImageFileName = totemproducttypeVarArr(i3).Code & ".png"
			Dim totemproducttypeVar As totemproducttype = totemproducttypeVarArr(i3)
			totemproducttypeVar.IsDiscounted = False
			totemproducttypeVarArr(i3).Allergens = Sub003(totemproducttypeVarArr(i3))
			totemproducttypeVarArr(i3).Tags = Sub006(totemproducttypeVarArr(i3))
		Next
	End If
	cursorWrapper2.Close
	Return totemproducttypeVarArr
End Sub

Sub Sub005(str As String) As totemtagstype
	If totemdata.vv7.Length > 0 Then
		Dim length As Int = totemdata.vv7.Length - 1
		Dim i As Int
		For i = 0 To length
			If totemdata.vv7(i).Code = str Then
				Return totemdata.vv7(i)
			End If
		Next
		Return Null
	End If
	Return Null
End Sub

Sub Sub006(totemproducttypeVar As totemproducttype) As totemtagstype()
	Dim totemtagstypeVarArr(0) As totemtagstype
	Dim i As Int
	For i = 0 To totemtagstypeVarArr.Length - 1
		'totemtagstypeVarArr(i) = totemtagstype
	Next
	Dim cursorWrapper As Cursor
	Dim sql As SQL = vSql1
	Dim cursorWrapper2 As Cursor = sql.ExecQuery("SELECT p.codice" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "    FROM allergeniPLU p" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "INNER JOIN allergeni al ON al.codice = p.codice" & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "WHERE p.codint = " & SmartStringFormatter("", totemproducttypeVar.Code) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "  AND al.tag = 1" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "ORDER BY p.codice")
	If cursorWrapper2.RowCount > 0 Then
		Dim totemtagstypeVarArr(cursorWrapper2.RowCount) As totemtagstype
		Dim i2 As Int
		For i2 = 0 To totemtagstypeVarArr.Length - 1
			'totemtagstypeVarArr(i2) = totemtagstype
		Next
		Log("Product " & totemproducttypeVar.Code & " " & totemproducttypeVar.Description(0))
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i3 As Int
		For i3 = 0 To rowCount
			cursorWrapper2.Position = i3
			Dim vTmp As totemtagstype = Sub005(cursorWrapper2.GetString("codice"))
			Log("Tag " & vTmp.Code & " " & vTmp.Name(0))
			totemtagstypeVarArr(i3) = vTmp
		Next
	End If
	cursorWrapper2.Close
	Return totemtagstypeVarArr
End Sub

Sub Sub007
	Dim cursorWrapper As Cursor = vSql1.ExecQuery("SELECT (SELECT COUNT(a.tag) FROM allergeni a WHERE a.tag = 0 ) AS NumAllergeni," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "      (SELECT COUNT(a.tag) FROM allergeni a WHERE a.tag = 1) AS NumTag" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB)
	If cursorWrapper.RowCount > 0 Then
		cursorWrapper.Position = 0
		Dim vGetInt As Int = cursorWrapper.GetInt("NumAllergeni")
		Dim vGetInt2 As Int = cursorWrapper.GetInt("NumTag")
		Dim totemallergenstypeVarArr(vGetInt) As totemallergenstype
		Dim i As Int
		For i = 0 To totemallergenstypeVarArr.Length - 1
			'totemallergenstypeVarArr(i) = totemallergenstype
		Next
		Dim totemtagstypeVarArr(vGetInt2) As totemtagstype
		Dim i2 As Int
		For i2 = 0 To totemtagstypeVarArr.Length - 1
			'totemtagstypeVarArr(i2) = totemtagstype
		Next
		cursorWrapper = vSql1.ExecQuery("SELECT a.codice, a.tag, " & QUOTE & "All" & QUOTE & " || a.codice AS IdDescr,  a.descrizione," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione1," & QUOTE & QUOTE & ") as descrizione1,  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione2," & QUOTE & QUOTE & ") as descrizione2, " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione3," & QUOTE & QUOTE & ") as descrizione3,  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione4," & QUOTE & QUOTE & ") as descrizione4,  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione5," & QUOTE & QUOTE & ") as descrizione5" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "FROM allergeni a" & TAB & TAB & TAB & TAB & TAB & TAB & "  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "  LEFT JOIN anagraDescrizioni d ON d.codint = IdDescr" & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "ORDER BY a.codice" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB)
		If cursorWrapper.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper.RowCount - 1
			Dim i3 As Int = 0
			Dim i4 As Int = 0
			Dim i5 As Int
			For i5 = 0 To rowCount
				cursorWrapper.Position = i5
				If cursorWrapper.GetInt("tag") = 0 Then
					Dim totemallergenstypeVar As totemallergenstype
					totemallergenstypeVar.Code = cursorWrapper.GetString("codice")
					totemallergenstypeVar.ImageFileName = "allergeni" & totemallergenstypeVar.Code & ".png"
					Dim strArr() As String = Array(cursorWrapper.GetString("descrizione1"), cursorWrapper.GetString("descrizione2"), cursorWrapper.GetString("descrizione3"), cursorWrapper.GetString("descrizione4"), cursorWrapper.GetString("descrizione5"))
					totemallergenstypeVar.Name = strArr
					If totemallergenstypeVar.Name(0) = "" Then
						totemallergenstypeVar.Name(0) = cursorWrapper.GetString("descrizione")
					End If
					totemallergenstypeVarArr(i4) = totemallergenstypeVar
					i4 = i4 + 1
				Else If cursorWrapper.GetInt("tag") = 1 Then
					Dim totemtagstypeVar As totemtagstype
					totemtagstypeVar.Code = cursorWrapper.GetString("codice")
					totemtagstypeVar.ImageFileName = "tags" & totemtagstypeVar.Code & ".png"
					Dim strArr2() As String = Array(cursorWrapper.GetString("descrizione1"), cursorWrapper.GetString("descrizione2"), cursorWrapper.GetString("descrizione3"), cursorWrapper.GetString("descrizione4"), cursorWrapper.GetString("descrizione5"))
					totemtagstypeVar.Name = strArr2
					If totemtagstypeVar.Name(0) = "" Then
						totemtagstypeVar.Name(0) = cursorWrapper.GetString("descrizione")
					End If
					totemtagstypeVarArr(i3) = totemtagstypeVar
					i3 = i3 + 1
				End If
			Next
			totemdata.vv6 = totemallergenstypeVarArr
			totemdata.vv7 = totemtagstypeVarArr
		End If
	End If
	cursorWrapper.Close
End Sub

Sub Sub008
	Dim totemcategorytypeVarArr() As totemcategorytype = Null
	Dim cursorWrapper As Cursor = vSql1.ExecQuery("SELECT DISTINCT r.codice, r.descrizione, " & QUOTE & "Rep" & QUOTE & " || r.codice AS IdDescr," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione1," & QUOTE & QUOTE & ") as descrizione1,  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione2," & QUOTE & QUOTE & ") as descrizione2, " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione3," & QUOTE & QUOTE & ") as descrizione3,  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione4," & QUOTE & QUOTE & ") as descrizione4,  " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "IFNULL(d.descrizione5," & QUOTE & QUOTE & ") as descrizione5" & TAB & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "FROM reparti r" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " INNER JOIN anagra a ON a.reparto = r.codice" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & " LEFT JOIN anagraDescrizioni d ON d.codint = IdDescr" & TAB & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "WHERE a.reparto > 0" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "  AND a.flgusointerno = 0 " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "  AND a.bvar = 0" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "ORDER BY r.codice" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB)
	If cursorWrapper.RowCount > 0 Then
		Dim totemcategorytypeVarArr(cursorWrapper.RowCount) As totemcategorytype
		Dim i As Int
		For i = 0 To totemcategorytypeVarArr.Length - 1
			'totemcategorytypeVarArr(i) = totemcategorytype
		Next
		Dim rowCount As Int = cursorWrapper.RowCount - 1
		Dim i2 As Int
		For i2 = 0 To rowCount
			cursorWrapper.Position = i2
			Dim totemcategorytypeVar As totemcategorytype
			totemcategorytypeVar.Initialize
			totemcategorytypeVar.Code = cursorWrapper.GetString("codice")
			Dim strArr() As String = Array(cursorWrapper.GetString("descrizione1"), cursorWrapper.GetString("descrizione2"), cursorWrapper.GetString("descrizione3"), cursorWrapper.GetString("descrizione4"), cursorWrapper.GetString("descrizione5"))
			totemcategorytypeVar.NameCategory = strArr
			If totemcategorytypeVar.NameCategory(0) = "" Then
				totemcategorytypeVar.NameCategory(0) = cursorWrapper.GetString("descrizione")
			End If
			totemcategorytypeVar.ImageFileName = "reparto" & totemcategorytypeVar.Code & ".png"
			totemcategorytypeVar.Products = Sub004(totemcategorytypeVar.Code)
			totemcategorytypeVarArr(i2) = totemcategorytypeVar
		Next
	End If
	cursorWrapper.Close
	totemdata.vv4 = totemcategorytypeVarArr
	Sub001()
End Sub

Sub Initialize(sql As SQL)
	vSql1 = sql
	totemdata.vtotemorderheadtype1.Initialize
	totemdata.vtotemorderheadtype1.RowsList.Initialize
	Sub007()
	Sub008()
End Sub

