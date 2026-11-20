# RistorAndro Client (Android nativo, Kotlin)

Client di test che parla con il cloud (`cloud/`). Nessuna dipendenza esterna: usa solo le API
Android (HTTP, JSON, SQLite, verifica RSA). Compilabile interamente in ambiente Linux headless.

## Cosa fa
- Attiva il dispositivo sul cloud (`/v1/device/activate`) con matricola.
- Verifica la licenza firmata (RSA/SHA-256) con la sola chiave pubblica (`assets/license_public.pem`).
- Sincronizza la configurazione in delta (`/v1/config/sync`) in una cache SQLite locale.
- Mostra gli articoli dalla cache, anche offline.

## Build (senza Android Studio, solo CLI)
    export ANDROID_HOME=<sdk>
    echo "sdk.dir=$ANDROID_HOME" > local.properties
    gradle assembleDebug        # -> app/build/outputs/apk/debug/app-debug.apk

APK firmato con chiave di debug (schema v1+v2): installabile via sideload per i test.
