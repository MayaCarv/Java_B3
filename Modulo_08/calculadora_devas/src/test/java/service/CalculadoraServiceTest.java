package service;

import model.Quadrado;
import model.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;
    Quadrado quadrado1;
    Quadrado quadrado2;
    Triangulo triangulo1;
    Triangulo triangulo2;
    int a;
    int b;

    @Before
    public void setup() {
        a = 10;
        b = 5;
        calculadoraService = new CalculadoraService();

        quadrado1 = new Quadrado();
        quadrado1.setLado(5);

        quadrado2 = new Quadrado();
        quadrado2.setLado(10);

        triangulo1 = new Triangulo();
        triangulo1.setAltura(2);
        triangulo1.setBase(5);

        triangulo2 = new Triangulo();
        triangulo2.setAltura(1);
        triangulo2.setBase(3);
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

    @Test
    public void testAreaQuadrado() {
        Assert.assertEquals(25, calculadoraService.calcularArea(quadrado1), 0);
    }

    @Test
    public void testAreaTriangulo() {
        Assert.assertEquals(5, calculadoraService.calcularArea(triangulo1), 0);
    }

    @Test
    public void testRetornoTrianguloDeMenorAreaIgual() {
        Assert.assertSame(triangulo1, triangulo1);
        Assert.assertNull(calculadoraService.trianguloDeMenorArea(triangulo1, triangulo1));
    }

    @Test
    public void testRetornoTrianguloDeMenorArea() {
        Assert.assertNotSame(triangulo1, triangulo2);
        Assert.assertNotNull(calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2));
    }

    @Test
    public void testTrianguloDeMenorArea() {
        Assert.assertNotSame(triangulo1, triangulo2);
        Assert.assertEquals(calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2), triangulo2);
    }

    @Test
    public void testRetornoQuadradoDeMenorAreaIgual() {
        Assert.assertSame(quadrado1, quadrado1);
        Assert.assertNull(calculadoraService.quadradoDeMenorArea(quadrado1, quadrado1));
    }

    @Test
    public void testQuadradoDeMenorArea() {
        Assert.assertNotSame(quadrado1, quadrado2);
        Assert.assertEquals(calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2), quadrado1);
    }
}
