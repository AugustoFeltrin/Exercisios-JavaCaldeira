import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Insira 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        double media = (double) soma / numeros.length;

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        scanner.close();
    }
}