package pe.gob.pnp.ig.unitic.informatica.app.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {
	
	private List<String[]> breadcrumbs;
	
	@RequestMapping("/")
	public String index(Model model) {
		breadcrumbs = new ArrayList<String[]>();
		breadcrumbs.add(new String[] {null,"Inicio"});
		model.addAttribute("claseicono","fa fa-dashboard");
		model.addAttribute("tituloprincipal","Panel de Gestion y Resumen");
		model.addAttribute("descripcionprincipal","Resumen de los Procedimientos Administrativos Disciplinarios");
		model.addAttribute("active","resumen");
		model.addAttribute("breadcrumbs",breadcrumbs);
		return "index";
	}
}
