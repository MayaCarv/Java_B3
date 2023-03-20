package main.java;

import main.java.model.Carro;
import main.java.service.CarroService;

public class Main {
    public static void main(String[]args){

        // Dado: Um carro
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // Quando ligar o carro e acelerar
        carroService.ligar(carro);
        carroService.acelerar(carro, 10);

        // Então: Velocidade igual a 10
        System.out.println(carro.getVelocidadeAtual() == 10);
    }

}

    /**
     * Um carro tem os seguintes atributos:
     * - cor
     * - marca
     * - ano
     * - ligado
     * - velocidadeAtual
     *
     * Enquanto o carro estiver desligado deve ser capaz de:
     * - Ligar
     * - Motrar estado atual
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     * - O carro não pode passar de sua velocidade máxima
     * - Só podemos realizar as ações com o carro ligado
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Não existe velocidade negativa
     *
     */




