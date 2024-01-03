package org.example.exemplos;

import java.util.ArrayList;
import java.util.List;

public class FuncaoQRecebeFuncao {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Hermes", 30));
        pessoas.add(new Pessoa("Lucas", 28));
        pessoas.add(new Pessoa("Roni", 21));
        pessoas.add(new Pessoa("Alexandre", 15));

        Pessoa.umMetodo(pessoas, p -> p.getIdade() == 30);

    }
}

