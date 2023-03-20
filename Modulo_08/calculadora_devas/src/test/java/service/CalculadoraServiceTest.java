package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.CalculadoraService;

public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;
    int a;
    int b;

    @Before
    public void setup() {
        a = 10;
        b = 5;
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void testSomar() {
        Assert.assertEquals(15, calculadoraService.somar(a, b));
    }

    @Test
    public void testSubtrair() {
        Assert.assertEquals(5, calculadoraService.subtrair(a, b));
    }

    @Test
    public void testDividir() {
        Assert.assertEquals(2, calculadoraService.dividir(a, b));
    }

    @Test
    public void testMultiplicar() {
        Assert.assertEquals(50, calculadoraService.multiplicar(a, b));
    }
}
