package pe.gob.pnp.ig.unitic.informatica.app.models.entity.master;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="unidadinspectoria")
public class UnidadInspectoria implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String abrev;
	private String sede;
	private String siglas;
	private boolean unidadfinal;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private UnidadInspectoria unidadinspectoria;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private TipoUnidadInspectoria tipounidadinspectoria;
	private Integer orden;
	private boolean clasificacion;
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
	public String getAbrev() {
		return abrev;
	}
	public void setAbrev(String abrev) {
		this.abrev = abrev;
	}
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
	public UnidadInspectoria getUnidadinspectoria() {
		return unidadinspectoria;
	}
	public void setUnidadinspectoria(UnidadInspectoria unidadinspectoria) {
		this.unidadinspectoria = unidadinspectoria;
	}
	public Integer getOrden() {
		return orden;
	}
	public void setOrden(Integer orden) {
		this.orden = orden;
	}
	public boolean isClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(boolean clasificacion) {
		this.clasificacion = clasificacion;
	}
	public TipoUnidadInspectoria getTipounidadinspectoria() {
		return tipounidadinspectoria;
	}
	public void setTipounidadinspectoria(TipoUnidadInspectoria tipounidadinspectoria) {
		this.tipounidadinspectoria = tipounidadinspectoria;
	}
	public boolean isUnidadfinal() {
		return unidadfinal;
	}
	public void setUnidadfinal(boolean unidadfinal) {
		this.unidadfinal = unidadfinal;
	}
}