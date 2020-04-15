package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Grado;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoInvolucrado;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.UnidadPNP;

@Entity
public class ComunicacionInvolucrado implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Comunicacion comunicacion;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Persona persona;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Grado grado;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private UnidadPNP unidad;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private TipoInvolucrado tipoinvolucrado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Comunicacion getComunicacion() {
		return comunicacion;
	}
	public void setComunicacion(Comunicacion comunicacion) {
		this.comunicacion = comunicacion;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Grado getGrado() {
		return grado;
	}
	public void setGrado(Grado grado) {
		this.grado = grado;
	}
	public UnidadPNP getUnidad() {
		return unidad;
	}
	public void setUnidad(UnidadPNP unidad) {
		this.unidad = unidad;
	}
	public TipoInvolucrado getTipoinvolucrado() {
		return tipoinvolucrado;
	}
	public void setTipoinvolucrado(TipoInvolucrado tipoinvolucrado) {
		this.tipoinvolucrado = tipoinvolucrado;
	}
	
}
