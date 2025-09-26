public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, String cpf, String idade, String departamento, double salario){
        super(nome, cpf,idade,salario);
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }

    
    public double getSalario(){
        return super.getSalario() + 1500;
    }

}
