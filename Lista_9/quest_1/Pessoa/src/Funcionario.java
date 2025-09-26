public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario(String nome, String cpf, String idade, double salario) {
        super(nome, cpf, idade);
        this.salario = 0.0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario){
        this.salario += salario;
    }

    @Override
    public String toString() {
        return 
        "Funcionario: " + this.getNome()
        + "\nCPF: " + this.getCpf()
        + "\nData de Nascimento: " + this.getIdade()
        + "\nSalário " + this.getSalario();
        
    }
}
