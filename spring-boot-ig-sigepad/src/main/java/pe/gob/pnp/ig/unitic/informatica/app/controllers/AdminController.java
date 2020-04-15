package pe.gob.pnp.ig.unitic.informatica.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.gob.pnp.ig.unitic.informatica.app.service.IUsuarioService;

@Controller
@RequestMapping("/administrador")
public class AdminController {

	@Autowired
	private IUsuarioService usuarioService;
	private List<String[]> breadcrumbs;
	
	@RequestMapping({"/",""})
	public String administrator(Model model) {
		breadcrumbs = new ArrayList<String[]>();
		breadcrumbs.add(new String[] {null,"Inicio"});
		model.addAttribute("claseicono","fa fa-dashboard");
		model.addAttribute("tituloprincipal","Panel de Gestion y Resumen");
		model.addAttribute("descripcionprincipal","Gestión de usuarios, Tablas maestras y otros");
		model.addAttribute("active","resumen");
		model.addAttribute("breadcrumbs",breadcrumbs);
		return "administrador/index";
	}
	
	@RequestMapping({"/usuarios"})
	public String usuarios(Model model) {
		breadcrumbs = new ArrayList<String[]>();
		breadcrumbs.add(new String[] {null,"Inicio"});
		model.addAttribute("claseicono","fa fa-dashboard");
		model.addAttribute("tituloprincipal","Gestion y Usuarios");
		model.addAttribute("descripcionprincipal","Creacion, modificacio y auditoria de usuarios");
		model.addAttribute("active","usuarios");
		model.addAttribute("breadcrumbs",breadcrumbs);
		model.addAttribute("usuarios",usuarioService.findAll());
		return "administrador/usuarios";
	}
}
