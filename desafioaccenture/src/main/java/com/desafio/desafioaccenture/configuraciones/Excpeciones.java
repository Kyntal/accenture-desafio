package com.desafio.desafioaccenture.configuraciones;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.desafio.desafioaccenture.configuraciones.model.CuerpoExcepcion;

@ControllerAdvice
public class Excpeciones {
    private static final Log LOGGER = LogFactory.getLog(Excpeciones.class.getName());

    @ExceptionHandler(Exception.class)
    public ResponseEntity<CuerpoExcepcion> exception(Exception e) {
        LOGGER.info("Ha ocurrido un error generico: " + e.getMessage() + " Causa: "+ e.getCause());
        return new ResponseEntity<>(new CuerpoExcepcion(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage(), Exception.class.getName()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
