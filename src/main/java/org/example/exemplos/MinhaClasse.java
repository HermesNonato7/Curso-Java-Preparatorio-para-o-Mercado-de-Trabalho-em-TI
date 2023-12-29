package org.example.exemplos;

import java.util.Date;

public class MinhaClasse {
    private String nome;//somente a classe deve ter poder de alterar os atributos
    private Date dataCadastro;

    //construtor sem parâmetro
    public MinhaClasse() {
    }

    //Construtor com parâmetros
    public MinhaClasse (String nome, Date dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    //Abaixo métodos get e set disponibilizado para que outros objetos possam alterar a propriedade da classe.

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "MinhaClasse{" +
                "nome='" + nome + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}
