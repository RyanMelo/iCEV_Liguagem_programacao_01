package exercicios_pratica.lista_02;
import java.util.Scanner;

public class Quest_06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor depositado R$: ");
        double valorDepositado = entrada.nextDouble();

        double rendimento = valorDepositado + 0.70 * 100;

        System.out.print("Seu redimento é de R$ " + rendimento);

    }
}
