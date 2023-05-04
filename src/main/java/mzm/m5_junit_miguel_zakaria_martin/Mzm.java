package mzm.m5_junit_miguel_zakaria_martin;

public class Mzm{
    public double calcularAreaTriangulo(double base, double altura) {
        if (base <=0 || altura <= 0) {
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
}