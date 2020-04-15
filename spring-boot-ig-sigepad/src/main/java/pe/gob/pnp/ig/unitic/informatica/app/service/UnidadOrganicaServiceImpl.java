package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IUnidadOrganicaDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

@Service
public class UnidadOrganicaServiceImpl implements IUnidadOrganicaService{

	@Autowired
	public IUnidadOrganicaDao unidadorganicaDao;
	@Override
	public UnidadOrganica findById(Integer id) {
		return unidadorganicaDao.findById(id).get();
	}
	@Override
	public List<UnidadOrganica> findByTipounidad_id(Integer tipounidad_id) {
		return unidadorganicaDao.findByTipounidad_id(tipounidad_id);
	}

}
