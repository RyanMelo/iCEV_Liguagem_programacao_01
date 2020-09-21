package exercicios_pratica.JogoDaVelha;
import java.util.Scanner;

public class JogoVelha {
    
    private Scanner entrada = new Scanner(System.in);

    private String[][] matrizJogo = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
    private String[] vetorResult = new String[8];
    private String resultado;

    public void mostraJogo() {
        for(int linha = 0; linha < 3; linha++) {
            for(int coluna = 0; coluna < 3; coluna++) {
                System.out.print("  |  " + matrizJogo[linha][coluna]);
            }
            System.out.print("  |\n");
        }
    }

    public void recebeValor() {
        int posicao;
        String valorXouO;

        for(int contador = 1; contador <= 9; contador++) {
            System.out.print("Escolha a posição: ");
            posicao = entrada.nextInt();
            entrada.nextLine();

            if(posicao >= 1 && posicao <= 9) {
                System.out.print("Digite o valor x ou o: ");
                valorXouO = entrada.nextLine();

                switch (posicao) {
                    case 1:
                        matrizJogo[0][0] = valorXouO;
                        break;
    
                    case 2:
                        matrizJogo[0][1] = valorXouO;
                        break;
    
                    case 3:
                        matrizJogo[0][2] = valorXouO;
                        break;
    
                    case 4:
                        matrizJogo[1][0] = valorXouO;
                        break;
    
                    case 5:
                        matrizJogo[1][1] = valorXouO;
                        break;
    
                    case 6:
                        matrizJogo[1][2] = valorXouO;
                        break;
    
                    case 7:
                        matrizJogo[2][0] = valorXouO;
                        break;
    
                    case 8:
                        matrizJogo[2][1] = valorXouO;
                        break;
    
                    case 9:
                        matrizJogo[2][2] = valorXouO;
                        break;
                
                    default:
                        System.out.println("Essa Posição não existe, Tente novamente!");
                        break;
                }

            } else {
                System.out.println("Essa Posição não existe, Tente novamente!");
                break;
            }

            System.out.println("\nO Jogo está Assim: ");
            mostraJogo();
        }

    }

    public void mostraResultado() {
        vetorResult[0] = matrizJogo[0][0] + matrizJogo[0][1] + matrizJogo[0][2];
        vetorResult[1] = matrizJogo[1][0] + matrizJogo[1][1] + matrizJogo[1][2];
        vetorResult[2] = matrizJogo[2][0] + matrizJogo[2][1] + matrizJogo[2][2];

        vetorResult[3] = matrizJogo[0][0] + matrizJogo[1][0] + matrizJogo[2][0];
        vetorResult[4] = matrizJogo[0][1] + matrizJogo[1][1] + matrizJogo[2][1];
        vetorResult[5] = matrizJogo[0][2] + matrizJogo[1][2] + matrizJogo[2][2];

        vetorResult[6] = matrizJogo[0][0] + matrizJogo[1][1] + matrizJogo[2][2];
        vetorResult[7] = matrizJogo[0][2] + matrizJogo[1][1] + matrizJogo[2][0];

        for(int i = 0; i < 8; i++) {
            
            switch (vetorResult[i]) {
                case "xxx":
                    resultado = "Jogador 1 VENCEU!";
                    break;
                
                case "ooo":
                    resultado = "Jogador 2 VENCEU!";
                    break;
            
                default:
                    resultado = "Empate";
                    break;
            }
        }
        System.out.println(resultado);
    }

}
