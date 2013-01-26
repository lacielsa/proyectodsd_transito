
package org.datacontract.schemas._2004._07.servicegenes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Persona complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Persona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="v_direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v_dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v_fec_nac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="v_nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Persona", propOrder = {
    "vDireccion",
    "vDni",
    "vFecNac",
    "vNombre"
})
public class Persona {

    @XmlElementRef(name = "v_direccion", namespace = "http://schemas.datacontract.org/2004/07/ServiceGenes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vDireccion;
    @XmlElementRef(name = "v_dni", namespace = "http://schemas.datacontract.org/2004/07/ServiceGenes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vDni;
    @XmlElementRef(name = "v_fec_nac", namespace = "http://schemas.datacontract.org/2004/07/ServiceGenes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vFecNac;
    @XmlElementRef(name = "v_nombre", namespace = "http://schemas.datacontract.org/2004/07/ServiceGenes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vNombre;

    /**
     * Obtiene el valor de la propiedad vDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVDireccion() {
        return vDireccion;
    }

    /**
     * Define el valor de la propiedad vDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVDireccion(JAXBElement<String> value) {
        this.vDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad vDni.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVDni() {
        return vDni;
    }

    /**
     * Define el valor de la propiedad vDni.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVDni(JAXBElement<String> value) {
        this.vDni = value;
    }

    /**
     * Obtiene el valor de la propiedad vFecNac.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVFecNac() {
        return vFecNac;
    }

    /**
     * Define el valor de la propiedad vFecNac.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVFecNac(JAXBElement<String> value) {
        this.vFecNac = value;
    }

    /**
     * Obtiene el valor de la propiedad vNombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVNombre() {
        return vNombre;
    }

    /**
     * Define el valor de la propiedad vNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVNombre(JAXBElement<String> value) {
        this.vNombre = value;
    }

}
