package servlets;

import Datos.Administrador;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Datos.Persona;
import controladores.crearEstudiante;

/**
 * Servlet implementation class GuardarEstudiante
 */
@WebServlet("/GuardarEstudiante")
public class GuardarEstudiante extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuardarEstudiante() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String boton = request.getParameter("nuevo");
		String ficheroAdmin = "C:\\Users\\arvip\\Desktop\\admin.dat";
		ArrayList<Administrador> administradores = crearEstudiante.leerFicheroAdmin(ficheroAdmin);
		
		for(Administrador ad : administradores) {
			
			if(boton != null && ad.getNombre().equals("admin")) {
				
				String fichero = "C:\\Users\\arvip\\Desktop\\estudiantes.dat";
				ArrayList<Persona> estudiantes = crearEstudiante.leerFichero(fichero);
				
				String id = request.getParameter("id");
				String nombre = request.getParameter("nombre");
				String apellido = request.getParameter("apellidos");
				String edad = request.getParameter("fecha_nac");
				String carrera = request.getParameter("carrera");
				String semestre = request.getParameter("semestre");
				String email = request.getParameter("email");
				String pass = request.getParameter("passNuevo");
				
				Persona p = new Persona(id, nombre, apellido, carrera, semestre, email, edad, pass);
				
				estudiantes.add(p);
				
				crearEstudiante.guardarArrayList(estudiantes, fichero);
				
				response.sendRedirect("listaAdministrador.jsp");
			}
		}
        }
}