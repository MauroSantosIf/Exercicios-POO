import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Buscar produto pelo nome");
            System.out.println("3. Listar todos os produtos");
            System.out.println("4. Efetuar venda de um produto");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1: cadastrarProduto(); break;
                case 2: buscarProduto(); break;
                case 3: listarProdutos(); break;
                case 4: efetuarVenda(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public static void cadastrarProduto() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Código: ");
        int codigo = sc.nextInt();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        produtos.add(new Produto(nome, codigo, preco, quantidade));
        System.out.println("Produto cadastrado com sucesso!");
    }

    public static void buscarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nomeBuscado = sc.nextLine();

        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nomeBuscado)) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }

    public static void efetuarVenda() {
        System.out.print("Digite o código do produto para venda: ");
        int codigo = sc.nextInt();

        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                System.out.print("Quantidade a vender: ");
                int qtdVenda = sc.nextInt();

                if (qtdVenda <= p.getQuantidade()) {
                    p.setQuantidade(p.getQuantidade() - qtdVenda);
                    System.out.println("Venda realizada! Estoque atualizado.");
                } else {
                    System.out.println("Quantidade insuficiente em estoque!");
                }
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }
}
