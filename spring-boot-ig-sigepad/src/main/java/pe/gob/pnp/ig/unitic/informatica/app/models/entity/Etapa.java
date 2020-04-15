package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

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
@Table (name = "etapa")
public class Etapa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoUnidad tipounidad;
		
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
	public TipoUnidad getTipoorgdisc() {
		return tipounidad;
	}

	public void setTipoorgdisc(TipoUnidad tipoorgdisc) {
		this.tipounidad = tipoorgdisc;
	}

}