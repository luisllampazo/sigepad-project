$('#fechadesde').val(moment().subtract(6, 'days').format('DD/MM/YYYY'));
  $('#fechahasta').val(moment().format('DD/MM/YYYY'));
  $('.rangofecha').daterangepicker({
	  "showDropdowns": true,
	    "ranges": {
	        "Hoy": [moment(), moment()],
	        "Ayer": [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
	        "Últimos 7 Días": [moment().subtract(6, 'days'), moment()],
	        "Últimos 30 Días": [moment().subtract(29, 'days'), moment()],
	        "Este Mes": [moment().startOf('month'), moment().endOf('month')],
	        "Ultimo Mes": [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
	    },
	    "locale": {
	        "direction": "ltr",
	        "format": "DD/MM/YYYY",
	        "separator": " - ",
	        "applyLabel": "Seleccionar",
	        "cancelLabel": "Cancelar",
	        "fromLabel": "Desde",
	        "toLabel": "Hasta",
	        "customRangeLabel": "Personalizado",
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
	    },
	    "alwaysShowCalendars": true,
	    "startDate": moment().subtract(6, 'days'),
	    "endDate": moment(),
	    "opens": "center"
	}, function(start, end, label) {
		$('#fechadesde').val(start.format('DD/MM/YYYY'));
		$('#fechahasta').val(end.format('DD/MM/YYYY'));
	});