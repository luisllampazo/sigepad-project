package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoDocIdentidad;

public interface IDocIdentidadDao extends CrudRepository<TipoDocIdentidad, Integer>{
	public List<TipoDocIdentidad> findByHabilitado(Boolean habilitado);
	
}
