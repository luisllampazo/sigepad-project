package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Role;


public interface IRoleService {
	public List<Role> findAll();
}
