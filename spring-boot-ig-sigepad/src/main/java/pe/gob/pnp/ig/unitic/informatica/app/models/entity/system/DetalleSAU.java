package pe.gob.pnp.ig.unitic.informatica.app.models.entity.system;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="detalle_sau")
@DiscriminatorColumn(name="tipo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class DetalleSAU implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private SolicitudAccesoUsuario solicitudaccesousuario;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private TipoSAU tiposau;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private TipoSAU cargo;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private EstadoSAU estadosau;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Personal usuario;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "sau_permisos")
	private List<Role> permisos;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date attendedAt;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public SolicitudAccesoUsuario getSolicitudaccesousuario() {
		return solicitudaccesousuario;
	}
	public void setSolicitudaccesousuario(SolicitudAccesoUsuario solicitudaccesousuario) {
		this.solicitudaccesousuario = solicitudaccesousuario;
	}
	public TipoSAU getTiposau() {
		return tiposau;
	}
	public void setTiposau(TipoSAU tiposau) {
		this.tiposau = tiposau;
	}
	public EstadoSAU getEstadosau() {
		return estadosau;
	}
	public void setEstadosau(EstadoSAU estadosau) {
		this.estadosau = estadosau;
	}
	public Personal getUsuario() {
		return usuario;
	}
	public void setUsuario(Personal usuario) {
		this.usuario = usuario;
	}
	public Date getAttendedAt() {
		return attendedAt;
	}
	public void setAttendedAt(Date attendedAt) {
		this.attendedAt = attendedAt;
	}
	public TipoSAU getCargo() {
		return cargo;
	}
	public void setCargo(TipoSAU cargo) {
		this.cargo = cargo;
	}
	public List<Role> getPermisos() {
		return permisos;
	}
	public void setPermisos(List<Role> permisos) {
		this.permisos = permisos;
	}
	
	
}
