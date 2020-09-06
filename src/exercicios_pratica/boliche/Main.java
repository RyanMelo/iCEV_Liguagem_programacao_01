package exercicios_pratica.boliche;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int rodadas = 10;
        int tentUm = 0;
        int tentDois = 0;
        int pontos = 0;
        int totalPontos = 0;

        int arreyPontos[] = new int[rodadas];

        for(int i = 0; i < rodadas; i++) {
            
            System.out.print("\nPinos derrubados na 1° tentariva: ");
            tentUm = entrada.nextInt();

            System.out.print("Pinos derrubados na 2° tentativa: ");
            tentDois = entrada.nextInt();

            if(tentUm == 0 && tentDois == 0) {
                pontos = tentUm + tentDois;
                arreyPontos[i] = pontos;
                System.out.println("Voce fez: " + pontos + " na " + (i+1) + "º rodada");
            } 
            
            else if (tentUm == 10 && tentDois == 10) {
                pontos = 10;
                arreyPontos[i] = pontos;
                System.out.println("Parabén você fez um SPARE!" + " na " + (i+1) + "º rodada");
            } 

            else if(tentUm == 10) {
                pontos = 30;
                arreyPontos[i] = pontos;
                System.out.println("Parabén você fez um STRIKE!" + " na " + (i+1) + "º rodada");
            } 
            
            else {
                pontos = tentUm + tentDois;
                arreyPontos[i] = pontos;
                System.out.println("Voce fez: " + pontos + " na " + (i+1) + "º rodada");
            }

        }

        for(int p = 0; p < arreyPontos.length; p++) {

            /*
            if(arreyPontos[p] == 20) {
                int pontoProvisorioUm = arreyPontos[p]  / 2;
                p+=1;
                pontoProvisorioUm += arreyPontos[p];
                p-=1;
                arreyPontos[p] = pontoProvisorioUm;
            }
            
            else if(arreyPontos[p] == 10) {
                arreyPontos[p] = 10 + arreyPontos[p += 1] + arreyPontos[p += 2];
            }
            */
            
            totalPontos += arreyPontos[p];
        }

        System.out.println("Total de pontos é: " + totalPontos);

    }
}
