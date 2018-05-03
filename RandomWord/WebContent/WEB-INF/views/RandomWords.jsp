<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Random Word Generator</title>
	</head>
	<body>
		<h2> You have generated a word <c:out value="${count}" /> times </h2>
		
		<h2>	TEXTBOX SHOWING THE RANDOM WORD CREATED	</h2>
		<br>
		<br>
		<form action = "/RandomWords" method = "get">
			<input type = "submit" value = "Generate">
		</form>
		<br>
		<br>
		<h2>The last time you generated a word was: </h2>
		<br>
		<h2><c:out value="${prevDate}"/></h2>
	</body>
</html>