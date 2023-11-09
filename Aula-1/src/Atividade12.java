import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantia em dólares: ");
        double dolares = scanner.nextDouble();

        System.out.println("Escolha a moeda de conversão:");
        System.out.println("1. Reais brasileiros (BRL)");
        System.out.println("2. Euros (EUR)");

        System.out.print("Digite o número da opção: ");
        int opcao = scanner.nextInt();

        double taxaDeCambio;

        switch (opcao) {
            case 1:
                taxaDeCambio = 5.0;
                break;
            case 2:
                taxaDeCambio = 5.30;
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        double valorConvertido = dolares * taxaDeCambio;

        scanner.close();

        System.out.println("O valor convertido é: " + valorConvertido);
    }
}