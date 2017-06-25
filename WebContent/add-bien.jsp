<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"
 import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-
		8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<jsp:useBean id="BienDTO" class="modelo.BienDTO" scope="page"></jsp:useBean>
		
		
		<%   String descripcion = request.getParameter("precio");
			 int cantidad       = Integer.parseInt( request.getParameter("cantidad"));
			 double precio		= Double.parseDouble(request.getParameter("precio"));
			 
			 boolean success = BienDTO.insertar(descripcion, cantidad, precio);
			 
			 if(success){
				 out.println("Añadido correctamente");
			 }
			 else{
				 out.println("Error al agregar prodcuto");
			 }
			 
		%>
		
	</body>
</html> 


