import java.util.Scanner;

public class MetrosParaCentimentros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em metros: ");
        double Metros = scanner.nextDouble();
        double Centimetros = Metros * 100;
        System.out.println("O valor inserido em metros é:" + Centimetros);
        scanner.close();
    }
}