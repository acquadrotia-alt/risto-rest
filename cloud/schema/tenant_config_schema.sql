CREATE TABLE IF NOT EXISTS [anagra] (
  [codint] TEXT PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [reparto] INTEGER NOT NULL DEFAULT 1,
  [iva] INTEGER NOT NULL DEFAULT 0,
  [gruppo] TEXT,
  [list1] REAL NOT NULL DEFAULT 0,
  [list2] REAL NOT NULL DEFAULT 0,
  [list3] REAL NOT NULL DEFAULT 0,
  [list4] REAL NOT NULL DEFAULT 0,
  [list5] REAL NOT NULL DEFAULT 0,
  [giac] REAL NOT NULL DEFAULT 0,
  [sottoscorta] INTEGER NOT NULL DEFAULT 0,
  [plupeso] INTEGER NOT NULL DEFAULT 0,
  [flgvar] INTEGER NOT NULL DEFAULT 0,
  [flgmag] INTEGER NOT NULL DEFAULT 0,
  [flgnoreso] INTEGER NOT NULL DEFAULT 0,
  [flgusointerno] INTEGER NOT NULL DEFAULT 0,
  [scop] REAL NOT NULL DEFAULT 0,
  [scov] REAL NOT NULL DEFAULT 0,
  [bvar] INTEGER NOT NULL DEFAULT 0,
  [des2] TEXT NOT NULL DEFAULT '',
  [des1] TEXT NOT NULL DEFAULT '',
  [Style] TEXT NOT NULL DEFAULT '',
  [ingredientisumf] INTEGER NOT NULL DEFAULT 0,
  [ingredientisunf] INTEGER NOT NULL DEFAULT 0,
  [distinta] INTEGER NOT NULL DEFAULT 0,
  [uscita] INTEGER NOT NULL DEFAULT 0,
  [gruppov] INTEGER NOT NULL DEFAULT 0,
  [variazioni] INTEGER NOT NULL DEFAULT 0,
  [stampaesclusiva] INTEGER NOT NULL DEFAULT 0,
  [stampante2] INTEGER NOT NULL DEFAULT 0,
  [stampasubito] INTEGER NOT NULL DEFAULT 0,
  [indice] INTEGER NOT NULL DEFAULT 9,
  [peso] REAL NOT NULL DEFAULT 0,
  [qtacartone] INTEGER NOT NULL DEFAULT 0,
  [qtaottimale] INTEGER NOT NULL DEFAULT 0,
  [qtaminima] REAL NOT NULL DEFAULT 0,
  [fraziona] INTEGER NOT NULL DEFAULT 0,
  [obbligoprz] INTEGER NOT NULL DEFAULT 0,
  [obbligoqta] INTEGER NOT NULL DEFAULT 0,
  [datapubblicazione] TEXT NOT NULL DEFAULT '',
  [periodicita] INTEGER NOT NULL DEFAULT 0,
  [locked] INTEGER NOT NULL DEFAULT 0,
  [dll] TEXT NOT NULL DEFAULT '',
  [textsize] INTEGER NOT NULL DEFAULT 0,
  [colore] INTEGER NOT NULL DEFAULT 0,
  [colorec] INTEGER NOT NULL DEFAULT 0,
  [colores] INTEGER NOT NULL DEFAULT 0,
  [coloret] INTEGER NOT NULL DEFAULT 0,
  [obbligodes] INTEGER NOT NULL DEFAULT 0,
  [variazioniauto] INTEGER NOT NULL DEFAULT 0,
  [invioweb] INTEGER NOT NULL DEFAULT 1,
  [Kcal] INTEGER NOT NULL DEFAULT 0,
  [punti] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_anagra_upd] ON [anagra]([_updated_at]);

CREATE TABLE IF NOT EXISTS [anagraDescrizioni] (
  [codint] TEXT PRIMARY KEY,
  [descrizione1] TEXT NOT NULL DEFAULT '',
  [descrizione2] TEXT NOT NULL DEFAULT '',
  [descrizione3] TEXT NOT NULL DEFAULT '',
  [descrizione4] TEXT NOT NULL DEFAULT '',
  [descrizione5] TEXT NOT NULL DEFAULT '',
  [ingredienti1] TEXT NOT NULL DEFAULT '',
  [ingredienti2] TEXT NOT NULL DEFAULT '',
  [ingredienti3] TEXT NOT NULL DEFAULT '',
  [ingredienti4] TEXT NOT NULL DEFAULT '',
  [ingredienti5] TEXT NOT NULL DEFAULT '',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_anagraDescrizioni_upd] ON [anagraDescrizioni]([_updated_at]);

