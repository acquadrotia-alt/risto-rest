# RistorAndro Cloud – Architettura e modello dati (bozza v1)

Documento di progetto per la nuova versione **cloud-first, multi-cliente**. Da rivedere insieme
prima di scrivere il backend. Non contiene codice definitivo: è la mappa che guida lo sviluppo.

Decisioni già prese con il committente:
- **SaaS multi-cliente**: si rivende a più clienti, dati di ogni cliente separati.
- Ogni cliente può avere **una o più casse** che condividono gli stessi dati.
- **Back-office web**: tutta la gestione (articoli, impostazioni, listini, report) sta lì.
- L'**APK** è solo lo strumento operativo: si collega alla stampante fiscale e fa funzionare la cassa.
- **Funzionamento offline obbligatorio**: la cassa vende e stampa anche senza internet.

---

## 1. Principi di base

1. **Local-first per l'operatività.** Vendita, comande, stampa fiscale e dialogo con l'RT avvengono
   **in locale**, in tempo reale, anche senza rete. Il cloud non è nel percorso critico della vendita.
2. **Cloud come verità per la configurazione.** Articoli, listini, operatori, reparti, IVA, pagamenti,
   layout, impostazioni vivono nel cloud (gestiti dal back-office) e vengono **scaricati** sulla cassa.
3. **Il cloud raccoglie le vendite** (push dalla cassa) per report e controllo centralizzato.
4. **Multi-tenant con isolamento forte**: i dati di un cliente non toccano quelli di un altro.
5. **Le licenze vivono nel cloud**: nessun segreto nell'APK (risolve il problema attuale del keygen).

Modello di riferimento: i POS cloud moderni (Square, Tilby). La cassa è un client intelligente con
cache locale, non un terminale stupido.

---

## 2. Attori e topologia

```
                        ┌──────────────────────────────────────────┐
                        │              CLOUDFLARE                    │
                        │                                            │
   Back-office web  ────┤  Workers (API REST)                        │
   (browser, gestione)  │     │                                      │
                        │     ├── Control-plane D1  (account,        │
                        │     │     licenze, catalogo tenant)        │
                        │     ├── D1 per-tenant  (dati di 1 cliente)  │
                        │     ├── R2 (loghi, export, backup)          │
                        │     └── chiavi di firma licenze (solo qui)  │
                        └───────────────┬────────────────────────────┘
                                        │ HTTPS (sync)
                   ┌────────────────────┼────────────────────┐
                   │                    │                     │
             ┌─────┴─────┐        ┌─────┴─────┐         ┌─────┴─────┐
             │ Cassa 1   │        │ Cassa 2   │   ...   │ Palmare   │
             │ APK B4A   │        │ APK B4A   │         │ (opz.)    │
             │ SQLite loc│        │ SQLite loc│         └───────────┘
             │  │        │        │           │
             │  └─ RT Custom (TCP 9100 / seriale / SpiceT)
             └───────────┘        └───────────┘
```

Gerarchia dei concetti:
- **Tenant / Cliente**: un'azienda cliente (chi compra il software). Dati isolati.
- **Punto vendita / Locale**: un cliente può averne più d'uno.
- **Cassa / Device**: un APK installato, legato a una matricola RT.
- **Operatore**: utente che opera sulla cassa.
- **Utente back-office**: chi gestisce da browser (può coprire più locali dello stesso cliente).
- **Super-admin (tu/rivenditore)**: crea i clienti, attiva licenze, vede lo stato del parco installato.

---

## 3. Componenti

### 3.1 Backend Cloudflare
- **Workers**: l'API REST (autenticazione, sync config, raccolta vendite, licenze, report).
- **D1** (database SQLite gestito): è la scelta chiave, perché gli schemi attuali sono già SQLite →
  migrazione quasi 1:1.
  - **Control-plane DB** (uno, condiviso): tenant, utenti back-office, dispositivi, licenze/abbonamenti.
  - **DB per-tenant** (uno per cliente): tutti i dati gestionali/vendite di quel cliente.
    Isolamento forte, export/cancellazione per cliente banali, si sposa con "importo da zero per cliente".
