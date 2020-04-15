package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Jurisdiccion;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Legislacion;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Ubigeo;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;

@Entity
public class Comunicacion implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String nrocomunicacion;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechacomunicacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Ubigeo ubigeohecho;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Jurisdiccion jurisdiccion;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechahecho;
	
	@Temporal(TemporalType.TIME)
	@DateTimeFormat(pattern = "HH:mm")
	private Date horahecho;
	
	private String direccionhecho;
	
	@OneToMany(mappedBy = "clasehecho")
    Set<ComunicacionClasificacion> clasificacion;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Legislacion legislacion;
	
	@Column(columnDefinition="TEXT")
	private String descripcionhecho;
	
	@Column(columnDefinition="TEXT")
	private String infoidentificacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date createAt; // Null si no se ha guardado
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Personal registeredBy;
	@OneToOne(mappedBy =  "comunicacion", cascade = CascadeType.ALL)
	private ComunicacionDetalle comunicaciondetalle;
	@OneToOne(mappedBy =  "comunicacion", cascade = CascadeType.ALL)
	private ComunicacionDenunciante comunicaciondenunciante;
	//Falta atributo que permita asociar con otra una investigacion existente
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNrocomunicacion() {
		return nrocomunicacion;
	}
	public void setNrocomunicacion(String nrocomunicacion) {
		this.nrocomunicacion = nrocomunicacion;
	}
	public Date getFechacomunicacion() {
		return fechacomunicacion;
	}
	public void setFechacomunicacion(Date fechacomunicacion) {
		this.fechacomunicacion = fechacomunicacion;
	}
	public Ubigeo getUbigeohecho() {
		return ubigeohecho;
	}
	public void setUbigeohecho(Ubigeo ubigeohecho) {
		this.ubigeohecho = ubigeohecho;
	}
	public Jurisdiccion getJurisdiccion() {
		return jurisdiccion;
	}
	public void setJurisdiccion(Jurisdiccion jurisdiccion) {
		this.jurisdiccion = jurisdiccion;
	}
	public Date getFechahecho() {
		return fechahecho;
	}
	public void setFechahecho(Date fechahecho) {
		this.fechahecho = fechahecho;
	}
	public Date getHorahecho() {
		return horahecho;
	}
	public void setHorahecho(Date horahecho) {
		this.horahecho = horahecho;
	}
	public String getDireccionhecho() {
		return direccionhecho;
	}
	public void setDireccionhecho(String direccionhecho) {
		this.direccionhecho = direccionhecho;
	}
	public Set<ComunicacionClasificacion> getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(Set<ComunicacionClasificacion> clasificacion) {
		this.clasificacion = clasificacion;
	}
	public Legislacion getLegislacion() {
		return legislacion;
	}
	public void setLegislacion(Legislacion legislacion) {
		this.legislacion = legislacion;
	}
	public String getDescripcionhecho() {
		return descripcionhecho;
	}
	public void setDescripcionhecho(String descripcionhecho) {
		this.descripcionhecho = descripcionhecho;
	}
	public String getInfoidentificacion() {
		return infoidentificacion;
	}
	public void setInfoidentificacion(String infoidentificacion) {
		this.infoidentificacion = infoidentificacion;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Personal getRegisteredBy() {
		return registeredBy;
	}
	public void setRegisteredBy(Personal registeredBy) {
		this.registeredBy = registeredBy;
	}
	public ComunicacionDetalle getComunicaciondetalle() {
		return comunicaciondetalle;
	}
	public void setComunicaciondetalle(ComunicacionDetalle comunicaciondetalle) {
		this.comunicaciondetalle = comunicaciondetalle;
	}

	
}
