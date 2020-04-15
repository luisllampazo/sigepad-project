package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Legislacion;

public interface ILegislacionService {
	public List<Legislacion> findAll();
	public Legislacion findByVigente(Boolean vigente);
}
