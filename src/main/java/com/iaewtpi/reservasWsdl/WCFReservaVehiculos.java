
package com.iaewtpi.reservasWsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WCFReservaVehiculos", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://romeroruben-001-site1.itempurl.com/WCFReservaVehiculos.svc?singlewsdl")
public class WCFReservaVehiculos
    extends Service
{

    private final static URL WCFRESERVAVEHICULOS_WSDL_LOCATION;
    private final static WebServiceException WCFRESERVAVEHICULOS_EXCEPTION;
    private final static QName WCFRESERVAVEHICULOS_QNAME = new QName("http://tempuri.org/", "WCFReservaVehiculos");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://romeroruben-001-site1.itempurl.com/WCFReservaVehiculos.svc?singlewsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WCFRESERVAVEHICULOS_WSDL_LOCATION = url;
        WCFRESERVAVEHICULOS_EXCEPTION = e;
    }

    public WCFReservaVehiculos() {
        super(__getWsdlLocation(), WCFRESERVAVEHICULOS_QNAME);
    }

    public WCFReservaVehiculos(WebServiceFeature... features) {
        super(__getWsdlLocation(), WCFRESERVAVEHICULOS_QNAME, features);
    }

    public WCFReservaVehiculos(URL wsdlLocation) {
        super(wsdlLocation, WCFRESERVAVEHICULOS_QNAME);
    }

    public WCFReservaVehiculos(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WCFRESERVAVEHICULOS_QNAME, features);
    }

    public WCFReservaVehiculos(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WCFReservaVehiculos(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IWCFReservaVehiculos
     */
    @WebEndpoint(name = "BasicHttpBinding_IWCFReservaVehiculos")
    public IWCFReservaVehiculos getBasicHttpBindingIWCFReservaVehiculos() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IWCFReservaVehiculos"), IWCFReservaVehiculos.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWCFReservaVehiculos
     */
    @WebEndpoint(name = "BasicHttpBinding_IWCFReservaVehiculos")
    public IWCFReservaVehiculos getBasicHttpBindingIWCFReservaVehiculos(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IWCFReservaVehiculos"), IWCFReservaVehiculos.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WCFRESERVAVEHICULOS_EXCEPTION!= null) {
            throw WCFRESERVAVEHICULOS_EXCEPTION;
        }
        return WCFRESERVAVEHICULOS_WSDL_LOCATION;
    }

}
