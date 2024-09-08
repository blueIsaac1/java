import java.util.Scanner;

public class AreaDoQuadrado{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();
        double areaQ = Math.pow(lado, lado);
        double areaQ_dobro = areaQ * 2;
        System.out.printf("A área do quadro e o dobro é %.2f é %.2f.\n", areaQ, areaQ_dobro);
        scanner.close();
    }
}