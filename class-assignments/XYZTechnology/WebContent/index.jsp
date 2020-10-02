<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tech Support</title>
</head>
<body>
	<h1>Tech Support for XYZ Technologies</h1>
	<form action="Register" method="post">
		Mobile:<input type="text" name="mobile">
		Software:<input type="text" name="software">
		OS:<input type="text" name="os"><br>
		Problem:<textarea name="problem" style="margin:20px;padding:40px;"></textarea><br><hr>
		<input type="submit" value="Report Issue">
	</form>
</body>
</html>