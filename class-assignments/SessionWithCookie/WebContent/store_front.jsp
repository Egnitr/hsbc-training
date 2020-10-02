<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Store Front</title>
</head>
<body>
	<h1>Everyday Shopping Experience</h1><hr>
	<form action="ShoppingCart" method="post">
		Item Name:<input type="text" name="itemName">
		Item Price:<input type="text" name="itemPrice">
		<input type="submit" value="Add Item">	
	</form>
	<hr><a href="view_cart.jsp"><button>View Cart</button></a>
</body>
</html>