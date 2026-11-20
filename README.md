# RistorAndro – recupero del progetto B4A dall'APK

Progetto **RistorAndro 8.02** (pacchetto `cassandraRisto.ital`, build del 07/12/2021) ricostruito
in sorgenti **B4A** a partire dall'APK `RistorAndro_2021-12-07.apk`.

## Contenuto della cartella

| Cartella / file | Cosa contiene |
|---|---|
| `progetto/RistorAndro.b4a` | File di progetto B4A, che contiene anche il modulo `Main` |
| `progetto/*.bas` | 96 moduli: Activity, Service, Classi e moduli di codice, compresa la libreria **TotemLib** di Ital Retail |
| `progetto/Files/` | 2327 file originali: 53 layout `.bal`, database `anagra.db` e `venduto.db`, script SQL, modelli XML della fattura elettronica, modelli dei report, immagini |
| `progetto/conversione_report.json` | Librerie rilevate, moduli e Sub da verificare |
| `nomi.csv` | Mappa dei nomi offuscati (vedi sotto) |
| `java/` | Sorgente Java decompilato con jadx, di riferimento per verificare la conversione |
| `tools/` | Convertitore Java→B4A (`j2b4a.py`), lint (`lint_b4a.py`), script `converti.sh` |
| `docs/ANALISI.md` | Analisi tecnica: architettura, licenze, protocollo Custom, punti da modernizzare |

## Come è stato ricostruito

1. **Decompilazione** con jadx 1.5.1, con le opzioni `--no-replace-consts --no-imports --rename-flags none`.
2. **Riconversione automatica** in B4A con `tools/j2b4a.py`. Il convertitore legge l'albero sintattico del
   Java generato da B4A e riscrive il sorgente B4A originale:
   - `Sub`, `Dim`, `If/Select/For/Do`, `Try/Catch`;
   - proprietà (`getText()` → `.Text`), concatenazioni (`&`), chiamate tra moduli;
   - `CallSub`, `Wait For`, `Sleep`, `Type`.
3. **Nomi offuscati.** L'APK era compilato in modalità *Release (obfuscated)*, quindi variabili globali e
   Sub non pubbliche avevano nomi del tipo `_vvvvvvv3`. Sono stati sostituiti con alias stabili,
   ricavati dal tipo: `vStr12`, `vCur3`, `vLbl5` per le variabili, `Sub042` per le Sub.
   - **Restano invece originali:**
     - i nomi delle view dei layout e tutte le Sub evento (`Button1_Click`, `Activity_Create`…);
     - le Sub "nominate" (`nf_apri`, `sf_vendita`, `rt_leggistato`…);
     - le variabili locali e i parametri delle 80 Resumable Sub;
     - i nomi delle Resumable Sub stesse.
4. **Verifica statica** con `tools/lint_b4a.py`, che controlla blocchi bilanciati e residui di sintassi
   Java. Risultato: 0 segnalazioni.

Numeri finali: ~157.000 righe B4A, 3.271 Sub, 97 moduli.

## Stato: cosa NON è ancora verificato

- **Il progetto non è ancora stato compilato.** Il compilatore B4A gira solo su Windows. Alla prima
  apertura nell'IDE ci saranno sicuramente errori di compilazione da sistemare a mano: tipi, firme di
  librerie cambiate, ecc. Il lint controlla solo la sintassi, non i tipi.
- **172 Sub marcate `'### VERIFICARE`.** jadx le ha decompilate in modo imperfetto, per esempio con
  condizioni invertite o blocchi duplicati. Vanno confrontate con il Java originale: il commento indica
  file e riga.
- **80 Resumable Sub marcate `'### RISTRUTTURARE`.** Sono le Sub con `Wait For`/`Sleep`, convertite come
  macchina a stati (`Do While True` + `Select rsState`). Si comportano come l'originale, ma vanno
  riscritte in forma leggibile.
- Una manciata di righe marcate `'### throw`, `'### raiseEvent` o `rN.append` (codice jadx non tipizzato).

## Aprire il progetto in B4A

1. Installare **B4A** (gratuito, versione 12.8 o successiva) e l'Android SDK, come da istruzioni b4x.com.
2. Procurarsi le **librerie aggiuntive** e copiarle nella cartella "Additional Libraries":
   - **Interne di B4A:** Core, SQL, Phone, Dialogs, Reflection, Threading, Net, Network,
     RandomAccessFile, StringUtils, XUI, OkHttp, JavaObject, jMQTT, USB, Audio, RuntimePermissions,
     XmlLayoutBuilder, JSON, Encryption, ByteConverter.
   - **Dal forum b4x.com:** HttpServer, UltimateListView, GestureDetector, AnimationPlus, PDFWriter,
     RSTweenEngine, CustomProgressDialog, MPAndroidCharts, DownloadManager, ActionBarHelper, ShowTips,
     Id (Maximus), jExcel.
   - **B4X library:** DateUtils, BitmapCreator, xCustomListView.
   - **Da recuperare in azienda:** **SerialPort** (`android_serialport_api`, con `libserial_port.so`
     armeabi). Se non si trova, il codice Java di riferimento è in `java/android_serialport_api`.
3. Aprire `progetto/RistorAndro.b4a`, compilare e correggere gli errori modulo per modulo.

## Rinominare le variabili offuscate

`nomi.csv` ha una riga per ogni nome offuscato, con le colonne
`modulo;tipo;originale;alias;nuovo_nome;tipo_dato`.

1. Compilare la colonna `nuovo_nome` (per esempio `Main;var;…;vSql1;SQL1;SQL`).
2. Rilanciare `tools/converti.sh`: tutti i riferimenti in tutti i moduli vengono aggiornati in modo
   coerente.

Conviene farlo **prima** di iniziare a modificare a mano i `.bas`: dopo le modifiche manuali la
rigenerazione le sovrascriverebbe.
