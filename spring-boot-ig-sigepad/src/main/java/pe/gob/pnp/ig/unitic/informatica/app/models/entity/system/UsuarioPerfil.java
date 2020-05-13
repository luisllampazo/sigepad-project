package pe.gob.pnp.ig.unitic.informatica.app.models.entity.system;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Cargo;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Persona;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.UnidadInspectoria;

@Entity
@Table(name = "usuarioperfil")
public class UsuarioPerfil implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 8)
	private String cip;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Usuario usuario;
	@ManyToOne(cascade = CascadeType.ALL)
	private Persona persona;
	@ManyToOne(cascade = CascadeType.ALL)
	private UnidadInspectoria unidadinspectoria;
	@ManyToOne(cascade = CascadeType.ALL)
	private Cargo cargo;
	private boolean enabled;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date enabledAt;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date disabledAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCip() {
		return cip;
	}
	public void setCip(String cip) {
		this.cip = cip;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public UnidadInspectoria getUnidadinspectoria() {
		return unidadinspectoria;
	}
	public void setUnidadinspectoria(UnidadInspectoria unidadinspectoria) {
		this.unidadinspectoria = unidadinspectoria;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Date getEnabledAt() {
		return enabledAt;
	}
	public void setEnabledAt(Date enabledAt) {
		this.enabledAt = enabledAt;
	}
	public Date getDisabledAt() {
		return disabledAt;
	}
	public void setDisabledAt(Date disabledAt) {
		this.disabledAt = disabledAt;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
