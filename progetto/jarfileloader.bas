B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vBln1 As Boolean
End Sub

Sub Initialize(z As Boolean)
	vBln1 = z
End Sub

Sub Sub001(str As String) As Bitmap
	Dim bitmapWrapper As Bitmap
	Dim vTmp As InputStream = Sub002(str)
	bitmapWrapper.Initialize2(vTmp)
	vTmp.Close
	Return bitmapWrapper
End Sub

Sub Sub002(str As String) As InputStream
	If vBln1 Then
		Return File.OpenInput(File.DirAssets, str)
	End If
	If vBln1 Then
		Return File.OpenInput(File.DirAssets, str)
	End If
	Dim reflection As Reflector
	reflection.Target = Me
	reflection.Target = reflection.RunMethod("getClass")
	Dim inputStreamWrapper As InputStream = reflection.RunMethod2("getResourceAsStream", "/" & str, "java.lang.String")
	Dim vIsInitialized As Boolean = inputStreamWrapper.IsInitialized
	If Not(vIsInitialized) Then
		LogColor("Cannot find file: " & str, -65536)
		Return inputStreamWrapper
	End If
	Return inputStreamWrapper
End Sub

