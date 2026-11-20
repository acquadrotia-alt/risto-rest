B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vInt1 As Int
End Sub

Sub Sub001(i As Int, str As String, strArr As String()) As totemallergenstype
	Dim totemallergenstypeVar As totemallergenstype
	totemallergenstypeVar.Code = i
	totemallergenstypeVar.ImageFileName = str
	totemallergenstypeVar.Name = strArr
	Return totemallergenstypeVar
End Sub

Sub Sub002(i As Int, str As String, strArr As String()) As totemtagstype
	Dim totemtagstypeVar As totemtagstype
	totemtagstypeVar.Code = i
	totemtagstypeVar.ImageFileName = str
	totemtagstypeVar.Name = strArr
	Return totemtagstypeVar
End Sub

Sub Sub003
	Dim totemcategorytypeVarArr(1) As totemcategorytype
	Dim i As Int
	For i = 0 To totemcategorytypeVarArr.Length - 1
		'totemcategorytypeVarArr(i) = totemcategorytype
	Next
	totemcategorytypeVarArr(0).Code = "10"
	totemcategorytypeVarArr(0).NameCategory = Array As String("Offerte Risparmio", "Savings Offers", "Offres d'épargne", "Sparangebote", "Ofertas de ahorro")
	totemcategorytypeVarArr(0).ImageFileName = "simulator_category_savings_offers.png"
	Dim totemcategorytypeVar As totemcategorytype = totemcategorytypeVarArr(0)
	totemcategorytypeVar.Products = totemdata.Sub011
	totemdata.vv4 = Utility.v5(totemdata.vv4, totemcategorytypeVarArr)
	If totemdata.vv7.Length > 0 Then
		Dim totemcategorytypeVarArr2(totemdata.vv7.Length) As totemcategorytype
		Dim i2 As Int
		For i2 = 0 To totemcategorytypeVarArr2.Length - 1
			'totemcategorytypeVarArr2(i2) = totemcategorytype
		Next
		Dim length3 As Int = totemdata.vv7.Length - 1
		Dim i3 As Int
		For i3 = 0 To length3
			Dim totemcategorytypeVar2 As totemcategorytype
			totemcategorytypeVar2.Code = totemdata.vv7(i3).Code
			Dim strArr() As String = Array(totemdata.vv7(i3).Name(0), totemdata.vv7(i3).Name(1), totemdata.vv7(i3).Name(2), totemdata.vv7(i3).Name(3), totemdata.vv7(i3).Name(4))
			totemcategorytypeVar2.NameCategory = strArr
			totemcategorytypeVar2.ImageFileName = totemdata.vv7(i3).ImageFileName
			totemcategorytypeVar2.Products = totemdata.Sub010(totemdata.vv7(i3))
			totemcategorytypeVarArr2(i3) = totemcategorytypeVar2
		Next
		totemdata.vv4 = Utility.v5(totemdata.vv4, totemcategorytypeVarArr2)
		Return
	End If
End Sub

Sub Sub004 As String
	vInt1 = vInt1 + 1
	Return vInt1
End Sub

