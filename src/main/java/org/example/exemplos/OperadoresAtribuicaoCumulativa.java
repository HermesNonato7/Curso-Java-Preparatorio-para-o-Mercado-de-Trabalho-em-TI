package org.example.exemplos;

public class OperadoresAtribuicaoCumulativa {

    public static void main(String[] args) {
        int a;//declarando uma variável
        int b = 100;//declarando uma variável e atribuindo um valor

        a = b;//atribuido o valor da variavel b na variável a

        System.out.println(a);

        a = a + b;//somando o conteúdo da variável a com a variável b

        System.out.println(a);

        a += b;////somando o conteúdo da variável a com a variável b

        System.out.println(a);



       /*
          A expressão acima vale para os operadores - + * / %

          Exemplos:
       */
        a += b;
        System.out.println(a);

        a -= b;
        System.out.println(a);

        a *= b;
        System.out.println(a);

        a /= b;
        System.out.println(a);

        a %= b;
        System.out.println(a);

        a = 100;
        System.out.println("a vale " + a++);

        System.out.println("a vale agora " + a);

        System.out.println("a vale agora " + ++a);
    }

}
