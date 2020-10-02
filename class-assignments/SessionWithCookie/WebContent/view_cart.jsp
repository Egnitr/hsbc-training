<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Store Front</title>
</head>
<body>
	<h1>Cart Items</h1><hr>
	<h4>Cart Items will appear here</h4>
	<% Cookie[] cookies=request.getCookies();
	if(cookies!=null){%>
		<table>
			<tr><td>Item</td><td>Price</td></tr>
		</table>
	<% for(Cookie c:cookies){  %>
		<table>
			<tr><td><%=c.getName() %></td><td><%=c.getValue() %></td></tr>
		</table>
		<%}
	}%>
</body>
</html>