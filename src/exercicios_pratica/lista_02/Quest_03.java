package exercicios_pratica.lista_02;
import java.util.Scanner;

public class Quest_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do Vendedor: ");
        String nomeVendedor = entrada.nextLine();

        System.out.print("Salário fixo R$: ");
        double salarioFixo = entrada.nextDouble();

        System.out.print("Total de vendas no mês R$: ");
        double totalVendas = entrada.nextDouble();

        double salarioFinal = calculaSalarioFinal(salarioFixo, totalVendas);

        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Salário fixo R$: " + salarioFixo);
        System.out.println("Salário final R$: " + salarioFinal);

    }

    public static double calculaSalarioFinal(double salFixo, double totVendas){
        double salFinal;
       
        salFinal = salFixo + (totVendas * 15/100);

        return salFinal;
    }

}