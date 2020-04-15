package pe.gob.pnp.ig.unitic.informatica.app.models.entity.key;

import java.io.Serializable;

import javax.persistence.Column;

public class ComunicacionClasificacionKey implements Serializable{

	private static final long serialVersionUID = 1L;
	@Column(name = "comunicacion_id")
    Long comunicacionId;
 
    @Column(name = "clasehecho_id")
    Long clasehechoId;

	public Long getComunicacionId() {
		return comunicacionId;
	}

	public void setComunicacionId(Long comunicacionId) {
		this.comunicacionId = comunicacionId;
	}

	public Long getClasehechoId() {
		return clasehechoId;
	}

	public void setClasehechoId(Long clasehechoId) {
		this.clasehechoId = clasehechoId;
	}
    
}
