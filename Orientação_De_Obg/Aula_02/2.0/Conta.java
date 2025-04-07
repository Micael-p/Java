public class conta {
    //declaração de atributos
    private double saldo=0;

    //declaração de metodos
    public void depositar(double valor){
        this.saldo = this.saldo + valor + (valor * 0.10);
    }
    public double getSaldo (){
        return this.saldo;
    }
}
