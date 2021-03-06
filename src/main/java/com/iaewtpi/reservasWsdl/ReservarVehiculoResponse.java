
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
 *         &lt;element name="ReservarVehiculoResult" type="{http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.Entities}ReservarVehiculoResponse" minOccurs="0"/>
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
    "reservarVehiculoResult"
})
@XmlRootElement(name = "ReservarVehiculoResponse", namespace = "http://tempuri.org/")
public class ReservarVehiculoResponse {

    @XmlElementRef(name = "ReservarVehiculoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReservarVehiculoResponse2> reservarVehiculoResult;

    /**
     * Gets the value of the reservarVehiculoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReservarVehiculoResponse2 }{@code >}
     *     
     */
    public JAXBElement<ReservarVehiculoResponse2> getReservarVehiculoResult() {
        return reservarVehiculoResult;
    }

    /**
     * Sets the value of the reservarVehiculoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReservarVehiculoResponse2 }{@code >}
     *     
     */
    public void setReservarVehiculoResult(JAXBElement<ReservarVehiculoResponse2> value) {
        this.reservarVehiculoResult = value;
    }

}
