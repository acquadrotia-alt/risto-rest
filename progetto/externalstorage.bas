B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Type externalfile(IsFolder As Boolean, LastModified As Long, Length As Long, Name As String, Native As JavaObject)
	Public vObj1 As Object
	Public vStr1 As String
	Public vStr2 As String
	Public vJavaObject1 As JavaObject
	Public vObj2 As Object
	Public vStr3 As String
	Public vexternalfile1 As externalfile
End Sub

Sub Sub001(externalfileVar As externalfile, str As String) As externalfile
	Return Sub003(externalfileVar.Native.RunMethod("createFile", Array("", str)))
End Sub

Sub Sub002(externalfileVar As externalfile) As Boolean
	If Not(externalfileVar.IsInitialized) Then
		Return False
	End If
	Return externalfileVar.Native.RunMethod("delete", Null)
End Sub

Sub Sub003(javaObject As JavaObject) As externalfile
	Dim externalfileVar As externalfile
	Dim vIsInitialized As Boolean = javaObject.IsInitialized
	If Not(vIsInitialized) Then
		Return externalfileVar
	End If
	externalfileVar.Initialize
	externalfileVar.Name = javaObject.RunMethod("getName", Null)
	externalfileVar.Length = javaObject.RunMethod("length", Null)
	externalfileVar.IsFolder = javaObject.RunMethod("isDirectory", Null)
	externalfileVar.Native = javaObject
	externalfileVar.LastModified = javaObject.RunMethod("lastModified", Null)
	Return externalfileVar
End Sub

Sub Sub004(externalfileVar As externalfile, str As String) As externalfile
	Return Sub003(externalfileVar.Native.RunMethod("findFile", Array(str)))
End Sub

Sub Sub005(externalfileVar As externalfile, str As String) As externalfile
	Dim vTmp As externalfile = Sub004(externalfileVar, str)
	If Not(vTmp.IsInitialized) Then
		Return Sub001(externalfileVar, str)
	End If
	Return vTmp
End Sub

Sub Sub006 As Object
	Dim javaObject As JavaObject = Me
	Return javaObject.RunMethod("getBA", Null)
End Sub

Sub Sub007(str As String) As JavaObject
	Dim javaObject As JavaObject
	Dim uriWrapper As Uri
	uriWrapper.Parse(str)
	Return javaObject.InitializeStatic("androidx.documentfile.provider.DocumentFile").RunMethod("fromTreeUri", Array(vJavaObject1, uriWrapper))
End Sub

Sub Initialize(obj As Object, str As String)
	vObj2 = obj
	vStr3 = str
	vJavaObject1.InitializeContext
End Sub

Sub ion_event(str As String, objArr As Object()) As Object
	If -1 = objArr(0) Then
		Dim intentWrapper As Intent = objArr(1)
		Dim javaObject As JavaObject = intentWrapper
		Dim uriWrapper As Uri
		Dim uriWrapper2 As Uri = javaObject.RunMethod("getData", Null)
		Dim vAnd As Int = Bit.And(intentWrapper.Flags, 3)
		Dim javaObject2 As JavaObject = vJavaObject1
		javaObject2.RunMethodJO("getContentResolver", Null).RunMethod("takePersistableUriPermission", Array(uriWrapper2, vAnd))
		vStr1 = uriWrapper2
		File.WriteString(File.DirInternal, vStr2, vStr1)
		Log(vStr1)
		Sub012()
	Else
		CallSubDelayed(vObj2, vStr3 & "_ExternalFolderAvailable")
	End If
	Return Null
End Sub

Sub Sub008(externalfileVar As externalfile) As List
	Dim objArr() As Object = externalfileVar.Native.RunMethod("listFiles", Null)
	Dim list As List
	list.Initialize
	Dim i As Int = 0
	For Each obj As Object In objArr
		Dim javaObject2 As JavaObject = obj
		i = i + 1
		If i Mod 20 = 0 Then
			DoEvents
		End If
		list.Add(Sub003(javaObject2))
	Next
	Return list
End Sub

Sub Sub009(externalfileVar As externalfile) As InputStream
	Dim inputStreamWrapper As InputStream
	Dim javaObject As JavaObject = vJavaObject1
	Dim vRunMethodJO As JavaObject = javaObject.RunMethodJO("getContentResolver", Null)
	Return vRunMethodJO.RunMethod("openInputStream", Array(externalfileVar.Native.RunMethod("getUri", Null)))
End Sub

Sub Sub010(externalfileVar As externalfile) As OutputStream
	Dim outputStreamWrapper As OutputStream
	Dim javaObject As JavaObject = vJavaObject1
	Dim vRunMethodJO As JavaObject = javaObject.RunMethodJO("getContentResolver", Null)
	Return vRunMethodJO.RunMethod("openOutputStream", Array(externalfileVar.Native.RunMethod("getUri", Null)))
End Sub

Sub Sub011(z As Boolean)
	If z Then
		If File.Exists(File.DirInternal, vStr2) Then
			vStr1 = File.ReadString(File.DirInternal, vStr2)
			Dim list As List
			Dim javaObject As JavaObject = vJavaObject1
			Dim vRunMethodJO As JavaObject = javaObject.RunMethodJO("getContentResolver", Null)
			Dim list2 As List = vRunMethodJO.RunMethod("getPersistedUriPermissions", Null)
			If list2.IsInitialized Then
				Dim size As Int = list2.Size
				Dim i As Int
				For i = 0 To size - 1
					Dim javaObject2 As JavaObject = list2.Get(i)
					Dim uriWrapper As Uri
					If javaObject2.RunMethod("getUri", Null).Replace("(StringUri) ", "").Replace("(HierarchicalUri) ", "") = vStr1.Replace("(StringUri) ", "").Replace("(HierarchicalUri) ", "") Then
						Dim vRunMethod As Object = javaObject2.RunMethod("isWritePermission", Null)
						If vRunMethod = True Then
							Log("Can use persistant uri!")
							Sub012()
							Return
						End If
					End If
				Next
			End If
		End If
	End If
	Dim intentWrapper As Intent
	intentWrapper.Initialize("android.intent.action.OPEN_DOCUMENT_TREE", "")
	intentWrapper.PutExtra("android.content.extra.SHOW_ADVANCED", True)
	startactivityforresult(intentWrapper)
End Sub

Sub Sub012
	vexternalfile1 = Sub003(Sub007(vStr1))
	CallSubDelayed(vObj2, vStr3 & "_ExternalFolderAvailable")
End Sub

Sub startactivityforresult(intentWrapper As Intent)
	Dim javaObject As JavaObject = Sub006()
	vObj1 = javaObject.CreateEvent("anywheresoftware.b4a.IOnActivityResult", "ion", Null)
	javaObject.RunMethod("startActivityForResult", Array(vObj1, intentWrapper))
End Sub

