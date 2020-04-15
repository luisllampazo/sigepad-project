package pe.gob.pnp.ig.unitic.informatica.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class WebServiceConfiguration {
	@Bean
	  public Jaxb2Marshaller marshaller() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	    //marshaller.setPackagesToScan("pe.pnp.ig.unitic.informatica.app.wsdl.maspol");
	    marshaller.setPackagesToScan("pe.gob.pnp.ig.unitic.informatica.app.wsdl.dirtic.maspol");
	    return marshaller;
	  }
}
