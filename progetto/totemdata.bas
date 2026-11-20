B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
Sub Process_Globals
	Type totemcategorytype(Code As String, ImageFileName As String, NameCategory() As String, Products() As totemproducttype)
	Type totemproducttype(Allergens() As totemallergenstype, Code As String, Description() As String, ImageFileName As String, IsDiscounted As Boolean, Name As String, Price As Double, Tags() As totemtagstype, Variations() As totemproductvariationstype)
	Type totemproductvariationstype(Code As String, Description() As String, FlgExceedingSelected As Boolean, FlgSelected As Boolean, Name As String, Price As Double, PriceExceeding As Double)
	Type totemproductmenutype(Code As String, Description() As String, ImageFileName As String, IsDiscounted As Boolean, Name As String, Price As Double)
	Type totemmenulistproducttype(ProductMenu As totemproductmenutype, Products() As totemproducttype)
	Type totemallergenstype(Code As String, ImageFileName As String, Name() As String)
	Type totemtagstype(Code As String, ImageFileName As String, Name() As String)
	Type totemorderheadtype(ConsumptionLocation As totemconsumptiontype, PaymentConditions As totempaymentconditionstype, RowsList As List)
	Type totemorderrowtype(Product As totemproducttype, ProductListMenu As totemmenulistproducttype, Quantity As Int, Sconto As Double, SubTotal As Double)
	Type totempaymentconditionstype(Description() As String, IdCode As Int)
	Type totemconsumptiontype(Description() As String, IdCode As Int)
	Type totemparamtype(IsSimulation As Boolean, PathImages As String, ShowProductCode As Boolean)
	Public vv4(0) As totemcategorytype
	Public vv5(0) As totemmenulistproducttype
	Public vv6(0) As totemallergenstype
	Public vv7(0) As totemtagstype
	Public vv0(2) As totempaymentconditionstype
	Public vtotemconsumptiontypeArr1(2) As totemconsumptiontype
	Public vtotemparamtype1 As totemparamtype
	Public vtotemorderheadtype1 As totemorderheadtype
End Sub

Sub Sub001(totemallergenstypeVarArr As totemallergenstype()) As totemallergenstype()
	Dim i As Int = 0
	Dim totemallergenstypeVarArr2(0) As totemallergenstype
	Dim i2 As Int
	For i2 = 0 To totemallergenstypeVarArr2.Length - 1
		'totemallergenstypeVarArr2(i2) = totemallergenstype
	Next
	If Not(totemallergenstypeVarArr = Null) Then
		If totemallergenstypeVarArr.Length > 0 Then
			Dim totemallergenstypeVarArr3(totemallergenstypeVarArr.Length) As totemallergenstype
			Dim i3 As Int
			For i3 = 0 To totemallergenstypeVarArr3.Length - 1
				'totemallergenstypeVarArr3(i3) = totemallergenstype
			Next
			Dim length3 As Int = totemallergenstypeVarArr.Length - 1
			Do While i <= length3
				Dim totemallergenstypeVar As totemallergenstype
				totemallergenstypeVar.Initialize
				totemallergenstypeVar.Name = totemallergenstypeVarArr(i).Name
				totemallergenstypeVar.ImageFileName = totemallergenstypeVarArr(i).ImageFileName
				totemallergenstypeVar.Code = totemallergenstypeVarArr(i).Code
				totemallergenstypeVarArr3(i) = totemallergenstypeVar
				i = i + 1
			Loop
			Return totemallergenstypeVarArr3
		End If
		Dim totemallergenstypeVarArr4(0) As totemallergenstype
		Do While i < totemallergenstypeVarArr4.Length
			'totemallergenstypeVarArr4(i) = totemallergenstype
			i = i + 1
		Loop
		Return totemallergenstypeVarArr4
	End If
	Return Null
End Sub

Sub Sub002(totemproducttypeVar As totemproducttype) As totemproducttype
	Dim totemproducttypeVar2 As totemproducttype
	totemproducttypeVar2.Initialize
	totemproducttypeVar2.Code = totemproducttypeVar.Code
	totemproducttypeVar2.Name = totemproducttypeVar.Name
	totemproducttypeVar2.Description = totemproducttypeVar.Description
	totemproducttypeVar2.ImageFileName = totemproducttypeVar.ImageFileName
	totemproducttypeVar2.IsDiscounted = totemproducttypeVar.IsDiscounted
	totemproducttypeVar2.Price = totemproducttypeVar.Price
	totemproducttypeVar2.Variations = Sub005(totemproducttypeVar.Variations)
	totemproducttypeVar2.Allergens = Sub001(totemproducttypeVar.Allergens)
	totemproducttypeVar2.Tags = Sub004(totemproducttypeVar.Tags)
	Return totemproducttypeVar2
