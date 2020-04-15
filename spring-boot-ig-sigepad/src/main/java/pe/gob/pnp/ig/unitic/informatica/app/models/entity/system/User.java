package pe.gob.pnp.ig.unitic.informatica.app.models.entity.system;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="[user]")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true, length = 8)
	private String	username;
	@Column(length = 60)
	private String password;
	private Boolean enabled;
	private Boolean conected;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Personal usuario;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "authorities")
	private List<Role> roles;
	

	public Personal getUsuario() {
		return usuario;
	}

	public void setUsuario(Personal usuario) {
		this.usuario = usuario;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public Boolean getConected() {
		return conected;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Boolean isConected() {
		return conected;
	}

	public void setConected(Boolean conected) {
		this.conected = conected;
	}
	
	
}
