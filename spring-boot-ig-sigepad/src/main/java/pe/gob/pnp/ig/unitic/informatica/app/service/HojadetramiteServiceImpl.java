package pe.gob.pnp.ig.unitic.informatica.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IHojadetramiteDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Hojadetramite;

@Service
public class HojadetramiteServiceImpl implements IHojadetramiteService{
	@Autowired
	private IHojadetramiteDao hojadetramiteDao;
	@Override
	public void save(Hojadetramite hojadetramite) {
		hojadetramiteDao.save(hojadetramite);
	}

}
