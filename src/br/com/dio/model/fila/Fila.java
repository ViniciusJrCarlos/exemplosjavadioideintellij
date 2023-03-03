package br.com.dio.model.fila;

public class Fila {

    private No refNoEntradaFila;


    public Fila() {

        this.refNoEntradaFila = null;
    }

    public No first(){

        if(!this.isEmpty()){

            No primeiroNo = refNoEntradaFila;

            while(true){

                if (primeiroNo.getRefNo() != null){

                    primeiroNo = primeiroNo.getRefNo();

                }else{

                    break;

                }

            }


        }
        return null;

    }

    public No dequeue(){

        if(!this.isEmpty()){

            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){

                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();

                }else{
                    noAuxiliar.setRefNo(null);
                    break;

                }

            }

            return primeiroNo;
        }
        return null;

    }


    public void enqueue(No novoNo){

        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;

    }



    public boolean isEmpty(){

        //se a fila estiver vazia retorna true e mostra que ela está vazia

        return refNoEntradaFila == null? true : false;

    }

    @Override
    public String toString() {

        String stringRetorno  = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {

            while (true) {

                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]------>";


                if (noAuxiliar.getRefNo() != null){

                    noAuxiliar = noAuxiliar.getRefNo();


                }else {

                    stringRetorno += "null";
                    break;
                }

            }

        }else{

                stringRetorno = "null";

            }

            return stringRetorno;
        }

}

