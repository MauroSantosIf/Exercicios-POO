import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    Scanner sc = new Scanner(System.in);
    ArrayList<Estudante> estudantes = new ArrayList<>();

    public static void main(String[] args) {
        Teste t = new Teste();
        t.menu();
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("\n1. Cadastrar um Estudante");
            System.out.println("2. Calcular média de um estudante (Informar se o Aluno foi aprovado ou reprovado)");
            System.out.println("3. Obter número de matrícula de um estudante");
            System.out.println("4. Obter Endereço de um estudante");
            System.out.println("5. Exibir as listas de estudantes Aprovados e Reprovados");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarEstudante();
                    break;
                case 2:
                    calcularMediaEstudante();
                    break;
                case 3:
                    obterMatricula();
                    break;
                case 4:
                    obterEndereco();
                    break;
                case 5:
                    exibirListas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    public void cadastrarEstudante() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Número de matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine();
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        float[] notas = new float[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextFloat();
        }
        sc.nextLine();
        Estudante e = new Estudante(nome, matricula, endereco, notas);
        estudantes.add(e);
        System.out.println("Estudante cadastrado!");
    }

    public void calcularMediaEstudante() {
        System.out.print("Informe o número de matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine();
        for (Estudante e : estudantes) {
            if (e.getNumMatricula() == matricula) {
                float media = e.calcularMedia();
                System.out.println("Média: " + media);
                if (e.aprovado()) {
                    System.out.println("Aluno aprovado!");
                } else {
                    System.out.println("Aluno reprovado!");
                }
                return;
            }
        }
        System.out.println("Estudante não encontrado.");
    }

    public void obterMatricula() {
        System.out.print("Informe o nome do estudante: ");
        String nome = sc.nextLine();
        for (Estudante e : estudantes) {
            if (e.nome.equalsIgnoreCase(nome)) {
                System.out.println("Número de matrícula: " + e.getNumMatricula());
                return;
            }
        }
        System.out.println("Estudante não encontrado.");
    }

    public void obterEndereco() {
        System.out.print("Informe o nome do estudante: ");
        String nome = sc.nextLine();
        for (Estudante e : estudantes) {
            if (e.nome.equalsIgnoreCase(nome)) {
                System.out.println("Endereço: " + e.getEndereco());
                return;
            }
        }
        System.out.println("Estudante não encontrado.");
    }

    public void exibirListas() {
        System.out.println("Aprovados:");
        for (Estudante e : estudantes) {
            if (e.aprovado()) {
                System.out.println(e.nome + " - Média: " + e.calcularMedia());
            }
        }
        System.out.println("Reprovados:");
        for (Estudante e : estudantes) {
            if (!e.aprovado()) {
                System.out.println(e.nome + " - Média: " + e.calcularMedia());
            }
        }
    }
}