package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.ITipoProcedimientoDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoProcedimiento;

@Service
public class TipoProcedimientoServiceImpl implements ITipoProcedimientoService{

	@Autowired
	private ITipoProcedimientoDao tipoprocedimientoDao;
	
	@Override
	public List<TipoProcedimiento> findByHabilitado(Boolean habilitado) {
		return tipoprocedimientoDao.findByHabilitado(habilitado);
	}
	
}
