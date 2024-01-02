package org.example.exemplos;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
    /*
        Set representa um conjunto de elementos

        - Não permite repetições;
        - O acesso, a inserção e a remoção dos elementos são rápidos;
        - O elemento não tem uma posição;
        - Oferece operações de interseção, união e diferença

        As principais implementações são:
            HasSet - é o mais rápido dos três mencionados aqui e não ordenado
            LinkedHasSet - É o intermediário em desempenho dos três e ordenado pelo compareTo do objeto ou Comparator
            TreeSet - É o mais lento dos três porém com os elementos na ordem em que são adicionados

            https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Set.html
   */

        System.out.println("------------conjunto com os nomes masculinos");
        Set<String> conjuntoNomeMasculino = new HashSet<>();
        conjuntoNomeMasculino.add("Hermes");
        conjuntoNomeMasculino.add("Lucas");
        conjuntoNomeMasculino.add("Alexandre");
        conjuntoNomeMasculino.add("Roni");

        for (String nome : conjuntoNomeMasculino) {
            System.out.println(nome);//imprime sem ordem alguma
        }
        System.out.println("------------'contains' retorna um booleano.");
        System.out.println(conjuntoNomeMasculino.contains("Lucas"));//retorna um boolean
        System.out.println("------------");

        System.out.println("------------'remove' o nome 'Lucas' do conjunto");
        conjuntoNomeMasculino.remove("Lucas");

        Set<String> conjuntoNomeFeminino = new HashSet<>();
        conjuntoNomeFeminino.add("Ariana");
        conjuntoNomeFeminino.add("Lunah");
        conjuntoNomeFeminino.add("Agatha");

        Set<String> conjuntoTodosNomes = new HashSet<>();
        conjuntoTodosNomes.addAll(conjuntoNomeFeminino);//adiciona no conjunto os elementos do outro conjunto (união)
        conjuntoTodosNomes.addAll(conjuntoNomeMasculino);

        System.out.println("------------conjunto de todos os nomes");
        for (String nome : conjuntoTodosNomes) {
            System.out.println(nome);
        }

        conjuntoTodosNomes.retainAll(conjuntoNomeMasculino);//mantém apenas os elementos que tem nos dois conjuntos (interseção)

        System.out.println("------------conjunto com os nomes femininos removidos");
        for (String nome : conjuntoTodosNomes) {
            System.out.println(nome);
        }
        System.out.println("------------");

        conjuntoTodosNomes.addAll(conjuntoNomeFeminino);
        conjuntoTodosNomes.removeAll(conjuntoNomeMasculino);//remove do conjunto os elementos contidos no outro (diferença)
        System.out.println("------------conjunto com os nomes masculinos removidos");
        for (String nome : conjuntoTodosNomes) {
            System.out.println(nome);
        }


        System.out.println("A Coleção tem: " + conjuntoTodosNomes.size() + " elementos");//retona a quantidade de elementos na coleção

        conjuntoTodosNomes.clear();//limpa a coleção
        System.out.println("A Coleção tem: " + conjuntoTodosNomes.size() + " elementos");//retona a quantidade de elementos na coleção
        System.out.println("------------");
    }
}
