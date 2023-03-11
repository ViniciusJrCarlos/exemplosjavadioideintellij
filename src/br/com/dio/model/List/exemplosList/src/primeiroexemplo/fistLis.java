package primeiroexemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class fistLis {

    public static void main(String[] args) {

        //existem diversas formas de inicializar um arraylist mais vamos usar esse tipo de lista
        System.out.println("Crie uma lista e adicione as sete NOTAS");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.8d);
        notas.add(8.0d);
        notas.add(5.0d);
        notas.add(9.0d);
        notas.add(3.0d);
        notas.add(2.0d);
        notas.add(0.6d);

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0 | posição = " + notas.indexOf(5.0d));

        //adionando elementos
        System.out.println("Acione na lista a nota 8.0 na posicao 4");
        notas.add(4, 8.9d);

        System.out.println(notas);

        // substituindo elementos
        System.out.println("Substitua a nota 5.0d pela nota 6.0d");
        notas.set(notas.indexOf(5.0d), 6.0);
        System.out.println(notas);
        //generics modificou sobre diamonds operador

        //saber se tem um elemento na lista boolean true or false

        System.out.println("Confira se a nota 5.0 está na lista " + notas.contains(5.0d));

        //saber todos elementos na ordem informada
        System.out.println("exiba todas as notas que foram informados: ");

        for (Double nota: notas) {

            System.out.println(nota);

        }

        //exibir menor nota
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //exibir a maior nota

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //fazer a soma de todas as notaas
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while(iterator.hasNext()){

            Double next = iterator.next();
            soma += next;

        }

        System.out.println("Exiba a soma dos valores: " + soma);

        //exiba a media das notas
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        //removendo algum elemento

        System.out.println("Remova a nota 7.8  na posicao do elemento");
        notas.remove( 0);

        System.out.println(notas);

        //remova um elemento na posicao

        System.out.println("Remova a nota em qualquer poscicao passando seu numero");
        notas.remove( 9.0);
        System.out.println(notas);



        //removendo elementos menores que  7.0

        System.out.println("Remova elementos as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){

            Double next = iterator1.next();

            if(next < 7) iterator1.remove();

        }

        System.out.println(notas);

        //apagando toda a lista

        System.out.println("Apague toda a lista: ");
        notas.clear();

        System.out.println(notas);

        //verifica se a lista ta vazia

        System.out.println("Confira se a lista está vazia " + notas.isEmpty());

    }

}
