package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.key.ComunicacionClasificacionKey;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.system.Personal;

@Entity
public class ComunicacionClasificacion {

	@EmbeddedId
    ComunicacionClasificacionKey id;
 
    @ManyToOne
    @MapsId("comunicacion_id")
    @JoinColumn(name = "comunicacion_id")
    Comunicacion comunicacion;
 
    @ManyToOne
    @MapsId("clasehecho_id")
    @JoinColumn(name = "clasehecho_id")
    Clasehecho clasehecho;
    
    private Boolean principal;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Personal appendedBy;
	public ComunicacionClasificacionKey getId() {
		return id;
	}
	public void setId(ComunicacionClasificacionKey id) {
		this.id = id;
	}
	public Comunicacion getComunicacion() {
		return comunicacion;
	}
	public void setComunicacion(Comunicacion comunicacion) {
		this.comunicacion = comunicacion;
	}
	public Clasehecho getClasehecho() {
		return clasehecho;
	}
	public void setClasehecho(Clasehecho clasehecho) {
		this.clasehecho = clasehecho;
	}
	public Boolean getPrincipal() {
		return principal;
	}
	public void setPrincipal(Boolean principal) {
		this.principal = principal;
	}
	public Personal getAppendedBy() {
		return appendedBy;
	}
	public void setAppendedBy(Personal appendedBy) {
		this.appendedBy = appendedBy;
	}
    
}
