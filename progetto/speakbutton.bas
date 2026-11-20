B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vTxt1 As EditText
	Public vVoiceRecognition1 As VoiceRecognition
	Public vBtn1 As Button
	Public vBln1 As Boolean
	Public vBln2 As Boolean
End Sub

Sub Btn_Click
	mod1.vBln9 = True
	vVoiceRecognition1.Listen
End Sub

Sub designercreateview(panelWrapper As Panel, labelWrapper As Label, map As Map)
	vBtn1.Initialize("btn")
	panelWrapper.AddView(vBtn1, 0, 0, panelWrapper.Width, panelWrapper.Height)
	Dim buttonWrapper As Button = vBtn1
	buttonWrapper.SetBackgroundImageNew(LoadBitmap(File.DirAssets, "SpeakBtn.png"))
	vBtn1.Enabled = vVoiceRecognition1.IsSupported
End Sub

Sub Initialize(obj As Object, str As String)
	If vBln1 Then
		Return
	End If
	vVoiceRecognition1.Initialize("vr")
	vBln1 = True
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv2(bitmapWrapper As Bitmap)
	Dim bitmapDrawable As BitmapDrawable
	bitmapDrawable.Initialize(bitmapWrapper)
	vBtn1.Background = bitmapDrawable
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(str As String)
	vVoiceRecognition1.Language = str
End Sub

Sub setvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv3(editTextWrapper As EditText)
	vTxt1 = editTextWrapper
End Sub

Sub Vr_Result(z As Boolean, list As List)
	If z And list.Size > 0 Then
		Dim editTextWrapper As EditText = vTxt1
		editTextWrapper.Text = mod1.Sub209(list.Get(0))
	End If
	mod1.vBln9 = True
	mod1.vBln10 = vBln2
End Sub

