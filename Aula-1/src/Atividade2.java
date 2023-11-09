import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, insira o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Agora, insira o segundo número: ");
        double numero2 = scanner.nextDouble();

        scanner.close();

        System.out.println("Os números digitados foram: " + numero1 + " e " + numero2);
    }
}