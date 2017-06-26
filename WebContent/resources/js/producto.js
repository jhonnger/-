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

$(".editBien").on("click",function(e){
	e.preventDefault();
	/*$("#deleteCategoriaConfirm").modal('open');
	$("#categoria-desc").html($(e.target).attr("dataExtra"));*/
	
	var url = $(e.target).attr("href");
	var cod = $(e.target).attr("cod");
	var des = $(e.target).attr("desc");
	var unidades = $(e.target).attr("unidades");
	var precio = $(e.target).attr("precio");
	
	$("#modificar_bien").modal('open');
	
	$("#codigo_edit").val(cod);
	$("#descripcion_edit").val(des);
	$("#unidades_edit").val(unidades);
	$("#precio_edit").val(precio);
	
	$("#modBien").attr("cod",cod);
	
	Materialize.updateTextFields();
	
	
	
});

$("#modBienForm").on("submit",function(e) {
	e.preventDefault();
	$.post("modificarBien",$("#modBienForm").serialize(),function(data){
		if(data){
			$("#modificar_bien").modal('close');
			location.reload(true);
		}
	});
})
