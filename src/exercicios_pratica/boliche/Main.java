package exercicios_pratica.boliche;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int rodadas = 4;
        int arremessoDois = 0, arremessoUm = 0;

        int pontuacao[] = new int[20];

        for(int i = 0; i < rodadas; i++) {
            System.out.print("\nQuantidade de pinos derrubados na Rodada " +  (i+1) + "° arremesso 1 " + ": ");
            arremessoUm = entrada.nextInt();
            
            if(arremessoUm < 10) {
                System.out.print("Quantidade de pinos derrubados na Rodada " +  (i+1) + "° arremesso 2 " + ": ");
                arremessoDois = entrada.nextInt();
            } else {
                System.out.println("STRIIIKE!, parabéns vamos para proxima rodada...");
            }
            
            pontuacao[i] = arremessoUm;
            pontuacao[i + 1] = arremessoDois;
        }

        for(int p = 0; p < rodadas; p++) {
            System.out.println("\nPinos derrubados rodada " + (p+1) + " arremesso 1: " + pontuacao[p]);
            System.out.println("Pinos derrubados rodada " + (p+1) + " arremesso 2: " + pontuacao[p + 1]);

            //problema ao exibir pontuação do arremesso 2 / OBS: codigo ainda está incompleto 
        }

    }
}
