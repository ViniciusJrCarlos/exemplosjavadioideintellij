package br.com.dio;

//import br.com.dio.model.Gato;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

   //private static Object numPaginas;

    public static void main(String[] args) {
        /*int a  = 5;
        int b = 6;
        System.out.println("hello World..." + (a+b));*/

        Gato gato = new Gato();

        System.out.println(gato);

//        System.out.println(gato);

        //int numPaginas;
        //String nome;
        Livro livro1 = new Livro("livro dos 3 corpos", 300);
        //boolean Livro;
        System.out.println(livro1);
    }

}

class  Livro{


    private String nome;
    private Integer numPaginas;

    public Livro (String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
