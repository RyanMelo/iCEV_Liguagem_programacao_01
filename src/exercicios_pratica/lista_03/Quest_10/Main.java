package exercicios_pratica.lista_03.Quest_10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Marca: ");
        String marca = entrada.nextLine();

        System.out.print("Lote: ");
        String lote = entrada.nextLine();

        System.out.print("Preço de compra R$: ");
        String precoCompra = entrada.nextLine();

        System.out.print("Preço de venda R$: ");
        String precoVenda = entrada.nextLine();

        CadastraProduto produto = new CadastraProduto(nome, marca, lote, precoCompra, precoVenda);

        int opcao = -1;
        do{
            System.out.println("\n\n1. Atualizar dado,");
            System.out.println("2. Listar produto,");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Qual valor deseja Alterar: ");
                    String dado = entrada.next();

                    System.out.print("Qual o novo valor na opção " + dado + ": ");
                    String novoValor = entrada.next();

                    produto.atualizar(dado, novoValor);;
                    break;

                case 2:
                    produto.listarProduto();
                    break;
                
                default:
                    System.out.print("Você Saiu!");
                    break;
            }

        }while(opcao != 3);

    }
}