End Sub

Sub Sub003(totemmenulistproducttypeVar As totemmenulistproducttype) As totemmenulistproducttype
	Dim totemproducttypeVarArr As totemproducttype()
	Dim i As Int = 0
	Dim totemmenulistproducttypeVar2 As totemmenulistproducttype
	totemmenulistproducttypeVar2.Initialize
	Dim totemproductmenutypeVar As totemproductmenutype
	totemproductmenutypeVar.Initialize
	totemproductmenutypeVar.Code = totemmenulistproducttypeVar.ProductMenu.Code
	totemproductmenutypeVar.Name = totemmenulistproducttypeVar.ProductMenu.Name
	totemproductmenutypeVar.Description = totemmenulistproducttypeVar.ProductMenu.Description
	totemproductmenutypeVar.ImageFileName = totemmenulistproducttypeVar.ProductMenu.ImageFileName
	totemproductmenutypeVar.IsDiscounted = totemmenulistproducttypeVar.ProductMenu.IsDiscounted
	totemproductmenutypeVar.Price = totemmenulistproducttypeVar.ProductMenu.Price
	totemmenulistproducttypeVar2.ProductMenu = totemproductmenutypeVar
	Dim totemproducttypeVarArr2(0) As totemproducttype
	Dim i2 As Int
	For i2 = 0 To totemproducttypeVarArr2.Length - 1
		'totemproducttypeVarArr2(i2) = totemproducttype
	Next
	If Not(totemmenulistproducttypeVar.Products = Null) Then
		If totemmenulistproducttypeVar.Products.Length > 0 Then
			Dim totemproducttypeVarArr(totemmenulistproducttypeVar.Products.Length) As totemproducttype
			Dim i3 As Int
			For i3 = 0 To totemproducttypeVarArr.Length - 1
				'totemproducttypeVarArr(i3) = totemproducttype
			Next
			Dim length3 As Int = totemproducttypeVarArr.Length - 1
			Do While i <= length3
				totemproducttypeVarArr(i) = Sub002(totemmenulistproducttypeVar.Products(i))
				i = i + 1
			Loop
		Else
			Dim totemproducttypeVarArr(0) As totemproducttype
			Do While i < totemproducttypeVarArr.Length
				'totemproducttypeVarArr(i) = totemproducttype
				i = i + 1
			Loop
		End If
	Else
		totemproducttypeVarArr = Null
	End If
	totemmenulistproducttypeVar2.Products = totemproducttypeVarArr
	Return totemmenulistproducttypeVar2
End Sub

Sub Sub004(totemtagstypeVarArr As totemtagstype()) As totemtagstype()
	Dim i As Int = 0
	Dim totemtagstypeVarArr2(0) As totemtagstype
	Dim i2 As Int
	For i2 = 0 To totemtagstypeVarArr2.Length - 1
		'totemtagstypeVarArr2(i2) = totemtagstype
	Next
	If Not(totemtagstypeVarArr = Null) Then
		If totemtagstypeVarArr.Length > 0 Then
			Dim totemtagstypeVarArr3(totemtagstypeVarArr.Length) As totemtagstype
			Dim i3 As Int
			For i3 = 0 To totemtagstypeVarArr3.Length - 1
				'totemtagstypeVarArr3(i3) = totemtagstype
			Next
			Dim length3 As Int = totemtagstypeVarArr.Length - 1
			Do While i <= length3
				Dim totemtagstypeVar As totemtagstype
				totemtagstypeVar.Initialize
				totemtagstypeVar.Name = totemtagstypeVarArr(i).Name
				totemtagstypeVar.ImageFileName = totemtagstypeVarArr(i).ImageFileName
				totemtagstypeVar.Code = totemtagstypeVarArr(i).Code
				totemtagstypeVarArr3(i) = totemtagstypeVar
				i = i + 1
			Loop
			Return totemtagstypeVarArr3
		End If
		Dim totemtagstypeVarArr4(0) As totemtagstype
		Do While i < totemtagstypeVarArr4.Length
			'totemtagstypeVarArr4(i) = totemtagstype
			i = i + 1
		Loop
		Return totemtagstypeVarArr4
	End If
	Return Null
