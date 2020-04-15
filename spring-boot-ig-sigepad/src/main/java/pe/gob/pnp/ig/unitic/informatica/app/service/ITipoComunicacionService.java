package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoComunicacion;

public interface ITipoComunicacionService {
	public List<TipoComunicacion> findByActivo(Boolean activo);
}
