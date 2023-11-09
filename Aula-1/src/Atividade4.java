import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do seu salário: ");
        double salarioUsuario = scanner.nextDouble();

        double salarioMinimo = 1320.0; // Valor fixo do salário mínimo
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;

        scanner.close();

        System.out.println("Você ganha o equivalente a " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}