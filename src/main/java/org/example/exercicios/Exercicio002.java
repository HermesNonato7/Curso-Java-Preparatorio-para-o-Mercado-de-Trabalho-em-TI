package org.example.exercicios;

import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {

        /*
        1 - Crie a classe  Exercicio002. Esta classe deve pedir para o usuário
         entrar com quatro valores através da console;

        2 - Tire a média dos valores e se o resultado for maior ou igual a 7.0 informe
        no console "Parabéns! Você aprovado com média:  X", caso contrário informe "Você foi reprovado com média: X", onde X é o valor da média;

        Obs.: A fórmula para calcular a média é:

        media = (nota1 + nota2 + nota3 + nota4) / 4
         */

        System.out.println("Digite os valores de 4 notas");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da nota 1: ");
        double valor1 = teclado.nextDouble();
        System.out.println("Digite o valor da nota 2: ");
        double valor2 = teclado.nextDouble();
        System.out.println("Digite o valor da nota 3: ");
        double valor3 = teclado.nextDouble();
        System.out.println("Digite o valor da nota 4: ");
        double valor4 = teclado.nextDouble();
        teclado.close();
        double media = (valor1 + valor2 + valor3 + valor4) / 4;

        if (media >= 7.0) {
            System.out.println("Parabéns! Você aprovado com média: " + media);
        } else {
            System.out.println("Você foi reprovado com média: " + media);
        }
    }
}
