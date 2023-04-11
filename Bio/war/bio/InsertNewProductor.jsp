<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head><link rel= "stylesheet" href="../css/sfondo1.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Inserisci Produttore</title>
</head>
<body><div id="frutta"></div>
<div id="menu">
  <ul id="menuNav">
    <li><a href="Index">Home</a></li>
    <li><a href="InserisciProduttore">Inserisci produttore</a></li>
    <li><a href="Registrazione">Registrati</a></li>
  </ul>
</div>

<div id="dcontent">
  <div id="dmenus">
    <ul id="menus">
      <li><a href="ElencoProduttori">Produttori Bio</a></li>
      <li><a href="#">Offerte</a></li>
      <li><a href="Servizio">Servizio</a></li>
      <li><a href="#">Ricette</a></li>
      <li><a href="#">Diete</a></li>
      <li><a href="Consorzio">Consorzio</a></li>
    </ul>
  </div>
               <div id="dprodotto">
 <fieldset id="dprod">
 <legend>Prodotto</legend>
 <a href="#">Tutti i prodotti</a><br>
 <a href="#">Generi alimentari</a><br>
<a href="#"> Bisogni speciali</a><br>
 </fieldset>
 </div>

<div id="ins" style="width: 200px; float: left;">
<br></br>


<form method="post" action="tuttiproduttori">
<fieldset>
        <legend>Dati produttore</legend>
Nome del produttore
<input type="text" name="Nome" /><br>
Regione:<br>
<select name="Regione">
<option value="abruzzo">Abruzzo</option>
<option value="basilicata">Basilicata</option>
<option value="calabria">Calabria</option>
<option value="campania">Campania</option>
<option value="emilia">Emilia</option>
<option value="friuli">Friuli</option>
<option value="lazio">Lazio</option>
<option value="liguria">Liguria</option>
<option value="lombardia">Lombardia</option>
<option value="marche">Marche</option>
<option value="molise">Molise</option>
<option value="piemonte">Piemonte</option>
<option value="puglia">Puglia</option>
<option value="sardegna">Sardegna</option>
<option value="sicilia">Sicilia</option>
<option value="toscana">Toscana</option>
<option value="trentino">Trentino</option>
<option value="umbria">Umbria</option>
<option value="valle">Valle D'Aosta</option>
<option value="veneto">Veneto</option>
</select><br>
Breve descrizione:  
<textarea name="Descrizione" rows="5 cols="30"/></textarea><br>
Foto produttore:
<input type="file" name="immagine" /><br>
</fieldset>
<input type="submit" value="Inserisci"/>
</div>
</form>
</div>
</body>
</html>