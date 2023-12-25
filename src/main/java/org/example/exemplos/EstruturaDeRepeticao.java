package org.example.exemplos;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
    /*
        For

        Sintaxe:

        for ( <inicio> ; <condicao> ; <incremento>) {
            <comando1>
            <comando2>
        }
     */
        System.out.println("---------------FOR-------------");
        int a = 5;
        for (int i = 0; i < a; i++) {
            System.out.println("O valor i é " + i);
        }
        System.out.println("-----------");
        for (int i = 10; i >= a; i--) {
            System.out.println("O valor i é " + i);
        }
        System.out.println("-----------");
        for (int i = 0; i <= a; ) {
            System.out.println("O valor i é " + i);
            i++;
        }
        System.out.println("-----------");
        for (int i = 0; i < 3; i++) {
            System.out.println("O valor i é " + Math.random());
        }
        System.out.println("-----------");
        int i = 0;
        for (; ; ) {
            i++;
            if (i > 3) {
                System.out.println("i vale " + i);
                break;
            }
        }

    /*
        While

        Sintaxe:

        while (<condicao verdadeira>) {
            <comando1>
            <comando2>
        }
    */
        System.out.println("---------------WHILE-------------");
        a = 5;
        while (a != 0) {
            System.out.println("a vale " + a);
            a--;
        }
        System.out.println("-----------");
        while (a != 100) {
            a++;
            if (a < 40) {
                continue;
            }
            System.out.println("a vale " + a);
            if (a == 50) {
                System.out.println("Loop interrompido com a valendo " + a);
                break;
            }
        }
        System.out.println("-----------");
        if (a == 50) {
            while (a < 100) {
                if (a++ >= 70) {
                    System.out.println("a vale " + a);
                    break;
                }
            }
        }

    /*
        Do while

        Sintaxe:

        do {
            <comando1>
            <comando2>
        } while (<condicao verdadeira>)
    */
        System.out.println("---------------DO-------------");
        a = 1;
        do {
            System.out.println("a vale " + a);
        } while (a > 1000);//a nunca será maior que 1.000 porém vai executar uma vez.
    }
}
