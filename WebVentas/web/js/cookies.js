

document.getElementById("span_cookie_nom").innerHTML=getCookie("nombre_busqueda");

function getCookie(cname) {
  var name = cname + "=";
  var decodedCookie = decodeURIComponent(document.cookie);
  var ca = decodedCookie.split(';');
  for(var i = 0; i <ca.length; i++) {
    var c = ca[i].trim();
   // while (c.charAt(0) == ' ') {    //Mientras que la posicion 0 sea un espacio
   // c = c.substring(1);           //Quita los espacios
   //}
    if (c.indexOf(name) == 0) {
      return c.substring(name.length, c.length);
    }
  }
  return "";
}