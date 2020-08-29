package exercicios_pratica.lista_01;
import java.util.Scanner;

public class Quest_03 {
    public static void main(String[] args) {
        double excesso, multa = 0;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("---Balança de pesagem---");
        
        System.out.print("Valor do peso em Kg: ");
        double peso = entrada.nextDouble();

        if(peso > 50){
            excesso = peso - 50;
            multa = 4 * excesso;
            
            System.out.println("ATENÇÃO: Está ascima do peso permitido");
            System.out.println("Execesso " + excesso + "kg");
            System.out.println("Multa R$ " + multa);

        } else {
            System.out.println("ESTÁ NA FAIXA DE PESO PERMITIDA");
        }

    }
}
