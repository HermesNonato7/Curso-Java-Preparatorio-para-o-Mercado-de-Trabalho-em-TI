package org.example.exemplos.encapsulamento;

public class Main {
    public static void main (String [] args) {
        ContaCorrente contaCorrente = new ContaCorrente(5000);
        contaCorrente.saldo();
        contaCorrente.depositar(1000);
        contaCorrente.depositar(250);
        contaCorrente.sacar(1000);
        contaCorrente.sacar(500);
        //contaCorrente.saldo = 1000000;
        contaCorrente.saldo();
    }
}
