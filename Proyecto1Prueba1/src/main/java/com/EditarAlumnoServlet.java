package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EditarAlumnoServlet
 */
@WebServlet("/editar-alumno")
public class EditarAlumnoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Recopilar datos del formulario HTML
		int id = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		int edad = Integer.parseInt(request.getParameter("edad"));
		String dni = request.getParameter("dni");
		String curso = request.getParameter("curso");

		// Realizar actualización en la base de datos (debe implementarse en ConexionDB)

		// Redirigir o mostrar un mensaje de éxito
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Alumno actualizado exitosamente</h1>");
		out.println("<a href='/Proyecto1Prueba1/lista-alumnos'>Ver lista de alumnos</a>");
		out.println("</body></html>");
	}
}
