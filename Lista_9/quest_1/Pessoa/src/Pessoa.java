public class Pessoa {

    private String nome;
    private String cpf;
    private String idade;

    public Pessoa(String nome, String cpf, String idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    String getNome() {
        return nome;
    }
    String getCpf() {
        return cpf;
    }   
    String getIdade() {
        return idade;
    }



}
