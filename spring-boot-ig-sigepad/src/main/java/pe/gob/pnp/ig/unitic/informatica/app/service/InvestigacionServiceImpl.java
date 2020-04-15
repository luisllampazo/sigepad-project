package pe.gob.pnp.ig.unitic.informatica.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IInvestigacionDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.OldInvestigacion;
@Service
public class InvestigacionServiceImpl implements IInvestigacionService{
	@Autowired
	private IInvestigacionDao investigacionDao;
	
	@Override
	public void save(OldInvestigacion investigacion) {
		investigacionDao.save(investigacion);
	}

}
