package pe.gob.pnp.ig.unitic.informatica.app.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.gob.pnp.ig.unitic.informatica.app.service.IUnidadOrganicaService;

@Controller
@RequestMapping("dirinv")
public class DirinvController {

	private List<String[]> breadcrumbs;
	@Autowired
	private IUnidadOrganicaService unidadorganicaService;
	
	@RequestMapping("secretaria")
	public String secretaria(Model model) {
		breadcrumbs = new ArrayList<String[]>();
		breadcrumbs.add(new String[] {null,"Direccion de Investigaciones"});
		breadcrumbs.add(new String[] {null,"Secretaría"});
		model.addAttribute("claseicono","icofont-investigation");
		model.addAttribute("tituloprincipal","Direccion de Investigaciones - Secretaría");
		model.addAttribute("descripcionprincipal","Recepcion y Asignación de Investigaciones");
		model.addAttribute("active","secdirinv");
		model.addAttribute("breadcrumbs",breadcrumbs);
		model.addAttribute("titulotile","Designacion de Oficina de Disciplina");
		model.addAttribute("clasetile","icofont-share-alt");
		model.addAttribute("organosdisc",unidadorganicaService.findByTipounidad_id(2));
		return "dirinv/secretaria";
	}
}
