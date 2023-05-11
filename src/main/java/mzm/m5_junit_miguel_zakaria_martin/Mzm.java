package mzm.m5_junit_miguel_zakaria_martin;

public class Mzm {
    public double calcularAreaTriangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            return -1;
        } else {
            return (base * altura) / 2;
        }
    }

    public double calcularPerimetroTriangulo(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return -1;
        } else {
            return a + b + c;
        }
    }

    public double calcularAreaRectangulo(double base, double altura) {
        return (base * altura);
    }

    public double calcularPerimetroRectangulo(double ladoA, double ladoB) {
        return (2 * ladoA) + (2 * ladoB);
    }
    public double calcularAreaCirculo(double radio){

        double areaCirculo = 0.0;
        areaCirculo = Math.PI * radio * radio;
        return areaCirculo;
    }

    public double calcularPerimetroCiruculo(double radio){

        double perimetroCiruculo = 0.0;
        perimetroCiruculo = (2 * Math.PI) * radio;
        return perimetroCiruculo;
    }
}