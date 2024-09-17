import java.util.Scanner;

public class RaioeArea{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo com raio %.2f é %.2f.\n", raio, area);
        scanner.close();
    }
}