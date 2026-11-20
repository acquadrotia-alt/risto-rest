# Inventario funzionalità — vecchio gestionale RistorAndro 8.02

Elenco ricavato leggendo il codice recuperato (76 moduli, 73+9 tabelle, protocollo fiscale, modelli
di stampa, schermate). Serve per decidere **cosa replicare** nella versione nuova.

Segna la colonna **Tenere?** con sì / no / forse. Le note indicano dove vive nel vecchio codice.

Legenda complessità (indicativa del lavoro di riporto): ● bassa · ●● media · ●●● alta.

---

## A. Vendita e scontrino fiscale (cuore cassa)
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| A1 | Vendita articoli con tastiera a pagine/reparti configurabile | ●●● | | `pagine`, `Toolbar`, Main |
| A2 | PLU / ricerca articolo / barcode-EAN (anche multipli) | ●● | | `ean` (2192 rif.), `anagra` |
| A3 | Scontrino fiscale: apertura, righe, chiusura | ●●● | | `ccefdll.sf_apri/sf_vendita/sf_chiudi` |
| A4 | Sconti e maggiorazioni (riga e totale, % e valore) | ●● | | `sf_sconto` |
| A5 | Pagamenti multipli / resto / buoni come pagamento | ●● | | `sf_pagamento`, `pagamenti` |
| A6 | Scontrino di cortesia | ● | | `sf_cortesia` |
| A7 | Reso merce | ●● | | `schedareso`, `sf_vendita` reso |
| A8 | Annullo documento | ●● | | `rt_annulladocumento` |
| A9 | Non riscosso / conti sospesi | ●● | | `sospeso` (206 rif.), `HeaddaStampare` |
| A10 | Documento non fiscale (preconto, ecc.) | ● | | `nf_apri/nf_testo/nf_chiudi` |
| A11 | Arrotondamento DL 50/2017 | ● | | `sf_chiudi` |
| A12 | Barcode stampato sullo scontrino | ● | | `sf_barcode`, `cgs1databar` |
| A13 | Testo libero / righe aggiuntive su scontrino | ● | | `sf_testo`, `sf_testoaggiuntivopagamenti` |

## B. Ristorazione: tavoli, sala, comande
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| B1 | Gestione tavoli (apertura, stato libero/occupato) | ●●● | | `tavoli`, Main |
| B2 | Lock tavolo per multi-cassa | ●● | | `unlocktbl` |
| B3 | Conto diviso / frazionamento | ●●● | | `frmfraziona` (1973 righe) |
| B4 | Preconto | ● | | `preconto` (76 rif.) |
| B5 | Coperti / coperti baby | ● | | `coperti`, art. 888888/888889 |
| B6 | Turni | ●● | | `turno` (396 rif.) |
| B7 | Asporto + fasce orarie asporto | ●● | | `asporto` (481), `oraasporto` |
| B8 | Comande di reparto (stampanti comanda, filtri) | ●●● | | `filtristampe`, `tmpStampa`, `ckprinter` |
| B9 | Varianti / variazioni articolo (gruppi, auto, +/senza) | ●●● | | `gruppovar`, `varauto`, `schedamenu` |
| B10 | Ingredienti e allergeni | ●● | | `ingredienti`, `allergeni` |
| B11 | Menu componibili / menu card | ●●● | | `MenuCard`, `headmnu`, `dettmnu` |
| B12 | Richiamo tavoli / asporto | ●● | | `headmovRecallAsporto` |

## C. Palmari (ordinazione mobile camerieri)
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| C1 | Server interno per palmari (Wi-Fi/LAN) | ●●● | | `starter` (HttpServer), `httpclient` |
| C2 | Configurazione e attivazione palmari | ●● | | `confpalmari`, `Palmari` |
| C3 | Login operatore su palmare + obbligo coperto/preconto | ●● | | `Palmari.TipoLogin` |
| C4 | Code di stampa dedicate ai palmari | ●● | | `tmpStampaPalm1..9` |

## D. Totem self-order
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| D1 | Ordinazione self-service a totem (categorie, carrello, varianti) | ●●● | | libreria `TotemLib` (24 moduli) |
| D2 | Multilingua totem + pubblicità/attesa | ●● | | `language`, `publicityview` |

