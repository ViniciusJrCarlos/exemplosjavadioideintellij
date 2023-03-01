package br.com.dio.model.pilhas;

public class Main {

    public static void main(String[] args) {

        pilha minhapilha = new pilha();

        minhapilha.push(new exemplopilhaslifo(1));
        minhapilha.push(new exemplopilhaslifo(2));
        minhapilha.push(new exemplopilhaslifo(3));
        minhapilha.push(new exemplopilhaslifo(4));
        minhapilha.push(new exemplopilhaslifo(5));
        minhapilha.push(new exemplopilhaslifo(6));

        System.out.println(minhapilha);

        //usando o pop para retirar o livro da pilha ultimo livro que entrou o primeiro a sair
        System.out.println(minhapilha.pop());
        System.out.println(minhapilha);

        minhapilha.push(new exemplopilhaslifo(99));
        System.out.println(minhapilha);



    }
}
