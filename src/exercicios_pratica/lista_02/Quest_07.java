package exercicios_pratica.lista_02;
import java.util.Scanner;

public class Queste_07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorCompra, valorParcela;

        System.out.print("Valor do produto R$: ");
        valorCompra = entrada.nextDouble();

        valorParcela = valorCompra / 5;

        System.out.println("Valor das parcelas é de R$: " + valorParcela);
 
    }
}
