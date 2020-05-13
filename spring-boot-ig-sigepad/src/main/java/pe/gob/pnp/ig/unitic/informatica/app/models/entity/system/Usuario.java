package pe.gob.pnp.ig.unitic.informatica.app.models.entity.system;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{

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
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "authorities")
	private List<Role> role;
		
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

	public List<Role> getRole() {
		return role;
	}

	public void setRoles(List<Role> role) {
		this.role = role;
	}

	public Boolean isConected() {
		return conected;
	}

	public void setConected(Boolean conected) {
		this.conected = conected;
	}
	
	
}
