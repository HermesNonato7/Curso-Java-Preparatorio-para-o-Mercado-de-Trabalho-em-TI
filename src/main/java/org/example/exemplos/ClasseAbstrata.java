package org.example.exemplos;

public abstract class ClasseAbstrata {
    /*
        É uma classe que não pode ser instanciada, ou seja, não dá para dar new na classe e criar um objeto.

        Classe abstrata é utilizada para ser um modelo, é uma forma de garantir herança total pois
        somente as sublcasses não abstratas podem ser instanciadas. É uma classe criada para ser mais genérica que as
        filhas podendo conter métodos que serão utilizados nas filhas e por vezes sobrescritos.

        - Podem conter métodos abstratos, ou seja, m[etodos sem implementações
        - Promove o reuso.
        - Promove o polimorfismo.


    */

    public abstract void meuMetodo();//Obriga a classe filha a implementar o método com essa assinatura.

}
