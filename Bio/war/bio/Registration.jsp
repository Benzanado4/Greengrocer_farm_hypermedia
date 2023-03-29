<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<link rel= "stylesheet" href="../css/sfondo1.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Registrazione</title>
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
      <li><a href="#">Prodotti</a></li>
      <li><a href="ElencoProduttori">Produttori Bio</a></li>
      <li><a href="#">Offerte</a></li>
      <li><a href="Servizio">Servizio</a></li>
      <li><a href="#">Ricette</a></li>
      <li><a href="#">Diete</a></li>
      <li><a href="Consorzio">Consorzio</a></li>
    </ul>
  </div>
<br></br>
<div id="reg" style="width: 150px; float: left;">
<form align="center" method="post" action="RegOk">
<fieldset>
	<legend>Dati Personali</legend>
Nome
<input type="text" name="nome"><br>
Cognome
<input type="text" name="cognome"><br>
Provincia
<input type="text" name="provincia"><br>
Citta'
<input type="text" name="citta"><br>
Telefono
<input type="text" name="tel"><br>
Privato o azienda?<br>
<input type="radio" name="radio" value="privato">Privato
<input type="radio" name="radio" value="azienda">Azienda
</fieldset>
<br></br>
<input type="submit" name="invia" value="Invia">
</form>
</div>
</body>
</html>
