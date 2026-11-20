# RistorAndro Cloud API (Worker) — Fase 3

Base URL (dev): `https://ristorandro-api.acquadro-tia.workers.dev`
Codice: `cloud/worker/` (Cloudflare Worker, binding D1: CONTROL, TENANT_DEV).

## Endpoint
| Metodo | Path | Auth | Scopo |
|---|---|---|---|
| GET | `/v1/health` | — | stato servizio |
| POST | `/v1/device/activate` | — | attiva una cassa (`{tenant_id, matricola}`) → `device_token` + licenza firmata |
| GET | `/v1/license` | Bearer device_token | ri-emette la licenza firmata |
| GET | `/v1/config/sync?since=<ms>` | Bearer device_token | configurazione cambiata dopo `since` (delta) |

## Licenza (anti-copia)
- Payload JSON firmato **RSA-2048 / SHA-256 (RS256)**.
- Chiave **privata**: solo come secret del Worker (`LICENSE_PRIVATE_KEY`). Mai nell'APK, mai nel repo.
- Chiave **pubblica**: `cloud/keys/license_public.pem` → va incorporata nell'APK, che verifica la firma.
- L'APK non può fabbricare licenze: senza la privata, qualsiasi payload modificato viene rifiutato
  (verificato: `max_casse` alterato → firma non valida).
- Campo `valida_fino_rinnovo` = finestra di validità **offline** (giorni di grace dalla licenza).

## Sincronizzazione configurazione
- Ogni riga di config ha `_updated_at` (epoch ms) e `_deleted` (0/1).
- La cassa tiene un cursore; chiama `/v1/config/sync?since=<cursore>` e riceve solo le righe cambiate,
  più il nuovo cursore. Allineamento iniziale: `since=0` → tutta la configurazione.

## Deploy
    cd cloud/worker && npm install
    CLOUDFLARE_ACCOUNT_ID=<account> npx wrangler deploy
    # impostare il secret una volta:
    cat license_private.pem | npx wrangler secret put LICENSE_PRIVATE_KEY

## Back-office web (Fase 4)
- Servito dal Worker su `/` (stesso dominio dell'API).
- Login: `POST /admin/api/login` → token di sessione (HMAC, secret `ADMIN_SECRET`).
- Password utenti: PBKDF2-SHA256 (`cloud/worker/src/auth.js`).
- Area rivenditore (ruolo `superadmin`): `/admin/api/tenants` (lista/crea cliente+licenza),
  `/admin/api/licenza` (aggiorna), `/admin/api/devices` (parco casse).
- Area cliente: `/admin/api/data/<tabella>` (GET lista, POST upsert, DELETE logico) per
  `articoli, reparti, iva, pagamenti, operatori`. Ogni scrittura aggiorna `_updated_at` → la cassa
  la riceve al successivo `/v1/config/sync`.
- Prototipo: il CRUD dati opera sul D1 del cliente demo (`TENANT_DEV`). In produzione il Worker
  risolverà il D1 del tenant dal control-plane.
