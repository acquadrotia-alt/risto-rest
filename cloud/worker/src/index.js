/**
 * RistorAndro Cloud API (Cloudflare Worker) — Fase 3 (prototipo)
 *
 * Endpoint:
 *   GET  /v1/health
 *   POST /v1/device/activate     { tenant_id, matricola }     -> { device_token, license }
 *   GET  /v1/license             Bearer <device_token>        -> { license }
 *   GET  /v1/config/sync?since=  Bearer <device_token>        -> { changes, cursor }
 *
 * La licenza e' un payload JSON firmato RSA-2048/SHA-256 (RS256). L'APK verifica la firma
 * con la sola chiave PUBBLICA: non puo' fabbricare licenze. La chiave privata vive solo
 * come secret del Worker (LICENSE_PRIVATE_KEY).
 *
 * Nota prototipo: usa il binding TENANT_DEV per il cliente demo. In produzione il Worker
 * risolvera' il D1 del tenant dinamicamente (vedi docs/ARCHITETTURA_CLOUD.md).
 */

const CONFIG_TABLES = ["anagra", "anagraDescrizioni", "ean", "reparti", "iva", "pagamenti",
  "operatori", "gruppovar", "GruppiVariazioniArt", "varauto", "headmnu", "dettmnu",
  "ingredienti", "ingredientiplu", "allergeni", "allergeniplu", "headoff", "dettoff",
  "clienti", "pagine", "Despagine", "confstampe", "intesta"];

function json(data, status = 200) {
  return new Response(JSON.stringify(data), {
    status, headers: { "content-type": "application/json; charset=utf-8" },
  });
}
function err(msg, status = 400) { return json({ ok: false, error: msg }, status); }

// ---------- util crypto ----------
function b64ToBytes(b64) {
  const bin = atob(b64); const u = new Uint8Array(bin.length);
  for (let i = 0; i < bin.length; i++) u[i] = bin.charCodeAt(i);
  return u;
}
function bytesToB64(bytes) {
  let s = ""; const u = new Uint8Array(bytes);
  for (let i = 0; i < u.length; i++) s += String.fromCharCode(u[i]);
  return btoa(s);
}
function pemToDer(pem) {
  const body = pem.replace(/-----BEGIN [^-]+-----/, "").replace(/-----END [^-]+-----/, "").replace(/\s+/g, "");
  return b64ToBytes(body);
}
async function sha256Hex(str) {
  const d = await crypto.subtle.digest("SHA-256", new TextEncoder().encode(str));
  return [...new Uint8Array(d)].map((b) => b.toString(16).padStart(2, "0")).join("");
}
function randomToken() {
  const u = new Uint8Array(32); crypto.getRandomValues(u);
  return [...u].map((b) => b.toString(16).padStart(2, "0")).join("");
}
async function importPrivateKey(pem) {
  return crypto.subtle.importKey("pkcs8", pemToDer(pem),
    { name: "RSASSA-PKCS1-v1_5", hash: "SHA-256" }, false, ["sign"]);
}
async function signLicense(env, payloadObj) {
  const payloadJson = JSON.stringify(payloadObj);
  const key = await importPrivateKey(env.LICENSE_PRIVATE_KEY);
  const sig = await crypto.subtle.sign("RSASSA-PKCS1-v1_5", key, new TextEncoder().encode(payloadJson));
  return { alg: "RS256", payload_b64: bytesToB64(new TextEncoder().encode(payloadJson)), signature_b64: bytesToB64(sig) };
}

async function buildLicense(env, tenant, device) {
  const lic = await env.CONTROL.prepare("SELECT * FROM licenza WHERE tenant_id=? AND stato='attiva' LIMIT 1")
    .bind(tenant.id).first();
  if (!lic) return null;
  const now = Date.now();
  const payload = {
    v: 1,
    tenant_id: tenant.id,
    ragione_sociale: tenant.ragione_sociale,
    matricola: device ? device.matricola_rt : null,
    piano: lic.piano,
    max_casse: lic.max_casse,
    max_palmari: lic.max_palmari,
    moduli: JSON.parse(lic.moduli || "{}"),
    scadenza: lic.scadenza,            // epoch ms o null = perpetua
    grace_giorni: lic.grace_giorni,    // validita' offline
    emessa_il: now,
    valida_fino_rinnovo: now + lic.grace_giorni * 86400000,
  };
  return signLicense(env, payload);
}

