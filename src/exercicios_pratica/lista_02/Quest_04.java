package exercicios_pratica.lista_02;
import java.util.Scanner;

public class Quest_04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em C°: ");
        double tempCelsius = entrada.nextDouble();

        //F = (9*C+160)/5
        double tempFahrenheit = (9 * tempCelsius + 160) / 5;

        System.out.println("--- CONVERSÃO DE C° PARA F° ---");
        System.out.println("Temperatura em Celsius: " + tempCelsius + " C°");
        System.out.println("Temperatura em Fahrenheit: " + tempFahrenheit + " F°");

    }
}