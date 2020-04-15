package pe.gob.pnp.ig.unitic.informatica.app.wsdl.client.gateway;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import pe.gob.pnp.ig.unitic.informatica.app.wsdl.dirtic.maspol.ConsultarPorCIP;
import pe.gob.pnp.ig.unitic.informatica.app.wsdl.dirtic.maspol.ConsultarPorCIPResponse;
import pe.gob.pnp.ig.unitic.informatica.app.wsdl.dirtic.maspol.ConsultarPorDNI;
import pe.gob.pnp.ig.unitic.informatica.app.wsdl.dirtic.maspol.ConsultarPorDNIResponse;
import pe.gob.pnp.ig.unitic.informatica.app.wsdl.dirtic.maspol.ConsultarPorNombrePaternoMaterno;
import pe.gob.pnp.ig.unitic.informatica.app.wsdl.dirtic.maspol.ConsultarPorNombrePaternoMaternoResponse;

@Service
public class MaspolDirticClient {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	  public ConsultarPorCIPResponse getPersonalbyCip(String personalCip){
		  ConsultarPorCIP request = new ConsultarPorCIP();
		  request.setInCip(personalCip);
		  request.setClienteUsuario("PNP_INSPECTORIA");
		  request.setClienteClave("123456");
		  request.setServicioCodigo("WS_MASPOL");
		  request.setClienteSistema("SIGEPAD-PRUEBAS");
		  request.setClienteIp("172.31.219.252");
		  request.setClienteMac("E0-4F-43-E3-5E-E9");
		  request.setNroDocUserClieFin("43795932");
		  request.setTipoDocUserClieFin("2");
		  template = new WebServiceTemplate(marshaller);
		  @SuppressWarnings("unchecked")
		JAXBElement<ConsultarPorCIPResponse >personal = (JAXBElement<ConsultarPorCIPResponse>) template.marshalSendAndReceive("http://172.31.1.168:7011/ServicioMaspeImpl/ServicioMaspeImplService",request);
		return personal.getValue();
		  
	  }
	  public ConsultarPorDNIResponse getPersonalbyDni(String personalDni){
		  ConsultarPorDNI request = new ConsultarPorDNI();
		  request.setInDni(personalDni);
		  request.setClienteUsuario("PNP_INSPECTORIA");
		  request.setClienteClave("123456");
		  request.setServicioCodigo("WS_MASPOL");
		  request.setClienteSistema("SIGEPAD-PRUEBAS");
		  request.setClienteIp("172.31.219.252");
		  request.setClienteMac("E0-4F-43-E3-5E-E9");
		  request.setNroDocUserClieFin("43795932");
		  request.setTipoDocUserClieFin("2");
		  template = new WebServiceTemplate(marshaller);
		  @SuppressWarnings("unchecked")
		JAXBElement<ConsultarPorDNIResponse >personal = (JAXBElement<ConsultarPorDNIResponse>) template.marshalSendAndReceive("http://172.31.1.168:7011/ServicioMaspeImpl/ServicioMaspeImplService",request);
		return personal.getValue();
		  
	  }
	  public ConsultarPorNombrePaternoMaternoResponse getPersonalbyNPM(String nombre, String paterno, String materno){
		  ConsultarPorNombrePaternoMaterno request = new ConsultarPorNombrePaternoMaterno();
		  request.setInNombre(nombre);
		  request.setInPaterno(paterno);
		  request.setInMaterno(materno);
		  request.setClienteUsuario("PNP_INSPECTORIA");
		  request.setClienteClave("123456");
		  request.setServicioCodigo("WS_MASPOL");
		  request.setClienteSistema("SIGEPAD-PRUEBAS");
		  request.setClienteIp("172.31.219.252");
		  request.setClienteMac("E0-4F-43-E3-5E-E9");
		  request.setNroDocUserClieFin("43795932");
		  request.setTipoDocUserClieFin("2");
		  template = new WebServiceTemplate(marshaller);
		  @SuppressWarnings("unchecked")
		JAXBElement<ConsultarPorNombrePaternoMaternoResponse >personal = (JAXBElement<ConsultarPorNombrePaternoMaternoResponse>) template.marshalSendAndReceive("http://172.31.1.168:7011/ServicioMaspeImpl/ServicioMaspeImplService",request);
		return personal.getValue();
		  
	  }
}
