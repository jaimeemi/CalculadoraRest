package com.CalculadoraRest.controller.Imp;

import com.CalculadoraRest.controller.ICalculadoraController;
import com.CalculadoraRest.service.IServiceCalculadora;
import com.CalculadoraRest.utils.TipoCalculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class CalculadoraControllerImp implements ICalculadoraController {

    @Autowired
    IServiceCalculadora serviceCalculadora;

    @Override
    public ResponseEntity<String> suma(String valor1, String valor2) {

        String resultado = serviceCalculadora.calculo(Integer.valueOf(valor1), Integer.valueOf(valor2), TipoCalculos.SUMA );

        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> resta(String valor1, String valor2) {

        String resultado = serviceCalculadora.calculo(Integer.valueOf(valor1), Integer.valueOf(valor2), TipoCalculos.RESTA );

        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> multiplicacion(String valor1, String valor2) {

        String resultado = serviceCalculadora.calculo(Integer.valueOf(valor1), Integer.valueOf(valor2), TipoCalculos.MULTI );

        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> division(String valor1, String valor2) {

        String resultado = serviceCalculadora.calculo(Integer.valueOf(valor1), Integer.valueOf(valor2), TipoCalculos.DIV );

        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }
}
