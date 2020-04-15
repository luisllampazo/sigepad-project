package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

public interface IUnidadOrganicaDao extends CrudRepository<UnidadOrganica, Integer>{
	//public UnidadOrganica findById(Integer id);
	public List<UnidadOrganica> findByTipounidad_id(Integer tipounidad_id);
}
