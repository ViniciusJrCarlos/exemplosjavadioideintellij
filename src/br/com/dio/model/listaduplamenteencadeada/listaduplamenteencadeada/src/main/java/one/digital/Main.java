package one.digital;

import java.lang.module.FindException;

public class Main {

    public static <T> void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<String>();

        minhaListaEncadeada.add("C1");
        minhaListaEncadeada.add("C2");
        minhaListaEncadeada.add("C3");
        minhaListaEncadeada.add("C4");
        minhaListaEncadeada.add("C5");
        minhaListaEncadeada.add("C6");
        minhaListaEncadeada.add("C7");

        System.out.println(minhaListaEncadeada);

       //minhaListaEncadeada.remove(int index: 3);
        //minhaListaEncadeada.add();

        System.out.println(minhaListaEncadeada.get(3));
    }

}