## E. Anagrafiche e dati
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| E1 | Articoli (5 listini, reparto, IVA, colori/stili tasto, Kcal, punti) | ●●● | | `anagra` (60+ colonne) |
| E2 | Reparti | ● | | `reparti` |
| E3 | Aliquote IVA | ● | | `iva` |
| E4 | Pagamenti (causali, resto, buono, EFT, glory) | ●● | | `pagamenti`, `CausaliPagamenti` |
| E5 | Operatori (PIN, permessi per-funzione, login barcode/RFID) | ●● | | `operatori.funzioni`, `CodAutomatico` |
| E6 | Clienti (listino, sconto, punti, prepagato, fido, zona, PIVA/CF) | ●●● | | `clienti` |
| E7 | Intestazioni scontrino / non fiscale | ● | | `intesta`, `intestaNF` |
| E8 | Testi articolo / cliente | ● | | `TestiArt`, `TestiCli` |
| E9 | Offerte a tempo / prezzi speciali | ●● | | `offerte`, `offerteUniandro` |
| E10 | Bilancia: articoli a peso (plupeso) | ●● | | `plupeso`, `peso` (364 rif.) |

## F. Magazzino
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| F1 | Giacenze / sotto scorta / inventario | ●● | | `magazzino`, `giac` |
| F2 | Distinta base (scarico componenti) | ●● | | `distintabase` |
| F3 | Verifica/aggiornamento magazzino lato RT | ●● | | `rt_verificamagazzino`, `rt_setinmagazzino` |

## G. Fidelity, marketing, prenotazioni
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| G1 | Punti fidelity / tessere / tessera aggiuntiva | ●● | | `punti` (353), `tessera` |
| G2 | Prepagato / fido cliente | ●● | | `clienti.prep/fido` |
| G3 | Convenzioni | ● | | `convenzion` |
| G4 | Buoni (sconto/pasto) | ●● | | `buono` (144) |
| G5 | Iniziative/campagne (limiti, lotteria interna) | ●● | | `iniziative`, `schedainz/schedalimiti/schedalottery` |
| G6 | Prenotazioni | ●● | | `prenotazioni`, `Prenota` |
| G7 | Appuntamenti / agenda | ●● | | `appuntament` (61) |
| G8 | Telefonate / recall | ● | | `telefonate` |

## H. Adempimenti fiscali (RT)
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| H1 | Fattura elettronica XML | ●●● | | `fatturafm` (6874 righe), modelli `01-*.txt` |
| H2 | Lotteria degli scontrini (codice, sospesi, invio) | ●●● | | `rt_attivadisattivalotteria`, `rt_leggidocsospesilotteria` |
| H3 | Invio corrispettivi pendenti (Z pending) | ●● | | `rt_sendzpending`, `rt_checkzpending` |
| H4 | Verificazione periodica RT | ●● | | `verificazione`, `layout_verificazionemf` |
| H5 | Lettura dati RT (matricola, ultimo scontrino, ultima Z, totali, data/ora, firmware, IVA) | ●● | | `mf_leggi*` |
| H6 | Generazione/verifica XML RT | ●● | | `rt_mf2xml`, `rt_verificaversionexml` |

## I. Stampe e report
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| I1 | Chiusura fiscale (Z) e letture | ●● | | `mf_eod` |
| I2 | Report finanziario IVA (tipo A e B) | ●● | | `cf stampa finananziario iva` |
| I3 | Report pagamenti / scontrini | ● | | `cf stampa pagamenti-scontrini` |
| I4 | Report articoli venduti / eliminati | ● | | `cf stampa articoli eliminati totali` |
| I5 | Report camerieri (operatori) | ● | | `cf stampa camerieri` |
| I6 | Report fasce orarie per reparto | ● | | `cf stampa fasce orarie reparti` |
| I7 | Report tavoli chiusi | ● | | `cf stampa tavolichiusi` |
| I8 | Report movimenti fatture | ● | | `cf stampa movimenti fatture` |
| I9 | Report sospesi | ● | | `cf stampa sospesi` |
| I10 | Report cassetto / portafoglio / giacenze / tavoli | ●● | | `stampacassetto/portafoglio/giacenze/tavoli.bal` |
| I11 | Stampa anche su stampante comanda / ESC-POS | ●● | | `stampecustom`, `escpos` |
| I12 | Invio report via mail / numero copie | ● | | `Stampe.flgmail`, `bNumeroCopie` |

