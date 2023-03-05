import java.util.*;

import java.awt.*;
import java.io.OutputStream;
import java.util.List;

public class Main {

   // private static String marca;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
/*
  ///metodo que funciona como equals e HashCode
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro(   "Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro( "Ford1").hashCode());

        Carro carro1 = new Carro( "Ford");
        Carro carro2 = new Carro( "Chevrolet");

        System.out.println(carro1.equals(carro2));

 ///metodo que funciona como equals e HashCode
    }
*/

        //implementando STACK
        //
        /*
        //stack é uma pilha, o fiat que foi o ultimo é o que fica no topo na pilha
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro( "Ford"));
        stackCarros.push(new Carro( "chevrolet"));
        //stack é uma pilha, com metodo push o fiat que foi o ultimo é o que fica no topo na pilha
        stackCarros.push(new Carro("fiat"));
        System.out.println(stackCarros);
        //com o POP, no exemplo abaixo a gente retira o fiat que foi o ultimo e que ficou no topo, e agora o penultimo virou o primeiro no exemplo ficaria o chevrolet
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        //com o PEEK nesse exemplo é somente mostrado e não retirado nenhum item da pilha

        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);


        // com o EMPTY só verifica se esta vazia ou nao
        System.out.println(stackCarros.empty());

        ///implementando STACK fim

        */

        //implementando QUEUE INICIO

        Queue<Carro> queueCarros = new LinkedList<>();
        queueCarros.add(new Carro("ford"));
        queueCarros.add(new Carro("chevrolet"));
        queueCarros.add(new Carro("fiat"));

        System.out.println(queueCarros.add(new Carro("pegout")));
        System.out.println(queueCarros);

        //offer é igual o ADD o offer tenta adicionar ou retorna falso não gera nenhum erro

        System.out.println(queueCarros.offer(new Carro("Renalt")));
        System.out.println(queueCarros);

        //peek, vai pegar o primeiro elemento da fila ou retorna nulo, mais não remove

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //poool, irá remover o primeiro elemento
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);




        //implementando QUEUE FIM

    }
}