- **R2**: loghi, immagini articoli, export Excel/PDF, backup.
- **KV / Durable Objects**: coordinamento sync multi-cassa (lock tavoli, numerazione condivisa).
- **Chiavi di firma licenze**: generate e custodite **solo** nel cloud. Mai nell'APK.

> Nota: questo ambiente ha accesso autenticato a Cloudflare, quindi backend, D1 e back-office posso
> costruirli e testarli **da qui**, senza il PC Windows. Il client B4A lo compili tu.

### 3.2 Back-office web
Applicazione web (una per il rivenditore, multi-tenant) con due livelli:
- **Area cliente**: gestione articoli, listini, varianti, menu, reparti, IVA, pagamenti, operatori,
  layout tasti, impostazioni di stampa, prenotazioni, report di vendita — per uno o più locali.
- **Area super-admin (rivenditore)**: creazione clienti, attivazione/rinnovo licenze, moduli
  abilitati, numero casse/palmari, stato del parco, revoca.

### 3.3 Client APK (B4A)
- Riusa **integralmente il modulo fiscale** `ccefdll` (protocollo Custom) dal progetto recuperato.
- Mantiene una **SQLite locale** (come oggi) come cache di lavoro offline.
- All'avvio: login/attivazione → scarica la configurazione aggiornata → opera.
- Durante il lavoro: tutto in locale; in background **sincronizza** vendite verso il cloud e
  **riceve** aggiornamenti di configurazione.
- UI operativa (tavoli, comande, pagamento, stampa) resta sul dispositivo.

---

## 4. Multi-tenancy e isolamento

**Scelta consigliata: un database D1 per cliente** + un control-plane condiviso.

Vantaggi:
- Isolamento fisico dei dati (argomento di vendita forte verso i clienti).
- "Riparti da zero" per un nuovo cliente = crei un DB vuoto dal template. Nessuna migrazione.
- Backup, export e cancellazione per singolo cliente immediati (anche per GDPR).

Caveat: gestire molti DB ha un limite pratico (centinaia). **Deciso**: parco previsto **< 100 clienti**
(con possibile crescita contenuta) → D1-per-tenant è la scelta definitiva. Se un domani diventassero
migliaia, si rivaluterebbe il modello a DB condiviso con `tenant_id`.

Ogni richiesta dall'APK porta: token dispositivo → risolve tenant → instrada al suo DB.

---

## 5. Modello dati: dove vive ogni cosa

Classificazione di prima passata delle **73 tabelle di `anagra.db`** e 9 di `venduto.db` in tre gruppi.
Da validare insieme (alcune sono incerte).

### A) Dati "master" gestiti nel cloud → scaricati sulla cassa (lettura prevalente)
Configurazione e anagrafiche. Modificati nel back-office, la cassa ne tiene copia locale aggiornata.

| Ambito | Tabelle |
|---|---|
| Articoli | `anagra`, `anagraDescrizioni`, `ean`, `TestiArt`, `ArtBloccati`, `eliminati` |
| Categorie/reparti | `reparti`, `gruppovar`, `GruppiVariazioniArt`, `varauto` |
| Menu / distinte | `MenuCard`, `headmnu`, `dettmnu`, `distintabase` |
| Varianti / ingredienti | `ingredienti`, `ingredientiplu`, `allergeni`, `allergeniplu` |
| Offerte | `headoff`, `dettoff`, `offerteUniandro` |
| Listini / IVA / pagamenti | `iva`, `pagamenti`, `CausaliPagamenti` |
| Clienti | `clienti`, `clients`, `TestiCli`, `DatiFattFM` |
| Operatori | `operatori` |
| Layout e tasti | `pagine`, `Despagine`, `Toolbar` |
| Stampe / configurazione | `confstampe`, `Stampe`, `StampaCP`, `filtristampe`, `filtristampeBT`, `HeaddaStampare` |
| Intestazioni | `intesta`, `intestaNF` |
| Impostazioni / sistema | `Parameters`, `Palmari`, `oraasporto`, `LinguaDescrizioniWeb`, `versione` |

