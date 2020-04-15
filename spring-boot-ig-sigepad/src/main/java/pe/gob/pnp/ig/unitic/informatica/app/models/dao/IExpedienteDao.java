package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Expediente;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

public interface IExpedienteDao extends CrudRepository<Expediente, Long>{
	
	public List<Expediente> findByActivoAndEndirinv(Boolean activo,Boolean endirinv);
	public List<Expediente> findByFechaexpedienteBetween(Date FechaexpedienteStart, Date FechaexpedienteEnd);
	public List<Expediente> findByUnidadregistra(UnidadOrganica unidadregistra);
	public List<Expediente> findByFechaexpedienteBetweenAndActivoAndEndirinv(Date FechaexpedienteStart, Date FechaexpedienteEnd,Boolean activo,Boolean endirinv);
	
	public List<Expediente> findByFechaexpedienteBetweenAndUnidadregistraAndActivoAndEndirinv(Date FechaexpedienteStart, Date FechaexpedienteEnd,UnidadOrganica unidadregistra,Boolean activo,Boolean endirinv);
	public List<Expediente> findByFechaexpedienteBetweenAndUnidadregistraAndActivo(Date FechaexpedienteStart, Date FechaexpedienteEnd,UnidadOrganica unidadregistra,Boolean activo);
	
	
	public List<Expediente> findByFechaexpedienteBetweenAndUnidadregistraAndActivoAndGuardadoAndEndirinv(Date FechaexpedienteStart, Date FechaexpedienteEnd,UnidadOrganica unidadregistra,Boolean activo,Boolean guardado,Boolean endirinv);
	
	/* BUSQUEDA EN UTD */
	@Query("SELECT e,m from Expediente e JOIN Movimiento m ON e = m.expediente AND m.unidaddestino = :unidaddestino AND fecharecibe is null AND (m.fechaenvio between :fechadesde and :fechahasta) AND m.activo = true")
	public List<Object[]>findByMovimientoPendiente(@Param("unidaddestino") UnidadOrganica unidaddestino, @Param("fechadesde") Date fechadesde, @Param("fechahasta") Date fechahasta);
	
	@Query("SELECT e,m from Expediente e JOIN Movimiento m ON e = m.expediente AND m.unidaddestino = :unidaddestino AND fecharecibe is not null  AND (m.fechaenvio between :fechadesde and :fechahasta) AND m.activo = true")
	public List<Object[]>findByMovimientoRecibido(@Param("unidaddestino") UnidadOrganica unidaddestino, @Param("fechadesde") Date fechadesde, @Param("fechahasta") Date fechahasta);
	
	@Query("SELECT e,m from Expediente e JOIN Movimiento m ON e = m.expediente AND m.unidaddestino = :unidaddestino AND e.hojadetramite is not null  AND (m.fechaenvio between :fechadesde and :fechahasta)")
	public List<Object[]>findByMovimientoAtendido(@Param("unidaddestino") UnidadOrganica unidaddestino, @Param("fechadesde") Date fechadesde, @Param("fechahasta") Date fechahasta);
	
	@Query("SELECT e,m from Expediente e JOIN Movimiento m ON e = m.expediente AND m.unidaddestino = :unidaddestino AND (m.fechaenvio between :fechadesde and :fechahasta)")
	public List<Object[]> findByMovimientoTodo(@Param("unidaddestino") UnidadOrganica unidaddestino, @Param("fechadesde") Date fechadesde, @Param("fechahasta") Date fechahasta);
	/* FIN BUSQUEDA EN UTD */
	/* BUSQUEDA EN UTD */
}
