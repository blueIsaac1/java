import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Por favor, insira o segundo número: ");
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma dos números " + numero1 + " e " + numero2 + " é: " + soma);
        scanner.close();
    }
}
