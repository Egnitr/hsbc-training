<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>New User Registered</h2>
	<% Cookie[] cookies=request.getCookies();
	if(cookies!=null){%>
		<table>
			<tr><td>User Mobile</td><td>Problem</td></tr>
	<% for(Cookie c:cookies){  %>
			<tr><td><%=c.getName() %></td><td><%=c.getValue() %></td></tr>
		</table>
		<%}
	}%>
</body>
</html>