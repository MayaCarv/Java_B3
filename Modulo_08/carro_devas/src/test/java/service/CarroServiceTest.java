package test.java.service;

import main.java.model.Carro;
import main.java.service.CarroService;
import org.junit.Assert;
import org.junit.Test;

public class CarroServiceTest {
    @Test
    public void deveAcelerarCorretamenteUmCarroLigado() {
        // Given:
        CarroService carroService = new CarroService();
        Carro carro = new Carro();
        carroService.ligar(carro);

        // When:
        carroService.acelerar(carro, 10);

        // Then - Asserts

        Assert.assertEquals((Integer) 10, carro.getVelocidadeAtual());
    }

    @Test
    public void deveLigarCorretamente() {
        // Given:
        CarroService carroService = new CarroService();
        Carro carro = new Carro();

        // When
        carroService.ligar(carro);

        // Then
        Assert.assertTrue(carro.getLigado());
    }

    @Test

    /**
     Cenário 1:
     Given: Carro ligado
     When: Ligar o carro
     Then: Informar que o carro está ligado
     ---------
     Cenário 2:
     Dado: Carro ligado
     Quando: Frear o carro
     Então: Ligado e Velocidade = 0
     -------------------
     Cenário 3:
     Dado: Carro Ligado e na velocidade máxima
     Quando: Acelerar
     Então: Manter a velocidade
     ----------------------
     Cenário 4:
     Dado: Carro Ligado e na velocidade != 0
     Quando: Desligar
     Então: Carro continua liga e mostra um erro
     -----------------------
     Cenário 4:
     Dado: Carro Ligado e na velocidade != 0
     Quando: Desligar
     Então: Carro continua liga e mostra um erro
     */

    /**
     * Cenário 01:
     *
     * Dado: Um carro
     *
     * Quando:
     * Ligar o carro
     * Acelerar o carro
     *
     * Então:
     * Velocidade atual = 10
     */

    // Dado: Um carro
//        CarroService carroService1 = new CarroService();
//        Carro carro1 = new Carro();
//
//        // Quando: Ligar o carro e Acelerar o carro
//        carroService1.ligar(carro1);
//        carroService1.acelerar(carro1);
//
//        // Então
//        System.out.println(carro1.getVelocidadeAtual() == 10);
//
//
//        // -------------------------
//        // Cenário 02
//        // Dado: Um carro
//        // Quando: Acelerar o carro
//        // Então: a velocidade = 0
//
//        CarroService carroService2 = new CarroService();
//        Carro carro2 = new Carro();
//
//        carroService2.acelerar(carro2);
//
//        System.out.println(carro2.getVelocidadeAtual() == 0);
//
//        // Junit 4
}
