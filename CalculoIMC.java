import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o peso em quilogramas:");
        double peso = scanner.nextDouble();

        System.out.println("Insira a altura em metros:");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O IMC é: " + imc);
        scanner.close();
    }
}
