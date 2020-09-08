package exercicios_pratica.lista_03.Quest_03_04;
import java.lang.Math;

public class Quadrado {
    
    double lado;

    public Quadrado(double valorLado) {
        this.lado = valorLado;
    }

    public double area() {
        double area = Math.pow(lado, 2);
        return area;
    }

    public double perimetro() {
        double perimetro = 4 * this.lado;
        return perimetro;
    }

}
