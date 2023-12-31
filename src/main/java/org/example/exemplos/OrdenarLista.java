package org.example.exemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarLista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("D");
        list.add("H");
        list.add("G");
        list.add("C");
        list.add("F");
        list.add("B");
        list.add("A");
        list.add("E");

        Collections.sort(list);
        for (String letra : list) {
            System.out.println(letra);
        }

        System.out.println("---------");

        Collections.reverse(list);
        for (String letra : list) {
            System.out.println(letra);
        }

        System.out.println("---------");

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(4);
        listInteger.add(0);
        listInteger.add(3);
        listInteger.add(1);
        listInteger.add(5);
        listInteger.add(2);

        Collections.sort(listInteger);
        for (Integer numero : listInteger) {
            System.out.println(numero);
        }

        System.out.println("---------");

        Collections.reverse(listInteger);
        for (Integer numero : listInteger) {
            System.out.println(numero);
        }

        System.out.println("---------");

        Pessoa pessoa1 = new Pessoa("Rodrigo", 30);
        Pessoa pessoa2 = new Pessoa("Vinicius", 15);
        Pessoa pessoa3 = new Pessoa("Paulo", 45);
        Pessoa pessoa4 = new Pessoa("Marcos", 7);
        Pessoa pessoa5 = new Pessoa("Gustavo", 18);

//        Utiliza-se o compareTo para fazer o sort e revrse funcionar com objetos
        List<Pessoa> listPessoa = new ArrayList<>();
        listPessoa.add(pessoa1);
        listPessoa.add(pessoa2);
        listPessoa.add(pessoa3);
        listPessoa.add(pessoa4);
        listPessoa.add(pessoa5);

        Collections.sort(listPessoa);
        for (Pessoa pessoa : listPessoa) {
            System.out.println(pessoa);
        }
    }
}

