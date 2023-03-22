package service;

import model.*;

public class CalculadoraService {
    public int somar(int a, int b) {
        return a+b;
    }

    public int subtrair(int a, int b) {
        return a-b;
    }

    public int dividir(int a, int b) {
        return a/b;
    }

    public int multiplicar(int a, int b) {
        return a*b;
    }

    public double calcularArea(Triangulo triangulo) {
        return ((triangulo.getAltura() * triangulo.getBase()) / 2);
    }

    public double calcularArea(Quadrado quadrado) {
        return (quadrado.getLado() * quadrado.getLado());

    }

    public Triangulo trianguloDeMenorArea(Triangulo a, Triangulo b) {
        double aArea = calcularArea(a);
        double bArea = calcularArea(b);
        if (aArea < bArea)
            return a;
        else if (aArea > bArea)
            return b;
        return null;
    }

    public Quadrado quadradoDeMenorArea(Quadrado a, Quadrado b) {
        double aArea = calcularArea(a);
        double bArea = calcularArea(b);
        if (aArea < bArea)
            return a;
        else if (aArea > bArea)
            return b;
        return null;
    }
}
