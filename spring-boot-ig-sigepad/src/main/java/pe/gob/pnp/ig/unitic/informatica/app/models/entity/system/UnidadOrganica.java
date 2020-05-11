package pe.gob.pnp.ig.unitic.informatica.app.models.entity.system;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="unidadorganica")
public class UnidadOrganica implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String abrev;
	private String sede;
	private String siglas;
	
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

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UnidadOrganica () {}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public String getSiglas() {
		return siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}
	public String NombreMostrar() {
		return nombre.concat(" (").concat(sede).concat(")");
	}

	public TipoUnidad getTipounidad() {
		return tipounidad;
	}

	public void setTipounidad(TipoUnidad tipounidad) {
		this.tipounidad = tipounidad;
	}

	public String getAbrev() {
		return abrev;
	}

	public void setAbrev(String abrev) {
		this.abrev = abrev;
	}
}
