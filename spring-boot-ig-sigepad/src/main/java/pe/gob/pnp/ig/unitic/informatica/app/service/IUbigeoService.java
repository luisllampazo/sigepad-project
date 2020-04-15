package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Ubigeo;

public interface IUbigeoService {
	public List<Ubigeo> findByNombreContains(String nombre);
	public List<Ubigeo> findByBusquedaContains(String busqueda);
}
