package pe.gob.pnp.ig.unitic.informatica.app.service;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UsuarioPerfil;

public interface IUsuarioPerfilService {
	public UsuarioPerfil findByCipAndEnabledTrue(String cip);
}
