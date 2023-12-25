package org.example.exemplos;

public class Condicionais {
    public static void main(String[] args) {
     /*
        Operadores relacionais utilizados para comparar valores:
                igual           ==
                diferente       !=
                maior           >
                maior ou igual  >=
                menor           <
                menor ou igual  <=


        Operadores lógicos utilizados para testar se uma condição é verdeira ou falsa:
                E &&
                Ou ||
                Ou exclusivo ^

        Obs.: Se tiver dúvida rever aula de lógica de programação.
     */

     /*
        Condicional: if

        Sintaxe 1:

        if(<condição verdadeira>)
            <executa comando único>


        Sintaxe 2:

        if(<condição verdadeira>) {
           <executa comando 1>
           <executa comando 2>
           <executa comando 3>
        }

        Sintaxe 3:

        if(<condição verdadeira>) {
           <executa comando 1>
           <executa comando 2>
           <executa comando 3>
        }
        else {
            <executa comando 4>
            <executa comando 5>
        }

        Sintaxe 4:

        if(<condição verdadeira>) {
           <executa comando 1>
           <executa comando 2>
           <executa comando 3>
        }
        else if (<condição verdadeira>) {
            <executa comando 4>
            <executa comando 5>
        }
        else if (<condição verdadeira>) {
            <executa comando 6>
            <executa comando 7>
        }
        else {
            <executa comando 8>
            <executa comando 9>
        }
    */
        int a = 1;
        int b = 1;

        if (a == b)
            System.out.println("a é igual a b");

        if (a == b) {
            System.out.println("a é de fato igual a b");
            //mais comandos
        }

        if (a != b) {
            System.out.println("a é diferente de b");
        } else {
            System.out.println("a é com certeza igual a b");
        }

        if (a == b && b != 10) {
            System.out.println("a é igual a b e b é diferente de 10");
        }

        if ((a == b && b != 10) || a < 1) {
            System.out.println("a é igual a b e b é diferente de 10 ou a é menor que 1");
        }

        if ((a == b && b != 10) || (a < 1 || b <= 8)) {
            System.out.println("a é igual a b e b é diferente de 10 ou a é menor que 1 ou b é menor ou igual a 8");
        }

        if (a == b) {
            System.out.println("Teste 1");
            if (a > 0) {
                System.out.println("A é maior que 0");
            }
        } else if (a > b) {
            System.out.println("Teste 2");
        } else if (a < b) {
            System.out.println("Teste 3");
        } else {
            System.out.println("A variável a não atende nenhuma das condições testadas acima");
        }

        if (a++ == 1) {
            System.out.println("a ainda valia 1 quando foi testado e a vale agora " + a);
        }

        if (++a == 3) {
            System.out.printf("a já valia %d quando foi testado", a);
        }
    }
}
