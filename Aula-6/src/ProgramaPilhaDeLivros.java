import java.util.Scanner;
import java.util.Stack;

public class ProgramaPilhaDeLivros {
    public static void main(String[] args) {
        Stack<Atividade1> pilhaDeLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar livro à pilha");
            System.out.println("2. Imprimir elementos da pilha");
            System.out.println("3. Imprimir por categoria");
            System.out.println("4. Remover elementos da pilha");
            System.out.println("5. Sair");

            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer após a leitura do número

            switch (escolha) {
                case 1:
                    System.out.print("Nome do livro: ");
                    String nomeLivro = scanner.nextLine();
                    System.out.print("Categoria: ");
                    String categoriaLivro = scanner.nextLine();
                    Atividade1 novoLivro = new Atividade1(nomeLivro, categoriaLivro);
                    pilhaDeLivros.push(novoLivro);
                    System.out.println("Livro adicionado à pilha.");
                    break;

                case 2:
                    if (!pilhaDeLivros.isEmpty()) {
                        System.out.println("Elementos da pilha:");
                        for (Atividade1 Atividade1 : pilhaDeLivros) {
                            System.out.println(Atividade1);
                        }
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;

                case 3:
                    System.out.print("Digite a categoria: ");
                    String categoriaDesejada = scanner.nextLine();
                    System.out.println("Livros da categoria '" + categoriaDesejada + "':");
                    boolean categoriaEncontrada = false;
                    for (Atividade1 Atividade1 : pilhaDeLivros) {
                        if (Atividade1.getCategoria().equalsIgnoreCase(categoriaDesejada)) {
                            System.out.println(Atividade1);
                            categoriaEncontrada = true;
                        }
                    }
                    if (!categoriaEncontrada) {
                        System.out.println("Nenhum livro encontrado na categoria '" + categoriaDesejada + "'.");
                    }
                    break;

                case 4:
                    if (!pilhaDeLivros.isEmpty()) {
                        Atividade1 livroRemovido = pilhaDeLivros.pop();
                        System.out.println("Livro removido: " + livroRemovido);
                    } else {
                        System.out.println("A pilha está vazia.");
                    }
                    break;

                case 5:
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