<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pets</title>
	</head>
	<body>
		<h1>Create a Dog</h1>
		<form action= "/Pets/Dogs" method = "post">
			<ul>
				<li>Name: <input type="text" name = "name"></li>
				<li>Breed: <input type = "text" name = "breed"></li>
				<li>Weight: <input type = "text" name = "weight"></li>
			</ul>
			<input type = "submit" value = "Create Dog">
		</form>
		<br>
		<br>
		<h1>Create a Cat</h1>
				<form action= "/Pets/Cats" method = "post">
			<ul>
				<li>Name: <input type="text" name = "name"></li>
				<li>Breed: <input type = "text" name = "breed"></li>
				<li>Weight: <input type = "text" name = "weight"></li>
			</ul>
			<input type = "submit" value = "Create Cat">
		</form>
	</body>
</html>