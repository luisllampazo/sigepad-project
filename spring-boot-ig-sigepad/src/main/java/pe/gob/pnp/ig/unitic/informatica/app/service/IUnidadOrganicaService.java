package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

public interface IUnidadOrganicaService {
	public UnidadOrganica findById(Integer id);
	public List<UnidadOrganica> findByTipounidad_id(Integer tipounidad_id);
}
