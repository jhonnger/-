$("#signup").click(function(e) {
	e.preventDefault();
	$("#login-page").slideUp("slow", function() {
		$("#second").slideDown("slow");
	});
});

$("#login").click(function(e) {
	e.preventDefault();
	$("#second").slideUp("slow", function() {
		$("#login-page").slideDown("slow");
	});
});

$("#logForm").on("submit",function(e) {
	e.preventDefault();
	$.post( "login", $( "#logForm" ).serialize(), function( data ) {
	
       if(!data){
    	   alert("Error");
       }else{
    	   location.href="index.jsp";
       }
       
    }, "json");
});

$("#reg-form").on("submit",function(e) {
	e.preventDefault();
	var password = document.getElementById("password_reg")
	, confirm_password = document.getElementById("password_conf");

	function validatePassword(){
	if(password.value != confirm_password.value) {
	  confirm_password.setCustomValidity("Contraseña no coincide");
	} else {
	  confirm_password.setCustomValidity('');
	  $.post( "register", $( "#reg-form" ).serialize(), function( data ) {
		  if(!data){
	    	   alert("Error");
	       }else{
	    	   location.href="index.jsp";
	       }
	       
	    }, "json");
	}
	}

	password.onchange = validatePassword;
	confirm_password.onkeyup = validatePassword;	
	
});