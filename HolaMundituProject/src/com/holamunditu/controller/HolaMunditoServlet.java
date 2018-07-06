package com.holamunditu.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.holamunditu.model.*;
/**
 * Servlet implementation class HolaMunditoServlet
 */
@WebServlet("/HolaMunditoServlet")
public class HolaMunditoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HolaMunditoServlet() {
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
		String sTesto = request.getParameter("txtTest1");
		String sTesto2 = request.getParameter("txtTest2");
		
		response.getWriter().write("<html>");
		response.getWriter().write("<header>");
		response.getWriter().write("</header>");
		response.getWriter().write("<body>");
		response.getWriter().write("<h1>Respuesta Del Servidor</h1>");
		response.getWriter().write("<p>"+"Primer Testo: "+sTesto+"</p>");
		response.getWriter().write("<p>"+"Segundo Testo: "+sTesto2+"</p>");
		HolaMunditu objHolaMunditu = new HolaMunditu();
		response.getWriter().write("<p>"+"Mi Mensajitu es "+ objHolaMunditu.diHolaMunditu()+"</p>");
		response.getWriter().write("</body>");
		response.getWriter().write("</html>");

	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doHead(HttpServletRequest, HttpServletResponse)
	 */
	protected void doHead(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
