package org.example.exercicios.App;

import org.example.exemplos.TipoValor;
import org.example.exercicios.Conta;
import org.example.exercicios.ContaCorrente;
import org.example.exercicios.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("123456-0");
        contaCorrente.depositar(100.00);
        contaCorrente.sacar(70.00);

        ContaCorrente contaCorrente2 = new ContaCorrente("923456-0");
        contaCorrente2.depositar(1000.00);

        ContaPoupanca contaPoupanca = new ContaPoupanca("11789-0");
        contaPoupanca.depositar(5000);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca("18789-0");
        contaPoupanca2.depositar(500);

        List<ContaCorrente> contascorrente = new ArrayList<>();
        contascorrente.add(contaCorrente);
        contascorrente.add(contaCorrente2);

        List<ContaPoupanca> contaspoupanca = new ArrayList<>();
        contaspoupanca.add(contaPoupanca);
        contaspoupanca.add(contaPoupanca2);

        for (ContaCorrente conta : contascorrente) {
            conta.imprimirSaldo();
        }

        for (ContaPoupanca conta : contaspoupanca) {
            conta.imprimirSaldo();
        }

        System.out.println("----------uso do instanceof para identificar o tipo do objeto----------");
        System.out.println();

        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrente);
        contas.add(contaCorrente2);
        contas.add(contaPoupanca);
        contas.add(contaPoupanca2);

        for (Conta conta : contas) {
            if (conta instanceof ContaCorrente) {
                ((ContaCorrente) conta).imprimirSaldo();
            }
            if (conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).imprimirSaldo();
            }
        }

        App app = new App();
        app.meuMetodoComEnum(TipoValor.CONTA_CORRENTE);
        //app.meuMetodoComEnum(1);
        app.meuMetodoSemEnum(8);//Enum garante maior seguranÃ§a quanto ao valor que estÃ¡ sendo inserido como parÃ¢metro.

    }

    private void meuMetodoSemEnum(Integer tipoValor) {
        System.out.println(tipoValor);
    }

    private void meuMetodoComEnum(TipoValor tipoValor) {
        System.out.println("O tipo selecionado foi " + tipoValor + " que vale " + tipoValor.getValor());
    }
}

    /*
    1 - Na package de ecercícios a classe Conta

- Crie o atributo private identificadorConta do tipo String;

- Crie o atributo private saldo do tipo double;

- Crie o atributo private tipo do tipo String;

- Crie o método depositar que deverá somar o valor informado ao saldo;

- Crie o método sacar que deverá subtrair o valor informado do saldo, o método deve garantir que o saldo não fique negativo;

- Sobreponha o método toString para que os parâmetros apareçam no caso do uso deste método.

2 - Na package com.minhaempresa.exercicios crie a classe ContaCorrente que deve herdar da classe Conta;

    - Crie um construtor que exija o parâmetro identificadorConta;

- No momento da execução do construtor atualize o atributo tipo para "Conta corrente";

- Crie o método imprimirSaldo que deve imprimir na console a conta, o saldo e o tipo da conta;

3 - Na package com.minhaempresa.exercicios crie a classe ContaPoupanca que deve herdar da classe Conta;

    - Crie um construtor que exija o parâmetro identificadorConta;

- No momento da execução do construtor atualize o atributo tipo para "Conta poupança";

- Crie o método rendimentos que retorne 1% do saldo;

- Crie o método imprimirSaldo que deve imprimir na console a conta, o saldo, o tipo da conta e o rendimento;



4 - Crie a package com.minhaempresa.exercicios.app e em seguida a classe App;

- Essa classe representa a aplicação que deverá fazer os seguintes lançamentos:

- Lançar um deposito na conta corrente 123456-0 no valor de 100,00;

- Lançar um saque na conta corrente 123456-0 no valor de 70,00;

- Lançar um deposito na conta corrente 923456-0 no valor de 1000,00;

- Lançar um deposito na conta poupança 11789-0 no valor de 5000,00;

- Lançar um deposito na conta poupança 18789-0 no valor de 500,00;

- Crie a variável chamada contascorrente do tipo List<ContaCorrente> e adicione as contas do tipo corrente;

- Crie a variável chamada contaspoupanca do tipo List<ContaPoupanca> e adicione as contas do tipo poupança;

- Crie uma estrutura de repetição que imprima o saldo de cada uma das contas que estão nas listas.

     */
