package exercicios_pratica.lista_02;

public class Quest_10 {
    public static void main(String[] args) {
        int varA = 10;
        int varB = 20;
        int temp = varB;

        System.out.println("Valor de A é: " + varA);
        System.out.println("Valor de B é: " + varB);

        varB = varA;
        varA = temp;

        System.out.println("Agora o valor da A é: " + varA);
        System.out.println("Agora o valor da B é: " + varB);
        
    }
}