## J. Movimenti di cassa
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| J1 | Versamenti / prelievi / distinta / fondo cassa | ●● | | `cassetto`, `Cassetto` |
| J2 | Cash management automatico Glory (resto, reset, inventario, alert livelli) | ●●● | | `glory` (235 rif.) |

## K. Pagamenti elettronici
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| K1 | POS Ingenico (socket, causale EFT, IP/porta) | ●● | | `ingenico`, `pagamenti.IpEft` |
| K2 | Cassetto/resto automatico Glory | ●●● | | `glory` |

## L. Hardware e periferiche
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| L1 | Stampante fiscale Custom: Ethernet (9100) / seriale PL2303 USB / SpiceT integrata | ●●● | | `ccefdll`, `usbpl2303` |
| L2 | Bilancia (peso/plupeso) | ●● | | `confbila.bal` |
| L3 | Lettore barcode / RFID (login operatore) | ● | | `operatori.CodAutomatico` |
| L4 | Dispositivo RPI | ●● | | `rpidevice` |

## M. Integrazioni, cloud, connettività
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| M1 | WebAPI centrale (one.italretail.it) | ●● | | `webapi` (192 rif.) — **sostituita dal nuovo cloud** |
| M2 | Centralizzazione multi-cassa Server/Client ON LINE | ●●● | | `clients`, `v_centralizza` — **diventa cluster LAN + cloud** |
| M3 | MQTT | ●● | | `mqtt` (35) |
| M4 | FTP (backup/scambio) | ● | | `ftpmanager` |
| M5 | Mail SMTP (report, fattura) | ● | | `smtp` (269) |
| M6 | Aggiornamenti app + listino tabacchi | ● | | `DownloadManager`, italretail.it |
| M7 | Verifica P.IVA (VIES UE) | ● | | VIES |

## N. Impostazioni / sistema
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| N1 | Configurazione cassa (interfaccia stampante, matricola, protocollo Custom) | ●● | | `configuracassa` |
| N2 | Configurazione stampe/stampanti (layout, IP, copie, turni, taglio) | ●● | | `confstampe`, `configurastampe` |
| N3 | Configurazione mail / FTP / backup | ● | | `configuramail` |
| N4 | Configurazione palmari | ● | | `confpalmari` |
| N5 | Multilingua descrizioni (web/totem) | ● | | `LinguaDescrizioniWeb` |
| N6 | Parametri vari, EULA, screensaver, pubblicità | ● | | `Parameters`, `PnlScreenSaver` |
| N7 | Licenza / Basic Support / attivazione | ●● | | `Sub078/079` — **sostituita dal nuovo sistema cloud** |

## O. Utilità
| # | Funzione | Compl. | Tenere? | Note |
|---|---|---|---|---|
| O1 | Backup / ripristino dati | ● | | `backup` (34) |
| O2 | Export Excel / PDF | ● | | jExcel, PDFWriter |
| O3 | Filtri e ricerche avanzate | ●● | | `filtro` (3450 righe) |
| O4 | Help / tips a schermo | ● | | ShowTips |

---

### Note
- Le voci marcate **"sostituita dal nuovo cloud"** (M1, M2, N7) nel nuovo progetto cambiano natura:
  non vanno riportate com'erano, le rifacciamo col cloud/back-office/licenze firmate.
- Alcune funzioni sono legate a hardware specifico (Glory, Ingenico, bilancia, RPI): ha senso tenerle
  solo se quei dispositivi sono ancora in uso dai tuoi clienti.
- Questo elenco è una prima passata basata sul codice: se vuoi, su una qualsiasi voce posso entrare nel
  dettaglio di cosa fa esattamente.
