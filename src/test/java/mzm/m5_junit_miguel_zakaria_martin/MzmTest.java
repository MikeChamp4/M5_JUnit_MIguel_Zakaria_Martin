/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mzm.m5_junit_miguel_zakaria_martin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zakaria
 */
public class MzmTest {
    
    public MzmTest() {
    }

    /**
     * Test of calcularAreaTriangulo method, of class Mzm.
     */
    @Test
    public void testCalcularAreaTriangulo() {
        System.out.println("calcularAreaTriangulo");
        double base = 12;
        double altura = 20;
        Mzm instance = new Mzm();
        double expResult = 120;
        double result = instance.calcularAreaTriangulo(base, altura);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcularPerimetroTriangulo method, of class Mzm.
     */
    @Test
    public void testCalcularPerimetroTriangulo() {
        System.out.println("calcularPerimetroTriangulo");
        double a = 10;
        double b = 7;
        double c = 8;
        Mzm instance = new Mzm();
        double expResult = 25;
        double result = instance.calcularPerimetroTriangulo(a, b, c);
        assertEquals(expResult, result);
    }
    
}
