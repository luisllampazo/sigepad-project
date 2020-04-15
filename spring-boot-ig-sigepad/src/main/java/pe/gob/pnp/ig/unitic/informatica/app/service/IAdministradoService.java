package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Administrado;

public interface IAdministradoService {
	public List<Administrado> findByExpediente_id(Long expediente_id);
	public void save(Administrado administrado);
	public List<Administrado> findByNombreContainsOrApepatContainsOrApematContains(String nombre,String apepat, String apemat);
	public List<Object[]> findAdministradoWithPartOfNameApe(String buscado);
}
