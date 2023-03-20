import java.util.*;

public class ExemploOrdenacaoLivros {

    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");

        Map<String, Livro> meusLivros = new HashMap<>() {{

            put(" Hawking, Stephen ", new Livro( "Uma breve historia do tempo ",  530));
            put(" Duhigg, Charles ", new Livro( " O poder do habito ",  408));
            put(" Harari, Yuval Noah ", new Livro( " 21 liçoes para o século 21 ",  432));

        }};

        //entryset vai imprimir para ordem aleatorio

        for(Map.Entry<String, Livro> livro: meusLivros.entrySet()){

            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        }

        //linkedhashmap ordem de insercao dos itens

        System.out.println("--\tOrdem de Inserção\t--");

        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{

            put(" Hawking, Stephen ", new Livro( "Uma breve historia do tempo ",  530));
            put(" Duhigg, Charles ", new Livro( " O poder do habito ",  408));
            put(" Harari, Yuval Noah ", new Livro( " 21 liçoes para o século 21 ",  432));

        }};

        for(Map.Entry<String,Livro> livro: meusLivros1.entrySet()){

            System.out.println(livro.getKey() + " = " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabética autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);

        for(Map.Entry<String, Livro> livro: meusLivros2.entrySet()){

            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        }

        System.out.println("--\t Ordem Alfabetica nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());

        meusLivros3.addAll(meusLivros.entrySet());

        for(Map.Entry<String, Livro> livro : meusLivros3)

        System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
     }
}

class Livro{

    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    //trabalhando com map, hashmap e treemap


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{


    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }


}
