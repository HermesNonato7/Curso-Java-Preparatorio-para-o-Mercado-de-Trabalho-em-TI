package org.example.exemplos;

/*
    Criar uma exception personalizada é útil para evitar confusão sobre o que são exceções da linguagem Java
    ou de alguma outra biblioteca de terceiros com as exceções do seu sistema.
 */
public class MyException extends Exception {
    private static final long serialVersionUID = 1L;

    public MyException(String mensagem) {
        super(mensagem);
        //pode fazer mais alguma coisa aqui...
        System.out.println("Exception personalizada executada!");
    }
}
