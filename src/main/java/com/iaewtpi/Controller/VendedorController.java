package com.iaewtpi.Controller;

import com.iaewtpi.ModeloRest.Vendedor;
import com.iaewtpi.Service.VendedorService;
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
public class VendedorController {
    @Autowired
    private VendedorService vendedorService;

    @RequestMapping("/vendedores")
    public List<Vendedor> getVendedores(){
        return vendedorService.getVendedores();
    }
}
