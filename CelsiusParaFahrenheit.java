import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius para Fahrenheit: ");
        double celcius = scanner.nextDouble();
        double conversao = (celcius * 1.8) + 32;
        System.out.printf("Conversão: %.2f\n", conversao);
        scanner.close();
    }
}
