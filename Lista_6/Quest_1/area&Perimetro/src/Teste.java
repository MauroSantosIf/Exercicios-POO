import java.util.Scanner;

public class Teste {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Teste t = new Teste();
        t.menu();
    }

    public void menu() {
        dados d = null; // objeto único, inicializado só quando o usuário criar o retângulo
        int entrada;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar um retângulo (Informar o valor de B e H)");
            System.out.println("2. Calcular Área");
            System.out.println("3. Calcular Perímetro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            entrada = sc.nextInt();

            switch (entrada) {
                case 1:
                    d = new dados();
                    System.out.print("Informe o valor da base: ");
                    d.base = sc.nextDouble();
                    System.out.print("Informe o valor da altura: ");
                    d.altura = sc.nextDouble();
                    break;
                case 2:
                    if (d != null) {
                        System.out.printf("A área do retângulo é: %.2f\n", d.area());
                    } else {
                        System.out.println("Crie um retângulo primeiro!");
                    }
                    break;
                case 3:
                    if (d != null) {
                        System.out.printf("O perímetro do retângulo é: %.2f\n", d.perimetro());
                    } else {
                        System.out.println("Crie um retângulo primeiro!");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (entrada != 0);
    }
}
