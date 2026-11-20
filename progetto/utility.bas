B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
Sub Process_Globals
End Sub

Sub v5(totemcategorytypeVarArr As totemcategorytype(), totemcategorytypeVarArr2 As totemcategorytype()) As totemcategorytype()
	Dim totemcategorytypeVarArr3(totemcategorytypeVarArr.Length + totemcategorytypeVarArr2.Length) As totemcategorytype
	Dim i As Int
	For i = 0 To totemcategorytypeVarArr3.Length - 1
		'totemcategorytypeVarArr3(i) = totemcategorytype
	Next
	If totemcategorytypeVarArr.Length > 0 Then
		Dim length3 As Int = totemcategorytypeVarArr.Length - 1
		Dim i2 As Int
		For i2 = 0 To length3
			totemcategorytypeVarArr3(i2) = totemcategorytypeVarArr(i2)
		Next
	End If
	If totemcategorytypeVarArr2.Length > 0 Then
		Dim length4 As Int = totemcategorytypeVarArr2.Length - 1
		Dim i3 As Int
		For i3 = 0 To length4
			totemcategorytypeVarArr3(i3 + totemcategorytypeVarArr.Length) = totemcategorytypeVarArr2(i3)
		Next
	End If
	Return totemcategorytypeVarArr3
End Sub

Sub v6(i As Int, i2 As Int, str As String) As Bitmap
	Dim length As Float
	Dim bitmapWrapper As Bitmap
	bitmapWrapper.InitializeMutable(i, i2)
	Dim canvasWrapper As Canvas
	canvasWrapper.Initialize2(bitmapWrapper)
	If str.Length > 20 Then
		length = str.Length - 10
	Else If str.Length > 10 Then
		length = str.Length - 5
	Else
		length = str.Length - 1
	End If
	Dim f As Float = i / length
	canvasWrapper.DrawColor(-1)
	canvasWrapper.DrawText(str, i / 2, i2 / 2, Typeface.DEFAULT_BOLD, f, -16777216, "CENTER")
	Return canvasWrapper.Bitmap
End Sub

Sub v7(str As String, str2 As String, str3 As String, i As Int, i2 As Int) As ImageView
	Dim imageViewWrapper As ImageView
	imageViewWrapper.Initialize(str2)
	imageViewWrapper.Tag = str3
	If Not(str = Null) Then
		Try
			If str <> "" Then
				If totemdata.vtotemparamtype1.IsSimulation Then
					imageViewWrapper.Bitmap = LoadBitmapResize(File.DirAssets, str, i, i2, True)
				Else
					If File.Exists(totemdata.vtotemparamtype1.PathImages, str) Then
						imageViewWrapper.Bitmap = LoadBitmapResize(totemdata.vtotemparamtype1.PathImages, str, i, i2, True)
					Else
						imageViewWrapper.Bitmap = v6(i, i2, str)
					End If
				End If
			End If
		Catch
			If totemdata.vtotemparamtype1.IsSimulation Then
				Log("ExceGetExternalBitmap (Simulation): " & str & CRLF & "(" & LastException.Message & ")")
			Else
				Log("ExceGetExternalBitmap: " & totemdata.vtotemparamtype1.PathImages & "/" & str & CRLF & "(" & LastException.Message & ")")
			End If
		End Try
	End If
	Return imageViewWrapper
End Sub

Sub Sub001(totemproductvariationstypeVar As totemproductvariationstype) As Double
	If totemproductvariationstypeVar.FlgExceedingSelected Then
		Return totemproductvariationstypeVar.PriceExceeding
	End If
	If Not(totemproductvariationstypeVar.FlgSelected) Then
		Return 0
	End If
	Return totemproductvariationstypeVar.Price
End Sub

Sub v0(i As Int, totemmenulistproducttypeVar As totemmenulistproducttype) As Double
	Dim d As Double
	Dim d2 As Double = 0
	Dim d3 As Double = totemmenulistproducttypeVar.ProductMenu.Price
	If totemmenulistproducttypeVar.Products.Length > 0 Then
		Dim length As Int = totemmenulistproducttypeVar.Products.Length - 1
		Dim i2 As Int
		For i2 = 0 To length
			If Not(totemmenulistproducttypeVar.Products(i2).Variations = Null) And totemmenulistproducttypeVar.Products(i2).Variations.Length > 0 Then
				Dim length2 As Int = totemmenulistproducttypeVar.Products(i2).Variations.Length - 1
				Dim i3 As Int = 0
				Do While i3 <= length2
					Dim vTmp As Double = Sub001(totemmenulistproducttypeVar.Products(i2).Variations(i3)) + d2
					i3 = i3 + 1
					d2 = vTmp
				Loop
			End If
		Next
		d = (d2 + d3) * i
	Else
		d = d3
	End If
	Return vv2(d)
End Sub

Sub vv1(i As Int, totemproducttypeVar As totemproducttype, d As Double) As Double
	Dim d2 As Double = 0
	If totemproducttypeVar.Variations = Null Or totemproducttypeVar.Variations.Length = 0 Then
		d2 = totemproducttypeVar.Price * i - d
	Else If totemproducttypeVar.Variations.Length > 0 Then
		Dim length As Int = totemproducttypeVar.Variations.Length - 1
		Dim d3 As Double = 0
		Dim i2 As Int
		For i2 = 0 To length
			d3 = d3 + Sub001(totemproducttypeVar.Variations(i2))
		Next
		d2 = (totemproducttypeVar.Price + d3) * i - d
	End If
	Return vv2(d2)
End Sub

Sub vv2(d As Double) As Double
	Return Round2(d, 2)
End Sub

Sub vv3(d As Double) As String
	Return NumberFormat2(d, 1, 2, 2, False)
End Sub

