<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="style.css">
		<title>Checker board</title>
	</head>
	<body id="wrapper">
		<h1>Checkerboard</h1>
		<br>
		<br>
		<% 
		int height = 2;
	   	int width = 2;
   		%>
   		
   		<%if (request.getParameter("height") != null && request.getParameter("width") != null) { %>
   			<%
	   		height = Integer.parseInt(request.getParameter("height"));
	   		width = Integer.parseInt(request.getParameter("width"));  	
	   		%>
	   		
			<%for (int x=0; x<height; x++) {%>
				<div id=row>
				<%for (int y=0; y<width; y++) {
				
					if (x%2 == 0) { 
				 		if (y%2 == 0) {%>
				 			<div class="purple"></div>
			 			<% } 
				 		else { %>
			 				<div class="pink"></div>
		 				<% } 			
	 				} 
	 				else { 
				 		if (y%2 == 0) {%>
				 			<div class="pink"></div>
			 			<% } 
				 		else { %>
			 				<div class="purple"></div>
		 				<% } 
	 				} 
 				}%> 
				</div>
			<%} 
		} %>
	</body>
</html>