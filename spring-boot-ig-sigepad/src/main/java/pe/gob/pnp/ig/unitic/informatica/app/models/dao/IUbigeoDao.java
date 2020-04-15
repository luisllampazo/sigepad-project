package pe.gob.pnp.ig.unitic.informatica.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Ubigeo;

public interface IUbigeoDao extends CrudRepository<Ubigeo, String>{
	public List<Ubigeo> findByNombreContains(String nombre);
	public List<Ubigeo> findByBusquedaContains(String busqueda);
}
