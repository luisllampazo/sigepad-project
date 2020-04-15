$('#tablaregistros').on('click','.addht',function(){
	  $('#guardaht').attr('data-idreg',$(this).attr('data-idreg'));
	  $('#modalht').modal('show');
  });
  
  $('#fechaht').daterangepicker({
	    "singleDatePicker": true,
	    "showDropdowns": true,
	    "locale": {
	        "direction": "ltr",
	        "format": "DD/MM/YYYY",
	        "separator": " - ",
	        "applyLabel": "Seleccionar",
	        "cancelLabel": "Cancelar",
	        "fromLabel": "From",
	        "toLabel": "To",
	        "customRangeLabel": "Custom",
	        "daysOfWeek": [
	            "Do",
	            "Lu",
	            "Ma",
	            "Mi",
	            "Ju",
	            "Vi",
	            "Sa"
	        ],
	        "monthNames": [
	            "Enero",
	            "Febrero",
	            "Marzo",
	            "Abril",
	            "Mayo",
	            "Junio",
	            "Julio",
	            "Agosto",
	            "Septiembre",
	            "Octubre",
	            "Noviembre",
	            "Diciembre"
	        ],
	        "firstDay": 1
	    }
	});
  
  $('#guardaht').on('click',function(){
	  $.post('/restutil/asignahtregular', { numero:$('#nroht').val(), fecha:$('#fechaht').val(), idreg: $(this).attr('data-idreg')} ).done(function(data){
		  $('#modalht').modal('hide');
		  $('#buscaregistros').click();
	});
  });