package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Infraccion;

@Entity
@Table(name = "clasehecho")
public class Clasehecho implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private Boolean enabled;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "expediente_clasehecho")
	private List<Expediente> expediente;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Infraccion> infracciones;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Expediente> getExpediente() {
		return expediente;
	}
	public void setExpediente(List<Expediente> expediente) {
		this.expediente = expediente;
	}
	public List<Infraccion> getInfracciones() {
		return infracciones;
	}
	public void setInfracciones(List<Infraccion> infracciones) {
		this.infracciones = infracciones;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
}
