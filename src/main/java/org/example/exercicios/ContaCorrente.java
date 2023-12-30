package org.example.exercicios;

public class ContaCorrente extends Conta {
    public ContaCorrente(String identificadorConta) {
        super.identificadorConta = identificadorConta;
        super.tipo = "Conta corrente";
    }

    public void imprimirSaldo() {
        System.out.println("Conta: " + super.identificadorConta + " Saldo: " + super.saldo + " tipo: " + super.tipo);
    }
}