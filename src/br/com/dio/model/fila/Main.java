package br.com.dio.model.fila;

import br.com.dio.model.fila.Fila;

public class Main {

    public static void main(String[] args){

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No(object: "primeiro"));
        minhaFila.enqueue(new No(object: "segundo"));
        minhaFila.enqueue(new No(object: "terceiro"));
        minhaFila.enqueue(new No(object: "quarto"));

        //minhaFila.enqueue(new exemplopilhaslifo(1));
        System.out.println(minhaFila);



    }

}
