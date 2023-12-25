package org.example.exemplos;

/*
   O uso de método deixa o código mais modular, permitindo uma melhor organização e promove o reaproveitamento do código,
   facilita o desenvolvimento e quebra um problema maior em problemas menores.
 */
public class MetodoOuFuncao {
    public static void main(String[] args) {
        double a = MetodoOuFuncao.calculaSomaDoisValores(10, 1);
        System.out.println(a);
    }

    public static double calculaSomaDoisValores(double valor1, double valor2) {
        return valor1 + valor2;
    }
}
