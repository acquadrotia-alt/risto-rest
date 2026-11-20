# RistorAndro – Analisi tecnica dal codice recuperato

> Fonte: codice B4A ricostruito in `progetto/` e Java decompilato in `java/`.
> I nomi del tipo `vBln16` / `Sub078` sono alias di nomi offuscati (vedi `nomi.csv`).

## 1. Architettura

L'app è un gestionale per bar e ristoranti: tavoli, comande e cassa, con stampa fiscale diretta
su Registratore Telematico Custom / Ital Retail.

| Area | Moduli principali |
|---|---|
| Cassa e tavoli (schermata principale) | `Main` (~50k righe), `mod1` (funzioni comuni, ~16k righe), `frmfraziona` (conto diviso), `cassetto` (versamenti e prelievi), `operatori` |
| Anagrafiche | `tabelle`, `tabelleappoggio`, `clienti`, `magazzino`, `offerte`, `iniziative`, `menu` |
| Documenti | `fatturafm` (fattura e fattura elettronica XML, modelli in `Files/01-*.txt`), `stampe`, `stampecustom`, `confstampe` |
| Stampanti fiscali | `ccefdll` (protocollo Custom "CEFDLL"), `ckprinter` (stampanti comande / Kitchen), `usbpl2303` + `usbpl2303service` (adattatore USB-seriale), `verificazione` + `clsverificazione` (verificazione periodica) |
| Palmari e totem | `starter` (server HTTP interno per i palmari), `confpalmari`, `httpclient`, `rpidevice`, libreria **TotemLib** (`acttotemmain`, `order*view`…: totem self-order) |
| Pagamenti | `ingenico` (POS Ingenico su socket), Cash Management (cassetto automatico) |
| Servizi | `ftpmanager` (backup e scambio FTP), MQTT, DownloadManager (aggiornamenti), WebAPI `https://one.italretail.it/TWO` |
| Database | SQLite: `anagra.db` (anagrafiche) e `venduto.db` (movimenti: `headmov`, `venduto`, `cassetto`…) |

## 2. Collegamento al Registratore Telematico

- **Tipo di interfaccia** (`v_tipointerfaccia`, configurazione):
  - **0 = Ethernet**: socket TCP sull'IP della cassa (`v_ipcassa`), porta **9100**.
  - **1 = Adattatore USB-Seriale**: chip PL2303, servizio `usbpl2303service`.
  - **2 = SpiceT**: la stampante integrata delle casse all-in-one.
- **Protocollo:** comandi testuali Custom "CEFDLL" con codici a 4 cifre. Quelli più usati sono 1009,
  1015, 3011, 3013, 4004, 7410, 7411 e 7412. I comandi sono incapsulati nelle Sub di `ccefdll`:
  - `sf_*`: scontrino fiscale (`sf_apri`, `sf_vendita`, `sf_sconto`, `sf_pagamento`, `sf_chiudi`…);
  - `nf_*`: documento non fiscale;
  - `ft_*`: fattura;
  - `mf_*`: memoria fiscale e gestione (`mf_eod` chiusura, `mf_leggilastz`, `mf_leggiiva`,
    `mf_setdatetime`, `mf_apricassetto`…);
  - `rt_*`: funzioni RT (`rt_leggistato`, `rt_sendzpending`, `rt_checkzpending`,
    `rt_annulladocumento`, `rt_attivadisattivalotteria`, `rt_leggidocsospesilotteria`, `rt_mf2xml`…).
- **Log su file:** `LOG/CEFDLL_LOG.txt` e `LOG/CEFDLL_ERR.txt`, in `File.DirDefaultExternal`.

## 3. Licenze: come funziona oggi

Il codice è in `Main`: `Sub078` verifica il codice di attivazione, `Sub079` il Basic Support. Il blocco
principale di avvio è intorno alla riga 7620 di `RistorAndro.b4a`.

- **Codice di attivazione** (`v_codattivazione`):
  - è una stringa esadecimale cifrata **DES/CBC/PKCS5**, con chiave e IV fissi nel codice;
  - decifrata dà **28 caratteri**:
    - posizioni 0–9: matricola;
    - poi flag modulo per modulo: terminali/palmari, ServiceBox, cash management, prenotazioni…;
    - livello e tipo di licenza;
    - data di scadenza (formato `AAAAMMGG` alle posizioni 20–27).
- **Basic Support** (`v_codattivazionebs`):
  - cifrato allo stesso modo, 18 caratteri: matricola più anno di assistenza;
  - la matricola deve coincidere con quella del codice di attivazione;
  - l'anno deve essere almeno quello corrente.
