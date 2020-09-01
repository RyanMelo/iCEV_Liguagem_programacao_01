package exercicios_pratica.lista_02;
import java.util.Scanner;

public class Quest_05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a cotação do dolar hoje R$: ");
        double dolaCotacao = entrada.nextDouble();

        System.out.print("Quantos dolares você tem R$: ");
        double qtdDolares = entrada.nextDouble();

        double resultConvercao = dolaCotacao * qtdDolares;
        
        System.out.println("Voce tem R$ " + resultConvercao + " reais.");
        
    }
}