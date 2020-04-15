package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IAdministradoDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.Administrado;

@Service
public class AdministradoServiceImpl implements IAdministradoService{
	@Autowired
	private IAdministradoDao administradoDao;
	
	@Override
	public List<Administrado> findByExpediente_id(Long expediente_id) {
		return administradoDao.findByExpediente_id(expediente_id);
	}

	@Override
	public void save(Administrado administrado) {
		administradoDao.save(administrado);
		
	}

	@Override
	public List<Administrado> findByNombreContainsOrApepatContainsOrApematContains(String nombre, String apepat,
			String apemat) {
		return administradoDao.findByNombreContainsOrApepatContainsOrApematContains(nombre, apepat, apemat);
	}

	@Override
	public List<Object[]> findAdministradoWithPartOfNameApe(String buscado) {
		return administradoDao.findAdministradoWithPartOfNameApe(buscado);
	}





}
