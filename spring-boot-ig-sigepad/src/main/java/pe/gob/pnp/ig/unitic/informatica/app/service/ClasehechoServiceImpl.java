package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IClaseHechoDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Clasehecho;

@Service
public class ClasehechoServiceImpl implements IClasehechoService{
	@Autowired
	private IClaseHechoDao clasehechoDao;
	
	@Override
	public List<Clasehecho> findAll() {
		return (List<Clasehecho>) clasehechoDao.findAll();
	}

}
