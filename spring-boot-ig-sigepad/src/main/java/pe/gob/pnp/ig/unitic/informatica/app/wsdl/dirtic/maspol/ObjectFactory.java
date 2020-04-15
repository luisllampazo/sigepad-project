//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.02.20 a las 07:41:34 PM COT 
//


package pe.gob.pnp.ig.unitic.informatica.app.wsdl.dirtic.maspol;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.consumingwebservice.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarPorCIP_QNAME = new QName("http://service.maspe.sgws.pnp.gob.pe/", "consultarPorCIP");
    private final static QName _ConsultarPorCIPResponse_QNAME = new QName("http://service.maspe.sgws.pnp.gob.pe/", "consultarPorCIPResponse");
    private final static QName _ConsultarPorDNI_QNAME = new QName("http://service.maspe.sgws.pnp.gob.pe/", "consultarPorDNI");
    private final static QName _ConsultarPorDNIResponse_QNAME = new QName("http://service.maspe.sgws.pnp.gob.pe/", "consultarPorDNIResponse");
    private final static QName _ConsultarPorNombrePaternoMaterno_QNAME = new QName("http://service.maspe.sgws.pnp.gob.pe/", "consultarPorNombrePaternoMaterno");
    private final static QName _ConsultarPorNombrePaternoMaternoResponse_QNAME = new QName("http://service.maspe.sgws.pnp.gob.pe/", "consultarPorNombrePaternoMaternoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.consumingwebservice.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarPorCIP }
     * 
     */
    public ConsultarPorCIP createConsultarPorCIP() {
        return new ConsultarPorCIP();
    }

    /**
     * Create an instance of {@link ConsultarPorCIPResponse }
     * 
     */
    public ConsultarPorCIPResponse createConsultarPorCIPResponse() {
        return new ConsultarPorCIPResponse();
    }

    /**
     * Create an instance of {@link ConsultarPorDNI }
     * 
     */
    public ConsultarPorDNI createConsultarPorDNI() {
        return new ConsultarPorDNI();
    }

    /**
     * Create an instance of {@link ConsultarPorDNIResponse }
     * 
     */
    public ConsultarPorDNIResponse createConsultarPorDNIResponse() {
        return new ConsultarPorDNIResponse();
    }

    /**
     * Create an instance of {@link ConsultarPorNombrePaternoMaterno }
     * 
     */
    public ConsultarPorNombrePaternoMaterno createConsultarPorNombrePaternoMaterno() {
        return new ConsultarPorNombrePaternoMaterno();
    }

    /**
     * Create an instance of {@link ConsultarPorNombrePaternoMaternoResponse }
     * 
     */
    public ConsultarPorNombrePaternoMaternoResponse createConsultarPorNombrePaternoMaternoResponse() {
        return new ConsultarPorNombrePaternoMaternoResponse();
    }

    /**
     * Create an instance of {@link Maspe }
     * 
     */
    public Maspe createMaspe() {
        return new Maspe();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPorCIP }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarPorCIP }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.maspe.sgws.pnp.gob.pe/", name = "consultarPorCIP")
    public JAXBElement<ConsultarPorCIP> createConsultarPorCIP(ConsultarPorCIP value) {
        return new JAXBElement<ConsultarPorCIP>(_ConsultarPorCIP_QNAME, ConsultarPorCIP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPorCIPResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarPorCIPResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.maspe.sgws.pnp.gob.pe/", name = "consultarPorCIPResponse")
    public JAXBElement<ConsultarPorCIPResponse> createConsultarPorCIPResponse(ConsultarPorCIPResponse value) {
        return new JAXBElement<ConsultarPorCIPResponse>(_ConsultarPorCIPResponse_QNAME, ConsultarPorCIPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPorDNI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarPorDNI }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.maspe.sgws.pnp.gob.pe/", name = "consultarPorDNI")
    public JAXBElement<ConsultarPorDNI> createConsultarPorDNI(ConsultarPorDNI value) {
        return new JAXBElement<ConsultarPorDNI>(_ConsultarPorDNI_QNAME, ConsultarPorDNI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPorDNIResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarPorDNIResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.maspe.sgws.pnp.gob.pe/", name = "consultarPorDNIResponse")
    public JAXBElement<ConsultarPorDNIResponse> createConsultarPorDNIResponse(ConsultarPorDNIResponse value) {
        return new JAXBElement<ConsultarPorDNIResponse>(_ConsultarPorDNIResponse_QNAME, ConsultarPorDNIResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPorNombrePaternoMaterno }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarPorNombrePaternoMaterno }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.maspe.sgws.pnp.gob.pe/", name = "consultarPorNombrePaternoMaterno")
    public JAXBElement<ConsultarPorNombrePaternoMaterno> createConsultarPorNombrePaternoMaterno(ConsultarPorNombrePaternoMaterno value) {
        return new JAXBElement<ConsultarPorNombrePaternoMaterno>(_ConsultarPorNombrePaternoMaterno_QNAME, ConsultarPorNombrePaternoMaterno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPorNombrePaternoMaternoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultarPorNombrePaternoMaternoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.maspe.sgws.pnp.gob.pe/", name = "consultarPorNombrePaternoMaternoResponse")
    public JAXBElement<ConsultarPorNombrePaternoMaternoResponse> createConsultarPorNombrePaternoMaternoResponse(ConsultarPorNombrePaternoMaternoResponse value) {
        return new JAXBElement<ConsultarPorNombrePaternoMaternoResponse>(_ConsultarPorNombrePaternoMaternoResponse_QNAME, ConsultarPorNombrePaternoMaternoResponse.class, null, value);
    }

}
