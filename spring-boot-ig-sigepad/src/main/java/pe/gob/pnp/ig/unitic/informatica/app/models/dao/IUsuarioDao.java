package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;

public interface IUsuarioDao extends CrudRepository<Personal, Long>{
	public Personal findByCip(String cip);
	
}
