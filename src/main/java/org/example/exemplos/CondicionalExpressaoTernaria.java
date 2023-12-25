package org.example.exemplos;

public class CondicionalExpressaoTernaria {
    public static void main(String[] args) {
    /*
        Sintaxe:

        ( <condição> ) ? <se verdadeiro> : <se falso>
    */
        double mediaAluno = 7.0;
        double mediaMinima = 7.0;
        String status = mediaAluno >= mediaMinima ? "Aprovado" : "Reprovado";
        System.out.println(status);
    }
}
