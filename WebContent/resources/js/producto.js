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

$(".deleteItemProd").on("click",function(e){
	e.preventDefault();
	/*$("#deleteCategoriaConfirm").modal('open');
	$("#categoria-desc").html($(e.target).attr("dataExtra"));*/
	
	var url = $(e.target).attr("href");
	
	showDialogConfirm(" Esta seguro de eliminar el bien "+$(e.target).attr("desc")+"?", function() {
		$.get(url,null,function(data){
			if(data){
				$("#modalBien").modal('close');
				location.reload(true);
			}
		});
	})
});
