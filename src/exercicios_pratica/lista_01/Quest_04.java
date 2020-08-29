package exercicios_pratica.lista_01;
import java.util.Scanner;

public class Quest_04 {
    public static void main(String[] args) {
        // esta e a formula a ser calculada S = 1 + 1/1! + ½! + 1/3! + 1 /N! 

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        double valorN = entrada.nextDouble();

        double valorS = 1 + 1/calculaFatorial(1) + 1/calculaFatorial(2) + 1/calculaFatorial(3) + 1/calculaFatorial(valorN);

        System.out.println("O valor de S é: " + valorS);
        double resultFatorial = calculaFatorial(valorN);
        System.out.println("O valor de N é: " + resultFatorial);
    }

    public static double calculaFatorial(double numero){
        double fat = 1;
        for(double i = 1; i < numero; numero--){
            fat *= numero;
        }

        return fat;
    }

}
