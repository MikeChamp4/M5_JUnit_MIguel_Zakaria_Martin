package mzm.m5_junit_miguel_zakaria_martin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zakaria
 */
public class MzmTest {
    @Test
    public void testCalcularAreaTriangulo() {
        double base = 12;
        double altura = 20;
        Mzm instance = new Mzm();
        double expResult = 120;
        double result = instance.calcularAreaTriangulo(base, altura);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularPerimetroTriangulo() {
        double a = 10;
        double b = 7;
        double c = 8;
        Mzm instance = new Mzm();
        double expResult = 25;
        double result = instance.calcularPerimetroTriangulo(a, b, c);
        assertEquals(expResult, result);
    }

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
