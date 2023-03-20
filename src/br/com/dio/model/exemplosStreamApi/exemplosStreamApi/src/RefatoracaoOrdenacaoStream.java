
import dio.movel.exemplosStreamApi.exemplosStreamApi.RefatoracaoOrdenacaoStream.Contato;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;

public class RefatoracaoOrdenacaoStream {

    public static void main(String[] args) {

        System.out.println("---\tOrdem Aleatória\t---");
        Map<Integer, Contato> agenda = new HashMap<>(){{

            put(1, new Contato( "Simba",  55555));
            put(4, new Contato( "Cami",  11111));
            put(3, new Contato( "Jon",  22222));
            //put(1, new Contato(nome: "Simba", numero: 55555));


        }};

        System.out.println(agenda);

        for(Map.Entry<Integer, Contato> entry: agenda.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());


        }

        /////* USANDO CLASSE ANONIMA  *////////////
        /*


        System.out.println("--\tOrdem número telefone\t--");

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
            @Override
            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
            }
        });


        set.addAll(agenda.entrySet());


        for (Map.Entry<Integer, Contato> entry: set) {

            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());

        }
        ///////////////////////////////////////////////////////////////////////////////

        */
        /* FIM USO CLASSE ANONIMA  */

        /* USANDO OUTRA CLASSE COMPARATOR*/

        /*

        System.out.println("--\tOrdem número telefone\t--");

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Integer, Contato>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Integer, Contato> cont) {
                return cont.getValue().getNumero();
            }
        }));
        set.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> entry: set){

            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }


         */

        /* FIM USO OUTRA CLASSE COMPARATOR */

        /* USANDO OUTRA CLASSE LAMBDA */

        System.out.println("--\tOrdem número telefone\t--");

        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(cont -> cont.getValue().getNumero()));

        set.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> entry: set){

            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() + ": " + entry.getValue().getNome());
        }

        /* FIM USO OUTRA CLASSE LAMBDA */


    }
}

/*
// A TROCA FOI FEITA LÁ EM CIMA PELO MÉTODO ANONIMO DENTRO DO TREEMAP

class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
    }
}

class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
    }
}

*/
