import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Map<String, Double> mapaDeProdutos = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Imprimir lista de produtos na ordem de inserção");
            System.out.println("3. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Preço do produto: R$");
                    double precoProduto = scanner.nextDouble();
                    mapaDeProdutos.put(nomeProduto, precoProduto);
                    System.out.println("Produto adicionado à lista.");
                    break;

                case 2:
                    System.out.println("\nLista de produtos na ordem de inserção:");
                    for (Map.Entry<String, Double> entry : mapaDeProdutos.entrySet()) {
                        String produto = entry.getKey();
                        double preco = entry.getValue();
                        System.out.println("Produto: " + produto + " - Preço: R$" + preco);
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