package com.baudrite.randomword.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RandomWord
 */
@WebServlet("/RandomWord")
public class RandomWord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomWord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		DateFormat df = new SimpleDateFormat("yyy/MM/dd - HH:mm:ss");
		Date dateobj = new Date();
		
		//The following is similar to the random word generator from the Puzzling exercise.
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String randomString = "";
		Random random = new Random();
        for (int i = 0; i<10; i++){
        	int randomIndex = random.nextInt(26);
        	randomString += alphabet.charAt(randomIndex);
        }
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/RandomWords.jsp");
		view.forward(request, response);
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
