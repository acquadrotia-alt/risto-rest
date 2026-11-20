B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vXUI1 As XUI
	Public vXv1 As B4XView
	Public CustomListView1 As CustomListView
	Public vb4xdialog1 As b4xdialog
	Public SearchField As b4xfloattextfield
	Public vMap1 As Map
	Public vMap2 As Map
	Public vInt1 As Int
	Public vInt2 As Int
	Public max_limit As Int
	Public vInt3 As Int
	Public vLst1 As List
	Public vLst2 As List
	Public vStr1 As String
	Public vStr2 As String
	Public vIME1 As IME
	Public vBln1 As Boolean
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/b4xsearchtemplate.java, metodo m1… (riga 83).
Sub Sub001(list As List, str As String)
	Dim i As Int
	Dim vIsInitialized As Boolean = list.IsInitialized
	If Not(vIsInitialized) Then
		Return
	End If
	Dim size As Int = list.Size - 1
	Dim i2 As Int
	For i2 = 0 To size
		If CustomListView1._getsize >= vInt3 Then
			Return
		End If
		Dim vObjectToString As String = list.Get(i2)
		Dim indexOf As Int = vObjectToString.ToLowerCase.IndexOf(str)
		If indexOf <> -1 Then
			If CustomListView1._getsize = 0 And str.Length > 0 Then
				Dim z As Boolean = vBln1
				If Not(z) Then
					i = vInt2
					Dim cSBuilder As CSBuilder
					cSBuilder.Initialize.Append(vObjectToString.SubString2(0, indexOf)).Color(vInt1).Append(vObjectToString.SubString2(indexOf, str.Length + indexOf)).Pop
					cSBuilder.Append(vObjectToString.SubString(str.Length + indexOf))
					If vLst1.Size <= 0 Then
						Dim b4XViewWrapper As B4XView = vLst1.Get(vLst1.Size - 1)
						vLst1.RemoveAt(vLst1.Size - 1)
						b4XViewWrapper.GetView(0).Text = cSBuilder
						b4XViewWrapper.Color = i
						CustomListView1._add(b4XViewWrapper, vObjectToString)
					Else
						CustomListView1._addtextitem(cSBuilder, vObjectToString)
					End If
				End If
			End If
			i = CustomListView1.defaulttextbackgroundcolor
			Dim cSBuilder2 As CSBuilder
			cSBuilder2.Initialize.Append(vObjectToString.SubString2(0, indexOf)).Color(vInt1).Append(vObjectToString.SubString2(indexOf, str.Length + indexOf)).Pop
			cSBuilder2.Append(vObjectToString.SubString(str.Length + indexOf))
			If vLst1.Size <= 0 Then
			End If
		End If
	Next
	Dim size2 As Int = list.Size - 1
	Dim i3 As Int
	For i3 = 0 To size2
		If list.Get(i3).ToLowerCase.IndexOf(str) = -1 Then
		End If
	Next
End Sub

Sub CustomListView1_ItemClick(i As Int, obj As Object)
	If obj = "" Then
		Return
	End If
	vStr1 = obj
	Dim b4xdialogVar As b4xdialog = vb4xdialog1
	Dim xui As XUI = vXUI1
	b4xdialogVar.Sub002(-1)
End Sub

Sub dialogclosed(i As Int)
End Sub

Sub getpanel(b4xdialogVar As b4xdialog) As B4XView
	Return vXv1
End Sub

