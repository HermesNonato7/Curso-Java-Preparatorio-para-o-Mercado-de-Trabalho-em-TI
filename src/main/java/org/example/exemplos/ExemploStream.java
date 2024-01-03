package org.example.exemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploStream {
    public static void main(String[] args) {
    /*
        Stream é uma sequência de elementos de uma fonte de dados (array, coleção, recurso de E/S, função de iteração)
        que oferece suporte a operações agregadas.

        Existe o stream e o parallelStream e a diferença é que o parallelStream faz a distribuição do stream nos núcleos
        de processamento da máquina.

        - O acesso é sequêncial e só pode ser utilizado uma vez;

        - É executado sob demanda, ou seja, os dados de uma stream serão consumidos conforme a necessidade;

        Sabendo-se que uma operação em streams retorna uma nova stream podemos criar um
        pipeline que é uma cadeia de operações com streams.

        O pipeline é composto por zero ou mais operações intermediárias e uma terminal.

        Uma operação intermediária produz uma nova stream e ela só é executada quando uma operação terminal é invocada.

        Uma operação terminal produz um objeto não stream (coleção ou outro) e determina o fim do processamento da stream.

        Operações intermediárias:
            - filter
            - map
            - peek
            - distinct
            - sorted
            - skip
            - limit (*)

        Operações terminais
            - forEach
            - forEachOrdered
            - toArray
            - reduce
            - collect
            - min
            - max
            - count
            - anyMatch (*)
            - allMatch (*)
            - noneMatch (*)
            - findFirst (*)
            - findAny (*)

            Numa coleção você pode chamar direto o método stream ou parallelStream ou pode-se criar uma stream
            por outras formas tais como:
                - Stream.of
                - Stream.iterate
                - Stream.ofNullable

        * short-circuit ou seja corta o processamento da execução quando a condição é satisfeita
    */

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Hermes", 30));
        pessoas.add(new Pessoa("Lucas", 28));
        pessoas.add(new Pessoa("Roni", 21));
        pessoas.add(new Pessoa("Alexandre", 15));

        Stream<Pessoa> stream = pessoas.stream();
        //Operação terminal toArray
        System.out.println(Arrays.toString(stream.toArray()));
        //como consumimos acima a stream, não é possível consumir novamente!
        //System.out.println(Arrays.toString(stream.toArray()));

        //Operação intermediária map
        stream = pessoas.stream().map(p -> {
            p.setNome(p.getNome().toUpperCase());
            return p;
        });

        System.out.println(Arrays.toString(stream.toArray()));

        Stream<Integer> stream2 = Stream.of(5, 3, 7, 2, 8, 4, 9, 1, 0);
        System.out.println(Arrays.toString(stream2.toArray()));

        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 5);
        //Operação intermediária limit
        System.out.println(Arrays.toString(stream3.limit(3).toArray()));

        //Operação terminal  findFirst
        Stream<Integer> stream4 = Stream.iterate(5, x -> x + 5);
        Optional<Integer> primeiroElemento = stream4.findFirst(); // Se o método pode retornar nulo, esse 'Optional', evita o NullPount Exception, retorna o nulo mas sem dar erro no sistema
        System.out.println("Primeiro elemento -> " + primeiroElemento.get());

        //Operação terminal reduce
        int total = Stream.iterate(0, x -> x + 5).limit(3).reduce(0, (a, b) -> a + b);
        System.out.println(total);

        List<Integer> pipeline = Stream.iterate(0, x -> x + 5).limit(100).filter(p -> p < 28)
                .map(x -> x * 10).collect(Collectors.toList());

        System.out.println(pipeline);
    }
}
