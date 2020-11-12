<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/sesiones/AutenticarUsuario" method="post">
	<input type="text" name="nombre" placeholder="Introduzca usuario">
	<input type="password" name="pass" placeholder="Introduzca contraseña">
	<button type="submit">Entrar</button>
</form>
</body>
</html>