Sub Initialize
	Dim vDipToCurrent As Int
	Dim xui As XUI = vXUI1
	vXv1 = XUI.CreatePanel("mBase")
	Dim xui2 As XUI = vXUI1
	If Not(XUI.IsB4A) Then
		Dim xui3 As XUI = vXUI1
		If Not(XUI.IsB4i) Then
			vDipToCurrent = DipToCurrent(300)
			Dim b4XViewWrapper As B4XView = vXv1
			b4XViewWrapper.SetLayoutAnimated(0, 0, 0, DipToCurrent(300), vDipToCurrent)
			vXv1.LoadLayout("SearchTemplate")
			Dim b4XViewWrapper2 As B4XView = vXv1
			Dim xui4 As XUI = vXUI1
			b4XViewWrapper2.SetColorAndBorder(0, 0, 0, 0)
			Dim b4XViewWrapper3 As B4XView = CustomListView1.sv
			Dim xui5 As XUI = vXUI1
			b4XViewWrapper3.SetColorAndBorder(0, 0, 0, 0)
			CustomListView1.defaulttextbackgroundcolor = -11184811
			Dim xui6 As XUI = vXUI1
			CustomListView.defaulttextcolor = -1
			vLst1.Initialize
			vMap1.Initialize
			vMap2.Initialize
			vIME1.Initialize("")
			Dim javaObject As JavaObject = SearchField.getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1
			javaObject.RunMethod("setImeOptions", Array(Bit.Or(33554432, 6)))
			Return
		End If
	End If
	vDipToCurrent = DipToCurrent(220)
	Dim b4XViewWrapper4 As B4XView = vXv1
	b4XViewWrapper4.SetLayoutAnimated(0, 0, 0, DipToCurrent(300), vDipToCurrent)
	vXv1.LoadLayout("SearchTemplate")
	Dim b4XViewWrapper22 As B4XView = vXv1
	Dim xui42 As XUI = vXUI1
	b4XViewWrapper22.SetColorAndBorder(0, 0, 0, 0)
	Dim b4XViewWrapper32 As B4XView = CustomListView1.sv
	Dim xui52 As XUI = vXUI1
	b4XViewWrapper32.SetColorAndBorder(0, 0, 0, 0)
	CustomListView1.defaulttextbackgroundcolor = -11184811
	Dim xui62 As XUI = vXUI1
	CustomListView.defaulttextcolor = -1
	vLst1.Initialize
	vMap1.Initialize
	vMap2.Initialize
	vIME1.Initialize("")
	Dim javaObject2 As JavaObject = SearchField.getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1
	javaObject2.RunMethod("setImeOptions", Array(Bit.Or(33554432, 6)))
End Sub

Sub Sub002(i As Int, i2 As Int)
	vXv1.SetLayoutAnimated(0, 0, 0, i, i2)
	Dim asview As B4XView = CustomListView1._asview
	asview.SetLayoutAnimated(0, 0, asview.Top, i, i2 - asview.Top)
	CustomListView1._base_resize(i, asview.Height)
End Sub

Sub SearchField_EnterPressed
	If vBln1 Then
		vStr1 = vStr2
		Dim b4xdialogVar As b4xdialog = vb4xdialog1
		Dim xui As XUI = vXUI1
		b4xdialogVar.Sub002(-1)
		Return
	End If
	If CustomListView1._getsize > 0 And vStr2.Length > 0 Then
		customlistview1_itemclick(0, CustomListView1._getvalue(0))
		Return
	End If
End Sub

Sub SearchField_TextChanged(str As String, str2 As String)
	Sub005(str2, False)
End Sub

Sub Sub003(obj As Object)
	Dim objArr(0) As Object
	Dim i As Int
	For i = 0 To objArr.Length - 1
		objArr(i) = Null
	Next
	Dim objArr2() As Object = obj
	vMap1 = objArr2(0)
	vMap2 = objArr2(1)
	'vLst2 = List
	vLst2 = objArr2(2)
End Sub

