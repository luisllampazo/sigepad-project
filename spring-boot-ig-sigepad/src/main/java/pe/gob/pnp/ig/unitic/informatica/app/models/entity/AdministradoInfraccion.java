package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Infraccion;

@Entity
@Table(name="administradoinfraccion")
public class AdministradoInfraccion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Persona administrado;
	@ManyToOne (fetch = FetchType.LAZY)
	private Infraccion infraccion;
	@ManyToOne (fetch = FetchType.LAZY)
	private OldInvestigacion investigacion;
	private Boolean guardado;
	private Boolean iniciapad;
	private Boolean recomiendasancion;
	private Boolean sanciona;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Infraccion getInfraccion() {
		return infraccion;
	}
	public void setInfraccion(Infraccion infraccion) {
		this.infraccion = infraccion;
	}
	public Boolean isRegistrado() {
		return guardado;
	}
	public void setRegistrado(Boolean registrado) {
		this.guardado = registrado;
	}
	public Boolean getIniciapad() {
		return iniciapad;
	}
	public void setIniciapad(Boolean iniciapad) {
		this.iniciapad = iniciapad;
	}
	public Boolean getSanciona() {
		return sanciona;
	}
	public void setSanciona(Boolean sanciona) {
		this.sanciona = sanciona;
	}
	
	public OldInvestigacion getInvestigacion() {
		return investigacion;
	}
	public void setInvestigacion(OldInvestigacion investigacion) {
		this.investigacion = investigacion;
	}
	public Boolean getGuardado() {
		return guardado;
	}
	public void setGuardado(Boolean guardado) {
		this.guardado = guardado;
	}
	public Boolean getRecomiendasancion() {
		return recomiendasancion;
	}
	public void setRecomiendasancion(Boolean recomiendasancion) {
		this.recomiendasancion = recomiendasancion;
	} 
	
    
}
