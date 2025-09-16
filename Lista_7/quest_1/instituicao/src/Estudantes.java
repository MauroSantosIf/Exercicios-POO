public class Estudantes {
    
    public String nome;
    public int numeroTelefone;
    public int numMatricula;
    public String endereco;
    public float[] notas = new float[1];

    public Estudantes(String nome, int numeroTelefone, int numMatricula, String endereco, float[] notas){
        this.nome = nome;
        this. numeroTelefone = numeroTelefone;
        this.numMatricula = numMatricula;
        this.endereco = endereco;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float[] getNotas() {
        return notas;
    }

    public float calcularMedia() {
        if (notas == null || notas.length == 0) {
            return 0; // evita divisão por zero
        }
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}