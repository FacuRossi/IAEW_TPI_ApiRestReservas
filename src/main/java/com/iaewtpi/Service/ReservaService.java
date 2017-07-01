package com.iaewtpi.Service;


import com.iaewtpi.ModeloRest.Reserva;
import com.iaewtpi.Repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facundo on 25/05/2017.
 */
@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> getReservas(){
        List<Reserva> reserva = new ArrayList<Reserva>();
        reservaRepository.findAll().forEach(reserva :: add);
        return reserva;
    }
}
