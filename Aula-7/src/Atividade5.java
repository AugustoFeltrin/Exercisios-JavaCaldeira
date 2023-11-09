import java.util.Scanner;

// Definição da exceção personalizada IdadeInvalidaException
class IdadeInvalidaException extends RuntimeException {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException("Idade inválida. A idade deve estar entre 0 e 150.");
            }

            System.out.println("Sua idade é: " + idade);

        } catch (IdadeInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado.");
        }
    }
}