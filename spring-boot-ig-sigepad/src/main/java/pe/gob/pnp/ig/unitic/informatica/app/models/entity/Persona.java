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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Grado;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoDocIdentidad;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.UnidadPNP;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.ProcedenciaPersona;

@Entity
@Table(name = "persona")
public class Persona  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private TipoDocIdentidad tipodocidentidad;
	private String nrodocidentidad;
	private String nombre;
	private String apepat;
	private String apemat;
	private String direccion;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fecnac;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private ProcedenciaPersona procedenciapersona; 
	
	//PNP
	private String cip;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Grado grado;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private UnidadPNP unidadpnp;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date createAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoDocIdentidad getTipodocidentidad() {
		return tipodocidentidad;
	}

	public void setTipodocidentidad(TipoDocIdentidad tipodocidentidad) {
		this.tipodocidentidad = tipodocidentidad;
	}

	public String getNrodocidentidad() {
		return nrodocidentidad;
	}

	public void setNrodocidentidad(String nrodocidentidad) {
		this.nrodocidentidad = nrodocidentidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApepat() {
		return apepat;
	}

	public void setApepat(String apepat) {
		this.apepat = apepat;
	}

	public String getApemat() {
		return apemat;
	}

	public void setApemat(String apemat) {
		this.apemat = apemat;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFecnac() {
		return fecnac;
	}

	public void setFecnac(Date fecnac) {
		this.fecnac = fecnac;
	}

	public ProcedenciaPersona getProcedenciapersona() {
		return procedenciapersona;
	}

	public void setProcedenciapersona(ProcedenciaPersona procedenciapersona) {
		this.procedenciapersona = procedenciapersona;
	}

	public String getCip() {
		return cip;
	}

	public void setCip(String cip) {
		this.cip = cip;
	}

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}

	public UnidadPNP getUnidadpnp() {
		return unidadpnp;
	}

	public void setUnidadpnp(UnidadPNP unidadpnp) {
		this.unidadpnp = unidadpnp;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
}
