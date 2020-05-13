package pe.gob.pnp.ig.unitic.informatica.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import pe.gob.pnp.ig.unitic.informatica.app.service.JpaUserDetailsService;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@EnableGlobalMethodSecurity(securedEnabled=true, prePostEnabled=true)
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public AuthenticationSuccessHandler  authenticationSuccessHandler;
	@Autowired
	public LogoutSuccessHandler  logoutSuccessHandler;
	@Autowired
	public BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private JpaUserDetailsService userDetailsService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/css/**","/js/**","/images/**").permitAll().and()
		.authorizeRequests().antMatchers("/console/**").permitAll()
		.antMatchers("/login/**").permitAll()
		.anyRequest().authenticated()
		.and()
			.formLogin().loginPage("/login")
			.successHandler(authenticationSuccessHandler)
			.permitAll()
		.and()
		.logout()
		.logoutSuccessHandler(logoutSuccessHandler)
		.permitAll();
		
		  http.csrf().disable();
	        http.headers().frameOptions().disable();
	}
	
	@Autowired
	public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception
	{
		build.userDetailsService(userDetailsService)
		.passwordEncoder(passwordEncoder);

	}

	
	
}
