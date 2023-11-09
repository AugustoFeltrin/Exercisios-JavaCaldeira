import java.util.LinkedList;
import java.util.Scanner;


public class FilaDeImpressao {
    public static void main(String[] args) {
        LinkedList<Atividade5> filaDeImpressao = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar documento à fila");
            System.out.println("2. Imprimir documento da fila");
            System.out.println("3. Sair");

            int escolha;

            try {
                escolha = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa o buffer de entrada
                continue;
            }

            switch (escolha) {
                case 1:
                    System.out.print("Nome do documento: ");
                    String nomeDocumento = scanner.next();
                    System.out.print("Número de páginas: ");
                    int numeroPaginas = scanner.nextInt();
                    Atividade5 documento = new Atividade5(nomeDocumento, numeroPaginas);
                    filaDeImpressao.add(documento);
                    System.out.println("Documento adicionado à fila de impressão.");
                    break;

                case 2:
                    if (!filaDeImpressao.isEmpty()) {
                        Atividade5 documentoASerImpresso = filaDeImpressao.poll();
                        System.out.println("Imprimindo " + documentoASerImpresso);
                    } else {
                        System.out.println("A fila de impressão está vazia.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}