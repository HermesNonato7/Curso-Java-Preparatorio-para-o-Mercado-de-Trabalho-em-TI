package org.example.exemplos;

public class Matriz {
    public static void main(String[] args) {
        int linha = 3; // variáveis somente para facilitar a visualização
        int coluna = 2;

        String[][] minhaMatriz = new String[linha][coluna];
        // dentro dos conchetes pode colocar so quantidades, [qts.linhas] [qtd. colunas]

        minhaMatriz[0][0] = "Hermes";
        minhaMatriz[0][1] = "37 anos";
        minhaMatriz[1][0] = "Ariana";
        minhaMatriz[1][1] = "39 anos";
        minhaMatriz[2][0] = "Lucas";
        minhaMatriz[2][1] = "14 anos";

        for (String[] resultado : minhaMatriz) {
            System.out.println("A pessoa -> " + resultado[0] + " tem " + resultado[1]);
        }
    }
}
