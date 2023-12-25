package org.example.exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio003 {

    /*
    1 - Crie a package com.minhaempresa.exercicios e crie a classe Exercicio003
    que deverá ficar nesta package;
    2 -   Peça para o usuário entrar com um valor;
    3- Se o valor inserido for par informe que o valor digitado é par por quatro vezes,
    caso contrário informe que o valor é ímpar por três vezes;
    % é o operador módulo que retorna o resto da divisão.
    Exemplo: Para retornar o resto da divisão de 10 por 2 em Java fazemos assim:
    double resto  =  10 % 2;
    O resultado será zero porque esse cálculo não tem resto.
    Entende-se então que qualquer valor dividido por 2 que retorne zero é par.
    Observe que após a entrada de dados acima e antes de pedir para o usuário escrever
    novamente é necessário executar o comando nextLine(),
    do contrário o seu código não funcionará adequadamente devido a tecla "enter" que foi dada
    anteriormente estar ainda aguardando para ser lida.
    4 - Em seguida peça para o usuário escrever uma frase e imprima a frase escrita
    invertida e em letra maiúscula. Exemplo: "Um teste" ficaria "ETSET MU";
    5 - No final escreva na console a data e hora atual por exemplo: 11/06/2022 10:59:23
     */

    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor = teclado.nextDouble();
        /*
            % é o operador módulo que retorna o resto da divisão por 2
            entende-se então que se o valor informado dividido por 2 dar resto igual a 0 então o
            valor informado é par.
         */
        boolean par = (valor % 2) == 0;
        if (par) {
            for (int i = 0; i < 4; i++){
                System.out.println("O valor informado é par");
            }
        }
        else {
            for (int i = 0; i < 3; i++){
                System.out.println("O valor informado é ímpar");
            }
        }
        System.out.println();
        System.out.print("Digite uma frase: ");
        teclado.nextLine();//necessário porque na última leitura do teclado a tecla "enter" ficou pendente de leitura.
        String frase = teclado.nextLine();
        StringBuilder stringBuilder = new StringBuilder(frase);
        System.out.println(stringBuilder.reverse().toString().toUpperCase());
        teclado.close();

        LocalDateTime localDateTime = LocalDateTime.now();
        String strLocalDateTime = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(strLocalDateTime);
    }
}
