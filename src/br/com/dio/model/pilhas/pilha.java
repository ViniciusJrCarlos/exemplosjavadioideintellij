package br.com.dio.model.pilhas;

public class pilha {

    private exemplopilhaslifo refNoEntradapilha;

    public pilha() {

        this.refNoEntradapilha = null;

    }

    // push coloca um novo livro no empilhamento da estrutura ficando em 1 da lista
    public void push(exemplopilhaslifo novoNO){

        exemplopilhaslifo refAuxiliar = refNoEntradapilha;
        refNoEntradapilha = novoNO;
        refNoEntradapilha.setReno(refAuxiliar);

    }

    //pop exclui o primeiro livro que tem na pilha o ultimo que entrou na pilha será o primeiro a sair
    //
    public  exemplopilhaslifo  pop(){

        //testar se a pilha está vazia
        if(!this.isEmpty()){

            exemplopilhaslifo noPoped = refNoEntradapilha;
            refNoEntradapilha  = refNoEntradapilha.getReno();

            return noPoped;

        }
        return null;

    }
    public exemplopilhaslifo top(){

        ///método que retorna a referencia
        return refNoEntradapilha;

    }

    public boolean isEmpty(){

        if(refNoEntradapilha ==null){

            return true;

        }else {

            return  false;

        }

    }
    //poderia ser feito dessa forma refatorando em 1 linha apenas
    // return refNoEntradaPilha == null ? true : false;

    @Override
    public String toString() {

        String stringRetorno = "---------------------------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "--------------------------------------\n";

        exemplopilhaslifo noAuxiliar = refNoEntradapilha;

        while (true){

            if (noAuxiliar != null){

                stringRetorno += "[exemplopilhaslifo{dado= " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReno();

            }else {

                break;
            }

        }
        stringRetorno += "===========================\n";
        return stringRetorno;
    }

}
