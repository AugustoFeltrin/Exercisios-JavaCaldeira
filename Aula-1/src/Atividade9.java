import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        scanner.close();

        int anoAtual = 2023;
        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é: " + idade + " anos.");
    }
}