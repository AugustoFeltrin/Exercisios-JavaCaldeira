import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora = scanner.nextInt();

        System.out.print("Digite os minutos: ");
        int minuto = scanner.nextInt();

        System.out.print("Digite os segundos: ");
        int segundo = scanner.nextInt();

        scanner.close();

        // Converter o horário para segundos
        int segundosDesdeMeiaNoite = hora * 3600 + minuto * 60 + segundo;
        int segundosAteMeiaNoite = 24 * 3600 - segundosDesdeMeiaNoite;

        System.out.println("Segundos desde as 0h00min00s: " + segundosDesdeMeiaNoite);
        System.out.println("Segundos faltando para a meia-noite: " + segundosAteMeiaNoite);
    }
}