async function authDevice(env, request) {
  const h = request.headers.get("authorization") || "";
  const m = h.match(/^Bearer\s+(.+)$/i);
  if (!m) return null;
  const hash = await sha256Hex(m[1]);
  return env.CONTROL.prepare("SELECT * FROM dispositivo WHERE token_hash=? LIMIT 1").bind(hash).first();
}

export default {
  async fetch(request, env) {
    const url = new URL(request.url);
    const p = url.pathname;
    try {
      if (p === "/v1/health") return json({ ok: true, service: "ristorandro-api", ts: Date.now() });

      if (p === "/v1/device/activate" && request.method === "POST") {
        const body = await request.json().catch(() => ({}));
        const { tenant_id, matricola } = body;
        if (!tenant_id || !matricola) return err("tenant_id e matricola obbligatori");
        const tenant = await env.CONTROL.prepare("SELECT * FROM tenant WHERE id=? AND stato='attivo'")
          .bind(tenant_id).first();
        if (!tenant) return err("tenant inesistente o non attivo", 404);
        // limite casse
        const cnt = await env.CONTROL.prepare("SELECT COUNT(*) n FROM dispositivo WHERE tenant_id=?")
          .bind(tenant_id).first();
        let device = await env.CONTROL.prepare("SELECT * FROM dispositivo WHERE tenant_id=? AND matricola_rt=?")
          .bind(tenant_id, matricola).first();
        const token = randomToken();
        const tokenHash = await sha256Hex(token);
        const now = Date.now();
        if (!device) {
          const lic = await env.CONTROL.prepare("SELECT max_casse FROM licenza WHERE tenant_id=?").bind(tenant_id).first();
          if (lic && cnt.n >= lic.max_casse) return err("limite casse della licenza raggiunto", 403);
          const id = "dev_" + token.slice(0, 12);
          await env.CONTROL.prepare(
            "INSERT INTO dispositivo(id,tenant_id,matricola_rt,ruolo_lan,token_hash,ultimo_contatto,creato_il) VALUES(?,?,?,?,?,?,?)")
            .bind(id, tenant_id, matricola, "auto", tokenHash, now, now).run();
          device = { id, tenant_id, matricola_rt: matricola };
        } else {
          await env.CONTROL.prepare("UPDATE dispositivo SET token_hash=?, ultimo_contatto=? WHERE id=?")
            .bind(tokenHash, now, device.id).run();
        }
        const license = await buildLicense(env, tenant, device);
        if (!license) return err("nessuna licenza attiva per il tenant", 403);
        return json({ ok: true, device_token: token, device_id: device.id, license });
      }

      if (p === "/v1/license" && request.method === "GET") {
        const device = await authDevice(env, request);
        if (!device) return err("token dispositivo non valido", 401);
        const tenant = await env.CONTROL.prepare("SELECT * FROM tenant WHERE id=?").bind(device.tenant_id).first();
        const license = await buildLicense(env, tenant, device);
        await env.CONTROL.prepare("UPDATE dispositivo SET ultimo_contatto=? WHERE id=?").bind(Date.now(), device.id).run();
        return json({ ok: true, license });
      }

      if (p === "/v1/config/sync" && request.method === "GET") {
        const device = await authDevice(env, request);
        if (!device) return err("token dispositivo non valido", 401);
        const since = parseInt(url.searchParams.get("since") || "0", 10) || 0;
        const db = env.TENANT_DEV; // prototipo: tenant demo
        const changes = {};
        let cursor = since;
        for (const t of CONFIG_TABLES) {
          try {
            const rs = await db.prepare(`SELECT * FROM [${t}] WHERE _updated_at > ? ORDER BY _updated_at LIMIT 500`).bind(since).all();
            if (rs.results && rs.results.length) {
              changes[t] = rs.results;
              for (const r of rs.results) if (r._updated_at > cursor) cursor = r._updated_at;
            }
          } catch (e) { /* tabella assente nel prototipo */ }
        }
        return json({ ok: true, since, cursor, tables: Object.keys(changes), changes });
      }

      return err("not found", 404);
    } catch (e) {
      return err("errore interno: " + e.message, 500);
    }
  },
};
