package pe.gob.pnp.ig.unitic.informatica.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/odturno")
public class OdturnoController {
	
	
	@RequestMapping("/registros")
	public String registros(Model model) {
		model.addAttribute("titulopagina", "Registros OD Turno - SIGEPAD IG PNP");
		model.addAttribute("active","odtregistros");
		return "sigepad_odturno/registros";
	}
	@RequestMapping("/registros/nuevo")
	public String nuevoregistros(Model model) {
		model.addAttribute("titulopagina", "Nuevo Registro OD Turno - SIGEPAD IG PNP");
		model.addAttribute("active","odtregistros");
		return "sigepad_odturno/registro";
	}
	@RequestMapping("/jefatura")
	public String jefatura(Model model) {
		model.addAttribute("titulopagina", "Jefatura OD Turno - SIGEPAD IG PNP");
		model.addAttribute("active","odtjefatura");
		return "sigepad_odturno/jefatura";
	}
	
	@ModelAttribute
	public void addCommonAttributes(Model model) {
		model.addAttribute("apptitulo", "Oficina de Disciplina de Turno");
		model.addAttribute("apptituloicono", "fa-laptop");
		model.addAttribute("apptitulodescripcion", "Módulo de comunicaciones de inconductas funcional ");
	}
}
