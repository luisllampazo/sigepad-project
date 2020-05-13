package pe.gob.pnp.ig.unitic.informatica.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IUsuarioPerfilDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UsuarioPerfil;
@Service
public class UsuarioPerfilServiceImpl implements IUsuarioPerfilService{

	@Autowired
	private IUsuarioPerfilDao usuarioperfilDao;
	@Override
	public UsuarioPerfil findByCipAndEnabledTrue(String cip) {
		return usuarioperfilDao.findByCipAndEnabledTrue(cip);
	}
	
}
