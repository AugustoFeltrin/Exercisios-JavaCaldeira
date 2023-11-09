import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            int resultado = numero1 + numero2;
            System.out.println("A soma dos números é: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar dois números inteiros.");
        }
    }
}