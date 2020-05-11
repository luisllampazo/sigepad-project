package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IPersonalDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;
@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private IPersonalDao usuarioDao;
	@Override
	public Personal findByCip(String cip) {

		return usuarioDao.findByCip(cip);
	}
	@Override
	public List<Personal> findAll() {
		return (List<Personal>) usuarioDao.findAll();
	}

}
