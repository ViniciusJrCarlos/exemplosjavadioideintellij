package br.com.dio.model.estruturadedados;

public class conceitodeNos {

    //public static void main(String[] args) {

        private String conteudo;
        private NO proximoNO = null;
        //private NO proximoNO = null;

        public void No(String conteudo){

            this.proximoNO = null;
            this.conteudo = conteudo;

        }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public N0 getProximoNO() {
        return proximoNO;
    }

    public void setProximoNO(NO proximoNO) {
        this.proximoNO = proximoNO;
    }

    //System.out.println();


   // }


    @Override
    public String toString() {
        return "conceitodeNos{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
