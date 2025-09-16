/*
 * Crie uma classe Círculo que tenha os métodos para calcular a área
( πr!) e o perímetro (2πr). Crie uma classe Teste que forneça as seguintes opções
ao usuário:
1. Criar um círculo (Informar valor de r)
2. Calcular Área
3. Calcular Perímetro
0. Sair
Obs.: r – Raio.
 * 
 */
import java.util.Scanner;

public class Teste {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Circulo d = null;
        int entrada;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Criar um círculo (Informar valor de r)");
            System.out.println("2. Calcular Área");
            System.out.println("3. Calcular Perímetro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            entrada = sc.nextInt();

            switch (entrada) {
                case 1:
                    System.out.print("Informe o valor do raio: ");
                    double raio = sc.nextDouble();
                    d = new Circulo(raio);
                    break;
                case 2:
                    if (d != null) {
                        System.out.printf("A área do círculo é: %.2f\n", d.calcArea());
                    } else {
                        System.out.println("Crie um círculo primeiro!");
                    }
                    break;
                case 3:
                    if (d != null) {
                        System.out.printf("O perímetro do círculo é: %.2f\n", d.calcPerimetro());
                    } else {
                        System.out.println("Crie um círculo primeiro!");
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