CREATE TABLE IF NOT EXISTS [ean] (
  [chiave] INTEGER PRIMARY KEY,
  [codint] TEXT,
  [codice] TEXT NOT NULL DEFAULT '',
  [qta] REAL NOT NULL DEFAULT 1,
  [importo] REAL NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_ean_upd] ON [ean]([_updated_at]);

CREATE TABLE IF NOT EXISTS [TestiArt] (
  [codice] TEXT PRIMARY KEY,
  [testo] TEXT NOT NULL DEFAULT '',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_TestiArt_upd] ON [TestiArt]([_updated_at]);

CREATE TABLE IF NOT EXISTS [reparti] (
  [codice] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [maximpo] REAL NOT NULL DEFAULT 999,
  [iva] INTEGER NOT NULL DEFAULT 0,
  [NF] INTEGER NOT NULL DEFAULT 0,
  [Palmari] INTEGER NOT NULL DEFAULT 0,
  [guadagnop] REAL NOT NULL DEFAULT 0,
  [guadagnov] REAL NOT NULL DEFAULT 0,
  [indice] INTEGER NOT NULL DEFAULT 0,
  [TurnoP] INTEGER NOT NULL DEFAULT 0,
  [invioweb] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_reparti_upd] ON [reparti]([_updated_at]);

CREATE TABLE IF NOT EXISTS [gruppovar] (
  [codice] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [vEsclusive] INTEGER NOT NULL DEFAULT 0,
  [indice] INTEGER NOT NULL DEFAULT 9,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_gruppovar_upd] ON [gruppovar]([_updated_at]);

CREATE TABLE IF NOT EXISTS [GruppiVariazioniArt] (
  [codint] TEXT NOT NULL DEFAULT '',
  [reparto] INTEGER NOT NULL DEFAULT 1,
  [chiave] INTEGER PRIMARY KEY,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_GruppiVariazioniArt_upd] ON [GruppiVariazioniArt]([_updated_at]);

CREATE TABLE IF NOT EXISTS [varauto] (
  [chiave] INTEGER PRIMARY KEY,
  [codint] TEXT NOT NULL DEFAULT '',
  [codintvar] TEXT NOT NULL DEFAULT '',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_varauto_upd] ON [varauto]([_updated_at]);

CREATE TABLE IF NOT EXISTS [MenuCard] (
  [chiave] INTEGER PRIMARY KEY,
  [Serial] TEXT,
  [Scancode] INTEGER,
  [Descrizione] TEXT,
  [Tipo] TEXT,
  [Codice] TEXT,
  [LocationSize] TEXT NOT NULL DEFAULT '',
  [Image] TEXT NOT NULL DEFAULT '',
  [BtnStyle] TEXT NOT NULL DEFAULT '',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_MenuCard_upd] ON [MenuCard]([_updated_at]);

CREATE TABLE IF NOT EXISTS [headmnu] (
  [codmnu] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [attiva] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_headmnu_upd] ON [headmnu]([_updated_at]);

CREATE TABLE IF NOT EXISTS [dettmnu] (
  [codmnu] INTEGER,
  [codint] TEXT,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [prezzo] REAL NOT NULL DEFAULT 0,
  [indice] INTEGER NOT NULL DEFAULT 0,
  [desreparto] TEXT NOT NULL DEFAULT '',
  [chiave] INTEGER PRIMARY KEY AUTOINCREMENT,
  [auto] INTEGER NOT NULL DEFAULT 0,
  [mnuattivo] INTEGER NOT NULL DEFAULT 1,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_dettmnu_upd] ON [dettmnu]([_updated_at]);

CREATE TABLE IF NOT EXISTS [distintabase] (
  [chiave] INTEGER PRIMARY KEY,
  [codint] TEXT NOT NULL DEFAULT '',
  [codintpadre] TEXT NOT NULL DEFAULT '',
  [qta] REAL NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_distintabase_upd] ON [distintabase]([_updated_at]);

CREATE TABLE IF NOT EXISTS [ingredienti] (
  [codice] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_ingredienti_upd] ON [ingredienti]([_updated_at]);

CREATE TABLE IF NOT EXISTS [ingredientiplu] (
  [chiave] INTEGER PRIMARY KEY,
  [codice] INTEGER NOT NULL DEFAULT -1,
  [codint] TEXT NOT NULL DEFAULT '',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_ingredientiplu_upd] ON [ingredientiplu]([_updated_at]);

