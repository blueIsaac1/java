import java.util.Scanner;

public class Calculos13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me diga quantos horas você no mês: ");
        double horas = scanner.nextDouble();
        System.out.println("Me diga quanto você ganha por hora: ");
        double ganho = scanner.nextDouble();
        double descontoImpRenda = 0.11;
        double descontoINSS = 0.08;
        double descontoSindicato = 0.05;
        double salario = horas * ganho;
        double desconto1 = salario * descontoImpRenda;
        double desconto2 = salario * descontoINSS;
        double desconto3 = salario * descontoSindicato;
        double salarioLiquido = salario - desconto1 - desconto2 - desconto3;
        System.out.println("Seu salário no mês é: " + salario);
        System.out.println("Seu desconto do Imposto de Renda é: " + desconto1);
        System.out.println("Seu desconto do INSS é: " + desconto2);
        System.out.println("Seu desconto do Sindicato é: " + desconto3);
        System.out.println("Seu salário líquido é: " + salarioLiquido);
    }
}