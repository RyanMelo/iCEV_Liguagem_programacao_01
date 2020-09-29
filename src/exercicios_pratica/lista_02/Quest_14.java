package exercicios_pratica.lista_02;
import java.util.Scanner;

public class Quest_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O Sucessor de " + numero + " é: " + sucessor);
        System.out.println("O Antecessor de " + numero + " é: " + antecessor);

    }
}
