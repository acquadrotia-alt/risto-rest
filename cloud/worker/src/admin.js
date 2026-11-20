// API del back-office (area rivenditore + area cliente) e CRUD generico sui dati di configurazione.
import { verifyPassword, makeSession, readSession } from "./auth.js";
import { desEncryptCBC } from "./des.js";

// --- Generatore licenze LEGACY (vecchio formato DES dell'app RistorAndro) ---
function b64bytes(b64) { const s = atob(b64); const u = new Uint8Array(s.length); for (let i = 0; i < s.length; i++) u[i] = s.charCodeAt(i); return u; }
function hexUp(u) { return [...u].map((b) => b.toString(16).padStart(2, "0")).join("").toUpperCase(); }
function fiscaleToSeriale(m) {
  m = (m || "").toUpperCase().trim();
  if (m.length === 10) return m;                 // gia' seriale
  if (m.length === 11) return m[3] + m[4] + m[0] + m[1] + m.substring(5, 11); // fiscale -> seriale
  throw new Error("matricola non valida (attese 10 o 11 cifre, ricevute " + m.length + ")");
}
function bsTail(anno) { const L = "abcdefghij"; let t = ""; for (const d of String(anno)) t += L[parseInt(d)] + "a"; return t; }
function generaLicenzeLegacy(env, opts) {
  const kv = b64bytes(env.LEGACY_LIC); // 8 byte chiave + 8 byte IV
  const key = kv.subarray(0, 8), iv = kv.subarray(8, 16);
  const ser = fiscaleToSeriale(opts.matricola);
  const palmari = Math.max(0, Math.min(9, parseInt(opts.palmari || 0)));
  const annoScad = String(opts.anno_scadenza || 2099).padStart(4, "0").slice(0, 4);
  const annoBs = String(opts.anno_bs || 2099).padStart(4, "0").slice(0, 4);
  const attPlain = ser + "1" + "0" + "000000" + palmari + "0" + annoScad + "12" + "31"; // PRO, scad. 31/12
  const bsPlain = ser + bsTail(annoBs);
  const enc = new TextEncoder();
  return {
    seriale: ser,
    attivazione: hexUp(desEncryptCBC(key, iv, enc.encode(attPlain))),
    basic_support: hexUp(desEncryptCBC(key, iv, enc.encode(bsPlain))),
    anno_scadenza: annoScad, anno_bs: annoBs, palmari,
  };
}

function json(d, s = 200) { return new Response(JSON.stringify(d), { status: s, headers: { "content-type": "application/json; charset=utf-8" } }); }
function err(m, s = 400) { return json({ ok: false, error: m }, s); }

// tabelle di configurazione gestibili dal back-office: alias -> tabella reale
const DATA_TABLES = {
  articoli: "anagra", reparti: "reparti", iva: "iva", pagamenti: "pagamenti", operatori: "operatori",
};

async function sessionFrom(env, request) {
  const h = request.headers.get("authorization") || "";
  const m = h.match(/^Bearer\s+(.+)$/i);
  if (!m) return null;
  return readSession(env.ADMIN_SECRET, m[1]);
}

async function tableInfo(db, table) {
  const rs = await db.prepare(`PRAGMA table_info([${table}])`).all();
  const cols = rs.results.map((c) => c.name).filter((n) => n !== "_deleted");
  const pk = rs.results.filter((c) => c.pk).map((c) => c.name);
  return { cols, pk: pk[0] || "rowid" };
}