- **Modalità gratuita "FREE SPICE":**
  - si attiva se il codice di attivazione **è vuoto** e la **matricola letta dalla stampante inizia
    con `ST`** (le Spice T);
  - in quel caso `Sub078` restituisce subito 1 e `Sub079` restituisce subito `True`: non serve né
    licenza né Basic Support;
  - l'icona di stato diventa "PALLA VEREDE FREESPICE" e il limite interno (`vInt64`) vale **25**.
    Con licenza PRO vale 1000; probabilmente è il numero massimo di elementi, da verificare.
- **Versione PRO collegata a una matricola diversa:** funziona ancora per 7 giorni, poi torna in demo
  con matricola `"Demo  Demo"`.
- **Licenze separate:**
  - ServiceBox, gestione palmari, Cash Management e prenotazioni online hanno ciascuna un messaggio
    "Non si dispone della licenza…";
  - per la lotteria degli scontrini c'è un avviso specifico (`MymsgboxLicenzaST`).

> **Da rivedere:**
> - Chiave DES fissa nel codice: chiunque abbia l'APK può generare codici validi. Per una nuova
>   versione serve uno schema a firma asimmetrica (licenza firmata con chiave privata, verificata con
>   la pubblica) o un'attivazione online.
> - DES è obsoleto.

## 4. Funzioni fiscali presenti nella build 2021

- Documento commerciale RT, annulli e resi (`rt_annulladocumento`), invio corrispettivi pendenti
  (`rt_sendzpending`, `SendZPendingSpiceT`).
- **Lotteria degli scontrini:** codice lotteria sul cliente (`codLotteria`), documenti sospesi,
  accettati e inviati, soglia minima di invio.
- Fattura elettronica: modelli XML in `Files/01-*.txt` e invio con le credenziali `FEDatiTX`.
- Verificazione periodica e controllo della versione XML dell'RT (`rt_verificaversionexml`).
- Tabacchi: listino scaricato da `italretail.it/download/tabacchi/`.
- Controllo partita IVA tramite il servizio VIES della UE.

## 5. Problemi da affrontare per i dispositivi attuali

1. **targetSdk 21 → 34/35.** Il manifest è già aggiornato in `RistorAndro.b4a` (minSdk 21,
   targetSdk 34, `foregroundServiceType` per i servizi). Conseguenze:
   - **permessi runtime** per i permessi pericolosi;
   - **servizi in primo piano** con tipo dichiarato;
   - intent espliciti.
2. **Storage.** Ci sono 297 usi di `File.DirDefaultExternal` / `File.DirRootExternal`: database,
   log, backup, export. Su Android 11 e successivi `DirRootExternal` non è più scrivibile. Vanno
   spostati in `File.DirInternal` o in `RuntimePermissions.GetSafeDirDefaultExternal`, e serve una
   **migrazione dei dati** dalle vecchie installazioni.
3. **`libserial_port.so` solo armeabi (32 bit).** Le casse con Android 64 bit richiedono una build
   `arm64-v8a`, ricompilabile dai sorgenti di `android_serialport_api`. In alternativa si può usare
   la libreria USB-seriale Java (UsbSerial / felHR85), già in parte coperta da `usbpl2303`.
4. **Librerie dismesse:** ActionBarHelper, AnimationPlus, RSTweenEngine, UltimateListView,
   CustomListView "old", ShowTips, Id. Vanno sostituite con XUI Views / xCustomListView / B4XPages.
   Prima, però, va ottenuta una build funzionante identica all'originale.
5. **HttpServer (Jetty 7)** per i palmari: funziona, ma è datato e su HTTP in chiaro
   (`usesCleartextTraffic` è attivo nel manifest).
6. **FTP** con credenziali predefinite (`italretail`/`italretail`): da sostituire con SFTP o HTTPS.

## 6. Piano di lavoro proposto

1. **Fase 1 – Compilazione "1:1".** Aprire il progetto in B4A, sistemare gli errori di compilazione e
   rivedere le 172 Sub `'### VERIFICARE`. Obiettivo: un APK che si comporti come la 8.02 su un
   dispositivo vecchio.
2. **Fase 2 – Nomi e pulizia.** Assegnare i nomi definitivi tramite `nomi.csv` (si può
   semi-automatizzare), riscrivere le 80 Resumable Sub in forma strutturata e mettere il progetto su
   Git.
3. **Fase 3 – Android moderno.** targetSdk 34/35, storage e migrazione dati, permessi, foreground
   service, `.so` a 64 bit. Test sulle casse Custom all-in-one attuali.
4. **Fase 4 – Nuove funzioni.** Da definire in base alle esigenze di mercato: collegamento POS–RT,
   nuovo sistema di licenze, app camerieri e ordini al tavolo con QR, cloud e backup,
   delivery, ecc.
