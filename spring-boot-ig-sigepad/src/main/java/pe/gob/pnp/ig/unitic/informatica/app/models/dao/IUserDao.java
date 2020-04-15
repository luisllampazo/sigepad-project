package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.User;

public interface IUserDao extends CrudRepository<User, Long>{
	
	public User findByUsername(String username);
	public User findByUsernameAndEnabledAndConected(String username,Boolean enabled,Boolean Conected);

}
