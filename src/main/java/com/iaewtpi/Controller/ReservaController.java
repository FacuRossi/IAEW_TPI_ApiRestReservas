package com.iaewtpi.Controller;

import com.iaewtpi.ModeloRest.Reserva;
import com.iaewtpi.Service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Facundo on 25/05/2017.
 */
@CrossOrigin
@RestController
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @RequestMapping("/reservas")
    public List<Reserva> getReservas(){
        return reservaService.getReservas();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/reservas")
    public void registrarReserva (@RequestBody Reserva reserva){
        reservaService.add(reserva);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/reservas/{codigo}/{id}")
    public void registrarReserva (@RequestBody Reserva reserva, @PathVariable int codigo, @PathVariable int id){
        Reserva storedReserva = reservaService.findByCodigoAndId(codigo,id);
        storedReserva.setEstado(reserva.getEstado());
        reservaService.add(storedReserva);
    }
}
