$('.add-bien').click(function(e){
	e.preventDefault();
	$('#modal').modal();
});

$("#agregar").click(function(e) {
	$.post( "add-bien.jsp", $( "#addForm" ).serialize(), function( data ) {
       
       
    }, "json");
});