<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head>
<link rel= "stylesheet" href="../css/sfondo.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Index</title>
</head>
<body><div id="frutta"></div>
<div id="menu">
  <ul id="menuNav">
    <li><a href="index">Home</a></li>
    <li><a href="inserisciproduttore">Inserisci produttore</a></li>
    <li><a href="#">Registrati</a></li>
  </ul>
</div>

<div id="dcontent">
  <div id="dmenus">
    <ul id="menus">
      <li><a href="tuttiiproduttori">Produttori Bio</a></li>
      <li><a href="#">Offerte</a></li>
      <li><a href="#">Servizio</a></li>
      <li><a href="#">Ricette</a></li>
      <li><a href="#">Diete</a></li>
      <li><a href="#">Consorzio</a></li>
    </ul>
  </div>

<div id="ins" style="width: 200px; float: left;">
<br></br>
  <div id="dtesto1">
        <h1>Inserisci Necessità:</h1>

<form method="post" action="AllSpecialNeeds">
<textarea name="Nome"></textarea><br />
<input type="submit" value="Inserisci"/>
</form>
 <div id="dprodotto">
 <fieldset id="dprod">
 <legend>Prodotto</legend>
 <a href="#">Tutti i prodotti</a><br>
 <a href="#">Generi alimentari</a><br>
<a href="#"> Bisogni speciali</a><br>
 </fieldset>
 </div>
</body>
</html>
