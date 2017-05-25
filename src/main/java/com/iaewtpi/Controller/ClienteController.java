package com.iaewtpi.Controller;

import com.iaewtpi.Model.Cliente;
import com.iaewtpi.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Facundo on 25/05/2017.
 */
@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @RequestMapping("/clientes")
    public List<Cliente> getClientes(){
        return clienteService.getClientes();
    }

}
