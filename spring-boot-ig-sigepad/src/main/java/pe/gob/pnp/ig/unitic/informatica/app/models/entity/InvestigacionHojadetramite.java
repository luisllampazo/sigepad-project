package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;

public class InvestigacionHojadetramite implements Serializable{
	
	public Investigacion getInvestigacion() {
		return investigacion;
	}
	public void setInvestigacion(Investigacion investigacion) {
		this.investigacion = investigacion;
	}
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Investigacion investigacion;
	private String numeroht;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaHt;
	private Personal personal;
	private boolean principal;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

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
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	public boolean isPrincipal() {
		return principal;
	}
	public void setPrincipal(boolean principal) {
		this.principal = principal;
	}

}
