public class conta {
    //declaração de atributos
    private double saldo=0;
    private String nome;

    //declaração de metodos
    public void depositar(double valor){
        this.saldo = this.saldo + valor + (valor * 0.10);
    }
    public double getSaldo (){
        return this.saldo;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}
