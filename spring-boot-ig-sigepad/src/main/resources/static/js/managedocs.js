$('#tablaregistros').on('click','.recibedoc',function(){
	  var idreg= $(this).attr('data-idreg');
	 	swal({
  		title: "Esta seguro que desea recibir el documento? ",
  		text: "Verifique que posee físicamente el documento!",
  		type: "info",
  		showCancelButton: true,
  		confirmButtonText: "Si, recibir!",
  		cancelButtonText: "No, cancelar operacion!",
  		closeOnConfirm: false,
  		closeOnCancel: false
  	}, function(isConfirm) {
  		if (isConfirm) {
  			recibedocumento(idreg);
  			swal("Recibido!", "Puede visualizar el documento en la seccion RECIBIDOS.", "success");
  			$('#buscaregistros').click();
  		} else {
  			swal("Cancelada", "La operacion fue cancelada", "error");
  		}
  	});
  });
