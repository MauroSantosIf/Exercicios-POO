import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Livro> Livros = new ArrayList<Livro>();

    public static void main(String[] args) throws Exception {
        while(true){
            System.out.println("------ Menu de Opções ------");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Buscar livro por título");
            System.out.println("3 - Buscar Livros por autor");
            System.out.println("4 - Listar todos os Livros");
            System.out.println("0 - Sair");
            System.out.println("----------------------------");
            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch(opcao){
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    buscarLivroTitulo();
                    break;
                case 3:
                    buscarLivrosAutor();
                    break;
                case 4:
                    listarLivros();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    // Opcao 1
    public static void cadastrarLivro(){

        System.out.print("Digite o autor do livro: ");
        String autor = sc.nextLine();

        System.out.print("Digite a editora do livro: ");
        String editora = sc.nextLine();

        System.out.print("Digite o titulo do Livro: ");
        String titulo = sc.nextLine();

        System.out.print("Digite o ano de edicao do Livro: ");
        String anoEdicao = sc.nextLine();

        Livro livro = new Livro(autor, editora, titulo, anoEdicao);
        Livros.add(livro);
        System.out.println("Livro cadastrado com sucesso!");
        System.out.println();

    }
    // Opcao 2
    public static void buscarLivroTitulo(){
        System.out.print("Digite o titulo do livro procurado:");
        String tituloBuscado = sc.nextLine();

        boolean encontrado = false;

        for(Livro l : Livros){
            if(l.getTitulo().equalsIgnoreCase(tituloBuscado)){
                System.out.println(l);  
                encontrado = true; 
            }
        }

        if(!encontrado){
            System.out.println("Livro não encontrado!");
            System.out.println();
        }
    }
    // Opcao 3
    public static void buscarLivrosAutor(){
        System.out.print("Digite o autor dos livros procurados: ");
        String autorBuscado = sc.nextLine();
        System.out.println();


        boolean encontrado = false;

        for(Livro l : Livros){
            if(l.getAutor().equalsIgnoreCase(autorBuscado)){
                System.out.println(l);  
                encontrado = true; 
            }
        }

        if(!encontrado){
            System.out.println("Livro não encontrado!");
            System.out.println();
        }
    }
    // Opcao 4
    public static void listarLivros(){
        for(Livro l : Livros){
            System.out.println(l);
        }
    }
}
