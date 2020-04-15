package pe.gob.pnp.ig.unitic.informatica.app.models.entity.master;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ubigeo")
public class Ubigeo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String nombre;
	private String busqueda;
	private String nombredist;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Provincia provincia;
		
	public Ubigeo() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNombredist() {
		return nombredist;
	}

	public void setNombredist(String nombredist) {
		this.nombredist = nombredist;
	}

	public String getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(String busqueda) {
		this.busqueda = busqueda;
	}
	
	
}
