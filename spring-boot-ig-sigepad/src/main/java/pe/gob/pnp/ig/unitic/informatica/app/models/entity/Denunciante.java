package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoDocIdentidad;

@Entity

public class Denunciante implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apepat;
	private String apemat;
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoDocIdentidad tipodocidentidad;
	private String nrodocidentidad;
	private Boolean policial;
	private String cip;
	private String grado;
	private String unidad;
	private String situacion;
	
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
	public String getApepat() {
		return apepat;
	}
	public void setApepat(String apepat) {
		this.apepat = apepat;
	}
	public String getApemat() {
		return apemat;
	}
	public void setApemat(String apemat) {
		this.apemat = apemat;
	}
	public String getNrodocidentidad() {
		return nrodocidentidad;
	}
	public void setNrodocidentidad(String nrodocidentidad) {
		this.nrodocidentidad = nrodocidentidad;
	}
	public Boolean getPolicial() {
		return policial;
	}
	public void setPolicial(Boolean policial) {
		this.policial = policial;
	}
	public String getCip() {
		return cip;
	}
	public void setCip(String cip) {
		this.cip = cip;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getSituacion() {
		return situacion;
	}
	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}
	
}