End Sub

Sub Sub005(totemproductvariationstypeVarArr As totemproductvariationstype()) As totemproductvariationstype()
	Dim totemproductvariationstypeVarArr2(0) As totemproductvariationstype
	Dim i As Int
	For i = 0 To totemproductvariationstypeVarArr2.Length - 1
		'totemproductvariationstypeVarArr2(i) = totemproductvariationstype
	Next
	If Not(totemproductvariationstypeVarArr = Null) Then
		If totemproductvariationstypeVarArr.Length > 0 Then
			Dim totemproductvariationstypeVarArr3(totemproductvariationstypeVarArr.Length) As totemproductvariationstype
			Dim i2 As Int
			For i2 = 0 To totemproductvariationstypeVarArr3.Length - 1
				'totemproductvariationstypeVarArr3(i2) = totemproductvariationstype
			Next
			Dim length3 As Int = totemproductvariationstypeVarArr.Length - 1
			Dim i3 As Int
			For i3 = 0 To length3
				Dim totemproductvariationstypeVar As totemproductvariationstype
				totemproductvariationstypeVar.Initialize
				totemproductvariationstypeVar.Code = totemproductvariationstypeVarArr(i3).Code
				totemproductvariationstypeVar.Name = totemproductvariationstypeVarArr(i3).Name
				Dim strArr() As String = Array(totemproductvariationstypeVarArr(i3).Description(0), totemproductvariationstypeVarArr(i3).Description(1), totemproductvariationstypeVarArr(i3).Description(2), totemproductvariationstypeVarArr(i3).Description(3), totemproductvariationstypeVarArr(i3).Description(4))
				totemproductvariationstypeVar.Description = strArr
				totemproductvariationstypeVar.Price = totemproductvariationstypeVarArr(i3).Price
				totemproductvariationstypeVar.PriceExceeding = totemproductvariationstypeVarArr(i3).PriceExceeding
				totemproductvariationstypeVar.FlgSelected = totemproductvariationstypeVarArr(i3).FlgSelected
				totemproductvariationstypeVar.FlgExceedingSelected = totemproductvariationstypeVarArr(i3).FlgExceedingSelected
				totemproductvariationstypeVarArr3(i3) = totemproductvariationstypeVar
			Next
			Return totemproductvariationstypeVarArr3
		End If
		Dim totemproductvariationstypeVarArr4(0) As totemproductvariationstype
		Dim i4 As Int
		For i4 = 0 To totemproductvariationstypeVarArr4.Length - 1
			'totemproductvariationstypeVarArr4(i4) = totemproductvariationstype
		Next
		Return totemproductvariationstypeVarArr4
	End If
	Return Null
End Sub

Sub Sub006(list As List) As totemproducttype()
	If list.Size > 0 Then
		Dim totemproducttypeVarArr(list.Size) As totemproducttype
		Dim i As Int
		For i = 0 To totemproducttypeVarArr.Length - 1
			'totemproducttypeVarArr(i) = totemproducttype
		Next
		Dim size As Int = list.Size - 1
		Dim i2 As Int
		For i2 = 0 To size
			totemproducttypeVarArr(i2) = list.Get(i2)
		Next
		Return totemproducttypeVarArr
	End If
	Dim totemproducttypeVarArr2(0) As totemproducttype
	Dim i3 As Int
	For i3 = 0 To totemproducttypeVarArr2.Length - 1
		'totemproducttypeVarArr2(i3) = totemproducttype
	Next
	Return totemproducttypeVarArr2
End Sub

Sub Sub007
	Dim totemconsumptiontypeVar As totemconsumptiontype
	totemconsumptiontypeVar.IdCode = 1
	totemconsumptiontypeVar.Description = language.Sub001(10)
	vtotemconsumptiontypeArr1(0) = totemconsumptiontypeVar
	Dim totemconsumptiontypeVar2 As totemconsumptiontype
	totemconsumptiontypeVar2.IdCode = 2
	totemconsumptiontypeVar2.Description = language.Sub001(11)
	vtotemconsumptiontypeArr1(1) = totemconsumptiontypeVar2
End Sub

