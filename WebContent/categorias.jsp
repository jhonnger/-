<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

     <%@ page import = "Entidades.Categoria"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="checkSesion.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mantenimiento - Categorias</title>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="resources/css/materialize.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:useBean id="CategoriaDTO" class="modelo.CategoriaDTO" scope="page" />
<%@include file="navBar.jsp" %>
<h1>Mantenimiento Categorias </h1>
	
	<a class="waves-effect waves-light btn"  href="#modalCategoria">Agregar Categoria</a>
	<br><br>
	
	<table border="1">
  		<TR>
           <TH>Codigo</TH>
           <TH>Descripcion</TH>
           <th>Correlativo</th>       
        </TR>
		<%
			for(Categoria categoria :CategoriaDTO.listar() ){
				out.println("<tr>");
				out.println("<td>"+categoria.getId()+"</td>");
				out.println("<td>"+categoria.getDescripcion()+"</td>");
				out.println("<td>"+categoria.getCorrelativo()+"</td>");
				out.println("<td>"+"<a desc='"+categoria.getDescripcion()+"' class='deleteItem' href='eliminarCategoria?id="+categoria.getId()+"'>Eliminar</a>"+"</td>");
				out.println("<td>"+"<a cod='"+categoria.getId()+"' desc='"+categoria.getDescripcion()+"' correl='"+categoria.getCorrelativo()+"' class='editCategoria' href='editarCategoria'>Modificar</a>"+"</td>");
				out.println("</tr>");
			}
		%>
</table>

<%@include file="add-categoria-modal.html" %>
<%@include file="delete-categoria-confirm.html" %>
<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="resources/js/materialize.min.js"></script>
<script type="text/javascript" src="resources/js/app.js"></script>
<script type="text/javascript" src="resources/js/categoria.js"></script>
<script type="text/javascript" src="resources/js/utils.js"></script>
</body>
</html>