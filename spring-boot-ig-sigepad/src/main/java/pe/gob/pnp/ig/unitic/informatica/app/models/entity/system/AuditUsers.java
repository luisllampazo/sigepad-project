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
@Table(name="audit_users")
public class AuditUsers implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private User user;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date conecteddate;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date disconecteddate;
	private String ipclient;
	
	public String getIpclient() {
		return ipclient;
	}
	public void setIpclient(String ipclient) {
		this.ipclient = ipclient;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getConecteddate() {
		return conecteddate;
	}
	public void setConecteddate(Date conecteddate) {
		this.conecteddate = conecteddate;
	}
	public Date getDisconecteddate() {
		return disconecteddate;
	}
	public void setDisconecteddate(Date disconecteddate) {
		this.disconecteddate = disconecteddate;
	}
	
}
