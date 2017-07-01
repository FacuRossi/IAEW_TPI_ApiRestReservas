package com.iaewtpi.Repository;

import com.iaewtpi.ModeloRest.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Facundo on 25/05/2017.
 */
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
