CREATE TABLE IF NOT EXISTS tenant (
  id TEXT PRIMARY KEY,
  ragione_sociale TEXT NOT NULL,
  d1_database_name TEXT,
  d1_database_id TEXT,
  stato TEXT NOT NULL DEFAULT 'attivo',
  creato_il INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS punto_vendita (
  id TEXT PRIMARY KEY,
  tenant_id TEXT NOT NULL,
  nome TEXT NOT NULL,
  citta TEXT,
  creato_il INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS dispositivo (
  id TEXT PRIMARY KEY,
  tenant_id TEXT NOT NULL,
  punto_vendita_id TEXT,
  matricola_rt TEXT,
  nome TEXT,
  ruolo_lan TEXT NOT NULL DEFAULT 'auto',
  token_hash TEXT,
  ultimo_contatto INTEGER,
  creato_il INTEGER NOT NULL
);
CREATE INDEX IF NOT EXISTS ix_dispositivo_tenant ON dispositivo(tenant_id);
CREATE TABLE IF NOT EXISTS licenza (
  id TEXT PRIMARY KEY,
  tenant_id TEXT NOT NULL,
  piano TEXT NOT NULL DEFAULT 'pro',
  max_casse INTEGER NOT NULL DEFAULT 1,
  max_palmari INTEGER NOT NULL DEFAULT 0,
  moduli TEXT NOT NULL DEFAULT '{}',
  scadenza INTEGER,
  grace_giorni INTEGER NOT NULL DEFAULT 14,
  stato TEXT NOT NULL DEFAULT 'attiva',
  aggiornato_il INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS utente_backoffice (
  id TEXT PRIMARY KEY,
  tenant_id TEXT,
  email TEXT NOT NULL UNIQUE,
  password_hash TEXT NOT NULL,
  ruolo TEXT NOT NULL DEFAULT 'cliente',
  creato_il INTEGER NOT NULL
);