Sub Sub005(str As String, i As Int, z As Boolean, z2 As Boolean) As totemproducttype()
	Dim totemproducttypeVarArr(i) As totemproducttype
	Dim i2 As Int
	For i2 = 0 To totemproducttypeVarArr.Length - 1
		'totemproducttypeVarArr(i2) = totemproducttype
	Next
	Dim i3 As Int = i - 1
	Dim i4 As Int
	For i4 = 0 To i3
		totemproducttypeVarArr(i4).Code = Sub004()
		totemproducttypeVarArr(i4).Name = str & " " & i4 + 1
		Dim strArr() As String = Array("Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipiscing", "elit")
		Dim strArr2() As String = Array('### r6.append(strArr(Rnd(2, 6))), '### r6.append(strArr(Rnd(3, 6))), '### r6.append(strArr(Rnd(1, 5))), '### r6.append(strArr(Rnd(3, 6))), '### r6.append(strArr(Rnd(2, 8))))
		totemproducttypeVarArr(i4).Description = strArr2
		Dim totemproducttypeVar As totemproducttype = totemproducttypeVarArr(i4)
		totemproducttypeVar.ImageFileName = "simulator_" & str & NumberFormat(i4 + 1, 2, 0) & ".png"
		totemproducttypeVarArr(i4).Price = Sub007(1, 18)
		If Rnd(0, 2) = 0 Then
			Dim totemproducttypeVar2 As totemproducttype = totemproducttypeVarArr(i4)
			totemproducttypeVar2.IsDiscounted = False
		Else
			Dim totemproducttypeVar3 As totemproducttype = totemproducttypeVarArr(i4)
			totemproducttypeVar3.IsDiscounted = True
		End If
		If Not(z) Then
			If z2 Then
				totemproducttypeVarArr(i4).Variations = Sub009(totemproducttypeVarArr(i4).Name)
			Else
				Dim totemproducttypeVar4 As totemproducttype = totemproducttypeVarArr(i4)
				totemproducttypeVar4.Variations = Null
			End If
			totemproducttypeVarArr(i4).Allergens = Sub006()
			totemproducttypeVarArr(i4).Tags = Sub008()
		End If
	Next
	Return totemproducttypeVarArr
End Sub

Sub Sub006 As totemallergenstype()
	Dim vRnd As Int = Rnd(1, 6)
	Dim list As List
	list.Initialize
	Dim totemallergenstypeVarArr(vRnd) As totemallergenstype
	Dim i As Int
	For i = 0 To totemallergenstypeVarArr.Length - 1
		'totemallergenstypeVarArr(i) = totemallergenstype
	Next
	Do While list.Size < vRnd
		Dim vRnd2 As Int = Rnd(0, totemdata.vv7.Length)
		If list.IndexOf(vRnd2) = -1 Then
			list.Add(vRnd2)
			Dim size As Int = list.Size - 1
			totemallergenstypeVarArr(size) = totemdata.vv6(vRnd2)
		End If
	Loop
	Return totemallergenstypeVarArr
End Sub

Sub Sub007(i As Int, i2 As Int) As Double
	Dim vRnd As Int = Rnd(0, 100)
	Dim vRnd2 As Double = vRnd / 100 + Rnd(i, i2 + 1)
	Return Round2(vRnd2, 2)
End Sub

Sub Sub008 As totemtagstype()
	Dim vRnd As Int = Rnd(1, 6)
	Dim list As List
	list.Initialize
	Dim totemtagstypeVarArr(vRnd) As totemtagstype
	Dim i As Int
	For i = 0 To totemtagstypeVarArr.Length - 1
		'totemtagstypeVarArr(i) = totemtagstype
	Next
	Do While list.Size < vRnd
		Dim vRnd2 As Int = Rnd(0, totemdata.vv7.Length)
		If list.IndexOf(vRnd2) = -1 Then
			list.Add(vRnd2)
			Dim size As Int = list.Size - 1
			totemtagstypeVarArr(size) = totemdata.vv7(vRnd2)
		End If
	Loop
	Return totemtagstypeVarArr
End Sub

Sub Sub009(str As String) As totemproductvariationstype()
	Dim vRnd As Int = Rnd(1, 8)
	Dim totemproductvariationstypeVarArr(vRnd) As totemproductvariationstype
	Dim i As Int
	For i = 0 To totemproductvariationstypeVarArr.Length - 1
		'totemproductvariationstypeVarArr(i) = totemproductvariationstype
	Next
	Dim i2 As Int = vRnd - 1
	Dim i3 As Int
	For i3 = 0 To i2
		totemproductvariationstypeVarArr(i3).Code = Sub004()
		totemproductvariationstypeVarArr(i3).Name = "[" & str & "] Variations " & i3
		Dim strArr() As String = Array("it var", "uk var", "fr var", "de var", "es var")
		totemproductvariationstypeVarArr(i3).Description = strArr
		totemproductvariationstypeVarArr(i3).Price = Sub007(1, 5)
		Dim d As Double = totemproductvariationstypeVarArr(i3).Price * 0.25
		totemproductvariationstypeVarArr(i3).PriceExceeding = Round2(d + totemproductvariationstypeVarArr(i3).Price, 2)
	Next
	Return totemproductvariationstypeVarArr
End Sub

Sub Sub010
	Dim totemallergenstypeVarArr(14) As totemallergenstype
	Dim i As Int
	For i = 0 To totemallergenstypeVarArr.Length - 1
		'totemallergenstypeVarArr(i) = totemallergenstype
	Next
	totemallergenstypeVarArr(0) = Sub001(0, "simulator_allergens_00_cerals_containing_gluten.png", Array As String("Cereali contenenti glutine", "Cerals containing gluten", "Cereales contenant du gluten ", "Glutenhaltiges Getreide", "Cereales con Gluten"))
	totemallergenstypeVarArr(1) = Sub001(1, "simulator_allergens_01_crustaceans.png", Array As String("Crostacei", "Crustaceans", "Crustaces", "Krebstiere", "Crostaceos de Marisco"))
	totemallergenstypeVarArr(2) = Sub001(2, "simulator_allergens_02_eggs.png", Array As String("Uova e derivati", "Eggs", "Oeufs", "Eier", "Huveos"))
	totemallergenstypeVarArr(3) = Sub001(3, "simulator_allergens_03_fish.png", Array As String("Pesce", "Fish", "Poisson", "Fische", "Pescado"))
	totemallergenstypeVarArr(4) = Sub001(4, "simulator_allergens_04_peanuts.png", Array As String("Arachidi e derivati", "Peanuts", "Arachides", "Erdnusse", "Cacahuetes"))
	totemallergenstypeVarArr(5) = Sub001(5, "simulator_allergens_05_soyabeans.png", Array As String("Soia e derivati", "Soyabeans", "Soja", "Sojabohnen", "Soja"))
	totemallergenstypeVarArr(6) = Sub001(6, "simulator_allergens_06_milk.png", Array As String("Latte e derivati", "Milk", "Lait", "Milch", "Leche"))
	totemallergenstypeVarArr(7) = Sub001(7, "simulator_allergens_07_tree_nuts.png", Array As String("Frutta con guscio", "Tree nuts", "Shalenfruchte", "Frutos de Cascara"))
	totemallergenstypeVarArr(8) = Sub001(8, "simulator_allergens_08_celery.png", Array As String("Sedano", "Celery", "Fruits a coques", "Sellerie", "Apio"))
	totemallergenstypeVarArr(9) = Sub001(9, "simulator_allergens_09_mustard.png", Array As String("Senape", "Mustard", "Celeri", "Senf", "Mostaza"))
	totemallergenstypeVarArr(10) = Sub001(10, "simulator_allergens_10_sesame_seed.png", Array As String("Semi di Sesamo", "Sesame Seed", "Sesame", "Sesansamen", "Semillas de Sesamo"))
	totemallergenstypeVarArr(11) = Sub001(11, "simulator_allergens_11_sulphites.png", Array As String("Anidride solforosa e Solfiti", "Sulphites", "Sulfites", "Sulphite", "Dioxido de Axufre y Sulfitos "))
	totemallergenstypeVarArr(12) = Sub001(12, "simulator_allergens_12_lupin.png", Array As String("Lupini", "Lupin", "Lupin", "Lupinen", "Altramuces"))
	totemallergenstypeVarArr(13) = Sub001(13, "simulator_allergens_13_molluscs.png", Array As String("Molluschi", "Molluscs", "Mollosques", "Weichtiere", "Moluscos"))
	totemdata.vv6 = totemallergenstypeVarArr
End Sub

Sub Sub011
	Dim totemcategorytypeVarArr(5) As totemcategorytype
	Dim i As Int
	For i = 0 To totemcategorytypeVarArr.Length - 1
		'totemcategorytypeVarArr(i) = totemcategorytype
	Next
	totemcategorytypeVarArr(0).Code = "0"
	totemcategorytypeVarArr(0).NameCategory = Array As String("Menù", "Menu", "Menu", "Speisekarte", "Menú")
	totemcategorytypeVarArr(0).ImageFileName = "simulator_category_menu.png"
	totemcategorytypeVarArr(1).Code = "1"
	totemcategorytypeVarArr(1).NameCategory = Array As String("Hamburger", "Hamburger", "Hamburger", "Hamburger", "Hamburguesa")
	totemcategorytypeVarArr(1).ImageFileName = "simulator_category_hamburger.png"
	Dim totemcategorytypeVar As totemcategorytype = totemcategorytypeVarArr(1)
	totemcategorytypeVar.Products = Sub005("hamburger", 7, False, True)
	totemcategorytypeVarArr(2).Code = "2"
	totemcategorytypeVarArr(2).NameCategory = Array As String("Patatine fritte", "Chips", "French fries", "Chips", "Papas fritas")
	totemcategorytypeVarArr(2).ImageFileName = "simulator_category_chips.png"
	Dim totemcategorytypeVar2 As totemcategorytype = totemcategorytypeVarArr(2)
	totemcategorytypeVar2.Products = Sub005("chips", 2, False, False)
	totemcategorytypeVarArr(3).Code = "3"
	totemcategorytypeVarArr(3).NameCategory = Array As String("Bevande analcoliche", "Soft Drinks", "Boissons non alcoolisées", "Alkoholfreie Getränke", "Bebidas sin alcohol")
	totemcategorytypeVarArr(3).ImageFileName = "simulator_category_soft_drinks.png"
	Dim totemcategorytypeVar3 As totemcategorytype = totemcategorytypeVarArr(3)
	totemcategorytypeVar3.Products = Sub005("soft_drinks", 3, False, False)
	totemcategorytypeVarArr(4).Code = "4"
	totemcategorytypeVarArr(4).NameCategory = Array As String("Caffè", "Coffee", "Café", "Kaffee", "Café")
	totemcategorytypeVarArr(4).ImageFileName = "simulator_category_coffee.png"
	Dim totemcategorytypeVar4 As totemcategorytype = totemcategorytypeVarArr(4)
	totemcategorytypeVar4.Products = Sub005("coffee", 3, False, False)
	totemdata.vv4 = totemcategorytypeVarArr
	Sub003()
End Sub

Sub Initialize
	totemdata.vtotemorderheadtype1.Initialize
	totemdata.vtotemorderheadtype1.RowsList.Initialize
	Sub010()
	Sub013()
	Sub011()
	Sub012()
End Sub

Sub Sub012
	Dim totemmenulistproducttypeVarArr(7) As totemmenulistproducttype
	Dim length As Int = totemmenulistproducttypeVarArr.Length
	Dim i As Int
	For i = 0 To length - 1
		'totemmenulistproducttypeVarArr(i) = totemmenulistproducttype
	Next
	Dim i2 As Int
	For i2 = 1 To 7
		Dim totemproductmenutypeVar As totemproductmenutype
		totemproductmenutypeVar.Code = Sub004()
		totemproductmenutypeVar.Name = "Menu " & i2
		Dim strArr() As String = Array('### r9.append(language.Sub002(1)), '### r9.append(language.Sub002(2)), '### r9.append(language.Sub002(3)), '### r9.append(language.Sub002(4)), '### r9.append(language.Sub002(5)))
		totemproductmenutypeVar.Description = strArr
		totemproductmenutypeVar.Price = Sub007(20, 210)
		totemproductmenutypeVar.ImageFileName = "simulator_menu" & NumberFormat(i2, 2, 0) & ".png"
		If Rnd(0, 2) = 0 Then
			totemproductmenutypeVar.IsDiscounted = False
		Else
			totemproductmenutypeVar.IsDiscounted = True
		End If
		totemmenulistproducttypeVarArr(i2 - 1).ProductMenu = totemproductmenutypeVar
		Dim i3 As Int = IIf(Rnd(0, 2) = 1, 4, 3)
		Dim totemproducttypeVarArr(i3) As totemproducttype
		Dim i4 As Int
		For i4 = 0 To totemproducttypeVarArr.Length - 1
			'totemproducttypeVarArr(i4) = totemproducttype
		Next
		Dim i5 As Int
		For i5 = 1 To i3
			Dim vRnd As Int = Rnd(0, totemdata.vv4(i5).Products.Length)
			totemproducttypeVarArr(i5 - 1) = totemdata.vv4(i5).Products(vRnd)
		Next
		totemmenulistproducttypeVarArr(i2 - 1).Products = totemproducttypeVarArr
	Next
	totemdata.vv5 = totemmenulistproducttypeVarArr
End Sub

Sub Sub013
	Dim totemtagstypeVarArr(5) As totemtagstype
	Dim i As Int
	For i = 0 To totemtagstypeVarArr.Length - 1
		'totemtagstypeVarArr(i) = totemtagstype
	Next
	totemtagstypeVarArr(0) = Sub002(50, "simulator_tags_50.png", Array As String("Vegano", "Vegan", "Vegan", "Vegan", "Vegan"))
	totemtagstypeVarArr(1) = Sub002(51, "simulator_tags_51.png", Array As String("Vegetariano", "Vegetarian", "Vegeterien", "Vegtarier", "Vegetariano"))
	totemtagstypeVarArr(2) = Sub002(52, "simulator_tags_52.png", Array As String("Integrale", "Whole food", "Complete", "Vollkorn", "Integral"))
	totemtagstypeVarArr(3) = Sub002(53, "simulator_tags_53.png", Array As String("Decongelato", "Defrosted", "Decongele", "Aufgetaut", "Descongelado"))
	totemtagstypeVarArr(4) = Sub002(54, "simulator_tags_54.png", Array As String("Prodotto locale", "Local product", "Produit local", "Lokales produkt", "Producto local"))
	totemdata.vv7 = totemtagstypeVarArr
End Sub

