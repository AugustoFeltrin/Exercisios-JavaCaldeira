import java.util.InputMismatchException;
import java.util.Scanner;
interface Calculavel {
    int calcular(int a, int b, char operacao);
}
enum Operacao {
    SOMAR('+'), SUBTRAIR('-'), MULTIPLICAR('*'), DIVIDIR('/');

    private char simbolo;

    Operacao(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }
}
class Calculadora implements Calculavel {
    @Override
    public int calcular(int a, int b, char operacao) {
        switch (operacao) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
    }
}

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        try {
            System.out.print("Digite o primeiro número inteiro: ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int numero2 = scanner.nextInt();

            System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = scanner.next().charAt(0);

            int resultado = calculadora.calcular(numero1, numero2, operacao);
            System.out.println("O resultado da operação é: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar números inteiros.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Operação inválida. Use um dos seguintes símbolos: +, -, *, /");
        }
    }
}