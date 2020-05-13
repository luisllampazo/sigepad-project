package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UsuarioPerfil;

public interface IUsuarioPerfilDao extends CrudRepository<UsuarioPerfil, Long> {
	public UsuarioPerfil findByCipAndEnabledTrue(String cip);
}
