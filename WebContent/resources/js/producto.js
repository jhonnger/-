$('.add-bien').click(function(e){
	e.preventDefault();
	$('#modal-bien').modal();
});


$("#addForm").on("submit",function(e){
	e.preventDefault();
	$.post("addBien",$("#addForm").serialize(),function(data){
		if(data){
			$("#modalBien").modal('close');
			location.reload(true);
		}
	});
});
