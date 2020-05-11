package pe.gob.pnp.ig.unitic.informatica.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.gob.pnp.ig.unitic.informatica.app.models.dao.IDocIdentidadDao;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoDocIdentidad;

@Service
public class DocIdentidadServiceImpl implements IDocIdentidadService{
	@Autowired
	private IDocIdentidadDao docidentidadDao;
	
	

}
