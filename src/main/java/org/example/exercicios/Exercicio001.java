package org.example.exercicios;

import java.util.Scanner;

public class Exercicio001 {

    public static void main(String[] args) {
        //Entrada via teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor1 = teclado.nextDouble();
        System.out.println("Digite outro valor: ");
        double valor2 = teclado.nextDouble();
        System.out.println("A raiz quadrada da soma dos valores informados é: " + Math.sqrt(valor1 + valor2));
        teclado.close();
    }
}
