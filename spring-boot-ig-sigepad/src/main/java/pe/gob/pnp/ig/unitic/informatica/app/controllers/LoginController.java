package pe.gob.pnp.ig.unitic.informatica.app.controllers;

import java.security.Principal;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String Login(HttpServletRequest request,Model model, Principal principal, RedirectAttributes flash) {
		if(principal != null) {
			flash.addFlashAttribute("info","Ya ha iniciado session");
			return "redirect:/";
		}
		model.addAttribute("titulopagina", "Login - SIGEPAD IG PNP");
		return "sigepad_login";
	}

}

