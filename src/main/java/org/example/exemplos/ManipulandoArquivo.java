package org.example.exemplos;


import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ManipulandoArquivo {
    public static void main(String[] args) {
    /*
        Exitem algumas formas de trabalhar com arquivos, seja txt, xls, pdf, zip, etc.

        Será apresentado uma forma de ler e escrever em arquivo texto.

        https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html
        https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html
    */
        List<String> registros = Arrays.asList("Cachorro", "Gato", "Macaco", "Papagaio", "Arquivo criado na aula de manipulação de arquivos");
        //String caminho = "C:" + File.separator + "meusprojetos" + File.separator + "LinguagemJava" + File.separator;
        String caminho = "C:\\meusprojetos\\LinguagemJava\\";

        FileWriter arquivo = null;
        BufferedWriter escritor = null;

        //Grava um arquivo
        try {
            //Cria ou recria um arquivo
            arquivo = new FileWriter(caminho + "arquivo.txt");
            //arquivo = new FileWriter(caminho + "arquivo.txt", true); //o parâmetro true acrescenta os dados a um arquivo existente
            escritor = new BufferedWriter(arquivo);
            for (String registro : registros) {
                escritor.write(registro);
                escritor.newLine(); // pula uma linha e escreve de novo até acabar os dados.
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try { // Utilizanod o bloco try-catch-resource abaixo, não precisa do código com o .close()
                if (escritor != null) {
                    escritor.close();
                }
                if (arquivo != null) {
                    arquivo.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*
            Grava um arquivo utilizando o bloco try-with-resources

            Este bloco declara um ou mais recursos e garante que esses recursos serão fechados ao terminar o bloco

            Disponível a partir do Java 7

            https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        */
        try (
                FileWriter arquivo2 = new FileWriter(caminho + "arquivo2.txt");
                BufferedWriter escritor2 = new BufferedWriter(arquivo2);
        ) {
            for (String registro : registros) {
                escritor2.write(registro);
                escritor2.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        //Lê um arquivo texto
        try (
                FileReader arquivo3 = new FileReader(caminho + "arquivo.txt");
                BufferedReader leitor = new BufferedReader(arquivo3);
        ) {
            String linha = leitor.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }


        //Manipulando pastas com File
        File caminhoRecurso = new File(caminho);
        File[] recursos = caminhoRecurso.listFiles(); // Para pastas e arquivos, filtra tudo
        File[] recursosArquivo = caminhoRecurso.listFiles(File::isFile); // Aqui filtra somente o arquivo 'File'
        File[] recursosPasta = caminhoRecurso.listFiles(File::isDirectory); // Aqui só diretório

        for (File recurso : recursos) {
            if (recurso.isFile()) {
                System.out.println("Arquivo: " + recurso);
                System.out.println("Está localizado no caminho: " + recurso.getPath());
                System.out.println("Tamanho do arquivo em bytes: " + recurso.length());
                System.out.println("Nome do arquivo: " + recurso.getName());

            } else {
                System.out.println("Pasta: " + recurso);
            }
        }

        for (File recurso : recursosArquivo) {
            System.out.println("Só arquivo: " + recurso);
        }

        for (File recurso : recursosPasta) {
            System.out.println("Só pasta: " + recurso);
        }

        boolean retorno;
        File novaPasta = new File(caminho + "umaPastaX");
        if (!novaPasta.exists()) {
            retorno = new File(caminho + "umaPastaX").mkdir();
            System.out.println("Pasta criada -> " + retorno);
        } else {
            retorno = new File(caminho + "umaPastaX").delete();//Cuidado com esse método para não apagar arquivo indevidamente!
            System.out.println("Pasta apagada -> " + retorno);          //Este delete serve para pastas ou arquivos
        }
    }
}
