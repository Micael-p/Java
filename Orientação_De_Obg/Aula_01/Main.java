import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
      
        //Criando um Aluno
        Aluno aluno = new Aluno("Micael", LocalDate.of(2004,3,07));

        //Exibindo Informações do aluno
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.calcularIdade() + " Anos");

    }
}
