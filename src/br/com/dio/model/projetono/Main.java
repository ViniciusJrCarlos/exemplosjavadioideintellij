package br.com.dio.model.projetono;

import br.com.dio.model.estruturadedados.conceitodeNos;

public class Main {

    private static String conteudo;

    public static void main(String[] args) {

       // No no1 = new No( conteudo: "Conteudo no1");

        //String conteudo = null;
        No<String> no1 = new No<String>(conteudo);
        No<String> no2 = new No<String>(conteudo);
        no1.setProximoNo(no2);


        //No no2 = new No( conteudo );
        //no1.setProximoNo(no2);

        //conceitodeNos no3 = new conceitodeNos( conteudo: "Conteudo no3" );
        //no2.setProximoNO(no3);

        //conceitodeNos no4 = new conceitodeNos( conteudo: "Conteudo no4" );
       // no3.setProximoNO(no4);
        //minhapilha.push(new exemplopilhaslifo(1));
        //no1.setProximoNO(no2);
        //conceitodeNos no3  = new conceitodeNos(1));
        System.out.println(no1);
        System.out.println(no1.getProximoNo());

    }

}