CREATE TABLE IF NOT EXISTS [allergeni] (
  [codice] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [tag] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_allergeni_upd] ON [allergeni]([_updated_at]);

CREATE TABLE IF NOT EXISTS [allergeniplu] (
  [chiave] INTEGER PRIMARY KEY,
  [codice] INTEGER NOT NULL DEFAULT -1,
  [codint] TEXT NOT NULL DEFAULT '',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_allergeniplu_upd] ON [allergeniplu]([_updated_at]);

CREATE TABLE IF NOT EXISTS [headoff] (
  [codofferta] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [attiva] INTEGER NOT NULL DEFAULT 0,
  [attivaweb] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_headoff_upd] ON [headoff]([_updated_at]);

CREATE TABLE IF NOT EXISTS [dettoff] (
  [codofferta] INTEGER,
  [codint] TEXT,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [scop] REAL NOT NULL DEFAULT 0,
  [scop2] REAL NOT NULL DEFAULT 0,
  [scov] REAL NOT NULL DEFAULT 0,
  [scov2] REAL NOT NULL DEFAULT 0,
  [prezzo] REAL NOT NULL DEFAULT 0,
  [prezzo2] REAL NOT NULL DEFAULT 0,
  [attiva] INTEGER NOT NULL DEFAULT 0,
  [chiave] INTEGER PRIMARY KEY,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_dettoff_upd] ON [dettoff]([_updated_at]);

CREATE TABLE IF NOT EXISTS [offerteUniandro] (
  [codint] TEXT PRIMARY KEY,
  [campi] TEXT NOT NULL DEFAULT '',
  [dadata] TEXT NOT NULL DEFAULT '1900-01-01',
  [adata] TEXT NOT NULL DEFAULT '1900-01-01',
  [list1] REAL NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_offerteUniandro_upd] ON [offerteUniandro]([_updated_at]);

CREATE TABLE IF NOT EXISTS [iva] (
  [codice] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [aliquota] REAL,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_iva_upd] ON [iva]([_updated_at]);

CREATE TABLE IF NOT EXISTS [pagamenti] (
  [codice] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [cassa] INTEGER NOT NULL DEFAULT 0,
  [obbligo] INTEGER NOT NULL DEFAULT 0,
  [buonosr] INTEGER NOT NULL DEFAULT 0,
  [copiascontrino] INTEGER NOT NULL DEFAULT 0,
  [resto] INTEGER NOT NULL DEFAULT 1,
  [CausaleEft] INTEGER NOT NULL DEFAULT 0,
  [IpEft] TEXT NOT NULL DEFAULT '',
  [PortaEft] INTEGER NOT NULL DEFAULT 1000,
  [SempreDocFisc] INTEGER NOT NULL DEFAULT 0,
  [BuonoComeP] INTEGER NOT NULL DEFAULT 0,
  [glory] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_pagamenti_upd] ON [pagamenti]([_updated_at]);

CREATE TABLE IF NOT EXISTS [CausaliPagamenti] (
  [codice] INTEGER,
  [descrizione] TEXT,
  [datam] TEXT,
  [nmov] REAL,
  [qta] INTEGER,
  [importo] REAL,
  [chiave] INTEGER PRIMARY KEY,
  [sospeso] INTEGER NOT NULL DEFAULT 0,
  [datam3] TEXT NOT NULL DEFAULT '1900-01-01',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_CausaliPagamenti_upd] ON [CausaliPagamenti]([_updated_at]);

