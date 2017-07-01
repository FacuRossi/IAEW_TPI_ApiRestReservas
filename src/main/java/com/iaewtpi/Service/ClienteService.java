package com.iaewtpi.Service;


import com.iaewtpi.ModeloRest.Cliente;
import com.iaewtpi.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facundo on 25/05/2017.
 */
@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getClientes(){
        List<Cliente> clientes = new ArrayList<Cliente>();
        clienteRepository.findAll().forEach(clientes :: add);
        return clientes;
    }
}
