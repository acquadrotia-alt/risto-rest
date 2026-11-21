# Protocollo Custom (legacy) — Manuale dei comandi usati da RistorAndro

Manuale ricostruito **dal codice dell'APK** (modulo `ccefdll`). Documenta il protocollo a comandi
nativi (non XML) che RistorAndro usa per pilotare la stampante fiscale Custom / Ital Retail.
È l'equivalente del manuale ufficiale, ma limitato e aderente **ai comandi effettivamente presenti
nell'app**. Dove un parametro è dedotto dall'uso e non certo, è segnalato con *(dedotto)*.

> Nota: questo è il protocollo **2ª generazione** (a comandi). È diverso dal protocollo **XML Web
> Services** (3ª generazione) del manuale ufficiale Custom. Vedi `PROTOCOLLO_CONFRONTO.md`.

---

## 1. Canali di trasporto

Selezionati dalla variabile interna `vInt4` / `vBln17`:

| Canale | Condizione | Come |
|---|---|---|
| **Ethernet/TCP** | default | socket TCP su IP cassa, **porta 9100** |
| **Seriale/USB** | `vInt4 = 1` | adattatore PL2303 (modulo `usbpl2303`) |
| **SpiceT integrata** | `vInt4 = 2` o `vBln17` | stampante interna all-in-one |

Su tutti e tre i canali il **formato del frame è identico**; cambia solo il mezzo fisico.

---

## 2. Struttura del frame (richiesta)

Ogni comando viene incapsulato così:

```
STX  "000"  <comando>  <checksum>  ETX
0x02  030 30 30                    0x03
```

- **STX** = `0x02` (Chr(2)), **ETX** = `0x03` (Chr(3)).
- Prefisso fisso **`"000"`** anteposto al comando.
- **checksum** = somma dei codici ASCII di tutti i caratteri di `"000"+comando`, **modulo 100**,
  formattata a **2 cifre** (`NumberFormat(somma Mod 100, 2, 0)`).
- `<comando>` = codice operativo (3–5 cifre) seguito dai parametri (vedi §5).

Esempio (chiusura scontrino, comando `3013`):
```
stringa = "000" & "3013"            -> "0003013"
checksum = (48+48+48+51+48+49+51) Mod 100 = 343 Mod 100 = 43
frame   = <STX>0003013 43<ETX>
```

Codifica caratteri: **UTF-8** (`.GetBytes("UTF8")`).

---

## 3. Risposta e codici di stato

Il primo byte della risposta indica l'esito:

| 1° byte | Significato | Esito |
|---|---|---|
| **ACK** `0x06` (Chr 6) | comando accettato | stato **0** (OK); i byte successivi sono i dati di risposta |
| **NAK** `0x15` (Chr 21) | errore | i byte 4.. contengono il **codice di errore** (3 cifre), restituito come stato |

Lettura dati: la risposta termina con **ETX**; in modalità TCP il payload utile è
`risposta.SubString2(9, lunghezza-3)` (si scartano 9 caratteri di header e 3 di coda).

### Codici di errore gestiti esplicitamente
| Codice | Significato | Azione dell'app |
|---|---|---|
| **16**, **64** | carta esaurita | avvisa e ripete `1009` finché lo stato torna `00` (poi eventuale ristampa) |
| **98** | stampante impegnata da uso manuale | errore bloccante, avviso (ed e-mail se abilitata) |
| **99** | errore generico | invia `1015` per leggere l'errore esteso `ERRxxx` + descrizione |
| altro | errore specifico | legge la descrizione associata al codice e avvisa |

### Comandi di servizio per lo stato
- **`1009`** — lettura stato stampante (polling; usato per attesa carta / "pronta").
- **`1015`** — lettura errore esteso: ritorna `ERR` + 3 cifre + descrizione.

---

## 4. Convenzioni dei parametri

- `NF(valore, n, 0)` = numero formattato a **n cifre** con zeri a sinistra.
- Importi: interi in **centesimi**, campo **9 cifre** con segno (negativo = reso/sconto).
- Quantità: campo da **9 cifre** in millesimi (×1000), oppure `1000` = quantità 1.
- Lunghezze testo: campo **2 cifre** che precede la stringa.
- `Sub022(testo, n)` = testo normalizzato/troncato a `n` (solo caratteri stampabili, maiuscolo).

---

## 5. Riferimento comandi

### 5.1 Controllo del documento
| Comando | Operazione | Parametri / esempio |
|---|---|---|
| `30161` | **Apertura documento** (scontrino/fattura/non fiscale) | nessuno |
| `3011` | **Subtotale** | nessuno |
| `3003` | **Subtotale per pagamento** (prima dei pagamenti) | nessuno |
| `3013` | **Chiusura documento + taglio carta** | nessuno |

