import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Atividade3> listaDeTarefas = new ArrayList<>();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Remover Tarefa");
            System.out.println("3 - Exibir Tarefas");
            System.out.println("4 - Sair");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite a data da tarefa: ");
                    String data = scanner.nextLine();
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    Atividade3 novaTarefa = new Atividade3(titulo, data, descricao);
                    listaDeTarefas.add(novaTarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    if (!listaDeTarefas.isEmpty()) {
                        System.out.println("Escolha o número da tarefa a ser removida:");
                        for (int i = 0; i < listaDeTarefas.size(); i++) {
                            System.out.println((i + 1) + " - " + listaDeTarefas.get(i).getTitulo());
                        }
                        int numeroTarefa = scanner.nextInt();
                        if (numeroTarefa >= 1 && numeroTarefa <= listaDeTarefas.size()) {
                            listaDeTarefas.remove(numeroTarefa - 1);
                            System.out.println("Tarefa removida com sucesso!");
                        } else {
                            System.out.println("Número de tarefa inválido.");
                        }
                    } else {
                        System.out.println("A lista de tarefas está vazia.");
                    }
                    break;
                case 3:
                    if (!listaDeTarefas.isEmpty()) {
                        System.out.println("Lista de Tarefas:");
                        for (Atividade3 tarefa : listaDeTarefas) {
                            System.out.println(tarefa);
                        }
                    } else {
                        System.out.println("A lista de tarefas está vazia.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}