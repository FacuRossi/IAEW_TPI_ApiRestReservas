
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
 *         &lt;element name="ConsultarReservasResult" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities}ConsultarReservasResponse" minOccurs="0"/>
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
    "consultarReservasResult"
})
@XmlRootElement(name = "ConsultarReservasResponse", namespace = "http://tempuri.org/")
public class ConsultarReservasResponse {

    @XmlElementRef(name = "ConsultarReservasResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ConsultarReservasResponse2> consultarReservasResult;

    /**
     * Gets the value of the consultarReservasResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ConsultarReservasResponse2 }{@code >}
     *     
     */
    public JAXBElement<ConsultarReservasResponse2> getConsultarReservasResult() {
        return consultarReservasResult;
    }

    /**
     * Sets the value of the consultarReservasResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ConsultarReservasResponse2 }{@code >}
     *     
     */
    public void setConsultarReservasResult(JAXBElement<ConsultarReservasResponse2> value) {
        this.consultarReservasResult = value;
    }

}
