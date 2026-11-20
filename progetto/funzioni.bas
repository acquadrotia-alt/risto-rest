B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13.1
@EndOfDesignText@
Sub Class_Globals
	Public vfileprovider1 As fileprovider
	Public vXUI1 As XUI
End Sub

Sub Sub001(cursorWrapper As Cursor, str As String, d As Double)
	Dim list As List
	list.Initialize
	Dim map As Map
	Dim rowCount As Int = cursorWrapper.RowCount - 1
	Dim d2 As Double = d
	Dim i As Int
	For i = 0 To rowCount
		cursorWrapper.Position = i
		map.Initialize
		map.Put("codice", cursorWrapper.GetString("codice"))
		map.Put("descrizione", cursorWrapper.GetString("descrizione"))
		map.Put("brep", cursorWrapper.GetInt("brep"))
		If Main.v_turni Then
			map.Put("turno", cursorWrapper.GetInt("turno"))
			map.Put("lockturno", cursorWrapper.GetInt("lockturno"))
		End If
		map.Put("idRiga", cursorWrapper.GetString("idRiga"))
		map.Put("qta", cursorWrapper.GetDouble("qta"))
		map.Put("prezzov", cursorWrapper.GetDouble("prezzov"))
		map.Put("reparto", cursorWrapper.GetInt("reparto"))
		map.Put("QtaConDecimali", cursorWrapper.GetDouble("QtaConDecimali"))
		map.Put("totcre", cursorWrapper.GetString("totcre"))
		map.Put("iva", cursorWrapper.GetInt("iva"))
		map.Put("datam", DateTime.Date(mod1.Sub058))
		map.Put("datam2", DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058))
		map.Put("datam3", mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)))
		map.Put("cliente", cursorWrapper.GetString("cliente"))
		map.Put("codint", cursorWrapper.GetString("codint"))
		map.Put("memo", cursorWrapper.GetString("memo"))
		map.Put("cassa", Main.v_numcassa)
		map.Put("flgNF", cursorWrapper.GetInt("flgNF"))
		map.Put("Qtad", cursorWrapper.GetInt("Qtad"))
		map.Put("TipoSconto", cursorWrapper.GetInt("TipoSconto"))
		map.Put("importod", cursorWrapper.GetDouble("importod"))
		map.Put("scovd", cursorWrapper.GetDouble("scovd"))
		map.Put("importo2", cursorWrapper.GetDouble("importo2"))
		map.Put("ingredientisumf", cursorWrapper.GetInt("ingredientisumf"))
		map.Put("ingredientisunf", cursorWrapper.GetInt("ingredientisunf"))
		map.Put("stampaesclusiva", cursorWrapper.GetInt("stampaesclusiva"))
		map.Put("gruppomenu", cursorWrapper.GetString("gruppomenu"))
		map.Put("stampante2", cursorWrapper.GetInt("stampante2"))
		map.Put("uscita", cursorWrapper.GetInt("uscita"))
		If str = "Venduto" Then
			Main.vCur4.Position = cursorWrapper.GetInt("iva")
			map.Put("aliquota2", Main.vCur4.GetDouble("aliquota2"))
			map.Put("aliquota", Main.vCur4.GetDouble("aliquota2"))
			map.Put("scop", cursorWrapper.GetDouble("scop"))
			map.Put("scov", cursorWrapper.GetDouble("scov"))
			map.Put("flgmag", cursorWrapper.GetInt("flgmag"))
			map.Put("importo", cursorWrapper.GetDouble("importo"))
			map.Put("nmov", -100)
		Else
			Dim vRound2 As Double = Round2(cursorWrapper.GetDouble("importo"), 2)
			Dim equals As Boolean = Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where flgusointerno=1 and codint = '" & cursorWrapper.GetString("codint") & "'") = 1
			Dim equals2 As Boolean = Main.vSql1.ExecQuerySingleResult("Select count(*) from anagra where flgmag=1 and codint = '" & cursorWrapper.GetString("codint") & "'") = 1
			If d2 > 0 And cursorWrapper.GetInt("flgNF") = 0 Then
				If Not(equals) And cursorWrapper.GetDouble("qta") > 0 And vRound2 <= d2 Then
					map.Put("scop", 100)
					map.Put("scov", cursorWrapper.GetDouble("prezzov") * cursorWrapper.GetDouble("qta"))
					map.Put("importo", 0)
					d2 = d2 - vRound2
					map.Put("flgusointerno", equals)
					map.Put("flgmag", equals2)
				End If
			End If
			If d2 > 0 And cursorWrapper.GetInt("flgNF") = 0 Then
				If Not(equals) And cursorWrapper.GetDouble("qta") > 0 And vRound2 > d2 And d2 > 0 Then
					Dim vRound22 As Double = Round2(d2, 2)
					Dim vRound23 As Double = Round2(cursorWrapper.GetDouble("importo"), 2)
					map.Put("scop", Round2(100 * vRound22 / vRound23, 2))
					map.Put("scov", cursorWrapper.GetDouble("scov") + vRound22)
					map.Put("importo", vRound23 - vRound22)
					d2 = 0
					map.Put("flgusointerno", equals)
					map.Put("flgmag", equals2)
				End If
			End If
			map.Put("scop", cursorWrapper.GetDouble("scop"))
			map.Put("scov", cursorWrapper.GetDouble("scov"))
			map.Put("importo", cursorWrapper.GetDouble("importo"))
			map.Put("flgusointerno", equals)
			map.Put("flgmag", equals2)
		End If
		list.Add(map)
	Next
	dbutil.Sub007(Main.vSql1, str, list)
End Sub

Sub Sub002(cursorWrapper As Cursor)
	Dim list As List
	Dim map As Map
	list.Initialize
	map.Initialize
	list.Clear
	map.Clear
	map.Put("codice", cursorWrapper.GetString("codice"))
	map.Put("descrizione", cursorWrapper.GetString("descrizione"))
	map.Put("brep", True)
	map.Put("qta", cursorWrapper.GetDouble("qta"))
	map.Put("prezzov", cursorWrapper.GetDouble("prezzov"))
	map.Put("reparto", cursorWrapper.GetInt("reparto"))
	map.Put("iva", cursorWrapper.GetInt("iva"))
	map.Put("datam", cursorWrapper.GetString("datam"))
	map.Put("datam2", cursorWrapper.GetString("datam2"))
	map.Put("datam3", cursorWrapper.GetString("datam3"))
	map.Put("flgNF", cursorWrapper.GetInt("flgNF"))
	map.Put("codint", cursorWrapper.GetString("codint"))
	map.Put("cassa", Main.v_numcassa)
	map.Put("scop", cursorWrapper.GetDouble("scop"))
	map.Put("scov", cursorWrapper.GetDouble("scov"))
	map.Put("importo", cursorWrapper.GetDouble("importo"))
	map.Put("turno", cursorWrapper.GetInt("turno"))
	map.Put("idRiga", cursorWrapper.GetString("idRiga"))
	map.Put("cameriere", cursorWrapper.GetInt("cameriere"))
	map.Put("sottoconto", cursorWrapper.GetInt("sottoconto"))
	map.Put("memo", cursorWrapper.GetString("memo"))
	list.Add(map)
	dbutil.Sub007(Main.vSql1, "Ventmp", list)
End Sub

