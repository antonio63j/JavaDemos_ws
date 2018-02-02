

import java.io.File;

import javax.sql.DataSource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.Configuracion;

import core.TableControl;
import tablasxjc.ObjectFactory;
import tablasxjc.Tablas;

public class Test2 {

	public static void main(String[] args) throws JAXBException {
		
		JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
	    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	    File filexml = new File ("tablas.xml");
	    Tablas tablas = (Tablas) unmarshaller.unmarshal(filexml);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
		TableControl tb  = context.getBean(TableControl.class);  
				
		try {
			
		
		tb.conectar();
		tb.muestraCabeceras("employee");
		tb.desconectar();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
