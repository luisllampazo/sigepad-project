package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.TipoContacto;

@Entity
@Table(name = "comunicaciondenunciante_contacto")
public class ComunicacionDenuncianteContacto implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private ComunicacionDenunciante comunicaciondenunciante;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private TipoContacto tipocontacto;
	private String contacto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public TipoContacto getTipocontacto() {
		return tipocontacto;
	}
	public void setTipocontacto(TipoContacto tipocontacto) {
		this.tipocontacto = tipocontacto;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
}
