<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "Entidades.Bien"%>
     <%@ page import = "Entidades.Categoria"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="checkSesion.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mantenimiento - Productos</title>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="resources/css/materialize.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:useBean id="BienDTO" class="modelo.BienDTO" scope="page" />
<%@include file="navBar.jsp" %>
<h1>Mantenimiento producto </h1>
	
	<a class="waves-effect waves-light btn"  href="#modal">Agregar Producto</a>
	<br><br>
	<div id="modalj" class="modal modal-fixed-footer">
	    <div class="modal-content">
	      <h4>Modal Header</h4>
	      <p>A bunch of text</p>
	    </div>
	    <div class="modal-footer">
	      <a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat">Agree</a>
	    </div>
    </div>
	<table border="1">
  		<TR>
           <TH>ID</TH>
           <TH>Descripcion</TH>
           <th>Stock</th>
           <th>Precio</th>
        </TR>
		<%
			for(Bien bien :BienDTO.listar() ){
				out.println("<tr>");
				out.println("<td>"+bien.getId()+"</td>");
				out.println("<td>"+bien.getDescripcion()+"</td>");
				out.println("<td>"+bien.getUnidades()+"</td>");
				out.println("<td>"+bien.getPrecio()+"</td>");
				out.println("<td>"+"<a href='#'>Eliminar</a>"+"</td>");
				out.println("<td>"+"<a href='#'>Modificar</a>"+"</td>");
				out.println("</tr>");
			}
		%>
</table>

<%@include file="add-bien-modal.html" %>
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="resources/js/materialize.min.js"></script>
<script type="text/javascript" src="resources/js/app.js"></script>
<script type="text/javascript" src="resources/js/producto.js"></script>
</body>
</html>