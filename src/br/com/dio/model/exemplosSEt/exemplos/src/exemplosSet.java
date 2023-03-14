import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;

public class exemplosSet {

    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //CONFERINDO SE A NOTA 5 ESTÁ NO CONJUNTO

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        //CONFERINDO SE A MENOR NOTA ESTÁ NO CONJUNTO

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //CONFERINDO SE A MAIOR NOTA ESTÁ NO CONJUNTO

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //EXIBA A SOMA DE VALORES

        System.out.println("Exiba as somas de valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        while (iterator.hasNext()){

            Double next = iterator.next();

            soma += next;

        }

        System.out.println("Exiba a soma dos valores " + soma);

        //exiba a média das notas

        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        //removendo a nota 0.

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //remova as notas menores que 7 e exiba a lista

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){

            Double next = iterator1.next();

            if(next < 7) iterator1.remove();

        }

        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5d);
        notas2.add(9.3d);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);

        System.out.println(notas2);

        //exiba as notas em ordem crescente

        System.out.println("Exiba todas as notas na ordem crescente: ");
        //só exibe as notas por conta do comparable

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);


        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        ///conferir se o conjunto está vazio ou não

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}
