package org.example.exemplos;

import java.util.ArrayList;
import java.util.List;

public class InterfaceFuncionalPredicate {
    public static void main(String[] args) {
    /*
        https://docs.oracle.com/javase/10/docs/api/java/util/function/Predicate.html

        public interface Predicate<T> {
            boolean test(T t);
        }

        Útil para testar algum critério que possa retornar verdadeiro ou falso (true / false) numa lista.

     */
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Hermes", 30));
        pessoas.add(new Pessoa("Lucas", 28));
        pessoas.add(new Pessoa("Roni", 21));
        pessoas.add(new Pessoa("Alexandre", 15));

        int idadeMinima = 30;

        //Remove elementos cujo critério é verdadeiro
        pessoas.removeIf(pessoa -> pessoa.getIdade() < idadeMinima);
        for (Pessoa pessoa : pessoas) { // Abaixo forma mais resumida, linha 35
            System.out.println(pessoa);
        }

        //Method reference (referência para método)
        pessoas.removeIf(Pessoa::pessoaMenor30Estatico); // Método dentro da classe estática 'Pessoa'
        pessoas.removeIf(Pessoa::pessoaMenor30NaoEstatico);
        pessoas.forEach(System.out::println); // Forma mais resumida
    }
}
