package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Administrado;


public interface IAdministradoDao extends CrudRepository<Administrado, Long>{
	public List<Administrado> findByExpediente_id(Long expediente_id);
	public List<Administrado> findByNombreContainsOrApepatContainsOrApematContains(String nombre,String apepat, String apemat);
	@Query("SELECT DISTINCT a.cip, a.nombre,a.apepat, a.apemat FROM Administrado a WHERE a.nombre LIKE CONCAT('%',:buscado,'%') or a.apepat LIKE CONCAT('%',:buscado,'%') or a.apemat LIKE CONCAT('%',:buscado,'%')")
	public List<Object[]> findAdministradoWithPartOfNameApe(@Param("buscado") String buscado);
	
}
