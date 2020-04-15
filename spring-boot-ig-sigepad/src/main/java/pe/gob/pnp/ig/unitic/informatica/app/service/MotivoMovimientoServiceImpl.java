package pe.gob.pnp.ig.unitic.informatica.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IMotivoMovimientoDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.MotivoMovimiento;

@Service
public class MotivoMovimientoServiceImpl implements IMotivoMovimientoService{

	@Autowired
	private IMotivoMovimientoDao motivomovimientoDao;

	@Override
	public MotivoMovimiento findById(Long id) {
		return motivomovimientoDao.findById(id).get();
	}
}
