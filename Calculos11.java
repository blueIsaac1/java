import java.util.Scanner;

public class Calculos11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int num1 = scanner.nextInt();

        System.out.println("Insira um número inteiro:");
        int num2 = scanner.nextInt();

        System.out.println("Insira um número Real:");
        double num3 = scanner.nextDouble();

        double produto1 = (2*num1) * (num2/2.0);
        double produto2 = (3*num1) + num3;
        double produto3 = Math.pow(num3, 3);

        System.out.println("O produto 1 é: " + produto1);   // Produto do dobro do primeiro com metade do segundo
        System.out.println("O produto 2 é: " + produto2);   // Produto da soma do triplo do primeiro com o terceiro
        System.out.println("O produto 3 é: " + produto3);   // Produto do cubo do terceiro
}

    
}