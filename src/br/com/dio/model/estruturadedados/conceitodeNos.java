package br.com.dio.model.estruturadedados;

public class conceitodeNos {

    //public static void main(String[] args) {

        public String conteudo;
        private conceitodeNos proximoNO;
        //private NO proximoNO = null;

        public void conceitoNos (String conteudo){

            this.proximoNO = null;
            this.conteudo = conteudo;

        }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public conceitodeNos getProximoNO() {
        return proximoNO;
    }

    public void setProximoNO(conceitodeNos proximoNO) {
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
