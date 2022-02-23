package com.validation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

		/**
		 * Servlet implementation class dashboard
		 */
		@WebServlet("/dashboard")
		public class dashboard extends HttpServlet {
			private static final long serialVersionUID = 1L;
		       
		   
			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     
				response.setContentType("text/html");
				
				
			    PrintWriter out=response.getWriter();
			    
			    HttpSession session = request.getSession();
			  
		
			    	out.print("<h3> welcome " +session.getAttribute("username") +" </h3> </br>");
			    	out.print("now your are logged in <br>");
			    	
			    	out.print("<h4><a href='logout'>LOGOUT</a><h4>");
			  
			
			}
			
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
