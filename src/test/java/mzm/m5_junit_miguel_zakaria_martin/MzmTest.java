package mzm.m5_junit_miguel_zakaria_martin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MzmTest {
    @Test
    public void pruebaAreaRectangulo() {
        double base = 5, altura = 5;
        Mzm test = new Mzm();
        double res = test.calcularAreaRectangulo(base, altura);
        double expRes = 25;
        assertEquals(expRes, res);
    }

    @Test
    public void pruebaPerimetroRectangulo() {
        double ladoA = 5, ladoB = 5;
        Mzm test = new Mzm();
        double res = test.calcularPerimetroRectangulo(ladoA, ladoB);
        double expRes = 20;
        assertEquals(expRes, res);

    }
}
