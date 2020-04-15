package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Jurisdiccion;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Ubigeo;

public interface IComisariaDao extends CrudRepository<Jurisdiccion, Long>{
	public List<Jurisdiccion> findByUbigeo_id(String ubigeo_id);
	public List<Jurisdiccion> findByUbigeo(Ubigeo ubigeo);
}
