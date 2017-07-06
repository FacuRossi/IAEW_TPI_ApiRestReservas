package com.iaewtpi.ConsumoSoap;


import com.iaewtpi.reservasWsdl.*;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;

/**
 * Created by Facundo on 28/06/2017.
 */
@Component
public class consumoSoap {

    private WCFReservaVehiculos wsReservas;

    private IWCFReservaVehiculos client;

    public consumoSoap() {
        this.wsReservas = new WCFReservaVehiculos();
        this.client = wsReservas.getBasicHttpBindingIWCFReservaVehiculos();
    }

    public JAXBElement<ArrayOfPaisEntity> getPaises () throws IWCFReservaVehiculosConsultarPaisesStatusResponseFaultFaultMessage {
        ConsultarPaisesResponse2 response = client.consultarPaises();
        return response.getPaises();
    }

    public JAXBElement<ArrayOfCiudadEntity> getCuidades (int id) throws IWCFReservaVehiculosConsultarCiudadesStatusResponseFaultFaultMessage {
        ConsultarCiudadesRequest request = new ConsultarCiudadesRequest();
        request.setIdPais(id);
        ConsultarCiudadesResponse2 response = client.consultarCiudades(request);
        return response.getCiudades();
    }

    public JAXBElement<ArrayOfVehiculoModel> getVehiculosDisp (int id) throws IWCFReservaVehiculosConsultarVehiculosDisponiblesStatusResponseFaultFaultMessage {
        ConsultarVehiculosRequest request = new ConsultarVehiculosRequest();
        request.setIdCiudad(id);
        ConsultarVehiculosDisponiblesResponse2 response = client.consultarVehiculosDisponibles(request);
        return response.getVehiculosEncontrados();
    }

    public JAXBElement<ArrayOfReservaEntity> getReservas () throws IWCFReservaVehiculosConsultarReservasStatusResponseFaultFaultMessage {
        ConsultarReservasRequest request = new ConsultarReservasRequest();
        ConsultarReservasResponse2 response = client.consultarReservas(request);
        return response.getReservas();
    }

    public void setReserva(String cliente,String dni, Integer id) throws IWCFReservaVehiculosReservarVehiculoStatusResponseFaultFaultMessage {
        ObjectFactory fact = new ObjectFactory();
        ReservarVehiculoRequest newReserva =fact.createReservarVehiculoRequest();
        newReserva.setApellidoNombreCliente(fact.createReservarVehiculoRequestApellidoNombreCliente(cliente));
        newReserva.setNroDocumentoCliente(fact.createReservarVehiculoRequestNroDocumentoCliente(dni));
        newReserva.setIdVehiculoCiudad(id);
        client.reservarVehiculo(newReserva);
    }

}
