package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Parentesco;

@Entity
public class ComunicacionAgraviado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Comunicacion comunicacion;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Persona persona;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Parentesco parentesco;
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
	public Parentesco getParentesco() {
		return parentesco;
	}
	public void setParentesco(Parentesco parentesco) {
		this.parentesco = parentesco;
	}
	
}
