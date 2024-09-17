import java.util.Scanner;

public class CalculoHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me diga quantas horas você trabalha por mês? ");
        double horas = scanner.nextDouble();
        System.out.println("Agora me diga o quanto que você ganha por hora? ");
        double ganhohoras = scanner.nextDouble();
        double salario = horas * ganhohoras;
        System.out.printf("Horas trabalhadas por mês: %.2f\n", horas);
        System.out.printf("Ganho por hora: %.2f\n", ganhohoras);
        System.out.printf("Salário total: %.2f\n", salario);
        scanner.close();
    }
}
