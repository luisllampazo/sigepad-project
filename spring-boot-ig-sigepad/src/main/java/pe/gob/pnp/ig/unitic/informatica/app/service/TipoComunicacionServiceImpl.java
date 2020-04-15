package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.ITipoComunicacionDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoComunicacion;
@Service
public class TipoComunicacionServiceImpl implements ITipoComunicacionService{

	@Autowired
	private ITipoComunicacionDao tipocomunicacionDao;
	@Override
	public List<TipoComunicacion> findByActivo(Boolean activo) {
		return tipocomunicacionDao.findByActivo(activo);
	}

	


}
