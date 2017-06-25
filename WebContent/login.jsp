<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% if(session.getAttribute("user")!=null){
		response.sendRedirect("index.jsp");
	}
	%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<link href="resources/css/materialize.min.css" rel="stylesheet" type="text/css">
<link href="resources/css/styles.css" rel="stylesheet" type="text/css">

<title>Iniciar Sesion</title>
</head>
<body class="cyan">

	<div id="login-page" class="row">
	    <div class="col s12 z-depth-4 card-panel">
	      <form id="logForm" class="login-form" action="login" method="post">
	        <div class="row">
	          <div class="input-field col s12 center">
	          	<h4>Iniciar Sesion</h4>
	            <p class="center login-form-text">Inicia sesión para continuar...</p>
	          </div>
	        </div>
	        <div class="row margin">
	          <div class="input-field col s12">
	            <i class="material-icons prefix">person_outline</i>
	            <input name="user" id="username" type="text">
	            <label for="username" class="center-align">Usuario</label>
	          </div>
	        </div>
	        <div class="row margin">
	          <div class="input-field col s12">
	            <i class="material-icons prefix">lock_outline</i>
	            <input name="pass" id="passwordLog" type="password">
	            <label for="password">Contraseña</label>
	          </div>
	        </div>
	        <div class="row">          
	          <div class="input-field col s12 m12 l12  login-text">
	              <input type="checkbox" id="remember-me" />
	              <label for="remember-me">Recuerdame</label>
	          </div>
	        </div>
	        <div class="row">
	          <div class="input-field col s12">
	            <input id="login_act" type="submit" value="Login" class="btn waves-effect waves-light col s12 " />
	          </div>
	        </div>
	        <div class="row">
	          <div class="input-field col s6 m6 l6">
	            <p class="margin medium-small"><a id="signup" href="page-register.html">Registrar ahora!</a></p>
	          </div>
	          <div class="input-field col s6 m6 l6">
	              <p class="margin right-align medium-small"><a href="page-forgot-password.html">Olvidó su contraseña ?</a></p>
	          </div>          
	        </div>
	
	      </form>
	    </div>
  	</div>
	<div id="second">
		<div class="col s12 z-depth-4 card-panel">
	      <form id="reg-form" class="reg-form" action="uno" method="post">
	        <div class="row">
	          <div class="input-field col s12 center">
	          	<h4>Registro</h4>
	            <p class="center login-form-text">Unete a la comunidad!</p>
	          </div>
	        </div>
	        <div class="row margin">
	          <div class="input-field col s12">
	            <i class="material-icons prefix">person_outline</i>
	            <input name="user_reg" id="username_reg" type="text" required>
	            <label for="username_reg" class="center-align">Usuario</label>
	          </div>
	        </div>
	        <div class="row margin">
	          <div class="input-field col s12">
	            <i class="material-icons prefix">lock_outline</i>
	            <input name="pass_reg" id="password_reg" type="password" required>
	            <label for="password_reg">Contraseña</label>
	          </div>
	        </div>
	        <div class="row margin">
	          <div class="input-field col s12">
	            <i class="material-icons prefix">lock_outline</i>
	            <input  id="password_conf" type="password" required>
	            <label for="password_conf">Confirme contraseña</label>
	          </div>
	        </div>

	        <div class="row">
	          <div class="input-field col s12">
	            <input type="submit" value="Registrar" class="btn waves-effect waves-light col s12 " />
	          </div>
	          <div class="input-field col s12">
            	<p class="margin center medium-small sign-up">Ya tienes una cuenta? <a id="login" href="page-login.html">Logueate!</a></p>
          		</div>
	        </div>
	       
	
	      </form>
	    </div>
	</div>
	<script type="text/javascript" src="resources/js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="resources/js/materialize.min.js"></script>
	<script type="text/javascript" src="resources/js/app.js"></script>
	<script type="text/javascript" src="resources/js/account.js"></script>
</body>
</html>