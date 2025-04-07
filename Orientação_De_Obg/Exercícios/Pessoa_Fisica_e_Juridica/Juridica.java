import java.util.Scanner;
public class Juridica extends Pessoa {
    private long CNPJ;

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    void lerDados(Scanner input) {
        System.out.print("Digite o nome: ");
        setNome(input.nextLine());

        System.out.print("Digite o CNPJ: ");
        setCNPJ(input.nextLong());
        input.nextLine();
    }

    public String getNome () {
        return "Pessoa Juridica: " + super.getNome() + " - CNPJ - " + this.getCNPJ();
    }
}
