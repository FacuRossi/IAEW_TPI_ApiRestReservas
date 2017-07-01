
package com.iaewtpi.reservasWsdl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "StatusResponse", targetNamespace = "http://schemas.datacontract.org/2004/07/WCFReservaVehiculos.Business.ExceptionHandling")
public class IWCFReservaVehiculosConsultarPaisesStatusResponseFaultFaultMessage
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private StatusResponse faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IWCFReservaVehiculosConsultarPaisesStatusResponseFaultFaultMessage(String message, StatusResponse faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IWCFReservaVehiculosConsultarPaisesStatusResponseFaultFaultMessage(String message, StatusResponse faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.iaewtpi.reservasWsdl.StatusResponse
     */
    public StatusResponse getFaultInfo() {
        return faultInfo;
    }

}
