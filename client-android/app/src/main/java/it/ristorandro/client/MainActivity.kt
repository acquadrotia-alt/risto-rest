package it.ristorandro.client

import android.app.Activity
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Bundle
import android.util.Base64
import android.view.Gravity
import android.view.View
import android.widget.*
import org.json.JSONObject
import java.io.BufferedReader
import java.net.HttpURLConnection
import java.net.URL
import java.security.KeyFactory
import java.security.Signature
import java.security.spec.X509EncodedKeySpec

/**
 * Client di test RistorAndro Cloud.
 * Fa l'intero giro col backend Cloudflare: attivazione dispositivo, verifica della licenza
 * firmata (RSA/SHA-256 con la sola chiave pubblica), sincronizzazione della configurazione in
 * una cache SQLite locale. La cache permette di mostrare gli articoli anche offline.
 */
class MainActivity : Activity() {

    private val BASE = "https://ristorandro-api.acquadro-tia.workers.dev"
    private val TENANT = "cli_demo"

    private lateinit var matr: EditText
    private lateinit var stato: TextView
    private lateinit var lista: TextView
    private lateinit var db: Db

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        db = Db(this)

        val root = ScrollView(this)
        val col = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(16), dp(16), dp(16), dp(16))
        }
        root.addView(col)

        col.addView(TextView(this).apply { text = "RistorAndro — Client cloud"; textSize = 20f })
        col.addView(TextView(this).apply {
            text = "Matricola RT della cassa:"; setPadding(0, dp(12), 0, dp(4))
        })
        matr = EditText(this).apply { setText("ST1B058820") }
        col.addView(matr)

        val btn = Button(this).apply { text = "Attiva e sincronizza" }
        col.addView(btn)

        stato = TextView(this).apply { setPadding(0, dp(12), 0, dp(8)); text = "Pronto." }
        col.addView(stato)

        col.addView(View(this).apply {
            layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, dp(1))
            setBackgroundColor(0xFFCCCCCC.toInt())
        })
        col.addView(TextView(this).apply { text = "Articoli in cache locale:"; setPadding(0, dp(10), 0, dp(4)); textSize = 16f })
        lista = TextView(this).apply { typeface = android.graphics.Typeface.MONOSPACE; textSize = 13f }
        col.addView(lista)

        setContentView(root)

        btn.setOnClickListener { sincronizza() }
        mostraCache() // all'avvio mostra subito la cache (funziona offline)
    }

    private fun sincronizza() {
        stato.text = "Connessione al cloud…"
        Thread {
            try {
                val matricola = matr.text.toString().trim()

                // 1) attivazione dispositivo -> token + licenza firmata
                val act = JSONObject(httpPost("$BASE/v1/device/activate",
                    """{"tenant_id":"$TENANT","matricola":"$matricola"}"""))
                if (!act.optBoolean("ok")) throw RuntimeException(act.optString("error", "attivazione fallita"))
                val token = act.getString("device_token")
                db.setSetting("token", token)

                // 2) verifica della licenza con la CHIAVE PUBBLICA
                val lic = act.getJSONObject("license")
                val okFirma = verificaLicenza(lic)
                val payload = JSONObject(String(Base64.decode(lic.getString("payload_b64"), Base64.DEFAULT)))
                val piano = payload.optString("piano")
                val scad = if (payload.isNull("scadenza")) "perpetua" else payload.optLong("scadenza").toString()
                val riga1 = if (okFirma) "Licenza VALIDA ✓  piano=$piano  scadenza=$scad" else "Licenza NON valida ✗"

                // 3) sync configurazione (delta dal cursore)
                val since = db.getSetting("cursor")?.toLongOrNull() ?: 0L
                val sync = JSONObject(httpGet("$BASE/v1/config/sync?since=$since", token))
                if (!sync.optBoolean("ok")) throw RuntimeException(sync.optString("error", "sync fallita"))
                val changes = sync.optJSONObject("changes") ?: JSONObject()
                val scritte = db.applyChanges(changes)
                val cursor = sync.optLong("cursor", since)
                if (cursor > since) db.setSetting("cursor", cursor.toString())

                runOnUiThread {
                    stato.text = "$riga1\nSincronizzati: $scritte record  (cursore=$cursor)"
                    mostraCache()
                }
            } catch (e: Exception) {
                runOnUiThread { stato.text = "Errore: ${e.message}\n(se offline, sotto resta la cache)" }
            }
        }.start()
    }

    private fun verificaLicenza(lic: JSONObject): Boolean {
        return try {
            val payload = Base64.decode(lic.getString("payload_b64"), Base64.DEFAULT)
            val sig = Base64.decode(lic.getString("signature_b64"), Base64.DEFAULT)
            val pem = assets.open("license_public.pem").bufferedReader().readText()
            val der = Base64.decode(pem.replace(Regex("-----[A-Z ]+-----"), "").replace(Regex("\\s"), ""), Base64.DEFAULT)
            val pk = KeyFactory.getInstance("RSA").generatePublic(X509EncodedKeySpec(der))
            Signature.getInstance("SHA256withRSA").run { initVerify(pk); update(payload); verify(sig) }
        } catch (e: Exception) { false }
    }

    private fun mostraCache() {
        val sb = StringBuilder()
        val c = db.readable.rawQuery(
            "SELECT a.codint,a.descrizione,a.list1,r.descrizione rep FROM articoli a " +
            "LEFT JOIN reparti r ON r.codice=a.reparto ORDER BY a.descrizione LIMIT 200", null)
        var n = 0
        while (c.moveToNext()) {
            n++
            sb.append(String.format("%-10s %-26s %7.2f  %s\n",
                c.getString(0), trunc(c.getString(1), 26), c.getDouble(2), c.getString(3) ?: ""))
        }
        c.close()
        lista.text = if (n == 0) "(vuota — premi «Attiva e sincronizza»)" else "n. articoli: $n\n\n$sb"
    }

    private fun trunc(s: String?, n: Int) = if (s == null) "" else if (s.length <= n) s else s.substring(0, n)
    private fun dp(v: Int) = (v * resources.displayMetrics.density).toInt()

    // ---------- HTTP (API native, nessuna libreria esterna) ----------
    private fun httpPost(url: String, body: String): String {
        val c = URL(url).openConnection() as HttpURLConnection
        c.requestMethod = "POST"; c.doOutput = true; c.connectTimeout = 15000; c.readTimeout = 20000
        c.setRequestProperty("Content-Type", "application/json")
        c.outputStream.use { it.write(body.toByteArray()) }
        return leggi(c)
    }
    private fun httpGet(url: String, token: String?): String {
        val c = URL(url).openConnection() as HttpURLConnection
        c.requestMethod = "GET"; c.connectTimeout = 15000; c.readTimeout = 20000
        if (token != null) c.setRequestProperty("Authorization", "Bearer $token")
        return leggi(c)
    }
    private fun leggi(c: HttpURLConnection): String {
        val stream = if (c.responseCode in 200..299) c.inputStream else c.errorStream
        return stream.bufferedReader().use(BufferedReader::readText)
    }
}

