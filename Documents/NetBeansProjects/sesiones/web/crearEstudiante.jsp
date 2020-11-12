<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/sesiones/GuardarEstudiante" method="post">
                id: <input type="text" name="id"><br><br>
		nombre: <input type="text" name="nombre"><br><br>
		apellidos: <input type="text" name="apellidos"><br><br>
		fecha_nac: <input type="text" name="fecha_nac"><br><br>
		carrera: <input type="text" name="carrera"><br><br>
                semestre: <input type="text" name="semestre"><br><br>
                email: <input type="text" name="email"><br><br>
		password: <input type="password" name="pass"><br><br>
		<button type="submit" name="nuevo">Nuevo estudiante</button>
	</form>
</body>
</html>