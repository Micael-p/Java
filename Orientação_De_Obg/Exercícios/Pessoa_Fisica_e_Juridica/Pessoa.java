import java.util.Scanner;
abstract class Pessoa {
    private String nome;

    public String getNome () {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    abstract void lerDados(Scanner input);
}
