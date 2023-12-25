package org.example.exemplos;

public class ManipulandoString {
    public static void main(String[] args) {
    /*
          Strings são imutáveis

          Exemplo:

          String  a = "Um exemplo";
          É alocado em algum endereço da memória o objeto String com o conteúdo "Um exemplo".

          a = a + " melhor";

          O objeto não foi alterado mas criado um novo objeto e alocado em um novo endereço da meméria
          com o conteúdo "Um exemplo melhor".
    */

        String a = "Um texto qualquer de exemplo";

        System.out.println("Em maiuscula: " + a.toUpperCase());
        System.out.println("Em menuscula: " + a.toLowerCase());
        System.out.println("Quantidade de caracteres na frase: " + a.length());
        System.out.println("Um pedaÃ§o da frase a partir de um ponto: " + a.substring(9));
        System.out.println("Um pedaÃ§o específico da frase: " + a.substring(9, 17));
        System.out.println("Substituir um pedaÃ§o específico da frase: " + a.replace("exemplo", "modelo"));
        System.out.println("Posição da palavra: " + a.indexOf("texto"));
        System.out.println("Posição do caractere: " + a.lastIndexOf("e"));

        String[] arrayPalavras = a.split(" ");
        System.out.println("Terceiro item do array: " + arrayPalavras[2]);

        //invertendo a frase
        String fraseInvertida = "";
        for (int i = a.length(); i > 0; i--) {
            fraseInvertida = fraseInvertida + a.substring(i - 1, i);
        }

        System.out.println(fraseInvertida);

        //Essa classe permite criar e manipular dados de Strings dinamicamente com mais eficiência.
        StringBuilder stringBuilder = new StringBuilder(a);
        System.out.println(stringBuilder.reverse().toString());

        /*
           Essa classe permite criar e manipular dados de Strings dinamicamente com mais eficiência.
           StringBuffer é sincronizado e garante consistência quando há diversas threads lendo ou modificando
           a mesma String
        */
        StringBuffer stringBuffer = new StringBuffer(a);
        System.out.println(stringBuffer.reverse().toString());


        //Comparação de performance entre String StringBuilder e StringBuffer
        String minhaString = "";
        long tempoInicial = System.currentTimeMillis();

        //Concatenar com um milhÃ£o de caracteres.
        for (int i = 0; i < 1000000; i++) {
            minhaString += "a";
        }
        long tempoFinal = System.currentTimeMillis();
        long resultado = tempoFinal - tempoInicial;
        System.out.println("Tempo de execução manipulando String = " + resultado + " em milisegundos.");

        stringBuilder = new StringBuilder();
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("a");
        }
        tempoFinal = System.currentTimeMillis();
        resultado = tempoFinal - tempoInicial;
        System.out.println("Tempo de execução manipulando StringBuilder = " + resultado + " em milisegundos.");

        stringBuffer = new StringBuffer();
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append("a");
        }
        tempoFinal = System.currentTimeMillis();
        resultado = tempoFinal - tempoInicial;
        System.out.println("Tempo de execução manipulando StringBuffer = " + resultado + " em milisegundos.");
    }
}
