package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IUsuarioDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Role;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Usuario;

@Service("jpaUserDetailsService")
public class JpaUserDetailsService implements UserDetailsService{

	@Autowired
	private IUsuarioDao userDao;
	
	private Logger logger = LoggerFactory.getLogger(JpaUserDetailsService.class);
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = userDao.findByUsername(username);
		
		if(usuario==null) {
			logger.error("No existe el Usuario "+username);
			throw new UsernameNotFoundException("Username "+username+" no existe");
		}
		if(!usuario.isEnabled())
		{
			logger.error("El Usuario "+username+" no esta habilitado");
			throw new UsernameNotFoundException("Usuario "+username+" no habilitado");
		}
		if(usuario.isConected())
		{
			logger.error("El Usuario "+username+" ya se encuentra conectado");
			throw new UsernameNotFoundException("Usuario "+username+" conectado");
		}
		
		List<GrantedAuthority> authorities = buildUserAuthority(usuario.getRole());

		return buildUserForAuthentication(usuario, authorities);
	}
	
	private User buildUserForAuthentication(Usuario usuario, 
			List<GrantedAuthority> authorities) {
				
			    String username = usuario.getUsername();
			    String password = usuario.getPassword();
			    boolean enabled = true;
			    boolean accountNonExpired = true;
			    boolean credentialsNonExpired = true;
			    boolean accountNonLocked = true;

			   return new User(username, password, enabled, accountNonExpired, credentialsNonExpired,
			            accountNonLocked, authorities);
			}

			private List<GrantedAuthority> buildUserAuthority(List<Role> roles) {

			    Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

			    for (Role role: roles) {
			    	setAuths.add(new SimpleGrantedAuthority(role.getAuthority()));
				}
			   
			    return new ArrayList<GrantedAuthority>(setAuths);
	}
	
	
	
	

}