Sub Sub003(z As Boolean)
	Dim i As Int = 10
	mod1.vStr2 = "Sub AddSqlScript"
	Main.vSql1.BeginTransaction
	Main.vSql2.BeginTransaction
	If Not(z) Then
		ProgressDialogShow("Aggiornamento archivi in corso ...")
		DoEvents
		DoEvents
	End If
	If Main.vSql1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='versione'") = 0 Then
		Sub019("CREATE TABLE versione (versione Int  Null)")
		Sub019("insert into versione(versione) values(0)")
	End If
	Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
	DoEvents
	If Main.vInt4 = 0 Then
		Sub019("ALTER TABLE Ventmp ADD turno int not NULL default 1")
		Sub019("ALTER TABLE Venduto ADD turno int not NULL default 1")
		Sub019("ALTER TABLE tmpStampa ADD turno int not NULL default 1")
		Sub019("ALTER TABLE tmpStampaPalm1 ADD turno int not NULL default 1")
		Sub019("ALTER TABLE tmpStampaPalm2 ADD turno int not NULL default 1")
		Sub019("ALTER TABLE tmpStampaPalm3 ADD turno int not NULL default 1")
		Sub019("ALTER TABLE tmpStampaPalm4 ADD turno int not NULL default 1")
		Sub019("ALTER TABLE tmpStampaPalm5 ADD turno int not NULL default 1")
		Sub019("ALTER TABLE tmpStampaPalm6 ADD turno int not NULL default 1")
		Sub019("ALTER TABLE daStampare ADD turno int not NULL default 1")
		Sub019("ALTER TABLE daStampare ADD operatore int not NULL default 1")
		Sub019("ALTER TABLE daStampare ADD lockturno bit not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD lockturno bit not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD counter int not NULL default 1")
		Sub019("ALTER TABLE confstampe ADD cp1 bit not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD cp2 bit not NULL default 0")
		Sub021("ALTER TABLE Venduto ADD turno int not NULL default 1")
		Sub019("ALTER TABLE Venduto ADD lockturno bit not NULL default 0")
		Sub021("ALTER TABLE Venduto ADD lockturno bit not NULL default 0")
		Sub019("ALTER TABLE pagine ADD dll nvarchar (100) not NULL default ''")
		Sub019("ALTER TABLE confstampe ADD mf bit not NULL default 0")
		Sub019("ALTER TABLE Parameters ADD dll nvarchar (100) not NULL default ''")
		Sub019("CREATE TABLE StampaCP (chiave INTEGER PRIMARY KEY ,nmov numeric(18,0) null,cp int not NULL default 0,tavolo int not null default 0)")
		Sub019("ALTER TABLE reparti ADD guadagnop numeric(18, 2) not NULL default 0")
		Sub019("ALTER TABLE reparti ADD guadagnov numeric(18, 2) not NULL default 0")
		Sub021("ALTER TABLE reparti ADD guadagnop numeric(18, 2) not NULL default 0")
		Sub021("ALTER TABLE reparti ADD guadagnov numeric(18, 2) not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD prezzoa numeric(18, 2) not NULL default 0")
		Sub019("ALTER TABLE Venduto ADD prezzoa numeric(18, 2) not NULL default 0")
		Sub021("ALTER TABLE Venduto ADD prezzoa numeric(18, 2) not NULL default 0")
		Sub019("CREATE TABLE ingredienti(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from ingredienti ") = 0 Then
			Dim i2 As Int
			For i2 = 0 To 99
				Main.vSql1.ExecNonQuery("insert into ingredienti(codice,descrizione) values(" & i2 & ",'Ingrediente " & i2 & "')")
			Next
		End If
		Sub019("CREATE TABLE ingredientiplu(chiave INTEGER PRIMARY KEY,codice Int not null default -1 ,codint nvarchar (20) not NULL default '') ")
		Sub019("insert into progressivi(codice,valore) values('AS',0)")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from stampe where codice = 6") = 0 Then
			Sub019("insert into Stampe(codice,descrizione) values(6,'GUADAGNO REPARTI')")
		End If
		Sub019("ALTER TABLE anagra ADD ingredientisumf bit not NULL default 0")
		Sub019("ALTER TABLE anagra ADD ingredientisunf bit not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD ingredientisumf bit not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD ingredientisunf bit not NULL default 0")
		Sub019("ALTER TABLE Venduto ADD ingredientisumf bit not NULL default 0")
		Sub021("ALTER TABLE Venduto ADD ingredientisumf bit not NULL default 0")
		Sub019("ALTER TABLE Venduto ADD ingredientisunf bit not NULL default 0")
		Sub021("ALTER TABLE Venduto ADD ingredientisunf bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampa ADD ingredientisunf bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm1 ADD ingredientisunf bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm2 ADD ingredientisunf bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm3 ADD ingredientisunf bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm4 ADD ingredientisunf bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm5 ADD ingredientisunf bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm6 ADD ingredientisunf bit not NULL default 0")
		Sub019("ALTER TABLE daStampare ADD ingredientisunf bit not NULL default 0")
		Sub019("ALTER TABLE headmov ADD datam2 DateTime not null default '01/01/1900'")
		Sub019("ALTER TABLE venduto ADD datam2 DateTime not null default '01/01/1900'")
		Sub021("ALTER TABLE headmov ADD datam2 DateTime not null default '01/01/1900'")
		Sub021("ALTER TABLE venduto ADD datam2 DateTime not null default '01/01/1900'")
		Sub019("ALTER TABLE Ventmp ADD datam2 DateTime not null default '01/01/1900'")
		Dim list As List
		Dim map As Map
		map.Initialize
		list.Initialize
		map.Put("codint", "srv")
		map.Put("descrizione", "SERVIZIO")
		map.Put("reparto", 98)
		map.Put("iva", 1)
		map.Put("plupeso", 0)
		map.Put("list1", 0)
		map.Put("flgusointerno", True)
		list.Add(map)
		dbutil.Sub010(Main.vSql1, "anagra", list)
		Main.vSql1.ExecNonQuery("update versione set versione = 1")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 1 Then
		If Not(Main.vSql1.ExecQuerySingleResult("Select descrizione from pagamenti where codice = 30") = "Buoni Emessi") Then
			Main.vSql1.ExecNonQuery("update pagamenti set descrizione = 'Buoni Emessi' where codice = 30")
		End If
		Dim list2 As List
		Dim map2 As Map
		map2.Initialize
		list2.Initialize
		map2.Put("codint", "rgr")
		map2.Put("descrizione", "Ritiro Vincita")
		map2.Put("reparto", 98)
		map2.Put("iva", 1)
		map2.Put("plupeso", 0)
		map2.Put("list1", 0)
		map2.Put("flgusointerno", True)
		list2.Add(map2)
		dbutil.Sub010(Main.vSql1, "anagra", list2)
		Sub019("ALTER TABLE confstampe ADD RiepTurni bit not NULL default 1")
		Sub019("ALTER TABLE confstampe ADD RiepTurniD bit not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD ApriCassetto bit not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD TagliaTurno bit not NULL default 1")
		Sub019("ALTER TABLE HeaddaStampare ADD memo nvarchar (50)  Not Null default ''")
		Sub019("insert into progressivi(codice,valore) values('RIC',1)")
		Sub019("ALTER TABLE headmov ADD nric int not NULL default 0")
		Sub019("ALTER TABLE venduto ADD nric int not NULL default 0")
		Sub021("ALTER TABLE headmov ADD nric int not NULL default 0")
		Sub021("ALTER TABLE venduto ADD nric int not NULL default 0")
		Sub019("ALTER TABLE headmov ADD RicDaFatt bit not NULL default 0")
		Sub021("ALTER TABLE headmov ADD RicDaFatt bit not NULL default 0")
		Sub019("CREATE TABLE intestaNF (codice int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '',tipo int not NULL default 0)")
		Sub019("insert into intestaNF(codice,descrizione,tipo) values(0,'Italretail s.r.l.',2)")
		Sub019("insert into intestaNF(codice,descrizione,tipo) values(1,'Via del Paracadutista 11-11A/B',1)")
		Sub019("insert into intestaNF(codice,descrizione,tipo) values(2,'Reggio Emilia',1)")
		Sub019("insert into intestaNF(codice,descrizione,tipo) values(3,'Tel.Anon_0522/232060-Fax.Anon_0522/232501',1)")
		Sub019("insert into intestaNF(codice,descrizione,tipo) values(4,'info@italretail.it',6)")
		Sub019("insert into intestaNF(codice,descrizione,tipo) values(5,'www.italretail.it',6)")
		Sub019("ALTER TABLE clienti ADD mail nvarchar (50) Not Null default ''")
		Sub019("ALTER TABLE confstampe ADD copie int not NULL default 0")
		Sub019("CREATE TABLE distintabase(chiave INTEGER PRIMARY KEY,codint nvarchar (20) not NULL default '' ,codintpadre nvarchar (20) not NULL default '',qta numeric(18, 3) not NULL default 0) ")
		Sub019("CREATE TABLE distintabaseTmp(chiave INTEGER PRIMARY KEY,codint nvarchar (20) not NULL default '' ,codintpadre nvarchar (20) not NULL default '',qta numeric(18, 3) not NULL default 0) ")
		Sub019("ALTER TABLE Ventmp ADD distinta bit not NULL default 0")
		Sub019("ALTER TABLE venduto ADD distinta bit not NULL default 0")
		Sub021("ALTER TABLE venduto ADD distinta bit not NULL default 0")
		Sub019("ALTER TABLE anagra ADD distinta bit not NULL default 0")
		Sub019("ALTER TABLE headmov ADD NoStampaAsporto bit not null default 0")
		Sub019("ALTER TABLE anagra ADD uscita bit not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD uscita bit not NULL default 0")
		Sub019("ALTER TABLE venduto ADD uscita bit not NULL default 0")
		Sub021("ALTER TABLE venduto ADD uscita bit not NULL default 0")
		Sub019("ALTER TABLE tavoli ADD uscita bit not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD indice int not NULL default 0")
		Main.vSql1.ExecNonQuery("update versione set versione = 2")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 2 Then
		Sub019("CREATE  INDEX IX_TELEFONO ON clienti(telefono)")
		Sub019("CREATE  INDEX IX_FAX ON clienti(fax)")
		Sub019("CREATE  INDEX IX_vendutoIdRiga ON Venduto(idRiga)")
		Sub019("CREATE  INDEX IX_vendutoTotcre ON Venduto(totcre)")
		Sub019("CREATE TABLE telefonate(chiave INTEGER PRIMARY KEY,data DateTime null ,telefono nvarchar (50) not NULL default '',cliente nvarchar (20) not NULL default '') ")
		Sub019("ALTER TABLE telefonate ADD accettata bit not NULL default 0")
		Sub019("ALTER TABLE telefonate ADD descliente nvarchar (50) not NULL default ''")
		Sub019("CREATE TABLE gruppovar(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from gruppovar ") = 0 Then
			Dim i3 As Int
			For i3 = 0 To 13
				Main.vSql1.ExecNonQuery("insert into gruppovar(codice,descrizione) values(" & i3 & ",'Gruppo " & i3 & "')")
			Next
		End If
		Sub019("ALTER TABLE anagra ADD gruppov int not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,3))='msg'") = 0 Then
			Dim list3 As List
			Dim map3 As Map
			list3.Initialize
			Dim i4 As Int
			For i4 = 0 To 9
				map3.Initialize
				map3.Put("codint", "msg" & i4)
				map3.Put("descrizione", "Messaggio " & i4)
				map3.Put("reparto", 97)
				map3.Put("iva", 1)
				map3.Put("plupeso", 0)
				map3.Put("list1", 0)
				map3.Put("flgusointerno", True)
				map3.Put("codint", "msg" & i4)
				list3.Add(map3)
			Next
			dbutil.Sub010(Main.vSql1, "anagra", list3)
		End If
		Sub019("ALTER TABLE anagra ADD variazioni bit not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD variazioni bit not NULL default 0")
		Sub019("ALTER TABLE headmov ADD datam3 DateTime not null default '1900-01-01'")
		Sub019("ALTER TABLE venduto ADD datam3 DateTime not null default '1900-01-01'")
		Sub021("ALTER TABLE headmov ADD datam3 DateTime not null default '1900-01-01'")
		Sub021("ALTER TABLE venduto ADD datam3 DateTime not null default '1900-01-01'")
		Sub019("ALTER TABLE Ventmp ADD datam3 DateTime not null default '1900-01-01'")
		Sub021("ALTER TABLE CausaliPagamenti ADD datam3 DateTime not null default '1900-01-01'")
		Sub019("ALTER TABLE CausaliPagamenti ADD datam3 DateTime not null default '1900-01-01'")
		Sub019("update headmov set datam3 =substr(datam2,7,4) || '-' || substr(datam2,1,2) || '-'|| substr(datam2,4,2)|| ' '|| substr(datam2,11,9)")
		Sub019("update venduto set datam3 =substr(datam2,7,4) || '-' || substr(datam2,1,2) || '-'|| substr(datam2,4,2)|| ' '|| substr(datam2,11,9)")
		Sub019("update CausaliPagamenti set datam3 =substr(datam,7,4) || '-' || substr(datam,1,2) || '-'|| substr(datam,4,2)")
		Sub021("update headmov set datam3 =substr(datam2,7,4) || '-' || substr(datam2,1,2) || '-'|| substr(datam2,4,2)|| ' '|| substr(datam2,11,9)")
		Sub021("update venduto set datam3 =substr(datam2,7,4) || '-' || substr(datam2,1,2) || '-'|| substr(datam2,4,2)|| ' '|| substr(datam2,11,9)")
		Sub021("update CausaliPagamenti set datam3 =substr(datam,7,4) || '-' || substr(datam,1,2) || '-'|| substr(datam,4,2)")
		Main.vSql1.ExecNonQuery("update versione set versione = 3")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 3 Then
		Sub019("ALTER TABLE Despagine ADD noazzera bit not NULL default 0")
		Sub019("ALTER TABLE Stampe ADD flgmailc bit not NULL default 0")
		Sub019("update Stampe set flgmailc=flgchiusura")
		Main.vSql1.ExecNonQuery("update versione set versione = 4")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 4 Then
		Sub019("update Operatori set funzioni = substr(funzioni,1,37) || '0' || substr(funzioni,39,10) where substr(funzioni,38,1)='1' and length(funzioni) >47")
		Sub019("update operatori set funzioni = funzioni || '0' where length(funzioni)=37")
		Sub019("CREATE TABLE oraasporto(codice nvarchar (5)  PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from oraasporto ") = 0 Then
			Dim i5 As Int
			For i5 = 0 To 23
				Dim i6 As Int
				For i6 = 0 To 3
					Dim i7 As Int = i6 * 15
					Main.vSql1.ExecNonQuery("insert into oraasporto(codice,descrizione) values('" & i5 & ":" & i7 & "','" & NumberFormat(i5, 2, 0) & ":" & NumberFormat(i7, 2, 0) & "')")
				Next
			Next
		End If
		Sub019("ALTER TABLE confstampe ADD espandi bit not NULL default 0")
		Sub019("ALTER TABLE anagra ADD stampaesclusiva bit not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD stampaesclusiva bit not NULL default 0")
		Sub019("ALTER TABLE Venduto ADD stampaesclusiva bit not NULL default 0")
		Sub021("ALTER TABLE Venduto ADD stampaesclusiva bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampa ADD stampaesclusiva bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm1 ADD stampaesclusiva bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm2 ADD stampaesclusiva bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm3 ADD stampaesclusiva bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm4 ADD stampaesclusiva bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm5 ADD stampaesclusiva bit not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm6 ADD stampaesclusiva bit not NULL default 0")
		Sub019("ALTER TABLE daStampare ADD stampaesclusiva bit not NULL default 0")
		Sub019("ALTER TABLE anagra ADD stampante2 int not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD stampante2 int not NULL default 0")
		Sub019("ALTER TABLE Venduto ADD stampante2 int not NULL default 0")
		Sub021("ALTER TABLE Venduto ADD stampante2 int not NULL default 0")
		Sub019("ALTER TABLE tmpStampa ADD stampante2 int not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm1 ADD stampante2 int not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm2 ADD stampante2 int not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm3 ADD stampante2 int not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm4 ADD stampante2 int not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm5 ADD stampante2 int not NULL default 0")
		Sub019("ALTER TABLE tmpStampaPalm6 ADD stampante2 int not NULL default 0")
		Sub019("ALTER TABLE daStampare ADD stampante2 int not NULL default 0")
		Sub019("ALTER TABLE Despagine ADD listino int not NULL default 0")
		Sub019("ALTER TABLE tavoli ADD addturni bit not NULL default 0")
		Sub019("ALTER TABLE anagra ADD stampasubito bit not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from Palmari where Serial = 10007") = 0 Then
			Dim i8 As Int
			For i8 = 7 To 9
				Sub019("Insert into " & TAB & "Palmari(Serial) values(1000" & i8 & ")")
			Next
			Sub019("CREATE TABLE tmpStampaPalm7 (codice nvarchar (20)  Null ," & TAB & "descrizione nvarchar (50)  Null ,qta numeric(18, 3) Null ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '',turno int NOT NULL DEFAULT 1, " & TAB & "ingredientisunf Bit Not Null DEFAULT 0, " & TAB & "stampaesclusiva Bit Not Null DEFAULT 0, " & TAB & "stampante2 Int Not Null DEFAULT 0)")
			Sub019("CREATE TABLE tmpStampaPalm8 (codice nvarchar (20)  Null ," & TAB & "descrizione nvarchar (50)  Null ,qta numeric(18, 3) Null ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '',turno int NOT NULL DEFAULT 1, " & TAB & "ingredientisunf Bit Not Null DEFAULT 0, " & TAB & "stampaesclusiva Bit Not Null DEFAULT 0, " & TAB & "stampante2 Int Not Null DEFAULT 0)")
			Sub019("CREATE TABLE tmpStampaPalm9 (codice nvarchar (20)  Null ," & TAB & "descrizione nvarchar (50)  Null ,qta numeric(18, 3) Null ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '',turno int NOT NULL DEFAULT 1, " & TAB & "ingredientisunf Bit Not Null DEFAULT 0, " & TAB & "stampaesclusiva Bit Not Null DEFAULT 0, " & TAB & "stampante2 Int Not Null DEFAULT 0)")
		End If
		Sub019("ALTER TABLE confstampe ADD tavoli bit not NULL default 1")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from stampe where codice = 10") = 0 Then
			Sub019("insert into Stampe(codice,descrizione) values(7,'REPARTI')")
			Sub019("insert into Stampe(codice,descrizione) values(8,'IVA')")
			Sub019("insert into Stampe(codice,descrizione) values(9,'ARTICOLI')")
			Sub019("insert into Stampe(codice,descrizione) values(10,'GUADAGNO REPARTI')")
		End If
		If Main.vSql1.ExecQuerySingleResult("select count(*) from confstampe where codice = 10") = 0 Then
			Dim i9 As Int
			For i9 = 10 To 18
				Sub019("insert into confstampe(codice,descrizione) values(" & i9 & ",'Stampante " & i9 & "')")
			Next
		End If
		Sub019("CREATE TABLE [headmnu] (" & TAB & "[codmnu] Int Not Null PRIMARY KEY, " & TAB & "[descrizione] nvarchar(50) Not Null DEFAULT '', " & TAB & "[attiva] Bit Not Null DEFAULT 0)")
		Sub019("CREATE TABLE [dettmnu] ( [codmnu] Int, " & TAB & "[codint] nvarchar(20), " & TAB & "[descrizione] nvarchar(50) Not Null DEFAULT '', " & TAB & "[prezzo] numeric(18, 2) Not Null DEFAULT 0, " & TAB & "[indice] int Not Null DEFAULT 0,[desreparto] nvarchar(50) Not Null DEFAULT '', " & TAB & "[chiave] integer Not Null PRIMARY KEY AUTOINCREMENT)")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from headmnu") = 0 Then
			Dim i10 As Int
			For i10 = 0 To 9
				Main.vSql1.ExecNonQuery("insert into headmnu(codmnu,descrizione) values(" & i10 & ",'Menu " & i10 & "')")
			Next
		End If
		Sub019("ALTER TABLE reparti ADD indice int not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,3))='mnu'") = 0 Then
			Dim list4 As List
			Dim map4 As Map
			list4.Initialize
			Dim i11 As Int
			For i11 = 0 To 9
				map4.Initialize
				map4.Put("codint", "mnu" & i11)
				map4.Put("descrizione", "Menu " & i11)
				map4.Put("reparto", 96)
				map4.Put("iva", 1)
				map4.Put("plupeso", 0)
				map4.Put("list1", 0)
				map4.Put("flgusointerno", True)
				list4.Add(map4)
			Next
			dbutil.Sub010(Main.vSql1, "anagra", list4)
			Sub019("update reparti set indice =codice")
		End If
		Sub019("ALTER TABLE headmov ADD asporto int not NULL default 0")
		Sub019("ALTER TABLE HeaddaStampare ADD oldasporto int not NULL default -1")
		Sub021("ALTER TABLE headmov ADD asporto int not NULL default 0")
		Dim i12 As Int
		For i12 = 201 To 300
			Sub019("insert into tavoli(tavolo) values(" & i12 & ")")
		Next
		Main.vSql1.ExecNonQuery("update versione set versione = 5")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 5 Then
		Sub019("ALTER TABLE anagra ADD indice int not NULL default 9")
		Sub019("ALTER TABLE Ventmp ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE Venduto ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub021("ALTER TABLE Venduto ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE tmpStampa ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE tmpStampaPalm1 ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE tmpStampaPalm2 ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE tmpStampaPalm3 ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE tmpStampaPalm4 ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE tmpStampaPalm5 ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE tmpStampaPalm6 ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE tmpStampaPalm7 ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE tmpStampaPalm8 ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE tmpStampaPalm9 ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE daStampare ADD gruppomenu nvarchar (10) Not Null default ''")
		Sub019("ALTER TABLE dettmnu ADD auto bit not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD escpos bit not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from stampe where codice = 11") = 0 Then
			Sub019("insert into Stampe(codice,descrizione) values(11,'FINANZIARIO')")
			Sub019("ALTER TABLE Stampe ADD tipob bit not NULL default 0")
			Sub019("update Stampe set tipob=1 where codice =7")
			Sub019("update Stampe set tipob=1 where codice =8")
			Sub019("update Stampe set tipob=1 where codice =9")
			Sub019("update Stampe set tipob=1 where codice =10")
		End If
		If Main.vSql1.ExecQuerySingleResult("select count(*) from stampe where codice = 12") = 0 Then
			Sub019("insert into Stampe(codice,descrizione) values(12,'FASCE ORARIE')")
		End If
		If Main.vSql1.ExecQuerySingleResult("select count(*) from stampe where codice = 13") = 0 Then
			Sub019("insert into Stampe(codice,descrizione) values(13,'MOVIMENTI')")
		End If
		Sub019("ALTER TABLE clienti ADD attivo bit not NULL default 1")
		Sub019("ALTER TABLE Despagine ADD nopalmari bit not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD Oldqta numeric(18, 3) Not Null default 0")
		Sub019("ALTER TABLE daStampare ADD QtaConDecimali numeric(18, 3) Not Null default 0 ")
		Sub019("ALTER TABLE tavoli ADD manuallock bit not NULL default 0")
		Main.vSql1.ExecNonQuery("update versione set versione = 6")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 6 Then
		Sub019("CREATE TABLE [headord] ([codordine] int NOT NULL PRIMARY KEY,[descrizione] nvarchar(50) NOT NULL DEFAULT '',[elaborato] numeric(18, 0) not NULL default 0)")
		Dim i13 As Int
		For i13 = 0 To 9
			Sub019("insert into headord(codordine,descrizione) values(" & i13 & ",'Ordine " & i13 & "')")
		Next
		Sub019("CREATE TABLE dettord (codordine int NULL ,codint nvarchar (20) null ,descrizione nvarchar (50) not NULL default '',qta int Not Null default 0,chiave INTEGER PRIMARY KEY)")
		Sub019("ALTER TABLE anagra ADD peso numeric(18, 3) Not Null default 0")
		Sub019("ALTER TABLE anagra ADD qtacartone int Not Null default 0")
		Sub019("ALTER TABLE anagra ADD qtaottimale int Not Null default 0")
		Sub019("ALTER TABLE anagra ADD qtaminima numeric(18, 3) Not Null default 0")
		Sub019("ALTER TABLE ean ADD qta numeric(18, 3) Not Null default 1")
		Sub019("ALTER TABLE ean ADD importo numeric(18, 2) Not Null default 0")
		Sub019("CREATE TABLE TmpFraziona ( codice nvarchar (20)  NULL ,descrizione nvarchar (50)  NULL ,codint nvarchar (30)  NULL ,prezzov numeric(18, 4) NULL, Sel numeric(18, 4) NOT NULL DEFAULT 0,chiave INTEGER PRIMARY KEY)")
		Sub019("ALTER TABLE anagra ADD fraziona bit not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD fraziona Bit Not Null default 0")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from headmnu") <= 10 Then
			Dim i14 As Int
			For i14 = 10 To 29
				Sub019("insert into headmnu(codmnu,descrizione) values(" & i14 & ",'Menu " & i14 & "')")
			Next
		End If
		If Main.vSql1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,3))='mnu'") <= 10 Then
			Dim list5 As List
			Dim map5 As Map
			list5.Initialize
			Dim i15 As Int
			For i15 = 10 To 29
				map5.Initialize
				map5.Put("codint", "mnu" & i15)
				map5.Put("descrizione", "Menu " & i15)
				map5.Put("reparto", 96)
				map5.Put("iva", 1)
				map5.Put("plupeso", 0)
				map5.Put("list1", 0)
				map5.Put("flgusointerno", True)
				list5.Add(map5)
			Next
			dbutil.Sub010(Main.vSql1, "anagra", list5)
			Sub019("update reparti set indice =codice")
		End If
		Sub019("update Operatori set funzioni = rtrim(ltrim(substr(funzioni,1,39))) || '01111' where substr(funzioni,40,4)=''")
		Sub019("ALTER TABLE confstampe ADD consolida bit not NULL default 0")
		Main.vSql1.ExecNonQuery("update versione set versione = 7")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 7 Then
		Sub019("ALTER TABLE confstampe ADD riepAT bit not NULL default 0")
		Sub019("update pagamenti set descrizione = 'Prepagato',obbligo=0,buonosr=0 where codice = 29 and descrizione = 'DA INSERIRE'")
		Sub019("ALTER TABLE anagra ADD obbligoprz bit not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD obbligoprz Bit Not Null default 0")
		Sub019("ALTER TABLE anagra ADD obbligoqta bit not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD obbligoqta Bit Not Null default 0")
		Sub019("ALTER TABLE tavoli ADD stampap bit not NULL default 0")
		Sub019("ALTER TABLE Despagine ADD servizio int not NULL default 0")
		Sub019("update operatori set funzioni = funzioni || '11111' where length(funzioni)<=39")
		Sub019("ALTER TABLE daStampare ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE tmpStampaPalm1 ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE tmpStampaPalm2 ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE tmpStampaPalm3 ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE tmpStampaPalm4 ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE tmpStampaPalm5 ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE tmpStampaPalm6 ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE tmpStampaPalm7 ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE tmpStampaPalm8 ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE tmpStampaPalm9 ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE tmpStampa ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE headmov ADD totaleNF numeric(18, 4) not Null default 0")
		Sub021("ALTER TABLE headmov ADD totaleNF numeric(18, 4) not Null default 0")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from stampe where codice = 14") = 0 Then
			Sub019("insert into Stampe(codice,descrizione,tipob) values(14,'FINANZIARIO',1)")
		End If
		Sub019("CREATE TABLE Prenota (chiave INTEGER PRIMARY KEY ,data datetime NULL,memo nvarchar (200) not NULL default '',tavolo int not null default 0,sedie int not null default 0,cliente nvarchar (20) not NULL default '')")
		Main.vSql1.ExecNonQuery("update versione set versione = 8")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 8 Then
		Sub019("ALTER TABLE tavoli ADD sedie int not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from operatori where codice =10") = 0 Then
			Dim i16 As Int
			For i16 = 10 To 40
				Sub019("INSERT INTO [operatori] ([codice],[pwd],[descrizione],[funzioni]) VALUES(" & i16 & ",'11111','operatore " & i16 & "','11111111111111111111111     1111111111')")
			Next
		End If
		Sub019("ALTER TABLE HeaddaStampare ADD sospeso bit not NULL default 0")
		Sub021("ALTER TABLE headmov ADD FattFM bit not NULL default 1")
		Sub019("ALTER TABLE anagra ADD datapubblicazione nvarchar (8) not NULL default ''")
		Sub019("ALTER TABLE anagra ADD periodicita int not NULL default 0")
		Sub019("ALTER TABLE Cassetto ADD memo nvarchar (100) not NULL default ''")
		Sub019("ALTER TABLE clienti ADD stampariep int not NULL default 0")
		Sub019("ALTER TABLE pagamenti ADD copiascontrino int not NULL default 0")
		Sub019("ALTER TABLE Stampe ADD flgcopia bit not NULL default 0")
		Sub019("CREATE TABLE LastTmp (tipomovimento  nvarchar (5) ," & TAB & "cliente nvarchar (20) not NULL default '' ,recall bit not NULL default 0,chiave INTEGER PRIMARY KEY)")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from LastTmp") = 0 Then
			Sub019("INSERT INTO [LastTmp] (tipomovimento,cliente,recall) VALUES('','',0)")
		End If
		Sub019("ALTER TABLE Venduto ADD flgmag Bit Not Null default 0")
		Sub021("ALTER TABLE Venduto ADD flgmag Bit Not Null default 0")
		Sub019("update Operatori set funzioni = substr(funzioni,1,27) || '1' || substr(funzioni,29,20)")
		Main.vSql1.ExecNonQuery("update versione set versione = 9")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 9 Then
		If Main.vSql1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='eliminati'") = 0 Then
			Sub019("CREATE TABLE eliminati (chiave INTEGER PRIMARY KEY ,codint nvarchar (20) not NULL default ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "nmov numeric(18,0) not null default 0,datam datetime NULL ,operatore int not null default 1," & CRLF & TAB & TAB & TAB & TAB & TAB & "qta numeric(18, 3) not null default 0,importo numeric(18, 2) not NULL default 0,tavolo int not null default 1)")
		End If
		Sub019("ALTER TABLE Palmari ADD IP nvarchar (20) not NULL default ''")
		Sub019("update Palmari set Attivo = 0 where IP = ''")
		Sub019("ALTER TABLE anagra ADD locked Bit not NULL default 0")
		Sub019("ALTER TABLE pagine ADD locked Bit not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='ArtBloccati'") = 0 Then
			Sub019("CREATE TABLE ArtBloccati (chiave INTEGER PRIMARY KEY ,codint nvarchar (20) not NULL default ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "cassa nvarchar (5) not NULL default '',dacancellare Bit not null default 0)")
		End If
		Sub019("ALTER TABLE tavoli ADD coperti int not NULL default 0")
		Sub019("CREATE TABLE filtristampeBT (codice int NULL ,reparto int not NULL default 0 ,chiave INTEGER PRIMARY KEY ,descrizione nvarchar (50) not NULL default '' )")
		Sub019("ALTER TABLE Palmari ADD AttivaBT bit not NULL default 0")
		Sub019("ALTER TABLE anagra ADD dll nvarchar (100) not NULL default ''")
		Sub019("ALTER TABLE anagra ADD textsize int not NULL default 0")
		Sub019("ALTER TABLE anagra ADD colore int not NULL default 0")
		Sub019("ALTER TABLE anagra ADD colorec int not NULL default 0")
		Sub019("ALTER TABLE anagra ADD colores int not NULL default 0")
		Sub019("ALTER TABLE anagra ADD coloret int not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD TuttiTurni bit not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from headmnu") <= 30 Then
			Dim i17 As Int
			For i17 = 30 To 99
				Sub019("insert into headmnu(codmnu,descrizione) values(" & i17 & ",'Menu " & i17 & "')")
			Next
		End If
		If Main.vSql1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,3))='mnu'") <= 30 Then
			Dim list6 As List
			Dim map6 As Map
			list6.Initialize
			Dim i18 As Int
			For i18 = 30 To 99
				map6.Initialize
				map6.Put("codint", "mnu" & i18)
				map6.Put("descrizione", "Menu " & i18)
				map6.Put("reparto", 96)
				map6.Put("iva", 1)
				map6.Put("plupeso", 0)
				map6.Put("list1", 0)
				map6.Put("flgusointerno", True)
				list6.Add(map6)
			Next
			dbutil.Sub010(Main.vSql1, "anagra", list6)
		End If
		Sub019("ALTER TABLE clienti ADD eiva int not NULL default 0")
		Main.vSql1.ExecNonQuery("update versione set versione = 10")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 10 Then
		If Main.vSql1.ExecQuerySingleResult("select count(*) from gruppovar ") < 15 Then
			Dim i19 As Int
			For i19 = 14 To 99
				Sub019("insert into gruppovar(codice,descrizione) values(" & i19 & ",'Gruppo " & i19 & "')")
			Next
		End If
		If Main.vSql1.ExecQuerySingleResult("select count(*) from ingredienti ") < 101 Then
			Dim i20 As Int
			For i20 = 100 To 199
				Sub019("insert into ingredienti(codice,descrizione) values(" & i20 & ",'Ingrediente " & i20 & "')")
			Next
		End If
		Dim list7 As List
		Dim map7 As Map
		map7.Initialize
		list7.Initialize
		map7.Put("codint", "con")
		map7.Put("descrizione", "Convenzione")
		map7.Put("reparto", 98)
		map7.Put("iva", 1)
		map7.Put("plupeso", 0)
		map7.Put("list1", 0)
		map7.Put("flgusointerno", True)
		list7.Add(map7)
		dbutil.Sub010(Main.vSql1, "anagra", list7)
		Sub019("ALTER TABLE confstampe ADD noturno bit not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD notaglio bit not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD datavolo int not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD atavolo int not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='clients'") = 0 Then
			Sub019("CREATE TABLE clients (codice int NOT NULL PRIMARY KEY,descrizione nvarchar(50) NOT NULL DEFAULT '',IP nvarchar(20) NOT NULL DEFAULT '',stato int not NULL default 0)")
			Dim i21 As Int
			For i21 = 1 To 9
				Sub019("insert into clients(codice,descrizione) values(" & i21 & ",'Terminale " & i21 & "')")
			Next
		End If
		Sub019("ALTER TABLE clients ADD compare numeric(18,0) not NULL default 0")
		Sub021("CREATE TABLE progressivi (codice nvarchar (2) PRIMARY KEY ,valore int NULL )")
		Sub021("insert into progressivi(codice,valore) values('SEND',0)")
		If Main.vSql2.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='unlocktbl'") = 0 Then
			Sub021("CREATE TABLE unlocktbl(tavolo int null,chiave INTEGER PRIMARY KEY)")
		End If
		If Main.vSql2.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='headmovRecallAsporto'") = 0 Then
			Sub021("CREATE TABLE [headmovRecallAsporto] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[nmov] numeric(18, 0) NOT NULL PRIMARY KEY, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[nfat] int NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[tavolo] int NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[operatore] int NOT NULL DEFAULT 1, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[opdes] nvarchar(50) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[clides] nvarchar(50) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[cliente] nvarchar(20) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[flgNF] bit NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[totale] numeric(18, 4), " & CRLF & TAB & TAB & TAB & TAB & TAB & "[prep] numeric(18, 2) NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[punti] int NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[datam] datetime, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[cassa] nvarchar(100), " & CRLF & TAB & TAB & TAB & TAB & TAB & "[nfat_fm] int NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[datfat_fm] datetime, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[nscontrinoffm] int NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[dataeoraffm] datetime, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[matricolacassap] nvarchar(20), " & CRLF & TAB & TAB & TAB & TAB & TAB & "[memo] nvarchar(50) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[sospeso] bit NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[datam2] datetime NOT NULL DEFAULT '01/01/1900', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[nric] int NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[RicDaFatt] bit NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[NoStampaAsporto] bit NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[datam3] datetime NOT NULL DEFAULT '1900-01-01', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[asporto] int NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[totaleNF] numeric(18, 4) NOT NULL DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[DaCancellare] bit NOT NULL DEFAULT 0 " & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB)
		End If
		Sub021("insert into progressivi(codice,valore) values('AS',0)")
		Sub021("insert into progressivi(codice,valore) values('F',1)")
		Sub021("insert into progressivi(codice,valore) values('RIC',1)")
		Sub019("ALTER TABLE headmov ADD Locked bit not NULL default 0")
		Sub021("ALTER TABLE headmovRecallAsporto ADD Locked bit not NULL default 0")
		Sub021("insert into progressivi(codice,valore) values('V',1)")
		Sub019("CREATE TABLE TmpFinanziario(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '',qta numeric(18, 3) not null default 0,importo numeric(18, 2) not NULL default 0) ")
		Sub021("CREATE INDEX IX_NmovHeadmov ON headmov (nmov)")
		Sub021("CREATE INDEX IX_NmovVenduto ON venduto (nmov)")
		Sub021("CREATE INDEX IX_NmovCP ON CausaliPagamenti (nmov)")
		Main.vSql1.ExecNonQuery("update versione set versione = 11")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 11 Then
		Sub019("ALTER TABLE pagamenti ADD resto Bit Not Null default 1")
		Sub019("CREATE INDEX IX_daStampare ON daStampare (Id,idRiga)")
		Main.vSql1.ExecNonQuery("update versione set versione = 12")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 12 Then
		Sub019("ALTER TABLE clienti ADD DaInviare bit not NULL default 0")
		Sub019("ALTER TABLE reparti ADD TurnoP int not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,3))='zon'") = 0 Then
			Dim list8 As List
			Dim map8 As Map
			list8.Initialize
			Dim i22 As Int
			For i22 = 1 To 9
				map8.Initialize
				map8.Put("codint", "zon" & i22)
				map8.Put("descrizione", "Supplemento Zona " & i22)
				map8.Put("reparto", 95)
				map8.Put("iva", 1)
				map8.Put("plupeso", 0)
				map8.Put("list1", 0)
				map8.Put("flgusointerno", True)
				list8.Add(map8)
			Next
			dbutil.Sub010(Main.vSql1, "anagra", list8)
		End If
		Sub019("ALTER TABLE clienti ADD zona int not NULL default 0")
		Sub019("ALTER TABLE clienti ADD CodMaster nvarchar (20) not NULL default ''")
		Sub021("ALTER TABLE CausaliPagamenti ADD NonRiscosso bit not NULL default 0")
		Sub019("ALTER TABLE pagamenti ADD CausaleEft int not NULL default 0")
		Sub019("ALTER TABLE pagamenti ADD IpEft nvarchar (20) not NULL default ''")
		Sub019("ALTER TABLE operatori ADD CodAutomatico nvarchar (20) not NULL default ''")
		Dim i23 As Int
		For i23 = 301 To 500
			Sub019("insert into tavoli(tavolo) values(" & i23 & ")")
		Next
		Main.vSql1.ExecNonQuery("update versione set versione = 14")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 14 Then
		Sub019("ALTER TABLE operatori ADD Attivo bit not NULL default 1")
		Sub019("ALTER TABLE pagamenti ADD PortaEft int not NULL default 1000")
		Sub019("ALTER TABLE confstampe ADD GroupR bit not NULL default 0")
		If Sub019("ALTER TABLE confstampe ADD asportoS bit not NULL default 0") Then
			Sub019("update confstampe set asportoS=asporto")
		End If
		Sub019("CREATE TABLE Toolbar(chiave INTEGER PRIMARY KEY,codice Int not null default 0 ,descrizione nvarchar (50) not NULL default '',tipo int not null default 0,valore int not null default 0) ")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from Toolbar ") = 0 Then
			Dim i24 As Int
			For i24 = 0 To 20
				Main.vSql1.ExecNonQuery("insert into Toolbar(codice,descrizione) values(" & i24 & ",'Tasto " & i24 & "')")
			Next
		End If
		Sub019("update Operatori set funzioni = substr(funzioni,1,28) || '1' || substr(funzioni,30,20)")
		Main.vSql1.ExecNonQuery("update versione set versione = 15")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 15 Then
		Sub019("update Operatori set funzioni = '1111111111111111111111111111111111111010' where codice >9")
		Main.vSql1.ExecNonQuery("update versione set versione = 16")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 16 Then
		Sub019("update pagine set dll= 'pag_' || substr(dll,3,5) where substr(dll,1,2)='p_'  and substr(dll,4,4)='.png'")
		Sub019("ALTER TABLE operatori ADD CodAutoPermanente bit not NULL default 0")
		Sub021("ALTER TABLE headmov ADD sent bit not NULL default 0")
		Sub019("ALTER TABLE pagamenti ADD SempreDocFisc bit not NULL default 0")
		Sub019("ALTER TABLE pagamenti ADD BuonoComeP int not NULL default 0")
		Sub019("update dettord set codint ='98' || substr('00000' || codint ,-5)  where (select count(*) from anagra where reparto=0 and  anagra.codint = dettord.codint) >0")
		Sub019("update ean set codint ='98' || substr('00000' || codint ,-5)  where (select count(*) from anagra where reparto=0 and  anagra.codint = ean.codint) >0")
		Sub019("update eliminati set codint ='98' || substr('00000' || codint ,-5)  where (select count(*) from anagra where reparto=0 and  anagra.codint = eliminati.codint) >0")
		Sub019("update venduto set codint ='98' || substr('00000' || codint ,-5)  where reparto=0 ")
		Sub021("update venduto set codint ='98' || substr('00000' || codint ,-5)  where reparto=0 ")
		Sub019("update pagine set valore = '98' || substr('00000' || cast(valore as nvarchar),-5) where tipo=2 and (select count(*) from anagra where reparto=0 and  anagra.codint = pagine.valore) >0")
		Sub019("update anagra set codint ='98' || substr('00000' || codint ,-5)  where reparto=0 ")
		Main.vSql1.ExecNonQuery("update versione set versione = 18")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 18 Then
		Sub019("ALTER TABLE dettmnu ADD mnuattivo bit not NULL default 1")
		Sub019("ALTER TABLE anagra ADD obbligodes bit not NULL default 0")
		Sub021("CREATE INDEX IX_causaleHeadmov ON headmov (causale)")
		Sub021("CREATE INDEX IX_causaleVenduto ON venduto (causale)")
		Sub021("CREATE INDEX IX_datam3Headmov ON headmov (datam3)")
		Sub021("CREATE INDEX IX_datam3Venduto ON venduto (datam3)")
		Sub019("CREATE TABLE varauto(chiave INTEGER PRIMARY KEY,codint nvarchar (20) not NULL default '' ,codintvar nvarchar (20) not NULL default '') ")
		Sub019("CREATE TABLE varautoTmp(chiave INTEGER PRIMARY KEY,codint nvarchar (20) not NULL default '' ,codintvar nvarchar (20) not NULL default '') ")
		Sub019("ALTER TABLE anagra ADD variazioniauto bit not NULL default 0")
		Sub019("ALTER TABLE gruppovar ADD vEsclusive bit not NULL default 0")
		Dim list9 As List
		Dim map9 As Map
		map9.Initialize
		list9.Initialize
		map9.Put("codint", "888889")
		map9.Put("descrizione", "COPERTI BABY")
		map9.Put("reparto", 98)
		map9.Put("iva", 1)
		map9.Put("plupeso", 0)
		map9.Put("list1", 0)
		map9.Put("flgusointerno", True)
		list9.Add(map9)
		dbutil.Sub010(Main.vSql1, "anagra", list9)
		Main.vSql1.ExecNonQuery("update versione set versione = 19")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 19 Then
		Sub019("ALTER TABLE gruppovar ADD indice int not NULL default 9")
		Sub019("CREATE TABLE LinguaDescrizioniWeb(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ")
		Sub019("CREATE TABLE anagraDescrizioni(codint nvarchar (20) PRIMARY KEY ,descrizione1 nvarchar (50) not NULL default '',descrizione2 nvarchar (50) not NULL default '',descrizione3 nvarchar (50) not NULL default '',descrizione4 nvarchar (50) not NULL default '',descrizione5 nvarchar (50) not NULL default '', ingredienti1 text Not Null default '',ingredienti2 text not NULL default '',ingredienti3 text not NULL default '',ingredienti4 text not NULL default '',ingredienti5 text not NULL default '' ) ")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from LinguaDescrizioniWeb ") = 0 Then
			Main.vSql1.ExecNonQuery("insert into LinguaDescrizioniWeb(codice,descrizione) values(1,'Italiano')")
			Main.vSql1.ExecNonQuery("insert into LinguaDescrizioniWeb(codice,descrizione) values(2,'Inglese')")
			Main.vSql1.ExecNonQuery("insert into LinguaDescrizioniWeb(codice,descrizione) values(3,'Francese')")
			Main.vSql1.ExecNonQuery("insert into LinguaDescrizioniWeb(codice,descrizione) values(4,'Tedesco')")
			Main.vSql1.ExecNonQuery("insert into LinguaDescrizioniWeb(codice,descrizione) values(5,'Spagnolo')")
		End If
		Sub019("ALTER TABLE anagra ADD invioweb bit not NULL default 1")
		Sub019("ALTER TABLE reparti ADD invioweb bit not NULL default 0")
		Sub019("ALTER TABLE clienti ADD PwdWeb nvarchar (20) not NULL default ''")
		Sub019("ALTER TABLE headoff ADD attivaweb bit not NULL default 0")
		Sub019("ALTER TABLE venduto ADD cameriere int Not Null default 0")
		Sub019("ALTER TABLE Ventmp ADD cameriere int Not Null default 0")
		Sub021("ALTER TABLE venduto ADD cameriere int Not Null default 0")
		Sub019("ALTER TABLE pagamenti ADD glory bit not NULL default 0")
		Sub019("ALTER TABLE headmov ADD fromweb bit not NULL default 0")
		Sub021("ALTER TABLE headmov ADD NoStampaAsporto bit not null default 0")
		Sub019("CREATE TABLE TmpIva(codice nvarchar (50) not NULL default '' ,descrizione nvarchar (50) not NULL default '',qta numeric(18, 3) not null default 0,importo numeric(18, 2) not NULL default 0) ")
		Main.vSql1.ExecNonQuery("update versione set versione = 20")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 20 Then
		Sub021("ALTER TABLE headmovRecallAsporto ADD fromweb bit not NULL default 0")
		Sub019("ALTER TABLE venduto ADD FromWeb bit Not Null default 0")
		Sub019("ALTER TABLE versione ADD CodWeb nvarchar (5) not NULL default 'B32'")
		Sub019("CREATE TABLE allergeni(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from allergeni ") = 0 Then
			Dim i25 As Int
			For i25 = 0 To 99
				Main.vSql1.ExecNonQuery("insert into allergeni(codice,descrizione) values(" & i25 & ",'allergene " & i25 & "')")
			Next
		End If
		Sub019("CREATE TABLE allergeniplu(chiave INTEGER PRIMARY KEY,codice Int not null default -1 ,codint nvarchar (20) not NULL default '') ")
		Dim list10 As List
		Dim map10 As Map
		map10.Initialize
		list10.Initialize
		map10.Put("codint", "variaweb")
		map10.Put("descrizione", "Variazione per Web")
		map10.Put("reparto", 98)
		map10.Put("iva", 1)
		map10.Put("plupeso", 0)
		map10.Put("list1", 0)
		map10.Put("obbligodes", True)
		map10.Put("flgusointerno", True)
		map10.Put("bvar", True)
		list10.Add(map10)
		dbutil.Sub010(Main.vSql1, "anagra", list10)
		Main.vSql1.ExecNonQuery("update versione set versione = 21")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 21 Then
		Sub019("CREATE TABLE offerteUniandro (codint nvarchar (20) PRIMARY KEY ,campi nvarchar (200) not NULL default '',dadata DateTime not null default '1900-01-01',adata DateTime not null default '1900-01-01',list1 numeric(18, 2) not NULL default 0)")
		Sub019("update allergeni set descrizione='Cereali contenenti glutine' where codice =0")
		Sub019("update allergeni set descrizione='Crostacei ' where codice =1")
		Sub019("update allergeni set descrizione='Uova ' where codice =2")
		Sub019("update allergeni set descrizione='Pesce  ' where codice =3")
		Sub019("update allergeni set descrizione='Arachidi  ' where codice =4")
		Sub019("update allergeni set descrizione='Soia ' where codice =5")
		Sub019("update allergeni set descrizione='Latte ' where codice =6")
		Sub019("update allergeni set descrizione='Frutta a guscio ' where codice =7")
		Sub019("update allergeni set descrizione='Sedano ' where codice =8")
		Sub019("update allergeni set descrizione='Senape  ' where codice =9")
		Sub019("update allergeni set descrizione='Semi di sesamo ' where codice =10")
		Sub019("update allergeni set descrizione='Anidride solforosa e solfiti ' where codice =11")
		Sub019("update allergeni set descrizione='Lupini ' where codice =12")
		Sub019("update allergeni set descrizione='Molluschi  ' where codice =13")
		Main.vSql1.ExecNonQuery("update versione set versione = 22")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 22 Then
		Sub019("ALTER TABLE allergeni ADD tag bit Not Null default 0")
		Sub019("update allergeni set descrizione='Vegano ',tag=1 where codice =50")
		Sub019("update allergeni set descrizione='Vegetariano  ',tag=1 where codice =51")
		Sub019("update allergeni set descrizione='Integrale  ',tag=1 where codice =52")
		Main.vSql1.ExecNonQuery("update versione set versione = 23")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 23 Then
		If Main.vSql1.ExecQuerySingleResult("select count(*) from ingredienti ") < 201 Then
			Dim i26 As Int
			For i26 = 200 To 299
				Sub019("insert into ingredienti(codice,descrizione) values(" & i26 & ",'Ingrediente " & i26 & "')")
			Next
		End If
		Sub019("ALTER TABLE clienti ADD abstampabuono bit not NULL default 1")
		Sub019("ALTER TABLE clienti ADD tesseraaggiuntiva bit not NULL default 0")
		Sub019("ALTER TABLE clienti ADD scadcliente DateTime not null default '2099-01-01'")
		Sub019("ALTER TABLE anagra ADD Kcal int not NULL default 0")
		Sub019("ALTER TABLE anagra ADD punti Int Not Null default 0")
		Sub019("UPDATE ANAGRA SET punti = 1,list1=0 where codint = 'pre'")
		Sub019("ALTER TABLE Ventmp ADD punti int not NULL default 0")
		Sub019("ALTER TABLE Venduto ADD punti int not NULL default 0")
		Sub021("ALTER TABLE Venduto ADD punti int not NULL default 0")
		Main.vSql1.ExecNonQuery("update versione set versione = 24")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 24 Then
		Sub021("CREATE TABLE TestiDoc ([nmov] nvarchar (20) not NULL PRIMARY KEY,testo ntext not null default '')")
		Sub019("CREATE TABLE TestiCli ([codice] nvarchar (20) not NULL PRIMARY KEY,testo ntext not null default '')")
		Sub019("CREATE TABLE TestiArt ([codice] nvarchar (20) not NULL PRIMARY KEY,testo ntext not null default '')")
		Main.vSql1.ExecNonQuery("update versione set versione = 25")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 25 Then
		Sub019("ALTER TABLE Despagine ADD chiedimemo bit not NULL default 0")
		Dim sb2 As String = File.DirDefaultExternal & "/ReportPersonalizzati"
		File.Copy(File.DirAssets, "cf stampacassetto.txt", sb2, "CF StampaCassetto.txt")
		File.Copy(File.DirAssets, "cf stampa tavolichiusi (sintetica).txt", sb2, "CF Stampa TavoliChiusi (sintetica).txt")
		File.Copy(File.DirAssets, "cf stampa sospesi.txt", sb2, "CF Stampa sospesi.txt")
		File.Copy(File.DirAssets, "cf stampa pagamenti-scontrini.txt", sb2, "CF Stampa pagamenti-scontrini.txt")
		File.Copy(File.DirAssets, "cf stampa movimenti fatture.txt", sb2, "CF Stampa movimenti fatture.txt")
		File.Copy(File.DirAssets, "cf stampa finananziario iva.txt", sb2, "CF Stampa finanziario iva.txt")
		File.Copy(File.DirAssets, "cf stampa finananziario iva tipo b.txt", sb2, "CF Stampa finanziario iva tipo b.txt")
		File.Copy(File.DirAssets, "cf stampa fasce orarie reparti(tutti i reparti).txt", sb2, "CF Stampa fasce orarie reparti(tutti i reparti).txt")
		File.Copy(File.DirAssets, "cf stampa camerieri.txt", sb2, "CF Stampa camerieri.txt")
		File.Copy(File.DirAssets, "cf articoli-iva.txt", sb2, "CF Articoli-iva.txt")
		File.Copy(File.DirAssets, "cf articoli dist.base.txt", sb2, "CF Articoli dist.base.txt")
		Main.vSql1.ExecNonQuery("update versione set versione = 26")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 26 Then
		Sub019("ALTER TABLE Despagine ADD chiedimemo2 int not NULL default 0")
		Sub019("update Despagine set chiedimemo2=chiedimemo")
		Main.vSql1.ExecNonQuery("update versione set versione = 27")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 27 Then
		Sub019("update pagamenti set buonosr=0,BuonoComeP=0 where codice=0")
		Sub019("ALTER TABLE reparti ADD vincite bit not NULL default 0")
		Sub019("ALTER TABLE venduto ADD sottoconto int Not Null default 0")
		Sub019("ALTER TABLE Ventmp ADD sottoconto int Not Null default 0")
		Sub021("ALTER TABLE venduto ADD sottoconto int Not Null default 0")
		Sub019("ALTER TABLE venduto ADD sottocontoT int Not Null default 0")
		Sub019("ALTER TABLE Ventmp ADD sottocontoT int Not Null default 0")
		Sub021("ALTER TABLE venduto ADD sottocontoT int Not Null default 0")
		Sub019("ALTER TABLE confstampe ADD righeinit int not NULL default 0")
		Sub019("ALTER TABLE reparti ADD inviowebT bit not NULL default 0")
		Sub019("update reparti set inviowebT =invioweb")
		Main.vSql1.ExecNonQuery("update versione set versione = 28")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 28 Then
		Sub019("ALTER TABLE anagra ADD nVariazioni Int Not Null default 0")
		If Main.vSql1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='chiaviClient'") = 0 Then
			Sub019("CREATE TABLE chiaviClient (chiave nvarchar (30) PRIMARY KEY ,data DateTime not null default '1900-01-01')")
		End If
		If Main.vSql1.ExecQuerySingleResult("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='ExportFattureHead'") = 0 Then
			Sub019("CREATE TABLE ExportFattureHead (nfat int PRIMARY KEY ," & CRLF & "       " & TAB & TAB & TAB & TAB & "   data DateTime not null default '1900-01-01'," & CRLF & TAB & TAB & TAB & TAB & TAB & "   cliente nvarchar (20) not null default '')")
			Sub019("CREATE TABLE ExportFattureDett (chiave INTEGER PRIMARY KEY," & CRLF & "       " & TAB & TAB & TAB & TAB & "   nfat int not null default 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "   codint nvarchar (20) not null default ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "   iva int not NULL default 0 ," & CRLF & TAB & TAB & TAB & TAB & TAB & "   importo numeric(18, 4) not NULL default 0," & CRLF & "                       prezzov numeric(18, 4) not NULL default 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "   qta numeric(18, 3) not NULL default 0" & CRLF & TAB & TAB & TAB & TAB & TAB & "    )")
		End If
		Sub019("ALTER TABLE Despagine ADD daTavolo Int Not Null default 0")
		Sub019("ALTER TABLE Despagine ADD aTavolo Int Not Null default 0")
		Sub019("ALTER TABLE Despagine ADD MaxImporto numeric(18, 2) not NULL default 0")
		Sub019("ALTER TABLE Despagine ADD ImportoIngresso numeric(18, 2) not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("SELECT count(*) FROM Despagine where codice >=100") = 0 Then
			Dim i27 As Int
			For i27 = 100 To 110
				Main.vSql1.ExecNonQuery("insert into Despagine(codice,descrizione,obbligocoperti,nopalmari) values(" & i27 & ",'Gruppo Tessere " & i27 - 99 & "',1,1)")
			Next
		End If
		Sub019("ALTER TABLE clients ADD solotessere bit not NULL default 0")
		Sub019("ALTER TABLE dettmnu ADD elimina bit not NULL default 0")
		Sub019("ALTER TABLE eliminati ADD brep bit not NULL default 0")
		Main.vSql1.ExecNonQuery("update versione set versione = 29")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 29 Then
		Sub019("CREATE TABLE gruppocli(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from gruppocli ") = 0 Then
			Dim i28 As Int
			For i28 = 1 To 9
				Main.vSql1.ExecNonQuery("insert into gruppocli(codice,descrizione) values(" & i28 & ",'Gruppo " & i28 & "')")
			Next
		End If
		Sub019("ALTER TABLE clienti ADD grpcli int Not Null default 0")
		Sub019("CREATE TABLE [MPIniziative] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[ElementoScontrino] nvarchar(5) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodElementoScontrino] nvarchar(20) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codice] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[ApplicazioneSconti] nvarchar(1) NOT NULL DEFAULT '0', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[Linea] nvarchar(2) NOT NULL DEFAULT 'A', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[DataInizio] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[DataFine] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[OraInizio] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[OraFine] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[GiorniValidita] nvarchar(7) NOT NULL DEFAULT '1111111', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[Esclusivita] nvarchar(1) NOT NULL DEFAULT 'C', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceCondizione] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[Applicazione] nvarchar(1) NOT NULL DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Priorita] nvarchar(2) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[AmountType] nvarchar(1) NOT NULL DEFAULT '1'" & CRLF & TAB & TAB & TAB & TAB & TAB & ")")
		Sub019("CREATE TABLE [MPVincoli] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codice] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceCondizione] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[OggettoVincolo] nvarchar(5) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[ElementoVincolo] nvarchar(20) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[OperatoreVincolo] nvarchar(2) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[ModalitaConfrontoVincolo] nvarchar(5) NOT NULL DEFAULT 'Q', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[ConfrontoVincolo] numeric(18, 2) NOT NULL DEFAULT 0, " & CRLF & TAB & TAB & TAB & TAB & TAB & "[DataFineRedenzione] numeric(18, 0) NOT NULL DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[GruppoVincolo] int not NULL default 0" & CRLF & TAB & TAB & TAB & TAB & ")")
		Sub019("CREATE TABLE [MPRicompense] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codice] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceCondizione] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[VeriabileRicompensa] nvarchar(5) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[ElementoRicompensa] nvarchar(20) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[SogliaRicompensa] nvarchar(1) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[TipoRicompensa] nvarchar(2) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[DataInizioRedenzione] numeric(18, 0) NOT NULL DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[DataFineRedenzione] numeric(18, 0) NOT NULL DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceMessaggioCoupon] nvarchar(20) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[CumulabilitaRicompensa] nvarchar(1) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[TipoCalcoloScontoRicompensa] nvarchar(1) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[TipoStampaCouponRicompensa] nvarchar(1) NOT NULL DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Priorita] int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[GruppoOrdinamentoRicompensa] nvarchar(5) NOT NULL DEFAULT '0'" & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB)
		Sub019("CREATE TABLE [MPRicompenseGruppi] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codice] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceCondizione] nvarchar(10) NOT NULL DEFAULT '', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceGruppoRicompensa] nvarchar(5) NOT NULL DEFAULT '0', " & CRLF & TAB & TAB & TAB & TAB & TAB & "[NumeroRicompenseGruppo] int NOT NULL DEFAULT 0 " & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB)
		Sub019("CREATE TABLE [MPLimitiRicompense] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codice] nvarchar(10) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceCondizione] nvarchar(10) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[InizioLR] int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[FineLR] int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[PassoLR] int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[ValoreLR] numeric(18, 2) Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[SegnoLR] nvarchar(5) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Priorita] int Not Null DEFAULT 0" & CRLF & TAB & TAB & TAB & TAB & TAB & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB & TAB)
		Sub019("CREATE TABLE [MPTitoloIniziative] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codice] nvarchar(10) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Descrizione] nvarchar(50) NOT NULL DEFAULT ''" & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB & TAB)
		Sub019("CREATE TABLE [MPPanieri] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codice] nvarchar(20) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Tipo] nvarchar(1) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceElemento] nvarchar(20) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[PaniereQta] numeric(18, 2) Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[PaniereImporto] numeric(18, 2) Not Null DEFAULT 0" & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB & TAB)
		Sub019("CREATE TABLE [MPMixArticoli] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceArticolo] nvarchar(20) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[MixCode] nvarchar(20) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codice] nvarchar(10) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceCondizione] nvarchar(10) NOT NULL DEFAULT ''" & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB & TAB)
		Sub019("CREATE TABLE [MPMessaggiCoupon] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceCoupon] nvarchar(20) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[MessaggioCoupon] nvarchar(200) NOT NULL DEFAULT ''" & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB & TAB)
		Sub019("CREATE TABLE [MPMessaggiCliente] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[CodiceMsg] nvarchar(20) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[MessaggioMsg] nvarchar(200) NOT NULL DEFAULT ''" & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB & TAB)
		Sub019("CREATE TABLE [MPResetTable] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Query] nvarchar(2000) Not Null DEFAULT ''" & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB & TAB)
		Sub019("ALTER TABLE Ventmp ADD noscontoF bit not NULL default 0")
		Dim list11 As List
		Dim map11 As Map
		map11.Initialize
		list11.Initialize
		map11.Put("codint", "cou")
		map11.Put("descrizione", "Coupon")
		map11.Put("reparto", 98)
		map11.Put("iva", 0)
		map11.Put("plupeso", 0)
		map11.Put("list1", 0)
		map11.Put("flgusointerno", True)
		list11.Add(map11)
		dbutil.Sub010(Main.vSql1, "anagra", list11)
		Sub019("insert into progressivi(codice,valore) values('Z',1)")
		Main.vSql1.ExecNonQuery("update versione set versione = 30")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 30 Then
		Sub019("ALTER TABLE Venduto ADD aliquota2 numeric(18, 4) NULL default 0")
		Sub019("update Venduto set aliquota2 =aliquota")
		Sub021("ALTER TABLE Venduto ADD aliquota2 numeric(18, 4) NULL default 0")
		Sub021("update Venduto set aliquota2 =aliquota")
		Sub019("ALTER TABLE iva ADD aliquota2 numeric(18, 4) NULL default 0")
		Sub019("update iva set aliquota2 =aliquota")
		Sub019("CREATE TABLE [DatiBilance] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Codint] nvarchar(20) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[BilPlu] nvarchar(10) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[BilGruppo] nvarchar(6) Not Null DEFAULT '1'," & CRLF & TAB & TAB & TAB & TAB & TAB & "[BilTara]  int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[BilGGCons]  int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[BilTipo]  int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[BilTestoGen1]  int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[BilTestoGen2]  int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[BilTestoGen3]  int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[BilTestoGen4]  int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & "[Aggiornamento] int Not Null DEFAULT 0" & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB & TAB)
		Main.vSql1.ExecNonQuery("update versione set versione = 31")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 31 Then
		Sub019("ALTER TABLE DatiBilance ADD BilIngredienti ntext Not Null default ''")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from gruppocli ") < 10 Then
			Dim i29 As Int
			For i29 = 10 To 99
				Main.vSql1.ExecNonQuery("insert into gruppocli(codice,descrizione) values(" & i29 & ",'Gruppo " & i29 & "')")
			Next
		End If
		Sub019("ALTER TABLE reparti ADD scontabile bit not NULL default 0")
		Sub019("update reparti set scontabile = not NF")
		Main.vSql1.ExecNonQuery("update versione set versione = 32")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 32 Then
		Sub019("ALTER TABLE clienti ADD residuoconvenzione int not NULL default 1")
		Sub019("update clienti set residuoconvenzione=abstampabuono")
		Main.vSql1.ExecNonQuery("update versione set versione = 33")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 33 Then
		Sub019("insert into progressivi(codice,valore) values('TOTDimChar',0)")
		Sub019("insert into progressivi(codice,valore) values('TOTColor',0)")
		Sub019("ALTER TABLE confstampe ADD barcodeA bit not NULL default 0")
		Sub019("ALTER TABLE operatori ADD funzioni2  nvarchar (50) not NULL default '011111111111111111111111111111'")
		Sub019("update operatori set funzioni2 =" & CRLF & TAB & TAB & "case when substr(funzioni,33,1)='1' then" & CRLF & TAB & TAB & "'011111111111111111111111111111'" & CRLF & TAB & TAB & "else" & CRLF & TAB & TAB & "'000000000000000000000000000000'" & CRLF & TAB & TAB & "end" & TAB)
		Main.vSql1.ExecNonQuery("update versione set versione = 34")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 34 Then
		Sub019("ALTER TABLE headmov ADD sezionale nvarchar(10) Not Null DEFAULT ''")
		Sub021("ALTER TABLE headmov ADD sezionale nvarchar(10) Not Null DEFAULT ''")
		Sub019("ALTER TABLE confstampe ADD BeepStampante bit not NULL default 0")
		Sub019("ALTER TABLE StampaCP ADD FromDividi bit not NULL default 0")
		Main.vSql1.ExecNonQuery("update versione set versione = 35")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 35 Then
		Sub019("CREATE TABLE [FEdatiCli] (" & CRLF & TAB & "[Codice] nvarchar(20) NOT NULL PRIMARY KEY, " & CRLF & TAB & "[TipoSoggettoCli] int NOT NULL, " & CRLF & TAB & "[NomeCli] nvarchar(60) NOT NULL, " & CRLF & TAB & "[CognomeCli] nvarchar(60) NOT NULL, " & CRLF & TAB & "[NazioneCli] nvarchar(2) NOT NULL," & CRLF & TAB & "[CodiceDestinatario] nvarchar(7) NOT NULL," & CRLF & TAB & "[EsigibilitaIVA] int NOT NULL," & CRLF & TAB & "[PEC] nvarchar(256) NOT NULL" & CRLF & ")")
		Sub019("ALTER TABLE iva ADD natura int not NULL default 0")
		Sub019("CREATE TABLE [FEnaturaIVA] (" & CRLF & TAB & "[codice] int NOT NULL PRIMARY KEY, " & CRLF & TAB & "[descrizione] nvarchar(100) NOT NULL" & CRLF & ")")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (0,'Nessuna')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (1,'N1 - Escluse ex art. 15')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (2,'N2 - Non soggette')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (3,'N3 - Non imponibili')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (4,'N4 - Esenti')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (5,'N5 - Regime del margine/IVA non esposta in fattura')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (6,'N6 - Inversione contabile')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (7,'N7 - IVA assolta in altro stato UE')")
		Sub021("CREATE TABLE [FEDatiMov] (" & CRLF & TAB & "[TipoDoc] nvarchar(4) NOT NULL, " & CRLF & TAB & "[IDPaeseTX] nvarchar(2) NOT NULL, " & CRLF & TAB & "[CodTX] nvarchar(28) NOT NULL, " & CRLF & TAB & "[ProgInvio] nvarchar(10) NOT NULL, " & CRLF & TAB & "[Divisa] nvarchar(3) NOT NULL DEFAULT 'EUR', " & CRLF & TAB & "[DataDoc] date NOT NULL, " & CRLF & TAB & "[NumeroDoc] int NOT NULL, " & CRLF & TAB & "[BolloVirtuale] bit NOT NULL DEFAULT 0, " & CRLF & TAB & "[ImportoBollo] decimal(14, 2) NOT NULL DEFAULT 00.00," & CRLF & TAB & "[IDOrdAcq] nvarchar(20) NOT NULL," & CRLF & TAB & "[CUP] nvarchar(15) NOT NULL," & CRLF & TAB & "[CIG] nvarchar(15) NOT NULL," & CRLF & TAB & "[EsigibilitaIVA] nvarchar(1) NOT NULL," & CRLF & TAB & "[Database] int NOT NULL," & CRLF & TAB & "[IDPaeseCli] nvarchar(2) NOT NULL, " & CRLF & TAB & "[CodCli] nvarchar(28) NOT NULL, " & CRLF & TAB & "[CFCli] nvarchar(16) NOT NULL, " & CRLF & TAB & "[DenominazioneCli] nvarchar(80) NOT NULL, " & CRLF & TAB & "[NomeCli] nvarchar(60) NOT NULL, " & CRLF & TAB & "[CognomeCli] nvarchar(60) NOT NULL, " & CRLF & TAB & "[IndirizzoCli] nvarchar(60) NOT NULL, " & CRLF & TAB & "[CAPCli] nvarchar(5) NOT NULL, " & CRLF & TAB & "[ComuneCli] nvarchar(60) NOT NULL, " & CRLF & TAB & "[ProvinciaCli] nvarchar(2) NOT NULL, " & CRLF & TAB & "[NazioneCli] nvarchar(2) NOT NULL, " & CRLF & TAB & "[Sezionale] nvarchar(15) NOT NULL," & CRLF & TAB & "[NomeFile] nvarchar(50) NOT NULL," & CRLF & TAB & "[Chiave] nvarchar(50) NOT NULL," & CRLF & TAB & "CONSTRAINT [sqlite_autoindex_DatiFE_1] PRIMARY KEY ([Chiave]))")
		Sub019("CREATE TABLE [FERegFiscale] (" & CRLF & TAB & "[Codice] int NOT NULL PRIMARY KEY, " & CRLF & TAB & "[Sigla] nvarchar(4) NOT NULL, " & CRLF & TAB & "[Descrizione] nvarchar(100) NOT NULL" & CRLF & ")")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (0,'','Nessuno')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (1,'RF01','Ordinario')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (2,'RF02','Contribuenti minimi')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (3,'RF04','Agricoltura e attività connesse e pesca')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (4,'RF05','Vendita sali e tabacchi')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (5,'RF06','Commercio fiammiferi')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (6,'RF07','Editoria')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (7,'RF08','Gestione servizi telefonia pubblica')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (8,'RF09','Rivendita documenti di trasporto pubblico e di sosta')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (9,'RF10','Intrattenimenti, giochi e altre attività di cui alla tariffa allegata al DPR 640/72')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (10,'RF11','Agenzie viaggi e turismo')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (11,'RF12','Agriturismo')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (12,'RF13','Vendite a domicilio')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (13,'RF14','Rivendita beni usati, oggetti d''arte, d''antiquariato o da collezione')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (14,'RF15','Agenzie di vendite all''asta di oggetti d''arte , antiquariato o da collezione')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (15,'RF16','IVA per cassa P.A.')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (16,'RF17','IVA per cassa')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (17,'RF18','Altro')")
		Sub019("INSERT INTO [FERegFiscale] ([Codice],[Sigla],[Descrizione]) VALUES (18,'RF19','Regime forfettario')")
		Sub019("CREATE TABLE [STATIISO] (" & CRLF & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & "[ID] nvarchar(20) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[DESCRIZIONE] nvarchar(20) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[ALPHA3] nvarchar(3) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & "[CEE] bit Not Null DEFAULT 0" & CRLF & TAB & TAB & TAB & TAB & TAB & ")" & CRLF & TAB & TAB & TAB & TAB & TAB)
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from STATIISO") = 0 Then
			Dim vReadList As List = File.ReadList(File.DirAssets, "StatiIISO_Insert.sql")
			Dim size As Int = vReadList.Size - 1
			Dim i30 As Int
			For i30 = 0 To size
				Sub019(vReadList.Get(i30))
			Next
		End If
		Main.vSql1.ExecNonQuery("update versione set versione = 36")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 36 Then
		Sub019("CREATE TABLE um(codice Int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '') ")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from um ") = 0 Then
			Main.vSql1.ExecNonQuery("insert into um(codice,descrizione) values(0,'pezzo')")
			Main.vSql1.ExecNonQuery("insert into um(codice,descrizione) values(1,'kilogrammo')")
			Main.vSql1.ExecNonQuery("insert into um(codice,descrizione) values(2,'litro')")
			Main.vSql1.ExecNonQuery("insert into um(codice,descrizione) values(3,'metro')")
			Dim i31 As Int
			For i31 = 4 To 9
				Main.vSql1.ExecNonQuery("insert into um(codice,descrizione) values(" & i31 & ",'U.M. " & i31 & "')")
			Next
		End If
		Sub019("ALTER TABLE anagra ADD misura int not NULL default 0")
		Sub019("CREATE TABLE [FEDatiTX] (" & CRLF & TAB & "[TipoEser] int NOT NULL default 0, " & CRLF & TAB & "[IDPaeseTX] nvarchar(2) NOT NULL default '', " & CRLF & TAB & "[CodiceTX] nvarchar(28) NOT NULL default '', " & CRLF & TAB & "[NazioneEser] nvarchar(2) NOT NULL default 'IT', " & CRLF & TAB & "[CodForn] nvarchar(28) NOT NULL default '', " & CRLF & TAB & "[Tipo] nvarchar(2) NOT NULL default '', " & CRLF & TAB & "[CFEser] nvarchar(16) NOT NULL default '', " & CRLF & TAB & "[PIVAEser] nvarchar(16) NOT NULL default '', " & CRLF & TAB & "[DenEser] nvarchar(50) NOT NULL default '', " & CRLF & TAB & "[NomeEser] nvarchar(50) NOT NULL default '', " & CRLF & TAB & "[CognomeEser] nvarchar(50) NOT NULL default '', " & CRLF & TAB & "[ViaEser] nvarchar(60) NOT NULL default '', " & CRLF & TAB & "[CapEser] nvarchar(5) NOT NULL default '', " & CRLF & TAB & "[CittaEser] nvarchar(60) NOT NULL default '', " & CRLF & TAB & "[ProvinciaEser] nvarchar(2) NOT NULL default '', " & CRLF & TAB & "[RegFiscEser] int NOT NULL default 0,  " & CRLF & TAB & "[IDNazioneEser] nvarchar(2) NOT NULL default '', " & CRLF & TAB & "[UfficioREA] nvarchar(2) NOT NULL default '', " & CRLF & TAB & "[NumeroREA] nvarchar(20) NOT NULL default '', " & CRLF & TAB & "[CapSocREA] decimal(12, 2) NOT NULL default 0, " & CRLF & TAB & "[SocUnicoREA] int NOT NULL default 0, " & CRLF & TAB & "[StatoLiquidazioneREA] int NOT NULL default 0, " & CRLF & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT" & CRLF & ")")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from FEDatiTX ") = 0 Then
			Main.vSql1.ExecNonQuery("INSERT INTO [FEDatiTX]" & TAB & "([TipoEser]) VALUES(0)")
		End If
		Sub019("insert into pagamenti(codice,descrizione,cassa) values(31,'Iva Split Payment',0)")
		Sub019("ALTER TABLE Ventmp ADD MixCode int not NULL default 0")
		Sub019("ALTER TABLE HeaddaStampare ADD RistampaTutto bit not NULL default 0")
		Sub019("ALTER TABLE versione ADD dataFE DateTime Not Null DEFAULT '01/01/2019'")
		Sub019("ALTER TABLE confstampe ADD StampaImmagine bit not NULL default 0")
		Sub019("update anagra set indice = indice + 990")
		Main.vSql1.ExecNonQuery("update versione set versione = 37")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 37 Then
		Sub019("update operatori set funzioni2 =" & CRLF & TAB & TAB & "substr(funzioni2,1,17) || substr(funzioni,19,1)|| '11' || substr(funzioni,31,1) || '1' ||'11111111'")
		Main.vSql1.ExecNonQuery("update versione set versione = 38")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 38 Then
		Sub019("ALTER TABLE dettmnu ADD qtatmp int not NULL default 0")
		Sub021("CREATE TABLE [Cassetto] (" & CRLF & TAB & TAB & "[Operatore] int NOT NULL DEFAULT 1, " & CRLF & TAB & TAB & "[TipoAttivita] char, " & CRLF & TAB & TAB & "[Importo] numeric(18, 2), " & CRLF & TAB & TAB & "[DataOra] datetime, " & CRLF & TAB & TAB & "[chiave] integer NOT NULL PRIMARY KEY AUTOINCREMENT, " & CRLF & TAB & TAB & "[TipoMoneta] int, " & CRLF & TAB & TAB & "[Qta] numeric(18, 0), " & CRLF & TAB & TAB & "[PrezzoUnitario] numeric(18, 2), " & CRLF & TAB & TAB & "[NumDistinta] numeric(18, 0), " & CRLF & TAB & TAB & "[Cassa] int NOT NULL DEFAULT 1, " & CRLF & TAB & TAB & "[memo] nvarchar(100) NOT NULL DEFAULT ''" & CRLF & TAB & TAB & ")")
		Sub021("ALTER TABLE headmovRecallAsporto ADD sezionale nvarchar(10) Not Null DEFAULT ''")
		Sub019("ALTER TABLE [MPIniziative] ADD [limita] bit not null default 0")
		Sub019("ALTER TABLE anagra ADD macroa int not null default -1")
		Sub019("ALTER TABLE clienti ADD macroc int not null default -1")
		Sub019("ALTER TABLE Venduto ADD EseguitoSuPalmare bit not null default 0")
		Sub021("ALTER TABLE Venduto ADD EseguitoSuPalmare bit not null default 0")
		Sub019("CREATE TABLE MacroHead (codice int PRIMARY KEY ,descrizione nvarchar (50) not NULL default '')")
		Sub019("CREATE TABLE Macro(chiave INTEGER PRIMARY KEY," & CRLF & TAB & "       codice int not NULL default 0,funzione int not NULL default 0,valore nvarchar (20) not NULL default '',qta int not null default 0) ")
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from MacroHead") = 0 Then
			Dim i32 As Int
			For i32 = 0 To 9
				Main.vSql1.ExecNonQuery("insert into MacroHead(codice,descrizione) values(" & i32 & ",'Macro num. " & i32 & "')")
				Dim i33 As Int
				For i33 = 0 To 9
					Main.vSql1.ExecNonQuery("insert into Macro(codice,funzione,valore,qta) values(" & i32 & ",0,'',1)")
				Next
			Next
		End If
		Sub019("ALTER TABLE Parameters ADD dll2 nvarchar (100) not NULL default ''")
		Sub019("ALTER TABLE confstampe ADD espandiT bit not NULL default 0")
		Sub019("ALTER TABLE iva ADD RTIva int not NULL default 0")
		Sub019("ALTER TABLE pagamenti ADD RTPagamento int not NULL default 1")
		Sub019("update pagamenti set RTPagamento=1 where codice=0")
		Sub019("update pagamenti set RTPagamento=7 where codice=2")
		Sub019("update pagamenti set RTPagamento=0 where codice<>2 and codice <>0")
		Main.vSql1.ExecNonQuery("update versione set versione = 39")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 39 Then
		Sub019("ALTER TABLE headmov ADD nChiusura int not NULL default 0")
		Sub021("ALTER TABLE headmov ADD nChiusura int not NULL default 0")
		Sub021("CREATE INDEX [IX_Telematico] ON [headmov] ([nscontrinoffm],[dataeoraffm],[nChiusura],[matricolacassap])")
		Sub019("ALTER TABLE FEDatiTX ADD TerzoDenEser nvarchar(50) NOT NULL default ''")
		Sub019("ALTER TABLE FEDatiTX ADD TerzoNomeEser nvarchar(50) NOT NULL default ''")
		Sub019("ALTER TABLE FEDatiTX ADD TerzoCognomeEser nvarchar(50) NOT NULL default ''")
		Sub019("ALTER TABLE FEDatiTX ADD TerzoCFEser nvarchar(16) NOT NULL default ''")
		Sub019("ALTER TABLE FEDatiTX ADD TerzoCodiceTX nvarchar(28) NOT NULL default ''")
		Sub019("ALTER TABLE FEDatiTX ADD TerzoIDPaeseTX nvarchar(2) NOT NULL default 'IT'")
		Sub019("ALTER TABLE FEDatiTX ADD TerzoTipoEser int Not Null default 0")
		Sub021("CREATE INDEX [IX_MemoPerResoRT] ON [Venduto] ([memo])")
		Sub019("ALTER TABLE pagamenti ADD TipoPrepagato int not NULL default 0")
		Dim list12 As List
		Dim map12 As Map
		map12.Initialize
		list12.Initialize
		map12.Put("codint", "com")
		map12.Put("descrizione", "Compensazione")
		map12.Put("reparto", 98)
		map12.Put("iva", 0)
		map12.Put("plupeso", 0)
		map12.Put("list1", 0)
		map12.Put("flgusointerno", True)
		list12.Add(map12)
		dbutil.Sub010(Main.vSql1, "anagra", list12)
		Main.vSql1.ExecNonQuery("update versione set versione = 40")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 40 Then
		If Main.vSql1.ExecQuerySingleResult("select count(*) from anagra where lower(substr(ANAGRA.codint,1,5))='zon10'") = 0 Then
			Dim list13 As List
			Dim map13 As Map
			list13.Initialize
			Dim i34 As Int
			For i34 = 10 To 19
				map13.Initialize
				map13.Put("codint", "zon" & i34)
				map13.Put("descrizione", "Supplemento Zona " & i34)
				map13.Put("reparto", 95)
				map13.Put("iva", 1)
				map13.Put("plupeso", 0)
				map13.Put("list1", 0)
				map13.Put("flgusointerno", True)
				list13.Add(map13)
			Next
			dbutil.Sub010(Main.vSql1, "anagra", list13)
		End If
		Sub021("ALTER TABLE headmovRecallAsporto ADD nChiusura int not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from progressivi where codice ='F2'") = 0 Then
			Sub019("insert into progressivi(codice,valore) values('F2',1)")
		End If
		Sub021("CREATE TABLE TmpClientiFM(" & CRLF & TAB & "       chiave INTEGER PRIMARY KEY,codiceCli nvarchar (20) Not Null default ''," & CRLF & TAB & TAB & "   descrizione nvarchar (50) Not Null default '',totale numeric(18, 2) not NULL default 0,MaxData DateTime not null default '1900-01-01')")
		Sub019("ALTER TABLE clients ADD DaTavoloP int Not Null default 0")
		Sub019("ALTER TABLE clients ADD aTavoloP int Not Null default 0")
		Sub019("ALTER TABLE Parameters ADD dll3 nvarchar (100) not NULL default ''")
		Sub019("ALTER TABLE clienti ADD passaggio int not null default 0")
		Sub019("ALTER TABLE headmov ADD ClienteSlave nvarchar (20) not NULL default ''")
		Sub021("ALTER TABLE headmovRecallAsporto ADD ClienteSlave nvarchar (20) not NULL default ''")
		Main.vSql1.ExecNonQuery("update versione set versione = 41")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 41 Then
		Sub021("CREATE TABLE [PrenotaRisorsa] (" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "[chiave] integer Not Null DEFAULT 0 PRIMARY KEY AUTOINCREMENT," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "[ID] int Not Null DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "[Cliente] nvarchar(100) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "[Memo] nvarchar(200) Not Null DEFAULT ''," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "[DataInizio] numeric(18, 0) NOT NULL DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "[DataFine] numeric(18, 0) NOT NULL DEFAULT 0," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "[IDCliente] nvarchar(20) Not Null DEFAULT ''" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & ") " & CRLF & TAB & TAB & TAB & TAB & TAB & TAB)
		Sub019("ALTER TABLE Parameters ADD dll4 nvarchar (100) not NULL default ''")
		Sub021("ALTER TABLE PrenotaRisorsa ADD nmov numeric(18, 0) NOT NULL default 0")
		Sub021("ALTER TABLE headmov ADD NDocStampato numeric(18, 0) NOT NULL default 0")
		Main.vSql1.ExecNonQuery("update versione set versione = 42")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 42 Then
		Sub019("ALTER TABLE clienti ADD contrassegno bit not null default 0")
		Sub019("CREATE TABLE TestiPagamentiWeb (chiave INTEGER PRIMARY KEY,cliente nvarchar (20) not NULL default '',nmov numeric(18,0) not null default 0,testo ntext not null default '')")
		Sub019("ALTER TABLE anagra ADD variazioniWeb bit not NULL default 0")
		Sub019("ALTER TABLE TestiPagamentiWeb ADD Tipo int not NULL default 0")
		Sub019("ALTER TABLE tavoli ADD tPWD nvarchar (20) not NULL default ''")
		Main.vSql1.ExecNonQuery("update tavoli set tPWD=random()")
		Main.vSql1.ExecNonQuery("update versione set versione = 43")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 43 Then
		Sub019("CREATE TABLE [tmpStampaWeb] (" & CRLF & TAB & TAB & TAB & "[codice] nvarchar(20), " & CRLF & TAB & TAB & TAB & "[descrizione] nvarchar(50), " & CRLF & TAB & TAB & TAB & "[qta] numeric(18, 3), " & CRLF & TAB & TAB & TAB & "[tavolo] int Not Null DEFAULT 0, " & CRLF & TAB & TAB & TAB & "[chiave] integer Not Null PRIMARY KEY AUTOINCREMENT, " & CRLF & TAB & TAB & TAB & "[totcre] nvarchar(10) Not Null DEFAULT '', " & CRLF & TAB & TAB & TAB & "[codint] nvarchar(20), " & CRLF & TAB & TAB & TAB & "[asporto] int Not Null DEFAULT -1, " & CRLF & TAB & TAB & TAB & "[reparto] int Not Null DEFAULT 1, " & CRLF & TAB & TAB & TAB & "[matricola] nvarchar(10) Not Null DEFAULT '', " & CRLF & TAB & TAB & TAB & "[idRiga] nvarchar(20) Not Null DEFAULT '', " & CRLF & TAB & TAB & TAB & "[turno] int Not Null DEFAULT 1, " & CRLF & TAB & TAB & TAB & "[ingredientisunf] Bit Not Null DEFAULT 0, " & CRLF & TAB & TAB & TAB & "[stampaesclusiva] Bit Not Null DEFAULT 0, " & CRLF & TAB & TAB & TAB & "[stampante2] int Not Null DEFAULT 0, " & CRLF & TAB & TAB & TAB & "[gruppomenu] nvarchar(10) Not Null DEFAULT '', " & CRLF & TAB & TAB & TAB & "[memo] nvarchar(200) Not Null DEFAULT ''" & CRLF & TAB & TAB & ")")
		Sub019("ALTER TABLE confstampe ADD RiepAsporto bit not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD RiepAsportoD bit not NULL default 0")
		Sub019("ALTER TABLE reparti ADD GrpWeb int not NULL default 0")
		Main.vSql1.ExecNonQuery("update versione set versione = 44")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 44 Then
		Main.vSql1.ExecNonQuery("update versione set versione = 45")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 45 Then
		Sub019("ALTER TABLE reparti ADD NumMenu int not NULL default 0")
		Sub019("ALTER TABLE reparti ADD verificaWeb bit not NULL default 0")
		Sub019("ALTER TABLE confstampe ADD mfWait bit not NULL default 0")
		Sub019("CREATE TABLE OpCM(codice int PRIMARY KEY ," & CRLF & "       " & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "gPrelievo bit not NULL default 1," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "gTrasferimento bit not NULL default 1," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "gInventario bit not NULL default 1," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "gStato bit not NULL default 1," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "gDepositoManuale bit not NULL default 1," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "gSbloccaBanconote bit not NULL default 1," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "gScambio bit not NULL default 1," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "gSettings2 bit not NULL default 1" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ")")
		Sub019("insert into OpCM(codice) select codice from operatori")
		Main.vSql1.ExecNonQuery("update versione set versione = 46")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 46 Then
		Sub019("ALTER TABLE headmov ADD codLotteria nvarchar (8)  not NULL default ''")
		Sub021("ALTER TABLE headmov ADD codLotteria nvarchar (8)  not NULL default ''")
		Sub019("ALTER TABLE clienti ADD codLotteria nvarchar (8)  not NULL default ''")
		Sub019("ALTER TABLE TmpFraziona ADD memo nvarchar (200) not NULL default ''")
		Sub019("ALTER TABLE TmpFraziona ADD ImportoV numeric(18, 2)  not NULL default 0")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from Palmari where Serial = 10010") = 0 Then
			Dim i35 As Int
			For i35 = 10 To 19
				Sub019("Insert into " & TAB & "Palmari(Serial) values(100" & i35 & ")")
				Sub019("CREATE TABLE tmpStampaPalm" & i35 & " (codice nvarchar (20)  Null ," & TAB & "descrizione nvarchar (50)  Null ,qta numeric(18, 3) Null ,tavolo int not NULL default 0,chiave INTEGER PRIMARY KEY ,totcre nvarchar (10) Not Null default '',codint nvarchar (20)  NULL ,asporto int not null default -1,reparto int not NULL default 1,matricola nvarchar (10) Not Null default '',idRiga nvarchar (20) not NULL default '',turno int NOT NULL DEFAULT 1, " & TAB & "ingredientisunf Bit Not Null DEFAULT 0, " & TAB & "stampaesclusiva Bit Not Null DEFAULT 0, " & TAB & "stampante2 Int Not Null DEFAULT 0,gruppomenu nvarchar (10) Not Null default '',memo nvarchar (200) not NULL default '')")
			Next
		End If
		If Main.vSql1.ExecQuerySingleResult("Select count(*) from MacroHead where codice >9") = 0 Then
			Do While True
				Dim i36 As Int = i
				If i36 > 39 Then
					Exit
				End If
				Main.vSql1.ExecNonQuery("insert into MacroHead(codice,descrizione) values(" & i36 & ",'Macro num. " & i36 & "')")
				Dim i37 As Int
				For i37 = 0 To 9
					Main.vSql1.ExecNonQuery("insert into Macro(codice,funzione,valore,qta) values(" & i36 & ",0,'',1)")
				Next
				i = i36 + 1
			Loop
		End If
		Sub019("CREATE TABLE FECodiciDocumento(codice int PRIMARY KEY ," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "documento nvarchar (5) not null default ''," & CRLF & "       " & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "descrizione nvarchar (100) Not Null default ''," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "AttivoDiretta int not NULL default 0,AttivoDifferita int not NULL default 0," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "AttivoBuoniPasto bit not NULL default 0,AttivoStessaPIDiretta bit not NULL default 0,AttivoStessaPIDifferita bit not NULL default 0)")
		If Main.vSql1.ExecQuerySingleResult("select count(*) from FECodiciDocumento") = 0 Then
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(1,'TD01','TD01 Fattura',2,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(2,'TD02','TD02 Acconto - Anticipo su fattura',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(3,'TD03','TD03 Acconto - Anticipo su parcella',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(4,'TD04','TD04 Nota di Credito',1,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(5,'TD05','TD05 Nota di Debito',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(6,'TD06','TD06 Parcella',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(7,'TD10','TD10 Fattura per acquisto intracomunitario beni',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(8,'TD11','TD11 Fattura per acquisto intracomunitario servizi',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(9,'TD16','TD16 Autofattura reverse charge interno',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(10,'TD17','TD17 Autofattura per acquisti extra UE (alternativa ad esterometro)',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(11,'TD18','TD18 Autofattura per acquisto di beni intracomunitari (alternativa ad esterometro)',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(12,'TD19','TD19 Autofattura per acquisto di beni ex articolo 17 comma 2 DPR 633/72',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(13,'TD20','TD20 V.1.2.1 Autofattura denuncia ovvero per fattura non ricevuta o di importo inferiore',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(14,'TD21','TD21 Autofattura per splafonamento',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(15,'TD22','TD22 Autofattura per estrazione beni da Deposito Iva senza assoggettamento Iva',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(16,'TD23','TD23 Autofattura per estrazione beni da Deposito Iva con assoggettamento Iva',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(17,'TD24','TD24 Fattura Differita',0,2,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(18,'TD25','TD25 Fattura Differita (Dropshipping)',0,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(19,'TD26','TD26 Cessione beni ammortizzabili e passaggi interni',1,0,0)")
			Sub019("insert into FECodiciDocumento(codice,documento,descrizione,AttivoDiretta,AttivoDifferita,AttivoBuoniPasto) values(20,'TD27','TD27 Autofattura per autoconsumo',0,0,0)")
		End If
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (8,'N2.Anon_1 - non soggette ad IVA ai sensi degli artt. da 7 a 7-septies del DPR 633/72')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (9,'N2.Anon_2 - non soggette - altri casi')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (10,'N3.Anon_1 - non imponibili - esportazioni')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (11,'N3.Anon_2 - non imponibili - cessioni intracomunitarie')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (12,'N3.Anon_3 - non imponibili - cessioni verso San Marino')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (13,'N3.Anon_4 - non imponibili - operazioni assimilate alle cessioni all´esportazione')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (14,'N3.Anon_5 - non imponibili - a seguito di dichiarazioni d´intento')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (15,'N3.Anon_6 - non imponibili - altre operazioni che non concorrono alla formazione del plafond')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (16,'N6.Anon_1 - inversione contabile - cessione di rottami e altri materiali di recupero')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (17,'N6.Anon_2 - inversione contabile - cessione di oro e argento puro')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (18,'N6.Anon_3 - inversione contabile - subappalto nel settore edile')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (19,'N6.Anon_4 - inversione contabile - cessione di fabbricati')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (20,'N6.Anon_5 - inversione contabile - cessione di telefoni cellulari')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (21,'N6.Anon_6 - inversione contabile - cessione di prodotti elettronici')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (22,'N6.Anon_7 - inversione contabile - prestazioni comparto edile e settori connessi')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (23,'N6.Anon_8 - inversione contabile - operazioni settore energetico')")
		Sub019("INSERT INTO FEnaturaIVA (Codice,Descrizione) VALUES (24,'N6.Anon_9 - inversione contabile - altri casi')")
		Main.vSql1.ExecNonQuery("update versione set versione = 47")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 47 Then
		Sub019("delete from FECodiciDocumento where codice >=9 and codice <= 16")
		Sub021("ALTER TABLE headmovRecallAsporto ADD codLotteria nvarchar (8) not NULL default ''")
		Sub019("ALTER TABLE versione ADD ProgLotteriaST int not NULL default 0")
		Sub019("insert into pagamenti(codice,descrizione,cassa,RTPagamento) values(32,'Arrotondamento',0,14)")
		Sub019("ALTER TABLE Ventmp ADD TipoSconto int not NULL default 0")
		Sub019("ALTER TABLE Venduto ADD TipoSconto int not NULL default 0")
		Sub021("ALTER TABLE Venduto ADD TipoSconto int not NULL default 0")
		Main.vSql1.ExecNonQuery("update versione set versione = 48")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 48 Then
		Sub019("ALTER TABLE pagamenti ADD pagamentopalmare bit not NULL default 0")
		Sub019("ALTER TABLE versione ADD FWVer nvarchar (20) not null default ''")
		Sub021("CREATE TABLE crediti (chiave integer NOT NULL PRIMARY KEY AUTOINCREMENT,nmov numeric(18,0) not null default 0 ,totale numeric(18, 4) not NULL default 0,Data DateTime not null default '1900-01-01')")
		Dim list14 As List
		Dim map14 As Map
		map14.Initialize
		list14.Initialize
		map14.Put("codint", "sal")
		map14.Put("descrizione", "Saldo")
		map14.Put("reparto", 98)
		map14.Put("iva", 0)
		map14.Put("plupeso", 0)
		map14.Put("list1", 0)
		map14.Put("flgusointerno", True)
		list14.Add(map14)
		dbutil.Sub010(Main.vSql1, "anagra", list14)
		Main.vSql1.ExecNonQuery("update versione set versione = 49")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 49 Then
		Sub021("CREATE TABLE AzzeraProgressivi(Anno int PRIMARY KEY ," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "Stato int not NULL default 0)")
		Sub019("ALTER TABLE versione ADD ivacassa nvarchar (20) not null default ''")
		Sub019("ALTER TABLE Palmari ADD datachiave long Not Null DEFAULT 0")
		Sub019("ALTER TABLE clienti ADD docPredefinito int  not NULL default 0")
		Sub019("ALTER TABLE clienti ADD dcompleanno DateTime not null default '01/01/1900'")
		Sub019("ALTER TABLE clienti ADD VerificaGDPR bit not null default 0")
		Sub019("ALTER TABLE pagamenti ADD GeneraPunti int not NULL default 1")
		Dim i38 As Int
		For i38 = 501 To 1000
			Sub019("insert into tavoli(tavolo) values(" & i38 & ")")
		Next
		Main.vSql1.ExecNonQuery("update versione set versione = 50")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 50 Then
		Sub019("ALTER TABLE tavoli ADD copertiWeb int not NULL default 0")
		Sub019("ALTER TABLE Ventmp ADD Infinity bit not NULL default 0")
		Sub019("CREATE TABLE OffsetImmaginiPersonalizzate(NomeFile nvarchar (200) PRIMARY KEY ," & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "OffsetX int not NULL default 0,OffsetY int not NULL default 0)")
		Sub019("update operatori set funzioni2 =substr(funzioni2,1,24)||'0'|| substr(funzioni2,26,5)")
		Main.vSql1.ExecNonQuery("update versione set versione = 51")
		Main.vInt4 = Main.vSql1.ExecQuerySingleResult("Select versione from versione")
		DoEvents
	End If
	If Main.vInt4 = 51 Then
		Sub019("ALTER TABLE dettord ADD qtana int Not Null default 0")
		Sub019("ALTER TABLE eliminati ADD cassa int Not Null default 0")
	End If
	If Not(z) Then
		ProgressDialogHide
	End If
	Main.vSql1.TransactionSuccessful
	Main.vSql1.EndTransaction
	Main.vSql2.TransactionSuccessful
	Main.vSql2.EndTransaction
End Sub

Sub Sub004(sql As SQL)
	Sub020("ALTER TABLE headmov ADD codLotteria nvarchar (8)  not NULL default ''", sql)
	Sub020("ALTER TABLE headmov ADD totaleNF numeric(18, 4) not Null default 0", sql)
	Sub020("ALTER TABLE venduto ADD cameriere int Not Null default 1", sql)
	Sub020("ALTER TABLE venduto ADD punti int not NULL default 0", sql)
	Sub020("ALTER TABLE venduto ADD sottoconto int Not Null default 0", sql)
	Sub020("ALTER TABLE venduto ADD sottocontoT int Not Null default 0", sql)
	If Sub020("ALTER TABLE Venduto ADD aliquota2 numeric(18, 4) NULL default 0", sql) Then
		Sub020("update Venduto set aliquota2 =aliquota", sql)
	End If
	Sub020("ALTER TABLE headmov ADD sezionale nvarchar(10) Not Null DEFAULT ''", sql)
	Sub020("ALTER TABLE headmov ADD nChiusura int not NULL default 0", sql)
	Sub020("ALTER TABLE Venduto ADD TipoSconto int not NULL default 0", sql)
End Sub

Sub Sub005(map As Map, str As String)
	Try
		Dim map2 As Map = map.Get("anag")
		Dim vTmp As String = mod1.Sub209(map2.GetDefault("denom", ""))
		Dim vObjectToString As String = map2.GetDefault("piva", "")
		Dim vObjectToString2 As String = map2.GetDefault("cf", "")
		Dim map3 As Map = map2.Get("domFisc")
		Dim vObjectToString3 As String = map3.GetDefault("prov", "")
		Dim vObjectToString4 As String = map3.GetDefault("cap", "")
		Dim vTmp_ As String = mod1.Sub209(map3.GetDefault("com", ""))
		Dim vTmp__ As String = mod1.Sub209(map3.GetDefault("ind", ""))
		Dim map4 As Map = map.Get("SDI")
		Dim vObjectToString5 As String = map4.GetDefault("pec", "")
		Dim vObjectToString6 As String = map4.GetDefault("cod", "")
		Dim map5 As Map
		map5.Initialize
		map5.Put("CodiceDestinatario", vObjectToString6)
		map5.Put("PEC", vObjectToString5)
		Dim map6 As Map
		map6.Initialize
		map6.Put("codice", str)
		dbutil.Sub012(Main.vSql1, "FEdatiCli", map5, map6)
		map5.Initialize
		map5.Put("descrizione", vTmp)
		map5.Put("citta", vTmp_)
		map5.Put("provincia", vObjectToString3)
		map5.Put("piva", vObjectToString)
		map5.Put("codf", vObjectToString2)
		map5.Put("via", vTmp__)
		map5.Put("cap", vObjectToString4)
		map6.Initialize
		map6.Put("codice", str)
		dbutil.Sub012(Main.vSql1, "clienti", map5, map6)
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub006
	Dim rt_leggidocsospesilotteria As Int = Main.vccefdll1.rt_leggidocsospesilotteria
	Dim parseDouble As Int = Main.vSql1.ExecQuerySingleResult("select ProgLotteriaST from versione")
	If rt_leggidocsospesilotteria > 0 And rt_leggidocsospesilotteria >= parseDouble Then
		Main.vccefdll1.vInt8 = rt_leggidocsospesilotteria - parseDouble
		Return
	End If
	If rt_leggidocsospesilotteria >= 0 Then
		Main.vccefdll1.vInt8 = 0
		Main.vSql1.ExecNonQuery("update versione set ProgLotteriaST =" & SmartStringFormatter("", rt_leggidocsospesilotteria) & "")
		Return
	End If
End Sub

Sub Sub007(str As String, str2 As String, str3 As String) As Boolean
	Dim z As Boolean
	Dim z2 As Boolean = False
	Dim packageManagerWrapper As PackageManager
	Initialize
	Dim vListFiles As List = File.ListFiles(str)
	Dim size As Int = vListFiles.Size - 1
	Dim i As Int = 0
	Do While i <= size
		Dim vObjectToString As String = vListFiles.Get(i)
		If vObjectToString.StartsWith(str2) Then
			Dim replace As String = vObjectToString.Replace(str2, "").Replace(".apk", "").Replace("_", "")
			If IsNumber(replace) Then
				Dim vGetInstalledPackages As List = packageManagerWrapper.GetInstalledPackages
				Dim z3 As Boolean = False
				Dim size2 As Int = vGetInstalledPackages.Size - 1
				Dim i2 As Int = 0
				Do While True
					If i2 > size2 Then
						Exit
					End If
					If vGetInstalledPackages.Get(i2) <> str3 Then
						i2 = i2 + 1
					Else
						z3 = True
						Exit
					End If
				Loop
				If Not(z3) Or packageManagerWrapper.GetVersionCode(str3) <= replace Then
					If str2 = "wPalmRistorAndro" Then
						File.Copy(str, vObjectToString, str, "wPalmRistorAndro.apk")
						Dim parseDouble As Double = replace / 100
						Dim sb As String = "UPGRADE" & NumberFormat2(parseDouble, 1, 2, 2, False) & ".zip"
						If File.Exists(str, sb) Then
							File.Delete(str, sb)
						End If
						Dim archiverForB4A As ArchiverForB4A
						archiverForB4A.ZipFiles(str, Array As String("wPalmRistorAndro.apk"), mod1.vStr4 & "/FWPalmari", sb, "")
						z = z2
					Else
						z = True
						File.Copy(str, vObjectToString, vfileprovider1.vStr1, vObjectToString)
						Sub026(vObjectToString)
					End If
					File.Delete(str, vObjectToString)
				End If
			End If
			z = z2
			File.Delete(str, vObjectToString)
		Else
			z = z2
		End If
		i = i + 1
		z2 = z
	Loop
	Return z2
End Sub

Sub Sub008 As Boolean
	Dim z As Boolean
	Dim vReadMap As Map
	Dim z2 As Boolean = True
	If Main.v_webapipi <> "" Then
		If Main.v_webapiindirizzo <> "" Then
			Dim sb2 As String = File.DirInternal & "/Updater/WebApi"
			If File.Exists(sb2, "CodiceAttivazione.txt") Then
				Dim sb4 As String = File.DirRootExternal & "/Licenze"
				File.Copy(sb2, "CodiceAttivazione.txt", sb4, Main.vStr8 & "_" & Main.v_matricola & ".txt")
				File.Delete(sb2, "CodiceAttivazione.txt")
				z = True
			Else
				z = False
			End If
			If File.Exists(sb2, "BasicSupport.bs") Then
				Dim sb7 As String = File.DirRootExternal & "/Licenze"
				File.Copy(sb2, "BasicSupport.bs", sb7, "BasicSupport_" & Main.v_matricola & ".bs")
				File.Delete(sb2, "BasicSupport.bs")
				z = True
			End If
			If File.Exists(sb2, "Aggiorna.sql") Then
				mod1.Sub120(sb2, "Aggiorna.sql", "", True)
				File.Delete(sb2, "Aggiorna.sql")
				z = True
			End If
			If File.Exists(sb2, "Config.txt") Then
				Try
					vReadMap = File.ReadMap(sb2, "Config.txt")
				Catch
					mod1.Sub217(LastException.Message)
				End Try
				If vReadMap.Size > 0 Then
					Dim vReadMap2 As Map = File.ReadMap(File.DirDefaultExternal, "Config.txt")
					Dim size As Int = vReadMap.Size - 1
					Dim i As Int
					For i = 0 To size
						vReadMap2.Put(vReadMap.GetKeyAt(i), vReadMap.GetValueAt(i))
					Next
					File.WriteMap(File.DirDefaultExternal, "Config.txt", vReadMap2)
					File.Delete(sb2, "Config.txt")
				End If
				z2 = z
				File.Delete(sb2, "Config.txt")
			Else
				z2 = z
			End If
			Dim vTmp As Boolean = Sub007(sb2, "InvioFE", "invioFE.ital")
			If Not(vTmp) Then
				vTmp = Sub007(sb2, "Spooler", "spooler.ital")
			End If
			If Not(vTmp) Then
				vTmp = Sub007(sb2, "wPalmRistorAndro", "wpalm.ristorandro")
			End If
			If Not(vTmp) Then
				vTmp = Sub007(sb2, "RistorAndro", "cassandraRisto.ital")
			End If
			Return IIf(z2, z2, vTmp)
		End If
	End If
	Return False
End Sub

'### VERIFICARE: jadx ha segnalato una decompilazione imperfetta di questa Sub.
'### Confrontare con il sorgente decompilato: java/cassandraRisto/ital/funzioni.java, metodo m5… (riga 2284).
Sub Sub009(z As Boolean, z2 As Boolean) As Int
	Dim z3 As Boolean
	Dim cursorWrapper As Cursor
	Dim z4 As Boolean
	Dim z5 As Boolean
	Dim z6 As Boolean
	Dim str As String
	Dim z7 As Boolean
	Dim z8 As Boolean
	Dim vObjectToCharSequence As Object = "Attendere ... Allineamento dati in corso "
	ProgressDialogShow2(vObjectToCharSequence, False)
	DoEvents
	If mod1.vBln3 Then
		Try
			Main.vSql1.EndTransaction
			Main.vSql2.EndTransaction
		Catch
			mod1.Sub217("A1" & LastException.Message)
		End Try
	End If
	mod1.vBln3 = True
	Main.vSql1.BeginTransaction
	Main.vSql2.BeginTransaction
	Try
		mod1.vStr2 = "Public Sub AllineaArchivio"
		If Main.vBln25 Then
			Main.vBln29 = False
			Main.vSql1.ExecNonQuery("delete from Venduto")
			Main.vSql1.ExecNonQuery("delete from headmov")
			Main.vSql1.ExecNonQuery("delete from CausaliPagamenti")
			Main.vSql1.ExecNonQuery("delete from Cassetto")
			Main.vSql2.ExecNonQuery("delete from Cassetto")
			Main.vSql1.ExecNonQuery("delete from daStampare")
			Main.vSql1.ExecNonQuery("delete from StampaCP")
			Main.vSql1.ExecNonQuery("delete from tmpStampa")
			Main.vSql1.ExecNonQuery("delete from HeaddaStampare")
			Main.vSql1.ExecNonQuery("delete from telefonate")
			If Main.v_azzeraasporto Then
				Main.vSql2.ExecNonQuery("update progressivi set valore = 0  where codice ='AS'")
			End If
			Return 1
		End If
		If Not(z2) Then
			If Not(z) Then
				If Main.v_iprpi <> "" Then
					If Main.v_azzeradati Then
						CallSub(rpidevice, "SendObsoleti")
						Return 0
					End If
				End If
			End If
		End If
		Dim list As List
		Dim list2 As List
		Dim map As Map
		Dim sql As SQL
		Dim z9 As Boolean = False
		Dim str2 As String = Main.v_percorsoazzera
		If Not(z) Then
			If Main.v_azzeradati Then
				If Main.v_percorsoazzera <> "" Then
					Dim z10 As Boolean = False
					Dim z11 As Boolean = False
					Do While True
						If z10 Then
							Exit
						End If
						Try
						Catch
							e = e2
						End Try
						If File.Exists(str2, "Venduto.db") Then
							If File.Size(str2, "Venduto.db") <> 0 Then
								z7 = True
								Try
									z8 = True
									z10 = z8
									z11 = z7
								Catch
									e = e3
									z11 = True
									Dim vObjectToCharSequence2 As Object = "Errore nella creazione  delle strutture DB (o chiave USB non inserita) per salvataggio dato obsoleti nel percorso: " & Main.v_percorsoazzera & CRLF & "Si desidera Riprovare ?"
									Dim vObjectToCharSequence3 As Object = Main.vStr8
									Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence2, vObjectToCharSequence3, "Si", "", "No", Main.vBmp1)
									If vMsgbox2 <> -1 Then
										z10 = True
										str = ""
									Else
										str = str2
									End If
									str2 = str
								End Try
							End If
						End If
						File.Copy(File.DirDefaultExternal, "Venduto.db", str2, "Venduto.db")
						If Not(File.Exists(str2, "Venduto.db")) Then
							Dim vObjectToCharSequence4 As Object = "Errore nella creazione  delle strutture DB (o chiave USB non inserita) per salvataggio dato obsoleti nel percorso: " & Main.v_percorsoazzera & CRLF & "Si desidera Riprovare ?"
							Dim vObjectToCharSequence5 As Object = Main.vStr8
							Dim vMsgbox22 As Int = Msgbox2(vObjectToCharSequence4, vObjectToCharSequence5, "Si", "", "No", Main.vBmp1)
							If vMsgbox22 <> -1 Then
								z8 = True
								z7 = z11
							Else
								z8 = z10
								z7 = z11
							End If
						Else
							z7 = True
							z8 = True
						End If
						z10 = z8
						z11 = z7
					Loop
					z9 = z11
				End If
			End If
		End If
		If z Then
			z3 = False
		Else
			z3 = z9
		End If
		Dim map2 As Map
		If z3 Then
			Dim dirDefaultExternal As String = File.DirDefaultExternal
			File.Copy(dirDefaultExternal, "Anagra.db", str2, "anagra" & mod1.Sub059(mod1.Sub058) & ".db")
			sql.Initialize(str2, "Venduto.db", False)
			Sub004(sql)
			map2.Initialize
		End If
		Dim cursorWrapper2 As Cursor
		Dim cursorWrapper3 As Cursor = Main.vSql1.ExecQuery("SELECT * FROM headmov where sospeso =0 order by nmov")
		cursorWrapper3.Position = 0
		list.Initialize
		list2.Initialize
		If cursorWrapper3.RowCount > 0 Then
			Dim rowCount As Int = cursorWrapper3.RowCount - 1
			Dim i As Int
			For i = 0 To rowCount
				cursorWrapper3.Position = i
				map.Initialize
				map.Put("nmov", cursorWrapper3.GetLong("nmov"))
				map.Put("nfat", cursorWrapper3.GetInt("nfat"))
				map.Put("nric", cursorWrapper3.GetInt("nric"))
				map.Put("RicDaFatt", cursorWrapper3.GetInt("RicDaFatt"))
				map.Put("cliente", cursorWrapper3.GetString("cliente"))
				map.Put("clides", cursorWrapper3.GetString("clides"))
				map.Put("flgNF", cursorWrapper3.GetInt("flgNF"))
				map.Put("totale", cursorWrapper3.GetDouble("totale"))
				map.Put("totaleNF", cursorWrapper3.GetDouble("totaleNF"))
				map.Put("prep", cursorWrapper3.GetDouble("prep"))
				map.Put("punti", cursorWrapper3.GetDouble("punti"))
				map.Put("datam", cursorWrapper3.GetString("datam"))
				map.Put("datam2", cursorWrapper3.GetString("datam2"))
				map.Put("datam3", cursorWrapper3.GetString("datam3"))
				If Main.vBln24 Then
					map.Put("cassa", cursorWrapper3.GetString("cassa"))
				End If
				map.Put("memo", cursorWrapper3.GetString("memo"))
				map.Put("sezionale", cursorWrapper3.GetString("sezionale"))
				map.Put("operatore", cursorWrapper3.GetInt("operatore"))
				map.Put("tavolo", cursorWrapper3.GetInt("tavolo"))
				map.Put("opdes", cursorWrapper3.GetString("opdes"))
				If cursorWrapper3.GetInt("nscontrinoffm") > 0 Then
					map.Put("dataeoraffm", cursorWrapper3.GetString("dataeoraffm"))
					map.Put("nscontrinoffm", cursorWrapper3.GetInt("nscontrinoffm"))
					map.Put("matricolacassap", cursorWrapper3.GetString("matricolacassap"))
					map.Put("nChiusura", cursorWrapper3.GetString("nChiusura"))
				End If
				map.Put("codLotteria", cursorWrapper3.GetString("codLotteria"))
				If z3 And sql.ExecQuerySingleResult("select count(*) from headmov where nmov = " & cursorWrapper3.GetString("nmov")) = 0 Then
					list2.Add(map)
					Dim vGetString As String = cursorWrapper3.GetString("nmov")
					map2.Put(vGetString, True)
				End If
				If Main.v_azzeradati And cursorWrapper3.GetString("memo") <> "Modifica Prepagato" And cursorWrapper3.GetString("memo") <> "Modifica Punti" Then
					If Main.v_azzeradati Then
						If Main.vSql1.ExecQuerySingleResult("SELECT count(*) FROM Venduto inner join reparti on venduto.reparto = reparti.codice where not(venduto.flgnf=1 AND venduto.sospeso=0 AND reparti.NF=0) and sospeso =0 and venduto.nmov = " & cursorWrapper3.GetLong("nmov")) <= 0 Then
						End If
					End If
				End If
				list.Add(map)
			Next
			If z3 Then
				If Main.v_nodatiperiodo Then
					z6 = True
					If Not(z6) Then
						If Not(dbutil.Sub009(Main.vSql2, "headmov", list)) Then
							Dim vObjectToCharSequence6 As Object = "Si sono verificati problemi durante la Chiusura Giornaliera." & CRLF & "CHIAMARE ASSISTENZA TECNICA"
							Dim vObjectToCharSequence7 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence6, vObjectToCharSequence7, "OK", "", "", Main.vBmp1)
							Return 2
						End If
					End If
					If z3 Then
						dbutil.Sub007(sql, "headmov", list2)
					End If
				End If
			End If
			z6 = False
			If Not(z6) Then
			End If
			If z3 Then
			End If
		End If
		If cursorWrapper3.IsInitialized Then
			cursorWrapper3.Close
		End If
		If Main.v_azzeradati Then
			Dim cursorWrapper4 As Cursor
			cursorWrapper = Main.vSql1.ExecQuery("SELECT venduto.* FROM Venduto inner join reparti on venduto.reparto = reparti.codice where not(venduto.flgnf=1 AND venduto.sospeso=0 AND reparti.NF=0) and sospeso =0 order by chiave")
		Else
			Dim cursorWrapper5 As Cursor
			cursorWrapper = Main.vSql1.ExecQuery("SELECT * FROM Venduto where sospeso =0 order by chiave")
		End If
		cursorWrapper.Position = 0
		list.Initialize
		If cursorWrapper.RowCount > 0 Then
			Dim rowCount2 As Int = cursorWrapper.RowCount - 1
			Dim i2 As Int
			For i2 = 0 To rowCount2
				cursorWrapper.Position = i2
				map.Initialize
				map.Put("codice", cursorWrapper.GetString("codice"))
				map.Put("descrizione", cursorWrapper.GetString("descrizione"))
				map.Put("brep", cursorWrapper.GetInt("brep"))
				If Main.v_turni Then
					map.Put("turno", cursorWrapper.GetInt("turno"))
				End If
				map.Put("qta", cursorWrapper.GetDouble("qta"))
				map.Put("prezzov", cursorWrapper.GetDouble("prezzov"))
				map.Put("reparto", cursorWrapper.GetInt("reparto"))
				map.Put("cameriere", cursorWrapper.GetInt("cameriere"))
				map.Put("sottoconto", cursorWrapper.GetInt("sottoconto"))
				map.Put("sottocontoT", cursorWrapper.GetInt("sottocontoT"))
				map.Put("punti", cursorWrapper.GetInt("punti"))
				map.Put("aliquota2", cursorWrapper.GetDouble("aliquota2"))
				map.Put("aliquota", cursorWrapper.GetDouble("aliquota2"))
				map.Put("iva", cursorWrapper.GetInt("iva"))
				map.Put("importo", cursorWrapper.GetDouble("importo"))
				map.Put("importo2", cursorWrapper.GetDouble("importo2"))
				map.Put("datam", cursorWrapper.GetString("datam"))
				map.Put("datam2", cursorWrapper.GetString("datam2"))
				map.Put("datam3", cursorWrapper.GetString("datam3"))
				map.Put("cliente", cursorWrapper.GetString("cliente"))
				map.Put("codint", cursorWrapper.GetString("codint"))
				map.Put("memo", cursorWrapper.GetString("memo"))
				If Main.vBln24 Then
					map.Put("cassa", cursorWrapper.GetString("cassa"))
				Else
					map.Put("cassa", Main.v_numcassa)
				End If
				map.Put("scop", cursorWrapper.GetDouble("scop"))
				map.Put("scov", cursorWrapper.GetDouble("scov"))
				map.Put("ingredientisumf", cursorWrapper.GetInt("ingredientisumf"))
				map.Put("ingredientisunf", cursorWrapper.GetInt("ingredientisunf"))
				map.Put("stampaesclusiva", cursorWrapper.GetInt("stampaesclusiva"))
				map.Put("gruppomenu", cursorWrapper.GetString("gruppomenu"))
				map.Put("stampante2", cursorWrapper.GetInt("stampante2"))
				map.Put("uscita", cursorWrapper.GetInt("uscita"))
				map.Put("TipoSconto", cursorWrapper.GetInt("TipoSconto"))
				map.Put("flgmag", cursorWrapper.GetInt("flgmag"))
				map.Put("flgNF", cursorWrapper.GetInt("flgNF"))
				map.Put("nmov", cursorWrapper.GetLong("nmov"))
				map.Put("nfat", cursorWrapper.GetInt("nfat"))
				map.Put("nric", cursorWrapper.GetInt("nric"))
				map.Put("totcre", cursorWrapper.GetString("totcre"))
				list.Add(map)
			Next
			If z3 Then
				If Main.v_nodatiperiodo Then
					z5 = True
					If Not(z5) Then
						If Not(dbutil.Sub009(Main.vSql2, "Venduto", list)) Then
							Dim vObjectToCharSequence8 As Object = "Si sono verificati problemi durante la Chiusura Giornaliera." & CRLF & "CHIAMARE ASSISTENZA TECNICA"
							Dim vObjectToCharSequence9 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence8, vObjectToCharSequence9, "OK", "", "", Main.vBmp1)
							Return 2
						End If
					End If
				End If
			End If
			z5 = False
			If Not(z5) Then
			End If
		End If
		If z3 Then
			Dim cursorWrapper6 As Cursor
			cursorWrapper = Main.vSql1.ExecQuery("SELECT * FROM Venduto where sospeso =0 order by chiave")
			cursorWrapper.Position = 0
			list2.Initialize
			If cursorWrapper.RowCount > 0 Then
				Dim rowCount3 As Int = cursorWrapper.RowCount - 1
				Dim i3 As Int
				For i3 = 0 To rowCount3
					cursorWrapper.Position = i3
					map.Initialize
					map.Put("codice", cursorWrapper.GetString("codice"))
					map.Put("descrizione", cursorWrapper.GetString("descrizione"))
					map.Put("brep", cursorWrapper.GetInt("brep"))
					If Main.v_turni Then
						map.Put("turno", cursorWrapper.GetInt("turno"))
					End If
					map.Put("qta", cursorWrapper.GetDouble("qta"))
					map.Put("prezzov", cursorWrapper.GetDouble("prezzov"))
					map.Put("reparto", cursorWrapper.GetInt("reparto"))
					map.Put("cameriere", cursorWrapper.GetInt("cameriere"))
					map.Put("sottoconto", cursorWrapper.GetInt("sottoconto"))
					map.Put("sottocontoT", cursorWrapper.GetInt("sottocontoT"))
					map.Put("punti", cursorWrapper.GetInt("punti"))
					map.Put("aliquota2", cursorWrapper.GetDouble("aliquota2"))
					map.Put("aliquota", cursorWrapper.GetDouble("aliquota2"))
					map.Put("iva", cursorWrapper.GetInt("iva"))
					map.Put("importo", cursorWrapper.GetDouble("importo"))
					map.Put("datam", cursorWrapper.GetString("datam"))
					map.Put("datam2", cursorWrapper.GetString("datam2"))
					map.Put("datam3", cursorWrapper.GetString("datam3"))
					map.Put("cliente", cursorWrapper.GetString("cliente"))
					map.Put("codint", cursorWrapper.GetString("codint"))
					map.Put("memo", cursorWrapper.GetString("memo"))
					map.Put("cassa", Main.v_numcassa)
					map.Put("scop", cursorWrapper.GetDouble("scop"))
					map.Put("scov", cursorWrapper.GetDouble("scov"))
					map.Put("ingredientisumf", cursorWrapper.GetInt("ingredientisumf"))
					map.Put("ingredientisunf", cursorWrapper.GetInt("ingredientisunf"))
					map.Put("stampaesclusiva", cursorWrapper.GetInt("stampaesclusiva"))
					map.Put("stampante2", cursorWrapper.GetInt("stampante2"))
					map.Put("uscita", cursorWrapper.GetInt("uscita"))
					map.Put("TipoSconto", cursorWrapper.GetInt("TipoSconto"))
					map.Put("flgNF", cursorWrapper.GetInt("flgNF"))
					map.Put("nmov", cursorWrapper.GetLong("nmov"))
					map.Put("nfat", cursorWrapper.GetInt("nfat"))
					map.Put("nric", cursorWrapper.GetInt("nric"))
					map.Put("totcre", cursorWrapper.GetString("totcre"))
					If z3 And map2.ContainsKey(cursorWrapper.GetString("nmov")) Then
						list2.Add(map)
					End If
				Next
				dbutil.Sub007(sql, "Venduto", list2)
			End If
		End If
		If cursorWrapper.IsInitialized Then
			cursorWrapper.Close
		End If
		Dim cursorWrapper7 As Cursor
		Dim cursorWrapper8 As Cursor = Main.vSql1.ExecQuery("SELECT * FROM CausaliPagamenti where sospeso =0 order by chiave")
		cursorWrapper8.Position = 0
		list.Initialize
		list2.Initialize
		If cursorWrapper8.RowCount > 0 Then
			Dim cursorWrapper9 As Cursor
			Dim cursorWrapper10 As Cursor = Main.vSql1.ExecQuery("select cassa from pagamenti order by codice")
			Dim rowCount4 As Int = cursorWrapper8.RowCount - 1
			Dim i4 As Int
			For i4 = 0 To rowCount4
				cursorWrapper8.Position = i4
				map.Initialize
				map.Put("nmov", cursorWrapper8.GetLong("nmov"))
				map.Put("codice", cursorWrapper8.GetString("codice"))
				map.Put("descrizione", cursorWrapper8.GetString("descrizione"))
				map.Put("qta", cursorWrapper8.GetDouble("qta"))
				map.Put("datam", cursorWrapper8.GetString("datam"))
				map.Put("datam3", cursorWrapper8.GetString("datam3"))
				map.Put("importo", cursorWrapper8.GetDouble("importo"))
				If z3 And map2.ContainsKey(cursorWrapper8.GetString("nmov")) Then
					list2.Add(map)
				End If
				Try
					If cursorWrapper8.GetInt("codice") > 0 Then
						cursorWrapper10.Position = cursorWrapper8.GetInt("codice")
						map.Put("NonRiscosso", cursorWrapper10.GetInt("cassa") = 1)
					End If
				Catch
					Log(LastException)
				End Try
				If Main.v_azzeradati Then
					If Main.v_azzeradati Then
						If Main.vSql1.ExecQuerySingleResult("SELECT count(*) FROM Venduto inner join reparti on venduto.reparto = reparti.codice where not(venduto.flgnf=1 AND venduto.sospeso=0 AND reparti.NF=0) and sospeso =0 and venduto.nmov = " & cursorWrapper8.GetLong("nmov")) <= 0 Then
						End If
					End If
				End If
				list.Add(map)
			Next
			If z3 Then
				If Main.v_nodatiperiodo Then
					z4 = True
					If Not(z4) Then
						If Not(dbutil.Sub009(Main.vSql2, "CausaliPagamenti", list)) Then
							Dim vObjectToCharSequence10 As Object = "Si sono verificati problemi durante la Chiusura Giornaliera." & CRLF & "CHIAMARE ASSISTENZA TECNICA"
							Dim vObjectToCharSequence11 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence10, vObjectToCharSequence11, "OK", "", "", Main.vBmp1)
							Return 2
						End If
					End If
					If z3 Then
						dbutil.Sub007(sql, "CausaliPagamenti", list2)
					End If
					cursorWrapper10.Close
				End If
			End If
			z4 = False
			If Not(z4) Then
			End If
			If z3 Then
			End If
			cursorWrapper10.Close
		End If
		If cursorWrapper8.IsInitialized Then
			cursorWrapper8.Close
		End If
		If z2 Then
			Main.vSql1.ExecNonQuery("delete from venduto where sospeso=0")
			Main.vSql1.ExecNonQuery("delete from headmov where sospeso=0 ")
			Main.vSql1.ExecNonQuery("delete from CausaliPagamenti  where sospeso=0 ")
		Else
			If Main.vSql1.ExecQuerySingleResult("Select count(*) from Despagine where noazzera =1") = 0 Then
				If Main.vSql1.ExecQuerySingleResult("Select count(*) from tavoli where manuallock =1 ") = 0 Then
					Main.vSql1.ExecNonQuery("delete from Venduto")
					Main.vSql1.ExecNonQuery("delete from headmov")
					Main.vSql1.ExecNonQuery("update tavoli set copertiWeb=0,tPWD=random(),uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0,memo='',unlocktable=0,timelast ='" & mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)) & "'")
					Main.vBln29 = False
					If Main.v_numerott > 0 Then
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from Despagine where codice >=100 and noazzera=1") > 0 Then
							Dim cursorWrapper11 As Cursor
							Dim cursorWrapper12 As Cursor = Main.vSql1.ExecQuery("Select noazzera,aTavolo,daTavolo from Despagine where codice >=100")
							Dim rowCount5 As Int = cursorWrapper12.RowCount - 1
							Dim i5 As Int
							For i5 = 0 To rowCount5
								cursorWrapper12.Position = i5
								If cursorWrapper12.GetInt("noazzera") <> 1 Then
									Main.vSql1.ExecNonQuery("update tavoli set uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0,memo='',unlocktable=0,timelast ='" & mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)) & "' where tavolo >=" & cursorWrapper12.GetString("daTavolo") & " and tavolo <=" & cursorWrapper12.GetString("aTavolo"))
									Main.vSql1.ExecNonQuery("delete from venduto where (Select count(*) from headmov where sospeso=0 and  venduto.nmov = headmov.nmov AND headmov.tavolo >=" & cursorWrapper12.GetString("daTavolo") & " AND headmov.tavolo <=" & cursorWrapper12.GetString("aTavolo") & ")>0")
									Main.vSql1.ExecNonQuery("delete from headmov where sospeso=0 and  tavolo >=" & cursorWrapper12.GetString("daTavolo") & " and tavolo <=" & cursorWrapper12.GetString("aTavolo"))
								End If
							Next
							cursorWrapper12.Close
						Else
							Main.vSql1.ExecNonQuery("update tavoli set uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0,memo='',unlocktable=0,timelast ='" & mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)) & "' where tavolo >=20000")
							Main.vSql1.ExecNonQuery("delete from venduto where (Select count(*) from headmov where sospeso=0 and  venduto.nmov = headmov.nmov AND headmov.tavolo >=20000)>0")
							Main.vSql1.ExecNonQuery("delete from headmov where sospeso=0 and  headmov.tavolo >=20000")
						End If
					End If
					Main.vSql1.ExecNonQuery("delete from CausaliPagamenti")
				End If
			End If
			Main.vSql1.ExecNonQuery("delete from headmov where sospeso=1 And (Select count(*) from tavoli where tavoli.rifheadmov = headmov.nmov )=0")
			Main.vSql1.ExecNonQuery("delete from venduto where (Select count(*) from headmov where venduto.nmov = headmov.nmov AND headmov.tavolo =0)>0 or (Select count(*) from headmov where venduto.nmov = headmov.nmov)=0")
			Main.vSql1.ExecNonQuery("delete from headmov where headmov.tavolo =0")
			Dim cursorWrapper13 As Cursor
			Dim cursorWrapper14 As Cursor = Main.vSql1.ExecQuery("Select tavolo,rifheadmov,manuallock from tavoli")
			Dim z12 As Boolean = Main.vSql1.ExecQuerySingleResult("Select count(*) from Despagine where chiedimemo2=2") > 0
			If cursorWrapper14.RowCount > 0 Then
				Dim rowCount6 As Int = cursorWrapper14.RowCount - 1
				Dim i6 As Int
				For i6 = 0 To rowCount6
					cursorWrapper14.Position = i6
					Dim z13 As Boolean = Main.vSql1.ExecQuerySingleResult("Select count(*) from pagine inner join Despagine on pagine.pagina = Despagine.codice where Despagine.noazzera=0 AND tipo =9 AND valore =" & cursorWrapper14.GetString("tavolo")) > 0
					Dim str3 As String = ",memo=''"
					If z12 Then
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from pagine inner join Despagine on pagine.pagina = Despagine.codice where Despagine.chiedimemo2=2 AND tipo =9 AND valore =" & cursorWrapper14.GetString("tavolo")) > 0 Then
							str3 = ""
						End If
					End If
					If cursorWrapper14.GetString("rifheadmov") <> 0 Then
						If Main.vSql1.ExecQuerySingleResult("Select count(*) from headmov where sospeso=0 and headmov.tavolo =" & cursorWrapper14.GetString("tavolo")) <= 0 Then
						End If
					End If
					Main.vSql1.ExecNonQuery("delete from venduto where (Select count(*) from headmov where sospeso=0 and  venduto.nmov = headmov.nmov AND headmov.tavolo =" & cursorWrapper14.GetString("tavolo") & ")>0")
					Main.vSql1.ExecNonQuery("delete from headmov where sospeso=0 and  headmov.tavolo =" & cursorWrapper14.GetString("tavolo"))
					If cursorWrapper14.GetString("manuallock") = 0 And (cursorWrapper14.GetString("rifheadmov") = 0 Or z13) Then
						Main.vSql1.ExecNonQuery("update tavoli set copertiWeb=0,tPWD=random(),uscita=0,rifheadmov = 0,coperti=0,addturni=0,inmodifica=0,importo = 0,ricconto=0,stampap=0,lock=0" & str3 & ",unlocktable=0,timelast ='" & mod1.Sub057(DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)) & "' where tavolo =" & cursorWrapper14.GetString("tavolo"))
					End If
					If i6 Mod 30 = 0 Then
						DoEvents
					End If
				Next
			End If
			cursorWrapper14.Close
			If Main.v_numerott > 0 Then
			End If
			Main.vSql1.ExecNonQuery("delete from CausaliPagamenti")
		End If
		Main.vSql1.ExecNonQuery("delete from Cassetto")
		If Main.v_fondocassaauto > 0 Then
			Main.vSql1.ExecNonQuery(CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "INSERT INTO [Cassetto]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "([Operatore]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[TipoAttivita]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[Importo]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[DataOra]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[TipoMoneta]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[Qta]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[PrezzoUnitario]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[NumDistinta]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[Cassa]" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",[memo])" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "VALUES" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "(" & SmartStringFormatter("", Main.Operatore) & CRLF & TAB & TAB & ",'F'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "," & SmartStringFormatter("", Main.v_fondocassaauto) & CRLF & TAB & TAB & ",'" & SmartStringFormatter("", DateTime.Date(mod1.Sub058) & " " & DateTime.Time(mod1.Sub058)) & "'" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",0" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",1" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "," & SmartStringFormatter("", Main.v_fondocassaauto) & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & ",1" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & TAB & "," & SmartStringFormatter("", Main.v_numcassa) & CRLF & TAB & TAB & ",'Versamento automatico')")
		End If
		Main.vSql1.ExecNonQuery("delete from daStampare")
		Main.vSql1.ExecNonQuery("delete from StampaCP")
		Main.vSql1.ExecNonQuery("delete from tmpStampa")
		Main.vSql1.ExecNonQuery("delete from HeaddaStampare")
		Main.vSql1.ExecNonQuery("delete from telefonate")
		Main.vSql1.ExecNonQuery("delete from ExportFattureHead")
		Main.vSql1.ExecNonQuery("delete from ExportFattureDett")
		Dim periodVar As Period
		periodVar.Days = -1
		Dim addperiod As Long = DateUtils.addperiod(mod1.Sub058, periodVar)
		Dim vGetYear As Double = DateTime.GetYear(addperiod)
		Dim vGetMonth As Double = DateTime.GetMonth(addperiod)
		Dim vGetDayOfMonth As Double = DateTime.GetDayOfMonth(addperiod)
		Main.vSql1.ExecNonQuery("delete from Prenota where data < '" & NumberFormat2(vGetYear, 2, 0, 0, False) & "-" & NumberFormat2(vGetMonth, 2, 0, 0, False) & "-" & NumberFormat2(vGetDayOfMonth, 2, 0, 0, False) & " 00:00:00'")
		Main.vSql1.ExecNonQuery("update confstampe set counter = 1")
		If z3 And sql.IsInitialized Then
			sql.Close
		End If
		If Main.v_azzeraasporto Then
			Main.vSql1.ExecNonQuery("update progressivi set valore = 0  where codice ='AS'")
		End If
		ProgressDialogHide
		Return 3
	Catch
		mod1.Sub217(LastException.Message)
		ProgressDialogHide
		Return 2
	End Try
End Sub

Sub Sub010
	Try
		If Main.v_attivaterminale Then
			Dim list As List
			Dim vTmp As Long = mod1.Sub058
			Dim str As String = "DaCasseFull" & mod1.Sub059(vTmp - 0 * 86400000) & ".tmp"
			Dim vTmp_ As Long = mod1.Sub058
			Dim str2 As String = "DaCasse" & mod1.Sub059(vTmp_ - 10 * 86400000) & ".tmp"
			list.Initialize
			list.AddAll(File.ListFiles(Main.vStr17 & "/Sent"))
			Dim size As Int = list.Size - 1
			Dim i As Int
			For i = 0 To size
				Dim vObjectToString As String = list.Get(i)
				If vObjectToString.StartsWith("DaCasse") And vObjectToString.EndsWith(".tmp") And vObjectToString.CompareTo(str2) < 0 Then
					File.Delete(Main.vStr17 & "/Sent", vObjectToString)
				End If
			Next
		End If
		If Main.vBln24 Then
			Dim i2 As Int
			For i2 = 1 To 9
				Dim sb4 As String = mod1.vStr4 & "/T" & i2 & "/TAVOLI"
				mod1.Sub070(sb4)
			Next
			CallSub(httpclient, "SendRichiestaVarClient")
			Return
		End If
		Return
	Catch
		mod1.Sub217(LastException.Message)
		Return
	End Try
End Sub

Sub Sub011(str As String, str2 As String, str3 As String) As Boolean
	Try
		If Main.vSql1.ExecQuerySingleResult("select count(*) FROM Ventmp where (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and chiave <>" & str2 & " and totcre ='" & str3 & "'") > 0 Then
			If str = "rileggi" Then
				str = Main.vSql1.ExecQuerySingleResult("Select qta from Ventmp where  chiave =" & str2)
			End If
			Dim replace As String = str.Replace(",", ".")
			Main.vSql1.ExecNonQuery("update Ventmp set QTA = " & replace & ",importo = prezzov * " & replace & " where (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and chiave <>" & str2 & " and totcre ='" & str3 & "'")
			Main.vSql1.ExecNonQuery("update Ventmp set importo2 = (select case when sum(importo) is null then 0 else sum(importo) end from Ventmp where (lower(substr(codice,1,2))='vv' or lower(substr(codice,1,2))='ww') and chiave <>" & str2 & " and totcre ='" & str3 & "') where chiave =" & str2)
			Return True
		End If
	Catch
		mod1.Sub217(LastException.Message)
	End Try
	Return False
End Sub

Sub Sub012(z As Boolean)
	If z Then
		Dim vRnd As Int = Rnd(1, 3)
		Dim i As Int
		For i = 1 To vRnd
			Dim textWriterWrapper As TextWriter
			Dim vTmp As Long = mod1.Sub058
			Dim sb2 As String = File.DirDefaultExternal & "/LOG"
			textWriterWrapper.Initialize(File.OpenOutput(sb2, "CEFDLL_ERR.txt", True))
			textWriterWrapper.WriteLine(DateTime.Date(vTmp) & " " & DateTime.Time(vTmp) & TAB & "java.lang.StringIndexOutOfBoundsException: length=0; regionStart=0; regionLength=1" & TAB & Main.vccefdll1.vStr3)
			textWriterWrapper.WriteLine(DateTime.Date(vTmp) & " " & DateTime.Time(vTmp) & TAB & "java.net.SocketTimeoutException" & TAB & Main.vccefdll1.vStr3)
			textWriterWrapper.Close
			Dim vObjectToCharSequence As Object = "Stampante non pronta..." & CRLF & "Premere 'Riprova' per ritentare la chisura"
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Riprova", "", "", Main.vBmp1)
			mod1.Sub178(Rnd(500, 2000))
			DoEvents
			DoEvents
		Next
		ProgressDialogHide
		Return
	End If
End Sub

Sub Sub013(i As Int, d As Double) As Double
	Dim i2 As Int
	Dim vRound2 As Int = Round2(d * 100 Mod 10, 2)
	Dim z As Boolean = vRound2 < 0
	Dim vAbs As Int = Abs(vRound2)
	Select i
		Case 1
			If vAbs > 7 Then
				vAbs = 10 - vAbs
			Else If vAbs > 2 Then
				vAbs = 5 - vAbs
			Else
				vAbs = vAbs * -1
			End If
		Case 2
			If vAbs > 5 Then
				vAbs = vAbs - 5
			End If
			vAbs = vAbs * -1
		Case 3
			If vAbs > 5 Then
				vAbs = 10 - vAbs
			Else
				vAbs = 5 - vAbs
			End If
	End Select
	If z Then
		i2 = vAbs * 1
		If i > 1 And i2 > 0 Then
			i2 = (5 - i2) * 1
		Else If i = 3 Then
			i2 = i2 + 5
		End If
	Else
		i2 = vAbs
	End If
	Return i2 / 100
End Sub

Sub Sub014(str As String)
	If File.Exists(mod1.vStr4 & "/files/files/" & str, "") Then
		Initialize
		Dim vListFiles As List = File.ListFiles(mod1.vStr4 & "/files/files/" & str)
		Dim size As Int = vListFiles.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim vObjectToString As String = vListFiles.Get(i)
			Dim sb4 As String = mod1.vStr4 & "/files/files/" & str
			File.Copy(sb4, vObjectToString, File.DirDefaultExternal & "/" & str, vObjectToString)
			File.Delete(mod1.vStr4 & "/files/files/" & str, vObjectToString)
		Next
		Return
	End If
End Sub

Sub Sub015(str As String)
	If File.Exists(mod1.vStr4 & "/files/files/" & str, "") Then
		File.MakeDir(File.DirDefaultExternal, str)
		Initialize
		Dim vListFiles As List = File.ListFiles(mod1.vStr4 & "/files/files/" & str)
		Dim size As Int = vListFiles.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim vObjectToString As String = vListFiles.Get(i)
			If vObjectToString.Contains(".") Then
				Dim sb4 As String = mod1.vStr4 & "/files/files/" & str
				File.Copy(sb4, vObjectToString, File.DirDefaultExternal & "/" & str, vObjectToString)
				File.Delete(mod1.vStr4 & "/files/files/" & str, vObjectToString)
			End If
		Next
		Return
	End If
End Sub

Sub Sub016
	Dim i As Int
	For i = 1 To 19
		File.MakeDir(Main.vStr7, i)
		File.MakeDir(Main.vStr7, i & "/TMP")
		File.MakeDir(Main.vStr7, i & "/Tavoli")
		File.MakeDir(mod1.vStr4, "T" & i)
		File.MakeDir(mod1.vStr4 & "/T" & i, "OLD")
		File.MakeDir(mod1.vStr4 & "/T" & i, "TAVOLI")
		File.MakeDir(Main.vStr7, i + 10000)
		File.MakeDir(Main.vStr7, i + 10000 & "/TMP")
		File.MakeDir(Main.vStr7, i + 10000 & "/VENDUTO")
		File.MakeDir(Main.vStr7, i + 10000 & "/VENDUTO/IMG")
		File.MakeDir(Main.vStr7, i + 10000 & "/VENDUTO/LISTA")
		File.MakeDir(Main.vStr7, i + 10000 & "/ImgPalm")
		File.MakeDir(Main.vStr7, i + 10000 & "/ImgPalm/Send")
	Next
End Sub

Sub Sub017(i As Int, d As Double, str As String, d2 As Double, str2 As String) As String
	Dim d3 As Double = 0
	If Main.vSql1.ExecQuerySingleResult("Select count(*) from Ventmp where memo ='" & SmartStringFormatter("", str) & "' and iva=" & SmartStringFormatter("", i) & "") > 0 Then
		d3 = Abs(Main.vSql1.ExecQuerySingleResult("Select sum(importo) from Ventmp where memo ='" & SmartStringFormatter("", str) & "' and iva=" & SmartStringFormatter("", i) & ""))
		d = d + d3
	End If
	Dim vRound2 As Double = Round2(d, 2)
	If vRound2 <= Round2(d2, 2) Then
		Return ""
	End If
	Return "Non è possibile rendere questo articolo perchè supera il totale iva del DCV originale (massimo importo per iva " & str2 & "% : " & NumberFormat2(d2 - d3, 1, 2, 2, False) & "€ )"
End Sub

Sub Sub018(b4XBitmapWrapper As B4XBitmap, f As Float) As B4XBitmap
	Dim xui As XUI = vXUI1
	Dim vDipToCurrent As Int = DipToCurrent(1)
	Dim b4XCanvas As B4XCanvas
	Dim xui2 As XUI = vXUI1
	Dim vCreatePanel As B4XView = XUI.CreatePanel("")
	vCreatePanel.SetLayoutAnimated(0, 0, 0, b4XBitmapWrapper.Width, b4XBitmapWrapper.Height)
	b4XCanvas.Initialize(vCreatePanel)
	Dim b4XPath As B4XPath
	b4XPath.InitializeRoundedRect(b4XCanvas.TargetRect, f)
	b4XCanvas.ClipPath(b4XPath)
	Dim targetRect As B4XRect = b4XCanvas.TargetRect
	b4XCanvas.DrawRect(targetRect, -16777216, True, vDipToCurrent)
	b4XCanvas.RemoveClip
	Dim b4XRect As B4XRect
	b4XRect.Initialize(vDipToCurrent, vDipToCurrent, b4XCanvas.TargetRect.Width - vDipToCurrent, b4XCanvas.TargetRect.Height - vDipToCurrent)
	b4XPath.InitializeRoundedRect(b4XRect, f - 0.7 * vDipToCurrent)
	b4XCanvas.ClipPath(b4XPath)
	b4XCanvas.DrawBitmap(b4XBitmapWrapper, b4XRect)
	b4XCanvas.RemoveClip
	b4XCanvas.Invalidate
	Dim vCreateBitmap As B4XBitmap = b4XCanvas.CreateBitmap
	b4XCanvas.Release
	Return vCreateBitmap
End Sub

Sub Sub019(str As String) As Boolean
	Try
		Main.vSql1.ExecNonQuery(str)
		Return True
	Catch
		Return False
	End Try
End Sub

Sub Sub020(str As String, sql As SQL) As Boolean
	Try
		sql.ExecNonQuery(str)
		Return True
	Catch
		Return False
	End Try
End Sub

Sub Sub021(str As String)
	Try
		Main.vSql2.ExecNonQuery(str)
		Return
	Catch
		Return
	End Try
End Sub

Sub Sub022(str As String, str2 As String, str3 As String) As List
	Dim list As List
	list.Initialize
	Dim replace As String = str.Replace("/", "")
	Dim str4 As String = replace.SubString2(0, 4) & replace.SubString(6)
	Dim sb As String = SmartStringFormatter("", str.SubString2(3, 5)) & "/" & SmartStringFormatter("", str.SubString2(0, 2)) & "/" & SmartStringFormatter("", str.SubString2(6, 10)) & ""
	Dim sb2 As String = "Select count(*) from headmov where matricolacassap='" & SmartStringFormatter("", Main.vccefdll1.vStr4) & "' and substr(dataeoraffm,1,10)='" & SmartStringFormatter("", sb) & "' and nChiusura = " & SmartStringFormatter("", modfunstr.Sub006(str2)) & " and nscontrinoffm=" & SmartStringFormatter("", modfunstr.Sub006(str3)) & ""
	If Main.vSql1.ExecQuerySingleResult(sb2) > 0 Then
		list.Add(Main.vSql1.ExecQuerySingleResult(sb2.Replace("count(*)", "nmov")))
		list.Add(Main.vSql1)
	Else
		If Main.vSql2.ExecQuerySingleResult(sb2) > 0 Then
			list.Add(Main.vSql2.ExecQuerySingleResult(sb2.Replace("count(*)", "nmov")))
			list.Add(Main.vSql2)
		End If
	End If
	Return list
End Sub

Sub Sub023(str As String) As Long
	Dim replace As String = str.Replace(" ", "").Replace("-", "").Replace(":", "")
	Return DateUtils.setdateandtime(replace.SubString2(0, 4), replace.SubString2(4, 6), replace.SubString2(6, 8), replace.SubString2(8, 10), replace.SubString2(10, 12), replace.SubString2(12, 14))
End Sub

Sub Sub024(i As Int, i2 As Int) As String
	If i = Main.t_funzione Then
		Dim valueOf As Int = i2
		Select valueOf
			Case Main.f_abbuono
				Return "La funzione 'Abbuono' consente di effettuare uno sconto a valore sul totale. " & CRLF & "Per utilizzare la funzione è necessario digitare l'importo poi premere il tasto Abbuono. " & CRLF & "L'importo scontato non viene ventilato sulle singole righe. " & CRLF & "E' possibile modificare iva ,reparto e descrizione del comando entrando in 'Configurazione Plu' (cercare il codice'abb')Questo comando puo essere inibito all'operatore entrando in 'Configura Operatori' "
			Case Main.f_apricassetto
				Return "Viene inviato il comando di apertura cassetto al " & Main.vStr1 & ". " & CRLF & "Questo comando puo essere inibito all'operatore entrando in 'Configura Operatori' "
			Case Main.f_cancellatutto
				Return "Consente la cancellazione di tutti gli articoli presenti nella griglia. " & CRLF & "Se il comando viene eseguito all'interno di un richiamo movimento viene eliminato anche il movimento salvato in precedenza. " & CRLF & "Questo comando puo essere inibito all'operatore entrando in 'Configura Operatori' "
			Case Main.f_sospendi
				Return "Consente la sospensione dello stato attuale del programma (movimento ,listino,cliente ecc..)  " & CRLF & "per poi poterlo richiamare successivamente tramite il tasto 'Richiama Scontrino' " & CRLF & "Per sospendere è necessario inserire almento una riga. " & CRLF & "Non è possibile sospendere se si sta richiamando un movimento. " & CRLF & "E' possibile sospendere più volte lo stesso movimento applicando modifiche. " & CRLF & "La sospensione non genera nessun tipo di documento. " & CRLF & "Tutti i sospesi non richiamati vengono eliminati con la Chiusura Giornaliera. " & CRLF & "Questo comando puo essere inibito all'operatore entrando in 'Configura Operatori' "
			Case Main.f_recallsospendi
				Return "Consente di richiamare i movimenti sospesi in precedenza(e relativo stato del programma al momento della sospensione). " & CRLF & "Non è possibile utilizzare questo comando se ci sono articoli selezionati.  " & CRLF & "Le modalità di richiamo possono essere 2:  " & CRLF & "1)Digitare il numero del movimento e poi premere il tasto 'Richiama Scontrino' (l'utente deve conoscere il numero da richiamare) " & CRLF & "2)Premere il tasto 'Richiama Scontrino' quindi selezionare dall'elenco il movimento desiderato. " & CRLF & "Una volta che il sospeso è stato recuperato è possibile annullare la procedura di richiamo premendo nuovamente il tasto 'Richiama Scontrino' (nessun dato verrà modificato)." & CRLF & "Il comando è attivo solo con la versione PRO." & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_operatore
				Return "Consente di richiamare cambiare l'operatore attivo . " & CRLF & "Attraverso la 'Configurazione Operatori' si possono inibire funzionalità all'operatore." & CRLF & "Esiste la possibilità di verificare i movimenti effettuati attraverso le stampe giornaliere o periodiche " & CRLF & "Gli operatori disponibili sono 9 (con codice da 1 a 9) ." & CRLF & "L'operatore 1 non ha password mentre per gli altri è necessario inserire un codice di 5 caratteri (configurabili)."
			Case Main.f_scontrinoparlante
				Return "Consente di inserire Partita Iva o il Codice Fiscale del cliente. " & CRLF & "Esiste una procedura di verifica della validità del codice inserito ." & CRLF & "Nel caso in cui la  Partita Iva o il Codice Fiscale siano precedentemente inseriti all'interno della anagrafica cliente ,lo 'scontrino parlante' uscirà automaticamente." & CRLF & "Il comando è attivo solo con la versione PRO." & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_stampaoggi
				Return "Offre una serie di report delle SOLE VENDITE fatte dopo l'ultima chiusura ." & CRLF & "Questi report possono essere stampati su " & Main.vStr1 & " o inviati come posta elettronica." & CRLF & "Si possono applicare regole e filtri per ottenere i dati desiderati" & CRLF & "Il comando è attivo solo con la versione PRO." & CRLF & "Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_letturadgfe
				Return "Consente di ristampare uno o più scontrini fiscali emessi in precedenza ,selezionando una delle opzioni proposte." & CRLF & "Questa funzione può essere utilizzata solo con cassa Fiscalizzata." & CRLF & "Il comando è attivo solo con la versione PRO." & CRLF & "Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_ricercacliente
				Return "I clienti possono essere richiamati in tre modalità differenti:" & CRLF & "1)Digitare il codice del cliente quindi premere il tasto 'CLIENTE' " & CRLF & "2)Premere il tasto 'CLIENTE', cercare il cliente tramite i filtri disponibili, toccare poi il tasto con l'icona ingranaggio per effettuare la selezione. " & CRLF & "3)Utilizzare uno scanner per leggere una tessera con barcode che identifica il cliente; la codifica stampata sulla card dovrà iniziare con '111' e terminare con il codice cliente(es: con codice cliente =31 la tessera dovrà essere 1110031X dove X è il check digit)." & CRLF & "E' possibile selezionare un cliente solo all'interno di un movimento di vendita. " & CRLF & "Il comando è attivo solo con la versione PRO." & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_scontototale
				Return "Consente di effettuare uno sconto in percentuale degli articoli selezionati. " & CRLF & "A differenza dell'Abbuono ,lo sconto al Subtotale viene ventilato su ogni singola riga selezionata al momento (non per le successive)" & CRLF & "Questo comportamento risulta essere diverso dallo sconto legato al cliente: in questo caso vengono scontati tutti gli articoli presenti nella transazione; 'Annullo cliente' storna lo sconto.  " & CRLF & "Per annullare un sconto è necessario premere il tasto 0 quindi 'Sconto Totale' " & CRLF & "Nel caso in cui esista solo uno sconto al Subtotale (nessuno sconto su riga), sullo scontrino fiscale verrà stampata una riga con la Somma riepilogativa di tutti gli sconti, diversamente viene stampata la ventilazione dello sconto a livello riga.  " & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_ricercaarticoli
				Return "Gli articoli possono essere richiamati in 4 differenti modi:" & CRLF & "1)Digitare il codice interno del PLU quindi premere il tasto 'Ricerca Articoli' " & CRLF & "2)Digitare l'eventuale codice a barre PLU quindi premere il tasto 'Ricerca Barcode' " & CRLF & "3)Premere il tasto 'Ricerca Articoli', cercare l'articolo tramite i filtri disponibili quindi toccare l tasto con l'ingranaggio per effettuare la selezione. " & CRLF & "4)Utilizzare lo scanner per leggere il barcode che identifica il prodotto (anche etichette a peso)." & CRLF & "Il software consolida per Qtà in una singola riga l'ultimo articolo veduto ripetutamente" & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_reso
				Return "La procedura di reso consente di impostare la quantità dell'articolo in negativo." & CRLF & "Per eseguire un reso è necessario digitare la quantità, premere il tasto 'Reso' seguito dal PLU." & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_fattura
				Return "Consente la stampa di Fatture dirette dal " & Main.vStr1 & " o su stampante a4." & CRLF & "Per emettere una fattura premere il tasto 'Fattura' prima di chiudere la transazione con un pagamento idoneo." & CRLF & "La fattura può essere emessa solo all'interno di una transazione di vendita." & CRLF & "Se precedentemente la stampa è stato selezionato un cliente il documento verrà intestato automaticamente. In caso contrario lo spazio destinato all'intestazione verrà lasciato vuoto." & CRLF & "Il comando è attivo solo con la versione PRO." & CRLF & "Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_conto
				Return "Il movimento viene chiuso come 'Riepilogo' e viene stampato un tallon sul " & Main.vStr1 & "." & CRLF & "E' possibile effettuare il calcolo del resto digitando l'importo prima di premere il tasto 'Conto'." & CRLF & "Non può essere utilizzato in movimenti diversi dalla vendita, all'interno della procedura di 'Richiama Movimento' o 'Richiama Scontrino'." & CRLF & "Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_stampaparziale
				Return "Consente la stampa di un tallon riepilogativo del movimento in corso, senza cancellare la transazione." & CRLF & "Dopo l'uscita della stampa di riepilogo è possibile proseguire nell'inserimento di nuovi articoli. " & CRLF & "Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_variaprezzo
				Return " Consente la modifica del Prezzo di vendita di un singolo articolo presente in tastiera o prima che sia scannerizzato, selezionare la funzione ( un avviso a video avvisa che la funzione è attivata) digitare l’importo e selezionare l’articolo in tastiera o scannerizzare." & CRLF & TAB & TAB & TAB & TAB & "Questo comando può essere inibito all'operatore dal menu 'Configura Operatori'"
			Case Main.f_recallmov
				Return "Consente di richiamare i movimenti (NON SOSPESI) elaborati in precedenza(e relativo stato del programma al momento della sospensione). " & CRLF & "Non è possibile utilizzare questo comando se ci sono articoli selezionati.  " & CRLF & "Le modalità di richiamo possono essere 2:  " & CRLF & "1)Digitare il numero del movimento poi premere il tasto 'Richiama Movimento'(il numero del movimento è riportato sullo scontrino nella riga che precede il Totale" & CRLF & "2)Premere il tasto 'Richiama Movimento',Indicare se il movimento si trova tra i dati del giorno o tra quelli di giorni precedenti, quindi selezionare dalla lista il movimento richiesto. " & CRLF & "Se il movimento è stato richiamato è possibile annullare la procedura premendo nuovamente il tasto 'Richiama Movimento' (nessun dato verrà modificato)." & CRLF & "Possiamo richiamare anche movimenti di tipologia diversa dalla vendita." & CRLF & "Confermando un movimento richiamato viene chiesto se ristampare il documento fiscale nel caso fosse stato emesso in precedenza. " & CRLF & "Nel caso in cui sia attiva la gestione di magazzino , confermando un movimento richiamato, il magazzino viene ricalcolato ." & CRLF & "Nel caso in cui all'interno del movimento sia presente un cliente con la gestione dei punti o del prepagato, confermando un movimento richiamato, i montanti del cliente vengono ricalcolati ." & CRLF & "Il comando è attivo solo con la versione PRO." & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_ricarica
				Return "Consente di caricare un valore sul 'Prepagato' di un cliente . " & CRLF & "La ricarica  funziona solo su clienti col flag 'Prepagato' abilitato e solo all'interno di un movimento di vendita.  " & CRLF & "Una volta selezionato il cliente è sufficiente indicare l'importo da ricaricare quindi premere il tasto ricarica.  " & CRLF & "E' possibile effettuare ricariche e vendite all'interno dello stesso documento." & CRLF & "L'importo ricaricato viene sempre registrato con la causale 'Credito' " & CRLF & "E' possibile modificare iva ,reparto e descrizione del comando entrando in 'Configurazione Plu' (cercare il codice'ric')Il comando è attivo solo con la versione PRO." & CRLF & "Questo comando puo essere inibito all'operatore dal menù 'Configura Operatori' "
			Case Main.f_premio
				Return "Consente di scalare i punti dal cliente abilitato alla gestione dei punti. " & CRLF & "Durante la vendita il cliente totalizza 1 punto ogni Euro acquistato.  " & CRLF & "Allo stesso modo il premio scarica 1 punto per ogno articolo premio selezionato: volendo scalare 20 punti è necessario digitare 20 x seguito dal tasto 'Premio'.  " & CRLF & "E' possibile modificare iva ,reparto , descrizione e un eventuale importo  del comando entrando in 'Configurazione Plu' (cercare il codice'pre').L'importo maggiore di zero consente di applicare uno sconto al momento del ritiro del premio (premio monetizzato). Seguendo quindi l'esempio precedente, impostando il prezzo di vendita a 0,10 ,oltre a scaricare 20 punti genera uno sconto di 2 Euro.  Il comando è attivo solo con la versione PRO." & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_ricercabarcode
				Return "Gli articoli possono essere richiamati in 4 differenti modi:" & CRLF & "1)Digitare il codice interno del articolo quindi premere il tasto 'Ricerca Articoli' " & CRLF & "2)Digitare l'eventuale codice a barre articolo quindi premere il tasto 'Ricerca Barcode' " & CRLF & "3)Premere il tasto 'Ricerca Articoli', cercare l'articolo tramite i filtri disponibili quindi toccare l tasto con l'ingranaggio per effettuare la selezione. " & CRLF & "4)Utilizzare una scanner per leggere il barcode che identifica il prodotto (anche etichette a peso)." & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_listino
				Return "Consente di passare dal listino 1 al listino 2 e viceversa." & CRLF & "Il listino 2 dell'articolo può essere modificato manualmente all'interno della 'Configurazione PLU' oppure si può ricalcolare il listino 2 applicando maggiorazioni o sconti in percentuale rispetto al listino 1 (su tutta l'anagrafica)." & CRLF & "Questa procedura può essere richiamata dal menu 'Configura'  " & CRLF & "Il cambio di Listino non ha effetto su articoli a peso e su battute a reparto " & CRLF & "Nel caso in cui siano stati selezionati articoli al momento del cambio del listino , verrà richiesto se applicare la variazione di prezzo anche agli articoli selezionati in precedenza.  " & CRLF & "Il comando è attivo solo all'interno del movimento dei Vendita." & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_scontrinolotteria
				Return "Consente di inserire il Codice Lotteria del cliente. " & CRLF & "Esiste una procedura di verifica della validità del codice inserito ." & CRLF & "Nel caso in cui il Codice Lotteria sia stato precedentemente inserito all'interno dell'anagrafica cliente , il documento commerciale verrà automaticamente abilitato per la partecipazione alla lotteria." & CRLF & "Il comando è attivo solo con la versione PRO."
			Case Main.f_dividiconto
				Return "Viene abilitata la possibilità di dividere il conto in più sottoconti ." & CRLF & "Per utilizzare questa funzione è necessario inserire almeno 2 articoli" & CRLF & "Tramite il nuovo tasto che apparirà in corrispondenza di ogni articolo si avrà la possibilità di indicare la quantità da selezionare.  " & CRLF & "Tenendo premuto questo tasto una eventuale precedente selezione verrà annullata. " & CRLF & "Per uscire dalla funzione senza selezionare tutti gli articoli è necessario premere nuovamente il tasto 'Dividi Conto'.  " & CRLF & "Nel caso in cui vengano selezionati tutti gli articoli , l'uscita dalla funzione sarà automatica.  " & CRLF & "Il comando è attivo solo all'interno del movimento dei Vendita." & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_contoromana
				Return "Viene abilitata la possibilità di dividere il totale del conto in più sottoconti senza il dettaglio degli articoli ." & CRLF & "Tramite il nuovo tasto che apparirà in corrispondenza di ogni riga si avrà la possibilità di effettuare la selezione .  " & CRLF & "Tenendo premuto questo tasto una eventuale precedente selezione verrà annullata. " & CRLF & "Per uscire dalla funzione senza selezionare tutti gli articoli è necessario premere nuovamente il tasto 'Conto alla Romana'.  " & CRLF & "In questo caso l'importo degli eventuali documenti emessi verrà applicato come sconto sul totaledel movimento." & CRLF & "Nel caso in cui vengano selezionati tutte le righe , l'uscita dalla funzione sarà automatica.  " & CRLF & "Il comando è attivo solo all'interno del movimento dei Vendita." & CRLF & "Questo comando puo essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_segue
				Return "Il cameriere imputa una serie di piatti, i piatti partono automaticamente dal primo turno." & CRLF & "Sia sul Tablet che sui palmari ogni riga riporta a fianco il turno In cui è coinvolta." & CRLF & "Premendo tale funzione i piatti imputati inseguito riportano  a fianco il turno di preparazione successivo per la cucina." & CRLF & "In Cucina la comanda riporterà con taglio parziale la lista della preparazione divisa per turno." & CRLF & "Possono se flag attivo essere stampati anche i reparti coinvolti nello stesso turno"
			Case Main.f_avantiturno
				Return "Il cameriere apre il tavolo e comanda l’avanti turno, generalmente questa operazione viene eseguita dal palmare : in cucina viene stampata la comanda che riporta il numero del tavolo e il turno di preparazione delle pietanze ai reparti coinvolti nella produzione."
			Case Main.f_dividiconto
				Return "Questa funzione consente di dividere il conto in modo analitico, si scelgono le quantità dalle righe dello conto virtuale , e poi si decide quale tipo di documento se intestarlo (selezionando o inserendo un cliente) ed infine si esegue il pagamento nella forma mista o diretta che si desidera." & CRLF & "Il conto virtuale viene ridotto delle quantità e degli articoli processati ed è possibile procedere con la selezione e l’emissione di un nuovo conto o parcheggiare il conto sul tavolo (ad esempio una persona è andata via prima ed altre rimangono al tavolo) ; la procedura si itera fino alla chiusura del tavolo."
			Case Main.f_contoromana
				Return "In questo caso è sufficiente specificare il numero dei conti da emettere; i conti possono essere poi emessi con tipologia di documento e pagamento anche diverso fra loro."
			Case Main.f_ritirovincita
				Return "Questa funzione consente il ritiro dell'eventuale vincita di un gratta e vinci da parte del cliente." & CRLF & "Prima di abilitare il pagamento viene verificato se il tagliando è legato ad un codice esistente, se stato venduto da un altro punto vendita ose è già stato incassato."
			Case Main.f_ricevuta
				Return "Consente la stampa di Ricevute su kPrinter." & CRLF & "Per emettere una ricevut premere il tasto 'Ricevuta' prima di chiudere la transazione con un pagamento idoneo." & CRLF & "La Ricevuta può essere emessa solo all'interno di una transazione di vendita." & CRLF & "Se precedentemente la stampa è stato selezionato un cliente il documento verrà intestato automaticamente. In caso contrario lo spazio destinato all'intestazione verrà lasciato vuoto." & CRLF & "Questo comando può essere inibito all'operatore dal menu 'Configura Operatori' "
			Case Main.f_elencotelefonate
				Return "Per utilizzare questa funzione è necessario avere un cellulare android con 'Incoming' installato o un dispositivo adatto al riconoscimento telefonico su linea fissa." & CRLF & "Consente la gestione delle telefonate ricevute nella giornata :vengono evidenziate le telefonate che sono state accettate o meno con possibilità di richiamo"
			Case Main.f_messaggio
				Return "Consente l'inserimento di messaggi testuali fissi all'interno del documento." & CRLF & "Possono essere creati fino a un massimo di 9 messaggi." & CRLF & "I messaggi possono essere legati ad un reparto , quindi è possibile verificare il loro utilizzo attraverso le statistiche di vendita impostando i filtri corretti." & CRLF & "Vengono stampati sulle stampanti di produzione ma non sul " & Main.vStr1 & ""
			Case Main.f_tallon
				Return "Questa funzione consente di modificare il normale comportamento del flag 'Stampa tallon per ogni prodotto' nella configurazione delle stampe per i centri di produzione:" & CRLF & "è possibile forzare l'emissione dei tallon,inibire l'emissione o seguire il comportamento del flag in configurazione."
			Case Main.f_nocomande
				Return "Questa funzione consente di inibire temporaneamente la stampa di tutte le comande che eventualmente sarebbero stampate nel conto in corso." & CRLF & "Alla chiusura del movimento viene riabilitata la stampa automaticamente."
			Case Main.f_ristampaveloce
				Return "Consente la stampa di un documento richiamando un movimento chiuso in precedenza con la funzione 'Conto'."
			Case Main.f_menu
				Return "A questa funzione si può legare uno dei menu del giorno creati attraverso l'apposita procedura di configurazione." & CRLF & "Premendo un tasto menu verrà richiesto di inserire uno o più articoli raggruppati per reparto.E' consentito utilizzare il moltiplicatore prima di selezionare la funzione."
			Case Main.f_modificatore
				Return "Questa funzione dà la possibilità di gestire variazioni sulla quantità in eccesso o in difetto (es. pizza baby o pizza gigante)."
			Case Main.f_ristampacomanda
				Return "Consente la ristampa completa della comanda (funziona solo all'interno di un tavolo)." & CRLF & "Una volta premuto il tasto la ristampa verrà eseguita al momento della sospensione del tavolo."
			Case Main.f_gruppo
				Return "Richiama in tastiera gli articoli facenti parte del gruppo richiamato dalla funzione"
			Case Main.f_maggiorazione
				Return "Questa funzione dà la possibilità di gestire impostare maggiorazioni al totale o sulla singola riga." & SmartStringFormatter("", CRLF) & CRLF & TAB & TAB & TAB & TAB & TAB & "La funzione può essere inserita anche con un valore predefinito."
			Case Main.f_noservizio
				Return "Questa funzione consente di disabilitare temporaneamente la gestione del servizio."
			Case Main.f_infomovimento
				Return "Questa funzione visualizza una serie di informazioni dettagliate relative al movimento che si sta componendo."
			Case Main.f_modoperatore
				Return "Questa funzione dà la possibilità di assegnere l'operatore che effettua la consegna a domicilio, in un momemto successivo alla stampa del documento fiscale."
			Case Main.f_noarticoliazero
				Return "Cancella tutti gli articoli a prezzo 0 presenti del conto prima dell'emissione del documento"
			Case Main.f_bloccaarticolo
				Return "Consente il blocco e lo sblocco alla vendita di articoli esauriti (aggiorna anche i palmari se presenti)"
			Case Main.f_stampatutto
				Return "Consente la stampa automatica di tanti scontrini quanti sono i conti in attesa di elaborazione all'interno del conto alla romana"
			Case Main.f_spostasutavolo
				Return "Sposta gli articoli inseriti in modalità 'asporto' all'interno di un tavolo libero"
			Case Main.f_showsospesiasporto
				Return "Visualizza il numero di articoli sospesi all'interno di ogni singolo step di minuti ,per la gestione dell'asporto"
			Case Main.f_shell
				Return "Questa funzione da la possibilità di eseguire programmi direttamente dalla tastiera di RistorAndro"
			Case Main.f_sospendiprenota
				Return "Sospensione dell'asporto con la possibilità di indicare la data e l'ora del ritiro." & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "Viene richiesto anche l'inserimento di un testo 'memo' e la stampa di un tallon riepilogativo (oltre alla stampa nei centri di produzione se configurate)"
			Case Main.f_recallsospendiprenota
				Return "Consente il richiamo di asporti sospesi in date diverse:" & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "Per prima cosa vengono proposti filtri (data , movimento e cliente) per semplificare la ricerca del movimento." & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "Una volta identificato il movimento è possibile modificarlo e risospenderlo (anche con data diversa),cancellarlo o confermare tutto emettendo un documento fiscale."
			Case Main.f_visualizzapwdweb
				Return "Questa funzione consente la visualizzazione della password generata dal sistema per la data orierna ,necessaria per l'utilizzo del service box"
			Case Main.f_terminalino
				Return "Questa funzione consente la ricezione dei dati rilevati dal terminalino portatile"
			Case Main.f_allergeni
				Return "Inserendo questa funzione su un tasto è necessario selezionare un allergene o tag." & CRLF & TAB & TAB & TAB & TAB & TAB & TAB & "Premendo questa funzione vengono evidenziati in tastiera tutti gli articoli contenenti l'allergene selezionato."
			Case Main.f_menucashology
				Return "Consente l'apertura del 'Funzioni per il gestore' utilizzando il terminale Cashlogy."
			Case Main.f_risorsebalneari
				Return "Consente l'inserimento dei dati necessari per l'emissione di scontrino fiscale per Risorse balneari."
			Case Main.f_sottoconto
				Return "Consente la modifica del numero di sottoconti all'interno di un tavolo "
			Case Main.f_vedisottoconti
				Return "Attraverso questa funzione è possibile visualizzare il dettaglio e i totali di ogni sottoconto contenuto in un tavolo.Questa funzione utilizzata in fase di dividi conto ,seleziona il sottoconto per il pagamento. "
			Case Main.f_ricercatabacchi
				Return "Consente la ricerca di un articolo del reparto Tabacchi utilizzando il codice AAMS"
			Case Main.f_ricercatavoli
				Return "Questa funzione prevede 2 modalità di funzionamento:" & CRLF & "1)digitando il numero del tavolo seguito dal tasto 'Ricerca tavoli' il tavolo viene subito aperto" & CRLF & "2)permendo il tasto 'Ricerca tavoli' si apre una finestra che consente la visualizzazione dei tavoli in formato griglia;esistono diverse possibilità di ricerca e rimane possibile gestire i tavoli come nella modalità tradizionale"
			Case Main.f_verificainviofe
				Return "Consente la visualizzazione dello stato di avanzamento invio delle fatture elettroniche." & CRLF & "Il dettaglio dello stato è legato all'intermediario scelto come destinatario fattura." & CRLF & "Attraverso questa funzione è anche possibile ristampare una copia della fattura "
			Case Main.f_macro
				Return "Possono essere gestite fino a 9 macro e ogni macro a sua volta può contenere fino a 9 comandi." & CRLF & "I comandi possono eseere di questo tipo: " & QUOTE & "Ricerca Articoli" & QUOTE & "," & QUOTE & "Abbuono" & QUOTE & "," & QUOTE & "Ricerca Cliente" & QUOTE & "," & QUOTE & "Fattura" & QUOTE & "," & QUOTE & "Ricevuta" & QUOTE & "," & QUOTE & "Menù" & QUOTE & CRLF & "per alcuni comandi possono essere richiesti parametri aggiuntivi (es:codice articolo ,quantità,codice cliente ....)" & CRLF & CRLF & "Una volta che la macro è stata configurata può essere inserita in tastiera, legata ad un articolo o legata ad un cliente" & CRLF & "Se viene selezianato da palmare un articolo abbinato ad una macro,l'esecuzione della macro avviene alla prima apertura del tavolo dal terminale " & CRLF & TAB & TAB & TAB
			Case Main.f_annullart
				Return "Questa funzione è utilizzabile solo in modalità RT." & CRLF & "Consente l'annullo di un documento commerciale di vendita , generando un nuovo documento commerciale di annullo." & CRLF & "Viene eliminato anche il movimento nel DB del gestionale"
			Case Main.f_menuesercentert
				Return "Questa funzione è utilizzabile solo in modalità RT." & CRLF & "1)" & QUOTE & "Stampa elenco chiusure eseguite (da chiusura a chiusura)" & QUOTE & " stampa elenco su carta" & CRLF & "2)" & QUOTE & "Stampa XML chiusure (da chiusura a chiusura)" & QUOTE & " Stampa Xml da chiusura a chiusura su carta" & CRLF & "3)" & QUOTE & "Esporta dati corrispettivi dalla Memoria di dettaglio" & QUOTE & CRLF & "con questa funzione è possibile estrarre i file contenuti nel range indicato" & CRLF & "Vengono estratti anche i file delle chiusure non inviate ad AE o scartati da AE" & CRLF & "4)" & QUOTE & "Invia chiusure in sospeso al server AE" & QUOTE & CRLF & "Viene verificato se esistono delle chiusure non ancora inviate ad AE e nel caso ne viene richiesto l'invio" & CRLF & "5)" & QUOTE & "Comunica al Server AE la chiusura temporanea dell'attività " & QUOTE & CRLF & "Da utilizzare ad esempio per la chiusura estiva dell'attività" & CRLF & "Se la comunicazione ad AE ha esito positivo , la cassa non consente più l'emissione di DCV ." & CRLF & "Per uscire dallo stato di sospensione attività è necessario eseguire una chiusura ."
		End Select
	End If
	Return ""
End Sub

Sub Initialize
	vfileprovider1.Initialize
End Sub

Sub Sub025
	If File.Exists(mod1.vStr4 & "/files", "Anagra.db") Then
		Dim sb3 As String = mod1.vStr4 & "/files"
		File.Copy(sb3, "Anagra.db", File.DirDefaultExternal, "Anagra.db")
		File.Delete(mod1.vStr4 & "/files", "Anagra.db")
	End If
	If File.Exists(mod1.vStr4 & "/files", "Venduto.db") Then
		Dim sb7 As String = mod1.vStr4 & "/files"
		File.Copy(sb7, "Venduto.db", File.DirDefaultExternal, "Venduto.db")
		File.Delete(mod1.vStr4 & "/files", "Venduto.db")
	End If
	If File.Exists(mod1.vStr4 & "/files/files", "Anagra.db") Then
		Dim sb11 As String = mod1.vStr4 & "/files/files"
		File.Copy(sb11, "Anagra.db", File.DirDefaultExternal, "Anagra.db")
		File.Delete(mod1.vStr4 & "/files/files", "Anagra.db")
	End If
	If File.Exists(mod1.vStr4 & "/files/files", "Venduto.db") Then
		Dim sb15 As String = mod1.vStr4 & "/files/files"
		File.Copy(sb15, "Venduto.db", File.DirDefaultExternal, "Venduto.db")
		File.Delete(mod1.vStr4 & "/files/files", "Venduto.db")
	End If
	If File.Exists(mod1.vStr4 & "/files/files", "esporta.db") Then
		Dim sb19 As String = mod1.vStr4 & "/files/files"
		File.Copy(sb19, "esporta.db", File.DirDefaultExternal, "esporta.db")
		File.Delete(mod1.vStr4 & "/files/files", "esporta.db")
	End If
	If File.Exists(mod1.vStr4 & "/files/files", "logo.jpg") Then
		Dim sb23 As String = mod1.vStr4 & "/files/files"
		File.Copy(sb23, "logo.jpg", File.DirDefaultExternal, "logo.jpg")
		File.Delete(mod1.vStr4 & "/files/files", "logo.jpg")
	End If
	If File.Exists(mod1.vStr4 & "/files/files", "logo.png") Then
		Dim sb27 As String = mod1.vStr4 & "/files/files"
		File.Copy(sb27, "logo.png", File.DirDefaultExternal, "logo.png")
		File.Delete(mod1.vStr4 & "/files/files", "logo.png")
	End If
	If File.Exists(mod1.vStr4 & "/files/files", "") Then
		Initialize
		Dim vListFiles As List = File.ListFiles(mod1.vStr4 & "/files/files")
		Dim size As Int = vListFiles.Size - 1
		Dim i As Int
		For i = 0 To size
			Dim vObjectToString As String = vListFiles.Get(i)
			If (vObjectToString.StartsWith("Proc") And vObjectToString.EndsWith(".txt")) Or vObjectToString = "LogoPrg.jpg" Then
				Dim sb32 As String = mod1.vStr4 & "/files/files"
				File.Copy(sb32, vObjectToString, File.DirDefaultExternal, vObjectToString)
				If vObjectToString = "LogoPrg.jpg" Then
					Dim sb34 As String = mod1.vStr4 & "/files/files"
					File.Copy(sb34, vObjectToString, mod1.vStr4, vObjectToString)
					Dim sb36 As String = mod1.vStr4 & "/files/files"
					File.Copy(sb36, vObjectToString, File.DirDefaultExternal, vObjectToString)
				End If
				File.Delete(mod1.vStr4 & "/files/files", vObjectToString)
			End If
		Next
	End If
	Sub015("Corrispettivi")
	Sub015("ReportPersonalizzati")
	Sub015("ProcedureSQL")
	Sub015("Loghi")
	Sub014("ImgStampe")
	Sub014("ICO32")
	Sub014("ICO48")
End Sub

Sub Sub026(str As String)
	Dim intentWrapper As Intent
	If Main.vInt9 >= 24 Then
		intentWrapper.Initialize("android.intent.action.INSTALL_PACKAGE", vfileprovider1.Sub001(str))
		intentWrapper.Flags = Bit.Or(intentWrapper.Flags, 1)
	Else
		intentWrapper.Initialize("android.intent.action.VIEW", "file://" & File.Combine(vfileprovider1.vStr1, str))
		intentWrapper.SetType("application/vnd.android.package-archive")
	End If
	StartActivity(intentWrapper)
End Sub

Sub Sub027
	If Main.v_attivaazzeramentoprogressivi Then
		Dim vGetYear As Int = DateTime.GetYear(DateTime.Now)
		If Main.vSql2.ExecQuerySingleResult("Select count(*) from AzzeraProgressivi where Anno =" & SmartStringFormatter("", vGetYear - 1) & "") = 0 Then
			Return
		End If
		If Main.vSql2.ExecQuerySingleResult("Select count(*) from AzzeraProgressivi where Anno =" & SmartStringFormatter("", vGetYear) & "") = 0 Then
			Main.vSql2.ExecNonQuery("insert into AzzeraProgressivi(Anno,Stato) values(" & SmartStringFormatter("", vGetYear) & ",0) ")
		End If
		If Main.vSql2.ExecQuerySingleResult("Select count(*) from AzzeraProgressivi where Anno =" & SmartStringFormatter("", vGetYear) & " and stato =0") > 0 Then
			Dim vObjectToCharSequence As Object = "Non sono ancora stati azzerati i progressivi delle fatture. " & SmartStringFormatter("", CRLF) & "Si desidera farlo adesso ? "
			Dim vObjectToCharSequence2 As Object = Main.vStr8
			Dim vMsgbox2 As Int = Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "Si", "La prossima volta", "No,non chiedermelo più", Main.vBmp1)
			If vMsgbox2 = -3 Then
				Return
			End If
			Main.vSql2.ExecNonQuery("update AzzeraProgressivi  set Stato=1 where Anno=" & SmartStringFormatter("", vGetYear) & " ")
			If vMsgbox2 = -1 Then
				Main.vSql1.ExecNonQuery("update progressivi set valore = 1 where codice ='F2'")
				Main.vSql1.ExecNonQuery("update progressivi set valore = 1 where codice ='F'")
				Main.vSql2.ExecNonQuery("update progressivi set valore = 1 where codice ='F2'")
				Main.vSql2.ExecNonQuery("update progressivi set valore = 1 where codice ='F'")
			End If
		End If
	End If
End Sub

Sub Sub028(map As Map, str As String, cSBuilder As CSBuilder) As Int
	Dim exc As Exception
	Dim i As Int
	Dim z As Boolean
	Dim r3 As Object
	Dim z2 As Boolean
	Dim z3 As Boolean
	Dim z4 As Boolean
	Dim z5 As Boolean
	Dim z6 As Boolean
	Dim z7 As Boolean
	Dim z8 As Boolean
	Try
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select * from clienti where codice = '" & SmartStringFormatter("", str) & "'")
		Dim cursorWrapper3 As Cursor
		Dim cursorWrapper4 As Cursor = Main.vSql1.ExecQuery("select * from FEdatiCli where codice = '" & SmartStringFormatter("", str) & "'")
		If cursorWrapper2.RowCount = 0 Or cursorWrapper4.RowCount = 0 Then
			Return 2
		End If
		cursorWrapper4.Position = 0
		cursorWrapper2.Position = 0
		Dim vSize As CSBuilder = cSBuilder.Size(22).Append("Dati in Anagrafica:").Size(15)
		vSize.Append(CRLF)
		Dim vAppend As CSBuilder = cSBuilder.Append(cursorWrapper2.GetString("descrizione"))
		vAppend.Append(CRLF)
		Dim vAppend2 As CSBuilder = cSBuilder.Append(cursorWrapper2.GetString("via"))
		vAppend2.Append(CRLF)
		Dim str2 As String = ""
		If Not(mod1.Sub222(cursorWrapper2.GetString("cap"))) Then
			str2 = cursorWrapper2.GetString("cap").Trim & " "
		End If
		If Not(mod1.Sub222(cursorWrapper2.GetString("citta"))) Then
			str2 = str2 & cursorWrapper2.GetString("citta").Trim & " "
		End If
		If Not(mod1.Sub222(cursorWrapper2.GetString("provincia"))) Then
			str2 = str2 & cursorWrapper2.GetString("provincia").Trim & " "
		End If
		If Not(mod1.Sub222(str2)) Then
			Dim vAppend3 As CSBuilder = cSBuilder.Append(str2)
			vAppend3.Append(CRLF)
		End If
		Dim vAppend4 As CSBuilder = cSBuilder.Append("P.iva. ").Append(cursorWrapper2.GetString("piva"))
		vAppend4.Append(CRLF)
		Dim vAppend5 As CSBuilder = cSBuilder.Append("Cod.Fisc. ").Append(cursorWrapper2.GetString("codf"))
		vAppend5.Append(CRLF)
		Dim vAppend6 As CSBuilder = cSBuilder.Append("PEC ").Append(cursorWrapper4.GetString("PEC"))
		vAppend6.Append(CRLF)
		Dim vAppend7 As CSBuilder = cSBuilder.Append("Cod.Destinatario ").Append(cursorWrapper4.GetString("CodiceDestinatario"))
		vAppend7.Append(CRLF)
		Dim vAppend8 As CSBuilder = cSBuilder.Append(CRLF)
		Dim vSize2 As CSBuilder = vAppend8.Append(CRLF).Size(22).Append("Dati nel QRcode:").Size(15)
		vSize2.Append(CRLF)
		Dim map2 As Map = map.Get("anag")
		Dim vTmp As String = mod1.Sub209(map2.GetDefault("denom", ""))
		Dim vObjectToString As String = map2.GetDefault("piva", "")
		Dim vObjectToString2 As String = map2.GetDefault("cf", "")
		Dim map3 As Map = map2.Get("domFisc")
		Dim vObjectToString3 As String = map3.GetDefault("prov", "")
		Dim vObjectToString4 As String = map3.GetDefault("cap", "")
		Dim vTmp_ As String = mod1.Sub209(map3.GetDefault("com", ""))
		Dim vTmp__ As String = mod1.Sub209(map3.GetDefault("ind", ""))
		Dim map4 As Map = map.Get("SDI")
		Dim vObjectToString5 As String = map4.GetDefault("pec", "")
		Dim vObjectToString6 As String = map4.GetDefault("cod", "")
		Log(mod1.Sub209(map4.GetDefault("denom", "")))
		Log(cursorWrapper2.GetString("descrizione"))
		If mod1.Sub222(cursorWrapper2.GetString("descrizione")) Then
			z = True
		Else
			r3 = (vTmp = cursorWrapper2.GetString("descrizione"))
			If r3 <> 0 Then
				Dim vAppend9 As CSBuilder = cSBuilder.Append(cursorWrapper2.GetString("descrizione"))
				vAppend9.Append(CRLF)
				z = True
			Else
				Try
					z = False
					Dim vAppend10 As CSBuilder = cSBuilder.Color(-65536).Append(vTmp)
					vAppend10.Append(CRLF).Pop
				Catch
					exc = e
					i = r3
					mod1.Sub217(LastException.Message)
					Return i
				End Try
			End If
		End If
		If vTmp__ = cursorWrapper2.GetString("via") Then
			Dim vAppend11 As CSBuilder = cSBuilder.Append(cursorWrapper2.GetString("via"))
			vAppend11.Append(CRLF)
			z2 = z
		Else
			z2 = False
			Dim vAppend12 As CSBuilder = cSBuilder.Color(-65536).Append(vTmp__)
			vAppend12.Append(CRLF).Pop
		End If
		If vObjectToString4 = cursorWrapper2.GetString("cap") Then
			cSBuilder.Append(cursorWrapper2.GetString("cap")).Append(" ")
			z3 = z2
		Else
			z3 = False
			cSBuilder.Color(-65536).Append(vObjectToString4).Append(" ").Pop
		End If
		If vTmp_ = cursorWrapper2.GetString("citta") Then
			cSBuilder.Append(cursorWrapper2.GetString("citta")).Append(" ")
			z4 = z3
		Else
			z4 = False
			cSBuilder.Color(-65536).Append(vTmp_).Append(" ").Pop
		End If
		If vObjectToString3 = cursorWrapper2.GetString("provincia") Then
			Dim vAppend13 As CSBuilder = cSBuilder.Append(cursorWrapper2.GetString("provincia"))
			vAppend13.Append(CRLF)
			z5 = z4
		Else
			z5 = False
			Dim vAppend14 As CSBuilder = cSBuilder.Color(-65536).Append(vObjectToString3)
			vAppend14.Append(CRLF).Pop
		End If
		If vObjectToString = cursorWrapper2.GetString("piva") Then
			Dim vAppend15 As CSBuilder = cSBuilder.Append("P.iva. ").Append(cursorWrapper2.GetString("piva"))
			vAppend15.Append(CRLF)
			z6 = z5
		Else
			z6 = False
			Dim vAppend16 As CSBuilder = cSBuilder.Color(-65536).Append("P.iva. ").Append(vObjectToString)
			vAppend16.Append(CRLF).Pop
		End If
		If vObjectToString2 = cursorWrapper2.GetString("codf") Then
			Dim vAppend17 As CSBuilder = cSBuilder.Append("Cod.Fisc. ").Append(cursorWrapper2.GetString("codf"))
			vAppend17.Append(CRLF)
			z7 = z6
		Else
			z7 = False
			Dim vAppend18 As CSBuilder = cSBuilder.Color(-65536).Append("Cod.Fisc. ").Append(vObjectToString2)
			vAppend18.Append(CRLF).Pop
		End If
		If vObjectToString5 = cursorWrapper4.GetString("PEC") Then
			Dim vAppend19 As CSBuilder = cSBuilder.Append("PEC ").Append(cursorWrapper4.GetString("PEC"))
			vAppend19.Append(CRLF)
			z8 = z7
		Else
			z8 = False
			Dim vAppend20 As CSBuilder = cSBuilder.Color(-65536).Append("PEC ").Append(vObjectToString5)
			vAppend20.Append(CRLF).Pop
		End If
		If vObjectToString6 = cursorWrapper4.GetString("CodiceDestinatario") Then
			Dim vAppend21 As CSBuilder = cSBuilder.Append("Cod.Destinatario ").Append(cursorWrapper4.GetString("CodiceDestinatario"))
			vAppend21.Append(CRLF)
			r3 = z8
		Else
			r3 = 0
			Dim vAppend22 As CSBuilder = cSBuilder.Color(-65536).Append("Cod.Destinatario ").Append(vObjectToString6)
			vAppend22.Append(CRLF).Pop
		End If
		cursorWrapper4.Close
		cursorWrapper2.Close
		Return IIf(r3 = True, 1, 0)
	Catch
		exc = e2
		i = 1
	End Try
End Sub

Sub Sub029(i As Int, list As List, z As Boolean) As Boolean
	If Main.vCur8.GetInt("RTPagamento") = 11 Then
		If Not(z) Then
			Dim size As Int = list.Size - 1
			Dim i2 As Int
			For i2 = 0 To size
				If list.Get(i2) <> 0 Then
					Main.vCur8.Position = i2
					If Main.vCur8.GetInt("RTPagamento") = 7 Then
						Dim vObjectToCharSequence As Object = "Non è possibile utilizzare una causale a credito di tipo NON RISCOSSO BENI quando è già stata utilizzata una causale a credito di tipo NON RISCOSSO SERVIZI"
						Dim vObjectToCharSequence2 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence, vObjectToCharSequence2, "OK", "", "", Main.vBmp1)
						Return False
					End If
				End If
			Next
		End If
		Dim cursorWrapper As Cursor
		Dim cursorWrapper2 As Cursor = Main.vSql1.ExecQuery("select codice from iva where RTIva = 12")
		Dim rowCount As Int = cursorWrapper2.RowCount - 1
		Dim i3 As Int
		For i3 = 0 To rowCount
			cursorWrapper2.Position = i3
			Dim str As String = ""
			If Main.vBln12 Then
				str = " and Qtad >0 "
			End If
			If Main.vSql1.ExecQuerySingleResult("select count(*) from Ventmp where iva=" & SmartStringFormatter("", cursorWrapper2.GetInt("codice")) & "" & SmartStringFormatter("", str) & "") > 0 Then
				Dim vObjectToCharSequence3 As Object = "Non è possibile utilizzare una causale a credito di tipo NON RISCOSSO SERVIZI in presenza di articoli con la ventilazione iva"
				Dim vObjectToCharSequence4 As Object = Main.vStr8
				Msgbox2(vObjectToCharSequence3, vObjectToCharSequence4, "OK", "", "", Main.vBmp1)
				Return False
			End If
		Next
		cursorWrapper2.Close
	Else
		If Main.vCur8.GetInt("RTPagamento") = 7 Then
			If Not(z) Then
				Dim size2 As Int = list.Size - 1
				Dim i4 As Int
				For i4 = 0 To size2
					If list.Get(i4) <> 0 Then
						Main.vCur8.Position = i4
						If Main.vCur8.GetInt("RTPagamento") = 11 Then
							Dim vObjectToCharSequence5 As Object = "Non è possibile utilizzare una causale a credito di tipo NON RISCOSSO SERVIZI quando è già stata utilizzata una causale a credito di tipo NON RISCOSSO BENI"
							Dim vObjectToCharSequence6 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence5, vObjectToCharSequence6, "OK", "", "", Main.vBmp1)
							Return False
						End If
					End If
				Next
			End If
		End If
		If Main.vCur8.GetInt("RTPagamento") = 12 Then
			If Not(z) Then
				Dim size3 As Int = list.Size - 1
				Dim i5 As Int
				For i5 = 0 To size3
					If list.Get(i5) <> 0 Then
						Main.vCur8.Position = i5
						If Main.vCur8.GetInt("RTPagamento") <> 12 Then
							Dim vObjectToCharSequence7 As Object = "Non è possibile utilizzare una causale a credito di tipo NON RISCOSSO SEGUE FATTURA quando è già stata utilizzata una causale di tipo diversa"
							Dim vObjectToCharSequence8 As Object = Main.vStr8
							Msgbox2(vObjectToCharSequence7, vObjectToCharSequence8, "OK", "", "", Main.vBmp1)
							Return False
						End If
					End If
				Next
			End If
		End If
	End If
	Main.vCur8.Position = i
	If Main.vCur8.GetInt("RTPagamento") <> 12 Then
		If Not(z) Then
			Dim size4 As Int = list.Size - 1
			Dim i6 As Int
			For i6 = 0 To size4
				If list.Get(i6) <> 0 Then
					Main.vCur8.Position = i6
					If Main.vCur8.GetInt("RTPagamento") = 12 Then
						Dim vObjectToCharSequence9 As Object = "Non è possibile utilizzare una causale diversa dal credito di tipo NON RISCOSSO SEGUE FATTURA"
						Dim vObjectToCharSequence10 As Object = Main.vStr8
						Msgbox2(vObjectToCharSequence9, vObjectToCharSequence10, "OK", "", "", Main.vBmp1)
						Return False
					End If
				End If
			Next
		End If
	End If
	Return True
End Sub

