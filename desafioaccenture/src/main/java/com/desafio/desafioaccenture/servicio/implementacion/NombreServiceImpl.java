package com.desafio.desafioaccenture.servicio.implementacion;

import org.springframework.stereotype.Service;

import com.desafio.desafioaccenture.servicio.NombreService;

@Service
public class NombreServiceImpl implements NombreService {
    
    @Override
    public String obtenerNombres(){

        return "Hola Mundo";
    }
}
