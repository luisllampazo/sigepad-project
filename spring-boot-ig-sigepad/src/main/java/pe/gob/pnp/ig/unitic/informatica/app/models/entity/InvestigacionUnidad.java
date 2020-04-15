package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoUnidadInvestigacion;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

@Entity
public class InvestigacionUnidad implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Investigacion investigacion;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private UnidadOrganica unidadorganica;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private TipoUnidadInvestigacion tipounidadinvestigacion;
	private boolean enabled;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Investigacion getInvestigacion() {
		return investigacion;
	}
	public void setInvestigacion(Investigacion investigacion) {
		this.investigacion = investigacion;
	}
	public UnidadOrganica getUnidadorganica() {
		return unidadorganica;
	}
	public void setUnidadorganica(UnidadOrganica unidadorganica) {
		this.unidadorganica = unidadorganica;
	}
	public TipoUnidadInvestigacion getTipounidadinvestigacion() {
		return tipounidadinvestigacion;
	}
	public void setTipounidadinvestigacion(TipoUnidadInvestigacion tipounidadinvestigacion) {
		this.tipounidadinvestigacion = tipounidadinvestigacion;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
