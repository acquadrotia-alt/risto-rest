B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vStr1 As String
	Public vBln1 As Boolean
	Public vRuntimePermissions1 As RuntimePermissions
End Sub

Sub Sub001(str As String) As Object
	Dim z As Boolean = vBln1
	If Not(z) Then
		Dim vInitializeStatic As JavaObject = InitializeStatic("android.net.Uri")
		Return vInitializeStatic.RunMethod("parse", Array("file://" & File.Combine(vStr1, str)))
	End If
	Dim javaObject As JavaObject
	javaObject.InitializeNewInstance("java.io.File", Array(vStr1, str))
	Dim javaObject2 As JavaObject
	Dim javaObject3 As JavaObject
	javaObject3.InitializeContext
	javaObject2.InitializeStatic("androidx.core.content.FileProvider")
	Return javaObject2.RunMethod("getUriForFile", Array(javaObject3, Application.PackageName & ".provider", javaObject))
End Sub

Sub Initialize
	If Phone.SdkVersion < 24 Then
		Dim externalWritable As Boolean = File.ExternalWritable
		If externalWritable Then
			vBln1 = False
			vStr1 = vRuntimePermissions1.GetSafeDirDefaultExternal("shared")
			Log("Using FileProvider? " & SmartStringFormatter("", vBln1) & "")
			Return
		End If
	End If
	vBln1 = True
	vStr1 = File.Combine(File.DirInternal, "shared")
	File.MakeDir("", vStr1)
	Log("Using FileProvider? " & SmartStringFormatter("", vBln1) & "")
End Sub