### B) Dati transazionali generati sulla cassa → sincronizzati verso il cloud (per i report)
Prodotti durante l'uso. La cassa li crea in locale e li spinge al cloud quando può.

| Ambito | Tabelle |
|---|---|
| Vendite / movimenti | `headmov`, `Venduto`, `venduto` (venduto.db), `headmovRecallAsporto` |
| Cassa | `Cassetto` |
| Ordini | `headord`, `dettord` |
| Prenotazioni | `Prenota`, `telefonate` |
| Progressivi documenti | `progressivi` |

### C) Dati locali effimeri → non sincronizzati (vivono solo sulla cassa)
Stato operativo del momento, temporanei, code di stampa, lock.

| Ambito | Tabelle |
|---|---|
| Stato tavoli | `tavoli`, `unlocktbl` (lock per multi-cassa) |
| Conto in corso / temporanei | `Ventmp`, `TmpFraziona`, `TmpIva`, `TmpFinanziario`, `LastTmp`, `varautoTmp`, `distintabaseTmp` |
| Code di stampa | `daStampare`, `tmpStampa`, `tmpStampaPalm1..9` |

> La maggior parte dei `Tmp*` sparisce nel nuovo modello: sono scorciatoie dell'app vecchia.

---

## 6. Sincronizzazione (il cuore dell'offline-first)

- **Config (gruppo A): pull versionato.** Ogni entità ha una versione/aggiornato-il. La cassa chiede
  "cosa è cambiato dopo X" e aggiorna la cache locale. La cassa **non** modifica i dati master.
- **Vendite (gruppo B): push append-only.** Ogni documento chiuso è immutabile e ha un ID univoco
  generato dalla cassa (es. `deviceId + progressivo`), così il reinvio è idempotente e non duplica.
  La coda locale si svuota quando torna la rete.
- **Multi-cassa (stesso locale):**
  - Stato tavoli condiviso → serve un coordinamento (Durable Object) con **lock** sul tavolo
    (il concetto `unlocktbl` esiste già): mentre una cassa lavora un tavolo, le altre lo vedono occupato.
  - Numerazioni condivise (es. numero conto) → assegnate/validate dal cloud quando online, con fallback
    locale per-cassa quando offline (prefisso per cassa per evitare collisioni).
- **Conflitti:** la configurazione è "cloud vince" (sola lettura sulla cassa); le vendite non
  confliggono (append-only); lo stato tavoli è gestito dai lock.

**Deciso**: in un locale multi-cassa le casse devono restare **collegate fra loro anche offline**
(condividono tavoli, palmari, stampanti comande). Quindi l'architettura prevede un **cluster LAN**:
- una cassa fa da **master locale** (eredita il concetto del vecchio `SRV ON LINE`: l'app aveva già un
  web server interno), le altre sono **client LAN** (`CLIENT ON LINE`);
- la condivisione operativa in tempo reale (stato tavoli, instradamento comande alle stampanti,
  palmari) avviene **in LAN**, e **funziona a internet spento**;
- il **cloud sta sopra**: sincronizza configurazione e consolida le vendite quando la rete c'è, ma non
  è richiesto per far funzionare il locale.

Implicazioni di progetto:
- il master LAN espone un'API locale (riusabile dal vecchio `HttpServer`/`starter`) che i client e i
  palmari interrogano;
- elezione/semplice designazione del master (configurabile) e gestione del caso "master spento";
- i lock tavoli (`unlocktbl`) e le numerazioni condivise sono gestiti dal master in LAN, poi riconciliati
  col cloud.

---

## 7. Licenze / abbonamenti (sostituiscono il sistema DES)

- Ogni **cliente** ha un abbonamento nel control-plane: moduli abilitati, numero casse, numero palmari,
  scadenza.
