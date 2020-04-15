package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoDocIdentidad;

public interface IDocIdentidadService {
	public List<TipoDocIdentidad> findByHabilitado(Boolean habilitado);
}
