package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoProcedimiento;

public interface ITipoProcedimientoDao extends CrudRepository<TipoProcedimiento, Long>{
	public List<TipoProcedimiento> findByHabilitado(Boolean habilitado);
}
