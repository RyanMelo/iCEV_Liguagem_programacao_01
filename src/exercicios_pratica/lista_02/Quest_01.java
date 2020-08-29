package exercicios_pratica.lista_02;
import java.util.Scanner;

public class Quest_01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Digite o primeiro numero: ");
        int numeroUm = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numeroDois = entrada.nextInt();

        int soma = numeroUm + numeroDois;
        int subtracao = numeroUm - numeroDois;
        int multi = numeroUm * numeroDois;
        float divisao = numeroUm / numeroDois;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multi);
        System.out.println("Divisao: " + divisao);
    }
}
