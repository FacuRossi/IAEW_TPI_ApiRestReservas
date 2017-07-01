
package com.iaewtpi.reservasWsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultarPaisesResult" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities}ConsultarPaisesResponse" minOccurs="0"/>
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
    "consultarPaisesResult"
})
@XmlRootElement(name = "ConsultarPaisesResponse", namespace = "http://tempuri.org/")
public class ConsultarPaisesResponse {

    @XmlElementRef(name = "ConsultarPaisesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsultarPaisesResponse2> consultarPaisesResult;

    /**
     * Gets the value of the consultarPaisesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsultarPaisesResponse2 }{@code >}
     *     
     */
    public JAXBElement<ConsultarPaisesResponse2> getConsultarPaisesResult() {
        return consultarPaisesResult;
    }

    /**
     * Sets the value of the consultarPaisesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsultarPaisesResponse2 }{@code >}
     *     
     */
    public void setConsultarPaisesResult(JAXBElement<ConsultarPaisesResponse2> value) {
        this.consultarPaisesResult = value;
    }

}
