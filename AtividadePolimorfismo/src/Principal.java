
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        int op;

        do {
            System.out.println("\n1. Cadastrar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Cadastrar livro");
            System.out.println("4. Listar livros");
            System.out.println("5. Imprimir tudo");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nomeP = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descP = scanner.nextLine();
                    System.out.print("Preço: ");
                    double precoP = scanner.nextDouble();
                    scanner.nextLine();

                    Produto p = new Produto(nomeP, descP, precoP);
                    produtos.add(p);
                    System.out.println("Produto cadastrado com sucesso.");
                    break;

                case 2:
                    System.out.println("Lista de Produtos (exceto livros):");
                    for (Produto prod : produtos) {
                        if (!(prod instanceof Livro)) {
                            System.out.println(prod.toString());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nome do livro: ");
                    String nomeL = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descL = scanner.nextLine();
                    System.out.print("Preço: ");
                    double precoL = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Autores: ");
                    String autores = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Editora: ");
                    String editora = scanner.nextLine();

                    Livro l = new Livro(nomeL, descL, precoL, autores, isbn, editora);
                    produtos.add(l);
                    System.out.println("Livro cadastrado com sucesso.");
                    break;

                case 4:
                    System.out.println("Lista de Livros:");
                    for (Produto prod : produtos) {
                        if (prod instanceof Livro) {
                            System.out.println(prod.toString());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Todos os produtos:");
                    for (Produto prod : produtos) {
                        System.out.println(prod.toString());
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 6);

        scanner.close();
    }
}
