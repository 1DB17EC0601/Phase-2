<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
       <br><center>
<a href=HomePage.jsp style="color:black; text-decoration:none; font-size:35px; font-weight:bold;">FlyAway</a>
</center>
<br><br>
<center>
<h2>User Login</h2>
<div style="border:2px solid black; width:25%; border-radius:10px; padding:20px" align="center">
<form action=UserLogin method=post>
<table>
<tr>
<td><label for=email>Email</label><br></td>
<td><input type="email" name=email id=email/></td>
</tr>
<tr>
<td><label for=pass>Password</label><br></td>
<td><input type="password" name=password id=pass/></td>
</tr>

<tr>
<td><input type=submit value=submit/></td>
<td><input type=reset/></td>
</tr>
</table>
	
</form>
</div>
</center>
<br><br>
<center>
<a>New User-Create account</a>
<h4><a href=UserRegistration.jsp style="font-size:25; color:red;">Create Account</a></h4>
</center>
<%
	String message=(String)session.getAttribute("message");
	if(message!=null){
%>
<p style="color:silver;"><%=message %></p>
<%
		session.setAttribute("message", null);
	}
%>
       
</body>
</html>