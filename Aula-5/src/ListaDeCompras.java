import java.util.ArrayList;
import java.util.Scanner;
public class ListaDeCompras {
    public static void main(String[] args) {
        ArrayList<Atividade4> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar item à lista de compras");
            System.out.println("2. Remover item da lista de compras");
            System.out.println("3. Exibir lista de compras");
            System.out.println("4. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Nome do item: ");
                    String nomeItem = scanner.next();
                    System.out.print("Data de validade: ");
                    String dataValidade = scanner.next();
                    Atividade4 item = new Atividade4(nomeItem, dataValidade);
                    listaDeCompras.add(item);
                    System.out.println("Item adicionado à lista de compras.");
                    break;

                case 2:
                    if (!listaDeCompras.isEmpty()) {
                        System.out.print("Índice do item a ser removido: ");
                        int indice = scanner.nextInt();
                        if (indice >= 0 && indice < listaDeCompras.size()) {
                            Atividade4 itemARemover = listaDeCompras.remove(indice);
                            System.out.println("Item removido da lista de compras: " + itemARemover);
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    } else {
                        System.out.println("A lista de compras está vazia.");
                    }
                    break;

                case 3:
                    if (!listaDeCompras.isEmpty()) {
                        System.out.println("Lista de compras:");
                        for (Atividade4 Atividade4 : listaDeCompras) {
                            System.out.println(Atividade4);
                        }
                    } else {
                        System.out.println("A lista de compras está vazia.");
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