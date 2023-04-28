package mzm.m5_junit_miguel_zakaria_martin;

public class Mzm{

    public double calcularAreaCirculo(double radio){

        double areaCirculo = 0.0;
        areaCirculo = Math.PI * (radio * 2);
        return areaCirculo;
    }

    public double calcularPerimetroCiruculo(double radio){

        double perimetroCiruculo = 0.0;
        perimetroCiruculo = (2 * Math.PI) * radio;
        return perimetroCiruculo;
    }
}