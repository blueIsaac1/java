import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit para Celsius: ");
        double fahrenheit = scanner.nextDouble();
        double conversao = (fahrenheit - 32) / 1.8;
        System.out.printf("Conversão: %.2f\n", conversao);
        scanner.close();
    }
}
