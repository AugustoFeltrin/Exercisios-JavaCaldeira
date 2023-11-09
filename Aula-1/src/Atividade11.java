import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String input = scanner.nextLine().toLowerCase(); // Convertendo para minúsculas para simplificar a contagem

        scanner.close();

        int contadorVogais = 0;

        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Número de vogais na palavra/frase: " + contadorVogais);
    }
}