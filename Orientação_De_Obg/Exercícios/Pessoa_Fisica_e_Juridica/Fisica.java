import java.util.Scanner;
public class Fisica extends Pessoa {
    private long CPF;

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    void lerDados(Scanner input) {
        System.out.print("Digite o nome: ");
        setNome(input.nextLine());

        System.out.print("Digite o CPF: ");
        setCPF(input.nextLong());
        input.nextLine();
    }

    public String getNome () {
        return "Pessoa Fisica: " + super.getNome() + " - CPF - " + this.getCPF();
    }
}
