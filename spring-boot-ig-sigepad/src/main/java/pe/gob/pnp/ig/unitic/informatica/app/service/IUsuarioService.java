package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;

public interface IUsuarioService {
	public Personal findByCip(String cip);
	public List<Personal> findAll();
}
