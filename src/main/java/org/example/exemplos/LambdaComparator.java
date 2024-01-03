package org.example.exemplos;

import java.util.ArrayList;
import java.util.List;

public class LambdaComparator {
    public static void main(String[] args) {
    /*
         Expressões Lambda (função anônima)

         Disponível a partir do Java 8

         https://docs.oracle.com/javase/10/docs/api/java/util/Comparator.html

         S.O.L.I.D -> O -> Aberta para extenção, mas fechada para modificação.
    */

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Hermes", 30));
        pessoas.add(new Pessoa("Lucas", 28));
        pessoas.add(new Pessoa("Roni", 21));
        pessoas.add(new Pessoa("Alexandre", 15));

        //Collections.sort(pessoas);

        /*
        Comparator<Pessoa> comparator = (pessoa, outraPessoa) -> {
            return pessoa.getIdade().compareTo(outraPessoa.getIdade());
        };
        */

        //pessoas.sort(comparator);

        pessoas.sort((pessoa, outraPessoa) -> pessoa.getNome().compareTo(outraPessoa.getNome()));//Não é necessário declarar o tipo para "pessoa" e "outraPessoa" com o tipo Pessoa
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
