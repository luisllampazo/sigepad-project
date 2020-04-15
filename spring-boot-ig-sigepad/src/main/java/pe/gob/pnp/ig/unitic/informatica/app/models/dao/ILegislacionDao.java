package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Legislacion;

public interface ILegislacionDao extends CrudRepository<Legislacion, Integer>{
	public Legislacion findByVigente(Boolean vigente);
}
