import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Main {
    public static void main(String[] args){

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{

            put("gol", 14.4d);
            put("uno", 14.4d);
            put("mobi", 14.4d);
            put("hb20", 14.4d);
            put("kwid", 14.4d);
            //put("gol", 14.4d);


        }};

        System.out.println(carrosPopulares.toString());

        //substituindo um valor que nao pode ser repetido
        System.out.println("substituindo o consumo do gol ´por 15.2 km/l: ");
        carrosPopulares.put( "gol", 15.2);
        System.out.println(carrosPopulares);

        //verificando se tem um valor dentro
        System.out.println("Confira se o modelo tucson está no dicionario: " + carrosPopulares.containsKey("tucson"));

        //exibindo o valor de uma chave
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        //no map não é possivel mostrar um terceiro elemento da lista no map

        //exibindo os valores com keyset

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        //exibindo os consumos dos carros

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);


        System.out.println("Exiba o modelo mais economico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {

            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();

        }

        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);


        //exiba o modelo menos economicoe seu consumo

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());

        String modeloMenosEificiente = "";

        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {

            if(entry.getValue().equals(consumoMenosEficiente)){

                modeloMenosEificiente = entry.getKey();

                System.out.println("Modelo menos eficiente: " + modeloMenosEificiente + " - " + consumoMenosEficiente);
            }

            
        }


        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;

        while(iterator.hasNext()){

            soma += iterator.next();
        }

        System.out.println("Exiba a soma dos consumos: " + soma);

        //media das somas dos consumos

        System.out.println("Exiba a media dos consumos desse dicionario de carros: " + (soma/carrosPopulares.size()));

        //remova um dos modelos com consumo maior ou igual 15.6km/l

        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com consumo igual a 15.6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        while (iterator1.hasNext()){

            if(iterator1.next().equals(15.2)) iterator1.remove();

        }
        System.out.println(carrosPopulares);

        // exiba todos os carros na ordem em que foram infomados

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{

            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};

        System.out.println(carrosPopulares1.toString());

        //treemap ordenando pela chave
        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        //apagar dicionario de carros.
        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confirase o dicionario está vazio: " + carrosPopulares.isEmpty());

    }

}