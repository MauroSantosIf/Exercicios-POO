public class Estudante {
    String nome;
    int numMatricula;
    String endereco;
    float[] notas;

    public Estudante(String nome, int numMatricula, String endereco, float[] notas) {
        this.nome = nome;
        this.numMatricula = numMatricula;
        this.endereco = endereco;
        this.notas = notas;
    }

    public float calcularMedia() {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean aprovado() {
        return calcularMedia() >= 7;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public String getEndereco() {
        return endereco;
    }
}