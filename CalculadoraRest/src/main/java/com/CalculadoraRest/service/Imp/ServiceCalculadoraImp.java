package com.CalculadoraRest.service.Imp;

import com.CalculadoraRest.service.IServiceCalculadora;
import com.CalculadoraRest.utils.TipoCalculos;
import org.springframework.stereotype.Service;

@Service
public class ServiceCalculadoraImp implements IServiceCalculadora {

    @Override
    public String calculo(int valor1, int valor2, TipoCalculos tipoCalculos){
        String resultado;
        switch (tipoCalculos){
            case SUMA -> {
                resultado = sumar(valor1, valor2);
            }
            case RESTA -> {
                resultado = restar(valor1, valor2);
            }
            case MULTI -> {
                resultado = multiplicar(valor1, valor2);
            }
            case DIV -> {
                resultado = dividir(valor1, valor2);
            }
            default -> {
                resultado = "0";
            }
        }
        return resultado;
    }

    private String sumar(int valor1, int valor2) {
        return String.valueOf(valor1 + valor2 );
    }

    private String restar(int valor1, int valor2) {
        return String.valueOf(valor1 - valor2 );
    }

    private String multiplicar(int valor1, int valor2) {
        return String.valueOf(valor1 * valor2 );
    }

    private String dividir(int valor1, int valor2) {
        double division = valor1 + valor2 ;
        double resto = valor1 % valor2;
        return String.valueOf(division) + "," +String.valueOf(resto);
    }

}
