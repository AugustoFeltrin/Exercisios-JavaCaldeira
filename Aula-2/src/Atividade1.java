import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o número final do intervalo: ");
        int fim = scanner.nextInt();

        System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");

        for (int numero = inicio; numero <= fim; numero++) {
            if (isPrimo(numero)) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}