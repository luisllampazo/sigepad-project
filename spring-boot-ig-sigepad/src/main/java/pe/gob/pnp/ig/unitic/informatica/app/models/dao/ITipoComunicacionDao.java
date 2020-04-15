package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoComunicacion;

public interface ITipoComunicacionDao extends CrudRepository<TipoComunicacion, Integer>{
	public List<TipoComunicacion> findByActivo(Boolean activo);
}
