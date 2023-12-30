package org.example.exemplos;

public class ExemploArray {
    public static void main(String[] args) {
    /*
        Imagine que você precise declarar os nomes dos alunos da classe de uma escola.

        Você poderia criar uma variável String para cada aluno. Exemplo:

        String aluno1 = "João";
        String aluno2 = Maria;

        Imagine criar e trabalhar com as variáveis para os 60 alunos da classe!!!
        E se a classe tivesse 500 alunos? Inviável, não?

        Que taL criar uma variável e manipular os dados dentro dessa variável?

        Por isso o uso de array e outras coleções
    */
        String[] alunos = {"João", "Maria", "Pedro"};

        String[] pacientes = new String[3];
        pacientes[0] = "Joana";
        pacientes[1] = new String("Mario");
        pacientes[2] = "Rodrigo";

        String[] maisPacientes = new String[4];
        //maisPacientes = pacientes; // jeito errado de fazer, vai apontar para o endereço de memória

        for (int i = 0; i < pacientes.length; i++) {
            maisPacientes[i] = pacientes[i];
        }

        System.arraycopy(pacientes, 0, maisPacientes, 0, 3);

        System.out.println(maisPacientes[2]);
        System.out.println(maisPacientes[3]);//imprime null

        maisPacientes[3] = "Julia";

        System.out.println(maisPacientes[3]);// imprime Julia

        int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = i;
        }

        System.out.println(valores[5]);

        //uma outra forma de utilizar o for
        for (int listValor : valores) {
            System.out.println(listValor);
        }
    }
}

