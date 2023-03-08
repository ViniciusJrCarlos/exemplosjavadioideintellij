public class RodarAplicacao {

    public static void main(String[] args){

        Carro carro1 = new Carro();

        carro1.setCor("azul");
        carro1.setModelo("bmw serie X");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque( 6.39));


        Carro carro2 = new Carro();
        //Carro carro2 = new Carro(: "Cinza", modelo: "mercedes-benz", capacidadeTanque: 66);


        //
        //
        // Carro carro2 = new Carro(cor: "Cinza", modelo: "mercedes-benz", capacidadeTanque: 66);
        //Carro carro2 = new Carro(cor:"cinza");
        //Carro carro2 = new Carro();
        //carro2.setCor("vermelho");
        //carro2.setModelo("ferrari");
        //carro2.setCapacidadeTanque(200);

        //Carro carro2 = new Carro(cor: "Cinza", modelo: "mercedes-benz", capacidadeTanque: 66);
        //get mostra os valores
        //System.out.println(carro2.getModelo( "ferrari"));
       //System.out.println(carro2.getCor(cor: "vermelho"));
        //System.out.println(carro2.getCapacidadeTanque());
       // System.out.println(carro2.totalValorTanque(6.46));



    }

}
