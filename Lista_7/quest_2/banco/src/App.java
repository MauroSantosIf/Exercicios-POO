import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList <Conta> contas = new ArrayList<>();
    public static void main(String[] args) {
        while(true){
            System.out.println("=== Menu ===");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Consultar Cliente");
            System.out.println("3 - Efetuar Saque da Conta");
            System.out.println("4 - Efetuar Depósito na Conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    consultarCliente();
                    break;
                case 3:
                    sacarCliente();
                    break;
                case 4:
                    depositarCliente();
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
    public static void cadastrarCliente(){
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Valor do primeiro deposito para ativar a Conta: ");
        float saldo = sc.nextFloat();
        sc.nextLine();
        Conta conta = new Conta(nome, 0, saldo);
        contas.add(conta);
        System.out.println("Conta criada com sucesso! Seu numero de conta é: " + conta.getNumeroConta());

    }
    // Opcao 2
    public static void consultarCliente(){
        System.out.print("Numero da Conta: ");
        int procurarConta = sc.nextInt();
        sc.nextLine();

        for(Conta conta : contas){
            if(conta.getNumeroConta() == procurarConta){
                System.out.println("Nome:" + conta.getNome());
                System.out.println("Saldo: R$ " + conta.getSaldo());
                System.out.println("Conta: " + conta.getNumeroConta());
            }
        }
    }
    // Opcao 3
    public static void sacarCliente(){
        System.out.print("Número da Conta para saque: ");
        int procurarConta = sc.nextInt();
        sc.nextLine();

        for(Conta conta : contas){
            if(conta.getNumeroConta() == procurarConta){
                System.out.print("Quanto deseja sacar ? ");
                float valorSaque = sc.nextFloat();
                sc.nextLine();

                if(conta.getSaldo() >= valorSaque){
                    conta.sacar(valorSaque);
                    System.out.println("Saque realizado com sucesso! Seu novo saldo é: " + conta.getSaldo());
                }else{
                    System.out.println("Seu saldo é de " + conta.getSaldo() + " abaixo do valor de saque!");
                }
                
            }else{
                System.out.println("Conta não encontrada!");
            }
        }
    }
    // Opcao 4
    public static void depositarCliente(){
        System.out.print("Número da Conta para deposito: ");
        int procurarConta = sc.nextInt();
        sc.nextLine();

        for(Conta conta : contas){
            if(conta.getNumeroConta() == procurarConta){
                System.out.print("Quanto deseja depositar ? ");
                float valorDeposito = sc.nextFloat();
                sc.nextLine();

                if(valorDeposito > 0){
                    conta.depositar(valorDeposito);
                    System.out.println("Deposito realizado com sucesso!\nNovo Saldo: R$ " + conta.getSaldo());
                }else{
                    System.out.println("Valor inválido para deposito");
                }
            }
            else{
                System.out.println("Conta não encontrada!");
            }
        }
    }

}
