import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira um nome: ");
        String nome = scanner.nextLine();
        scanner.close();
        System.out.println("O nome digitado foi: " + nome);
    }
}