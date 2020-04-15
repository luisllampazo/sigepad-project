package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IUbigeoDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Ubigeo;

@Service
public class UbigeoServiceImpl implements IUbigeoService{

	@Autowired
	private IUbigeoDao ubigeoDao;
	@Override
	public List<Ubigeo> findByNombreContains(String nombre) {
		return ubigeoDao.findByNombreContains(nombre);
	}
	@Override
	public List<Ubigeo> findByBusquedaContains(String busqueda) {
		return ubigeoDao.findByBusquedaContains(busqueda);
	}

}
