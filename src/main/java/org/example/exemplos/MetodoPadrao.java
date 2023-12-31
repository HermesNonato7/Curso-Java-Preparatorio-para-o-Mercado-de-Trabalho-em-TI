package org.example.exemplos;

public interface MetodoPadrao {
    /*
        Default methods ou defender methods existe a partir do Java 8

        Em resumo é a possibilidade de ter métodos implementados na interface
        para evitar repetição de códigos em métodos que são comuns.

        Obs.: Interface não contém construtores nem atributos.
    */

    double umMetodo();

    default double outroMetodo() {
        //seu algoritmo...
        return 0.0;
    }
}

