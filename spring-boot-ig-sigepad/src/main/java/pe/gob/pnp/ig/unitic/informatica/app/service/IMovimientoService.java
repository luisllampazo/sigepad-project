package pe.gob.pnp.ig.unitic.informatica.app.service;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Expediente;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Movimiento;

public interface IMovimientoService {
	public void save(Movimiento movimiento);
	public Movimiento findByActivoAndExpediente(Boolean activo,Expediente expediente);
	public Movimiento findByActivoAndExpediente_id(Boolean activo,Long expediente_id);
}
