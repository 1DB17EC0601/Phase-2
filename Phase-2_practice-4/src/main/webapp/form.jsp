<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Enter the Product Details in the Below form</h2>
<hr>
<form action="ApplicationServlet" method="get">

<input type="text" name="productId"  placeholder="Enter the product ID"><br>
<input type="text" name="productName"  placeholder="Enter the product NAME"><br>
<input type="text" name="productPrice"  placeholder="Enter the product PRICE"><br>
<input type="submit" name="Enter">  <br>

</form>

</body>
</html>