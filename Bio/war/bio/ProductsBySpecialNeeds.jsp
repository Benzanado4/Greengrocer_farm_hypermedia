<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head><link rel= "stylesheet" href="../css/sfondo1.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>bio ProdottiperCategoria</title>
</head>
<body>

<c:forEach var="e" items="${Prodotti}">
<a href="/bio/Prodotto?${f:h(e.key)}">${f:h(e.nome)}</a>
</c:forEach>


</body>
</html>
