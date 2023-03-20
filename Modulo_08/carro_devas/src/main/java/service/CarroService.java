package main.java.service;

import main.java.model.Carro;

public class CarroService {
    public void ligar (Carro carro) {
        carro.setLigado(true);
    }

    public void desligar (Carro carro) {
        carro.setLigado(false);
    }

    public void mostrarEstadoAtual (Carro carro) {
        System.out.println(carro.toString());
    }

    public void acelerar (Carro carro, int velocidade) {
        carro.setVelocidadeAtual(carro.getVelocidadeAtual() + velocidade);
    }

    public void frear (Carro carro) {
        carro.setVelocidadeAtual(carro.getVelocidadeAtual() - 10);
    }
}
