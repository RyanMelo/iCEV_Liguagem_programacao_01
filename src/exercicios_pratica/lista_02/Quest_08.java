package exercicios_pratica.lista_02;
import java.util.Scanner;

public class Quest_08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double precoCusto;
        double porcentagemAcrecimo;
        
        System.out.print("Preço de Custo R$: ");
        precoCusto = entrada.nextDouble();

        System.out.print("Porcentagem(%) do acrecimo: ");
        porcentagemAcrecimo = entrada.nextDouble();


        double valorVenda = precoCusto + (precoCusto * porcentagemAcrecimo / 100);
        System.out.println("Preço de venda R$ " + valorVenda);

    }
}
