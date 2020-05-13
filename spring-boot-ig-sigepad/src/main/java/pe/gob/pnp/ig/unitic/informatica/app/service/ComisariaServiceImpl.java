package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IJurisdiccionDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Jurisdiccion;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Ubigeo;

@Service
public class ComisariaServiceImpl implements IComisariaService{
	
	@Autowired
	private IJurisdiccionDao comisariaDao;
	
	@Override
	public List<Jurisdiccion> findByUbigeo_id(String ubigeo_id) {
		return comisariaDao.findByUbigeo_id(ubigeo_id);
		
	}

	@Override
	public List<Jurisdiccion> findByUbigeo(Ubigeo ubigeo) {
		return comisariaDao.findByUbigeo(ubigeo);
	}

}
