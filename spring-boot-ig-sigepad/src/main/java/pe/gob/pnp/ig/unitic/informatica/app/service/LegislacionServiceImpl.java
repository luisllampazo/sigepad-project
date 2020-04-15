package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.ILegislacionDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Legislacion;

@Service
public class LegislacionServiceImpl implements ILegislacionService{
	@Autowired
	private ILegislacionDao legislacionDao;
	
	@Override
	public List<Legislacion> findAll() {
		return (List<Legislacion>) legislacionDao.findAll();
	}

	@Override
	public Legislacion findByVigente(Boolean vigente) {
		return legislacionDao.findByVigente(vigente);
	}

}
