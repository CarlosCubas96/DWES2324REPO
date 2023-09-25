package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SumaNumeros
 */
public class SumaNumeros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SumaNumeros() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Tipo de Contenido (HTML)
		response.setContentType("text/html");

		// Salida de la respuesta
		PrintWriter out = response.getWriter();

		// Se obtiene los parametros de entrada
		Integer num1 = Integer.parseInt(request.getParameter("numero1"));
		Integer num2 = Integer.parseInt(request.getParameter("numero2"));
		Integer resultado = num1 + num2;

		// Salida por pantalla
		out.print("Resultado de " + num1 + " + " + num2 + " = " + resultado);

		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
