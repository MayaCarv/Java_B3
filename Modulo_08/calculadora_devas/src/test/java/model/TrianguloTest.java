package model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrianguloTest {
    Triangulo triangulo;

    @Before
    public void setup() {

        triangulo = new Triangulo();
        triangulo.setAltura(2);
        triangulo.setBase(5);
    }
    @Test
    public void testarTriangulo() {
        Assert.assertNotNull(triangulo);
    }
}
