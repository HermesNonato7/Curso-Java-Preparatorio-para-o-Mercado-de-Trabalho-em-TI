package org.example.exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {
    /*
        Lista é diferente de array você não precisa alocar quantos elementos ele tem, podendo ser iniciada vazia.

        Na lista você vai acrescentando elementos conforme a necessidade.
     */
        ArrayList<Integer> x = new ArrayList<>(); // <> Generics
        //É uma boa prática utilizar interface em vez de classes sempre que possível
        List<Integer> y = new ArrayList<>();

        y.add(1000);//adiciona um elemento.
        y.add(500);
        y.add(100);
        y.add(20);

        for (int z : y) {
            System.out.println(z);//imprime na ordem que os elementos foram adicionados na lista
        }
        System.out.println("------------------lista com novo elemento");
        y.add(1, 12000);//adiciono um novo elemento na posição 1 da lista.

        for (int z : y) {
            System.out.println(z);
        }

        System.out.println("Tamanho da lista: " + y.size());
        System.out.println("------------------lista sem o elemento do índice 2----");
        y.remove(2); //Remove o elemento na posição 2
        for (int z : y) {
            System.out.println(z);
        }

        y.remove(Integer.valueOf(1000));// remove o elemento cujo valor é 1000
        System.out.println("------------------lista sem o elemento de valor 1000---");
        for (int z : y) {
            System.out.println(z);
        }

        System.out.println("------------------");

        System.out.println("imprimindo o índice do elemento 12000 -> " + y.indexOf(Integer.valueOf(12000)));

        System.out.println("imprimindo o índice do elemento 500 -> " + y.indexOf(Integer.valueOf(500)));

        System.out.println("------------------lista com elementos com valor maior que 99");
        y.removeIf(b -> b < 100);//Utilizando um predicado que retorna verdadeiro ou falso (função lambda)
        System.out.println("------------------lista com item removido-----");
        for (int z : y) {
            System.out.println(z);
        }

        y.add(1);
        y.add(2);
        y.add(3);
        y.add(4);
        y.add(5);

        System.out.println("------------------lista com todos os valores inclusive os novos adicionados");
        for (int z : y) {
            System.out.println(z);
        }

        System.out.println("------------------lista com todos os valores menor que 10");
        List<Integer> novaLista = y.stream().filter(b -> b < 10).collect(Collectors.toList());
        for (int z : novaLista) {
            System.out.println(z);
        }

        System.out.println("------------------retorna o primeiro elemento com valor maior que 20000");
        Integer elemento = y.stream().filter(b -> b > 20000).findFirst().orElse(null);
        System.out.println(elemento);

        System.out.println("------------------retorna o primeiro elemento com valor maior que 10");
        elemento = y.stream().filter(b -> b > 10).findFirst().orElse(null);
        System.out.println(elemento);
    }
}

