package com.embaudrit.simpleproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String favLanguage = request.getParameter("language");
		String homeTown = request.getParameter("homeTown");
		//Change response (as per the Coding Dojo Servlets video)
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome, Coding Dojo</h1>");
		
		if (request.getParameter("language")!= null) {
			out.write("<h3>Your favourite language is: "+favLanguage+".</h3>");
		}
		else {
			out.write("<h3>Your favourite Language is unknown</h3>");
		}
		
		if (request.getParameter("homeTown")!= null) {
			out.write("<h3>Your Hometown is: "+homeTown+".</h3>");
		}
		else {
			out.write("<h3>Your Hometown is unknown</h3>");
		}
	}
		
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
