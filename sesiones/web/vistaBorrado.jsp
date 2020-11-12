<%@page import="controladores.crearEstudiante"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Datos.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>logueo</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">



	<%
		if (session.getAttribute("logueado") == null) {

			response.sendRedirect("index.jsp");

		} else {

			ArrayList<Persona> estudiantes = crearEstudiante.leerFichero("C:\\Users\\arvip\\Desktop\\estudiantes.dat");

			if (estudiantes != null) {
	%>
	<div class="container">
		<h4 style="text-align: start">Listado de estudiantes</h4>
		<table border="1">
			<tr>
				<th>Id</th>
				<th>Nombre</th>
				<th>Apellidos</th>
				<th>Edad</th>
				<th>Carrera</th>
				<th>Semestre</th>
				<th>Email</th>
                        </tr>
		<tbody>
			<%
				for (Persona estudiante : estudiantes) {
							out.println("<tr>");
							out.println("<td>" + estudiante.getId() + "</td>");
							out.println("<td>" + estudiante.getNombre() + "</td>");
							out.println("<td>" + estudiante.getApellido() + "</td>");
							out.println("<td>" + estudiante.getEdad() + "</td>");
							out.println("<td>" + estudiante.getCarrera() + "</td>");
							out.println("<td>" + estudiante.getSemestre() + "</td>");
							out.println("<td>" + estudiante.getEmail() + "</td>");
							out.println("</tr>");
						}
			%>
		</tbody>
	</table>
	<br>
	<form action="/sesiones/ServletBorrar" method="post">
	
	Introduce el ID del estudiante que quieres borrar: <input type="text" name="idBorrar">
	<input type="submit" name="eliminar1" value="Eliminar">
	
	</form>
	<br>
	<form action="index.jsp" method="post">
	
	<input type="submit" name=""  value="Volver al inicio">
	
	</form>


	<%
	
		}
	}
	
	%>
</body>

</body>
</html>