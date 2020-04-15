package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

@Entity
public class Investigacion implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Comunicacion comunicacion;
	private String nroexpediente; //Null si no se genera expediente
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private UnidadOrganica unidadinvestiga;
	private Personal auxiliar;
	private Personal instructor;
}
