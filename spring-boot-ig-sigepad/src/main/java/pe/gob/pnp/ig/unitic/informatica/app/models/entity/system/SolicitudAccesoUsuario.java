package pe.gob.pnp.ig.unitic.informatica.app.models.entity.system;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class SolicitudAccesoUsuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true, length = 20)
	private String nrosolicitud;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date requiredAt;
	@Column(columnDefinition="TEXT")
	@NotNull
	private String justificacion;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Personal usuariosolicita;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Personal usuarioaprueba;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date attendedAt;
	public String getNrosolicitud() {
		return nrosolicitud;
	}
	public void setNrosolicitud(String nrosolicitud) {
		this.nrosolicitud = nrosolicitud;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getRequiredAt() {
		return requiredAt;
	}
	public void setRequiredAt(Date requiredAt) {
		this.requiredAt = requiredAt;
	}
	public Personal getUsuariosolicita() {
		return usuariosolicita;
	}
	public void setUsuariosolicita(Personal usuariosolicita) {
		this.usuariosolicita = usuariosolicita;
	}
	public Personal getUsuarioaprueba() {
		return usuarioaprueba;
	}
	public void setUsuarioaprueba(Personal usuarioaprueba) {
		this.usuarioaprueba = usuarioaprueba;
	}
	public Date getAttendedAt() {
		return attendedAt;
	}
	public void setAttendedAt(Date createAt) {
		this.attendedAt = createAt;
	}
}
