package com.iaewtpi.Controller;

import com.iaewtpi.ModeloRest.Reserva;
import com.iaewtpi.Service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Facundo on 25/05/2017.
 */
@CrossOrigin
@RestController
public class ReservaController {

    @Autowired
    private ReservaService reservaService;
//    @Autowired
//    private ClienteService clienteService;
//    @Autowired
//    private VendedorService vendedorService;

    @RequestMapping("/reservas")
    public List<Reserva> getReservas(){
        return reservaService.getReservas();
    }
}
