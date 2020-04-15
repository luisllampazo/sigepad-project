//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.20 a las 07:41:34 PM COT 
//


package pe.gob.pnp.ig.unitic.informatica.app.wsdl.dirtic.maspol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para maspe complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="maspe"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carnet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="grado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="materno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="especialidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="est_civil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="situacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sit_especial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codofin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ing_escu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="egr_escu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ult_asc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ing_estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sub_unidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="uni_lis_rev" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="retardo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mot_baja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoMensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maspe", propOrder = {
    "carnet",
    "grado",
    "paterno",
    "materno",
    "nombres",
    "especialidad",
    "estCivil",
    "situacion",
    "sitEspecial",
    "codofin",
    "nacimiento",
    "ingEscu",
    "egrEscu",
    "ultAsc",
    "retiro",
    "ingEstado",
    "region",
    "unidad",
    "subUnidad",
    "uniLisRev",
    "retardo",
    "dni",
    "motBaja",
    "sexo",
    "descripcionMensaje",
    "codigoMensaje"
})
public class Maspe {

    protected String carnet;
    protected String grado;
    protected String paterno;
    protected String materno;
    protected String nombres;
    protected String especialidad;
    @XmlElement(name = "est_civil")
    protected String estCivil;
    protected String situacion;
    @XmlElement(name = "sit_especial")
    protected String sitEspecial;
    protected String codofin;
    protected String nacimiento;
    @XmlElement(name = "ing_escu")
    protected String ingEscu;
    @XmlElement(name = "egr_escu")
    protected String egrEscu;
    @XmlElement(name = "ult_asc")
    protected String ultAsc;
    protected String retiro;
    @XmlElement(name = "ing_estado")
    protected String ingEstado;
    protected String region;
    protected String unidad;
    @XmlElement(name = "sub_unidad")
    protected String subUnidad;
    @XmlElement(name = "uni_lis_rev")
    protected String uniLisRev;
    protected String retardo;
    protected String dni;
    @XmlElement(name = "mot_baja")
    protected String motBaja;
    protected String sexo;
    protected String descripcionMensaje;
    protected String codigoMensaje;

    /**
     * Obtiene el valor de la propiedad carnet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * Define el valor de la propiedad carnet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarnet(String value) {
        this.carnet = value;
    }

    /**
     * Obtiene el valor de la propiedad grado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrado() {
        return grado;
    }

    /**
     * Define el valor de la propiedad grado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrado(String value) {
        this.grado = value;
    }

    /**
     * Obtiene el valor de la propiedad paterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaterno() {
        return paterno;
    }

    /**
     * Define el valor de la propiedad paterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaterno(String value) {
        this.paterno = value;
    }

    /**
     * Obtiene el valor de la propiedad materno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterno() {
        return materno;
    }

    /**
     * Define el valor de la propiedad materno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterno(String value) {
        this.materno = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad especialidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Define el valor de la propiedad especialidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecialidad(String value) {
        this.especialidad = value;
    }

    /**
     * Obtiene el valor de la propiedad estCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstCivil() {
        return estCivil;
    }

    /**
     * Define el valor de la propiedad estCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstCivil(String value) {
        this.estCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad situacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacion() {
        return situacion;
    }

    /**
     * Define el valor de la propiedad situacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacion(String value) {
        this.situacion = value;
    }

    /**
     * Obtiene el valor de la propiedad sitEspecial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitEspecial() {
        return sitEspecial;
    }

    /**
     * Define el valor de la propiedad sitEspecial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitEspecial(String value) {
        this.sitEspecial = value;
    }

    /**
     * Obtiene el valor de la propiedad codofin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodofin() {
        return codofin;
    }

    /**
     * Define el valor de la propiedad codofin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodofin(String value) {
        this.codofin = value;
    }

    /**
     * Obtiene el valor de la propiedad nacimiento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacimiento() {
        return nacimiento;
    }

    /**
     * Define el valor de la propiedad nacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacimiento(String value) {
        this.nacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad ingEscu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngEscu() {
        return ingEscu;
    }

    /**
     * Define el valor de la propiedad ingEscu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngEscu(String value) {
        this.ingEscu = value;
    }

    /**
     * Obtiene el valor de la propiedad egrEscu.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgrEscu() {
        return egrEscu;
    }

    /**
     * Define el valor de la propiedad egrEscu.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgrEscu(String value) {
        this.egrEscu = value;
    }

    /**
     * Obtiene el valor de la propiedad ultAsc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUltAsc() {
        return ultAsc;
    }

    /**
     * Define el valor de la propiedad ultAsc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUltAsc(String value) {
        this.ultAsc = value;
    }

    /**
     * Obtiene el valor de la propiedad retiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetiro() {
        return retiro;
    }

    /**
     * Define el valor de la propiedad retiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetiro(String value) {
        this.retiro = value;
    }

    /**
     * Obtiene el valor de la propiedad ingEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngEstado() {
        return ingEstado;
    }

    /**
     * Define el valor de la propiedad ingEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngEstado(String value) {
        this.ingEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidad(String value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad subUnidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubUnidad() {
        return subUnidad;
    }

    /**
     * Define el valor de la propiedad subUnidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubUnidad(String value) {
        this.subUnidad = value;
    }

    /**
     * Obtiene el valor de la propiedad uniLisRev.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniLisRev() {
        return uniLisRev;
    }

    /**
     * Define el valor de la propiedad uniLisRev.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniLisRev(String value) {
        this.uniLisRev = value;
    }

    /**
     * Obtiene el valor de la propiedad retardo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetardo() {
        return retardo;
    }

    /**
     * Define el valor de la propiedad retardo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetardo(String value) {
        this.retardo = value;
    }

    /**
     * Obtiene el valor de la propiedad dni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDni() {
        return dni;
    }

    /**
     * Define el valor de la propiedad dni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDni(String value) {
        this.dni = value;
    }

    /**
     * Obtiene el valor de la propiedad motBaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotBaja() {
        return motBaja;
    }

    /**
     * Define el valor de la propiedad motBaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotBaja(String value) {
        this.motBaja = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionMensaje() {
        return descripcionMensaje;
    }

    /**
     * Define el valor de la propiedad descripcionMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionMensaje(String value) {
        this.descripcionMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMensaje() {
        return codigoMensaje;
    }

    /**
     * Define el valor de la propiedad codigoMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMensaje(String value) {
        this.codigoMensaje = value;
    }

}
