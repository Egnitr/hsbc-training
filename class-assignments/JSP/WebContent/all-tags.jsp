<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
  <%@ page import="java.util.Date, java.util.ArrayList"; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All tags here</title>
</head>
<body>
<%--Declaration tag puts code outside _jspService() --%>
<%!String fname="Shubhi";
String lname="Rajput";
public String concat(String s1,String s2)
{
return s1+" "+s2;	
}


%>
<%--Expression tag puts code inside out.print() in _jspService() --%>


<%=(fname+" "+lname) %>
<%=concat("Ayush","Rajput") %>
<%--Scriplets put code as such inside _jspService() --%>
<%

out.print(fname+" "+lname);
ArrayList<String> a= new ArrayList<>();

%>
</body>
</html>