package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.OldInvestigacion;

public interface IInvestigacionDao extends CrudRepository<OldInvestigacion, Long>{

}
