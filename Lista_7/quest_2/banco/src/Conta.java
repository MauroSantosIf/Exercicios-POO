public class Conta {

    private static int proximoNumero = 100;

    public String nome;
    public int numeroConta;
    public float saldo;

    public Conta(String nome, int numeroConta, float saldo){
        this.nome = nome;
        this.numeroConta = proximoNumero++;
        this.saldo = saldo;
    }

    public String getNome(){
        return nome;
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public float getSaldo(){
        return saldo;
    }

    public float depositar(float valor){
        return saldo += valor;
    }

    public float sacar(float valor){
        return saldo -= valor;
    }

}
