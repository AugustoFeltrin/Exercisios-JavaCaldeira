import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Por favor, insira o primeiro número: ");
            double n1 = scanner.nextDouble();

            System.out.print("Insira o segundo número: ");
            double n2 = scanner.nextDouble();

            System.out.print("Agora, insira a operacao (+, -, * e /): ");
            char operacao = scanner.next().charAt(0);

            double resultado = 0.0;

            switch (operacao) {
                case '+':
                    resultado = n1 + n2;
                    break;
                case '-':
                    resultado = n1 - n2;
                    break;
                case '*':
                    resultado = n1 * n2;
                    break;
                case '/':
                    resultado = n1 / n2;
                    break;
                default:
                    System.out.println("Operação inválida.");
            }

            System.out.println("O resultado do seu cálculo foi: " + resultado);

            System.out.print("Deseja continuar calculando? (s/n): ");
            char continuar = scanner.next().charAt(0);

            if (continuar == 'n' || continuar == 'N') {
                System.out.println("Programa encerrado.");
                break;
            }
        }

        scanner.close();
    }
}