package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Jurisdiccion;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Legislacion;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoComunicacion;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoProcedimiento;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Ubigeo;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

@Entity
@Table(name="expediente")
public class Expediente implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String nroexpediente;
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoComunicacion tipocomunicacion;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaexpediente;
	@ManyToOne(fetch = FetchType.LAZY)
	private Ubigeo ubigeohecho;
	@ManyToOne(fetch = FetchType.LAZY)
	private Jurisdiccion jurisdiccionpolicial;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechahecho;
	@Temporal(TemporalType.TIME)
	@DateTimeFormat(pattern = "HH:mm")
	private Date horahecho;
	private String direccionhecho;
	@ManyToOne(fetch = FetchType.LAZY)
	private Clasehecho clasificacion;
	@ManyToOne(fetch = FetchType.LAZY)
	private Legislacion legislacion;
	@Column(columnDefinition="TEXT")
	private String descripcionhecho;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "expediente_clasehecho")
	private List<Clasehecho> clasehecho;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Persona denunciante;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoProcedimiento tipoprocedimiento;
	private Boolean guardado = false; // 
	private Boolean expediente = false; // false: denuncia 
	@Column(columnDefinition="TEXT")
	private String infoidentificacion;
	@ManyToOne(fetch = FetchType.LAZY)
	private Hojadetramite hojadetramite;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "expediente_id")
	private List<OldInvestigacion> investigaciones;
	
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="expediente_id")
	private List<Persona> administrados;
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="expediente_id")
	private List<Persona> agraviados;
	@ManyToOne(fetch = FetchType.LAZY)
	private ExpedienteComunicacion expedientecomunicacion;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fecharegistro; //fecha de creacion del registro 
	@ManyToOne(fetch = FetchType.LAZY)
	private UnidadOrganica unidadregistra; //organo que registra
	@ManyToOne(fetch = FetchType.LAZY)
	private Personal usuarioregistra; //usuario que registra la denuncia
	private Boolean endirinv = false; //activo o terminado
	private Boolean activo = true; //activo o terminado

	public Long getId() {
		return id;
	}

	public List<OldInvestigacion> getInvestigaciones() {
		return investigaciones;
	}
	public void setInvestigaciones(List<OldInvestigacion> investigaciones) {
		this.investigaciones = investigaciones;
	}
	public ExpedienteComunicacion getExpedientecomunicacion() {
		return expedientecomunicacion;
	}
	public void setExpedientecomunicacion(ExpedienteComunicacion expedientecomunicacion) {
		this.expedientecomunicacion = expedientecomunicacion;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNroexpediente() {
		return nroexpediente;
	}

	public void setNroexpediente(String nroexpediente) {
		this.nroexpediente = nroexpediente;
	}

	public Date getFechaexpediente() {
		return fechaexpediente;
	}

	public void setFechaexpediente(Date fechaexpediente) {
		this.fechaexpediente = fechaexpediente;
	}

	public Ubigeo getUbigeohecho() {
		return ubigeohecho;
	}

	public void setUbigeohecho(Ubigeo ubigeohecho) {
		this.ubigeohecho = ubigeohecho;
	}

	public Jurisdiccion getJurisdiccionpolicial() {
		return jurisdiccionpolicial;
	}

	public void setJurisdiccionpolicial(Jurisdiccion jurisdiccionpolicial) {
		this.jurisdiccionpolicial = jurisdiccionpolicial;
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

	public Clasehecho getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(Clasehecho clasificacion) {
		this.clasificacion = clasificacion;
	}

	public List<Clasehecho> getClasehecho() {
		return clasehecho;
	}

	public void setClasehecho(List<Clasehecho> clasehecho) {
		this.clasehecho = clasehecho;
	}


	public TipoProcedimiento getTipoprocedimiento() {
		return tipoprocedimiento;
	}

	public void setTipoprocedimiento(TipoProcedimiento tipoprocedimiento) {
		this.tipoprocedimiento = tipoprocedimiento;
	}

	public Boolean getGuardado() {
		return guardado;
	}

	public void setGuardado(Boolean guardado) {
		this.guardado = guardado;
	}

	public Boolean getExpediente() {
		return expediente;
	}

	public void setExpediente(Boolean expediente) {
		this.expediente = expediente;
	}

	public String getInfoidentificacion() {
		return infoidentificacion;
	}

	public void setInfoidentificacion(String infoidentificacion) {
		this.infoidentificacion = infoidentificacion;
	}

	public Hojadetramite getHojadetramite() {
		return hojadetramite;
	}

	public void setHojadetramite(Hojadetramite hojadetramite) {
		this.hojadetramite = hojadetramite;
	}

	
	public Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	
	public Personal getUsuarioregistra() {
		return usuarioregistra;
	}

	public void setUsuarioregistra(Personal usuarioregistra) {
		this.usuarioregistra = usuarioregistra;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public TipoComunicacion getTipocomunicacion() {
		return tipocomunicacion;
	}

	public void setTipocomunicacion(TipoComunicacion tipocomunicacion) {
		this.tipocomunicacion = tipocomunicacion;
	}

	public Boolean getEndirinv() {
		return endirinv;
	}

	public void setEndirinv(Boolean endirinv) {
		this.endirinv = endirinv;
	}

	public UnidadOrganica getUnidadregistra() {
		return unidadregistra;
	}

	public void setUnidadregistra(UnidadOrganica unidadregistra) {
		this.unidadregistra = unidadregistra;
	}
	
}
