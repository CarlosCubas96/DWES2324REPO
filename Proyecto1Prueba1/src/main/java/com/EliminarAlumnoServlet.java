package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class EliminarAlumnoServlet
 */
@WebServlet("/eliminar-alumno")
public class EliminarAlumnoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Obtener el ID del alumno a eliminar desde los parámetros de la solicitud
		int id = Integer.parseInt(request.getParameter("id"));

		// Realizar eliminación en la base de datos (debe implementarse en ConexionDB)

		// Redirigir o mostrar un mensaje de éxito
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Alumno eliminado exitosamente</h1>");
		out.println("<a href='/ProyectoPrueba1/lista-alumnos'>Ver lista de alumnos</a>");
		out.println("</body></html>");
	}
}
