package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Jurisdiccion;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Ubigeo;

public interface IComisariaService {
	public List<Jurisdiccion> findByUbigeo_id(String ubigeo_id);
	public List<Jurisdiccion> findByUbigeo(Ubigeo ubigeo);
}
