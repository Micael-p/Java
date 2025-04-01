public class Fisica extends Pessoa{
    private long CPF;

    public Fisica () {
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public String getNome () {
        return "Pessoa Fisica: " + super.getNome() + " - CPF - " + this.getCPF();
    }
}
