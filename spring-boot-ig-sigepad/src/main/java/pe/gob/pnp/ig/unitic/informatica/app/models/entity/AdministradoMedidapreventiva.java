package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class AdministradoMedidapreventiva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Persona administrado;
	@ManyToOne(fetch = FetchType.LAZY)
	private OldInvestigacion investigacion;
	@ManyToOne(fetch = FetchType.LAZY)
	private Medidapreventiva medidapreventiva;
	@ManyToOne(fetch = FetchType.LAZY)
	private InvestigacionDocumento documentoinicio;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaenteradoinicio; 
	private String archivoenteradoinicio;
	@ManyToOne(fetch = FetchType.LAZY)
	private InvestigacionDocumento documentofin;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaenteradofin; 
	private String archivoenteradofin;
	@ManyToOne(fetch = FetchType.LAZY)
	private MotivoQuitaMP motivoquitamp;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public OldInvestigacion getInvestigacion() {
		return investigacion;
	}
	public void setInvestigacion(OldInvestigacion investigacion) {
		this.investigacion = investigacion;
	}
	public Medidapreventiva getMedidapreventiva() {
		return medidapreventiva;
	}
	public void setMedidapreventiva(Medidapreventiva medidapreventiva) {
		this.medidapreventiva = medidapreventiva;
	}
	public InvestigacionDocumento getDocumentoinicio() {
		return documentoinicio;
	}
	public void setDocumentoinicio(InvestigacionDocumento documentoinicio) {
		this.documentoinicio = documentoinicio;
	}
	public Date getFechaenteradoinicio() {
		return fechaenteradoinicio;
	}
	public void setFechaenteradoinicio(Date fechaenteradoinicio) {
		this.fechaenteradoinicio = fechaenteradoinicio;
	}
	public String getArchivoenteradoinicio() {
		return archivoenteradoinicio;
	}
	public void setArchivoenteradoinicio(String archivoenteradoinicio) {
		this.archivoenteradoinicio = archivoenteradoinicio;
	}
	public InvestigacionDocumento getDocumentofin() {
		return documentofin;
	}
	public void setDocumentofin(InvestigacionDocumento documentofin) {
		this.documentofin = documentofin;
	}
	public Date getFechaenteradofin() {
		return fechaenteradofin;
	}
	public void setFechaenteradofin(Date fechaenteradofin) {
		this.fechaenteradofin = fechaenteradofin;
	}
	public String getArchivoenteradofin() {
		return archivoenteradofin;
	}
	public void setArchivoenteradofin(String archivoenteradofin) {
		this.archivoenteradofin = archivoenteradofin;
	}
	public MotivoQuitaMP getMotivoquitamp() {
		return motivoquitamp;
	}
	public void setMotivoquitamp(MotivoQuitaMP motivoquitamp) {
		this.motivoquitamp = motivoquitamp;
	}
	
}
