//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.16 a las 01:19:17 AM CEST 
//


package tablasxjc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tablasxjc package. 
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

    private final static QName _TablasTablaCampoCarrelleno_QNAME = new QName("", "carrelleno");
    private final static QName _TablasTablaCampoTmn_QNAME = new QName("", "tmn");
    private final static QName _TablasTablaCampoPosicionrelleno_QNAME = new QName("", "posicionrelleno");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tablasxjc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Tablas }
     * 
     */
    public Tablas createTablas() {
        return new Tablas();
    }

    /**
     * Create an instance of {@link Tablas.Tabla }
     * 
     */
    public Tablas.Tabla createTablasTabla() {
        return new Tablas.Tabla();
    }

    /**
     * Create an instance of {@link Tablas.Tabla.Campo }
     * 
     */
    public Tablas.Tabla.Campo createTablasTablaCampo() {
        return new Tablas.Tabla.Campo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "carrelleno", scope = Tablas.Tabla.Campo.class)
    public JAXBElement<String> createTablasTablaCampoCarrelleno(String value) {
        return new JAXBElement<String>(_TablasTablaCampoCarrelleno_QNAME, String.class, Tablas.Tabla.Campo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tmn", scope = Tablas.Tabla.Campo.class)
    public JAXBElement<Short> createTablasTablaCampoTmn(Short value) {
        return new JAXBElement<Short>(_TablasTablaCampoTmn_QNAME, Short.class, Tablas.Tabla.Campo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posicionrelleno", scope = Tablas.Tabla.Campo.class)
    public JAXBElement<String> createTablasTablaCampoPosicionrelleno(String value) {
        return new JAXBElement<String>(_TablasTablaCampoPosicionrelleno_QNAME, String.class, Tablas.Tabla.Campo.class, value);
    }

}
