package org.example.exemplos;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

// Precisa implementar a interface "comparable'
public class Pessoa implements Comparable<Pessoa> {
    private String cpf;
    private String nome;
    private Integer idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String cpf, String nome, Integer idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public static boolean pessoaMenor30Estatico(Pessoa pessoa) {
        return pessoa.getIdade() < 30;
    }

    public boolean pessoaMenor30NaoEstatico() {
        return this.getIdade() < 30;
    }

    public static void umMetodo(List<Pessoa> t, Predicate<Pessoa> predicate) {
        for (Pessoa p : t) {
            if (predicate.test(p)) {
                System.out.println("Faz algo com a pessoa: " + p.getNome());
            }
        }
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    /*
       Na comparação retorna um valor negativo, zero ou um valor positivo se o valor comparado
       vir antes, for igual ou vir depois do outro valor    , seja ele numérico ou alfabético.
    */
    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.getNome().compareTo(outraPessoa.getNome());
        //return this.getIdade().compareTo(outraPessoa.getIdade());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
}
