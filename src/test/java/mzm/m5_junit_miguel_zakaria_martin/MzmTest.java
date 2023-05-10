package mzm.m5_junit_miguel_zakaria_martin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MzmTest {
    @Test
    public void pruebaAreaTriangulo() {
        double base = 5, altura = 5;
        Mzm test = new Mzm();
        double res = test.calcularAreaTriangulo(base, altura);
        double expRes = 12.5;
        assertEquals(expRes, res);
    }

    @Test
    public void pruebaPerimetroTriangulo() {
        double ladoA = 5, ladoB = 5, ladoC = 5;
        Mzm test = new Mzm();
        double res = test.calcularPerimetroTriangulo(ladoA, ladoB, ladoC);
        double expRes = 15;
        assertEquals(expRes, res);
    }
}
