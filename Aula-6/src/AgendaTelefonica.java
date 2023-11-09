import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AgendaTelefonica {
    public static void main(String[] args) {
        Map<String, Atividade3> agenda = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Imprimir lista de contatos em ordem alfabética");
            System.out.println("3. Imprimir contatos por localidade");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Número de telefone: ");
                    String numeroTelefone = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Localidade (norte, sul, centro, leste, oeste): ");
                    String localidade = scanner.nextLine();

                    Atividade3 contato = new Atividade3(numeroTelefone, nome, endereco, localidade);
                    agenda.put(nome, contato);
                    System.out.println("Contato adicionado à agenda.");
                    break;

                case 2:
                    System.out.println("\nLista de contatos em ordem alfabética:");
                    for (Atividade3 c : agenda.values()) {
                        System.out.println(c);
                    }
                    break;

                case 3:
                    System.out.print("Digite a localidade (norte, sul, centro, leste, oeste): ");
                    String localidadeDesejada = scanner.nextLine();
                    System.out.println("\nContatos na localidade '" + localidadeDesejada + "':");
                    List<Atividade3> contatosPorLocalidade = new ArrayList<>();
                    for (Atividade3 c : agenda.values()) {
                        if (c.getLocalidade().equalsIgnoreCase(localidadeDesejada)) {
                            contatosPorLocalidade.add(c);
                        }
                    }
                    if (!contatosPorLocalidade.isEmpty()) {
                        for (Atividade3 c : contatosPorLocalidade) {
                            System.out.println(c);
                        }
                    } else {
                        System.out.println("Nenhum contato encontrado na localidade '" + localidadeDesejada + "'.");
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