import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        String inputString = scanner.nextLine();

        if (!inputString.isEmpty()) {
            int length = inputString.length();
            int middle = length / 2;
            String primeiraMetade = inputString.substring(0, middle);
            System.out.println("A primeira metade da palavra é: " + primeiraMetade);
        } else {
            System.out.println("Por favor, insira uma palavra válida.");
        }

        scanner.close();
    }
}