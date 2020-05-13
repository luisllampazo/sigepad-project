package pe.gob.pnp.ig.unitic.informatica.app.controllers;

//import java.util.ArrayList;
//import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class IndexController {
	
	//private List<String[]> breadcrumbs;
	
	@RequestMapping({"/","","index"})
	public String index(Model model) {
		model.addAttribute("titulopagina", "Index - SIGEPAD IG PNP");
		model.addAttribute("apptitulo", "Resumen");
		model.addAttribute("apptituloicono", "fa-dashboard");
		model.addAttribute("apptitulodescripcion", "Resumen estadístico de los documentos");
		model.addAttribute("active","resumen");
		
		/*breadcrumbs = new ArrayList<String[]>();
		breadcrumbs.add(new String[] {null,"Inicio"});
		model.addAttribute("active","resumen");
		model.addAttribute("breadcrumbs",breadcrumbs);*/
		return "sigepad_index";
	}
}
