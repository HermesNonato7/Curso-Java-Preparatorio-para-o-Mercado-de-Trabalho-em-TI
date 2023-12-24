package org.example.exemplos;

public class ConversaoExplicita {

    public static void main(String[] args) {

        // Quando o programa espera um tipo de varivael mais vem outra podemos forçar a conversão de tipo
        int valorI = 10;
        long valorL = 10L;

        long total = valorI + valorL;

        //int  total2 = valorI + valorL;//Não compila!

        int total3 = valorI + (int) valorL;//Fazendo Casting, ou seja fazendo a coversão explicita de um tipo em outro.
    }
}
