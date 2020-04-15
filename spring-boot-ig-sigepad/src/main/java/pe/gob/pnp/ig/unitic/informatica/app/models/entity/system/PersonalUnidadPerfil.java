package pe.gob.pnp.ig.unitic.informatica.app.models.entity.system;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="personalunidadperfil")
public class PersonalUnidadPerfil implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private PersonalUnidad personalunidad;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Cargo cargo;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "authorities_history")
	private List<Role> roles;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date createAt;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date disabledAt;
	private Boolean enabled;
	private String comentarioalta;
	private String comentariobaja;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PersonalUnidad getPersonalunidad() {
		return personalunidad;
	}
	public void setPersonalunidad(PersonalUnidad personalunidad) {
		this.personalunidad = personalunidad;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getComentariobaja() {
		return comentariobaja;
	}
	public void setComentariobaja(String comentariobaja) {
		this.comentariobaja = comentariobaja;
	}
	public String getComentarioalta() {
		return comentarioalta;
	}
	public void setComentarioalta(String comentarioalta) {
		this.comentarioalta = comentarioalta;
	}
	public Date getDisabledAt() {
		return disabledAt;
	}
	public void setDisabledAt(Date disabledAt) {
		this.disabledAt = disabledAt;
	}
	
}