CREATE TABLE IF NOT EXISTS [clienti] (
  [codice] TEXT,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [citta] TEXT NOT NULL DEFAULT '',
  [provincia] TEXT NOT NULL DEFAULT '',
  [piva] TEXT NOT NULL DEFAULT '',
  [codf] TEXT NOT NULL DEFAULT '',
  [telefono] TEXT NOT NULL DEFAULT '',
  [fax] TEXT NOT NULL DEFAULT '',
  [via] TEXT NOT NULL DEFAULT '',
  [cap] TEXT NOT NULL DEFAULT '',
  [listino] INTEGER NOT NULL DEFAULT 0,
  [sconto] INTEGER NOT NULL DEFAULT 0,
  [punti] INTEGER NOT NULL DEFAULT 0,
  [prep] REAL NOT NULL DEFAULT 0,
  [fido] REAL NOT NULL DEFAULT 0,
  [chiave] INTEGER PRIMARY KEY,
  [abpunti] INTEGER NOT NULL DEFAULT 0,
  [abprep] INTEGER NOT NULL DEFAULT 0,
  [abpost] INTEGER NOT NULL DEFAULT 0,
  [mail] TEXT NOT NULL DEFAULT '',
  [attivo] INTEGER NOT NULL DEFAULT 1,
  [stampariep] INTEGER NOT NULL DEFAULT 0,
  [eiva] INTEGER NOT NULL DEFAULT 0,
  [DaInviare] INTEGER NOT NULL DEFAULT 0,
  [zona] INTEGER NOT NULL DEFAULT 0,
  [CodMaster] TEXT NOT NULL DEFAULT '',
  [PwdWeb] TEXT NOT NULL DEFAULT '',
  [abstampabuono] INTEGER NOT NULL DEFAULT 1,
  [tesseraaggiuntiva] INTEGER NOT NULL DEFAULT 0,
  [scadcliente] TEXT NOT NULL DEFAULT '2099-01-01',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_clienti_upd] ON [clienti]([_updated_at]);

CREATE TABLE IF NOT EXISTS [clients] (
  [codice] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [IP] TEXT NOT NULL DEFAULT '',
  [stato] INTEGER NOT NULL DEFAULT 0,
  [compare] REAL NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_clients_upd] ON [clients]([_updated_at]);

CREATE TABLE IF NOT EXISTS [TestiCli] (
  [codice] TEXT PRIMARY KEY,
  [testo] TEXT NOT NULL DEFAULT '',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_TestiCli_upd] ON [TestiCli]([_updated_at]);

CREATE TABLE IF NOT EXISTS [operatori] (
  [codice] INTEGER PRIMARY KEY,
  [pwd] TEXT NOT NULL DEFAULT '11111',
  [descrizione] TEXT NOT NULL DEFAULT '',
  [funzioni] TEXT NOT NULL DEFAULT '111111111111111111111111111111111111111111111111',
  [pagdefault] INTEGER NOT NULL DEFAULT 1,
  [CodAutomatico] TEXT NOT NULL DEFAULT '',
  [Attivo] INTEGER NOT NULL DEFAULT 1,
  [CodAutoPermanente] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_operatori_upd] ON [operatori]([_updated_at]);

CREATE TABLE IF NOT EXISTS [pagine] (
  [chiave] INTEGER PRIMARY KEY,
  [pagina] INTEGER,
  [tasto] INTEGER,
  [riga] INTEGER,
  [colonna] INTEGER,
  [dimensione] INTEGER,
  [colore] INTEGER,
  [testo] TEXT,
  [tipo] INTEGER,
  [valore] INTEGER,
  [icona] INTEGER,
  [plurep] INTEGER NOT NULL DEFAULT 0,
  [colorec] INTEGER NOT NULL DEFAULT -10,
  [colores] INTEGER NOT NULL DEFAULT -10,
  [coloret] INTEGER NOT NULL DEFAULT -10,
  [importo] REAL NOT NULL DEFAULT 0,
  [textsize] INTEGER NOT NULL DEFAULT 0,
  [dll] TEXT NOT NULL DEFAULT '',
  [locked] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_pagine_upd] ON [pagine]([_updated_at]);

CREATE TABLE IF NOT EXISTS [Despagine] (
  [codice] INTEGER,
  [descrizione] TEXT,
  [obbligocoperti] INTEGER NOT NULL DEFAULT 0,
  [listinocoperti] INTEGER NOT NULL DEFAULT 0,
  [chiave] INTEGER PRIMARY KEY,
  [noazzera] INTEGER NOT NULL DEFAULT 0,
  [listino] INTEGER NOT NULL DEFAULT 0,
  [nopalmari] INTEGER NOT NULL DEFAULT 0,
  [servizio] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_Despagine_upd] ON [Despagine]([_updated_at]);

CREATE TABLE IF NOT EXISTS [Toolbar] (
  [chiave] INTEGER PRIMARY KEY,
  [codice] INTEGER NOT NULL DEFAULT 0,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [tipo] INTEGER NOT NULL DEFAULT 0,
  [valore] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_Toolbar_upd] ON [Toolbar]([_updated_at]);

