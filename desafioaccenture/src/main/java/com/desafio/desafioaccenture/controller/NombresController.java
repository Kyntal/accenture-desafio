package com.desafio.desafioaccenture.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.desafioaccenture.cliente.NombresApi;
import com.desafio.desafioaccenture.servicio.NombreService;

@RestController
public class NombresController implements NombresApi{

    private static final Logger LOGGER = LoggerFactory.getLogger(NombresController.class);

    @Autowired
    private NombreService nombreService;

    @Override
    public String obtenerNombresDeUsuario() throws Exception {
        LOGGER.info("Nueva solicitud obtenerNombresDeUsuario ");
        return this.nombreService.obtenerNombres();
    }
}
