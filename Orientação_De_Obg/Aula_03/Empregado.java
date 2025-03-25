import java.util.Date;

// Classe Empregado
class Empregado extends Pessoa {
    private double salario;
    
    // Constructor
    public Empregado(String nome, String cpf, Date datadenascimento, double salario) {
        super(nome, cpf, datadenascimento);
        this.salario = salario;
    }
    
    // Getter e Setter especifico para salario
    public double getSalario() {
        return salario;
    }
}
