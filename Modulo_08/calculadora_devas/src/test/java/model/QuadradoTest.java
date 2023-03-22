package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuadradoTest {
    Quadrado quadrado;

    @Before
    public void setup() {

        quadrado = new Quadrado();
        quadrado.setLado(5);
    }
    @Test
    public void testarQuadrado() {
        Assert.assertNotNull(quadrado);
    }
}

