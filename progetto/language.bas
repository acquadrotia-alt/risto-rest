B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=13.1
@EndOfDesignText@
Sub Process_Globals
	Type languageobject(Key As Int, Obj As Object)
	Type languageactivetype(Code As String, Id As Int)
	Public vInt1 As Int = 1
	Public vStringArr1 As String() = Array As String("it", "uk", "fr", "de", "es")
	Public vStringArr2 As String() = Array As String("Aggiungi all’ordine", "Esagerato", "Conferma Ordine", "Cancella Ordine", "Info Prodotto", "Chiudi Info", "Chiudi carrello della spesa", "Totale", "Contanti", "Carta Credito / Bancomat", "Consumo qui", "Asporto", "Rimuovi", "Indietro")
	Public vStringArr3 As String() = Array As String("Add to Order", "Exceeding", "Confirm Order", "Cancel Order", "Info Product", "Close Info", "Close shopping cart", "Total", "Cash", "Credit Card / Bancomat", "Eat here", "Take away", "Remove", "Back")
	Public vStringArr4 As String() = Array As String("Ajouter à la commande", "Dépassement", "Confirmer la commande", "Annuler la commande", "Informations sur le produit", "Fermer les informations", "Fermer le panier", "Le total", "Espèces", "Carte de crédit / Bancomat", "Mange ici", "Emporter", "Supprimer", "Arrière")
	Public vStringArr5 As String() = Array As String("Zur Bestellung hinzufügen", "Überschreiten", "Bestellung bestätigen", "Bestellung stornieren", "Info produkt", "Info schließen", "Warenkorb schließen", "Gesamt", "Kasse", "Kreditkarte / Bancomat", "Iss hier", "Wegbringen", "Entfernen", "Zurück")
	Public vStringArr6 As String() = Array As String("Agregar a la orden", "Excesivo", "Confirmar Orden", "Cancelar Orden", "Producto de información", "Cerrar información", "Cerrar carrito de compras", "Total", "Dinero", "Tarjeta de crédito / Bancomat", "Coma aqui", "Quitar", "Eliminar", "Espalda")
End Sub

Sub Sub001(i As Int) As String()
	Dim strArr(5) As String
	Dim length As Int = strArr.Length - 1
	Dim i2 As Int
	For i2 = 0 To length
		strArr(i2) = Sub005(i2 + 1, i)
	Next
	Return strArr
End Sub

Sub Sub002(i As Int) As String
	Return vStringArr1(i - 1)
End Sub

Sub Sub003 As String
	Return vStringArr1(vInt1 - 1)
End Sub

Sub Sub004 As String
	Return vInt1 - 1
End Sub

Sub Sub005(i As Int, i2 As Int) As String
	Select i
		Case 1
			Return vStringArr2(i2)
		Case 2
			Return vStringArr3(i2)
		Case 3
			Return vStringArr4(i2)
		Case 4
			Return vStringArr5(i2)
		Case 5
			Return vStringArr6(i2)
		Case Else
			Return ""
	End Select
End Sub

Sub Sub006(i As Int) As String
	Return Sub005(vInt1, i)
End Sub

Sub Sub007(i As Int)
	vInt1 = i
End Sub

Sub Sub008(list As List, i As Int)
	If list.Size > 0 Then
		Dim size As Int = list.Size - 1
		Dim i2 As Int
		For i2 = 0 To size
			list.Get(i2).Text = Sub005(vInt1, i)
		Next
		Return
	End If
End Sub

