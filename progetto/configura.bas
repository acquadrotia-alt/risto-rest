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
	Public v7 As Timer
	Public vFTP1 As FTP
	Public vInt1 As Int
	Public vBln1 As Boolean
	Public vInt2 As Int
	Public vInt3 As Int
	Public vInt4 As Int
	Public vInt5 As Int
	Public vBln2 As Boolean
	Public vStr1 As String
	Public vBln3 As Boolean
	Public vBln4 As Boolean
	Public vInt6 As Int
	Public vBln5 As Boolean
	Public vBln6 As Boolean
	Public vIntArr1(8) As Int
	Public vIntArr2(8) As Int
	Public vIntArr3(8) As Int
	Public vIntArr4(3) As Int
	Public vInt7 As Int = -1
	Public vInt8 As Int = -1
	Public vBln7 As Boolean
	Public vStr2 As String
	Public vBln8 As Boolean
	Public vIntArr5(10) As Int
	Public vBln9 As Boolean
	Public vInt9 As Int
	Public vStr3 As String = "Stampa Conto ,Preconto,Prenotazioni e Menù su"
	Public vInt10 As Int
	Public vInt11 As Int
	Public vInt12 As Int
	Public vInt13 As Int
	Public vInt14 As Int
	Public vInt15 As Int
	Public vInt16 As Int
	Public vInt17 As Int
	Public vInt18 As Int
	Public vInt19 As Int
	Public vStr4 As String
	Public vStr5 As String = "scaduto"
End Sub

Sub Globals
	Private idLib As id	'libreria Id (dialoghi InputList1 ecc.)
	Public Server As EditText
	Public Utente As EditText
	Public Password As EditText
	Public vcustomlistviewold1 As customlistviewold
	Public vXUI1 As XUI
	Public Panel1 As Panel
	Public vCur1 As Cursor
	Public TabHost1 As TabHost
	Public vCustomDialog21 As CustomDialog2
	Public vPnl1 As Panel
	Public vLv1 As ListView
	Public vPackageManager1 As PackageManager
	Public vLst1 As List
	Public vLst2 As List
	Public vLst3 As List
	Public SeekBar1 As SeekBar
	Public IPCassa As EditText
	Public nCassa As EditText
	Public CodAttivazione As EditText
	Public LblAttiva As Label
	Public RiepNF As Spinner
	Public IntestaNF As CheckBox
	Public Tema2 As CheckBox
	Public lblFatt As Button
	Public vDlg1 As InputDialog
	Public mD1 As EditText
	Public mD2 As EditText
	Public mD3 As EditText
	Public mD4 As EditText
	Public mD5 As EditText
	Public PrefissoCliente As Button
	Public mPorta As EditText
	Public mPwd As EditText
	Public mServer As EditText
	Public mUser As EditText
	Public bRestore As Button
	Public TipoTastiera As Spinner
	Public Listino As Button
	Public barra As Button
	Public r1 As Button
	Public R10 As Button
	Public r11 As Button
	Public r2 As Button
	Public r3 As Button
	Public r4 As Button
	Public r5 As Button
	Public r6 As Button
	Public s1 As Spinner
	Public s10 As Spinner
	Public s11 As Spinner
	Public s2 As Spinner
	Public s3 As Spinner
	Public s4 As Spinner
	Public s5 As Spinner
	Public s6 As Spinner
	Public lblMaxImpo As Button
	Public AttivaTerminale As CheckBox
	Public PanelRemote As Panel
	Public vSMTP1 As SMTP
	Public vMap1 As Map
	Public vPnl2 As Panel
	Public receive As Button
	Public Send As Button
	Public ObbligoClienteF As CheckBox
	Public RiepNFDett As CheckBox
	Public ChangeUscita As CheckBox
	Public pRisto As Panel
	Public CheckVarianti As CheckBox
	Public ListMolto As Button
	Public ListPoco As Button
	Public Happy As Button
	Public vcustomlistviewold2 As customlistviewold
	Public lblProgress As Label
	Public pw As Panel
	Public CancellaV As Button
	Public StampaComande As CheckBox
	Public btnImportaCodAttivazione As Button
	Public Turni As CheckBox
	Public ControlloTurni As CheckBox
	Public bSetFont As Button
	Public StampaSposta As CheckBox
	Public CopiaDBsuUsb As Button
	Public UsbPath As Button
	Public StampaConto As Button
	Public ErrMail As CheckBox
	Public StampaFattura As Button
	Public IpVis As EditText
	Public btnExportImg As Button
	Public SalvaOra As Button
	Public GestioneTabacchi As CheckBox
	Public RepartoGV As Button
	Public vCur2 As Cursor
	Public StampaSala As CheckBox
	Public AzzeraDati As CheckBox
	Public datiRicevute As Button
	Public IpRicevute As Button
	Public vCur3 As Cursor
	Public BIntestaNF As Button
	Public R1NF As Button
	Public BIntestaF As Button
	Public pNF As Panel
	Public R2NF As Button
	Public R3NF As Button
	Public R4NF As Button
	Public R5NF As Button
	Public R6NF As Button
	Public AsportoOra As CheckBox
	Public AsportoAnticipo As Button
	Public Consolida As CheckBox
	Public PercorsoAzzera As Button
	Public ArrotondaV As Spinner
	Public DesAsporto As Button
	Public NoTallon As Button
	Public SalvaVD As Spinner
	Public DesPreconto As Button
	Public StepAsporto As Button
	Public lblRic As Button
	Public mDesMittente As EditText
	Public StampaNomeCli As Spinner
	Public ObbligoOp As CheckBox
	Public ConsolidaIncassi As CheckBox
	Public RiduciMsg As CheckBox
	Public EsportaKBD As Button
	Public ImportaKBD As Button
	Public NoForceCoperti As CheckBox
	Public RiepOnly As CheckBox
	Public VerificaStampanti As CheckBox
	Public AzzeraAsporto As CheckBox
	Public OraFatt As CheckBox
	Public Emergenza As CheckBox
	Public nSalva As Button
	Public Icone2 As CheckBox
	Public RootDateTime As CheckBox
	Public AttivaNumTavolo As CheckBox
	Public FrazionaConImporto As Spinner
	Public InizioGiorno As Button
	Public RicCredito As CheckBox
	Public mPwdS As Button
	Public mUserS As Button
	Public ImpoSuQta As CheckBox
	Public LeggiCodLotteria As CheckBox
	Public bVerificazione As Button
	Public AddImg As Button
	Public ImgLogo As ImageView
	Public PasswordSave As Button
	Public PrefixFTPSave As Button
	Public UtenteSave As Button
	Public Salvataggio As Spinner
	Public ServerSave As Button
	Public ConsolidaLast As CheckBox
	Public nNegozio As EditText
	Public TastiOmbreggiati As CheckBox
	Public bSetDefaultSedie As Button
	Public IncassoOperatori As CheckBox
	Public TipoImpTabacchi As Spinner
	Public DisconnettiPrt As CheckBox
	Public Label5 As Label
	Public MinutiSS As Button
	Public OpObbligatorio As CheckBox
	Public RegCancellazioni As CheckBox
	Public LogMF As CheckBox
	Public IvaDefault As Spinner
	Public FontSizeC As Spinner
	Public ImgPersonalizzate As Button
	Public Eula As CheckBox
	Public lblVia As Label
	Public lblCitta As Label
	Public PnlHide As Panel
	Public Label1 As Label
	Public ObbligoOPAvvio As CheckBox
	Public OpExtended As CheckBox
	Public lblPwdS As Label
	Public lblUserS As Label
	Public PagamentoPrep As Spinner
	Public LogNF As CheckBox
	Public TallonSempre As CheckBox
	Public ConsolidaSc As CheckBox
	Public OrdinamentoSc As Spinner
	Public EFTSM As CheckBox
	Public EFTSMStampa As CheckBox
	Public IPEFTSM As Button
	Public SoloVenduto As CheckBox
	Public PnlFlag As Panel
	Public bTecnici As Button
	Public bStampa As Button
	Public bUtilizzo As Button
	Public bRistorazione As Button
	Public bVisualizzazione As Button
	Public PORTAEFTSM As Button
	Public LblCassa As Label
	Public LblVis As Label
	Public Label7 As Label
	Public bCassa As Button
	Public CassettoSubito As CheckBox
	Public NoDatiPeriodo As CheckBox
	Public EFTSMSCONTI As CheckBox
	Public lblIPCassa As Label
	Public Legenda0 As Label
	Public Legenda1 As Label
	Public Legenda2 As Label
	Public PnlSottoTipo As Panel
	Public lblInfoT As Label
	Public ColonneVarianti As Spinner
	Public lblTitolo As Label
	Public TipoLayout As Button
	Public btnImportaBasicSupport As Button
	Public lblImportaBS As Label
	Public GiacSede As CheckBox
	Public TermSala As CheckBox
	Public MantieniNoPaginati As CheckBox
	Public MaxImpTavolo As Button
	Public VarAutoCP As CheckBox
	Public GestCoperti2 As CheckBox
	Public IpRPI As EditText
	Public LblRPI As Label
	Public gloryN As Spinner
	Public DataOraNoRoot As CheckBox
	Public LogVD As CheckBox
	Public IpEFT9 As Button
	Public IpEFT1 As Button
	Public IpEFT2 As Button
	Public IpEFT3 As Button
	Public IpEFT4 As Button
	Public IpEFT5 As Button
	Public IpEFT6 As Button
	Public IpEFT7 As Button
	Public IpEFT8 As Button
	Public FatturaFMT2 As CheckBox
	Public TallonPremio As CheckBox
	Public ProcAuto1 As Button
	Public ProcAuto2 As Button
	Public ProcAuto3 As Button
	Public ProcAuto4 As Button
	Public ProcAuto5 As Button
	Public Listino2aZero As CheckBox
	Public Terminalino As CheckBox
	Public btnImportaSB As Button
	Public ExecSql As Button
	Public DatiCompletiDC As CheckBox
	Public ImportDaIngredienti As Button
	Public bAltezzaVariazioni As Button
	Public QuantiPunti As Button
	Public CentralizzaDoc As CheckBox
	Public SetTestoFattura As Button
	Public TipoInterfaccia As Spinner
	Public MinTavoloLento As Button
	Public StampaReport As Button
	Public ObbligoOpMovimento As CheckBox
	Public Stampa66Char As CheckBox
	Public TipoFrazionamentoVariazioni As Button
	Public ConsideraPrzIntero As CheckBox
	Public Sottoconti As CheckBox
	Public ChiediNAsporto As CheckBox
	Public AvantiTurnoAuto As CheckBox
	Public FondoCassaAuto As Button
	Public PrefissoTT As Button
	Public NumeroTT As Button
	Public Turno1Sempre As CheckBox
	Public MargineTabacchi As Button
	Public DesATesta As Button
	Public ImportaLogoNF As Button
	Public VisualizzaVariazioni As CheckBox
	Public AttivaMP As CheckBox
	Public PaginaPagamenti As Button
	Public PrefissoCoupon As Button
	Public ServerBila As EditText
	Public lblBila As Label
	Public bRicerca As Button
	Public LimitiCashlogy As Button
	Public SendClienti As Button
	Public ControllaPrezziaZero As CheckBox
	Public AttivaFE As CheckBox
	Public CopieFE As Button
	Public bDatiFE As Button
	Public pnlDatiEser As Panel
	Public edtNomeEser As EditText
	Public edtCognomeEser As EditText
	Public edtCFEser As EditText
	Public edtDenEser As EditText
	Public edtCittaEser As EditText
	Public edtProvinciaEser As EditText
	Public edtCapEser As EditText
	Public edtViaEser As EditText
	Public edtUfficioREA As EditText
	Public edtNumeroREA As EditText
	Public edtCapSocREA As EditText
	Public edtIDCodiceTX As EditText
	Public edtPIVAEser As EditText
	Public spTipoEser As Spinner
	Public btnIntestazione As Button
	Public spRegFiscEser As Spinner
	Public btnNazioneEser As Button
	Public spSocUnicoREA As Spinner
	Public spStatoLiquidazioneREA As Spinner
	Public AsyncFE As Button
	Public CopieFE2 As Button
	Public btnIDPaeseTX As Button
	Public ParametriInvioFE As Button
	Public PausaFE As CheckBox
	Public ExecSqlFE As Button
	Public btnTerzoIntermediario As Button
	Public btnCloseTerzo As Button
	Public pnlDatiTerzo As Panel
	Public edtTerzoCFEser As EditText
	Public edtTerzoDenEser As EditText
	Public edtTerzoNomeEser As EditText
	Public edtTerzoCognomeEser As EditText
	Public edtTerzoIDCodiceTX As EditText
	Public btnTerzoIDPaeseTX As Button
	Public spTerzoTipoEser As Spinner
	Public ExportCorrispettivi As CheckBox
	Public ArrotondaContantiRT As Spinner
	Public AttivaSezionali As CheckBox
	Public barra2 As Button
	Public lblFatt2 As Button
	Public LastDataDocFM As CheckBox
	Public noteInFE As CheckBox
	Public SuonoDaCassa As CheckBox
	Public Tema As Spinner
	Public vXmlLayoutBuilder1 As XmlLayoutBuilder
	Public WebApiPI As Button
	Public WebApiDatiRetailer As CheckBox
	Public WebApiIndirizzo As Button
	Public WebApiRagSoc As Button
	Public WebApiPIEsercente As Button
	Public WebApiCAPEsercente As Button
	Public ArticoliZero As Spinner
	Public ModificaMovimento As CheckBox
	Public ImportazioneAuto As CheckBox
	Public GestioneSpiagge As CheckBox
	Public PrenotaGiorni As Button
	Public PrenotaGiorniApertura As Button
	Public WebSospendiTavolo As Button
	Public AddDisponibilita As CheckBox
	Public NumeroScontriniST As Button
	Public SoloChiusura As CheckBox
	Public OrdinaInserimentoVariazioni As CheckBox
	Public AttivaAzzeramentoProgressivi As CheckBox
	Public AttivaKeyHTTP As CheckBox
	Public AttivaInserimentoCliente As CheckBox
	Public ipDistributore As Button
	Public Totem As CheckBox
	Public ValorizzazionePrezzoFrazione As Button
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/configura.java, metodo _activity_create (riga 843).
Sub Activity_Create(z As Boolean)
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim z5 As Boolean
	Dim z6 As Boolean
	Dim z7 As Boolean
	Dim z8 As Boolean
	Dim z9 As Boolean
	Dim z10 As Boolean
	Dim z11 As Boolean
	Dim z12 As Boolean
	Dim z13 As Boolean
	Dim z14 As Boolean
	If mod1.vBln4 Then
		Activity.Finish
		Return
	End If
	If Main.vInt9 >= 19 Then
		Dim javaObject As JavaObject = Activity
		javaObject.RunMethod("setOnSystemUiVisibilityChangeListener", Array(javaObject.CreateEvent("android.view.View.OnSystemUiVisibilityChangeListener", "VisibilityChanged", Null)))
		Activity.Width = -1
		Activity.Height = -1
		mod1.Sub081
	End If
	mod1.Sub175
	Try
		File.MakeDir(mod1.vStr4, "ImgPalm")
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	v7.Initialize("Timer1", 1000)
	v7.Enabled = False
	Dim numberOfViews As Int = Activity.NumberOfViews - 1
	Do While numberOfViews >= 0
		Activity.RemoveViewAt(numberOfViews)
		numberOfViews = numberOfViews - 1
	Loop
	Activity.LoadLayout("ConfiguraMain")
	Dim cursorWrapper As Cursor
	vCur1 = Main.vSql1.ExecQuery("Select * from Stampe order by tipob,codice")
	Dim vLoadBitmap As Bitmap = LoadBitmap(File.DirAssets, "open.png")
	Dim vLoadBitmap2 As Bitmap = LoadBitmap(File.DirAssets, "openRev.png")
	Dim vLoadBitmap3 As Bitmap = LoadBitmap(File.DirAssets, "openD.png")
	TabHost1.AddTabWithIcon("Parametri", vLoadBitmap, vLoadBitmap2, "Configura2")
	If Main.vBln25 Then
		TabHost1.AddTabWithIcon("Server Remoto", vLoadBitmap, vLoadBitmap2, "Configura")
	Else
		TabHost1.AddTabWithIcon("UniAndro Ver." & Main.v_recordver, vLoadBitmap, vLoadBitmap2, "Configura")
	End If
	If Main.vBln25 Then
		TabHost1.AddTabWithIcon("Stampe", vLoadBitmap3, vLoadBitmap3, "ConfiguraStampe")
		TabHost1.AddTabWithIcon("Mail", vLoadBitmap3, vLoadBitmap3, "ConfiguraMail")
	Else
		TabHost1.AddTabWithIcon("Stampe", vLoadBitmap, vLoadBitmap2, "ConfiguraStampe")
		TabHost1.AddTabWithIcon("Mail", vLoadBitmap, vLoadBitmap2, "ConfiguraMail")
	End If
	TabHost1.AddTabWithIcon("Intestazione", vLoadBitmap, vLoadBitmap2, "intesta")
	Dim vGetAllViewsRecursive As IterableList = Activity.GetAllViewsRecursive
	Dim size As Int = vGetAllViewsRecursive.Size
	Dim i As Int
	For i = 0 To size - 1
		Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i)
		If concreteViewWrapper Is Button And Not(concreteViewWrapper Is CheckBox) Then
			Dim buttonWrapper As Button = concreteViewWrapper
			mod1.Sub165(buttonWrapper)
		Else If concreteViewWrapper Is B4ASpinner Then
			concreteViewWrapper.TextSize = 14
		End If
	Next
	mod1.Sub165(CodAttivazione)
	Dim vGetAllViewsRecursive2 As IterableList = pnlDatiEser.GetAllViewsRecursive
	Dim size2 As Int = vGetAllViewsRecursive2.Size
	Dim i2 As Int
	For i2 = 0 To size2 - 1
		Dim concreteViewWrapper2 As View = vGetAllViewsRecursive2.Get(i2)
		If concreteViewWrapper2 Is TextView And Not(concreteViewWrapper2 Is CheckBox) And Not(concreteViewWrapper2 Is Button) Then
			Dim labelWrapper As Label = concreteViewWrapper2
			labelWrapper.TextColor = -16777216
		End If
	Next
	Dim cursorWrapper2 As Cursor
	Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("select * from  STATIISO order by chiave")
	vLst3.Initialize
	Dim rowCount As Int = cursorWrapper3.RowCount - 1
	Dim i3 As Int
	For i3 = 0 To rowCount
		cursorWrapper3.Position = i3
		Dim tnazioneVar As tnazione
		tnazioneVar.id = cursorWrapper3.GetString("ID")
		tnazioneVar.descrizione = cursorWrapper3.GetString("DESCRIZIONE")
		tnazioneVar.alpha3 = cursorWrapper3.GetString("ALPHA3")
		tnazioneVar.CEE = (cursorWrapper3.GetInt("CEE") <> 0)
		vLst3.Add(tnazioneVar)
	Next
	vLst3.SortType("descrizione", True)
	lblTitolo.Color = Main.v_colormenutitle
	mod1.Sub173(lblTitolo)
	vMap1 = File.ReadMap(File.DirAssets, "Help.txt")
	vcustomlistviewold1.Initialize(Panel1, "cElenco")
	vcustomlistviewold1.vInt3 = -16776961
	Panel1.Height = PerYToCurrent(80)
	Panel1.AddView(vcustomlistviewold1.Sub003, 0, 0, PerXToCurrent(100), PerYToCurrent(70))
	Panel1.Color = -16777216
	If vCur2.IsInitialized Then
		vCur2.Close
	End If
	Dim cursorWrapper4 As Cursor
	vCur2 = Main.vSql1.ExecQuery("Select * from reparti order by codice")
	If vCur3.IsInitialized Then
		vCur3.Close
	End If
	Dim cursorWrapper5 As Cursor
	vCur3 = Main.vSql1.ExecQuery("SELECT * FROM Despagine where codice <10 order by codice")
	Listino.Background = mod1.Sub155(-16776961, 25)
	ImgPersonalizzate.Background = mod1.Sub155(-16776961, 25)
	Send.Background = mod1.Sub155(-6052097, 25)
	lblFatt.Background = mod1.Sub155(-16776961, 25)
	lblFatt2.Background = mod1.Sub155(-16776961, 25)
	lblRic.Background = mod1.Sub155(-16776961, 25)
	receive.Background = mod1.Sub155(-6052097, 25)
	bRestore.Background = mod1.Sub155(-16776961, 25)
	bSetFont.Background = mod1.Sub155(-16776961, 25)
	EsportaKBD.Background = mod1.Sub155(-16776961, 25)
	ImportaKBD.Background = mod1.Sub155(-16776961, 25)
	bTecnici.Background = mod1.Sub155(-16776961, 25)
	bStampa.Background = mod1.Sub155(-16776961, 25)
	bCassa.Background = mod1.Sub155(-65536, 25)
	bVisualizzazione.Background = mod1.Sub155(-16776961, 25)
	bRicerca.Background = mod1.Sub155(-16711936, 25)
	PrefissoCoupon.Background = mod1.Sub155(-16776961, 25)
	SendClienti.Background = mod1.Sub155(-6052097, 25)
	PaginaPagamenti.Background = mod1.Sub155(-16776961, 25)
	bRistorazione.Background = mod1.Sub155(-16776961, 25)
	bUtilizzo.Background = mod1.Sub155(-16776961, 25)
	r1.Background = mod1.Sub155(-16776961, 25)
	r2.Background = mod1.Sub155(-16776961, 25)
	r3.Background = mod1.Sub155(-16776961, 25)
	r4.Background = mod1.Sub155(-16776961, 25)
	r5.Background = mod1.Sub155(-16776961, 25)
	r6.Background = mod1.Sub155(-16776961, 25)
	R1NF.Background = mod1.Sub155(-16776961, 25)
	R2NF.Background = mod1.Sub155(-16776961, 25)
	R3NF.Background = mod1.Sub155(-16776961, 25)
	R4NF.Background = mod1.Sub155(-16776961, 25)
	R5NF.Background = mod1.Sub155(-16776961, 25)
	R6NF.Background = mod1.Sub155(-16776961, 25)
	lblVia.Background = mod1.Sub155(-256, 0)
	lblCitta.Background = mod1.Sub155(-256, 0)
	BIntestaNF.Background = mod1.Sub155(-65536, 25)
	bDatiFE.Background = mod1.Sub155(-65536, 25)
	btnIntestazione.Background = mod1.Sub155(-65536, 25)
	btnTerzoIntermediario.Background = mod1.Sub155(-65536, 25)
	btnCloseTerzo.Background = mod1.Sub155(-65536, 25)
	BIntestaF.Background = mod1.Sub155(-65536, 25)
	AddImg.Background = mod1.Sub155(-16776961, 25)
	R10.Background = mod1.Sub155(-16776961, 25)
	r11.Background = mod1.Sub155(-16776961, 25)
	SalvaOra.Background = mod1.Sub155(-16776961, 25)
	RepartoGV.Background = mod1.Sub155(-16776961, 25)
	nSalva.Background = mod1.Sub155(-16776961, 25)
	lblMaxImpo.Background = mod1.Sub155(-16776961, 25)
	FondoCassaAuto.Background = mod1.Sub155(-16776961, 25)
	MaxImpTavolo.Background = mod1.Sub155(-16776961, 25)
	TipoFrazionamentoVariazioni.Background = mod1.Sub155(-16776961, 25)
	ValorizzazionePrezzoFrazione.Background = mod1.Sub155(-16776961, 25)
	WebSospendiTavolo.Background = mod1.Sub155(-16776961, 25)
	MinTavoloLento.Background = mod1.Sub155(-16776961, 25)
	CopieFE.Background = mod1.Sub155(-16776961, 25)
	CopieFE2.Background = mod1.Sub155(-16776961, 25)
	AsyncFE.Background = mod1.Sub155(-16776961, 25)
	PercorsoAzzera.Background = mod1.Sub155(-16776961, 25)
	btnImportaCodAttivazione.Background = mod1.Sub155(-16776961, 25)
	btnImportaSB.Background = mod1.Sub155(-16776961, 25)
	QuantiPunti.Background = mod1.Sub155(-16776961, 25)
	MargineTabacchi.Background = mod1.Sub155(-16776961, 25)
	SetTestoFattura.Background = mod1.Sub155(-16776961, 25)
	btnExportImg.Background = mod1.Sub155(-16776961, 25)
	UsbPath.Background = mod1.Sub155(-16776961, 25)
	barra.Background = mod1.Sub155(-16776961, 25)
	barra2.Background = mod1.Sub155(-16776961, 25)
	CopiaDBsuUsb.Background = mod1.Sub155(-16776961, 25)
	ListPoco.Background = mod1.Sub155(-16776961, 25)
	InizioGiorno.Background = mod1.Sub155(-16776961, 25)
	bVerificazione.Background = mod1.Sub155(-65536, 25)
	ImportDaIngredienti.Background = mod1.Sub155(-65536, 25)
	ImportaLogoNF.Background = mod1.Sub155(-65536, 25)
	bSetDefaultSedie.Background = mod1.Sub155(-16776961, 25)
	bAltezzaVariazioni.Background = mod1.Sub155(-16776961, 25)
	AsportoAnticipo.Background = mod1.Sub155(-16776961, 25)
	MinutiSS.Background = mod1.Sub155(-16776961, 25)
	PrenotaGiorni.Background = mod1.Sub155(-16776961, 25)
	NumeroScontriniST.Background = mod1.Sub155(-16776961, 25)
	PrenotaGiorniApertura.Background = mod1.Sub155(-16776961, 25)
	StepAsporto.Background = mod1.Sub155(-16776961, 25)
	ListMolto.Background = mod1.Sub155(-16776961, 25)
	CancellaV.Background = mod1.Sub155(-16776961, 25)
	Happy.Background = mod1.Sub155(-16776961, 25)
	PrefissoCliente.Background = mod1.Sub155(-16776961, 25)
	PrefissoTT.Background = mod1.Sub155(-16776961, 25)
	StampaConto.Background = mod1.Sub155(-16776961, 25)
	NoTallon.Background = mod1.Sub155(-16776961, 25)
	StampaReport.Background = mod1.Sub155(-16776961, 25)
	StampaFattura.Background = mod1.Sub155(-16776961, 25)
	datiRicevute.Background = mod1.Sub155(-16776961, 25)
	IpRicevute.Background = mod1.Sub155(-16776961, 25)
	ipDistributore.Background = mod1.Sub155(-16776961, 25)
	DesAsporto.Background = mod1.Sub155(-16776961, 25)
	DesPreconto.Background = mod1.Sub155(-16776961, 25)
	DesATesta.Background = mod1.Sub155(-16776961, 25)
	vPnl2.Initialize("")
	TipoImpTabacchi.Clear
	TipoImpTabacchi.Add("Importa variazioni tabacchi dal Web")
	TipoImpTabacchi.Add("Importa variazioni tabacchi da chiave USB")
	IvaDefault.Clear
	Dim i4 As Int
	For i4 = 0 To 9
		Main.vCur4.Position = i4
		IvaDefault.Add("Iva predefinita: " & Main.vCur4.GetString("descrizione"))
	Next
	PagamentoPrep.Clear
	Dim cursorWrapper6 As Cursor
	Dim cursorWrapper7 As Cursor = Main.vSql1.ExecQuery("Select descrizione from pagamenti order by codice")
	Dim rowCount2 As Int = cursorWrapper7.RowCount - 1
	Dim i5 As Int
	For i5 = 0 To rowCount2
		cursorWrapper7.Position = i5
		PagamentoPrep.Add("Pagamento per Prepagato: " & cursorWrapper7.GetString("descrizione"))
	Next
	OrdinamentoSc.Clear
	OrdinamentoSc.Add("Ordina gli articoli per ordine di inserimento nei documenti")
	OrdinamentoSc.Add("Ordina gli articoli per reparto nei documenti")
	OrdinamentoSc.Add("Ordina gli articoli per indice di reparto nei documenti")
	OrdinamentoSc.Add("Ordina gli articoli per descrizione nei documenti")
	spTipoEser.Clear
	spTipoEser.Add("Tipologia esercente: DA CONFIGURARE")
	spTipoEser.Add("Tipologia esercente: Ditta individuale")
	spTipoEser.Add("Tipologia esercente: Società")
	spTipoEser.Add("Tipologia esercente: Pubblica amministrazione")
	spTipoEser.Add("Tipologia esercente: Persona giuridica senza P.Iva")
	spTerzoTipoEser.Clear
	spTerzoTipoEser.Add("Tipologia esercente: DA CONFIGURARE")
	spTerzoTipoEser.Add("Tipologia esercente: Ditta individuale")
	spTerzoTipoEser.Add("Tipologia esercente: Società")
	spTerzoTipoEser.Add("Tipologia esercente: Pubblica amministrazione")
	spTerzoTipoEser.Add("Tipologia esercente: Persona giuridica senza P.Iva")
	ArticoliZero.Clear
	ArticoliZero.Add("Modalità di stampa articoli a zero: Stampa su DCV conto e preconto")
	ArticoliZero.Add("Modalità di stampa articoli a zero: Stampa su DCV (No conto e preconto)")
	ArticoliZero.Add("Modalità di stampa articoli a zero: Stampa su conto e preconto (No DCV)")
	ArticoliZero.Add("Modalità di stampa articoli a zero: Non stampare mai")
	gloryN.Clear
	gloryN.Add("CashManagement: Disabilitato")
	gloryN.Add("CashManagement Attivo: Azkoyen")
	gloryN.Add("CashManagement Attivo: Glory con minipc")
	gloryN.Add("CashManagement Attivo: Glory con Visiondroid")
	gloryN.Add("CashManagement Attivo: CashMatic")
	spRegFiscEser.Clear
	Dim cursorWrapper8 As Cursor
	Dim cursorWrapper9 As Cursor = Main.vSql1.ExecQuery("Select * from FERegFiscale order by codice")
	If cursorWrapper9.RowCount > 0 Then
		Dim rowCount3 As Int = cursorWrapper9.RowCount - 1
		Dim i6 As Int
		For i6 = 0 To rowCount3
			cursorWrapper9.Position = i6
			spRegFiscEser.Add(IIf(numberOfViews > 0, cursorWrapper9.GetString("Sigla") & " - " & cursorWrapper9.GetString("Descrizione"), cursorWrapper9.GetString("Descrizione")))
		Next
	End If
	spStatoLiquidazioneREA.Clear
	spStatoLiquidazioneREA.Add("LN ( Non in liquidazione )")
	spStatoLiquidazioneREA.Add("LS ( In liquidazione )")
	spSocUnicoREA.Clear
	spSocUnicoREA.Add("Nessuno")
	spSocUnicoREA.Add("SU(Socio Unico) ")
	spSocUnicoREA.Add("SM(Più Soci)")
	TipoTastiera.Clear
	TipoTastiera.Add("Tipo Tastiera : Verticale")
	TipoTastiera.Add("Tipo Tastiera : Orizzontale")
	TipoTastiera.Add("Tipo Tastiera : Verticale 180°")
	TipoTastiera.Add("Tipo Tastiera : Orizzontale 180°")
	TipoInterfaccia.Clear
	TipoInterfaccia.Add("Interfaccia " & Main.vStr1 & ": Ethernet")
	TipoInterfaccia.Add("Interfaccia " & Main.vStr1 & ": Convertitore Usb-Seriale")
	TipoInterfaccia.Add("Interfaccia " & Main.vStr1 & ": SpiceT")
	ColonneVarianti.Clear
	ColonneVarianti.Add("Numero Colonne per variazioni : 4")
	ColonneVarianti.Add("Numero Colonne per variazioni : 5")
	ColonneVarianti.Add("Numero Colonne per variazioni : 6")
	ColonneVarianti.Add("Numero Colonne per variazioni : 7")
	ColonneVarianti.Add("Numero Colonne per variazioni : 8")
	ColonneVarianti.Add("Numero Colonne per variazioni : 9")
	ColonneVarianti.Add("Numero Colonne per variazioni : 10")
	SalvaVD.Clear
	SalvaVD.Add("Non salvare l'incasso giornaliero ogni 3 minuti ")
	SalvaVD.Add("Salva l'incasso giornaliero ogni 3 minuti su VisionDroid")
	SalvaVD.Add("Salva l'incasso giornaliero ogni 3 minuti su MicroSD")
	SalvaVD.Add("Salva l'incasso giornaliero ogni 3 minuti sul ServiceBox")
	FrazionaConImporto.Clear
	FrazionaConImporto.Add("Frazionamento SENZA importo")
	FrazionaConImporto.Add("Frazionamento con importo senza modificare il listino")
	FrazionaConImporto.Add("Frazionamento con importo utilizzando il listino 1")
	FrazionaConImporto.Add("Frazionamento con importo utilizzando il listino 2")
	FrazionaConImporto.Add("Frazionamento con importo utilizzando il listino 3")
	FrazionaConImporto.Add("Frazionamento con importo utilizzando il listino 4")
	RiepNF.Clear
	RiepNF.Add("Non Stampare il Riepilogo NF sul " & Main.vStr1 & "")
	RiepNF.Add("Stampa Riepilogo NF sul " & Main.vStr1 & "")
	RiepNF.Add("Stampa Riepilogo NF sul " & Main.vStr1 & " SOLO con lo scontrino fiscale")
	StampaNomeCli.Clear
	StampaNomeCli.Add("Non Stampare i dati del cliente ")
	StampaNomeCli.Add("Stampa solo il nome del cliente")
	StampaNomeCli.Add("Stampa TUTTI i dati del cliente")
	vLst2.Initialize
	vLst2.AddAll(ArrayToList(Array As String("Invia solo i clienti modificati", "Invia sempre nel caso di fattura", "Invia sempre ", "Non inviare mai nulla")))
	ArrotondaV.Clear
	ArrotondaV.Add("Arrotonda sconti ,frazionamenti e servizio all'intero")
	ArrotondaV.Add("Arrotonda sconti ,frazionamenti e servizio ai 10 Centesimi")
	ArrotondaV.Add("Arrotonda sconti ,frazionamenti e servizio al Centesimo")
	ArrotondaV.SelectedIndex = 2
	ArrotondaContantiRT.Clear
	ArrotondaContantiRT.Add("Non arrotondare su pagamento in contanti")
	ArrotondaContantiRT.Add("Arrotondamento di legge su pagamento in contanti")
	ArrotondaContantiRT.Add("Arrotondamento in favore del cliente su pagamento in contanti")
	ArrotondaContantiRT.Add("Arrotondamento in favore dell'esercente su pagamento in contanti")
	ArrotondaContantiRT.SelectedIndex = 0
	Tema.Clear
	Tema.Add("Tema attivo: tasti grandi (Holo) ")
	Tema.Add("Tema attivo: predefinito android (Material)")
	If File.Exists(File.DirInternal, "theme.txt") Then
		Tema.SelectedIndex = 0
	Else
		Tema.SelectedIndex = 1
	End If
	Tema.Visible = Main.vInt9 > 19
	FontSizeC.Clear
	FontSizeC.Add("Dimensione carattere: Molto Piccolo")
	FontSizeC.Add("Dimensione carattere: Piccolo")
	FontSizeC.Add("Dimensione carattere: Normale")
	FontSizeC.Add("Dimensione carattere: Grande")
	FontSizeC.Add("Dimensione carattere: Molto Grande")
	FontSizeC.SelectedIndex = 2
	Salvataggio.Clear
	Salvataggio.Add("Salvataggio sul " & Main.vStr1 & " (Sconsigliato)")
	Salvataggio.Add("Salvataggio su chiave USB o Micro SD")
	Salvataggio.Add("Salvataggio su percorso FTP remoto")
	Salvataggio.Add("Salvataggio su Google Drive (in background)")
	Salvataggio.Add("Salvataggio sul ServiceBox")
	Salvataggio.Add("SALVATAGGIO DA CONFIGURARE")
	Salvataggio.Add("Salvataggio tramite BFileSync")
	Salvataggio.Add("Salvataggio tramite SAF (android 6+)")
	vcustomlistviewold2.Initialize(Me, "clv22")
	PnlFlag.AddView(vcustomlistviewold2.Sub003, DipToCurrent(2), DipToCurrent(2), PnlFlag.Width - DipToCurrent(4), PnlFlag.Height - DipToCurrent(4))
	vcustomlistviewold2.Sub020(-1)
	vcustomlistviewold1.Sub020(-1)
	Panel1.Color = -1
	PnlFlag.Color = -1
	PnlSottoTipo.Color = -1
	Activity.Color = -1
	lblTitolo.Text = "Configurazione"
	Sub036()
	If Main.vBln25 Then
		Salvataggio.Visible = False
		AzzeraDati.Visible = False
		NoDatiPeriodo.Visible = False
		MantieniNoPaginati.Visible = False
		PercorsoAzzera.Visible = False
		nSalva.Visible = False
		bRestore.Visible = False
		CopiaDBsuUsb.Visible = False
		AsportoOra.Visible = False
		RepartoGV.Visible = False
		PrefissoCliente.Visible = False
		PrefissoTT.Visible = False
		lblMaxImpo.Visible = False
		FondoCassaAuto.Visible = False
		MaxImpTavolo.Visible = False
		TipoFrazionamentoVariazioni.Visible = False
		ValorizzazionePrezzoFrazione.Visible = False
		WebSospendiTavolo.Visible = False
		MinTavoloLento.Visible = False
		CopieFE.Visible = False
		CopieFE2.Visible = False
		AsyncFE.Visible = False
		PaginaPagamenti.Visible = False
		PrefissoCoupon.Visible = False
		ObbligoOPAvvio.Visible = False
		ObbligoOpMovimento.Visible = False
		OpExtended.Visible = False
		CheckVarianti.Visible = False
		ListPoco.Visible = False
		ListMolto.Visible = False
		Happy.Visible = False
		StampaComande.Visible = False
		Turni.Visible = False
		ObbligoOp.Visible = False
		StampaSposta.Visible = False
		Consolida.Visible = False
		ConsolidaSc.Visible = False
		VarAutoCP.Visible = False
		VisualizzaVariazioni.Visible = False
		OrdinaInserimentoVariazioni.Visible = False
		GestCoperti2.Visible = False
		ControlloTurni.Visible = False
		AvantiTurnoAuto.Visible = False
		Turno1Sempre.Visible = False
		ConsolidaLast.Visible = False
		StampaSala.Visible = False
		AsportoAnticipo.Visible = False
		ArrotondaV.Visible = False
		StampaNomeCli.Visible = False
		StepAsporto.Visible = False
		RiduciMsg.Visible = False
		NoForceCoperti.Visible = False
		RiepOnly.Visible = False
		VerificaStampanti.Visible = False
		AzzeraAsporto.Visible = False
		OraFatt.Visible = False
		RootDateTime.Visible = False
		AttivaNumTavolo.Visible = False
		Sottoconti.Visible = False
		AddDisponibilita.Visible = False
		FrazionaConImporto.Visible = False
		RicCredito.Visible = False
		InizioGiorno.Visible = False
		ImpoSuQta.Visible = False
		LeggiCodLotteria.Visible = False
		SoloChiusura.Visible = False
		ConsideraPrzIntero.Visible = False
		TastiOmbreggiati.Visible = False
		IncassoOperatori.Visible = False
		GestioneTabacchi.Visible = False
		GestioneSpiagge.Visible = False
		TermSala.Visible = False
		TipoImpTabacchi.Visible = False
		MargineTabacchi.Visible = False
		OpObbligatorio.Visible = False
		Terminalino.Visible = False
		DatiCompletiDC.Visible = False
		RegCancellazioni.Visible = False
		IvaDefault.Visible = False
		PagamentoPrep.Visible = False
		OrdinamentoSc.Visible = False
		DisconnettiPrt.Visible = False
		lblUserS.Visible = False
		lblPwdS.Visible = False
		mUserS.Visible = False
		mPwdS.Visible = False
		bSetDefaultSedie.Visible = False
		barra2.Visible = False
		lblFatt2.Visible = False
		NumeroScontriniST.Visible = False
		AttivaSezionali.Visible = False
		AttivaAzzeramentoProgressivi.Visible = False
		noteInFE.Visible = False
		LastDataDocFM.Visible = False
	End If
	Dim checkBoxWrapper As CheckBox = AttivaTerminale
	If Main.vBln39 Then
		If Main.vBln20 Then
			If Not(Main.vBln25) Then
				z2 = True
				checkBoxWrapper.Enabled = z2
				SoloVenduto.Enabled = AttivaTerminale.Enabled
				PanelRemote.Enabled = Main.vBln39
				NumeroScontriniST.Visible = Main.v_matricola.StartsWith("ST")
				IPCassa.Visible = Not(Main.vBln39) And TipoInterfaccia.SelectedIndex = 0
				TipoInterfaccia.Visible = Main.vBln39
				bVerificazione.Visible = Main.vBln39
				ImportDaIngredienti.Visible = Main.vBln39
				ImportaLogoNF.Visible = Main.vBln39
				LogMF.Visible = Main.vBln39
				LogVD.Visible = Main.vBln39
				LogNF.Visible = Main.vBln39
				IpVis.Visible = Main.vBln39
				TallonPremio.Visible = Main.vBln39
				Listino2aZero.Visible = Main.vBln39
				ControllaPrezziaZero.Visible = Main.vBln39
				gloryN.Visible = Main.vBln39
				FatturaFMT2.Visible = Main.vBln39
				Dim checkBoxWrapper9 As CheckBox = AttivaFE
				If Main.vBln39 Then
					If Main.vSql1.ExecQuerySingleResult("select PIVAEser from FEDatiTX") = "" Then
						If Main.vSql1.ExecQuerySingleResult("select CFEser from FEDatiTX") = "" Then
							z14 = True
							If Not(z14) Then
								z3 = True
								checkBoxWrapper9.Visible = z3
								PausaFE.Visible = Main.vBln39
								AsyncFE.Visible = Main.vBln39
								barra2.Visible = Not(AttivaSezionali.Visible) And AttivaSezionali.Checked
								lblFatt2.Visible = Not(AttivaSezionali.Visible) And AttivaSezionali.Checked
								Dim editTextWrapper3 As EditText = IpRPI
								If Main.vBln39 Then
									If Not(Main.vBln25) Then
										z4 = True
										editTextWrapper3.Visible = z4
										Emergenza.Visible = Main.vBln39
										Totem.Visible = False
										nSalva.Visible = Main.vBln39
										Tema2.Visible = Main.vBln39
										TipoLayout.Visible = Main.vBln39
										SendClienti.Visible = Main.vBln39
										ChangeUscita.Visible = Main.vBln39
										Eula.Visible = Main.vBln39
										GestioneTabacchi.Visible = Main.vBln39
										GestioneSpiagge.Visible = Main.vBln39
										TermSala.Visible = Main.vBln39
										UsbPath.Visible = Main.vBln39
										WebApiDatiRetailer.Visible = Main.vBln39
										WebApiIndirizzo.Visible = Main.vBln39
										WebApiPI.Visible = Main.vBln39
										WebApiRagSoc.Visible = Main.vBln39
										WebApiPIEsercente.Visible = Main.vBln39
										WebApiCAPEsercente.Visible = Main.vBln39
										EFTSM.Visible = Main.vBln39
										EFTSMSCONTI.Visible = Not(Main.vBln39) And EFTSM.Checked
										IPEFTSM.Visible = Not(Main.vBln39) And EFTSM.Checked
										PORTAEFTSM.Visible = Not(Main.vBln39) And EFTSM.Checked
										EFTSMStampa.Visible = Not(Main.vBln39) And EFTSM.Checked
										Dim buttonWrapper112 As Button = IpEFT1
										If Main.vBln39 Then
											If Not(Main.vBln25) Then
											End If
											z5 = True
											buttonWrapper112.Visible = z5
											Dim buttonWrapper113 As Button = IpEFT2
											If Main.vBln39 Then
												If Not(Main.vBln25) Then
												End If
												z6 = True
												buttonWrapper113.Visible = z6
												Dim buttonWrapper114 As Button = IpEFT3
												If Main.vBln39 Then
													If Not(Main.vBln25) Then
													End If
													z7 = True
													buttonWrapper114.Visible = z7
													Dim buttonWrapper115 As Button = IpEFT4
													If Main.vBln39 Then
														If Not(Main.vBln25) Then
														End If
														z8 = True
														buttonWrapper115.Visible = z8
														Dim buttonWrapper116 As Button = IpEFT5
														If Main.vBln39 Then
															If Not(Main.vBln25) Then
															End If
															z9 = True
															buttonWrapper116.Visible = z9
															Dim buttonWrapper117 As Button = IpEFT6
															If Main.vBln39 Then
																If Not(Main.vBln25) Then
																End If
																z10 = True
																buttonWrapper117.Visible = z10
																Dim buttonWrapper118 As Button = IpEFT7
																If Main.vBln39 Then
																	If Not(Main.vBln25) Then
																	End If
																	z11 = True
																	buttonWrapper118.Visible = z11
																	Dim buttonWrapper119 As Button = IpEFT8
																	If Main.vBln39 Then
																		If Not(Main.vBln25) Then
																		End If
																		z12 = True
																		buttonWrapper119.Visible = z12
																		Dim buttonWrapper120 As Button = IpEFT9
																		If Main.vBln39 Then
																			If Not(Main.vBln25) Then
																			End If
																			z13 = True
																			buttonWrapper120.Visible = z13
																			ProcAuto1.Visible = Main.vBln39
																			ProcAuto2.Visible = Main.vBln39
																			ProcAuto3.Visible = Main.vBln39
																			ProcAuto4.Visible = Main.vBln39
																			ProcAuto5.Visible = Main.vBln39
																			ExecSql.Visible = Main.vBln39
																			ExecSqlFE.Visible = Main.vBln39
																			NumeroTT.Visible = Main.vBln39
																			ArrotondaV.Visible = Main.vBln39
																			ArrotondaContantiRT.Visible = Main.vBln39
																			FontSizeC.Visible = Main.vBln39
																			Turni.Visible = Main.vBln39
																			StampaConto.Visible = Main.vBln39
																			NoTallon.Visible = Main.vBln39
																			StampaReport.Visible = Main.vBln39
																			TallonSempre.Visible = Main.vBln39
																			CassettoSubito.Visible = Main.vBln39
																			SuonoDaCassa.Visible = Main.vBln39
																			StampaFattura.Visible = Main.vBln39
																			IpRicevute.Visible = Main.vBln39
																			ipDistributore.Visible = Main.vBln39
																			datiRicevute.Visible = Main.vBln39
																			VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
																			AzzeraAsporto.Visible = Main.vBln39
																			ChiediNAsporto.Visible = Main.vBln39
																			OraFatt.Visible = Main.vBln39
																			Return
																		End If
																		z13 = False
																		buttonWrapper120.Visible = z13
																		ProcAuto1.Visible = Main.vBln39
																		ProcAuto2.Visible = Main.vBln39
																		ProcAuto3.Visible = Main.vBln39
																		ProcAuto4.Visible = Main.vBln39
																		ProcAuto5.Visible = Main.vBln39
																		ExecSql.Visible = Main.vBln39
																		ExecSqlFE.Visible = Main.vBln39
																		NumeroTT.Visible = Main.vBln39
																		ArrotondaV.Visible = Main.vBln39
																		ArrotondaContantiRT.Visible = Main.vBln39
																		FontSizeC.Visible = Main.vBln39
																		Turni.Visible = Main.vBln39
																		StampaConto.Visible = Main.vBln39
																		NoTallon.Visible = Main.vBln39
																		StampaReport.Visible = Main.vBln39
																		TallonSempre.Visible = Main.vBln39
																		CassettoSubito.Visible = Main.vBln39
																		SuonoDaCassa.Visible = Main.vBln39
																		StampaFattura.Visible = Main.vBln39
																		IpRicevute.Visible = Main.vBln39
																		ipDistributore.Visible = Main.vBln39
																		datiRicevute.Visible = Main.vBln39
																		VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
																		AzzeraAsporto.Visible = Main.vBln39
																		ChiediNAsporto.Visible = Main.vBln39
																		OraFatt.Visible = Main.vBln39
																		Return
																	End If
																	z12 = False
																	buttonWrapper119.Visible = z12
																	If Main.vBln39 Then
																	End If
																	z13 = False
																	IpEFT9.Visible = z13
																	ProcAuto1.Visible = Main.vBln39
																	ProcAuto2.Visible = Main.vBln39
																	ProcAuto3.Visible = Main.vBln39
																	ProcAuto4.Visible = Main.vBln39
																	ProcAuto5.Visible = Main.vBln39
																	ExecSql.Visible = Main.vBln39
																	ExecSqlFE.Visible = Main.vBln39
																	NumeroTT.Visible = Main.vBln39
																	ArrotondaV.Visible = Main.vBln39
																	ArrotondaContantiRT.Visible = Main.vBln39
																	FontSizeC.Visible = Main.vBln39
																	Turni.Visible = Main.vBln39
																	StampaConto.Visible = Main.vBln39
																	NoTallon.Visible = Main.vBln39
																	StampaReport.Visible = Main.vBln39
																	TallonSempre.Visible = Main.vBln39
																	CassettoSubito.Visible = Main.vBln39
																	SuonoDaCassa.Visible = Main.vBln39
																	StampaFattura.Visible = Main.vBln39
																	IpRicevute.Visible = Main.vBln39
																	ipDistributore.Visible = Main.vBln39
																	datiRicevute.Visible = Main.vBln39
																	VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
																	AzzeraAsporto.Visible = Main.vBln39
																	ChiediNAsporto.Visible = Main.vBln39
																	OraFatt.Visible = Main.vBln39
																	Return
																End If
																z11 = False
																buttonWrapper118.Visible = z11
																If Main.vBln39 Then
																End If
																z12 = False
																IpEFT8.Visible = z12
																If Main.vBln39 Then
																End If
																z13 = False
																IpEFT9.Visible = z13
																ProcAuto1.Visible = Main.vBln39
																ProcAuto2.Visible = Main.vBln39
																ProcAuto3.Visible = Main.vBln39
																ProcAuto4.Visible = Main.vBln39
																ProcAuto5.Visible = Main.vBln39
																ExecSql.Visible = Main.vBln39
																ExecSqlFE.Visible = Main.vBln39
																NumeroTT.Visible = Main.vBln39
																ArrotondaV.Visible = Main.vBln39
																ArrotondaContantiRT.Visible = Main.vBln39
																FontSizeC.Visible = Main.vBln39
																Turni.Visible = Main.vBln39
																StampaConto.Visible = Main.vBln39
																NoTallon.Visible = Main.vBln39
																StampaReport.Visible = Main.vBln39
																TallonSempre.Visible = Main.vBln39
																CassettoSubito.Visible = Main.vBln39
																SuonoDaCassa.Visible = Main.vBln39
																StampaFattura.Visible = Main.vBln39
																IpRicevute.Visible = Main.vBln39
																ipDistributore.Visible = Main.vBln39
																datiRicevute.Visible = Main.vBln39
																VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
																AzzeraAsporto.Visible = Main.vBln39
																ChiediNAsporto.Visible = Main.vBln39
																OraFatt.Visible = Main.vBln39
																Return
															End If
															z10 = False
															buttonWrapper117.Visible = z10
															If Main.vBln39 Then
															End If
															z11 = False
															IpEFT7.Visible = z11
															If Main.vBln39 Then
															End If
															z12 = False
															IpEFT8.Visible = z12
															If Main.vBln39 Then
															End If
															z13 = False
															IpEFT9.Visible = z13
															ProcAuto1.Visible = Main.vBln39
															ProcAuto2.Visible = Main.vBln39
															ProcAuto3.Visible = Main.vBln39
															ProcAuto4.Visible = Main.vBln39
															ProcAuto5.Visible = Main.vBln39
															ExecSql.Visible = Main.vBln39
															ExecSqlFE.Visible = Main.vBln39
															NumeroTT.Visible = Main.vBln39
															ArrotondaV.Visible = Main.vBln39
															ArrotondaContantiRT.Visible = Main.vBln39
															FontSizeC.Visible = Main.vBln39
															Turni.Visible = Main.vBln39
															StampaConto.Visible = Main.vBln39
															NoTallon.Visible = Main.vBln39
															StampaReport.Visible = Main.vBln39
															TallonSempre.Visible = Main.vBln39
															CassettoSubito.Visible = Main.vBln39
															SuonoDaCassa.Visible = Main.vBln39
															StampaFattura.Visible = Main.vBln39
															IpRicevute.Visible = Main.vBln39
															ipDistributore.Visible = Main.vBln39
															datiRicevute.Visible = Main.vBln39
															VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
															AzzeraAsporto.Visible = Main.vBln39
															ChiediNAsporto.Visible = Main.vBln39
															OraFatt.Visible = Main.vBln39
															Return
														End If
														z9 = False
														buttonWrapper116.Visible = z9
														If Main.vBln39 Then
														End If
														z10 = False
														IpEFT6.Visible = z10
														If Main.vBln39 Then
														End If
														z11 = False
														IpEFT7.Visible = z11
														If Main.vBln39 Then
														End If
														z12 = False
														IpEFT8.Visible = z12
														If Main.vBln39 Then
														End If
														z13 = False
														IpEFT9.Visible = z13
														ProcAuto1.Visible = Main.vBln39
														ProcAuto2.Visible = Main.vBln39
														ProcAuto3.Visible = Main.vBln39
														ProcAuto4.Visible = Main.vBln39
														ProcAuto5.Visible = Main.vBln39
														ExecSql.Visible = Main.vBln39
														ExecSqlFE.Visible = Main.vBln39
														NumeroTT.Visible = Main.vBln39
														ArrotondaV.Visible = Main.vBln39
														ArrotondaContantiRT.Visible = Main.vBln39
														FontSizeC.Visible = Main.vBln39
														Turni.Visible = Main.vBln39
														StampaConto.Visible = Main.vBln39
														NoTallon.Visible = Main.vBln39
														StampaReport.Visible = Main.vBln39
														TallonSempre.Visible = Main.vBln39
														CassettoSubito.Visible = Main.vBln39
														SuonoDaCassa.Visible = Main.vBln39
														StampaFattura.Visible = Main.vBln39
														IpRicevute.Visible = Main.vBln39
														ipDistributore.Visible = Main.vBln39
														datiRicevute.Visible = Main.vBln39
														VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
														AzzeraAsporto.Visible = Main.vBln39
														ChiediNAsporto.Visible = Main.vBln39
														OraFatt.Visible = Main.vBln39
														Return
													End If
													z8 = False
													buttonWrapper115.Visible = z8
													If Main.vBln39 Then
													End If
													z9 = False
													IpEFT5.Visible = z9
													If Main.vBln39 Then
													End If
													z10 = False
													IpEFT6.Visible = z10
													If Main.vBln39 Then
													End If
													z11 = False
													IpEFT7.Visible = z11
													If Main.vBln39 Then
													End If
													z12 = False
													IpEFT8.Visible = z12
													If Main.vBln39 Then
													End If
													z13 = False
													IpEFT9.Visible = z13
													ProcAuto1.Visible = Main.vBln39
													ProcAuto2.Visible = Main.vBln39
													ProcAuto3.Visible = Main.vBln39
													ProcAuto4.Visible = Main.vBln39
													ProcAuto5.Visible = Main.vBln39
													ExecSql.Visible = Main.vBln39
													ExecSqlFE.Visible = Main.vBln39
													NumeroTT.Visible = Main.vBln39
													ArrotondaV.Visible = Main.vBln39
													ArrotondaContantiRT.Visible = Main.vBln39
													FontSizeC.Visible = Main.vBln39
													Turni.Visible = Main.vBln39
													StampaConto.Visible = Main.vBln39
													NoTallon.Visible = Main.vBln39
													StampaReport.Visible = Main.vBln39
													TallonSempre.Visible = Main.vBln39
													CassettoSubito.Visible = Main.vBln39
													SuonoDaCassa.Visible = Main.vBln39
													StampaFattura.Visible = Main.vBln39
													IpRicevute.Visible = Main.vBln39
													ipDistributore.Visible = Main.vBln39
													datiRicevute.Visible = Main.vBln39
													VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
													AzzeraAsporto.Visible = Main.vBln39
													ChiediNAsporto.Visible = Main.vBln39
													OraFatt.Visible = Main.vBln39
													Return
												End If
												z7 = False
												buttonWrapper114.Visible = z7
												If Main.vBln39 Then
												End If
												z8 = False
												IpEFT4.Visible = z8
												If Main.vBln39 Then
												End If
												z9 = False
												IpEFT5.Visible = z9
												If Main.vBln39 Then
												End If
												z10 = False
												IpEFT6.Visible = z10
												If Main.vBln39 Then
												End If
												z11 = False
												IpEFT7.Visible = z11
												If Main.vBln39 Then
												End If
												z12 = False
												IpEFT8.Visible = z12
												If Main.vBln39 Then
												End If
												z13 = False
												IpEFT9.Visible = z13
												ProcAuto1.Visible = Main.vBln39
												ProcAuto2.Visible = Main.vBln39
												ProcAuto3.Visible = Main.vBln39
												ProcAuto4.Visible = Main.vBln39
												ProcAuto5.Visible = Main.vBln39
												ExecSql.Visible = Main.vBln39
												ExecSqlFE.Visible = Main.vBln39
												NumeroTT.Visible = Main.vBln39
												ArrotondaV.Visible = Main.vBln39
												ArrotondaContantiRT.Visible = Main.vBln39
												FontSizeC.Visible = Main.vBln39
												Turni.Visible = Main.vBln39
												StampaConto.Visible = Main.vBln39
												NoTallon.Visible = Main.vBln39
												StampaReport.Visible = Main.vBln39
												TallonSempre.Visible = Main.vBln39
												CassettoSubito.Visible = Main.vBln39
												SuonoDaCassa.Visible = Main.vBln39
												StampaFattura.Visible = Main.vBln39
												IpRicevute.Visible = Main.vBln39
												ipDistributore.Visible = Main.vBln39
												datiRicevute.Visible = Main.vBln39
												VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
												AzzeraAsporto.Visible = Main.vBln39
												ChiediNAsporto.Visible = Main.vBln39
												OraFatt.Visible = Main.vBln39
												Return
											End If
											z6 = False
											buttonWrapper113.Visible = z6
											If Main.vBln39 Then
											End If
											z7 = False
											IpEFT3.Visible = z7
											If Main.vBln39 Then
											End If
											z8 = False
											IpEFT4.Visible = z8
											If Main.vBln39 Then
											End If
											z9 = False
											IpEFT5.Visible = z9
											If Main.vBln39 Then
											End If
											z10 = False
											IpEFT6.Visible = z10
											If Main.vBln39 Then
											End If
											z11 = False
											IpEFT7.Visible = z11
											If Main.vBln39 Then
											End If
											z12 = False
											IpEFT8.Visible = z12
											If Main.vBln39 Then
											End If
											z13 = False
											IpEFT9.Visible = z13
											ProcAuto1.Visible = Main.vBln39
											ProcAuto2.Visible = Main.vBln39
											ProcAuto3.Visible = Main.vBln39
											ProcAuto4.Visible = Main.vBln39
											ProcAuto5.Visible = Main.vBln39
											ExecSql.Visible = Main.vBln39
											ExecSqlFE.Visible = Main.vBln39
											NumeroTT.Visible = Main.vBln39
											ArrotondaV.Visible = Main.vBln39
											ArrotondaContantiRT.Visible = Main.vBln39
											FontSizeC.Visible = Main.vBln39
											Turni.Visible = Main.vBln39
											StampaConto.Visible = Main.vBln39
											NoTallon.Visible = Main.vBln39
											StampaReport.Visible = Main.vBln39
											TallonSempre.Visible = Main.vBln39
											CassettoSubito.Visible = Main.vBln39
											SuonoDaCassa.Visible = Main.vBln39
											StampaFattura.Visible = Main.vBln39
											IpRicevute.Visible = Main.vBln39
											ipDistributore.Visible = Main.vBln39
											datiRicevute.Visible = Main.vBln39
											VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
											AzzeraAsporto.Visible = Main.vBln39
											ChiediNAsporto.Visible = Main.vBln39
											OraFatt.Visible = Main.vBln39
											Return
										End If
										z5 = False
										buttonWrapper112.Visible = z5
										If Main.vBln39 Then
										End If
										z6 = False
										IpEFT2.Visible = z6
										If Main.vBln39 Then
										End If
										z7 = False
										IpEFT3.Visible = z7
										If Main.vBln39 Then
										End If
										z8 = False
										IpEFT4.Visible = z8
										If Main.vBln39 Then
										End If
										z9 = False
										IpEFT5.Visible = z9
										If Main.vBln39 Then
										End If
										z10 = False
										IpEFT6.Visible = z10
										If Main.vBln39 Then
										End If
										z11 = False
										IpEFT7.Visible = z11
										If Main.vBln39 Then
										End If
										z12 = False
										IpEFT8.Visible = z12
										If Main.vBln39 Then
										End If
										z13 = False
										IpEFT9.Visible = z13
										ProcAuto1.Visible = Main.vBln39
										ProcAuto2.Visible = Main.vBln39
										ProcAuto3.Visible = Main.vBln39
										ProcAuto4.Visible = Main.vBln39
										ProcAuto5.Visible = Main.vBln39
										ExecSql.Visible = Main.vBln39
										ExecSqlFE.Visible = Main.vBln39
										NumeroTT.Visible = Main.vBln39
										ArrotondaV.Visible = Main.vBln39
										ArrotondaContantiRT.Visible = Main.vBln39
										FontSizeC.Visible = Main.vBln39
										Turni.Visible = Main.vBln39
										StampaConto.Visible = Main.vBln39
										NoTallon.Visible = Main.vBln39
										StampaReport.Visible = Main.vBln39
										TallonSempre.Visible = Main.vBln39
										CassettoSubito.Visible = Main.vBln39
										SuonoDaCassa.Visible = Main.vBln39
										StampaFattura.Visible = Main.vBln39
										IpRicevute.Visible = Main.vBln39
										ipDistributore.Visible = Main.vBln39
										datiRicevute.Visible = Main.vBln39
										VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
										AzzeraAsporto.Visible = Main.vBln39
										ChiediNAsporto.Visible = Main.vBln39
										OraFatt.Visible = Main.vBln39
										Return
									End If
								End If
								z4 = False
								editTextWrapper3.Visible = z4
								Emergenza.Visible = Main.vBln39
								Totem.Visible = False
								nSalva.Visible = Main.vBln39
								Tema2.Visible = Main.vBln39
								TipoLayout.Visible = Main.vBln39
								SendClienti.Visible = Main.vBln39
								ChangeUscita.Visible = Main.vBln39
								Eula.Visible = Main.vBln39
								GestioneTabacchi.Visible = Main.vBln39
								GestioneSpiagge.Visible = Main.vBln39
								TermSala.Visible = Main.vBln39
								UsbPath.Visible = Main.vBln39
								WebApiDatiRetailer.Visible = Main.vBln39
								WebApiIndirizzo.Visible = Main.vBln39
								WebApiPI.Visible = Main.vBln39
								WebApiRagSoc.Visible = Main.vBln39
								WebApiPIEsercente.Visible = Main.vBln39
								WebApiCAPEsercente.Visible = Main.vBln39
								EFTSM.Visible = Main.vBln39
								EFTSMSCONTI.Visible = Not(Main.vBln39) And EFTSM.Checked
								IPEFTSM.Visible = Not(Main.vBln39) And EFTSM.Checked
								PORTAEFTSM.Visible = Not(Main.vBln39) And EFTSM.Checked
								EFTSMStampa.Visible = Not(Main.vBln39) And EFTSM.Checked
								If Main.vBln39 Then
								End If
								z5 = False
								IpEFT1.Visible = z5
								If Main.vBln39 Then
								End If
								z6 = False
								IpEFT2.Visible = z6
								If Main.vBln39 Then
								End If
								z7 = False
								IpEFT3.Visible = z7
								If Main.vBln39 Then
								End If
								z8 = False
								IpEFT4.Visible = z8
								If Main.vBln39 Then
								End If
								z9 = False
								IpEFT5.Visible = z9
								If Main.vBln39 Then
								End If
								z10 = False
								IpEFT6.Visible = z10
								If Main.vBln39 Then
								End If
								z11 = False
								IpEFT7.Visible = z11
								If Main.vBln39 Then
								End If
								z12 = False
								IpEFT8.Visible = z12
								If Main.vBln39 Then
								End If
								z13 = False
								IpEFT9.Visible = z13
								ProcAuto1.Visible = Main.vBln39
								ProcAuto2.Visible = Main.vBln39
								ProcAuto3.Visible = Main.vBln39
								ProcAuto4.Visible = Main.vBln39
								ProcAuto5.Visible = Main.vBln39
								ExecSql.Visible = Main.vBln39
								ExecSqlFE.Visible = Main.vBln39
								NumeroTT.Visible = Main.vBln39
								ArrotondaV.Visible = Main.vBln39
								ArrotondaContantiRT.Visible = Main.vBln39
								FontSizeC.Visible = Main.vBln39
								Turni.Visible = Main.vBln39
								StampaConto.Visible = Main.vBln39
								NoTallon.Visible = Main.vBln39
								StampaReport.Visible = Main.vBln39
								TallonSempre.Visible = Main.vBln39
								CassettoSubito.Visible = Main.vBln39
								SuonoDaCassa.Visible = Main.vBln39
								StampaFattura.Visible = Main.vBln39
								IpRicevute.Visible = Main.vBln39
								ipDistributore.Visible = Main.vBln39
								datiRicevute.Visible = Main.vBln39
								VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
								AzzeraAsporto.Visible = Main.vBln39
								ChiediNAsporto.Visible = Main.vBln39
								OraFatt.Visible = Main.vBln39
								Return
							End If
						End If
					End If
					z14 = False
					If Not(z14) Then
					End If
				End If
				z3 = False
				checkBoxWrapper9.Visible = z3
				PausaFE.Visible = Main.vBln39
				AsyncFE.Visible = Main.vBln39
				barra2.Visible = Not(AttivaSezionali.Visible) And AttivaSezionali.Checked
				lblFatt2.Visible = Not(AttivaSezionali.Visible) And AttivaSezionali.Checked
				If Main.vBln39 Then
				End If
				z4 = False
				IpRPI.Visible = z4
				Emergenza.Visible = Main.vBln39
				Totem.Visible = False
				nSalva.Visible = Main.vBln39
				Tema2.Visible = Main.vBln39
				TipoLayout.Visible = Main.vBln39
				SendClienti.Visible = Main.vBln39
				ChangeUscita.Visible = Main.vBln39
				Eula.Visible = Main.vBln39
				GestioneTabacchi.Visible = Main.vBln39
				GestioneSpiagge.Visible = Main.vBln39
				TermSala.Visible = Main.vBln39
				UsbPath.Visible = Main.vBln39
				WebApiDatiRetailer.Visible = Main.vBln39
				WebApiIndirizzo.Visible = Main.vBln39
				WebApiPI.Visible = Main.vBln39
				WebApiRagSoc.Visible = Main.vBln39
				WebApiPIEsercente.Visible = Main.vBln39
				WebApiCAPEsercente.Visible = Main.vBln39
				EFTSM.Visible = Main.vBln39
				EFTSMSCONTI.Visible = Not(Main.vBln39) And EFTSM.Checked
				IPEFTSM.Visible = Not(Main.vBln39) And EFTSM.Checked
				PORTAEFTSM.Visible = Not(Main.vBln39) And EFTSM.Checked
				EFTSMStampa.Visible = Not(Main.vBln39) And EFTSM.Checked
				If Main.vBln39 Then
				End If
				z5 = False
				IpEFT1.Visible = z5
				If Main.vBln39 Then
				End If
				z6 = False
				IpEFT2.Visible = z6
				If Main.vBln39 Then
				End If
				z7 = False
				IpEFT3.Visible = z7
				If Main.vBln39 Then
				End If
				z8 = False
				IpEFT4.Visible = z8
				If Main.vBln39 Then
				End If
				z9 = False
				IpEFT5.Visible = z9
				If Main.vBln39 Then
				End If
				z10 = False
				IpEFT6.Visible = z10
				If Main.vBln39 Then
				End If
				z11 = False
				IpEFT7.Visible = z11
				If Main.vBln39 Then
				End If
				z12 = False
				IpEFT8.Visible = z12
				If Main.vBln39 Then
				End If
				z13 = False
				IpEFT9.Visible = z13
				ProcAuto1.Visible = Main.vBln39
				ProcAuto2.Visible = Main.vBln39
				ProcAuto3.Visible = Main.vBln39
				ProcAuto4.Visible = Main.vBln39
				ProcAuto5.Visible = Main.vBln39
				ExecSql.Visible = Main.vBln39
				ExecSqlFE.Visible = Main.vBln39
				NumeroTT.Visible = Main.vBln39
				ArrotondaV.Visible = Main.vBln39
				ArrotondaContantiRT.Visible = Main.vBln39
				FontSizeC.Visible = Main.vBln39
				Turni.Visible = Main.vBln39
				StampaConto.Visible = Main.vBln39
				NoTallon.Visible = Main.vBln39
				StampaReport.Visible = Main.vBln39
				TallonSempre.Visible = Main.vBln39
				CassettoSubito.Visible = Main.vBln39
				SuonoDaCassa.Visible = Main.vBln39
				StampaFattura.Visible = Main.vBln39
				IpRicevute.Visible = Main.vBln39
				ipDistributore.Visible = Main.vBln39
				datiRicevute.Visible = Main.vBln39
				VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
				AzzeraAsporto.Visible = Main.vBln39
				ChiediNAsporto.Visible = Main.vBln39
				OraFatt.Visible = Main.vBln39
				Return
			End If
		End If
	End If
	z2 = False
	checkBoxWrapper.Enabled = z2
	SoloVenduto.Enabled = AttivaTerminale.Enabled
	PanelRemote.Enabled = Main.vBln39
	NumeroScontriniST.Visible = Main.v_matricola.StartsWith("ST")
	IPCassa.Visible = Not(Main.vBln39) And TipoInterfaccia.SelectedIndex = 0
	TipoInterfaccia.Visible = Main.vBln39
	bVerificazione.Visible = Main.vBln39
	ImportDaIngredienti.Visible = Main.vBln39
	ImportaLogoNF.Visible = Main.vBln39
	LogMF.Visible = Main.vBln39
	LogVD.Visible = Main.vBln39
	LogNF.Visible = Main.vBln39
	IpVis.Visible = Main.vBln39
	TallonPremio.Visible = Main.vBln39
	Listino2aZero.Visible = Main.vBln39
	ControllaPrezziaZero.Visible = Main.vBln39
	gloryN.Visible = Main.vBln39
	FatturaFMT2.Visible = Main.vBln39
	If Main.vBln39 Then
	End If
	z3 = False
	AttivaFE.Visible = z3
	PausaFE.Visible = Main.vBln39
	AsyncFE.Visible = Main.vBln39
	barra2.Visible = Not(AttivaSezionali.Visible) And AttivaSezionali.Checked
	lblFatt2.Visible = Not(AttivaSezionali.Visible) And AttivaSezionali.Checked
	If Main.vBln39 Then
	End If
	z4 = False
	IpRPI.Visible = z4
	Emergenza.Visible = Main.vBln39
	Totem.Visible = False
	nSalva.Visible = Main.vBln39
	Tema2.Visible = Main.vBln39
	TipoLayout.Visible = Main.vBln39
	SendClienti.Visible = Main.vBln39
	ChangeUscita.Visible = Main.vBln39
	Eula.Visible = Main.vBln39
	GestioneTabacchi.Visible = Main.vBln39
	GestioneSpiagge.Visible = Main.vBln39
	TermSala.Visible = Main.vBln39
	UsbPath.Visible = Main.vBln39
	WebApiDatiRetailer.Visible = Main.vBln39
	WebApiIndirizzo.Visible = Main.vBln39
	WebApiPI.Visible = Main.vBln39
	WebApiRagSoc.Visible = Main.vBln39
	WebApiPIEsercente.Visible = Main.vBln39
	WebApiCAPEsercente.Visible = Main.vBln39
	EFTSM.Visible = Main.vBln39
	EFTSMSCONTI.Visible = Not(Main.vBln39) And EFTSM.Checked
	IPEFTSM.Visible = Not(Main.vBln39) And EFTSM.Checked
	PORTAEFTSM.Visible = Not(Main.vBln39) And EFTSM.Checked
	EFTSMStampa.Visible = Not(Main.vBln39) And EFTSM.Checked
	If Main.vBln39 Then
	End If
	z5 = False
	IpEFT1.Visible = z5
	If Main.vBln39 Then
	End If
	z6 = False
	IpEFT2.Visible = z6
	If Main.vBln39 Then
	End If
	z7 = False
	IpEFT3.Visible = z7
	If Main.vBln39 Then
	End If
	z8 = False
	IpEFT4.Visible = z8
	If Main.vBln39 Then
	End If
	z9 = False
	IpEFT5.Visible = z9
	If Main.vBln39 Then
	End If
	z10 = False
	IpEFT6.Visible = z10
	If Main.vBln39 Then
	End If
	z11 = False
	IpEFT7.Visible = z11
	If Main.vBln39 Then
	End If
	z12 = False
	IpEFT8.Visible = z12
	If Main.vBln39 Then
	End If
	z13 = False
	IpEFT9.Visible = z13
	ProcAuto1.Visible = Main.vBln39
	ProcAuto2.Visible = Main.vBln39
	ProcAuto3.Visible = Main.vBln39
	ProcAuto4.Visible = Main.vBln39
	ProcAuto5.Visible = Main.vBln39
	ExecSql.Visible = Main.vBln39
	ExecSqlFE.Visible = Main.vBln39
	NumeroTT.Visible = Main.vBln39
	ArrotondaV.Visible = Main.vBln39
	ArrotondaContantiRT.Visible = Main.vBln39
	FontSizeC.Visible = Main.vBln39
	Turni.Visible = Main.vBln39
	StampaConto.Visible = Main.vBln39
	NoTallon.Visible = Main.vBln39
	StampaReport.Visible = Main.vBln39
	TallonSempre.Visible = Main.vBln39
	CassettoSubito.Visible = Main.vBln39
	SuonoDaCassa.Visible = Main.vBln39
	StampaFattura.Visible = Main.vBln39
	IpRicevute.Visible = Main.vBln39
	ipDistributore.Visible = Main.vBln39
	datiRicevute.Visible = Main.vBln39
	VerificaStampanti.Visible = Not(Main.vBln39) And Not(DisconnettiPrt.Checked)
	AzzeraAsporto.Visible = Main.vBln39
	ChiediNAsporto.Visible = Main.vBln39
	OraFatt.Visible = Main.vBln39
End Sub

Sub Activity_KeyPress(i As Int) As Boolean
	If i <> 4 Then
		Return False
	End If
	ToastMessageShow("Non Consentito", False)
	Return True
End Sub

Sub Activity_Pause(z As Boolean)
	If vBln8 Then
		Return
	End If
	mod1.vStr1 = ""
	mod1.vBln4 = True
	Activity.Finish
	ExitApplication
End Sub

Sub Activity_Resume
	If mod1.vBln4 Then
		Activity.Finish
		Return
	End If
	vBln8 = False
	vLst1 = vPackageManager1.GetInstalledPackages
	vLst1.Add("ANNULLA TUTTO")
	Dim phone As Phone = Main.vPhone1
	Phone.SetScreenBrightness(Main.v_screenbrightness)
	vIntArr4(0) = -1000
	vIntArr4(1) = -1000
	vIntArr4(2) = -1000
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from intesta order by codice")
	If cursorWrapper2.RowCount > 0 Then
		vBln3 = False
		vBln5 = False
		Sub019(s1)
		Sub019(s2)
		Sub019(s3)
		Sub019(s4)
		Sub019(s5)
		Sub019(s6)
		Sub019(s10)
		Sub019(s11)
		cursorWrapper2.Position = 0
		r1.Text = "Riga 1: " & CRLF & cursorWrapper2.GetString("descrizione").Trim
		s1.SelectedIndex = cursorWrapper2.GetInt("tipo") - 1
		cursorWrapper2.Position = 1
		r2.Text = "Riga 2: " & CRLF & cursorWrapper2.GetString("descrizione").Trim
		s2.SelectedIndex = cursorWrapper2.GetInt("tipo") - 1
		cursorWrapper2.Position = 2
		r3.Text = "Riga 3: " & CRLF & cursorWrapper2.GetString("descrizione").Trim
		s3.SelectedIndex = cursorWrapper2.GetInt("tipo") - 1
		cursorWrapper2.Position = 3
		r4.Text = "Riga 4: " & CRLF & cursorWrapper2.GetString("descrizione").Trim
		s4.SelectedIndex = cursorWrapper2.GetInt("tipo") - 1
		cursorWrapper2.Position = 4
		r5.Text = "Riga 5: " & CRLF & cursorWrapper2.GetString("descrizione").Trim
		s5.SelectedIndex = cursorWrapper2.GetInt("tipo") - 1
		cursorWrapper2.Position = 5
		r6.Text = "Riga 6: " & CRLF & cursorWrapper2.GetString("descrizione").Trim
		s6.SelectedIndex = cursorWrapper2.GetInt("tipo") - 1
		cursorWrapper2.Position = 6
		R10.Text = "Riga Cortesia 1: " & CRLF & cursorWrapper2.GetString("descrizione").Trim
		s10.SelectedIndex = cursorWrapper2.GetInt("tipo") - 1
		cursorWrapper2.Position = 7
		r11.Text = "Riga Cortesia 2: " & CRLF & cursorWrapper2.GetString("descrizione").Trim
		s11.SelectedIndex = cursorWrapper2.GetInt("tipo") - 1
	End If
	Dim cursorWrapper3 As Cursor
	Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from intestaNF order by codice")
	If cursorWrapper4.RowCount > 0 Then
		vBln4 = False
		cursorWrapper4.Position = 0
		R1NF.Text = "Riga 1: " & CRLF & cursorWrapper4.GetString("descrizione").Trim
		cursorWrapper4.Position = 1
		R2NF.Text = "Riga 2: " & CRLF & cursorWrapper4.GetString("descrizione").Trim
		cursorWrapper4.Position = 2
		R3NF.Text = "Riga 3: " & CRLF & cursorWrapper4.GetString("descrizione").Trim
		cursorWrapper4.Position = 3
		R4NF.Text = "Riga 4: " & CRLF & cursorWrapper4.GetString("descrizione").Trim
		cursorWrapper4.Position = 4
		R5NF.Text = "Riga 5: " & CRLF & cursorWrapper4.GetString("descrizione").Trim
		cursorWrapper4.Position = 5
		R6NF.Text = "Riga 6: " & CRLF & cursorWrapper4.GetString("descrizione").Trim
	End If
	vIntArr5(0) = -5575438
	vIntArr5(1) = -1986394
	vIntArr5(2) = -7672942
	Dim iArr() As Int = vIntArr5
	iArr(3) = Colors.RGB(100, 112, 0)
	Dim iArr2() As Int = vIntArr5
	iArr2(4) = Colors.RGB(0, 112, 86)
	Dim iArr3() As Int = vIntArr5
	iArr3(5) = Colors.RGB(14, 66, 112)
	Legenda0.Background = mod1.Sub155(vIntArr5(0), 25)
	Legenda1.Background = mod1.Sub155(vIntArr5(1), 25)
	Legenda2.Background = mod1.Sub155(vIntArr5(2), 25)
	Legenda0.TextColor = -16777216
	Legenda1.TextColor = -16777216
	Legenda2.TextColor = -16777216
	vStr2 = "cassa"
	Sub001("cassa", "")
	Sub016()
End Sub

Sub AddDisponibilita_CheckedChange(z As Boolean)
	If z Then
		Dim vObjectToCharSequence As Object = "ATTENZIONE ...." & CRLF & "Abilitando questo parametro ogni volta che viene venduto un articolo abilitato alla gestione di magazzino,viene analizzato l'archivio giornaliero per stabilire la disponibilità provocando un rallentamento del sistema." & CRLF & "Si desidera proseguire ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "SI", "", "NO", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			AddDisponibilita.Checked = False
			Return
		End If
		Return
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/configura.java, metodo m6… (riga 3892).
Sub Sub001(str As String, str2 As String)
	Legenda0.Visible = False
	Legenda1.Visible = False
	Legenda2.Visible = False
	PnlSottoTipo.Visible = False
	Dim z As Boolean = str <> "ricerca"
	If str = "ricerca" And str2 = "" Then
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 1
		vDlg1.Input = ""
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		vDlg1.PasswordMode = False
		vDlg1.Hint = "descrizione"
		Dim vShow As Int = vDlg1.Show("Indicare la descrizione da cercare tra i parametri (almeno 3 caratteri)", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And vDlg1.Input.Length >= 3 Then
			Sub001("ricerca", vDlg1.Input)
			v7.Enabled = True
		End If
		Return
	End If
	If str = "cassa" Or str = "ricerca" Then
		vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
		If z Or Sub002(lblIPCassa.Text, "", str2) Then
			vcustomlistviewold2.Sub001(Sub012(DipToCurrent(44), lblIPCassa, IPCassa, vIntArr5(0), "IPCassa"), DipToCurrent(44), "")
		End If
		If z Or Sub002(LblCassa.Text, "", str2) Then
			vcustomlistviewold2.Sub001(Sub012(DipToCurrent(44), LblCassa, nCassa, vIntArr5(0), "nCassa"), DipToCurrent(44), "")
		End If
		If z Or Sub002(Label7.Text, "", str2) Then
			vcustomlistviewold2.Sub001(Sub012(DipToCurrent(44), Label7, nNegozio, vIntArr5(0), "nNegozio"), DipToCurrent(44), "")
		End If
		If z Or Sub002(LblVis.Text, "", str2) Then
			vcustomlistviewold2.Sub001(Sub012(DipToCurrent(44), LblVis, IpVis, vIntArr5(0), "IpVis"), DipToCurrent(44), "")
		End If
		If z Or Sub002(LblRPI.Text, "", str2) Then
			vcustomlistviewold2.Sub001(Sub012(DipToCurrent(44), LblRPI, IpRPI, vIntArr5(0), "IpRPI"), DipToCurrent(44), "")
		End If
		If z Or Sub002(lblBila.Text, "", str2) Then
			vcustomlistviewold2.Sub001(Sub012(DipToCurrent(44), lblBila, ServerBila, vIntArr5(0), "ServerBila"), DipToCurrent(44), "")
		End If
		If z Or Sub002(gloryN.SelectedItem, "glory", str2) Then
			vcustomlistviewold2.Sub001(Sub014(DipToCurrent(44), gloryN, vIntArr5(0), "glory"), DipToCurrent(44), "")
		End If
		If z Or Sub002(TermSala.Text, "", str2) Then
			vcustomlistviewold2.Sub001(Sub008(DipToCurrent(44), TermSala, vIntArr5(0), "TermSala"), DipToCurrent(44), "")
		End If
		If z Or Sub002(TipoInterfaccia.SelectedItem, "", str2) Then
			vcustomlistviewold2.Sub001(Sub014(DipToCurrent(44), TipoInterfaccia, vIntArr5(0), "TipoInterfaccia"), DipToCurrent(44), "")
		End If
		If z Or Sub002(LblAttiva.Text, "", str2) Then
			vcustomlistviewold2.Sub001(Sub012(DipToCurrent(44), LblAttiva, CodAttivazione, vIntArr5(0), "CodAttivazione"), DipToCurrent(44), "")
		End If
		If z Or Sub002(btnImportaCodAttivazione.Text, "btnImportaCodAttivazione", str2) Then
			vcustomlistviewold2.Sub001(Sub006(DipToCurrent(44), btnImportaCodAttivazione, vIntArr5(0), "btnImportaCodAttivazione"), DipToCurrent(44), "")
		End If
		If z Or Sub002(btnImportaSB.Text, "", str2) Then
			vcustomlistviewold2.Sub001(Sub006(DipToCurrent(44), btnImportaSB, vIntArr5(0), "btnImportaSB"), DipToCurrent(44), "")
		End If
		If z Or Sub002(lblImportaBS.Text, "", str2) Then
			vcustomlistviewold2.Sub001(Sub011(DipToCurrent(44), lblImportaBS, btnImportaBasicSupport, vIntArr5(0), "btnImportaBasicSupport"), DipToCurrent(44), "")
		End If
		Sub026()
		Sub032()
	End If
	If str = "tecnici" Or str = "ricerca" Then
		If z Then
			Legenda0.Visible = True
			Legenda1.Visible = True
			Legenda2.Visible = True
			PnlSottoTipo.Visible = True
			lblInfoT.Text = "Selezionare una sottocategoria dei parametri tecnici"
			Legenda0.Text = "Procedure"
			Legenda1.Text = "Salvataggi e cancellazioni"
			Legenda2.Text = "Altri Parametri"
		End If
		If str2 = "0" Or str2 = "" Or str = "ricerca" Then
			If z Then
				vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
			End If
			If z Or Sub002(btnExportImg.Text, "btnExportImg", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), btnExportImg, vIntArr5(0), "btnExportImg"), DipToCurrent(50), "")
			End If
			If z Or Sub002(CancellaV.Text, "CancellaV", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), CancellaV, vIntArr5(0), "CancellaV"), DipToCurrent(50), "")
			End If
			If z Or Sub002(EsportaKBD.Text, "EsportaKBD", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), EsportaKBD, vIntArr5(0), "EsportaKBD"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ImportaKBD.Text, "ImportaKBD", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ImportaKBD, vIntArr5(0), "ImportaKBD"), DipToCurrent(50), "")
			End If
			If z Or Sub002(bRestore.Text, "bRestore", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), bRestore, vIntArr5(0), "bRestore"), DipToCurrent(50), "")
			End If
			If z Or Sub002(bVerificazione.Text, "bVerificazione", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), bVerificazione, vIntArr5(0), "bVerificazione"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ImportDaIngredienti.Text, "ImportDaIngredienti", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ImportDaIngredienti, vIntArr5(0), "ImportDaIngredienti"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ImportaLogoNF.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ImportaLogoNF, vIntArr5(0), "ImportaLogoNF"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ProcAuto1.Text, "ProcAuto", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ProcAuto1, vIntArr5(0), "ProcAuto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ProcAuto2.Text, "ProcAuto", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ProcAuto2, vIntArr5(0), "ProcAuto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ProcAuto3.Text, "ProcAuto", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ProcAuto3, vIntArr5(0), "ProcAuto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ProcAuto4.Text, "ProcAuto", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ProcAuto4, vIntArr5(0), "ProcAuto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ProcAuto5.Text, "ProcAuto", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ProcAuto5, vIntArr5(0), "ProcAuto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ExecSql.Text, "ExecSql", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ExecSql, vIntArr5(0), "ExecSql"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ExecSqlFE.Text, "ExecSqlFE", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ExecSqlFE, vIntArr5(0), "ExecSqlFE"), DipToCurrent(50), "")
			End If
			If z Or Sub002(NumeroTT.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), NumeroTT, vIntArr5(0), "NumeroTT"), DipToCurrent(50), "")
			End If
		End If
		If str2 = "1" Or str2 = "" Or str = "ricerca" Then
			If z Then
				vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
			End If
			If z Or Sub002(RegCancellazioni.Text, "RegCancellazioni", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), RegCancellazioni, vIntArr5(1), "RegCancellazioni"), DipToCurrent(50), "")
			End If
			If z Or Sub002(SalvaOra.Text, "SalvaOra", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), SalvaOra, vIntArr5(1), "SalvaOra"), DipToCurrent(50), "")
			End If
			If z Or Sub002(nSalva.Text, "nSalva", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), nSalva, vIntArr5(1), "nSalva"), DipToCurrent(50), "")
			End If
			If z Or Sub002(CopiaDBsuUsb.Text, "CopiaDBsuUsb", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), CopiaDBsuUsb, vIntArr5(1), "CopiaDBsuUsb"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AzzeraDati.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AzzeraDati, vIntArr5(1), "AzzeraDati"), DipToCurrent(50), "")
			End If
			If z Or Sub002(NoDatiPeriodo.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), NoDatiPeriodo, vIntArr5(1), "NoDatiPeriodo"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PercorsoAzzera.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), PercorsoAzzera, vIntArr5(1), "PercorsoAzzera"), DipToCurrent(50), "")
			End If
			If z Or Sub002(SalvaVD.SelectedItem, "", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), SalvaVD, vIntArr5(1), "SalvaVD"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Salvataggio.SelectedItem, "", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), Salvataggio, vIntArr5(1), "Salvataggio"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ServerSave.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ServerSave, vIntArr5(1), "ServerSave"), DipToCurrent(50), "")
			End If
			If z Or Sub002(UtenteSave.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), UtenteSave, vIntArr5(1), "UtenteSave"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PasswordSave.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), PasswordSave, vIntArr5(1), "PasswordSave"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PrefixFTPSave.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), PrefixFTPSave, vIntArr5(1), "PrefixFTPSave"), DipToCurrent(50), "")
			End If
		End If
		If str2 = "2" Or str2 = "" Or str = "ricerca" Then
			If z Then
				vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
			End If
			If z Or Sub002(lblRic.Text, "lblRic", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), lblRic, vIntArr5(2), "lblRic"), DipToCurrent(50), "")
			End If
			If z Or Sub002(lblFatt.Text, "lblFatt", str2) Then
				vcustomlistviewold2.Sub001(Sub007(DipToCurrent(50), lblFatt, barra, vIntArr5(2), "lblFatt"), DipToCurrent(50), "")
			End If
			If z Or Sub002(noteInFE.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), noteInFE, vIntArr5(2), "noteInFE"), DipToCurrent(50), "")
			End If
			If z Or Sub002(LastDataDocFM.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), LastDataDocFM, vIntArr5(2), "LastDataDocFM"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AttivaSezionali.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AttivaSezionali, vIntArr5(2), "AttivaSezionali"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AttivaAzzeramentoProgressivi.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AttivaAzzeramentoProgressivi, vIntArr5(2), "AttivaAzzeramentoProgressivi"), DipToCurrent(50), "")
			End If
			If z Or Sub002(lblFatt2.Text, "lblFatt2", str2) Then
				vcustomlistviewold2.Sub001(Sub007(DipToCurrent(50), lblFatt2, barra2, vIntArr5(2), "lblFatt2"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Totem.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Totem, vIntArr5(2), "Totem"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Emergenza.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Emergenza, vIntArr5(2), "Emergenza"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AttivaMP.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AttivaMP, vIntArr5(2), "AttivaMP"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AttivaKeyHTTP.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AttivaKeyHTTP, vIntArr5(2), "AttivaKeyHTTP"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AttivaInserimentoCliente.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AttivaInserimentoCliente, vIntArr5(2), "AttivaInserimentoCliente"), DipToCurrent(50), "")
			End If
			If z Or Sub002(MinutiSS.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), MinutiSS, vIntArr5(2), "MinutiSS"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PrefissoCliente.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), PrefissoCliente, vIntArr5(2), "PrefissoCliente"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PrefissoTT.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), PrefissoTT, vIntArr5(2), "PrefissoTT"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PrefissoCoupon.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), PrefissoCoupon, vIntArr5(2), "PrefissoCoupon"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ParametriInvioFE.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ParametriInvioFE, vIntArr5(2), "ParametriInvioFE"), DipToCurrent(50), "")
			End If
			If z Or Sub002(LimitiCashlogy.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), LimitiCashlogy, vIntArr5(2), "LimitiCashlogy"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ExportCorrispettivi.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ExportCorrispettivi, vIntArr5(2), "ExportCorrispettivi"), DipToCurrent(50), "")
			End If
			If z Or Sub002(UsbPath.Text, "UsbPath", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), UsbPath, vIntArr5(2), "UsbPath"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ChangeUscita.Text, "ChangeUscita", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ChangeUscita, vIntArr5(2), "ChangeUscita"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Eula.Text, "Eula", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Eula, vIntArr5(2), "Eula"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Terminalino.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Terminalino, vIntArr5(2), "Terminalino"), DipToCurrent(50), "")
			End If
			If z Or Sub002(DatiCompletiDC.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), DatiCompletiDC, vIntArr5(2), "DatiCompletiDC"), DipToCurrent(50), "")
			End If
			If z Or Sub002(WebApiIndirizzo.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), WebApiIndirizzo, vIntArr5(2), "WebApiIndirizzo"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ipDistributore.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ipDistributore, vIntArr5(2), "ipDistributore"), DipToCurrent(50), "")
			End If
			If z Or Sub002(WebApiPI.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), WebApiPI, vIntArr5(2), "WebApiPI"), DipToCurrent(50), "")
			End If
			If z Or Sub002(WebApiDatiRetailer.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), WebApiDatiRetailer, vIntArr5(2), "WebApiDatiRetailer"), DipToCurrent(50), "")
			End If
			If z Or Sub002(WebApiRagSoc.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), WebApiRagSoc, vIntArr5(2), "WebApiRagSoc"), DipToCurrent(50), "")
			End If
			If z Or Sub002(WebApiPIEsercente.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), WebApiPIEsercente, vIntArr5(2), "WebApiPIEsercente"), DipToCurrent(50), "")
			End If
			If z Or Sub002(WebApiCAPEsercente.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), WebApiCAPEsercente, vIntArr5(2), "WebApicapEsercente"), DipToCurrent(50), "")
			End If
			If z Or Sub002(EFTSM.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), EFTSM, vIntArr5(2), "EFTSM"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IPEFTSM.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), IPEFTSM, vIntArr5(2), "IPEFTSM"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PORTAEFTSM.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), PORTAEFTSM, vIntArr5(2), "PORTAEFTSM"), DipToCurrent(50), "")
			End If
			If z Or Sub002(EFTSMSCONTI.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), EFTSMSCONTI, vIntArr5(2), "EFTSMSCONTI"), DipToCurrent(50), "")
			End If
			If z Or Sub002(EFTSMStampa.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), EFTSMStampa, vIntArr5(2), "EFTSMStampa"), DipToCurrent(50), "")
			End If
			If Not(Main.vBln25) Then
			End If
			If z Or Sub002(IpEFT1.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), IpEFT1, vIntArr5(2), "IpEFT"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IpEFT2.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), IpEFT2, vIntArr5(2), "IpEFT"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IpEFT3.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), IpEFT3, vIntArr5(2), "IpEFT"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IpEFT4.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), IpEFT4, vIntArr5(2), "IpEFT"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IpEFT5.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), IpEFT5, vIntArr5(2), "IpEFT"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IpEFT6.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), IpEFT6, vIntArr5(2), "IpEFT"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IpEFT7.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), IpEFT7, vIntArr5(2), "IpEFT"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IpEFT8.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), IpEFT8, vIntArr5(2), "IpEFT"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IpEFT9.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), IpEFT9, vIntArr5(2), "IpEFT"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AttivaFE.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AttivaFE, vIntArr5(2), "attivaFE"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PausaFE.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), PausaFE, vIntArr5(2), "PausaFE"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AsyncFE.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), AsyncFE, vIntArr5(2), "AsyncFE"), DipToCurrent(50), "")
			End If
			If z Or Sub002(CopieFE.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), CopieFE, vIntArr5(2), "CopieFE"), DipToCurrent(50), "")
			End If
			If z Or Sub002(CopieFE2.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), CopieFE2, vIntArr5(2), "CopieFE2"), DipToCurrent(50), "")
			End If
			If z Or Sub002(LogMF.Text, "LogMF", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), LogMF, vIntArr5(2), "LogMF"), DipToCurrent(50), "")
			End If
			If z Or Sub002(LogVD.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), LogVD, vIntArr5(2), "LogVD"), DipToCurrent(50), "")
			End If
			If z Or Sub002(LogNF.Text, "LogNF", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), LogNF, vIntArr5(2), "LogNF"), DipToCurrent(50), "")
			End If
		End If
	End If
	If str = "stampa" Or str = "ricerca" Then
		If z Then
			Legenda0.Visible = True
			Legenda1.Visible = True
			Legenda2.Visible = True
			Legenda0.Text = "Aggiungi o Rimuovi elementi dalle stampe"
			Legenda1.Text = "Configurazione delle stampanti"
			Legenda2.Text = "Altri Parametri"
			PnlSottoTipo.Visible = True
			lblInfoT.Text = "Selezionare una sottocategoria dei parametri di stampa"
		End If
		If str2 = "0" Or str2 = "" Or str = "ricerca" Then
			If z Then
				vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
			End If
			If z Or Sub002(StampaSala.Text, "StampaSala", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), StampaSala, vIntArr5(0), "StampaSala"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Stampa66Char.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Stampa66Char, vIntArr5(0), "Stampa66Char"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IntestaNF.Text, "IntestaNF", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), IntestaNF, vIntArr5(0), "IntestaNF"), DipToCurrent(50), "")
			End If
			If z Or Sub002(OraFatt.Text, "OraFatt", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), OraFatt, vIntArr5(0), "OraFatt"), DipToCurrent(50), "")
			End If
			If z Or Sub002(StampaComande.Text, "StampaComande", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), StampaComande, vIntArr5(0), "StampaComande"), DipToCurrent(50), "")
			End If
			If z Or Sub002(StampaSposta.Text, "StampaSposta", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), StampaSposta, vIntArr5(0), "StampaSposta"), DipToCurrent(50), "")
			End If
			If z Or Sub002(RiepNFDett.Text, "RiepNFDett", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), RiepNFDett, vIntArr5(0), "RiepNFDett"), DipToCurrent(50), "")
			End If
			If z Or Sub002(RiepOnly.Text, "RiepOnly", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), RiepOnly, vIntArr5(0), "RiepOnly"), DipToCurrent(50), "")
			End If
			If z Or Sub002(TallonPremio.Text, "TallonPremio", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), TallonPremio, vIntArr5(0), "TallonPremio"), DipToCurrent(50), "")
			End If
		End If
		If str2 = "1" Or str2 = "" Or str = "ricerca" Then
			If z Then
				vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
			End If
			If z Or Sub002(StampaConto.Text, "StampaConto", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), StampaConto, vIntArr5(1), "StampaConto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(datiRicevute.Text, "datiRicevute", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), datiRicevute, vIntArr5(1), "datiRicevute"), DipToCurrent(50), "")
			End If
			If z Or Sub002(StampaFattura.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), StampaFattura, vIntArr5(1), "StampaFattura"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IpRicevute.Text, "IpRicevute", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), IpRicevute, vIntArr5(1), "IpRicevute"), DipToCurrent(50), "")
			End If
			If z Or Sub002(StampaReport.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), StampaReport, vIntArr5(1), "StampaReport"), DipToCurrent(50), "")
			End If
			If z Or Sub002(TallonSempre.Text, "TallonSempre", str2) Then
				vcustomlistviewold2.Sub001(Sub009(DipToCurrent(50), TallonSempre, NoTallon, vIntArr5(1), "TallonSempre"), DipToCurrent(50), "")
			End If
		End If
		If str2 = "2" Or str2 = "" Or str = "ricerca" Then
			If z Then
				vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
			End If
			If z Or Sub002(VerificaStampanti.Text, "VerificaStampanti", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), VerificaStampanti, vIntArr5(2), "VerificaStampanti"), DipToCurrent(50), "")
			End If
			If z Or Sub002(DisconnettiPrt.Text, "DisconnettiPrt", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), DisconnettiPrt, vIntArr5(2), "DisconnettiPrt"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AsportoOra.Text, "AsportoOra", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AsportoOra, vIntArr5(2), "AsportoOra"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AsportoAnticipo.Text, "AsportoAnticipo", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), AsportoAnticipo, vIntArr5(2), "AsportoAnticipo"), DipToCurrent(50), "")
			End If
			If z Or Sub002(StepAsporto.Text, "StepAsporto", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), StepAsporto, vIntArr5(2), "StepAsporto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(DesAsporto.Text, "DesAsporto", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), DesAsporto, vIntArr5(2), "DesAsporto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(DesPreconto.Text, "DesPreconto", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), DesPreconto, vIntArr5(2), "DesPreconto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(DesATesta.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), DesATesta, vIntArr5(2), "DesATesta"), DipToCurrent(50), "")
			End If
			If z Or Sub002(RiepNF.SelectedItem, "RiepNF", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), RiepNF, vIntArr5(2), "RiepNF"), DipToCurrent(50), "")
			End If
			If z Or Sub002(StampaNomeCli.SelectedItem, "StampaNomeCli", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), StampaNomeCli, vIntArr5(2), "StampaNomeCli"), DipToCurrent(50), "")
			End If
		End If
	End If
	If str = "utilizzo" Or str = "ricerca" Then
		If z Then
			Legenda0.Visible = True
			Legenda1.Visible = True
			Legenda2.Visible = False
			Legenda0.Text = "Parametri relativi alla vendita"
			Legenda1.Text = "Configurazioni di sistema"
			PnlSottoTipo.Visible = True
			lblInfoT.Text = "Selezionare una sottocategoria dei parametri di utilizzo"
		End If
		If str2 = "0" Or str2 = "" Or str = "ricerca" Then
			If z Then
				vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
			End If
			If z Or Sub002(ObbligoClienteF.Text, "ObbligoClienteF", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ObbligoClienteF, vIntArr5(0), "ObbligoClienteF"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ObbligoOPAvvio.Text, "ObbligoOPAvvio", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ObbligoOPAvvio, vIntArr5(0), "ObbligoOPAvvio"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ObbligoOpMovimento.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ObbligoOpMovimento, vIntArr5(0), "ObbligoOpMovimento"), DipToCurrent(50), "")
			End If
			If z Or Sub002(OpExtended.Text, "OpExtended", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), OpExtended, vIntArr5(0), "OpExtended"), DipToCurrent(50), "")
			End If
			If z Or Sub002(RiduciMsg.Text, "RiduciMsg", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), RiduciMsg, vIntArr5(0), "RiduciMsg"), DipToCurrent(50), "")
			End If
			If z Or Sub002(RicCredito.Text, "RicCredito", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), RicCredito, vIntArr5(0), "RicCredito"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ImpoSuQta.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ImpoSuQta, vIntArr5(0), "ImpoSuQta"), DipToCurrent(50), "")
			End If
			If z Or Sub002(LeggiCodLotteria.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), LeggiCodLotteria, vIntArr5(0), "LeggiCodLotteria"), DipToCurrent(50), "")
			End If
			If z Or Sub002(SoloChiusura.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), SoloChiusura, vIntArr5(0), "SoloChiusura"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ConsideraPrzIntero.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ConsideraPrzIntero, vIntArr5(0), "ConsideraPrzIntero"), DipToCurrent(50), "")
			End If
			If z Or Sub002(MantieniNoPaginati.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), MantieniNoPaginati, vIntArr5(0), "MantieniNoPaginati"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Listino2aZero.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Listino2aZero, vIntArr5(0), "Listino2aZero"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ControllaPrezziaZero.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ControllaPrezziaZero, vIntArr5(0), "ControllaPrezziaZero"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Consolida.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Consolida, vIntArr5(0), "Consolida"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ConsolidaSc.Text, "ConsolidaSc", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ConsolidaSc, vIntArr5(0), "ConsolidaSc"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ConsolidaLast.Text, "ConsolidaLast", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ConsolidaLast, vIntArr5(0), "ConsolidaLast"), DipToCurrent(50), "")
			End If
			If z Or Sub002(CassettoSubito.Text, "CassettoSubito", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), CassettoSubito, vIntArr5(0), "CassettoSubito"), DipToCurrent(50), "")
			End If
			If z Or Sub002(SuonoDaCassa.Text, "SuonoDaCassa", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), SuonoDaCassa, vIntArr5(0), "SuonoDaCassa"), DipToCurrent(50), "")
			End If
			If z Or Sub002(FatturaFMT2.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), FatturaFMT2, vIntArr5(0), "FatturaFMT2"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ArrotondaV.SelectedItem, "ArrotondaV", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), ArrotondaV, vIntArr5(0), "ArrotondaV"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ArrotondaContantiRT.SelectedItem, "ArrotondaContantiRT", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), ArrotondaContantiRT, vIntArr5(0), "ArrotondaContantiRT"), DipToCurrent(50), "")
			End If
			If z Or Sub002(OrdinamentoSc.SelectedItem, "OrdinamentoSc", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), OrdinamentoSc, vIntArr5(0), "OrdinamentoSc"), DipToCurrent(50), "")
			End If
			If z Or Sub002(lblMaxImpo.Text, "lblMaxImpo", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), lblMaxImpo, vIntArr5(0), "lblMaxImpo"), DipToCurrent(50), "")
			End If
			If z Or Sub002(FondoCassaAuto.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), FondoCassaAuto, vIntArr5(0), "FondoCassaAuto"), DipToCurrent(50), "")
			End If
		End If
		If str2 = "1" Or str2 = "" Or str = "ricerca" Then
			If z Then
				vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
			End If
			If z Or Sub002(GestioneTabacchi.Text, "GestioneTabacchi", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), GestioneTabacchi, vIntArr5(1), "GestioneTabacchi"), DipToCurrent(50), "")
			End If
			If z Or Sub002(TipoImpTabacchi.SelectedItem, "TipoImpTabacchi", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), TipoImpTabacchi, vIntArr5(1), "TipoImpTabacchi"), DipToCurrent(50), "")
			End If
			If z Or Sub002(MargineTabacchi.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), MargineTabacchi, vIntArr5(1), "MargineTabacchi"), DipToCurrent(50), "")
			End If
			If z Or Sub002(GestioneSpiagge.Text, "GestioneSpiagge", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), GestioneSpiagge, vIntArr5(1), "GestioneSpiagge"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Listino.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), Listino, vIntArr5(1), "Listino"), DipToCurrent(50), "")
			End If
			If z Or Sub002(QuantiPunti.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), QuantiPunti, vIntArr5(1), "QuantiPunti"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Happy.Text, "Happy", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), Happy, vIntArr5(1), "Happy"), DipToCurrent(50), "")
			End If
			If z Or Sub002(RepartoGV.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), RepartoGV, vIntArr5(1), "RepartoGV"), DipToCurrent(50), "")
			End If
			If z Or Sub002(InizioGiorno.Text, "InizioGiorno", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), InizioGiorno, vIntArr5(1), "InizioGiorno"), DipToCurrent(50), "")
			End If
			If z Or Sub002(SetTestoFattura.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), SetTestoFattura, vIntArr5(1), "SetTestoFattura"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PaginaPagamenti.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), PaginaPagamenti, vIntArr5(1), "PaginaPagamenti"), DipToCurrent(50), "")
			End If
			If z Or Sub002(bSetDefaultSedie.Text, "bSetDefaultSedie", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), bSetDefaultSedie, vIntArr5(1), "bSetDefaultSedie"), DipToCurrent(50), "")
			End If
			If z Or Sub002(bAltezzaVariazioni.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), bAltezzaVariazioni, vIntArr5(1), "bAltezzaVariazioni"), DipToCurrent(50), "")
			End If
			If z Or Sub002(NumeroScontriniST.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), NumeroScontriniST, vIntArr5(1), "NumeroScontriniST"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PrenotaGiorni.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), PrenotaGiorni, vIntArr5(1), "PrenotaGiorni"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PrenotaGiorniApertura.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), PrenotaGiorniApertura, vIntArr5(1), "PrenotaGiorniApertura"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ColonneVarianti.SelectedItem, "", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), ColonneVarianti, vIntArr5(1), "ColonneVarianti"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ArticoliZero.SelectedItem, "", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), ArticoliZero, vIntArr5(1), "ArticoliZero"), DipToCurrent(50), "")
			End If
			If z Or Sub002(TipoTastiera.SelectedItem, "TipoTastiera", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), TipoTastiera, vIntArr5(1), "TipoTastiera"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IvaDefault.SelectedItem, "IvaDefault", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), IvaDefault, vIntArr5(1), "IvaDefault"), DipToCurrent(50), "")
			End If
			If z Or Sub002(PagamentoPrep.SelectedItem, "PagamentoPrep", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), PagamentoPrep, vIntArr5(1), "PagamentoPrep"), DipToCurrent(50), "")
			End If
			If z Or Sub002(RootDateTime.Text, "RootDateTime", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), RootDateTime, vIntArr5(1), "RootDateTime"), DipToCurrent(50), "")
			End If
			If z Or Sub002(DataOraNoRoot.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), DataOraNoRoot, vIntArr5(1), "DataOraNoRoot"), DipToCurrent(50), "")
			End If
			If z Or Sub002(lblUserS.Text, "mUserS", str2) Then
				vcustomlistviewold2.Sub001(Sub011(DipToCurrent(50), lblUserS, mUserS, vIntArr5(1), "mUserS"), DipToCurrent(50), "")
			End If
			If z Or Sub002(lblPwdS.Text, "mUserS", str2) Then
				vcustomlistviewold2.Sub001(Sub011(DipToCurrent(50), lblPwdS, mPwdS, vIntArr5(1), "mUserS"), DipToCurrent(50), "")
			End If
		End If
	End If
	If str = "risto" Or str = "ricerca" Then
		If z Then
			Legenda0.Visible = True
			Legenda1.Visible = True
			Legenda2.Visible = False
			Legenda0.Text = "Parametri legati ai tavoli o ai turni"
			Legenda1.Text = "Altri parametri"
			PnlSottoTipo.Visible = True
			lblInfoT.Text = "Selezionare una sottocategoria dei parametri di ristorazione"
		End If
		If str2 = "0" Or str2 = "" Or str = "ricerca" Then
			If z Then
				vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
			End If
			If z Or Sub002(Turni.Text, "Turni", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Turni, vIntArr5(0), "Turni"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ControlloTurni.Text, "ControlloTurni", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ControlloTurni, vIntArr5(0), "ControlloTurni"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AvantiTurnoAuto.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AvantiTurnoAuto, vIntArr5(0), "AvantiTurnoAuto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Turno1Sempre.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Turno1Sempre, vIntArr5(0), "Turno1Sempre"), DipToCurrent(50), "")
			End If
			If z Or Sub002(NoForceCoperti.Text, "NoForceCoperti", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), NoForceCoperti, vIntArr5(0), "NoForceCoperti"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AttivaNumTavolo.Text, "AttivaNumTavolo", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AttivaNumTavolo, vIntArr5(0), "AttivaNumTavolo"), DipToCurrent(50), "")
			End If
			If z Or Sub002(Sottoconti.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Sottoconti, vIntArr5(0), "Sottoconti"), DipToCurrent(50), "")
			End If
			If z Or Sub002(OpObbligatorio.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), OpObbligatorio, vIntArr5(0), "OpObbligatorio"), DipToCurrent(50), "")
			End If
		End If
		If str2 = "1" Or str2 = "" Or str = "ricerca" Then
			If z Then
				vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
			End If
			If z Or Sub002(CheckVarianti.Text, "CheckVarianti", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), CheckVarianti, vIntArr5(1), "CheckVarianti"), DipToCurrent(50), "")
			End If
			If z Or Sub002(GestCoperti2.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), GestCoperti2, vIntArr5(1), "GestCoperti2"), DipToCurrent(50), "")
			End If
			If z Or Sub002(VarAutoCP.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), VarAutoCP, vIntArr5(1), "VarAutoCP"), DipToCurrent(50), "")
			End If
			If z Or Sub002(VisualizzaVariazioni.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), VisualizzaVariazioni, vIntArr5(1), "VisualizzaVariazioni"), DipToCurrent(50), "")
			End If
			If z Or Sub002(OrdinaInserimentoVariazioni.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), OrdinaInserimentoVariazioni, vIntArr5(1), "OrdinaInserimentoVariazioni"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ObbligoOp.Text, "ObbligoOp", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ObbligoOp, vIntArr5(1), "ObbligoOp"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AddDisponibilita.Text, "AddDisponibilita", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AddDisponibilita, vIntArr5(1), "AddDisponibilita"), DipToCurrent(50), "")
			End If
			If z Or Sub002(AzzeraAsporto.Text, "AzzeraAsporto", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), AzzeraAsporto, vIntArr5(1), "AzzeraAsporto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ChiediNAsporto.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), ChiediNAsporto, vIntArr5(1), "ChiediNAsporto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(IncassoOperatori.Text, "IncassoOperatori", str2) Then
				vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), IncassoOperatori, vIntArr5(1), "IncassoOperatori"), DipToCurrent(50), "")
			End If
			If z Or Sub002(FrazionaConImporto.SelectedItem, "", str2) Then
				vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), FrazionaConImporto, vIntArr5(1), "FrazionaConImporto"), DipToCurrent(50), "")
			End If
			If z Or Sub002(TipoFrazionamentoVariazioni.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), TipoFrazionamentoVariazioni, vIntArr5(1), "TipoFrazionamentoVariazioni"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ValorizzazionePrezzoFrazione.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ValorizzazionePrezzoFrazione, vIntArr5(1), "ValorizzazionePrezzoFrazione"), DipToCurrent(50), "")
			End If
			If z Or Sub002(WebSospendiTavolo.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), WebSospendiTavolo, vIntArr5(1), "WebSospendiTavolo"), DipToCurrent(50), "")
			End If
			If z Or Sub002(MaxImpTavolo.Text, "MaxImpTavolo", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), MaxImpTavolo, vIntArr5(1), "MaxImpTavolo"), DipToCurrent(50), "")
			End If
			If z Or Sub002(MinTavoloLento.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), MinTavoloLento, vIntArr5(1), "MinTavoloLento"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ListPoco.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ListPoco, vIntArr5(1), "ListPoco"), DipToCurrent(50), "")
			End If
			If z Or Sub002(ListMolto.Text, "", str2) Then
				vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ListMolto, vIntArr5(1), "ListMolto"), DipToCurrent(50), "")
			End If
		End If
	End If
	If str = "visualizzazione" Or str = "ricerca" Then
		If z Then
			vcustomlistviewold2.Sub001(Sub010(DipToCurrent(10), " "), DipToCurrent(10), "")
		End If
		If z Or Sub002(Tema2.Text, "Tema2", str2) Then
			vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Tema2, vIntArr5(0), "Tema2"), DipToCurrent(50), "")
		End If
		If z Then
			Dim vTmp As Panel = Sub006(DipToCurrent(77), TipoLayout, vIntArr5(0), "TipoLayout")
			vcustomlistviewold2.Sub001(vTmp, DipToCurrent(77), "")
			TipoLayout.Width = DipToCurrent(77)
			TipoLayout.Left = PerXToCurrent(25) - DipToCurrent(38)
			TipoLayout.TextColor = -1
			mod1.Sub161(TipoLayout, 6)
			Dim buttonWrapper2 As Button
			buttonWrapper2.Initialize("SfondoBTN")
			buttonWrapper2.Text = "Colore di sfondo"
			buttonWrapper2.Background = mod1.Sub155(-16776961, 25)
			buttonWrapper2.TextColor = -1
			buttonWrapper2.TextSize = 15
			buttonWrapper2.Gravity = Bit.Or(16, 1)
			vPnl2.RemoveView
			vTmp.AddView(vPnl2, PerXToCurrent(20) - DipToCurrent(38), DipToCurrent(0), PerXToCurrent(10) + DipToCurrent(77), DipToCurrent(77))
			vTmp.AddView(buttonWrapper2, PerXToCurrent(30) + DipToCurrent(77), DipToCurrent(0), PerXToCurrent(10), DipToCurrent(77))
			vPnl2.Color = mod1.Sub092(Main.v_sfondo)
			mod1.Sub161(vPnl2, 0)
			Sub035()
		End If
		If z Or Sub002(Icone2.Text, "Icone2", str2) Then
			vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), Icone2, vIntArr5(0), "Icone2"), DipToCurrent(50), "")
		End If
		If z Or Sub002(TastiOmbreggiati.Text, "TastiOmbreggiati", str2) Then
			vcustomlistviewold2.Sub001(Sub008(DipToCurrent(50), TastiOmbreggiati, vIntArr5(0), "TastiOmbreggiati"), DipToCurrent(50), "")
		End If
		If z Or Sub002(FontSizeC.SelectedItem, "FontSizeC", str2) Then
			vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), FontSizeC, vIntArr5(0), "FontSizeC"), DipToCurrent(50), "")
		End If
		If z Or Sub002(bSetFont.Text, "bSetFont", str2) Then
			vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), ImgPersonalizzate, vIntArr5(0), "ImgPersonalizzate"), DipToCurrent(50), "")
		End If
		If z Or Sub002(bSetFont.Text, "bSetFont", str2) Then
			vcustomlistviewold2.Sub001(Sub006(DipToCurrent(50), bSetFont, vIntArr5(0), "bSetFont"), DipToCurrent(50), "")
		End If
		If z Or Sub002(Tema.SelectedItem, "Tema", str2) Then
			vcustomlistviewold2.Sub001(Sub014(DipToCurrent(50), Tema, vIntArr5(0), "Tema"), DipToCurrent(50), "")
		End If
		If z Then
			vcustomlistviewold2.Sub001(Sub013(DipToCurrent(50), SeekBar1), DipToCurrent(50), "")
		End If
	End If
	Sub025(Null, False)
End Sub

Sub AddImg_Click
	If File.Exists(mod1.vStr4, "LogoPrg.jpg") Then
		File.Delete(mod1.vStr4, "LogoPrg.jpg")
	End If
	ImgLogo.Visible = False
	Dim fileDialog As FileDialog
	fileDialog.TextColor = -7829368
	fileDialog.FastScroll = True
	fileDialog.FileFilter = ".jpg"
	If Main.v_usbpath <> "" Then
		fileDialog.FilePath = Main.v_usbpath
	Else
		fileDialog.FilePath = mod1.vStr4
	End If
	Dim vObjectToCharSequence As Object = "Selezionare il percorso per il logo (dimensione consigliata: 300 x 150)"
	Dim vShow As Int = fileDialog.Show(vObjectToCharSequence, "OK", "Annulla", "", Main.vBmp1)
	If vShow = -3 Then
		Return
	End If
	Dim filePath As String = fileDialog.FilePath
	Dim chosenName As String = fileDialog.ChosenName
	If chosenName = "" Then
		mod1.Sub081
		Return
	End If
	If Not(File.Exists(filePath, "")) Then
		Dim vObjectToCharSequence2 As Object = "Il percorso " & filePath & " non è stato trovato"
		Dim vObjectToCharSequence3 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence2, vObjectToCharSequence3, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	If Not(File.Exists(filePath, chosenName)) Then
		Dim vObjectToCharSequence4 As Object = "Il file " & chosenName & " non è stato trovato"
		Dim vObjectToCharSequence5 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence4, vObjectToCharSequence5, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	Dim vLoadBitmap As Bitmap = LoadBitmap(filePath, chosenName)
	If vLoadBitmap.Height > 150 Then
		Dim vObjectToCharSequence6 As Object = "L'altezza della bitmap è maggiore di 150"
		Dim vObjectToCharSequence7 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence6, vObjectToCharSequence7, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	If vLoadBitmap.Width > 300 Then
		Dim vObjectToCharSequence8 As Object = "La larghezza della bitmap è maggiore di 300"
		Dim vObjectToCharSequence9 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence8, vObjectToCharSequence9, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	ImgLogo.Visible = True
	ImgLogo.Bitmap = LoadBitmap(filePath, chosenName)
	File.Copy(filePath, chosenName, mod1.vStr4, "LogoPrg.jpg")
	mod1.Sub081
End Sub

Sub AsportoAnticipo_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = 0
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire quanti minuti prima del ritiro deve essere stampata la comanda dell'asporto", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number < 100 And numberDialog.Number > 0 Then
			AsportoAnticipo.Text = "Stampa Asporto " & numberDialog.Number & " minuti prima del ritiro"
			AsportoAnticipo.Tag = numberDialog.Number
			mod1.Sub081
			Return
		End If
		AsportoAnticipo.Text = "Stampa Asporto Immediatamente"
		AsportoAnticipo.Tag = 0
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub AsportoOra_CheckedChange(z As Boolean)
	Sub025(AsportoAnticipo, z)
End Sub

Sub AsyncFE_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = AsyncFE.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il numero di secondi di attesa per ottenede l'esito di invio della Fattura elettronica  (0 = NESSUNA ATTESA)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number = 0 Then
			AsyncFE.Text = "Il programma non attende la stampa dell'esito invio Fattura elettronica "
		Else
			AsyncFE.Text = "Numero di secondi di attesa dell'esito invio Fattura elettronica:" & numberDialog.Number
		End If
		AsyncFE.Tag = numberDialog.Number
		Return
	End If
End Sub

Sub Attiva_Click
	mod1.vStr2 = "Sub attiva_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		vCur1.Position = vTmp
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(2)
		vCur1.Position = getpanel.GetView(5).Text
		Dim vGetInt As Int = vCur1.GetInt("codice")
		If 1 = labelWrapper.Tag Then
			labelWrapper.Tag = 0
			labelWrapper.Background = mod1.Sub155(-65536, 25)
			Main.vSql1.ExecNonQuery("update stampe set flgattiva = 0 where codice = " & vGetInt)
		Else
			labelWrapper.Tag = 1
			labelWrapper.Background = mod1.Sub155(-16711936, 25)
			Main.vSql1.ExecNonQuery("update stampe set flgattiva = 1 where codice = " & vGetInt)
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Attivacf_Click
	mod1.vStr2 = "Sub attivacf_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		vCur1.Position = vTmp
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(1)
		vCur1.Position = getpanel.GetView(5).Text
		Dim vGetInt As Int = vCur1.GetInt("codice")
		If 1 = labelWrapper.Tag Then
			labelWrapper.Tag = 0
			labelWrapper.Background = mod1.Sub155(-65536, 25)
			Main.vSql1.ExecNonQuery("update stampe set flgchiusura = 0 where codice = " & vGetInt)
		Else
			labelWrapper.Tag = 1
			labelWrapper.Background = mod1.Sub155(-16711936, 25)
			Main.vSql1.ExecNonQuery("update stampe set flgchiusura = 1 where codice = " & vGetInt)
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub AttivaFE_CheckedChange(z As Boolean)
	Sub025(PausaFE, z)
	Sub025(AsyncFE, z)
	Sub025(CopieFE, z)
	Sub025(CopieFE2, z)
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub AttivaKeyHTTP_CheckedChange(checked As Boolean)
	Dim limit33 As Int
	Dim limit9 As Int
	Dim step33 As Int
	Dim step9 As Int
	Dim tmpcp As Cursor
	Dim lstrollback As List
	Dim berr As Boolean
	Dim sres As String
	Dim x2 As Int
	Dim j As httpjob
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				Continue
			Case 1
				rsState = 6
				Dim z As Boolean = checked
				If z <> Main.v_attivakeyhttp Then
					Continue
				Else
					rsState = 3
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 6
				Return
			Case 6
				rsState = 7
				Continue
			Case 7
				rsState = 12
				Dim vObjectToCharSequence As Object = "Attenzione modificando questo parametro verranno aggiornati immediatamente anche i palmari (verificare che siano accesi e in rete)." & SmartStringFormatter("", CRLF) & "Si desidera proseguire ? " & SmartStringFormatter("", CRLF) & "(Il programma verrà chiuso automaticamente)"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Ok", "", "Annulla", Main.vBmp1)
				If vMsgbox2 = -1 Then
					Continue
				Else
					rsState = 9
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 9
			Case 9
				rsState = 12
				Return
			Case 12
				rsState = 13
				'tmpcp = Cursor
				Dim cursorWrapper As Cursor
				tmpcp = Main.vSql1.ExecQuery("Select Serial,IP from Palmari where Attivo = 1 order by Serial")
				Continue
			Case 13
				rsState = 51
				If tmpcp.RowCount <= 0 Then
					Continue
				Else
					rsState = 15
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 15
			Case 15
				rsState = 16
				'lstrollback = List
				lstrollback.Initialize
				berr = False
				sres = ""
				Continue
			Case 16
				rsState = 37
				step9 = 1
				limit9 = tmpcp.RowCount - 1
				x2 = 0
				rsState = 52
				Continue
			Case 18
				rsState = 19
				sres = ""
				tmpcp.Position = x2
				'j = httpjob
				j.Initialize("WebAttivaC", Me)
				Dim httpjobVar As httpjob = j
				httpjobVar.Sub021("http://" & tmpcp.GetString("IP") & ":12315/attivac_" & IIf(checked, "1", "0") & "/?mk=" & mod1.Sub082, "")
				Wait For (j) Jobdone (wf54_0 As httpjob)
				rsState = 54
				Continue
			Case 19
				rsState = 30
				If Not(j.vBln1) Then
					rsState = 21
					Continue
				Else
					rsState = 23
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 21
			Case 21
				rsState = 30
				berr = True
				Continue
			Case 23
				rsState = 24
				sres = j.Sub012
				Continue
			Case 24
				rsState = 29
				If sres <> "OK" Then
					rsState = 26
					Continue
				Else
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 26
			Case 26
				rsState = 29
				berr = True
				Continue
			Case 29
				rsState = 30
				Continue
			Case 30
				rsState = 31
				j.Sub024
				Continue
			Case 31
				rsState = 36
				If berr Then
					rsState = 33
					Continue
				Else
					rsState = 35
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 33
			Case 33
				rsState = 36
				rsState = 37
				Continue
			Case 35
				rsState = 36
				Dim list As List = lstrollback
				list.Add("http://" & tmpcp.GetString("IP") & ":12315/attivac_" & IIf(checked, "0", "1") & "/?mk=" & mod1.Sub082)
				Continue
			Case 36
				rsState = 53
				Continue
			Case 37
				rsState = 50
				If berr Then
					rsState = 39
					Continue
				Else
					rsState = 49
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 39
			Case 39
				rsState = 40
				Dim vObjectToCharSequence3 As Object = "Si sono verificati errori durante la comunicazione con il palmare " & SmartStringFormatter("", tmpcp.GetString("Serial")) & "" & SmartStringFormatter("", CRLF) & "" & SmartStringFormatter("", sres) & ""
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				AttivaKeyHTTP.Checked = Not(checked)
				Continue
			Case 40
				rsState = 47
				If lstrollback.Size <= 0 Then
					Continue
				Else
					rsState = 42
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 42
			Case 42
				rsState = 43
				Continue
			Case 43
				rsState = 46
				step33 = 1
				limit33 = lstrollback.Size - 1
				x2 = 0
				rsState = 55
				Continue
			Case 45
				rsState = 56
				'j = httpjob
				j.Initialize("WebAttivaC", Me)
				j.Sub021(lstrollback.Get(x2), "")
				Wait For (j) Jobdone (wf57_0 As httpjob)
				rsState = 57
				Continue
			Case 46
				rsState = 47
				Continue
			Case 47
				rsState = 50
				Continue
			Case 49
				rsState = 50
				conf_ok_click()
				Continue
			Case 50
				rsState = 51
				Continue
			Case 51
				rsState = -1
				tmpcp.Close
				Continue
			Case 52
				rsState = 37
				If (step9 > 0 And x2 <= limit9) Or (step9 < 0 And x2 >= limit9) Then
					rsState = 18
					Continue
				End If
				Continue
			Case 53
				rsState = 52
				x2 = x2 + 0 + step9
				Continue
			Case 54
				rsState = 19
				j = wf54_0
				Continue
			Case 55
				rsState = 46
				If (step33 > 0 And x2 <= limit33) Or (step33 < 0 And x2 >= limit33) Then
					rsState = 45
					Continue
				End If
				Continue
			Case 56
				rsState = 55
				x2 = x2 + 0 + step33
				Continue
			Case 57
				rsState = 56
				j = wf57_0
				j.Sub024
				Continue
		End Select
	Loop
End Sub

Sub jobdone(httpjobVar As httpjob)
End Sub

Sub Attivamail_Click
	mod1.vStr2 = "Sub attivamail_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		vCur1.Position = vTmp
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(3)
		vCur1.Position = getpanel.GetView(5).Text
		Dim vGetInt As Int = vCur1.GetInt("codice")
		If 1 = labelWrapper.Tag Then
			labelWrapper.Tag = 0
			labelWrapper.Background = mod1.Sub155(-65536, 25)
			Main.vSql1.ExecNonQuery("update stampe set flgmail = 0 where codice = " & vGetInt)
		Else
			labelWrapper.Tag = 1
			labelWrapper.Background = mod1.Sub155(-16711936, 25)
			Main.vSql1.ExecNonQuery("update stampe set flgmail = 1 where codice = " & vGetInt)
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Attivamailc_Click
	mod1.vStr2 = "Sub attivamail_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		vCur1.Position = vTmp
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(4)
		vCur1.Position = getpanel.GetView(5).Text
		Dim vGetInt As Int = vCur1.GetInt("codice")
		If 1 = labelWrapper.Tag Then
			labelWrapper.Tag = 0
			labelWrapper.Background = mod1.Sub155(-65536, 25)
			Main.vSql1.ExecNonQuery("update stampe set flgmailc = 0 where codice = " & vGetInt)
		Else
			labelWrapper.Tag = 1
			labelWrapper.Background = mod1.Sub155(-16711936, 25)
			Main.vSql1.ExecNonQuery("update stampe set flgmailc = 1 where codice = " & vGetInt)
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Attivamailcopia_Click
	mod1.vStr2 = "Sub attivamail_Click"
	Try
		Dim vTmp As Int = vcustomlistviewold1.Sub007(Sender)
		vCur1.Position = vTmp
		Dim getpanel As Panel = vcustomlistviewold1.getpanel(vTmp)
		Dim labelWrapper As Label = getpanel.GetView(6)
		vCur1.Position = getpanel.GetView(5).Text
		Dim vGetInt As Int = vCur1.GetInt("codice")
		If 1 = labelWrapper.Tag Then
			labelWrapper.Tag = 0
			labelWrapper.Background = mod1.Sub155(-65536, 25)
			Main.vSql1.ExecNonQuery("update stampe set flgcopia = 0 where codice = " & vGetInt)
		Else
			If UsbPath.Tag = "" Then
				Dim vObjectToCharSequence As Object = "Inserire il percorso per la chiave USB in Flag1"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Return
			End If
			labelWrapper.Tag = 1
			labelWrapper.Background = mod1.Sub155(-16711936, 25)
			Main.vSql1.ExecNonQuery("update stampe set flgcopia = 1 where codice = " & vGetInt)
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub AttivaMP_CheckedChange(z As Boolean)
	If z Then
		paginapagamenti_click()
		If 0 = PaginaPagamenti.Tag Then
			Dim vObjectToCharSequence As Object = "Per abilitare il motore promozionale è obbligatorio selezionare una pagina per il pagamento."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			AttivaMP.Checked = False
			Return
		End If
		Return
	End If
End Sub

Sub AttivaSezionali_CheckedChange(z As Boolean)
	If Not(z) And LastDataDocFM.Checked Then
		Dim vObjectToCharSequence As Object = "Premendo 'Ok' verrà disattivato anche il flag 'utilizza la data dell'ultimo documento come data di emissione della fattura FM' ." & CRLF & "Si desidera proseguire ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "SI", "", "NO", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			AttivaSezionali.Checked = True
			Return
		End If
		LastDataDocFM.Checked = False
	End If
	Sub025(barra2, z)
	Sub025(lblFatt2, z)
End Sub

Sub AttivaTerminale_CheckedChange(z As Boolean)
	PanelRemote.Visible = AttivaTerminale.Checked
	SoloVenduto.Visible = AttivaTerminale.Checked
End Sub

Sub AzzeraDati_CheckedChange(z As Boolean)
	Sub025(PercorsoAzzera, z)
	Sub025(NoDatiPeriodo, z And PercorsoAzzera.Tag <> "")
End Sub

Sub bAltezzaVariazioni_Click
	Dim number As Int
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = 0
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire l'altezza della riga delle variazioni (min.Anon_30 max 200) ", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 And number = numberDialog.Number >= 30 And number <= 200 Then
		bAltezzaVariazioni.Text = "Altezza riga Variazioni: " & number & " pixel"
		bAltezzaVariazioni.Tag = number
	End If
	mod1.Sub081
End Sub

Sub Barra_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = barra.Text
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Barra per fattura"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire la barra per la fattura (Max 10 caratteri)", Main.vStr8, "OK", "", "ANNULLA", Main.vBmp1)
	If vShow = -1 Then
		Dim input As String = vDlg1.Input
		barra.Text = Main.vccefdll1.Sub022(input, 10).Replace("/", "").Replace("\", "").Replace(">", "").Replace("<", "").Replace(":", "").Replace("*", "").Replace("?", "").Replace(QUOTE, "").Replace("@", "").Replace("_", "").Replace(" ", "-").Replace("YYYY", "yyyy")
		Return
	End If
End Sub

Sub Barra2_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = barra2.Text
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Barra per fattura fine mese"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire la barra per la fattura fine mese (Max 10 caratteri)", Main.vStr8, "OK", "", "ANNULLA", Main.vBmp1)
	If vShow = -1 Then
		Dim input As String = vDlg1.Input
		barra2.Text = Main.vccefdll1.Sub022(input, 10).Replace("/", "").Replace("\", "").Replace(">", "").Replace("<", "").Replace(":", "").Replace("*", "").Replace("?", "").Replace(QUOTE, "").Replace("@", "").Replace("_", "").Replace(" ", "-").Replace("YYYY", "yyyy")
		Return
	End If
End Sub

Sub bDatiFE_Click
	Try
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from FEDatiTX")
		cursorWrapper2.Position = 0
		spTipoEser.SelectedIndex = cursorWrapper2.GetInt("TipoEser")
		spRegFiscEser.SelectedIndex = cursorWrapper2.GetInt("RegFiscEser")
		btnNazioneEser.Tag = cursorWrapper2.GetString("NazioneEser")
		If btnNazioneEser.Tag = "" Then
			btnNazioneEser.Tag = "IT"
		End If
		btnNazioneEser.Text = "Nazione:" & Sub020(btnNazioneEser.Tag)
		btnIDPaeseTX.Tag = cursorWrapper2.GetString("IDPaeseTX")
		If btnIDPaeseTX.Tag = "" Then
			btnIDPaeseTX.Tag = "IT"
		End If
		btnIDPaeseTX.Text = "Nazione:" & Sub020(btnIDPaeseTX.Tag)
		edtDenEser.Text = cursorWrapper2.GetString("DenEser")
		edtNomeEser.Text = cursorWrapper2.GetString("NomeEser")
		edtCognomeEser.Text = cursorWrapper2.GetString("CognomeEser")
		edtViaEser.Text = cursorWrapper2.GetString("ViaEser")
		edtCapEser.Text = cursorWrapper2.GetString("CapEser")
		edtCittaEser.Text = cursorWrapper2.GetString("CittaEser")
		edtProvinciaEser.Text = cursorWrapper2.GetString("ProvinciaEser")
		edtCFEser.Text = cursorWrapper2.GetString("CFEser")
		edtIDCodiceTX.Text = cursorWrapper2.GetString("CodiceTX")
		edtPIVAEser.Text = cursorWrapper2.GetString("PIVAEser")
		edtUfficioREA.Text = cursorWrapper2.GetString("UfficioREA")
		edtNumeroREA.Text = cursorWrapper2.GetString("NumeroREA")
		edtCapSocREA.Text = cursorWrapper2.GetString("CapSocREA")
		spSocUnicoREA.SelectedIndex = cursorWrapper2.GetInt("SocUnicoREA")
		spStatoLiquidazioneREA.SelectedIndex = cursorWrapper2.GetInt("StatoLiquidazioneREA")
		edtTerzoDenEser.Text = cursorWrapper2.GetString("TerzoDenEser")
		edtTerzoNomeEser.Text = cursorWrapper2.GetString("TerzoNomeEser")
		edtTerzoCognomeEser.Text = cursorWrapper2.GetString("TerzoCognomeEser")
		edtTerzoIDCodiceTX.Text = cursorWrapper2.GetString("TerzoCodiceTX")
		edtTerzoCFEser.Text = cursorWrapper2.GetString("TerzoCFEser")
		btnTerzoIDPaeseTX.Tag = cursorWrapper2.GetString("TerzoIDPaeseTX")
		If btnTerzoIDPaeseTX.Tag = "" Then
			btnTerzoIDPaeseTX.Tag = "IT"
		End If
		btnTerzoIDPaeseTX.Text = "Nazione:" & Sub020(btnTerzoIDPaeseTX.Tag)
		spTerzoTipoEser.SelectedIndex = cursorWrapper2.GetInt("TerzoTipoEser")
		pnlDatiEser.Visible = True
		mod1.Sub161(pnlDatiEser, 9)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub bFiltroFlag_Click
	Dim buttonWrapper As Button = Sender
	If vcustomlistviewold2.IsInitialized And vcustomlistviewold2.Sub008 > 0 Then
		vcustomlistviewold2.Sub012(0)
	End If
	vcustomlistviewold2.Sub004
	bTecnici.Background = mod1.Sub155(-16776961, 25)
	bStampa.Background = mod1.Sub155(-16776961, 25)
	bCassa.Background = mod1.Sub155(-16776961, 25)
	bVisualizzazione.Background = mod1.Sub155(-16776961, 25)
	bRicerca.Background = mod1.Sub155(-16711936, 25)
	bRistorazione.Background = mod1.Sub155(-16776961, 25)
	bUtilizzo.Background = mod1.Sub155(-16776961, 25)
	Dim vObjectToString As String = buttonWrapper.Tag
	vStr2 = vObjectToString
	Sub001(vObjectToString, "")
	buttonWrapper.Background = mod1.Sub155(-65536, 25)
End Sub

Sub Bhelp_Click
	Dim vObjectToCharSequence As Object = vMap1.GetDefault(Sender.Tag, "Help disponibile nelle prossime versioni ...").Replace("#", CRLF)
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	mod1.Sub081
End Sub

Sub BIntestaF_Click
	mod1.Sub161(pNF, 0)
	pNF.Visible = False
End Sub

Sub BIntestaNF_Click
	mod1.Sub161(pNF, 7)
	pNF.Visible = True
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub bRestore_Click
	Dim group41 As IterableList
	Dim groupLen41 As Int
	Dim index41 As Int
	Dim iriprn As Int
	Dim iriprm As Int
	Dim stesto As String
	Dim ret As Int
	Dim res As Int
	Dim storage As externalstorage
	Dim sfilelist As List
	Dim f As externalfile
	Dim m As Int
	Dim fres As externalfile
	Dim in_ As InputStream
	Dim out As OutputStream
	Dim myzip As ArchiverForB4A
	Dim fd As FileDialog
	Dim rsState As Int = 0
	Dim rsCatchState As Int = 0
	Do While True
		Try
			Select rsState
				Case -1
					Return
				Case 0
					rsState = 1
					mod1.vStr2 = "Sub StartFTP"
					Continue
				Case 1
					rsState = 117
					rsCatchState = 116
					rsState = 3
					Continue
				Case 3
					rsState = 4
					rsCatchState = 116
					iriprn = Rnd(1000, 1999)
					iriprm = Rnd(2000, 2999)
					stesto = "Digitare un codice numerico per eseguire il ripristino:" & CRLF & CRLF & SmartStringFormatter("", iriprn) & " per ripristinare il DB" & CRLF & CRLF & SmartStringFormatter("", iriprm) & " per ripristinare il DB senza le configurazioni di InvioFE" & CRLF
					Dim inputDialog2 As InputDialog = vDlg1
					vDlg1.InputType = 2
					vDlg1.Input = ""
					vDlg1.PasswordMode = False
					vDlg1.Hint = "Inserire il codice"
					vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
					ret = -3
					Dim str As String = stesto
					ret = vDlg1.Show(str, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
					Continue
				Case 4
					rsState = 9
					Dim i As Int = ret
					If i = -1 Then
						Continue
					Else
						rsState = 6
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 6
				Case 6
					rsState = 9
					Return
				Case 9
					rsState = 10
					Continue
				Case 10
					rsState = 13
					If vDlg1.Input <> iriprm Then
						If vDlg1.Input <> iriprn Then
							rsState = 12
							Continue
						Else
							Continue
						End If
					Else
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 12
				Case 12
					rsState = 13
					Dim vObjectToCharSequence As Object = "Il codice inserito non è corretto"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					Return
				Case 13
					rsState = 14
					vBln2 = (vDlg1.Input = iriprm)
					res = 0
					Continue
				Case 14
					rsState = 62
					If Main.v_salvataggio = 0 Then
						rsState = 16
						Continue
					Else
						If Main.v_salvataggio = 7 Then
							rsState = 18
							Continue
						Else
							rsState = 61
							Continue
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 16
				Case 16
					rsState = 62
					Dim vObjectToCharSequence3 As Object = "Indicare dove trovare il salvataggio da ripristinare."
					Dim vObjectToCharSequence4 As Object = Main.vStr8
					Dim sb As String = "FTP " & Main.vStr1 & ""
					res = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, sb, "Percorso file", "Annulla", Main.vBmp1)
					Continue
				Case 18
					rsState = 19
					Continue
				Case 19
					rsState = 22
					If Main.vInt9 >= 23 Then
						Continue
					Else
						rsState = 21
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 21
				Case 21
					rsState = 22
					Salvataggio.SelectedIndex = 5
					Dim vObjectToCharSequence5 As Object = "Questo tipo di salvataggio necessita Android 6+"
					Dim vObjectToCharSequence6 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
					Return
				Case 22
					rsState = 59
					rsCatchState = 58
					rsState = 24
					Continue
				Case 24
					rsState = 25
					rsCatchState = 58
					vBln8 = True
					'storage = externalstorage
					storage.Initialize(Me, "Storage")
					storage.Sub011(True)
					Wait For (Null) Storage_Externalfolderavailable
					rsState = 118
					Continue
				Case 25
					rsState = 56
					If Not(storage.vexternalfile1.IsInitialized) Then
						rsState = 27
						Continue
					Else
						rsState = 29
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 27
				Case 27
					rsState = 56
					Dim vObjectToCharSequence7 As Object = "Non è stata selezionata la destinazione per il salvataggio."
					Dim vObjectToCharSequence8 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
					Return
				Case 29
					rsState = 30
					'sfilelist = List
					sfilelist.Initialize
					ProgressDialogShow("Caricamento dati in corso")
					Continue
				Case 30
					rsState = 41
					group41 = storage.Sub008(storage.vexternalfile1)
					index41 = 0
					groupLen41 = group41.Size
					rsState = 119
					Continue
				Case 32
					rsState = 33
					Continue
				Case 33
					rsState = 40
					If f.IsFolder Then
						Continue
					Else
						rsState = 35
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 35
				Case 35
					rsState = 36
					Continue
				Case 36
					rsState = 39
					If Not(f.Name.EndsWith("DB.zip")) Then
						Continue
					Else
						rsState = 38
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 38
				Case 38
					rsState = 39
					sfilelist.Add(f.Name)
					Continue
				Case 39
					rsState = 40
					Continue
				Case 40
					rsState = 120
					Continue
				Case 41
					rsState = 42
					sfilelist.Sort(False)
					ProgressDialogHide
					m = InputList(sfilelist, "Indicare il file da ripristinare", -1)
					Continue
				Case 42
					rsState = 55
					If m < 0 Then
						Continue
					Else
						rsState = 44
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 44
				Case 44
					rsState = 45
					fres = storage.Sub004(storage.vexternalfile1, sfilelist.Get(m))
					'in_ = InputStream
					in_ = storage.Sub009(fres)
					'out = OutputStream
					out = File.OpenOutput(File.DirRootExternal, "Restore.zip", False)
					File.Copy2(in_, out)
					out.Close
					Continue
				Case 45
					rsState = 54
					If vBln2 Then
						rsState = 47
						Continue
					Else
						rsState = 53
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 47
				Case 47
					rsState = 48
					Continue
				Case 48
					rsState = 51
					If Sub018(File.DirRootExternal, "Restore.zip") Then
						Continue
					Else
						rsState = 50
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 50
				Case 50
					rsState = 51
					Dim vObjectToCharSequence9 As Object = "Errore nel formato del file" & CRLF & "Restore.zip"
					Dim vObjectToCharSequence10 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				Case 51
					rsState = 54
					Continue
				Case 53
					rsState = 54
					'myzip = ArchiverForB4A
					Dim archiverForB4A As ArchiverForB4A = myzip
					Dim dirRootExternal As String = File.DirRootExternal
					archiverForB4A.UnZip(dirRootExternal, "Restore.zip", mod1.vStr4 & "/files", "")
					Continue
				Case 54
					rsState = 55
					Dim vObjectToCharSequence11 As Object = "Il programma verrà chiuso per completare il ripristino."
					Dim vObjectToCharSequence12 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
					mod1.vBln4 = True
					Continue
				Case 55
					rsState = 56
					Continue
				Case 56
					rsState = 59
					Continue
				Case 58
					rsState = 59
					rsCatchState = 116
					mod1.Sub217(LastException.Message)
					Dim vObjectToCharSequence13 As Object = "Errore durante la selezione del file da ripristinare"
					Dim vObjectToCharSequence14 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
					Continue
				Case 59
					rsState = 62
					rsCatchState = 116
					vBln8 = False
					ProgressDialogHide
					Return
				Case 61
					rsState = 62
					Dim vObjectToCharSequence15 As Object = "Indicare dove trovare il salvataggio da ripristinare."
					Dim vObjectToCharSequence16 As Object = Main.vStr8
					res = Msgbox2(vObjectToCharSequence15, vObjectToCharSequence16, "FTP o ServiceBox", "Percorso file", "Annulla", Main.vBmp1)
					Continue
				Case 62
					rsState = 114
					Dim i2 As Int = res
					If i2 = -2 Then
						rsState = 64
						Continue
					Else
						Dim i3 As Int = res
						If i3 = -1 Then
							rsState = 66
							Continue
						Else
							Dim i4 As Int = res
							If i4 <> -3 Then
								Continue
							Else
								rsState = 88
								Continue
							End If
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 64
				Case 64
					rsState = 114
					mod1.Sub081
					Return
				Case 66
					rsState = 67
					Continue
				Case 67
					rsState = 72
					If Not(vFTP1.IsInitialized) Then
						Continue
					Else
						rsState = 69
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 69
				Case 69
					rsState = 72
					vFTP1.CloseNow
					Continue
				Case 72
					rsState = 73
					Continue
				Case 73
					rsState = 86
					If Main.v_salvataggio = 0 Then
						rsState = 75
						Continue
					Else
						If Main.v_salvataggio = 2 Then
							rsState = 77
							Continue
						Else
							If Main.v_salvataggio <> 4 Then
								Continue
							Else
								rsState = 85
								Continue
							End If
						End If
					End If
					'(fallthrough java verso il case successivo)
					rsState = 75
				Case 75
					rsState = 86
					vFTP1.Initialize("FTP", Main.v_ipcassa, 21, "italretail", "italretail")
					vFTP1.List("/Ftpdir")
					Continue
				Case 77
					rsState = 78
					vFTP1.Initialize("FTP", Main.v_serversave, 21, Main.v_utentesave, Main.v_passwordsave)
					Continue
				Case 78
					rsState = 83
					If Main.v_prefixftpsave = "" Then
						rsState = 80
						Continue
					Else
						rsState = 82
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 80
				Case 80
					rsState = 83
					vFTP1.List("/")
					Continue
				Case 82
					rsState = 83
					vFTP1.List(Main.v_prefixftpsave)
					Continue
				Case 83
					rsState = 86
					Continue
				Case 85
					rsState = 86
					CallSub3(rpidevice, "SendCMD", "", "ListaBK")
					Continue
				Case 86
					rsState = 114
					Continue
				Case 88
					rsState = 89
					'fd = FileDialog
					Dim fileDialog As FileDialog = fd
					fileDialog.TextColor = -7829368
					fd.FastScroll = True
					fd.FileFilter = "DB.zip"
					Continue
				Case 89
					rsState = 94
					If Main.v_usbpath <> "" Then
						rsState = 91
						Continue
					Else
						rsState = 93
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 91
				Case 91
					rsState = 94
					Dim fileDialog2 As FileDialog = fd
					fileDialog2.FilePath = Main.v_usbpath
					Continue
				Case 93
					rsState = 94
					Dim fileDialog3 As FileDialog = fd
					fileDialog3.FilePath = mod1.vStr4
					Continue
				Case 94
					rsState = 113
					Dim fileDialog4 As FileDialog = fd
					Dim vObjectToCharSequence17 As Object = "Seleziona il file del salvataggio."
					Dim vShow As Int = fileDialog4.Show(vObjectToCharSequence17, "OK", "Annulla", "", Main.vBmp1)
					If vShow <> -1 Then
						Continue
					Else
						rsState = 96
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 96
				Case 96
					rsState = 97
					Continue
				Case 97
					rsState = 112
					rsCatchState = 111
					rsState = 99
					Continue
				Case 99
					rsState = 100
					rsCatchState = 111
					Continue
				Case 100
					rsState = 109
					If vBln2 Then
						rsState = 102
						Continue
					Else
						rsState = 108
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 102
				Case 102
					rsState = 103
					Continue
				Case 103
					rsState = 106
					If Sub018(fd.FilePath, fd.ChosenName) Then
						Continue
					Else
						rsState = 105
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 105
				Case 105
					rsState = 106
					Dim vObjectToCharSequence18 As Object = "Errore nel formato del file" & CRLF & fd.ChosenName
					Dim vObjectToCharSequence19 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence18, vObjectToCharSequence19, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				Case 106
					rsState = 109
					Continue
				Case 108
					rsState = 109
					'myzip = ArchiverForB4A
					Dim archiverForB4A2 As ArchiverForB4A = myzip
					Dim filePath As String = fd.FilePath
					Dim chosenName As String = fd.ChosenName
					archiverForB4A2.UnZip(filePath, chosenName, mod1.vStr4 & "/files", "")
					Continue
				Case 109
					rsState = 112
					Dim vObjectToCharSequence20 As Object = "Il programma verrà chiuso per completare il ripristino."
					Dim vObjectToCharSequence21 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence20, vObjectToCharSequence21, "OK", "", "", Main.vBmp1)
					mod1.vBln4 = True
					Continue
				Case 111
					rsState = 112
					rsCatchState = 116
					Dim vObjectToCharSequence22 As Object = "Errore nel formato del file" & CRLF & fd.ChosenName
					Dim vObjectToCharSequence23 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence22, vObjectToCharSequence23, "OK", "", "", Main.vBmp1)
					Continue
				Case 112
					rsState = 113
					rsCatchState = 116
					Continue
				Case 113
					rsState = 114
					Continue
				Case 114
					rsState = 117
					Continue
				Case 116
					rsState = 117
					rsCatchState = 0
					mod1.Sub217(LastException.Message)
					Continue
				Case 117
					rsState = -1
					rsCatchState = 0
					mod1.Sub081
					Continue
				Case 118
					rsState = 25
					Continue
				Case 119
					rsState = 41
					If index41 >= groupLen41 Then
						Continue
					Else
						rsState = 32
						f = group41.Get(index41)
						Continue
					End If
					'(fallthrough java verso il case successivo)
					rsState = 120
				Case 120
					rsState = 119
					index41 = index41 + 1
					Continue
			End Select
		Catch
			If rsCatchState = 0 Then
				Log(LastException)
				Return
			End If
			rsState = rsCatchState
		End Try
	Loop
End Sub

Sub storage_externalfolderavailable
End Sub

Sub bSetDefaultSedie_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = 0
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il numero di sedie predefinito per ogni tavolo ", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Dim vObjectToCharSequence As Object = "Attenzione !!! eventuali valori inseriti manualmente verranno sovrascritti in maniera irreversibile. " & CRLF & "Si desidera proseguire ugualmente ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 = -1 Then
			Main.vSql1.ExecNonQuery("update tavoli set sedie = " & numberDialog.Number)
		End If
	End If
	mod1.Sub081
End Sub

Sub bSetFont_Click
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(Array As String("Articoli", "Reparti", "Funzioni", "Pagine", "Tastierino", "Pagamenti", "Sale", "Tavoli")))
	Dim i As Int = 16 / GetDeviceLayoutValues.Scale
	Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare dove applicare la variazione:")
	If vInputList1 >= 0 Then
		Dim numberDialog As NumberDialog
		numberDialog.Digits = 2
		numberDialog.Number = i
		numberDialog.Decimal = 0
		numberDialog.ShowSign = False
		Dim vShow As Int = numberDialog.Show("Dimensione carattere (min.Anon_7 ,  max.Anon_40,)." & CRLF & "Digitare 0 per ripristinare la dimensione predefinita", "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 And ((numberDialog.Number >= 7 And numberDialog.Number <= 40) Or numberDialog.Number = 0) Then
			Main.vSql1.ExecNonQuery("update pagine set textsize = " & numberDialog.Number & " where tipo = " & vInputList1 + 2)
			Dim vObjectToCharSequence As Object = "Modifica applicata correttamente"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		End If
	End If
	mod1.Sub081
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/configura.java, metodo _btncloseterzo_click (riga 6373).
Sub btnCloseTerzo_Click
	If spTerzoTipoEser.SelectedIndex > 0 Then
		If spTerzoTipoEser.SelectedIndex <> 4 Then
			If edtTerzoIDCodiceTX.Text <> "" Then
			End If
			Dim vObjectToCharSequence As Object = "Verifica Dati Terzo intermediario o Emittente:" & CRLF & "E' obbligatorio inserire una partita iva valida." & CRLF & "Si desidera uscire ugualmente ?"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "SI", "", "NO", Main.vBmp1)
			If vMsgbox2 <> -1 Then
				Return
			End If
		End If
		If spTerzoTipoEser.SelectedIndex = 4 Then
			If edtTerzoCFEser.Text.Length = 11 Then
			End If
			Dim vObjectToCharSequence3 As Object = "Verifica Dati Terzo intermediario o Emittente:" & CRLF & "Per le persone giuridiche, obbligatorio inserire un codice fiscale lungo 11 caratteri." & CRLF & "Si desidera uscire ugualmente ?"
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "SI", "", "NO", Main.vBmp1)
			If vMsgbox22 <> -1 Then
				Return
			End If
		End If
		If edtTerzoDenEser.Text = "" Then
			Dim vObjectToCharSequence5 As Object = "Verifica Dati Terzo intermediario o Emittente:" & CRLF & "E' obbligatorio inserire la denominazione." & CRLF & "Si desidera uscire ugualmente ?"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Dim vMsgbox23 As Int = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "SI", "", "NO", Main.vBmp1)
			If vMsgbox23 <> -1 Then
				Return
			End If
		End If
	End If
	pnlDatiTerzo.SetVisibleAnimated(400, False)
	mod1.Sub081
End Sub

Sub btnExportImg_Click
	Try
	Catch
		Dim vObjectToCharSequence As Object = "Verificare il percorso .. Il file non è stato copiato."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	End Try
	If gloryN.SelectedIndex <> 0 And gloryN.SelectedIndex <> 3 Then
		Dim vObjectToCharSequence3 As Object = "Non è possibile inviare le immagini al gestore del Cash management"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		Return
	End If
	Dim fileDialog As FileDialog
	fileDialog.TextColor = -7829368
	fileDialog.FastScroll = True
	If Main.v_usbpath <> "" Then
		fileDialog.FilePath = Main.v_usbpath
	Else
		fileDialog.FilePath = mod1.vStr4
	End If
	fileDialog.FileFilter = ".zip"
	Dim vShow As Int = fileDialog.Show("Seleziona il file da inviare a VisionDroid.", "OK", "Annulla", "", Null)
	If vShow = -1 Then
		Dim chosenName As String = fileDialog.ChosenName
		If chosenName.ToLowerCase = "img.zip" Then
			If File.Exists(fileDialog.FilePath, chosenName) Then
				Dim filePath As String = fileDialog.FilePath
				File.Copy(filePath, chosenName, mod1.vStr4, chosenName)
				Dim vObjectToCharSequence5 As Object = "Le immagini verranno inviate a VisionDroid all'uscita dalla configurazione. " & CRLF & "La procedura di invio potrebbe richiedere diversi minuti."
				Dim vObjectToCharSequence6 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
			End If
		Else
			Dim vObjectToCharSequence7 As Object = "Il nome del file non è corretto"
			Dim vObjectToCharSequence8 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
		End If
	End If
	mod1.Sub081
End Sub

Sub btnImportaBasicSupport_Click
	Try
		Dim fileDialog As FileDialog
		fileDialog.TextColor = -7829368
		fileDialog.FastScroll = True
		If Main.v_usbpath <> "" Then
			fileDialog.FilePath = Main.v_usbpath
		Else
			fileDialog.FilePath = mod1.vStr4
		End If
		fileDialog.FileFilter = ".bs"
		Dim vShow As Int = fileDialog.Show("Seleziona il file di licenza per il Basic Support.", "OK", "Annulla", "Cancella Codice", Null)
		If vShow = -1 Then
			Dim vReadList As List = File.ReadList(fileDialog.FilePath, fileDialog.ChosenName)
			btnImportaBasicSupport.Tag = vReadList.Get(0)
			Sub003(vReadList.Get(0))
			Sub026()
			Dim vObjectToCharSequence As Object = "Codice Basic Support caricato, uscire dal programma per convalidarlo."
			Msgbox(vObjectToCharSequence, Main.vStr8)
		Else
			If vShow = -2 Then
				btnImportaBasicSupport.Tag = ""
				vStr4 = ""
				Sub026()
			End If
		End If
	Catch
		Dim vObjectToCharSequence2 As Object = "Verificare il percorso .. "
		Dim vObjectToCharSequence3 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence2, vObjectToCharSequence3, "OK", "", "", Main.vBmp1)
	End Try
	mod1.Sub081
End Sub

Sub btnImportaCodAttivazione_Click
	Try
		Dim fileDialog As FileDialog
		fileDialog.FastScroll = True
		If Main.v_usbpath <> "" Then
			fileDialog.FilePath = Main.v_usbpath
		Else
			fileDialog.FilePath = mod1.vStr4
		End If
		fileDialog.FileFilter = ".txt"
		fileDialog.TextColor = -7829368
		Dim vShow As Int = fileDialog.Show("Seleziona il file di licenza.", "OK", "Annulla", "Cancella Codice", Null)
		If vShow = -1 Then
			CodAttivazione.Text = File.ReadList(fileDialog.FilePath, fileDialog.ChosenName).Get(0)
			Dim vObjectToCharSequence As Object = "Codice di attivazione caricato, uscire dal programma per convalidarlo."
			Msgbox(vObjectToCharSequence, Main.vStr8)
		Else
			If vShow = -2 Then
				CodAttivazione.Text = ""
				Dim vObjectToCharSequence2 As Object = "Codice di attivazione annullato, uscire dal programma per applicare la modifica."
				Msgbox(vObjectToCharSequence2, Main.vStr8)
			End If
		End If
	Catch
		Dim vObjectToCharSequence3 As Object = "Verificare il percorso .. "
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
	End Try
	mod1.Sub081
End Sub

Sub btnImportaSB_Click
	Try
		Dim fileDialog As FileDialog
		fileDialog.TextColor = -7829368
		fileDialog.FastScroll = True
		If Main.v_usbpath <> "" Then
			fileDialog.FilePath = Main.v_usbpath
		Else
			fileDialog.FilePath = mod1.vStr4
		End If
		fileDialog.FileFilter = ".sb"
		Dim vShow As Int = fileDialog.Show("Seleziona il file di licenza Prenotazioni.", "OK", "Annulla", "Cancella Codice", Null)
		If vShow = -1 Then
			Dim vReadList As List = File.ReadList(fileDialog.FilePath, fileDialog.ChosenName)
			btnImportaSB.Tag = vReadList.Get(0)
			Sub004(vReadList.Get(0))
			Sub032()
			Dim vObjectToCharSequence As Object = "Codice di attivazione caricato, uscire dal programma per convalidarlo."
			Msgbox(vObjectToCharSequence, Main.vStr8)
		Else
			If vShow = -2 Then
				btnImportaSB.Tag = ""
				vStr5 = ""
				Sub032()
				Dim vObjectToCharSequence2 As Object = "Codice di attivazione cancellato, uscire dal programma per applicare la modifica."
				Msgbox(vObjectToCharSequence2, Main.vStr8)
			End If
		End If
	Catch
		Dim vObjectToCharSequence3 As Object = "Verificare il percorso .. "
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
	End Try
	mod1.Sub081
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/configura.java, metodo _btnintestazione_click (riga 6644).
Sub btnIntestazione_Click
	Dim text As String
	Dim str As String
	Try
		If spRegFiscEser.SelectedIndex = 0 Then
			Dim vObjectToCharSequence As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio indicare un regime fiscale." & CRLF & "Si desidera uscire ugualmente ?"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "SI", "", "NO", Main.vBmp1)
			If vMsgbox2 <> -1 Then
				Return
			End If
		Else If btnNazioneEser.Tag = "IT" And edtProvinciaEser.Text = "" Then
			Dim vObjectToCharSequence3 As Object = "Verifica dati esercente:" & CRLF & "Non è stata indicare la provincia." & CRLF & "Si desidera uscire ugualmente ?"
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "SI", "", "NO", Main.vBmp1)
			If vMsgbox22 <> -1 Then
				Return
			End If
		Else If spTipoEser.SelectedIndex = 0 Then
			Dim vObjectToCharSequence5 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio indicare la tipologia di esercente." & CRLF & "Si desidera uscire ugualmente ?"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Dim vMsgbox23 As Int = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "SI", "", "NO", Main.vBmp1)
			If vMsgbox23 <> -1 Then
				Return
			End If
		Else
			If spTipoEser.SelectedIndex > 0 Then
				If edtPIVAEser.Text <> "" Then
				End If
				Dim vObjectToCharSequence7 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire una partita iva valida." & CRLF & "Si desidera uscire ugualmente ?"
				Dim vObjectToCharSequence8 As Object = Main.vStr8
				Dim vMsgbox24 As Int = Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "SI", "", "NO", Main.vBmp1)
				If vMsgbox24 <> -1 Then
					Return
				End If
			End If
			If spTipoEser.SelectedIndex = 2 And edtUfficioREA.Text <> "" And edtNumeroREA.Text = "" Then
				Dim vObjectToCharSequence9 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire il Capitale Sociale REA." & CRLF & "Si desidera uscire ugualmente ?"
				Dim vObjectToCharSequence10 As Object = Main.vStr8
				Dim vMsgbox25 As Int = Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "SI", "", "NO", Main.vBmp1)
				If vMsgbox25 <> -1 Then
					Return
				End If
			Else
				If spTipoEser.SelectedIndex = 4 Then
					If edtCFEser.Text.Length = 11 Then
					End If
					Dim vObjectToCharSequence11 As Object = "Verifica dati esercente:" & CRLF & "Per le persone giuridiche, obbligatorio inserire un codice fiscale lungo 11 caratteri." & CRLF & "Si desidera uscire ugualmente ?"
					Dim vObjectToCharSequence12 As Object = Main.vStr8
					Dim vMsgbox26 As Int = Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "SI", "", "NO", Main.vBmp1)
					If vMsgbox26 <> -1 Then
						Return
					End If
				End If
				If spSocUnicoREA.SelectedIndex > 0 And spTipoEser.SelectedIndex <> 2 Then
					Dim vObjectToCharSequence13 As Object = "Verifica dati esercente:" & CRLF & "Il socio unico può essere valorizzato solo in caso di società." & CRLF & "Si desidera uscire ugualmente ?"
					Dim vObjectToCharSequence14 As Object = Main.vStr8
					Dim vMsgbox27 As Int = Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "SI", "", "NO", Main.vBmp1)
					If vMsgbox27 <> -1 Then
						Return
					End If
				Else If spStatoLiquidazioneREA.SelectedIndex = 1 And spTipoEser.SelectedIndex <> 2 Then
					Dim vObjectToCharSequence15 As Object = "Verifica dati esercente:" & CRLF & "Lo stato 'In liquidazione' è attivabile solo per le società." & CRLF & "Si desidera uscire ugualmente ?"
					Dim vObjectToCharSequence16 As Object = Main.vStr8
					Dim vMsgbox28 As Int = Msgbox2(vObjectToCharSequence15, vObjectToCharSequence16, "SI", "", "NO", Main.vBmp1)
					If vMsgbox28 <> -1 Then
						Return
					End If
				Else If edtDenEser.Text = "" Then
					Dim vObjectToCharSequence17 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire la denominazione." & CRLF & "Si desidera uscire ugualmente ?"
					Dim vObjectToCharSequence18 As Object = Main.vStr8
					Dim vMsgbox29 As Int = Msgbox2(vObjectToCharSequence17, vObjectToCharSequence18, "SI", "", "NO", Main.vBmp1)
					If vMsgbox29 <> -1 Then
						Return
					End If
				Else If edtViaEser.Text = "" Then
					Dim vObjectToCharSequence19 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire l'indirizzo." & CRLF & "Si desidera uscire ugualmente ?"
					Dim vObjectToCharSequence20 As Object = Main.vStr8
					Dim vMsgbox210 As Int = Msgbox2(vObjectToCharSequence19, vObjectToCharSequence20, "SI", "", "NO", Main.vBmp1)
					If vMsgbox210 <> -1 Then
						Return
					End If
				Else If edtCittaEser.Text = "" Then
					Dim vObjectToCharSequence21 As Object = "Verifica dati esercente:" & CRLF & "E' obbligatorio inserire la località." & CRLF & "Si desidera uscire ugualmente ?"
					Dim vObjectToCharSequence22 As Object = Main.vStr8
					Dim vMsgbox211 As Int = Msgbox2(vObjectToCharSequence21, vObjectToCharSequence22, "SI", "", "NO", Main.vBmp1)
					If vMsgbox211 <> -1 Then
						Return
					End If
				End If
			End If
		End If
		text = edtPIVAEser.Text
		str = ""
		If text.ToLowerCase.StartsWith("it") Then
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If text.Length <= 2 Or IsNumber(text.SubString2(0, 2)) Then
		If mod1.myispi_it(text, True) Then
			str = ",[IDNazioneEser] = 'IT',[CodForn] = '" & text & "'"
		End If
		Main.vSql1.ExecNonQuery("UPDATE [FEDatiTX]" & CRLF & TAB & "SET [TipoEser] = " & SmartStringFormatter("", spTipoEser.SelectedIndex) & CRLF & TAB & TAB & ",[TerzoTipoEser] = " & SmartStringFormatter("", spTerzoTipoEser.SelectedIndex) & CRLF & TAB & TAB & ",[IDPaeseTX] = '" & SmartStringFormatter("", btnIDPaeseTX.Tag) & "'" & CRLF & TAB & TAB & ",[TerzoIDPaeseTX] = '" & SmartStringFormatter("", btnTerzoIDPaeseTX.Tag) & "'" & CRLF & TAB & TAB & ",[TerzoCodiceTX] = '" & SmartStringFormatter("", edtTerzoIDCodiceTX.Text) & "'" & CRLF & TAB & TAB & ",[CodiceTX] = '" & SmartStringFormatter("", edtIDCodiceTX.Text) & "' " & SmartStringFormatter("", str) & CRLF & TAB & TAB & ",[NazioneEser] = '" & SmartStringFormatter("", btnNazioneEser.Tag) & "'" & CRLF & TAB & TAB & ",[TerzoCFEser] = '" & SmartStringFormatter("", edtTerzoCFEser.Text) & "'" & CRLF & TAB & TAB & ",[CFEser] = '" & SmartStringFormatter("", edtCFEser.Text) & "'" & CRLF & TAB & TAB & ",[PIVAEser] ='" & SmartStringFormatter("", edtPIVAEser.Text) & "'" & CRLF & TAB & TAB & ",[TerzoDenEser] = '" & SmartStringFormatter("", edtTerzoDenEser.Text) & "'" & CRLF & TAB & TAB & ",[DenEser] = '" & SmartStringFormatter("", edtDenEser.Text) & "'" & CRLF & TAB & TAB & ",[TerzoNomeEser] = '" & SmartStringFormatter("", edtTerzoNomeEser.Text) & "'" & CRLF & TAB & TAB & ",[NomeEser] = '" & SmartStringFormatter("", edtNomeEser.Text) & "'" & CRLF & TAB & TAB & ",[TerzoCognomeEser] = '" & SmartStringFormatter("", edtTerzoCognomeEser.Text) & "'" & CRLF & TAB & TAB & ",[CognomeEser] = '" & SmartStringFormatter("", edtCognomeEser.Text) & "'" & CRLF & TAB & TAB & ",[ViaEser] = '" & SmartStringFormatter("", edtViaEser.Text) & "'" & CRLF & TAB & TAB & ",[CapEser] = '" & SmartStringFormatter("", edtCapEser.Text) & "'" & CRLF & TAB & TAB & ",[CittaEser] =  '" & SmartStringFormatter("", edtCittaEser.Text) & "'" & CRLF & TAB & TAB & ",[ProvinciaEser] = '" & SmartStringFormatter("", edtProvinciaEser.Text) & "'" & CRLF & TAB & TAB & ",[RegFiscEser] = " & SmartStringFormatter("", spRegFiscEser.SelectedIndex) & CRLF & TAB & TAB & ",[UfficioREA] = '" & SmartStringFormatter("", edtUfficioREA.Text) & "'" & CRLF & TAB & TAB & ",[NumeroREA] = '" & SmartStringFormatter("", edtNumeroREA.Text) & "'" & CRLF & TAB & TAB & ",[CapSocREA] = '" & SmartStringFormatter("", edtCapSocREA.Text) & "'" & CRLF & TAB & TAB & ",[SocUnicoREA] = " & SmartStringFormatter("", spSocUnicoREA.SelectedIndex) & CRLF & TAB & TAB & ",[StatoLiquidazioneREA] = " & SmartStringFormatter("", spStatoLiquidazioneREA.SelectedIndex) & CRLF & TAB)
		pnlDatiEser.Visible = False
		Return
	End If
	str = ",[IDNazioneEser] = '" & text.SubString2(0, 2).ToUpperCase & "'" & ",[CodForn] = '" & text.SubString(2).ToUpperCase & "'"
	Main.vSql1.ExecNonQuery("UPDATE [FEDatiTX]" & CRLF & TAB & "SET [TipoEser] = " & SmartStringFormatter("", spTipoEser.SelectedIndex) & CRLF & TAB & TAB & ",[TerzoTipoEser] = " & SmartStringFormatter("", spTerzoTipoEser.SelectedIndex) & CRLF & TAB & TAB & ",[IDPaeseTX] = '" & SmartStringFormatter("", btnIDPaeseTX.Tag) & "'" & CRLF & TAB & TAB & ",[TerzoIDPaeseTX] = '" & SmartStringFormatter("", btnTerzoIDPaeseTX.Tag) & "'" & CRLF & TAB & TAB & ",[TerzoCodiceTX] = '" & SmartStringFormatter("", edtTerzoIDCodiceTX.Text) & "'" & CRLF & TAB & TAB & ",[CodiceTX] = '" & SmartStringFormatter("", edtIDCodiceTX.Text) & "' " & SmartStringFormatter("", str) & CRLF & TAB & TAB & ",[NazioneEser] = '" & SmartStringFormatter("", btnNazioneEser.Tag) & "'" & CRLF & TAB & TAB & ",[TerzoCFEser] = '" & SmartStringFormatter("", edtTerzoCFEser.Text) & "'" & CRLF & TAB & TAB & ",[CFEser] = '" & SmartStringFormatter("", edtCFEser.Text) & "'" & CRLF & TAB & TAB & ",[PIVAEser] ='" & SmartStringFormatter("", edtPIVAEser.Text) & "'" & CRLF & TAB & TAB & ",[TerzoDenEser] = '" & SmartStringFormatter("", edtTerzoDenEser.Text) & "'" & CRLF & TAB & TAB & ",[DenEser] = '" & SmartStringFormatter("", edtDenEser.Text) & "'" & CRLF & TAB & TAB & ",[TerzoNomeEser] = '" & SmartStringFormatter("", edtTerzoNomeEser.Text) & "'" & CRLF & TAB & TAB & ",[NomeEser] = '" & SmartStringFormatter("", edtNomeEser.Text) & "'" & CRLF & TAB & TAB & ",[TerzoCognomeEser] = '" & SmartStringFormatter("", edtTerzoCognomeEser.Text) & "'" & CRLF & TAB & TAB & ",[CognomeEser] = '" & SmartStringFormatter("", edtCognomeEser.Text) & "'" & CRLF & TAB & TAB & ",[ViaEser] = '" & SmartStringFormatter("", edtViaEser.Text) & "'" & CRLF & TAB & TAB & ",[CapEser] = '" & SmartStringFormatter("", edtCapEser.Text) & "'" & CRLF & TAB & TAB & ",[CittaEser] =  '" & SmartStringFormatter("", edtCittaEser.Text) & "'" & CRLF & TAB & TAB & ",[ProvinciaEser] = '" & SmartStringFormatter("", edtProvinciaEser.Text) & "'" & CRLF & TAB & TAB & ",[RegFiscEser] = " & SmartStringFormatter("", spRegFiscEser.SelectedIndex) & CRLF & TAB & TAB & ",[UfficioREA] = '" & SmartStringFormatter("", edtUfficioREA.Text) & "'" & CRLF & TAB & TAB & ",[NumeroREA] = '" & SmartStringFormatter("", edtNumeroREA.Text) & "'" & CRLF & TAB & TAB & ",[CapSocREA] = '" & SmartStringFormatter("", edtCapSocREA.Text) & "'" & CRLF & TAB & TAB & ",[SocUnicoREA] = " & SmartStringFormatter("", spSocUnicoREA.SelectedIndex) & CRLF & TAB & TAB & ",[StatoLiquidazioneREA] = " & SmartStringFormatter("", spStatoLiquidazioneREA.SelectedIndex) & CRLF & TAB)
	pnlDatiEser.Visible = False
End Sub

Sub btnNazioneEser_Click
	Dim i As Int = 0
	Dim buttonWrapper As Button = Sender
	Dim list As List
	list.Initialize
	Dim size As Int = vLst3.Size - 1
	Dim i2 As Int = 0
	Do While i <= size
		Dim tnazioneVar As tnazione = vLst3.Get(i)
		list.Add(tnazioneVar.descrizione)
		Dim i3 As Int = IIf(tnazioneVar.id = buttonWrapper.Tag, i, i2)
		i = i + 1
		i2 = i3
	Loop
	Dim vInputList As Int = InputList(list, "Selezionare una nazione", i2)
	If vInputList < 0 Then
		Return
	End If
	Dim tnazioneVar2 As tnazione = vLst3.Get(vInputList)
	buttonWrapper.Tag = tnazioneVar2.id
	buttonWrapper.Text = "Nazione:" & tnazioneVar2.descrizione
End Sub

Sub Btnnext1_Click
	TabHost1.CurrentTab = 1
End Sub

Sub Btnnext2_Click
	TabHost1.CurrentTab = 2
End Sub

Sub btnTerzoIntermediario_Click
	mod1.Sub161(pnlDatiTerzo, 12)
	pnlDatiTerzo.SetVisibleAnimated(400, True)
	mod1.Sub081
End Sub

Sub bVerificazione_Click
	vBln8 = True
	mod1.Sub198("Verificazione")
End Sub

Sub CancellaV_Click
	Dim str As String
	Try
		Dim dateDialog As DateDialog
		dateDialog.Year = DateTime.GetYear(mod1.Sub058)
		dateDialog.Month = DateTime.GetMonth(mod1.Sub058)
		dateDialog.DayOfMonth = DateTime.GetDayOfMonth(mod1.Sub058)
		Dim vShow As Int = dateDialog.Show("Impostare la data prima della quale i movimenti verranno eliminati IN MANIERA IRREVERSIBILE", "Cancellazione dati", "Ok", "Annulla", "", Main.vBmp1)
		If vShow = -1 Then
			Dim list As List
			list.Initialize
			list.Add("Cancella Tutto")
			list.Add("Movimenti di vendita")
			list.Add("Movimenti di vendita senza documento")
			Dim vInputList1 As Int = idLib.InputList1(list, "Indicare il tipo di cancellazione:")
			If vInputList1 >= 0 Then
				If vInputList1 <> 1 Then
					str = ""
				Else
					str = " and causale ='sc' "
				End If
				DoEvents
				Try
					Dim str2 As String = "'" & dateDialog.Year & "-" & NumberFormat(dateDialog.Month, 2, 0) & "-" & NumberFormat(dateDialog.DayOfMonth, 2, 0) & " 00:00:00' "
					If Main.v_inviofe Then
						If Main.v_attivafe Or AttivaFE.Checked Then
							Dim textWriterWrapper As TextWriter
							textWriterWrapper.Initialize(File.OpenOutput(File.DirDefaultExternal & "/FE", "Tmp.sql", False))
							textWriterWrapper.Write("delete from EsitiFE where DataOra < " & str2 & CRLF)
							textWriterWrapper.Write("delete from OperazioniFE where DataOra < " & str2)
							textWriterWrapper.Close
							CallSub3(httpclient, "ComunicaConInviaFE", "http://127.0.0.1:12512/R__SQL", "")
						End If
					End If
					Main.vSql2.BeginTransaction
					If vInputList1 = 2 Then
						Dim customprogressdialogVar As CustomProgressDialog
						Dim vPerYToCurrent As Double = PerYToCurrent(10)
						customprogressdialogVar._initialize(Activity, PerXToCurrent(60), (PerXToCurrent(100) - PerXToCurrent(60)) / 2, vPerYToCurrent, "", "", -12303292, 0, "Progress", False)
						Dim cursorWrapper As Cursor
						Dim cursorWrapper2 As Cursor = Main.vSql2.ExecQuery("SELECT nmov FROM [headmov]  where causale ='sc' and datam3 <" & str2 & " and flgNF=1 AND sospeso=0")
						If cursorWrapper2.RowCount > 0 Then
							Dim rowCount As Int = cursorWrapper2.RowCount - 1
							Dim i As Int
							For i = 0 To rowCount
								cursorWrapper2.Position = i
								Main.vSql2.ExecNonQuery("delete from headmov where nmov =" & cursorWrapper2.GetString("nmov"))
								Main.vSql2.ExecNonQuery("delete from venduto where nmov =" & cursorWrapper2.GetString("nmov"))
								Main.vSql2.ExecNonQuery("delete from CausaliPagamenti where nmov =" & cursorWrapper2.GetString("nmov"))
								customprogressdialogVar._showprogress("Cancellazione dati in corso ...", -1, i * 100 / cursorWrapper2.RowCount)
								DoEvents
							Next
						End If
						cursorWrapper2.Close
						If customprogressdialogVar.isshow Then
							customprogressdialogVar._hide
						End If
					Else If vInputList1 = 0 Or vInputList1 = 1 Then
						Dim customprogressdialogVar2 As CustomProgressDialog
						Dim vPerYToCurrent2 As Double = PerYToCurrent(10)
						customprogressdialogVar2._initialize(Activity, PerXToCurrent(60), (PerXToCurrent(100) - PerXToCurrent(60)) / 2, vPerYToCurrent2, "", "", -12303292, 0, "Progress", False)
						customprogressdialogVar2._showprogress("Cancellazione dati in corso ...", -1, 25)
						DoEvents
						Main.vSql2.ExecNonQuery("delete from headmov where datam3 <" & str2 & str)
						customprogressdialogVar2._showprogress("Cancellazione dati in corso ...", -1, 50)
						DoEvents
						Main.vSql2.ExecNonQuery("delete from venduto where datam3 <" & str2 & str)
						customprogressdialogVar2._showprogress("Cancellazione dati in corso ...", -1, 75)
						DoEvents
						Main.vSql2.ExecNonQuery("delete from CausaliPagamenti where datam3 <" & str2)
						customprogressdialogVar2._showprogress("Cancellazione dati in corso ...", -1, 100)
						DoEvents
						If customprogressdialogVar2.isshow Then
							customprogressdialogVar2._hide
						End If
					End If
					Main.vSql2.TransactionSuccessful
				Catch
					mod1.Sub217(LastException.Message)
				End Try
				Main.vSql2.EndTransaction
				mod1.Sub150
				ProgressDialogHide
			End If
		End If
	Catch
		Dim vObjectToCharSequence As Object = "Errore durante la procedura di cancellazione ... "
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub217(LastException.Message)
		ProgressDialogHide
	End Try
	mod1.Sub081
End Sub

Sub Sub002(str As String, str2 As String, str3 As String) As Boolean
	If str2 <> "" Then
		Dim vObjectToString As String = vMap1.GetDefault(str2, "")
		If vObjectToString <> "" And vObjectToString.ToLowerCase.Contains(str3.ToLowerCase) Then
			Return True
		End If
	End If
	Return str.ToLowerCase.Contains(str3.ToLowerCase)
End Sub

Sub Sub003(str As String)
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If str = "" Then
		Return
	End If
	Dim bArr(0) As Byte
	Dim bArr2(0) As Byte
	Dim bArr3(0) As Byte
	Dim byteConverter As ByteConverter
	Dim keyGeneratorWrapper As KeyGenerator
	Dim cipherWrapper As Cipher
	cipherWrapper.Initialize("DES/CBC/PKCS5Padding")
	cipherWrapper.InitialisationVector = Array As Byte(21, 32, 43, 54, 65, 76, 87, 98)
	keyGeneratorWrapper.Initialize("DES")
	keyGeneratorWrapper.KeyFromBytes(Array As Byte(33, 22, 43, 8, 45, 24, 43, 28))
	Dim trim As String = byteConverter.StringFromBytes(cipherWrapper.Decrypt(byteConverter.HexToBytes(str), keyGeneratorWrapper.Key, True), "UTF8").ToUpperCase.Trim
	If trim.Length = 18 Then
		Dim vTmp As Int = mod1.Sub027(trim.SubString(10))
		If vTmp < mod1.Sub027(Main.c_bs) Then
			vStr4 = "scaduto"
		Else
			vStr4 = vTmp
		End If
	Else
		vStr4 = "err"
	End If
End Sub

Sub Sub004(str As String)
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Main.v_codattivazionesb = "" Then
		Return
	End If
	Dim bArr(0) As Byte
	Dim bArr2(0) As Byte
	Dim bArr3(0) As Byte
	Dim byteConverter As ByteConverter
	Dim keyGeneratorWrapper As KeyGenerator
	Dim cipherWrapper As Cipher
	cipherWrapper.Initialize("DES/CBC/PKCS5Padding")
	cipherWrapper.InitialisationVector = Array As Byte(21, 32, 43, 54, 65, 76, 87, 98)
	keyGeneratorWrapper.Initialize("DES")
	keyGeneratorWrapper.KeyFromBytes(Array As Byte(33, 22, 43, 8, 45, 24, 43, 28))
	Dim trim As String = byteConverter.StringFromBytes(cipherWrapper.Decrypt(byteConverter.HexToBytes(str), keyGeneratorWrapper.Key, True), "UTF8").ToUpperCase.Trim
	If trim.Length = 28 Then
		Dim vDateParse As Long = DateTime.DateParse(trim.SubString2(24, 26) & "/" & trim.SubString2(26, 28) & "/" & trim.SubString2(20, 24))
		If vDateParse < DateTime.Now Then
			vStr5 = "scaduto"
		Else
			vStr5 = DateTime.Date(vDateParse)
			vStr5 = vStr5.SubString2(3, 6) & vStr5.SubString2(0, 3) & vStr5.SubString(6)
		End If
	Else
		vStr5 = "err"
	End If
End Sub

Sub chiedifileddaripristinare(list As List)
	If list.Size = 0 Then
		Dim vObjectToCharSequence As Object = "Non è stato trovato nessun DB sul ServiceBox"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	End If
	Dim vInputList1 As Int = idLib.InputList1(list, "Indicare il database da ripristinare:")
	If vInputList1 < 0 Then
		mod1.Sub081
		ProgressDialogHide
		Return
	End If
	CallSub3(rpidevice, "SendCMD", list.Get(vInputList1), "RestoreBK")
	ProgressDialogShow("Ripristino DB in corso ....")
End Sub

Sub Conf_annulla_Click
	vBln8 = True
	mod1.Sub198("Main")
	Activity.Finish
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/configura.java, metodo _conf_ok_click (riga 7192).
Sub conf_Ok_Click
	Dim z As Boolean
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean = False
	If Not(mod1.Sub129(IPCassa.Text)) And TipoInterfaccia.SelectedIndex = 0 Then
		Dim vObjectToCharSequence As Object = "inserire un indirizzo IP valido per il " & Main.vStr1 & ""
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	If TipoInterfaccia.SelectedIndex > 0 And Salvataggio.SelectedIndex = 0 Then
		If Not(Main.vBln25) Then
			Dim vObjectToCharSequence3 As Object = "Non è consentito il salvataggio su " & Main.vStr1 & " con la comunicazione seriale abilitata."
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
	End If
	If pnlDatiEser.IsInitialized And pnlDatiEser.Visible Then
		btncloseterzo_click()
		btnintestazione_click()
		Return
	End If
	If TipoInterfaccia.SelectedIndex > 0 Then
	End If
	If Not(TipoInterfaccia.SelectedIndex > 0) Then
	End If
	Dim z5 As Boolean = False
	If Not(Tema2.Checked) Then
		If Main.v_temag <> TipoLayout.Tag Then
			z5 = True
		End If
	End If
	Dim checked As Boolean = Tema2.Checked
	If checked <> Main.v_tema2 Then
		z5 = True
	End If
	Dim checked2 As Boolean = SoloChiusura.Checked
	If checked2 <> Main.v_solochiusura Then
		If SoloChiusura.Checked Then
			Dim vObjectToCharSequence5 As Object = "Il programma verrà chiuso per consentire l'attivazione della procedura di chiusura (solo RT)"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
		Else
			Dim vObjectToCharSequence7 As Object = "Il programma verrà chiuso per consentire la disattivazione della procedura di chiusura (solo RT)"
			Dim vObjectToCharSequence8 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
		End If
		z5 = True
	End If
	If Main.v_attivakeyhttp <> AttivaKeyHTTP.Checked Then
		z5 = True
	End If
	Dim checked3 As Boolean = AttivaTerminale.Checked
	If checked3 <> Main.v_attivaterminale Then
		If AttivaTerminale.Checked Then
			Dim vObjectToCharSequence9 As Object = "Il programma verrà chiuso per consentire l'attivazione delle procedure Uniandro"
			Dim vObjectToCharSequence10 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
		Else
			Dim vObjectToCharSequence11 As Object = "Il programma verrà chiuso per consentire la disattivazione delle procedure Uniandro"
			Dim vObjectToCharSequence12 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
		End If
		z5 = True
	End If
	Dim checked4 As Boolean = GestioneSpiagge.Checked
	If checked4 <> Main.v_gestionespiagge Then
		If GestioneSpiagge.Checked Then
			Dim vObjectToCharSequence13 As Object = "Il programma verrà chiuso per consentire l'attivazione delle procedure per le spiagge"
			Dim vObjectToCharSequence14 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
		Else
			Dim vObjectToCharSequence15 As Object = "Il programma verrà chiuso per consentire la disattivazione delle procedure per le spiagge"
			Dim vObjectToCharSequence16 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence15, vObjectToCharSequence16, "OK", "", "", Main.vBmp1)
		End If
		z5 = True
	End If
	If WebApiPI.Tag <> "" Then
	End If
	If WebApiPI.Tag = "" Then
	End If
	If TermSala.Checked Then
		Dim checked5 As Boolean = TermSala.Checked
		If checked5 <> Main.v_termsala Then
			z5 = True
		End If
	End If
	If IpVis.Text <> "" Then
		If Not(mod1.Sub129(IpVis.Text)) Then
			Dim vObjectToCharSequence17 As Object = "inserire un indirizzo IP valido per il 2° Tablet"
			Dim vObjectToCharSequence18 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence17, vObjectToCharSequence18, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
	Else If gloryN.SelectedIndex > 0 Then
		Dim vObjectToCharSequence19 As Object = "Non è possibile abilitare la gestione del Cash management senza inserire l'indirizzo del VisionDroid"
		Dim vObjectToCharSequence20 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence19, vObjectToCharSequence20, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	If gloryN.SelectedIndex > 0 And SalvaVD.SelectedIndex = 1 Then
		Dim vObjectToCharSequence21 As Object = "Non è possibile salvare su VisionDroid con il Cash management abilitato"
		Dim vObjectToCharSequence22 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence21, vObjectToCharSequence22, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	If IpRicevute.Tag <> "" Then
		If Not(mod1.Sub129(IpRicevute.Tag)) Then
			Dim vObjectToCharSequence23 As Object = "inserire un indirizzo IP valido per la stampante ricevute e fatture (Notch)"
			Dim vObjectToCharSequence24 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence23, vObjectToCharSequence24, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
	End If
	If ipDistributore.Tag <> "" Then
		If Not(mod1.Sub129(ipDistributore.Tag)) Then
			Dim vObjectToCharSequence25 As Object = "inserire un indirizzo IP valido del terminale sul quale è installato l'infinity Manager"
			Dim vObjectToCharSequence26 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence25, vObjectToCharSequence26, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
	End If
	If mD1.Text <> "" Then
		Dim vSplit() As String = Regex.Split(";", mD1.Text)
		Dim length As Int = vSplit.Length - 1
		Dim i As Int
		For i = 0 To length
			If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", vSplit(i).ToLowerCase)) Then
				Dim vObjectToCharSequence27 As Object = "Il Primo indirizzo email di destinazione non è corretto (" & vSplit(i) & ")"
				Dim vObjectToCharSequence28 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence27, vObjectToCharSequence28, "OK", "", "", Main.vBmp1)
				mod1.Sub081
				Return
			End If
		Next
	End If
	If mD2.Text <> "" Then
		Dim vSplit2() As String = Regex.Split(";", mD2.Text)
		Dim length2 As Int = vSplit2.Length - 1
		Dim i2 As Int
		For i2 = 0 To length2
			If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", vSplit2(i2).ToLowerCase)) Then
				Dim vObjectToCharSequence29 As Object = "Il Secondo indirizzo email di destinazione non è corretto (" & vSplit2(i2) & ")"
				Dim vObjectToCharSequence30 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence29, vObjectToCharSequence30, "OK", "", "", Main.vBmp1)
				mod1.Sub081
				Return
			End If
		Next
	End If
	If mD3.Text <> "" Then
		If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", mD3.Text.ToLowerCase)) Then
			Dim vObjectToCharSequence31 As Object = "L'indirizzo email del centro di assistenza non è corretto"
			Dim vObjectToCharSequence32 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence31, vObjectToCharSequence32, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
	End If
	If mD4.Text <> "" Then
		If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", mD4.Text.ToLowerCase)) Then
			Dim vObjectToCharSequence33 As Object = "L'indirizzo email per il riordino tabacchi non è corretto"
			Dim vObjectToCharSequence34 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence33, vObjectToCharSequence34, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
	End If
	If mD5.Text <> "" Then
		If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", mD5.Text.ToLowerCase)) Then
			Dim vObjectToCharSequence35 As Object = "L'indirizzo email per l'invio dati giornalieri al commercialista non è corretto"
			Dim vObjectToCharSequence36 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence35, vObjectToCharSequence36, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
	End If
	Dim i3 As Int = 200
	If DisconnettiPrt.Checked Then
		i3 = 20
	End If
	If IsNumber(nCassa.Text) Then
		If modfunstr.Sub006(nCassa.Text) > 0 Then
			If modfunstr.Sub006(nCassa.Text) <= i3 Then
				z = False
				If Not(z) Then
					Dim vObjectToCharSequence37 As Object = "Il numero cassa deve essere compreso tra 1 e " & i3 & "."
					Dim vObjectToCharSequence38 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence37, vObjectToCharSequence38, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				End If
				If DataOraNoRoot.Checked And RootDateTime.Checked Then
					Dim vObjectToCharSequence39 As Object = "Non possono essere abilitati simultaneamente i parametri di impostazione Data e Ora del " & Main.vStr1 & " (con e senza i diritti di Root)"
					Dim vObjectToCharSequence40 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence39, vObjectToCharSequence40, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				End If
				Dim checked6 As Boolean = DataOraNoRoot.Checked
				If checked6 <> Main.v_dataoranoroot Then
					Dim vObjectToCharSequence41 As Object = "Il programma verrà chiuso per abilitare il nuovo settaggio 'Data e ora da MF'"
					Dim vObjectToCharSequence42 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence41, vObjectToCharSequence42, "OK", "", "", Main.vBmp1)
					z2 = True
				Else
					z2 = z5
				End If
				Dim i4 As Int
				For i4 = 0 To 2
					If vIntArr4(i4) <> -1000 Then
						ProgressDialogShow("Ricalcolo listino " & i4 + 2 & " in corso")
						Dim str As String = "round(list1+(round(list1 * " & vIntArr4(i4) & ",2) /100)," & vInt9 & ")"
						If vIntArr4(i4) = 0 Then
							str = "round(list1,2)"
						End If
						If i4 = 0 Then
							Main.vSql1.ExecNonQuery("update anagra set list" & i4 + 2 & " = " & str & " where flgusointerno = 0 and reparto >0")
						Else
							Main.vSql1.ExecNonQuery("update anagra set list" & i4 + 2 & " = " & str & " where flgusointerno = 0 and bvar=0 and reparto >0")
						End If
						ProgressDialogHide
					End If
				Next
				If vBln6 Then
					Main.vSql1.ExecNonQuery("update anagra set reparto = 98 where codint ='ric'")
					Main.vSql1.ExecNonQuery("update reparti set NF = " & IIf(RicCredito.Checked, "1", "0") & " where codice =98")
				End If
				If vBln5 Then
					If R10.Text.Trim.Length < 19 Then
						Main.vSql1.ExecNonQuery("update intesta set descrizione ='' ,tipo =" & s10.SelectedIndex + 1 & " where codice =6")
					Else If R10.Text.Trim.Length >= 19 Then
						Main.vSql1.ExecNonQuery("update intesta set descrizione ='" & R10.Text.SubString(18).Replace(CRLF, "") & "' ,tipo =" & s10.SelectedIndex + 1 & " where codice =6")
					End If
					If r11.Text.Trim.Length < 19 Then
						Main.vSql1.ExecNonQuery("update intesta set descrizione ='' ,tipo =" & s11.SelectedIndex + 1 & " where codice =7")
					Else If r11.Text.Trim.Length >= 19 Then
						Main.vSql1.ExecNonQuery("update intesta set descrizione ='" & r11.Text.SubString(18).Replace(CRLF, "") & "' ,tipo =" & s11.SelectedIndex + 1 & " where codice =7")
					End If
					vBln5 = False
				End If
				If vInt8 >= 0 Then
					Main.vSql1.ExecNonQuery("update progressivi set valore = " & vInt8 & " where codice = 'RECEIVE'")
				End If
				If vInt7 >= 0 Then
					If Main.vBln25 Then
						Main.vSql2.ExecNonQuery("update progressivi set valore = " & vInt7 & " where codice = 'SEND'")
					Else
						Main.vSql1.ExecNonQuery("update progressivi set valore = " & vInt7 & " where codice = 'SEND'")
					End If
				End If
				vInt8 = -1
				vInt7 = -1
				If vBln3 Then
					Main.vSql1.ExecNonQuery("update intesta set descrizione ='' where codice <6")
					If r1.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intesta set descrizione ='" & r1.Text.SubString(8).Replace(CRLF, "") & "' ,tipo =" & s1.SelectedIndex + 1 & " where codice =0")
					End If
					If r2.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intesta set descrizione ='" & r2.Text.SubString(8).Replace(CRLF, "") & "' ,tipo =" & s2.SelectedIndex + 1 & " where codice =1")
					End If
					If r3.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intesta set descrizione ='" & r3.Text.SubString(8).Replace(CRLF, "") & "' ,tipo =" & s3.SelectedIndex + 1 & " where codice =2")
					End If
					If r4.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intesta set descrizione ='" & r4.Text.SubString(8).Replace(CRLF, "") & "' ,tipo =" & s4.SelectedIndex + 1 & " where codice =3")
					End If
					If r5.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intesta set descrizione ='" & r5.Text.SubString(8).Replace(CRLF, "") & "' ,tipo =" & s5.SelectedIndex + 1 & " where codice =4")
					End If
					If r6.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intesta set descrizione ='" & r6.Text.SubString(8).Replace(CRLF, "") & "' ,tipo =" & s6.SelectedIndex + 1 & " where codice =5")
					End If
					Main.v_intesta = True
					vBln5 = False
				End If
				If vBln4 Then
					Main.vSql1.ExecNonQuery("update intestaNF set descrizione ='' where codice <6")
					If R1NF.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intestaNF set descrizione ='" & R1NF.Text.SubString(8).Replace(CRLF, "") & "'  where codice =0")
					End If
					If R2NF.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intestaNF set descrizione ='" & R2NF.Text.SubString(8).Replace(CRLF, "") & "'  where codice =1")
					End If
					If R3NF.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intestaNF set descrizione ='" & R3NF.Text.SubString(8).Replace(CRLF, "") & "'  where codice =2")
					End If
					If R4NF.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intestaNF set descrizione ='" & R4NF.Text.SubString(8).Replace(CRLF, "") & "'  where codice =3")
					End If
					If R5NF.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intestaNF set descrizione ='" & R5NF.Text.SubString(8).Replace(CRLF, "") & "'  where codice =4")
					End If
					If R6NF.Text.Trim.Length > 9 Then
						Main.vSql1.ExecNonQuery("update intestaNF set descrizione ='" & R6NF.Text.SubString(8).Replace(CRLF, "") & "'  where codice =5")
					End If
				End If
				Dim value As Double = SeekBar1.Value / 100
				Dim d As Double = IIf(value < 0.1, 0.1, value)
				If vBln7 Then
					mod1.vBln4 = True
					File.WriteString(mod1.vStr4, "dotastiera.txt", "applica")
					Main.vInt12 = vInt2
					Main.vInt13 = vInt3
					Main.vInt14 = vInt4
					Main.vInt15 = vInt5
					Main.vInt11 = vInt2 * vInt3
					Dim vObjectToCharSequence43 As Object = "Per applicare la nuova tastiera è necessario ricaricare il programma."
					Dim vObjectToCharSequence44 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence43, vObjectToCharSequence44, "OK", "", "", Main.vBmp1)
				End If
				Main.v_tastiera = TipoTastiera.SelectedIndex
				Main.v_colonnevarianti = ColonneVarianti.SelectedIndex
				Main.v_articolizero = ArticoliZero.SelectedIndex
				Main.v_tipointerfaccia = TipoInterfaccia.SelectedIndex
				Main.v_pagamentoprep = PagamentoPrep.SelectedIndex
				Main.v_ordinamentosc = OrdinamentoSc.SelectedIndex
				Main.v_tipoimptabacchi = TipoImpTabacchi.SelectedIndex
				Main.v_ivadefault = IvaDefault.SelectedIndex
				Main.v_arrotondav = ArrotondaV.SelectedIndex
				Main.v_arrotondacontantirt = ArrotondaContantiRT.SelectedIndex
				Main.v_fontsizec = FontSizeC.SelectedIndex
				Main.v_codattivazione = CodAttivazione.Text
				Main.v_codattivazionesb = btnImportaSB.Tag
				Main.v_codattivazionebs = btnImportaBasicSupport.Tag
				Main.v_xpunti = vInt10
				Main.v_marginetabacchi = vInt11
				Main.v_ognoeuro = vInt12
				Main.v_ipcassa = IPCassa.Text
				Main.v_ipvis = IpVis.Text
				Main.v_iprpi = IpRPI.Text
				Main.v_usbpath = UsbPath.Tag
				Main.v_ipeftsm = IPEFTSM.Tag
				Main.v_portaeftsm = PORTAEFTSM.Tag
				Main.v_webapipi = WebApiPI.Tag
				Main.v_webapiindirizzo = WebApiIndirizzo.Tag
				Main.v_webapidatiretailer = WebApiDatiRetailer.Checked
				Main.v_webapipiesercente = WebApiPIEsercente.Tag
				Main.v_webapicapesercente = WebApiCAPEsercente.Tag
				Main.v_webapiragsoc = WebApiRagSoc.Tag
				Main.v_eftsm = EFTSM.Checked
				Main.v_eftsmstampa = EFTSMStampa.Checked
				Main.v_eftsmsconti = EFTSMSCONTI.Checked
				Main.v_ipeftm(1) = IpEFT1.Tag
				Main.v_ipeftm(2) = IpEFT2.Tag
				Main.v_ipeftm(3) = IpEFT3.Tag
				Main.v_ipeftm(4) = IpEFT4.Tag
				Main.v_ipeftm(5) = IpEFT5.Tag
				Main.v_ipeftm(6) = IpEFT6.Tag
				Main.v_ipeftm(7) = IpEFT7.Tag
				Main.v_ipeftm(8) = IpEFT8.Tag
				Main.v_ipeftm(9) = IpEFT9.Tag
				Main.v_procauto(1) = ProcAuto1.Tag
				Main.v_procauto(2) = ProcAuto2.Tag
				Main.v_procauto(3) = ProcAuto3.Tag
				Main.v_procauto(4) = ProcAuto4.Tag
				Main.v_procauto(5) = ProcAuto5.Tag
				Main.v_salvataggio = Salvataggio.SelectedIndex
				Main.v_sbpwd = vStr1
				Main.v_serversave = ServerSave.Tag
				Main.v_utentesave = UtenteSave.Tag
				Main.v_passwordsave = PasswordSave.Tag
				Main.v_prefixftpsave = PrefixFTPSave.Tag
				If Main.v_prefixftpsave <> "" Then
					If Main.v_salvataggio = 2 Then
						If Not(Main.v_prefixftpsave.EndsWith("/")) Then
							Main.v_prefixftpsave = Main.v_prefixftpsave & "/"
						End If
					End If
				End If
				Dim vObjectToString As String = PercorsoAzzera.Tag
				If vObjectToString <> "" Then
					If Main.v_percorsoazzera <> vObjectToString Then
						If File.Exists(File.DirDefaultExternal, "Venduto.db") Then
							Try
								If Not(File.Exists(vObjectToString, "Venduto.db")) Then
									File.Copy(File.DirDefaultExternal, "Venduto.db", vObjectToString, "Venduto.db")
									If Not(File.Exists(vObjectToString, "Venduto.db")) Then
										Dim vObjectToCharSequence45 As Object = "Errore nella creazione  delle strutture DB per salvataggio dato obsoleti nel percorso: " & Main.v_percorsoazzera
										Dim vObjectToCharSequence46 As Object = Main.vStr8
										Msgbox2(vObjectToCharSequence45, vObjectToCharSequence46, "OK", "", "", Main.vBmp1)
										vObjectToString = ""
									End If
								End If
							Catch
								Dim vObjectToCharSequence47 As Object = "Errore nella creazione  delle strutture DB per salvataggio dato obsoleti nel percorso: " & Main.v_percorsoazzera
								Dim vObjectToCharSequence48 As Object = Main.vStr8
								Msgbox2(vObjectToCharSequence47, vObjectToCharSequence48, "OK", "", "", Main.vBmp1)
								vObjectToString = ""
							End Try
						End If
					End If
				End If
				Main.v_percorsoazzera = vObjectToString
				Main.v_maximpo = lblMaxImpo.Tag
				Main.v_fondocassaauto = FondoCassaAuto.Tag
				Main.v_maximptavolo = MaxImpTavolo.Tag
				Main.v_tipofrazionamentovariazioni = TipoFrazionamentoVariazioni.Tag
				Main.v_valorizzazioneprezzofrazione = ValorizzazionePrezzoFrazione.Tag
				Main.v_websospenditavolo = WebSospendiTavolo.Tag
				Main.v_mintavololento = MinTavoloLento.Tag
				Main.v_copiefe = CopieFE.Tag
				Main.v_copiefe2 = CopieFE2.Tag
				Main.v_listpoco = ListPoco.Tag
				Main.v_listmolto = ListMolto.Tag
				Main.v_iniziogiorno = InizioGiorno.Tag
				Main.v_altezzavariazioni = bAltezzaVariazioni.Tag
				Main.v_asportoanticipo = AsportoAnticipo.Tag
				Main.v_minutiss = MinutiSS.Tag
				Main.v_numeroscontrinist = NumeroScontriniST.Tag
				Main.v_prenotagiorni = PrenotaGiorni.Tag
				Main.v_prenotagiorniapertura = PrenotaGiorniApertura.Tag
				Main.v_numerott = NumeroTT.Tag
				Main.v_stampaconto = StampaConto.Tag
				Main.v_stampafattura = StampaFattura.Tag
				Main.v_sendclienti = SendClienti.Tag
				Main.v_ricevutaacli = vInt16
				Main.v_ricevutaacor = vInt18
				Main.v_ricevutaapdv = vInt14
				Main.v_ricevutadacor = vInt17
				Main.v_ricevutadacli = vInt15
				Main.v_ricevutadapdv = vInt13
				Main.v_ricevutaspaziomf = vInt19
				Main.v_consolidaincassi = ConsolidaIncassi.Checked
				Main.v_ipricevute = IpRicevute.Tag
				Main.v_ipdistributore = ipDistributore.Tag
				Main.v_desasporto = DesAsporto.Tag
				Main.v_despreconto = DesPreconto.Tag
				Main.v_desatesta = DesATesta.Tag
				Main.v_dalle = vIntArr1
				Main.v_salvaora = SalvaOra.Tag
				Main.v_alle = vIntArr2
				Main.v_listinoh = vIntArr3
				Main.v_riepnf = RiepNF.SelectedIndex
				Main.v_errmail = ErrMail.Checked
				Main.v_glory = gloryN.SelectedIndex
				Main.v_tallonpremio = TallonPremio.Checked
				Main.v_listino2azero = Listino2aZero.Checked
				Main.v_controllaprezziazero = ControllaPrezziaZero.Checked
				Main.v_fatturafmt2 = FatturaFMT2.Checked
				Main.v_attivafe = AttivaFE.Checked
				Main.v_pausafe = PausaFE.Checked
				Main.v_asyncfe = AsyncFE.Tag
				Main.v_tabacchi = GestioneTabacchi.Checked
				Main.v_gestionespiagge = GestioneSpiagge.Checked
				Main.v_prefissocoupon = PrefissoCoupon.Tag
				Main.v_paginapagamenti = PaginaPagamenti.Tag
				Main.v_ipserverbila = ServerBila.Text
				Main.v_attivamp = AttivaMP.Checked
				Main.v_attivakeyhttp = AttivaKeyHTTP.Checked
				Main.v_attivainserimentocliente = AttivaInserimentoCliente.Checked
				Main.v_attivasezionali = AttivaSezionali.Checked
				If Main.v_attivaazzeramentoprogressivi <> AttivaAzzeramentoProgressivi.Checked And AttivaAzzeramentoProgressivi.Checked Then
					Dim vGetYear As Int = DateTime.GetYear(DateTime.Now)
					If Main.vSql2.ExecQuerySingleResult("Select count(*) from AzzeraProgressivi where Anno =" & SmartStringFormatter("", vGetYear) & "") = 0 Then
						Main.vSql2.ExecNonQuery("insert into AzzeraProgressivi(Anno,Stato) values(" & SmartStringFormatter("", vGetYear) & ",1) ")
					Else
						Main.vSql2.ExecNonQuery("update AzzeraProgressivi  set Stato=1 where Anno=" & SmartStringFormatter("", vGetYear) & " ")
					End If
				End If
				Main.v_attivaazzeramentoprogressivi = AttivaAzzeramentoProgressivi.Checked
				Main.v_noteinfe = noteInFE.Checked
				Main.v_lastdatadocfm = LastDataDocFM.Checked
				Main.v_termsala = TermSala.Checked
				Main.v_termsalab = TermSala.Tag
				Main.v_termsalaop = vInt6
				Main.v_centralizzadoc = CentralizzaDoc.Checked
				Main.v_giacsede = GiacSede.Checked
				Main.v_modificamovimento = ModificaMovimento.Checked
				Main.v_importazioneauto = ImportazioneAuto.Checked
				Main.v_stampasala = StampaSala.Checked
				If Not(Stampa66Char.Checked) Then
					If Not(Main.v_matricola.StartsWith("PR")) Then
						If Not(Main.v_matricola.StartsWith("PX")) Then
							z3 = False
							Main.v_stampa66char = z3
							Main.v_repartogv = RepartoGV.Tag
							Main.v_nsalva = nSalva.Tag
							Main.v_tema2 = Tema2.Checked
							Main.v_temag = TipoLayout.Tag
							Main.v_sfondo = vPnl2.Tag
							Main.v_prefissocliente = PrefissoCliente.Tag
							Main.v_prefissott = PrefissoTT.Tag
							Main.v_intestanf = IntestaNF.Checked
							Main.v_riepnfdett = RiepNFDett.Checked
							Main.v_exportcorrispettivi = ExportCorrispettivi.Checked
							Main.v_changeuscita = ChangeUscita.Checked
							Main.v_eula = Eula.Checked
							Main.v_stampacomande = StampaComande.Checked
							Main.v_turni = Turni.Checked
							Main.v_asportoora = AsportoOra.Checked
							Main.v_salvavd = SalvaVD.SelectedIndex
							Main.v_consolida = Consolida.Checked
							Main.v_consolidasc = ConsolidaSc.Checked
							Main.v_varautocp = VarAutoCP.Checked
							Main.v_visualizzavariazioni = VisualizzaVariazioni.Checked
							Main.v_ordinainserimentovariazioni = OrdinaInserimentoVariazioni.Checked
							Main.v_gestcoperti2 = GestCoperti2.Checked
							Main.v_consolidalast = ConsolidaLast.Checked
							Main.v_obbligoop = ObbligoOp.Checked
							Main.v_obbligoopavvio = ObbligoOPAvvio.Checked
							Main.v_obbligoopmovimento = ObbligoOpMovimento.Checked
							Main.v_opextended = OpExtended.Checked
							Main.v_opobbligatorio = OpObbligatorio.Checked
							Main.v_terminalino = Terminalino.Checked
							Main.v_daticompletidc = DatiCompletiDC.Checked
							Main.v_regcancellazioni = RegCancellazioni.Checked
							Main.v_logmf = LogMF.Checked
							Main.v_logvd = LogVD.Checked
							Main.v_lognf = LogNF.Checked
							Main.v_riducimsg = RiduciMsg.Checked
							Main.v_noforcecoperti = NoForceCoperti.Checked
							Main.v_rieponly = RiepOnly.Checked
							Main.v_verificastampanti = VerificaStampanti.Checked
							Main.v_azzeraasporto = AzzeraAsporto.Checked
							Main.v_chiedinasporto = ChiediNAsporto.Checked
							Main.v_icone2 = Icone2.Checked
							Main.v_rootdatetime = RootDateTime.Checked
							Main.v_dataoranoroot = DataOraNoRoot.Checked
							Main.v_attivanumtavolo = AttivaNumTavolo.Checked
							Main.v_sottoconti = Sottoconti.Checked
							Main.v_adddisponibilita = AddDisponibilita.Checked
							Main.v_frazionaconimporto = FrazionaConImporto.SelectedIndex
							Main.v_imposuqta = ImpoSuQta.Checked
							Main.v_leggicodlotteria = LeggiCodLotteria.Checked
							Main.v_solochiusura = SoloChiusura.Checked
							Main.v_consideraprzintero = ConsideraPrzIntero.Checked
							Main.v_tastiombreggiati = TastiOmbreggiati.Checked
							Main.v_disconnettiprt = DisconnettiPrt.Checked
							Main.v_incassooperatori = IncassoOperatori.Checked
							Main.v_riccredito = RicCredito.Checked
							Main.v_orafatt = OraFatt.Checked
							Main.v_stampasposta = StampaSposta.Checked
							If Emergenza.Checked Then
								If Main.v_ipvis <> "" Then
								End If
								If Main.v_salvavd = 2 Then
								End If
								If Main.v_iprpi <> "" Then
								End If
							End If
							Dim z6 As Boolean = False
							Main.v_emergenza = z6
							Main.v_totem = Totem.Checked
							Main.v_controlloturni = ControlloTurni.Checked
							Main.v_avantiturnoauto = AvantiTurnoAuto.Checked
							Main.v_turno1sempre = Turno1Sempre.Checked
							If Main.v_spooler Then
								Main.v_disconnettiprt = True
							End If
							Main.v_checkvarianti = CheckVarianti.Checked
							Main.v_notallon = NoTallon.Tag
							Main.v_stampareport = StampaReport.Tag
							Main.v_tallonsempre = TallonSempre.Checked
							Main.v_cassettosubito = CassettoSubito.Checked
							Main.v_suonodacassa = SuonoDaCassa.Checked
							Main.v_stampanomecli = StampaNomeCli.SelectedIndex
							Main.v_numcassa = nCassa.Text
							Main.v_nnegozio = nNegozio.Text
							Main.v_ipserver = Server.Text
							If Main.v_ipserver.Trim = "" Then
								Main.v_ipserver = "192.168.1.110"
							End If
							Main.v_screenbrightness = d
							Main.v_uid = Utente.Text
							Main.v_pwd = Password.Text
							Main.v_mserver = mServer.Text
							Main.v_attivaterminale = AttivaTerminale.Checked
							If SoloVenduto.Checked And AttivaTerminale.Checked Then
								z4 = True
							End If
							Main.v_solovenduto = z4
							Main.v_azzeradati = AzzeraDati.Checked
							Main.v_nodatiperiodo = NoDatiPeriodo.Checked
							Main.v_mantieninopaginati = MantieniNoPaginati.Checked
							Main.v_mporta = mPorta.Text
							Main.v_muser = mUser.Text
							Main.v_musers = mUserS.Text
							Main.v_mpwd = mPwd.Text
							Main.v_mpwds = mPwdS.Text
							Main.v_mdesmittente = mDesMittente.Text
							Main.v_md1 = mD1.Text
							Main.v_md2 = mD2.Text
							Main.v_md3 = mD3.Text
							Main.v_md4 = mD4.Text
							Main.v_md5 = mD5.Text
							Main.v_barra = barra.Text
							Main.v_barra2 = barra2.Text
							Main.v_barrareal = barra.Text
							Main.v_barrareal2 = barra2.Text
							If Main.v_attivafe Then
								Main.v_barra = Main.v_barra.Replace("-yyyy-", DateTime.GetYear(mod1.Sub058))
								Main.v_barra2 = Main.v_barra2.Replace("-yyyy-", DateTime.GetYear(mod1.Sub058))
							End If
							Main.v_obbligoclientef = ObbligoClienteF.Checked
							mod1.Sub216
							If Main.vBln24 Then
								Main.vSql1.ExecNonQuery("update clients set stato =0,IP='' where codice = " & Main.v_numcassa)
							End If
							If Main.v_spooler Then
								Dim sb3 As String = mod1.vStr4 & "/Spooler"
								File.WriteString(sb3, "update.txt", " ")
							End If
							vBln8 = True
							Main.vBln31 = True
							If z2 Then
								mod1.vBln4 = True
							End If
							mod1.Sub198("Main")
							Activity.Finish
							Return
						End If
					End If
				End If
				z3 = True
				Main.v_stampa66char = z3
				Main.v_repartogv = RepartoGV.Tag
				Main.v_nsalva = nSalva.Tag
				Main.v_tema2 = Tema2.Checked
				Main.v_temag = TipoLayout.Tag
				Main.v_sfondo = vPnl2.Tag
				Main.v_prefissocliente = PrefissoCliente.Tag
				Main.v_prefissott = PrefissoTT.Tag
				Main.v_intestanf = IntestaNF.Checked
				Main.v_riepnfdett = RiepNFDett.Checked
				Main.v_exportcorrispettivi = ExportCorrispettivi.Checked
				Main.v_changeuscita = ChangeUscita.Checked
				Main.v_eula = Eula.Checked
				Main.v_stampacomande = StampaComande.Checked
				Main.v_turni = Turni.Checked
				Main.v_asportoora = AsportoOra.Checked
				Main.v_salvavd = SalvaVD.SelectedIndex
				Main.v_consolida = Consolida.Checked
				Main.v_consolidasc = ConsolidaSc.Checked
				Main.v_varautocp = VarAutoCP.Checked
				Main.v_visualizzavariazioni = VisualizzaVariazioni.Checked
				Main.v_ordinainserimentovariazioni = OrdinaInserimentoVariazioni.Checked
				Main.v_gestcoperti2 = GestCoperti2.Checked
				Main.v_consolidalast = ConsolidaLast.Checked
				Main.v_obbligoop = ObbligoOp.Checked
				Main.v_obbligoopavvio = ObbligoOPAvvio.Checked
				Main.v_obbligoopmovimento = ObbligoOpMovimento.Checked
				Main.v_opextended = OpExtended.Checked
				Main.v_opobbligatorio = OpObbligatorio.Checked
				Main.v_terminalino = Terminalino.Checked
				Main.v_daticompletidc = DatiCompletiDC.Checked
				Main.v_regcancellazioni = RegCancellazioni.Checked
				Main.v_logmf = LogMF.Checked
				Main.v_logvd = LogVD.Checked
				Main.v_lognf = LogNF.Checked
				Main.v_riducimsg = RiduciMsg.Checked
				Main.v_noforcecoperti = NoForceCoperti.Checked
				Main.v_rieponly = RiepOnly.Checked
				Main.v_verificastampanti = VerificaStampanti.Checked
				Main.v_azzeraasporto = AzzeraAsporto.Checked
				Main.v_chiedinasporto = ChiediNAsporto.Checked
				Main.v_icone2 = Icone2.Checked
				Main.v_rootdatetime = RootDateTime.Checked
				Main.v_dataoranoroot = DataOraNoRoot.Checked
				Main.v_attivanumtavolo = AttivaNumTavolo.Checked
				Main.v_sottoconti = Sottoconti.Checked
				Main.v_adddisponibilita = AddDisponibilita.Checked
				Main.v_frazionaconimporto = FrazionaConImporto.SelectedIndex
				Main.v_imposuqta = ImpoSuQta.Checked
				Main.v_leggicodlotteria = LeggiCodLotteria.Checked
				Main.v_solochiusura = SoloChiusura.Checked
				Main.v_consideraprzintero = ConsideraPrzIntero.Checked
				Main.v_tastiombreggiati = TastiOmbreggiati.Checked
				Main.v_disconnettiprt = DisconnettiPrt.Checked
				Main.v_incassooperatori = IncassoOperatori.Checked
				Main.v_riccredito = RicCredito.Checked
				Main.v_orafatt = OraFatt.Checked
				Main.v_stampasposta = StampaSposta.Checked
				If Emergenza.Checked Then
				End If
				Dim z62 As Boolean = False
				Main.v_emergenza = z62
				Main.v_totem = Totem.Checked
				Main.v_controlloturni = ControlloTurni.Checked
				Main.v_avantiturnoauto = AvantiTurnoAuto.Checked
				Main.v_turno1sempre = Turno1Sempre.Checked
				If Main.v_spooler Then
				End If
				Main.v_checkvarianti = CheckVarianti.Checked
				Main.v_notallon = NoTallon.Tag
				Main.v_stampareport = StampaReport.Tag
				Main.v_tallonsempre = TallonSempre.Checked
				Main.v_cassettosubito = CassettoSubito.Checked
				Main.v_suonodacassa = SuonoDaCassa.Checked
				Main.v_stampanomecli = StampaNomeCli.SelectedIndex
				Main.v_numcassa = nCassa.Text
				Main.v_nnegozio = nNegozio.Text
				Main.v_ipserver = Server.Text
				If Main.v_ipserver.Trim = "" Then
				End If
				Main.v_screenbrightness = d
				Main.v_uid = Utente.Text
				Main.v_pwd = Password.Text
				Main.v_mserver = mServer.Text
				Main.v_attivaterminale = AttivaTerminale.Checked
				If SoloVenduto.Checked Then
					z4 = True
				End If
				Main.v_solovenduto = z4
				Main.v_azzeradati = AzzeraDati.Checked
				Main.v_nodatiperiodo = NoDatiPeriodo.Checked
				Main.v_mantieninopaginati = MantieniNoPaginati.Checked
				Main.v_mporta = mPorta.Text
				Main.v_muser = mUser.Text
				Main.v_musers = mUserS.Text
				Main.v_mpwd = mPwd.Text
				Main.v_mpwds = mPwdS.Text
				Main.v_mdesmittente = mDesMittente.Text
				Main.v_md1 = mD1.Text
				Main.v_md2 = mD2.Text
				Main.v_md3 = mD3.Text
				Main.v_md4 = mD4.Text
				Main.v_md5 = mD5.Text
				Main.v_barra = barra.Text
				Main.v_barra2 = barra2.Text
				Main.v_barrareal = barra.Text
				Main.v_barrareal2 = barra2.Text
				If Main.v_attivafe Then
				End If
				Main.v_obbligoclientef = ObbligoClienteF.Checked
				mod1.Sub216
				If Main.vBln24 Then
				End If
				If Main.v_spooler Then
				End If
				vBln8 = True
				Main.vBln31 = True
				If z2 Then
				End If
				mod1.Sub198("Main")
				Activity.Finish
				Return
			End If
		End If
	End If
	z = True
	If Not(z) Then
	End If
End Sub

Sub Consolida_CheckedChange(z As Boolean)
	If z And Sottoconti.Checked Then
		Dim vObjectToCharSequence As Object = "ATTENZIONE ...." & CRLF & "Abilitando questo parametro verrà disattivata la gestione dei sottoconti." & CRLF & "Si desidera proseguire ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "SI", "", "NO", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			Consolida.Checked = False
			Return
		End If
		Sottoconti.Checked = False
		Return
	End If
End Sub

Sub ConsolidaLast_CheckedChange(z As Boolean)
	Sub025(Consolida, z)
	If z Then
		Consolida.Checked = Main.v_consolida
		Return
	End If
	Consolida.Checked = False
End Sub

Sub CopiaDBsuUsb_Click
	If mD3.Text <> "" Then
		If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", mD3.Text.ToLowerCase)) Then
			Dim vObjectToCharSequence As Object = "L'indirizzo email del centro di assistenza non è corretto"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
		Dim vObjectToCharSequence3 As Object = "Si desidera Inviare il DB all'indirizzo dell'assistenza tecnica o copiare l'ultimo salvataggio effettuato su supporto Usb ?  "
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Mail", "Annulla", "USB", Main.vBmp1)
		If vMsgbox2 = -1 Then
			Dim vObjectToCharSequence5 As Object = "Si desidera inviare solo l'anagrafica o l'anagrafica + venduto periodico ?  "
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "Completo", "Annulla", "Anagrafica", Main.vBmp1)
			If vMsgbox22 = -1 Then
				If File.Exists(File.DirRootExternal, "LastDB.zi_") Then
					File.Delete(File.DirRootExternal, "LastDB.zi_")
				End If
				If File.Exists(File.DirRootExternal, "LastLOG.zi_") Then
					File.Delete(File.DirRootExternal, "LastLOG.zi_")
				End If
				Dim archiverForB4A As ArchiverForB4A
				archiverForB4A.ZipFolder(mod1.vStr4, File.DirRootExternal, "LastLOG.zi_", "")
				Dim dirDefaultExternal As String = File.DirDefaultExternal
				archiverForB4A.ZipFolder(dirDefaultExternal, File.DirRootExternal, "LastDB.zi_", "")
				mod1.Sub132("Invio DB Completo", vSMTP1, "Invio DB Completo", True)
				mod1.Sub081
				Return
			End If
			If vMsgbox22 = -2 Then
				If File.Exists(File.DirRootExternal, "LastDB.zi_") Then
					File.Delete(File.DirRootExternal, "LastDB.zi_")
				End If
				If File.Exists(File.DirRootExternal, "LastLOG.zi_") Then
					File.Delete(File.DirRootExternal, "LastLOG.zi_")
				End If
				Dim archiverForB4A2 As ArchiverForB4A
				Dim dirDefaultExternal2 As String = File.DirDefaultExternal
				archiverForB4A2.ZipFiles(dirDefaultExternal2, Array As String("Anagra.db", "Config.txt"), File.DirRootExternal, "LastDB.zi_", "")
				mod1.Sub132("Invio DB (Solo Anagrafica)", vSMTP1, "Invio DB ", True)
				mod1.Sub081
				Return
			End If
			mod1.Sub081
			Return
		End If
		If vMsgbox2 = -3 Then
			mod1.Sub081
			Return
		End If
	End If
	Dim fileDialog As FileDialog
	fileDialog.TextColor = -7829368
	fileDialog.FastScroll = True
	fileDialog.FileFilter = "DB.zip"
	If Main.v_usbpath <> "" Then
		fileDialog.FilePath = Main.v_usbpath
	Else
		fileDialog.FilePath = mod1.vStr4
		Dim vObjectToCharSequence7 As Object = "Selezionare dove copiare l'ultimo salvataggio effettuato."
		Dim vShow As Int = fileDialog.Show(vObjectToCharSequence7, "OK", "Annulla", "", Main.vBmp1)
		If vShow = -3 Then
			Return
		End If
	End If
	Dim list As List
	list.Initialize
	list.AddAll(File.ListFiles(mod1.vStr4))
	Dim size As Int = list.Size - 1
	Dim i As Int = 0
	Dim i2 As Int
	For i2 = 0 To size
		Dim vObjectToString As String = list.Get(i2)
		If vObjectToString.StartsWith(Main.vStr8) And vObjectToString.EndsWith("DB.zip") Then
			Try
				File.Copy(mod1.vStr4, vObjectToString, fileDialog.FilePath, vObjectToString)
				If Not(File.Exists(fileDialog.FilePath, vObjectToString)) Then
					Dim vObjectToCharSequence8 As Object = "Il percorso " & fileDialog.FilePath & " non è stato trovato"
					Dim vObjectToCharSequence9 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence8, vObjectToCharSequence9, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				End If
				i = i + 1
			Catch
				Dim vObjectToCharSequence10 As Object = "Il percorso " & fileDialog.FilePath & " non è stato trovato"
				Dim vObjectToCharSequence11 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence10, vObjectToCharSequence11, "OK", "", "", Main.vBmp1)
				mod1.Sub081
				Return
			End Try
		End If
	Next
	If i = 0 Then
		Dim vObjectToCharSequence12 As Object = "Non è stato trovato nessun salvataggio da copiare"
		Dim vObjectToCharSequence13 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence12, vObjectToCharSequence13, "OK", "", "", Main.vBmp1)
	Else If i = 1 Then
		Dim vObjectToCharSequence14 As Object = "Il salvataggio è stato copiato in " & fileDialog.FilePath
		Dim vObjectToCharSequence15 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence14, vObjectToCharSequence15, "OK", "", "", Main.vBmp1)
	Else
		Dim vObjectToCharSequence16 As Object = "Copiati " & i & " file"
		Dim vObjectToCharSequence17 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence16, vObjectToCharSequence17, "OK", "", "", Main.vBmp1)
	End If
	mod1.Sub081
End Sub

Sub CopieFE_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 1
	numberDialog.Number = CopieFE.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il numero di copie per il tallon di riepilogo Fattura elettronica  (PA + B2B)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		CopieFE.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (PA + B2B):" & numberDialog.Number
		CopieFE.Tag = numberDialog.Number
		Return
	End If
End Sub

Sub CopieFE2_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 1
	numberDialog.Number = CopieFE2.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il numero di copie per il tallon di riepilogo Fattura elettronica  (B2C)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		CopieFE2.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (B2C):" & numberDialog.Number
		CopieFE2.Tag = numberDialog.Number
		Return
	End If
End Sub

Sub Sub005(str As String, str2 As String)
	If Not(File.Exists(str2, "")) Then
		File.MakeDir(str2, "")
	End If
	Dim vListFiles As List = File.ListFiles(str)
	Dim size As Int = vListFiles.Size
	Dim i As Int
	For i = 0 To size - 1
		Dim vObjectToString As String = vListFiles.Get(i)
		If File.IsDirectory(str, vObjectToString) Then
			Dim vCombine As String = File.Combine(str, vObjectToString)
			Sub005(vCombine, File.Combine(str2, vObjectToString))
		Else
			File.Copy(str, vObjectToString, str2, vObjectToString)
		End If
	Next
End Sub

Sub Sub006(i As Int, buttonWrapper As Button, i2 As Int, str As String) As Panel
	mod1.vStr2 = "CreateListItemFLG"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = 0
	Try
		buttonWrapper.RemoveView
		buttonWrapper.Background = mod1.Sub155(i2, 25)
		buttonWrapper.TextColor = -16777216
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("bHelp")
		If str <> "" Then
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2).png")
			imageViewWrapper.Tag = str
		Else
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2)BN.png")
			imageViewWrapper.Enabled = False
		End If
		If str = " " Then
			imageViewWrapper.Enabled = False
		End If
		If Main.vBln25 Then
			imageViewWrapper.Visible = buttonWrapper.Visible
		End If
		panelWrapper.AddView(buttonWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(54), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(55), DipToCurrent(0), PerXToCurrent(6), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub007(i As Int, buttonWrapper As Button, buttonWrapper2 As Button, i2 As Int, str As String) As Panel
	mod1.vStr2 = "CreateListItemFLGeBTN"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = 0
	Try
		buttonWrapper2.RemoveView
		buttonWrapper2.Color = i2
		buttonWrapper.RemoveView
		buttonWrapper.Background = mod1.Sub155(i2, 25)
		buttonWrapper2.TextColor = -16777216
		buttonWrapper.TextColor = -16777216
		Dim labelWrapper As Label
		labelWrapper.Initialize("")
		labelWrapper.Text = "/"
		labelWrapper.TextSize = 40
		labelWrapper.TextColor = i2
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("bHelp")
		If str <> "" Then
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2).png")
			imageViewWrapper.Tag = str
		Else
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2)BN.png")
			imageViewWrapper.Enabled = False
		End If
		If Main.vBln25 Then
			imageViewWrapper.Visible = buttonWrapper.Visible
		End If
		panelWrapper.AddView(buttonWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(29), i)
		panelWrapper.AddView(labelWrapper, PerXToCurrent(30), DipToCurrent(0), PerXToCurrent(5), i)
		panelWrapper.AddView(buttonWrapper2, PerXToCurrent(35), DipToCurrent(0), PerXToCurrent(20), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(55), DipToCurrent(0), PerXToCurrent(6), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub008(i As Int, checkBoxWrapper As CheckBox, i2 As Int, str As String) As Panel
	mod1.vStr2 = "CreateListItemFLG"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = 0
	Try
		checkBoxWrapper.RemoveView
		checkBoxWrapper.Background = mod1.Sub155(i2, 0)
		checkBoxWrapper.TextColor = -16777216
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("bHelp")
		If str <> "" Then
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2).png")
			imageViewWrapper.Tag = str
		Else
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2)BN.png")
			imageViewWrapper.Enabled = False
		End If
		If Main.vBln25 Then
			imageViewWrapper.Visible = checkBoxWrapper.Visible
		End If
		panelWrapper.AddView(checkBoxWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(54), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(55), DipToCurrent(0), PerXToCurrent(6), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub009(i As Int, checkBoxWrapper As CheckBox, buttonWrapper As Button, i2 As Int, str As String) As Panel
	mod1.vStr2 = "CreateListItemFLGeBTN"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = 0
	Try
		checkBoxWrapper.RemoveView
		checkBoxWrapper.Background = mod1.Sub155(i2, 0)
		buttonWrapper.RemoveView
		buttonWrapper.Background = mod1.Sub155(i2, 25)
		buttonWrapper.TextColor = -16777216
		checkBoxWrapper.TextColor = -16777216
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("bHelp")
		If str <> "" Then
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2).png")
			imageViewWrapper.Tag = str
		Else
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2)BN.png")
			imageViewWrapper.Enabled = False
		End If
		If Main.vBln25 Then
			imageViewWrapper.Visible = buttonWrapper.Visible
		End If
		panelWrapper.AddView(checkBoxWrapper, PerXToCurrent(30), DipToCurrent(0), PerXToCurrent(25), i)
		panelWrapper.AddView(buttonWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(29), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(55), DipToCurrent(0), PerXToCurrent(6), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub010(i As Int, str As String) As Panel
	mod1.vStr2 = "CreateListItemFLG"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = 0
	Try
		Dim labelWrapper As Label
		labelWrapper.Initialize("")
		labelWrapper.Text = str
		labelWrapper.TextSize = 25
		labelWrapper.TextColor = -256
		panelWrapper.AddView(labelWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(50), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub011(i As Int, labelWrapper As Label, buttonWrapper As Button, i2 As Int, str As String) As Panel
	mod1.vStr2 = "CreateListItemFLGeBTN"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = 0
	Try
		buttonWrapper.RemoveView
		buttonWrapper.Color = i2
		labelWrapper.RemoveView
		labelWrapper.Background = mod1.Sub155(i2, 0)
		labelWrapper.TextColor = -16777216
		buttonWrapper.TextColor = -16777216
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("bHelp")
		If str <> "" Then
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2).png")
			imageViewWrapper.Tag = str
		Else
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2)BN.png")
			imageViewWrapper.Enabled = False
		End If
		If Main.vBln25 Then
			imageViewWrapper.Visible = buttonWrapper.Visible
		End If
		panelWrapper.AddView(labelWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(19), i)
		panelWrapper.AddView(buttonWrapper, PerXToCurrent(20), DipToCurrent(0), PerXToCurrent(35), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(55), DipToCurrent(0), PerXToCurrent(6), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub012(i As Int, labelWrapper As Label, editTextWrapper As EditText, i2 As Int, str As String) As Panel
	mod1.vStr2 = "CreateListItemFLGeBTN"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = 0
	Try
		editTextWrapper.RemoveView
		editTextWrapper.Color = i2
		labelWrapper.RemoveView
		labelWrapper.Background = mod1.Sub155(i2, 0)
		labelWrapper.TextColor = -16777216
		editTextWrapper.TextColor = -16777216
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("bHelp")
		If str <> "" Then
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2).png")
			imageViewWrapper.Tag = str
		Else
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2)BN.png")
			imageViewWrapper.Enabled = False
		End If
		If Main.vBln25 Then
			imageViewWrapper.Visible = editTextWrapper.Visible
		End If
		panelWrapper.AddView(editTextWrapper, PerXToCurrent(20), DipToCurrent(0), PerXToCurrent(35), i)
		panelWrapper.AddView(labelWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(19), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(55), DipToCurrent(0), PerXToCurrent(6), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub013(i As Int, seekBarWrapper As SeekBar) As Panel
	mod1.vStr2 = "CreateListItemFLGeBTN"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = 0
	Try
		Dim labelWrapper As Label
		labelWrapper.Initialize("")
		labelWrapper.Text = "Luminosità schermo"
		labelWrapper.TextSize = 20
		labelWrapper.TextColor = -16777216
		seekBarWrapper.RemoveView
		panelWrapper.AddView(labelWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(24), i)
		panelWrapper.AddView(seekBarWrapper, PerXToCurrent(25), DipToCurrent(0), PerXToCurrent(30), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub014(i As Int, spinnerWrapper As Spinner, i2 As Int, str As String) As Panel
	mod1.vStr2 = "CreateListItemFLG"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	panelWrapper.Color = 0
	Try
		spinnerWrapper.RemoveView
		spinnerWrapper.Background = mod1.Sub155(i2, 25)
		Dim imageViewWrapper As ImageView
		imageViewWrapper.Initialize("bHelp")
		If str <> "" Then
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2).png")
			imageViewWrapper.Tag = str
		Else
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fun_info (2)BN.png")
			imageViewWrapper.Enabled = False
		End If
		If Main.vBln25 Then
			imageViewWrapper.Visible = spinnerWrapper.Visible
		End If
		panelWrapper.AddView(spinnerWrapper, PerXToCurrent(1), DipToCurrent(0), PerXToCurrent(54), i)
		panelWrapper.AddView(imageViewWrapper, PerXToCurrent(55), DipToCurrent(0), PerXToCurrent(6), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub datiRicevute_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = vInt13
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Da .."
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Dati Punto Vendita (dalla riga ..) 0 per non stampare", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If Not(IsNumber(vDlg1.Input)) Then
			Dim vObjectToCharSequence As Object = "Valore non corretto "
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
		If vDlg1.Input < 40 Then
			vInt13 = vDlg1.Input
			Dim i As Int = vInt13
			If vInt13 > 0 Then
				Dim inputDialog6 As InputDialog = vDlg1
				vDlg1.InputType = 2
				vDlg1.Input = vInt14
				vDlg1.PasswordMode = False
				vDlg1.Hint = "A .."
				vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
				Dim vShow2 As Int = vDlg1.Show("Dati Punto Vendita (fino alla riga ..) 0 per non stampare", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
				If vShow2 = -1 Then
					If Not(IsNumber(vDlg1.Input)) Then
						Dim vObjectToCharSequence3 As Object = "Valore non corretto "
						Dim vObjectToCharSequence4 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
						mod1.Sub081
						Return
					End If
					If vDlg1.Input >= 40 Then
						Dim vObjectToCharSequence5 As Object = "Valore non corretto (massimo 40)"
						Dim vObjectToCharSequence6 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
						mod1.Sub081
						Return
					End If
					If vDlg1.Input <= i And i > 0 Then
						Dim vObjectToCharSequence7 As Object = "Valore non corretto (deve essere > " & i & ")"
						Dim vObjectToCharSequence8 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
						mod1.Sub081
						Return
					End If
					vInt14 = vDlg1.Input
					i = vInt14
				Else
					mod1.Sub081
					Return
				End If
			End If
			Dim inputDialog10 As InputDialog = vDlg1
			vDlg1.InputType = 2
			vDlg1.Input = vInt15
			vDlg1.PasswordMode = False
			vDlg1.Hint = "Da .."
			vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
			Dim vShow3 As Int = vDlg1.Show("Dati del cliente (dalla riga ..) 0 per non stampare", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
			If vShow3 = -1 Then
				If Not(IsNumber(vDlg1.Input)) Then
					Dim vObjectToCharSequence9 As Object = "Valore non corretto "
					Dim vObjectToCharSequence10 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				End If
				If vDlg1.Input >= 40 Then
					Dim vObjectToCharSequence11 As Object = "Valore non corretto (massimo 40)"
					Dim vObjectToCharSequence12 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				End If
				If vDlg1.Input <= i And i > 0 Then
					Dim vObjectToCharSequence13 As Object = "Valore non corretto (deve essere > " & i & ")"
					Dim vObjectToCharSequence14 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				End If
				vInt15 = vDlg1.Input
				Dim i2 As Int = vInt15
				If vInt15 > 0 Then
					Dim inputDialog14 As InputDialog = vDlg1
					vDlg1.InputType = 2
					vDlg1.Input = vInt16
					vDlg1.PasswordMode = False
					vDlg1.Hint = "A .."
					vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
					Dim vShow4 As Int = vDlg1.Show("Dati del cliente (fino alla riga ..) 0 per non stampare", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
					If vShow4 = -1 Then
						If Not(IsNumber(vDlg1.Input)) Then
							Dim vObjectToCharSequence15 As Object = "Valore non corretto "
							Dim vObjectToCharSequence16 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence15, vObjectToCharSequence16, "OK", "", "", Main.vBmp1)
							mod1.Sub081
							Return
						End If
						If vDlg1.Input >= 40 Then
							Dim vObjectToCharSequence17 As Object = "Valore non corretto (massimo 40)"
							Dim vObjectToCharSequence18 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence17, vObjectToCharSequence18, "OK", "", "", Main.vBmp1)
							mod1.Sub081
							Return
						End If
						If vDlg1.Input <= i2 Then
							Dim vObjectToCharSequence19 As Object = "Valore non corretto (deve essere > " & i2 & ")"
							Dim vObjectToCharSequence20 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence19, vObjectToCharSequence20, "OK", "", "", Main.vBmp1)
							mod1.Sub081
							Return
						End If
						vInt16 = vDlg1.Input
						i2 = vInt16
					Else
						mod1.Sub081
						Return
					End If
				End If
				Dim inputDialog18 As InputDialog = vDlg1
				vDlg1.InputType = 2
				vDlg1.Input = vInt17
				vDlg1.PasswordMode = False
				vDlg1.Hint = "Da .."
				vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
				Dim vShow5 As Int = vDlg1.Show("Corpo del documento (dalla riga ..) ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
				If vShow5 = -1 Then
					If Not(IsNumber(vDlg1.Input)) Then
						Dim vObjectToCharSequence21 As Object = "Valore non corretto "
						Dim vObjectToCharSequence22 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence21, vObjectToCharSequence22, "OK", "", "", Main.vBmp1)
						mod1.Sub081
						Return
					End If
					If vDlg1.Input >= 40 Or vDlg1.Input <= 0 Then
						Dim vObjectToCharSequence23 As Object = "Valore non corretto (massimo 40)"
						Dim vObjectToCharSequence24 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence23, vObjectToCharSequence24, "OK", "", "", Main.vBmp1)
						mod1.Sub081
						Return
					End If
					If vDlg1.Input <= i2 Then
						Dim vObjectToCharSequence25 As Object = "Valore non corretto (deve essere > " & i2 & ")"
						Dim vObjectToCharSequence26 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence25, vObjectToCharSequence26, "OK", "", "", Main.vBmp1)
						mod1.Sub081
						Return
					End If
					vInt17 = vDlg1.Input
					Dim i3 As Int = vInt17
					Dim inputDialog22 As InputDialog = vDlg1
					vDlg1.InputType = 2
					vDlg1.Input = vInt18
					vDlg1.PasswordMode = False
					vDlg1.Hint = "a .."
					vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
					Dim vShow6 As Int = vDlg1.Show("Corpo del documento (Fino alla riga ..) ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
					If vShow6 = -1 Then
						If Not(IsNumber(vDlg1.Input)) Then
							Dim vObjectToCharSequence27 As Object = "Valore non corretto "
							Dim vObjectToCharSequence28 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence27, vObjectToCharSequence28, "OK", "", "", Main.vBmp1)
							mod1.Sub081
							Return
						End If
						If vDlg1.Input >= 40 Or vDlg1.Input <= 0 Then
							Dim vObjectToCharSequence29 As Object = "Valore non corretto (massimo 40,minimo 1)"
							Dim vObjectToCharSequence30 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence29, vObjectToCharSequence30, "OK", "", "", Main.vBmp1)
							mod1.Sub081
							Return
						End If
						If vDlg1.Input <= i3 Then
							Dim vObjectToCharSequence31 As Object = "Valore non corretto (deve essere > " & i3 & ")"
							Dim vObjectToCharSequence32 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence31, vObjectToCharSequence32, "OK", "", "", Main.vBmp1)
							mod1.Sub081
							Return
						End If
						vInt18 = vDlg1.Input
						Dim i4 As Int = vInt18
						Dim inputDialog26 As InputDialog = vDlg1
						vDlg1.InputType = 2
						vDlg1.Input = vInt19
						vDlg1.PasswordMode = False
						vDlg1.Hint = "Righe vuote"
						vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
						Dim vShow7 As Int = vDlg1.Show("Inserire il numero di righe tra la copia madre e figlia ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
						If vShow7 = -1 Then
							If Not(IsNumber(vDlg1.Input)) Then
								Dim vObjectToCharSequence33 As Object = "Valore non corretto "
								Dim vObjectToCharSequence34 As Object = Main.vStr8
								Msgbox2(vObjectToCharSequence33, vObjectToCharSequence34, "OK", "", "", Main.vBmp1)
								mod1.Sub081
								Return
							End If
							If vDlg1.Input < 40 And vDlg1.Input > 0 Then
								vInt19 = vDlg1.Input
								mod1.Sub081
								Return
							End If
							Dim vObjectToCharSequence35 As Object = "Valore non corretto (massimo 40,minimo 1)"
							Dim vObjectToCharSequence36 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence35, vObjectToCharSequence36, "OK", "", "", Main.vBmp1)
							mod1.Sub081
							Return
						End If
						mod1.Sub081
						Return
					End If
					mod1.Sub081
					Return
				End If
				mod1.Sub081
				Return
			End If
			mod1.Sub081
			Return
		End If
		Dim vObjectToCharSequence37 As Object = "Valore non corretto (massimo 40)"
		Dim vObjectToCharSequence38 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence37, vObjectToCharSequence38, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub Sub015(str As String)
	Dim vListFiles As List = File.ListFiles(str)
	Dim size As Int = vListFiles.Size
	Dim i As Int
	For i = 0 To size - 1
		Dim vObjectToString As String = vListFiles.Get(i)
		If File.IsDirectory(str, vObjectToString) Then
			Sub015(File.Combine(str, vObjectToString))
		Else
			File.Delete(str, vObjectToString)
		End If
	Next
End Sub

Sub DesAsporto_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = DesAsporto.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Intestazione Asporto"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire il testo per l'intestazione della comanda Asporto", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 And vDlg1.Input <> "" Then
		DesAsporto.Text = "Intestazione per Comanda Asporto:" & vDlg1.Input
		DesAsporto.Tag = vDlg1.Input
		Return
	End If
End Sub

Sub DesATesta_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = DesATesta.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "dicitura 'a testa'"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire il testo per dicitura 'A testa'", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If vDlg1.Input <> "" Then
			If vDlg1.Input.Length > 20 Then
				Dim vObjectToCharSequence As Object = "Lunghezza massima consentita 20 caratteri"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Return
			End If
			DesATesta.Text = "Personalizzazione dicitura 'A testa':" & vDlg1.Input
		Else
			DesATesta.Text = "Non stampare la dicitura 'A testa' "
		End If
		DesATesta.Tag = vDlg1.Input
	End If
	mod1.Sub081
End Sub

Sub DesPreconto_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = DesPreconto.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Intestazione Preconto"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire il testo per l'intestazione della Stampa Parziale (PRECONTO)", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 And vDlg1.Input <> "" Then
		DesPreconto.Text = "Intestazione per Stampa Parziale (PRECONTO):" & vDlg1.Input
		DesPreconto.Tag = vDlg1.Input
	End If
	mod1.Sub081
End Sub

Sub DisconnettiPrt_CheckedChange(z As Boolean)
	Sub025(VerificaStampanti, Not(z))
	If z Then
		VerificaStampanti.Checked = False
		Return
	End If
End Sub

Sub edtCapSocREA_TextChanged(str As String, str2 As String)
End Sub

Sub edtDatiEsercente_EnterPressed
	Dim editTextWrapper As EditText = Sender
	Dim vTmp As Int = modfunstr.Sub006(editTextWrapper.Tag)
	editTextWrapper.Text = modfunstr.left(editTextWrapper.Text.Replace(",", "").Replace("'", "").Trim, vTmp)
End Sub

Sub edtDatiEsercente_FocusChanged(z As Boolean)
	Dim editTextWrapper As EditText = Sender
	Dim vTmp As Int = modfunstr.Sub006(editTextWrapper.Tag)
	If z Then
		editTextWrapper.SelectionStart = editTextWrapper.Text.Length
		Return
	End If
	editTextWrapper.Text = modfunstr.left(editTextWrapper.Text.Replace(",", "").Replace("'", "").Trim, vTmp)
End Sub

Sub edtDatiEsercente_TextChanged(str As String, str2 As String)
	Dim editTextWrapper As EditText = Sender
	If str2.Length > modfunstr.Sub006(editTextWrapper.Tag) Then
		editTextWrapper.Text = str
		editTextWrapper.SelectionStart = str.Length
		Return
	End If
End Sub

Sub EFTSM_CheckedChange(z As Boolean)
	Sub025(IPEFTSM, z And EFTSM.Visible)
	Sub025(PORTAEFTSM, z And EFTSM.Visible)
	Sub025(EFTSMSCONTI, z And EFTSM.Visible)
	Sub025(EFTSMStampa, z And EFTSM.Visible)
End Sub

Sub Sub016
	vcustomlistviewold1.Sub004
	Dim rowCount As Int = vCur1.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		vCur1.Position = i
		vcustomlistviewold1.Sub001(Sub017(i, DipToCurrent(60)), DipToCurrent(60), vCur1.GetString("descrizione"))
	Next
	vcustomlistviewold1.Sub012(vCur1.RowCount - 1)
End Sub

Sub Sub017(str As String, i As Int) As Panel
	Dim i2 As Int
	Dim i3 As Int
	Dim i4 As Int
	Dim i5 As Int
	Dim i6 As Int
	mod1.vStr2 = "Sub CreateListItem(cursore As String,Text As String, Height As Int,style As String) As Panel"
	Dim panelWrapper As Panel
	panelWrapper.Initialize("")
	Try
		panelWrapper.Color = 0
		Dim labelWrapper As Label
		labelWrapper.Initialize("nulla")
		labelWrapper.Gravity = Bit.Or(16, 1)
		If vCur1.GetInt("tipob") = 0 Then
			labelWrapper.Text = vCur1.GetString("descrizione")
		Else
			labelWrapper.Text = vCur1.GetString("descrizione") & " (Tipo B)"
		End If
		labelWrapper.Background = mod1.Sub155(-16776961, 0)
		labelWrapper.TextSize = 16
		labelWrapper.TextColor = -1
		labelWrapper.Tag = ""
		Dim labelWrapper2 As Label
		labelWrapper2.Initialize("attivacf")
		labelWrapper2.Gravity = Bit.Or(16, 1)
		labelWrapper2.Text = "Stampa in Chiusura"
		labelWrapper2.Tag = vCur1.GetInt("flgchiusura")
		If vCur1.GetInt("flgchiusura") = 1 Then
			i2 = -16711936
		Else
			i2 = -65536
		End If
		labelWrapper2.Background = mod1.Sub155(i2, 25)
		labelWrapper2.TextSize = 16
		labelWrapper2.TextColor = -1
		Dim labelWrapper3 As Label
		labelWrapper3.Initialize("attiva")
		labelWrapper3.Gravity = Bit.Or(16, 1)
		labelWrapper3.Text = "Attiva Stampa"
		labelWrapper3.Tag = vCur1.GetInt("flgattiva")
		If vCur1.GetInt("flgattiva") = 1 Then
			i3 = -16711936
		Else
			i3 = -65536
		End If
		labelWrapper3.Background = mod1.Sub155(i3, 25)
		labelWrapper3.TextSize = 16
		labelWrapper3.TextColor = -1
		Dim labelWrapper4 As Label
		labelWrapper4.Initialize("attivamail")
		labelWrapper4.Gravity = Bit.Or(16, 1)
		labelWrapper4.Text = "Mail"
		labelWrapper4.Tag = vCur1.GetInt("flgmail")
		If vCur1.GetInt("flgmail") = 1 Then
			i4 = -16711936
		Else
			i4 = -65536
		End If
		labelWrapper4.Background = mod1.Sub155(i4, 25)
		labelWrapper4.TextSize = 16
		labelWrapper4.TextColor = -1
		Dim labelWrapper5 As Label
		labelWrapper5.Initialize("attivamailc")
		labelWrapper5.Gravity = Bit.Or(16, 1)
		labelWrapper5.Text = "Mail in Chiusura"
		labelWrapper5.Tag = vCur1.GetInt("flgmailc")
		If vCur1.GetInt("flgmailc") = 1 Then
			i5 = -16711936
		Else
			i5 = -65536
		End If
		labelWrapper5.Background = mod1.Sub155(i5, 25)
		labelWrapper5.TextSize = 16
		labelWrapper5.TextColor = -1
		Dim labelWrapper6 As Label
		labelWrapper6.Initialize("attivamailcopia")
		labelWrapper6.Gravity = Bit.Or(16, 1)
		labelWrapper6.Text = "Copia su Chiave USB (se presente)"
		labelWrapper6.Tag = vCur1.GetInt("flgcopia")
		If vCur1.GetInt("flgcopia") = 1 Then
			i6 = -16711936
		Else
			i6 = -65536
		End If
		labelWrapper6.Background = mod1.Sub155(i6, 25)
		labelWrapper6.TextSize = 16
		labelWrapper6.TextColor = -1
		Dim labelWrapper7 As Label
		labelWrapper7.Initialize("")
		labelWrapper7.Text = str
		labelWrapper7.Visible = False
		panelWrapper.AddView(labelWrapper, 0, DipToCurrent(0), PerXToCurrent(25), i)
		panelWrapper.AddView(labelWrapper2, PerXToCurrent(25), DipToCurrent(0), PerXToCurrent(14), i)
		panelWrapper.AddView(labelWrapper3, PerXToCurrent(39), DipToCurrent(0), PerXToCurrent(14), i)
		panelWrapper.AddView(labelWrapper4, PerXToCurrent(53), DipToCurrent(0), PerXToCurrent(14), i)
		panelWrapper.AddView(labelWrapper5, PerXToCurrent(67), DipToCurrent(0), PerXToCurrent(14), i)
		panelWrapper.AddView(labelWrapper7, DipToCurrent(330), DipToCurrent(2), DipToCurrent(10), i)
		panelWrapper.AddView(labelWrapper6, PerXToCurrent(81), DipToCurrent(0), PerXToCurrent(14), i)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return panelWrapper
End Sub

Sub Sub018(str As String, str2 As String) As Boolean
	Try
		Dim archiverForB4A As ArchiverForB4A
		Sub015(mod1.vStr4 & "/TmpRestore")
		archiverForB4A.UnZip(str, str2, mod1.vStr4 & "/TmpRestore", "")
		If File.Exists(mod1.vStr4 & "/TmpRestore/files", "InvioFE.db") Then
			File.Delete(mod1.vStr4 & "/TmpRestore/files", "InvioFE.db")
		End If
		If File.Exists(mod1.vStr4 & "/TmpRestore/files", "InvioFE.db-journal") Then
			File.Delete(mod1.vStr4 & "/TmpRestore/files", "InvioFE.db-journal")
		End If
		If File.Exists(mod1.vStr4 & "/files/files", "InvioFE.db") Then
			File.Delete(mod1.vStr4 & "/files/files", "InvioFE.db")
		End If
		If File.Exists(mod1.vStr4 & "/files/files", "InvioFE.db-journal") Then
			File.Delete(mod1.vStr4 & "/files/files", "InvioFE.db-journal")
		End If
		Dim sb12 As String = mod1.vStr4 & "/TmpRestore"
		Sub005(sb12, mod1.vStr4 & "/files")
		Return True
	Catch
		mod1.Sub217(LastException.Message)
		Return False
	End Try
End Sub

Sub ErrMail_CheckedChange(z As Boolean)
	If z And mD3.Text <> "" Then
		If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", mD3.Text.ToLowerCase)) Then
			Dim vObjectToCharSequence As Object = "L'indirizzo email del centro di assistenza non è corretto"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			mD3.Text = ""
			ErrMail.Checked = False
			mod1.Sub081
			Return
		End If
	End If
End Sub

Sub errprtact(i As Int) As Int
	Dim vTmp As Int = mod1.Sub101(i)
	If vTmp > 0 Then
		Dim vObjectToCharSequence As Object = "Le stampe verranno inviate alla nuova stampante fino al prossimo riavvio del programma."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	End If
	Return vTmp
End Sub

Sub EsportaKBD_Click
	mod1.Sub074(True)
End Sub

Sub ExecSql_Click
	Dim fileDialog As FileDialog
	fileDialog.TextColor = -7829368
	fileDialog.FastScroll = True
	fileDialog.FileFilter = ".sql"
	fileDialog.FilePath = mod1.vStr4
	Dim vObjectToCharSequence As Object = "Seleziona il file .sql da eseguire"
	Dim vShow As Int = fileDialog.Show(vObjectToCharSequence, "OK", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Dim chosenName As String = fileDialog.ChosenName
		If chosenName.ToLowerCase.EndsWith(".raw.sql") Then
			mod1.Sub121(fileDialog.FilePath, chosenName, True, False)
			Return
		End If
		If chosenName.ToLowerCase.EndsWith(".sql") Then
			mod1.Sub120(fileDialog.FilePath, chosenName, "", False)
			Return
		End If
		Return
	End If
End Sub

Sub ExecSqlFE_Click
	Dim fileDialog As FileDialog
	fileDialog.TextColor = -7829368
	fileDialog.FastScroll = True
	fileDialog.FileFilter = ".sql"
	fileDialog.FilePath = mod1.vStr4
	Dim vObjectToCharSequence As Object = "Seleziona il file .sql da eseguire"
	Dim vShow As Int = fileDialog.Show(vObjectToCharSequence, "OK", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Dim chosenName As String = fileDialog.ChosenName
		If chosenName.ToLowerCase.EndsWith(".sql") Then
			Sub024(fileDialog.FilePath, chosenName)
			Return
		End If
		Return
	End If
End Sub

Sub ExportCorrispettivi_CheckedChange(z As Boolean)
	If Not(z) Then
		Return
	End If
	If Main.vccefdll1.vBln11 Then
		ExportCorrispettivi.Checked = False
		Dim vObjectToCharSequence As Object = "Questo modello di cassa non consente l'esportazione automatica dei corrispettivi."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
End Sub

Sub Sub019(spinnerWrapper As Spinner)
	spinnerWrapper.Clear
	spinnerWrapper.Add("Normale")
	spinnerWrapper.Add("Grassetto")
	spinnerWrapper.Add("Font 42 caratteri")
	spinnerWrapper.Add("Doppia Altezza")
	spinnerWrapper.Add("Doppia Larghezza")
	spinnerWrapper.Add("Corsivo")
End Sub

Sub FondoCassaAuto_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = FondoCassaAuto.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Importo versamento automatico"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire l'importo versamento automatico all'inizio della giornata", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If IsNumber(vDlg1.Input) Then
			If modfunstr.Sub006(vDlg1.Input) < 9999 Then
				If modfunstr.Sub006(vDlg1.Input) >= 0 Then
					If modfunstr.Sub006(vDlg1.Input) = 0 Then
						FondoCassaAuto.Text = "Importo versamento automatico all'inizio della giornata: Disabilitato"
						FondoCassaAuto.Tag = 0
					Else
						FondoCassaAuto.Text = "Importo versamento automatico all'inizio della giornata:" & NumberFormat2(vDlg1.Input, 1, 2, 2, False) & " €"
						FondoCassaAuto.Tag = modfunstr.Sub006(vDlg1.Input)
					End If
					mod1.Sub081
					Return
				End If
			End If
			Dim vObjectToCharSequence As Object = "Importo non valido"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
		Dim vObjectToCharSequence3 As Object = "Importo non valido"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub FontSizeC_ItemClick(i As Int, obj As Object)
	Dim vObjectToCharSequence As Object = "Per applicare la modifica è necessario riavviare il programma."
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
End Sub

Sub FTP_DownloadCompleted(str As String, z As Boolean)
	If Not(z) Then
		Dim vObjectToCharSequence As Object = "Errore durante il ripristino del backup"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	Else
		ripristinailfile()
		If vFTP1.IsInitialized Then
			vFTP1.CloseNow
		End If
	End If
	Main.vccefdll1.vBln2 = False
	pw.Visible = False
	mod1.Sub081
End Sub

Sub ftp_downloadprogress(str As String, j As Long, j2 As Long)
	lblProgress.Text = "Download del DB dal " & Main.vStr1 & " in corso" & CRLF & "Copiati " & Round(j / 1024) & " KB"
End Sub

Sub FTP_ListCompleted(str As String, z As Boolean, fTPFileWrapperArr As FTPEntry(), fTPFileWrapperArr2 As FTPEntry())
	Dim z2 As Boolean
	Dim i As Int = 0
	mod1.vStr2 = "Sub FTP_ListCompleted (ServerPath As String, Success As Boolean, Folders() As FTPEntry, Files() As FTPEntry)"
	If z Then
		Try
			If fTPFileWrapperArr2.Length > 0 Then
				vPnl1.Initialize("pnl")
				vPnl1.Background = mod1.Sub155(Colors.RGB(134, 232, 122), 25)
				vLv1.Initialize("lv")
				Dim length As Int = fTPFileWrapperArr2.Length - 1
				Dim z3 As Boolean = False
				Do While i <= length
					Dim name As String = fTPFileWrapperArr2(i).Name
					If name.StartsWith(Main.vStr8) And fTPFileWrapperArr2(i).Name.EndsWith("DB.zip") Then
						vLv1.AddTwoLinesAndBitmap(fTPFileWrapperArr2(i).Name, "Dimensione " & NumberFormat(fTPFileWrapperArr2(i).Size / 1024, 1, 2) & " KB", Null)
						z2 = True
					Else
						z2 = z3
					End If
					i = i + 1
					z3 = z2
				Loop
				vPnl1.AddView(vLv1, DipToCurrent(30), DipToCurrent(12), PerXToCurrent(57), PerYToCurrent(50))
				vCustomDialog21.AddView(vPnl1, PerXToCurrent(77), PerYToCurrent(60))
				Dim vShow As Int = vCustomDialog21.Show("Selezionare il salvataggio da ripristinare", "OK", "Annulla", "", Main.vBmp1)
				If vShow = -1 Then
					vBln1 = z3
				Else
					If vShow = -3 Then
						vBln1 = False
					End If
				End If
			Else
				Dim vObjectToCharSequence As Object = "Non è stato trovato nessun DB sul " & Main.vStr1 & ""
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				mod1.Sub081
				Return
			End If
		Catch
			mod1.Sub217(LastException.Message)
		End Try
	End If
	mod1.Sub081
End Sub

Sub FtpSave_Click
	Dim str As String
	Dim str2 As String
	Dim str3 As String
	Dim str4 As String
	Dim buttonWrapper As Button = Sender
	If buttonWrapper.Text.StartsWith("Indirizzo") Then
		str = "Indirizzo IP"
		str2 = "Indirizzo del Server FTP per il Salvataggio:"
		str3 = "Inserire l'indirizzo Ip per il server FTP di salvataggio"
	Else If buttonWrapper.Text.StartsWith("Utente") Then
		str = "Utente"
		str2 = "Utente del Server FTP per il Salvataggio:"
		str3 = "Inserire l'utente per il server FTP di salvataggio"
	Else If buttonWrapper.Text.StartsWith("Prefisso") Then
		str = "Prefisso"
		str2 = "Prefisso Aggiuntivo Server FTP per il Salvataggio:"
		str3 = "Inserire il Prefisso per il server FTP di salvataggio"
	Else If Not(buttonWrapper.Text.StartsWith("Password")) Then
		str = ""
		str2 = ""
		str3 = ""
	Else
		str = "Password"
		str2 = "Password del Server FTP per il Salvataggio:"
		str3 = "Inserire la password per il server FTP di salvataggio"
	End If
	If buttonWrapper.Text.StartsWith("ID") Then
		Dim fileDialog As FileDialog
		fileDialog.TextColor = -7829368
		fileDialog.FastScroll = True
		If Main.v_usbpath <> "" Then
			fileDialog.FilePath = Main.v_usbpath
		Else
			fileDialog.FilePath = mod1.vStr4
		End If
		fileDialog.FileFilter = ".id"
		Dim vShow As Int = fileDialog.Show("Seleziona il file contenente l'ID della cartella (annullare per copiare il file nella root) ", "OK", "Annulla", "", Null)
		If vShow <> -1 Then
			str4 = ""
		Else
			str4 = File.ReadString(fileDialog.FilePath, fileDialog.ChosenName)
		End If
		If str4.IndexOf(Chr(13)) > 0 Then
			str4 = str4.SubString2(0, str4.IndexOf(Chr(13)))
		End If
		buttonWrapper.Text = str2 & str4
		buttonWrapper.Tag = str4
	Else
		Dim inputDialog2 As InputDialog = vDlg1
		vDlg1.InputType = 1
		vDlg1.Input = IPEFTSM.Tag
		vDlg1.PasswordMode = False
		vDlg1.Hint = str
		vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
		Dim vShow2 As Int = vDlg1.Show(str3, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
		If vShow2 = -1 And vDlg1.Input <> "" Then
			buttonWrapper.Text = str2 & vDlg1.Input
			buttonWrapper.Tag = vDlg1.Input
		End If
	End If
	mod1.Sub081
End Sub

Sub GestioneTabacchi_CheckedChange(z As Boolean)
	If Not(z) Then
		Dim vObjectToCharSequence As Object = "Confermi la disattivazione della gestione dei tabacchi ? "
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 = -1 Then
			Main.vSql1.ExecNonQuery("update reparti set descrizione ='Reparto 0'" & TAB & ",iva=1, NF=0 where codice =0")
		Else
			GestioneTabacchi.Checked = True
		End If
	Else
		Dim vObjectToCharSequence3 As Object = "Confermi l'attivazione della gestione dei tabacchi ? "
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "", "No", Main.vBmp1)
		If vMsgbox22 = -1 Then
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where reparto>0 and length(codint) <5 and flgusointerno=0 and substr(codint,1,3) <>'msg'") > 0 Then
				Dim vObjectToCharSequence5 As Object = "Esistono articoli (non tabacchi) che potrebbero andare in sovrapposizione di codice con un articolo tabacchi." & CRLF & "Si desidera continuare ?"
				Dim vObjectToCharSequence6 As Object = Main.vStr8
				Dim vMsgbox23 As Int = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "Si", "", "No", Main.vBmp1)
				If vMsgbox23 <> -1 Then
					GestioneTabacchi.Checked = False
					Return
				End If
			End If
			Main.vSql1.ExecNonQuery("update reparti set descrizione ='Tabacchi Lavorati'" & TAB & ",iva=3, NF=1 where codice =0")
		Else
			GestioneTabacchi.Checked = False
		End If
	End If
	Sub025(TipoImpTabacchi, GestioneTabacchi.Checked)
	Sub025(MargineTabacchi, GestioneTabacchi.Checked)
	mod1.Sub081
End Sub

Sub Sub020(str As String) As String
	Dim size As Int = vLst3.Size - 1
	Dim i As Int
	For i = 0 To size
		Dim tnazioneVar As tnazione = vLst3.Get(i)
		If tnazioneVar.id = str Then
			Return tnazioneVar.descrizione
		End If
	Next
	Return ""
End Sub

Sub Sub021(i As Int) As String
	If i = 0 Then
		Return "Tipo Frazionamento per Variazioni: Segui il comportamento della frazione"
	End If
	If i = 1 Then
		Return "Tipo Frazionamento per Variazioni: Senza importo"
	End If
	If i = 2 Then
		Return "Tipo Frazionamento per Variazioni: Con importo / la frazione"
	End If
	If i = 3 Then
		Return "Tipo Frazionamento per Variazioni: Con importo intero"
	End If
	Return "Tipo Frazionamento per Variazioni: Segui il comportamento della frazione"
End Sub

Sub Sub022(i As Int) As String
	If i = 0 Then
		Return "Tipo valorizzazione prezzo frazione: Predefinito"
	End If
	If i = 1 Then
		Return "Tipo valorizzazione prezzo frazione: Prezzo più alto"
	End If
	Return ""
End Sub

Sub Sub023(i As Int) As String
	If i = 0 Then
		Return "Tipo chiusura tavolo da Web: Richiedi sempre la conferma del cameriere"
	End If
	If i = 1 Then
		Return "Tipo chiusura tavolo da Web: Richiedi la conferma del cameriere solo per le spiagge"
	End If
	If i = 2 Then
		Return "Tipo chiusura tavolo da Web: Richiedi la conferma del cameriere solo per i tavoli"
	End If
	If i = 3 Then
		Return "Tipo chiusura tavolo da Web: Non richiedere mai la conferma del cameriere"
	End If
	Return "Tipo chiusura tavolo da Web: Richiedi sempre la conferma del cameriere"
End Sub

Sub Happy_Click
	Dim list As List
	list.Initialize
	list.Add("Domenica")
	list.Add("Lunedì")
	list.Add("Martedì")
	list.Add("Mercoledì")
	list.Add("Giovedì")
	list.Add("Venerdì")
	list.Add("Sabato")
	Dim vInputList1 As Int = idLib.InputList1(list, "Indicare il giorno da modificare ...")
	If vInputList1 < 0 Then
		Return
	End If
	Dim i As Int = vInputList1 + 1
	If vIntArr1(i) >= 0 Then
		Dim vObjectToCharSequence As Object = "Esistono parametri per il giorno di " & list.Get(i - 1) & " :"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Modifica Parametri", "Visualizza Parametri", "Cancella Parametri", Main.vBmp1)
		If vMsgbox2 = -3 Then
			Dim i2 As Int = vIntArr1(i) / 100
			Dim i3 As Int = vIntArr2(i) / 100
			Dim vObjectToCharSequence3 As Object = "Parametri attivi per il " & list.Get(i - 1) & " :" & CRLF & "Listino Attivo :" & vIntArr3(i) & CRLF & "Happy hour attivo dalle " & i2 & ":" & vIntArr1(i) - i2 * 100 & " alle " & i3 & ":" & vIntArr2(i) - i3 * 100 & CRLF
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			Return
		End If
		If vMsgbox2 = -2 Then
			Dim vObjectToCharSequence5 As Object = "Confermi la cancellazione dei parametri per il giorno di " & list.Get(i - 1) & " ?"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "Ok", "", "Annulla", Main.vBmp1)
			If vMsgbox22 = -1 Then
				vIntArr1(i) = -1
				vIntArr2(i) = -1
				vIntArr3(i) = 0
			End If
			Return
		End If
	End If
	Dim list2 As List
	list2.Initialize
	list2.Add("Listino 2")
	list2.Add("Listino 3")
	list2.Add("Listino 4")
	Dim vInputList12 As Int = idLib.InputList1(list2, "Indicare il listino da applicare ...")
	If vInputList12 < 0 Then
		Return
	End If
	Dim i4 As Int = vInputList12 + 2
	Dim timeDialog As TimeDialog
	timeDialog.Is24Hours = True
	timeDialog.Hour = DateTime.GetHour(mod1.Sub058)
	timeDialog.Minute = DateTime.GetMinute(mod1.Sub058)
	Dim str As String = "Inserire l'ora di inizio applicazione listino " & i4
	Dim vShow As Int = timeDialog.Show(str, "Orario di inizio", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Dim timeDialog2 As TimeDialog
		timeDialog2.Is24Hours = True
		timeDialog2.Hour = DateTime.GetHour(mod1.Sub058)
		timeDialog2.Minute = DateTime.GetMinute(mod1.Sub058)
		Dim str2 As String = "Inserire l'ora di fine applicazione listino " & i4
		Dim vShow2 As Int = timeDialog2.Show(str2, "Orario di fine", "Ok", "Annulla", "", Main.vBmp1)
		If vShow2 = -1 Then
			If vShow2 = -1 Then
				vIntArr1(i) = timeDialog.Minute + timeDialog.Hour * 100
				vIntArr2(i) = timeDialog2.Minute + timeDialog2.Hour * 100
				vIntArr3(i) = i4
				Dim i5 As Int = vIntArr1(i) / 100
				Dim i6 As Int = vIntArr2(i) / 100
				Dim vObjectToCharSequence7 As Object = "Parametri attivi per il " & list.Get(i - 1) & " :" & CRLF & "Listino Attivo :" & vIntArr3(i) & CRLF & "Happy hour attivo dalle " & i5 & ":" & vIntArr1(i) - i5 * 100 & " alle " & i6 & ":" & vIntArr2(i) - i6 * 100 & CRLF
				Dim vObjectToCharSequence8 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
				mod1.Sub081
				Return
			End If
		End If
	End If
	mod1.Sub081
End Sub

Sub hide_keyboard
	Dim phone As Phone = Main.vPhone1
	Phone.HideKeyboard(Activity)
	mod1.Sub081
End Sub

Sub Icone2_CheckedChange(z As Boolean)
	Main.v_icone2upd = z
	If z Then
		Dim vObjectToCharSequence As Object = "Uscire dal programma per attivare la nuova configurazione."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	End If
	mod1.Sub081
End Sub

Sub ImgPersonalizzate_Click
	Dim i As Int
	Dim i2 As Int
	Dim i3 As Int
	Dim str As String
	Dim i4 As Int
	Dim fileDialog As FileDialog
	Dim list As List
	fileDialog.FastScroll = True
	fileDialog.FilePath = mod1.vStr4
	fileDialog.ShowOnlyFolders = True
	fileDialog.TextColor = -7829368
	Dim vObjectToCharSequence As Object = "Indicare la cartella dalla quale caricare le icone personalizzate."
	Dim vShow As Int = fileDialog.Show(vObjectToCharSequence, "OK", "Annulla", "Ok dimensione personalizzata", Main.vBmp1)
	If vShow <> -3 Then
		Dim i5 As Int = 0
		If vShow <> -2 Then
			i = 0
			i2 = 0
			i3 = 0
		Else
			Dim numberDialog As NumberDialog
			numberDialog.Digits = 3
			numberDialog.Number = 0
			numberDialog.Decimal = 0
			numberDialog.ShowSign = False
			Dim sb As String = "Inserire la larghezza dell'immagine personalizzata (pulsante singolo = " & SmartStringFormatter("", Main.v_buttonsizex) & ")"
			Dim vShow2 As Int = numberDialog.Show(sb, "Ok", "Annulla", "", Main.vBmp1)
			If vShow2 <> -1 Or numberDialog.Number = 0 Then
				Return
			End If
			Dim number As Int = numberDialog.Number
			If number > Main.v_buttonsizex * 2 Then
				Dim vObjectToCharSequence2 As Object = "La dimensione massima in larghezza è di " & SmartStringFormatter("", Main.v_buttonsizex * 2) & " pixel"
				Dim vObjectToCharSequence3 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence2, vObjectToCharSequence3, "OK", "", "", Main.vBmp1)
				Return
			End If
			Dim number2 As Int = numberDialog.Number
			numberDialog.Digits = 3
			numberDialog.Number = 0
			numberDialog.Decimal = 0
			numberDialog.ShowSign = False
			Dim sb2 As String = "Inserire l'altezza dell'immagine personalizzata (pulsante singolo = " & SmartStringFormatter("", Main.v_buttonsizey) & ")"
			Dim vShow3 As Int = numberDialog.Show(sb2, "Ok", "Annulla", "", Main.vBmp1)
			If vShow3 <> -1 Or numberDialog.Number = 0 Then
				Return
			End If
			Dim number3 As Int = numberDialog.Number
			If number3 > Main.v_buttonsizey * 2 Then
				Dim vObjectToCharSequence4 As Object = "La dimensione massima in altezza è di " & SmartStringFormatter("", Main.v_buttonsizey * 2) & " pixel"
				Dim vObjectToCharSequence5 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence4, vObjectToCharSequence5, "OK", "", "", Main.vBmp1)
				Return
			End If
			Dim number4 As Int = numberDialog.Number
			numberDialog.Digits = 3
			numberDialog.Number = 0
			numberDialog.Decimal = 0
			numberDialog.ShowSign = True
			Dim vShow4 As Int = numberDialog.Show("Inserire un valore di offset in pixel per spostare l'immagine sul tasto in orizzontale (opzionale)", "Ok", "Annulla", "", Main.vBmp1)
			If vShow4 = -1 And numberDialog.Number <> 0 Then
				i5 = numberDialog.Number
			End If
			numberDialog.Number = 0
			Dim vShow5 As Int = numberDialog.Show("Inserire un valore di offset in pixel per spostare l'immagine sul tasto in verticale (opzionale)", "Ok", "Annulla", "", Main.vBmp1)
			If vShow5 <> -1 Or numberDialog.Number = 0 Then
				i = 0
				i2 = number4
				i3 = number2
			Else
				i = numberDialog.Number
				i2 = number4
				i3 = number2
			End If
		End If
		list.Initialize
		list.AddAll(File.ListFiles(fileDialog.FilePath))
		Dim i6 As Int = 0
		ProgressDialogShow2("Elaborazione in corso ...", False)
		DoEvents
		DoEvents
		Dim size As Int = list.Size - 1
		Dim i7 As Int = 0
		Do While i7 <= size
			Dim vObjectToString As String = list.Get(i7)
			If i7 Mod 40 = 0 Then
				DoEvents
				DoEvents
			End If
			If vObjectToString.ToLowerCase.EndsWith(".png") Or vObjectToString.ToLowerCase.EndsWith(".jpg") Or vObjectToString.ToLowerCase.EndsWith(".jpeg") Then
				Try
					If Not(vObjectToString.ToLowerCase.EndsWith(".jpg")) And Not(vObjectToString.ToLowerCase.EndsWith(".jpeg")) Then
						str = "PNG"
					Else
						str = "JPEG"
					End If
					Dim vLoadBitmap As Bitmap = LoadBitmap(fileDialog.FilePath, vObjectToString)
					Dim vTmp As Bitmap = mod1.Sub054(vLoadBitmap, 32, 32)
					Dim vTmp_ As Bitmap = mod1.Sub054(vLoadBitmap, 48, 48)
					Dim str2 As String = "usr_" & vObjectToString.Replace(".png", ".dll").Replace(".PNG", ".dll").Replace(".jpg", ".dll").Replace(".JPG", ".dll").Replace(".jpeg", ".dll").Replace(".JPEG", ".dll")
					Dim vOpenOutput As OutputStream = File.OpenOutput(File.DirDefaultExternal & "/ICO32", str2, False)
					vTmp.WriteToStream(vOpenOutput, 100, str)
					vOpenOutput.Close
					Dim vOpenOutput2 As OutputStream = File.OpenOutput(File.DirDefaultExternal & "/ICO48", str2, False)
					vTmp_.WriteToStream(vOpenOutput2, 100, str)
					vOpenOutput2.Close
					If i3 > 0 And i2 > 0 Then
						Dim vTmp__ As Bitmap = mod1.Sub054(vLoadBitmap, i3, i2)
						If i = 0 And i5 = 0 Then
							Main.vSql1.ExecNonQuery("delete from OffsetImmaginiPersonalizzate where NomeFile= '" & SmartStringFormatter("", str2) & "' ")
						Else
							If Main.vSql1.ExecQuerySingleResult("Select count(*) from OffsetImmaginiPersonalizzate where NomeFile= '" & SmartStringFormatter("", str2) & "' ") = 0 Then
								Main.vSql1.ExecNonQuery("insert into OffsetImmaginiPersonalizzate(NomeFile,OffsetX,OffsetY) values('" & SmartStringFormatter("", str2) & "'," & SmartStringFormatter("", i5) & "," & SmartStringFormatter("", i) & ") ")
							Else
								Main.vSql1.ExecNonQuery("update OffsetImmaginiPersonalizzate set OffsetX=" & SmartStringFormatter("", i5) & ",OffsetY=" & SmartStringFormatter("", i) & " where NomeFile='" & SmartStringFormatter("", str2) & "'")
							End If
						End If
						Dim vOpenOutput3 As OutputStream = File.OpenOutput(File.DirDefaultExternal & "/ICOP", str2, False)
						vTmp__.WriteToStream(vOpenOutput3, 100, str)
						vOpenOutput3.Close
					End If
					i4 = i6 + 1
				Catch
					mod1.Sub217(LastException.Message)
				End Try
				i7 = i7 + 1
				i6 = i4
			End If
			i4 = i6
			i7 = i7 + 1
			i6 = i4
		Loop
		ProgressDialogHide
		Dim vObjectToCharSequence6 As Object = "Sono state copiate " & SmartStringFormatter("", i6) & " icone. " & SmartStringFormatter("", CRLF) & "Riavviare il programma per applicare le modifiche."
		Dim vObjectToCharSequence7 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence6, vObjectToCharSequence7, "OK", "", "", Main.vBmp1)
	End If
End Sub

Sub ImportaKBD_Click
	Dim fileDialog As FileDialog
	Dim vShow As Int
	Try
		mod1.vStr2 = "Sub ImportaKBD_Click"
		'fileDialog = FileDialog
		fileDialog.TextColor = -7829368
		fileDialog.FastScroll = True
		fileDialog.FileFilter = "keyboard.txt"
		fileDialog.FilePath = File.DirRootExternal
		Dim vObjectToCharSequence As Object = "Seleziona il file keyboard.txt."
		vShow = fileDialog.Show(vObjectToCharSequence, "OK", "Annulla", "", Main.vBmp1)
	Catch
		ProgressDialogHide
		mod1.Sub217(LastException.Message)
	End Try
	If vShow <> -1 Then
		Return
	End If
	If Not(File.Exists(fileDialog.FilePath, "keyboard.txt")) Then
		Dim vObjectToCharSequence2 As Object = "Il file " & fileDialog.FilePath & "/keyboard.txt non esiste."
		Dim vObjectToCharSequence3 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence2, vObjectToCharSequence3, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	Dim vObjectToCharSequence4 As Object = "Confermi l'importazione della configurazione della tastiera dal file " & CRLF & fileDialog.FilePath & "/keyboard.txt ?"
	Dim vObjectToCharSequence5 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence4, vObjectToCharSequence5, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Dim vObjectToCharSequence6 As Object = "Attenzione !!! l'attuale configurazione verrà sovrascritta in maniera irreversibile. " & CRLF & "Si desidera proseguire ugualmente ?"
		Dim vObjectToCharSequence7 As Object = Main.vStr8
		Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence6, vObjectToCharSequence7, "Si", "", "No", Main.vBmp1)
		If vMsgbox22 = -1 Then
			mod1.Sub121(fileDialog.FilePath, "keyboard.txt", True, True)
			ProgressDialogHide
		End If
	End If
	mod1.Sub081
End Sub

Sub ImportaLogoNF_Click
	Try
		Dim fileDialog As FileDialog
		fileDialog.TextColor = -7829368
		fileDialog.FastScroll = True
		If Main.v_usbpath <> "" Then
			fileDialog.FilePath = Main.v_usbpath
		Else
			fileDialog.FilePath = mod1.vStr4
		End If
		fileDialog.FileFilter = ".png"
		Dim vObjectToCharSequence As Object = "Seleziona il file (.png) contenente il logo per i documenti non fiscali."
		Dim vShow As Int = fileDialog.Show(vObjectToCharSequence, "OK", "Annulla", IIf(File.Exists(File.DirDefaultExternal & "/Loghi", "LogoK.buf"), "Cancella logo", ""), Null)
		If vShow = -2 Then
			If File.Exists(File.DirDefaultExternal & "/Loghi", "LogoK.buf") Then
				File.Delete(File.DirDefaultExternal & "/Loghi", "LogoK.buf")
				Dim vObjectToCharSequence2 As Object = "Il logo è stato eliminato."
				Dim vObjectToCharSequence3 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence2, vObjectToCharSequence3, "OK", "", "", Main.vBmp1)
			End If
		Else
			If vShow = -1 Then
				Dim vLoadBitmap As Bitmap = LoadBitmap(fileDialog.FilePath, fileDialog.ChosenName)
				If vLoadBitmap.Height > 500 Then
					Dim vObjectToCharSequence4 As Object = "L'altezza della bitmap è maggiore di 500"
					Dim vObjectToCharSequence5 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence4, vObjectToCharSequence5, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				End If
				If vLoadBitmap.Width > 500 Then
					Dim vObjectToCharSequence6 As Object = "La larghezza della bitmap è maggiore di 500"
					Dim vObjectToCharSequence7 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence6, vObjectToCharSequence7, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				End If
				Dim inputDialog2 As InputDialog = vDlg1
				vDlg1.InputType = 2
				vDlg1.Input = ""
				vDlg1.PasswordMode = False
				vDlg1.Hint = "Numero punti"
				vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
				Dim vShow2 As Int = vDlg1.Show("Inserire lo spazio da lasciare a sinistra del logo (massimo 250) espresso in numero di punti ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
				If vShow2 = -1 And IsNumber(vDlg1.Input) And vDlg1.Input >= 0 And vDlg1.Input <= 250 Then
					Dim parseDouble As Int = vDlg1.Input
					Dim customprogressdialogVar As CustomProgressDialog
					Dim vPerYToCurrent As Double = PerYToCurrent(10)
					customprogressdialogVar._initialize(Activity, PerXToCurrent(60), (PerXToCurrent(100) - PerXToCurrent(60)) / 2, vPerYToCurrent, "", "", -12303292, 0, "Progress", False)
					If File.Exists(File.DirDefaultExternal & "/Loghi", "LogoK.buf") Then
						File.Delete(File.DirRootExternal, "LogoK.buf")
					End If
					Dim filePath As String = fileDialog.FilePath
					Dim chosenName As String = fileDialog.ChosenName
					mod1.Sub091(filePath, chosenName, parseDouble, customprogressdialogVar, "LogoK", File.DirDefaultExternal & "/Loghi")
					If customprogressdialogVar.isshow Then
						customprogressdialogVar._hide
					End If
					If File.Exists(File.DirDefaultExternal & "/Loghi", "LogoK.buf") Then
						Dim vObjectToCharSequence8 As Object = "Importazione file riuscita"
						Dim vObjectToCharSequence9 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence8, vObjectToCharSequence9, "OK", "", "", Main.vBmp1)
					Else
						Dim vObjectToCharSequence10 As Object = "Errore durante l'importazione file"
						Dim vObjectToCharSequence11 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence10, vObjectToCharSequence11, "OK", "", "", Main.vBmp1)
					End If
				End If
			End If
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
End Sub

Sub ImportDaIngredienti_Click
	Dim vMsgbox2 As Int
	Try
		Dim vObjectToCharSequence As Object = "Attenzione ... Utilizzando questa procedura si rischia di duplicare variazioni già esistenti." & CRLF & "Si desidera proseguire ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		vMsgbox2 = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Ok", "", "Annulla", Main.vBmp1)
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If vMsgbox2 <> -1 Then
		Return
	End If
	Dim list As List
	list.Initialize
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("Select * from ingredienti where substr(descrizione,1,11) <>'Ingrediente' order by descrizione")
	If cursorWrapper2.RowCount > 0 Then
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i As Int
		For i = 0 To rowCount
			cursorWrapper2.Position = i
			list.Add(cursorWrapper2.GetString("descrizione"))
		Next
		Dim vInputMultiList As List = InputMultiList(list, "Selezionare gli ingredienti da aggiungere alle variazioni:")
		If vInputMultiList.Size > 0 Then
			Dim list2 As List
			list2.Initialize
			Dim rowCount2 As Int = vCur2.RowCount - 1
			Dim i2 As Int
			For i2 = 0 To rowCount2
				DoEvents
				vCur2.Position = i2
				list2.Add(vCur2.GetString("descrizione"))
			Next
			Dim vInputList1 As Int = idLib.InputList1(list2, "Crea le variazioni con il reparto:")
			If vInputList1 >= 0 Then
				Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("Select valore from progressivi where codice ='A'")
				vCur2.Position = vInputList1
				Dim size As Int = vInputMultiList.Size - 1
				Dim i3 As Int
				For i3 = 0 To size
					cursorWrapper2.Position = vInputMultiList.Get(i3)
					Dim i4 As Int = parseDouble
					Dim str As String = ""
					Do While str = ""
						If modfunstr.Sub006(Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where codint = '" & i4 & "'")) = 0 Then
							str = i4
						Else
							i4 = i4 + 1
						End If
					Loop
					Dim list3 As List
					list3.Initialize
					Dim map As Map
					map.Initialize
					map.Put("codint", str)
					map.Put("descrizione", mod1.Sub209(cursorWrapper2.GetString("descrizione")))
					map.Put("reparto", vCur2.GetInt("codice"))
					map.Put("iva", Main.v_ivadefault)
					map.Put("list1", 0)
					map.Put("list2", 0)
					map.Put("list5", 0)
					map.Put("bvar", True)
					map.Put("invioweb", True)
					list3.Add(map)
					dbutil.Sub007(Main.vSql1, "anagra", list3)
					If Main.vSql1.ExecQuerySingleResult("select count(*) from anagraDescrizioni where codint ='Ing" & cursorWrapper2.GetString("codice") & "'") > 0 Then
						Dim cursorWrapper3 As Cursor
						Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("Select * from anagraDescrizioni where codint ='Ing" & cursorWrapper2.GetString("codice") & "'")
						If cursorWrapper4.RowCount > 0 Then
							cursorWrapper4.Position = 0
							Main.vSql1.ExecNonQuery("delete from anagraDescrizioni where codint = '" & str & "'")
							list3.Initialize
							map.Initialize
							map.Put("codint", str)
							map.Put("descrizione1", cursorWrapper4.GetString("descrizione1"))
							map.Put("descrizione2", cursorWrapper4.GetString("descrizione2"))
							map.Put("descrizione3", cursorWrapper4.GetString("descrizione3"))
							map.Put("descrizione4", cursorWrapper4.GetString("descrizione4"))
							map.Put("descrizione5", cursorWrapper4.GetString("descrizione5"))
							map.Put("ingredienti1", cursorWrapper4.GetString("ingredienti1"))
							map.Put("ingredienti2", cursorWrapper4.GetString("ingredienti2"))
							map.Put("ingredienti3", cursorWrapper4.GetString("ingredienti3"))
							map.Put("ingredienti4", cursorWrapper4.GetString("ingredienti4"))
							map.Put("ingredienti5", cursorWrapper4.GetString("ingredienti5"))
							list3.Add(map)
							dbutil.Sub007(Main.vSql1, "anagraDescrizioni", list3)
						End If
					End If
					parseDouble = i4 + 1
				Next
				Main.vSql1.ExecNonQuery("update progressivi set valore =" & parseDouble & " where codice ='A'")
				Dim vObjectToCharSequence3 As Object = "Sono state inserite " & vInputMultiList.Size & " nuove variazioni"
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
			End If
		End If
	End If
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/configura.java, metodo m5… (riga 11385).
Sub Sub024(str As String, str2 As String)
	Dim z As Boolean = True
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Main.v_inviofe Then
		If Not(Main.v_attivafe) Then
		End If
		If z Then
			ToastMessageShow("Attivare la procedura di invio per la Fatturazione elettronica", True)
			Return
		End If
		Dim vReadString As String = File.ReadString(str, str2)
		Dim vSplit() As String = Regex.Split(CRLF, vReadString)
		Dim list As List
		list.Initialize
		If vSplit.Length > 0 Then
			Dim length As Int = vSplit.Length - 1
			Dim i As Int
			For i = 0 To length
				vSplit(i) = vSplit(i).Replace(Chr(10), "").Replace(Chr(13), "")
				If i = 0 Then
					If vSplit(i).ToLowerCase <> "inviofe" Then
						Dim vObjectToCharSequence As Object = "Non è stato trovato il nome del DB (inviofe) da inserire nella prima riga del file."
						Dim vObjectToCharSequence2 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
						Return
					End If
				Else If vSplit(i).Length >= 4 Then
					list.Add(vSplit(i))
				End If
				If i Mod 30 = 0 Then
					DoEvents
				End If
			Next
		End If
		If list.Size > 0 Then
			Dim textWriterWrapper As TextWriter
			textWriterWrapper.Initialize(File.OpenOutput(File.DirDefaultExternal & "/FE", "Tmp.sql", False))
			Dim size As Int = list.Size
			Dim i2 As Int
			For i2 = 0 To size - 1
				textWriterWrapper.Write(list.Get(i2) & CRLF)
			Next
			textWriterWrapper.Close
			CallSub3(httpclient, "ComunicaConInviaFE", "http://127.0.0.1:12512/R__SQL", "")
		End If
		Return
	End If
	z = False
	If z Then
	End If
End Sub

Sub IncassoOperatori_CheckedChange(z As Boolean)
	If Not(ObbligoOp.Checked) And z Then
		Dim vObjectToCharSequence As Object = "Attenzione !!! verrà attivato anche il flag 'Obbligo inserimento operatore alla chiusura dell'asporto' " & CRLF & "Si desidera proseguire ugualmente ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 = -2 Then
			IncassoOperatori.Checked = False
			Return
		End If
		ObbligoOp.Checked = True
	End If
	Dim vObjectToCharSequence3 As Object = "Per applicare la modifica è necessario riavviare il programma."
	Dim vObjectToCharSequence4 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
End Sub

Sub InizioGiorno_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = 0
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire l'ora di inizio della giornata lavorativa", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number <= 23 And numberDialog.Number > 0 Then
			InizioGiorno.Text = "Inizio giornata lavorativa dalle ore " & numberDialog.Number
			InizioGiorno.Tag = numberDialog.Number
			mod1.Sub081
			Return
		End If
		InizioGiorno.Text = "Inizio giornata lavorativa dalla mezzanotte"
		InizioGiorno.Tag = 0
		Return
	End If
	mod1.Sub081
End Sub

Sub ipDistributore_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Indirizzo IP"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire l'indirizzo Ip del terminale sul quale è installato l'infinity Manager", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If vDlg1.Input <> "" Then
			If Not(mod1.Sub129(vDlg1.Input)) Then
				Dim vObjectToCharSequence As Object = "inserire un indirizzo IP valido del terminale sul quale è installato l'infinity Manager"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				mod1.Sub081
				Return
			End If
			ipDistributore.Text = "Indirizzo IP del terminale sul quale è installato l'infinity Manager= " & vDlg1.Input
			ipDistributore.Tag = vDlg1.Input
		Else
			ipDistributore.Text = "Inserire l'indirizzo IP del terminale sul quale è installato l'infinity Manager"
			ipDistributore.Tag = ""
		End If
	End If
	mod1.Sub081
End Sub

Sub IpEFT1_Click
	Sub029(Sender, 1)
End Sub

Sub IpEFT2_Click
	Sub029(Sender, 2)
End Sub

Sub IpEFT3_Click
	Sub029(Sender, 3)
End Sub

Sub IpEFT4_Click
	Sub029(Sender, 4)
End Sub

Sub IpEFT5_Click
	Sub029(Sender, 5)
End Sub

Sub IpEFT6_Click
	Sub029(Sender, 6)
End Sub

Sub IpEFT7_Click
	Sub029(Sender, 7)
End Sub

Sub IpEFT8_Click
	Sub029(Sender, 8)
End Sub

Sub IpEFT9_Click
	Sub029(Sender, 9)
End Sub

Sub IPEFTSM_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = IPEFTSM.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Indirizzo IP"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire l'indirizzo Ip per il terminale SMAC ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 And vDlg1.Input <> "" Then
		If Not(mod1.Sub129(vDlg1.Input)) Then
			Dim vObjectToCharSequence As Object = "inserire un indirizzo IP non valido"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			IPEFTSM.Text = "Inserire l'indirizzo Ip per il Terminale SMAC"
			IPEFTSM.Tag = ""
		Else
			IPEFTSM.Text = "Indirizzo IP terminale SMAC:" & vDlg1.Input
			IPEFTSM.Tag = vDlg1.Input
		End If
	End If
	mod1.Sub081
End Sub

Sub IpRicevute_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Indirizzo IP"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire l'indirizzo Ip per la stampante Ricevute e Fatture", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If vDlg1.Input <> "" Then
			If Not(mod1.Sub129(vDlg1.Input)) Then
				Dim vObjectToCharSequence As Object = "inserire un indirizzo IP valido per la stampante ricevute e fatture (Notch)"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				mod1.Sub081
				Return
			End If
			IpRicevute.Text = "Indirizzo IP per la stampante Ricevute e Fatture (Notch)= " & vDlg1.Input
			IpRicevute.Tag = vDlg1.Input
		Else
			IpRicevute.Text = "Inserire l'indirizzo IP per la stampante Ricevute e Fatture (Notch)"
			IpRicevute.Tag = ""
		End If
	End If
	mod1.Sub081
End Sub

Sub LastDataDocFM_CheckedChange(z As Boolean)
	If Not(z) Or AttivaSezionali.Checked Then
		Return
	End If
	Dim vObjectToCharSequence As Object = "Prima di attivare questo parametro è necessario attivare e configurare il sezionale per la fattura fine mese."
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	mod1.Sub081
	LastDataDocFM.Checked = False
End Sub

Sub LblAttiva_LongClick
	Dim vObjectToCharSequence As Object = "Scadenza licenza: " & DateTime.GetDayOfMonth(Main.vLng1) & "/" & DateTime.GetMonth(Main.vLng1) & "/" & DateTime.GetYear(Main.vLng1)
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
End Sub

Sub lblFatt_Click
	Dim vShow As Int
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Numero Fattura"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	If Main.vBln25 Then
		Dim sb As String = "Inserire il numero della prossima fattura (attuale " & Main.vSql2.ExecQuerySingleResult("select valore from progressivi where codice ='F'") & ")"
		vShow = vDlg1.Show(sb, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	Else
		Dim sb2 As String = "Inserire il numero della prossima fattura (attuale " & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='F'") & ")"
		vShow = vDlg1.Show(sb2, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	End If
	If vShow = -1 Then
		If IsNumber(vDlg1.Input) Then
			If Main.vBln25 Then
				Main.vSql2.ExecNonQuery("update progressivi set valore = " & vDlg1.Input & " where codice ='F'")
				lblFatt.Text = "Fattura Numero :" & Main.vSql2.ExecQuerySingleResult("select valore from progressivi where codice ='F'")
			Else
				Main.vSql1.ExecNonQuery("update progressivi set valore = " & vDlg1.Input & " where codice ='F'")
				lblFatt.Text = "Fattura Numero :" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='F'")
			End If
			mod1.Sub081
			Return
		End If
		Dim vObjectToCharSequence As Object = "Numero Fattura non valido"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub lblFatt2_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Numero Fattura fine mese"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim sb As String = "Inserire il numero della prossima fattura fine mese(attuale " & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='F2'") & ")"
	Dim vShow As Int = vDlg1.Show(sb, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If IsNumber(vDlg1.Input) Then
			Main.vSql1.ExecNonQuery("update progressivi set valore = " & vDlg1.Input & " where codice ='F2'")
			lblFatt2.Text = "Fattura fine mese Numero :" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='F2'")
			mod1.Sub081
			Return
		End If
		Dim vObjectToCharSequence As Object = "Numero Fattura non valido"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub lblMaxImpo_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Importo Massimo"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim sb As String = "Inserire l'importo massimo per ogni riga (attuale " & Main.v_maximpo & " €)"
	Dim vShow As Int = vDlg1.Show(sb, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If IsNumber(vDlg1.Input) Then
			If modfunstr.Sub006(vDlg1.Input) < 99999 Then
				If modfunstr.Sub006(vDlg1.Input) > 0 Then
					lblMaxImpo.Text = "Massimo importo Riga :" & NumberFormat2(vDlg1.Input, 1, 2, 2, False) & " €"
					lblMaxImpo.Tag = modfunstr.Sub006(vDlg1.Input)
					mod1.Sub081
					Return
				End If
			End If
			Dim vObjectToCharSequence As Object = "Importo non valido"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
		Dim vObjectToCharSequence3 As Object = "Importo non valido"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub lblRic_Click
	Dim vShow As Int
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Numero Ricevuta"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	If Main.vBln25 Then
		Dim sb As String = "Inserire il numero della prossima Ricevuta (attuale " & Main.vSql2.ExecQuerySingleResult("select valore from progressivi where codice ='RIC'") & ")"
		vShow = vDlg1.Show(sb, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	Else
		Dim sb2 As String = "Inserire il numero della prossima Ricevuta (attuale " & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='RIC'") & ")"
		vShow = vDlg1.Show(sb2, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	End If
	If vShow = -1 Then
		If IsNumber(vDlg1.Input) Then
			If Main.vBln25 Then
				Main.vSql2.ExecNonQuery("update progressivi set valore = " & vDlg1.Input & " where codice ='RIC'")
				lblRic.Text = "Ricevuta Numero :" & Main.vSql2.ExecQuerySingleResult("select valore from progressivi where codice ='RIC'")
			Else
				Main.vSql1.ExecNonQuery("update progressivi set valore = " & vDlg1.Input & " where codice ='RIC'")
				lblRic.Text = "Ricevuta Numero :" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='RIC'")
			End If
			mod1.Sub081
			Return
		End If
		Dim vObjectToCharSequence As Object = "Numero Ricevuta non valido"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub Legenda_Click
	Dim vObjectToString As String = Sender.Tag
	If vcustomlistviewold2.IsInitialized And vcustomlistviewold2.Sub008 > 0 Then
		vcustomlistviewold2.Sub012(0)
	End If
	vcustomlistviewold2.Sub004
	Sub001(vStr2, vObjectToString)
End Sub

Sub LimitiCashlogy_Click
	Dim z As Boolean
	'vPackageManager1 = PackageManager
	'vLst1 = List
	vLst1 = vPackageManager1.GetInstalledPackages
	Dim size As Int = vLst1.Size - 1
	Dim i As Int = 0
	Do While True
		If i > size Then
			z = False
			Exit
		End If
		If vLst1.Get(i) = "ital.cashology" Then
			z = True
			Exit
		End If
		i = i + 1
	Loop
	If z Then
		vBln8 = True
		Main.vBln15 = False
		Dim vGetApplicationIntent As Intent = vPackageManager1.GetApplicationIntent("ital.cashology")
		vGetApplicationIntent.PutExtra("Caller", File.DirDefaultExternal)
		vGetApplicationIntent.PutExtra("CallerLivelli", True)
		StartActivity(vGetApplicationIntent)
		Return
	End If
	Dim vObjectToCharSequence As Object = "Attenzione ... è necessario installare il programma per la gestione operatori Cashology."
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
End Sub

Sub Listino_Click
	Dim list As List
	list.Initialize
	list.Add("Listino 2")
	list.Add("Listino 3")
	list.Add("Listino 4")
	Dim vInputList1 As Int = idLib.InputList1(list, "Indicare il listino da modificare ...")
	If vInputList1 < 0 Then
		Return
	End If
	Dim vObjectToString As String = list.Get(vInputList1)
	list.Initialize
	list.Add("Arrotonda all'intero")
	list.Add("Arrotonda ai 10 Centesimi")
	list.Add("Arrotonda al Centesimo")
	Dim vInputList12 As Int = idLib.InputList1(list, "Indicare il tipo di arrotondamento...")
	If vInputList12 < 0 Then
		Return
	End If
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Sconto o maggiorazione su " & vObjectToString
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	vIntArr4(vInputList1) = -1000
	vInt9 = 0
	Dim str As String = "Indicare la percentuale di sconto o maggiorazione per il " & vObjectToString & " rispetto al listino 1." & CRLF & list.Get(vInputList12)
	Dim vShow As Int = vDlg1.Show(str, Main.vStr8, "SCONTO", "MAGGIORAZIONE", "ANNULLA", Main.vBmp1)
	If vShow = -2 Then
		mod1.Sub081
		Return
	End If
	If IsNumber(vDlg1.Input) Then
		Dim parseDouble As Int = vDlg1.Input
		If parseDouble >= 0 And parseDouble <= 100 Then
			If vShow = -1 Then
				vIntArr4(vInputList1) = parseDouble * 1
			Else
				vIntArr4(vInputList1) = parseDouble
			End If
			vInt9 = vInputList12
			Dim vObjectToCharSequence As Object = "Premendo 'OK' verranno applicate le variazioni al " & vObjectToString
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Else
			Dim vObjectToCharSequence3 As Object = "Sconto non valido"
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		End If
	Else
		Dim vObjectToCharSequence5 As Object = "Sconto non valido"
		Dim vObjectToCharSequence6 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
	End If
	mod1.Sub081
End Sub

Sub ListMolto_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = 0
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire la % in aggiunta rispetto al listino 1", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number <= 100 And numberDialog.Number > 0 Then
			ListMolto.Text = "Maggiorazione rispetto al Listino 1 per le variazioni con il modificatore 'MOLTO': " & numberDialog.Number & "%"
			ListMolto.Tag = numberDialog.Number
			mod1.Sub081
			Return
		End If
		ListMolto.Text = "Maggiorazione rispetto al Listino 1 per le variazioni con il modificatore 'MOLTO': 0%"
		ListMolto.Tag = 0
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub ListPoco_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = 0
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire la % in detrazione rispetto al listino 1", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number <= 100 And numberDialog.Number > 0 Then
			ListPoco.Text = "Detrazione rispetto al Listino 1 per le variazioni con il modificatore 'POCO': " & numberDialog.Number & "%"
			ListPoco.Tag = numberDialog.Number
			mod1.Sub081
			Return
		End If
		ListPoco.Text = "Detrazione rispetto al Listino 1 per le variazioni con il modificatore 'POCO': 0%"
		ListPoco.Tag = 0
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub Lv_ItemClick(i As Int, obj As Object)
	If Not(vBln1) Then
		Return
	End If
	vBln1 = False
	Dim vObjectToString As String = obj
	Dim vObjectToCharSequence As Object = "Confermi il ripristino del file " & vObjectToString & "? "
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Main.vccefdll1.vBln2 = True
		pw.Visible = True
		mod1.Sub161(pw, 8)
		If Main.v_salvataggio = 0 Then
			vFTP1.DownloadFile("/Ftpdir/" & vObjectToString, False, mod1.vStr4, "Tmpdb.zip")
		Else
			If Main.v_prefixftpsave = "" Then
				vFTP1.DownloadFile("/" & vObjectToString, False, mod1.vStr4, "Tmpdb.zip")
			Else
				Dim sb2 As String = Main.v_prefixftpsave & vObjectToString
				vFTP1.DownloadFile(sb2, False, mod1.vStr4, "Tmpdb.zip")
			End If
		End If
	End If
	mod1.Sub081
End Sub

Sub MargineTabacchi_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = vInt11
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il margine per gli articoli tabacchi", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Dim number As Int = numberDialog.Number
		vInt11 = number
		MargineTabacchi.Text = "Margine articoli Tabacchi: " & vInt11 & " %"
		Dim vObjectToCharSequence As Object = "Alla prossima importazione dei tabacchi verrà ricalcolato il prezzo di acquisto sottraendo il " & number & " % di margine dal prezzo di vendita."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	End If
	mod1.Sub081
End Sub

Sub MaxImpTavolo_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Importo Massimo"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim sb As String = "Inserire l'importo massimo prima dell'alert sul tavolo (attuale " & Main.v_maximptavolo & " €)"
	Dim vShow As Int = vDlg1.Show(sb, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If IsNumber(vDlg1.Input) Then
			If modfunstr.Sub006(vDlg1.Input) < 999 Then
				If modfunstr.Sub006(vDlg1.Input) > 0 Then
					MaxImpTavolo.Text = "Massimo Importo per Alert su tavolo :" & NumberFormat2(vDlg1.Input, 1, 2, 2, False) & " €"
					MaxImpTavolo.Tag = modfunstr.Sub006(vDlg1.Input)
					mod1.Sub081
					Return
				End If
			End If
			Dim vObjectToCharSequence As Object = "Importo non valido"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
		Dim vObjectToCharSequence3 As Object = "Importo non valido"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub mD3_FocusChanged(z As Boolean)
	If mD3.Text <> "" And Not(z) Then
		If Not(Regex.IsMatch("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", mD3.Text.ToLowerCase)) Then
			Dim vObjectToCharSequence As Object = "L'indirizzo email del centro di assistenza non è corretto"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			mD3.Text = ""
			ErrMail.Checked = False
			mod1.Sub081
			Return
		End If
	End If
End Sub

Sub MinTavoloLento_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "minuti da 0 a 120 (0 per annullare)"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire i minuti dall'ultimo acquisto che devono trascorrere prima di considerare un tavolo 'lento'", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If IsNumber(vDlg1.Input) Then
			If modfunstr.Sub006(vDlg1.Input) <= 120 Then
				If modfunstr.Sub006(vDlg1.Input) >= 0 Then
					If modfunstr.Sub006(vDlg1.Input) = 0 Then
						MinTavoloLento.Text = "Inserire i minuti dall'ultimo acquisto che devono trascorrere prima di considerare un tavolo 'lento'"
					Else
						MinTavoloLento.Text = "Minuti dall'ultimo acquisto che devono trascorrere prima di considerare un tavolo 'lento':" & vDlg1.Input
					End If
					MinTavoloLento.Tag = modfunstr.Sub006(vDlg1.Input)
					mod1.Sub081
					Return
				End If
			End If
			Dim vObjectToCharSequence As Object = "valore non valido"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			mod1.Sub081
			Return
		End If
		Dim vObjectToCharSequence3 As Object = "valore non valido"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub MinutiSS_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = 0
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire dopo quanti minuti di inattività deve attivari lo Screen Saver (0 = non disattivare mai)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number < 100 And numberDialog.Number > 0 Then
			MinutiSS.Text = "Screen Saver dopo " & numberDialog.Number & " minuti di inattività"
			MinutiSS.Tag = numberDialog.Number
		Else If numberDialog.Number = 0 Then
			Dim vObjectToCharSequence As Object = "Attenzione... Per salvaguardare lo schermo non è consigliabile disattivare lo Screen Saver. " & CRLF & "Si desidera continuare ?"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Ok", "", "Annulla", Main.vBmp1)
			If vMsgbox2 = -1 Then
				MinutiSS.Text = "Screen Saver Disattivato"
				MinutiSS.Tag = 0
				mod1.Sub081
				Return
			End If
		End If
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub mPwdS_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = mPwdS.Text
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Inserire la Password"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire la password per l'accesso alle statistiche da remoto", Main.vStr8, "OK", "", "ANNULLA", Main.vBmp1)
	If vShow <> -1 Or vDlg1.Input.Length > 20 Then
		Return
	End If
	mPwdS.Text = vDlg1.Input
End Sub

Sub msgboxact(str As String) As Int
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Return Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "Guasta", Main.vBmp1)
End Sub

Sub msgboxonly(str As String)
	Dim vObjectToCharSequence As Object = str
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "", "", "Ok", Main.vBmp1)
End Sub

Sub mUserS_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = mUserS.Text
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Inserire l'utente"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire l'utente per l'accesso alle statistiche da remoto", Main.vStr8, "OK", "", "ANNULLA", Main.vBmp1)
	If vShow <> -1 Or vDlg1.Input.Length > 20 Then
		Return
	End If
	mUserS.Text = vDlg1.Input
End Sub

Sub Sub025(concreteViewWrapper As View, z As Boolean)
	Dim z2 As Boolean
	Dim vIsInitialized As Boolean = concreteViewWrapper.IsInitialized
	Dim vTmp As Int = vcustomlistviewold2.Sub008 - 1
	Dim i As Int
	For i = 0 To vTmp
		Dim getpanel As Panel = vcustomlistviewold2.getpanel(i)
		If ((Not(getpanel.GetView(0).Visible) Or Not(getpanel.GetView(0).Enabled)) And Not(vIsInitialized)) Or (vIsInitialized And getpanel.GetView(0) = concreteViewWrapper And Not(z)) Then
			getpanel.GetView(0).Enabled = False
			If vIsInitialized Then
				Dim vGetAllViewsRecursive As IterableList = getpanel.GetAllViewsRecursive
				Dim size As Int = vGetAllViewsRecursive.Size
				Dim i2 As Int = 0
				Dim z3 As Boolean = False
				Do While i2 < size
					Dim concreteViewWrapper2 As View = vGetAllViewsRecursive.Get(i2)
					If concreteViewWrapper2.Tag = Null Or concreteViewWrapper2.Tag <> "del" Then
						z2 = z3
					Else
						concreteViewWrapper2.Visible = True
						z2 = True
					End If
					i2 = i2 + 1
					z3 = z2
				Loop
				If z3 Then
					Return
				End If
			End If
			Dim imageViewWrapper As ImageView
			imageViewWrapper.Initialize("")
			imageViewWrapper.Bitmap = LoadBitmap(File.DirAssets, "fca_lucchetto.png")
			imageViewWrapper.Tag = "del"
			getpanel.AddView(imageViewWrapper, PerXToCurrent(50), DipToCurrent(0), PerXToCurrent(5), getpanel.GetView(0).Height)
			Dim vGetAllViewsRecursive2 As IterableList = getpanel.GetAllViewsRecursive
			Dim size2 As Int = vGetAllViewsRecursive2.Size
			Dim i3 As Int
			For i3 = 0 To size2 - 1
				vGetAllViewsRecursive2.Get(i3).Visible = True
			Next
		Else If vIsInitialized And getpanel.GetView(0) = concreteViewWrapper And z Then
			Dim vGetAllViewsRecursive3 As IterableList = getpanel.GetAllViewsRecursive
			Dim size3 As Int = vGetAllViewsRecursive3.Size
			Dim i4 As Int
			For i4 = 0 To size3 - 1
				Dim concreteViewWrapper3 As View = vGetAllViewsRecursive3.Get(i4)
				If Not(concreteViewWrapper3.Tag = Null) And concreteViewWrapper3.Tag = "del" Then
					concreteViewWrapper3.Visible = False
				End If
			Next
			getpanel.GetView(0).Enabled = True
			Return
		End If
	Next
End Sub

Sub NoDatiPeriodo_CheckedChange(z As Boolean)
	If z Then
		Dim vObjectToCharSequence As Object = "ATTENZIONE ...." & CRLF & "Abilitando questo parametro le vendite periodiche non verranno più registrate (Scontrini , Fatture , Ricevute , Fatture fine mese ....)" & CRLF & "Si desidera proseguire ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "SI", "", "NO", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			NoDatiPeriodo.Checked = False
			Return
		End If
		Return
	End If
End Sub

Sub NoTallon_Click
	Dim i As Int = 0
	Dim list As List
	list.Initialize
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from confstampe order by codice")
	list.Add("Stampa il tallon dell'asporto su MF")
	list.Add("Non stampare il tallon dell'asporto")
	Dim rowCount As Int = cursorWrapper2.RowCount - 1
	Dim i2 As Int
	For i2 = 0 To rowCount
		cursorWrapper2.Position = i2
		If cursorWrapper2.GetInt("stato") = 1 And cursorWrapper2.GetInt("mf") = 0 And cursorWrapper2.GetInt("indice") = 0 Then
			list.Add(cursorWrapper2.GetString("descrizione"))
		End If
	Next
	Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare il tipo di stampa")
	If vInputList1 < 0 Then
		mod1.Sub081
		Return
	End If
	Sub025(TallonSempre, True)
	If vInputList1 <= 1 Then
		If vInputList1 = 1 Then
			TallonSempre.Checked = False
			Sub025(TallonSempre, False)
		End If
		NoTallon.Text = list.Get(vInputList1)
		NoTallon.Tag = vInputList1
	Else
		Dim i3 As Int = 2
		Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
		Do While True
			If i > rowCount2 Then
				Exit
			End If
			cursorWrapper2.Position = i
			If cursorWrapper2.GetInt("stato") = 1 And cursorWrapper2.GetInt("mf") = 0 And cursorWrapper2.GetInt("indice") = 0 Then
				If i3 = vInputList1 Then
					NoTallon.Text = "Stampa tallon su " & list.Get(vInputList1)
					NoTallon.Tag = cursorWrapper2.GetInt("codice") + 1
					Exit
				End If
				i3 = i3 + 1
			End If
			i = i + 1
		Loop
	End If
	mod1.Sub081
End Sub

Sub nSalva_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 1
	numberDialog.Number = Main.v_nsalva
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim sb As String = "Inserire il numero massimo di salvataggi presenti sul " & Main.vStr1 & ""
	Dim vShow As Int = numberDialog.Show(sb, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 And numberDialog.Number > 0 Then
		nSalva.Text = "Numero salvataggi su FTP = " & numberDialog.Number
		nSalva.Tag = numberDialog.Number
	End If
	mod1.Sub081
End Sub

Sub Nulla_Click
End Sub

Sub NumeroScontriniST_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = NumeroScontriniST.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il numero di scontrini lotteria dopo il limite per attivare la richiesta automatica di invio (0 = Disattivato)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		NumeroScontriniST.Text = "Numero di scontrini lotteria dopo il limite per attivare la richiesta di invio:" & numberDialog.Number
		NumeroScontriniST.Tag = numberDialog.Number
		Return
	End If
End Sub

Sub NumeroTT_Click
	Try
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	If Not(Main.vBln16) Then
		Dim vObjectToCharSequence As Object = "E' necessaria la versione 'PRO' per utilizzare questa funzione"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 5
	numberDialog.Number = NumeroTT.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il numero di tavoli-tessere da creare (max 30000 , 0 = disattiva)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number <= 30000 And numberDialog.Number > 0 Then
			NumeroTT.Text = "Numero tavoli tessere creati: " & numberDialog.Number
			NumeroTT.Tag = numberDialog.Number
			Dim number As Int = numberDialog.Number + 20000
			Main.vSql1.BeginTransaction
			Try
				Main.vSql1.ExecNonQuery("delete from tavoli where tavolo >=20000")
				Dim i As Int
				For i = 20000 To number
					Main.vSql1.ExecNonQuery("insert into tavoli(tavolo) values(" & i & ")")
				Next
				Main.vSql1.TransactionSuccessful
			Catch
				mod1.Sub217(LastException.Message)
			End Try
			Main.vSql1.EndTransaction
			Dim vObjectToCharSequence3 As Object = "Procedura" & TAB & " ultimata correttamente"
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Ok", "", "Annulla", Main.vBmp1)
		Else If numberDialog.Number = 0 Then
			Dim vObjectToCharSequence5 As Object = "Attenzione... verranno eliminati tutti i tavoli-tessere presenti. " & CRLF & "Si desidera continuare ?"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "Ok", "", "Annulla", Main.vBmp1)
			If vMsgbox2 = -1 Then
				Main.vSql1.ExecNonQuery("delete from tavoli where tavolo >=20000")
				NumeroTT.Text = "Gestione tavoli-tessere disabilitata"
				NumeroTT.Tag = 0
				mod1.Sub081
				Return
			End If
		End If
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub OpExtended_CheckedChange(z As Boolean)
	If z Then
		Dim vObjectToCharSequence As Object = "ATTENZIONE ...." & CRLF & "Abilitando questo parametro il codice operatore dovrà sempre essere di 2 cifre (vedi help di funzione) " & CRLF & "Si desidera proseguire ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "SI", "", "NO", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			OpExtended.Checked = False
			Return
		End If
		Return
	End If
End Sub

Sub PagamentoPrep_ItemClick(i As Int, obj As Object)
	If i <> 2 Then
		Dim vObjectToCharSequence As Object = "Verificare la corretta configurazione del pagamento selezionato"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	End If
End Sub

Sub PaginaPagamenti_Click
	Dim list As List
	list.Initialize
	list.Add("Disattiva funzione")
	Dim rowCount As Int = vCur3.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		DoEvents
		vCur3.Position = i
		list.Add(vCur3.GetString("descrizione"))
	Next
	Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare la pagina")
	If vInputList1 <= 0 Then
		PaginaPagamenti.Text = "Abilita l'obbligo di selezione pagina documenti prima della chiusura del movimento di vendita"
		PaginaPagamenti.Tag = 0
	Else
		vCur3.Position = vInputList1 - 1
		PaginaPagamenti.Text = "Prima della chiusura movimento è obbligatorio selezionare la " & vCur3.GetString("descrizione")
		PaginaPagamenti.Tag = vInputList1
	End If
	mod1.Sub081
End Sub

Sub ParametriInvioFE_Click
	If Not(Main.v_inviofe) Then
		Dim vObjectToCharSequence As Object = "Installare la procedura di invio delle Fatture elettroniche."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	vBln8 = True
	CallSub3(httpclient, "ComunicaConInviaFE", "http://127.0.0.1:12512/R__Settings", "")
End Sub

Sub PercorsoAzzera_Click
	Dim fileDialog As FileDialog
	fileDialog.TextColor = -7829368
	fileDialog.ShowOnlyFolders = True
	fileDialog.FastScroll = True
	fileDialog.FilePath = mod1.vStr4
	Dim vObjectToCharSequence As Object = "Se si desidera salvare su chiave USB indicare SEMPRE una sottocartella ..."
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	Dim vObjectToCharSequence3 As Object = "Impostare il Percorso per il salvataggio dei dati Obsoleti"
	Dim vShow As Int = fileDialog.Show(vObjectToCharSequence3, "OK", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		PercorsoAzzera.Text = "Percorso salvataggio dati Obsoleti:" & fileDialog.FilePath
		PercorsoAzzera.Tag = fileDialog.FilePath
		Sub025(NoDatiPeriodo, True)
		Return
	End If
	PercorsoAzzera.Text = "Salvataggio dati obsoleti NON ABILITATO"
	PercorsoAzzera.Tag = ""
	Sub025(NoDatiPeriodo, False)
End Sub

Sub pIva_FocusChanged(z As Boolean)
	Try
		Dim editTextWrapper As EditText = Sender
		If z Then
			editTextWrapper.SelectionStart = editTextWrapper.Text.Length
			Return
		End If
		If editTextWrapper.Text.Trim <> "" Then
			If Not(mod1.Sub134(editTextWrapper.Text.Trim, True)) Then
				Dim str As String = "Codice Fiscale non valido"
				If editTextWrapper.Tag = "PI" Then
					str = "P.Iva non valida"
				End If
				Dim vObjectToCharSequence As Object = str
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			End If
			editTextWrapper.Text = modfunstr.left(editTextWrapper.Text, 20).Trim
			editTextWrapper.SelectionStart = editTextWrapper.Text.Length
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub pIva_TextChanged(str As String, str2 As String)
	Dim editTextWrapper As EditText = Sender
	If str2.Length > 20 Then
		editTextWrapper.Text = str
		editTextWrapper.SelectionStart = str.Length
		Return
	End If
End Sub

Sub pNF_Click
End Sub

Sub pnlDatiEser_Click
End Sub

Sub pnlDatiTerzo_Click
End Sub

Sub PnlHide_Click
End Sub

Sub PORTAEFTSM_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 5
	numberDialog.Number = PORTAEFTSM.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire la porta per il lettore SMAC (default 5000)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number > 0 And numberDialog.Number < 65535 Then
			PORTAEFTSM.Text = "Porta del terminale SMAC:" & numberDialog.Number
			PORTAEFTSM.Tag = numberDialog.Number
			Sub025(PORTAEFTSM, True)
		Else
			Dim vObjectToCharSequence As Object = "Valore di porta non valido"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		End If
	End If
	mod1.Sub081
End Sub

Sub PrefissoCliente_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = Main.v_prefissocliente
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il prefisso della tessera cliente", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Dim vNumberToString As String = numberDialog.Number
		Dim vTmp As String = modfunstr.Sub003("000" & vNumberToString, 3)
		PrefissoCliente.Text = "Prefisso per il riconoscimento automatico del cliente=" & vTmp
		PrefissoCliente.Tag = vTmp
		Return
	End If
End Sub

Sub PrefissoCoupon_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = PrefissoCoupon.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Prefisso Coupon"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Prefisso per il riconoscimento automatico dei Coupon (valore numerico di 3 cifre)", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If vDlg1.Input.Length <> 3 Or Not(IsNumber(vDlg1.Input)) Then
			Dim vObjectToCharSequence As Object = "Il codice deve essere un valore numerico di 3 cifre."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			Return
		End If
		PrefissoCoupon.Text = "Prefisso per il riconoscimento automatico dei Coupon (valore numerico di 3 cifre)=" & vDlg1.Input
		PrefissoCoupon.Tag = vDlg1.Input
	End If
	mod1.Sub081
End Sub

Sub PrefissoTT_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 3
	numberDialog.Number = Main.v_prefissott
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il prefisso del tavolo-tessera", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Dim vNumberToString As String = numberDialog.Number
		Dim vTmp As String = modfunstr.Sub003("000" & vNumberToString, 3)
		PrefissoTT.Text = "Prefisso per il riconoscimento automatico del tavolo-tessera=" & vTmp
		PrefissoTT.Tag = vTmp
		Return
	End If
End Sub

Sub PrenotaGiorni_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = PrenotaGiorni.Tag
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Numero di giorni a partire da oggi per la proposta della data al momento della sospensione della prenotazione", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number < 100 And numberDialog.Number >= 0 Then
			PrenotaGiorni.Text = "Numero di giorni da oggi per data prenotazione predefinita: " & numberDialog.Number
			PrenotaGiorni.Tag = numberDialog.Number
		End If
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub PrenotaGiorniApertura_Click
	Dim vObjectToString As String = PrenotaGiorniApertura.Tag
	Dim map As Map
	map.Initialize
	map.Put("Domenica", vObjectToString.SubString2(0, 1) = "1")
	map.Put("Lunedì", vObjectToString.SubString2(1, 2) = "1")
	map.Put("Martedì", vObjectToString.SubString2(2, 3) = "1")
	map.Put("Mercoledì", vObjectToString.SubString2(3, 4) = "1")
	map.Put("Giovedì", vObjectToString.SubString2(4, 5) = "1")
	map.Put("Venerdì", vObjectToString.SubString2(5, 6) = "1")
	map.Put("Sabato", vObjectToString.SubString2(6, 7) = "1")
	InputMap(map, "Selezionare i giorni di apertura dell'attività")
	PrenotaGiorniApertura.Tag = IIf(map.Get("Domenica"), "1", "0") & IIf(map.Get("Lunedì"), "1", "0") & IIf(map.Get("Martedì"), "1", "0") & IIf(map.Get("Mercoledì"), "1", "0") & IIf(map.Get("Giovedì"), "1", "0") & IIf(map.Get("Venerdì"), "1", "0") & IIf(map.Get("Sabato"), "1", "0")
	mod1.Sub081
End Sub

Sub ProcAuto1_Click
	Sub031(Sender, 1)
End Sub

Sub ProcAuto2_Click
	Sub031(Sender, 2)
End Sub

Sub ProcAuto3_Click
	Sub031(Sender, 3)
End Sub

Sub ProcAuto4_Click
	Sub031(Sender, 4)
End Sub

Sub ProcAuto5_Click
	Sub031(Sender, 5)
End Sub

Sub QuantiPunti_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = vInt10
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire il numero di punti", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Dim number As Int = numberDialog.Number
		numberDialog.Number = vInt12
		numberDialog.Decimal = 0
		numberDialog.ShowSign = False
		Dim str As String = "Inserire ogni quanti € rilasciare " & number & " punti."
		Dim vShow2 As Int = numberDialog.Show(str, "Ok", "Annulla", "", Main.vBmp1)
		If vShow2 = -1 Then
			vInt12 = numberDialog.Number
			vInt10 = number
			QuantiPunti.Text = "Punti da erogare: " & vInt10 & " ogni " & vInt12 & " €"
		End If
	End If
	mod1.Sub081
End Sub

Sub R1_Click
	Dim buttonWrapper As Button = Sender
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = buttonWrapper.Text.SubString(8).Replace(CRLF, "")
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Riga di intestazione " & buttonWrapper.Tag
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim str As String = "Inserire il testo per la " & buttonWrapper.Tag & "° riga di intestazione"
	Dim vShow As Int = vDlg1.Show(str, Main.vStr8, "OK", "", "ANNULLA", Main.vBmp1)
	If vShow = -1 Then
		buttonWrapper.Text = "Riga " & buttonWrapper.Tag & ": " & CRLF & modfunstr.left(vDlg1.Input.Replace(",", "").Replace("'", "").Trim, 42)
		vBln3 = True
	End If
	mod1.Sub081
End Sub

Sub R10_Click
	Dim buttonWrapper As Button = Sender
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = buttonWrapper.Text.SubString(18).Replace(CRLF, "")
	vDlg1.PasswordMode = False
	Dim i As Int = IIf(buttonWrapper.Tag = 11, 2, 1)
	vDlg1.Hint = "Riga di cortesia " & i
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim str As String = "Inserire il testo per la " & i & "° riga di cortesia"
	Dim vShow As Int = vDlg1.Show(str, Main.vStr8, "OK", "", "ANNULLA", Main.vBmp1)
	If vShow = -1 Then
		buttonWrapper.Text = "Riga Cortesia " & i & ": " & CRLF & modfunstr.left(vDlg1.Input.Replace(",", "").Replace("'", "").Trim, 42)
		vBln5 = True
	End If
	mod1.Sub081
End Sub

Sub R1NF_Click
	Dim buttonWrapper As Button = Sender
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = buttonWrapper.Text.SubString(8).Replace(CRLF, "")
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Riga di intestazione " & buttonWrapper.Tag
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim str As String = "Inserire il testo per la " & buttonWrapper.Tag & "° riga di intestazione"
	Dim vShow As Int = vDlg1.Show(str, Main.vStr8, "OK", "", "ANNULLA", Main.vBmp1)
	If vShow = -1 Then
		buttonWrapper.Text = "Riga " & buttonWrapper.Tag & ": " & CRLF & modfunstr.left(vDlg1.Input.Replace(",", "").Replace("'", "").Trim, 42)
		vBln4 = True
	End If
	mod1.Sub081
End Sub

Sub RepartoGV_Click
	Dim list As List
	list.Initialize
	Dim rowCount As Int = vCur2.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		DoEvents
		vCur2.Position = i
		list.Add(vCur2.GetString("descrizione"))
	Next
	Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare il reparto")
	If vInputList1 < 0 Then
		RepartoGV.Text = "Reparto per Gratta e Vinci non impostato"
		RepartoGV.Tag = -1
	Else
		vCur2.Position = vInputList1
		RepartoGV.Text = "Reparto per Gratta e Vinci = " & vCur2.GetString("descrizione")
		RepartoGV.Tag = vInputList1
	End If
	mod1.Sub081
End Sub

Sub RicCredito_CheckedChange(z As Boolean)
	vBln6 = True
End Sub

Sub ripristinailfile
	If File.Exists(mod1.vStr4, "Tmpdb.zip") Then
		Try
			If vBln2 Then
				If Not(Sub018(mod1.vStr4, "Tmpdb.zip")) Then
					Dim vObjectToCharSequence As Object = "Errore nel formato del file" & CRLF & "Tmpdb.zip"
					Dim vObjectToCharSequence2 As Object = Main.vStr8
					Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
					mod1.Sub081
					Return
				End If
			Else
				Dim archiverForB4A As ArchiverForB4A
				archiverForB4A.UnZip(mod1.vStr4, "Tmpdb.zip", mod1.vStr4, "")
			End If
			ProgressDialogHide
			Dim vObjectToCharSequence3 As Object = "Il programma verrà chiuso per completare il ripristino."
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		Catch
			ProgressDialogHide
			Dim vObjectToCharSequence5 As Object = "Errore nel formato del file"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
		End Try
		mod1.vBln4 = True
	Else
		ProgressDialogHide
	End If
End Sub

Sub S1_ItemClick(i As Int, obj As Object)
	vBln3 = True
End Sub

Sub S10_ItemClick(i As Int, obj As Object)
	vBln5 = True
End Sub

Sub SalvaOra_Click
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = 0
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	Dim vShow As Int = numberDialog.Show("Inserire l'ora per il salvataggio automatico (con screen saver attivo) o in Chiusura Giornaliera", "Ok", "Annulla", "Salva in Chiusura Giornaliera", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number < 24 And numberDialog.Number >= 0 Then
			Dim number As Int = numberDialog.Number
			SalvaOra.Text = "Salvataggio Automatico impostato per le " & number
			SalvaOra.Tag = number
			mod1.Sub081
			Return
		End If
	Else
		If vShow = -2 Then
			SalvaOra.Text = "Salvataggio Automatico in Chiusura Giornaliera"
			SalvaOra.Tag = -2
			mod1.Sub081
			Return
		End If
	End If
	SalvaOra.Text = "Salvataggio Automatico non impostato"
	SalvaOra.Tag = -1
	mod1.Sub081
End Sub

'### RISTRUTTURARE: Resumable Sub convertita come macchina a stati (comportamento identico all'originale).
Sub Salvataggio_ItemClick(position As Int, value As Object)
	Dim limit16 As Int
	Dim step16 As Int
	Dim bfound As Boolean
	Dim i As Int
	Dim sapp As String
	Dim ret As Int
	Dim mtxt As String
	Dim storage As externalstorage
	Dim rsState As Int = 0
	Do While True
		Select rsState
			Case -1
				Return
			Case 0
				rsState = 1
				Continue
			Case 1
				rsState = 60
				If position = 0 Then
					rsState = 3
					Continue
				Else If position = 1 Then
					rsState = 5
					Continue
				Else If position = 2 Then
					rsState = 14
					Continue
				Else If position = 3 Then
					rsState = 16
					Continue
				Else If position = 4 Then
					rsState = 31
					Continue
				Else If position = 6 Then
					rsState = 47
					Continue
				Else If position <> 7 Then
					Continue
				Else
					rsState = 49
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 3
			Case 3
				rsState = 60
				Sub037(False)
				Continue
			Case 5
				rsState = 6
				Sub037(False)
				Continue
			Case 6
				rsState = 9
				If Main.v_usbpath <> "" Then
					Continue
				Else
					rsState = 8
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 8
			Case 8
				rsState = 9
				usbpath_click()
				Continue
			Case 9
				rsState = 12
				If Main.v_usbpath <> "" Then
					Continue
				Else
					rsState = 11
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 11
			Case 11
				rsState = 12
				Salvataggio.SelectedIndex = 0
				Return
			Case 12
				rsState = 60
				Continue
			Case 14
				rsState = 60
				Sub037(True)
				Continue
			Case 16
				rsState = 17
				bfound = False
				Continue
			Case 17
				rsState = 24
				step16 = 1
				limit16 = vLst1.Size - 1
				i = 0
				rsState = 61
				Continue
			Case 19
				rsState = 20
				sapp = vLst1.Get(i)
				Continue
			Case 20
				rsState = 23
				If sapp <> "com.ttxapps.drivesync" Then
					Continue
				Else
					rsState = 22
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 22
			Case 22
				rsState = 23
				bfound = True
				rsState = 24
				Continue
			Case 23
				rsState = 62
				Continue
			Case 24
				rsState = 29
				If Not(bfound) Then
					rsState = 26
					Continue
				Else
					rsState = 28
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 26
			Case 26
				rsState = 29
				Dim vObjectToCharSequence As Object = "Per utilizzare questa modalità di backup è necessario installare DriveSync"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				Salvataggio.SelectedIndex = 0
				Return
			Case 28
				rsState = 29
				Dim vObjectToCharSequence3 As Object = "Il Backup verrà copiato nella cartella DriveSyncFiles"
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				Continue
			Case 29
				rsState = 60
				Continue
			Case 31
				rsState = 32
				Continue
			Case 32
				rsState = 35
				If IpRPI.Text <> "" Then
					Continue
				Else
					rsState = 34
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 34
			Case 34
				rsState = 35
				Dim vObjectToCharSequence5 As Object = "Indicare l'indirizzo ip del ServiceBox."
				Dim vObjectToCharSequence6 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
				Salvataggio.SelectedIndex = 0
				Return
			Case 35
				rsState = 36
				Dim inputDialog2 As InputDialog = vDlg1
				vDlg1.InputType = 1
				vDlg1.Input = vStr1
				vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
				vDlg1.PasswordMode = False
				ret = -3
				vDlg1.Hint = "descrizione"
				mtxt = "Indicare la password per le comunicazioni con il ServiceBox (almeno 3 caratteri)"
				Dim str As String = mtxt
				ret = vDlg1.Show(str, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
				Continue
			Case 36
				rsState = 45
				Dim i_ As Int = ret
				If i_ <> -1 Then
					Continue
				Else
					rsState = 38
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 38
			Case 38
				rsState = 39
				Continue
			Case 39
				rsState = 44
				If vDlg1.Input.Length >= 3 Then
					rsState = 41
					Continue
				Else
					rsState = 43
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 41
			Case 41
				rsState = 44
				vStr1 = vDlg1.Input.Replace("'", "")
				Continue
			Case 43
				rsState = 44
				vStr1 = ""
				Continue
			Case 44
				rsState = 45
				Continue
			Case 45
				rsState = 60
				Continue
			Case 47
				rsState = 60
				File.MakeDir(File.DirRootExternal, "/backup")
				UsbPath.Tag = File.DirRootExternal & "/backup"
				UsbPath.Text = "Percorso chiave USB:" & CRLF & UsbPath.Tag
				Main.v_usbpath = UsbPath.Tag
				Dim vObjectToCharSequence7 As Object = "Impostare in bFileSync il percorso " & UsbPath.Tag & " come cartella di origine"
				Dim vObjectToCharSequence8 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
				Return
			Case 49
				rsState = 50
				Continue
			Case 50
				rsState = 53
				If Main.vInt9 >= 23 Then
					Continue
				Else
					rsState = 52
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 52
			Case 52
				rsState = 53
				Salvataggio.SelectedIndex = 5
				Dim vObjectToCharSequence9 As Object = "Questo tipo di salvataggio necessita Android 6+"
				Dim vObjectToCharSequence10 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
				Return
			Case 53
				rsState = 54
				vBln8 = True
				Dim vObjectToCharSequence11 As Object = "Inserire il percorso di destinazione del salvataggio"
				Dim vObjectToCharSequence12 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence11, vObjectToCharSequence12, "OK", "", "", Main.vBmp1)
				'storage = externalstorage
				storage.Initialize(Me, "Storage")
				storage.Sub011(False)
				Wait For (Null) Storage_Externalfolderavailable
				rsState = 63
				Continue
			Case 54
				rsState = 59
				If Not(storage.vexternalfile1.IsInitialized) Then
					rsState = 56
					Continue
				Else
					rsState = 58
					Continue
				End If
				'(fallthrough java verso il case successivo)
				rsState = 56
			Case 56
				rsState = 59
				Dim vObjectToCharSequence13 As Object = "Non è stata selezionata la destinazione per il salvataggio."
				Dim vObjectToCharSequence14 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence13, vObjectToCharSequence14, "OK", "", "", Main.vBmp1)
				Return
			Case 58
				rsState = 59
				Dim vObjectToCharSequence15 As Object = "Il percorso di destinazione del salvataggio è stato modificato"
				Dim vObjectToCharSequence16 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence15, vObjectToCharSequence16, "OK", "", "", Main.vBmp1)
				Continue
			Case 59
				rsState = 60
				Continue
			Case 60
				rsState = -1
				PrefixFTPSave.Visible = position = 2 Or position = 3
				ServerSave.Visible = position = 2
				UtenteSave.Visible = position = 2
				PasswordSave.Visible = position = 2
				mod1.Sub081
				Continue
			Case 61
				rsState = 24
				If (step16 > 0 And i <= limit16) Or (step16 < 0 And i >= limit16) Then
					rsState = 19
					Continue
				End If
				Continue
			Case 62
				rsState = 61
				i = i + 0 + step16
				Continue
			Case 63
				rsState = 54
				Continue
		End Select
	Loop
End Sub

Sub SalvaVD_ItemClick(i As Int, obj As Object)
	If i = 1 Then
		If IpVis.Text = "" Then
			Dim vObjectToCharSequence As Object = "Indicare l'indirizzo IP per VisionDroid"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			SalvaVD.SelectedIndex = 0
			Return
		End If
		Return
	End If
	If i = 2 And Salvataggio.SelectedIndex <> 1 Then
		Dim vObjectToCharSequence3 As Object = "Per attivare questo parametro è necessario abilitare il salvataggio su Chiave USB o MicroSD"
		Dim vObjectToCharSequence4 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		SalvaVD.SelectedIndex = 0
		Return
	End If
End Sub

Sub SeekBar1_ValueChanged(i As Int, z As Boolean)
	If i < 10 Then
		i = 10
	End If
	Dim phone As Phone = Main.vPhone1
	Phone.SetScreenBrightness(i / 100)
End Sub

Sub Send_Click
	Dim buttonWrapper As Button = Sender
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = ""
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Numeratore pacchetti "
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire il nuovo valore ", Main.vStr8, "OK", "", "ANNULLA", Main.vBmp1)
	If vShow = -2 Then
		mod1.Sub081
		Return
	End If
	If IsNumber(vDlg1.Input) Then
		Dim parseDouble As Int = vDlg1.Input
		If parseDouble >= 0 Then
			Dim vObjectToCharSequence As Object = "Premendo 'OK' verrà confermata la modifica al numeratore"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			If buttonWrapper.Text.StartsWith("Pacchetti Inviati:") Then
				buttonWrapper.Text = "Pacchetti Inviati: " & parseDouble
				vInt7 = parseDouble
			Else
				buttonWrapper.Text = "Pacchetti Ricevuti: " & parseDouble
				vInt8 = parseDouble
			End If
		Else
			Dim vObjectToCharSequence3 As Object = "Valore non valido"
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
		End If
	Else
		Dim vObjectToCharSequence5 As Object = "Valore non valido"
		Dim vObjectToCharSequence6 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
	End If
	mod1.Sub081
End Sub

Sub SendClienti_Click
	Dim vInputList1 As Int = idLib.InputList1(vLst2, "Invio record clienti a uniandro:")
	If vInputList1 < 0 Then
		Return
	End If
	SendClienti.Text = "Invio record clienti a uniandro:" & vLst2.Get(vInputList1)
	SendClienti.Tag = vInputList1
	mod1.Sub081
End Sub

Sub Sub026
	If vStr4 = "" Then
		btnImportaBasicSupport.Text = "NON INSERITO"
		btnImportaBasicSupport.Background = mod1.Sub155(-949630, 25)
		Return
	End If
	If vStr4 = "err" Then
		btnImportaBasicSupport.Text = "NON VALIDO"
		btnImportaBasicSupport.Background = mod1.Sub155(-949630, 25)
		Return
	End If
	If vStr4 = "2099" Then
		btnImportaBasicSupport.Text = "VALIDO A VITA"
		btnImportaBasicSupport.Background = mod1.Sub155(-9440894, 25)
		Return
	End If
	If vStr4 = "scaduto" Then
		btnImportaBasicSupport.Text = "SCADUTO"
		btnImportaBasicSupport.Background = mod1.Sub155(-949630, 25)
		Return
	End If
	btnImportaBasicSupport.Text = "VALIDO PER TUTTO IL " & vStr4
	btnImportaBasicSupport.Background = mod1.Sub155(-9440894, 25)
End Sub

Sub Sub027(i As Int, i2 As Int) As StateListDrawable
	Dim stateListDrawable As StateListDrawable
	Dim colorDrawable As ColorDrawable
	Dim colorDrawable2 As ColorDrawable
	colorDrawable2.Initialize2(i, i2, 3, -1)
	colorDrawable.Initialize2(-1, i2, 3, i)
	stateListDrawable.Initialize
	stateListDrawable.AddState2(Array As Int(16842910, -16842919), colorDrawable2)
	stateListDrawable.AddState2(Array As Int(16842919), colorDrawable)
	Return stateListDrawable
End Sub

Sub Sub028(buttonWrapper As Button, i As Int)
	If Main.v_ipeftm(i) <> "" Then
		buttonWrapper.Text = "Indirizzo IP terminale EFT " & i & ":" & Main.v_ipeftm(i)
		buttonWrapper.Tag = Main.v_ipeftm(1)
		Return
	End If
	buttonWrapper.Text = "Inserire l'indirizzo IP del terminale EFT " & i
	buttonWrapper.Tag = ""
End Sub

Sub Sub029(buttonWrapper As Button, i As Int)
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = buttonWrapper.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Indirizzo IP"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim str As String = "Inserire l'indirizzo Ip per il terminale " & i
	Dim vShow As Int = vDlg1.Show(str, Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If vDlg1.Input <> "" Then
			If Not(mod1.Sub129(vDlg1.Input)) Then
				Dim vObjectToCharSequence As Object = "inserire un indirizzo IP non valido"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
				buttonWrapper.Text = "Inserire l'indirizzo Ip per il Terminale EFT " & i
				buttonWrapper.Tag = ""
			Else
				buttonWrapper.Text = "Indirizzo IP terminale " & i & ": " & vDlg1.Input
				buttonWrapper.Tag = vDlg1.Input
			End If
		End If
	Else
		buttonWrapper.Text = "Inserire l'indirizzo Ip per il Terminale EFT " & i
		buttonWrapper.Tag = ""
	End If
	mod1.Sub081
End Sub

Sub Sub030(buttonWrapper As Button, i As Int)
	If Main.v_procauto(i) <> "" Then
		If Main.v_procauto(i).StartsWith("_SQL_") Then
			Try
				buttonWrapper.Text = "Procedura " & i & " da eseguire in Chiusura Giornaliera: Esegui File SQL"
				buttonWrapper.Tag = Main.v_procauto(i)
				Return
			Catch
				buttonWrapper.Text = "Procedura da eseguire alla Chiusura Giornaliera"
				buttonWrapper.Tag = ""
				Return
			End Try
		End If
		Try
			buttonWrapper.Text = "Procedura " & i & " da eseguire in Chiusura Giornaliera:" & vPackageManager1.GetApplicationLabel(Main.v_procauto(i))
			buttonWrapper.Tag = Main.v_procauto(i)
			Return
		Catch
			buttonWrapper.Text = "Procedura da eseguire alla Chiusura Giornaliera"
			buttonWrapper.Tag = ""
			Return
		End Try
	End If
	buttonWrapper.Text = "Procedura da eseguire alla Chiusura Giornaliera"
	buttonWrapper.Tag = ""
End Sub

Sub Sub031(buttonWrapper As Button, i As Int)
	Dim vObjectToCharSequence As Object = "Indicare il tipo di procedura da eseguire:"
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "App installata", "Annulla", "File SQL", Main.vBmp1)
	If vMsgbox2 = -1 Then
		Initialize
		Dim list As List
		list.Initialize
		Dim size As Int = vLst1.Size - 1
		Dim i2 As Int
		For i2 = 0 To size
			Dim vObjectToString As String = vLst1.Get(i2)
			If i2 = vLst1.Size - 1 Then
				list.Add("ANNULLA TUTTO")
			Else
				list.Add(vPackageManager1.GetApplicationLabel(vObjectToString))
			End If
		Next
		If list.Size > 0 Then
			Dim vInputList1 As Int = idLib.InputList1(list, "Indicare la App per la procedura " & i)
			If vInputList1 >= 0 And vInputList1 <> list.Size - 1 And vLst1.Get(vInputList1) <> "cassandraRisto.ital" Then
				buttonWrapper.Text = "Procedura " & i & " da eseguire alla Chiusura Giornaliera:" & list.Get(vInputList1)
				buttonWrapper.Tag = vLst1.Get(vInputList1)
				Return
			End If
			buttonWrapper.Text = "Procedura " & i & " da eseguire alla Chiusura Giornaliera"
			buttonWrapper.Tag = ""
		End If
	Else
		If vMsgbox2 = -2 Then
			Dim fileDialog As FileDialog
			fileDialog.TextColor = -7829368
			fileDialog.FastScroll = True
			fileDialog.FileFilter = ".sql"
			fileDialog.FilePath = mod1.vStr4
			Dim vObjectToCharSequence3 As Object = "Seleziona il file .sql da legare alla procedura " & i
			Dim vShow As Int = fileDialog.Show(vObjectToCharSequence3, "OK", "Annulla", "", Main.vBmp1)
			If vShow = -1 Then
				Dim chosenName As String = fileDialog.ChosenName
				If Not(chosenName.ToLowerCase.EndsWith(".raw.sql")) And chosenName.ToLowerCase.EndsWith(".sql") Then
					buttonWrapper.Text = "Procedura " & i & " da eseguire alla Chiusura Giornaliera: Esegui file SQL"
					buttonWrapper.Tag = "_SQL_"
					Dim filePath As String = fileDialog.FilePath
					File.Copy(filePath, chosenName, File.DirDefaultExternal & "/ProcedureSQL", "Procedura" & i & ".sql")
				End If
			End If
		Else
			If vMsgbox2 = -3 Then
				buttonWrapper.Text = "Procedura da eseguire alla Chiusura Giornaliera"
				buttonWrapper.Tag = ""
			End If
		End If
	End If
	mod1.Sub081
End Sub

Sub Sub032
	If vStr5 = "" Then
		btnImportaSB.Text = "MODULO PRENOTAZIONI NON INSERITO"
		btnImportaSB.Background = mod1.Sub155(-949630, 25)
		Return
	End If
	If vStr5 = "err" Then
		btnImportaSB.Text = "MODULO PRENOTAZIONI NON VALIDO"
		btnImportaSB.Background = mod1.Sub155(-949630, 25)
		Return
	End If
	If vStr5 = "2099" Then
		btnImportaSB.Text = "MODULO PRENOTAZIONI VALIDO A VITA"
		btnImportaSB.Background = mod1.Sub155(-9440894, 25)
		Return
	End If
	If vStr5 = "scaduto" Then
		btnImportaSB.Text = "MODULO PRENOTAZIONI SCADUTO"
		btnImportaSB.Background = mod1.Sub155(-949630, 25)
		Return
	End If
	btnImportaSB.Text = "MODULO PRENOTAZIONI VALIDO FINO AL " & vStr5
	btnImportaSB.Background = mod1.Sub155(-9440894, 25)
End Sub

Sub Sub033
	Dim numberDialog As NumberDialog
	numberDialog.Digits = 2
	numberDialog.Number = 0
	numberDialog.Decimal = 0
	numberDialog.ShowSign = False
	vInt2 = 0
	vInt3 = 0
	vInt4 = 0
	vInt5 = 0
	numberDialog.Number = Main.vInt12
	Dim vShow As Int = numberDialog.Show("Inserire il numero di righe (Min 7 ,Max 20)", "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If numberDialog.Number >= 7 And numberDialog.Number <= 20 Then
			vInt2 = numberDialog.Number
			numberDialog.Number = Main.vInt13
			Dim vShow2 As Int = numberDialog.Show("Inserire il numero di colonne (Min 5 ,Max 20)", "Ok", "Annulla", "", Main.vBmp1)
			If vShow2 = -1 Then
				If numberDialog.Number >= 5 And numberDialog.Number <= 20 Then
					vInt3 = numberDialog.Number
					numberDialog.Number = Main.vInt14
					Dim vShow3 As Int = numberDialog.Show("Inserire il numero di righe per la griglia (Min 3 ,Max 20)", "Ok", "Annulla", "", Main.vBmp1)
					If vShow3 = -1 Then
						If numberDialog.Number >= 3 And numberDialog.Number <= 20 Then
							vInt4 = numberDialog.Number
							If vInt4 > vInt2 Then
								vInt4 = vInt2
							End If
							numberDialog.Number = Main.vInt15
							Dim vShow4 As Int = numberDialog.Show("Inserire il numero di colonne per la griglia (Min 3 ,Max 20)", "Ok", "Annulla", "", Main.vBmp1)
							If vShow4 = -1 Then
								If numberDialog.Number >= 3 And numberDialog.Number <= 20 Then
									vInt5 = numberDialog.Number
									If vInt5 > vInt3 Then
										vInt5 = vInt3
									End If
									vBln7 = True
									Return
								End If
								mod1.Sub081
								Return
							End If
							mod1.Sub081
							Return
						End If
						mod1.Sub081
						Return
					End If
					mod1.Sub081
					Return
				End If
				mod1.Sub081
				Return
			End If
			mod1.Sub081
			Return
		End If
		mod1.Sub081
		Return
	End If
	mod1.Sub081
End Sub

Sub SetTestoFattura_Click
	Dim modalmlineVar As modalmline
	modalmlineVar.Initialize("Configura", 28, Activity)
	Dim vRGB As Int = Colors.RGB(150, 150, 150)
	Dim vRGB2 As Int = Colors.RGB(150, 150, 150)
	modalmlineVar.Sub004(vRGB, vRGB2, -256)
	Dim str As String = ""
	If Main.vSql2.ExecQuerySingleResult("select count(*) from TestiDoc where nmov='generale'") > 0 Then
		str = Main.vSql2.ExecQuerySingleResult("select testo from TestiDoc where nmov='generale'")
	End If
	Dim vTmp As String = modalmlineVar.Sub002("Testo aggiuntivo Fatture", "Aggiungi un testo", "", str)
	If vTmp <> -3 Then
		Main.vSql2.ExecNonQuery("delete from TestiDoc where nmov='generale'")
		Main.vSql2.ExecNonQuery("insert into TestiDoc (nmov,testo) values('generale','" & vTmp & "')")
		ToastMessageShow("Testo aggiuntivo fatture modificato", True)
		Return
	End If
	Main.vSql2.ExecNonQuery("delete from TestiDoc where nmov='generale'")
	ToastMessageShow("Testo aggiuntivo fatture eliminato", True)
End Sub

Sub Sub034(i As Int)
	If i = 0 Then
		ToastMessageShow("Theme not available.", False)
		Return
	End If
	If i = Main.theme_value Then
		Return
	End If
	File.WriteString(File.DirInternal, "theme.txt", i)
	Main.theme_value = i
End Sub

Sub Sub035
	If Tema2.Checked Then
		mod1.vBln6 = True
		TipoLayout.Background = Sub027(-16776961, 25)
		Return
	End If
	Dim vObjectToNumber As Int = TipoLayout.Tag
	If vObjectToNumber = 0 Then
		mod1.Sub172(TipoLayout, "btn2")
		Return
	End If
	mod1.Sub172(TipoLayout, "btn" & vObjectToNumber & "_2")
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/configura.java, metodo m1… (riga 14373).
Sub Sub036
	Dim z As Boolean
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim z5 As Boolean
	Server.Text = Main.v_ipserver
	ServerBila.Text = Main.v_ipserverbila
	IPCassa.Text = Main.v_ipcassa
	If Main.v_ipeftsm <> "" Then
		IPEFTSM.Text = "Indirizzo IP terminale SMAC:" & Main.v_ipeftsm
		IPEFTSM.Tag = Main.v_ipeftsm
	Else
		IPEFTSM.Text = "Inserire l'indirizzo IP del terminale SMAC:" & Main.v_ipeftsm
		IPEFTSM.Tag = ""
	End If
	Sub028(IpEFT1, 1)
	Sub028(IpEFT2, 2)
	Sub028(IpEFT3, 3)
	Sub028(IpEFT4, 4)
	Sub028(IpEFT5, 5)
	Sub028(IpEFT6, 6)
	Sub028(IpEFT7, 7)
	Sub028(IpEFT8, 8)
	Sub028(IpEFT9, 9)
	Sub030(ProcAuto1, 1)
	Sub030(ProcAuto2, 2)
	Sub030(ProcAuto3, 3)
	Sub030(ProcAuto4, 4)
	Sub030(ProcAuto5, 5)
	WebApiPI.Text = "Partita iva del concessionario per abilitare le comunicazioni con il portale: " & Main.v_webapipi
	WebApiPI.Tag = Main.v_webapipi
	WebApiPIEsercente.Text = "Partita iva Esercente visualizzata sul portale: " & Main.v_webapipiesercente
	WebApiPIEsercente.Tag = Main.v_webapipiesercente
	WebApiCAPEsercente.Text = "CAP Esercente visualizzato sul portale: " & Main.v_webapicapesercente
	WebApiCAPEsercente.Tag = Main.v_webapicapesercente
	WebApiRagSoc.Text = "Ragione sociale esercente visualizzata sul portale: " & Main.v_webapiragsoc
	WebApiRagSoc.Tag = Main.v_webapiragsoc
	WebApiIndirizzo.Text = "Indirizzo per utilizzare le funzioni del portale: " & Main.v_webapiindirizzo
	WebApiIndirizzo.Tag = Main.v_webapiindirizzo
	WebApiDatiRetailer.Checked = Main.v_webapidatiretailer
	WebApiRagSoc.Visible = Main.v_webapidatiretailer
	WebApiPIEsercente.Visible = Main.v_webapidatiretailer
	WebApiCAPEsercente.Visible = Main.v_webapidatiretailer
	PORTAEFTSM.Text = "Porta del terminale SMAC:" & Main.v_portaeftsm
	PORTAEFTSM.Tag = Main.v_portaeftsm
	EFTSM.Checked = Main.v_eftsm
	EFTSMSCONTI.Checked = Main.v_eftsmsconti
	EFTSMSCONTI.Visible = Main.v_eftsm And EFTSM.Visible
	EFTSMStampa.Checked = Main.v_eftsmstampa
	EFTSMStampa.Visible = Main.v_eftsm And EFTSM.Visible
	IPEFTSM.Visible = Main.v_eftsm And EFTSM.Visible
	PORTAEFTSM.Visible = Main.v_eftsm And EFTSM.Visible
	AttivaMP.Checked = Main.v_attivamp
	AttivaKeyHTTP.Checked = Main.v_attivakeyhttp
	AttivaInserimentoCliente.Checked = Main.v_attivainserimentocliente
	AttivaSezionali.Checked = Main.v_attivasezionali
	AttivaAzzeramentoProgressivi.Checked = Main.v_attivaazzeramentoprogressivi
	noteInFE.Checked = Main.v_noteinfe
	LastDataDocFM.Checked = Main.v_lastdatadocfm
	If Not(Main.vBln21) Then
		AttivaMP.Checked = False
		AttivaMP.Visible = False
	End If
	IpVis.Text = Main.v_ipvis
	IpRPI.Text = Main.v_iprpi
	UsbPath.Text = "Percorso chiave USB:" & CRLF & Main.v_usbpath
	UsbPath.Tag = Main.v_usbpath
	If Main.v_usbpath = "" Then
		UsbPath.Text = "Impostare il percorso per la chiave USB "
	End If
	QuantiPunti.Text = "Punti da erogare: " & vInt10 & " ogni " & vInt12 & " €"
	MargineTabacchi.Text = "Margine articoli Tabacchi: " & vInt11 & " %"
	Salvataggio.SelectedIndex = Main.v_salvataggio
	vStr1 = Main.v_sbpwd
	Dim buttonWrapper23 As Button = PrefixFTPSave
	If Main.v_salvataggio <> 2 Then
		If Main.v_salvataggio <> 3 Then
			z = False
			buttonWrapper23.Visible = z
			ServerSave.Visible = Main.v_salvataggio <> 2
			UtenteSave.Visible = Main.v_salvataggio <> 2
			PasswordSave.Visible = Main.v_salvataggio <> 2
			ServerSave.Tag = Main.v_serversave
			UtenteSave.Tag = Main.v_utentesave
			PasswordSave.Tag = Main.v_passwordsave
			PrefixFTPSave.Tag = Main.v_prefixftpsave
			ServerSave.Text = "Indirizzo del Server FTP per il Salvataggio:" & ServerSave.Tag
			UtenteSave.Text = "Utente del Server FTP per il Salvataggio:" & UtenteSave.Tag
			If Main.v_salvataggio = 2 Then
				PrefixFTPSave.Text = "Prefisso Aggiuntivo Server FTP per il Salvataggio:" & PrefixFTPSave.Tag
			End If
			PasswordSave.Text = "Password del Server FTP per il Salvataggio:" & PasswordSave.Tag
			PercorsoAzzera.Text = "Percorso salvataggio dati Obsoleti:" & Main.v_percorsoazzera
			PercorsoAzzera.Tag = Main.v_percorsoazzera
			If Main.v_percorsoazzera = "" Then
				PercorsoAzzera.Text = "Salvataggio dati obsoleti NON ABILITATO"
			End If
			CodAttivazione.Text = Main.v_codattivazione
			btnImportaSB.Tag = Main.v_codattivazionesb
			btnImportaBasicSupport.Tag = Main.v_codattivazionebs
			Sub003(Main.v_codattivazionebs)
			Sub026()
			Sub004(Main.v_codattivazionesb)
			Sub032()
			RiepNF.SelectedIndex = Main.v_riepnf
			ErrMail.Checked = Main.v_errmail
			GestioneTabacchi.Checked = Main.v_tabacchi
			GestioneSpiagge.Checked = Main.v_gestionespiagge
			TipoImpTabacchi.Visible = GestioneTabacchi.Checked
			MargineTabacchi.Visible = GestioneTabacchi.Checked
			TermSala.Checked = Main.v_termsala
			TermSala.Tag = Main.v_termsalab
			vInt6 = Main.v_termsalaop
			If TermSala.Checked Then
				If Main.v_termsalab = 1 Then
					TermSala.Text = "Terminale di Sala (con blocco)"
				Else
					If Main.v_termsalab = 2 Then
						TermSala.Text = "Terminale di Sala (con blocco No Password)"
					Else
						Main.vCur5.Position = vInt6
						TermSala.Text = "Terminale di Sala (Op.:" & Main.vCur5.GetString("descrizione") & ")"
					End If
				End If
			End If
			StampaSala.Checked = Main.v_stampasala
			Stampa66Char.Checked = Main.v_stampa66char
			OpObbligatorio.Checked = Main.v_opobbligatorio
			Terminalino.Checked = Main.v_terminalino
			DatiCompletiDC.Checked = Main.v_daticompletidc
			RegCancellazioni.Checked = Main.v_regcancellazioni
			LogMF.Checked = Main.v_logmf
			LogVD.Checked = Main.v_logvd
			LogNF.Checked = Main.v_lognf
			Tema2.Checked = Main.v_tema2
			TipoLayout.Tag = Main.v_temag
			vPnl2.Tag = Main.v_sfondo
			vPnl2.Color = mod1.Sub092(Main.v_sfondo)
			IntestaNF.Checked = Main.v_intestanf
			RiepNFDett.Checked = Main.v_riepnfdett
			ExportCorrispettivi.Checked = Main.v_exportcorrispettivi
			ChangeUscita.Checked = Main.v_changeuscita
			Eula.Checked = Main.v_eula
			StampaComande.Checked = Main.v_stampacomande
			Turni.Checked = Main.v_turni
			AsportoOra.Checked = Main.v_asportoora
			SalvaVD.Visible = True
			SalvaVD.SelectedIndex = Main.v_salvavd
			If Main.v_ipvis <> "" Then
			End If
			If Main.v_salvavd = 2 Then
			End If
			If Main.v_iprpi <> "" Then
			End If
			Dim z6 As Boolean = False
			Emergenza.Visible = z6
			Consolida.Checked = Main.v_consolida
			ConsolidaSc.Checked = Main.v_consolidasc
			VarAutoCP.Checked = Main.v_varautocp
			VisualizzaVariazioni.Checked = Main.v_visualizzavariazioni
			OrdinaInserimentoVariazioni.Checked = Main.v_ordinainserimentovariazioni
			GestCoperti2.Checked = Main.v_gestcoperti2
			ConsolidaLast.Checked = Main.v_consolidalast
			If Not(ConsolidaLast.Checked) Then
				Consolida.Checked = Main.v_consolida
			Else
				Consolida.Checked = False
				Consolida.Visible = False
			End If
			ObbligoOp.Checked = Main.v_obbligoop
			ObbligoOPAvvio.Checked = Main.v_obbligoopavvio
			ObbligoOpMovimento.Checked = Main.v_obbligoopmovimento
			OpExtended.Checked = Main.v_opextended
			RiduciMsg.Checked = Main.v_riducimsg
			NoForceCoperti.Checked = Main.v_noforcecoperti
			RiepOnly.Checked = Main.v_rieponly
			AzzeraAsporto.Checked = Main.v_azzeraasporto
			ChiediNAsporto.Checked = Main.v_chiedinasporto
			Icone2.Checked = Main.v_icone2
			RootDateTime.Checked = Main.v_rootdatetime
			DataOraNoRoot.Checked = Main.v_dataoranoroot
			AttivaNumTavolo.Checked = Main.v_attivanumtavolo
			Sottoconti.Checked = Main.v_sottoconti
			AddDisponibilita.Checked = Main.v_adddisponibilita
			FrazionaConImporto.SelectedIndex = Main.v_frazionaconimporto
			ImpoSuQta.Checked = Main.v_imposuqta
			LeggiCodLotteria.Checked = Main.v_leggicodlotteria
			SoloChiusura.Checked = Main.v_solochiusura
			ConsideraPrzIntero.Checked = Main.v_consideraprzintero
			TastiOmbreggiati.Checked = Main.v_tastiombreggiati
			DisconnettiPrt.Checked = Main.v_disconnettiprt
			VerificaStampanti.Checked = Not(Main.v_verificastampanti) And Not(DisconnettiPrt.Checked)
			IncassoOperatori.Checked = Main.v_incassooperatori
			RicCredito.Checked = Main.v_riccredito
			OraFatt.Checked = Main.v_orafatt
			StampaSposta.Checked = Main.v_stampasposta
			If Main.v_emergenza Then
				If Main.v_ipvis <> "" Then
				End If
				If Main.v_salvavd = 2 Then
				End If
				If Main.v_iprpi <> "" Then
				End If
			End If
			Dim z7 As Boolean = False
			Emergenza.Checked = z7
			Totem.Checked = Main.v_totem
			ControlloTurni.Checked = Main.v_controlloturni
			AvantiTurnoAuto.Checked = Main.v_avantiturnoauto
			Turno1Sempre.Checked = Main.v_turno1sempre
			vInt12 = Main.v_ognoeuro
			vInt10 = Main.v_xpunti
			QuantiPunti.Text = "Punti da erogare: " & vInt10 & " ogni " & vInt12 & " €"
			vInt11 = Main.v_marginetabacchi
			MargineTabacchi.Text = "Margine articoli Tabacchi: " & vInt11 & " %"
			CheckVarianti.Checked = Main.v_checkvarianti
			StampaNomeCli.SelectedIndex = Main.v_stampanomecli
			nCassa.Text = Main.v_numcassa
			If Main.v_numcassa = "" Then
				nCassa.Text = "1"
			End If
			nNegozio.Text = Main.v_nnegozio
			SeekBar1.Value = Main.v_screenbrightness * 100
			mServer.Text = Main.v_mserver
			Dim checkBoxWrapper79 As CheckBox = AttivaTerminale
			If Main.v_attivaterminale Then
				If Main.vBln20 Then
					z2 = True
					checkBoxWrapper79.Checked = z2
					Dim checkBoxWrapper80 As CheckBox = SoloVenduto
					If AttivaTerminale.Checked Then
						If Main.v_solovenduto Then
							z3 = True
							checkBoxWrapper80.Checked = z3
							AzzeraDati.Checked = Main.v_azzeradati
							NoDatiPeriodo.Checked = Main.v_nodatiperiodo
							MantieniNoPaginati.Checked = Main.v_mantieninopaginati
							PercorsoAzzera.Visible = AzzeraDati.Checked
							NoDatiPeriodo.Visible = IIf(AzzeraDati.Checked Or PercorsoAzzera.Tag = "", False, True)
							Dim panelWrapper3 As Panel = PanelRemote
							If Main.v_attivaterminale Then
							End If
							If Not(Main.vBln25) Then
								z4 = False
								panelWrapper3.Visible = z4
								Dim checkBoxWrapper84 As CheckBox = SoloVenduto
								If PanelRemote.Visible Then
									If Not(Main.vBln25) Then
										z5 = True
										checkBoxWrapper84.Visible = z5
										AttivaTerminale.Visible = Not(Main.vBln25)
										PnlHide.Visible = Main.vBln25
										Label5.Visible = Not(Main.vBln20)
										If Main.vBln25 Then
											Label5.Text = "Impostare l'indirizzo IP del server"
											Send.Top = Server.Top
											Send.Left = PerXToCurrent(50)
											Label1.Width = PerXToCurrent(20)
											Server.Left = PerXToCurrent(20)
											Server.Width = PerXToCurrent(30)
										End If
										SendClienti.Text = "Invio record clienti a uniandro:" & vLst2.Get(Main.v_sendclienti)
										SendClienti.Tag = Main.v_sendclienti
										ControlloTurni.Visible = Main.v_turni
										AvantiTurnoAuto.Visible = Main.v_turni
										Turno1Sempre.Visible = Main.v_turni
										mPorta.Text = Main.v_mporta
										mUser.Text = Main.v_muser
										mPwd.Text = Main.v_mpwd
										mUserS.Text = Main.v_musers
										mPwdS.Text = Main.v_mpwds
										mDesMittente.Text = Main.v_mdesmittente
										mD1.Text = Main.v_md1
										mD2.Text = Main.v_md2
										mD3.Text = Main.v_md3
										mD4.Text = Main.v_md4
										mD5.Text = Main.v_md5
										ModificaMovimento.Checked = Main.v_modificamovimento
										ImportazioneAuto.Checked = Main.v_importazioneauto
										CentralizzaDoc.Checked = Main.v_centralizzadoc
										gloryN.SelectedIndex = Main.v_glory
										TallonPremio.Checked = Main.v_tallonpremio
										Listino2aZero.Checked = Main.v_listino2azero
										ControllaPrezziaZero.Checked = Main.v_controllaprezziazero
										FatturaFMT2.Checked = Main.v_fatturafmt2
										AttivaFE.Checked = Main.v_attivafe
										PausaFE.Checked = Main.v_pausafe
										PausaFE.Enabled = AttivaFE.Checked
										AsyncFE.Enabled = AttivaFE.Checked
										CopieFE.Enabled = AttivaFE.Checked
										CopieFE2.Enabled = AttivaFE.Checked
										CentralizzaDoc.Enabled = True
										ConsolidaIncassi.Checked = Main.v_consolidaincassi
										GiacSede.Checked = Main.v_giacsede
										TipoTastiera.SelectedIndex = Main.v_tastiera
										ColonneVarianti.SelectedIndex = Main.v_colonnevarianti
										ArticoliZero.SelectedIndex = Main.v_articolizero
										TipoInterfaccia.SelectedIndex = Main.v_tipointerfaccia
										TipoImpTabacchi.SelectedIndex = Main.v_tipoimptabacchi
										IvaDefault.SelectedIndex = Main.v_ivadefault
										PagamentoPrep.SelectedIndex = Main.v_pagamentoprep
										OrdinamentoSc.SelectedIndex = Main.v_ordinamentosc
										ArrotondaV.SelectedIndex = Main.v_arrotondav
										ArrotondaContantiRT.SelectedIndex = Main.v_arrotondacontantirt
										FontSizeC.SelectedIndex = Main.v_fontsizec
										barra.Text = Main.v_barrareal
										barra2.Text = Main.v_barrareal2
										Utente.Text = Main.v_uid
										Password.Text = Main.v_pwd
										If Main.v_matricola <> "" Then
											If Main.vInt21 = 1 Then
												LblAttiva.Text = "Cod.Attivazione" & CRLF & "(scad. " & DateTime.GetDayOfMonth(Main.vLng1) & "/" & DateTime.GetMonth(Main.vLng1) & "/" & DateTime.GetYear(Main.vLng1) & ")"
											End If
										End If
										PrefissoCliente.Text = "Prefisso per il riconoscimento automatico del cliente=" & Main.v_prefissocliente
										PrefissoTT.Text = "Prefisso per il riconoscimento automatico del tavolo-tessera=" & Main.v_prefissott
										PrefissoCliente.Tag = Main.v_prefissocliente
										PrefissoTT.Tag = Main.v_prefissott
										PrefissoCoupon.Text = "Prefisso per il riconoscimento automatico dei Coupon (valore numerico di 3 cifre)=" & Main.v_prefissocoupon
										PrefissoCoupon.Tag = Main.v_prefissocoupon
										If Main.v_paginapagamenti <> 0 Then
											PaginaPagamenti.Text = "Abilita l'obbligo di selezione pagina documenti prima della chiusura del movimento di vendita"
										Else
											vCur3.Position = Main.v_paginapagamenti - 1
											PaginaPagamenti.Text = "Prima della chiusura movimento è obbligatorio selezionare la " & vCur3.GetString("descrizione")
										End If
										PaginaPagamenti.Tag = Main.v_paginapagamenti
										ObbligoClienteF.Checked = Main.v_obbligoclientef
										If Not(Main.vBln25) Then
											Send.Text = "Pacchetti Inviati:" & Main.vSql2.ExecQuerySingleResult("select valore from progressivi where codice ='SEND'")
											mod1.Sub161(receive, 0)
										Else
											Send.Text = "Pacchetti Inviati:" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='SEND'")
										End If
										receive.Text = "Pacchetti Ricevuti:" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='RECEIVE'")
										If Not(Main.vBln25) Then
											lblFatt.Text = "Fattura Numero :" & Main.vSql2.ExecQuerySingleResult("select valore from progressivi where codice ='F'")
											lblRic.Text = "Ricevuta Numero :" & Main.vSql2.ExecQuerySingleResult("select valore from progressivi where codice ='RIC'")
										Else
											lblFatt.Text = "Fattura Numero :" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='F'")
											lblFatt2.Text = "Fattura fine mese Numero :" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='F2'")
											lblRic.Text = "Ricevuta Numero :" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='RIC'")
										End If
										lblMaxImpo.Text = "Massimo importo Riga :" & NumberFormat2(Main.v_maximpo, 1, 2, 2, False) & " €"
										lblMaxImpo.Tag = Main.v_maximpo
										If Main.v_fondocassaauto <> 0 Then
											FondoCassaAuto.Text = "Importo versamento automatico all'inizio della giornata: Disabilitato"
										Else
											FondoCassaAuto.Text = "Importo versamento automatico all'inizio della giornata: " & NumberFormat2(Main.v_fondocassaauto, 1, 2, 2, False) & " €"
										End If
										FondoCassaAuto.Tag = Main.v_fondocassaauto
										MaxImpTavolo.Text = "Massimo Importo per Alert su tavolo :" & NumberFormat2(Main.v_maximptavolo, 1, 2, 2, False) & " €"
										MaxImpTavolo.Tag = Main.v_maximptavolo
										ValorizzazionePrezzoFrazione.Text = Sub022(Main.v_valorizzazioneprezzofrazione)
										ValorizzazionePrezzoFrazione.Tag = Main.v_valorizzazioneprezzofrazione
										TipoFrazionamentoVariazioni.Text = Sub021(Main.v_tipofrazionamentovariazioni)
										TipoFrazionamentoVariazioni.Tag = Main.v_tipofrazionamentovariazioni
										WebSospendiTavolo.Text = Sub023(Main.v_websospenditavolo)
										WebSospendiTavolo.Tag = Main.v_websospenditavolo
										If Main.v_mintavololento <> 0 Then
											MinTavoloLento.Text = "Inserire i minuti dall'ultimo acquisto che devono trascorrere prima di considerare un tavolo 'lento'"
										Else
											MinTavoloLento.Text = "Minuti dall'ultimo acquisto che devono trascorrere prima di considerare un tavolo 'lento':" & Main.v_mintavololento
										End If
										MinTavoloLento.Tag = Main.v_mintavololento
										CopieFE.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (PA + B2B):" & Main.v_copiefe
										CopieFE.Tag = Main.v_copiefe
										CopieFE2.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (B2C):" & Main.v_copiefe2
										CopieFE2.Tag = Main.v_copiefe2
										If Main.v_asyncfe <> 0 Then
											AsyncFE.Text = "Il programma non attende la stampa dell'esito invio Fattura elettronica "
										Else
											AsyncFE.Text = "Numero di secondi di attesa dell'esito invio Fattura elettronica:" & Main.v_asyncfe
										End If
										AsyncFE.Tag = Main.v_asyncfe
										ListPoco.Text = "Detrazione rispetto al Listino 1 per le variazioni con il modificatore 'POCO': " & Main.v_listpoco & "%"
										ListPoco.Tag = Main.v_listpoco
										ListMolto.Text = "Maggiorazione rispetto al Listino 1 per le variazioni con il modificatore 'MOLTO': " & Main.v_listmolto & "%"
										ListMolto.Tag = Main.v_listmolto
										If Main.v_iniziogiorno <> 0 Then
											InizioGiorno.Text = "Inizio giornata lavorativa dalla mezzanotte"
										Else
											InizioGiorno.Text = "Inizio giornata lavorativa dalle ore " & Main.v_iniziogiorno
										End If
										InizioGiorno.Tag = Main.v_iniziogiorno
										bAltezzaVariazioni.Text = "Altezza riga Variazioni: " & Main.v_altezzavariazioni & " pixel"
										bAltezzaVariazioni.Tag = Main.v_altezzavariazioni
										AsportoAnticipo.Visible = AsportoOra.Checked
										If Main.v_asportoanticipo <> 0 Then
											AsportoAnticipo.Text = "Stampa Asporto Immediatamente"
										Else
											AsportoAnticipo.Text = "Stampa Asporto " & Main.v_asportoanticipo & " minuti prima del ritiro"
										End If
										AsportoAnticipo.Tag = Main.v_asportoanticipo
										If Main.v_minutiss <> 0 Then
											MinutiSS.Text = "Screen Saver Disattivato"
										Else
											MinutiSS.Text = "Screen Saver dopo " & Main.v_minutiss & " minuti di inattività"
										End If
										MinutiSS.Tag = Main.v_minutiss
										NumeroScontriniST.Text = "Numero di scontrini lotteria dopo il limite per attivare la richiesta di invio:" & Main.v_numeroscontrinist
										NumeroScontriniST.Tag = Main.v_numeroscontrinist
										PrenotaGiorni.Text = "Numero di giorni da oggi per data prenotazione predefinita: " & Main.v_prenotagiorni
										PrenotaGiorni.Tag = Main.v_prenotagiorni
										PrenotaGiorniApertura.Tag = Main.v_prenotagiorniapertura
										If Main.v_numerott <> 0 Then
											NumeroTT.Text = "Gestione tavoli-tessere disabilitata"
										Else
											NumeroTT.Text = "Numero tavoli tessere creati: " & Main.v_numerott
										End If
										NumeroTT.Tag = Main.v_numerott
										TallonSempre.Checked = Main.v_tallonsempre
										CassettoSubito.Checked = Main.v_cassettosubito
										SuonoDaCassa.Checked = Main.v_suonodacassa
										If Main.v_notallon <> 0 Then
											NoTallon.Text = "Stampa il tallon dell'asporto su MF"
											NoTallon.Tag = Main.v_notallon
										Else
											If Main.v_notallon = 1 Then
												NoTallon.Text = "Non stampare il tallon dell'asporto"
												NoTallon.Tag = Main.v_notallon
												TallonSempre.Checked = False
												TallonSempre.Visible = False
											Else
												If Main.vSql1.ExecQuerySingleResult("Select count(*) from confstampe where indice=0 and stato = 1 and codice = " & Main.v_notallon - 1) = 0 Then
													NoTallon.Text = "Stampa il tallon dell'asporto su MF"
													NoTallon.Tag = 0
												Else
													NoTallon.Text = "Stampa il tallon su " & Main.vSql1.ExecQuerySingleResult("Select descrizione from confstampe where stato = 1 and codice = " & Main.v_notallon - 1)
													NoTallon.Tag = Main.v_notallon
												End If
											End If
										End If
										If Main.v_stampareport <> 0 Then
											StampaReport.Text = "Stampa i report su MF"
											StampaReport.Tag = 0
										Else
											If Main.vSql1.ExecQuerySingleResult("Select count(*) from confstampe where indice=0 and stato = 1 and codice = " & Main.v_stampareport) = 0 Then
												StampaReport.Text = "Stampa i report su MF"
												StampaReport.Tag = 0
											Else
												StampaReport.Text = "Stampa i report su " & Main.vSql1.ExecQuerySingleResult("Select descrizione from confstampe where stato = 1 and codice = " & Main.v_stampareport)
												StampaReport.Tag = Main.v_stampareport
											End If
										End If
										If Main.v_ipricevute <> "" Then
											IpRicevute.Text = "Inserire l'indirizzo IP per la stampante Ricevute e Fatture (Notch)"
											IpRicevute.Tag = ""
										Else
											IpRicevute.Text = "Indirizzo IP per la stampante Ricevute e Fatture (Notch)= " & Main.v_ipricevute
											IpRicevute.Tag = Main.v_ipricevute
										End If
										If Main.v_ipdistributore <> "" Then
											ipDistributore.Text = "Inserire l'indirizzo IP del terminale sul quale è installato l'infinity Manager"
											ipDistributore.Tag = ""
										Else
											ipDistributore.Text = "Indirizzo IP del terminale sul quale è installato l'infinity Manager= " & Main.v_ipdistributore
											ipDistributore.Tag = Main.v_ipdistributore
										End If
										DesAsporto.Text = "Intestazione per Comanda Asporto:" & Main.v_desasporto
										DesAsporto.Tag = Main.v_desasporto
										DesPreconto.Text = "Intestazione per Stampa Parziale(PRECONTO) e Conto:" & Main.v_despreconto
										DesPreconto.Tag = Main.v_despreconto
										If Main.v_desatesta <> "" Then
											DesATesta.Text = "Non stampare la dicitura 'A testa'"
										Else
											DesATesta.Text = "Personalizzazione dicitura 'A testa' :" & Main.v_desatesta
										End If
										DesATesta.Tag = Main.v_desatesta
										vInt16 = Main.v_ricevutaacli
										vInt18 = Main.v_ricevutaacor
										vInt14 = Main.v_ricevutaapdv
										vInt17 = Main.v_ricevutadacor
										vInt15 = Main.v_ricevutadacli
										vInt13 = Main.v_ricevutadapdv
										vInt19 = Main.v_ricevutaspaziomf
										If Main.v_stampafattura <> 0 Then
											StampaFattura.Text = "Stampa Fattura su MF"
											StampaFattura.Tag = 0
										Else
											If Main.v_stampafattura < 19 Then
												If Main.vSql1.ExecQuerySingleResult("Select count(*) from confstampe where indice =0 and stato = 1 and codice = " & Main.v_stampafattura) = 0 Then
													StampaFattura.Text = "Stampa Fattura su MF"
													StampaFattura.Tag = 0
												Else
													StampaFattura.Text = "Stampa Fattura su " & Main.vSql1.ExecQuerySingleResult("Select descrizione from confstampe where stato = 1 and codice = " & Main.v_stampafattura)
													StampaFattura.Tag = Main.v_stampafattura
												End If
											Else
												If Main.v_stampafattura = 100 Then
													StampaFattura.Text = "Stampa Fattura su Stampante Ricevute e Fatture (Notch)"
													StampaFattura.Tag = 100
												Else
													If Main.v_stampafattura = 200 Then
														StampaFattura.Text = "Stampa Fattura su Stampante A4"
														StampaFattura.Tag = 200
													Else
														If Main.v_stampafattura = 300 Then
															If Main.vBln16 Then
																StampaFattura.Text = "Stampa Fatture (dirette - fine mese) ,Ricevute e Conti su Stampante A4 (ServiceBox)"
																StampaFattura.Tag = 300
																vStr3 = "Stampa Menù e Prenotazioni su"
															End If
														End If
														If Main.v_stampafattura = 300 Then
															StampaFattura.Text = "Stampa Fattura su MF"
															StampaFattura.Tag = 0
														End If
													End If
												End If
											End If
										End If
										If Main.v_stampaconto <> 0 Then
											StampaConto.Text = vStr3 & " MF"
											StampaConto.Tag = 0
										Else
											If Main.vSql1.ExecQuerySingleResult("Select count(*) from confstampe where indice=0 and stato = 1 and codice = " & Main.v_stampaconto) = 0 Then
												StampaConto.Text = vStr3 & " MF"
												StampaConto.Tag = 0
											Else
												StampaConto.Text = vStr3 & " " & Main.vSql1.ExecQuerySingleResult("Select descrizione from confstampe where stato = 1 and codice = " & Main.v_stampaconto)
												StampaConto.Tag = Main.v_stampaconto
											End If
										End If
										Happy.Text = "Gestione Offerta Happy Hour "
										vIntArr1 = Main.v_dalle
										vIntArr2 = Main.v_alle
										vIntArr3 = Main.v_listinoh
										If Main.v_salvaora <> -1 Then
											SalvaOra.Text = "Salvataggio Automatico non impostato"
										Else
											If Main.v_salvaora = -2 Then
												SalvaOra.Text = "Salvataggio Automatico in Chiusura Giornaliera"
											Else
												SalvaOra.Text = "Salvataggio Automatico impostato per le " & Main.v_salvaora
											End If
										End If
										SalvaOra.Tag = Main.v_salvaora
										If Main.v_repartogv <> -1 Then
											RepartoGV.Text = "Reparto per Gratta e Vinci non impostato"
										Else
											vCur2.Position = Main.v_repartogv
											RepartoGV.Text = "Reparto per Gratta e Vinci = " & vCur2.GetString("descrizione")
										End If
										RepartoGV.Tag = Main.v_repartogv
										nSalva.Text = "Numero salvataggi su FTP = " & Main.v_nsalva
										nSalva.Tag = Main.v_nsalva
										If Not(File.Exists(mod1.vStr4, "LogoPrg.jpg")) Then
											ImgLogo.Visible = True
											ImgLogo.Bitmap = LoadBitmap(mod1.vStr4, "LogoPrg.jpg")
											Return
										End If
										Return
									End If
								End If
								z5 = False
								checkBoxWrapper84.Visible = z5
								AttivaTerminale.Visible = Not(Main.vBln25)
								PnlHide.Visible = Main.vBln25
								Label5.Visible = Not(Main.vBln20)
								If Main.vBln25 Then
								End If
								SendClienti.Text = "Invio record clienti a uniandro:" & vLst2.Get(Main.v_sendclienti)
								SendClienti.Tag = Main.v_sendclienti
								ControlloTurni.Visible = Main.v_turni
								AvantiTurnoAuto.Visible = Main.v_turni
								Turno1Sempre.Visible = Main.v_turni
								mPorta.Text = Main.v_mporta
								mUser.Text = Main.v_muser
								mPwd.Text = Main.v_mpwd
								mUserS.Text = Main.v_musers
								mPwdS.Text = Main.v_mpwds
								mDesMittente.Text = Main.v_mdesmittente
								mD1.Text = Main.v_md1
								mD2.Text = Main.v_md2
								mD3.Text = Main.v_md3
								mD4.Text = Main.v_md4
								mD5.Text = Main.v_md5
								ModificaMovimento.Checked = Main.v_modificamovimento
								ImportazioneAuto.Checked = Main.v_importazioneauto
								CentralizzaDoc.Checked = Main.v_centralizzadoc
								gloryN.SelectedIndex = Main.v_glory
								TallonPremio.Checked = Main.v_tallonpremio
								Listino2aZero.Checked = Main.v_listino2azero
								ControllaPrezziaZero.Checked = Main.v_controllaprezziazero
								FatturaFMT2.Checked = Main.v_fatturafmt2
								AttivaFE.Checked = Main.v_attivafe
								PausaFE.Checked = Main.v_pausafe
								PausaFE.Enabled = AttivaFE.Checked
								AsyncFE.Enabled = AttivaFE.Checked
								CopieFE.Enabled = AttivaFE.Checked
								CopieFE2.Enabled = AttivaFE.Checked
								CentralizzaDoc.Enabled = True
								ConsolidaIncassi.Checked = Main.v_consolidaincassi
								GiacSede.Checked = Main.v_giacsede
								TipoTastiera.SelectedIndex = Main.v_tastiera
								ColonneVarianti.SelectedIndex = Main.v_colonnevarianti
								ArticoliZero.SelectedIndex = Main.v_articolizero
								TipoInterfaccia.SelectedIndex = Main.v_tipointerfaccia
								TipoImpTabacchi.SelectedIndex = Main.v_tipoimptabacchi
								IvaDefault.SelectedIndex = Main.v_ivadefault
								PagamentoPrep.SelectedIndex = Main.v_pagamentoprep
								OrdinamentoSc.SelectedIndex = Main.v_ordinamentosc
								ArrotondaV.SelectedIndex = Main.v_arrotondav
								ArrotondaContantiRT.SelectedIndex = Main.v_arrotondacontantirt
								FontSizeC.SelectedIndex = Main.v_fontsizec
								barra.Text = Main.v_barrareal
								barra2.Text = Main.v_barrareal2
								Utente.Text = Main.v_uid
								Password.Text = Main.v_pwd
								If Main.v_matricola <> "" Then
								End If
								PrefissoCliente.Text = "Prefisso per il riconoscimento automatico del cliente=" & Main.v_prefissocliente
								PrefissoTT.Text = "Prefisso per il riconoscimento automatico del tavolo-tessera=" & Main.v_prefissott
								PrefissoCliente.Tag = Main.v_prefissocliente
								PrefissoTT.Tag = Main.v_prefissott
								PrefissoCoupon.Text = "Prefisso per il riconoscimento automatico dei Coupon (valore numerico di 3 cifre)=" & Main.v_prefissocoupon
								PrefissoCoupon.Tag = Main.v_prefissocoupon
								If Main.v_paginapagamenti <> 0 Then
								End If
								PaginaPagamenti.Tag = Main.v_paginapagamenti
								ObbligoClienteF.Checked = Main.v_obbligoclientef
								If Not(Main.vBln25) Then
								End If
								receive.Text = "Pacchetti Ricevuti:" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='RECEIVE'")
								If Not(Main.vBln25) Then
								End If
								lblMaxImpo.Text = "Massimo importo Riga :" & NumberFormat2(Main.v_maximpo, 1, 2, 2, False) & " €"
								lblMaxImpo.Tag = Main.v_maximpo
								If Main.v_fondocassaauto <> 0 Then
								End If
								FondoCassaAuto.Tag = Main.v_fondocassaauto
								MaxImpTavolo.Text = "Massimo Importo per Alert su tavolo :" & NumberFormat2(Main.v_maximptavolo, 1, 2, 2, False) & " €"
								MaxImpTavolo.Tag = Main.v_maximptavolo
								ValorizzazionePrezzoFrazione.Text = Sub022(Main.v_valorizzazioneprezzofrazione)
								ValorizzazionePrezzoFrazione.Tag = Main.v_valorizzazioneprezzofrazione
								TipoFrazionamentoVariazioni.Text = Sub021(Main.v_tipofrazionamentovariazioni)
								TipoFrazionamentoVariazioni.Tag = Main.v_tipofrazionamentovariazioni
								WebSospendiTavolo.Text = Sub023(Main.v_websospenditavolo)
								WebSospendiTavolo.Tag = Main.v_websospenditavolo
								If Main.v_mintavololento <> 0 Then
								End If
								MinTavoloLento.Tag = Main.v_mintavololento
								CopieFE.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (PA + B2B):" & Main.v_copiefe
								CopieFE.Tag = Main.v_copiefe
								CopieFE2.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (B2C):" & Main.v_copiefe2
								CopieFE2.Tag = Main.v_copiefe2
								If Main.v_asyncfe <> 0 Then
								End If
								AsyncFE.Tag = Main.v_asyncfe
								ListPoco.Text = "Detrazione rispetto al Listino 1 per le variazioni con il modificatore 'POCO': " & Main.v_listpoco & "%"
								ListPoco.Tag = Main.v_listpoco
								ListMolto.Text = "Maggiorazione rispetto al Listino 1 per le variazioni con il modificatore 'MOLTO': " & Main.v_listmolto & "%"
								ListMolto.Tag = Main.v_listmolto
								If Main.v_iniziogiorno <> 0 Then
								End If
								InizioGiorno.Tag = Main.v_iniziogiorno
								bAltezzaVariazioni.Text = "Altezza riga Variazioni: " & Main.v_altezzavariazioni & " pixel"
								bAltezzaVariazioni.Tag = Main.v_altezzavariazioni
								AsportoAnticipo.Visible = AsportoOra.Checked
								If Main.v_asportoanticipo <> 0 Then
								End If
								AsportoAnticipo.Tag = Main.v_asportoanticipo
								If Main.v_minutiss <> 0 Then
								End If
								MinutiSS.Tag = Main.v_minutiss
								NumeroScontriniST.Text = "Numero di scontrini lotteria dopo il limite per attivare la richiesta di invio:" & Main.v_numeroscontrinist
								NumeroScontriniST.Tag = Main.v_numeroscontrinist
								PrenotaGiorni.Text = "Numero di giorni da oggi per data prenotazione predefinita: " & Main.v_prenotagiorni
								PrenotaGiorni.Tag = Main.v_prenotagiorni
								PrenotaGiorniApertura.Tag = Main.v_prenotagiorniapertura
								If Main.v_numerott <> 0 Then
								End If
								NumeroTT.Tag = Main.v_numerott
								TallonSempre.Checked = Main.v_tallonsempre
								CassettoSubito.Checked = Main.v_cassettosubito
								SuonoDaCassa.Checked = Main.v_suonodacassa
								If Main.v_notallon <> 0 Then
								End If
								If Main.v_stampareport <> 0 Then
								End If
								If Main.v_ipricevute <> "" Then
								End If
								If Main.v_ipdistributore <> "" Then
								End If
								DesAsporto.Text = "Intestazione per Comanda Asporto:" & Main.v_desasporto
								DesAsporto.Tag = Main.v_desasporto
								DesPreconto.Text = "Intestazione per Stampa Parziale(PRECONTO) e Conto:" & Main.v_despreconto
								DesPreconto.Tag = Main.v_despreconto
								If Main.v_desatesta <> "" Then
								End If
								DesATesta.Tag = Main.v_desatesta
								vInt16 = Main.v_ricevutaacli
								vInt18 = Main.v_ricevutaacor
								vInt14 = Main.v_ricevutaapdv
								vInt17 = Main.v_ricevutadacor
								vInt15 = Main.v_ricevutadacli
								vInt13 = Main.v_ricevutadapdv
								vInt19 = Main.v_ricevutaspaziomf
								If Main.v_stampafattura <> 0 Then
								End If
								If Main.v_stampaconto <> 0 Then
								End If
								Happy.Text = "Gestione Offerta Happy Hour "
								vIntArr1 = Main.v_dalle
								vIntArr2 = Main.v_alle
								vIntArr3 = Main.v_listinoh
								If Main.v_salvaora <> -1 Then
								End If
								SalvaOra.Tag = Main.v_salvaora
								If Main.v_repartogv <> -1 Then
								End If
								RepartoGV.Tag = Main.v_repartogv
								nSalva.Text = "Numero salvataggi su FTP = " & Main.v_nsalva
								nSalva.Tag = Main.v_nsalva
								If Not(File.Exists(mod1.vStr4, "LogoPrg.jpg")) Then
								End If
							End If
							z4 = True
							panelWrapper3.Visible = z4
							If PanelRemote.Visible Then
							End If
							z5 = False
							SoloVenduto.Visible = z5
							AttivaTerminale.Visible = Not(Main.vBln25)
							PnlHide.Visible = Main.vBln25
							Label5.Visible = Not(Main.vBln20)
							If Main.vBln25 Then
							End If
							SendClienti.Text = "Invio record clienti a uniandro:" & vLst2.Get(Main.v_sendclienti)
							SendClienti.Tag = Main.v_sendclienti
							ControlloTurni.Visible = Main.v_turni
							AvantiTurnoAuto.Visible = Main.v_turni
							Turno1Sempre.Visible = Main.v_turni
							mPorta.Text = Main.v_mporta
							mUser.Text = Main.v_muser
							mPwd.Text = Main.v_mpwd
							mUserS.Text = Main.v_musers
							mPwdS.Text = Main.v_mpwds
							mDesMittente.Text = Main.v_mdesmittente
							mD1.Text = Main.v_md1
							mD2.Text = Main.v_md2
							mD3.Text = Main.v_md3
							mD4.Text = Main.v_md4
							mD5.Text = Main.v_md5
							ModificaMovimento.Checked = Main.v_modificamovimento
							ImportazioneAuto.Checked = Main.v_importazioneauto
							CentralizzaDoc.Checked = Main.v_centralizzadoc
							gloryN.SelectedIndex = Main.v_glory
							TallonPremio.Checked = Main.v_tallonpremio
							Listino2aZero.Checked = Main.v_listino2azero
							ControllaPrezziaZero.Checked = Main.v_controllaprezziazero
							FatturaFMT2.Checked = Main.v_fatturafmt2
							AttivaFE.Checked = Main.v_attivafe
							PausaFE.Checked = Main.v_pausafe
							PausaFE.Enabled = AttivaFE.Checked
							AsyncFE.Enabled = AttivaFE.Checked
							CopieFE.Enabled = AttivaFE.Checked
							CopieFE2.Enabled = AttivaFE.Checked
							CentralizzaDoc.Enabled = True
							ConsolidaIncassi.Checked = Main.v_consolidaincassi
							GiacSede.Checked = Main.v_giacsede
							TipoTastiera.SelectedIndex = Main.v_tastiera
							ColonneVarianti.SelectedIndex = Main.v_colonnevarianti
							ArticoliZero.SelectedIndex = Main.v_articolizero
							TipoInterfaccia.SelectedIndex = Main.v_tipointerfaccia
							TipoImpTabacchi.SelectedIndex = Main.v_tipoimptabacchi
							IvaDefault.SelectedIndex = Main.v_ivadefault
							PagamentoPrep.SelectedIndex = Main.v_pagamentoprep
							OrdinamentoSc.SelectedIndex = Main.v_ordinamentosc
							ArrotondaV.SelectedIndex = Main.v_arrotondav
							ArrotondaContantiRT.SelectedIndex = Main.v_arrotondacontantirt
							FontSizeC.SelectedIndex = Main.v_fontsizec
							barra.Text = Main.v_barrareal
							barra2.Text = Main.v_barrareal2
							Utente.Text = Main.v_uid
							Password.Text = Main.v_pwd
							If Main.v_matricola <> "" Then
							End If
							PrefissoCliente.Text = "Prefisso per il riconoscimento automatico del cliente=" & Main.v_prefissocliente
							PrefissoTT.Text = "Prefisso per il riconoscimento automatico del tavolo-tessera=" & Main.v_prefissott
							PrefissoCliente.Tag = Main.v_prefissocliente
							PrefissoTT.Tag = Main.v_prefissott
							PrefissoCoupon.Text = "Prefisso per il riconoscimento automatico dei Coupon (valore numerico di 3 cifre)=" & Main.v_prefissocoupon
							PrefissoCoupon.Tag = Main.v_prefissocoupon
							If Main.v_paginapagamenti <> 0 Then
							End If
							PaginaPagamenti.Tag = Main.v_paginapagamenti
							ObbligoClienteF.Checked = Main.v_obbligoclientef
							If Not(Main.vBln25) Then
							End If
							receive.Text = "Pacchetti Ricevuti:" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='RECEIVE'")
							If Not(Main.vBln25) Then
							End If
							lblMaxImpo.Text = "Massimo importo Riga :" & NumberFormat2(Main.v_maximpo, 1, 2, 2, False) & " €"
							lblMaxImpo.Tag = Main.v_maximpo
							If Main.v_fondocassaauto <> 0 Then
							End If
							FondoCassaAuto.Tag = Main.v_fondocassaauto
							MaxImpTavolo.Text = "Massimo Importo per Alert su tavolo :" & NumberFormat2(Main.v_maximptavolo, 1, 2, 2, False) & " €"
							MaxImpTavolo.Tag = Main.v_maximptavolo
							ValorizzazionePrezzoFrazione.Text = Sub022(Main.v_valorizzazioneprezzofrazione)
							ValorizzazionePrezzoFrazione.Tag = Main.v_valorizzazioneprezzofrazione
							TipoFrazionamentoVariazioni.Text = Sub021(Main.v_tipofrazionamentovariazioni)
							TipoFrazionamentoVariazioni.Tag = Main.v_tipofrazionamentovariazioni
							WebSospendiTavolo.Text = Sub023(Main.v_websospenditavolo)
							WebSospendiTavolo.Tag = Main.v_websospenditavolo
							If Main.v_mintavololento <> 0 Then
							End If
							MinTavoloLento.Tag = Main.v_mintavololento
							CopieFE.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (PA + B2B):" & Main.v_copiefe
							CopieFE.Tag = Main.v_copiefe
							CopieFE2.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (B2C):" & Main.v_copiefe2
							CopieFE2.Tag = Main.v_copiefe2
							If Main.v_asyncfe <> 0 Then
							End If
							AsyncFE.Tag = Main.v_asyncfe
							ListPoco.Text = "Detrazione rispetto al Listino 1 per le variazioni con il modificatore 'POCO': " & Main.v_listpoco & "%"
							ListPoco.Tag = Main.v_listpoco
							ListMolto.Text = "Maggiorazione rispetto al Listino 1 per le variazioni con il modificatore 'MOLTO': " & Main.v_listmolto & "%"
							ListMolto.Tag = Main.v_listmolto
							If Main.v_iniziogiorno <> 0 Then
							End If
							InizioGiorno.Tag = Main.v_iniziogiorno
							bAltezzaVariazioni.Text = "Altezza riga Variazioni: " & Main.v_altezzavariazioni & " pixel"
							bAltezzaVariazioni.Tag = Main.v_altezzavariazioni
							AsportoAnticipo.Visible = AsportoOra.Checked
							If Main.v_asportoanticipo <> 0 Then
							End If
							AsportoAnticipo.Tag = Main.v_asportoanticipo
							If Main.v_minutiss <> 0 Then
							End If
							MinutiSS.Tag = Main.v_minutiss
							NumeroScontriniST.Text = "Numero di scontrini lotteria dopo il limite per attivare la richiesta di invio:" & Main.v_numeroscontrinist
							NumeroScontriniST.Tag = Main.v_numeroscontrinist
							PrenotaGiorni.Text = "Numero di giorni da oggi per data prenotazione predefinita: " & Main.v_prenotagiorni
							PrenotaGiorni.Tag = Main.v_prenotagiorni
							PrenotaGiorniApertura.Tag = Main.v_prenotagiorniapertura
							If Main.v_numerott <> 0 Then
							End If
							NumeroTT.Tag = Main.v_numerott
							TallonSempre.Checked = Main.v_tallonsempre
							CassettoSubito.Checked = Main.v_cassettosubito
							SuonoDaCassa.Checked = Main.v_suonodacassa
							If Main.v_notallon <> 0 Then
							End If
							If Main.v_stampareport <> 0 Then
							End If
							If Main.v_ipricevute <> "" Then
							End If
							If Main.v_ipdistributore <> "" Then
							End If
							DesAsporto.Text = "Intestazione per Comanda Asporto:" & Main.v_desasporto
							DesAsporto.Tag = Main.v_desasporto
							DesPreconto.Text = "Intestazione per Stampa Parziale(PRECONTO) e Conto:" & Main.v_despreconto
							DesPreconto.Tag = Main.v_despreconto
							If Main.v_desatesta <> "" Then
							End If
							DesATesta.Tag = Main.v_desatesta
							vInt16 = Main.v_ricevutaacli
							vInt18 = Main.v_ricevutaacor
							vInt14 = Main.v_ricevutaapdv
							vInt17 = Main.v_ricevutadacor
							vInt15 = Main.v_ricevutadacli
							vInt13 = Main.v_ricevutadapdv
							vInt19 = Main.v_ricevutaspaziomf
							If Main.v_stampafattura <> 0 Then
							End If
							If Main.v_stampaconto <> 0 Then
							End If
							Happy.Text = "Gestione Offerta Happy Hour "
							vIntArr1 = Main.v_dalle
							vIntArr2 = Main.v_alle
							vIntArr3 = Main.v_listinoh
							If Main.v_salvaora <> -1 Then
							End If
							SalvaOra.Tag = Main.v_salvaora
							If Main.v_repartogv <> -1 Then
							End If
							RepartoGV.Tag = Main.v_repartogv
							nSalva.Text = "Numero salvataggi su FTP = " & Main.v_nsalva
							nSalva.Tag = Main.v_nsalva
							If Not(File.Exists(mod1.vStr4, "LogoPrg.jpg")) Then
							End If
						End If
					End If
					z3 = False
					checkBoxWrapper80.Checked = z3
					AzzeraDati.Checked = Main.v_azzeradati
					NoDatiPeriodo.Checked = Main.v_nodatiperiodo
					MantieniNoPaginati.Checked = Main.v_mantieninopaginati
					PercorsoAzzera.Visible = AzzeraDati.Checked
					NoDatiPeriodo.Visible = IIf(AzzeraDati.Checked Or PercorsoAzzera.Tag = "", False, True)
					If Main.v_attivaterminale Then
					End If
					If Not(Main.vBln25) Then
					End If
					z4 = True
					PanelRemote.Visible = z4
					If PanelRemote.Visible Then
					End If
					z5 = False
					SoloVenduto.Visible = z5
					AttivaTerminale.Visible = Not(Main.vBln25)
					PnlHide.Visible = Main.vBln25
					Label5.Visible = Not(Main.vBln20)
					If Main.vBln25 Then
					End If
					SendClienti.Text = "Invio record clienti a uniandro:" & vLst2.Get(Main.v_sendclienti)
					SendClienti.Tag = Main.v_sendclienti
					ControlloTurni.Visible = Main.v_turni
					AvantiTurnoAuto.Visible = Main.v_turni
					Turno1Sempre.Visible = Main.v_turni
					mPorta.Text = Main.v_mporta
					mUser.Text = Main.v_muser
					mPwd.Text = Main.v_mpwd
					mUserS.Text = Main.v_musers
					mPwdS.Text = Main.v_mpwds
					mDesMittente.Text = Main.v_mdesmittente
					mD1.Text = Main.v_md1
					mD2.Text = Main.v_md2
					mD3.Text = Main.v_md3
					mD4.Text = Main.v_md4
					mD5.Text = Main.v_md5
					ModificaMovimento.Checked = Main.v_modificamovimento
					ImportazioneAuto.Checked = Main.v_importazioneauto
					CentralizzaDoc.Checked = Main.v_centralizzadoc
					gloryN.SelectedIndex = Main.v_glory
					TallonPremio.Checked = Main.v_tallonpremio
					Listino2aZero.Checked = Main.v_listino2azero
					ControllaPrezziaZero.Checked = Main.v_controllaprezziazero
					FatturaFMT2.Checked = Main.v_fatturafmt2
					AttivaFE.Checked = Main.v_attivafe
					PausaFE.Checked = Main.v_pausafe
					PausaFE.Enabled = AttivaFE.Checked
					AsyncFE.Enabled = AttivaFE.Checked
					CopieFE.Enabled = AttivaFE.Checked
					CopieFE2.Enabled = AttivaFE.Checked
					CentralizzaDoc.Enabled = True
					ConsolidaIncassi.Checked = Main.v_consolidaincassi
					GiacSede.Checked = Main.v_giacsede
					TipoTastiera.SelectedIndex = Main.v_tastiera
					ColonneVarianti.SelectedIndex = Main.v_colonnevarianti
					ArticoliZero.SelectedIndex = Main.v_articolizero
					TipoInterfaccia.SelectedIndex = Main.v_tipointerfaccia
					TipoImpTabacchi.SelectedIndex = Main.v_tipoimptabacchi
					IvaDefault.SelectedIndex = Main.v_ivadefault
					PagamentoPrep.SelectedIndex = Main.v_pagamentoprep
					OrdinamentoSc.SelectedIndex = Main.v_ordinamentosc
					ArrotondaV.SelectedIndex = Main.v_arrotondav
					ArrotondaContantiRT.SelectedIndex = Main.v_arrotondacontantirt
					FontSizeC.SelectedIndex = Main.v_fontsizec
					barra.Text = Main.v_barrareal
					barra2.Text = Main.v_barrareal2
					Utente.Text = Main.v_uid
					Password.Text = Main.v_pwd
					If Main.v_matricola <> "" Then
					End If
					PrefissoCliente.Text = "Prefisso per il riconoscimento automatico del cliente=" & Main.v_prefissocliente
					PrefissoTT.Text = "Prefisso per il riconoscimento automatico del tavolo-tessera=" & Main.v_prefissott
					PrefissoCliente.Tag = Main.v_prefissocliente
					PrefissoTT.Tag = Main.v_prefissott
					PrefissoCoupon.Text = "Prefisso per il riconoscimento automatico dei Coupon (valore numerico di 3 cifre)=" & Main.v_prefissocoupon
					PrefissoCoupon.Tag = Main.v_prefissocoupon
					If Main.v_paginapagamenti <> 0 Then
					End If
					PaginaPagamenti.Tag = Main.v_paginapagamenti
					ObbligoClienteF.Checked = Main.v_obbligoclientef
					If Not(Main.vBln25) Then
					End If
					receive.Text = "Pacchetti Ricevuti:" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='RECEIVE'")
					If Not(Main.vBln25) Then
					End If
					lblMaxImpo.Text = "Massimo importo Riga :" & NumberFormat2(Main.v_maximpo, 1, 2, 2, False) & " €"
					lblMaxImpo.Tag = Main.v_maximpo
					If Main.v_fondocassaauto <> 0 Then
					End If
					FondoCassaAuto.Tag = Main.v_fondocassaauto
					MaxImpTavolo.Text = "Massimo Importo per Alert su tavolo :" & NumberFormat2(Main.v_maximptavolo, 1, 2, 2, False) & " €"
					MaxImpTavolo.Tag = Main.v_maximptavolo
					ValorizzazionePrezzoFrazione.Text = Sub022(Main.v_valorizzazioneprezzofrazione)
					ValorizzazionePrezzoFrazione.Tag = Main.v_valorizzazioneprezzofrazione
					TipoFrazionamentoVariazioni.Text = Sub021(Main.v_tipofrazionamentovariazioni)
					TipoFrazionamentoVariazioni.Tag = Main.v_tipofrazionamentovariazioni
					WebSospendiTavolo.Text = Sub023(Main.v_websospenditavolo)
					WebSospendiTavolo.Tag = Main.v_websospenditavolo
					If Main.v_mintavololento <> 0 Then
					End If
					MinTavoloLento.Tag = Main.v_mintavololento
					CopieFE.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (PA + B2B):" & Main.v_copiefe
					CopieFE.Tag = Main.v_copiefe
					CopieFE2.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (B2C):" & Main.v_copiefe2
					CopieFE2.Tag = Main.v_copiefe2
					If Main.v_asyncfe <> 0 Then
					End If
					AsyncFE.Tag = Main.v_asyncfe
					ListPoco.Text = "Detrazione rispetto al Listino 1 per le variazioni con il modificatore 'POCO': " & Main.v_listpoco & "%"
					ListPoco.Tag = Main.v_listpoco
					ListMolto.Text = "Maggiorazione rispetto al Listino 1 per le variazioni con il modificatore 'MOLTO': " & Main.v_listmolto & "%"
					ListMolto.Tag = Main.v_listmolto
					If Main.v_iniziogiorno <> 0 Then
					End If
					InizioGiorno.Tag = Main.v_iniziogiorno
					bAltezzaVariazioni.Text = "Altezza riga Variazioni: " & Main.v_altezzavariazioni & " pixel"
					bAltezzaVariazioni.Tag = Main.v_altezzavariazioni
					AsportoAnticipo.Visible = AsportoOra.Checked
					If Main.v_asportoanticipo <> 0 Then
					End If
					AsportoAnticipo.Tag = Main.v_asportoanticipo
					If Main.v_minutiss <> 0 Then
					End If
					MinutiSS.Tag = Main.v_minutiss
					NumeroScontriniST.Text = "Numero di scontrini lotteria dopo il limite per attivare la richiesta di invio:" & Main.v_numeroscontrinist
					NumeroScontriniST.Tag = Main.v_numeroscontrinist
					PrenotaGiorni.Text = "Numero di giorni da oggi per data prenotazione predefinita: " & Main.v_prenotagiorni
					PrenotaGiorni.Tag = Main.v_prenotagiorni
					PrenotaGiorniApertura.Tag = Main.v_prenotagiorniapertura
					If Main.v_numerott <> 0 Then
					End If
					NumeroTT.Tag = Main.v_numerott
					TallonSempre.Checked = Main.v_tallonsempre
					CassettoSubito.Checked = Main.v_cassettosubito
					SuonoDaCassa.Checked = Main.v_suonodacassa
					If Main.v_notallon <> 0 Then
					End If
					If Main.v_stampareport <> 0 Then
					End If
					If Main.v_ipricevute <> "" Then
					End If
					If Main.v_ipdistributore <> "" Then
					End If
					DesAsporto.Text = "Intestazione per Comanda Asporto:" & Main.v_desasporto
					DesAsporto.Tag = Main.v_desasporto
					DesPreconto.Text = "Intestazione per Stampa Parziale(PRECONTO) e Conto:" & Main.v_despreconto
					DesPreconto.Tag = Main.v_despreconto
					If Main.v_desatesta <> "" Then
					End If
					DesATesta.Tag = Main.v_desatesta
					vInt16 = Main.v_ricevutaacli
					vInt18 = Main.v_ricevutaacor
					vInt14 = Main.v_ricevutaapdv
					vInt17 = Main.v_ricevutadacor
					vInt15 = Main.v_ricevutadacli
					vInt13 = Main.v_ricevutadapdv
					vInt19 = Main.v_ricevutaspaziomf
					If Main.v_stampafattura <> 0 Then
					End If
					If Main.v_stampaconto <> 0 Then
					End If
					Happy.Text = "Gestione Offerta Happy Hour "
					vIntArr1 = Main.v_dalle
					vIntArr2 = Main.v_alle
					vIntArr3 = Main.v_listinoh
					If Main.v_salvaora <> -1 Then
					End If
					SalvaOra.Tag = Main.v_salvaora
					If Main.v_repartogv <> -1 Then
					End If
					RepartoGV.Tag = Main.v_repartogv
					nSalva.Text = "Numero salvataggi su FTP = " & Main.v_nsalva
					nSalva.Tag = Main.v_nsalva
					If Not(File.Exists(mod1.vStr4, "LogoPrg.jpg")) Then
					End If
				End If
			End If
			z2 = False
			checkBoxWrapper79.Checked = z2
			If AttivaTerminale.Checked Then
			End If
			z3 = False
			SoloVenduto.Checked = z3
			AzzeraDati.Checked = Main.v_azzeradati
			NoDatiPeriodo.Checked = Main.v_nodatiperiodo
			MantieniNoPaginati.Checked = Main.v_mantieninopaginati
			PercorsoAzzera.Visible = AzzeraDati.Checked
			NoDatiPeriodo.Visible = IIf(AzzeraDati.Checked Or PercorsoAzzera.Tag = "", False, True)
			If Main.v_attivaterminale Then
			End If
			If Not(Main.vBln25) Then
			End If
			z4 = True
			PanelRemote.Visible = z4
			If PanelRemote.Visible Then
			End If
			z5 = False
			SoloVenduto.Visible = z5
			AttivaTerminale.Visible = Not(Main.vBln25)
			PnlHide.Visible = Main.vBln25
			Label5.Visible = Not(Main.vBln20)
			If Main.vBln25 Then
			End If
			SendClienti.Text = "Invio record clienti a uniandro:" & vLst2.Get(Main.v_sendclienti)
			SendClienti.Tag = Main.v_sendclienti
			ControlloTurni.Visible = Main.v_turni
			AvantiTurnoAuto.Visible = Main.v_turni
			Turno1Sempre.Visible = Main.v_turni
			mPorta.Text = Main.v_mporta
			mUser.Text = Main.v_muser
			mPwd.Text = Main.v_mpwd
			mUserS.Text = Main.v_musers
			mPwdS.Text = Main.v_mpwds
			mDesMittente.Text = Main.v_mdesmittente
			mD1.Text = Main.v_md1
			mD2.Text = Main.v_md2
			mD3.Text = Main.v_md3
			mD4.Text = Main.v_md4
			mD5.Text = Main.v_md5
			ModificaMovimento.Checked = Main.v_modificamovimento
			ImportazioneAuto.Checked = Main.v_importazioneauto
			CentralizzaDoc.Checked = Main.v_centralizzadoc
			gloryN.SelectedIndex = Main.v_glory
			TallonPremio.Checked = Main.v_tallonpremio
			Listino2aZero.Checked = Main.v_listino2azero
			ControllaPrezziaZero.Checked = Main.v_controllaprezziazero
			FatturaFMT2.Checked = Main.v_fatturafmt2
			AttivaFE.Checked = Main.v_attivafe
			PausaFE.Checked = Main.v_pausafe
			PausaFE.Enabled = AttivaFE.Checked
			AsyncFE.Enabled = AttivaFE.Checked
			CopieFE.Enabled = AttivaFE.Checked
			CopieFE2.Enabled = AttivaFE.Checked
			CentralizzaDoc.Enabled = True
			ConsolidaIncassi.Checked = Main.v_consolidaincassi
			GiacSede.Checked = Main.v_giacsede
			TipoTastiera.SelectedIndex = Main.v_tastiera
			ColonneVarianti.SelectedIndex = Main.v_colonnevarianti
			ArticoliZero.SelectedIndex = Main.v_articolizero
			TipoInterfaccia.SelectedIndex = Main.v_tipointerfaccia
			TipoImpTabacchi.SelectedIndex = Main.v_tipoimptabacchi
			IvaDefault.SelectedIndex = Main.v_ivadefault
			PagamentoPrep.SelectedIndex = Main.v_pagamentoprep
			OrdinamentoSc.SelectedIndex = Main.v_ordinamentosc
			ArrotondaV.SelectedIndex = Main.v_arrotondav
			ArrotondaContantiRT.SelectedIndex = Main.v_arrotondacontantirt
			FontSizeC.SelectedIndex = Main.v_fontsizec
			barra.Text = Main.v_barrareal
			barra2.Text = Main.v_barrareal2
			Utente.Text = Main.v_uid
			Password.Text = Main.v_pwd
			If Main.v_matricola <> "" Then
			End If
			PrefissoCliente.Text = "Prefisso per il riconoscimento automatico del cliente=" & Main.v_prefissocliente
			PrefissoTT.Text = "Prefisso per il riconoscimento automatico del tavolo-tessera=" & Main.v_prefissott
			PrefissoCliente.Tag = Main.v_prefissocliente
			PrefissoTT.Tag = Main.v_prefissott
			PrefissoCoupon.Text = "Prefisso per il riconoscimento automatico dei Coupon (valore numerico di 3 cifre)=" & Main.v_prefissocoupon
			PrefissoCoupon.Tag = Main.v_prefissocoupon
			If Main.v_paginapagamenti <> 0 Then
			End If
			PaginaPagamenti.Tag = Main.v_paginapagamenti
			ObbligoClienteF.Checked = Main.v_obbligoclientef
			If Not(Main.vBln25) Then
			End If
			receive.Text = "Pacchetti Ricevuti:" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='RECEIVE'")
			If Not(Main.vBln25) Then
			End If
			lblMaxImpo.Text = "Massimo importo Riga :" & NumberFormat2(Main.v_maximpo, 1, 2, 2, False) & " €"
			lblMaxImpo.Tag = Main.v_maximpo
			If Main.v_fondocassaauto <> 0 Then
			End If
			FondoCassaAuto.Tag = Main.v_fondocassaauto
			MaxImpTavolo.Text = "Massimo Importo per Alert su tavolo :" & NumberFormat2(Main.v_maximptavolo, 1, 2, 2, False) & " €"
			MaxImpTavolo.Tag = Main.v_maximptavolo
			ValorizzazionePrezzoFrazione.Text = Sub022(Main.v_valorizzazioneprezzofrazione)
			ValorizzazionePrezzoFrazione.Tag = Main.v_valorizzazioneprezzofrazione
			TipoFrazionamentoVariazioni.Text = Sub021(Main.v_tipofrazionamentovariazioni)
			TipoFrazionamentoVariazioni.Tag = Main.v_tipofrazionamentovariazioni
			WebSospendiTavolo.Text = Sub023(Main.v_websospenditavolo)
			WebSospendiTavolo.Tag = Main.v_websospenditavolo
			If Main.v_mintavololento <> 0 Then
			End If
			MinTavoloLento.Tag = Main.v_mintavololento
			CopieFE.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (PA + B2B):" & Main.v_copiefe
			CopieFE.Tag = Main.v_copiefe
			CopieFE2.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (B2C):" & Main.v_copiefe2
			CopieFE2.Tag = Main.v_copiefe2
			If Main.v_asyncfe <> 0 Then
			End If
			AsyncFE.Tag = Main.v_asyncfe
			ListPoco.Text = "Detrazione rispetto al Listino 1 per le variazioni con il modificatore 'POCO': " & Main.v_listpoco & "%"
			ListPoco.Tag = Main.v_listpoco
			ListMolto.Text = "Maggiorazione rispetto al Listino 1 per le variazioni con il modificatore 'MOLTO': " & Main.v_listmolto & "%"
			ListMolto.Tag = Main.v_listmolto
			If Main.v_iniziogiorno <> 0 Then
			End If
			InizioGiorno.Tag = Main.v_iniziogiorno
			bAltezzaVariazioni.Text = "Altezza riga Variazioni: " & Main.v_altezzavariazioni & " pixel"
			bAltezzaVariazioni.Tag = Main.v_altezzavariazioni
			AsportoAnticipo.Visible = AsportoOra.Checked
			If Main.v_asportoanticipo <> 0 Then
			End If
			AsportoAnticipo.Tag = Main.v_asportoanticipo
			If Main.v_minutiss <> 0 Then
			End If
			MinutiSS.Tag = Main.v_minutiss
			NumeroScontriniST.Text = "Numero di scontrini lotteria dopo il limite per attivare la richiesta di invio:" & Main.v_numeroscontrinist
			NumeroScontriniST.Tag = Main.v_numeroscontrinist
			PrenotaGiorni.Text = "Numero di giorni da oggi per data prenotazione predefinita: " & Main.v_prenotagiorni
			PrenotaGiorni.Tag = Main.v_prenotagiorni
			PrenotaGiorniApertura.Tag = Main.v_prenotagiorniapertura
			If Main.v_numerott <> 0 Then
			End If
			NumeroTT.Tag = Main.v_numerott
			TallonSempre.Checked = Main.v_tallonsempre
			CassettoSubito.Checked = Main.v_cassettosubito
			SuonoDaCassa.Checked = Main.v_suonodacassa
			If Main.v_notallon <> 0 Then
			End If
			If Main.v_stampareport <> 0 Then
			End If
			If Main.v_ipricevute <> "" Then
			End If
			If Main.v_ipdistributore <> "" Then
			End If
			DesAsporto.Text = "Intestazione per Comanda Asporto:" & Main.v_desasporto
			DesAsporto.Tag = Main.v_desasporto
			DesPreconto.Text = "Intestazione per Stampa Parziale(PRECONTO) e Conto:" & Main.v_despreconto
			DesPreconto.Tag = Main.v_despreconto
			If Main.v_desatesta <> "" Then
			End If
			DesATesta.Tag = Main.v_desatesta
			vInt16 = Main.v_ricevutaacli
			vInt18 = Main.v_ricevutaacor
			vInt14 = Main.v_ricevutaapdv
			vInt17 = Main.v_ricevutadacor
			vInt15 = Main.v_ricevutadacli
			vInt13 = Main.v_ricevutadapdv
			vInt19 = Main.v_ricevutaspaziomf
			If Main.v_stampafattura <> 0 Then
			End If
			If Main.v_stampaconto <> 0 Then
			End If
			Happy.Text = "Gestione Offerta Happy Hour "
			vIntArr1 = Main.v_dalle
			vIntArr2 = Main.v_alle
			vIntArr3 = Main.v_listinoh
			If Main.v_salvaora <> -1 Then
			End If
			SalvaOra.Tag = Main.v_salvaora
			If Main.v_repartogv <> -1 Then
			End If
			RepartoGV.Tag = Main.v_repartogv
			nSalva.Text = "Numero salvataggi su FTP = " & Main.v_nsalva
			nSalva.Tag = Main.v_nsalva
			If Not(File.Exists(mod1.vStr4, "LogoPrg.jpg")) Then
			End If
		End If
	End If
	z = True
	buttonWrapper23.Visible = z
	ServerSave.Visible = Main.v_salvataggio <> 2
	UtenteSave.Visible = Main.v_salvataggio <> 2
	PasswordSave.Visible = Main.v_salvataggio <> 2
	ServerSave.Tag = Main.v_serversave
	UtenteSave.Tag = Main.v_utentesave
	PasswordSave.Tag = Main.v_passwordsave
	PrefixFTPSave.Tag = Main.v_prefixftpsave
	ServerSave.Text = "Indirizzo del Server FTP per il Salvataggio:" & ServerSave.Tag
	UtenteSave.Text = "Utente del Server FTP per il Salvataggio:" & UtenteSave.Tag
	If Main.v_salvataggio = 2 Then
	End If
	PasswordSave.Text = "Password del Server FTP per il Salvataggio:" & PasswordSave.Tag
	PercorsoAzzera.Text = "Percorso salvataggio dati Obsoleti:" & Main.v_percorsoazzera
	PercorsoAzzera.Tag = Main.v_percorsoazzera
	If Main.v_percorsoazzera = "" Then
	End If
	CodAttivazione.Text = Main.v_codattivazione
	btnImportaSB.Tag = Main.v_codattivazionesb
	btnImportaBasicSupport.Tag = Main.v_codattivazionebs
	Sub003(Main.v_codattivazionebs)
	Sub026()
	Sub004(Main.v_codattivazionesb)
	Sub032()
	RiepNF.SelectedIndex = Main.v_riepnf
	ErrMail.Checked = Main.v_errmail
	GestioneTabacchi.Checked = Main.v_tabacchi
	GestioneSpiagge.Checked = Main.v_gestionespiagge
	TipoImpTabacchi.Visible = GestioneTabacchi.Checked
	MargineTabacchi.Visible = GestioneTabacchi.Checked
	TermSala.Checked = Main.v_termsala
	TermSala.Tag = Main.v_termsalab
	vInt6 = Main.v_termsalaop
	If TermSala.Checked Then
	End If
	StampaSala.Checked = Main.v_stampasala
	Stampa66Char.Checked = Main.v_stampa66char
	OpObbligatorio.Checked = Main.v_opobbligatorio
	Terminalino.Checked = Main.v_terminalino
	DatiCompletiDC.Checked = Main.v_daticompletidc
	RegCancellazioni.Checked = Main.v_regcancellazioni
	LogMF.Checked = Main.v_logmf
	LogVD.Checked = Main.v_logvd
	LogNF.Checked = Main.v_lognf
	Tema2.Checked = Main.v_tema2
	TipoLayout.Tag = Main.v_temag
	vPnl2.Tag = Main.v_sfondo
	vPnl2.Color = mod1.Sub092(Main.v_sfondo)
	IntestaNF.Checked = Main.v_intestanf
	RiepNFDett.Checked = Main.v_riepnfdett
	ExportCorrispettivi.Checked = Main.v_exportcorrispettivi
	ChangeUscita.Checked = Main.v_changeuscita
	Eula.Checked = Main.v_eula
	StampaComande.Checked = Main.v_stampacomande
	Turni.Checked = Main.v_turni
	AsportoOra.Checked = Main.v_asportoora
	SalvaVD.Visible = True
	SalvaVD.SelectedIndex = Main.v_salvavd
	If Main.v_ipvis <> "" Then
	End If
	If Main.v_salvavd = 2 Then
	End If
	If Main.v_iprpi <> "" Then
	End If
	Dim z62 As Boolean = False
	Emergenza.Visible = z62
	Consolida.Checked = Main.v_consolida
	ConsolidaSc.Checked = Main.v_consolidasc
	VarAutoCP.Checked = Main.v_varautocp
	VisualizzaVariazioni.Checked = Main.v_visualizzavariazioni
	OrdinaInserimentoVariazioni.Checked = Main.v_ordinainserimentovariazioni
	GestCoperti2.Checked = Main.v_gestcoperti2
	ConsolidaLast.Checked = Main.v_consolidalast
	If Not(ConsolidaLast.Checked) Then
	End If
	ObbligoOp.Checked = Main.v_obbligoop
	ObbligoOPAvvio.Checked = Main.v_obbligoopavvio
	ObbligoOpMovimento.Checked = Main.v_obbligoopmovimento
	OpExtended.Checked = Main.v_opextended
	RiduciMsg.Checked = Main.v_riducimsg
	NoForceCoperti.Checked = Main.v_noforcecoperti
	RiepOnly.Checked = Main.v_rieponly
	AzzeraAsporto.Checked = Main.v_azzeraasporto
	ChiediNAsporto.Checked = Main.v_chiedinasporto
	Icone2.Checked = Main.v_icone2
	RootDateTime.Checked = Main.v_rootdatetime
	DataOraNoRoot.Checked = Main.v_dataoranoroot
	AttivaNumTavolo.Checked = Main.v_attivanumtavolo
	Sottoconti.Checked = Main.v_sottoconti
	AddDisponibilita.Checked = Main.v_adddisponibilita
	FrazionaConImporto.SelectedIndex = Main.v_frazionaconimporto
	ImpoSuQta.Checked = Main.v_imposuqta
	LeggiCodLotteria.Checked = Main.v_leggicodlotteria
	SoloChiusura.Checked = Main.v_solochiusura
	ConsideraPrzIntero.Checked = Main.v_consideraprzintero
	TastiOmbreggiati.Checked = Main.v_tastiombreggiati
	DisconnettiPrt.Checked = Main.v_disconnettiprt
	VerificaStampanti.Checked = Not(Main.v_verificastampanti) And Not(DisconnettiPrt.Checked)
	IncassoOperatori.Checked = Main.v_incassooperatori
	RicCredito.Checked = Main.v_riccredito
	OraFatt.Checked = Main.v_orafatt
	StampaSposta.Checked = Main.v_stampasposta
	If Main.v_emergenza Then
	End If
	Dim z72 As Boolean = False
	Emergenza.Checked = z72
	Totem.Checked = Main.v_totem
	ControlloTurni.Checked = Main.v_controlloturni
	AvantiTurnoAuto.Checked = Main.v_avantiturnoauto
	Turno1Sempre.Checked = Main.v_turno1sempre
	vInt12 = Main.v_ognoeuro
	vInt10 = Main.v_xpunti
	QuantiPunti.Text = "Punti da erogare: " & vInt10 & " ogni " & vInt12 & " €"
	vInt11 = Main.v_marginetabacchi
	MargineTabacchi.Text = "Margine articoli Tabacchi: " & vInt11 & " %"
	CheckVarianti.Checked = Main.v_checkvarianti
	StampaNomeCli.SelectedIndex = Main.v_stampanomecli
	nCassa.Text = Main.v_numcassa
	If Main.v_numcassa = "" Then
	End If
	nNegozio.Text = Main.v_nnegozio
	SeekBar1.Value = Main.v_screenbrightness * 100
	mServer.Text = Main.v_mserver
	If Main.v_attivaterminale Then
	End If
	z2 = False
	AttivaTerminale.Checked = z2
	If AttivaTerminale.Checked Then
	End If
	z3 = False
	SoloVenduto.Checked = z3
	AzzeraDati.Checked = Main.v_azzeradati
	NoDatiPeriodo.Checked = Main.v_nodatiperiodo
	MantieniNoPaginati.Checked = Main.v_mantieninopaginati
	PercorsoAzzera.Visible = AzzeraDati.Checked
	NoDatiPeriodo.Visible = IIf(AzzeraDati.Checked Or PercorsoAzzera.Tag = "", False, True)
	If Main.v_attivaterminale Then
	End If
	If Not(Main.vBln25) Then
	End If
	z4 = True
	PanelRemote.Visible = z4
	If PanelRemote.Visible Then
	End If
	z5 = False
	SoloVenduto.Visible = z5
	AttivaTerminale.Visible = Not(Main.vBln25)
	PnlHide.Visible = Main.vBln25
	Label5.Visible = Not(Main.vBln20)
	If Main.vBln25 Then
	End If
	SendClienti.Text = "Invio record clienti a uniandro:" & vLst2.Get(Main.v_sendclienti)
	SendClienti.Tag = Main.v_sendclienti
	ControlloTurni.Visible = Main.v_turni
	AvantiTurnoAuto.Visible = Main.v_turni
	Turno1Sempre.Visible = Main.v_turni
	mPorta.Text = Main.v_mporta
	mUser.Text = Main.v_muser
	mPwd.Text = Main.v_mpwd
	mUserS.Text = Main.v_musers
	mPwdS.Text = Main.v_mpwds
	mDesMittente.Text = Main.v_mdesmittente
	mD1.Text = Main.v_md1
	mD2.Text = Main.v_md2
	mD3.Text = Main.v_md3
	mD4.Text = Main.v_md4
	mD5.Text = Main.v_md5
	ModificaMovimento.Checked = Main.v_modificamovimento
	ImportazioneAuto.Checked = Main.v_importazioneauto
	CentralizzaDoc.Checked = Main.v_centralizzadoc
	gloryN.SelectedIndex = Main.v_glory
	TallonPremio.Checked = Main.v_tallonpremio
	Listino2aZero.Checked = Main.v_listino2azero
	ControllaPrezziaZero.Checked = Main.v_controllaprezziazero
	FatturaFMT2.Checked = Main.v_fatturafmt2
	AttivaFE.Checked = Main.v_attivafe
	PausaFE.Checked = Main.v_pausafe
	PausaFE.Enabled = AttivaFE.Checked
	AsyncFE.Enabled = AttivaFE.Checked
	CopieFE.Enabled = AttivaFE.Checked
	CopieFE2.Enabled = AttivaFE.Checked
	CentralizzaDoc.Enabled = True
	ConsolidaIncassi.Checked = Main.v_consolidaincassi
	GiacSede.Checked = Main.v_giacsede
	TipoTastiera.SelectedIndex = Main.v_tastiera
	ColonneVarianti.SelectedIndex = Main.v_colonnevarianti
	ArticoliZero.SelectedIndex = Main.v_articolizero
	TipoInterfaccia.SelectedIndex = Main.v_tipointerfaccia
	TipoImpTabacchi.SelectedIndex = Main.v_tipoimptabacchi
	IvaDefault.SelectedIndex = Main.v_ivadefault
	PagamentoPrep.SelectedIndex = Main.v_pagamentoprep
	OrdinamentoSc.SelectedIndex = Main.v_ordinamentosc
	ArrotondaV.SelectedIndex = Main.v_arrotondav
	ArrotondaContantiRT.SelectedIndex = Main.v_arrotondacontantirt
	FontSizeC.SelectedIndex = Main.v_fontsizec
	barra.Text = Main.v_barrareal
	barra2.Text = Main.v_barrareal2
	Utente.Text = Main.v_uid
	Password.Text = Main.v_pwd
	If Main.v_matricola <> "" Then
	End If
	PrefissoCliente.Text = "Prefisso per il riconoscimento automatico del cliente=" & Main.v_prefissocliente
	PrefissoTT.Text = "Prefisso per il riconoscimento automatico del tavolo-tessera=" & Main.v_prefissott
	PrefissoCliente.Tag = Main.v_prefissocliente
	PrefissoTT.Tag = Main.v_prefissott
	PrefissoCoupon.Text = "Prefisso per il riconoscimento automatico dei Coupon (valore numerico di 3 cifre)=" & Main.v_prefissocoupon
	PrefissoCoupon.Tag = Main.v_prefissocoupon
	If Main.v_paginapagamenti <> 0 Then
	End If
	PaginaPagamenti.Tag = Main.v_paginapagamenti
	ObbligoClienteF.Checked = Main.v_obbligoclientef
	If Not(Main.vBln25) Then
	End If
	receive.Text = "Pacchetti Ricevuti:" & Main.vSql1.ExecQuerySingleResult("select valore from progressivi where codice ='RECEIVE'")
	If Not(Main.vBln25) Then
	End If
	lblMaxImpo.Text = "Massimo importo Riga :" & NumberFormat2(Main.v_maximpo, 1, 2, 2, False) & " €"
	lblMaxImpo.Tag = Main.v_maximpo
	If Main.v_fondocassaauto <> 0 Then
	End If
	FondoCassaAuto.Tag = Main.v_fondocassaauto
	MaxImpTavolo.Text = "Massimo Importo per Alert su tavolo :" & NumberFormat2(Main.v_maximptavolo, 1, 2, 2, False) & " €"
	MaxImpTavolo.Tag = Main.v_maximptavolo
	ValorizzazionePrezzoFrazione.Text = Sub022(Main.v_valorizzazioneprezzofrazione)
	ValorizzazionePrezzoFrazione.Tag = Main.v_valorizzazioneprezzofrazione
	TipoFrazionamentoVariazioni.Text = Sub021(Main.v_tipofrazionamentovariazioni)
	TipoFrazionamentoVariazioni.Tag = Main.v_tipofrazionamentovariazioni
	WebSospendiTavolo.Text = Sub023(Main.v_websospenditavolo)
	WebSospendiTavolo.Tag = Main.v_websospenditavolo
	If Main.v_mintavololento <> 0 Then
	End If
	MinTavoloLento.Tag = Main.v_mintavololento
	CopieFE.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (PA + B2B):" & Main.v_copiefe
	CopieFE.Tag = Main.v_copiefe
	CopieFE2.Text = "Numero di copie per il tallon di riepilogo Fattura elettronica (B2C):" & Main.v_copiefe2
	CopieFE2.Tag = Main.v_copiefe2
	If Main.v_asyncfe <> 0 Then
	End If
	AsyncFE.Tag = Main.v_asyncfe
	ListPoco.Text = "Detrazione rispetto al Listino 1 per le variazioni con il modificatore 'POCO': " & Main.v_listpoco & "%"
	ListPoco.Tag = Main.v_listpoco
	ListMolto.Text = "Maggiorazione rispetto al Listino 1 per le variazioni con il modificatore 'MOLTO': " & Main.v_listmolto & "%"
	ListMolto.Tag = Main.v_listmolto
	If Main.v_iniziogiorno <> 0 Then
	End If
	InizioGiorno.Tag = Main.v_iniziogiorno
	bAltezzaVariazioni.Text = "Altezza riga Variazioni: " & Main.v_altezzavariazioni & " pixel"
	bAltezzaVariazioni.Tag = Main.v_altezzavariazioni
	AsportoAnticipo.Visible = AsportoOra.Checked
	If Main.v_asportoanticipo <> 0 Then
	End If
	AsportoAnticipo.Tag = Main.v_asportoanticipo
	If Main.v_minutiss <> 0 Then
	End If
	MinutiSS.Tag = Main.v_minutiss
	NumeroScontriniST.Text = "Numero di scontrini lotteria dopo il limite per attivare la richiesta di invio:" & Main.v_numeroscontrinist
	NumeroScontriniST.Tag = Main.v_numeroscontrinist
	PrenotaGiorni.Text = "Numero di giorni da oggi per data prenotazione predefinita: " & Main.v_prenotagiorni
	PrenotaGiorni.Tag = Main.v_prenotagiorni
	PrenotaGiorniApertura.Tag = Main.v_prenotagiorniapertura
	If Main.v_numerott <> 0 Then
	End If
	NumeroTT.Tag = Main.v_numerott
	TallonSempre.Checked = Main.v_tallonsempre
	CassettoSubito.Checked = Main.v_cassettosubito
	SuonoDaCassa.Checked = Main.v_suonodacassa
	If Main.v_notallon <> 0 Then
	End If
	If Main.v_stampareport <> 0 Then
	End If
	If Main.v_ipricevute <> "" Then
	End If
	If Main.v_ipdistributore <> "" Then
	End If
	DesAsporto.Text = "Intestazione per Comanda Asporto:" & Main.v_desasporto
	DesAsporto.Tag = Main.v_desasporto
	DesPreconto.Text = "Intestazione per Stampa Parziale(PRECONTO) e Conto:" & Main.v_despreconto
	DesPreconto.Tag = Main.v_despreconto
	If Main.v_desatesta <> "" Then
	End If
	DesATesta.Tag = Main.v_desatesta
	vInt16 = Main.v_ricevutaacli
	vInt18 = Main.v_ricevutaacor
	vInt14 = Main.v_ricevutaapdv
	vInt17 = Main.v_ricevutadacor
	vInt15 = Main.v_ricevutadacli
	vInt13 = Main.v_ricevutadapdv
	vInt19 = Main.v_ricevutaspaziomf
	If Main.v_stampafattura <> 0 Then
	End If
	If Main.v_stampaconto <> 0 Then
	End If
	Happy.Text = "Gestione Offerta Happy Hour "
	vIntArr1 = Main.v_dalle
	vIntArr2 = Main.v_alle
	vIntArr3 = Main.v_listinoh
	If Main.v_salvaora <> -1 Then
	End If
	SalvaOra.Tag = Main.v_salvaora
	If Main.v_repartogv <> -1 Then
	End If
	RepartoGV.Tag = Main.v_repartogv
	nSalva.Text = "Numero salvataggi su FTP = " & Main.v_nsalva
	nSalva.Tag = Main.v_nsalva
	If Not(File.Exists(mod1.vStr4, "LogoPrg.jpg")) Then
	End If
End Sub

Sub Sfondobtn_Click
	Dim list As List
	list.Initialize
	list.Add("Bianco (CONSIGLIATO)")
	list.Add("Grigio Chiaro")
	list.Add("Grigio")
	list.Add("Grigio scuro")
	Dim vInputList1 As Int = idLib.InputList1(list, "Indicare il colore di sfondo della schermata di vendita")
	If vInputList1 < 0 Then
		Return
	End If
	vPnl2.Tag = vInputList1
	vPnl2.Color = mod1.Sub092(vInputList1)
	Dim vObjectToCharSequence As Object = "Uscire dal programma per applicare il nuovo colore di sfondo"
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
End Sub

Sub Sub037(z As Boolean)
	Sub025(PrefixFTPSave, z)
	PrefixFTPSave.Text = "Prefisso Aggiuntivo Server FTP per il Salvataggio:" & PrefixFTPSave.Tag
	Sub025(ServerSave, z)
	Sub025(UtenteSave, z)
	Sub025(PasswordSave, z)
End Sub

Sub Smtp_MessageSent(z As Boolean)
	If z Then
		ToastMessageShow("Mail inviata correttamente", True)
	Else
		Dim vObjectToCharSequence As Object = "Errore durante l'invio della Mail" & CRLF & CRLF & LastException.Message
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub217(LastException.Message)
	End If
	mod1.Sub081
	ProgressDialogHide
End Sub

Sub SoloVenduto_CheckedChange(z As Boolean)
	If z Then
		Dim vObjectToCharSequence As Object = "Abilitando questo parametro si ottengono i seguenti effetti: " & SmartStringFormatter("", CRLF) & CRLF & "1)Il sistema non importa le eventuali variazioni da remoto " & SmartStringFormatter("", CRLF) & CRLF & "2)Vengono eliminate tutte le limitazioni legate all'abilitazione del terminale remoto " & SmartStringFormatter("", CRLF) & CRLF & "3)Viene disabilitata la possibilità di centralizzare i saldi dei clienti " & SmartStringFormatter("", CRLF) & CRLF & TAB & "Si desidera continuare ? "
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "SI", "", "NO", Main.vBmp1)
		If vMsgbox2 = -1 Then
			Return
		End If
		SoloVenduto.Checked = False
	End If
End Sub

Sub Sottoconti_CheckedChange(z As Boolean)
	If z And Consolida.Checked Then
		Dim vObjectToCharSequence As Object = "ATTENZIONE ...." & CRLF & "Abilitando questo parametro verrà disattivato il consolidamento degli articoli durante la vendita." & CRLF & "Si desidera proseguire ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "SI", "", "NO", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			Sottoconti.Checked = False
			Return
		End If
		Consolida.Checked = False
		Return
	End If
End Sub

Sub StampaConto_Click
	Dim list As List
	list.Initialize
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from confstampe order by codice")
	list.Add("Stampante Fiscale")
	Dim rowCount As Int = cursorWrapper2.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper2.Position = i
		If cursorWrapper2.GetInt("stato") = 1 And cursorWrapper2.GetInt("mf") = 0 And cursorWrapper2.GetInt("indice") = 0 Then
			list.Add(cursorWrapper2.GetString("descrizione"))
		End If
	Next
	If list.Size = 1 Then
		Dim vObjectToCharSequence As Object = "Nessuna stampante non fiscale attiva."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		StampaConto.Text = vStr3 & " MF"
		StampaConto.Tag = 0
	Else
		Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare la stampante da attivare")
		If vInputList1 < 0 Then
			mod1.Sub081
			Return
		End If
		If vInputList1 = 0 Then
			StampaConto.Text = vStr3 & " MF"
			StampaConto.Tag = 0
		Else
			Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
			Dim i2 As Int = 1
			Dim i3 As Int = 0
			Do While True
				If i3 > rowCount2 Then
					Exit
				End If
				cursorWrapper2.Position = i3
				If cursorWrapper2.GetInt("stato") = 1 And cursorWrapper2.GetInt("mf") = 0 And cursorWrapper2.GetInt("indice") = 0 Then
					If i2 = vInputList1 Then
						StampaConto.Text = vStr3 & " " & list.Get(vInputList1)
						StampaConto.Tag = cursorWrapper2.GetInt("codice")
						Exit
					End If
					i2 = i2 + 1
				End If
				i3 = i3 + 1
			Loop
		End If
	End If
	mod1.Sub081
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/configura.java, metodo _stampafattura_click (riga 18267).
Sub StampaFattura_Click
	Dim i As Int = 0
	Dim list As List
	list.Initialize
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from confstampe order by codice")
	list.Add("Stampante Ricevute e Fatture (Notch)")
	list.Add("Stampante Fiscale")
	list.Add("Stampante A4")
	list.Add("Stampante A4 su ServiceBox")
	Dim rowCount As Int = cursorWrapper2.RowCount - 1
	Dim i2 As Int
	For i2 = 0 To rowCount
		cursorWrapper2.Position = i2
		If cursorWrapper2.GetInt("stato") = 1 And cursorWrapper2.GetInt("mf") = 0 And cursorWrapper2.GetInt("indice") = 0 Then
			list.Add(cursorWrapper2.GetString("descrizione"))
		End If
	Next
	Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare la stampante da attivare")
	If vInputList1 < 0 Then
		mod1.Sub081
		Return
	End If
	If vInputList1 = 3 Then
		If IpRPI.Text <> "" Then
		End If
		mod1.Sub081
		Dim vObjectToCharSequence As Object = "Per abilitare questa modalità di stampa è necessario attivare la gestione del ServiceBox e il modulo 'PRO'"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	End If
	StampaFattura.Text = "Stampa Fattura su " & list.Get(vInputList1)
	If vInputList1 > 2 Then
		Dim i3 As Int = 4
		Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
		Do While True
			If i > rowCount2 Then
				Exit
			End If
			cursorWrapper2.Position = i
			If cursorWrapper2.GetInt("stato") = 1 And cursorWrapper2.GetInt("mf") = 0 And cursorWrapper2.GetInt("indice") = 0 Then
				If i3 = vInputList1 Then
					StampaFattura.Tag = cursorWrapper2.GetInt("codice")
					Exit
				End If
				i3 = i3 + 1
			End If
			i = i + 1
		Loop
	Else
		StampaFattura.Tag = vInputList1 - 1
	End If
	If vInputList1 = 0 Then
		StampaFattura.Tag = 100
	End If
	If vInputList1 = 2 Then
		StampaFattura.Tag = 200
	End If
	If vInputList1 = 3 Then
		StampaFattura.Tag = 300
	End If
	mod1.Sub081
End Sub

Sub StampaReport_Click
	Dim list As List
	list.Initialize
	Dim cursorWrapper As Cursor
	Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from confstampe order by codice")
	list.Add("Stampa i report su MF")
	Dim rowCount As Int = cursorWrapper2.RowCount - 1
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper2.Position = i
		If cursorWrapper2.GetInt("stato") = 1 And cursorWrapper2.GetInt("mf") = 0 And cursorWrapper2.GetInt("indice") = 0 Then
			list.Add(cursorWrapper2.GetString("descrizione"))
		End If
	Next
	Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare il tipo di stampa")
	If vInputList1 < 0 Then
		mod1.Sub081
		Return
	End If
	If vInputList1 = 0 Then
		StampaReport.Text = list.Get(vInputList1)
		StampaReport.Tag = vInputList1
	Else
		Dim rowCount2 As Int = cursorWrapper2.RowCount - 1
		Dim i2 As Int = 0
		Dim i3 As Int = 1
		Do While True
			If i2 > rowCount2 Then
				Exit
			End If
			cursorWrapper2.Position = i2
			If cursorWrapper2.GetInt("stato") = 1 And cursorWrapper2.GetInt("mf") = 0 And cursorWrapper2.GetInt("indice") = 0 Then
				If i3 = vInputList1 Then
					StampaReport.Text = "Stampa i report su " & list.Get(vInputList1)
					StampaReport.Tag = cursorWrapper2.GetInt("codice")
					Exit
				End If
				i3 = i3 + 1
			End If
			i2 = i2 + 1
		Loop
	End If
	mod1.Sub081
End Sub

Sub StepAsporto_Click
	Dim i As Int = 3
	Dim i2 As Int = 5
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from headmov where tavolo = 0") > 0 Then
		Dim vObjectToCharSequence As Object = "E' necessario eseguire la Chiusura Giornaliera per modificare questo parametro."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		mod1.Sub081
		Return
	End If
	Dim list As List
	list.Initialize
	list.AddAll(ArrayToList(Array As String("5 Minuti", "10 Minuti", "15 Minuti", "20 Minuti", "30 Minuti", "1 Ora")))
	Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare lo step richiesto:")
	If vInputList1 >= 0 Then
		Main.vSql1.ExecNonQuery("delete from oraasporto")
		Select vInputList1
			Case 0
				i = 11
			Case 1
				i = 5
				i2 = 10
			Case 2
				i2 = 15
			Case 3
				i2 = 20
				i = 2
			Case 4
				i2 = 30
				i = 1
			Case 5
				i2 = 60
				i = 0
			Case Else
				i2 = 0
				i = 0
		End Select
		Dim i3 As Int
		For i3 = 0 To 23
			Dim i4 As Int
			For i4 = 0 To i
				Dim i5 As Int = i2 * i4
				Main.vSql1.ExecNonQuery("insert into oraasporto(codice,descrizione) values('" & i3 & ":" & i5 & "','" & NumberFormat(i3, 2, 0) & ":" & NumberFormat(i5, 2, 0) & "')")
			Next
		Next
	End If
	mod1.Sub081
End Sub

Sub TabHost1_TabChanged
	If Main.vBln25 And (TabHost1.CurrentTab = 2 Or TabHost1.CurrentTab = 3) Then
		TabHost1.CurrentTab = vInt1
		Return
	End If
	If TabHost1.CurrentTab = 1 Then
		If nCassa.Text <> "1" Then
			ConsolidaIncassi.Checked = False
		End If
		ConsolidaIncassi.Enabled = nCassa.Text = "1"
	End If
	vInt1 = TabHost1.CurrentTab
	lblTitolo.Text = "Pagina selezionata : " & TabHost1.CurrentTab + 1
	Dim vGetAllViewsRecursive As IterableList = Activity.GetAllViewsRecursive
	Dim size As Int = vGetAllViewsRecursive.Size
	Dim i As Int
	For i = 0 To size - 1
		Dim concreteViewWrapper As View = vGetAllViewsRecursive.Get(i)
		If concreteViewWrapper Is Button And Not(concreteViewWrapper Is CheckBox) Then
			Dim buttonWrapper As Button = concreteViewWrapper
			mod1.Sub165(buttonWrapper)
		End If
	Next
End Sub

Sub TastiOmbreggiati_CheckedChange(z As Boolean)
	Dim vObjectToCharSequence As Object = "Per applicare la modifica è necessario riavviare il programma."
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
End Sub

Sub Tema_ItemClick(i As Int, obj As Object)
	If i = 0 Then
		Sub034(vXmlLayoutBuilder1.GetResourceId("style", "android:style/Theme.Holo.Light"))
	Else
		If File.Exists(File.DirInternal, "theme.txt") Then
			File.Delete(File.DirInternal, "theme.txt")
		End If
	End If
	Dim vObjectToCharSequence As Object = "Il programma verrà chiuso per consentire l'applicazione del tema selezionato"
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
	mod1.vBln4 = True
End Sub

Sub Tema2_CheckedChange(z As Boolean)
	Sub035()
	If Not(vBln9) Then
		Dim vObjectToCharSequence As Object = "Per applicare la modifica è necessario riavviare il programma."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		Return
	End If
End Sub

Sub TermSala_CheckedChange(z As Boolean)
	If z Then
		Dim vObjectToCharSequence As Object = "Abilitando questo parametro , il terminale non emetterà più documenti fiscale." & CRLF & "Diventa necessaria la presenza di un terminale con licenza Server attiva." & CRLF & "Si desidera continuare ?"
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "", "No", Main.vBmp1)
		If vMsgbox2 <> -1 Then
			TermSala.Checked = False
		Else
			Dim vObjectToCharSequence3 As Object = "Si desidera abilitare il blocco automatico del terminale ?"
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "No", "Si Senza Password ", Main.vBmp1)
			If vMsgbox22 = -1 Then
				TermSala.Tag = 1
				TermSala.Text = "Terminale di Sala (con blocco)"
			Else
				If vMsgbox22 = -2 Then
					TermSala.Tag = 2
					TermSala.Text = "Terminale di Sala (con blocco No Password)"
				Else
					Dim list As List
					list.Initialize
					Dim rowCount As Int = Main.vCur5.RowCount - 1
					Dim i As Int
					For i = 0 To rowCount
						Main.vCur5.Position = i
						list.Add(Main.vCur5.GetString("descrizione"))
					Next
					Dim vInputList1 As Int = idLib.InputList1(list, "Selezionare l'operatore al quale legare i movimenti")
					If vInputList1 >= 0 Then
						vInt6 = vInputList1
						TermSala.Tag = 0
						Main.vCur5.Position = vInt6
						TermSala.Text = "Terminale di Sala (Op.:" & Main.vCur5.GetString("descrizione") & ")"
					Else
						Return
					End If
				End If
			End If
			Dim vObjectToCharSequence5 As Object = "Confermando le configurazioni il programma verrà chiuso automaticamente"
			Dim vObjectToCharSequence6 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
		End If
	Else
		TermSala.Text = "Terminale di Sala"
		TermSala.Tag = 0
	End If
End Sub

Sub Timer1_Tick
	v7.Enabled = False
	hide_keyboard()
End Sub

Sub TipoFrazionamentoVariazioni_Click
	Dim list As List
	list.Initialize
	list.Add("Tipo Frazionamento per Variazioni: Segui il comportamento della frazione")
	list.Add("Tipo Frazionamento per Variazioni: Senza importo")
	list.Add("Tipo Frazionamento per Variazioni: Con importo / la frazione")
	list.Add("Tipo Frazionamento per Variazioni: Con importo intero")
	Dim vInputList1 As Int = idLib.InputList1(list, "Indicare il comportamento delle variazioni su articoli frazionati:")
	If vInputList1 < 0 Then
		Return
	End If
	TipoFrazionamentoVariazioni.Text = Sub021(vInputList1)
	TipoFrazionamentoVariazioni.Tag = vInputList1
End Sub

Sub TipoImpTabacchi_ItemClick(i As Int, obj As Object)
	If i = 1 And UsbPath.Tag = "" Then
		Dim vObjectToCharSequence As Object = "E' necessario impostare il percorso per la chiave USB."
		Dim vObjectToCharSequence2 As Object = Main.vStr8
		Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		TipoImpTabacchi.SelectedIndex = 0
		Return
	End If
End Sub

Sub TipoInterfaccia_ItemClick(i As Int, obj As Object)
	Sub025(IPCassa, Not(i > 0))
	Dim vObjectToCharSequence As Object = "Per applicare la modifica è necessario riavviare il programma."
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
End Sub

Sub TipoLayout_Click
	Dim list As List
	list.Initialize
	list.Add("Tastiera Grafica tipo 1")
	list.Add("Tastiera Grafica tipo 2")
	list.Add("Tastiera Grafica tipo 3")
	list.Add("Tastiera Grafica tipo 4")
	list.Add("Tastiera Grafica tipo 5")
	list.Add("Tastiera Grafica tipo 6")
	list.Add("Tastiera Grafica tipo 7")
	Dim vInputList1 As Int = idLib.InputList1(list, "Indicare il tipo di tasto...")
	If vInputList1 < 0 Then
		Return
	End If
	If vInputList1 = 0 Then
		mod1.Sub172(TipoLayout, "btn2")
	Else
		mod1.Sub172(TipoLayout, "btn" & vInputList1 & "_2")
	End If
	TipoLayout.Tag = vInputList1
	vBln9 = True
	Tema2.Checked = False
	vBln9 = False
	Dim vObjectToCharSequence As Object = "Confermando le modifiche ,il programma verrà chiuso per applicare il nuovo layout"
	Dim vObjectToCharSequence2 As Object = Main.vStr8
	Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
End Sub

Sub TipoTastiera_ItemClick(i As Int, obj As Object)
	If Not(vBln7) Then
		If Main.v_tastiera <> TipoTastiera.SelectedIndex Then
			Dim vObjectToCharSequence As Object = "Confermare la modifica e riavviare il programma per attivare il nuovo orientamento del display."
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		End If
	End If
	If Main.vBln39 Then
		If Not(Main.vBln25) Then
			Dim vObjectToCharSequence3 As Object = "Si desidera modificare anche il numero di tasti per ogni riga e colonna ? (la configurazione attuale di tastiera verrà eliminata.)"
			Dim vObjectToCharSequence4 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "Si", "", "No", Main.vBmp1)
			If vMsgbox2 = -1 And i >= 0 Then
				Dim list As List
				list.Initialize
				If i = 1 Or i = 3 Then
					list.Add("Minipos 10" & QUOTE & " o SpiceT")
					list.Add("All-in-One 15" & QUOTE)
				Else
					list.Add("Tablet 13" & QUOTE)
					list.Add("Tablet 10" & QUOTE & " o Andromeda")
				End If
				list.Add("Configura manualmente la tastiera")
				Dim vInputList1 As Int = idLib.InputList1(list, "Effettuare una selezione :")
				If vInputList1 = 0 Or vInputList1 = 1 Then
					If i = 1 Or i = 3 Then
						If vInputList1 = 0 Then
							vInt2 = 7
							vInt3 = 11
							vInt4 = 3
							vInt5 = 4
						Else
							vInt2 = 9
							vInt3 = 13
							vInt4 = 4
							vInt5 = 5
						End If
					Else If vInputList1 = 0 Then
						vInt2 = 12
						vInt3 = 9
						vInt4 = 7
						vInt5 = 4
					Else
						vInt2 = 11
						vInt3 = 8
						vInt4 = 6
						vInt5 = 4
					End If
					vBln7 = True
				Else If vInputList1 = 2 Then
					Sub033()
				End If
			End If
			mod1.Sub081
			Return
		End If
	End If
	mod1.Sub081
End Sub

Sub Tplv_Click
End Sub

Sub Turni_CheckedChange(z As Boolean)
	Sub025(ControlloTurni, z)
	Sub025(AvantiTurnoAuto, z)
	Sub025(Turno1Sempre, z)
End Sub

Sub UsbPath_Click
	Dim fileDialog As FileDialog
	fileDialog.TextColor = -7829368
	fileDialog.ShowOnlyFolders = True
	fileDialog.FastScroll = True
	fileDialog.FilePath = mod1.vStr4
	Dim vObjectToCharSequence As Object = "Impostare il Percorso per il dispositivo USB (SELEZIONARE SEMPRE UNA SOTTOCARTELLA)"
	Dim vShow As Int = fileDialog.Show(vObjectToCharSequence, "OK", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		UsbPath.Text = "Percorso chiave USB:" & CRLF & fileDialog.FilePath
		UsbPath.Tag = fileDialog.FilePath
	Else
		UsbPath.Text = "Impostare il percorso per la chiave USB "
		UsbPath.Tag = ""
	End If
	Main.v_usbpath = UsbPath.Tag
	mod1.Sub081
End Sub

Sub ValorizzazionePrezzoFrazione_Click
	Dim list As List
	list.Initialize
	list.Add("Tipo valorizzazione prezzo frazione: Predefinito")
	list.Add("Tipo valorizzazione prezzo frazione: Prezzo più alto")
	Dim vInputList1 As Int = idLib.InputList1(list, "Indicare il tipo di valorizzazione del prezzo della frazione:")
	If vInputList1 < 0 Then
		Return
	End If
	ValorizzazionePrezzoFrazione.Text = Sub022(vInputList1)
	ValorizzazionePrezzoFrazione.Tag = vInputList1
End Sub

Sub visibilitychanged_event(str As String, objArr As Object()) As Object
	mod1.Sub081
	Return Null
End Sub

Sub WebApiCAPEsercente_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 2
	vDlg1.Input = WebApiCAPEsercente.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "CAP Esercente"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire il CAP dell'esercente che verrà visualizzato nel portale. ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If vDlg1.Input.Length = 5 Or vDlg1.Input.Length = 0 Then
			WebApiCAPEsercente.Text = "CAP Esercente visualizzato sul portale: " & vDlg1.Input
			WebApiCAPEsercente.Tag = vDlg1.Input
		Else
			Dim vObjectToCharSequence As Object = "Il CAP inserito non è valido"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
		End If
	End If
	mod1.Sub081
End Sub

Sub WebApiDatiRetailer_CheckedChange(z As Boolean)
	Sub025(WebApiPIEsercente, z)
	Sub025(WebApiCAPEsercente, z)
	Sub025(WebApiRagSoc, z)
End Sub

Sub WebApiIndirizzo_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = WebApiIndirizzo.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Indirizzo portale"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire l'indirizzo del portale ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		WebApiIndirizzo.Text = "Indirizzo per utilizzare le funzioni del portale: " & vDlg1.Input
		WebApiIndirizzo.Tag = vDlg1.Input
	End If
	mod1.Sub081
End Sub

Sub WebApiPI_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = WebApiPI.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Partita Iva"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire la partita iva del concessionario ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If vDlg1.Input <> "" Then
			If mod1.Sub135(vDlg1.Input, True) Then
				WebApiPI.Text = "Partita iva del concessionario per abilitare le comunicazioni con il portale: " & vDlg1.Input
				WebApiPI.Tag = vDlg1.Input
			Else
				Dim vObjectToCharSequence As Object = "La partita iva inserita non è valida"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			End If
		Else
			WebApiPI.Text = "Partita iva del concessionario per abilitare le comunicazioni con il portale:" & vDlg1.Input
			WebApiPI.Tag = vDlg1.Input
		End If
	End If
	mod1.Sub081
End Sub

Sub WebApiPIEsercente_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = WebApiPIEsercente.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Partita Iva Esercente"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire la partita iva dell'esercente che verrà visualizzata nel portale. ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		If vDlg1.Input <> "" Then
			If mod1.Sub135(vDlg1.Input, True) Then
				WebApiPIEsercente.Text = "Partita iva Esercente visualizzata sul portale: " & vDlg1.Input
				WebApiPIEsercente.Tag = vDlg1.Input
			Else
				Dim vObjectToCharSequence As Object = "La partita iva inserita non è valida"
				Dim vObjectToCharSequence2 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
			End If
		Else
			WebApiPIEsercente.Text = "Partita iva Esercente visualizzata sul portale: " & vDlg1.Input
			WebApiPIEsercente.Tag = vDlg1.Input
		End If
	End If
	mod1.Sub081
End Sub

Sub WebApiRagSoc_Click
	Dim inputDialog2 As InputDialog = vDlg1
	vDlg1.InputType = 1
	vDlg1.Input = WebApiRagSoc.Tag
	vDlg1.PasswordMode = False
	vDlg1.Hint = "Regione Sociale Esercente"
	vDlg1.HintColor = Colors.ARGB(196, 255, 140, 0)
	Dim vShow As Int = vDlg1.Show("Inserire la ragione sociale dell'esercente che verrà visualizzata nel portale. ", Main.vStr8, "Ok", "Annulla", "", Main.vBmp1)
	If vShow = -1 Then
		Dim vTmp As String = mod1.Sub209(vDlg1.Input)
		If vTmp = "Inserire Testo" Then
			vTmp = ""
		End If
		WebApiRagSoc.Text = "Ragione sociale esercente visualizzata sul portale: " & vTmp
		WebApiRagSoc.Tag = vTmp
	End If
	mod1.Sub081
End Sub

Sub WebSospendiTavolo_Click
	Dim list As List
	list.Initialize
	list.Add("Richiedi sempre la conferma del cameriere")
	list.Add("Richiedi la conferma del cameriere solo per le spiagge")
	list.Add("Richiedi la conferma del cameriere solo per i tavoli")
	list.Add("Non richiedere mai la conferma del cameriere")
	Dim vInputList1 As Int = idLib.InputList1(list, "Indicare il tipo di chiusura tavolo da Web:")
	If vInputList1 < 0 Then
		Return
	End If
	WebSospendiTavolo.Text = Sub023(vInputList1)
	WebSospendiTavolo.Tag = vInputList1
End Sub

Sub onCreate
	Try
		If File.Exists(getFilesDir, "theme.txt") Then
			Main.theme_value = File.ReadString(getFilesDir, "theme.txt")
		End If
		If Main.theme_value <> 0 Then
			setTheme(Main.theme_value)
		End If
	Catch
		'### throw NEW:RuntimeException
	End Try
End Sub