CREATE TABLE IF NOT EXISTS [confstampe] (
  [codice] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [layout] INTEGER NOT NULL DEFAULT 0,
  [ip] TEXT NOT NULL DEFAULT '',
  [asporto] INTEGER NOT NULL DEFAULT 0,
  [stato] INTEGER NOT NULL DEFAULT 0,
  [counter] INTEGER NOT NULL DEFAULT 1,
  [cp1] INTEGER NOT NULL DEFAULT 0,
  [cp2] INTEGER NOT NULL DEFAULT 0,
  [mf] INTEGER NOT NULL DEFAULT 0,
  [RiepTurni] INTEGER NOT NULL DEFAULT 1,
  [RiepTurniD] INTEGER NOT NULL DEFAULT 0,
  [ApriCassetto] INTEGER NOT NULL DEFAULT 0,
  [TagliaTurno] INTEGER NOT NULL DEFAULT 1,
  [copie] INTEGER NOT NULL DEFAULT 0,
  [indice] INTEGER NOT NULL DEFAULT 0,
  [espandi] INTEGER NOT NULL DEFAULT 0,
  [tavoli] INTEGER NOT NULL DEFAULT 1,
  [escpos] INTEGER NOT NULL DEFAULT 0,
  [consolida] INTEGER NOT NULL DEFAULT 0,
  [riepAT] INTEGER NOT NULL DEFAULT 0,
  [TuttiTurni] INTEGER NOT NULL DEFAULT 0,
  [noturno] INTEGER NOT NULL DEFAULT 0,
  [notaglio] INTEGER NOT NULL DEFAULT 0,
  [datavolo] INTEGER NOT NULL DEFAULT 0,
  [atavolo] INTEGER NOT NULL DEFAULT 0,
  [GroupR] INTEGER NOT NULL DEFAULT 0,
  [asportoS] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_confstampe_upd] ON [confstampe]([_updated_at]);

CREATE TABLE IF NOT EXISTS [Stampe] (
  [codice] INTEGER,
  [descrizione] TEXT,
  [flgchiusura] INTEGER NOT NULL DEFAULT 0,
  [flgattiva] INTEGER NOT NULL DEFAULT 1,
  [flgmail] INTEGER NOT NULL DEFAULT 0,
  [chiave] INTEGER PRIMARY KEY,
  [flgmailc] INTEGER NOT NULL DEFAULT 0,
  [tipob] INTEGER NOT NULL DEFAULT 0,
  [flgcopia] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_Stampe_upd] ON [Stampe]([_updated_at]);

CREATE TABLE IF NOT EXISTS [filtristampe] (
  [codice] INTEGER,
  [reparto] INTEGER NOT NULL DEFAULT 0,
  [chiave] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_filtristampe_upd] ON [filtristampe]([_updated_at]);

CREATE TABLE IF NOT EXISTS [intesta] (
  [codice] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [tipo] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_intesta_upd] ON [intesta]([_updated_at]);

CREATE TABLE IF NOT EXISTS [intestaNF] (
  [codice] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [tipo] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_intestaNF_upd] ON [intestaNF]([_updated_at]);

CREATE TABLE IF NOT EXISTS [Palmari] (
  [Serial] TEXT,
  [Operatore] INTEGER NOT NULL DEFAULT 1,
  [chiave] INTEGER PRIMARY KEY,
  [DateLastLogin] TEXT,
  [NeedUpd] INTEGER NOT NULL DEFAULT 0,
  [Attivo] INTEGER NOT NULL DEFAULT 0,
  [TipoLogin] INTEGER NOT NULL DEFAULT 0,
  [ObbligoCoperto] INTEGER NOT NULL DEFAULT 0,
  [Preconto] INTEGER NOT NULL DEFAULT 0,
  [IP] TEXT NOT NULL DEFAULT '',
  [AttivaBT] INTEGER NOT NULL DEFAULT 0,
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_Palmari_upd] ON [Palmari]([_updated_at]);

CREATE TABLE IF NOT EXISTS [oraasporto] (
  [codice] TEXT PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_oraasporto_upd] ON [oraasporto]([_updated_at]);

CREATE TABLE IF NOT EXISTS [LinguaDescrizioniWeb] (
  [codice] INTEGER PRIMARY KEY,
  [descrizione] TEXT NOT NULL DEFAULT '',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_LinguaDescrizioniWeb_upd] ON [LinguaDescrizioniWeb]([_updated_at]);

CREATE TABLE IF NOT EXISTS [versione] (
  [versione] INTEGER,
  [CodWeb] TEXT NOT NULL DEFAULT 'B32',
  [_updated_at] INTEGER NOT NULL DEFAULT 0,
  [_deleted] INTEGER NOT NULL DEFAULT 0
);
CREATE INDEX IF NOT EXISTS [ix_versione_upd] ON [versione]([_updated_at]);

