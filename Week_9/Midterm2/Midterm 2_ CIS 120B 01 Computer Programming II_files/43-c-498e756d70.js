(window["canvasWebpackJsonp"]=window["canvasWebpackJsonp"]||[]).push([[43],{"08kA":function(e,r,t){"use strict"
var a=t("s4NR"),n=t("CxY0"),o=t("U6jy")
function s(e){return e&&e.rel}function d(e,r){function t(t){e[t]=o(r,{rel:t})}r.rel.split(/\s+/).forEach(t)
return e}function i(e,r){var t=r.match(/\s*(.+)\s*=\s*"?([^"]+)"?/)
t&&(e[t[1]]=t[2])
return e}function c(e){try{var r=e.match(/<?([^>]*)>(.*)/),t=r[1],s=r[2].split(";"),d=n.parse(t),c=a.parse(d.query)
s.shift()
var l=s.reduce(i,{})
l=o(c,l)
l.url=t
return l}catch(e){return null}}e.exports=function(e){if(!e)return null
return e.split(/,\s*</).map(c).filter(s).reduce(d,{})}},"4uX5":function(e,r,t){"use strict"
t.d(r,"a",(function(){return p}))
var a=t("RtDj")
var n=t("q1tI")
var o=t.n(n)
var s=t("mrSG")
var d=t("gtzJ")
var i=t("3CEA")
var c=t("9/Zf")
var l=t("8LbN")
t("2mql")
var u=Object(c["f"])(n["version"])
var _={componentStack:null,error:null,eventId:null}
var v=function(e){Object(s["__extends"])(r,e)
function r(){var r=null!==e&&e.apply(this,arguments)||this
r.state=_
r.resetErrorBoundary=function(){var e=r.props.onReset
var t=r.state,a=t.error,n=t.componentStack,o=t.eventId
e&&e(a,n,o)
r.setState(_)}
return r}r.prototype.componentDidCatch=function(e,r){var t=this
var a=r.componentStack
var n=this.props,o=n.beforeCapture,c=n.onError,l=n.showDialog,_=n.dialogOptions
Object(d["b"])((function(r){if(u.major&&u.major>=17){var n=new Error(e.message)
n.name="React ErrorBoundary "+n.name
n.stack=a
e.cause=n}o&&o(r,e,a)
var v=Object(d["a"])(e,{contexts:{react:{componentStack:a}}})
c&&c(e,a,v)
l&&Object(i["b"])(Object(s["__assign"])(Object(s["__assign"])({},_),{eventId:v}))
t.setState({error:e,componentStack:a,eventId:v})}))}
r.prototype.componentDidMount=function(){var e=this.props.onMount
e&&e()}
r.prototype.componentWillUnmount=function(){var e=this.state,r=e.error,t=e.componentStack,a=e.eventId
var n=this.props.onUnmount
n&&n(r,t,a)}
r.prototype.render=function(){var e=this.props,r=e.fallback,t=e.children
var a=this.state,o=a.error,s=a.componentStack,d=a.eventId
if(o){var i=void 0
i="function"===typeof r?r({error:o,componentStack:s,resetError:this.resetErrorBoundary,eventId:d}):r
if(n["isValidElement"](i))return i
r&&l["b"].warn("fallback did not produce a valid ReactElement")
return null}if("function"===typeof t)return t()
return t}
return r}(n["Component"])
class p extends o.a.Component{constructor(...e){super(...e)
this.state={error:null}}static getDerivedStateFromError(e){return{error:e}}componentDidCatch(e,r){console.error(e,r)}render(){if(this.state.error)return"function"===typeof this.props.errorComponent?this.props.errorComponent({error:this.state.error,componentStack:null,eventId:null,resetError:()=>this.setState({error:null})}):this.props.errorComponent
return Object(a["a"])(v,{fallback:this.props.errorComponent},void 0,this.props.children)}}},BrAc:function(e,r,t){"use strict"
var a=t("vDqi")
var n=t.n(a)
n.a.defaults.xsrfCookieName="_csrf_token"
n.a.defaults.xsrfHeaderName="X-CSRF-Token"
const o=n.a.defaults.headers.common.Accept
n.a.defaults.headers.common.Accept="application/json+canvas-string-ids, "+o
n.a.defaults.headers.common["X-Requested-With"]="XMLHttpRequest"
r["a"]=n.a},HeaX:function(e,r,t){"use strict"
t.d(r,"a",(function(){return f}))
var a=t("RtDj")
var n=t("HGxv")
var o=t("8WeW")
Object(o["a"])(JSON.parse('{"ar":{"close_d634289d":"إغلاق"},"ca":{"close_d634289d":"Tanca"},"cy":{"close_d634289d":"Cau"},"da":{"close_d634289d":"Luk"},"da-x-k12":{"close_d634289d":"Luk"},"de":{"close_d634289d":"Schließen"},"el":{"close_d634289d":"Κλείσιμο"},"en-AU":{"close_d634289d":"Close"},"en-AU-x-unimelb":{"close_d634289d":"Close"},"en-CA":{"close_d634289d":"Close"},"en-GB":{"close_d634289d":"Close"},"en-GB-x-lbs":{"close_d634289d":"Close"},"en-GB-x-ukhe":{"close_d634289d":"Close"},"es":{"close_d634289d":"Cerrar"},"es-ES":{"close_d634289d":"Cerrar"},"fa":{"close_d634289d":"بستن"},"fi":{"close_d634289d":"Sulje"},"fr":{"close_d634289d":"Fermer"},"fr-CA":{"close_d634289d":"Fermer"},"he":{"close_d634289d":"סגירה"},"ht":{"close_d634289d":"Fèmen"},"hu":{"close_d634289d":"Bezárás"},"hy":{"close_d634289d":"Փակել"},"is":{"close_d634289d":"Loka"},"it":{"close_d634289d":"Chiudi"},"ja":{"close_d634289d":"閉じる"},"ko":{"close_d634289d":"닫기"},"mi":{"close_d634289d":"Katia"},"nb":{"close_d634289d":"Lukk"},"nb-x-k12":{"close_d634289d":"Lukk"},"nl":{"close_d634289d":"Sluiten"},"nn":{"close_d634289d":"Lukk"},"pl":{"close_d634289d":"Zamknij"},"pt":{"close_d634289d":"Fechar"},"pt-BR":{"close_d634289d":"Fechar"},"ru":{"close_d634289d":"Закрыть"},"sl":{"close_d634289d":"Zapri"},"sv":{"close_d634289d":"Stäng"},"sv-x-k12":{"close_d634289d":"Stäng"},"th":{"close_d634289d":"ปิด"},"tr":{"close_d634289d":"Kapat"},"uk":{"close_d634289d":"Закрити"},"vi":{"close_d634289d":"Đóng"},"zh-Hans":{"close_d634289d":"关闭"},"zh-Hant":{"close_d634289d":"關閉"}}'))
t("jQeR")
t("0sPK")
var s=n["default"].scoped("canvas_modal")
var d=t("q1tI")
var i=t.n(d)
t("17x9")
var c=t("Mmr1")
var l=t("n12J")
var u=t("TstA")
var _=t("msMH")
var v=t("Dibh")
var p=t("4uX5")
var g=t("qwzJ")
var h=t("1sWr")
var m=t.n(h)
f.defaultProps={padding:"small",errorImageUrl:m.a,footer:null,title:null,closeButtonSize:"small"}
function f({padding:e,errorSubject:r,errorCategory:t,errorImageUrl:n,label:o,title:d,onDismiss:h,children:m,footer:f,closeButtonSize:b,...j}){null==d&&(d=o)
return i.a.createElement(v["a"],Object.assign({label:o,onDismiss:h},j),Object(a["a"])(v["a"].Header,{},void 0,Object(a["a"])(u["a"],{},void 0,Object(a["a"])(u["a"].Item,{grow:true},void 0,Object(a["a"])(_["a"],{},void 0,d)),Object(a["a"])(u["a"].Item,{},void 0,Object(a["a"])(c["a"],{onClick:h,size:b},void 0,s.t("Close"))))),Object(a["a"])(v["a"].Body,{padding:e},void 0,Object(a["a"])(l["a"],{as:"div",height:"100%"},void 0,Object(a["a"])(p["a"],{errorComponent:Object(a["a"])(g["a"],{imageUrl:n,errorSubject:r,errorCategory:t})},void 0,m))),f&&Object(a["a"])(v["a"].Footer,{},void 0,"function"===typeof f?f():f))}},Ipg6:function(e,r,t){"use strict"
t.d(r,"a",(function(){return l}))
var a=t("ouhR")
var n=t.n(a)
var o=t("FOCd")
var s=t("08kA")
var d=t.n(s)
var i=t("etQE")
function c({path:e,params:r}){const t=n.a.param(r)
if(!t.length)return e
return`${e}?${t}`}async function l({path:e,method:r="GET",headers:t={},params:a={},body:n,fetchOpts:s={}}){const l={...i["e"]}
l.headers["X-CSRF-Token"]=Object(o["a"])("_csrf_token")
if(n&&"string"!==typeof n){n=JSON.stringify(n)
l.headers["Content-Type"]="application/json"}Object.assign(l.headers,t)
Object.assign(l,s)
const u=c({path:e,params:a})
const _=await fetch(u,{body:n,method:r,...l})
if(!_.ok){const e=new Error(`doFetchApi received a bad response: ${_.status} ${_.statusText}`)
Object.assign(e,{response:_})
throw e}const v=_.headers.get("Link")
const p=v&&d()(v)||void 0
const g=await _.text()
const h=g.length>0?JSON.parse(g):void 0
return{json:h,response:_,link:p}}},U6jy:function(e,r){e.exports=a
var t=Object.prototype.hasOwnProperty
function a(){var e={}
for(var r=0;r<arguments.length;r++){var a=arguments[r]
for(var n in a)t.call(a,n)&&(e[n]=a[n])}return e}},XFtX:function(e,r,t){"use strict"
var a=t("17x9")
var n=t("lNsk")
const o=Object(a["shape"])({id:a["string"],display_name:a["string"],url:a["string"]})
var s=o
const d=Object(a["shape"])({id:a["string"].isRequired,progress_url:a["string"],user_id:a["string"],workflow_state:Object(a["oneOf"])(["created","exporting","exported","failed"]),attachment:s})
var i=d
const c=["assignment","attachment","discussion_topic","page","quiz","module","module_item"]
Object(a["shape"])({id:a["string"].isRequired,name:a["string"].isRequired,content_type:Object(a["oneOf"])(c).isRequired,created_at:a["string"].isRequired,updated_at:a["string"].isRequired,read_state:a["string"].isRequired,sender:n["b"].isRequired,content_export:i})},bJGz:function(e,r,t){"use strict"
t.d(r,"a",(function(){return f}))
var a=t("RtDj")
var n=t("HGxv")
var o=t("8WeW")
Object(o["a"])(JSON.parse('{"ar":{"close_d634289d":"إغلاق"},"ca":{"close_d634289d":"Tanca"},"cy":{"close_d634289d":"Cau"},"da":{"close_d634289d":"Luk"},"da-x-k12":{"close_d634289d":"Luk"},"de":{"close_d634289d":"Schließen"},"el":{"close_d634289d":"Κλείσιμο"},"en-AU":{"close_d634289d":"Close"},"en-AU-x-unimelb":{"close_d634289d":"Close"},"en-CA":{"close_d634289d":"Close"},"en-GB":{"close_d634289d":"Close"},"en-GB-x-lbs":{"close_d634289d":"Close"},"en-GB-x-ukhe":{"close_d634289d":"Close"},"es":{"close_d634289d":"Cerrar"},"es-ES":{"close_d634289d":"Cerrar"},"fa":{"close_d634289d":"بستن"},"fi":{"close_d634289d":"Sulje"},"fr":{"close_d634289d":"Fermer"},"fr-CA":{"close_d634289d":"Fermer"},"he":{"close_d634289d":"סגירה"},"ht":{"close_d634289d":"Fèmen"},"hu":{"close_d634289d":"Bezárás"},"hy":{"close_d634289d":"Փակել"},"is":{"close_d634289d":"Loka"},"it":{"close_d634289d":"Chiudi"},"ja":{"close_d634289d":"閉じる"},"ko":{"close_d634289d":"닫기"},"mi":{"close_d634289d":"Katia"},"nb":{"close_d634289d":"Lukk"},"nb-x-k12":{"close_d634289d":"Lukk"},"nl":{"close_d634289d":"Sluiten"},"nn":{"close_d634289d":"Lukk"},"pl":{"close_d634289d":"Zamknij"},"pt":{"close_d634289d":"Fechar"},"pt-BR":{"close_d634289d":"Fechar"},"ru":{"close_d634289d":"Закрыть"},"sl":{"close_d634289d":"Zapri"},"sv":{"close_d634289d":"Stäng"},"sv-x-k12":{"close_d634289d":"Stäng"},"th":{"close_d634289d":"ปิด"},"tr":{"close_d634289d":"Kapat"},"uk":{"close_d634289d":"Закрити"},"vi":{"close_d634289d":"Đóng"},"zh-Hans":{"close_d634289d":"关闭"},"zh-Hant":{"close_d634289d":"關閉"}}'))
t("jQeR")
t("0sPK")
var s=n["default"].scoped("tray")
var d=t("q1tI")
var i=t.n(d)
t("17x9")
var c=t("Mmr1")
var l=t("n12J")
var u=t("TstA")
var _=t("msMH")
var v=t("Ci/e")
var p=t("4uX5")
var g=t("qwzJ")
var h=t("1sWr")
var m=t.n(h)
f.defaultProps={padding:"small",contentPadding:"0",errorImageUrl:m.a}
function f({padding:e,headerPadding:r,contentPadding:t,errorSubject:n,errorCategory:o,errorImageUrl:d,label:h,title:m,onDismiss:f,children:b,...j}){var k,O
null==r&&(r=`0 0 ${e} 0`)
null==m&&(m=h)
function C(){return Object(a["a"])(u["a"],{as:"div",padding:r},void 0,Object(a["a"])(u["a"].Item,{grow:true},void 0,Object(a["a"])(_["a"],{ellipsis:true},void 0,m)),Object(a["a"])(u["a"].Item,{},void 0,Object(a["a"])(c["a"],{onClick:f,size:"small"},void 0,s.t("Close"))))}function y(){return Object(a["a"])(p["a"],{errorComponent:k||(k=Object(a["a"])(g["a"],{imageUrl:d,errorSubject:n,errorCategory:o}))},void 0,O||(O=Object(a["a"])(l["a"],{as:"div",padding:t,width:"100%",height:"100%"},void 0,b)))}return i.a.createElement(v["a"],Object.assign({label:h,onDismiss:f},j),Object(a["a"])(l["a"],{as:"div",padding:e,position:"absolute",insetBlockStart:"0",insetBlockEnd:"0",insetInlineStart:"0",insetInlineEnd:"0"},void 0,Object(a["a"])("div",{style:{display:"flex",flexDirection:"column",width:"100%",height:"100%"}},void 0,C(),Object(a["a"])("div",{style:{position:"relative",flex:1}},void 0,y()))))}},l0h0:function(e,r,t){"use strict"
t.d(r,"a",(function(){return _}))
var a=t("RtDj")
var n=t("HGxv")
var o=t("8WeW")
Object(o["a"])(JSON.parse('{"ar":{"loading_25990131":"جارٍ التحميل..."},"ca":{"loading_25990131":"S\'està carregant…"},"cy":{"loading_25990131":"Wrthi’n llwytho..."},"da":{"loading_25990131":"Indlæser ..."},"da-x-k12":{"loading_25990131":"Indlæser ..."},"de":{"loading_25990131":"Wird geladen ..."},"el":{"loading_25990131":"Φόρτωση..."},"en-AU":{"loading_25990131":"Loading..."},"en-AU-x-unimelb":{"loading_25990131":"Loading..."},"en-CA":{"loading_25990131":"Loading..."},"en-GB":{"loading_25990131":"Loading..."},"en-GB-x-lbs":{"loading_25990131":"Loading..."},"en-GB-x-ukhe":{"loading_25990131":"Loading..."},"es":{"loading_25990131":"Cargando..."},"es-ES":{"loading_25990131":"Cargando..."},"fa":{"loading_25990131":"در حال بارگذاری..."},"fi":{"loading_25990131":"Ladataan..."},"fr":{"loading_25990131":"Chargement..."},"fr-CA":{"loading_25990131":"En cours de chargement..."},"he":{"loading_25990131":"טוען..."},"ht":{"loading_25990131":"Chajman..."},"hu":{"loading_25990131":"Töltődik..."},"hy":{"loading_25990131":"Բեռնում է..."},"is":{"loading_25990131":"Hleð inn..."},"it":{"loading_25990131":"Caricamento in corso..."},"ja":{"loading_25990131":"読み込み中・・・"},"ko":{"loading_25990131":"로드하는 중..."},"mi":{"loading_25990131":"E uta ana ...."},"nb":{"loading_25990131":"Laster…"},"nb-x-k12":{"loading_25990131":"Laster…"},"nl":{"loading_25990131":"Bezig met laden..."},"nn":{"loading_25990131":"Lastar..."},"pl":{"loading_25990131":"Wczytywanie..."},"pt":{"loading_25990131":"A carregar..."},"pt-BR":{"loading_25990131":"Carregando..."},"ru":{"loading_25990131":"Выполняется загрузка..."},"sl":{"loading_25990131":"Nalaganje ..."},"sv":{"loading_25990131":"Läser in ..."},"sv-x-k12":{"loading_25990131":"Läser in ..."},"th":{"loading_25990131":"กำลังโหลด..."},"tr":{"loading_25990131":"Yükleniyor..."},"uk":{"loading_25990131":"Завантаження..."},"vi":{"loading_25990131":"Đang tải..."},"zh-Hans":{"loading_25990131":"加载中……"},"zh-Hant":{"loading_25990131":"正在載入……"}}'))
t("jQeR")
t("0sPK")
var s=n["default"].scoped("canvas_lazy_tray")
var d=t("q1tI")
var i=t.n(d)
var c=t("bJGz")
var l=t("uSnb")
var u=t("n12J")
function _({children:e,...r}){const t=Object(a["a"])(u["a"],{as:"div",textAlign:"center"},void 0,Object(a["a"])(l["a"],{renderTitle:s.t("Loading...")}))
return i.a.createElement(c["a"],r,Object(a["a"])(d["Suspense"],{fallback:t},void 0,e))}},lNsk:function(e,r,t){"use strict"
t.d(r,"a",(function(){return o}))
var a=t("17x9")
const n=Object(a["shape"])({id:a["string"].isRequired,display_name:a["string"].isRequired,avatar_image_url:a["string"]})
r["b"]=n
Object(a["shape"])({id:a["string"].isRequired,name:a["string"].isRequired,avatar_url:a["string"],email:a["string"]})
const o=Object(a["shape"])({id:a["string"].isRequired,name:a["string"].isRequired,avatar_image_url:a["string"],html_url:a["string"].isRequired})}}])

//# sourceMappingURL=43-c-498e756d70.js.map