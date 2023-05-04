package mzm.m5_junit_miguel_zakaria_martin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class MzmTest {

    /**
     * Test of calcularAreaCirculo method, of class Mzm.
     */
    @Test
    public void testCalcularAreaCirculo() {
        double radio = 5.0;
        Mzm instance = new Mzm();
        double expResult = 78.54;
        double result = instance.calcularAreaCirculo(radio);
        assertEquals(expResult, result, 1);
    }

    /**
     * Test of calcularPerimetroCiruculo method, of class Mzm.
     */
    @Test
    public void testCalcularPerimetroCiruculo() {
        double radio = 5.0;
        Mzm instance = new Mzm();
        double expResult = 31.42;
        double result = instance.calcularPerimetroCiruculo(radio);
        assertEquals(expResult, result, 1);
    }
    
}
