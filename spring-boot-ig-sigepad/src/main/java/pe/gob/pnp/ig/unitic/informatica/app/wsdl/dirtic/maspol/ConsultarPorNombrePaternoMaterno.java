//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.20 a las 07:41:34 PM COT 
//


package pe.gob.pnp.ig.unitic.informatica.app.wsdl.dirtic.maspol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultarPorNombrePaternoMaterno complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultarPorNombrePaternoMaterno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clienteUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clienteClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servicioCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clienteSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clienteIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clienteMac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocUserClieFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroDocUserClieFin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarPorNombrePaternoMaterno", propOrder = {
    "clienteUsuario",
    "clienteClave",
    "servicioCodigo",
    "clienteSistema",
    "clienteIp",
    "clienteMac",
    "tipoDocUserClieFin",
    "nroDocUserClieFin",
    "inNombre",
    "inPaterno",
    "inMaterno"
})
@XmlRootElement(name = "consultarPorNombrePaternoMaterno")
public class ConsultarPorNombrePaternoMaterno {

    protected String clienteUsuario;
    protected String clienteClave;
    protected String servicioCodigo;
    protected String clienteSistema;
    protected String clienteIp;
    protected String clienteMac;
    protected String tipoDocUserClieFin;
    protected String nroDocUserClieFin;
    protected String inNombre;
    protected String inPaterno;
    protected String inMaterno;

    /**
     * Obtiene el valor de la propiedad clienteUsuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteUsuario() {
        return clienteUsuario;
    }

    /**
     * Define el valor de la propiedad clienteUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteUsuario(String value) {
        this.clienteUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteClave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteClave() {
        return clienteClave;
    }

    /**
     * Define el valor de la propiedad clienteClave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteClave(String value) {
        this.clienteClave = value;
    }

    /**
     * Obtiene el valor de la propiedad servicioCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicioCodigo() {
        return servicioCodigo;
    }

    /**
     * Define el valor de la propiedad servicioCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicioCodigo(String value) {
        this.servicioCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteSistema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteSistema() {
        return clienteSistema;
    }

    /**
     * Define el valor de la propiedad clienteSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteSistema(String value) {
        this.clienteSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteIp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteIp() {
        return clienteIp;
    }

    /**
     * Define el valor de la propiedad clienteIp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteIp(String value) {
        this.clienteIp = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteMac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteMac() {
        return clienteMac;
    }

    /**
     * Define el valor de la propiedad clienteMac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteMac(String value) {
        this.clienteMac = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocUserClieFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocUserClieFin() {
        return tipoDocUserClieFin;
    }

    /**
     * Define el valor de la propiedad tipoDocUserClieFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocUserClieFin(String value) {
        this.tipoDocUserClieFin = value;
    }

    /**
     * Obtiene el valor de la propiedad nroDocUserClieFin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroDocUserClieFin() {
        return nroDocUserClieFin;
    }

    /**
     * Define el valor de la propiedad nroDocUserClieFin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroDocUserClieFin(String value) {
        this.nroDocUserClieFin = value;
    }

    /**
     * Obtiene el valor de la propiedad inNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInNombre() {
        return inNombre;
    }

    /**
     * Define el valor de la propiedad inNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInNombre(String value) {
        this.inNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad inPaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInPaterno() {
        return inPaterno;
    }

    /**
     * Define el valor de la propiedad inPaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInPaterno(String value) {
        this.inPaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad inMaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMaterno() {
        return inMaterno;
    }

    /**
     * Define el valor de la propiedad inMaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMaterno(String value) {
        this.inMaterno = value;
    }

}
