package pe.gob.pnp.ig.unitic.informatica.app.models.entity.master;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidadinspectoria_cargo")
public class UnidadInspectoriaCargo implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private UnidadInspectoria unidadinspectoria;
	private Cargo cargo;
	private boolean enabled;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UnidadInspectoria getUnidadinspectoria() {
		return unidadinspectoria;
	}
	public void setUnidadinspectoria(UnidadInspectoria unidadinspectoria) {
		this.unidadinspectoria = unidadinspectoria;
	}
	public Cargo getCargo() {
		return cargo;
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
}
