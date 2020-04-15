package pe.gob.pnp.ig.unitic.informatica.app.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("secretaria")
public class SecretariaController {
	private List<String[]> breadcrumbs;

	@RequestMapping("utd")
	public String unidadtramitedoc(Model model) {
		breadcrumbs = new ArrayList<String[]>();
		breadcrumbs.add(new String[] {null,"Secretaría"});
		breadcrumbs.add(new String[] {null,"Unidad de Trámite Documentario"});
		model.addAttribute("claseicono","fa fa-files-o");
		model.addAttribute("tituloprincipal","Secretaría - Unidad de Trámite Documentario");
		model.addAttribute("descripcionprincipal","Asignacion de Hoja de Trámite SIGE");
		model.addAttribute("active","tramite");
		model.addAttribute("breadcrumbs",breadcrumbs);
		model.addAttribute("titulotile","Registro de Hojas de Trámite SIGE");
		model.addAttribute("clasetile","icofont-prescription");
		
		return "secretaria/utd";
	}
}
