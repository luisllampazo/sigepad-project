package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;
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

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoDocGest;

@Entity
public class InvestigacionDocumento implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private OldInvestigacion investigacion;
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoDocGest tipodocgest;
	private String nrodocumento;
	private String siglasdocumento;
	private String descripciondocumento;
	private String archivodocumento;
	@ManyToOne(fetch = FetchType.LAZY)
	private EtapaInvestigacion etapainvestigacion; //a que etapa corresponde el documento
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechadocumento;
	private Boolean guardado;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fecharegistro;
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
	public TipoDocGest getTipodocgest() {
		return tipodocgest;
	}
	public void setTipodocgest(TipoDocGest tipodocgest) {
		this.tipodocgest = tipodocgest;
	}
	public String getNrodocumento() {
		return nrodocumento;
	}
	public void setNrodocumento(String nrodocumento) {
		this.nrodocumento = nrodocumento;
	}
	public String getSiglasdocumento() {
		return siglasdocumento;
	}
	public void setSiglasdocumento(String siglasdocumento) {
		this.siglasdocumento = siglasdocumento;
	}
	public String getDescripciondocumento() {
		return descripciondocumento;
	}
	public void setDescripciondocumento(String descripciondocumento) {
		this.descripciondocumento = descripciondocumento;
	}
	public String getArchivodocumento() {
		return archivodocumento;
	}
	public void setArchivodocumento(String archivodocumento) {
		this.archivodocumento = archivodocumento;
	}
	public EtapaInvestigacion getEtapainvestigacion() {
		return etapainvestigacion;
	}
	public void setEtapainvestigacion(EtapaInvestigacion etapainvestigacion) {
		this.etapainvestigacion = etapainvestigacion;
	}
	public Date getFechadocumento() {
		return fechadocumento;
	}
	public void setFechadocumento(Date fechadocumento) {
		this.fechadocumento = fechadocumento;
	}
	public Boolean getGuardado() {
		return guardado;
	}
	public void setGuardado(Boolean guardado) {
		this.guardado = guardado;
	}
	public Date getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	
	
	
}
