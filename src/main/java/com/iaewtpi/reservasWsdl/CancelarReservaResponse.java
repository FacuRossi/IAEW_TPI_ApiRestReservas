
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
 *         &lt;element name="CancelarReservaResult" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities}CancelarReservaResponse" minOccurs="0"/>
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
    "cancelarReservaResult"
})
@XmlRootElement(name = "CancelarReservaResponse", namespace = "http://tempuri.org/")
public class CancelarReservaResponse {

    @XmlElementRef(name = "CancelarReservaResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CancelarReservaResponse2> cancelarReservaResult;

    /**
     * Gets the value of the cancelarReservaResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CancelarReservaResponse2 }{@code >}
     *     
     */
    public JAXBElement<CancelarReservaResponse2> getCancelarReservaResult() {
        return cancelarReservaResult;
    }

    /**
     * Sets the value of the cancelarReservaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CancelarReservaResponse2 }{@code >}
     *     
     */
    public void setCancelarReservaResult(JAXBElement<CancelarReservaResponse2> value) {
        this.cancelarReservaResult = value;
    }

}
