package org.example.exemplos.outra;

import org.example.exemplos.encapsulamento.Mae;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Filha extends Mae {
    public static void main(String[] args) {
        Filha filha = new Filha();
        System.out.println(Filha.atributoStatic);
        System.out.println(filha.atributoPublic);
        //System.out.println(filha.atributoPrivate);//Erro porque é private
        System.out.println(filha.atributoProtected);
        //System.out.println(filha.atributoComModificadorPadrao);//Erro porque está em outro pacote
        System.out.println(filha.imprimeNomeDaClasse());
        //this.imprimeHora();//não é permitido utilizar this em metodo static
        filha.imprimeHora();//somente dessa forma consigo executar o método pq. estou num método static

        Mae filha2 = new Filha();//A classe mais genérica consegue receber um objeto mais especializado.
        //filha2.imprimeHora();//O método não existe na classe Filha e por isso não é possível utilizar.
    }

    //Exemplo de polimorfismo (onde sobrescrevo o método da classe mãe)
    public String imprimeNomeDaClasse() {
        System.out.println("Filha");
        this.imprimeHora();//a palavra this reforça que será utilizado o método do objeto atual.
        return super.imprimeNomeDaClasse();//a palavra super é utilizada para executar o método da classe mãe.
    }

    public void imprimeHora() {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}

