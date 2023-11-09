import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        verificarVoto(idade);
    }

    public static void verificarVoto(int idade) {
        if (idade < 16) {
            System.out.println("Você não pode votar, pois é menor de 16 anos.");
        } else if (idade >= 16 && idade <= 17) {
            System.out.println("O voto é facultativo para você, pois tem entre 16 e 17 anos.");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("O voto é obrigatório para você, pois tem entre 18 e 65 anos.");
        } else {
            System.out.println("O voto é facultativo para você, pois tem mais de 65 anos.");
        }
    }
}
