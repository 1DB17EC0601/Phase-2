package com.validation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//add the html tags
		response.setContentType("text/html");
		
		//get the writer
		PrintWriter out=response.getWriter();
		
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		
		//get the session object
		
		HttpSession session = request.getSession();
		
		//validate the user by checking the inputs
		
	    if(user.trim().equalsIgnoreCase("mallappa") && pass.trim().equals("malps@123"))
	    {
	    	session.setAttribute("username", user);
	    	session.setAttribute("password", pass);
	    	
	    	//redirect to dashboard
	    	response.sendRedirect("dashboard");
	    	
	    }
	    
	    else {
	    	
	    	out.print("<h2> <span style=color:red>Invalid Credentials....!</span><h3>");
	    	RequestDispatcher dispatcher =request.getRequestDispatcher("index.html");
	    	dispatcher.include(request, response);
	    }
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
