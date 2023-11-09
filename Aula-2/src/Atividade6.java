import java.util.Scanner;

public class Atividade6 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        String inputString = scanner.nextLine();

        if (!inputString.isEmpty()) {
            int length = inputString.length();
            StringBuffer buffer = new StringBuffer(inputString);
            System.out.println(buffer.reverse());
        }
    }
}