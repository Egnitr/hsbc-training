<%@page import="org.eclipse.jdt.internal.compiler.ast.IfStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	
	String username=request.getParameter("name");
		String password=request.getParameter("password");
		if(username.equals(password)){
			%><jsp:forward page="success.jsp"/>
		<% }else{
			%><jsp:forward page="login.jsp"/>
			<%}
	%>
</body>
</html>