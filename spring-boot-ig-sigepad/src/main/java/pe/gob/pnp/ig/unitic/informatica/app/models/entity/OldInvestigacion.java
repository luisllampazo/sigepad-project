package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Complejidad;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

@Entity
@Table(name="oldinvestigacion")
public class OldInvestigacion implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Expediente expediente;
	@ManyToOne(fetch = FetchType.LAZY)
	private UnidadOrganica unidadinvestigacion;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechadesignacionunidad;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fecharecepcionunidad;
	@ManyToOne(fetch = FetchType.LAZY)
	private Personal auxiliar;
	@ManyToOne(fetch = FetchType.LAZY)
	private Personal instructor;
	@ManyToOne(fetch = FetchType.LAZY)
	private Complejidad	complejidad;
	private String nrodecreto;
	private String aniodecreto;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechadecreto;
	private String siglas;
	private Boolean activo = true;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Expediente getExpediente() {
		return expediente;
	}
	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}
	public UnidadOrganica getUnidadinvestigacion() {
		return unidadinvestigacion;
	}
	public void setUnidadinvestigacion(UnidadOrganica unidadinvestigacion) {
		this.unidadinvestigacion = unidadinvestigacion;
	}
	public Date getFechadesignacionunidad() {
		return fechadesignacionunidad;
	}
	public void setFechadesignacionunidad(Date fechadesignacionunidad) {
		this.fechadesignacionunidad = fechadesignacionunidad;
	}
	public Date getFecharecepcionunidad() {
		return fecharecepcionunidad;
	}
	public void setFecharecepcionunidad(Date fecharecepcionunidad) {
		this.fecharecepcionunidad = fecharecepcionunidad;
	}
	public Personal getAuxiliar() {
		return auxiliar;
	}
	public void setAuxiliar(Personal auxiliar) {
		this.auxiliar = auxiliar;
	}
	public Personal getInstructor() {
		return instructor;
	}
	public void setInstructor(Personal instructor) {
		this.instructor = instructor;
	}
	public Complejidad getComplejidad() {
		return complejidad;
	}
	public void setComplejidad(Complejidad complejidad) {
		this.complejidad = complejidad;
	}
	public String getNrodecreto() {
		return nrodecreto;
	}
	public void setNrodecreto(String nrodecreto) {
		this.nrodecreto = nrodecreto;
	}
	public String getAniodecreto() {
		return aniodecreto;
	}
	public void setAniodecreto(String aniodecreto) {
		this.aniodecreto = aniodecreto;
	}
	public Date getFechadecreto() {
		return fechadecreto;
	}
	public void setFechadecreto(Date fechadecreto) {
		this.fechadecreto = fechadecreto;
	}
	public String getSiglas() {
		return siglas;
	}
	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
	
	

}
