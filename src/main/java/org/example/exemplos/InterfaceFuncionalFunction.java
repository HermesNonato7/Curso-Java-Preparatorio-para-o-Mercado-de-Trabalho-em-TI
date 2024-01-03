package org.example.exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterfaceFuncionalFunction {
    public static void main(String[] args) {
    /*
        https://docs.oracle.com/javase/10/docs/api/java/util/function/Function.html

        public interface Function<T, R0> {
            R apply(T t);
        }

        É uma função que aplicando um tipo T retorna um tipo R

        Útil para criar um novo objeto (R) a partir da lista atual(T).
     */

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Hermes", 30));
        pessoas.add(new Pessoa("Lucas", 28));
        pessoas.add(new Pessoa("Roni", 21));
        pessoas.add(new Pessoa("Alexandre", 15));

        //Gera uma lista de String com nome em caixa alta para maiores de 20 anos e em caixa baixa para menores de 21
        Function<Pessoa, String> function = pessoa -> {
            if (pessoa.getIdade() < 21) {
                return pessoa.getNome().toLowerCase();
            } else {
                return pessoa.getNome().toUpperCase();
            }
        };

        //map é um método que aplica uma função a todos os elementos de uma stream.
        //stream é uma sequência de dados

        //converte           lista  -> stream              -> list
        List<String> nomes = pessoas.stream().map(function).collect(Collectors.toList());

        /*
        List<String> nomes = pessoas.stream()
                .map(p -> p.getIdade() < 21 ? p.getNome().toLowerCase() : p.getNome().toUpperCase())
                .collect(Collectors.toList());
        */

        nomes.forEach(System.out::println);

//        Neste exemplo posso utilizar a 'function' para retornar uma lista de 'string' não de pessoa.

    }
}