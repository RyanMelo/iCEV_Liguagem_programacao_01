package exercicios_pratica.lista_01;
import java.util.Scanner;
import java.lang.Math;

public class Quest_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("---Vamos calcular a equação de 2° grau---");

        System.out.print("Qual o valor de A: ");
        int valorA = entrada.nextInt();

        System.out.print("Qual o valor de B: ");
        int valorB = entrada.nextInt();

        System.out.print("Qual o valor de C: ");
        int valorC = entrada.nextInt();
        
        double delta = Math.pow(valorB, 2) - 4 * valorA * valorC;

        if(delta > 0){
            double xLinhas = -valorB + Math.sqrt(delta) / 2 * valorA;
            double xDuasLinhas = -valorB - Math.sqrt(delta) / 2 * valorA;

            System.out.println("---------------//---------------");
            System.out.println("Valor de delta: " + delta);
            System.out.println("Valor de x': " + xLinhas);
            System.out.println("Valor de x" + ": "  + xDuasLinhas);
        } else {
            System.out.println("O valor de delta e menor ou igual a zero");
        }
        
    }
}
