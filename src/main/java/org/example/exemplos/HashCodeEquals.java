package org.example.exemplos;

public class HashCodeEquals {
    public static void main(String[] args) {
    /*
        HashCode e Equals são operações da classe Object utilizadas para comparar se um objeto é igual a outro.

        Hashcode é uma operação rápida, porém o resultado não é garantido 100% devido a
         existir uma chance de objetos diferentes ter o mesmo hashcode.

        Equals é uma operação lenta (quando comparada com HasCode), mas é 100% garantida.

        Os tipos comuns (String, Date, Double, Integer, entre outros) possuem a implementação para essas operações.

        Já as nossas classes personalizadas precisam sobrepo-las.
     */

        Pessoa pessoa = new Pessoa("1234567-9", "Hermes", 30);
        Pessoa pessoa2 = new Pessoa("1234567-9", "Hermes", 30);

        System.out.println(pessoa.hashCode());
        System.out.println(pessoa2.hashCode());
        System.out.println(pessoa == pessoa2);
        System.out.println(pessoa.equals(pessoa2));

    }
}

