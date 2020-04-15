package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.Date;
import java.util.List;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Expediente;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

public interface IExpedienteService {
	public List<Expediente> findByFechaexpedienteBetweenAndUnidadregistraAndActivoAndEndirinv(Date FechaexpedienteStart, Date FechaexpedienteEnd,UnidadOrganica unidadregistra,Boolean activo,Boolean endirinv);
	public List<Expediente> findByFechaexpedienteBetweenAndUnidadregistraAndActivo(Date FechaexpedienteStart, Date FechaexpedienteEnd,UnidadOrganica unidadregistra,Boolean activo);
	public Expediente findById(Long id);
	public void save(Expediente e);
	public List<Object[]> findByMovimientoPendiente(UnidadOrganica unidaddestino,Date fechadesde, Date fechahasta);
	public List<Object[]> findByMovimientoRecibido(UnidadOrganica unidaddestino,Date fechadesde, Date fechahasta);
	public List<Object[]> findByMovimientoAtendido(UnidadOrganica unidaddestino,Date fechadesde, Date fechahasta);
	public List<Object[]> findByMovimientoTodo(UnidadOrganica unidaddestino, Date fechadesde, Date fechahasta);
	public List<Expediente> findByActivoAndEndirinv(Boolean activo,Boolean endirinv);
	public List<Expediente> findByFechaexpedienteBetween(Date FechaexpedienteStart, Date FechaexpedienteEnd);
	public List<Expediente> findByUnidadregistra(UnidadOrganica unidadregistra);
}
