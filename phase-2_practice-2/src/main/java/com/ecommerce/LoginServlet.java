package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String url="jdbc:mysql://localhost:3306/ecommerce";
		String uname="root";
		String pass="Mallappa@1";
		
		response.setContentType("text/html");
		
		String pId = request.getParameter("pid");
	
		PrintWriter out = response.getWriter();
		
		String query="select * from eproduct where pid=?";
		out.print("<h2>Displaying the Product Details based on product ID</h2>");
		out.print("<table border='1'><tr><th>Product Id</th><th>Product Name</th><th>Product Price</th><th>Product color</th></tr>");
		
		try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection dbCon = DriverManager.getConnection(url, uname, pass);
	      PreparedStatement st=  dbCon.prepareStatement(query);
	      
	      st.setString(1, pId);
	      
	      ResultSet rs =st.executeQuery();
	      
	      while(rs.next()) {
	    	  
	    	  out.print("<tr><td>");
	    	  out.println(rs.getInt("pid"));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getString("pname"));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getBigDecimal("pprice"));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(rs.getString("pcolor"));
	    	  out.print("</td>");
	    	  out.print("</tr>");
	    
	    	  
			}
	      
		}
		catch(ClassNotFoundException | SQLException e){
			
			System.out.println("Some Issue : "+ e.getMessage());
			
			
		}
		
		out.print("</table>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
