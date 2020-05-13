package pe.gob.pnp.ig.unitic.informatica.app.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/od")
public class OdisciplinaController {
	
	@RequestMapping("/jefatura")
	public String jefatura(Model model) {
		model.addAttribute("titulopagina", "Investigaciones OD - SIGEPAD IG PNP");
		model.addAttribute("active","odjefatura");
		return "sigepad_od/jefatura";
	}
	
	@RequestMapping("/secretaria")
	public String secretaria(Model model) {
		model.addAttribute("titulopagina", "Expedientes OD - SIGEPAD IG PNP");
		model.addAttribute("active","odsecretaria");
		return "sigepad_od/secretaria";
	}
	
	@RequestMapping("/investigaciones")
	public String investigaciones(Model model) {
		model.addAttribute("titulopagina", "Investigaciones OD - SIGEPAD IG PNP");
		model.addAttribute("active","odinvestigaciones");
		return "sigepad_od/investigaciones";
	}
	
	@RequestMapping("/expedientes")
	public String expedientes(Model model) {
		model.addAttribute("titulopagina", "Expedientes OD - SIGEPAD IG PNP");
		model.addAttribute("active","odexpedientes");
		return "sigepad_od/expedientes";
	}
	
	@ModelAttribute
	public void addCommonAttributes(Model model,HttpSession session) {
		model.addAttribute("apptitulo", session.getAttribute("usuariounidad"));
		model.addAttribute("apptituloicono", "fa-folder-o");
		model.addAttribute("apptitulodescripcion", "Registro de Investigaciones y Expedientes Administrativos Disciplinarios");
	}
}
