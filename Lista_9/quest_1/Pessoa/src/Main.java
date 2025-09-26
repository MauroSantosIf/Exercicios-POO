import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static List<Funcionario> listaFuncionarios = new ArrayList<>();
    public static List<Gerente> listaGerentes = new ArrayList<>();
    public static void main(String[] args){        
        while(true){
            System.out.println("-----Menu-----");
            System.out.println("1 - Adicionar Funcionário: ");
            System.out.println("2 - Adicionar Gerente: ");
            System.out.println("3 - Obter salário Funcionário: ");
            System.out.println("4 - Obter salário Gerente: ");
            System.out.println("0 - Sair do Sistema ");

            int opc = sc.nextInt();
            sc.nextLine();
            System.out.println();

            
            switch(opc){
                case 1:
                    adicionarFunc();
                    System.out.println("---------- Lista de Funcionarios ----------");
                    for (Pessoa func : listaFuncionarios){
                        System.out.println(func);
                    }
                    break;
                case 2:
                    adicionarGerent();
                    break;

                case 3:
                    obterSalFunc();
                    break;
                case 4:
                    obterSalGerent();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");

            }
        }
        
    }

    // Opc 1
    public static void adicionarFunc(){
        System.out.print("Digite o nome do funcionario: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Data de nascimento: ");
        String  dtNascimento = sc.nextLine();

        Funcionario funcionario = new Funcionario(nome, cpf, dtNascimento, 0);
        listaFuncionarios.add(funcionario);

    }
    // Opc 2
    public static void adicionarGerent(){

        System.out.print("Digite o nome do Gerente: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Data de Nascimento: ");
        String dtNascimento = sc.nextLine();

        System.out.print("Departamento: ");
        String depart = sc.nextLine();

        Gerente gerente = new Gerente(nome,cpf,dtNascimento,depart,0);
        listaGerentes.add(gerente);

    }
    // Opc 3
    public static void obterSalFunc(){
        System.out.print("Funcionario para verificar Salario: ");
        String nomeProcurado = sc.nextLine();

        for(Funcionario func : listaFuncionarios){
            if(func.equals(nomeProcurado)){
                System.out.print("Salario do(a): "
                + func.getNome()
                + " R$ "
                + func.getSalario());
            }else{
                System.out.print("Funcionario não encontrado!");
            }
        }
    }
    // Opc 4
    public static void obterSalGerent(){

        System.out.print("Gerente a ser verificado: ");
        String nomeProcurado = sc.nextLine();

        for(Gerente ger : listaGerentes){
            if(ger.equals(nomeProcurado)){
                System.out.print("Salário do(a)" 
                + ger.getNome()
                + " R$ "
                + ger.getSalario());
            }
        }

    }
}
