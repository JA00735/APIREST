package com.jad.controller;

import com.jad.model.entity.Cliente;
import com.jad.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {

    @Autowired
    private ICliente clienteService;

    public Cliente create (Cliente cliente){
        return clienteService.save(cliente);
    }

    public Cliente update (Cliente cliente){
        return clienteService.save(cliente);
    }

    public void delete (Integer id){
        Cliente clienteDelete=clienteService.findById(id);
        clienteService.delete(clienteDelete);
    }

    public Cliente showById(Integer id){
        return clienteService.findById(id);
    }
}