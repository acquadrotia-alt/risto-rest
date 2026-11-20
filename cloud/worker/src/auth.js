// Autenticazione back-office: hash password PBKDF2 + sessioni firmate HMAC.

const enc = new TextEncoder();

function b64(bytes) {
  let s = ""; const u = new Uint8Array(bytes);
  for (let i = 0; i < u.length; i++) s += String.fromCharCode(u[i]);
  return btoa(s);
}
function ub64(s) {
  const bin = atob(s); const u = new Uint8Array(bin.length);
  for (let i = 0; i < bin.length; i++) u[i] = bin.charCodeAt(i);
  return u;
}

export async function verifyPassword(stored, password) {
  // formato: pbkdf2$<iter>$<salt_b64>$<hash_b64>
  const [scheme, iterS, saltB, hashB] = (stored || "").split("$");
  if (scheme !== "pbkdf2") return false;
  const iter = parseInt(iterS, 10);
  const salt = ub64(saltB);
  const key = await crypto.subtle.importKey("raw", enc.encode(password), "PBKDF2", false, ["deriveBits"]);
  const bits = await crypto.subtle.deriveBits(
    { name: "PBKDF2", salt, iterations: iter, hash: "SHA-256" }, key, 256);
  const got = b64(bits);
  return got === hashB;
}

async function hmac(secret, msg) {
  const key = await crypto.subtle.importKey("raw", enc.encode(secret), { name: "HMAC", hash: "SHA-256" }, false, ["sign"]);
  const sig = await crypto.subtle.sign("HMAC", key, enc.encode(msg));
  return b64(sig).replace(/\+/g, "-").replace(/\//g, "_").replace(/=+$/, "");
}

export async function makeSession(secret, user, ttlHours = 12) {
  const exp = Date.now() + ttlHours * 3600000;
  const body = `${user.id}.${user.ruolo}.${user.tenant_id || ""}.${exp}`;
  const sig = await hmac(secret, body);
  return btoa(body).replace(/=+$/, "") + "." + sig;
}

export async function readSession(secret, token) {
  if (!token || token.indexOf(".") < 0) return null;
  const [b, sig] = [token.slice(0, token.lastIndexOf(".")), token.slice(token.lastIndexOf(".") + 1)];
  let body;
  try { body = atob(b); } catch { return null; }
  if ((await hmac(secret, body)) !== sig) return null;
  const [id, ruolo, tenant_id, expS] = body.split(".");
  if (parseInt(expS, 10) < Date.now()) return null;
  return { id, ruolo, tenant_id: tenant_id || null };
}
