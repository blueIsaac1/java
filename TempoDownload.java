import java.util.Scanner;
public class TempoDownload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade do link de internet (Mbps):");
        double velocidadeMbps = scanner.nextDouble();

        System.out.println("Digite o tamanho do arquivo para download (MB):");
        double tamanhoArquivoMB = scanner.nextDouble();

        double tempseg = (tamanhoArquivoMB*8) / velocidadeMbps;
        double tempmin = tempseg / 60;

        System.out.println("O tempo de download do arquivo será de " + tempmin + " minutos.");
        scanner.close();
    }
}
