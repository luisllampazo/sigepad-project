package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);
	public Usuario findByUsernameAndEnabledAndConected(String username,Boolean enabled,Boolean Conected);

}