### 5.2 Testo e testate scontrino
| Comando | Operazione | Parametri / esempio |
|---|---|---|
| `3002` + stile(3) + testo | **Riga di testo** con stile predefinito | `3002101 ` (testata), `3002113** RESO MERCE`, `3002122  …` (centrato) |
| `30021` + len(2) + testo | **Riga di testo** con lunghezza esplicita | `30021`+`NF(len,2)`+testo |
| `30190` / `301908` + dato | **Codice su scontrino** (CF/P.IVA, lotteria) | `301908`+codice lotteria (8 cifre) |
| `3010F` + len(2) + dati | **Blocco dati cliente** (variante F) | `3010F`+len+`Sub022(cliente,16)` |
| `3010B` + len(2) + dati | **Blocco dati cliente** (variante B) | `3010B`+len+`Sub022(cliente,16)` |

### 5.3 Righe di vendita
| Comando | Operazione | Parametri / esempio |
|---|---|---|
| `30013` + len(2) + descr + prezzo(9) | **Vendita a reparto** (legacy) | prezzo in centesimi, segnato |
| `3101101` + len(2) + descr + prezzo(9) | **Vendita** (modalità RT, reparto 01) | |
| `3101901` + len(2) + descr + prezzo(9) | **Reso merce** (RT) | preceduto da `3002113** RESO MERCE` |
| `33011` + qta(9) + `001` + len(2) + descr + prezzo… | **Vendita a quantità/PLU** (RT) | qta in millesimi; `33011000001000001…` = qta 1 |
| `310130106SCONTO` + importo(9) | **Sconto di riga** (a valore) | |
| `310120113MAGGIORAZIONE` + importo(9) | **Maggiorazione di riga** (a valore) | |
| `33012` + 1(9) + `001` + len(2) + descr… | **Sconto/maggiorazione % di riga** (RT) | |
| `31011` / `31012` / `31013` / `31019` | varianti di vendita/rettifica riga | usate internamente da `sf_vendita`/`sf_sconto` |

### 5.4 Sconti e maggiorazioni su subtotale
| Comando | Operazione | Parametri / esempio |
|---|---|---|
| `3003` | **Subtotale** (necessario prima dello sconto) | nessuno |
| `30121` + len + testo | **Riga totale/arrotondamento** | es. `ARROTOND. DL 50/2017  …` |

### 5.5 Pagamenti e chiusura
| Comando | Operazione | Parametri / esempio |
|---|---|---|
| `3004` + len(2) + descr + importo(9) | **Pagamento senza resto** (legacy) | |
| `3005` + len(2) + descr + importo(9) | **Pagamento con resto** (legacy) | |
| `3007` + tipoRT(2) + … + importo | **Pagamento** (modalità RT) | costruito in lista e inviato in chiusura |
| `3011` | **Subtotale** (chiusura) | |
| `3013` | **Chiusura + taglio** | |
| `3017` + dato | **Totale cortesia** (scontrino di cortesia) | |
| `3012` + idx + len + testo | **Riga totale cortesia** | |

### 5.6 Documento non fiscale (`<printerNotFiscal>` legacy)
| Comando | Operazione | Parametri / esempio |
|---|---|---|
| `30161` | apertura documento | |
| `40011` | **Apertura non fiscale** | |
| `4002` | conferma/modalità | |
| `4003` + stile + len(2) + testo | **Riga di testo non fiscale** | |
| `4004` | **Chiusura non fiscale** | |
| `3021` + tipo + `233` + len(2) + dati | **Barcode** su non fiscale | |

### 5.7 Fattura
| Comando | Operazione | Parametri / esempio |
|---|---|---|
| `30161` | apertura documento | |
| `400121` + numero(9) | **Apertura fattura** con numero | |
| `4002` | conferma | |
| `4003` + … | **Righe fattura** | |
| `4003F15TOTALE FATTURA:` + tot(9) | **Riga totale fattura** | |
| `4004` | **Chiusura fattura** | |
| `4006` | finalizza | |

### 5.8 Periferiche e utilità
| Comando | Operazione | Parametri / esempio |
|---|---|---|
| `70081` | **Apertura cassetto** | |
| `7007` + testo | **Scrittura su display cliente** | |
| `7500` + … | **Imposta testo display** | |
| `7501` | **Leggi testo display** | |
| `7001` (+param) | **Avanzamento carta** (feed) | |
| `3116` | **Beep / suono** | |
| `8002` | **Stampa DGFE** | |
| `91000` / `91015` / `9102` | **Caricamento/stampa logo** | |
| `3021` + tipo + `25 ` + len(2) + dati | **Barcode** su scontrino | |

