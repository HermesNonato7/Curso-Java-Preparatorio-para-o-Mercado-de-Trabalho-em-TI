package org.example.exemplos;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Date dataCadastro = new Date();
        MinhaClasse minhaClasse = new MinhaClasse();
        MinhaClasse minhaOutraClasse = new MinhaClasse("Hermes", dataCadastro);

        minhaClasse.setNome("Lucas");
        minhaClasse.setDataCadastro(dataCadastro);

        System.out.println(minhaClasse);
        System.out.println(minhaOutraClasse);
    }
}
