import java.util.Random;
import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.print("Digite um número: ");
        int numeroInserido = scanner.nextInt();

        boolean encontrado = false;
        for (int numero : numeros) {
            if (numero == numeroInserido) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O número " + numeroInserido + " está presente no array.");
        } else {
            System.out.println("O número " + numeroInserido + " não foi encontrado no array.");
        }

        scanner.close();
    }
}