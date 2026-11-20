#!/usr/bin/env python3
"""
schema_to_d1.py - Traduce le tabelle del database B4A (anagra.db / venduto.db) in schema D1 (Cloudflare).

- Normalizza i tipi B4A (nvarchar, ntext, bit, numeric, datetime...) in tipi SQLite puliti (TEXT/INTEGER/REAL).
- Conserva nomi colonne, PRIMARY KEY e AUTOINCREMENT.
- Aggiunge a ogni tabella i metadati per la sincronizzazione delta:
      _updated_at INTEGER  (epoch ms dell'ultima modifica lato cloud)
      _deleted    INTEGER  (0/1, cancellazione logica per propagare le eliminazioni)
- Emette CREATE TABLE e, con --data, anche gli INSERT dei dati reali.

Uso:
  python3 schema_to_d1.py <db.sqlite> --tables t1,t2,... [--data] > out.sql
"""
import sqlite3, sys, argparse, re

def map_type(decl):
    d = (decl or "").lower()
    if any(k in d for k in ("int", "bit", "bool")):
        return "INTEGER"
    if any(k in d for k in ("numeric", "decimal", "real", "float", "double")):
        return "REAL"
    # datetime/text/char/nvarchar/ntext -> TEXT (le date le gestiamo come testo ISO o epoch lato API)
    return "TEXT"

def table_ddl(con, t, sync=True):
    cols = con.execute("PRAGMA table_info([%s])" % t).fetchall()  # cid,name,type,notnull,dflt,pk
    # rileva AUTOINCREMENT dal DDL originale
    orig = con.execute("select sql from sqlite_master where name=?", (t,)).fetchone()[0] or ""
    autoinc = "autoincrement" in orig.lower()
    pk = [c[1] for c in cols if c[5]]
    lines = []
    for cid, name, typ, notnull, dflt, ispk in cols:
        st = map_type(typ)
        parts = ["  [%s] %s" % (name, st)]
        if ispk and len(pk) == 1:
            parts.append("PRIMARY KEY")
            if autoinc and st == "INTEGER":
                parts.append("AUTOINCREMENT")
        if notnull and not ispk:
            parts.append("NOT NULL")
        if dflt is not None:
            d = dflt
            if st in ("INTEGER", "REAL") and re.match(r"^-?\d+(\.\d+)?$", str(d).strip()):
                parts.append("DEFAULT %s" % d)
            else:
                dd = str(d)
                if not (dd.startswith("'") and dd.endswith("'")):
                    dd = "'" + dd.strip("'") + "'"
                parts.append("DEFAULT %s" % dd)
        lines.append(" ".join(parts))
    if sync:
        lines.append("  [_updated_at] INTEGER NOT NULL DEFAULT 0")
        lines.append("  [_deleted] INTEGER NOT NULL DEFAULT 0")
    if len(pk) > 1:
        lines.append("  PRIMARY KEY (%s)" % ", ".join("[%s]" % p for p in pk))
    ddl = "CREATE TABLE IF NOT EXISTS [%s] (\n%s\n);" % (t, ",\n".join(lines))
    idx = ""
    if sync:
        idx = "\nCREATE INDEX IF NOT EXISTS [ix_%s_upd] ON [%s]([_updated_at]);" % (t, t)
    return ddl + idx

def data_inserts(con, t):
    cols = [c[1] for c in con.execute("PRAGMA table_info([%s])" % t).fetchall()]
    out = []
    for row in con.execute("select * from [%s]" % t):
        vals = []
        for v in row:
            if v is None:
                vals.append("NULL")
            elif isinstance(v, (int, float)):
                vals.append(str(v))
            else:
                vals.append("'" + str(v).replace("'", "''") + "'")
        out.append("INSERT OR REPLACE INTO [%s] (%s,[_updated_at]) VALUES (%s,0);" % (
            t, ",".join("[%s]" % c for c in cols), ",".join(vals)))
    return out

def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("db")
    ap.add_argument("--tables", required=True)
    ap.add_argument("--data", action="store_true")
    ap.add_argument("--no-sync", action="store_true")
    a = ap.parse_args()
    con = sqlite3.connect(a.db)
    tables = [t.strip() for t in a.tables.split(",") if t.strip()]
    for t in tables:
        exists = con.execute("select 1 from sqlite_master where type='table' and name=?", (t,)).fetchone()
        if not exists:
            print("-- SALTATA (assente): %s" % t); continue
        print(table_ddl(con, t, sync=not a.no_sync))
        if a.data:
            for ins in data_inserts(con, t):
                print(ins)
        print()

if __name__ == "__main__":
    main()
