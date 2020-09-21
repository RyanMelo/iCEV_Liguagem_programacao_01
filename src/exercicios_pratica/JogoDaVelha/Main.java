package exercicios_pratica.JogoDaVelha;

public class Main {
    public static void main(String[] args) {

        JogoVelha jogo = new JogoVelha();

        
        System.out.println("Jogador 1: x");
        System.out.println("Jogador 2: o");
        System.out.println("ATENÇÃO: Use o x ou o minusculo durante todo o jogo!\n");
        jogo.mostraJogo();
        jogo.recebeValor();
        jogo.mostraResultado();

    }
}
