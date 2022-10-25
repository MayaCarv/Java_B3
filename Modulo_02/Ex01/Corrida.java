package GIT.Modulo_02.FinalProject_Mod_02;

public class Corrida {
    public static void main(String[] args) {

        Piloto piloto1 = new Piloto("Max", 25, Sexo.M, "Red Bull Racing" );
        CarroCorrida carro1 = new CarroCorrida(1, piloto1, 150, 0, false);
        piloto1.imprimirPiloto();
        carro1.imprimirCarro();

        Piloto piloto2 = new Piloto();
        piloto2.setNome("Jamie");
        piloto2.setIdade(24);
        piloto2.setSexo(Sexo.F);
        piloto2.setEquipe("Williams");
        CarroCorrida carro2 = new CarroCorrida(2, piloto2, 150, 0, false);
        piloto2.imprimirPiloto();
        carro2.imprimirCarro();

        Piloto piloto3 = new Piloto("Fernando", 41, Sexo.M, "Alpine" );
        CarroCorrida carro3 = new CarroCorrida(3, piloto3, 150, 0, false);
        piloto3.imprimirPiloto();
        carro3.imprimirCarro();

        Piloto piloto4 = new Piloto("Tatiana", 29, Sexo.F, "Sauber" );
        CarroCorrida carro4 = new CarroCorrida();
        carro4.setNumeroCarro(4);
        carro4.setPiloto(piloto4);
        carro4.setVelocidadeMaxima(150);
        carro4.setVelocidadeAtual(0);
        carro4.setLigado(false);
        piloto4.imprimirPiloto();
        carro4.imprimirCarro();

        System.out.println();
        carro1.ligar();
        carro2.ligar();
        carro3.ligar();
        carro4.ligar();
        System.out.println();

        carro1.acelerar(20);
        carro2.acelerar(45);
        carro3.acelerar(35);
        carro4.acelerar(30);
        System.out.println();

        carro1.frear(5);
        carro2.frear(15);
        carro3.frear(35);
        carro4.parar();
        System.out.println();

        carro1.ligar();
        carro2.acelerar(150);
        carro4.desligar();
        System.out.println();

        carro1.desligar();
        carro2.acelerar(100);
        carro3.frear(20);
    }
}
