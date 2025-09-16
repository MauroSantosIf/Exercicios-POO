/*
 * 
 * Crie uma classe Círculo que tenha os métodos para calcular a área
( πr!) e o perímetro (2πr). Crie uma classe Teste que forneça as seguintes opções
ao usuário:
1. Criar um círculo (Informar valor de r)
2. Calcular Área
3. Calcular Perímetro
0. Sair
Obs.: r – Raio.
 */

public class Circulo{
    
    public static final double PI = 3.14;

    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcArea(){
        return PI * (raio*raio);
    }

    public double calcPerimetro(){
        return 2*PI*raio;
    }

}
