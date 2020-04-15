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

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.UnidadOrganica;

@Entity
@Table(name="movimiento")
public class Movimiento implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaenvio;
	@ManyToOne(fetch = FetchType.LAZY)
	private Personal usuarioenvia;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fecharecibe;
	@ManyToOne(fetch = FetchType.LAZY)
	private Personal usuariorecibe;
	@ManyToOne(fetch = FetchType.LAZY)
	private UnidadOrganica unidaddestino;
	@ManyToOne(fetch = FetchType.LAZY)
	private Expediente expediente;
	@ManyToOne(fetch = FetchType.LAZY)
	private MotivoMovimiento motivomovimiento;
	private String Comentario;
	private Boolean activo = true;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFechaenvio() {
		return fechaenvio;
	}
	public void setFechaenvio(Date fechaenvio) {
		this.fechaenvio = fechaenvio;
	}
	public Personal getUsuarioenvia() {
		return usuarioenvia;
	}
	public void setUsuarioenvia(Personal usuarioenvia) {
		this.usuarioenvia = usuarioenvia;
	}
	public Date getFecharecibe() {
		return fecharecibe;
	}
	public void setFecharecibe(Date fecharecibe) {
		this.fecharecibe = fecharecibe;
	}
	public Personal getUsuariorecibe() {
		return usuariorecibe;
	}
	public void setUsuariorecibe(Personal usuariorecibe) {
		this.usuariorecibe = usuariorecibe;
	}
	public UnidadOrganica getUnidaddestino() {
		return unidaddestino;
	}
	public void setUnidaddestino(UnidadOrganica unidaddestino) {
		this.unidaddestino = unidaddestino;
	}
	public Expediente getExpediente() {
		return expediente;
	}
	public void setExpediente(Expediente expediente) {
		this.expediente = expediente;
	}
	public MotivoMovimiento getMotivomovimiento() {
		return motivomovimiento;
	}
	public void setMotivomovimiento(MotivoMovimiento motivomovimiento) {
		this.motivomovimiento = motivomovimiento;
	}
	public String getComentario() {
		return Comentario;
	}
	public void setComentario(String comentario) {
		Comentario = comentario;
	}
	public Boolean getActivo() {
		return activo;
	}
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
		
}