Sub Sub008(z As Boolean, totemtagstypeVar As totemtagstype) As List
	Dim list As List
	list.Initialize
	If vv4.Length > 0 Then
		Dim length As Int = vv4.Length - 1
		Dim i As Int
		For i = 0 To length
			If Not(vv4(i).Products = Null) And vv4(i).Products.Length > 0 Then
				Dim length2 As Int = vv4(i).Products.Length - 1
				Dim i2 As Int
				For i2 = 0 To length2
					If z And vv4(i).Products(i2).IsDiscounted Then
						list.Add(vv4(i).Products(i2))
					End If
					If Not(totemtagstypeVar = Null) And Not(vv4(i).Products(i2).Tags = Null) And vv4(i).Products(i2).Tags.Length > 0 Then
						Dim length3 As Int = vv4(i).Products(i2).Tags.Length - 1
						Dim i3 As Int
						For i3 = 0 To length3
							If vv4(i).Products(i2).Tags(i3) = totemtagstypeVar And list.IndexOf(vv4(i).Products(i2)) = -1 Then
								list.Add(vv4(i).Products(i2))
							End If
						Next
					End If
				Next
			End If
		Next
	End If
	Return list
End Sub

Sub Sub009
	Dim totempaymentconditionstypeVar As totempaymentconditionstype
	totempaymentconditionstypeVar.IdCode = 1
	totempaymentconditionstypeVar.Description = language.Sub001(8)
	vv0(0) = totempaymentconditionstypeVar
	Dim totempaymentconditionstypeVar2 As totempaymentconditionstype
	totempaymentconditionstypeVar2.IdCode = 2
	totempaymentconditionstypeVar2.Description = language.Sub001(9)
	vv0(1) = totempaymentconditionstypeVar2
End Sub

Sub Sub010(totemtagstypeVar As totemtagstype) As totemproducttype()
	Return Sub006(Sub008(False, totemtagstypeVar))
End Sub

Sub Sub011 As totemproducttype()
	Return Sub006(Sub008(True, Null))
End Sub

Sub Sub012(totemmenulistproducttypeVar As totemmenulistproducttype, totemmenulistproducttypeVar2 As totemmenulistproducttype) As Boolean
	If totemmenulistproducttypeVar.ProductMenu.Code = totemmenulistproducttypeVar2.ProductMenu.Code And totemmenulistproducttypeVar.Products.Length = totemmenulistproducttypeVar2.Products.Length And totemmenulistproducttypeVar.Products.Length > 0 Then
		Dim z As Boolean = True
		Dim i As Int
		i = 0
		Do While z And i < totemmenulistproducttypeVar.Products.Length
			z = Sub013(totemmenulistproducttypeVar.Products(i), totemmenulistproducttypeVar2.Products(i))
			i = i + 1
		Loop
		If z Then
			Return True
		End If
	End If
	Return False
End Sub

Sub Sub013(totemproducttypeVar As totemproducttype, totemproducttypeVar2 As totemproducttype) As Boolean
	If totemproducttypeVar.Code <> totemproducttypeVar2.Code Then
		Return False
	End If
	If Not(totemproducttypeVar.Variations = Null) And Not(totemproducttypeVar2.Variations = Null) And totemproducttypeVar.Variations.Length = totemproducttypeVar2.Variations.Length And totemproducttypeVar2.Variations.Length > 0 Then
		Return Sub014(totemproducttypeVar.Variations, totemproducttypeVar2.Variations)
	End If
	Return True
End Sub

Sub Sub014(totemproductvariationstypeVarArr As totemproductvariationstype(), totemproductvariationstypeVarArr2 As totemproductvariationstype()) As Boolean
	If totemproductvariationstypeVarArr.Length <> totemproductvariationstypeVarArr2.Length Or totemproductvariationstypeVarArr.Length <= 0 Then
		Return False
	End If
	Dim i As Int = 0
	Dim z As Boolean = True
	Do While i < totemproductvariationstypeVarArr.Length And z
		Dim i2 As Int = 0
		Do While True
			If i2 >= totemproductvariationstypeVarArr2.Length Then
				z = False
				Exit
			End If
			If totemproductvariationstypeVarArr(i).Code = totemproductvariationstypeVarArr2(i2).Code And totemproductvariationstypeVarArr(i).FlgSelected = totemproductvariationstypeVarArr2(i2).FlgSelected And totemproductvariationstypeVarArr(i).FlgExceedingSelected = totemproductvariationstypeVarArr2(i2).FlgExceedingSelected Then
				z = True
				Exit
			End If
			i2 = i2 + 1
		Loop
		i = i + 1
	Loop
	If i = totemproductvariationstypeVarArr.Length And z Then
		Return z
	End If
	Return False
End Sub

Sub Sub015
	Sub009()
	Sub007()
End Sub

