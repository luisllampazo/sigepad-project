package pe.gob.pnp.ig.unitic.informatica.app.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import pe.gob.pnp.ig.unitic.informatica.app.models.entity.master.Grado;

@Entity
@Table(name="administrado")
public class Administrado  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String cip; 
	private String dni;
	private String nombre;
	private String apepat;
	private String apemat;
	private Grado grado;
	private UnidadPNP unidad;
	public String getCip() {
		return cip;
	}
	public void setCip(String cip) {
		this.cip = cip;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public Grado getGrado() {
		return grado;
	}
	public void setGrado(Grado grado) {
		this.grado = grado;
	}
	public UnidadPNP getUnidad() {
		return unidad;
	}
	public void setUnidad(UnidadPNP unidad) {
		this.unidad = unidad;
	}
	
}
