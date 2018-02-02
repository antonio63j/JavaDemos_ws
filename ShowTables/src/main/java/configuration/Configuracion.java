package configuration;

import java.io.File;
import java.util.Properties;

import javax.sql.DataSource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import tablasxjc.ObjectFactory;
import tablasxjc.Tablas;

@Configuration
@ComponentScan(basePackages = {"core"})
@PropertySource(value = { "classpath:application.properties" })

public class Configuracion {

    @Autowired
    private Environment environment;
	
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
    }
    
    @Bean
    public Tablas tablas () throws JAXBException{
		JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
	    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	    File filexml = new File (environment.getRequiredProperty("tablasfilexml"));
	    Tablas tablas = (Tablas) unmarshaller.unmarshal(filexml);
		return tablas;    	
    }

}