- Ogni **cassa** si attiva legandosi all'account e alla **matricola RT**; riceve un **permesso firmato**
  dal cloud (chiave privata solo lato cloud; l'APK ha solo la pubblica per verificare).
- **Validità offline**: il permesso ha una durata (es. 7–30 giorni). Finché è valido la cassa lavora
  offline; se scade senza aver ri-sentito il cloud, avvisa e poi limita (da definire: blocco morbido).
- **Revoca**: togli la licenza nel back-office → alla successiva sincronizzazione la cassa si disattiva.
- Niente da decompilare: nell'APK non c'è nessun segreto che permetta di fabbricare licenze.
- La gratuità sulle Spice T, se vuoi mantenerla, diventa un tipo di abbonamento "free" assegnato lato
  cloud alle matricole `ST…`.

---

## 8. Confine fiscale (importante, non negoziabile)

- La **memoria fiscale legale** (chiusure Z, giornale elettronico, totali) sta **nell'RT**, non nell'app.
  Quindi far ripartire da zero il database gestionale di un cliente è **sicuro**: non si perde nulla di
  fiscale. Questo abilita la tua idea di "niente migrazione, importo da zero".
- Scontrino/documento commerciale, dialogo RT, generazione XML fattura elettronica → restano **sulla
  cassa**, perché richiedono l'hardware e devono funzionare offline.
- Il cloud riceve una **copia gestionale** delle vendite per i report, che non ha valore fiscale
  sostitutivo: la fonte legale resta l'RT.

---

## 9. Sicurezza

- Isolamento per-tenant (DB separati + token che risolve il tenant).
- Autenticazione: utenti back-office (email+password+2FA), dispositivi (token per-cassa revocabile).
- Trasporto sempre HTTPS; nessun segreto di licenza nell'APK.
- Chiavi di firma custodite solo nel cloud.
- Log di attivazioni/sincronizzazioni per audit.

---

## 10. Piano di lavoro (a step, senza big-bang)

| Fase | Contenuto | Dove si lavora |
|---|---|---|
| 0 ✅ | Recupero progetto B4A + analisi (fatto) | qui |
| 1 | Questo documento: architettura, modello dati, licenze | qui |
| 2 | Control-plane + 1° schema D1 per-tenant dai dati reali | qui (Cloudflare) |
| 3 | API Workers: login/licenza + sync config (articoli, operatori, impostazioni) | qui |
| 4 | Back-office web: gestione articoli/impostazioni + provisioning clienti | qui |
| 5 | Client B4A "guscio": login, download config, cache locale, offline | tu (B4A Windows) |
| 6 | Riuso modulo fiscale `ccefdll` + vendita/stampa locale | tu + io |
| 7 | Sync vendite → report nel back-office | qui + tu |
| 8 | Multi-cassa (lock tavoli, numerazioni) | qui + tu |
| 9 | Spegnimento vecchio sistema licenze | entrambi |

A ogni fase c'è qualcosa di funzionante e testabile.

---

## 11. Decisioni

Risolte:
1. ✅ **Clienti < 100** → D1 per-tenant.
2. ✅ **Multi-cassa**: cluster LAN con master locale, operativo anche offline; cloud sopra (sez. 6).
3. ✅ **Account Cloudflare**: il token collegato a questa sessione è già l'account di produzione del
   committente (*Acquadro.tia@…*). Regola di sicurezza adottata: si creano **solo** risorse nuove con
   prefisso `ristorandro-`; **non si tocca nulla** degli altri progetti già presenti sull'account.
   Opzione consigliata: token dedicato limitato al progetto.

Ancora aperte:
4. **Modello commerciale della licenza**: canone mensile/annuale per cassa? moduli a pagamento?
   free sulle Spice T sì/no?
5. **Back-office**: una sola web app per tutti i clienti (consigliato), o separata per cliente?
6. **Fattura elettronica**: la generazione resta sulla cassa o passa a un servizio cloud/intermediario?
7. **Convenzioni Cloudflare**: seguire eventuali standard di nomi/struttura già usati negli altri
   gestionali dell'account, o adottarne di nuovi per `ristorandro-`.

---

*Bozza da rivedere insieme. Alla validazione, si parte dalla Fase 2.*
