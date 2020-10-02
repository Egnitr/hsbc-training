<%@page import="java.util.Enumeration"%>
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
	<% if(session!=null){
		Enumeration<String> sessionEnum= session.getAttributeNames();%>
		<table>
			<tr><td>Item</td><td>Price</td></tr>
	<% 	while(sessionEnum.hasMoreElements()){ 
			String name=sessionEnum.nextElement();
		%>
			<tr><td><%=name %></td><td><%=(String)session.getAttribute(name) %></td></tr>
			</table>
		<%}
	}%>
</body>
</html>