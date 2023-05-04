package mzm.m5_junit_miguel_zakaria_martin;

public class Mzm {
    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2.0;
    }

    public double calcularPerimetroTriangulo(double ladoA, double ladoB, double ladoC) {
        return ladoA + ladoB + ladoC;
    }

    public double calcularPerimetroTriangulo(double ladoA, double ladoB, int angulo) {
        return ladoA + ladoB
                + Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - (2 * ladoA * ladoB * Math.cos(angulo)));
    }

    public double calcularPerimetroTriangulo(double lado, int anguloA, int anguloB) {
        return lado + (lado * ((Math.sin(anguloA) + Math.sin(anguloB) / (Math.sin(anguloA + anguloB)))));
    }
}