package org.example.exemplos;

public class Variaveis {

    // Declarando variável de classe. Se não atribuir valor o Java colocará o valor padrão, no caso de classes é null
    static String nome;

    public static void main (String [] args) {
        //bit byte, kbyte, megabyte, gigabyte, terabyte
        /*
           1 bit é a menor unidade de informação que pode ser armazenada ou transmitida,
             Um bit pode assumir somente 2 valores: 0 ou 1

           1 byte é formado pela combinaÃ§Ã£o de 8 bits. Exemplo: 01010101
           1 kbyte(KB) é formado por 1024 bytes
           1 megabyte (MB) é formado por 1024 kbyte
           1 gigabyte (GB) é formado por 1024 megabyte
           1 terabyte (TB) é formado por 1024 gigabyte
           e existem outras unidade maiores...
            veja mais detalhes em https://pt.wikipedia.org/wiki/Byte


            - Variáveis não podem começar por números;
            - Não podem conter espaço em branco
            - Não usar acentos ou caracteres especiais
            - Não devem ser palavras reservada do Java


            Declaração de variáveis

            <tipo> <nome> = <valor inicial>;

           É uma convenção criar nomes de variáveis em minúsculo e se for composto colocar
            a segunda palavra com a primeira letra em maiúsculo (Camel Case)
            Ex.:  posicaoFinanceira

            É comum que os nomes de variáveis, classes, métodos sejam nomeados em inglês.
        */

        //String é uma cadeia de caracteres (palavras ou texto)
        String sobrenome = "Marques"; //Declarando e atribuino valor;

        nome = "Marcos";
        System.out.println(nome);

        // Tipos primitivos numéricos inteiros
        byte b; //Tamanho 8 bits, suporta valores entre -128 e 127 e tem valor padrão = 0
        b = 127;

        short s;//Tamanho 16 bits, suporta valores entre -32768 a 32767 e tem valor padrão = 0

        int i;//Tamanho 32 bits, suporta valores entre -2147483648 a 2147483647 e tem valor padrão = 0

        long l;//Tamanho 64 bits, suporta valores entre
        // -9223372036854770000 a 9223372036854770000 e tem valor padrão = 0L
        l = 0L;

        // Tipos primitivos numéricos de ponto flutuante
        float f;//Tamanho 32 bits, suporta valores entre 1,4024E-37 a 3,4028E+38 e tem valor padrão = 0.0f
        f = 3.4567f;

        double d;//Tamanho 64 bits, suporta valores entre -4,94E-307 a 1,79E+308 e tem valor padrão = 0.0
        d = 3.4567;

        //Tipo caractere Unicode - Ver site unicode-table.com
        char c;//Tamanho 16 bits, suporta valores entre '\u0000' a '\uFFFF' e tem valor padrão = '\u0000'
        c = 'A';

        //booleano ou lógico
        boolean bo;//Tamanho 1 bit, suporta valores false, true e tem valor padrão = false
    }
}
