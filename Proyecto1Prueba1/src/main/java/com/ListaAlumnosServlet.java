package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.controller.ControllerInstituto;
import com.model.Alumno;

/**
 * Servlet implementation class ListaAlumnosServlet
 */
@WebServlet("/lista-alumnos")
public class ListaAlumnosServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Obtener la lista de alumnos desde la base de datos (debe implementarse en
		// ConexionDB)
		// TODO

		ControllerInstituto datos = new ControllerInstituto();
		List<Alumno> listaAlumnos = datos.getListNombresAlumnos();

		// Generar contenido HTML para mostrar la lista
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Lista de Alumnos</h1>");
		out.println("<table>");
		out.println("<tr><th>ID</th><th>Nombre</th><th>Apellido</th><th>Edad</th><th>DNI</th><th>Curso</th></tr>");

		// Recorrer la lista de alumnos y agregar filas a la tabla
		for (Alumno alumno : listaAlumnos) {
			out.println("<tr>");
			out.println("<td>" + alumno.getID() + "</td>");
			out.println("<td>" + alumno.getNombre() + "</td>");
			out.println("<td>" + alumno.getApellido() + "</td>");
			out.println("<td>" + alumno.getEdad() + "</td>");
			out.println("<td>" + alumno.getDNI() + "</td>");
			out.println("<td>" + alumno.getCurso() + "</td>");
			out.println("</tr>");
		}

		out.println("</table>");
		out.println("<a href='/Proyecto1Prueba1/crear-alumno'>Crear Alumno</a>");
		out.println("</body></html>");
	}
}
