package br.com.dio.model.pilhas;

public class exemplopilhaslifo {

    private int dado;
    private exemplopilhaslifo reno = null;

    public exemplopilhaslifo(int dado){

        this.dado = dado;
    }


    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public exemplopilhaslifo getReno() {
        return reno;
    }

    public void setReno(exemplopilhaslifo reno) {
        this.reno = reno;
    }

    @Override
    public String toString() {
        return "exemplopilhaslifo{" +
                "dado=" + dado +
                '}';
    }
}
