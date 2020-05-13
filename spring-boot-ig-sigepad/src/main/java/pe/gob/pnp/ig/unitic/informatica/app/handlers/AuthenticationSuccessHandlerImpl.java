package pe.gob.pnp.ig.unitic.informatica.app.handlers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UsuarioPerfil;
import pe.gob.pnp.ig.unitic.informatica.app.service.IUsuarioPerfilService;


@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

	@Autowired
	private HttpSession session;
	@Autowired
	private IUsuarioPerfilService usuarioperfilService;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
			session = request.getSession();
			System.out.println("mi ip request:"+request.getRemoteAddr());
			//SavedRequest savedRequest = (SavedRequest) session.getAttribute("SPRING_SECURITY_SAVED_REQUEST");
			UsuarioPerfil up = usuarioperfilService.findByCipAndEnabledTrue(authentication.getName());
			//session.setAttribute("usuarioperfil", up);
			session.setAttribute("usuariogrado", up.getPersona().getGrado().getNombre());
		 	session.setAttribute("usuarionombre", up.getPersona().getNombreCompleto());
			session.setAttribute("usuariocargo", up.getCargo().getNombre());
			session.setAttribute("usuariounidad", up.getUnidadinspectoria().getNombre());
			session.setAttribute("usuariosede","("+ up.getUnidadinspectoria().getSede()+")"); 
		    //response.sendRedirect(savedRequest.getRedirectUrl());
		 	response.sendRedirect("/");

	}

}
