import java.util.Scanner;
public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira um número: ");
        int numero = scanner.nextInt();
        System.out.println("Você inseriu o número: " + numero);
        scanner.close();
    }
}
