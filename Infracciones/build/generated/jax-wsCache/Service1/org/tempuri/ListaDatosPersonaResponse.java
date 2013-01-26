
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.servicegenes.Persona;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaDatosPersonaResult" type="{http://schemas.datacontract.org/2004/07/ServiceGenes}Persona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listaDatosPersonaResult"
})
@XmlRootElement(name = "listaDatosPersonaResponse")
public class ListaDatosPersonaResponse {

    @XmlElementRef(name = "listaDatosPersonaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Persona> listaDatosPersonaResult;

    /**
     * Obtiene el valor de la propiedad listaDatosPersonaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Persona }{@code >}
     *     
     */
    public JAXBElement<Persona> getListaDatosPersonaResult() {
        return listaDatosPersonaResult;
    }

    /**
     * Define el valor de la propiedad listaDatosPersonaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Persona }{@code >}
     *     
     */
    public void setListaDatosPersonaResult(JAXBElement<Persona> value) {
        this.listaDatosPersonaResult = value;
    }

}
