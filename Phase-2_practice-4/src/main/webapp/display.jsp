<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
    <h3>Displaying the Product Details.....!</h3>
    <hr>
    
    <%="Entered Product ID is: "+ session.getAttribute("pid") %> <br><br>
    
     <%="Entered Product NAME is: "+ session.getAttribute("pname") %> <br><br>
     
      <%="Entered Product PRICE is: "+ session.getAttribute("pprice") %> 
      <hr>
      
     <h3>Want to add another product and display it?</h3> <a href="form.jsp">Click HERE...!</a>
      
      <hr>
    
    
</body>
</html>