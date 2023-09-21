package com.desafio.desafioaccenture.cliente;

import org.springframework.web.bind.annotation.*;

import org.springframework.http.MediaType;

@RestController
@RequestMapping("test-practico")
public interface NombresApi {
    
    @GetMapping(path = "/v1/users/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public String obtenerNombresDeUsuario() throws Exception;

}
