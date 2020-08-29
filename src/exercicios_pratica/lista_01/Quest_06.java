package exercicios_pratica.lista_01;
import java.util.Scanner;

public class quest_06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m;

        do{
            System.out.print("Digite um numero: ");
            m = entrada.nextInt();

            if(m < 10) {
                int fatorialM = calculaFatorial(m);
                System.out.println("Fatorial de " + m + " é: " + fatorialM);
            } else {
                int qtdDivisor = numerDivisores(m);
                System.out.println("Numero de divisores de " + m + " é: " + qtdDivisor);
            }

        }while(m != 999);

    }

    public static int calculaFatorial(int numero) {
        int fat = 1;
        for(int i = 1; numero > i; numero--){
            fat *= numero;
        }

        return fat;
    }

    public static int numerDivisores(int numero) {
        int divisao;
        int qtdDivisores = 0;
       
        for(int i = 1; i <= numero; i++) {
            divisao = numero / i;
            
            if(divisao * i == numero){
                qtdDivisores++;
            }

        }

        return qtdDivisores;
    }


}