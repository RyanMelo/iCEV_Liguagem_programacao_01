package exercicios_pratica.lista_01;
import java.util.Scanner;

public class quest_01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("---Veja qual e seu troco---");

        System.out.print("Digite o valor do produto R$: ");
        float valorProduto = entrada.nextFloat();

        System.out.print("Digite o valor que foi pago R$: ");
        float valorPago = entrada.nextFloat();

        float resultadoTroco = valorPago - valorProduto;
        System.out.println("O seu troco é de R$ " + resultadoTroco); 
    }

}