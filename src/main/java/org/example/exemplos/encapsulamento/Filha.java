package org.example.exemplos.encapsulamento;

public class Filha extends Mae {
    public String umAtributoQualquer = "umAtributoQualquer";
    public static String umAtributoStaticQualquer = "umAtributoStaticQualquer";

    public static void main(String[] args) {
        Filha filha = new Filha();
        System.out.println(Filha.atributoStatic);
        System.out.println(atributoStatic);
        System.out.println(filha.atributoStatic);
        System.out.println(filha.atributoPublic);
        //System.out.println(filha.atributoPrivate);//Esse método não é visível na classe Mae
        System.out.println(filha.atributoProtected);
        System.out.println(filha.atributoComModificadorPadrao);
        System.out.println(filha.imprimeNomeDaClasse());

        Mae filha2 = new Filha();//A classe mais genérica consegue receber um objeto mais especializado.
        //Filha filha3 = new Mae();//A classe mais especializada não consegue receber o objeto mais genérico.

        System.out.println(umAtributoStaticQualquer);
        //System.out.println(umAtributoQualquer);
        System.out.println(filha.umAtributoQualquer);
    }
}
