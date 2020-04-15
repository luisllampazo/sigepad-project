package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Expediente;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Movimiento;

public interface IMovimientoDao extends CrudRepository<Movimiento, Long>{
	public Movimiento findByActivoAndExpediente(Boolean activo,Expediente expediente);
	public Movimiento findByActivoAndExpediente_id(Boolean activo,Long expediente_id);
	
}
