package pe.gob.pnp.ig.unitic.informatica.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IMovimientoDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Expediente;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Movimiento;

@Service
public class MovimientoServiceImpl implements IMovimientoService{

	@Autowired
	private IMovimientoDao movimientoDao;
	@Override
	public void save(Movimiento movimiento) {
		movimientoDao.save(movimiento);
	}
	@Override
	public Movimiento findByActivoAndExpediente(Boolean activo, Expediente expediente) {
		return movimientoDao.findByActivoAndExpediente(activo, expediente);
	}
	@Override
	public Movimiento findByActivoAndExpediente_id(Boolean activo, Long expediente_id) {
		return movimientoDao.findByActivoAndExpediente_id(activo, expediente_id);
	}

}
