package com.CalculadoraRest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Validated
public interface ICalculadoraController {

    @GetMapping(value = "/suma") //, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> suma (
            @RequestHeader
            String valor1,
            @RequestHeader
            String valor2);

    @GetMapping(value = "/resta")
    ResponseEntity<String> resta (
            @RequestHeader
            String valor1,
            @RequestHeader
            String valor2);


    @GetMapping(value = "/multiplicacion")
    ResponseEntity<String> multiplicacion (
            @RequestHeader
            String valor1,
            @RequestHeader
            String valor2);


    @GetMapping(value = "/division")
    ResponseEntity<String> division (
            @RequestHeader
            String valor1,
            @RequestHeader
            String valor2);

}