Sub Sub004(list As List) As Object
	Dim map As Map
	Dim now As Long = DateTime.Now
	Dim map2 As Map
	map2.Initialize
	vMap1.Clear
	vMap2.Clear
	Dim size As Int = list.Size - 1
	Dim i As Int
	For i = 0 To size
		Dim lowerCase As String = list.Get(i).ToLowerCase
		map2.Clear
		Dim length As Int = lowerCase.Length
		Dim i2 As Int
		For i2 = 0 To length
			Dim i3 As Int = 1
			Do While True
				Dim i4 As Int = i3
				If i4 <= max_limit And i2 + i4 <= lowerCase.Length Then
					Dim substring As String = lowerCase.SubString2(i2, i2 + i4)
					Dim vContainsKey As Boolean = map2.ContainsKey(substring)
					If Not(vContainsKey) Then
						map2.Put(substring, "")
						If i2 = 0 Then
							map = vMap1
						Else
							map = vMap2
						End If
						Dim list2 As List = map.Get(substring)
						Dim vIsInitialized As Boolean = list2.IsInitialized
						If Not(vIsInitialized) Then
							list2.Initialize
							map.Put(substring, list2)
						End If
						list2.Add(list.Get(i))
					End If
					i3 = i4 + 1
				End If
			Loop
		Next
	Next
	Log("Index time: " & DateTime.Now - now & " ms (" & list.Size & " Items)")
	vLst2 = list
	Return Array(vMap1, vMap2, vLst2)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub show(dialog As b4xdialog)
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = -1
				vb4xdialog1 = dialog
				Dim b4xdialogVar As b4xdialog = vb4xdialog1
				Dim xui As XUI = vXUI1
				If Not(XUI.IsB4A) Then
					Dim xui2 As XUI = vXUI1
					If Not(XUI.IsB4i) Then
						z = False
						b4xdialogVar.vBln2 = z
						Dim asview As B4XView = CustomListView1._asview
						Dim xui3 As XUI = vXUI1
						asview.Color = 0
						Dim b4XViewWrapper As B4XView = CustomListView1.sv
						Dim xui4 As XUI = vXUI1
						b4XViewWrapper.Color = 0
						Dim b4XViewWrapper2 As B4XView = vXv1
						Dim xui5 As XUI = vXUI1
						b4XViewWrapper2.Color = 0
						Sleep(20)
						rsState = 1
						Continue
					End If
				End If
				z = True
				b4xdialogVar.vBln2 = z
				Dim asview2 As B4XView = CustomListView1._asview
				Dim xui32 As XUI = vXUI1
				asview2.Color = 0
				Dim b4XViewWrapper3 As B4XView = CustomListView1.sv
				Dim xui42 As XUI = vXUI1
				b4XViewWrapper3.Color = 0
				Dim b4XViewWrapper22 As B4XView = vXv1
				Dim xui52 As XUI = vXUI1
				b4XViewWrapper22.Color = 0
				Sleep(20)
				rsState = 1
				Continue
			Case 1
				rsState = -1
				Sub005("", True)
				CustomListView1._jumptoitem(0)
				SearchField.setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv0("")
				SearchField.getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1.RequestFocus
				vIME1.ShowKeyboard(SearchField.getvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv1)
				Continue
		End Select
	Loop
End Sub

Sub Sub005(str As String, z As Boolean)
	If str = vStr2 Then
		If Not(z) Then
			Return
		End If
	End If
	vStr2 = str
	Dim xui As XUI = vXUI1
	Dim isB4J As Boolean = XUI.IsB4J
	If Not(isB4J) Then
		Dim getsize As Int = CustomListView1._getsize - 1
		Dim i As Int
		For i = 0 To getsize
			Dim getpanel_ As B4XView = CustomListView1._getpanel(i)
			getpanel_.RemoveViewFromParent
			vLst1.Add(getpanel_)
		Next
	End If
	CustomListView1._clear
	Dim lowerCase As String = str.ToLowerCase
	If str = "" Then
		Sub001(vLst2, lowerCase)
	Else
		Dim substring As String = IIf(lowerCase.Length > max_limit, lowerCase.SubString2(0, max_limit), lowerCase)
		Sub001(vMap1.Get(substring), lowerCase)
		Sub001(vMap2.Get(substring), lowerCase)
	End If
End Sub

