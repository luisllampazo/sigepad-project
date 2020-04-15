package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoInfraccion;

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
	@ManyToOne(fetch = FetchType.LAZY)
	private TipoInfraccion tipoinfraccion;
	@ManyToOne(fetch = FetchType.LAZY)
	private Legislacion legislacion;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "infraccion_clasehecho")
	private List<Clasehecho> clasehecho;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="infraccion_id")
	private List<AdministradoInfraccion> Investigadoinfraccion;
	
	
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
