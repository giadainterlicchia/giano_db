package com.giano.dashboard.service;
import java.util.List;

import com.giano.dashboard.entity.Cliente;
public interface ClienteService {

    Cliente saveCliente(Cliente cliente);
    List<Cliente> fetchClienteList();
    Cliente updateCliente(Cliente cliente, String codicefiscale);
    void deleteClienteById(String codicefiscale);



}

