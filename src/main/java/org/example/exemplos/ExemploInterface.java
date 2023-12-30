package org.example.exemplos;

public interface ExemploInterface {
    /*
        A partir do Java 8 temos default methods ou defender methods
        É um tipo que define um conjunto de operações que uma classe deve implementar
        A interface estabelece um contrato que a classe deve cumprir

        Utilizado para que possamos criar sistemas com baixo acoplamento
            POO -> S.O.L.I.D D = Dependency Inversion Principle -> Dependa de abstrações e não de implementações

            Exemplo:
                   ArrayList list = new ArrayList();//forte acoplamento

                   List list = new ArrayList();//acoplamento fraco

            Se a classe ArrayList for substituida por outra que implemente List nada mudará no meu sistema.

     */

    void meuMetodo(); //Obriga a classe que utilizar a interface a implementar o método com essa assinatura.
}

