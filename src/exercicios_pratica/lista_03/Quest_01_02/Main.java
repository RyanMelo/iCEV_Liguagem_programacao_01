package exercicios_pratica.lista_03.Quest_01_02;

public class Main {
    public static void main(String[] args) {
        
        Lampada lamp01 = new Lampada();
        Lampada lamp02 = new Lampada();

        System.out.print("A Lampada 01 ");
        lamp01.liga();

        System.out.print("A Lampada 02 ");
        lamp02.desliga();

        System.out.print("A Lampada 01 está ");
        lamp01.observar();

        System.out.print("A Lampada 02 está ");
        lamp02.observar();

    }
}
