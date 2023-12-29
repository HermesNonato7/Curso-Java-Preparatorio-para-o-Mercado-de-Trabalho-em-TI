package org.example.exemplos;

public class BoxingUnboxing {
    public static void main(String[] args) {
        int x = 20; //Está na memória Stack
        Object object = x;// Está na memória Heap, este processo é chamado de boxing (encaixotar)
        System.out.println(object);

        //Fazendo casting
        int y = (int) object;//Este processo é chamado de unboxing (desancaixotar)

    /*
         Wrapper classes

         São classes equivalentes aos tipos primitivos e existem para que o boxing e unboxing
         ocorra de forma natural no Java

         Utilizado muito na serialização de objetos para representar o estado de um objeto
         como uma sequência de bytes. Com a serialização é possível salvar objetos em arquivos de dados.
         Uma vez o objeto gravado ele pode ser transferido para outro ambiente.

        Object
            Boolean para o primitivo boolean
            Character para o primitivo char
            Number
                Byte para o primitivo byte
                Short para o primitivo short
                Integer para o primitivo int
                Long para o primitivo long
                Float para o primitivo float
                Double para o primitivo double
    */

        Integer z = x;

        //sem a necessidade de casting
        y = z;

        System.out.println(z * 4);//Posso fazer operações semelhantes a quando utilizo primitivos
        System.out.println(z.doubleValue());//convertendo int em double


        if (z.equals(object)) {
            System.out.println("Forma correta de comparar objetos");
        }

        if (z == object) {
            System.out.println("Forma errada de comparar objetos, a comparação pode retornar false e não entrar neste if");
        }
    }
}
