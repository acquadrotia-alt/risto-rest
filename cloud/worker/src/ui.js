// Interfaccia del back-office (single page, servita dal Worker).
export const UI_HTML = `<!doctype html>
<html lang="it"><head>
<meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1">
<title>RistorAndro — Back-office</title>
<style>
  :root{--bg:#f6f7f9;--panel:#fff;--ink:#1c2530;--mut:#6b7684;--line:#e4e8ee;--acc:#2f6fed;--acc2:#1f9d55;--danger:#d64545}
  @media(prefers-color-scheme:dark){:root:not([data-theme=light]){--bg:#0e1116;--panel:#171c24;--ink:#e7ecf2;--mut:#9aa6b2;--line:#263040;--acc:#5b8bff}}
  *{box-sizing:border-box}body{margin:0;font:15px/1.45 system-ui,Segoe UI,Roboto,sans-serif;background:var(--bg);color:var(--ink)}
  header{display:flex;align-items:center;gap:12px;padding:12px 16px;background:var(--panel);border-bottom:1px solid var(--line);position:sticky;top:0}
  header b{font-size:17px}header .sp{flex:1}
  .mut{color:var(--mut)}.wrap{max-width:1000px;margin:0 auto;padding:16px}
  nav{display:flex;gap:6px;flex-wrap:wrap;margin-bottom:14px}
  button,.btn{font:inherit;border:1px solid var(--line);background:var(--panel);color:var(--ink);padding:8px 13px;border-radius:9px;cursor:pointer}
  button.pri{background:var(--acc);color:#fff;border-color:transparent}button.on{background:var(--acc);color:#fff;border-color:transparent}
  button.dng{color:var(--danger)}
  input,select{font:inherit;padding:8px 10px;border:1px solid var(--line);border-radius:8px;background:var(--panel);color:var(--ink);width:100%}
  table{width:100%;border-collapse:collapse;background:var(--panel);border:1px solid var(--line);border-radius:12px;overflow:hidden}
  th,td{text-align:left;padding:8px 10px;border-bottom:1px solid var(--line);white-space:nowrap}
  th{font-size:12px;text-transform:uppercase;letter-spacing:.04em;color:var(--mut)}
  tr:last-child td{border-bottom:0}.card{background:var(--panel);border:1px solid var(--line);border-radius:12px;padding:16px;margin-bottom:14px}
  .tbl-scroll{overflow:auto;border-radius:12px}
  .grid{display:grid;grid-template-columns:140px 1fr;gap:8px 10px;align-items:center}
  dialog{border:1px solid var(--line);border-radius:14px;background:var(--panel);color:var(--ink);max-width:560px;width:92%;padding:0}
  dialog::backdrop{background:#0008}.dlg-b{padding:16px}.dlg-h{padding:12px 16px;border-bottom:1px solid var(--line);font-weight:600}
  .row2{display:flex;gap:8px;flex-wrap:wrap}.pill{font-size:12px;padding:2px 8px;border-radius:999px;background:var(--line)}
  .err{color:var(--danger);margin-top:8px}.ok{color:var(--acc2)}
  label.f{display:block;margin:8px 0 3px;font-size:13px;color:var(--mut)}
</style></head>
<body>
<header><b>RistorAndro</b><span class="pill" id="env">back-office</span><span class="sp"></span>
  <span class="mut" id="who"></span> <button id="logout" style="display:none">Esci</button></header>
<div class="wrap" id="app"></div>

<dialog id="dlg"><div class="dlg-h" id="dlgt">Modifica</div><div class="dlg-b"><div id="dlgf"></div>
  <div class="row2" style="margin-top:14px;justify-content:flex-end"><button onclick="dlg.close()">Annulla</button>
  <button class="pri" id="dlgsave">Salva</button></div><div class="err" id="dlge"></div></div></dialog>

<script>
const API=location.origin; let TK=localStorage.getItem('ra_tk')||''; let ME=null;
const $=s=>document.querySelector(s); const app=$('#app');
async function api(path,opt={}){opt.headers=Object.assign({'content-type':'application/json'},opt.headers||{});if(TK)opt.headers.authorization='Bearer '+TK;const r=await fetch(API+path,opt);let d={};try{d=await r.json()}catch{}if(!r.ok||d.ok===false)throw new Error(d.error||('HTTP '+r.status));return d}
function esc(s){return String(s==null?'':s).replace(/[&<>]/g,c=>({'&':'&amp;','<':'&lt;','>':'&gt;'}[c]))}

function loginView(){
  $('#logout').style.display='none';$('#who').textContent='';
  app.innerHTML='<div class="card" style="max-width:380px;margin:40px auto"><h3 style="margin:0 0 12px">Accedi</h3>'+
   '<label class="f">Email</label><input id="em" autocomplete="username">'+
   '<label class="f">Password</label><input id="pw" type="password" autocomplete="current-password">'+
   '<button class="pri" id="go" style="margin-top:14px;width:100%">Entra</button><div class="err" id="le"></div></div>';
  $('#go').onclick=async()=>{try{const d=await api('/admin/api/login',{method:'POST',body:JSON.stringify({email:$('#em').value.trim(),password:$('#pw').value})});TK=d.token;localStorage.setItem('ra_tk',TK);ME=d.user;boot()}catch(e){$('#le').textContent=e.message}};
  $('#pw').addEventListener('keydown',e=>{if(e.key==='Enter')$('#go').click()});
}
let TAB='dati';
function shell(){
  $('#logout').style.display='';$('#who').textContent=ME.email+' ('+ME.ruolo+')';
  const tabs=[['dati','Dati']];if(ME.ruolo==='superadmin'){tabs.unshift(['clienti','Clienti & licenze']);tabs.push(['dispositivi','Dispositivi'])}
  app.innerHTML='<nav>'+tabs.map(([k,l])=>'<button data-t="'+k+'" class="'+(k===TAB?'on':'')+'">'+l+'</button>').join('')+'</nav><div id="view"></div>';
  app.querySelectorAll('nav button').forEach(b=>b.onclick=()=>{TAB=b.dataset.t;shell()});
  ({clienti:viewClienti,dispositivi:viewDevices,dati:viewDati}[TAB])();
}
async function viewClienti(){
  const v=$('#view');v.innerHTML='<div class="card"><div class="row2"><b style="flex:1">Clienti</b><button class="pri" id="nc">+ Nuovo cliente</button></div></div><div id="tc" class="mut">...</div>';
  $('#nc').onclick=()=>formDialog('Nuovo cliente',[['id','ID (es. cli_rossi)'],['ragione_sociale','Ragione sociale'],['max_casse','Max casse','number','1'],['max_palmari','Max palmari','number','0'],['grace_giorni','Giorni offline','number','14']],async f=>{await api('/admin/api/tenants',{method:'POST',body:JSON.stringify({id:f.id,ragione_sociale:f.ragione_sociale,max_casse:+f.max_casse,max_palmari:+f.max_palmari,grace_giorni:+f.grace_giorni,piano:'pro'})});viewClienti()});
  try{const d=await api('/admin/api/tenants');$('#tc').outerHTML='<div class="tbl-scroll"><table><tr><th>ID</th><th>Ragione sociale</th><th>Stato</th><th>Casse</th><th>Creato</th></tr>'+
    d.tenants.map(t=>'<tr><td>'+esc(t.id)+'</td><td>'+esc(t.ragione_sociale)+'</td><td><span class="pill">'+esc(t.stato)+'</span></td><td>'+t.casse+'</td><td class="mut">'+new Date(t.creato_il).toLocaleDateString('it-IT')+'</td></tr>').join('')+'</table></div>'}catch(e){$('#tc').innerHTML='<div class="err">'+e.message+'</div>'}
}
async function viewDevices(){
  const v=$('#view');v.innerHTML='<div id="td" class="mut">...</div>';
  try{const d=await api('/admin/api/devices');$('#td').outerHTML='<div class="tbl-scroll"><table><tr><th>Cliente</th><th>Matricola RT</th><th>Ruolo LAN</th><th>Ultimo contatto</th></tr>'+
    d.devices.map(x=>'<tr><td>'+esc(x.tenant_id)+'</td><td>'+esc(x.matricola_rt)+'</td><td>'+esc(x.ruolo_lan)+'</td><td class="mut">'+(x.ultimo_contatto?new Date(x.ultimo_contatto).toLocaleString('it-IT'):'—')+'</td></tr>').join('')+'</table></div>'}catch(e){$('#td').innerHTML='<div class="err">'+e.message+'</div>'}
}
let CURT='articoli';
async function viewDati(){
  const v=$('#view');const tabs=['articoli','reparti','iva','pagamenti','operatori'];
  v.innerHTML='<div class="card"><div class="row2">'+tabs.map(t=>'<button data-d="'+t+'" class="'+(t===CURT?'on':'')+'">'+t+'</button>').join('')+'<span class="sp" style="flex:1"></span><button class="pri" id="add">+ Nuovo</button></div></div><div id="dg" class="mut">...</div>';
  v.querySelectorAll('[data-d]').forEach(b=>b.onclick=()=>{CURT=b.dataset.d;viewDati()});
  try{const d=await api('/admin/api/data/'+CURT);window._cols=d.columns;window._pk=d.pk;
    $('#add').onclick=()=>editRow(null,d.columns,d.pk);
    const show=d.columns.filter(c=>!c.startsWith('_')).slice(0,6);
    $('#dg').outerHTML='<div class="tbl-scroll"><table><tr>'+show.map(c=>'<th>'+c+'</th>').join('')+'<th></th></tr>'+
      d.rows.map(r=>'<tr>'+show.map(c=>'<td>'+esc(r[c])+'</td>').join('')+'<td class="row2"><button onclick=\\'editRow('+JSON.stringify(JSON.stringify(r))+','+JSON.stringify(JSON.stringify(d.columns))+',"'+d.pk+'")\\'>✎</button><button class="dng" onclick=\\'delRow("'+esc(r[d.pk])+'")\\'>🗑</button></td></tr>').join('')+'</table></div>';
  }catch(e){$('#dg').innerHTML='<div class="err">'+e.message+'</div>'}
}
window.editRow=function(rowJson,colsJson,pk){const row=rowJson?JSON.parse(rowJson):{};const cols=(typeof colsJson==='string'?JSON.parse(colsJson):colsJson).filter(c=>!c.startsWith('_'));
  formDialog(rowJson?'Modifica':'Nuovo',cols.map(c=>[c,c,'text',row[c]]),async f=>{await api('/admin/api/data/'+CURT,{method:'POST',body:JSON.stringify(f)});viewDati()});}
window.delRow=async function(id){if(!confirm('Eliminare "'+id+'"? (si propaga alle casse)'))return;await api('/admin/api/data/'+CURT+'?id='+encodeURIComponent(id),{method:'DELETE'});viewDati()}
function formDialog(title,fields,onsave){$('#dlgt').textContent=title;$('#dlge').textContent='';
  $('#dlgf').innerHTML='<div class="grid">'+fields.map(([k,l,t,v])=>'<label class="f" style="margin:0">'+esc(l)+'</label><input data-k="'+k+'" type="'+(t||'text')+'" value="'+esc(v==null?'':v)+'">').join('')+'</div>';
  $('#dlgsave').onclick=async()=>{const f={};$('#dlgf').querySelectorAll('input').forEach(i=>f[i.dataset.k]=i.value);try{await onsave(f);dlg.close()}catch(e){$('#dlge').textContent=e.message}};
  dlg.showModal()}
$('#logout').onclick=()=>{TK='';localStorage.removeItem('ra_tk');ME=null;loginView()};
async function boot(){if(!TK){loginView();return}try{const d=await api('/admin/api/me');ME={email:ME?ME.email:d.user.id,ruolo:d.user.ruolo,tenant_id:d.user.tenant_id};shell()}catch{loginView()}}
boot();
</script></body></html>`;
