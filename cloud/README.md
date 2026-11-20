# RistorAndro Cloud (Cloudflare)

Backend multi-tenant su Cloudflare. Vedi `../docs/ARCHITETTURA_CLOUD.md`.

## Risorse create (account del committente)
- D1 `ristorandro-control` — control-plane (account, dispositivi, licenze, utenti back-office).
- D1 `ristorandro-dev` — database per-tenant di prova (configurazione di un cliente).

## Schemi (`schema/`)
- `control_schema.sql` — control-plane.
- `tenant_config_schema.sql` — tabelle di configurazione (gruppo A) tradotte dai DB B4A reali,
  con metadati di sincronizzazione `_updated_at` / `_deleted`. Generato da `../tools/schema_to_d1.py`.

## Rigenerare lo schema per-tenant dai DB originali
    python3 tools/schema_to_d1.py progetto/Files/anagra.db --tables "anagra,reparti,iva,..." > cloud/schema/tenant_config_schema.sql

## Stato
- Fase 2: schemi creati e validati su dati reali (join articoli+reparti+iva su D1). OK.
- Prossimo: Fase 3 — API Workers (login dispositivo, licenza firmata, sync configurazione).
