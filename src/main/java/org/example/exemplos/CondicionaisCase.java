package org.example.exemplos;

public class CondicionaisCase {
    public static void main(String[] args) {
    /*
        Sintaxe:

        switch ( <expressão> ) {
            case valor1:
                <comando1>
                <comando2>
                <comando3>
                break;
            case valor2:
               <comando4>
               <comando5>
                break;
            default:
                <comando6>
                <comando7>
                break;
        }
    */

        int menu = 1;

        switch (menu) {
            case 1:
                System.out.println("Selecionou o item 1");
                break;
            case 2:
                System.out.println("Selecionou o item 2");
                //break;
            case 3:
                System.out.println("Selecionou o item 3");
                break;
            default:
                System.out.println("Entrou no default");
                break;
        }
        //mais códigos....
    }
}
