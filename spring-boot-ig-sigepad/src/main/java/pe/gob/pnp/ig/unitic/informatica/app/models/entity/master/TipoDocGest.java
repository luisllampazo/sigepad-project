package pe.gob.pnp.ig.unitic.informatica.app.models.entity.master;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.TipoUnidad;


@Entity
@Table(name = "tipodocgest")
public class TipoDocGest implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private boolean enabled;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoUnidad tipoorgdisc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public TipoUnidad getTipoorgdisc() {
		return tipoorgdisc;
	}

	public void setTipoorgdisc(TipoUnidad tipoorgdisc) {
		this.tipoorgdisc = tipoorgdisc;
	}

	
}
