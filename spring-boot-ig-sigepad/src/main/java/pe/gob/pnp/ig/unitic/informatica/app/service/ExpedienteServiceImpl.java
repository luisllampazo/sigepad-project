package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IExpedienteDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Expediente;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

@Service
public class ExpedienteServiceImpl implements IExpedienteService{

	@Autowired
	private IExpedienteDao expedienteDao;


	@Override
	public Expediente findById(Long id) {
		return expedienteDao.findById(id).get();
	}


	@Override
	public List<Expediente> findByFechaexpedienteBetweenAndUnidadregistraAndActivoAndEndirinv(Date FechaexpedienteStart,
			Date FechaexpedienteEnd, UnidadOrganica unidadregistra, Boolean activo, Boolean endirinv) {
		return expedienteDao.findByFechaexpedienteBetweenAndUnidadregistraAndActivoAndEndirinv(FechaexpedienteStart, FechaexpedienteEnd, unidadregistra, activo, endirinv);
	}


	@Override
	public List<Expediente> findByFechaexpedienteBetweenAndUnidadregistraAndActivo(Date FechaexpedienteStart,
			Date FechaexpedienteEnd, UnidadOrganica unidadregistra, Boolean activo) {
		return expedienteDao.findByFechaexpedienteBetweenAndUnidadregistraAndActivo(FechaexpedienteStart, FechaexpedienteEnd, unidadregistra, activo);
	}


	@Override
	public void save(Expediente e) {
		expedienteDao.save(e);		
	}


	@Override
	public List<Object[]> findByMovimientoPendiente(UnidadOrganica unidaddestino, Date fechadesde, Date fechahasta) {
		return expedienteDao.findByMovimientoPendiente(unidaddestino, fechadesde, fechahasta);
	}


	@Override
	public List<Object[]> findByMovimientoRecibido(UnidadOrganica unidaddestino, Date fechadesde, Date fechahasta) {
		return expedienteDao.findByMovimientoRecibido(unidaddestino, fechadesde, fechahasta);
	}


	@Override
	public List<Object[]> findByMovimientoAtendido(UnidadOrganica unidaddestino, Date fechadesde, Date fechahasta) {
		return expedienteDao.findByMovimientoAtendido(unidaddestino, fechadesde, fechahasta);
	}


	@Override
	public List<Object[]> findByMovimientoTodo(UnidadOrganica unidaddestino, Date fechadesde, Date fechahasta) {
		return expedienteDao.findByMovimientoTodo(unidaddestino, fechadesde, fechahasta);
	}


	@Override
	public List<Expediente> findByActivoAndEndirinv(Boolean activo, Boolean endirinv) {
		return expedienteDao.findByActivoAndEndirinv(activo, endirinv);
	}


	@Override
	public List<Expediente> findByFechaexpedienteBetween(Date FechaexpedienteStart, Date FechaexpedienteEnd) {
		return expedienteDao.findByFechaexpedienteBetween(FechaexpedienteStart, FechaexpedienteEnd);
	}


	@Override
	public List<Expediente> findByUnidadregistra(UnidadOrganica unidadregistra) {
		// TODO Auto-generated method stub
		return expedienteDao.findByUnidadregistra(unidadregistra);
	}




}
