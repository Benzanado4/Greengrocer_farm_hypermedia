<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>

<html>
<head><link rel= "stylesheet" href="../css/sfondo1.css" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Login</title>
</head>
<body>
<form method="post" action="ScegliOfferta" style="width: 150px; float: left;">
<fieldset>
<legend>Inserisci user e pass</legend>
<div>
<label for="user">Nome Utente</label>
   <input id="user" name="user">
             </div>
<div>
<label for="pass">Password</label>
   <input id="user" name="user">
             </div>
</fieldset>
       
<div class="form-button">
            <input type="submit" id="go" value="Login">
        </div>
</body>
</html>
</body>
</html>
