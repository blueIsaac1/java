import java.util.Scanner;
public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Por favor, insira a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Por favor, insira a terceira nota: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Por favor, insira a quarta nota: ");
        double nota4 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("A média das notas é: %.2f%n", media);
        scanner.close();
    }
}
