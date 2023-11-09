import java.util.Scanner;

public class Atividade7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroSoldadosEsparatanos = 300;
        int palpite;

        System.out.println("Leônidas: Vamos ver quantos inimigos enfrentaremos! Adivinhe quantos são.");

        do {
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSoldadosEsparatanos) {
                System.out.println("Leônidas: Um pouco mais!");
            } else if (palpite > numeroSoldadosEsparatanos) {
                System.out.println("Leônidas: Um pouco menos!");
            } else {
                System.out.println("Leônidas: Correto! Enfrentaremos " + numeroSoldadosEsparatanos + " inimigos!");
            }
        } while (palpite != numeroSoldadosEsparatanos);

        scanner.close();
    }
}