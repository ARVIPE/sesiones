<%@page import="controladores.crearEstudiante"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Datos.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
    </head>
    <body>
        <%
            if (session.getAttribute("logueado") == null) {
                response.sendRedirect("index.jsp");
            } else {
                ArrayList<Persona> estudiantes = crearEstudiante.leerFichero("C:\\Users\\arvip\\Desktop\\estudiantes.dat");
                if (estudiantes != null) {
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Apellidos</th>
                    <th>Fecha de nac</th>
                    <th>Carrera</th>
                    <th>Semestre</td>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (Persona estudiante : estudiantes) {
                        out.println("<tr>");
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
        <%
                }
            }
        %>
    </body>
</html>