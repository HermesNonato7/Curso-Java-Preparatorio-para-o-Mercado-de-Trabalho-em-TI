package org.example.exemplos;

public class VarArgs {
    public static void main(String[] args) {
        /*
            Varargs foi adicionado no Java 5 e permite argumentos de comprimento variável para declarar um método.
            - Pode haver apenas um parâmetro de argumento variável;
            - O parâmetro de argumento variável deve ser o último na assinatura do método.
         */
        VarArgs.imprimeParametros();
        VarArgs.imprimeParametros("a");
        VarArgs.imprimeParametros("a", "b");
        VarArgs.imprimeParametros("a", "b", "c");
    }

    public static void imprimeParametros(String... parametros) {
        for (int i = 0; i < parametros.length; i++) {
            System.out.println(parametros[i]);
        }
        if (parametros.length == 0) {
            System.out.println("Nenhum parâmetro foi informado!");
        }
    }
}

