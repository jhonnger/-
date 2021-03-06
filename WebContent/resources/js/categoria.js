;

$('.add-categoria').click(function(e){
	e.preventDefault();
	$('#modal-categoria').modal();
});

$("#addFormCategoria").on("submit",function(e){
	e.preventDefault();
	$.post("addCategoria",$("#addFormCategoria").serialize(),function(data){
		if(data){
			$("#modalCategoria").modal('close');
			location.reload(true);
		}
	});
});

$(".deleteItem").on("click",function(e){
	e.preventDefault();
	/*$("#deleteCategoriaConfirm").modal('open');
	$("#categoria-desc").html($(e.target).attr("dataExtra"));*/
	
	var url = $(e.target).attr("href");
	
	showDialogConfirm(" Esta seguro de eliminar la categoria "+$(e.target).attr("desc")+"?", function() {
		$.get(url,null,function(data){
			if(data){
				$("#modalCategoria").modal('close');
				location.reload(true);
			}
		});
	})
});

$(".editCategoria").on("click",function(e){
	e.preventDefault();
	/*$("#deleteCategoriaConfirm").modal('open');
	$("#categoria-desc").html($(e.target).attr("dataExtra"));*/
	
	var url = $(e.target).attr("href");
	var cod = $(e.target).attr("cod");
	var des = $(e.target).attr("desc");
	var correl = $(e.target).attr("correl");
	var params = {"cod" : cod};
	$.post("checkBlockCategoria",params, function(data){
		
		var params = data.split(/;/);
		console.log(params[0]);
		if(params[0]==0){
			$("#modificar_categoria").modal('open');
			$("#codigo_edit").val(cod);
			$("#descripcion_edit").val(des);
			
			$("#modCategoria").attr("cod",cod);
			Materialize.updateTextFields();
		}
		else if (params[0]==1){
			showMsg(params[1]);
		}
		else{
			
			
		}
	});
});

$("#modCategoriaForm").on("submit",function(e) {
	e.preventDefault();
	$.post("modificarCategoria",$("#modCategoriaForm").serialize(),function(data){
		if(data){
			$("#modificar_categoria").modal('close');
			location.reload(true);
		}
	});
})