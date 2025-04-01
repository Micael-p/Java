public class Juridica extends Pessoa {
    private long CNPJ;

    public Juridica (){
    }

    public long getCNPJ(){
        return CNPJ;
    }

    public void setCNPJ (long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome () {
        return "Pessoa Juridica: " + super.getNome() + " - CNPJ - " + this.getCNPJ();
    }
}
