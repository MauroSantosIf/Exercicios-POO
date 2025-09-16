/*
Escreva um programa para gerenciar o IMC de diferentes pessoas.
Para realizar o cadastro, o programa deve receber o peso, a altura e o nome de
cada pessoa. Crie uma classe Teste que forneça as seguintes opções ao usuário:
1. Cadastrar uma pessoa
2. Mostrar as pessoas que estão abaixo do peso (IMC < 18,5)
3. Mostrar as pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC < 25)
4. Mostrar as pessoas que estão acima do peso (IMC > = 25)
0. Sair
 * 
 * 
 */

public class imc {
    
    public double peso;
    public double altura;
    public String nome;

    //Constructor
    public imc(double peso, double altura, String nome){
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }
}
