package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

@Entity
public class MovimientoComunicacion implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Comunicacion comunicacion;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date sendedAt;
	private Personal sendedBy;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date recivedAt;
	private Personal recivedBy;
	private UnidadOrganica unidadorganica;
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
	public Date getSendedAt() {
		return sendedAt;
	}
	public void setSendedAt(Date sendedAt) {
		this.sendedAt = sendedAt;
	}
	public Personal getSendedBy() {
		return sendedBy;
	}
	public void setSendedBy(Personal sendedBy) {
		this.sendedBy = sendedBy;
	}
	public Date getRecivedAt() {
		return recivedAt;
	}
	public void setRecivedAt(Date recivedAt) {
		this.recivedAt = recivedAt;
	}
	public Personal getRecivedBy() {
		return recivedBy;
	}
	public void setRecivedBy(Personal recivedBy) {
		this.recivedBy = recivedBy;
	}
	public UnidadOrganica getUnidadorganica() {
		return unidadorganica;
	}
	public void setUnidadorganica(UnidadOrganica unidadorganica) {
		this.unidadorganica = unidadorganica;
	}
}
