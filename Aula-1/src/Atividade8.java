import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1. Gestante");
        System.out.println("2. Idosa");
        System.out.println("3. PCD (Pessoa com Deficiência)");
        System.out.println("4. Nenhuma das alternativas");

        System.out.print("Digite o número da opção: ");
        int opcao = scanner.nextInt();

        scanner.close();

        switch (opcao) {
            case 1:
            case 2:
            case 3:
                System.out.println("Você tem direito à fila prioritária.");
                break;
            case 4:
                System.out.println("Você não tem direito à fila prioritária.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }
    }