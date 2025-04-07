import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa[2];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Você é pessoa física ou jurídica? (1 - Física | 2 - Jurídica)");
            int tipo = input.nextInt();
            input.nextLine();

            Pessoa pessoa;

            if (tipo == 1) {
                pessoa = new Fisica();
            }
            else if (tipo == 2) {
                pessoa = new Juridica();
            }
            else {
                System.out.println("Opção inválida, tente novamente.");
                i--;
                continue;
            }

            pessoa.lerDados(input);
            pessoas[i] = pessoa;
        }

        System.out.println("\nLista de pessoas cadastradas:\n");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

        input.close();
    }
}
