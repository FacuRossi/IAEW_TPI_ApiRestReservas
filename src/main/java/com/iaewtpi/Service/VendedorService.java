package com.iaewtpi.Service;


import com.iaewtpi.ModeloRest.Vendedor;
import com.iaewtpi.Repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Facundo on 25/05/2017.
 */
@Service
public class VendedorService {
    @Autowired
    private VendedorRepository vendedorRepository;

    public List<Vendedor> getVendedores(){
        List<Vendedor> vendedores = new ArrayList<Vendedor>();
        vendedorRepository.findAll().forEach(vendedores :: add);
        return vendedores;
    }
}
