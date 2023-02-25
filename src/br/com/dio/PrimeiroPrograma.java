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


        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;

        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';

        String s1 = "fulano";
        String s2 = "cicrano";

        String s3 = "bertano";

        boolean b1  = true;
        boolean b2 = false;

        long l1 = 159l;
        long l2 = 189l;

        byte y1 = 1;

        short h1 = 25;
        //operandos logicos aplicado a numero não pode diretamente a numero, e sim expressoes logicos true ou false
        //if((i1 = 10) && (i2 = 20)){}

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 <= i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2" + (f1 == f2));
        System.out.println("f1 != f2" + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("f1 < f2 " + (f1 < f2));

        System.out.println("c1 == c2" + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2" + (c1 <=c2));



        boolean b5 = true;
        boolean b6 = false;

        boolean b3 = true;

        boolean b4 = false;

        System.out.println("b1 && b2 " + (b5 && b6));
        System.out.println("b1 && b3  " + (b5 && b3));

        System.out.println("b2 || b3" + (b6 || b3));
        System.out.println("b2 || b4" + (b6 || b4));

        System.out.println("b1 ^ b3 " + (b5 ^ b3));
        System.out.println("b4 ^ b1" + (b4 ^ b5));

        System.out.println("!negacao b1 " + (!b5));
        System.out.println("!negacao b2" + (!b6));

        int i5 = 10;
        int i6 = 5;

        float f3 = 20f;
        float f4 = 50f;


        System.out.println("((i1 + i2) < (f2 - f1) && true )" + (((i5 + i6) < (f3 - f4)) && true));
        System.out.println("(i1 > i2 || (f2 < f1)) " + ((i5 > i6) || (f4 < f3)));


        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDepedentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario ) && (quantidadeDepedentes >=mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDepedentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebeAuxilio " + recebeAuxilio);




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
