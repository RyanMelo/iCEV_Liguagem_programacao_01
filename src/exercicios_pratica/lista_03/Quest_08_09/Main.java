package exercicios_pratica.lista_03.Quest_08_09;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Data Abertura: ");
        String dataAbertura = entrada.nextLine();

        System.out.print("Agencia: ");
        String agencia = entrada.nextLine();

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Numero: ");
        int numero = entrada.nextInt();

        System.out.print("Saldo: ");
        double saldo = entrada.nextDouble();

        Conta c1 = new Conta(nome, numero, agencia, saldo, dataAbertura);
        
        int opcao = -1;
        do{
            System.out.println("\nEscolha a opcao:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Recupera Dados Para Impressao");
            System.out.println("999. Sair do programa");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o valor que deseja depositar R$: ");
                    double valorDepositado = entrada.nextDouble();
                    c1.despositar(valorDepositado);
                    break;
                
                case 2:
                    System.out.print("Insira o valor que deseja sacar R$: ");
                    double valorSacado = entrada.nextDouble();
                    c1.saca(valorSacado);
                    break;
                
                case 3:
                    System.out.println("Dados da Impressão: ");
                    System.out.println(c1.recuperaDadosParaImpressao());
                    break;
            
                default:
                    System.out.println("Voce Saiu, THAU!");
                    break;
            }

        }while(opcao != 999);
        

    }
}
