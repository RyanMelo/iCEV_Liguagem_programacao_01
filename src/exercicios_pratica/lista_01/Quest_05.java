package exercicios_pratica.lista_01;
import java.util.Scanner;
import java.lang.Math;

public class quest_05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valorJ;
        int qtdQuadrados = 0;

        do{
            System.out.print("Digite o valor de J: ");
            valorJ = entrada.nextInt();

            if(valorJ != 0){
                double raiz = Math.sqrt(valorJ);

                if(Math.pow(raiz, 2) == valorJ) {
                    qtdQuadrados += 1;
                    // System.out.println("Sim");

                }
                
            } else {
                System.out.println("Programa finalizado!");
                break;
            }

        }while(valorJ != 0);

        System.out.println("Quantidade de quadrados: " + qtdQuadrados);

    }
}