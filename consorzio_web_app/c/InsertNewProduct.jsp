<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head><link rel= "stylesheet" href="../css/sfondo.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>bio Inserisciprodotti</title>
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
      <li><a href="Prodotti">Prodotti</a></li>
      <li><a href="ElencoProduttori">Produttori Bio</a></li>
      <li><a href="#">Offerte</a></li>
      <li><a href="Servizio">Servizio</a></li>
      <li><a href="#">Ricette</a></li>
      <li><a href="#">Diete</a></li>
      <li><a href="Consorzio">Consorzio</a></li>
    </ul>
  </div>
<div id="ins" style="width: 200px; float: left;">
<br></br>
  
<form method="post" action="tuttiprodotti">
<fieldset>
	<legend>Inserisci Prodotto</legend>
Nome Prodotto

<textarea name="Nome"></textarea><br />

<fieldset>
 <legend>Prodotto da </legend><br>
 
 <c:forEach var="e" items="${ProduttoreList}">
<input type="checkbox" name="options" value="${f:h(e.key)}"/>${f:h(e.nome)}<br />
</c:forEach>
  
</fieldset>


Breve descrizione del prodotto:  
<textarea name="Descrizione" rows="5 cols="30"/></textarea><br>

<fieldset>
 <legend>Stagione</legend><br>
 
<input type="radio" name="stagioni" value="frutta"/>frutta<br />
<input type="radio" name="stagioni" value="estate"/>verdura<br />
<input type="radio" name="stagioni" value="autunno"/>pasta e farine<br />

  
</fieldset>

<fieldset>
 <legend>Bisogni particolari:</legend><br>
 
 <c:forEach var="e" items="${CategorieList}">
<input type="checkbox" name="categorie" value="${f:h(e.key)}"/>${f:h(e.nome)}<br />
</c:forEach>
 
  
</fieldset>



<input type="submit" value="nuovo"/>
</form>


</body>
</html>
