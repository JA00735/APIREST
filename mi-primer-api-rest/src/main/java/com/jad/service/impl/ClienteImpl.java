package com.jad.service.impl;

import com.jad.model.dao.ClienteDao;
import com.jad.model.entity.Cliente;
import com.jad.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteImpl implements ICliente {

    @Autowired
    private ClienteDao clienteDao;
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);

    }
}
