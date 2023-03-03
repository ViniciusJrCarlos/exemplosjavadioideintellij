package one.digital;

//import org.graalvm.compiler.nodes.graphbuilderconf.NodePlugin;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;

    }

    //metodo get que pega o elem do tipo generico do indice N
    public T get(int index){
        return this.getNo(index).getConteudo();

    }
    //metodo add adiciona no final da lista
    public void add(T elemento){

        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);

        if(primeiroNo == null){

            primeiroNo = novoNo;


        }

        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    //pegando o nó em determinado indice
    public void add(int index, T elemento){

        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if(novoNo.getNoProximo() != null){

            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);

        }else {

            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0){

            primeiroNo = novoNo;
        }else{

            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;

    }

    //metodo remove remove um elemento da minha lista encadeada ou um nó

    public void remove(int index){

        if(index == 0){

            primeiroNo = primeiroNo.getNoProximo();

            if(primeiroNo != null){

                primeiroNo.setNoPrevio(null);
            }

        }else{

            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());

            if(noAuxiliar != ultimoNo){

                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());

            }else{

                ultimoNo =  noAuxiliar;

            }

        }

        this.tamanhoLista--;

    }

    ///metodo de uso interno

    private NoDuplo<T> getNo(int index){

        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; (i < index) && (noAuxiliar != null); i++){

            noAuxiliar = noAuxiliar.getNoProximo();

        }

        return noAuxiliar;
    }

    public int size(){

        return  this.tamanhoLista;

    }

    @Override
    public String toString() {

        String strRetorno = " ";
        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i= 0; i < size(); i++){

            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();

        }
        strRetorno += "null";
        return strRetorno;
    }
}
