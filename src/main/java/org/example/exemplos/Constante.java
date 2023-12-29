package org.example.exemplos;

public class Constante {
    public final static double PI = 3.14159265359;//Exemplo de uma constante
    private static String nome = "Hermes";//Exemplo de uma variável

    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(nome);
        nome = "Lucas";
        System.out.println(nome);
        //PI = 2.3;
    }

    public final void Exemplo() {
        System.out.print("Teste");
    }
}
