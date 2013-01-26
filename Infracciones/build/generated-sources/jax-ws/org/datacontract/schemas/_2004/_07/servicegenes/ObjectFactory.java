
package org.datacontract.schemas._2004._07.servicegenes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.servicegenes package. 
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

    private final static QName _CompositeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceGenes", "CompositeType");
    private final static QName _Persona_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceGenes", "Persona");
    private final static QName _CompositeTypeStringValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceGenes", "StringValue");
    private final static QName _PersonaVNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceGenes", "v_nombre");
    private final static QName _PersonaVFecNac_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceGenes", "v_fec_nac");
    private final static QName _PersonaVDni_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceGenes", "v_dni");
    private final static QName _PersonaVDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceGenes", "v_direccion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.servicegenes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link CompositeType }
     * 
     */
    public CompositeType createCompositeType() {
        return new CompositeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceGenes", name = "CompositeType")
    public JAXBElement<CompositeType> createCompositeType(CompositeType value) {
        return new JAXBElement<CompositeType>(_CompositeType_QNAME, CompositeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceGenes", name = "Persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceGenes", name = "StringValue", scope = CompositeType.class)
    public JAXBElement<String> createCompositeTypeStringValue(String value) {
        return new JAXBElement<String>(_CompositeTypeStringValue_QNAME, String.class, CompositeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceGenes", name = "v_nombre", scope = Persona.class)
    public JAXBElement<String> createPersonaVNombre(String value) {
        return new JAXBElement<String>(_PersonaVNombre_QNAME, String.class, Persona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceGenes", name = "v_fec_nac", scope = Persona.class)
    public JAXBElement<String> createPersonaVFecNac(String value) {
        return new JAXBElement<String>(_PersonaVFecNac_QNAME, String.class, Persona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceGenes", name = "v_dni", scope = Persona.class)
    public JAXBElement<String> createPersonaVDni(String value) {
        return new JAXBElement<String>(_PersonaVDni_QNAME, String.class, Persona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceGenes", name = "v_direccion", scope = Persona.class)
    public JAXBElement<String> createPersonaVDireccion(String value) {
        return new JAXBElement<String>(_PersonaVDireccion_QNAME, String.class, Persona.class, value);
    }

}
