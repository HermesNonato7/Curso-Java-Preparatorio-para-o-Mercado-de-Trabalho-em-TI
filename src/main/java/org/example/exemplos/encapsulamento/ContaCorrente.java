package org.example.exemplos.encapsulamento;

public class ContaCorrente {
    private double saldo;
    private String tipoConta;

    public ContaCorrente() {
    }

    public ContaCorrente(double valor) {
        this.saldo = valor;
    }

    public ContaCorrente(double valor, String tipoConta) {
        this.saldo = valor;
        this.tipoConta = tipoConta;
    }

    public void depositar(double valor) {
        this.saldo = saldo + valor;
        this.saldo();
    }

    public void depositar(double valor, String tipoMoeda) {
        this.saldo = saldo + valor;
        this.saldo();
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("O seu saldo é insuficiente! Saldo atual -> " + this.saldo);
            return;
        }
        saldo = saldo - valor;
        this.saldo();
    }

    public double saldo() {
        System.out.println("O seu saldo é " + this.saldo);
        return this.saldo;
    }
}
