import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Map<String, Integer> mapaDeIdades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar pessoa");
            System.out.println("2. Acessar idade de uma pessoa");
            System.out.println("3. Imprimir pessoas na terceira idade");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Nome da pessoa: ");
                    String nomePessoa = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idadePessoa = scanner.nextInt();
                    mapaDeIdades.put(nomePessoa, idadePessoa);
                    System.out.println("Pessoa adicionada.");
                    break;

                case 2:
                    System.out.print("Digite o nome da pessoa: ");
                    String nomeProcurado = scanner.nextLine();
                    if (mapaDeIdades.containsKey(nomeProcurado)) {
                        int idade = mapaDeIdades.get(nomeProcurado);
                        System.out.println(nomeProcurado + " tem " + idade + " anos.");
                    } else {
                        System.out.println(nomeProcurado + " não encontrado no mapa.");
                    }
                    break;

                case 3:
                    System.out.println("\nPessoas na terceira idade:");
                    for (Map.Entry<String, Integer> entry : mapaDeIdades.entrySet()) {
                        String nome = entry.getKey();
                        int idade = entry.getValue();
                        if (idade >= 60) {
                            System.out.println(nome + " tem " + idade + " anos.");
                        }
                    }
                    break;

                case 4:
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