package org.example.exemplos;

import org.example.exercicios.ContaCorrente;

public class Excecoes {
    public static void main(String[] args) throws MyException {
    /*
        Qualquer erro lançado pelo programa quando em execução é chamado exceções (Exception)

        No Java a exceção é um objeto herdado das classes:
        java.lang.RuntimeException: O compilador não obriga a tratar ou a propagar. Exemplo: Falta de memória
        java.lang.Exception: Neste caso o compilador obriga a tratar ou a propagar a exceção. Exemplo: NullPointerException

        Quando uma exceção é lançada, ela é propagada na pilha de chamadas de métodos em execução, podendo ser
        capturada e tratada ou o programa é encerrado.

        Tratar exceções nos permite que erros sejam tratados de forma consistente onde podemos:
            - Saber como tratar o erro e resolvê-lo sem precisar parar o programa;
            - Delegar a lógica do erro para uma classe que saiba com resolver;

        Devemos tomar cuidado para não tentar tratar todas as exceções e desta forma esconder problemas no código
    */

        ContaCorrente contaCorrente = new ContaCorrente("1122");
        //causando um erro:
        contaCorrente = null;

        //Excecoes.metodoQueNaoTrataUmaException(contaCorrente);

        Excecoes.metodoQueTrataUmaException(contaCorrente);

        try {
            Excecoes.metodoQueLancaUmaException(contaCorrente);
        } catch (MyException e) {
            //faz alguma coisa...
        } catch (Exception e) {
            //faz alguma coisa...
            try {
                Excecoes.metodoQueLancaUmaException(contaCorrente);
            } catch (Exception f) {
                //faz alguma coisa...
            }
        }

        try {
            contaCorrente = new ContaCorrente("1122");
            Excecoes.metodoQueLancaUmaException2(contaCorrente);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void metodoQueNaoTrataUmaException(ContaCorrente contaCorrente) {
        contaCorrente.imprimirSaldo();
    }

    public static void metodoQueTrataUmaException(ContaCorrente contaCorrente) {
        try {
            contaCorrente.imprimirSaldo();
            //mais códigos...
        } catch (NullPointerException e) {
            //tomar alguma ação
            contaCorrente = new ContaCorrente("1122");
            Excecoes.metodoQueTrataUmaException(contaCorrente);
        } catch (Exception e) {
            //tomar alguma ação...
        } finally {
            //rotina para executar de qualquer forma com ou sem exception
            System.out.println("Essa linha do código foi executada!");
        }
        //mais rotinas
        System.out.println("A rotina foi continada até o fim!");
    }

    public static void metodoQueLancaUmaException(ContaCorrente contaCorrente) throws Exception { // posso colocar , e acrescentando mais tipos de exception
        contaCorrente.imprimirSaldo();
    }

    public static void metodoQueLancaUmaException2(ContaCorrente contaCorrente) throws MyException, Exception {
        try {
            contaCorrente.imprimirSaldo();
        } catch (NullPointerException e) {
            //tomar alguma ação...
            throw new NullPointerException(e.toString());
        } catch (Exception f) {
            //tomar alguma ação...
            throw new MyException(f.toString());
        }

        //O lançamento da exception abaixo não faz sentido, lançado apenas para validar a exception personalizada.
        throw new MyException("Algo deu errado!");
    }
}

