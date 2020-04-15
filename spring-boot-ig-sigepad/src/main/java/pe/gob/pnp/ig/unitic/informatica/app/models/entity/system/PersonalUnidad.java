package pe.gob.pnp.ig.unitic.informatica.app.models.entity.system;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
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

@Entity
@Table(name="personalunidad")
public class PersonalUnidad implements Serializable{
	 
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Personal personal;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private UnidadOrganica unidadorganica;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date createAt;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date disabledAt;
	private Boolean enabled;
	private String comentarioalta;
	private String comentariobaja;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Personal getPersonal() {
		return personal;
	}
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}
	public UnidadOrganica getUnidadorganica() {
		return unidadorganica;
	}
	public void setUnidadorganica(UnidadOrganica unidadorganica) {
		this.unidadorganica = unidadorganica;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getDisabledAt() {
		return disabledAt;
	}
	public void setDisabledAt(Date disabledAt) {
		this.disabledAt = disabledAt;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getComentarioalta() {
		return comentarioalta;
	}
	public void setComentarioalta(String comentarioalta) {
		this.comentarioalta = comentarioalta;
	}
	public String getComentariobaja() {
		return comentariobaja;
	}
	public void setComentariobaja(String comentariobaja) {
		this.comentariobaja = comentariobaja;
	}

	 
}