### 5.9 Letture memoria fiscale / stato
| Comando | Ritorna |
|---|---|
| `1001` | **data/ora** della stampante |
| `1003` | **totali** ultimo scontrino |
| `1004` | **numero** ultimo scontrino |
| `1008` | **matricola / dati MF** |
| `1013` | **versione firmware** |
| `1104` | **numero ultima chiusura Z** |
| `1010` | **giornata aperta?** / intestazione |
| `7012` | **tabella IVA** |
| `15111` | **stato RT** (risposta ~36 byte) |
| `1009` | **stato stampante** (polling) |
| `1015` | **errore esteso** `ERRxxx` |

### 5.10 Impostazioni
| Comando | Operazione | Parametri |
|---|---|---|
| `2001` + datetime | **Imposta data/ora** | |
| `2002` | **Chiusura fiscale Z** (EOD) | |
| `7013` + dati | **Scrivi aliquote IVA** | |
| `6302` + … | **Imposta intestazione** | |

### 5.11 Funzioni RT telematiche
| Comando | Operazione | Parametri / esempio |
|---|---|---|
| `6607` + stato + `000000` | **Attiva/disattiva lotteria** scontrini | |
| `301908` + codice(8) | **Codice lotteria** sul documento | |
| `1518` | **Leggi documenti sospesi lotteria** | |
| `1516` / `6403` | **Invio corrispettivi Z pendenti** | |
| `1510` | **Verifica magazzino** (RT) | |
| `1512` | **Verifica versione XML** (RT) | |
| `64021` | **Set in magazzino** | |
| `7101A` + rif… | **Annullo documento telematico** | rif: numero/data/matricola |
| `7114A` + rif… | **Annullo documento** (variante 2) | |
| `7101R` + rif… | **Reso documento telematico** | |
| `7114R` + len + rif… | **Reso documento** (variante 2) | |
| `71010` | **Chiusura documento annullo/reso** | |
| `7410` / `7411` / `7412` | **Conteggio/esportazione file XML** (mf2xml, lotteria) | |
| `8002` | **Stampa DGFE** | |

---

## 6. Flussi tipici

**Scontrino fiscale (modalità RT):**
```
30161                      ' apre documento
3101101<len><descr><prezzo>   ' una riga per articolo (33011… se con quantità)
310130106SCONTO<importo>   ' eventuale sconto riga
3003                       ' subtotale
3007<tipo><importo>        ' uno o più pagamenti
3011                       ' subtotale di chiusura
3013                       ' chiusura + taglio
```

**Reso merce:**
```
30161 ; 3002113** RESO MERCE ; 3101901<len><descr><prezzo> ; 3003 ; 3007… ; 3011 ; 3013
```

**Chiusura giornaliera (Z):**  `30161 ; 2002`

**Lettura matricola:**  `1008`  ·  **Data/ora:**  `1001`  ·  **Apri cassetto:**  `70081`

---

## 7. Tabella riassuntiva (tutti i codici presenti nell'APK)

`1001 1003 1004 1008 1009 1010 1013 1015 1104 1214 1510 1511 1512 1516 1518`
`2001 2002 2009`
`30013 3002 30021 3003 3008 3010 3010B 3010F 3011 3012 30121 3013 30161 3017 30190 3021`
`31011 31012 31013 31019 3116 33011 33012`
`40011 40012 4002 4003 4003F 4004 4006 60000 6302 6403 64021 6607 6607 70081`
`7001 7007 7007C 7012 7013 7101A 7101R 7114A 7114R 71010 7408 7410 7411 7412 7500 7501`
`74000 74031 8002 91000 91015 9102 9102`

*(78 codici distinti. I dettagli dei parametri delle funzioni telematiche e di alcune letture sono
dedotti dall'uso nell'app; vanno confermati sulla stampante reale o sul manuale ufficiale del comando
corrispondente.)*

---

## 8. Origine e affidabilità
- Ricavato da `progetto/ccefdll.bas` (e dal Java decompilato `java/cassandraRisto/ital/ccefdll.java`).
- Framing, canali, ACK/NAK e gestione errori: **certi** (letti dal codice).
- Opcode e campi principali di scontrino/vendita/pagamento/chiusura: **certi**.
- Parametri fini di funzioni telematiche (annulli/resi/lotteria/export) e logo: **parzialmente dedotti**.
