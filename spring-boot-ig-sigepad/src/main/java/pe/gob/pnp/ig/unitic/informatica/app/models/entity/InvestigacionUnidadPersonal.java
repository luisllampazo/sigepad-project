package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.CargoInvestigacion;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;

@Entity
public class InvestigacionUnidadPersonal implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Personal personal; 
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private CargoInvestigacion cargoinvestigacion;
	private boolean enabled;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	public CargoInvestigacion getCargoinvestigacion() {
		return cargoinvestigacion;
	}
	public void setCargoinvestigacion(CargoInvestigacion cargoinvestigacion) {
		this.cargoinvestigacion = cargoinvestigacion;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
}
