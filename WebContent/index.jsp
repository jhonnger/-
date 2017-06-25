<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="checkSesion.jsp" %>
<title>Inicio </title>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="resources/css/materialize.min.css" rel="stylesheet" type="text/css">
</head>
<body>
	
	
	<%@include file="navBar.jsp" %>
	<h2>Inicio</h2>
	
	<ul>
		<li><a href="productos.jsp">Mantenimiento Productos</a></li>
		<li><a href="categorias.jsp">Mantenimiento Categorias</a></li>
	</ul>
	
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="resources/js/materialize.min.js"></script>
<script type="text/javascript" src="resources/js/app.js"></script>
</body>
</html>