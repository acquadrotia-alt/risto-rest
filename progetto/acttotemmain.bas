B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=13.1
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	Public vSql1 As SQL
End Sub

Sub Globals
	Public vtotemview1 As totemview
End Sub

Sub Activity_Create(z As Boolean)
	vSql1.Initialize(File.DirRootExternal, "Anagra.db", True)
	vtotemview1.Initialize(vSql1, False, File.DirRootExternal & "/Ristorandro/ImgTotem", False, Me)
	Activity.AddView(vtotemview1.Sub001, 0, 0, PerXToCurrent(100), PerYToCurrent(100))
End Sub

Sub Activity_Pause(z As Boolean)
End Sub

Sub Activity_Resume
End Sub

Sub Sub001(map As Map)
	If map.Size = 0 Then
	End If
End Sub

