package org.example.exemplos;

import java.util.ArrayList;
import java.util.List;

public class Generica<T> {
    public static void main(String[] args) {
    /*
        Generics permite que classe, interface e métodos possam ser parametrizados por tipo.

        <Tipo>

        Vantagens:
            - Type Safety
            - Performance
            - Reuso
    */

        //uso com generics
        List<String> list = new ArrayList<>();
        list.add("Marcos");
        list.add("Ricardo");
        //list.add(new Pessoa("Marcos", 30));
        String nome = list.get(0);

        //uso sem generics
        List list2 = new ArrayList<>();
        list2.add("Marcos");
        list2.add("Ricardo");
        list2.add(new Pessoa("Marcos", 30));
        String nome2 = (String) list2.get(0);


        Generica<String> g = new Generica<>();
        //g.imprime(1);
        g.imprime("Texto");

        Generica<Integer> h = new Generica<>();
        h.imprime(1);
        //h.imprime("Texto");

        System.out.println(h.max(list));
    }

    public void imprime(T parametro) {
        System.out.println(parametro);
    }

    //Exemplo Generico delimitado
    public <T extends Comparable<? super T>> T max(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
                break;
            }
        }
        return max;
    }
}
