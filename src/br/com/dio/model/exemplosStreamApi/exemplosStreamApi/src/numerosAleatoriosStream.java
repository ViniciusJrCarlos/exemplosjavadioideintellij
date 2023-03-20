import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class numerosAleatoriosStream {

    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        ////////////////// USANDO A FORMA COMUM COM O CONSUMER

        /*
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        */
        ////////////////FIM CONSUMER

        ////////////////// USANDO A FORMA COM A FLEXA SIMPLICICADA COM LAMBDA


        numerosAleatorios.forEach(s -> System.out.println(s));

        ////////////////FIM LAMBDA

        //USANDO STREAM, COM LIMIT PÁRA PEGAR UMA QUANTIDADE DE ELEMENTOS DA LISTA

        // SET IMPRIMIU SOMENTE 4 NUMEROS PORQUE NAO USA NUMERO REPETIDO.

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);



        //USANDO O MAP TRANSFORMA A LISTA DE STREAM COM NUMEROS INTEIROS.

        //NAO TEM HAVER COM MAP DE COLLETIONS E SIM COM INTERFACE FUNCITION

        //TRANSFORMANDO EM LISTA DE STRING EM UMA LISTA DE NUMEROS

        System.out.println("Transforme está lista de string em uma lista de numeros inteiros: ");

        numerosAleatorios.stream()
                //da para usar no estilo funcion anonima
                //.map(s -> Integer.parseInt(s));
                ///usando como reference method
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        ///EXIBINDO UMA LISTA DE NUMEROS PARES APOS A TRANSFORMACAO DA LIST DE STRING PARA NUMEROS
        ///usando com filter de forma completa
       /*


        System.out.println("Pegue os numeros pares e maiores que 2 e coloque numa lista: ");

        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {

                        if(i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());

        System.out.println(ListParesMaioresQue2);
        ///FIM ////////////////////////////////////////////

        */

        ///EXIBINDO UMA LISTA DE NUMEROS PARES APOS A TRANSFORMACAO DA LIST DE STRING PARA NUMEROS
        ///usando com filter SIMPLIFICADA
        System.out.println("Pegue os numeros pares e maiores que 2 e coloque numa lista: ");

        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                // usando function anonima, coloca de forma encadeada a lista usando o stram
                .filter( i -> (i % 2 == 0 && i > 2)).collect(Collectors.toList());

        System.out.println(ListParesMaioresQue2);
        ///FIM ////////////////////////////////

        //USANDO A MEDIA DOS NUMEROS
        System.out.println("Mostre a média dos números: ");

        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
        //optional serve para trabalhar com numeros nulls, usa o ifpresent para tirar a media do numero, maior, menor valor


        ///LIST DE INTEGER REMOVENDO NUMEROS IMPARES
        List<Integer> numerosAleatoriosInteiros = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        /// metodo completo de remoção de itens
        /*
        System.out.println("Removendo os valores inteiros com List e não stream");

        //usando a list porque não stream não remove itens

        numerosAleatoriosInteiros.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {

                if( integer % 2 !=0) return true;
                return false;
            }
        });

        System.out.println(numerosAleatoriosInteiros);


         */
        System.out.println("Removendo os valores inteiros com List e não stream");

        //usando a list porque não stream não remove itens

        numerosAleatoriosInteiros.removeIf(i -> (i % 2 !=0));
        System.out.println(numerosAleatoriosInteiros);

    }
}
