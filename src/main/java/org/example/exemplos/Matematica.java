package org.example.exemplos;

public class Matematica {
    public static void main(String[] args) {
        double x = 25.0;
        double y = 5.0;
        double b = 2.0;
        int z = -5;
        double a = 23.33;
        // Veja mais detalhes da classe Math em https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
        System.out.println("A raiz quadrada de " + x + " é " + Math.sqrt(x));
        System.out.println(y + " elevado a " + b + " é " + Math.pow(y, b));
        System.out.println("Valor absoluto de " + z + " é " + Math.abs(z));
        System.out.println("Se x é " + x + " e y é " + y + " então " + Math.max(x, y) + " é o maio valor");
        System.out.println("Se x é " + x + " e y é " + y + " então " + Math.min(x, y) + " é o menor valor");
        System.out.println("Um valor aleatório (randômico) " + Math.random());
        System.out.println("O valor arredondado de " + a + " é " + Math.round(a));
    }
}
