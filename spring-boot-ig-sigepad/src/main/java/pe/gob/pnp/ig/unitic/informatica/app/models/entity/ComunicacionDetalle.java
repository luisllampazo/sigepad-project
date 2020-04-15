package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoProcedimiento;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;



@Entity
public class ComunicacionDetalle implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	
	@OneToOne
    @MapsId
	private Comunicacion comunicacion;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private TipoProcedimiento tipoprocedimiento;
	
	//DATOS HT
	private String numeroht;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaHt;
	private Personal personalht;
	
	
	public String getNumeroht() {
		return numeroht;
	}
	public void setNumeroht(String numeroht) {
		this.numeroht = numeroht;
	}
	public Date getFechaHt() {
		return fechaHt;
	}
	public void setFechaHt(Date fechaHt) {
		this.fechaHt = fechaHt;
	}
	public Personal getPersonalht() {
		return personalht;
	}
	public void setPersonalht(Personal personalht) {
		this.personalht = personalht;
	}
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date appendedAt;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Personal appendedBy;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Comunicacion getComunicacion() {
		return comunicacion;
	}
	public void setComunicacion(Comunicacion comunicacion) {
		this.comunicacion = comunicacion;
	}
	public TipoProcedimiento getTipoprocedimiento() {
		return tipoprocedimiento;
	}
	public void setTipoprocedimiento(TipoProcedimiento tipoprocedimiento) {
		this.tipoprocedimiento = tipoprocedimiento;
	}
	public Date getAppendedAt() {
		return appendedAt;
	}
	public void setAppendedAt(Date appendedAt) {
		this.appendedAt = appendedAt;
	}
	public Personal getAppendedBy() {
		return appendedBy;
	}
	public void setAppendedBy(Personal appendedBy) {
		this.appendedBy = appendedBy;
	}
}
