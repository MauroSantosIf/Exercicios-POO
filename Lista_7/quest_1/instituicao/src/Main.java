import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    static ArrayList<Estudantes> estudantes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in); // Scanner único

    // Falta 3 funcionalidades
    public static void main(String[] args) {

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar um estudante");
            System.out.println("2 - Calcular média de um estudante");
            System.out.println("3 - Consultar matrícula de um estudante");
            System.out.println("4 - Consultar endereço de um estudante");
            System.out.println("5 - Calcular a média da turma");
            System.out.println("6 - Exibir os nomes dos estudantes reprovados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    CadastrarEstudante();
                    break;
                case 2:
                    calcularMedia();
                    break;
                case 3:
                    buscarMatricula();
                    break;
                case 4:
                    buscarEndereco();
                    break;
                case 5:
                    calcularMediaTurma();
                    break;
                case 6:
                    alunosReprovados();
                    break;
                case 0:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }

    //opção 1
    public static void CadastrarEstudante() {
        System.out.println("----------- Cadastro de Aluno -----------");

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite um número para contato: ");
        int numeroTelefone = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o número de matrícula: ");
        int numMatricula = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o endereço do aluno: ");
        String endereco = sc.nextLine();

        System.out.println("Digite a primeira e segunda nota do aluno: ");
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        sc.nextLine(); // limpar buffer

        float[] notas = {nota1, nota2};

        Estudantes estudante = new Estudantes(nome, numeroTelefone, numMatricula, endereco, notas);
        estudantes.add(estudante);

        System.out.println("Aluno cadastrado com sucesso!");
    }
    //opção 2
    public static void calcularMedia() {
        System.out.print("Digite o nome do estudante para calcular a média: ");
        String nomeProcurado = sc.nextLine();

        boolean encontrado = false;

        for (Estudantes e : estudantes) {
            if (e.getNome().equalsIgnoreCase(nomeProcurado)) {
                float media = e.calcularMedia();
                System.out.println("Média do(a) estudante " + e.getNome() + ": " + media);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Estudante não encontrado.");
        }
    }
    //opção 3
    public static void buscarMatricula() {

        System.out.print("Digite o nome do aluno para saber seu número de matricula: ");
        String nomeProcurado = sc.nextLine(); 

        boolean encontrado = false;

        for (Estudantes e : estudantes) {
            if (e.getNome().equalsIgnoreCase(nomeProcurado)) {
                System.out.println("O aluno(a) " + e.getNome() + " tem a matrícula com número: "+ e.getNumMatricula());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Matrícula não encontrada.");
        }
    }
    //opção 4
    public static void buscarEndereco(){
        System.out.print("Digite o nome do aluno que deseja saber o endereço:");
        String nomeProcurado = sc.nextLine();

        for(Estudantes e : estudantes){
            if(e.getNome().equalsIgnoreCase(nomeProcurado)){
                System.out.println("O endereço do(a) aluno(a) " + e.getNome() + " é: " + e.getEndereco());
                return;
            } else {
                System.out.println("Aluno não encontrado.");
            }
        }

    }
    //opção 5
    public static void calcularMediaTurma(){
        float somaTotal = 0;
        int totalNotas = 0;

        for(Estudantes e : estudantes){
            if(e.notas != null){
                for(float nota : e.getNotas()){
                    somaTotal += nota;
                    totalNotas++;
                }
            }
        }
        if(totalNotas > 0){
            float mediaTurma = somaTotal / totalNotas;
            System.out.println("A média da turma é: " + mediaTurma);
        } else {
            System.out.println("Nenhuma nota disponível para calcular a média da turma.");
        }

    }
    //opção 6
    public static void alunosReprovados(){
        System.out.println("Alunos reprovados: ");
        boolean algumReprovado = false;

        for(Estudantes e: estudantes){
            if(e.calcularMedia() < 7.0){
                System.out.println(e.getNome() + " - Média: "+ e.calcularMedia() + " Reprovado" );
                algumReprovado = true;
            }
        }
        if (!algumReprovado) {
            System.out.println("Nenhum aluno reprovado.");
        }

    }

}

