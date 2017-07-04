package com.iaewtpi.Controller;

import com.iaewtpi.ConsumoSoap.consumoSoap;
import com.iaewtpi.ModeloRest.ReservaSoap;
import com.iaewtpi.reservasWsdl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.util.resources.cldr.id.CurrencyNames_id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facundo on 01/07/2017.
 */
@CrossOrigin
@RestController
public class SoapController {
    @Autowired
    consumoSoap client;

    @RequestMapping(method = RequestMethod.GET , value = "/paises")
    public List<PaisEntity> getPaises () throws IWCFReservaVehiculosConsultarPaisesStatusResponseFaultFaultMessage {
        List<PaisEntity> paises = new ArrayList<PaisEntity>();
        for (PaisEntity item : client.getPaises().getValue().getPaisEntity()){
            paises.add(item);
        }
        return paises;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/ciudades/{id}")
    public List<CiudadEntity> getCiudades (@PathVariable int id) throws IWCFReservaVehiculosConsultarCiudadesStatusResponseFaultFaultMessage {
        List<CiudadEntity> ciudades = new ArrayList<CiudadEntity>();
        for (CiudadEntity item : client.getCuidades(id).getValue().getCiudadEntity()){
            ciudades.add(item);
        }
        return ciudades;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/vehiculosDisp/{id}")
    public List<VehiculoModel> getVehiculosDisp (@PathVariable int id) throws IWCFReservaVehiculosConsultarVehiculosDisponiblesStatusResponseFaultFaultMessage {
        List<VehiculoModel> vehiculos = new ArrayList<VehiculoModel>();
        for (VehiculoModel item : client.getVehiculosDisp(id).getValue().getVehiculoModel()){
            vehiculos.add(item);
        }
        return vehiculos;
    }

    @RequestMapping(method = RequestMethod.GET , value = "/reservasList")
    public List<ReservaEntity> getReservas () throws IWCFReservaVehiculosConsultarReservasStatusResponseFaultFaultMessage {
        List<ReservaEntity> reservas = new ArrayList<ReservaEntity>();
        for (ReservaEntity item : client.getReservas().getValue().getReservaEntity()){
            reservas.add(item);
        }
        return reservas;
    }

    @RequestMapping(method = RequestMethod.POST , value = "/reservaSoap")
    public void newReservas (@RequestBody ReservaEntity reserva) throws IWCFReservaVehiculosReservarVehiculoStatusResponseFaultFaultMessage {
        client.setReserva(reserva);
    }

}
