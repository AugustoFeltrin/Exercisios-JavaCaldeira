import java.util.Scanner;
enum DiaDaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um dia da semana (por extenso): ");
        String entrada = scanner.nextLine().toUpperCase(); // Converta a entrada para maiúsculas para evitar erros de digitação

        try {
            DiaDaSemana dia = DiaDaSemana.valueOf(entrada);

            switch (dia) {
                case SEGUNDA:
                case TERCA:
                case QUARTA:
                case QUINTA:
                case SEXTA:
                    System.out.println("Você deve ir Trabalhar :( ");
                    break;
                case SABADO:
                case DOMINGO:
                    System.out.println("Você está de folga :) ");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Dia da semana inválido.");
        }
    }
}