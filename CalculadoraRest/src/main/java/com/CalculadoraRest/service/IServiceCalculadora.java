package com.CalculadoraRest.service;

import com.CalculadoraRest.utils.TipoCalculos;
import org.springframework.stereotype.Service;

@Service
public interface IServiceCalculadora {

    String calculo(int valor1, int valor2, TipoCalculos tipoCalculos);

}
