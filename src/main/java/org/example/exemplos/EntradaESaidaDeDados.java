package org.example.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class EntradaESaidaDeDados {

    public static void main(String[] args) {
        //Locale.setDefault(Locale.US);
        Locale.setDefault(new Locale("pt", "BR"));

        System.out.println("Imprime algo no console e passa para a próxima linha.");
        System.out.printf("Imprime o parámetro String %s. E agora o outro parÃ¢metro double e passo para a próxima linha %.2f%n", "Exemplo", 11.59);
        System.out.println();
        System.out.print("Imprime, mas não pula linha. ");
        System.out.print("Aparece na frente.");
        System.out.println();

        int valor1 = 10;
        int valor2 = 5;
        String total = "Total: ";

        System.out.println(valor1 + valor2);//Soma valores
        System.out.println(valor1 + valor2 + total);
        System.out.println(total + valor1 + valor2);//Considera tudo como String
        System.out.println(total + (valor1 + valor2));

        //Entrada via teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String entradaTexto = teclado.next();
        System.out.println("Você digitou: " + entradaTexto);

        System.out.print("Digite um valor: ");
        long entradaLong = teclado.nextLong();
        System.out.println();
        System.out.println("Você digitou: " + entradaLong);

        System.out.print("Digite outro valor: ");
        long entradaLong2 = teclado.nextLong();
        System.out.println();
        System.out.println("Você digitou: " + entradaLong2);
        System.out.println("Total dos valores digitados: " + (entradaLong + entradaLong2));

        teclado.close();//Aqui executo o método close() para desalocar da memória.
    }
}
