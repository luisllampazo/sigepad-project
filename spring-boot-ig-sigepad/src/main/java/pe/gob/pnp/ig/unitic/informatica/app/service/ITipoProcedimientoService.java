package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoProcedimiento;

public interface ITipoProcedimientoService {
	public List<TipoProcedimiento> findByHabilitado(Boolean habilitado);
}
