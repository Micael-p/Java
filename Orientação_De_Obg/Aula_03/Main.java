import java.util.Date;
public class Main {
    
    public static void main(String[] args) {
        
        // criando uma instancia de Aluno
        Aluno aluno = new Aluno("Micael", "123.456.789-00", new Date(), 1001);
        aluno.setNome("Micael Pessoa Da Silva - ");
        System.out.println("Aluno: " + aluno.getNome() + "Matricula: " + aluno.getMatricula());

        // Criando uma instancia de Empregado
        Empregado empregado = new Empregado ("Maria", "987.654.321-00", new Date(), 3000.00);
        System.out.println("Empregado: " + empregado.getNome() + " - Salario: " + empregado.getSalario());
    }
}
