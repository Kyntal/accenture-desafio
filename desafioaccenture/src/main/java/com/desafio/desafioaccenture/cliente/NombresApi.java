package com.desafio.desafioaccenture.cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.MediaType;

@RestController
@RequestMapping("test-practico/v1/")
public interface NombresApi {
    
    @GetMapping(path = "users/all", produces = MediaType.APPLICATION_JSON_VALUE)
    String obtenerNombresDeUsuario() throws Exception;

}
