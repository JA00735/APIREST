package com.jad.service;

import com.jad.model.entity.Cliente;

public interface ICliente {

    Cliente save (Cliente cliente);

    Cliente findById (Integer id);

    void delete (Cliente cliente);


}
