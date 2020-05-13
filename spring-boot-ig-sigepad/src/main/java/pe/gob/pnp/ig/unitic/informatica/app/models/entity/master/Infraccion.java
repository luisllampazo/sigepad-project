package pe.gob.pnp.ig.unitic.informatica.app.models.entity.master;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Infraccion implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String codigo;
	@Column(columnDefinition="TEXT")
	private String descripcion;
	@Column(columnDefinition="TEXT")
	private String sancion;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private TipoInfraccion tipoinfraccion;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private Legislacion legislacion;
	private boolean enabled;
	
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public TipoInfraccion getTipoinfraccion() {
		return tipoinfraccion;
	}
	public void setTipoinfraccion(TipoInfraccion tipoinfraccion) {
		this.tipoinfraccion = tipoinfraccion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getSancion() {
		return sancion;
	}
	public void setSancion(String sancion) {
		this.sancion = sancion;
	}
	public Legislacion getLegislacion() {
		return legislacion;
	}
	public void setLegislacion(Legislacion legislacion) {
		this.legislacion = legislacion;
	}
	
}
