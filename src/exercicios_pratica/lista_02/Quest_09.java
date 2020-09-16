package exercicios_pratica.lista_02;
import java.util.Scanner;

public class Quest_09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double custoFabrica;
        double porcentagemDistribuidor = 0.28;
        double porcentagemImposto = 0.45;

        double custoConsumidor;

        System.out.print("Qual o valor do custo da fabrica R$: ");
        custoFabrica = entrada.nextDouble();

        custoConsumidor = custoFabrica + (custoFabrica * porcentagemDistribuidor) + (custoFabrica * porcentagemImposto);

        System.out.println("O custo do veiculo para o consumidor é R$ " + custoConsumidor);

    }
}
