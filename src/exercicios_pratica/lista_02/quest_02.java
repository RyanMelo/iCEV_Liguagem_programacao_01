package exercicios_pratica.lista_02;
import java.util.Scanner;

public class Quest_02 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);

        System.out.print("Distancia KM: ");
        float distancia = entrada.nextFloat();

        System.out.print("Total de combustível gastos R$: ");
        float totalGasto = entrada.nextFloat();

        float consumoMedio = totalGasto / distancia;

        System.out.println("Consumo medio R$ " + consumoMedio);
    }
}