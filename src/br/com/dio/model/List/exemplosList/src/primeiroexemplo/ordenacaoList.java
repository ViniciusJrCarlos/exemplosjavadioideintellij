package primeiroexemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class ordenacaoList {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{

            add(new Gato(  "Jon", 18,  "branco"));
            add(new Gato( "Simba", 6,  "verde"));
            add(new Gato("Jon", 12, "pardo"));


        }};

        //colocando em ordem de inserção na ordem que entrou os lists
        System.out.println("---\tOrdem de inserção\t---");
        System.out.println(meusGatos);

        //colocando em ordem de inserção na ordem que entrou os lists
        System.out.println("---\tOrdem aleatoria\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        //fazendo a comparação com comparable para saber a ordem natural por nomes
        System.out.println("---\tOrdem Natural de nomes\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        //fazendo a comparação de numeros inteiros por ordem numerica
        System.out.println("---\tOrdem de idade comparacao e ordenacao\t---");
        Collections.sort(meusGatos, new ComparadorIdade());
        System.out.println(meusGatos);

        //comparando por cor
        System.out.println("---\tOrdem de comparacao e ordenacao por cor\t---");
        Collections.sort(meusGatos, new ComparadorCor());
        System.out.println(meusGatos);

        //comparando por cor/idade e nome
        System.out.println("---\tOrdem de comparacao e ordenacao por cor\t---");
        Collections.sort(meusGatos, new ComparadorNomeCorIdade());
        System.out.println(meusGatos);

    }
}


        class Gato implements Comparable<Gato> {

            private String nome;
            private Integer idade;

            private String cor;

            public Gato(String nome, Integer idade, String cor) {
                this.nome = nome;
                this.idade = idade;
                this.cor = cor;
            }

            public String getNome() {
                return nome;
            }

            public Integer getIdade() {
                return idade;
            }

            public String getCor() {
                return cor;
            }

            @Override
            public String toString() {
                return "Gato{" +
                        "nome='" + nome + '\'' +
                        ", idade=" + idade +
                        ", cor='" + cor + '\'' +
                        '}';
            }

            //neste int organiza e compara pela ordem comparando os elementos se um é maior que o outro.
            //interface comparable
            @Override
            public int compareTo(Gato gato) {
                return this.getNome().compareToIgnoreCase(gato.getNome());
            }
        }


        //criando a classe comparator

        class ComparadorIdade implements Comparator<Gato>{


            @Override
            public int compare(Gato g1, Gato g2) {
                return Integer.compare(g1.getIdade(), g2.getIdade());
            }


        }

        class ComparadorCor implements Comparator<Gato>{


            @Override
            public int compare(Gato g1, Gato g2) {
                return g1.getCor().compareToIgnoreCase(g2.getCor());
            }
        }

        class ComparadorNomeCorIdade implements Comparator<Gato>{


            @Override
            public int compare(Gato g1, Gato g2) {

                int nome = g1.getNome().compareToIgnoreCase(g2.getNome());

                if(nome != 0) return nome;

                int cor = g1.getCor().compareToIgnoreCase(g2.getCor());

                if(cor != 0) return cor;

                return Integer.compare(g1.getIdade(), g2.getIdade());

            }
        }