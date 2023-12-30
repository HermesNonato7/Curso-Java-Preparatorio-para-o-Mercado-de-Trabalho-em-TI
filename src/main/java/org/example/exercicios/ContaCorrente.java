package org.example.exercicios;

import org.example.exemplos.Tipo;

public class ContaCorrente extends Conta {
    public ContaCorrente(String identificadorConta) {
        super.identificadorConta = identificadorConta;
        super.tipo = Tipo.CONTA_CORRENTE;
//        super.tipo = "Conta corrente";
    }

    public void imprimirSaldo() {
        System.out.println("Conta: " + super.identificadorConta + " Saldo: " + super.saldo + " tipo: " + super.tipo);
    }
}