/** Cache locale SQLite: configurazione scaricata dal cloud + impostazioni (token, cursore). */
class Db(ctx: Context) : SQLiteOpenHelper(ctx, "cache.db", null, 1) {
    val readable: SQLiteDatabase get() = readableDatabase
    override fun onCreate(d: SQLiteDatabase) {
        d.execSQL("CREATE TABLE articoli(codint TEXT PRIMARY KEY, descrizione TEXT, list1 REAL, reparto INTEGER, iva INTEGER)")
        d.execSQL("CREATE TABLE reparti(codice INTEGER PRIMARY KEY, descrizione TEXT)")
        d.execSQL("CREATE TABLE iva(codice INTEGER PRIMARY KEY, descrizione TEXT, aliquota REAL)")
        d.execSQL("CREATE TABLE settings(k TEXT PRIMARY KEY, v TEXT)")
    }
    override fun onUpgrade(d: SQLiteDatabase, o: Int, n: Int) {}

    fun setSetting(k: String, v: String) =
        writableDatabase.execSQL("INSERT OR REPLACE INTO settings(k,v) VALUES(?,?)", arrayOf(k, v))
    fun getSetting(k: String): String? {
        val c = readableDatabase.rawQuery("SELECT v FROM settings WHERE k=?", arrayOf(k))
        val r = if (c.moveToFirst()) c.getString(0) else null; c.close(); return r
    }

    fun applyChanges(changes: JSONObject): Int {
        val d = writableDatabase; var n = 0; d.beginTransaction()
        try {
            changes.optJSONArray("anagra")?.let { arr ->
                for (i in 0 until arr.length()) {
                    val r = arr.getJSONObject(i)
                    if (r.optInt("_deleted") == 1)
                        d.execSQL("DELETE FROM articoli WHERE codint=?", arrayOf(r.optString("codint")))
                    else
                        d.execSQL("INSERT OR REPLACE INTO articoli(codint,descrizione,list1,reparto,iva) VALUES(?,?,?,?,?)",
                            arrayOf(r.optString("codint"), r.optString("descrizione"),
                                r.optDouble("list1", 0.0), r.optInt("reparto"), r.optInt("iva")))
                    n++
                }
            }
            changes.optJSONArray("reparti")?.let { arr ->
                for (i in 0 until arr.length()) {
                    val r = arr.getJSONObject(i)
                    d.execSQL("INSERT OR REPLACE INTO reparti(codice,descrizione) VALUES(?,?)",
                        arrayOf(r.optInt("codice"), r.optString("descrizione"))); n++
                }
            }
            changes.optJSONArray("iva")?.let { arr ->
                for (i in 0 until arr.length()) {
                    val r = arr.getJSONObject(i)
                    d.execSQL("INSERT OR REPLACE INTO iva(codice,descrizione,aliquota) VALUES(?,?,?)",
                        arrayOf(r.optInt("codice"), r.optString("descrizione"), r.optDouble("aliquota", 0.0))); n++
                }
            }
            d.setTransactionSuccessful()
        } finally { d.endTransaction() }
        return n
    }
}
