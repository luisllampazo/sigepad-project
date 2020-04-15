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

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IUserDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Role;

@Service("jpaUserDetailsService")
public class JpaUserDetailsService implements UserDetailsService{

	@Autowired
	private IUserDao userDao;
	
	private Logger logger = LoggerFactory.getLogger(JpaUserDetailsService.class);
	
	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.User user = userDao.findByUsername(username);
		
		if(user==null) {
			logger.error("No existe el Usuario "+username);
			throw new UsernameNotFoundException("Username "+username+" no existe");
		}
		if(!user.isEnabled())
		{
			logger.error("El Usuario "+username+" no esta habilitado");
			throw new UsernameNotFoundException("Usuario "+username+" no habilitado");
		}
		if(user.isConected())
		{
			logger.error("El Usuario "+username+" ya se encuentra conectado");
			throw new UsernameNotFoundException("Usuario "+username+" conectado");
		}
		
		List<GrantedAuthority> authorities = buildUserAuthority(user.getRoles());

		return buildUserForAuthentication(user, authorities);
	}
	
	private User buildUserForAuthentication(pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.User user, 
			List<GrantedAuthority> authorities) {
				
			    String username = user.getUsername();
			    String password = user.getPassword();
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
