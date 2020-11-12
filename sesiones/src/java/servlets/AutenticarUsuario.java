package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Datos.Persona;
import controladores.crearEstudiante;
import Datos.Administrador;


/**
 * Servlet implementation class AutenticarUsuario
 */
@WebServlet("/AutenticarUsuario")
public class AutenticarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AutenticarUsuario() {
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
		Boolean logueado = false;
		Boolean administrador = false;
		Boolean normal = false;
                
		String fichero = "C:\\Users\\arvip\\Desktop\\estudiantes.dat";
		String ficheroAdmin = "C:\\Users\\arvip\\Desktop\\admin.dat";

		ArrayList<Persona> estudiantes = crearEstudiante.leerFichero(fichero);
		ArrayList<Administrador> administradores = crearEstudiante.leerFicheroAdmin(ficheroAdmin);

		for (Persona estudiante : estudiantes) {
			if (estudiante.getNombre().equals(request.getParameter("nombre")) && estudiante.getPassword().equals(request.getParameter("pass"))) {
				logueado = true;
				//response.sendRedirect("vistaLogueo.jsp");
				normal = true;
			}
				

		}

		for (Administrador admi : administradores) {
			if (admi.getNombre().equals(request.getParameter("nombre")) && admi.getPass().equals(request.getParameter("pass"))) {
				logueado = true;
				administrador = true;
				//response.sendRedirect("vistaAdministrador.jsp");
				
			}
		}
		if (!logueado) {
			response.sendRedirect("index.jsp");

		}

		else if(administrador == true){
			request.getSession().setAttribute("logueado", request.getParameter("nombre"));
			response.sendRedirect("listaAdministrador.jsp");
			 
				
		}else if(normal == true) {
			request.getSession().setAttribute("logueado", request.getParameter("nombre"));
			response.sendRedirect("lista.jsp");
			}
		
	}
}