export async function handleAdmin(request, env, url) {
  const p = url.pathname;

  // ---- login (senza auth) ----
  if (p === "/admin/api/login" && request.method === "POST") {
    const { email, password } = await request.json().catch(() => ({}));
    if (!email || !password) return err("email e password obbligatori");
    const u = await env.CONTROL.prepare("SELECT * FROM utente_backoffice WHERE email=?").bind(email).first();
    if (!u || !(await verifyPassword(u.password_hash, password))) return err("credenziali non valide", 401);
    const token = await makeSession(env.ADMIN_SECRET, u);
    return json({ ok: true, token, user: { email: u.email, ruolo: u.ruolo, tenant_id: u.tenant_id } });
  }

  // ---- da qui in poi serve la sessione ----
  const sess = await sessionFrom(env, request);
  if (!sess) return err("non autenticato", 401);
  const isAdmin = sess.ruolo === "superadmin";

  if (p === "/admin/api/me") return json({ ok: true, user: sess });

  // ---- area rivenditore: clienti, licenze, dispositivi ----
  if (p === "/admin/api/tenants") {
    if (!isAdmin) return err("riservato al rivenditore", 403);
    if (request.method === "GET") {
      const rs = await env.CONTROL.prepare(
        "SELECT t.*, (SELECT COUNT(*) FROM dispositivo d WHERE d.tenant_id=t.id) AS casse FROM tenant t ORDER BY creato_il DESC").all();
      return json({ ok: true, tenants: rs.results });
    }
    if (request.method === "POST") {
      const b = await request.json().catch(() => ({}));
      if (!b.id || !b.ragione_sociale) return err("id e ragione_sociale obbligatori");
      const now = Date.now();
      await env.CONTROL.prepare(
        "INSERT INTO tenant(id,ragione_sociale,d1_database_name,d1_database_id,stato,creato_il) VALUES(?,?,?,?, 'attivo', ?)")
        .bind(b.id, b.ragione_sociale, b.d1_database_name || null, b.d1_database_id || null, now).run();
      await env.CONTROL.prepare(
        "INSERT INTO licenza(id,tenant_id,piano,max_casse,max_palmari,moduli,scadenza,grace_giorni,stato,aggiornato_il) VALUES(?,?,?,?,?,?,?,?, 'attiva', ?)")
        .bind("lic_" + b.id, b.id, b.piano || "pro", b.max_casse || 1, b.max_palmari || 0,
          JSON.stringify(b.moduli || {}), b.scadenza || null, b.grace_giorni || 14, now).run();
      return json({ ok: true });
    }
  }

  if (p === "/admin/api/licenza" && request.method === "POST") {
    if (!isAdmin) return err("riservato al rivenditore", 403);
    const b = await request.json().catch(() => ({}));
    if (!b.tenant_id) return err("tenant_id obbligatorio");
    await env.CONTROL.prepare(
      "UPDATE licenza SET piano=?,max_casse=?,max_palmari=?,moduli=?,scadenza=?,grace_giorni=?,stato=?,aggiornato_il=? WHERE tenant_id=?")
      .bind(b.piano || "pro", b.max_casse || 1, b.max_palmari || 0, JSON.stringify(b.moduli || {}),
        b.scadenza || null, b.grace_giorni || 14, b.stato || "attiva", Date.now(), b.tenant_id).run();
    return json({ ok: true });
  }

  if (p === "/admin/api/genera-licenza" && request.method === "POST") {
    if (!isAdmin) return err("riservato al rivenditore", 403);
    if (!env.LEGACY_LIC) return err("generatore non configurato (manca il secret LEGACY_LIC)", 500);
    const b = await request.json().catch(() => ({}));
    try {
      const g = generaLicenzeLegacy(env, b);
      // contenuto dei file pronti per l'app vecchia (cartella /Licenze)
      g.file_txt_nome = `Ristorandro_${(b.matricola || "").toUpperCase().trim()}.txt`;
      g.file_txt = `${g.attivazione}\nRistorandro ${(b.matricola || "").toUpperCase().trim()}\n* Versione PRO\n* Palmari Attivi: ${g.palmari}\n* Scadenza: 31/12/${g.anno_scadenza}\n`;
      g.file_bs_nome = `BasicSupport_Anno_${g.anno_bs}_${(b.matricola || "").toUpperCase().trim()}.bs`;
      g.file_bs = `${g.basic_support}\nMatricola fiscale: ${(b.matricola || "").toUpperCase().trim()}\nAnno Basic Support: ${g.anno_bs}\n`;
      return json({ ok: true, ...g });
    } catch (e) { return err(e.message); }
  }

  if (p === "/admin/api/devices" && request.method === "GET") {
    const q = isAdmin
      ? env.CONTROL.prepare("SELECT * FROM dispositivo ORDER BY ultimo_contatto DESC")
      : env.CONTROL.prepare("SELECT * FROM dispositivo WHERE tenant_id=? ORDER BY ultimo_contatto DESC").bind(sess.tenant_id);
    const rs = await q.all();
    return json({ ok: true, devices: rs.results });
  }

  // ---- area cliente: CRUD configurazione (prototipo: DB del tenant demo) ----
  const mData = p.match(/^\/admin\/api\/data\/([a-z]+)$/);
  if (mData) {
    const alias = mData[1];
    const table = DATA_TABLES[alias];
    if (!table) return err("tabella non gestita", 404);
    const db = env.TENANT_DEV; // prototipo
    const info = await tableInfo(db, table);

    if (request.method === "GET") {
      const rs = await db.prepare(`SELECT * FROM [${table}] WHERE _deleted=0 ORDER BY ${info.pk} LIMIT 1000`).all();
      return json({ ok: true, table: alias, pk: info.pk, columns: info.cols, rows: rs.results });
    }
    if (request.method === "POST") { // upsert
      const row = await request.json().catch(() => ({}));
      const now = Date.now();
      const cols = info.cols.filter((c) => c in row);
      if (!cols.includes(info.pk) && info.pk in row) cols.push(info.pk);
      const allCols = [...new Set([...cols, "_updated_at", "_deleted"])];
      const vals = allCols.map((c) => c === "_updated_at" ? now : c === "_deleted" ? 0 : row[c]);
      const ph = allCols.map(() => "?").join(",");
      await db.prepare(`INSERT OR REPLACE INTO [${table}] (${allCols.map((c) => "[" + c + "]").join(",")}) VALUES (${ph})`).bind(...vals).run();
      return json({ ok: true, _updated_at: now });
    }
    if (request.method === "DELETE") { // cancellazione logica (si propaga alle casse)
      const key = url.searchParams.get("id");
      await db.prepare(`UPDATE [${table}] SET _deleted=1, _updated_at=? WHERE ${info.pk}=?`).bind(Date.now(), key).run();
      return json({ ok: true });
    }
  }

  return err("not found", 404);
}

export { DATA_TABLES };
